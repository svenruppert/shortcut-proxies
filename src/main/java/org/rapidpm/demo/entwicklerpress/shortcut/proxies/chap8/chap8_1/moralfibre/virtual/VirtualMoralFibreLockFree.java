/*
 * Copyright (c) 2014. Heinz Max Kabutz , Sven Ruppert
 *   We licenses
 *   this file to you under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License. You may
 *   obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap8.chap8_1.moralfibre.virtual;

import org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap8.chap8_1.moralfibre.MoralFibre;
import org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap8.chap8_1.moralfibre.MoralFibreImpl;
import org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap8.chap8_1.moralfibre.VirtualMoralFibre;

import java.util.concurrent.atomic.*;

/**
 * Created by Sven Ruppert on 14.01.14.
 */
public class VirtualMoralFibreLockFree extends VirtualMoralFibre {
    private final AtomicReference<MoralFibre> realSubject =
            new AtomicReference<MoralFibre>();
    protected MoralFibre realSubject() {
        MoralFibre subject = realSubject.get();
        if (subject == null) {
            subject = new MoralFibreImpl();
            if (!realSubject.compareAndSet(null, subject)) {
                subject = realSubject.get();
            }
        }
        return subject;
    }
}
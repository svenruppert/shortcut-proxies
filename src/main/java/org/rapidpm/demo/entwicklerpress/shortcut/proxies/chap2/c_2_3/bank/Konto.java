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

package org.rapidpm.demo.entwicklerpress.shortcut.proxies.chap2.c_2_3.bank;

/**
 * Created by Alexander Bischof on 03.09.14.
 */
public class Konto implements IKonto {

    private double kontostand;

    @Override
    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    @Override
    public void auszahlen(double betrag) {
        kontostand -= betrag;
    }

    @Override
    public double getKontostand() {
        return kontostand;
    }
}

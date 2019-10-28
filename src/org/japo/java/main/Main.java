/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        final double CAMINO = 980;

        double km, dias;

        try {
            System.out.print("Desplazamiento diario (km) ...: ");
            km = SCN.nextDouble();
            SCN.nextLine();

            dias = CAMINO / km;

            System.out.printf(Locale.ENGLISH, "Días de Clases/Camino ........: %d%n",
                    (int) dias < dias ? (int) dias + 1 : (int) dias);

        } catch (Exception e) {
            System.out.println("Error de entrada");
            SCN.nextLine();
        }
    }
}

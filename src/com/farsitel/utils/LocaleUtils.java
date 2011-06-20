/*
 * Copyright (C) 2011 Iranian Congenial Mobile Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASICS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.farsitel.utils;

import java.util.Locale;

public class LocaleUtils {

    /**
     * Returns true iff the current language of the environment
     * is right to left.
     */
    public static boolean isRTL() {
        Locale locale = Locale.getDefault();
        return isRTL(locale);
    }
    /**
     * Returns true iff the language of <code>locale</code>
     * is right to left.
     */
    public static boolean isRTL(Locale locale) {
        String lang = locale.getLanguage();
        String country = locale.getCountry();
        return ("fa".equals(lang) && ! "TJ".equals(country)) || ("az".equals(lang) && "IR".equals(country)) || "ar".equals(lang) || "he".equals(lang);
    }

}


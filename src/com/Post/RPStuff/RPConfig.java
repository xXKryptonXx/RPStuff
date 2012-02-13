/*
 * Copyright (c) <2012> <xXKryptonXx>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.Post.RPStuff;

import org.bukkit.util.config.Configuration;

import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RPConfig {
    private static RPStuff plugin;

    public RPConfig(RPStuff instance) {
        plugin = instance;
    }

    public String directory = "plugins" + File.separator + "RPStuff";
    File file = new File(directory + File.separator + "config.yml");

    public void configCheck() {
        new File(directory).mkdir();


        if (!file.exists()) {
            try {
                file.createNewFile();
                addDefaults();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {

            loadkeys();
        }
    }

    private Boolean readBoolean(String root) {
        Configuration config = load();
        return config.getBoolean(root, true);
    }

    private List<String> readStringList(String root) {
        Configuration config = load();
        List<String> world = null;
        return config.getStringList(root, world);
    }

    private String readString(String root) {
        Configuration config = load();
        return config.getString(root);
    }

    private Configuration load() {

        try {
            Configuration config = new Configuration(file);
            config.load();
            return config;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void addDefaults() {
        RPStuff.log.info("Generating Config File...");
        File f = new File(directory + File.separator + "config.yml");
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.yml");
            OutputStream out = new FileOutputStream(f);
            byte[] buf = new byte[1024];
            int len;
            while ((len = inputStream.read(buf)) > 0)
                out.write(buf, 0, len);
            out.close();
            inputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(RPStuff.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadkeys();
    }

    private void loadkeys() {
        RPStuff.log.info("Loading Config File...");
        plugin.TexURL = readString("URL");

    }
}
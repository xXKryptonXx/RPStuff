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

package com.Post.RPStuff.Blocks.Saplings;

import com.Post.RPStuff.RPStuff;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.Texture;

public class EmptySaplingDesign extends GenericCubeBlockDesign {

    public EmptySaplingDesign(RPStuff p, int[] ids) {
        super(p, p.TreeTex, ids);
        this.setMinBrightness(0.1F).setMaxBrightness(1F).setBrightness(0);
        this.setRenderPass(1);
        Texture texture = p.TreeTex;

        this.setQuadNumber(6);

        /*Quad bottom = new Quad(0, texture.getSubTexture(ids[0]));
      bottom.addVertex(3, 0.0f, 0.01f, 0.0f);
      bottom.addVertex(0, 1.0f, 0.01f, 0.0f);
      bottom.addVertex(1, 1.0f, 0.01f, 1.0f);
      bottom.addVertex(2, 0.0f, 0.01f, 1.0f);*/

        Quad front = new Quad(1, texture.getSubTexture(ids[1]));
        front.addVertex(0, 0.0f, 0.0f, 0.5f);
        front.addVertex(3, 1.0f, 0.0f, 0.5f);
        front.addVertex(2, 1.0f, 1.0f, 0.5f);
        front.addVertex(1, 0.0f, 1.0f, 0.5f);

        Quad back = new Quad(2, texture.getSubTexture(ids[2]));
        back.addVertex(3, 0.0f, 0.0f, 0.5f);
        back.addVertex(0, 1.0f, 0.0f, 0.5f);
        back.addVertex(1, 1.0f, 1.0f, 0.5f);
        back.addVertex(2, 0.0f, 1.0f, 0.5f);

        Quad left = new Quad(3, texture.getSubTexture(ids[3]));
        left.addVertex(3, 0.5f, 0.0f, 0.0f);
        left.addVertex(2, 0.5f, 1.0f, 0.0f);
        left.addVertex(1, 0.5f, 1.0f, 1.0f);
        left.addVertex(0, 0.5f, 0.0f, 1.0f);

        Quad right = new Quad(4, texture.getSubTexture(ids[4]));
        right.addVertex(0, 0.5f, 0.0f, 0.0f);
        right.addVertex(1, 0.5f, 1.0f, 0.0f);
        right.addVertex(2, 0.5f, 1.0f, 1.0f);
        right.addVertex(3, 0.5f, 0.0f, 1.0f);

        /*Quad top = new Quad(5, texture.getSubTexture(ids[5]));
      top.addVertex(2, 0.0f, 1.0f, 0.0f);
      top.addVertex(1, 1.0f, 1.0f, 0.0f);
      top.addVertex(0, 1.0f, 1.0f, 1.0f);
      top.addVertex(3, 0.0f, 1.0f, 1.0f);*/

        this.setQuad(front).setQuad(back).setQuad(right).setQuad(left);

        //this.setQuad(bottom).setQuad(front).setQuad(back).setQuad(left).setQuad(right).setQuad(top);

    }


}

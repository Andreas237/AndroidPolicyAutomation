// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.opengl.GLES20;

// Referenced classes of package com.amap.api.mapcore.util:
//			dr, ds

public static class ds$b extends dr
{

	String a;
	String b;
	public int c;
	public int g;
	public int h;

	public ds$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void dr()>
		a = "precision highp float;\n        attribute vec3 aVertex;//\u9876\u70B9\u6570\u7EC4,\u4E09\u7EF4\u5750\u6807\n        attribute vec2 aTexture;\n        uniform mat4 aMVPMatrix;//mvp\u77E9\u9635\n        varying vec2 texture;//\n        void main(){\n            gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n            texture = aTexture;\n        }";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "precision highp float;\n        attribute vec3 aVertex;//\u9876\u70B9\u6570\u7EC4,\u4E09\u7EF4\u5750\u6807\n        attribute vec2 aTexture;\n        uniform mat4 aMVPMatrix;//mvp\u77E9\u9635\n        varying vec2 texture;//\n        void main(){\n            gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n            texture = aTexture;\n        }">
	//    4    7:putfield        #21  <Field String a>
		b = "        precision highp float;\n        varying vec2 texture;//\n        uniform sampler2D aTextureUnit0;//\u7EB9\u7406id\n        void main(){\n            gl_FragColor = texture2D(aTextureUnit0, texture);\n        }";
	//    5   10:aload_0         
	//    6   11:ldc1            #23  <String "        precision highp float;\n        varying vec2 texture;//\n        uniform sampler2D aTextureUnit0;//\u7EB9\u7406id\n        void main(){\n            gl_FragColor = texture2D(aTextureUnit0, texture);\n        }">
	//    7   13:putfield        #25  <Field String b>
		if(!a(a, b))
	//*   8   16:aload_0         
	//*   9   17:aload_0         
	//*  10   18:getfield        #21  <Field String a>
	//*  11   21:aload_0         
	//*  12   22:getfield        #25  <Field String b>
	//*  13   25:invokevirtual   #28  <Method boolean a(String, String)>
	//*  14   28:ifne            32
		{
			return;
	//   15   31:return          
		} else
		{
			c = GLES20.glGetAttribLocation(d, "aVertex");
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #31  <Field int d>
	//   19   37:ldc1            #33  <String "aVertex">
	//   20   39:invokestatic    #39  <Method int GLES20.glGetAttribLocation(int, String)>
	//   21   42:putfield        #41  <Field int c>
			h = GLES20.glGetAttribLocation(d, "aTexture");
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #31  <Field int d>
	//   25   50:ldc1            #43  <String "aTexture">
	//   26   52:invokestatic    #39  <Method int GLES20.glGetAttribLocation(int, String)>
	//   27   55:putfield        #45  <Field int h>
			g = GLES20.glGetUniformLocation(d, "aMVPMatrix");
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #31  <Field int d>
	//   31   63:ldc1            #47  <String "aMVPMatrix">
	//   32   65:invokestatic    #50  <Method int GLES20.glGetUniformLocation(int, String)>
	//   33   68:putfield        #52  <Field int g>
			return;
	//   34   71:return          
		}
	}
}

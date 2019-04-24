// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			dr, ds, ay

public static class ds$a extends dr
{

	String a;
	String b;
	public int c;
	public int g;
	public int h;
	public int i;
	public int j;
	public int k;

	public ds$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void dr()>
		a = (new StringBuilder()).append("precision highp float;\n        attribute vec4 aVertex;\n        attribute vec2 aTexture;\n        uniform vec4 aMapAttribute;\n        uniform mat4 aMVPMatrix;\n        uniform mat4 aProjection;\n        uniform vec3 aInstanceOffset[").append(ay.a).append("];\n").append("        varying vec2 texture;\n").append("        mat4 rotationMatrix(vec3 axis, float angle)\n").append("        {\n").append("           axis = normalize(axis);\n").append("           float s = sin(angle);\n").append("           float c = cos(angle);\n").append("           float oc = 1.0 - c;\n").append("           return mat4(oc * axis.x * axis.x + c,           oc * axis.x * axis.y - axis.z * s,  oc * axis.z * axis.x + axis.y * s,  0.0,\n").append("                 oc * axis.x * axis.y + axis.z * s,  oc * axis.y * axis.y + c,           oc * axis.y * axis.z - axis.x * s,  0.0,\n").append("                 oc * axis.z * axis.x - axis.y * s,  oc * axis.y * axis.z + axis.x * s,  oc * axis.z * axis.z + c,           0.0,\n").append("                 0.0,                                0.0,                                0.0,                                1.0);\n").append("        }\n").append("        void main(){\n").append("            int instance = int(aVertex.w);\n").append("            vec3 offset_value = aInstanceOffset[instance];\n").append("            mat4 marker_rotate_mat4 = rotationMatrix(vec3(0,0,1.0), offset_value.z * 0.01745);\n").append("            float map_rotate = -aMapAttribute.z * 0.01745;\n").append("            float map_tilt = aMapAttribute.w * 0.01745;\n").append("            //tilt\u65CB\u8F6C\u77E9\u9635\n").append("            mat4 map_tilt_mat4 = rotationMatrix(vec3(1,0,0), map_tilt);\n").append("            //bearing\u65CB\u8F6C\u77E9\u9635\n").append("            mat4 map_rotate_mat4 = rotationMatrix(vec3(0,0,1), map_rotate);\n").append("                 \n").append("            //\u65CB\u8F6C\u56FE\u7247\n").append("            vec4 pos_1 = marker_rotate_mat4 * vec4(aVertex.xy * aMapAttribute.xy, 0,1);\n").append("                  \n").append("            //\u8BA9marker\u7AD9\u7ACB\uFF0Ctilt\u65CB\u8F6C\u4E4B\u540Ez\u8F74\u503C\u6709\u53EF\u80FD\u4E0D\u662F0\n").append("            vec4 pos_2 =  map_tilt_mat4 * pos_1;\n").append("                  \n").append("            //\u65CB\u8F6C bearing\n").append("            vec4 pos_3 =  map_rotate_mat4 * pos_2;\n").append("            gl_Position = aProjection * aMVPMatrix * vec4(pos_3.xy + offset_value.xy, pos_3.z, 1.0);\n").append("            texture = aTexture;\n").append("        }").toString();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void StringBuilder()>
	//    6   12:ldc1            #25  <String "precision highp float;\n        attribute vec4 aVertex;\n        attribute vec2 aTexture;\n        uniform vec4 aMapAttribute;\n        uniform mat4 aMVPMatrix;\n        uniform mat4 aProjection;\n        uniform vec3 aInstanceOffset[">
	//    7   14:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:getstatic       #33  <Field int ay.a>
	//    9   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   10   23:ldc1            #38  <String "];\n">
	//   11   25:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:ldc1            #40  <String "        varying vec2 texture;\n">
	//   13   30:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:ldc1            #42  <String "        mat4 rotationMatrix(vec3 axis, float angle)\n">
	//   15   35:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:ldc1            #44  <String "        {\n">
	//   17   40:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:ldc1            #46  <String "           axis = normalize(axis);\n">
	//   19   45:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:ldc1            #48  <String "           float s = sin(angle);\n">
	//   21   50:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   22   53:ldc1            #50  <String "           float c = cos(angle);\n">
	//   23   55:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:ldc1            #52  <String "           float oc = 1.0 - c;\n">
	//   25   60:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   26   63:ldc1            #54  <String "           return mat4(oc * axis.x * axis.x + c,           oc * axis.x * axis.y - axis.z * s,  oc * axis.z * axis.x + axis.y * s,  0.0,\n">
	//   27   65:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   28   68:ldc1            #56  <String "                 oc * axis.x * axis.y + axis.z * s,  oc * axis.y * axis.y + c,           oc * axis.y * axis.z - axis.x * s,  0.0,\n">
	//   29   70:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   30   73:ldc1            #58  <String "                 oc * axis.z * axis.x - axis.y * s,  oc * axis.y * axis.z + axis.x * s,  oc * axis.z * axis.z + c,           0.0,\n">
	//   31   75:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   32   78:ldc1            #60  <String "                 0.0,                                0.0,                                0.0,                                1.0);\n">
	//   33   80:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   34   83:ldc1            #62  <String "        }\n">
	//   35   85:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   36   88:ldc1            #64  <String "        void main(){\n">
	//   37   90:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   38   93:ldc1            #66  <String "            int instance = int(aVertex.w);\n">
	//   39   95:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   40   98:ldc1            #68  <String "            vec3 offset_value = aInstanceOffset[instance];\n">
	//   41  100:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   42  103:ldc1            #70  <String "            mat4 marker_rotate_mat4 = rotationMatrix(vec3(0,0,1.0), offset_value.z * 0.01745);\n">
	//   43  105:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   44  108:ldc1            #72  <String "            float map_rotate = -aMapAttribute.z * 0.01745;\n">
	//   45  110:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   46  113:ldc1            #74  <String "            float map_tilt = aMapAttribute.w * 0.01745;\n">
	//   47  115:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   48  118:ldc1            #76  <String "            //tilt\u65CB\u8F6C\u77E9\u9635\n">
	//   49  120:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   50  123:ldc1            #78  <String "            mat4 map_tilt_mat4 = rotationMatrix(vec3(1,0,0), map_tilt);\n">
	//   51  125:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   52  128:ldc1            #80  <String "            //bearing\u65CB\u8F6C\u77E9\u9635\n">
	//   53  130:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   54  133:ldc1            #82  <String "            mat4 map_rotate_mat4 = rotationMatrix(vec3(0,0,1), map_rotate);\n">
	//   55  135:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   56  138:ldc1            #84  <String "                 \n">
	//   57  140:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   58  143:ldc1            #86  <String "            //\u65CB\u8F6C\u56FE\u7247\n">
	//   59  145:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   60  148:ldc1            #88  <String "            vec4 pos_1 = marker_rotate_mat4 * vec4(aVertex.xy * aMapAttribute.xy, 0,1);\n">
	//   61  150:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   62  153:ldc1            #90  <String "                  \n">
	//   63  155:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   64  158:ldc1            #92  <String "            //\u8BA9marker\u7AD9\u7ACB\uFF0Ctilt\u65CB\u8F6C\u4E4B\u540Ez\u8F74\u503C\u6709\u53EF\u80FD\u4E0D\u662F0\n">
	//   65  160:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   66  163:ldc1            #94  <String "            vec4 pos_2 =  map_tilt_mat4 * pos_1;\n">
	//   67  165:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   68  168:ldc1            #90  <String "                  \n">
	//   69  170:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   70  173:ldc1            #96  <String "            //\u65CB\u8F6C bearing\n">
	//   71  175:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   72  178:ldc1            #98  <String "            vec4 pos_3 =  map_rotate_mat4 * pos_2;\n">
	//   73  180:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   74  183:ldc1            #100 <String "            gl_Position = aProjection * aMVPMatrix * vec4(pos_3.xy + offset_value.xy, pos_3.z, 1.0);\n">
	//   75  185:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   76  188:ldc1            #102 <String "            texture = aTexture;\n">
	//   77  190:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   78  193:ldc1            #104 <String "        }">
	//   79  195:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   80  198:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   81  201:putfield        #110 <Field String a>
		b = "        precision highp float;\n        varying vec2 texture;\n        uniform sampler2D aTextureUnit0;\n        void main(){\n            vec4 tempColor = texture2D(aTextureUnit0, texture);\n            gl_FragColor = tempColor;\n        }";
	//   82  204:aload_0         
	//   83  205:ldc1            #112 <String "        precision highp float;\n        varying vec2 texture;\n        uniform sampler2D aTextureUnit0;\n        void main(){\n            vec4 tempColor = texture2D(aTextureUnit0, texture);\n            gl_FragColor = tempColor;\n        }">
	//   84  207:putfield        #114 <Field String b>
		if(!a(a, b))
	//*  85  210:aload_0         
	//*  86  211:aload_0         
	//*  87  212:getfield        #110 <Field String a>
	//*  88  215:aload_0         
	//*  89  216:getfield        #114 <Field String b>
	//*  90  219:invokevirtual   #117 <Method boolean a(String, String)>
	//*  91  222:ifne            226
		{
			return;
	//   92  225:return          
		} else
		{
			g = c("aMVPMatrix");
	//   93  226:aload_0         
	//   94  227:aload_0         
	//   95  228:ldc1            #119 <String "aMVPMatrix">
	//   96  230:invokevirtual   #122 <Method int c(String)>
	//   97  233:putfield        #124 <Field int g>
			k = c("aProjection");
	//   98  236:aload_0         
	//   99  237:aload_0         
	//  100  238:ldc1            #126 <String "aProjection">
	//  101  240:invokevirtual   #122 <Method int c(String)>
	//  102  243:putfield        #128 <Field int k>
			i = c("aInstanceOffset");
	//  103  246:aload_0         
	//  104  247:aload_0         
	//  105  248:ldc1            #130 <String "aInstanceOffset">
	//  106  250:invokevirtual   #122 <Method int c(String)>
	//  107  253:putfield        #132 <Field int i>
			j = c("aMapAttribute");
	//  108  256:aload_0         
	//  109  257:aload_0         
	//  110  258:ldc1            #134 <String "aMapAttribute">
	//  111  260:invokevirtual   #122 <Method int c(String)>
	//  112  263:putfield        #136 <Field int j>
			c = b("aVertex");
	//  113  266:aload_0         
	//  114  267:aload_0         
	//  115  268:ldc1            #138 <String "aVertex">
	//  116  270:invokevirtual   #140 <Method int b(String)>
	//  117  273:putfield        #142 <Field int c>
			h = b("aTexture");
	//  118  276:aload_0         
	//  119  277:aload_0         
	//  120  278:ldc1            #144 <String "aTexture">
	//  121  280:invokevirtual   #140 <Method int b(String)>
	//  122  283:putfield        #146 <Field int h>
			return;
	//  123  286:return          
		}
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.util.Log;
import android.util.Pair;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, bnw, bnk, bhs

public final class bhm
{

	private bhm(String s, String s1, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities, boolean flag, boolean flag1)
	{
		boolean flag5;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
			a = (String)bnf.a(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #26  <Method Object bnf.a(Object)>
	//    5    9:checkcast       #28  <Class String>
	//    6   12:putfield        #30  <Field String a>
			e = s1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #32  <Field String e>
			f = codeccapabilities;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #34  <Field android.media.MediaCodecInfo$CodecCapabilities f>
			flag5 = true;
	//   13   25:iconst_1        
	//   14   26:istore          7
			if(!flag && codeccapabilities != null)
	//*  15   28:iload           4
	//*  16   30:ifne            74
	//*  17   33:aload_3         
	//*  18   34:ifnull          74
			{
				boolean flag2;
				if(bnw.a >= 19 && codeccapabilities.isFeatureSupported("adaptive-playback"))
	//*  19   37:getstatic       #39  <Field int bnw.a>
	//*  20   40:bipush          19
	//*  21   42:icmplt          60
	//*  22   45:aload_3         
	//*  23   46:ldc1            #41  <String "adaptive-playback">
	//*  24   48:invokevirtual   #47  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//*  25   51:ifeq            60
					flag2 = true;
	//   26   54:iconst_1        
	//   27   55:istore          6
				else
	//*  28   57:goto            63
					flag2 = false;
	//   29   60:iconst_0        
	//   30   61:istore          6
				if(flag2)
	//*  31   63:iload           6
	//*  32   65:ifeq            74
				{
					flag = true;
	//   33   68:iconst_1        
	//   34   69:istore          4
					break label0;
	//   35   71:goto            77
				}
			}
			flag = false;
	//   36   74:iconst_0        
	//   37   75:istore          4
		}
label1:
		{
			b = flag;
	//   38   77:aload_0         
	//   39   78:iload           4
	//   40   80:putfield        #49  <Field boolean b>
			if(codeccapabilities != null)
	//*  41   83:aload_3         
	//*  42   84:ifnull          124
			{
				boolean flag3;
				if(bnw.a >= 21 && codeccapabilities.isFeatureSupported("tunneled-playback"))
	//*  43   87:getstatic       #39  <Field int bnw.a>
	//*  44   90:bipush          21
	//*  45   92:icmplt          110
	//*  46   95:aload_3         
	//*  47   96:ldc1            #51  <String "tunneled-playback">
	//*  48   98:invokevirtual   #47  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//*  49  101:ifeq            110
					flag3 = true;
	//   50  104:iconst_1        
	//   51  105:istore          6
				else
	//*  52  107:goto            113
					flag3 = false;
	//   53  110:iconst_0        
	//   54  111:istore          6
				if(flag3)
	//*  55  113:iload           6
	//*  56  115:ifeq            124
				{
					flag = true;
	//   57  118:iconst_1        
	//   58  119:istore          4
					break label1;
	//   59  121:goto            127
				}
			}
			flag = false;
	//   60  124:iconst_0        
	//   61  125:istore          4
		}
label2:
		{
			c = flag;
	//   62  127:aload_0         
	//   63  128:iload           4
	//   64  130:putfield        #53  <Field boolean c>
			flag = flag5;
	//   65  133:iload           7
	//   66  135:istore          4
			if(flag1)
				break label2;
	//   67  137:iload           5
	//   68  139:ifne            187
			if(codeccapabilities != null)
	//*  69  142:aload_3         
	//*  70  143:ifnull          184
			{
				boolean flag4;
				if(bnw.a >= 21 && codeccapabilities.isFeatureSupported("secure-playback"))
	//*  71  146:getstatic       #39  <Field int bnw.a>
	//*  72  149:bipush          21
	//*  73  151:icmplt          169
	//*  74  154:aload_3         
	//*  75  155:ldc1            #55  <String "secure-playback">
	//*  76  157:invokevirtual   #47  <Method boolean android.media.MediaCodecInfo$CodecCapabilities.isFeatureSupported(String)>
	//*  77  160:ifeq            169
					flag4 = true;
	//   78  163:iconst_1        
	//   79  164:istore          6
				else
	//*  80  166:goto            172
					flag4 = false;
	//   81  169:iconst_0        
	//   82  170:istore          6
				if(flag4)
	//*  83  172:iload           6
	//*  84  174:ifeq            184
				{
					flag = flag5;
	//   85  177:iload           7
	//   86  179:istore          4
					break label2;
	//   87  181:goto            187
				}
			}
			flag = false;
	//   88  184:iconst_0        
	//   89  185:istore          4
		}
		d = flag;
	//   90  187:aload_0         
	//   91  188:iload           4
	//   92  190:putfield        #57  <Field boolean d>
	//   93  193:return          
	}

	public static bhm a(String s)
	{
		return new bhm(s, ((String) (null)), ((android.media.MediaCodecInfo.CodecCapabilities) (null)), false, false);
	//    0    0:new             #2   <Class bhm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #61  <Method void bhm(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean)>
	//    8   12:areturn         
	}

	public static bhm a(String s, String s1, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities, boolean flag, boolean flag1)
	{
		return new bhm(s, s1, codeccapabilities, flag, flag1);
	//    0    0:new             #2   <Class bhm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #61  <Method void bhm(String, String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean)>
	//    8   13:areturn         
	}

	private static boolean a(android.media.MediaCodecInfo.VideoCapabilities videocapabilities, int i, int j, double d1)
	{
		if(d1 != -1D && d1 > 0.0D)
	//*   0    0:dload_3         
	//*   1    1:ldc2w           #65  <Double -1D>
	//*   2    4:dcmpl           
	//*   3    5:ifeq            25
	//*   4    8:dload_3         
	//*   5    9:dconst_0        
	//*   6   10:dcmpg           
	//*   7   11:ifgt            17
	//*   8   14:goto            25
			return videocapabilities.areSizeAndRateSupported(i, j, d1);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:dload_3         
	//   13   21:invokevirtual   #72  <Method boolean android.media.MediaCodecInfo$VideoCapabilities.areSizeAndRateSupported(int, int, double)>
	//   14   24:ireturn         
		else
			return videocapabilities.isSizeSupported(i, j);
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:iload_2         
	//   18   28:invokevirtual   #76  <Method boolean android.media.MediaCodecInfo$VideoCapabilities.isSizeSupported(int, int)>
	//   19   31:ireturn         
	}

	private final void c(String s)
	{
		String s1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String a>
	//    2    4:astore_2        
		String s2 = e;
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field String e>
	//    5    9:astore_3        
		String s3 = bnw.e;
	//    6   10:getstatic       #79  <Field String bnw.e>
	//    7   13:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 20 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length());
	//    8   15:new             #81  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:invokestatic    #85  <Method String String.valueOf(Object)>
	//   12   23:invokevirtual   #89  <Method int String.length()>
	//   13   26:bipush          20
	//   14   28:iadd            
	//   15   29:aload_2         
	//   16   30:invokestatic    #85  <Method String String.valueOf(Object)>
	//   17   33:invokevirtual   #89  <Method int String.length()>
	//   18   36:iadd            
	//   19   37:aload_3         
	//   20   38:invokestatic    #85  <Method String String.valueOf(Object)>
	//   21   41:invokevirtual   #89  <Method int String.length()>
	//   22   44:iadd            
	//   23   45:aload           4
	//   24   47:invokestatic    #85  <Method String String.valueOf(Object)>
	//   25   50:invokevirtual   #89  <Method int String.length()>
	//   26   53:iadd            
	//   27   54:invokespecial   #92  <Method void StringBuilder(int)>
	//   28   57:astore          5
		stringbuilder.append("NoSupport [");
	//   29   59:aload           5
	//   30   61:ldc1            #94  <String "NoSupport [">
	//   31   63:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		stringbuilder.append(s);
	//   33   67:aload           5
	//   34   69:aload_1         
	//   35   70:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   36   73:pop             
		stringbuilder.append("] [");
	//   37   74:aload           5
	//   38   76:ldc1            #100 <String "] [">
	//   39   78:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
		stringbuilder.append(s1);
	//   41   82:aload           5
	//   42   84:aload_2         
	//   43   85:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
		stringbuilder.append(", ");
	//   45   89:aload           5
	//   46   91:ldc1            #102 <String ", ">
	//   47   93:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   48   96:pop             
		stringbuilder.append(s2);
	//   49   97:aload           5
	//   50   99:aload_3         
	//   51  100:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   52  103:pop             
		stringbuilder.append("] [");
	//   53  104:aload           5
	//   54  106:ldc1            #100 <String "] [">
	//   55  108:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   56  111:pop             
		stringbuilder.append(s3);
	//   57  112:aload           5
	//   58  114:aload           4
	//   59  116:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   60  119:pop             
		stringbuilder.append("]");
	//   61  120:aload           5
	//   62  122:ldc1            #104 <String "]">
	//   63  124:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   64  127:pop             
		Log.d("MediaCodecInfo", stringbuilder.toString());
	//   65  128:ldc1            #106 <String "MediaCodecInfo">
	//   66  130:aload           5
	//   67  132:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   68  135:invokestatic    #115 <Method int Log.d(String, String)>
	//   69  138:pop             
	//   70  139:return          
	}

	public final Point a(int i, int j)
	{
		Object obj = ((Object) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field android.media.MediaCodecInfo$CodecCapabilities f>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       19
		{
			c("align.caps");
	//    5   11:aload_0         
	//    6   12:ldc1            #118 <String "align.caps">
	//    7   14:invokespecial   #120 <Method void c(String)>
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		}
		obj = ((Object) (((android.media.MediaCodecInfo.CodecCapabilities) (obj)).getVideoCapabilities()));
	//   10   19:aload           5
	//   11   21:invokevirtual   #124 <Method android.media.MediaCodecInfo$VideoCapabilities android.media.MediaCodecInfo$CodecCapabilities.getVideoCapabilities()>
	//   12   24:astore          5
		if(obj == null)
	//*  13   26:aload           5
	//*  14   28:ifnonnull       39
		{
			c("align.vCaps");
	//   15   31:aload_0         
	//   16   32:ldc1            #126 <String "align.vCaps">
	//   17   34:invokespecial   #120 <Method void c(String)>
			return null;
	//   18   37:aconst_null     
	//   19   38:areturn         
		} else
		{
			int k = ((android.media.MediaCodecInfo.VideoCapabilities) (obj)).getWidthAlignment();
	//   20   39:aload           5
	//   21   41:invokevirtual   #129 <Method int android.media.MediaCodecInfo$VideoCapabilities.getWidthAlignment()>
	//   22   44:istore_3        
			int l = ((android.media.MediaCodecInfo.VideoCapabilities) (obj)).getHeightAlignment();
	//   23   45:aload           5
	//   24   47:invokevirtual   #132 <Method int android.media.MediaCodecInfo$VideoCapabilities.getHeightAlignment()>
	//   25   50:istore          4
			return new Point(bnw.a(i, k) * k, bnw.a(j, l) * l);
	//   26   52:new             #134 <Class Point>
	//   27   55:dup             
	//   28   56:iload_1         
	//   29   57:iload_3         
	//   30   58:invokestatic    #137 <Method int bnw.a(int, int)>
	//   31   61:iload_3         
	//   32   62:imul            
	//   33   63:iload_2         
	//   34   64:iload           4
	//   35   66:invokestatic    #137 <Method int bnw.a(int, int)>
	//   36   69:iload           4
	//   37   71:imul            
	//   38   72:invokespecial   #140 <Method void Point(int, int)>
	//   39   75:areturn         
		}
	}

	public final boolean a(int i)
	{
		Object obj = ((Object) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field android.media.MediaCodecInfo$CodecCapabilities f>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       17
		{
			c("sampleRate.caps");
	//    5    9:aload_0         
	//    6   10:ldc1            #143 <String "sampleRate.caps">
	//    7   12:invokespecial   #120 <Method void c(String)>
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
		}
		obj = ((Object) (((android.media.MediaCodecInfo.CodecCapabilities) (obj)).getAudioCapabilities()));
	//   10   17:aload_2         
	//   11   18:invokevirtual   #147 <Method android.media.MediaCodecInfo$AudioCapabilities android.media.MediaCodecInfo$CodecCapabilities.getAudioCapabilities()>
	//   12   21:astore_2        
		if(obj == null)
	//*  13   22:aload_2         
	//*  14   23:ifnonnull       34
		{
			c("sampleRate.aCaps");
	//   15   26:aload_0         
	//   16   27:ldc1            #149 <String "sampleRate.aCaps">
	//   17   29:invokespecial   #120 <Method void c(String)>
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		}
		if(!((android.media.MediaCodecInfo.AudioCapabilities) (obj)).isSampleRateSupported(i))
	//*  20   34:aload_2         
	//*  21   35:iload_1         
	//*  22   36:invokevirtual   #154 <Method boolean android.media.MediaCodecInfo$AudioCapabilities.isSampleRateSupported(int)>
	//*  23   39:ifne            75
		{
			StringBuilder stringbuilder = new StringBuilder(31);
	//   24   42:new             #81  <Class StringBuilder>
	//   25   45:dup             
	//   26   46:bipush          31
	//   27   48:invokespecial   #92  <Method void StringBuilder(int)>
	//   28   51:astore_2        
			stringbuilder.append("sampleRate.support, ");
	//   29   52:aload_2         
	//   30   53:ldc1            #156 <String "sampleRate.support, ">
	//   31   55:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
			stringbuilder.append(i);
	//   33   59:aload_2         
	//   34   60:iload_1         
	//   35   61:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   36   64:pop             
			c(stringbuilder.toString());
	//   37   65:aload_0         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   40   70:invokespecial   #120 <Method void c(String)>
			return false;
	//   41   73:iconst_0        
	//   42   74:ireturn         
		} else
		{
			return true;
	//   43   75:iconst_1        
	//   44   76:ireturn         
		}
	}

	public final boolean a(int i, int j, double d1)
	{
		Object obj = ((Object) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field android.media.MediaCodecInfo$CodecCapabilities f>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       19
		{
			c("sizeAndRate.caps");
	//    5   11:aload_0         
	//    6   12:ldc1            #161 <String "sizeAndRate.caps">
	//    7   14:invokespecial   #120 <Method void c(String)>
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		}
		obj = ((Object) (((android.media.MediaCodecInfo.CodecCapabilities) (obj)).getVideoCapabilities()));
	//   10   19:aload           5
	//   11   21:invokevirtual   #124 <Method android.media.MediaCodecInfo$VideoCapabilities android.media.MediaCodecInfo$CodecCapabilities.getVideoCapabilities()>
	//   12   24:astore          5
		if(obj == null)
	//*  13   26:aload           5
	//*  14   28:ifnonnull       39
		{
			c("sizeAndRate.vCaps");
	//   15   31:aload_0         
	//   16   32:ldc1            #163 <String "sizeAndRate.vCaps">
	//   17   34:invokespecial   #120 <Method void c(String)>
			return false;
	//   18   37:iconst_0        
	//   19   38:ireturn         
		}
		if(!a(((android.media.MediaCodecInfo.VideoCapabilities) (obj)), i, j, d1))
	//*  20   39:aload           5
	//*  21   41:iload_1         
	//*  22   42:iload_2         
	//*  23   43:dload_3         
	//*  24   44:invokestatic    #165 <Method boolean a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double)>
	//*  25   47:ifne            349
			if(i < j && a(((android.media.MediaCodecInfo.VideoCapabilities) (obj)), j, i, d1))
	//*  26   50:iload_1         
	//*  27   51:iload_2         
	//*  28   52:icmpge          282
	//*  29   55:aload           5
	//*  30   57:iload_2         
	//*  31   58:iload_1         
	//*  32   59:dload_3         
	//*  33   60:invokestatic    #165 <Method boolean a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double)>
	//*  34   63:ifne            69
	//*  35   66:goto            282
			{
				Object obj1 = ((Object) (new StringBuilder(69)));
	//   36   69:new             #81  <Class StringBuilder>
	//   37   72:dup             
	//   38   73:bipush          69
	//   39   75:invokespecial   #92  <Method void StringBuilder(int)>
	//   40   78:astore          5
				((StringBuilder) (obj1)).append("sizeAndRate.rotated, ");
	//   41   80:aload           5
	//   42   82:ldc1            #167 <String "sizeAndRate.rotated, ">
	//   43   84:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
				((StringBuilder) (obj1)).append(i);
	//   45   88:aload           5
	//   46   90:iload_1         
	//   47   91:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   48   94:pop             
				((StringBuilder) (obj1)).append("x");
	//   49   95:aload           5
	//   50   97:ldc1            #169 <String "x">
	//   51   99:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   52  102:pop             
				((StringBuilder) (obj1)).append(j);
	//   53  103:aload           5
	//   54  105:iload_2         
	//   55  106:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   56  109:pop             
				((StringBuilder) (obj1)).append("x");
	//   57  110:aload           5
	//   58  112:ldc1            #169 <String "x">
	//   59  114:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   60  117:pop             
				((StringBuilder) (obj1)).append(d1);
	//   61  118:aload           5
	//   62  120:dload_3         
	//   63  121:invokevirtual   #172 <Method StringBuilder StringBuilder.append(double)>
	//   64  124:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   65  125:aload           5
	//   66  127:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   67  130:astore          5
				String s = a;
	//   68  132:aload_0         
	//   69  133:getfield        #30  <Field String a>
	//   70  136:astore          6
				String s1 = e;
	//   71  138:aload_0         
	//   72  139:getfield        #32  <Field String e>
	//   73  142:astore          7
				String s2 = bnw.e;
	//   74  144:getstatic       #79  <Field String bnw.e>
	//   75  147:astore          8
				StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(obj1).length() + 25 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   76  149:new             #81  <Class StringBuilder>
	//   77  152:dup             
	//   78  153:aload           5
	//   79  155:invokestatic    #85  <Method String String.valueOf(Object)>
	//   80  158:invokevirtual   #89  <Method int String.length()>
	//   81  161:bipush          25
	//   82  163:iadd            
	//   83  164:aload           6
	//   84  166:invokestatic    #85  <Method String String.valueOf(Object)>
	//   85  169:invokevirtual   #89  <Method int String.length()>
	//   86  172:iadd            
	//   87  173:aload           7
	//   88  175:invokestatic    #85  <Method String String.valueOf(Object)>
	//   89  178:invokevirtual   #89  <Method int String.length()>
	//   90  181:iadd            
	//   91  182:aload           8
	//   92  184:invokestatic    #85  <Method String String.valueOf(Object)>
	//   93  187:invokevirtual   #89  <Method int String.length()>
	//   94  190:iadd            
	//   95  191:invokespecial   #92  <Method void StringBuilder(int)>
	//   96  194:astore          9
				stringbuilder1.append("AssumedSupport [");
	//   97  196:aload           9
	//   98  198:ldc1            #174 <String "AssumedSupport [">
	//   99  200:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  100  203:pop             
				stringbuilder1.append(((String) (obj1)));
	//  101  204:aload           9
	//  102  206:aload           5
	//  103  208:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  104  211:pop             
				stringbuilder1.append("] [");
	//  105  212:aload           9
	//  106  214:ldc1            #100 <String "] [">
	//  107  216:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  108  219:pop             
				stringbuilder1.append(s);
	//  109  220:aload           9
	//  110  222:aload           6
	//  111  224:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  112  227:pop             
				stringbuilder1.append(", ");
	//  113  228:aload           9
	//  114  230:ldc1            #102 <String ", ">
	//  115  232:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  116  235:pop             
				stringbuilder1.append(s1);
	//  117  236:aload           9
	//  118  238:aload           7
	//  119  240:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  120  243:pop             
				stringbuilder1.append("] [");
	//  121  244:aload           9
	//  122  246:ldc1            #100 <String "] [">
	//  123  248:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  124  251:pop             
				stringbuilder1.append(s2);
	//  125  252:aload           9
	//  126  254:aload           8
	//  127  256:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  128  259:pop             
				stringbuilder1.append("]");
	//  129  260:aload           9
	//  130  262:ldc1            #104 <String "]">
	//  131  264:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  132  267:pop             
				Log.d("MediaCodecInfo", stringbuilder1.toString());
	//  133  268:ldc1            #106 <String "MediaCodecInfo">
	//  134  270:aload           9
	//  135  272:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  136  275:invokestatic    #115 <Method int Log.d(String, String)>
	//  137  278:pop             
			} else
	//* 138  279:goto            349
			{
				StringBuilder stringbuilder = new StringBuilder(69);
	//  139  282:new             #81  <Class StringBuilder>
	//  140  285:dup             
	//  141  286:bipush          69
	//  142  288:invokespecial   #92  <Method void StringBuilder(int)>
	//  143  291:astore          5
				stringbuilder.append("sizeAndRate.support, ");
	//  144  293:aload           5
	//  145  295:ldc1            #176 <String "sizeAndRate.support, ">
	//  146  297:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  147  300:pop             
				stringbuilder.append(i);
	//  148  301:aload           5
	//  149  303:iload_1         
	//  150  304:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//  151  307:pop             
				stringbuilder.append("x");
	//  152  308:aload           5
	//  153  310:ldc1            #169 <String "x">
	//  154  312:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  155  315:pop             
				stringbuilder.append(j);
	//  156  316:aload           5
	//  157  318:iload_2         
	//  158  319:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//  159  322:pop             
				stringbuilder.append("x");
	//  160  323:aload           5
	//  161  325:ldc1            #169 <String "x">
	//  162  327:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  163  330:pop             
				stringbuilder.append(d1);
	//  164  331:aload           5
	//  165  333:dload_3         
	//  166  334:invokevirtual   #172 <Method StringBuilder StringBuilder.append(double)>
	//  167  337:pop             
				c(stringbuilder.toString());
	//  168  338:aload_0         
	//  169  339:aload           5
	//  170  341:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  171  344:invokespecial   #120 <Method void c(String)>
				return false;
	//  172  347:iconst_0        
	//  173  348:ireturn         
			}
		return true;
	//  174  349:iconst_1        
	//  175  350:ireturn         
	}

	public final android.media.MediaCodecInfo.CodecProfileLevel[] a()
	{
		android.media.MediaCodecInfo.CodecCapabilities codeccapabilities = f;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field android.media.MediaCodecInfo$CodecCapabilities f>
	//    2    4:astore_1        
		if(codeccapabilities != null && codeccapabilities.profileLevels != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
	//*   5    9:aload_1         
	//*   6   10:getfield        #181 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            27
			return f.profileLevels;
	//    9   19:aload_0         
	//   10   20:getfield        #34  <Field android.media.MediaCodecInfo$CodecCapabilities f>
	//   11   23:getfield        #181 <Field android.media.MediaCodecInfo$CodecProfileLevel[] android.media.MediaCodecInfo$CodecCapabilities.profileLevels>
	//   12   26:areturn         
		else
			return new android.media.MediaCodecInfo.CodecProfileLevel[0];
	//   13   27:iconst_0        
	//   14   28:anewarray       android.media.MediaCodecInfo.CodecProfileLevel[]
	//   15   31:areturn         
	}

	public final boolean b(int i)
	{
		Object obj = ((Object) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field android.media.MediaCodecInfo$CodecCapabilities f>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       17
		{
			c("channelCount.caps");
	//    5    9:aload_0         
	//    6   10:ldc1            #185 <String "channelCount.caps">
	//    7   12:invokespecial   #120 <Method void c(String)>
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
		}
		obj = ((Object) (((android.media.MediaCodecInfo.CodecCapabilities) (obj)).getAudioCapabilities()));
	//   10   17:aload_2         
	//   11   18:invokevirtual   #147 <Method android.media.MediaCodecInfo$AudioCapabilities android.media.MediaCodecInfo$CodecCapabilities.getAudioCapabilities()>
	//   12   21:astore_2        
		if(obj == null)
	//*  13   22:aload_2         
	//*  14   23:ifnonnull       34
		{
			c("channelCount.aCaps");
	//   15   26:aload_0         
	//   16   27:ldc1            #187 <String "channelCount.aCaps">
	//   17   29:invokespecial   #120 <Method void c(String)>
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		}
		if(((android.media.MediaCodecInfo.AudioCapabilities) (obj)).getMaxInputChannelCount() < i)
	//*  20   34:aload_2         
	//*  21   35:invokevirtual   #190 <Method int android.media.MediaCodecInfo$AudioCapabilities.getMaxInputChannelCount()>
	//*  22   38:iload_1         
	//*  23   39:icmpge          75
		{
			StringBuilder stringbuilder = new StringBuilder(33);
	//   24   42:new             #81  <Class StringBuilder>
	//   25   45:dup             
	//   26   46:bipush          33
	//   27   48:invokespecial   #92  <Method void StringBuilder(int)>
	//   28   51:astore_2        
			stringbuilder.append("channelCount.support, ");
	//   29   52:aload_2         
	//   30   53:ldc1            #192 <String "channelCount.support, ">
	//   31   55:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
			stringbuilder.append(i);
	//   33   59:aload_2         
	//   34   60:iload_1         
	//   35   61:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
	//   36   64:pop             
			c(stringbuilder.toString());
	//   37   65:aload_0         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   40   70:invokespecial   #120 <Method void c(String)>
			return false;
	//   41   73:iconst_0        
	//   42   74:ireturn         
		} else
		{
			return true;
	//   43   75:iconst_1        
	//   44   76:ireturn         
		}
	}

	public final boolean b(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          261
		{
			if(e == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #32  <Field String e>
	//*   4    8:ifnonnull       13
				return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
			String s1 = bnk.d(s);
	//    7   13:aload_1         
	//    8   14:invokestatic    #197 <Method String bnk.d(String)>
	//    9   17:astore          4
			if(s1 == null)
	//*  10   19:aload           4
	//*  11   21:ifnonnull       26
				return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
			if(!e.equals(((Object) (s1))))
	//*  14   26:aload_0         
	//*  15   27:getfield        #32  <Field String e>
	//*  16   30:aload           4
	//*  17   32:invokevirtual   #201 <Method boolean String.equals(Object)>
	//*  18   35:ifne            108
			{
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 13 + String.valueOf(((Object) (s1))).length());
	//   19   38:new             #81  <Class StringBuilder>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:invokestatic    #85  <Method String String.valueOf(Object)>
	//   23   46:invokevirtual   #89  <Method int String.length()>
	//   24   49:bipush          13
	//   25   51:iadd            
	//   26   52:aload           4
	//   27   54:invokestatic    #85  <Method String String.valueOf(Object)>
	//   28   57:invokevirtual   #89  <Method int String.length()>
	//   29   60:iadd            
	//   30   61:invokespecial   #92  <Method void StringBuilder(int)>
	//   31   64:astore          5
				stringbuilder.append("codec.mime ");
	//   32   66:aload           5
	//   33   68:ldc1            #203 <String "codec.mime ">
	//   34   70:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
				stringbuilder.append(s);
	//   36   74:aload           5
	//   37   76:aload_1         
	//   38   77:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
				stringbuilder.append(", ");
	//   40   81:aload           5
	//   41   83:ldc1            #102 <String ", ">
	//   42   85:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   43   88:pop             
				stringbuilder.append(s1);
	//   44   89:aload           5
	//   45   91:aload           4
	//   46   93:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   47   96:pop             
				c(stringbuilder.toString());
	//   48   97:aload_0         
	//   49   98:aload           5
	//   50  100:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   51  103:invokespecial   #120 <Method void c(String)>
				return false;
	//   52  106:iconst_0        
	//   53  107:ireturn         
			}
			Object obj = ((Object) (bhs.a(s)));
	//   54  108:aload_1         
	//   55  109:invokestatic    #208 <Method Pair bhs.a(String)>
	//   56  112:astore          5
			if(obj == null)
	//*  57  114:aload           5
	//*  58  116:ifnonnull       121
				return true;
	//   59  119:iconst_1        
	//   60  120:ireturn         
			android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[] = a();
	//   61  121:aload_0         
	//   62  122:invokevirtual   #210 <Method android.media.MediaCodecInfo$CodecProfileLevel[] a()>
	//   63  125:astore          6
			int j = acodecprofilelevel.length;
	//   64  127:aload           6
	//   65  129:arraylength     
	//   66  130:istore_3        
			for(int i = 0; i < j; i++)
	//*  67  131:iconst_0        
	//*  68  132:istore_2        
	//*  69  133:iload_2         
	//*  70  134:iload_3         
	//*  71  135:icmpge          191
			{
				android.media.MediaCodecInfo.CodecProfileLevel codecprofilelevel = acodecprofilelevel[i];
	//   72  138:aload           6
	//   73  140:iload_2         
	//   74  141:aaload          
	//   75  142:astore          7
				if(codecprofilelevel.profile == ((Integer)((Pair) (obj)).first).intValue() && codecprofilelevel.level >= ((Integer)((Pair) (obj)).second).intValue())
	//*  76  144:aload           7
	//*  77  146:getfield        #213 <Field int android.media.MediaCodecInfo$CodecProfileLevel.profile>
	//*  78  149:aload           5
	//*  79  151:getfield        #219 <Field Object Pair.first>
	//*  80  154:checkcast       #221 <Class Integer>
	//*  81  157:invokevirtual   #224 <Method int Integer.intValue()>
	//*  82  160:icmpne          184
	//*  83  163:aload           7
	//*  84  165:getfield        #227 <Field int android.media.MediaCodecInfo$CodecProfileLevel.level>
	//*  85  168:aload           5
	//*  86  170:getfield        #230 <Field Object Pair.second>
	//*  87  173:checkcast       #221 <Class Integer>
	//*  88  176:invokevirtual   #224 <Method int Integer.intValue()>
	//*  89  179:icmplt          184
					return true;
	//   90  182:iconst_1        
	//   91  183:ireturn         
			}

	//   92  184:iload_2         
	//   93  185:iconst_1        
	//   94  186:iadd            
	//   95  187:istore_2        
	//*  96  188:goto            133
			obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 22 + String.valueOf(((Object) (s1))).length())));
	//   97  191:new             #81  <Class StringBuilder>
	//   98  194:dup             
	//   99  195:aload_1         
	//  100  196:invokestatic    #85  <Method String String.valueOf(Object)>
	//  101  199:invokevirtual   #89  <Method int String.length()>
	//  102  202:bipush          22
	//  103  204:iadd            
	//  104  205:aload           4
	//  105  207:invokestatic    #85  <Method String String.valueOf(Object)>
	//  106  210:invokevirtual   #89  <Method int String.length()>
	//  107  213:iadd            
	//  108  214:invokespecial   #92  <Method void StringBuilder(int)>
	//  109  217:astore          5
			((StringBuilder) (obj)).append("codec.profileLevel, ");
	//  110  219:aload           5
	//  111  221:ldc1            #232 <String "codec.profileLevel, ">
	//  112  223:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  113  226:pop             
			((StringBuilder) (obj)).append(s);
	//  114  227:aload           5
	//  115  229:aload_1         
	//  116  230:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  117  233:pop             
			((StringBuilder) (obj)).append(", ");
	//  118  234:aload           5
	//  119  236:ldc1            #102 <String ", ">
	//  120  238:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  121  241:pop             
			((StringBuilder) (obj)).append(s1);
	//  122  242:aload           5
	//  123  244:aload           4
	//  124  246:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  125  249:pop             
			c(((StringBuilder) (obj)).toString());
	//  126  250:aload_0         
	//  127  251:aload           5
	//  128  253:invokevirtual   #110 <Method String StringBuilder.toString()>
	//  129  256:invokespecial   #120 <Method void c(String)>
			return false;
	//  130  259:iconst_0        
	//  131  260:ireturn         
		} else
		{
			return true;
	//  132  261:iconst_1        
	//  133  262:ireturn         
		}
	}

	public final String a;
	public final boolean b;
	public final boolean c;
	public final boolean d;
	private final String e;
	private final android.media.MediaCodecInfo.CodecCapabilities f;
}

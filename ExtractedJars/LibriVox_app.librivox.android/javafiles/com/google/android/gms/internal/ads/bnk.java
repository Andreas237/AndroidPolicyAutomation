// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class bnk
{

	public static boolean a(String s)
	{
		return "audio".equals(((Object) (e(s))));
	//    0    0:ldc1            #8   <String "audio">
	//    1    2:aload_0         
	//    2    3:invokestatic    #12  <Method String e(String)>
	//    3    6:invokevirtual   #18  <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean b(String s)
	{
		return "video".equals(((Object) (e(s))));
	//    0    0:ldc1            #22  <String "video">
	//    1    2:aload_0         
	//    2    3:invokestatic    #12  <Method String e(String)>
	//    3    6:invokevirtual   #18  <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static boolean c(String s)
	{
		return "text".equals(((Object) (e(s))));
	//    0    0:ldc1            #25  <String "text">
	//    1    2:aload_0         
	//    2    3:invokestatic    #12  <Method String e(String)>
	//    3    6:invokevirtual   #18  <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public static String d(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method String String.trim()>
	//    6   10:astore_0        
		if(!s.startsWith("avc1") && !s.startsWith("avc3"))
	//*   7   11:aload_0         
	//*   8   12:ldc1            #32  <String "avc1">
	//*   9   14:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  10   17:ifne            214
	//*  11   20:aload_0         
	//*  12   21:ldc1            #37  <String "avc3">
	//*  13   23:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  14   26:ifeq            32
	//*  15   29:goto            214
		{
			if(!s.startsWith("hev1") && !s.startsWith("hvc1"))
	//*  16   32:aload_0         
	//*  17   33:ldc1            #39  <String "hev1">
	//*  18   35:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  19   38:ifne            211
	//*  20   41:aload_0         
	//*  21   42:ldc1            #41  <String "hvc1">
	//*  22   44:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  23   47:ifeq            53
	//*  24   50:goto            211
			{
				if(s.startsWith("vp9"))
	//*  25   53:aload_0         
	//*  26   54:ldc1            #43  <String "vp9">
	//*  27   56:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  28   59:ifeq            65
					return "video/x-vnd.on2.vp9";
	//   29   62:ldc1            #45  <String "video/x-vnd.on2.vp9">
	//   30   64:areturn         
				if(s.startsWith("vp8"))
	//*  31   65:aload_0         
	//*  32   66:ldc1            #47  <String "vp8">
	//*  33   68:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  34   71:ifeq            77
					return "video/x-vnd.on2.vp8";
	//   35   74:ldc1            #49  <String "video/x-vnd.on2.vp8">
	//   36   76:areturn         
				if(s.startsWith("mp4a"))
	//*  37   77:aload_0         
	//*  38   78:ldc1            #51  <String "mp4a">
	//*  39   80:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  40   83:ifeq            89
					return "audio/mp4a-latm";
	//   41   86:ldc1            #53  <String "audio/mp4a-latm">
	//   42   88:areturn         
				if(!s.startsWith("ac-3") && !s.startsWith("dac3"))
	//*  43   89:aload_0         
	//*  44   90:ldc1            #55  <String "ac-3">
	//*  45   92:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  46   95:ifne            208
	//*  47   98:aload_0         
	//*  48   99:ldc1            #57  <String "dac3">
	//*  49  101:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  50  104:ifeq            110
	//*  51  107:goto            208
				{
					if(!s.startsWith("ec-3") && !s.startsWith("dec3"))
	//*  52  110:aload_0         
	//*  53  111:ldc1            #59  <String "ec-3">
	//*  54  113:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  55  116:ifne            205
	//*  56  119:aload_0         
	//*  57  120:ldc1            #61  <String "dec3">
	//*  58  122:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  59  125:ifeq            131
	//*  60  128:goto            205
					{
						if(!s.startsWith("dtsc") && !s.startsWith("dtse"))
	//*  61  131:aload_0         
	//*  62  132:ldc1            #63  <String "dtsc">
	//*  63  134:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  64  137:ifne            202
	//*  65  140:aload_0         
	//*  66  141:ldc1            #65  <String "dtse">
	//*  67  143:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  68  146:ifeq            152
	//*  69  149:goto            202
						{
							if(!s.startsWith("dtsh") && !s.startsWith("dtsl"))
	//*  70  152:aload_0         
	//*  71  153:ldc1            #67  <String "dtsh">
	//*  72  155:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  73  158:ifne            199
	//*  74  161:aload_0         
	//*  75  162:ldc1            #69  <String "dtsl">
	//*  76  164:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  77  167:ifeq            173
	//*  78  170:goto            199
							{
								if(s.startsWith("opus"))
	//*  79  173:aload_0         
	//*  80  174:ldc1            #71  <String "opus">
	//*  81  176:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  82  179:ifeq            185
									return "audio/opus";
	//   83  182:ldc1            #73  <String "audio/opus">
	//   84  184:areturn         
								if(s.startsWith("vorbis"))
	//*  85  185:aload_0         
	//*  86  186:ldc1            #75  <String "vorbis">
	//*  87  188:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//*  88  191:ifeq            197
									return "audio/vorbis";
	//   89  194:ldc1            #77  <String "audio/vorbis">
	//   90  196:areturn         
								else
									return null;
	//   91  197:aconst_null     
	//   92  198:areturn         
							} else
							{
								return "audio/vnd.dts.hd";
	//   93  199:ldc1            #79  <String "audio/vnd.dts.hd">
	//   94  201:areturn         
							}
						} else
						{
							return "audio/vnd.dts";
	//   95  202:ldc1            #81  <String "audio/vnd.dts">
	//   96  204:areturn         
						}
					} else
					{
						return "audio/eac3";
	//   97  205:ldc1            #83  <String "audio/eac3">
	//   98  207:areturn         
					}
				} else
				{
					return "audio/ac3";
	//   99  208:ldc1            #85  <String "audio/ac3">
	//  100  210:areturn         
				}
			} else
			{
				return "video/hevc";
	//  101  211:ldc1            #87  <String "video/hevc">
	//  102  213:areturn         
			}
		} else
		{
			return "video/avc";
	//  103  214:ldc1            #89  <String "video/avc">
	//  104  216:areturn         
		}
	}

	private static String e(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = s.indexOf('/');
	//    4    6:aload_0         
	//    5    7:bipush          47
	//    6    9:invokevirtual   #93  <Method int String.indexOf(int)>
	//    7   12:istore_1        
		if(i == -1)
	//*   8   13:iload_1         
	//*   9   14:iconst_m1       
	//*  10   15:icmpne          59
		{
			s = String.valueOf(((Object) (s)));
	//   11   18:aload_0         
	//   12   19:invokestatic    #97  <Method String String.valueOf(Object)>
	//   13   22:astore_0        
			if(s.length() != 0)
	//*  14   23:aload_0         
	//*  15   24:invokevirtual   #101 <Method int String.length()>
	//*  16   27:ifeq            40
				s = "Invalid mime type: ".concat(s);
	//   17   30:ldc1            #103 <String "Invalid mime type: ">
	//   18   32:aload_0         
	//   19   33:invokevirtual   #106 <Method String String.concat(String)>
	//   20   36:astore_0        
			else
	//*  21   37:goto            50
				s = new String("Invalid mime type: ");
	//   22   40:new             #14  <Class String>
	//   23   43:dup             
	//   24   44:ldc1            #103 <String "Invalid mime type: ">
	//   25   46:invokespecial   #110 <Method void String(String)>
	//   26   49:astore_0        
			throw new IllegalArgumentException(s);
	//   27   50:new             #112 <Class IllegalArgumentException>
	//   28   53:dup             
	//   29   54:aload_0         
	//   30   55:invokespecial   #113 <Method void IllegalArgumentException(String)>
	//   31   58:athrow          
		} else
		{
			return s.substring(0, i);
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:iload_1         
	//   35   62:invokevirtual   #117 <Method String String.substring(int, int)>
	//   36   65:areturn         
		}
	}
}

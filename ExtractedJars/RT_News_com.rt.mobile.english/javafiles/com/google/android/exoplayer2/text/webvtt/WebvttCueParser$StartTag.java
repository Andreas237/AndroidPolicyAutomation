// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCueParser

private static final class WebvttCueParser$StartTag
{

	public static WebvttCueParser$StartTag buildStartTag(String s, int i)
	{
		String s1 = s.trim();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method String String.trim()>
	//    2    4:astore_3        
		if(s1.isEmpty())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #44  <Method boolean String.isEmpty()>
	//*   5    9:ifeq            14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		int j = s1.indexOf(" ");
	//    8   14:aload_3         
	//    9   15:ldc1            #46  <String " ">
	//   10   17:invokevirtual   #50  <Method int String.indexOf(String)>
	//   11   20:istore_2        
		if(j == -1)
	//*  12   21:iload_2         
	//*  13   22:iconst_m1       
	//*  14   23:icmpne          32
		{
			s = "";
	//   15   26:ldc1            #52  <String "">
	//   16   28:astore_0        
		} else
	//*  17   29:goto            48
		{
			s = s1.substring(j).trim();
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:invokevirtual   #56  <Method String String.substring(int)>
	//   21   37:invokevirtual   #40  <Method String String.trim()>
	//   22   40:astore_0        
			s1 = s1.substring(0, j);
	//   23   41:aload_3         
	//   24   42:iconst_0        
	//   25   43:iload_2         
	//   26   44:invokevirtual   #59  <Method String String.substring(int, int)>
	//   27   47:astore_3        
		}
		String as[] = Util.split(s1, "\\.");
	//   28   48:aload_3         
	//   29   49:ldc1            #61  <String "\\.">
	//   30   51:invokestatic    #67  <Method String[] Util.split(String, String)>
	//   31   54:astore_3        
		String s2 = as[0];
	//   32   55:aload_3         
	//   33   56:iconst_0        
	//   34   57:aaload          
	//   35   58:astore          4
		if(as.length > 1)
	//*  36   60:aload_3         
	//*  37   61:arraylength     
	//*  38   62:iconst_1        
	//*  39   63:icmple          80
			as = (String[])Arrays.copyOfRange(((Object []) (as)), 1, as.length);
	//   40   66:aload_3         
	//   41   67:iconst_1        
	//   42   68:aload_3         
	//   43   69:arraylength     
	//   44   70:invokestatic    #73  <Method Object[] Arrays.copyOfRange(Object[], int, int)>
	//   45   73:checkcast       #74  <Class String[]>
	//   46   76:astore_3        
		else
	//*  47   77:goto            84
			as = NO_CLASSES;
	//   48   80:getstatic       #21  <Field String[] NO_CLASSES>
	//   49   83:astore_3        
		return new WebvttCueParser$StartTag(s2, i, s, as);
	//   50   84:new             #2   <Class WebvttCueParser$StartTag>
	//   51   87:dup             
	//   52   88:aload           4
	//   53   90:iload_1         
	//   54   91:aload_0         
	//   55   92:aload_3         
	//   56   93:invokespecial   #76  <Method void WebvttCueParser$StartTag(String, int, String, String[])>
	//   57   96:areturn         
	}

	public static WebvttCueParser$StartTag buildWholeCueVirtualTag()
	{
		return new WebvttCueParser$StartTag("", 0, "", new String[0]);
	//    0    0:new             #2   <Class WebvttCueParser$StartTag>
	//    1    3:dup             
	//    2    4:ldc1            #52  <String "">
	//    3    6:iconst_0        
	//    4    7:ldc1            #52  <String "">
	//    5    9:iconst_0        
	//    6   10:anewarray       String[]
	//    7   13:invokespecial   #76  <Method void WebvttCueParser$StartTag(String, int, String, String[])>
	//    8   16:areturn         
	}

	private static final String NO_CLASSES[] = new String[0];
	public final String classes[];
	public final String name;
	public final int position;
	public final String voice;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:putstatic       #21  <Field String[] NO_CLASSES>
	//*   3    7:return          
	}

	private WebvttCueParser$StartTag(String s, int i, String s1, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		position = i;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #28  <Field int position>
		name = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field String name>
		voice = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field String voice>
		classes = as;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field String[] classes>
	//   14   25:return          
	}
}

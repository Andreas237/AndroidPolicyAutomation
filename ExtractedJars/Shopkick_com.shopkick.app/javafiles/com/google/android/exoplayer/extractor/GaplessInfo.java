// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GaplessInfo
{

	private GaplessInfo(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		encoderDelay = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int encoderDelay>
		encoderPadding = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #34  <Field int encoderPadding>
	//    8   14:return          
	}

	public static GaplessInfo createFromComment(String s, String s1)
	{
		if(!"iTunSMPB".equals(((Object) (s))))
	//*   0    0:ldc1            #8   <String "iTunSMPB">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #44  <Method boolean String.equals(Object)>
	//*   3    6:ifne            11
			return null;
	//    4    9:aconst_null     
	//    5   10:areturn         
		s = ((String) (GAPLESS_COMMENT_PATTERN.matcher(((CharSequence) (s1)))));
	//    6   11:getstatic       #25  <Field Pattern GAPLESS_COMMENT_PATTERN>
	//    7   14:aload_1         
	//    8   15:invokevirtual   #48  <Method Matcher Pattern.matcher(CharSequence)>
	//    9   18:astore_0        
		if(!((Matcher) (s)).find())
			break MISSING_BLOCK_LABEL_70;
	//   10   19:aload_0         
	//   11   20:invokevirtual   #54  <Method boolean Matcher.find()>
	//   12   23:ifeq            70
		int i;
		int j;
		try
		{
			i = Integer.parseInt(((Matcher) (s)).group(1), 16);
	//   13   26:aload_0         
	//   14   27:iconst_1        
	//   15   28:invokevirtual   #58  <Method String Matcher.group(int)>
	//   16   31:bipush          16
	//   17   33:invokestatic    #64  <Method int Integer.parseInt(String, int)>
	//   18   36:istore_2        
			j = Integer.parseInt(((Matcher) (s)).group(2), 16);
	//   19   37:aload_0         
	//   20   38:iconst_2        
	//   21   39:invokevirtual   #58  <Method String Matcher.group(int)>
	//   22   42:bipush          16
	//   23   44:invokestatic    #64  <Method int Integer.parseInt(String, int)>
	//   24   47:istore_3        
		}
	//*  25   48:iload_2         
	//*  26   49:ifne            58
	//*  27   52:iload_3         
	//*  28   53:ifne            58
	//*  29   56:aconst_null     
	//*  30   57:areturn         
	//*  31   58:new             #2   <Class GaplessInfo>
	//*  32   61:dup             
	//*  33   62:iload_2         
	//*  34   63:iload_3         
	//*  35   64:invokespecial   #66  <Method void GaplessInfo(int, int)>
	//*  36   67:astore_0        
	//*  37   68:aload_0         
	//*  38   69:areturn         
	//*  39   70:aconst_null     
	//*  40   71:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  41   72:astore_0        
		{
			return null;
	//   42   73:aconst_null     
	//   43   74:areturn         
		}
		if(i == 0 && j == 0)
			return null;
		s = ((String) (new GaplessInfo(i, j)));
		return ((GaplessInfo) (s));
		return null;
	}

	public static GaplessInfo createFromXingHeaderValue(int i)
	{
		int j = i >> 12;
	//    0    0:iload_0         
	//    1    1:bipush          12
	//    2    3:ishr            
	//    3    4:istore_1        
		i &= 0xfff;
	//    4    5:iload_0         
	//    5    6:sipush          4095
	//    6    9:iand            
	//    7   10:istore_0        
		if(j == 0 && i == 0)
	//*   8   11:iload_1         
	//*   9   12:ifne            21
	//*  10   15:iload_0         
	//*  11   16:ifne            21
			return null;
	//   12   19:aconst_null     
	//   13   20:areturn         
		else
			return new GaplessInfo(j, i);
	//   14   21:new             #2   <Class GaplessInfo>
	//   15   24:dup             
	//   16   25:iload_1         
	//   17   26:iload_0         
	//   18   27:invokespecial   #66  <Method void GaplessInfo(int, int)>
	//   19   30:areturn         
	}

	private static final String GAPLESS_COMMENT_ID = "iTunSMPB";
	private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
	public final int encoderDelay;
	public final int encoderPadding;

	static 
	{
	//    0    0:ldc1            #17  <String "^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})">
	//    1    2:invokestatic    #23  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #25  <Field Pattern GAPLESS_COMMENT_PATTERN>
	//*   3    8:return          
	}
}

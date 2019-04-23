// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


public final class VerboseLogUtil
{

	private VerboseLogUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areAllTagsEnabled()
	{
		return enableAllTags;
	//    0    0:getstatic       #17  <Field boolean enableAllTags>
	//    1    3:ireturn         
	}

	public static boolean isTagEnabled(String s)
	{
		if(enableAllTags)
	//*   0    0:getstatic       #17  <Field boolean enableAllTags>
	//*   1    3:ifeq            8
			return true;
	//    2    6:iconst_1        
	//    3    7:ireturn         
		String as[] = enabledTags;
	//    4    8:getstatic       #21  <Field String[] enabledTags>
	//    5   11:astore_2        
		if(as != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          52
		{
			if(as.length == 0)
	//*   8   16:aload_2         
	//*   9   17:arraylength     
	//*  10   18:ifne            23
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
			for(int i = 0; i < as.length; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_1        
	//*  15   25:iload_1         
	//*  16   26:aload_2         
	//*  17   27:arraylength     
	//*  18   28:icmpge          50
				if(as[i].equals(((Object) (s))))
	//*  19   31:aload_2         
	//*  20   32:iload_1         
	//*  21   33:aaload          
	//*  22   34:aload_0         
	//*  23   35:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*  24   38:ifeq            43
					return true;
	//   25   41:iconst_1        
	//   26   42:ireturn         

	//   27   43:iload_1         
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:istore_1        
	//*  31   47:goto            25
			return false;
	//   32   50:iconst_0        
	//   33   51:ireturn         
		} else
		{
			return false;
	//   34   52:iconst_0        
	//   35   53:ireturn         
		}
	}

	public static void setEnableAllTags(boolean flag)
	{
		enableAllTags = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #17  <Field boolean enableAllTags>
	//    2    4:return          
	}

	public static transient void setEnabledTags(String as[])
	{
		enabledTags = as;
	//    0    0:aload_0         
	//    1    1:putstatic       #21  <Field String[] enabledTags>
		enableAllTags = false;
	//    2    4:iconst_0        
	//    3    5:putstatic       #17  <Field boolean enableAllTags>
	//    4    8:return          
	}

	private static volatile boolean enableAllTags;
	private static volatile String enabledTags[];
}

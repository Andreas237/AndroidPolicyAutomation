// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;


// Referenced classes of package com.appscend.media.events:
//			APSVastAdBreak

public static final class APSVastAdBreak$APSVASTConfigurationOptions extends Enum
{

	public static APSVastAdBreak$APSVASTConfigurationOptions valueOf(String s)
	{
		return (APSVastAdBreak$APSVASTConfigurationOptions)Enum.valueOf(com/appscend/media/events/APSVastAdBreak$APSVASTConfigurationOptions, s);
	//    0    0:ldc1            #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
	//    4    9:areturn         
	}

	public static APSVastAdBreak$APSVASTConfigurationOptions[] values()
	{
		return (APSVastAdBreak$APSVASTConfigurationOptions[])((APSVastAdBreak$APSVASTConfigurationOptions []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field APSVastAdBreak$APSVASTConfigurationOptions[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions_3B_.clone()>
	//    2    6:checkcast       #46  <Class APSVastAdBreak$APSVASTConfigurationOptions[]>
	//    3    9:areturn         
	}

	private static final APSVastAdBreak$APSVASTConfigurationOptions $VALUES[];
	public static final APSVastAdBreak$APSVASTConfigurationOptions APSVASTMidContent;
	public static final APSVastAdBreak$APSVASTConfigurationOptions APSVASTNonLinear;
	public static final APSVastAdBreak$APSVASTConfigurationOptions APSVASTPostContent;
	public static final APSVastAdBreak$APSVASTConfigurationOptions APSVASTPreContent;

	static 
	{
		APSVASTPreContent = new APSVastAdBreak$APSVASTConfigurationOptions("APSVASTPreContent", 0);
	//    0    0:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "APSVASTPreContent">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
	//    5   10:putstatic       #24  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPreContent>
		APSVASTPostContent = new APSVastAdBreak$APSVASTConfigurationOptions("APSVASTPostContent", 1);
	//    6   13:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "APSVASTPostContent">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
	//   11   23:putstatic       #27  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPostContent>
		APSVASTMidContent = new APSVastAdBreak$APSVASTConfigurationOptions("APSVASTMidContent", 2);
	//   12   26:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "APSVASTMidContent">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
	//   17   36:putstatic       #30  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTMidContent>
		APSVASTNonLinear = new APSVastAdBreak$APSVASTConfigurationOptions("APSVASTNonLinear", 3);
	//   18   39:new             #2   <Class APSVastAdBreak$APSVASTConfigurationOptions>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "APSVASTNonLinear">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void APSVastAdBreak$APSVASTConfigurationOptions(String, int)>
	//   23   49:putstatic       #33  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTNonLinear>
		$VALUES = (new APSVastAdBreak$APSVASTConfigurationOptions[] {
			APSVASTPreContent, APSVASTPostContent, APSVASTMidContent, APSVASTNonLinear
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       APSVastAdBreak$APSVASTConfigurationOptions[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPreContent>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTPostContent>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTMidContent>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field APSVastAdBreak$APSVASTConfigurationOptions APSVASTNonLinear>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field APSVastAdBreak$APSVASTConfigurationOptions[] $VALUES>
	//*  43   83:return          
	}

	private APSVastAdBreak$APSVASTConfigurationOptions(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

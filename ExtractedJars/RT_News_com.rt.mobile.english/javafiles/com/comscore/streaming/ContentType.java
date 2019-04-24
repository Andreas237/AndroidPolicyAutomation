// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;


public final class ContentType extends Enum
{

	private ContentType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #70  <Method void Enum(String, int)>
		a = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #72  <Field String a>
	//    7   11:return          
	}

	public static ContentType valueOf(String s)
	{
		return (ContentType)Enum.valueOf(com/comscore/streaming/ContentType, s);
	//    0    0:ldc1            #2   <Class ContentType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #79  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ContentType>
	//    4    9:areturn         
	}

	public static ContentType[] values()
	{
		return (ContentType[])((ContentType []) (b)).clone();
	//    0    0:getstatic       #66  <Field ContentType[] b>
	//    1    3:invokevirtual   #86  <Method Object _5B_Lcom.comscore.streaming.ContentType_3B_.clone()>
	//    2    6:checkcast       #82  <Class ContentType[]>
	//    3    9:areturn         
	}

	protected String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String a>
	//    2    4:areturn         
	}

	public static final ContentType Bumper;
	public static final ContentType Live;
	public static final ContentType LongFormOnDemand;
	public static final ContentType Other;
	public static final ContentType ShortFormOnDemand;
	public static final ContentType UserGeneratedLive;
	public static final ContentType UserGeneratedLongFormOnDemand;
	public static final ContentType UserGeneratedShortFormOnDemand;
	private static final ContentType b[];
	private final String a;

	static 
	{
		LongFormOnDemand = new ContentType("LongFormOnDemand", 0, "c11");
	//    0    0:new             #2   <Class ContentType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "LongFormOnDemand">
	//    3    6:iconst_0        
	//    4    7:ldc1            #23  <String "c11">
	//    5    9:invokespecial   #27  <Method void ContentType(String, int, String)>
	//    6   12:putstatic       #29  <Field ContentType LongFormOnDemand>
		ShortFormOnDemand = new ContentType("ShortFormOnDemand", 1, "c12");
	//    7   15:new             #2   <Class ContentType>
	//    8   18:dup             
	//    9   19:ldc1            #30  <String "ShortFormOnDemand">
	//   10   21:iconst_1        
	//   11   22:ldc1            #32  <String "c12">
	//   12   24:invokespecial   #27  <Method void ContentType(String, int, String)>
	//   13   27:putstatic       #34  <Field ContentType ShortFormOnDemand>
		Live = new ContentType("Live", 2, "c13");
	//   14   30:new             #2   <Class ContentType>
	//   15   33:dup             
	//   16   34:ldc1            #35  <String "Live">
	//   17   36:iconst_2        
	//   18   37:ldc1            #37  <String "c13">
	//   19   39:invokespecial   #27  <Method void ContentType(String, int, String)>
	//   20   42:putstatic       #39  <Field ContentType Live>
		UserGeneratedLongFormOnDemand = new ContentType("UserGeneratedLongFormOnDemand", 3, "c21");
	//   21   45:new             #2   <Class ContentType>
	//   22   48:dup             
	//   23   49:ldc1            #40  <String "UserGeneratedLongFormOnDemand">
	//   24   51:iconst_3        
	//   25   52:ldc1            #42  <String "c21">
	//   26   54:invokespecial   #27  <Method void ContentType(String, int, String)>
	//   27   57:putstatic       #44  <Field ContentType UserGeneratedLongFormOnDemand>
		UserGeneratedShortFormOnDemand = new ContentType("UserGeneratedShortFormOnDemand", 4, "c22");
	//   28   60:new             #2   <Class ContentType>
	//   29   63:dup             
	//   30   64:ldc1            #45  <String "UserGeneratedShortFormOnDemand">
	//   31   66:iconst_4        
	//   32   67:ldc1            #47  <String "c22">
	//   33   69:invokespecial   #27  <Method void ContentType(String, int, String)>
	//   34   72:putstatic       #49  <Field ContentType UserGeneratedShortFormOnDemand>
		UserGeneratedLive = new ContentType("UserGeneratedLive", 5, "c23");
	//   35   75:new             #2   <Class ContentType>
	//   36   78:dup             
	//   37   79:ldc1            #50  <String "UserGeneratedLive">
	//   38   81:iconst_5        
	//   39   82:ldc1            #52  <String "c23">
	//   40   84:invokespecial   #27  <Method void ContentType(String, int, String)>
	//   41   87:putstatic       #54  <Field ContentType UserGeneratedLive>
		Bumper = new ContentType("Bumper", 6, "c99");
	//   42   90:new             #2   <Class ContentType>
	//   43   93:dup             
	//   44   94:ldc1            #55  <String "Bumper">
	//   45   96:bipush          6
	//   46   98:ldc1            #57  <String "c99">
	//   47  100:invokespecial   #27  <Method void ContentType(String, int, String)>
	//   48  103:putstatic       #59  <Field ContentType Bumper>
		Other = new ContentType("Other", 7, "c00");
	//   49  106:new             #2   <Class ContentType>
	//   50  109:dup             
	//   51  110:ldc1            #60  <String "Other">
	//   52  112:bipush          7
	//   53  114:ldc1            #62  <String "c00">
	//   54  116:invokespecial   #27  <Method void ContentType(String, int, String)>
	//   55  119:putstatic       #64  <Field ContentType Other>
		b = (new ContentType[] {
			LongFormOnDemand, ShortFormOnDemand, Live, UserGeneratedLongFormOnDemand, UserGeneratedShortFormOnDemand, UserGeneratedLive, Bumper, Other
		});
	//   56  122:bipush          8
	//   57  124:anewarray       ContentType[]
	//   58  127:dup             
	//   59  128:iconst_0        
	//   60  129:getstatic       #29  <Field ContentType LongFormOnDemand>
	//   61  132:aastore         
	//   62  133:dup             
	//   63  134:iconst_1        
	//   64  135:getstatic       #34  <Field ContentType ShortFormOnDemand>
	//   65  138:aastore         
	//   66  139:dup             
	//   67  140:iconst_2        
	//   68  141:getstatic       #39  <Field ContentType Live>
	//   69  144:aastore         
	//   70  145:dup             
	//   71  146:iconst_3        
	//   72  147:getstatic       #44  <Field ContentType UserGeneratedLongFormOnDemand>
	//   73  150:aastore         
	//   74  151:dup             
	//   75  152:iconst_4        
	//   76  153:getstatic       #49  <Field ContentType UserGeneratedShortFormOnDemand>
	//   77  156:aastore         
	//   78  157:dup             
	//   79  158:iconst_5        
	//   80  159:getstatic       #54  <Field ContentType UserGeneratedLive>
	//   81  162:aastore         
	//   82  163:dup             
	//   83  164:bipush          6
	//   84  166:getstatic       #59  <Field ContentType Bumper>
	//   85  169:aastore         
	//   86  170:dup             
	//   87  171:bipush          7
	//   88  173:getstatic       #64  <Field ContentType Other>
	//   89  176:aastore         
	//   90  177:putstatic       #66  <Field ContentType[] b>
	//*  91  180:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.enumerate;


public final class ETagType extends Enum
{

	private ETagType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
		value = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #56  <Field String value>
	//    7   11:return          
	}

	public static ETagType valueOf(String s)
	{
		return (ETagType)Enum.valueOf(cn/com/fmsh/communication/message/enumerate/ETagType, s);
	//    0    0:ldc1            #2   <Class ETagType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #61  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ETagType>
	//    4    9:areturn         
	}

	public static ETagType[] values()
	{
		ETagType aetagtype[] = ENUM$VALUES;
	//    0    0:getstatic       #50  <Field ETagType[] ENUM$VALUES>
	//    1    3:astore_1        
		int i = aetagtype.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_0        
		ETagType aetagtype1[] = new ETagType[i];
	//    5    7:iload_0         
	//    6    8:anewarray       ETagType[]
	//    7   11:astore_2        
		System.arraycopy(((Object) (aetagtype)), 0, ((Object) (aetagtype1)), 0, i);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:aload_2         
	//   11   15:iconst_0        
	//   12   16:iload_0         
	//   13   17:invokestatic    #69  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aetagtype1;
	//   14   20:aload_2         
	//   15   21:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String value>
	//    2    4:areturn         
	}

	public static final ETagType B;
	public static final ETagType C;
	private static final ETagType ENUM$VALUES[];
	public static final ETagType G;
	public static final ETagType H;
	public static final ETagType I;
	public static final ETagType N;
	public static final ETagType S;
	public static final ETagType U;
	private String value;

	static 
	{
		I = new ETagType("I", 0, "I");
	//    0    0:new             #2   <Class ETagType>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "I">
	//    3    6:iconst_0        
	//    4    7:ldc1            #21  <String "I">
	//    5    9:invokespecial   #25  <Method void ETagType(String, int, String)>
	//    6   12:putstatic       #27  <Field ETagType I>
		S = new ETagType("S", 1, "S");
	//    7   15:new             #2   <Class ETagType>
	//    8   18:dup             
	//    9   19:ldc1            #28  <String "S">
	//   10   21:iconst_1        
	//   11   22:ldc1            #28  <String "S">
	//   12   24:invokespecial   #25  <Method void ETagType(String, int, String)>
	//   13   27:putstatic       #30  <Field ETagType S>
		B = new ETagType("B", 2, "B");
	//   14   30:new             #2   <Class ETagType>
	//   15   33:dup             
	//   16   34:ldc1            #31  <String "B">
	//   17   36:iconst_2        
	//   18   37:ldc1            #31  <String "B">
	//   19   39:invokespecial   #25  <Method void ETagType(String, int, String)>
	//   20   42:putstatic       #33  <Field ETagType B>
		C = new ETagType("C", 3, "C");
	//   21   45:new             #2   <Class ETagType>
	//   22   48:dup             
	//   23   49:ldc1            #34  <String "C">
	//   24   51:iconst_3        
	//   25   52:ldc1            #34  <String "C">
	//   26   54:invokespecial   #25  <Method void ETagType(String, int, String)>
	//   27   57:putstatic       #36  <Field ETagType C>
		N = new ETagType("N", 4, "N");
	//   28   60:new             #2   <Class ETagType>
	//   29   63:dup             
	//   30   64:ldc1            #37  <String "N">
	//   31   66:iconst_4        
	//   32   67:ldc1            #37  <String "N">
	//   33   69:invokespecial   #25  <Method void ETagType(String, int, String)>
	//   34   72:putstatic       #39  <Field ETagType N>
		U = new ETagType("U", 5, "U");
	//   35   75:new             #2   <Class ETagType>
	//   36   78:dup             
	//   37   79:ldc1            #40  <String "U">
	//   38   81:iconst_5        
	//   39   82:ldc1            #40  <String "U">
	//   40   84:invokespecial   #25  <Method void ETagType(String, int, String)>
	//   41   87:putstatic       #42  <Field ETagType U>
		G = new ETagType("G", 6, "G");
	//   42   90:new             #2   <Class ETagType>
	//   43   93:dup             
	//   44   94:ldc1            #43  <String "G">
	//   45   96:bipush          6
	//   46   98:ldc1            #43  <String "G">
	//   47  100:invokespecial   #25  <Method void ETagType(String, int, String)>
	//   48  103:putstatic       #45  <Field ETagType G>
		H = new ETagType("H", 7, "H");
	//   49  106:new             #2   <Class ETagType>
	//   50  109:dup             
	//   51  110:ldc1            #46  <String "H">
	//   52  112:bipush          7
	//   53  114:ldc1            #46  <String "H">
	//   54  116:invokespecial   #25  <Method void ETagType(String, int, String)>
	//   55  119:putstatic       #48  <Field ETagType H>
		ENUM$VALUES = (new ETagType[] {
			I, S, B, C, N, U, G, H
		});
	//   56  122:bipush          8
	//   57  124:anewarray       ETagType[]
	//   58  127:dup             
	//   59  128:iconst_0        
	//   60  129:getstatic       #27  <Field ETagType I>
	//   61  132:aastore         
	//   62  133:dup             
	//   63  134:iconst_1        
	//   64  135:getstatic       #30  <Field ETagType S>
	//   65  138:aastore         
	//   66  139:dup             
	//   67  140:iconst_2        
	//   68  141:getstatic       #33  <Field ETagType B>
	//   69  144:aastore         
	//   70  145:dup             
	//   71  146:iconst_3        
	//   72  147:getstatic       #36  <Field ETagType C>
	//   73  150:aastore         
	//   74  151:dup             
	//   75  152:iconst_4        
	//   76  153:getstatic       #39  <Field ETagType N>
	//   77  156:aastore         
	//   78  157:dup             
	//   79  158:iconst_5        
	//   80  159:getstatic       #42  <Field ETagType U>
	//   81  162:aastore         
	//   82  163:dup             
	//   83  164:bipush          6
	//   84  166:getstatic       #45  <Field ETagType G>
	//   85  169:aastore         
	//   86  170:dup             
	//   87  171:bipush          7
	//   88  173:getstatic       #48  <Field ETagType H>
	//   89  176:aastore         
	//   90  177:putstatic       #50  <Field ETagType[] ENUM$VALUES>
	//*  91  180:return          
	}
}

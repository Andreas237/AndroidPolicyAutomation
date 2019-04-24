// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;


public final class AggregationType extends Enum
{

	private AggregationType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AggregationType valueOf(String s)
	{
		return (AggregationType)Enum.valueOf(ch/qos/logback/core/util/AggregationType, s);
	//    0    0:ldc1            #2   <Class AggregationType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AggregationType>
	//    4    9:areturn         
	}

	public static AggregationType[] values()
	{
		return (AggregationType[])((AggregationType []) ($VALUES)).clone();
	//    0    0:getstatic       #36  <Field AggregationType[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lch.qos.logback.core.util.AggregationType_3B_.clone()>
	//    2    6:checkcast       #47  <Class AggregationType[]>
	//    3    9:areturn         
	}

	private static final AggregationType $VALUES[];
	public static final AggregationType AS_BASIC_PROPERTY;
	public static final AggregationType AS_BASIC_PROPERTY_COLLECTION;
	public static final AggregationType AS_COMPLEX_PROPERTY;
	public static final AggregationType AS_COMPLEX_PROPERTY_COLLECTION;
	public static final AggregationType NOT_FOUND;

	static 
	{
		NOT_FOUND = new AggregationType("NOT_FOUND", 0);
	//    0    0:new             #2   <Class AggregationType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "NOT_FOUND">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void AggregationType(String, int)>
	//    5   10:putstatic       #22  <Field AggregationType NOT_FOUND>
		AS_BASIC_PROPERTY = new AggregationType("AS_BASIC_PROPERTY", 1);
	//    6   13:new             #2   <Class AggregationType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "AS_BASIC_PROPERTY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void AggregationType(String, int)>
	//   11   23:putstatic       #25  <Field AggregationType AS_BASIC_PROPERTY>
		AS_COMPLEX_PROPERTY = new AggregationType("AS_COMPLEX_PROPERTY", 2);
	//   12   26:new             #2   <Class AggregationType>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "AS_COMPLEX_PROPERTY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void AggregationType(String, int)>
	//   17   36:putstatic       #28  <Field AggregationType AS_COMPLEX_PROPERTY>
		AS_BASIC_PROPERTY_COLLECTION = new AggregationType("AS_BASIC_PROPERTY_COLLECTION", 3);
	//   18   39:new             #2   <Class AggregationType>
	//   19   42:dup             
	//   20   43:ldc1            #29  <String "AS_BASIC_PROPERTY_COLLECTION">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #20  <Method void AggregationType(String, int)>
	//   23   49:putstatic       #31  <Field AggregationType AS_BASIC_PROPERTY_COLLECTION>
		AS_COMPLEX_PROPERTY_COLLECTION = new AggregationType("AS_COMPLEX_PROPERTY_COLLECTION", 4);
	//   24   52:new             #2   <Class AggregationType>
	//   25   55:dup             
	//   26   56:ldc1            #32  <String "AS_COMPLEX_PROPERTY_COLLECTION">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #20  <Method void AggregationType(String, int)>
	//   29   62:putstatic       #34  <Field AggregationType AS_COMPLEX_PROPERTY_COLLECTION>
		$VALUES = (new AggregationType[] {
			NOT_FOUND, AS_BASIC_PROPERTY, AS_COMPLEX_PROPERTY, AS_BASIC_PROPERTY_COLLECTION, AS_COMPLEX_PROPERTY_COLLECTION
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       AggregationType[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #22  <Field AggregationType NOT_FOUND>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #25  <Field AggregationType AS_BASIC_PROPERTY>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #28  <Field AggregationType AS_COMPLEX_PROPERTY>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #31  <Field AggregationType AS_BASIC_PROPERTY_COLLECTION>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #34  <Field AggregationType AS_COMPLEX_PROPERTY_COLLECTION>
	//   51   98:aastore         
	//   52   99:putstatic       #36  <Field AggregationType[] $VALUES>
	//*  53  102:return          
	}
}

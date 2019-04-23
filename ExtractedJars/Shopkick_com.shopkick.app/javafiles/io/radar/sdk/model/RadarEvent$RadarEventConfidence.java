// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;


// Referenced classes of package io.radar.sdk.model:
//			RadarEvent

public static final class RadarEvent$RadarEventConfidence extends Enum
{

	public static RadarEvent$RadarEventConfidence valueOf(String s)
	{
		return (RadarEvent$RadarEventConfidence)Enum.valueOf(io/radar/sdk/model/RadarEvent$RadarEventConfidence, s);
	//    0    0:ldc1            #2   <Class RadarEvent$RadarEventConfidence>
	//    1    2:aload_0         
	//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RadarEvent$RadarEventConfidence>
	//    4    9:areturn         
	}

	public static RadarEvent$RadarEventConfidence[] values()
	{
		return (RadarEvent$RadarEventConfidence[])((RadarEvent$RadarEventConfidence []) ($VALUES)).clone();
	//    0    0:getstatic       #48  <Field RadarEvent$RadarEventConfidence[] $VALUES>
	//    1    3:invokevirtual   #63  <Method Object _5B_Lio.radar.sdk.model.RadarEvent$RadarEventConfidence_3B_.clone()>
	//    2    6:checkcast       #59  <Class RadarEvent$RadarEventConfidence[]>
	//    3    9:areturn         
	}

	private static final RadarEvent$RadarEventConfidence $VALUES[];
	public static final RadarEvent$RadarEventConfidence HIGH;
	public static final RadarEvent$RadarEventConfidence LOW;
	public static final RadarEvent$RadarEventConfidence MEDIUM;
	public static final RadarEvent$RadarEventConfidence NONE;

	static 
	{
		RadarEvent$RadarEventConfidence radarevent$radareventconfidence = new RadarEvent$RadarEventConfidence("NONE", 0);
	//    0    0:new             #2   <Class RadarEvent$RadarEventConfidence>
	//    1    3:dup             
	//    2    4:ldc1            #32  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
	//    5   10:astore_0        
		NONE = radarevent$radareventconfidence;
	//    6   11:aload_0         
	//    7   12:putstatic       #37  <Field RadarEvent$RadarEventConfidence NONE>
		RadarEvent$RadarEventConfidence radarevent$radareventconfidence1 = new RadarEvent$RadarEventConfidence("LOW", 1);
	//    8   15:new             #2   <Class RadarEvent$RadarEventConfidence>
	//    9   18:dup             
	//   10   19:ldc1            #38  <String "LOW">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
	//   13   25:astore_1        
		LOW = radarevent$radareventconfidence1;
	//   14   26:aload_1         
	//   15   27:putstatic       #40  <Field RadarEvent$RadarEventConfidence LOW>
		RadarEvent$RadarEventConfidence radarevent$radareventconfidence2 = new RadarEvent$RadarEventConfidence("MEDIUM", 2);
	//   16   30:new             #2   <Class RadarEvent$RadarEventConfidence>
	//   17   33:dup             
	//   18   34:ldc1            #41  <String "MEDIUM">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
	//   21   40:astore_2        
		MEDIUM = radarevent$radareventconfidence2;
	//   22   41:aload_2         
	//   23   42:putstatic       #43  <Field RadarEvent$RadarEventConfidence MEDIUM>
		RadarEvent$RadarEventConfidence radarevent$radareventconfidence3 = new RadarEvent$RadarEventConfidence("HIGH", 3);
	//   24   45:new             #2   <Class RadarEvent$RadarEventConfidence>
	//   25   48:dup             
	//   26   49:ldc1            #44  <String "HIGH">
	//   27   51:iconst_3        
	//   28   52:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
	//   29   55:astore_3        
		HIGH = radarevent$radareventconfidence3;
	//   30   56:aload_3         
	//   31   57:putstatic       #46  <Field RadarEvent$RadarEventConfidence HIGH>
		$VALUES = (new RadarEvent$RadarEventConfidence[] {
			radarevent$radareventconfidence, radarevent$radareventconfidence1, radarevent$radareventconfidence2, radarevent$radareventconfidence3
		});
	//   32   60:iconst_4        
	//   33   61:anewarray       RadarEvent$RadarEventConfidence[]
	//   34   64:dup             
	//   35   65:iconst_0        
	//   36   66:aload_0         
	//   37   67:aastore         
	//   38   68:dup             
	//   39   69:iconst_1        
	//   40   70:aload_1         
	//   41   71:aastore         
	//   42   72:dup             
	//   43   73:iconst_2        
	//   44   74:aload_2         
	//   45   75:aastore         
	//   46   76:dup             
	//   47   77:iconst_3        
	//   48   78:aload_3         
	//   49   79:aastore         
	//   50   80:putstatic       #48  <Field RadarEvent$RadarEventConfidence[] $VALUES>
	//*  51   83:return          
	}

	protected RadarEvent$RadarEventConfidence(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

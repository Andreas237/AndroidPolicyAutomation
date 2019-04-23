// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;


// Referenced classes of package io.radar.sdk.model:
//			RadarEvent

public static final class RadarEvent$RadarEventVerification extends Enum
{

	public static RadarEvent$RadarEventVerification valueOf(String s)
	{
		return (RadarEvent$RadarEventVerification)Enum.valueOf(io/radar/sdk/model/RadarEvent$RadarEventVerification, s);
	//    0    0:ldc1            #2   <Class RadarEvent$RadarEventVerification>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RadarEvent$RadarEventVerification>
	//    4    9:areturn         
	}

	public static RadarEvent$RadarEventVerification[] values()
	{
		return (RadarEvent$RadarEventVerification[])((RadarEvent$RadarEventVerification []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field RadarEvent$RadarEventVerification[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lio.radar.sdk.model.RadarEvent$RadarEventVerification_3B_.clone()>
	//    2    6:checkcast       #55  <Class RadarEvent$RadarEventVerification[]>
	//    3    9:areturn         
	}

	private static final RadarEvent$RadarEventVerification $VALUES[];
	public static final RadarEvent$RadarEventVerification ACCEPT;
	public static final RadarEvent$RadarEventVerification REJECT;
	public static final RadarEvent$RadarEventVerification UNVERIFY;

	static 
	{
		RadarEvent$RadarEventVerification radarevent$radareventverification = new RadarEvent$RadarEventVerification("ACCEPT", 0);
	//    0    0:new             #2   <Class RadarEvent$RadarEventVerification>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "ACCEPT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #34  <Method void RadarEvent$RadarEventVerification(String, int)>
	//    5   10:astore_0        
		ACCEPT = radarevent$radareventverification;
	//    6   11:aload_0         
	//    7   12:putstatic       #36  <Field RadarEvent$RadarEventVerification ACCEPT>
		RadarEvent$RadarEventVerification radarevent$radareventverification1 = new RadarEvent$RadarEventVerification("UNVERIFY", 1);
	//    8   15:new             #2   <Class RadarEvent$RadarEventVerification>
	//    9   18:dup             
	//   10   19:ldc1            #37  <String "UNVERIFY">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #34  <Method void RadarEvent$RadarEventVerification(String, int)>
	//   13   25:astore_1        
		UNVERIFY = radarevent$radareventverification1;
	//   14   26:aload_1         
	//   15   27:putstatic       #39  <Field RadarEvent$RadarEventVerification UNVERIFY>
		RadarEvent$RadarEventVerification radarevent$radareventverification2 = new RadarEvent$RadarEventVerification("REJECT", 2);
	//   16   30:new             #2   <Class RadarEvent$RadarEventVerification>
	//   17   33:dup             
	//   18   34:ldc1            #40  <String "REJECT">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #34  <Method void RadarEvent$RadarEventVerification(String, int)>
	//   21   40:astore_2        
		REJECT = radarevent$radareventverification2;
	//   22   41:aload_2         
	//   23   42:putstatic       #42  <Field RadarEvent$RadarEventVerification REJECT>
		$VALUES = (new RadarEvent$RadarEventVerification[] {
			radarevent$radareventverification, radarevent$radareventverification1, radarevent$radareventverification2
		});
	//   24   45:iconst_3        
	//   25   46:anewarray       RadarEvent$RadarEventVerification[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:aload_0         
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_1        
	//   32   55:aload_1         
	//   33   56:aastore         
	//   34   57:dup             
	//   35   58:iconst_2        
	//   36   59:aload_2         
	//   37   60:aastore         
	//   38   61:putstatic       #44  <Field RadarEvent$RadarEventVerification[] $VALUES>
	//*  39   64:return          
	}

	protected RadarEvent$RadarEventVerification(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

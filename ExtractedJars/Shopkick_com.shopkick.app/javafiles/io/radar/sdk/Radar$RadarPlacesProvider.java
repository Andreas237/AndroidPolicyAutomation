// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;


// Referenced classes of package io.radar.sdk:
//			Radar

public static final class Radar$RadarPlacesProvider extends Enum
{

	public static Radar$RadarPlacesProvider valueOf(String s)
	{
		return (Radar$RadarPlacesProvider)Enum.valueOf(io/radar/sdk/Radar$RadarPlacesProvider, s);
	//    0    0:ldc1            #2   <Class Radar$RadarPlacesProvider>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Radar$RadarPlacesProvider>
	//    4    9:areturn         
	}

	public static Radar$RadarPlacesProvider[] values()
	{
		return (Radar$RadarPlacesProvider[])((Radar$RadarPlacesProvider []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field Radar$RadarPlacesProvider[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lio.radar.sdk.Radar$RadarPlacesProvider_3B_.clone()>
	//    2    6:checkcast       #51  <Class Radar$RadarPlacesProvider[]>
	//    3    9:areturn         
	}

	private static final Radar$RadarPlacesProvider $VALUES[];
	public static final Radar$RadarPlacesProvider FACEBOOK;
	public static final Radar$RadarPlacesProvider NONE;

	static 
	{
		Radar$RadarPlacesProvider radar$radarplacesprovider = new Radar$RadarPlacesProvider("NONE", 0);
	//    0    0:new             #2   <Class Radar$RadarPlacesProvider>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void Radar$RadarPlacesProvider(String, int)>
	//    5   10:astore_0        
		NONE = radar$radarplacesprovider;
	//    6   11:aload_0         
	//    7   12:putstatic       #35  <Field Radar$RadarPlacesProvider NONE>
		Radar$RadarPlacesProvider radar$radarplacesprovider1 = new Radar$RadarPlacesProvider("FACEBOOK", 1);
	//    8   15:new             #2   <Class Radar$RadarPlacesProvider>
	//    9   18:dup             
	//   10   19:ldc1            #36  <String "FACEBOOK">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #33  <Method void Radar$RadarPlacesProvider(String, int)>
	//   13   25:astore_1        
		FACEBOOK = radar$radarplacesprovider1;
	//   14   26:aload_1         
	//   15   27:putstatic       #38  <Field Radar$RadarPlacesProvider FACEBOOK>
		$VALUES = (new Radar$RadarPlacesProvider[] {
			radar$radarplacesprovider, radar$radarplacesprovider1
		});
	//   16   30:iconst_2        
	//   17   31:anewarray       Radar$RadarPlacesProvider[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:aastore         
	//   22   38:dup             
	//   23   39:iconst_1        
	//   24   40:aload_1         
	//   25   41:aastore         
	//   26   42:putstatic       #40  <Field Radar$RadarPlacesProvider[] $VALUES>
	//*  27   45:return          
	}

	protected Radar$RadarPlacesProvider(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}
}

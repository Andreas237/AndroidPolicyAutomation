// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


// Referenced classes of package com.autonavi.amap.mapcore:
//			Inner_3dMap_locationOption

public static final class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol extends Enum
{

	public static Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol valueOf(String s)
	{
		return (Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol)Enum.valueOf(com/autonavi/amap/mapcore/Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol, s);
	//    0    0:ldc1            #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
	//    4    9:areturn         
	}

	public static Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[] values()
	{
		return (Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[])((Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol []) ($VALUES)).clone();
	//    0    0:getstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[] $VALUES>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lcom.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol_3B_.clone()>
	//    2    6:checkcast       #45  <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[]>
	//    3    9:areturn         
	}

	public final int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int value>
	//    2    4:ireturn         
	}

	private static final Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol $VALUES[];
	public static final Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTP;
	public static final Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTPS;
	private int value;

	static 
	{
		HTTP = new Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol("HTTP", 0, 0);
	//    0    0:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "HTTP">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #22  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol(String, int, int)>
	//    6   11:putstatic       #24  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTP>
		HTTPS = new Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol("HTTPS", 1, 1);
	//    7   14:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol>
	//    8   17:dup             
	//    9   18:ldc1            #25  <String "HTTPS">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #22  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol(String, int, int)>
	//   13   25:putstatic       #27  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTPS>
		$VALUES = (new Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[] {
			HTTP, HTTPS
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #24  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTP>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #27  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol HTTPS>
	//   23   43:aastore         
	//   24   44:putstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol[] $VALUES>
	//*  25   47:return          
	}

	private Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		value = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #35  <Field int value>
	//    7   11:return          
	}
}

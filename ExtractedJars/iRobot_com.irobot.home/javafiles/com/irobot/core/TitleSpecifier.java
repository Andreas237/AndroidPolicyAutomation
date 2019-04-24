// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class TitleSpecifier extends Enum
{

	private TitleSpecifier(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static TitleSpecifier valueOf(String s)
	{
		return (TitleSpecifier)Enum.valueOf(com/irobot/core/TitleSpecifier, s);
	//    0    0:ldc1            #2   <Class TitleSpecifier>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class TitleSpecifier>
	//    4    9:areturn         
	}

	public static TitleSpecifier[] values()
	{
		return (TitleSpecifier[])((TitleSpecifier []) ($VALUES)).clone();
	//    0    0:getstatic       #52  <Field TitleSpecifier[] $VALUES>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.irobot.core.TitleSpecifier_3B_.clone()>
	//    2    6:checkcast       #63  <Class TitleSpecifier[]>
	//    3    9:areturn         
	}

	private static final TitleSpecifier $VALUES[];
	public static final TitleSpecifier DoorEdit;
	public static final TitleSpecifier KeepOutZoneEdit;
	public static final TitleSpecifier Labeling;
	public static final TitleSpecifier Loading;
	public static final TitleSpecifier MapName;
	public static final TitleSpecifier Naming;
	public static final TitleSpecifier NoMap;
	public static final TitleSpecifier PlaceholderMapName;
	public static final TitleSpecifier ReLabeling;

	static 
	{
		Loading = new TitleSpecifier("Loading", 0);
	//    0    0:new             #2   <Class TitleSpecifier>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "Loading">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//    5   10:putstatic       #26  <Field TitleSpecifier Loading>
		Naming = new TitleSpecifier("Naming", 1);
	//    6   13:new             #2   <Class TitleSpecifier>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "Naming">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   11   23:putstatic       #29  <Field TitleSpecifier Naming>
		PlaceholderMapName = new TitleSpecifier("PlaceholderMapName", 2);
	//   12   26:new             #2   <Class TitleSpecifier>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "PlaceholderMapName">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   17   36:putstatic       #32  <Field TitleSpecifier PlaceholderMapName>
		MapName = new TitleSpecifier("MapName", 3);
	//   18   39:new             #2   <Class TitleSpecifier>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "MapName">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   23   49:putstatic       #35  <Field TitleSpecifier MapName>
		DoorEdit = new TitleSpecifier("DoorEdit", 4);
	//   24   52:new             #2   <Class TitleSpecifier>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "DoorEdit">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   29   62:putstatic       #38  <Field TitleSpecifier DoorEdit>
		Labeling = new TitleSpecifier("Labeling", 5);
	//   30   65:new             #2   <Class TitleSpecifier>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "Labeling">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   35   75:putstatic       #41  <Field TitleSpecifier Labeling>
		ReLabeling = new TitleSpecifier("ReLabeling", 6);
	//   36   78:new             #2   <Class TitleSpecifier>
	//   37   81:dup             
	//   38   82:ldc1            #42  <String "ReLabeling">
	//   39   84:bipush          6
	//   40   86:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   41   89:putstatic       #44  <Field TitleSpecifier ReLabeling>
		KeepOutZoneEdit = new TitleSpecifier("KeepOutZoneEdit", 7);
	//   42   92:new             #2   <Class TitleSpecifier>
	//   43   95:dup             
	//   44   96:ldc1            #45  <String "KeepOutZoneEdit">
	//   45   98:bipush          7
	//   46  100:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   47  103:putstatic       #47  <Field TitleSpecifier KeepOutZoneEdit>
		NoMap = new TitleSpecifier("NoMap", 8);
	//   48  106:new             #2   <Class TitleSpecifier>
	//   49  109:dup             
	//   50  110:ldc1            #48  <String "NoMap">
	//   51  112:bipush          8
	//   52  114:invokespecial   #24  <Method void TitleSpecifier(String, int)>
	//   53  117:putstatic       #50  <Field TitleSpecifier NoMap>
		$VALUES = (new TitleSpecifier[] {
			Loading, Naming, PlaceholderMapName, MapName, DoorEdit, Labeling, ReLabeling, KeepOutZoneEdit, NoMap
		});
	//   54  120:bipush          9
	//   55  122:anewarray       TitleSpecifier[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:getstatic       #26  <Field TitleSpecifier Loading>
	//   59  130:aastore         
	//   60  131:dup             
	//   61  132:iconst_1        
	//   62  133:getstatic       #29  <Field TitleSpecifier Naming>
	//   63  136:aastore         
	//   64  137:dup             
	//   65  138:iconst_2        
	//   66  139:getstatic       #32  <Field TitleSpecifier PlaceholderMapName>
	//   67  142:aastore         
	//   68  143:dup             
	//   69  144:iconst_3        
	//   70  145:getstatic       #35  <Field TitleSpecifier MapName>
	//   71  148:aastore         
	//   72  149:dup             
	//   73  150:iconst_4        
	//   74  151:getstatic       #38  <Field TitleSpecifier DoorEdit>
	//   75  154:aastore         
	//   76  155:dup             
	//   77  156:iconst_5        
	//   78  157:getstatic       #41  <Field TitleSpecifier Labeling>
	//   79  160:aastore         
	//   80  161:dup             
	//   81  162:bipush          6
	//   82  164:getstatic       #44  <Field TitleSpecifier ReLabeling>
	//   83  167:aastore         
	//   84  168:dup             
	//   85  169:bipush          7
	//   86  171:getstatic       #47  <Field TitleSpecifier KeepOutZoneEdit>
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:bipush          8
	//   90  178:getstatic       #50  <Field TitleSpecifier NoMap>
	//   91  181:aastore         
	//   92  182:putstatic       #52  <Field TitleSpecifier[] $VALUES>
	//*  93  185:return          
	}
}

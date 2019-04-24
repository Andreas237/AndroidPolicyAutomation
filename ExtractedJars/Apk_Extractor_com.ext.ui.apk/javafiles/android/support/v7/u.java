// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			ae, y, bp, at

public final class u
{

	public static final Class a(at at)
	{
		ae.b(((Object) (at)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		at = ((at) (((y)at).a()));
	//    3    6:aload_0         
	//    4    7:checkcast       #17  <Class y>
	//    5   10:invokeinterface #20  <Method Class y.a()>
	//    6   15:astore_0        
		if(((Class) (at)).isPrimitive()) goto _L2; else goto _L1
	//    7   16:aload_0         
	//    8   17:invokevirtual   #26  <Method boolean Class.isPrimitive()>
	//    9   20:ifne            39
_L1:
		Object obj;
		obj = ((Object) (at));
	//   10   23:aload_0         
	//   11   24:astore_1        
		if(at == null)
	//*  12   25:aload_0         
	//*  13   26:ifnonnull       290
			throw new bp("null cannot be cast to non-null type java.lang.Class<T>");
	//   14   29:new             #28  <Class bp>
	//   15   32:dup             
	//   16   33:ldc1            #30  <String "null cannot be cast to non-null type java.lang.Class<T>">
	//   17   35:invokespecial   #34  <Method void bp(String)>
	//   18   38:athrow          
		  goto _L3
_L2:
		obj = ((Object) (((Class) (at)).getName()));
	//   19   39:aload_0         
	//   20   40:invokevirtual   #38  <Method String Class.getName()>
	//   21   43:astore_1        
		if(obj != null) goto _L5; else goto _L4
	//   22   44:aload_1         
	//   23   45:ifnonnull       64
_L4:
		obj = ((Object) (at));
	//   24   48:aload_0         
	//   25   49:astore_1        
		if(at == null)
	//*  26   50:aload_0         
	//*  27   51:ifnonnull       290
			throw new bp("null cannot be cast to non-null type java.lang.Class<T>");
	//   28   54:new             #28  <Class bp>
	//   29   57:dup             
	//   30   58:ldc1            #30  <String "null cannot be cast to non-null type java.lang.Class<T>">
	//   31   60:invokespecial   #34  <Method void bp(String)>
	//   32   63:athrow          
		break; /* Loop/switch isn't completed */
_L5:
		switch(((String) (obj)).hashCode())
	//*  33   64:aload_1         
	//*  34   65:invokevirtual   #44  <Method int String.hashCode()>
		{
	//*  35   68:lookupswitch    9: default 152
	//	               -1325958191: 155
	//	               104431: 260
	//	               3039496: 200
	//	               3052374: 215
	//	               3327612: 275
	//	               3625364: 185
	//	               64711720: 170
	//	               97526364: 245
	//	               109413500: 230
	//*  36  152:goto            48
		case -1325958191: 
			if(((String) (obj)).equals("double"))
	//*  37  155:aload_1         
	//*  38  156:ldc1            #46  <String "double">
	//*  39  158:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  40  161:ifeq            48
				at = java/lang/Double;
	//   41  164:ldc1            #52  <Class Double>
	//   42  166:astore_0        
			break;

	//*  43  167:goto            48
		case 64711720: 
			if(((String) (obj)).equals("boolean"))
	//*  44  170:aload_1         
	//*  45  171:ldc1            #54  <String "boolean">
	//*  46  173:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  47  176:ifeq            48
				at = java/lang/Boolean;
	//   48  179:ldc1            #56  <Class Boolean>
	//   49  181:astore_0        
			break;

	//*  50  182:goto            48
		case 3625364: 
			if(((String) (obj)).equals("void"))
	//*  51  185:aload_1         
	//*  52  186:ldc1            #58  <String "void">
	//*  53  188:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  54  191:ifeq            48
				at = java/lang/Void;
	//   55  194:ldc1            #60  <Class Void>
	//   56  196:astore_0        
			break;

	//*  57  197:goto            48
		case 3039496: 
			if(((String) (obj)).equals("byte"))
	//*  58  200:aload_1         
	//*  59  201:ldc1            #62  <String "byte">
	//*  60  203:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  61  206:ifeq            48
				at = java/lang/Byte;
	//   62  209:ldc1            #64  <Class Byte>
	//   63  211:astore_0        
			break;

	//*  64  212:goto            48
		case 3052374: 
			if(((String) (obj)).equals("char"))
	//*  65  215:aload_1         
	//*  66  216:ldc1            #66  <String "char">
	//*  67  218:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  68  221:ifeq            48
				at = java/lang/Character;
	//   69  224:ldc1            #68  <Class Character>
	//   70  226:astore_0        
			break;

	//*  71  227:goto            48
		case 109413500: 
			if(((String) (obj)).equals("short"))
	//*  72  230:aload_1         
	//*  73  231:ldc1            #70  <String "short">
	//*  74  233:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  75  236:ifeq            48
				at = java/lang/Short;
	//   76  239:ldc1            #72  <Class Short>
	//   77  241:astore_0        
			break;

	//*  78  242:goto            48
		case 97526364: 
			if(((String) (obj)).equals("float"))
	//*  79  245:aload_1         
	//*  80  246:ldc1            #74  <String "float">
	//*  81  248:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  82  251:ifeq            48
				at = java/lang/Float;
	//   83  254:ldc1            #76  <Class Float>
	//   84  256:astore_0        
			break;

	//*  85  257:goto            48
		case 104431: 
			if(((String) (obj)).equals("int"))
	//*  86  260:aload_1         
	//*  87  261:ldc1            #78  <String "int">
	//*  88  263:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  89  266:ifeq            48
				at = java/lang/Integer;
	//   90  269:ldc1            #80  <Class Integer>
	//   91  271:astore_0        
			break;

	//*  92  272:goto            48
		case 3327612: 
			if(((String) (obj)).equals("long"))
	//*  93  275:aload_1         
	//*  94  276:ldc1            #82  <String "long">
	//*  95  278:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  96  281:ifeq            48
				at = java/lang/Long;
	//   97  284:ldc1            #84  <Class Long>
	//   98  286:astore_0        
			break;
		}
		if(true) goto _L4; else goto _L3
	//   99  287:goto            48
_L3:
		return ((Class) (obj));
	//  100  290:aload_1         
	//  101  291:areturn         
	}
}

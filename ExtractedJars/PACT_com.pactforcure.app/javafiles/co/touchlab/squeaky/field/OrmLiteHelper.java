// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;


public final class OrmLiteHelper
{

	public OrmLiteHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object safeConvert(Class class1, Object obj)
	{
		if(!((Object) (Integer.TYPE)).equals(((Object) (class1))) && !((Object) (java/lang/Integer)).equals(((Object) (class1)))) goto _L2; else goto _L1
	//    0    0:getstatic       #17  <Field Class Integer.TYPE>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//    3    7:ifne            19
	//    4   10:ldc1            #13  <Class Integer>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//    7   16:ifeq            32
_L1:
		Object obj1 = ((Object) (Integer.valueOf(((Number)obj).intValue())));
	//    8   19:aload_1         
	//    9   20:checkcast       #23  <Class Number>
	//   10   23:invokevirtual   #27  <Method int Number.intValue()>
	//   11   26:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//   12   29:astore_2        
_L4:
		return obj1;
	//   13   30:aload_2         
	//   14   31:areturn         
_L2:
		if(((Object) (Long.TYPE)).equals(((Object) (class1))) || ((Object) (java/lang/Long)).equals(((Object) (class1))))
	//*  15   32:getstatic       #34  <Field Class Long.TYPE>
	//*  16   35:aload_0         
	//*  17   36:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//*  18   39:ifne            51
	//*  19   42:ldc1            #33  <Class Long>
	//*  20   44:aload_0         
	//*  21   45:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//*  22   48:ifeq            62
			return ((Object) (Long.valueOf(((Number)obj).longValue())));
	//   23   51:aload_1         
	//   24   52:checkcast       #23  <Class Number>
	//   25   55:invokevirtual   #38  <Method long Number.longValue()>
	//   26   58:invokestatic    #41  <Method Long Long.valueOf(long)>
	//   27   61:areturn         
		if(((Object) (Short.TYPE)).equals(((Object) (class1))))
			break; /* Loop/switch isn't completed */
	//   28   62:getstatic       #44  <Field Class Short.TYPE>
	//   29   65:aload_0         
	//   30   66:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//   31   69:ifne            83
		obj1 = obj;
	//   32   72:aload_1         
	//   33   73:astore_2        
		if(!((Object) (java/lang/Short)).equals(((Object) (class1)))) goto _L4; else goto _L3
	//   34   74:ldc1            #43  <Class Short>
	//   35   76:aload_0         
	//   36   77:invokevirtual   #21  <Method boolean Object.equals(Object)>
	//   37   80:ifeq            30
_L3:
		return ((Object) (Short.valueOf(((Number)obj).shortValue())));
	//   38   83:aload_1         
	//   39   84:checkcast       #23  <Class Number>
	//   40   87:invokevirtual   #48  <Method short Number.shortValue()>
	//   41   90:invokestatic    #51  <Method Short Short.valueOf(short)>
	//   42   93:areturn         
	}
}

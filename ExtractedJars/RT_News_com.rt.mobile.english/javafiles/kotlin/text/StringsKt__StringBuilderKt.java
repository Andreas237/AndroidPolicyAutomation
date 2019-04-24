// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.text:
//			StringsKt__StringBuilderJVMKt

class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt
{

	public StringsKt__StringBuilderKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void StringsKt__StringBuilderJVMKt()>
	//    2    4:return          
	}

	public static final transient Appendable append(Appendable appendable, CharSequence acharsequence[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (appendable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (acharsequence)), "value");
	//    3    6:aload_1         
	//    4    7:ldc1            #55  <String "value">
	//    5    9:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		for(int j = acharsequence.length; i < j; i++)
	//*   8   14:aload_1         
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          39
			appendable.append(acharsequence[i]);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:invokeinterface #60  <Method Appendable Appendable.append(CharSequence)>
	//   19   31:pop             

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_2        
	//*  24   36:goto            17
		return appendable;
	//   25   39:aload_0         
	//   26   40:areturn         
	}

	public static final transient StringBuilder append(StringBuilder stringbuilder, Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (stringbuilder)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "value");
	//    3    6:aload_1         
	//    4    7:ldc1            #55  <String "value">
	//    5    9:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		for(int j = aobj.length; i < j; i++)
	//*   8   14:aload_1         
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          37
			stringbuilder.append(aobj[i]);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   19   29:pop             

	//   20   30:iload_2         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_2        
	//*  24   34:goto            17
		return stringbuilder;
	//   25   37:aload_0         
	//   26   38:areturn         
	}

	public static final transient StringBuilder append(StringBuilder stringbuilder, String as[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (stringbuilder)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (as)), "value");
	//    3    6:aload_1         
	//    4    7:ldc1            #55  <String "value">
	//    5    9:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		for(int j = as.length; i < j; i++)
	//*   8   14:aload_1         
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          37
			stringbuilder.append(as[i]);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   19   29:pop             

	//   20   30:iload_2         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_2        
	//*  24   34:goto            17
		return stringbuilder;
	//   25   37:aload_0         
	//   26   38:areturn         
	}

	public static final void appendElement(Appendable appendable, Object obj, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (appendable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(function1 != null)
	//*   3    6:aload_2         
	//*   4    7:ifnull          28
		{
			appendable.append((CharSequence)function1.invoke(obj));
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:aload_1         
	//    8   13:invokeinterface #79  <Method Object Function1.invoke(Object)>
	//    9   18:checkcast       #81  <Class CharSequence>
	//   10   21:invokeinterface #60  <Method Appendable Appendable.append(CharSequence)>
	//   11   26:pop             
			return;
	//   12   27:return          
		}
		boolean flag;
		if(obj != null)
	//*  13   28:aload_1         
	//*  14   29:ifnull          40
			flag = obj instanceof CharSequence;
	//   15   32:aload_1         
	//   16   33:instanceof      #81  <Class CharSequence>
	//   17   36:istore_3        
		else
	//*  18   37:goto            42
			flag = true;
	//   19   40:iconst_1        
	//   20   41:istore_3        
		if(flag)
	//*  21   42:iload_3         
	//*  22   43:ifeq            58
		{
			appendable.append((CharSequence)obj);
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:checkcast       #81  <Class CharSequence>
	//   26   51:invokeinterface #60  <Method Appendable Appendable.append(CharSequence)>
	//   27   56:pop             
			return;
	//   28   57:return          
		}
		if(obj instanceof Character)
	//*  29   58:aload_1         
	//*  30   59:instanceof      #83  <Class Character>
	//*  31   62:ifeq            80
		{
			appendable.append(((Character)obj).charValue());
	//   32   65:aload_0         
	//   33   66:aload_1         
	//   34   67:checkcast       #83  <Class Character>
	//   35   70:invokevirtual   #87  <Method char Character.charValue()>
	//   36   73:invokeinterface #90  <Method Appendable Appendable.append(char)>
	//   37   78:pop             
			return;
	//   38   79:return          
		} else
		{
			appendable.append((CharSequence)String.valueOf(obj));
	//   39   80:aload_0         
	//   40   81:aload_1         
	//   41   82:invokestatic    #96  <Method String String.valueOf(Object)>
	//   42   85:checkcast       #81  <Class CharSequence>
	//   43   88:invokeinterface #60  <Method Appendable Appendable.append(CharSequence)>
	//   44   93:pop             
			return;
	//   45   94:return          
		}
	}

	private static final String buildString(int i, Function1 function1)
	{
		StringBuilder stringbuilder = new StringBuilder(i);
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #105 <Method void StringBuilder(int)>
	//    4    8:astore_2        
		function1.invoke(((Object) (stringbuilder)));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #79  <Method Object Function1.invoke(Object)>
	//    8   16:pop             
		function1 = ((Function1) (stringbuilder.toString()));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   11   21:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (function1)), "StringBuilder(capacity).\u2026builderAction).toString()");
	//   12   22:aload_1         
	//   13   23:ldc1            #111 <String "StringBuilder(capacity).\u2026builderAction).toString()">
	//   14   25:invokestatic    #114 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((String) (function1));
	//   15   28:aload_1         
	//   16   29:areturn         
	}

	private static final String buildString(Function1 function1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_1        
		function1.invoke(((Object) (stringbuilder)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokeinterface #79  <Method Object Function1.invoke(Object)>
	//    7   15:pop             
		function1 = ((Function1) (stringbuilder.toString()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   10   20:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (function1)), "StringBuilder().apply(builderAction).toString()");
	//   11   21:aload_0         
	//   12   22:ldc1            #119 <String "StringBuilder().apply(builderAction).toString()">
	//   13   24:invokestatic    #114 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((String) (function1));
	//   14   27:aload_0         
	//   15   28:areturn         
	}
}

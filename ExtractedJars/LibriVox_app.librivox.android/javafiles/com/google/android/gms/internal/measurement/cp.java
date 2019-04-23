// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			cl, cr

final class cp extends cl
{

	cp(cr cr, String s, Double double1)
	{
		super(cr, s, ((Object) (double1)), ((cm) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #9   <Method void cl(cr, String, Object, cm)>
	//    6    8:return          
	}

	private final Double b(Object obj)
	{
		if(obj instanceof Double)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class Double>
	//*   2    4:ifeq            12
			return (Double)obj;
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class Double>
	//    5   11:areturn         
		if(obj instanceof Float)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #18  <Class Float>
	//*   8   16:ifeq            30
			return Double.valueOf(((Float)obj).doubleValue());
	//    9   19:aload_1         
	//   10   20:checkcast       #18  <Class Float>
	//   11   23:invokevirtual   #22  <Method double Float.doubleValue()>
	//   12   26:invokestatic    #26  <Method Double Double.valueOf(double)>
	//   13   29:areturn         
		if(!(obj instanceof String))
			break MISSING_BLOCK_LABEL_50;
	//   14   30:aload_1         
	//   15   31:instanceof      #28  <Class String>
	//   16   34:ifeq            50
		double d = Double.parseDouble((String)obj);
	//   17   37:aload_1         
	//   18   38:checkcast       #28  <Class String>
	//   19   41:invokestatic    #32  <Method double Double.parseDouble(String)>
	//   20   44:dstore_2        
		return Double.valueOf(d);
	//   21   45:dload_2         
	//   22   46:invokestatic    #26  <Method Double Double.valueOf(double)>
	//   23   49:areturn         
_L2:
		String s = super.b();
	//   24   50:aload_0         
	//   25   51:invokespecial   #35  <Method String cl.b()>
	//   26   54:astore          4
		obj = ((Object) (String.valueOf(obj)));
	//   27   56:aload_1         
	//   28   57:invokestatic    #38  <Method String String.valueOf(Object)>
	//   29   60:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 27 + String.valueOf(obj).length());
	//   30   61:new             #40  <Class StringBuilder>
	//   31   64:dup             
	//   32   65:aload           4
	//   33   67:invokestatic    #38  <Method String String.valueOf(Object)>
	//   34   70:invokevirtual   #44  <Method int String.length()>
	//   35   73:bipush          27
	//   36   75:iadd            
	//   37   76:aload_1         
	//   38   77:invokestatic    #38  <Method String String.valueOf(Object)>
	//   39   80:invokevirtual   #44  <Method int String.length()>
	//   40   83:iadd            
	//   41   84:invokespecial   #47  <Method void StringBuilder(int)>
	//   42   87:astore          5
		stringbuilder.append("Invalid double value for ");
	//   43   89:aload           5
	//   44   91:ldc1            #49  <String "Invalid double value for ">
	//   45   93:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   46   96:pop             
		stringbuilder.append(s);
	//   47   97:aload           5
	//   48   99:aload           4
	//   49  101:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
		stringbuilder.append(": ");
	//   51  105:aload           5
	//   52  107:ldc1            #55  <String ": ">
	//   53  109:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
		stringbuilder.append(((String) (obj)));
	//   55  113:aload           5
	//   56  115:aload_1         
	//   57  116:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   58  119:pop             
		Log.e("PhenotypeFlag", stringbuilder.toString());
	//   59  120:ldc1            #57  <String "PhenotypeFlag">
	//   60  122:aload           5
	//   61  124:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   62  127:invokestatic    #66  <Method int Log.e(String, String)>
	//   63  130:pop             
		return null;
	//   64  131:aconst_null     
	//   65  132:areturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   66  133:astore          4
		if(true) goto _L2; else goto _L1
	//   67  135:goto            50
_L1:
	}

	final Object a(Object obj)
	{
		return ((Object) (b(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method Double b(Object)>
	//    3    5:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.firebase.jobdispatcher:
//			ValidationEnforcer

public static final class ValidationEnforcer$ValidationException extends RuntimeException
{

	public List getErrors()
	{
		return errors;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List errors>
	//    2    4:areturn         
	}

	private final List errors;

	public ValidationEnforcer$ValidationException(String s, List list)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #15  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(": ");
	//    8   14:aload_3         
	//    9   15:ldc1            #24  <String ": ">
	//   10   17:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(TextUtils.join("\n  - ", ((Iterable) (list))));
	//   12   21:aload_3         
	//   13   22:ldc1            #26  <String "\n  - ">
	//   14   24:aload_2         
	//   15   25:invokestatic    #32  <Method String TextUtils.join(CharSequence, Iterable)>
	//   16   28:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		super(stringbuilder.toString());
	//   18   32:aload_0         
	//   19   33:aload_3         
	//   20   34:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   21   37:invokespecial   #39  <Method void RuntimeException(String)>
		errors = list;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #41  <Field List errors>
	//   25   45:return          
	}
}

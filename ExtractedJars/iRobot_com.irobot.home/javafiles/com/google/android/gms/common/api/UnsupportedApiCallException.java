// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException
{

	public UnsupportedApiCallException(Feature feature)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void UnsupportedOperationException()>
		zzar = feature;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Feature zzar>
	//    5    9:return          
	}

	public final String getMessage()
	{
		String s = String.valueOf(((Object) (zzar)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Feature zzar>
	//    2    4:invokestatic    #24  <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 8);
	//    4    8:new             #26  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #24  <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #30  <Method int String.length()>
	//    9   19:bipush          8
	//   10   21:iadd            
	//   11   22:invokespecial   #33  <Method void StringBuilder(int)>
	//   12   25:astore_2        
		stringbuilder.append("Missing ");
	//   13   26:aload_2         
	//   14   27:ldc1            #35  <String "Missing ">
	//   15   29:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(s);
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		return stringbuilder.toString();
	//   21   39:aload_2         
	//   22   40:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   23   43:areturn         
	}

	private final Feature zzar;
}

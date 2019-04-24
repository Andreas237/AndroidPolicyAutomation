// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class zzay
{

	zzay(String s, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzoj = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String zzoj>
		zzbbu = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field byte[] zzbbu>
	//    8   14:return          
	}

	public final String toString()
	{
		String s = zzoj;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String zzoj>
	//    2    4:astore_2        
		int i = Arrays.hashCode(zzbbu);
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field byte[] zzbbu>
	//    5    9:invokestatic    #26  <Method int Arrays.hashCode(byte[])>
	//    6   12:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 54);
	//    7   13:new             #28  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #34  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #38  <Method int String.length()>
	//   12   24:bipush          54
	//   13   26:iadd            
	//   14   27:invokespecial   #41  <Method void StringBuilder(int)>
	//   15   30:astore_3        
		stringbuilder.append("KeyAndSerialized: key = ");
	//   16   31:aload_3         
	//   17   32:ldc1            #43  <String "KeyAndSerialized: key = ">
	//   18   34:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(s);
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(" serialized hash = ");
	//   24   44:aload_3         
	//   25   45:ldc1            #49  <String " serialized hash = ">
	//   26   47:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(i);
	//   28   51:aload_3         
	//   29   52:iload_1         
	//   30   53:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   31   56:pop             
		return stringbuilder.toString();
	//   32   57:aload_3         
	//   33   58:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   34   61:areturn         
	}

	final byte zzbbu[];
	final String zzoj;
}

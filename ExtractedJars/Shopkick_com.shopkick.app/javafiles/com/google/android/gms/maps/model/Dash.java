// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//			PatternItem

public final class Dash extends PatternItem
{

	public Dash(float f)
	{
		super(0, Float.valueOf(Math.max(f, 0.0F)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:fload_1         
	//    3    3:fconst_0        
	//    4    4:invokestatic    #14  <Method float Math.max(float, float)>
	//    5    7:invokestatic    #20  <Method Float Float.valueOf(float)>
	//    6   10:invokespecial   #23  <Method void PatternItem(int, Float)>
		length = Math.max(f, 0.0F);
	//    7   13:aload_0         
	//    8   14:fload_1         
	//    9   15:fconst_0        
	//   10   16:invokestatic    #14  <Method float Math.max(float, float)>
	//   11   19:putfield        #25  <Field float length>
	//   12   22:return          
	}

	public final String toString()
	{
		float f = length;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float length>
	//    2    4:fstore_1        
		StringBuilder stringbuilder = new StringBuilder(30);
	//    3    5:new             #30  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          30
	//    6   11:invokespecial   #33  <Method void StringBuilder(int)>
	//    7   14:astore_2        
		stringbuilder.append("[Dash: length=");
	//    8   15:aload_2         
	//    9   16:ldc1            #35  <String "[Dash: length=">
	//   10   18:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(f);
	//   12   22:aload_2         
	//   13   23:fload_1         
	//   14   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(float)>
	//   15   27:pop             
		stringbuilder.append("]");
	//   16   28:aload_2         
	//   17   29:ldc1            #44  <String "]">
	//   18   31:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		return stringbuilder.toString();
	//   20   35:aload_2         
	//   21   36:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   22   39:areturn         
	}

	public final float length;
}

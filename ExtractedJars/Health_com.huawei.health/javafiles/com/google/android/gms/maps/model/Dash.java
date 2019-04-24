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

	public String toString()
	{
		float f = length;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float length>
	//    2    4:fstore_1        
		return (new StringBuilder(30)).append("[Dash: length=").append(f).append("]").toString();
	//    3    5:new             #30  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          30
	//    6   11:invokespecial   #33  <Method void StringBuilder(int)>
	//    7   14:ldc1            #35  <String "[Dash: length=">
	//    8   16:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:fload_1         
	//   10   20:invokevirtual   #42  <Method StringBuilder StringBuilder.append(float)>
	//   11   23:ldc1            #44  <String "]">
	//   12   25:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   14   31:areturn         
	}

	public final float length;
}

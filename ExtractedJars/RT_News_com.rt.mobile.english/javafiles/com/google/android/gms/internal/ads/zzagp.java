// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagv

public final class zzagp extends zzagv
{

	public zzagp(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzagv()>
		zzclb = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String zzclb>
		zzclc = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int zzclc>
	//    8   14:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          54
		{
			if(!(obj instanceof zzagp))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class zzagp>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((zzagp)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class zzagp>
	//    9   17:astore_1        
			if(Objects.equal(((Object) (zzclb)), ((Object) (((zzagp) (obj)).zzclb))) && Objects.equal(((Object) (Integer.valueOf(zzclc))), ((Object) (Integer.valueOf(((zzagp) (obj)).zzclc)))))
	//*  10   18:aload_0         
	//*  11   19:getfield        #16  <Field String zzclb>
	//*  12   22:aload_1         
	//*  13   23:getfield        #16  <Field String zzclb>
	//*  14   26:invokestatic    #27  <Method boolean Objects.equal(Object, Object)>
	//*  15   29:ifeq            54
	//*  16   32:aload_0         
	//*  17   33:getfield        #18  <Field int zzclc>
	//*  18   36:invokestatic    #33  <Method Integer Integer.valueOf(int)>
	//*  19   39:aload_1         
	//*  20   40:getfield        #18  <Field int zzclc>
	//*  21   43:invokestatic    #33  <Method Integer Integer.valueOf(int)>
	//*  22   46:invokestatic    #27  <Method boolean Objects.equal(Object, Object)>
	//*  23   49:ifeq            54
				return true;
	//   24   52:iconst_1        
	//   25   53:ireturn         
		}
		return false;
	//   26   54:iconst_0        
	//   27   55:ireturn         
	}

	public final int getAmount()
	{
		return zzclc;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int zzclc>
	//    2    4:ireturn         
	}

	public final String getType()
	{
		return zzclb;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String zzclb>
	//    2    4:areturn         
	}

	private final String zzclb;
	private final int zzclc;
}

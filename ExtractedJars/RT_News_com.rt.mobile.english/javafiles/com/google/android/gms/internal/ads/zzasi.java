// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjn

public final class zzasi
{

	private zzasi(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int type>
		widthPixels = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int widthPixels>
		heightPixels = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field int heightPixels>
	//   11   19:return          
	}

	public static zzasi zzb(zzjn zzjn1)
	{
		if(zzjn1.zzarc)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean zzjn.zzarc>
	//*   2    4:ifeq            18
			return new zzasi(3, 0, 0);
	//    3    7:new             #2   <Class zzasi>
	//    4   10:dup             
	//    5   11:iconst_3        
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:invokespecial   #31  <Method void zzasi(int, int, int)>
	//    9   17:areturn         
		if(zzjn1.zzarf)
	//*  10   18:aload_0         
	//*  11   19:getfield        #34  <Field boolean zzjn.zzarf>
	//*  12   22:ifeq            36
			return new zzasi(2, 0, 0);
	//   13   25:new             #2   <Class zzasi>
	//   14   28:dup             
	//   15   29:iconst_2        
	//   16   30:iconst_0        
	//   17   31:iconst_0        
	//   18   32:invokespecial   #31  <Method void zzasi(int, int, int)>
	//   19   35:areturn         
		if(zzjn1.zzare)
	//*  20   36:aload_0         
	//*  21   37:getfield        #37  <Field boolean zzjn.zzare>
	//*  22   40:ifeq            47
			return zzvq();
	//   23   43:invokestatic    #41  <Method zzasi zzvq()>
	//   24   46:areturn         
		else
			return zzi(zzjn1.widthPixels, zzjn1.heightPixels);
	//   25   47:aload_0         
	//   26   48:getfield        #42  <Field int zzjn.widthPixels>
	//   27   51:aload_0         
	//   28   52:getfield        #43  <Field int zzjn.heightPixels>
	//   29   55:invokestatic    #47  <Method zzasi zzi(int, int)>
	//   30   58:areturn         
	}

	public static zzasi zzi(int i, int j)
	{
		return new zzasi(1, i, j);
	//    0    0:new             #2   <Class zzasi>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #31  <Method void zzasi(int, int, int)>
	//    6   10:areturn         
	}

	public static zzasi zzvq()
	{
		return new zzasi(0, 0, 0);
	//    0    0:new             #2   <Class zzasi>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #31  <Method void zzasi(int, int, int)>
	//    6   10:areturn         
	}

	public static zzasi zzvr()
	{
		return new zzasi(4, 0, 0);
	//    0    0:new             #2   <Class zzasi>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #31  <Method void zzasi(int, int, int)>
	//    6   10:areturn         
	}

	public final boolean isFluid()
	{
		return type == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int type>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean zzvs()
	{
		return type == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int type>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean zzvt()
	{
		return type == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int type>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final boolean zzvu()
	{
		return type == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int type>
	//    2    4:iconst_4        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final int heightPixels;
	private final int type;
	public final int widthPixels;
}

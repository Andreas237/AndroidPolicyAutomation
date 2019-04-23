// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class blx
{

	public blx()
	{
		this(((String) (null)), ((String) (null)), false, true, 0x7fffffff, 0x7fffffff, 0x7fffffff, true, true, 0x7fffffff, 0x7fffffff, true);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:iconst_1        
	//    5    5:ldc1            #22  <Int 0x7fffffff>
	//    6    7:ldc1            #22  <Int 0x7fffffff>
	//    7    9:ldc1            #22  <Int 0x7fffffff>
	//    8   11:iconst_1        
	//    9   12:iconst_1        
	//   10   13:ldc1            #22  <Int 0x7fffffff>
	//   11   15:ldc1            #22  <Int 0x7fffffff>
	//   12   17:iconst_1        
	//   13   18:invokespecial   #25  <Method void blx(String, String, boolean, boolean, int, int, int, boolean, boolean, int, int, boolean)>
	//   14   21:return          
	}

	private blx(String s, String s1, boolean flag, boolean flag1, int i1, int j1, int k1, 
			boolean flag2, boolean flag3, int l1, int i2, boolean flag4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #30  <Field String a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #32  <Field String b>
		c = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #34  <Field boolean c>
		d = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #36  <Field boolean d>
		e = 0x7fffffff;
	//   14   24:aload_0         
	//   15   25:ldc1            #22  <Int 0x7fffffff>
	//   16   27:putfield        #38  <Field int e>
		f = 0x7fffffff;
	//   17   30:aload_0         
	//   18   31:ldc1            #22  <Int 0x7fffffff>
	//   19   33:putfield        #40  <Field int f>
		g = 0x7fffffff;
	//   20   36:aload_0         
	//   21   37:ldc1            #22  <Int 0x7fffffff>
	//   22   39:putfield        #42  <Field int g>
		h = true;
	//   23   42:aload_0         
	//   24   43:iconst_1        
	//   25   44:putfield        #44  <Field boolean h>
		i = true;
	//   26   47:aload_0         
	//   27   48:iconst_1        
	//   28   49:putfield        #46  <Field boolean i>
		j = 0x7fffffff;
	//   29   52:aload_0         
	//   30   53:ldc1            #22  <Int 0x7fffffff>
	//   31   55:putfield        #48  <Field int j>
		k = 0x7fffffff;
	//   32   58:aload_0         
	//   33   59:ldc1            #22  <Int 0x7fffffff>
	//   34   61:putfield        #50  <Field int k>
		l = true;
	//   35   64:aload_0         
	//   36   65:iconst_1        
	//   37   66:putfield        #52  <Field boolean l>
	//   38   69:return          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          148
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #58  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #58  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((blx)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class blx>
	//   16   28:astore_1        
			return d == ((blx) (obj)).d && e == ((blx) (obj)).e && f == ((blx) (obj)).f && h == ((blx) (obj)).h && i == ((blx) (obj)).i && l == ((blx) (obj)).l && j == ((blx) (obj)).j && k == ((blx) (obj)).k && g == ((blx) (obj)).g && TextUtils.equals(((CharSequence) (null)), ((CharSequence) (null))) && TextUtils.equals(((CharSequence) (null)), ((CharSequence) (null)));
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field boolean d>
	//   19   33:aload_1         
	//   20   34:getfield        #36  <Field boolean d>
	//   21   37:icmpne          146
	//   22   40:aload_0         
	//   23   41:getfield        #38  <Field int e>
	//   24   44:aload_1         
	//   25   45:getfield        #38  <Field int e>
	//   26   48:icmpne          146
	//   27   51:aload_0         
	//   28   52:getfield        #40  <Field int f>
	//   29   55:aload_1         
	//   30   56:getfield        #40  <Field int f>
	//   31   59:icmpne          146
	//   32   62:aload_0         
	//   33   63:getfield        #44  <Field boolean h>
	//   34   66:aload_1         
	//   35   67:getfield        #44  <Field boolean h>
	//   36   70:icmpne          146
	//   37   73:aload_0         
	//   38   74:getfield        #46  <Field boolean i>
	//   39   77:aload_1         
	//   40   78:getfield        #46  <Field boolean i>
	//   41   81:icmpne          146
	//   42   84:aload_0         
	//   43   85:getfield        #52  <Field boolean l>
	//   44   88:aload_1         
	//   45   89:getfield        #52  <Field boolean l>
	//   46   92:icmpne          146
	//   47   95:aload_0         
	//   48   96:getfield        #48  <Field int j>
	//   49   99:aload_1         
	//   50  100:getfield        #48  <Field int j>
	//   51  103:icmpne          146
	//   52  106:aload_0         
	//   53  107:getfield        #50  <Field int k>
	//   54  110:aload_1         
	//   55  111:getfield        #50  <Field int k>
	//   56  114:icmpne          146
	//   57  117:aload_0         
	//   58  118:getfield        #42  <Field int g>
	//   59  121:aload_1         
	//   60  122:getfield        #42  <Field int g>
	//   61  125:icmpne          146
	//   62  128:aconst_null     
	//   63  129:aconst_null     
	//   64  130:invokestatic    #63  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   65  133:ifeq            146
	//   66  136:aconst_null     
	//   67  137:aconst_null     
	//   68  138:invokestatic    #63  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   69  141:ifeq            146
	//   70  144:iconst_1        
	//   71  145:ireturn         
	//   72  146:iconst_0        
	//   73  147:ireturn         
		} else
		{
			return false;
	//   74  148:iconst_0        
	//   75  149:ireturn         
		}
	}

	public final int hashCode()
	{
		throw new NullPointerException();
	//    0    0:new             #67  <Class NullPointerException>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void NullPointerException()>
	//    3    7:athrow          
	}

	public final String a;
	public final String b;
	public final boolean c;
	public final boolean d;
	public final int e;
	public final int f;
	public final int g;
	public final boolean h;
	public final boolean i;
	public final int j;
	public final int k;
	public final boolean l;
}

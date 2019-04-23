// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.SparseArray;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfp, bju, bnf, zzfs, 
//			bfm, bjv, bfu, bfw

public final class bjt
	implements bfp
{

	public bjt(bfm bfm1, zzfs zzfs1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = bfm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field bfm a>
		b = zzfs1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field zzfs b>
	//    8   14:aload_0         
	//    9   15:new             #31  <Class SparseArray>
	//   10   18:dup             
	//   11   19:invokespecial   #32  <Method void SparseArray()>
	//   12   22:putfield        #34  <Field SparseArray c>
	//   13   25:return          
	}

	public final bfw a(int i, int j)
	{
		bju bju2 = (bju)c.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field SparseArray c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #40  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #42  <Class bju>
	//    5   11:astore          5
		bju bju1 = bju2;
	//    6   13:aload           5
	//    7   15:astore          4
		if(bju2 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       74
		{
			boolean flag;
			if(g == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #44  <Field zzfs[] g>
	//*  12   26:ifnonnull       34
				flag = true;
	//   13   29:iconst_1        
	//   14   30:istore_3        
			else
	//*  15   31:goto            36
				flag = false;
	//   16   34:iconst_0        
	//   17   35:istore_3        
			bnf.b(flag);
	//   18   36:iload_3         
	//   19   37:invokestatic    #49  <Method void bnf.b(boolean)>
			bju1 = new bju(i, j, b);
	//   20   40:new             #42  <Class bju>
	//   21   43:dup             
	//   22   44:iload_1         
	//   23   45:iload_2         
	//   24   46:aload_0         
	//   25   47:getfield        #29  <Field zzfs b>
	//   26   50:invokespecial   #52  <Method void bju(int, int, zzfs)>
	//   27   53:astore          4
			bju1.a(e);
	//   28   55:aload           4
	//   29   57:aload_0         
	//   30   58:getfield        #54  <Field bjv e>
	//   31   61:invokevirtual   #57  <Method void bju.a(bjv)>
			c.put(i, ((Object) (bju1)));
	//   32   64:aload_0         
	//   33   65:getfield        #34  <Field SparseArray c>
	//   34   68:iload_1         
	//   35   69:aload           4
	//   36   71:invokevirtual   #61  <Method void SparseArray.put(int, Object)>
		}
		return ((bfw) (bju1));
	//   37   74:aload           4
	//   38   76:areturn         
	}

	public final void a()
	{
		zzfs azzfs[] = new zzfs[c.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field SparseArray c>
	//    2    4:invokevirtual   #65  <Method int SparseArray.size()>
	//    3    7:anewarray       zzfs[]
	//    4   10:astore_2        
		for(int i = 0; i < c.size(); i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_1        
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #34  <Field SparseArray c>
	//*  10   18:invokevirtual   #65  <Method int SparseArray.size()>
	//*  11   21:icmpge          48
			azzfs[i] = ((bju)c.valueAt(i)).a;
	//   12   24:aload_2         
	//   13   25:iload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #34  <Field SparseArray c>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #70  <Method Object SparseArray.valueAt(int)>
	//   18   34:checkcast       #42  <Class bju>
	//   19   37:getfield        #72  <Field zzfs bju.a>
	//   20   40:aastore         

	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_1        
	//*  25   45:goto            13
		g = azzfs;
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:putfield        #44  <Field zzfs[] g>
	//   29   53:return          
	}

	public final void a(bfu bfu)
	{
		f = bfu;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field bfu f>
	//    3    5:return          
	}

	public final void a(bjv bjv)
	{
		e = bjv;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field bjv e>
		if(!d)
	//*   3    5:aload_0         
	//*   4    6:getfield        #77  <Field boolean d>
	//*   5    9:ifne            28
		{
			a.a(((bfp) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field bfm a>
	//    8   16:aload_0         
	//    9   17:invokeinterface #82  <Method void bfm.a(bfp)>
			d = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #77  <Field boolean d>
			return;
	//   13   27:return          
		}
		a.a(0L, 0L);
	//   14   28:aload_0         
	//   15   29:getfield        #27  <Field bfm a>
	//   16   32:lconst_0        
	//   17   33:lconst_0        
	//   18   34:invokeinterface #85  <Method void bfm.a(long, long)>
		for(int i = 0; i < c.size(); i++)
	//*  19   39:iconst_0        
	//*  20   40:istore_2        
	//*  21   41:iload_2         
	//*  22   42:aload_0         
	//*  23   43:getfield        #34  <Field SparseArray c>
	//*  24   46:invokevirtual   #65  <Method int SparseArray.size()>
	//*  25   49:icmpge          74
			((bju)c.valueAt(i)).a(bjv);
	//   26   52:aload_0         
	//   27   53:getfield        #34  <Field SparseArray c>
	//   28   56:iload_2         
	//   29   57:invokevirtual   #70  <Method Object SparseArray.valueAt(int)>
	//   30   60:checkcast       #42  <Class bju>
	//   31   63:aload_1         
	//   32   64:invokevirtual   #57  <Method void bju.a(bjv)>

	//   33   67:iload_2         
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:istore_2        
	//*  37   71:goto            41
	//   38   74:return          
	}

	public final bfu b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field bfu f>
	//    2    4:areturn         
	}

	public final zzfs[] c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzfs[] g>
	//    2    4:areturn         
	}

	public final bfm a;
	private final zzfs b;
	private final SparseArray c = new SparseArray();
	private boolean d;
	private bjv e;
	private bfu f;
	private zzfs g[];
}

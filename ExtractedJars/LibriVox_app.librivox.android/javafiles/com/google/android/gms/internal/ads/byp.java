// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.o;
import com.google.android.gms.ads.q;
import com.google.android.gms.c.d;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bvw, kl, byr, bvz, 
//			bwk, zzwf, zv, bxc, 
//			aag, bvy, am, bwm, 
//			zzzw, bvn, bwd, bwj, 
//			bwb, bvp, byn, bvm, 
//			byg

public final class byp
{

	public byp(ViewGroup viewgroup, int i1)
	{
		this(viewgroup, ((AttributeSet) (null)), false, com.google.android.gms.internal.ads.bvw.a, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:getstatic       #45  <Field bvw com.google.android.gms.internal.ads.bvw.a>
	//    5    7:iload_2         
	//    6    8:invokespecial   #48  <Method void byp(ViewGroup, AttributeSet, boolean, bvw, int)>
	//    7   11:return          
	}

	private byp(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, bvw bvw1, int i1)
	{
		this(viewgroup, attributeset, flag, bvw1, ((bxc) (null)), i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:iload           5
	//    7    9:invokespecial   #52  <Method void byp(ViewGroup, AttributeSet, boolean, bvw, bxc, int)>
	//    8   12:return          
	}

	private byp(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, bvw bvw1, bxc bxc1, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		a = new kl();
	//    2    4:aload_0         
	//    3    5:new             #59  <Class kl>
	//    4    8:dup             
	//    5    9:invokespecial   #60  <Method void kl()>
	//    6   12:putfield        #62  <Field kl a>
		d = new o();
	//    7   15:aload_0         
	//    8   16:new             #64  <Class o>
	//    9   19:dup             
	//   10   20:invokespecial   #65  <Method void o()>
	//   11   23:putfield        #67  <Field o d>
		e = ((bwm) (new byr(this)));
	//   12   26:aload_0         
	//   13   27:new             #69  <Class byr>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #72  <Method void byr(byp)>
	//   17   35:putfield        #74  <Field bwm e>
		o = viewgroup;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:putfield        #76  <Field ViewGroup o>
		b = bvw1;
	//   21   43:aload_0         
	//   22   44:aload           4
	//   23   46:putfield        #78  <Field bvw b>
		k = null;
	//   24   49:aload_0         
	//   25   50:aconst_null     
	//   26   51:putfield        #80  <Field bxc k>
		c = new AtomicBoolean(false);
	//   27   54:aload_0         
	//   28   55:new             #82  <Class AtomicBoolean>
	//   29   58:dup             
	//   30   59:iconst_0        
	//   31   60:invokespecial   #85  <Method void AtomicBoolean(boolean)>
	//   32   63:putfield        #87  <Field AtomicBoolean c>
		p = i1;
	//   33   66:aload_0         
	//   34   67:iload           6
	//   35   69:putfield        #89  <Field int p>
		if(attributeset != null)
	//*  36   72:aload_2         
	//*  37   73:ifnull          197
		{
			bvw1 = ((bvw) (viewgroup.getContext()));
	//   38   76:aload_1         
	//   39   77:invokevirtual   #95  <Method Context ViewGroup.getContext()>
	//   40   80:astore          4
			try
			{
				attributeset = ((AttributeSet) (new bvz(((Context) (bvw1)), attributeset)));
	//   41   82:new             #97  <Class bvz>
	//   42   85:dup             
	//   43   86:aload           4
	//   44   88:aload_2         
	//   45   89:invokespecial   #100 <Method void bvz(Context, AttributeSet)>
	//   46   92:astore_2        
				h = ((bvz) (attributeset)).a(flag);
	//   47   93:aload_0         
	//   48   94:aload_2         
	//   49   95:iload_3         
	//   50   96:invokevirtual   #103 <Method f[] com.google.android.gms.internal.ads.bvz.a(boolean)>
	//   51   99:putfield        #105 <Field f[] h>
				n = ((bvz) (attributeset)).a();
	//   52  102:aload_0         
	//   53  103:aload_2         
	//   54  104:invokevirtual   #108 <Method String com.google.android.gms.internal.ads.bvz.a()>
	//   55  107:putfield        #110 <Field String n>
			}
	//*  56  110:aload_1         
	//*  57  111:invokevirtual   #114 <Method boolean ViewGroup.isInEditMode()>
	//*  58  114:ifeq            197
	//*  59  117:invokestatic    #119 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//*  60  120:astore_2        
	//*  61  121:aload_0         
	//*  62  122:getfield        #105 <Field f[] h>
	//*  63  125:iconst_0        
	//*  64  126:aaload          
	//*  65  127:astore          5
	//*  66  129:aload_0         
	//*  67  130:getfield        #89  <Field int p>
	//*  68  133:istore          6
	//*  69  135:new             #121 <Class zzwf>
	//*  70  138:dup             
	//*  71  139:aload           4
	//*  72  141:aload           5
	//*  73  143:invokespecial   #124 <Method void zzwf(Context, f)>
	//*  74  146:astore          4
	//*  75  148:aload           4
	//*  76  150:iload           6
	//*  77  152:invokestatic    #127 <Method boolean a(int)>
	//*  78  155:putfield        #129 <Field boolean zzwf.j>
	//*  79  158:aload_2         
	//*  80  159:aload_1         
	//*  81  160:aload           4
	//*  82  162:ldc1            #131 <String "Ads by Google">
	//*  83  164:invokevirtual   #136 <Method void com.google.android.gms.internal.ads.zv.a(ViewGroup, zzwf, String)>
	//*  84  167:return          
			// Misplaced declaration of an exception variable
			catch(AttributeSet attributeset)
	//*  85  168:astore_2        
			{
				com.google.android.gms.internal.ads.bwk.a().a(viewgroup, new zzwf(((Context) (bvw1)), f.a), ((IllegalArgumentException) (attributeset)).getMessage(), ((IllegalArgumentException) (attributeset)).getMessage());
	//   86  169:invokestatic    #119 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   87  172:aload_1         
	//   88  173:new             #121 <Class zzwf>
	//   89  176:dup             
	//   90  177:aload           4
	//   91  179:getstatic       #141 <Field f f.a>
	//   92  182:invokespecial   #124 <Method void zzwf(Context, f)>
	//   93  185:aload_2         
	//   94  186:invokevirtual   #144 <Method String IllegalArgumentException.getMessage()>
	//   95  189:aload_2         
	//   96  190:invokevirtual   #144 <Method String IllegalArgumentException.getMessage()>
	//   97  193:invokevirtual   #147 <Method void com.google.android.gms.internal.ads.zv.a(ViewGroup, zzwf, String, String)>
				return;
	//   98  196:return          
			}
			if(viewgroup.isInEditMode())
			{
				attributeset = ((AttributeSet) (com.google.android.gms.internal.ads.bwk.a()));
				bxc1 = ((bxc) (h[0]));
				i1 = p;
				bvw1 = ((bvw) (new zzwf(((Context) (bvw1)), ((f) (bxc1)))));
				bvw1.j = a(i1);
				((zv) (attributeset)).a(viewgroup, ((zzwf) (bvw1)), "Ads by Google");
				return;
			}
		}
	//   99  197:return          
	}

	static o a(byp byp1)
	{
		return byp1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field o d>
	//    2    4:areturn         
	}

	private static zzwf a(Context context, f af[], int i1)
	{
		context = ((Context) (new zzwf(context, af)));
	//    0    0:new             #121 <Class zzwf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #152 <Method void zzwf(Context, f[])>
	//    5    9:astore_0        
		context.j = a(i1);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #127 <Method boolean a(int)>
	//    9   15:putfield        #129 <Field boolean zzwf.j>
		return ((zzwf) (context));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	private static boolean a(int i1)
	{
		return i1 == 1;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:icmpne          7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public final void a()
	{
		try
		{
			if(k != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field bxc k>
	//*   2    4:ifnull          16
				k.j();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field bxc k>
	//    5   11:invokeinterface #158 <Method void bxc.j()>
			return;
	//    6   16:return          
		}
		catch(RemoteException remoteexception)
	//*   7   17:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   18:ldc1            #160 <String "#007 Could not call remote method.">
	//    9   20:aload_1         
	//   10   21:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   11   24:return          
	}

	public final void a(com.google.android.gms.ads.a.a a1)
	{
		bxc bxc1;
		i = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field com.google.android.gms.ads.a.a i>
		if(k == null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field bxc k>
	//    5    9:ifnull          40
		bxc1 = k;
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field bxc k>
	//    8   16:astore_2        
		if(a1 != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
			try
			{
				a1 = ((com.google.android.gms.ads.a.a) (new bvy(a1)));
	//   11   21:new             #170 <Class bvy>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #172 <Method void bvy(com.google.android.gms.ads.a.a)>
	//   15   29:astore_1        
			}
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokeinterface #175 <Method void com.google.android.gms.internal.ads.bxc.a(bxk)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.ads.a.a a1)
	//*  21   41:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (a1)));
	//   22   42:ldc1            #160 <String "#007 Could not call remote method.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   25   48:return          
			}
		else
			a1 = null;
	//   26   49:aconst_null     
	//   27   50:astore_1        
		bxc1.a(((bxk) (a1)));
	//*  28   51:goto            33
	}

	public final void a(c c1)
	{
		l = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field c l>
		bxc bxc1;
		if(k == null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field bxc k>
	//    5    9:ifnull          40
		bxc1 = k;
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field bxc k>
	//    8   16:astore_2        
		if(c1 != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
			try
			{
				c1 = ((c) (new am(c1)));
	//   11   21:new             #180 <Class am>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #182 <Method void am(c)>
	//   15   29:astore_1        
			}
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokeinterface #185 <Method void com.google.android.gms.internal.ads.bxc.a(aj)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(c c1)
	//*  21   41:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (c1)));
	//   22   42:ldc1            #160 <String "#007 Could not call remote method.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   25   48:return          
			}
		else
			c1 = null;
	//   26   49:aconst_null     
	//   27   50:astore_1        
		bxc1.a(((aj) (c1)));
	//*  28   51:goto            33
	}

	public final void a(a a1)
	{
		g = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #188 <Field a g>
		e.a(a1);
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field bwm e>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #192 <Method void com.google.android.gms.internal.ads.bwm.a(a)>
	//    7   13:return          
	}

	public final void a(i i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #195 <Field i j>
		bxc bxc1;
		if(k == null)
			break MISSING_BLOCK_LABEL_44;
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field bxc k>
	//    5    9:ifnull          44
		bxc1 = k;
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field bxc k>
	//    8   16:astore_2        
		if(j == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #195 <Field i j>
	//*  11   21:ifnonnull       29
		{
			i1 = null;
	//   12   24:aconst_null     
	//   13   25:astore_1        
			break MISSING_BLOCK_LABEL_37;
	//   14   26:goto            37
		}
		i1 = ((i) (j.a()));
	//   15   29:aload_0         
	//   16   30:getfield        #195 <Field i j>
	//   17   33:invokevirtual   #200 <Method bwl i.a()>
	//   18   36:astore_1        
		bxc1.a(((bxq) (i1)));
	//   19   37:aload_2         
	//   20   38:aload_1         
	//   21   39:invokeinterface #203 <Method void com.google.android.gms.internal.ads.bxc.a(bxq)>
		return;
	//   22   44:return          
		i1;
	//   23   45:astore_1        
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (i1)));
	//   24   46:ldc1            #160 <String "#007 Could not call remote method.">
	//   25   48:aload_1         
	//   26   49:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return;
	//   27   52:return          
	}

	public final void a(q q1)
	{
		m = q1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #206 <Field q m>
		bxc bxc1;
		try
		{
			if(k == null)
				break MISSING_BLOCK_LABEL_42;
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field bxc k>
	//    5    9:ifnull          42
			bxc1 = k;
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field bxc k>
	//    8   16:astore_2        
		}
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       26
	//*  11   21:aconst_null     
	//*  12   22:astore_1        
	//*  13   23:goto            35
	//*  14   26:new             #208 <Class zzzw>
	//*  15   29:dup             
	//*  16   30:aload_1         
	//*  17   31:invokespecial   #210 <Method void zzzw(q)>
	//*  18   34:astore_1        
	//*  19   35:aload_2         
	//*  20   36:aload_1         
	//*  21   37:invokeinterface #213 <Method void com.google.android.gms.internal.ads.bxc.a(zzzw)>
	//*  22   42:return          
		// Misplaced declaration of an exception variable
		catch(q q1)
	//*  23   43:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (q1)));
	//   24   44:ldc1            #160 <String "#007 Could not call remote method.">
	//   25   46:aload_1         
	//   26   47:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
			return;
	//   27   50:return          
		}
		if(q1 == null)
		{
			q1 = null;
			break MISSING_BLOCK_LABEL_35;
		}
		q1 = ((q) (new zzzw(q1)));
		bxc1.a(((zzzw) (q1)));
	}

	public final void a(bvm bvm)
	{
		bxc bxc1;
		f = bvm;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #216 <Field bvm f>
		if(k == null)
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field bxc k>
	//    5    9:ifnull          40
		bxc1 = k;
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field bxc k>
	//    8   16:astore_2        
		if(bvm != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
			try
			{
				bvm = ((bvm) (new bvn(bvm)));
	//   11   21:new             #218 <Class bvn>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #220 <Method void bvn(bvm)>
	//   15   29:astore_1        
			}
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:aload_1         
	//*  19   35:invokeinterface #223 <Method void com.google.android.gms.internal.ads.bxc.a(bwn)>
	//*  20   40:return          
			// Misplaced declaration of an exception variable
			catch(bvm bvm)
	//*  21   41:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (bvm)));
	//   22   42:ldc1            #160 <String "#007 Could not call remote method.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   25   48:return          
			}
		else
			bvm = null;
	//   26   49:aconst_null     
	//   27   50:astore_1        
		bxc1.a(((bwn) (bvm)));
	//*  28   51:goto            33
	}

	public final void a(byn byn1)
	{
		Object obj;
		zzwf zzwf1;
		if(k != null)
			break MISSING_BLOCK_LABEL_342;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field bxc k>
	//    2    4:ifnonnull       342
		if((h == null || n == null) && k == null)
			break MISSING_BLOCK_LABEL_331;
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field f[] h>
	//    5   11:ifnull          21
	//    6   14:aload_0         
	//    7   15:getfield        #110 <Field String n>
	//    8   18:ifnonnull       28
	//    9   21:aload_0         
	//   10   22:getfield        #80  <Field bxc k>
	//   11   25:ifnull          331
		obj = ((Object) (o.getContext()));
	//   12   28:aload_0         
	//   13   29:getfield        #76  <Field ViewGroup o>
	//   14   32:invokevirtual   #95  <Method Context ViewGroup.getContext()>
	//   15   35:astore_2        
		zzwf1 = a(((Context) (obj)), h, p);
	//   16   36:aload_2         
	//   17   37:aload_0         
	//   18   38:getfield        #105 <Field f[] h>
	//   19   41:aload_0         
	//   20   42:getfield        #89  <Field int p>
	//   21   45:invokestatic    #226 <Method zzwf a(Context, f[], int)>
	//   22   48:astore_3        
		if("search_v2".equals(((Object) (zzwf1.a))))
	//*  23   49:ldc1            #228 <String "search_v2">
	//*  24   51:aload_3         
	//*  25   52:getfield        #230 <Field String com.google.android.gms.internal.ads.zzwf.a>
	//*  26   55:invokevirtual   #236 <Method boolean String.equals(Object)>
	//*  27   58:ifeq            89
		{
			obj = ((Object) ((bxc)((bwj) (new bwd(bwk.b(), ((Context) (obj)), zzwf1, n))).a(((Context) (obj)), false)));
	//   28   61:new             #238 <Class bwd>
	//   29   64:dup             
	//   30   65:invokestatic    #241 <Method bwa bwk.b()>
	//   31   68:aload_2         
	//   32   69:aload_3         
	//   33   70:aload_0         
	//   34   71:getfield        #110 <Field String n>
	//   35   74:invokespecial   #244 <Method void bwd(bwa, Context, zzwf, String)>
	//   36   77:aload_2         
	//   37   78:iconst_0        
	//   38   79:invokevirtual   #249 <Method Object com.google.android.gms.internal.ads.bwj.a(Context, boolean)>
	//   39   82:checkcast       #156 <Class bxc>
	//   40   85:astore_2        
			break MISSING_BLOCK_LABEL_118;
	//   41   86:goto            118
		}
		obj = ((Object) ((bxc)((bwj) (new bwb(bwk.b(), ((Context) (obj)), zzwf1, n, ((km) (a))))).a(((Context) (obj)), false)));
	//   42   89:new             #251 <Class bwb>
	//   43   92:dup             
	//   44   93:invokestatic    #241 <Method bwa bwk.b()>
	//   45   96:aload_2         
	//   46   97:aload_3         
	//   47   98:aload_0         
	//   48   99:getfield        #110 <Field String n>
	//   49  102:aload_0         
	//   50  103:getfield        #62  <Field kl a>
	//   51  106:invokespecial   #254 <Method void bwb(bwa, Context, zzwf, String, km)>
	//   52  109:aload_2         
	//   53  110:iconst_0        
	//   54  111:invokevirtual   #249 <Method Object com.google.android.gms.internal.ads.bwj.a(Context, boolean)>
	//   55  114:checkcast       #156 <Class bxc>
	//   56  117:astore_2        
		k = ((bxc) (obj));
	//   57  118:aload_0         
	//   58  119:aload_2         
	//   59  120:putfield        #80  <Field bxc k>
		k.a(((bwr) (new bvp(((a) (e))))));
	//   60  123:aload_0         
	//   61  124:getfield        #80  <Field bxc k>
	//   62  127:new             #256 <Class bvp>
	//   63  130:dup             
	//   64  131:aload_0         
	//   65  132:getfield        #74  <Field bwm e>
	//   66  135:invokespecial   #258 <Method void bvp(a)>
	//   67  138:invokeinterface #261 <Method void com.google.android.gms.internal.ads.bxc.a(bwr)>
		if(f != null)
	//*  68  143:aload_0         
	//*  69  144:getfield        #216 <Field bvm f>
	//*  70  147:ifnull          170
			k.a(((bwn) (new bvn(f))));
	//   71  150:aload_0         
	//   72  151:getfield        #80  <Field bxc k>
	//   73  154:new             #218 <Class bvn>
	//   74  157:dup             
	//   75  158:aload_0         
	//   76  159:getfield        #216 <Field bvm f>
	//   77  162:invokespecial   #220 <Method void bvn(bvm)>
	//   78  165:invokeinterface #223 <Method void com.google.android.gms.internal.ads.bxc.a(bwn)>
		if(i != null)
	//*  79  170:aload_0         
	//*  80  171:getfield        #168 <Field com.google.android.gms.ads.a.a i>
	//*  81  174:ifnull          197
			k.a(((bxk) (new bvy(i))));
	//   82  177:aload_0         
	//   83  178:getfield        #80  <Field bxc k>
	//   84  181:new             #170 <Class bvy>
	//   85  184:dup             
	//   86  185:aload_0         
	//   87  186:getfield        #168 <Field com.google.android.gms.ads.a.a i>
	//   88  189:invokespecial   #172 <Method void bvy(com.google.android.gms.ads.a.a)>
	//   89  192:invokeinterface #175 <Method void com.google.android.gms.internal.ads.bxc.a(bxk)>
		if(l != null)
	//*  90  197:aload_0         
	//*  91  198:getfield        #178 <Field c l>
	//*  92  201:ifnull          224
			k.a(((aj) (new am(l))));
	//   93  204:aload_0         
	//   94  205:getfield        #80  <Field bxc k>
	//   95  208:new             #180 <Class am>
	//   96  211:dup             
	//   97  212:aload_0         
	//   98  213:getfield        #178 <Field c l>
	//   99  216:invokespecial   #182 <Method void am(c)>
	//  100  219:invokeinterface #185 <Method void com.google.android.gms.internal.ads.bxc.a(aj)>
		if(j != null)
	//* 101  224:aload_0         
	//* 102  225:getfield        #195 <Field i j>
	//* 103  228:ifnull          247
			k.a(((bxq) (j.a())));
	//  104  231:aload_0         
	//  105  232:getfield        #80  <Field bxc k>
	//  106  235:aload_0         
	//  107  236:getfield        #195 <Field i j>
	//  108  239:invokevirtual   #200 <Method bwl i.a()>
	//  109  242:invokeinterface #203 <Method void com.google.android.gms.internal.ads.bxc.a(bxq)>
		if(m != null)
	//* 110  247:aload_0         
	//* 111  248:getfield        #206 <Field q m>
	//* 112  251:ifnull          274
			k.a(new zzzw(m));
	//  113  254:aload_0         
	//  114  255:getfield        #80  <Field bxc k>
	//  115  258:new             #208 <Class zzzw>
	//  116  261:dup             
	//  117  262:aload_0         
	//  118  263:getfield        #206 <Field q m>
	//  119  266:invokespecial   #210 <Method void zzzw(q)>
	//  120  269:invokeinterface #213 <Method void com.google.android.gms.internal.ads.bxc.a(zzzw)>
		k.b(q);
	//  121  274:aload_0         
	//  122  275:getfield        #80  <Field bxc k>
	//  123  278:aload_0         
	//  124  279:getfield        #263 <Field boolean q>
	//  125  282:invokeinterface #265 <Method void bxc.b(boolean)>
		obj = ((Object) (k.k()));
	//  126  287:aload_0         
	//  127  288:getfield        #80  <Field bxc k>
	//  128  291:invokeinterface #268 <Method com.google.android.gms.c.a bxc.k()>
	//  129  296:astore_2        
		if(obj != null)
	//* 130  297:aload_2         
	//* 131  298:ifnonnull       304
	//* 132  301:goto            342
			try
			{
				o.addView((View)com.google.android.gms.c.d.a(((com.google.android.gms.c.a) (obj))));
	//  133  304:aload_0         
	//  134  305:getfield        #76  <Field ViewGroup o>
	//  135  308:aload_2         
	//  136  309:invokestatic    #273 <Method Object d.a(com.google.android.gms.c.a)>
	//  137  312:checkcast       #275 <Class View>
	//  138  315:invokevirtual   #279 <Method void ViewGroup.addView(View)>
			}
	//* 139  318:goto            342
			catch(RemoteException remoteexception)
	//* 140  321:astore_2        
			{
				try
				{
					com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//  141  322:ldc1            #160 <String "#007 Could not call remote method.">
	//  142  324:aload_2         
	//  143  325:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				}
	//* 144  328:goto            342
	//* 145  331:new             #281 <Class IllegalStateException>
	//* 146  334:dup             
	//* 147  335:ldc2            #283 <String "The ad size and ad unit ID must be set before loadAd is called.">
	//* 148  338:invokespecial   #286 <Method void IllegalStateException(String)>
	//* 149  341:athrow          
	//* 150  342:aload_0         
	//* 151  343:getfield        #80  <Field bxc k>
	//* 152  346:aload_0         
	//* 153  347:getfield        #76  <Field ViewGroup o>
	//* 154  350:invokevirtual   #95  <Method Context ViewGroup.getContext()>
	//* 155  353:aload_1         
	//* 156  354:invokestatic    #289 <Method zzwb com.google.android.gms.internal.ads.bvw.a(Context, byn)>
	//* 157  357:invokeinterface #292 <Method boolean bxc.b(zzwb)>
	//* 158  362:ifeq            376
	//* 159  365:aload_0         
	//* 160  366:getfield        #62  <Field kl a>
	//* 161  369:aload_1         
	//* 162  370:invokevirtual   #297 <Method java.util.Map byn.j()>
	//* 163  373:invokevirtual   #300 <Method void com.google.android.gms.internal.ads.kl.a(java.util.Map)>
	//* 164  376:return          
				// Misplaced declaration of an exception variable
				catch(byn byn1)
	//* 165  377:astore_1        
				{
					com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (byn1)));
	//  166  378:ldc1            #160 <String "#007 Could not call remote method.">
	//  167  380:aload_1         
	//  168  381:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
					return;
	//  169  384:return          
				}
			}
		break MISSING_BLOCK_LABEL_342;
		throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
		if(k.b(com.google.android.gms.internal.ads.bvw.a(o.getContext(), byn1)))
			a.a(byn1.j());
		return;
	}

	public final void a(String s)
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field String n>
	//*   2    4:ifnonnull       13
		{
			n = s;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #110 <Field String n>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
	//    7   13:new             #281 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc2            #302 <String "The ad unit ID can only be set once on AdView.">
	//   10   20:invokespecial   #286 <Method void IllegalStateException(String)>
	//   11   23:athrow          
		}
	}

	public final void a(boolean flag)
	{
		q = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #263 <Field boolean q>
		try
		{
			if(k != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #80  <Field bxc k>
	//*   5    9:ifnull          25
				k.b(q);
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field bxc k>
	//    8   16:aload_0         
	//    9   17:getfield        #263 <Field boolean q>
	//   10   20:invokeinterface #265 <Method void bxc.b(boolean)>
			return;
	//   11   25:return          
		}
		catch(RemoteException remoteexception)
	//*  12   26:astore_2        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   13   27:ldc1            #160 <String "#007 Could not call remote method.">
	//   14   29:aload_2         
	//   15   30:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   16   33:return          
	}

	public final transient void a(f af[])
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field f[] h>
	//*   2    4:ifnonnull       13
		{
			b(af);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #305 <Method void b(f[])>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException("The ad size can only be set once on AdView.");
	//    7   13:new             #281 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc2            #307 <String "The ad size can only be set once on AdView.">
	//   10   20:invokespecial   #286 <Method void IllegalStateException(String)>
	//   11   23:athrow          
		}
	}

	public final a b()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field a g>
	//    2    4:areturn         
	}

	public final transient void b(f af[])
	{
		h = af;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field f[] h>
		try
		{
			if(k != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #80  <Field bxc k>
	//*   5    9:ifnull          49
				k.a(a(o.getContext(), h, p));
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field bxc k>
	//    8   16:aload_0         
	//    9   17:getfield        #76  <Field ViewGroup o>
	//   10   20:invokevirtual   #95  <Method Context ViewGroup.getContext()>
	//   11   23:aload_0         
	//   12   24:getfield        #105 <Field f[] h>
	//   13   27:aload_0         
	//   14   28:getfield        #89  <Field int p>
	//   15   31:invokestatic    #226 <Method zzwf a(Context, f[], int)>
	//   16   34:invokeinterface #311 <Method void com.google.android.gms.internal.ads.bxc.a(zzwf)>
		}
	//*  17   39:goto            49
		// Misplaced declaration of an exception variable
		catch(f af[])
	//*  18   42:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (af)));
	//   19   43:ldc1            #160 <String "#007 Could not call remote method.">
	//   20   45:aload_1         
	//   21   46:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
		o.requestLayout();
	//   22   49:aload_0         
	//   23   50:getfield        #76  <Field ViewGroup o>
	//   24   53:invokevirtual   #314 <Method void ViewGroup.requestLayout()>
	//   25   56:return          
	}

	public final f c()
	{
		Object obj;
		if(k == null)
			break MISSING_BLOCK_LABEL_35;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field bxc k>
	//    2    4:ifnull          35
		obj = ((Object) (k.l()));
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field bxc k>
	//    5   11:invokeinterface #318 <Method zzwf bxc.l()>
	//    6   16:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_35;
	//    7   17:aload_1         
	//    8   18:ifnull          35
		obj = ((Object) (((zzwf) (obj)).b()));
	//    9   21:aload_1         
	//   10   22:invokevirtual   #320 <Method f zzwf.b()>
	//   11   25:astore_1        
		return ((f) (obj));
	//   12   26:aload_1         
	//   13   27:areturn         
		RemoteException remoteexception;
		remoteexception;
	//   14   28:astore_1        
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   15   29:ldc1            #160 <String "#007 Could not call remote method.">
	//   16   31:aload_1         
	//   17   32:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		f af[] = h;
	//   18   35:aload_0         
	//   19   36:getfield        #105 <Field f[] h>
	//   20   39:astore_1        
		if(af != null)
	//*  21   40:aload_1         
	//*  22   41:ifnull          48
			return af[0];
	//   23   44:aload_1         
	//   24   45:iconst_0        
	//   25   46:aaload          
	//   26   47:areturn         
		else
			return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
	}

	public final f[] d()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field f[] h>
	//    2    4:areturn         
	}

	public final String e()
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field String n>
	//*   2    4:ifnonnull       36
		{
			bxc bxc1 = k;
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field bxc k>
	//    5   11:astore_1        
			if(bxc1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          36
				try
				{
					n = bxc1.D();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokeinterface #324 <Method String bxc.D()>
	//   11   23:putfield        #110 <Field String n>
				}
	//*  12   26:goto            36
				catch(RemoteException remoteexception)
	//*  13   29:astore_1        
				{
					com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   14   30:ldc1            #160 <String "#007 Could not call remote method.">
	//   15   32:aload_1         
	//   16   33:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				}
		}
		return n;
	//   17   36:aload_0         
	//   18   37:getfield        #110 <Field String n>
	//   19   40:areturn         
	}

	public final com.google.android.gms.ads.a.a f()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field com.google.android.gms.ads.a.a i>
	//    2    4:areturn         
	}

	public final c g()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field c l>
	//    2    4:areturn         
	}

	public final void h()
	{
		try
		{
			if(k != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field bxc k>
	//*   2    4:ifnull          16
				k.o();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field bxc k>
	//    5   11:invokeinterface #328 <Method void com.google.android.gms.internal.ads.bxc.o()>
			return;
	//    6   16:return          
		}
		catch(RemoteException remoteexception)
	//*   7   17:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   18:ldc1            #160 <String "#007 Could not call remote method.">
	//    9   20:aload_1         
	//   10   21:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   11   24:return          
	}

	public final void i()
	{
		try
		{
			if(k != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field bxc k>
	//*   2    4:ifnull          16
				k.p();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field bxc k>
	//    5   11:invokeinterface #330 <Method void bxc.p()>
			return;
	//    6   16:return          
		}
		catch(RemoteException remoteexception)
	//*   7   17:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    8   18:ldc1            #160 <String "#007 Could not call remote method.">
	//    9   20:aload_1         
	//   10   21:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   11   24:return          
	}

	public final String j()
	{
		String s;
		if(k == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field bxc k>
	//    2    4:ifnull          26
		s = k.q_();
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field bxc k>
	//    5   11:invokeinterface #333 <Method String bxc.q_()>
	//    6   16:astore_1        
		return s;
	//    7   17:aload_1         
	//    8   18:areturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_1        
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #160 <String "#007 Could not call remote method.">
	//   11   22:aload_1         
	//   12   23:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return null;
	//   13   26:aconst_null     
	//   14   27:areturn         
	}

	public final o k()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field o d>
	//    2    4:areturn         
	}

	public final byg l()
	{
		Object obj = ((Object) (k));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field bxc k>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			obj = ((Object) (((bxc) (obj)).t()));
	//    7   11:aload_1         
	//    8   12:invokeinterface #338 <Method byg bxc.t()>
	//    9   17:astore_1        
		}
	//*  10   18:aload_1         
	//*  11   19:areturn         
		catch(RemoteException remoteexception)
	//*  12   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   13   21:ldc1            #160 <String "#007 Could not call remote method.">
	//   14   23:aload_1         
	//   15   24:invokestatic    #165 <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
			return null;
	//   16   27:aconst_null     
	//   17   28:areturn         
		}
		return ((byg) (obj));
	}

	public final q m()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field q m>
	//    2    4:areturn         
	}

	private final kl a;
	private final bvw b;
	private final AtomicBoolean c;
	private final o d;
	private final bwm e;
	private bvm f;
	private a g;
	private f h[];
	private com.google.android.gms.ads.a.a i;
	private i j;
	private bxc k;
	private c l;
	private q m;
	private String n;
	private ViewGroup o;
	private int p;
	private boolean q;
}

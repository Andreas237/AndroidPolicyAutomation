// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.a.a.a:
//			d

public static final class d$s
	implements d$g
{

	private void a(int i1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
		{
			F = F | i1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #104 <Field int F>
	//    5    9:iload_1         
	//    6   10:ior             
	//    7   11:putfield        #104 <Field int F>
			return;
	//    8   14:return          
		} else
		{
			F = F & ~i1;
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #104 <Field int F>
	//   12   20:iload_1         
	//   13   21:iconst_m1       
	//   14   22:ixor            
	//   15   23:iand            
	//   16   24:putfield        #104 <Field int F>
			return;
	//   17   27:return          
		}
	}

	public d$d a(d$d d$d1)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #121 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void Bundle()>
	//    3    7:astore_2        
		if(!E.isEmpty())
	//*   4    8:aload_0         
	//*   5    9:getfield        #102 <Field ArrayList E>
	//*   6   12:invokevirtual   #178 <Method boolean ArrayList.isEmpty()>
	//*   7   15:ifne            52
			bundle.putParcelableArrayList("actions", android.a.a.a.d.a().e((d$a[])E.toArray(((Object []) (new d$a[E.size()])))));
	//    8   18:aload_2         
	//    9   19:ldc1            #40  <String "actions">
	//   10   21:invokestatic    #128 <Method d$k d.a()>
	//   11   24:aload_0         
	//   12   25:getfield        #102 <Field ArrayList E>
	//   13   28:aload_0         
	//   14   29:getfield        #102 <Field ArrayList E>
	//   15   32:invokevirtual   #182 <Method int ArrayList.size()>
	//   16   35:anewarray       d$a[]
	//   17   38:invokevirtual   #188 <Method Object[] ArrayList.toArray(Object[])>
	//   18   41:checkcast       #190 <Class d$a[]>
	//   19   44:invokeinterface #193 <Method ArrayList d$k.e(d$a[])>
	//   20   49:invokevirtual   #197 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		if(F != 1)
	//*  21   52:aload_0         
	//*  22   53:getfield        #104 <Field int F>
	//*  23   56:iconst_1        
	//*  24   57:icmpeq          70
			bundle.putInt("flags", F);
	//   25   60:aload_2         
	//   26   61:ldc1            #43  <String "flags">
	//   27   63:aload_0         
	//   28   64:getfield        #104 <Field int F>
	//   29   67:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		if(G != null)
	//*  30   70:aload_0         
	//*  31   71:getfield        #155 <Field PendingIntent G>
	//*  32   74:ifnull          87
			bundle.putParcelable("displayIntent", ((android.os.Parcelable) (G)));
	//   33   77:aload_2         
	//   34   78:ldc1            #46  <String "displayIntent">
	//   35   80:aload_0         
	//   36   81:getfield        #155 <Field PendingIntent G>
	//   37   84:invokevirtual   #205 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(!H.isEmpty())
	//*  38   87:aload_0         
	//*  39   88:getfield        #106 <Field ArrayList H>
	//*  40   91:invokevirtual   #178 <Method boolean ArrayList.isEmpty()>
	//*  41   94:ifne            123
			bundle.putParcelableArray("pages", (android.os.Parcelable[])H.toArray(((Object []) (new Notification[H.size()]))));
	//   42   97:aload_2         
	//   43   98:ldc1            #49  <String "pages">
	//   44  100:aload_0         
	//   45  101:getfield        #106 <Field ArrayList H>
	//   46  104:aload_0         
	//   47  105:getfield        #106 <Field ArrayList H>
	//   48  108:invokevirtual   #182 <Method int ArrayList.size()>
	//   49  111:anewarray       Notification[]
	//   50  114:invokevirtual   #188 <Method Object[] ArrayList.toArray(Object[])>
	//   51  117:checkcast       #209 <Class android.os.Parcelable[]>
	//   52  120:invokevirtual   #213 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(I != null)
	//*  53  123:aload_0         
	//*  54  124:getfield        #162 <Field Bitmap I>
	//*  55  127:ifnull          140
			bundle.putParcelable("background", ((android.os.Parcelable) (I)));
	//   56  130:aload_2         
	//   57  131:ldc1            #52  <String "background">
	//   58  133:aload_0         
	//   59  134:getfield        #162 <Field Bitmap I>
	//   60  137:invokevirtual   #205 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(J != 0)
	//*  61  140:aload_0         
	//*  62  141:getfield        #167 <Field int J>
	//*  63  144:ifeq            157
			bundle.putInt("contentIcon", J);
	//   64  147:aload_2         
	//   65  148:ldc1            #55  <String "contentIcon">
	//   66  150:aload_0         
	//   67  151:getfield        #167 <Field int J>
	//   68  154:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		if(K != 0x800005)
	//*  69  157:aload_0         
	//*  70  158:getfield        #108 <Field int K>
	//*  71  161:ldc1            #16  <Int 0x800005>
	//*  72  163:icmpeq          176
			bundle.putInt("contentIconGravity", K);
	//   73  166:aload_2         
	//   74  167:ldc1            #58  <String "contentIconGravity">
	//   75  169:aload_0         
	//   76  170:getfield        #108 <Field int K>
	//   77  173:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		if(L != -1)
	//*  78  176:aload_0         
	//*  79  177:getfield        #110 <Field int L>
	//*  80  180:iconst_m1       
	//*  81  181:icmpeq          194
			bundle.putInt("contentActionIndex", L);
	//   82  184:aload_2         
	//   83  185:ldc1            #61  <String "contentActionIndex">
	//   84  187:aload_0         
	//   85  188:getfield        #110 <Field int L>
	//   86  191:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		if(M != 0)
	//*  87  194:aload_0         
	//*  88  195:getfield        #112 <Field int M>
	//*  89  198:ifeq            211
			bundle.putInt("customSizePreset", M);
	//   90  201:aload_2         
	//   91  202:ldc1            #63  <String "customSizePreset">
	//   92  204:aload_0         
	//   93  205:getfield        #112 <Field int M>
	//   94  208:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		if(N != 0)
	//*  95  211:aload_0         
	//*  96  212:getfield        #169 <Field int N>
	//*  97  215:ifeq            228
			bundle.putInt("customContentHeight", N);
	//   98  218:aload_2         
	//   99  219:ldc1            #66  <String "customContentHeight">
	//  100  221:aload_0         
	//  101  222:getfield        #169 <Field int N>
	//  102  225:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		if(O != 80)
	//* 103  228:aload_0         
	//* 104  229:getfield        #114 <Field int O>
	//* 105  232:bipush          80
	//* 106  234:icmpeq          247
			bundle.putInt("gravity", O);
	//  107  237:aload_2         
	//  108  238:ldc1            #69  <String "gravity">
	//  109  240:aload_0         
	//  110  241:getfield        #114 <Field int O>
	//  111  244:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		if(P != 0)
	//* 112  247:aload_0         
	//* 113  248:getfield        #171 <Field int P>
	//* 114  251:ifeq            264
			bundle.putInt("hintScreenTimeout", P);
	//  115  254:aload_2         
	//  116  255:ldc1            #72  <String "hintScreenTimeout">
	//  117  257:aload_0         
	//  118  258:getfield        #171 <Field int P>
	//  119  261:invokevirtual   #201 <Method void Bundle.putInt(String, int)>
		d$d1.a().putBundle("android.wearable.EXTENSIONS", bundle);
	//  120  264:aload_1         
	//  121  265:invokevirtual   #218 <Method Bundle d$d.a()>
	//  122  268:ldc1            #37  <String "android.wearable.EXTENSIONS">
	//  123  270:aload_2         
	//  124  271:invokevirtual   #222 <Method void Bundle.putBundle(String, Bundle)>
		return d$d1;
	//  125  274:aload_1         
	//  126  275:areturn         
	}

	public d$s a()
	{
		d$s d$s1 = new d$s();
	//    0    0:new             #2   <Class d$s>
	//    1    3:dup             
	//    2    4:invokespecial   #224 <Method void d$s()>
	//    3    7:astore_1        
		d$s1.E = new ArrayList(((java.util.Collection) (E)));
	//    4    8:aload_1         
	//    5    9:new             #99  <Class ArrayList>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #102 <Field ArrayList E>
	//    9   17:invokespecial   #227 <Method void ArrayList(java.util.Collection)>
	//   10   20:putfield        #102 <Field ArrayList E>
		d$s1.F = F;
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #104 <Field int F>
	//   14   28:putfield        #104 <Field int F>
		d$s1.G = G;
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #155 <Field PendingIntent G>
	//   18   36:putfield        #155 <Field PendingIntent G>
		d$s1.H = new ArrayList(((java.util.Collection) (H)));
	//   19   39:aload_1         
	//   20   40:new             #99  <Class ArrayList>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:getfield        #106 <Field ArrayList H>
	//   24   48:invokespecial   #227 <Method void ArrayList(java.util.Collection)>
	//   25   51:putfield        #106 <Field ArrayList H>
		d$s1.I = I;
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #162 <Field Bitmap I>
	//   29   59:putfield        #162 <Field Bitmap I>
		d$s1.J = J;
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #167 <Field int J>
	//   33   67:putfield        #167 <Field int J>
		d$s1.K = K;
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #108 <Field int K>
	//   37   75:putfield        #108 <Field int K>
		d$s1.L = L;
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #110 <Field int L>
	//   41   83:putfield        #110 <Field int L>
		d$s1.M = M;
	//   42   86:aload_1         
	//   43   87:aload_0         
	//   44   88:getfield        #112 <Field int M>
	//   45   91:putfield        #112 <Field int M>
		d$s1.N = N;
	//   46   94:aload_1         
	//   47   95:aload_0         
	//   48   96:getfield        #169 <Field int N>
	//   49   99:putfield        #169 <Field int N>
		d$s1.O = O;
	//   50  102:aload_1         
	//   51  103:aload_0         
	//   52  104:getfield        #114 <Field int O>
	//   53  107:putfield        #114 <Field int O>
		d$s1.P = P;
	//   54  110:aload_1         
	//   55  111:aload_0         
	//   56  112:getfield        #171 <Field int P>
	//   57  115:putfield        #171 <Field int P>
		return d$s1;
	//   58  118:aload_1         
	//   59  119:areturn         
	}

	public d$s a(int i1)
	{
		J = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #167 <Field int J>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$s a(d$a d$a1)
	{
		E.add(((Object) (d$a1)));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList E>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #233 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public d$s a(Notification notification)
	{
		H.add(((Object) (notification)));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList H>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #233 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public d$s a(PendingIntent pendingintent)
	{
		G = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field PendingIntent G>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$s a(Bitmap bitmap)
	{
		I = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field Bitmap I>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$s a(List list)
	{
		E.addAll(((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList E>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #240 <Method boolean ArrayList.addAll(java.util.Collection)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public d$s a(boolean flag)
	{
		a(8, flag);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:invokespecial   #245 <Method void a(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public d$s b()
	{
		E.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList E>
	//    2    4:invokevirtual   #248 <Method void ArrayList.clear()>
		return this;
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public d$s b(int i1)
	{
		K = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field int K>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$s b(List list)
	{
		H.addAll(((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList H>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #240 <Method boolean ArrayList.addAll(java.util.Collection)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public d$s b(boolean flag)
	{
		a(1, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokespecial   #245 <Method void a(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public d$s c(int i1)
	{
		L = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #110 <Field int L>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$s c(boolean flag)
	{
		a(2, flag);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:invokespecial   #245 <Method void a(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public List c()
	{
		return ((List) (E));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList E>
	//    2    4:areturn         
	}

	public Object clone()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #255 <Method d$s a()>
	//    2    4:areturn         
	}

	public d$s d(int i1)
	{
		O = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field int O>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$s d(boolean flag)
	{
		a(4, flag);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iload_1         
	//    3    3:invokespecial   #245 <Method void a(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public PendingIntent d()
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field PendingIntent G>
	//    2    4:areturn         
	}

	public d$s e()
	{
		H.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList H>
	//    2    4:invokevirtual   #248 <Method void ArrayList.clear()>
		return this;
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public d$s e(int i1)
	{
		M = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field int M>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public d$s e(boolean flag)
	{
		a(16, flag);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:invokespecial   #245 <Method void a(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public d$s f(int i1)
	{
		N = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #169 <Field int N>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public List f()
	{
		return ((List) (H));
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ArrayList H>
	//    2    4:areturn         
	}

	public d$s g(int i1)
	{
		P = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #171 <Field int P>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Bitmap g()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field Bitmap I>
	//    2    4:areturn         
	}

	public int h()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field int J>
	//    2    4:ireturn         
	}

	public int i()
	{
		return K;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int K>
	//    2    4:ireturn         
	}

	public int j()
	{
		return L;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field int L>
	//    2    4:ireturn         
	}

	public int k()
	{
		return O;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int O>
	//    2    4:ireturn         
	}

	public int l()
	{
		return M;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int M>
	//    2    4:ireturn         
	}

	public int m()
	{
		return N;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field int N>
	//    2    4:ireturn         
	}

	public boolean n()
	{
		return (F & 8) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int F>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean o()
	{
		return (F & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int F>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean p()
	{
		return (F & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int F>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean q()
	{
		return (F & 4) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int F>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean r()
	{
		return (F & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int F>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public int s()
	{
		return P;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int P>
	//    2    4:ireturn         
	}

	private static final int A = 16;
	private static final int B = 1;
	private static final int C = 0x800005;
	private static final int D = 80;
	public static final int a = -1;
	public static final int b = 0;
	public static final int c = 1;
	public static final int d = 2;
	public static final int e = 3;
	public static final int f = 4;
	public static final int g = 5;
	public static final int h = 0;
	public static final int i = -1;
	private static final String j = "android.wearable.EXTENSIONS";
	private static final String k = "actions";
	private static final String l = "flags";
	private static final String m = "displayIntent";
	private static final String n = "pages";
	private static final String o = "background";
	private static final String p = "contentIcon";
	private static final String q = "contentIconGravity";
	private static final String r = "contentActionIndex";
	private static final String s = "customSizePreset";
	private static final String t = "customContentHeight";
	private static final String u = "gravity";
	private static final String v = "hintScreenTimeout";
	private static final int w = 1;
	private static final int x = 2;
	private static final int y = 4;
	private static final int z = 8;
	private ArrayList E;
	private int F;
	private PendingIntent G;
	private ArrayList H;
	private Bitmap I;
	private int J;
	private int K;
	private int L;
	private int M;
	private int N;
	private int O;
	private int P;

	public d$s()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		E = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #99  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #100 <Method void ArrayList()>
	//    6   12:putfield        #102 <Field ArrayList E>
		F = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #104 <Field int F>
		H = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #99  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #100 <Method void ArrayList()>
	//   14   28:putfield        #106 <Field ArrayList H>
		K = 0x800005;
	//   15   31:aload_0         
	//   16   32:ldc1            #16  <Int 0x800005>
	//   17   34:putfield        #108 <Field int K>
		L = -1;
	//   18   37:aload_0         
	//   19   38:iconst_m1       
	//   20   39:putfield        #110 <Field int L>
		M = 0;
	//   21   42:aload_0         
	//   22   43:iconst_0        
	//   23   44:putfield        #112 <Field int M>
		O = 80;
	//   24   47:aload_0         
	//   25   48:bipush          80
	//   26   50:putfield        #114 <Field int O>
	//   27   53:return          
	}

	public d$s(Notification notification)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		E = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #99  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #100 <Method void ArrayList()>
	//    6   12:putfield        #102 <Field ArrayList E>
		F = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #104 <Field int F>
		H = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #99  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #100 <Method void ArrayList()>
	//   14   28:putfield        #106 <Field ArrayList H>
		K = 0x800005;
	//   15   31:aload_0         
	//   16   32:ldc1            #16  <Int 0x800005>
	//   17   34:putfield        #108 <Field int K>
		L = -1;
	//   18   37:aload_0         
	//   19   38:iconst_m1       
	//   20   39:putfield        #110 <Field int L>
		M = 0;
	//   21   42:aload_0         
	//   22   43:iconst_0        
	//   23   44:putfield        #112 <Field int M>
		O = 80;
	//   24   47:aload_0         
	//   25   48:bipush          80
	//   26   50:putfield        #114 <Field int O>
		notification = ((Notification) (android.a.a.a.d.a(notification)));
	//   27   53:aload_1         
	//   28   54:invokestatic    #119 <Method Bundle d.a(Notification)>
	//   29   57:astore_1        
		if(notification != null)
	//*  30   58:aload_1         
	//*  31   59:ifnull          72
			notification = ((Notification) (((Bundle) (notification)).getBundle("android.wearable.EXTENSIONS")));
	//   32   62:aload_1         
	//   33   63:ldc1            #37  <String "android.wearable.EXTENSIONS">
	//   34   65:invokevirtual   #125 <Method Bundle Bundle.getBundle(String)>
	//   35   68:astore_1        
		else
	//*  36   69:goto            74
			notification = null;
	//   37   72:aconst_null     
	//   38   73:astore_1        
		if(notification != null)
	//*  39   74:aload_1         
	//*  40   75:ifnull          239
		{
			Object aobj[] = ((Object []) (android.a.a.a.d.a().a(((Bundle) (notification)).getParcelableArrayList("actions"))));
	//   41   78:invokestatic    #128 <Method d$k d.a()>
	//   42   81:aload_1         
	//   43   82:ldc1            #40  <String "actions">
	//   44   84:invokevirtual   #132 <Method ArrayList Bundle.getParcelableArrayList(String)>
	//   45   87:invokeinterface #137 <Method d$a[] d$k.a(ArrayList)>
	//   46   92:astore_2        
			if(aobj != null)
	//*  47   93:aload_2         
	//*  48   94:ifnull          106
				Collections.addAll(((java.util.Collection) (E)), aobj);
	//   49   97:aload_0         
	//   50   98:getfield        #102 <Field ArrayList E>
	//   51  101:aload_2         
	//   52  102:invokestatic    #143 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   53  105:pop             
			F = ((Bundle) (notification)).getInt("flags", 1);
	//   54  106:aload_0         
	//   55  107:aload_1         
	//   56  108:ldc1            #43  <String "flags">
	//   57  110:iconst_1        
	//   58  111:invokevirtual   #147 <Method int Bundle.getInt(String, int)>
	//   59  114:putfield        #104 <Field int F>
			G = (PendingIntent)((Bundle) (notification)).getParcelable("displayIntent");
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:ldc1            #46  <String "displayIntent">
	//   63  121:invokevirtual   #151 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   64  124:checkcast       #153 <Class PendingIntent>
	//   65  127:putfield        #155 <Field PendingIntent G>
			aobj = ((Object []) (android.a.a.a.d.a(((Bundle) (notification)), "pages")));
	//   66  130:aload_1         
	//   67  131:ldc1            #49  <String "pages">
	//   68  133:invokestatic    #158 <Method Notification[] d.a(Bundle, String)>
	//   69  136:astore_2        
			if(aobj != null)
	//*  70  137:aload_2         
	//*  71  138:ifnull          150
				Collections.addAll(((java.util.Collection) (H)), aobj);
	//   72  141:aload_0         
	//   73  142:getfield        #106 <Field ArrayList H>
	//   74  145:aload_2         
	//   75  146:invokestatic    #143 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   76  149:pop             
			I = (Bitmap)((Bundle) (notification)).getParcelable("background");
	//   77  150:aload_0         
	//   78  151:aload_1         
	//   79  152:ldc1            #52  <String "background">
	//   80  154:invokevirtual   #151 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   81  157:checkcast       #160 <Class Bitmap>
	//   82  160:putfield        #162 <Field Bitmap I>
			J = ((Bundle) (notification)).getInt("contentIcon");
	//   83  163:aload_0         
	//   84  164:aload_1         
	//   85  165:ldc1            #55  <String "contentIcon">
	//   86  167:invokevirtual   #165 <Method int Bundle.getInt(String)>
	//   87  170:putfield        #167 <Field int J>
			K = ((Bundle) (notification)).getInt("contentIconGravity", 0x800005);
	//   88  173:aload_0         
	//   89  174:aload_1         
	//   90  175:ldc1            #58  <String "contentIconGravity">
	//   91  177:ldc1            #16  <Int 0x800005>
	//   92  179:invokevirtual   #147 <Method int Bundle.getInt(String, int)>
	//   93  182:putfield        #108 <Field int K>
			L = ((Bundle) (notification)).getInt("contentActionIndex", -1);
	//   94  185:aload_0         
	//   95  186:aload_1         
	//   96  187:ldc1            #61  <String "contentActionIndex">
	//   97  189:iconst_m1       
	//   98  190:invokevirtual   #147 <Method int Bundle.getInt(String, int)>
	//   99  193:putfield        #110 <Field int L>
			M = ((Bundle) (notification)).getInt("customSizePreset", 0);
	//  100  196:aload_0         
	//  101  197:aload_1         
	//  102  198:ldc1            #63  <String "customSizePreset">
	//  103  200:iconst_0        
	//  104  201:invokevirtual   #147 <Method int Bundle.getInt(String, int)>
	//  105  204:putfield        #112 <Field int M>
			N = ((Bundle) (notification)).getInt("customContentHeight");
	//  106  207:aload_0         
	//  107  208:aload_1         
	//  108  209:ldc1            #66  <String "customContentHeight">
	//  109  211:invokevirtual   #165 <Method int Bundle.getInt(String)>
	//  110  214:putfield        #169 <Field int N>
			O = ((Bundle) (notification)).getInt("gravity", 80);
	//  111  217:aload_0         
	//  112  218:aload_1         
	//  113  219:ldc1            #69  <String "gravity">
	//  114  221:bipush          80
	//  115  223:invokevirtual   #147 <Method int Bundle.getInt(String, int)>
	//  116  226:putfield        #114 <Field int O>
			P = ((Bundle) (notification)).getInt("hintScreenTimeout");
	//  117  229:aload_0         
	//  118  230:aload_1         
	//  119  231:ldc1            #72  <String "hintScreenTimeout">
	//  120  233:invokevirtual   #165 <Method int Bundle.getInt(String)>
	//  121  236:putfield        #171 <Field int P>
		}
	//  122  239:return          
	}
}

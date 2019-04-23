// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, ux, va, bck, 
//			zzawd

public abstract class uz extends bcj
	implements ux
{

	public uz()
	{
		super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static ux a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof ux)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class ux>
	//*  10   19:ifeq            27
			return (ux)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ux>
	//   13   26:areturn         
		else
			return ((ux) (new va(ibinder)));
	//   14   27:new             #24  <Class va>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void va(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 241
	//	               2 223
	//	               3 209
	//	               4 195
	//	               5 181
	//	               6 167
	//	               7 143
	//	               8 129
	//	               9 111
	//	               10 97
	//	               11 83
	//	               12 66
		default:
			return false;
	//    2   64:iconst_0        
	//    3   65:ireturn         

		case 12: // '\f'
			a((Bundle)bck.a(parcel, Bundle.CREATOR));
	//    4   66:aload_0         
	//    5   67:aload_2         
	//    6   68:getstatic       #35  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    7   71:invokestatic    #40  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//    8   74:checkcast       #31  <Class Bundle>
	//    9   77:invokevirtual   #43  <Method void a(Bundle)>
			break;

	//*  10   80:goto            252
		case 11: // '\013'
			h(b.a(parcel.readStrongBinder()));
	//   11   83:aload_0         
	//   12   84:aload_2         
	//   13   85:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   14   88:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   15   91:invokevirtual   #58  <Method void h(com.google.android.gms.c.a)>
			break;

	//*  16   94:goto            252
		case 10: // '\n'
			g(b.a(parcel.readStrongBinder()));
	//   17   97:aload_0         
	//   18   98:aload_2         
	//   19   99:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   20  102:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   21  105:invokevirtual   #61  <Method void g(com.google.android.gms.c.a)>
			break;

	//*  22  108:goto            252
		case 9: // '\t'
			b(b.a(parcel.readStrongBinder()), parcel.readInt());
	//   23  111:aload_0         
	//   24  112:aload_2         
	//   25  113:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   26  116:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   27  119:aload_2         
	//   28  120:invokevirtual   #65  <Method int Parcel.readInt()>
	//   29  123:invokevirtual   #69  <Method void b(com.google.android.gms.c.a, int)>
			break;

	//*  30  126:goto            252
		case 8: // '\b'
			f(b.a(parcel.readStrongBinder()));
	//   31  129:aload_0         
	//   32  130:aload_2         
	//   33  131:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   34  134:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   35  137:invokevirtual   #72  <Method void f(com.google.android.gms.c.a)>
			break;

	//*  36  140:goto            252
		case 7: // '\007'
			a(b.a(parcel.readStrongBinder()), (zzawd)bck.a(parcel, zzawd.CREATOR));
	//   37  143:aload_0         
	//   38  144:aload_2         
	//   39  145:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   40  148:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   41  151:aload_2         
	//   42  152:getstatic       #75  <Field android.os.Parcelable$Creator zzawd.CREATOR>
	//   43  155:invokestatic    #40  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   44  158:checkcast       #74  <Class zzawd>
	//   45  161:invokevirtual   #78  <Method void a(com.google.android.gms.c.a, zzawd)>
			break;

	//*  46  164:goto            252
		case 6: // '\006'
			e(b.a(parcel.readStrongBinder()));
	//   47  167:aload_0         
	//   48  168:aload_2         
	//   49  169:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   50  172:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   51  175:invokevirtual   #81  <Method void e(com.google.android.gms.c.a)>
			break;

	//*  52  178:goto            252
		case 5: // '\005'
			d(b.a(parcel.readStrongBinder()));
	//   53  181:aload_0         
	//   54  182:aload_2         
	//   55  183:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   56  186:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   57  189:invokevirtual   #84  <Method void d(com.google.android.gms.c.a)>
			break;

	//*  58  192:goto            252
		case 4: // '\004'
			c(b.a(parcel.readStrongBinder()));
	//   59  195:aload_0         
	//   60  196:aload_2         
	//   61  197:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   62  200:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   63  203:invokevirtual   #87  <Method void c(com.google.android.gms.c.a)>
			break;

	//*  64  206:goto            252
		case 3: // '\003'
			b(b.a(parcel.readStrongBinder()));
	//   65  209:aload_0         
	//   66  210:aload_2         
	//   67  211:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   68  214:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   69  217:invokevirtual   #89  <Method void b(com.google.android.gms.c.a)>
			break;

	//*  70  220:goto            252
		case 2: // '\002'
			a(b.a(parcel.readStrongBinder()), parcel.readInt());
	//   71  223:aload_0         
	//   72  224:aload_2         
	//   73  225:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   74  228:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   75  231:aload_2         
	//   76  232:invokevirtual   #65  <Method int Parcel.readInt()>
	//   77  235:invokevirtual   #91  <Method void a(com.google.android.gms.c.a, int)>
			break;

	//*  78  238:goto            252
		case 1: // '\001'
			a(b.a(parcel.readStrongBinder()));
	//   79  241:aload_0         
	//   80  242:aload_2         
	//   81  243:invokevirtual   #49  <Method IBinder Parcel.readStrongBinder()>
	//   82  246:invokestatic    #54  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   83  249:invokevirtual   #93  <Method void a(com.google.android.gms.c.a)>
			break;
		}
		parcel1.writeNoException();
	//   84  252:aload_3         
	//   85  253:invokevirtual   #96  <Method void Parcel.writeNoException()>
		return true;
	//   86  256:iconst_1        
	//   87  257:ireturn         
	}
}

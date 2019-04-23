// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.*;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, nn, np, bck

public abstract class no extends bcj
	implements nn
{

	public no()
	{
		super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static nn a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof nn)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class nn>
	//*  10   19:ifeq            27
			return (nn)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class nn>
	//   13   26:areturn         
		else
			return ((nn) (new np(ibinder)));
	//   14   27:new             #24  <Class np>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void np(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 13: default 68
	//	               1 252
	//	               2 241
	//	               3 230
	//	               4 219
	//	               5 208
	//	               6 180
	//	               7 169
	//	               8 158
	//	               9 147
	//	               10 136
	//	               11 117
	//	               12 88
	//	               13 70
		default:
			return false;
	//    2   68:iconst_0        
	//    3   69:ireturn         

		case 13: // '\r'
			a(b.a(parcel.readStrongBinder()));
	//    4   70:aload_0         
	//    5   71:aload_2         
	//    6   72:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//    7   75:invokestatic    #40  <Method com.google.android.gms.c.a b.a(IBinder)>
	//    8   78:invokevirtual   #43  <Method void a(com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//    9   81:aload_3         
	//   10   82:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  11   85:goto            270
		case 12: // '\f'
			a(parcel.readInt(), parcel.readInt(), (Intent)bck.a(parcel, Intent.CREATOR));
	//   12   88:aload_0         
	//   13   89:aload_2         
	//   14   90:invokevirtual   #50  <Method int Parcel.readInt()>
	//   15   93:aload_2         
	//   16   94:invokevirtual   #50  <Method int Parcel.readInt()>
	//   17   97:aload_2         
	//   18   98:getstatic       #56  <Field android.os.Parcelable$Creator Intent.CREATOR>
	//   19  101:invokestatic    #61  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   20  104:checkcast       #52  <Class Intent>
	//   21  107:invokevirtual   #64  <Method void a(int, int, Intent)>
			parcel1.writeNoException();
	//   22  110:aload_3         
	//   23  111:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  24  114:goto            270
		case 11: // '\013'
			boolean flag = e();
	//   25  117:aload_0         
	//   26  118:invokevirtual   #68  <Method boolean e()>
	//   27  121:istore          5
			parcel1.writeNoException();
	//   28  123:aload_3         
	//   29  124:invokevirtual   #46  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag);
	//   30  127:aload_3         
	//   31  128:iload           5
	//   32  130:invokestatic    #71  <Method void bck.a(Parcel, boolean)>
			break;

	//*  33  133:goto            270
		case 10: // '\n'
			d();
	//   34  136:aload_0         
	//   35  137:invokevirtual   #74  <Method void d()>
			parcel1.writeNoException();
	//   36  140:aload_3         
	//   37  141:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  38  144:goto            270
		case 9: // '\t'
			l();
	//   39  147:aload_0         
	//   40  148:invokevirtual   #77  <Method void l()>
			parcel1.writeNoException();
	//   41  151:aload_3         
	//   42  152:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  43  155:goto            270
		case 8: // '\b'
			k();
	//   44  158:aload_0         
	//   45  159:invokevirtual   #80  <Method void k()>
			parcel1.writeNoException();
	//   46  162:aload_3         
	//   47  163:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  48  166:goto            270
		case 7: // '\007'
			j();
	//   49  169:aload_0         
	//   50  170:invokevirtual   #83  <Method void j()>
			parcel1.writeNoException();
	//   51  173:aload_3         
	//   52  174:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  53  177:goto            270
		case 6: // '\006'
			parcel = ((Parcel) ((Bundle)bck.a(parcel, Bundle.CREATOR)));
	//   54  180:aload_2         
	//   55  181:getstatic       #86  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   56  184:invokestatic    #61  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   57  187:checkcast       #85  <Class Bundle>
	//   58  190:astore_2        
			b(((Bundle) (parcel)));
	//   59  191:aload_0         
	//   60  192:aload_2         
	//   61  193:invokevirtual   #90  <Method void b(Bundle)>
			parcel1.writeNoException();
	//   62  196:aload_3         
	//   63  197:invokevirtual   #46  <Method void Parcel.writeNoException()>
			com.google.android.gms.internal.ads.bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//   64  200:aload_3         
	//   65  201:aload_2         
	//   66  202:invokestatic    #93  <Method void com.google.android.gms.internal.ads.bck.b(Parcel, android.os.Parcelable)>
			break;

	//*  67  205:goto            270
		case 5: // '\005'
			i();
	//   68  208:aload_0         
	//   69  209:invokevirtual   #96  <Method void i()>
			parcel1.writeNoException();
	//   70  212:aload_3         
	//   71  213:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  72  216:goto            270
		case 4: // '\004'
			h();
	//   73  219:aload_0         
	//   74  220:invokevirtual   #99  <Method void h()>
			parcel1.writeNoException();
	//   75  223:aload_3         
	//   76  224:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  77  227:goto            270
		case 3: // '\003'
			g();
	//   78  230:aload_0         
	//   79  231:invokevirtual   #102 <Method void g()>
			parcel1.writeNoException();
	//   80  234:aload_3         
	//   81  235:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  82  238:goto            270
		case 2: // '\002'
			f();
	//   83  241:aload_0         
	//   84  242:invokevirtual   #105 <Method void f()>
			parcel1.writeNoException();
	//   85  245:aload_3         
	//   86  246:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;

	//*  87  249:goto            270
		case 1: // '\001'
			a((Bundle)bck.a(parcel, Bundle.CREATOR));
	//   88  252:aload_0         
	//   89  253:aload_2         
	//   90  254:getstatic       #86  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   91  257:invokestatic    #61  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   92  260:checkcast       #85  <Class Bundle>
	//   93  263:invokevirtual   #107 <Method void a(Bundle)>
			parcel1.writeNoException();
	//   94  266:aload_3         
	//   95  267:invokevirtual   #46  <Method void Parcel.writeNoException()>
			break;
		}
		return true;
	//   96  270:iconst_1        
	//   97  271:ireturn         
	}
}

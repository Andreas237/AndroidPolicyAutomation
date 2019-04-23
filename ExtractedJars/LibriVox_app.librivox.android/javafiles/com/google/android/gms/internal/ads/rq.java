// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, rp, zzatb, bck, 
//			rv, rw, zzasi, rs, 
//			ru

public abstract class rq extends bcj
	implements rp
{

	public rq()
	{
		super("com.google.android.gms.ads.internal.request.IAdRequestService");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		zzatb zzatb2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
		switch(i)
	//*   6    9:iload_1         
		{
	//*   7   10:tableswitch     1 5: default 44
	//	               1 277
	//	               2 200
	//	               3 44
	//	               4 123
	//	               5 46
		case 3: // '\003'
		default:
			return false;
	//    8   44:iconst_0        
	//    9   45:ireturn         

		case 5: // '\005'
			zzatb2 = (zzatb)bck.a(parcel, zzatb.CREATOR);
	//   10   46:aload_2         
	//   11   47:getstatic       #22  <Field android.os.Parcelable$Creator zzatb.CREATOR>
	//   12   50:invokestatic    #28  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   13   53:checkcast       #18  <Class zzatb>
	//   14   56:astore          6
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   15   58:aload_2         
	//   16   59:invokevirtual   #34  <Method IBinder Parcel.readStrongBinder()>
	//   17   62:astore_2        
			if(parcel == null)
	//*  18   63:aload_2         
	//*  19   64:ifnonnull       73
			{
				parcel = ((Parcel) (obj));
	//   20   67:aload           5
	//   21   69:astore_2        
			} else
	//*  22   70:goto            109
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
	//   23   73:aload_2         
	//   24   74:ldc1            #36  <String "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener">
	//   25   76:invokeinterface #42  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   26   81:astore          5
				if(iinterface instanceof rv)
	//*  27   83:aload           5
	//*  28   85:instanceof      #44  <Class rv>
	//*  29   88:ifeq            100
					parcel = ((Parcel) ((rv)iinterface));
	//   30   91:aload           5
	//   31   93:checkcast       #44  <Class rv>
	//   32   96:astore_2        
				else
	//*  33   97:goto            109
					parcel = ((Parcel) (new rw(((IBinder) (parcel)))));
	//   34  100:new             #46  <Class rw>
	//   35  103:dup             
	//   36  104:aload_2         
	//   37  105:invokespecial   #49  <Method void rw(IBinder)>
	//   38  108:astore_2        
			}
			b(zzatb2, ((rv) (parcel)));
	//   39  109:aload_0         
	//   40  110:aload           6
	//   41  112:aload_2         
	//   42  113:invokevirtual   #53  <Method void b(zzatb, rv)>
			parcel1.writeNoException();
	//   43  116:aload_3         
	//   44  117:invokevirtual   #56  <Method void Parcel.writeNoException()>
			break;
	//   45  120:goto            301

		case 4: // '\004'
			zzatb zzatb1 = (zzatb)bck.a(parcel, zzatb.CREATOR);
	//   46  123:aload_2         
	//   47  124:getstatic       #22  <Field android.os.Parcelable$Creator zzatb.CREATOR>
	//   48  127:invokestatic    #28  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   49  130:checkcast       #18  <Class zzatb>
	//   50  133:astore          5
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   51  135:aload_2         
	//   52  136:invokevirtual   #34  <Method IBinder Parcel.readStrongBinder()>
	//   53  139:astore_2        
			if(parcel == null)
	//*  54  140:aload_2         
	//*  55  141:ifnonnull       150
			{
				parcel = ((Parcel) (zzatb2));
	//   56  144:aload           6
	//   57  146:astore_2        
			} else
	//*  58  147:goto            186
			{
				android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
	//   59  150:aload_2         
	//   60  151:ldc1            #36  <String "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener">
	//   61  153:invokeinterface #42  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   62  158:astore          6
				if(iinterface1 instanceof rv)
	//*  63  160:aload           6
	//*  64  162:instanceof      #44  <Class rv>
	//*  65  165:ifeq            177
					parcel = ((Parcel) ((rv)iinterface1));
	//   66  168:aload           6
	//   67  170:checkcast       #44  <Class rv>
	//   68  173:astore_2        
				else
	//*  69  174:goto            186
					parcel = ((Parcel) (new rw(((IBinder) (parcel)))));
	//   70  177:new             #46  <Class rw>
	//   71  180:dup             
	//   72  181:aload_2         
	//   73  182:invokespecial   #49  <Method void rw(IBinder)>
	//   74  185:astore_2        
			}
			a(zzatb1, ((rv) (parcel)));
	//   75  186:aload_0         
	//   76  187:aload           5
	//   77  189:aload_2         
	//   78  190:invokevirtual   #58  <Method void a(zzatb, rv)>
			parcel1.writeNoException();
	//   79  193:aload_3         
	//   80  194:invokevirtual   #56  <Method void Parcel.writeNoException()>
			break;
	//   81  197:goto            301

		case 2: // '\002'
			zzasi zzasi1 = (zzasi)bck.a(parcel, zzasi.CREATOR);
	//   82  200:aload_2         
	//   83  201:getstatic       #61  <Field android.os.Parcelable$Creator zzasi.CREATOR>
	//   84  204:invokestatic    #28  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   85  207:checkcast       #60  <Class zzasi>
	//   86  210:astore          5
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   87  212:aload_2         
	//   88  213:invokevirtual   #34  <Method IBinder Parcel.readStrongBinder()>
	//   89  216:astore_2        
			if(parcel == null)
	//*  90  217:aload_2         
	//*  91  218:ifnonnull       227
			{
				parcel = ((Parcel) (obj1));
	//   92  221:aload           7
	//   93  223:astore_2        
			} else
	//*  94  224:goto            263
			{
				android.os.IInterface iinterface2 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
	//   95  227:aload_2         
	//   96  228:ldc1            #63  <String "com.google.android.gms.ads.internal.request.IAdResponseListener">
	//   97  230:invokeinterface #42  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   98  235:astore          6
				if(iinterface2 instanceof rs)
	//*  99  237:aload           6
	//* 100  239:instanceof      #65  <Class rs>
	//* 101  242:ifeq            254
					parcel = ((Parcel) ((rs)iinterface2));
	//  102  245:aload           6
	//  103  247:checkcast       #65  <Class rs>
	//  104  250:astore_2        
				else
	//* 105  251:goto            263
					parcel = ((Parcel) (new ru(((IBinder) (parcel)))));
	//  106  254:new             #67  <Class ru>
	//  107  257:dup             
	//  108  258:aload_2         
	//  109  259:invokespecial   #68  <Method void ru(IBinder)>
	//  110  262:astore_2        
			}
			a(zzasi1, ((rs) (parcel)));
	//  111  263:aload_0         
	//  112  264:aload           5
	//  113  266:aload_2         
	//  114  267:invokevirtual   #71  <Method void a(zzasi, rs)>
			parcel1.writeNoException();
	//  115  270:aload_3         
	//  116  271:invokevirtual   #56  <Method void Parcel.writeNoException()>
			break;

	//* 117  274:goto            301
		case 1: // '\001'
			parcel = ((Parcel) (a((zzasi)bck.a(parcel, zzasi.CREATOR))));
	//  118  277:aload_0         
	//  119  278:aload_2         
	//  120  279:getstatic       #61  <Field android.os.Parcelable$Creator zzasi.CREATOR>
	//  121  282:invokestatic    #28  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  122  285:checkcast       #60  <Class zzasi>
	//  123  288:invokevirtual   #74  <Method zzasm a(zzasi)>
	//  124  291:astore_2        
			parcel1.writeNoException();
	//  125  292:aload_3         
	//  126  293:invokevirtual   #56  <Method void Parcel.writeNoException()>
			bck.b(parcel1, ((android.os.Parcelable) (parcel)));
	//  127  296:aload_3         
	//  128  297:aload_2         
	//  129  298:invokestatic    #77  <Method void bck.b(Parcel, android.os.Parcelable)>
			break;
		}
		return true;
	//  130  301:iconst_1        
	//  131  302:ireturn         
	}
}

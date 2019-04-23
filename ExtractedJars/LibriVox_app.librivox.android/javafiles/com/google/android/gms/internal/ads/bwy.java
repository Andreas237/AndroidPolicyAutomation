// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bwx, fh, zzafz, 
//			bck, dw, dt, zzwf, 
//			bxq, bxt, zzacp, dq, 
//			dn, dk, dh, bwr, 
//			bwt

public abstract class bwy extends bcj
	implements bwx
{

	public bwy()
	{
		super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Object obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		switch(i)
	//*   4    6:iload_1         
		{
	//*   5    7:tableswitch     1 14: default 76
	//	               1 396
	//	               2 333
	//	               3 315
	//	               4 297
	//	               5 268
	//	               6 247
	//	               7 184
	//	               8 156
	//	               9 135
	//	               10 117
	//	               11 76
	//	               12 76
	//	               13 96
	//	               14 78
		case 11: // '\013'
		case 12: // '\f'
		default:
			return false;
	//    6   76:iconst_0        
	//    7   77:ireturn         

		case 14: // '\016'
			a(fh.a(parcel.readStrongBinder()));
	//    8   78:aload_0         
	//    9   79:aload_2         
	//   10   80:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//   11   83:invokestatic    #28  <Method fg fh.a(IBinder)>
	//   12   86:invokevirtual   #31  <Method void a(fg)>
			parcel1.writeNoException();
	//   13   89:aload_3         
	//   14   90:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//   15   93:goto            410

		case 13: // '\r'
			a((zzafz)bck.a(parcel, zzafz.CREATOR));
	//   16   96:aload_0         
	//   17   97:aload_2         
	//   18   98:getstatic       #40  <Field android.os.Parcelable$Creator zzafz.CREATOR>
	//   19  101:invokestatic    #45  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   20  104:checkcast       #36  <Class zzafz>
	//   21  107:invokevirtual   #48  <Method void a(zzafz)>
			parcel1.writeNoException();
	//   22  110:aload_3         
	//   23  111:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//   24  114:goto            410

		case 10: // '\n'
			a(dw.a(parcel.readStrongBinder()));
	//   25  117:aload_0         
	//   26  118:aload_2         
	//   27  119:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//   28  122:invokestatic    #53  <Method dv dw.a(IBinder)>
	//   29  125:invokevirtual   #56  <Method void a(dv)>
			parcel1.writeNoException();
	//   30  128:aload_3         
	//   31  129:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//   32  132:goto            410

		case 9: // '\t'
			a((PublisherAdViewOptions)bck.a(parcel, PublisherAdViewOptions.CREATOR));
	//   33  135:aload_0         
	//   34  136:aload_2         
	//   35  137:getstatic       #59  <Field android.os.Parcelable$Creator PublisherAdViewOptions.CREATOR>
	//   36  140:invokestatic    #45  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   37  143:checkcast       #58  <Class PublisherAdViewOptions>
	//   38  146:invokevirtual   #62  <Method void a(PublisherAdViewOptions)>
			parcel1.writeNoException();
	//   39  149:aload_3         
	//   40  150:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//   41  153:goto            410

		case 8: // '\b'
			a(dt.a(parcel.readStrongBinder()), (zzwf)bck.a(parcel, zzwf.CREATOR));
	//   42  156:aload_0         
	//   43  157:aload_2         
	//   44  158:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//   45  161:invokestatic    #67  <Method ds dt.a(IBinder)>
	//   46  164:aload_2         
	//   47  165:getstatic       #70  <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//   48  168:invokestatic    #45  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   49  171:checkcast       #69  <Class zzwf>
	//   50  174:invokevirtual   #73  <Method void a(ds, zzwf)>
			parcel1.writeNoException();
	//   51  177:aload_3         
	//   52  178:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//   53  181:goto            410

		case 7: // '\007'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   54  184:aload_2         
	//   55  185:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//   56  188:astore_2        
			if(parcel == null)
	//*  57  189:aload_2         
	//*  58  190:ifnonnull       199
			{
				parcel = ((Parcel) (obj));
	//   59  193:aload           5
	//   60  195:astore_2        
			} else
	//*  61  196:goto            235
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
	//   62  199:aload_2         
	//   63  200:ldc1            #75  <String "com.google.android.gms.ads.internal.client.ICorrelationIdProvider">
	//   64  202:invokeinterface #81  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   65  207:astore          5
				if(iinterface instanceof bxq)
	//*  66  209:aload           5
	//*  67  211:instanceof      #83  <Class bxq>
	//*  68  214:ifeq            226
					parcel = ((Parcel) ((bxq)iinterface));
	//   69  217:aload           5
	//   70  219:checkcast       #83  <Class bxq>
	//   71  222:astore_2        
				else
	//*  72  223:goto            235
					parcel = ((Parcel) (new bxt(((IBinder) (parcel)))));
	//   73  226:new             #85  <Class bxt>
	//   74  229:dup             
	//   75  230:aload_2         
	//   76  231:invokespecial   #88  <Method void bxt(IBinder)>
	//   77  234:astore_2        
			}
			a(((bxq) (parcel)));
	//   78  235:aload_0         
	//   79  236:aload_2         
	//   80  237:invokevirtual   #91  <Method void a(bxq)>
			parcel1.writeNoException();
	//   81  240:aload_3         
	//   82  241:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//   83  244:goto            410

		case 6: // '\006'
			a((zzacp)bck.a(parcel, zzacp.CREATOR));
	//   84  247:aload_0         
	//   85  248:aload_2         
	//   86  249:getstatic       #94  <Field android.os.Parcelable$Creator zzacp.CREATOR>
	//   87  252:invokestatic    #45  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   88  255:checkcast       #93  <Class zzacp>
	//   89  258:invokevirtual   #97  <Method void a(zzacp)>
			parcel1.writeNoException();
	//   90  261:aload_3         
	//   91  262:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//   92  265:goto            410

		case 5: // '\005'
			a(parcel.readString(), dq.a(parcel.readStrongBinder()), dn.a(parcel.readStrongBinder()));
	//   93  268:aload_0         
	//   94  269:aload_2         
	//   95  270:invokevirtual   #101 <Method String Parcel.readString()>
	//   96  273:aload_2         
	//   97  274:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//   98  277:invokestatic    #106 <Method dp dq.a(IBinder)>
	//   99  280:aload_2         
	//  100  281:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//  101  284:invokestatic    #111 <Method dm dn.a(IBinder)>
	//  102  287:invokevirtual   #114 <Method void a(String, dp, dm)>
			parcel1.writeNoException();
	//  103  290:aload_3         
	//  104  291:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//  105  294:goto            410

		case 4: // '\004'
			a(dk.a(parcel.readStrongBinder()));
	//  106  297:aload_0         
	//  107  298:aload_2         
	//  108  299:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//  109  302:invokestatic    #119 <Method dj dk.a(IBinder)>
	//  110  305:invokevirtual   #122 <Method void a(dj)>
			parcel1.writeNoException();
	//  111  308:aload_3         
	//  112  309:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//  113  312:goto            410

		case 3: // '\003'
			a(dh.a(parcel.readStrongBinder()));
	//  114  315:aload_0         
	//  115  316:aload_2         
	//  116  317:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//  117  320:invokestatic    #127 <Method dg dh.a(IBinder)>
	//  118  323:invokevirtual   #130 <Method void a(dg)>
			parcel1.writeNoException();
	//  119  326:aload_3         
	//  120  327:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
	//  121  330:goto            410

		case 2: // '\002'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//  122  333:aload_2         
	//  123  334:invokevirtual   #22  <Method IBinder Parcel.readStrongBinder()>
	//  124  337:astore_2        
			if(parcel == null)
	//* 125  338:aload_2         
	//* 126  339:ifnonnull       348
			{
				parcel = ((Parcel) (obj1));
	//  127  342:aload           6
	//  128  344:astore_2        
			} else
	//* 129  345:goto            384
			{
				android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
	//  130  348:aload_2         
	//  131  349:ldc1            #132 <String "com.google.android.gms.ads.internal.client.IAdListener">
	//  132  351:invokeinterface #81  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  133  356:astore          5
				if(iinterface1 instanceof bwr)
	//* 134  358:aload           5
	//* 135  360:instanceof      #134 <Class bwr>
	//* 136  363:ifeq            375
					parcel = ((Parcel) ((bwr)iinterface1));
	//  137  366:aload           5
	//  138  368:checkcast       #134 <Class bwr>
	//  139  371:astore_2        
				else
	//* 140  372:goto            384
					parcel = ((Parcel) (new bwt(((IBinder) (parcel)))));
	//  141  375:new             #136 <Class bwt>
	//  142  378:dup             
	//  143  379:aload_2         
	//  144  380:invokespecial   #137 <Method void bwt(IBinder)>
	//  145  383:astore_2        
			}
			a(((bwr) (parcel)));
	//  146  384:aload_0         
	//  147  385:aload_2         
	//  148  386:invokevirtual   #140 <Method void a(bwr)>
			parcel1.writeNoException();
	//  149  389:aload_3         
	//  150  390:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//* 151  393:goto            410
		case 1: // '\001'
			parcel = ((Parcel) (a()));
	//  152  396:aload_0         
	//  153  397:invokevirtual   #143 <Method bwu a()>
	//  154  400:astore_2        
			parcel1.writeNoException();
	//  155  401:aload_3         
	//  156  402:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  157  405:aload_3         
	//  158  406:aload_2         
	//  159  407:invokestatic    #146 <Method void bck.a(Parcel, android.os.IInterface)>
			break;
		}
		return true;
	//  160  410:iconst_1        
	//  161  411:ireturn         
	}
}

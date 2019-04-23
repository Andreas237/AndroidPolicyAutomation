// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

// Referenced classes of package com.google.android.gms.dynamic:
//			IObjectWrapper

public interface IFragmentWrapper
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements IFragmentWrapper
	{

		public static IFragmentWrapper asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IFragmentWrapper)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IFragmentWrapper>
		//*  10   19:ifeq            27
				return (IFragmentWrapper)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IFragmentWrapper>
		//   13   26:areturn         
			else
				return ((IFragmentWrapper) (new zza(ibinder)));
		//   14   27:new             #9   <Class IFragmentWrapper$Stub$zza>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IFragmentWrapper$Stub$zza(IBinder)>
		//   18   35:areturn         
		}

		protected final boolean zza(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     2 27: default 120
		//		               2 571
		//		               3 554
		//		               4 537
		//		               5 520
		//		               6 503
		//		               7 484
		//		               8 467
		//		               9 450
		//		               10 433
		//		               11 414
		//		               12 397
		//		               13 378
		//		               14 359
		//		               15 340
		//		               16 321
		//		               17 302
		//		               18 283
		//		               19 264
		//		               20 246
		//		               21 231
		//		               22 216
		//		               23 201
		//		               24 186
		//		               25 165
		//		               26 140
		//		               27 122
			default:
				return false;
		//    2  120:iconst_0        
		//    3  121:ireturn         

			case 27: // '\033'
				zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
		//    4  122:aload_0         
		//    5  123:aload_2         
		//    6  124:invokevirtual   #38  <Method IBinder Parcel.readStrongBinder()>
		//    7  127:invokestatic    #43  <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
		//    8  130:invokevirtual   #47  <Method void zzb(IObjectWrapper)>
				parcel1.writeNoException();
		//    9  133:aload_3         
		//   10  134:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  11  137:goto            585
			case 26: // '\032'
				startActivityForResult((Intent)zzc.zza(parcel, Intent.CREATOR), parcel.readInt());
		//   12  140:aload_0         
		//   13  141:aload_2         
		//   14  142:getstatic       #56  <Field android.os.Parcelable$Creator Intent.CREATOR>
		//   15  145:invokestatic    #61  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   16  148:checkcast       #52  <Class Intent>
		//   17  151:aload_2         
		//   18  152:invokevirtual   #65  <Method int Parcel.readInt()>
		//   19  155:invokevirtual   #69  <Method void startActivityForResult(Intent, int)>
				parcel1.writeNoException();
		//   20  158:aload_3         
		//   21  159:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  22  162:goto            585
			case 25: // '\031'
				startActivity((Intent)zzc.zza(parcel, Intent.CREATOR));
		//   23  165:aload_0         
		//   24  166:aload_2         
		//   25  167:getstatic       #56  <Field android.os.Parcelable$Creator Intent.CREATOR>
		//   26  170:invokestatic    #61  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   27  173:checkcast       #52  <Class Intent>
		//   28  176:invokevirtual   #73  <Method void startActivity(Intent)>
				parcel1.writeNoException();
		//   29  179:aload_3         
		//   30  180:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  31  183:goto            585
			case 24: // '\030'
				setUserVisibleHint(zzc.zza(parcel));
		//   32  186:aload_0         
		//   33  187:aload_2         
		//   34  188:invokestatic    #76  <Method boolean zzc.zza(Parcel)>
		//   35  191:invokevirtual   #80  <Method void setUserVisibleHint(boolean)>
				parcel1.writeNoException();
		//   36  194:aload_3         
		//   37  195:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  38  198:goto            585
			case 23: // '\027'
				setRetainInstance(zzc.zza(parcel));
		//   39  201:aload_0         
		//   40  202:aload_2         
		//   41  203:invokestatic    #76  <Method boolean zzc.zza(Parcel)>
		//   42  206:invokevirtual   #83  <Method void setRetainInstance(boolean)>
				parcel1.writeNoException();
		//   43  209:aload_3         
		//   44  210:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  45  213:goto            585
			case 22: // '\026'
				setMenuVisibility(zzc.zza(parcel));
		//   46  216:aload_0         
		//   47  217:aload_2         
		//   48  218:invokestatic    #76  <Method boolean zzc.zza(Parcel)>
		//   49  221:invokevirtual   #86  <Method void setMenuVisibility(boolean)>
				parcel1.writeNoException();
		//   50  224:aload_3         
		//   51  225:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  52  228:goto            585
			case 21: // '\025'
				setHasOptionsMenu(zzc.zza(parcel));
		//   53  231:aload_0         
		//   54  232:aload_2         
		//   55  233:invokestatic    #76  <Method boolean zzc.zza(Parcel)>
		//   56  236:invokevirtual   #89  <Method void setHasOptionsMenu(boolean)>
				parcel1.writeNoException();
		//   57  239:aload_3         
		//   58  240:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  59  243:goto            585
			case 20: // '\024'
				zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
		//   60  246:aload_0         
		//   61  247:aload_2         
		//   62  248:invokevirtual   #38  <Method IBinder Parcel.readStrongBinder()>
		//   63  251:invokestatic    #43  <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
		//   64  254:invokevirtual   #91  <Method void zza(IObjectWrapper)>
				parcel1.writeNoException();
		//   65  257:aload_3         
		//   66  258:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;

		//*  67  261:goto            585
			case 19: // '\023'
				boolean flag = isVisible();
		//   68  264:aload_0         
		//   69  265:invokevirtual   #95  <Method boolean isVisible()>
		//   70  268:istore          5
				parcel1.writeNoException();
		//   71  270:aload_3         
		//   72  271:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag);
		//   73  274:aload_3         
		//   74  275:iload           5
		//   75  277:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//*  76  280:goto            585
			case 18: // '\022'
				boolean flag1 = isResumed();
		//   77  283:aload_0         
		//   78  284:invokevirtual   #102 <Method boolean isResumed()>
		//   79  287:istore          5
				parcel1.writeNoException();
		//   80  289:aload_3         
		//   81  290:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag1);
		//   82  293:aload_3         
		//   83  294:iload           5
		//   84  296:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//*  85  299:goto            585
			case 17: // '\021'
				boolean flag2 = isRemoving();
		//   86  302:aload_0         
		//   87  303:invokevirtual   #105 <Method boolean isRemoving()>
		//   88  306:istore          5
				parcel1.writeNoException();
		//   89  308:aload_3         
		//   90  309:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag2);
		//   91  312:aload_3         
		//   92  313:iload           5
		//   93  315:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//*  94  318:goto            585
			case 16: // '\020'
				boolean flag3 = isInLayout();
		//   95  321:aload_0         
		//   96  322:invokevirtual   #108 <Method boolean isInLayout()>
		//   97  325:istore          5
				parcel1.writeNoException();
		//   98  327:aload_3         
		//   99  328:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag3);
		//  100  331:aload_3         
		//  101  332:iload           5
		//  102  334:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//* 103  337:goto            585
			case 15: // '\017'
				boolean flag4 = isHidden();
		//  104  340:aload_0         
		//  105  341:invokevirtual   #111 <Method boolean isHidden()>
		//  106  344:istore          5
				parcel1.writeNoException();
		//  107  346:aload_3         
		//  108  347:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag4);
		//  109  350:aload_3         
		//  110  351:iload           5
		//  111  353:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//* 112  356:goto            585
			case 14: // '\016'
				boolean flag5 = isDetached();
		//  113  359:aload_0         
		//  114  360:invokevirtual   #114 <Method boolean isDetached()>
		//  115  363:istore          5
				parcel1.writeNoException();
		//  116  365:aload_3         
		//  117  366:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag5);
		//  118  369:aload_3         
		//  119  370:iload           5
		//  120  372:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//* 121  375:goto            585
			case 13: // '\r'
				boolean flag6 = isAdded();
		//  122  378:aload_0         
		//  123  379:invokevirtual   #117 <Method boolean isAdded()>
		//  124  382:istore          5
				parcel1.writeNoException();
		//  125  384:aload_3         
		//  126  385:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag6);
		//  127  388:aload_3         
		//  128  389:iload           5
		//  129  391:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//* 130  394:goto            585
			case 12: // '\f'
				parcel = ((Parcel) (zzai()));
		//  131  397:aload_0         
		//  132  398:invokevirtual   #121 <Method IObjectWrapper zzai()>
		//  133  401:astore_2        
				parcel1.writeNoException();
		//  134  402:aload_3         
		//  135  403:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.zza(parcel1, ((IInterface) (parcel)));
		//  136  406:aload_3         
		//  137  407:aload_2         
		//  138  408:invokestatic    #124 <Method void zzc.zza(Parcel, IInterface)>
				break;

		//* 139  411:goto            585
			case 11: // '\013'
				boolean flag7 = getUserVisibleHint();
		//  140  414:aload_0         
		//  141  415:invokevirtual   #127 <Method boolean getUserVisibleHint()>
		//  142  418:istore          5
				parcel1.writeNoException();
		//  143  420:aload_3         
		//  144  421:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag7);
		//  145  424:aload_3         
		//  146  425:iload           5
		//  147  427:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//* 148  430:goto            585
			case 10: // '\n'
				i = getTargetRequestCode();
		//  149  433:aload_0         
		//  150  434:invokevirtual   #130 <Method int getTargetRequestCode()>
		//  151  437:istore_1        
				parcel1.writeNoException();
		//  152  438:aload_3         
		//  153  439:invokevirtual   #50  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  154  442:aload_3         
		//  155  443:iload_1         
		//  156  444:invokevirtual   #134 <Method void Parcel.writeInt(int)>
				break;

		//* 157  447:goto            585
			case 9: // '\t'
				parcel = ((Parcel) (zzah()));
		//  158  450:aload_0         
		//  159  451:invokevirtual   #138 <Method IFragmentWrapper zzah()>
		//  160  454:astore_2        
				parcel1.writeNoException();
		//  161  455:aload_3         
		//  162  456:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.zza(parcel1, ((IInterface) (parcel)));
		//  163  459:aload_3         
		//  164  460:aload_2         
		//  165  461:invokestatic    #124 <Method void zzc.zza(Parcel, IInterface)>
				break;

		//* 166  464:goto            585
			case 8: // '\b'
				parcel = ((Parcel) (getTag()));
		//  167  467:aload_0         
		//  168  468:invokevirtual   #142 <Method String getTag()>
		//  169  471:astore_2        
				parcel1.writeNoException();
		//  170  472:aload_3         
		//  171  473:invokevirtual   #50  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  172  476:aload_3         
		//  173  477:aload_2         
		//  174  478:invokevirtual   #145 <Method void Parcel.writeString(String)>
				break;

		//* 175  481:goto            585
			case 7: // '\007'
				boolean flag8 = getRetainInstance();
		//  176  484:aload_0         
		//  177  485:invokevirtual   #148 <Method boolean getRetainInstance()>
		//  178  488:istore          5
				parcel1.writeNoException();
		//  179  490:aload_3         
		//  180  491:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.writeBoolean(parcel1, flag8);
		//  181  494:aload_3         
		//  182  495:iload           5
		//  183  497:invokestatic    #99  <Method void zzc.writeBoolean(Parcel, boolean)>
				break;

		//* 184  500:goto            585
			case 6: // '\006'
				parcel = ((Parcel) (zzag()));
		//  185  503:aload_0         
		//  186  504:invokevirtual   #151 <Method IObjectWrapper zzag()>
		//  187  507:astore_2        
				parcel1.writeNoException();
		//  188  508:aload_3         
		//  189  509:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.zza(parcel1, ((IInterface) (parcel)));
		//  190  512:aload_3         
		//  191  513:aload_2         
		//  192  514:invokestatic    #124 <Method void zzc.zza(Parcel, IInterface)>
				break;

		//* 193  517:goto            585
			case 5: // '\005'
				parcel = ((Parcel) (zzaf()));
		//  194  520:aload_0         
		//  195  521:invokevirtual   #154 <Method IFragmentWrapper zzaf()>
		//  196  524:astore_2        
				parcel1.writeNoException();
		//  197  525:aload_3         
		//  198  526:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.zza(parcel1, ((IInterface) (parcel)));
		//  199  529:aload_3         
		//  200  530:aload_2         
		//  201  531:invokestatic    #124 <Method void zzc.zza(Parcel, IInterface)>
				break;

		//* 202  534:goto            585
			case 4: // '\004'
				i = getId();
		//  203  537:aload_0         
		//  204  538:invokevirtual   #157 <Method int getId()>
		//  205  541:istore_1        
				parcel1.writeNoException();
		//  206  542:aload_3         
		//  207  543:invokevirtual   #50  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  208  546:aload_3         
		//  209  547:iload_1         
		//  210  548:invokevirtual   #134 <Method void Parcel.writeInt(int)>
				break;

		//* 211  551:goto            585
			case 3: // '\003'
				parcel = ((Parcel) (getArguments()));
		//  212  554:aload_0         
		//  213  555:invokevirtual   #161 <Method Bundle getArguments()>
		//  214  558:astore_2        
				parcel1.writeNoException();
		//  215  559:aload_3         
		//  216  560:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.zzb(parcel1, ((android.os.Parcelable) (parcel)));
		//  217  563:aload_3         
		//  218  564:aload_2         
		//  219  565:invokestatic    #164 <Method void zzc.zzb(Parcel, android.os.Parcelable)>
				break;

		//* 220  568:goto            585
			case 2: // '\002'
				parcel = ((Parcel) (zzae()));
		//  221  571:aload_0         
		//  222  572:invokevirtual   #167 <Method IObjectWrapper zzae()>
		//  223  575:astore_2        
				parcel1.writeNoException();
		//  224  576:aload_3         
		//  225  577:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.zza(parcel1, ((IInterface) (parcel)));
		//  226  580:aload_3         
		//  227  581:aload_2         
		//  228  582:invokestatic    #124 <Method void zzc.zza(Parcel, IInterface)>
				break;
			}
			return true;
		//  229  585:iconst_1        
		//  230  586:ireturn         
		}

		public Stub()
		{
			super("com.google.android.gms.dynamic.IFragmentWrapper");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static final class Stub.zza extends com.google.android.gms.internal.common.zza
		implements IFragmentWrapper
	{

		public final Bundle getArguments()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(3, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5    9:astore_1        
			Bundle bundle = (Bundle)zzc.zza(parcel, Bundle.CREATOR);
		//    6   10:aload_1         
		//    7   11:getstatic       #34  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//    8   14:invokestatic    #39  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//    9   17:checkcast       #30  <Class Bundle>
		//   10   20:astore_2        
			parcel.recycle();
		//   11   21:aload_1         
		//   12   22:invokevirtual   #45  <Method void Parcel.recycle()>
			return bundle;
		//   13   25:aload_2         
		//   14   26:areturn         
		}

		public final int getId()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(4, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5    9:astore_2        
			int i = parcel.readInt();
		//    6   10:aload_2         
		//    7   11:invokevirtual   #51  <Method int Parcel.readInt()>
		//    8   14:istore_1        
			parcel.recycle();
		//    9   15:aload_2         
		//   10   16:invokevirtual   #45  <Method void Parcel.recycle()>
			return i;
		//   11   19:iload_1         
		//   12   20:ireturn         
		}

		public final boolean getRetainInstance()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(7, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          7
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final String getTag()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(8, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_1        
			String s = parcel.readString();
		//    6   11:aload_1         
		//    7   12:invokevirtual   #61  <Method String Parcel.readString()>
		//    8   15:astore_2        
			parcel.recycle();
		//    9   16:aload_1         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return s;
		//   11   20:aload_2         
		//   12   21:areturn         
		}

		public final int getTargetRequestCode()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(10, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			int i = parcel.readInt();
		//    6   11:aload_2         
		//    7   12:invokevirtual   #51  <Method int Parcel.readInt()>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return i;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean getUserVisibleHint()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(11, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          11
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean isAdded()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(13, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          13
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean isDetached()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(14, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          14
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean isHidden()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(15, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          15
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean isInLayout()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(16, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean isRemoving()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(17, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          17
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean isResumed()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(18, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          18
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final boolean isVisible()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(19, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          19
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_2        
			boolean flag = zzc.zza(parcel);
		//    6   11:aload_2         
		//    7   12:invokestatic    #56  <Method boolean zzc.zza(Parcel)>
		//    8   15:istore_1        
			parcel.recycle();
		//    9   16:aload_2         
		//   10   17:invokevirtual   #45  <Method void Parcel.recycle()>
			return flag;
		//   11   20:iload_1         
		//   12   21:ireturn         
		}

		public final void setHasOptionsMenu(boolean flag)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #76  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(21, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          21
		//    8   13:aload_2         
		//    9   14:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void setMenuVisibility(boolean flag)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #76  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(22, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          22
		//    8   13:aload_2         
		//    9   14:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void setRetainInstance(boolean flag)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #76  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(23, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          23
		//    8   13:aload_2         
		//    9   14:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void setUserVisibleHint(boolean flag)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.writeBoolean(parcel, flag);
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokestatic    #76  <Method void zzc.writeBoolean(Parcel, boolean)>
			((com.google.android.gms.internal.common.zza)this).zzb(24, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          24
		//    8   13:aload_2         
		//    9   14:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void startActivity(Intent intent)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((android.os.Parcelable) (intent)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #88  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			((com.google.android.gms.internal.common.zza)this).zzb(25, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          25
		//    8   13:aload_2         
		//    9   14:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final void startActivityForResult(Intent intent, int i)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_3        
			zzc.zza(parcel, ((android.os.Parcelable) (intent)));
		//    3    5:aload_3         
		//    4    6:aload_1         
		//    5    7:invokestatic    #88  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			parcel.writeInt(i);
		//    6   10:aload_3         
		//    7   11:iload_2         
		//    8   12:invokevirtual   #94  <Method void Parcel.writeInt(int)>
			((com.google.android.gms.internal.common.zza)this).zzb(26, parcel);
		//    9   15:aload_0         
		//   10   16:bipush          26
		//   11   18:aload_3         
		//   12   19:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   13   22:return          
		}

		public final void zza(IObjectWrapper iobjectwrapper)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((IInterface) (iobjectwrapper)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #98  <Method void zzc.zza(Parcel, IInterface)>
			((com.google.android.gms.internal.common.zza)this).zzb(20, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          20
		//    8   13:aload_2         
		//    9   14:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		public final IObjectWrapper zzae()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(2, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5    9:astore_1        
			IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
		//    6   10:aload_1         
		//    7   11:invokevirtual   #104 <Method IBinder Parcel.readStrongBinder()>
		//    8   14:invokestatic    #110 <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
		//    9   17:astore_2        
			parcel.recycle();
		//   10   18:aload_1         
		//   11   19:invokevirtual   #45  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   12   22:aload_2         
		//   13   23:areturn         
		}

		public final IFragmentWrapper zzaf()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(5, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:iconst_5        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    6:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5    9:astore_1        
			IFragmentWrapper ifragmentwrapper = Stub.asInterface(parcel.readStrongBinder());
		//    6   10:aload_1         
		//    7   11:invokevirtual   #104 <Method IBinder Parcel.readStrongBinder()>
		//    8   14:invokestatic    #115 <Method IFragmentWrapper IFragmentWrapper$Stub.asInterface(IBinder)>
		//    9   17:astore_2        
			parcel.recycle();
		//   10   18:aload_1         
		//   11   19:invokevirtual   #45  <Method void Parcel.recycle()>
			return ifragmentwrapper;
		//   12   22:aload_2         
		//   13   23:areturn         
		}

		public final IObjectWrapper zzag()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(6, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          6
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_1        
			IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
		//    6   11:aload_1         
		//    7   12:invokevirtual   #104 <Method IBinder Parcel.readStrongBinder()>
		//    8   15:invokestatic    #110 <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
		//    9   18:astore_2        
			parcel.recycle();
		//   10   19:aload_1         
		//   11   20:invokevirtual   #45  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   12   23:aload_2         
		//   13   24:areturn         
		}

		public final IFragmentWrapper zzah()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(9, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          9
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_1        
			IFragmentWrapper ifragmentwrapper = Stub.asInterface(parcel.readStrongBinder());
		//    6   11:aload_1         
		//    7   12:invokevirtual   #104 <Method IBinder Parcel.readStrongBinder()>
		//    8   15:invokestatic    #115 <Method IFragmentWrapper IFragmentWrapper$Stub.asInterface(IBinder)>
		//    9   18:astore_2        
			parcel.recycle();
		//   10   19:aload_1         
		//   11   20:invokevirtual   #45  <Method void Parcel.recycle()>
			return ifragmentwrapper;
		//   12   23:aload_2         
		//   13   24:areturn         
		}

		public final IObjectWrapper zzai()
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza(12, ((com.google.android.gms.internal.common.zza)this).zza());
		//    0    0:aload_0         
		//    1    1:bipush          12
		//    2    3:aload_0         
		//    3    4:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    4    7:invokevirtual   #28  <Method Parcel com.google.android.gms.internal.common.zza.zza(int, Parcel)>
		//    5   10:astore_1        
			IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
		//    6   11:aload_1         
		//    7   12:invokevirtual   #104 <Method IBinder Parcel.readStrongBinder()>
		//    8   15:invokestatic    #110 <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
		//    9   18:astore_2        
			parcel.recycle();
		//   10   19:aload_1         
		//   11   20:invokevirtual   #45  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   12   23:aload_2         
		//   13   24:areturn         
		}

		public final void zzb(IObjectWrapper iobjectwrapper)
			throws RemoteException
		{
			Parcel parcel = ((com.google.android.gms.internal.common.zza)this).zza();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #25  <Method Parcel com.google.android.gms.internal.common.zza.zza()>
		//    2    4:astore_2        
			zzc.zza(parcel, ((IInterface) (iobjectwrapper)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #98  <Method void zzc.zza(Parcel, IInterface)>
			((com.google.android.gms.internal.common.zza)this).zzb(27, parcel);
		//    6   10:aload_0         
		//    7   11:bipush          27
		//    8   13:aload_2         
		//    9   14:invokevirtual   #80  <Method void com.google.android.gms.internal.common.zza.zzb(int, Parcel)>
		//   10   17:return          
		}

		Stub.zza(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.dynamic.IFragmentWrapper");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
		//    3    4:invokespecial   #17  <Method void com.google.android.gms.internal.common.zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract Bundle getArguments()
		throws RemoteException;

	public abstract int getId()
		throws RemoteException;

	public abstract boolean getRetainInstance()
		throws RemoteException;

	public abstract String getTag()
		throws RemoteException;

	public abstract int getTargetRequestCode()
		throws RemoteException;

	public abstract boolean getUserVisibleHint()
		throws RemoteException;

	public abstract boolean isAdded()
		throws RemoteException;

	public abstract boolean isDetached()
		throws RemoteException;

	public abstract boolean isHidden()
		throws RemoteException;

	public abstract boolean isInLayout()
		throws RemoteException;

	public abstract boolean isRemoving()
		throws RemoteException;

	public abstract boolean isResumed()
		throws RemoteException;

	public abstract boolean isVisible()
		throws RemoteException;

	public abstract void setHasOptionsMenu(boolean flag)
		throws RemoteException;

	public abstract void setMenuVisibility(boolean flag)
		throws RemoteException;

	public abstract void setRetainInstance(boolean flag)
		throws RemoteException;

	public abstract void setUserVisibleHint(boolean flag)
		throws RemoteException;

	public abstract void startActivity(Intent intent)
		throws RemoteException;

	public abstract void startActivityForResult(Intent intent, int i)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract IObjectWrapper zzae()
		throws RemoteException;

	public abstract IFragmentWrapper zzaf()
		throws RemoteException;

	public abstract IObjectWrapper zzag()
		throws RemoteException;

	public abstract IFragmentWrapper zzah()
		throws RemoteException;

	public abstract IObjectWrapper zzai()
		throws RemoteException;

	public abstract void zzb(IObjectWrapper iobjectwrapper)
		throws RemoteException;
}

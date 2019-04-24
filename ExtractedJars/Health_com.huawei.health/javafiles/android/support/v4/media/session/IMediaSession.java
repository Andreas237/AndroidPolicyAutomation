// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.*;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat, ParcelableVolumeInfo, IMediaControllerCallback

public interface IMediaSession
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IMediaSession
	{

		public static IMediaSession asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//    6    9:invokeinterface #120 <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IMediaSession))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IMediaSession>
		//*  12   23:ifeq            31
				return (IMediaSession)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IMediaSession>
		//   15   30:areturn         
			else
				return ((IMediaSession) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class IMediaSession$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #123 <Method void IMediaSession$Stub$Proxy(IBinder)>
		//   20   39:areturn         
		}

		public IBinder asBinder()
		{
			return ((IBinder) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    45: default 372
		//		               1: 383
		//		               2: 462
		//		               3: 523
		//		               4: 546
		//		               5: 569
		//		               6: 604
		//		               7: 626
		//		               8: 648
		//		               9: 688
		//		               10: 712
		//		               11: 752
		//		               12: 780
		//		               13: 1409
		//		               14: 1425
		//		               15: 1475
		//		               16: 1525
		//		               17: 1596
		//		               18: 1616
		//		               19: 1632
		//		               20: 1648
		//		               21: 1664
		//		               22: 1680
		//		               23: 1696
		//		               24: 1712
		//		               25: 1732
		//		               26: 1828
		//		               27: 808
		//		               28: 848
		//		               29: 888
		//		               30: 910
		//		               31: 950
		//		               32: 990
		//		               33: 1222
		//		               34: 1238
		//		               35: 1288
		//		               36: 1338
		//		               37: 1012
		//		               38: 1034
		//		               39: 1774
		//		               40: 1794
		//		               41: 1069
		//		               42: 1111
		//		               43: 1160
		//		               44: 1202
		//		               1598968902: 375
		//*   2  372:goto            1878
			case 1598968902: 
				parcel1.writeString("android.support.v4.media.session.IMediaSession");
		//    3  375:aload_3         
		//    4  376:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//    5  378:invokevirtual   #135 <Method void Parcel.writeString(String)>
				return true;
		//    6  381:iconst_1        
		//    7  382:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//    8  383:aload_2         
		//    9  384:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   10  386:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				String s5 = parcel.readString();
		//   11  389:aload_2         
		//   12  390:invokevirtual   #142 <Method String Parcel.readString()>
		//   13  393:astore          9
				Bundle bundle;
				if(parcel.readInt() != 0)
		//*  14  395:aload_2         
		//*  15  396:invokevirtual   #146 <Method int Parcel.readInt()>
		//*  16  399:ifeq            419
					bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
		//   17  402:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   18  405:aload_2         
		//   19  406:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   20  411:checkcast       #148 <Class Bundle>
		//   21  414:astore          8
				else
		//*  22  416:goto            422
					bundle = null;
		//   23  419:aconst_null     
		//   24  420:astore          8
				if(parcel.readInt() != 0)
		//*  25  422:aload_2         
		//*  26  423:invokevirtual   #146 <Method int Parcel.readInt()>
		//*  27  426:ifeq            445
					parcel = ((Parcel) ((MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel)));
		//   28  429:getstatic       #161 <Field android.os.Parcelable$Creator MediaSessionCompat$ResultReceiverWrapper.CREATOR>
		//   29  432:aload_2         
		//   30  433:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   31  438:checkcast       #160 <Class MediaSessionCompat$ResultReceiverWrapper>
		//   32  441:astore_2        
				else
		//*  33  442:goto            447
					parcel = null;
		//   34  445:aconst_null     
		//   35  446:astore_2        
				sendCommand(s5, bundle, ((MediaSessionCompat.ResultReceiverWrapper) (parcel)));
		//   36  447:aload_0         
		//   37  448:aload           9
		//   38  450:aload           8
		//   39  452:aload_2         
		//   40  453:invokevirtual   #165 <Method void sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
				parcel1.writeNoException();
		//   41  456:aload_3         
		//   42  457:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//   43  460:iconst_1        
		//   44  461:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   45  462:aload_2         
		//   46  463:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   47  465:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  48  468:aload_2         
		//*  49  469:invokevirtual   #146 <Method int Parcel.readInt()>
		//*  50  472:ifeq            491
					parcel = ((Parcel) ((KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel)));
		//   51  475:getstatic       #171 <Field android.os.Parcelable$Creator KeyEvent.CREATOR>
		//   52  478:aload_2         
		//   53  479:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   54  484:checkcast       #170 <Class KeyEvent>
		//   55  487:astore_2        
				else
		//*  56  488:goto            493
					parcel = null;
		//   57  491:aconst_null     
		//   58  492:astore_2        
				boolean flag = sendMediaButton(((KeyEvent) (parcel)));
		//   59  493:aload_0         
		//   60  494:aload_2         
		//   61  495:invokevirtual   #175 <Method boolean sendMediaButton(KeyEvent)>
		//   62  498:istore          5
				parcel1.writeNoException();
		//   63  500:aload_3         
		//   64  501:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(flag)
		//*  65  504:iload           5
		//*  66  506:ifeq            514
					i = 1;
		//   67  509:iconst_1        
		//   68  510:istore_1        
				else
		//*  69  511:goto            516
					i = 0;
		//   70  514:iconst_0        
		//   71  515:istore_1        
				parcel1.writeInt(i);
		//   72  516:aload_3         
		//   73  517:iload_1         
		//   74  518:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				return true;
		//   75  521:iconst_1        
		//   76  522:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   77  523:aload_2         
		//   78  524:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   79  526:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				registerCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
		//   80  529:aload_0         
		//   81  530:aload_2         
		//   82  531:invokevirtual   #182 <Method IBinder Parcel.readStrongBinder()>
		//   83  534:invokestatic    #187 <Method IMediaControllerCallback IMediaControllerCallback$Stub.asInterface(IBinder)>
		//   84  537:invokevirtual   #191 <Method void registerCallbackListener(IMediaControllerCallback)>
				parcel1.writeNoException();
		//   85  540:aload_3         
		//   86  541:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//   87  544:iconst_1        
		//   88  545:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   89  546:aload_2         
		//   90  547:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   91  549:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
		//   92  552:aload_0         
		//   93  553:aload_2         
		//   94  554:invokevirtual   #182 <Method IBinder Parcel.readStrongBinder()>
		//   95  557:invokestatic    #187 <Method IMediaControllerCallback IMediaControllerCallback$Stub.asInterface(IBinder)>
		//   96  560:invokevirtual   #194 <Method void unregisterCallbackListener(IMediaControllerCallback)>
				parcel1.writeNoException();
		//   97  563:aload_3         
		//   98  564:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//   99  567:iconst_1        
		//  100  568:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  101  569:aload_2         
		//  102  570:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  103  572:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				boolean flag1 = isTransportControlEnabled();
		//  104  575:aload_0         
		//  105  576:invokevirtual   #198 <Method boolean isTransportControlEnabled()>
		//  106  579:istore          5
				parcel1.writeNoException();
		//  107  581:aload_3         
		//  108  582:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(flag1)
		//* 109  585:iload           5
		//* 110  587:ifeq            595
					i = 1;
		//  111  590:iconst_1        
		//  112  591:istore_1        
				else
		//* 113  592:goto            597
					i = 0;
		//  114  595:iconst_0        
		//  115  596:istore_1        
				parcel1.writeInt(i);
		//  116  597:aload_3         
		//  117  598:iload_1         
		//  118  599:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				return true;
		//  119  602:iconst_1        
		//  120  603:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  121  604:aload_2         
		//  122  605:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  123  607:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPackageName()));
		//  124  610:aload_0         
		//  125  611:invokevirtual   #201 <Method String getPackageName()>
		//  126  614:astore_2        
				parcel1.writeNoException();
		//  127  615:aload_3         
		//  128  616:invokevirtual   #168 <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  129  619:aload_3         
		//  130  620:aload_2         
		//  131  621:invokevirtual   #135 <Method void Parcel.writeString(String)>
				return true;
		//  132  624:iconst_1        
		//  133  625:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  134  626:aload_2         
		//  135  627:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  136  629:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getTag()));
		//  137  632:aload_0         
		//  138  633:invokevirtual   #204 <Method String getTag()>
		//  139  636:astore_2        
				parcel1.writeNoException();
		//  140  637:aload_3         
		//  141  638:invokevirtual   #168 <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  142  641:aload_3         
		//  143  642:aload_2         
		//  144  643:invokevirtual   #135 <Method void Parcel.writeString(String)>
				return true;
		//  145  646:iconst_1        
		//  146  647:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  147  648:aload_2         
		//  148  649:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  149  651:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getLaunchPendingIntent()));
		//  150  654:aload_0         
		//  151  655:invokevirtual   #208 <Method PendingIntent getLaunchPendingIntent()>
		//  152  658:astore_2        
				parcel1.writeNoException();
		//  153  659:aload_3         
		//  154  660:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 155  663:aload_2         
		//* 156  664:ifnull          681
				{
					parcel1.writeInt(1);
		//  157  667:aload_3         
		//  158  668:iconst_1        
		//  159  669:invokevirtual   #179 <Method void Parcel.writeInt(int)>
					((PendingIntent) (parcel)).writeToParcel(parcel1, 1);
		//  160  672:aload_2         
		//  161  673:aload_3         
		//  162  674:iconst_1        
		//  163  675:invokevirtual   #214 <Method void PendingIntent.writeToParcel(Parcel, int)>
				} else
		//* 164  678:goto            686
				{
					parcel1.writeInt(0);
		//  165  681:aload_3         
		//  166  682:iconst_0        
		//  167  683:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  168  686:iconst_1        
		//  169  687:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  170  688:aload_2         
		//  171  689:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  172  691:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				long l = getFlags();
		//  173  694:aload_0         
		//  174  695:invokevirtual   #218 <Method long getFlags()>
		//  175  698:lstore          6
				parcel1.writeNoException();
		//  176  700:aload_3         
		//  177  701:invokevirtual   #168 <Method void Parcel.writeNoException()>
				parcel1.writeLong(l);
		//  178  704:aload_3         
		//  179  705:lload           6
		//  180  707:invokevirtual   #222 <Method void Parcel.writeLong(long)>
				return true;
		//  181  710:iconst_1        
		//  182  711:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  183  712:aload_2         
		//  184  713:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  185  715:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getVolumeAttributes()));
		//  186  718:aload_0         
		//  187  719:invokevirtual   #226 <Method ParcelableVolumeInfo getVolumeAttributes()>
		//  188  722:astore_2        
				parcel1.writeNoException();
		//  189  723:aload_3         
		//  190  724:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 191  727:aload_2         
		//* 192  728:ifnull          745
				{
					parcel1.writeInt(1);
		//  193  731:aload_3         
		//  194  732:iconst_1        
		//  195  733:invokevirtual   #179 <Method void Parcel.writeInt(int)>
					((ParcelableVolumeInfo) (parcel)).writeToParcel(parcel1, 1);
		//  196  736:aload_2         
		//  197  737:aload_3         
		//  198  738:iconst_1        
		//  199  739:invokevirtual   #229 <Method void ParcelableVolumeInfo.writeToParcel(Parcel, int)>
				} else
		//* 200  742:goto            750
				{
					parcel1.writeInt(0);
		//  201  745:aload_3         
		//  202  746:iconst_0        
		//  203  747:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  204  750:iconst_1        
		//  205  751:ireturn         

			case 11: // '\013'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  206  752:aload_2         
		//  207  753:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  208  755:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
		//  209  758:aload_0         
		//  210  759:aload_2         
		//  211  760:invokevirtual   #146 <Method int Parcel.readInt()>
		//  212  763:aload_2         
		//  213  764:invokevirtual   #146 <Method int Parcel.readInt()>
		//  214  767:aload_2         
		//  215  768:invokevirtual   #142 <Method String Parcel.readString()>
		//  216  771:invokevirtual   #233 <Method void adjustVolume(int, int, String)>
				parcel1.writeNoException();
		//  217  774:aload_3         
		//  218  775:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  219  778:iconst_1        
		//  220  779:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  221  780:aload_2         
		//  222  781:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  223  783:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
		//  224  786:aload_0         
		//  225  787:aload_2         
		//  226  788:invokevirtual   #146 <Method int Parcel.readInt()>
		//  227  791:aload_2         
		//  228  792:invokevirtual   #146 <Method int Parcel.readInt()>
		//  229  795:aload_2         
		//  230  796:invokevirtual   #142 <Method String Parcel.readString()>
		//  231  799:invokevirtual   #236 <Method void setVolumeTo(int, int, String)>
				parcel1.writeNoException();
		//  232  802:aload_3         
		//  233  803:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  234  806:iconst_1        
		//  235  807:ireturn         

			case 27: // '\033'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  236  808:aload_2         
		//  237  809:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  238  811:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getMetadata()));
		//  239  814:aload_0         
		//  240  815:invokevirtual   #240 <Method MediaMetadataCompat getMetadata()>
		//  241  818:astore_2        
				parcel1.writeNoException();
		//  242  819:aload_3         
		//  243  820:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 244  823:aload_2         
		//* 245  824:ifnull          841
				{
					parcel1.writeInt(1);
		//  246  827:aload_3         
		//  247  828:iconst_1        
		//  248  829:invokevirtual   #179 <Method void Parcel.writeInt(int)>
					((MediaMetadataCompat) (parcel)).writeToParcel(parcel1, 1);
		//  249  832:aload_2         
		//  250  833:aload_3         
		//  251  834:iconst_1        
		//  252  835:invokevirtual   #243 <Method void MediaMetadataCompat.writeToParcel(Parcel, int)>
				} else
		//* 253  838:goto            846
				{
					parcel1.writeInt(0);
		//  254  841:aload_3         
		//  255  842:iconst_0        
		//  256  843:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  257  846:iconst_1        
		//  258  847:ireturn         

			case 28: // '\034'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  259  848:aload_2         
		//  260  849:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  261  851:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPlaybackState()));
		//  262  854:aload_0         
		//  263  855:invokevirtual   #247 <Method PlaybackStateCompat getPlaybackState()>
		//  264  858:astore_2        
				parcel1.writeNoException();
		//  265  859:aload_3         
		//  266  860:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 267  863:aload_2         
		//* 268  864:ifnull          881
				{
					parcel1.writeInt(1);
		//  269  867:aload_3         
		//  270  868:iconst_1        
		//  271  869:invokevirtual   #179 <Method void Parcel.writeInt(int)>
					((PlaybackStateCompat) (parcel)).writeToParcel(parcel1, 1);
		//  272  872:aload_2         
		//  273  873:aload_3         
		//  274  874:iconst_1        
		//  275  875:invokevirtual   #250 <Method void PlaybackStateCompat.writeToParcel(Parcel, int)>
				} else
		//* 276  878:goto            886
				{
					parcel1.writeInt(0);
		//  277  881:aload_3         
		//  278  882:iconst_0        
		//  279  883:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  280  886:iconst_1        
		//  281  887:ireturn         

			case 29: // '\035'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  282  888:aload_2         
		//  283  889:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  284  891:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getQueue()));
		//  285  894:aload_0         
		//  286  895:invokevirtual   #254 <Method List getQueue()>
		//  287  898:astore_2        
				parcel1.writeNoException();
		//  288  899:aload_3         
		//  289  900:invokevirtual   #168 <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//  290  903:aload_3         
		//  291  904:aload_2         
		//  292  905:invokevirtual   #258 <Method void Parcel.writeTypedList(List)>
				return true;
		//  293  908:iconst_1        
		//  294  909:ireturn         

			case 30: // '\036'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  295  910:aload_2         
		//  296  911:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  297  913:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getQueueTitle()));
		//  298  916:aload_0         
		//  299  917:invokevirtual   #262 <Method CharSequence getQueueTitle()>
		//  300  920:astore_2        
				parcel1.writeNoException();
		//  301  921:aload_3         
		//  302  922:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 303  925:aload_2         
		//* 304  926:ifnull          943
				{
					parcel1.writeInt(1);
		//  305  929:aload_3         
		//  306  930:iconst_1        
		//  307  931:invokevirtual   #179 <Method void Parcel.writeInt(int)>
					TextUtils.writeToParcel(((CharSequence) (parcel)), parcel1, 1);
		//  308  934:aload_2         
		//  309  935:aload_3         
		//  310  936:iconst_1        
		//  311  937:invokestatic    #267 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
				} else
		//* 312  940:goto            948
				{
					parcel1.writeInt(0);
		//  313  943:aload_3         
		//  314  944:iconst_0        
		//  315  945:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  316  948:iconst_1        
		//  317  949:ireturn         

			case 31: // '\037'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  318  950:aload_2         
		//  319  951:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  320  953:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getExtras()));
		//  321  956:aload_0         
		//  322  957:invokevirtual   #271 <Method Bundle getExtras()>
		//  323  960:astore_2        
				parcel1.writeNoException();
		//  324  961:aload_3         
		//  325  962:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 326  965:aload_2         
		//* 327  966:ifnull          983
				{
					parcel1.writeInt(1);
		//  328  969:aload_3         
		//  329  970:iconst_1        
		//  330  971:invokevirtual   #179 <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  331  974:aload_2         
		//  332  975:aload_3         
		//  333  976:iconst_1        
		//  334  977:invokevirtual   #272 <Method void Bundle.writeToParcel(Parcel, int)>
				} else
		//* 335  980:goto            988
				{
					parcel1.writeInt(0);
		//  336  983:aload_3         
		//  337  984:iconst_0        
		//  338  985:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				}
				return true;
		//  339  988:iconst_1        
		//  340  989:ireturn         

			case 32: // ' '
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  341  990:aload_2         
		//  342  991:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  343  993:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				i = getRatingType();
		//  344  996:aload_0         
		//  345  997:invokevirtual   #275 <Method int getRatingType()>
		//  346 1000:istore_1        
				parcel1.writeNoException();
		//  347 1001:aload_3         
		//  348 1002:invokevirtual   #168 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  349 1005:aload_3         
		//  350 1006:iload_1         
		//  351 1007:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				return true;
		//  352 1010:iconst_1        
		//  353 1011:ireturn         

			case 37: // '%'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  354 1012:aload_2         
		//  355 1013:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  356 1015:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				i = getRepeatMode();
		//  357 1018:aload_0         
		//  358 1019:invokevirtual   #278 <Method int getRepeatMode()>
		//  359 1022:istore_1        
				parcel1.writeNoException();
		//  360 1023:aload_3         
		//  361 1024:invokevirtual   #168 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  362 1027:aload_3         
		//  363 1028:iload_1         
		//  364 1029:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				return true;
		//  365 1032:iconst_1        
		//  366 1033:ireturn         

			case 38: // '&'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  367 1034:aload_2         
		//  368 1035:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  369 1037:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				boolean flag2 = isShuffleModeEnabled();
		//  370 1040:aload_0         
		//  371 1041:invokevirtual   #281 <Method boolean isShuffleModeEnabled()>
		//  372 1044:istore          5
				parcel1.writeNoException();
		//  373 1046:aload_3         
		//  374 1047:invokevirtual   #168 <Method void Parcel.writeNoException()>
				if(flag2)
		//* 375 1050:iload           5
		//* 376 1052:ifeq            1060
					i = 1;
		//  377 1055:iconst_1        
		//  378 1056:istore_1        
				else
		//* 379 1057:goto            1062
					i = 0;
		//  380 1060:iconst_0        
		//  381 1061:istore_1        
				parcel1.writeInt(i);
		//  382 1062:aload_3         
		//  383 1063:iload_1         
		//  384 1064:invokevirtual   #179 <Method void Parcel.writeInt(int)>
				return true;
		//  385 1067:iconst_1        
		//  386 1068:ireturn         

			case 41: // ')'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  387 1069:aload_2         
		//  388 1070:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  389 1072:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 390 1075:aload_2         
		//* 391 1076:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 392 1079:ifeq            1098
					parcel = ((Parcel) ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel)));
		//  393 1082:getstatic       #284 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  394 1085:aload_2         
		//  395 1086:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  396 1091:checkcast       #283 <Class MediaDescriptionCompat>
		//  397 1094:astore_2        
				else
		//* 398 1095:goto            1100
					parcel = null;
		//  399 1098:aconst_null     
		//  400 1099:astore_2        
				addQueueItem(((MediaDescriptionCompat) (parcel)));
		//  401 1100:aload_0         
		//  402 1101:aload_2         
		//  403 1102:invokevirtual   #288 <Method void addQueueItem(MediaDescriptionCompat)>
				parcel1.writeNoException();
		//  404 1105:aload_3         
		//  405 1106:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  406 1109:iconst_1        
		//  407 1110:ireturn         

			case 42: // '*'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  408 1111:aload_2         
		//  409 1112:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  410 1114:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				MediaDescriptionCompat mediadescriptioncompat;
				if(parcel.readInt() != 0)
		//* 411 1117:aload_2         
		//* 412 1118:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 413 1121:ifeq            1141
					mediadescriptioncompat = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
		//  414 1124:getstatic       #284 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  415 1127:aload_2         
		//  416 1128:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  417 1133:checkcast       #283 <Class MediaDescriptionCompat>
		//  418 1136:astore          8
				else
		//* 419 1138:goto            1144
					mediadescriptioncompat = null;
		//  420 1141:aconst_null     
		//  421 1142:astore          8
				addQueueItemAt(mediadescriptioncompat, parcel.readInt());
		//  422 1144:aload_0         
		//  423 1145:aload           8
		//  424 1147:aload_2         
		//  425 1148:invokevirtual   #146 <Method int Parcel.readInt()>
		//  426 1151:invokevirtual   #292 <Method void addQueueItemAt(MediaDescriptionCompat, int)>
				parcel1.writeNoException();
		//  427 1154:aload_3         
		//  428 1155:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  429 1158:iconst_1        
		//  430 1159:ireturn         

			case 43: // '+'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  431 1160:aload_2         
		//  432 1161:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  433 1163:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 434 1166:aload_2         
		//* 435 1167:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 436 1170:ifeq            1189
					parcel = ((Parcel) ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel)));
		//  437 1173:getstatic       #284 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  438 1176:aload_2         
		//  439 1177:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  440 1182:checkcast       #283 <Class MediaDescriptionCompat>
		//  441 1185:astore_2        
				else
		//* 442 1186:goto            1191
					parcel = null;
		//  443 1189:aconst_null     
		//  444 1190:astore_2        
				removeQueueItem(((MediaDescriptionCompat) (parcel)));
		//  445 1191:aload_0         
		//  446 1192:aload_2         
		//  447 1193:invokevirtual   #295 <Method void removeQueueItem(MediaDescriptionCompat)>
				parcel1.writeNoException();
		//  448 1196:aload_3         
		//  449 1197:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  450 1200:iconst_1        
		//  451 1201:ireturn         

			case 44: // ','
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  452 1202:aload_2         
		//  453 1203:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  454 1205:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				removeQueueItemAt(parcel.readInt());
		//  455 1208:aload_0         
		//  456 1209:aload_2         
		//  457 1210:invokevirtual   #146 <Method int Parcel.readInt()>
		//  458 1213:invokevirtual   #298 <Method void removeQueueItemAt(int)>
				parcel1.writeNoException();
		//  459 1216:aload_3         
		//  460 1217:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  461 1220:iconst_1        
		//  462 1221:ireturn         

			case 33: // '!'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  463 1222:aload_2         
		//  464 1223:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  465 1225:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				prepare();
		//  466 1228:aload_0         
		//  467 1229:invokevirtual   #301 <Method void prepare()>
				parcel1.writeNoException();
		//  468 1232:aload_3         
		//  469 1233:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  470 1236:iconst_1        
		//  471 1237:ireturn         

			case 34: // '"'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  472 1238:aload_2         
		//  473 1239:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  474 1241:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				String s = parcel.readString();
		//  475 1244:aload_2         
		//  476 1245:invokevirtual   #142 <Method String Parcel.readString()>
		//  477 1248:astore          8
				if(parcel.readInt() != 0)
		//* 478 1250:aload_2         
		//* 479 1251:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 480 1254:ifeq            1273
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  481 1257:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  482 1260:aload_2         
		//  483 1261:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  484 1266:checkcast       #148 <Class Bundle>
		//  485 1269:astore_2        
				else
		//* 486 1270:goto            1275
					parcel = null;
		//  487 1273:aconst_null     
		//  488 1274:astore_2        
				prepareFromMediaId(s, ((Bundle) (parcel)));
		//  489 1275:aload_0         
		//  490 1276:aload           8
		//  491 1278:aload_2         
		//  492 1279:invokevirtual   #305 <Method void prepareFromMediaId(String, Bundle)>
				parcel1.writeNoException();
		//  493 1282:aload_3         
		//  494 1283:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  495 1286:iconst_1        
		//  496 1287:ireturn         

			case 35: // '#'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  497 1288:aload_2         
		//  498 1289:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  499 1291:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				String s1 = parcel.readString();
		//  500 1294:aload_2         
		//  501 1295:invokevirtual   #142 <Method String Parcel.readString()>
		//  502 1298:astore          8
				if(parcel.readInt() != 0)
		//* 503 1300:aload_2         
		//* 504 1301:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 505 1304:ifeq            1323
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  506 1307:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  507 1310:aload_2         
		//  508 1311:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  509 1316:checkcast       #148 <Class Bundle>
		//  510 1319:astore_2        
				else
		//* 511 1320:goto            1325
					parcel = null;
		//  512 1323:aconst_null     
		//  513 1324:astore_2        
				prepareFromSearch(s1, ((Bundle) (parcel)));
		//  514 1325:aload_0         
		//  515 1326:aload           8
		//  516 1328:aload_2         
		//  517 1329:invokevirtual   #308 <Method void prepareFromSearch(String, Bundle)>
				parcel1.writeNoException();
		//  518 1332:aload_3         
		//  519 1333:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  520 1336:iconst_1        
		//  521 1337:ireturn         

			case 36: // '$'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  522 1338:aload_2         
		//  523 1339:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  524 1341:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				Uri uri;
				if(parcel.readInt() != 0)
		//* 525 1344:aload_2         
		//* 526 1345:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 527 1348:ifeq            1368
					uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
		//  528 1351:getstatic       #311 <Field android.os.Parcelable$Creator Uri.CREATOR>
		//  529 1354:aload_2         
		//  530 1355:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  531 1360:checkcast       #310 <Class Uri>
		//  532 1363:astore          8
				else
		//* 533 1365:goto            1371
					uri = null;
		//  534 1368:aconst_null     
		//  535 1369:astore          8
				if(parcel.readInt() != 0)
		//* 536 1371:aload_2         
		//* 537 1372:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 538 1375:ifeq            1394
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  539 1378:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  540 1381:aload_2         
		//  541 1382:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  542 1387:checkcast       #148 <Class Bundle>
		//  543 1390:astore_2        
				else
		//* 544 1391:goto            1396
					parcel = null;
		//  545 1394:aconst_null     
		//  546 1395:astore_2        
				prepareFromUri(uri, ((Bundle) (parcel)));
		//  547 1396:aload_0         
		//  548 1397:aload           8
		//  549 1399:aload_2         
		//  550 1400:invokevirtual   #315 <Method void prepareFromUri(Uri, Bundle)>
				parcel1.writeNoException();
		//  551 1403:aload_3         
		//  552 1404:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  553 1407:iconst_1        
		//  554 1408:ireturn         

			case 13: // '\r'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  555 1409:aload_2         
		//  556 1410:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  557 1412:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				play();
		//  558 1415:aload_0         
		//  559 1416:invokevirtual   #318 <Method void play()>
				parcel1.writeNoException();
		//  560 1419:aload_3         
		//  561 1420:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  562 1423:iconst_1        
		//  563 1424:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  564 1425:aload_2         
		//  565 1426:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  566 1428:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				String s2 = parcel.readString();
		//  567 1431:aload_2         
		//  568 1432:invokevirtual   #142 <Method String Parcel.readString()>
		//  569 1435:astore          8
				if(parcel.readInt() != 0)
		//* 570 1437:aload_2         
		//* 571 1438:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 572 1441:ifeq            1460
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  573 1444:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  574 1447:aload_2         
		//  575 1448:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  576 1453:checkcast       #148 <Class Bundle>
		//  577 1456:astore_2        
				else
		//* 578 1457:goto            1462
					parcel = null;
		//  579 1460:aconst_null     
		//  580 1461:astore_2        
				playFromMediaId(s2, ((Bundle) (parcel)));
		//  581 1462:aload_0         
		//  582 1463:aload           8
		//  583 1465:aload_2         
		//  584 1466:invokevirtual   #321 <Method void playFromMediaId(String, Bundle)>
				parcel1.writeNoException();
		//  585 1469:aload_3         
		//  586 1470:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  587 1473:iconst_1        
		//  588 1474:ireturn         

			case 15: // '\017'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  589 1475:aload_2         
		//  590 1476:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  591 1478:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				String s3 = parcel.readString();
		//  592 1481:aload_2         
		//  593 1482:invokevirtual   #142 <Method String Parcel.readString()>
		//  594 1485:astore          8
				if(parcel.readInt() != 0)
		//* 595 1487:aload_2         
		//* 596 1488:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 597 1491:ifeq            1510
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  598 1494:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  599 1497:aload_2         
		//  600 1498:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  601 1503:checkcast       #148 <Class Bundle>
		//  602 1506:astore_2        
				else
		//* 603 1507:goto            1512
					parcel = null;
		//  604 1510:aconst_null     
		//  605 1511:astore_2        
				playFromSearch(s3, ((Bundle) (parcel)));
		//  606 1512:aload_0         
		//  607 1513:aload           8
		//  608 1515:aload_2         
		//  609 1516:invokevirtual   #324 <Method void playFromSearch(String, Bundle)>
				parcel1.writeNoException();
		//  610 1519:aload_3         
		//  611 1520:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  612 1523:iconst_1        
		//  613 1524:ireturn         

			case 16: // '\020'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  614 1525:aload_2         
		//  615 1526:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  616 1528:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				Uri uri1;
				if(parcel.readInt() != 0)
		//* 617 1531:aload_2         
		//* 618 1532:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 619 1535:ifeq            1555
					uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
		//  620 1538:getstatic       #311 <Field android.os.Parcelable$Creator Uri.CREATOR>
		//  621 1541:aload_2         
		//  622 1542:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  623 1547:checkcast       #310 <Class Uri>
		//  624 1550:astore          8
				else
		//* 625 1552:goto            1558
					uri1 = null;
		//  626 1555:aconst_null     
		//  627 1556:astore          8
				if(parcel.readInt() != 0)
		//* 628 1558:aload_2         
		//* 629 1559:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 630 1562:ifeq            1581
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  631 1565:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  632 1568:aload_2         
		//  633 1569:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  634 1574:checkcast       #148 <Class Bundle>
		//  635 1577:astore_2        
				else
		//* 636 1578:goto            1583
					parcel = null;
		//  637 1581:aconst_null     
		//  638 1582:astore_2        
				playFromUri(uri1, ((Bundle) (parcel)));
		//  639 1583:aload_0         
		//  640 1584:aload           8
		//  641 1586:aload_2         
		//  642 1587:invokevirtual   #327 <Method void playFromUri(Uri, Bundle)>
				parcel1.writeNoException();
		//  643 1590:aload_3         
		//  644 1591:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  645 1594:iconst_1        
		//  646 1595:ireturn         

			case 17: // '\021'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  647 1596:aload_2         
		//  648 1597:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  649 1599:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				skipToQueueItem(parcel.readLong());
		//  650 1602:aload_0         
		//  651 1603:aload_2         
		//  652 1604:invokevirtual   #330 <Method long Parcel.readLong()>
		//  653 1607:invokevirtual   #333 <Method void skipToQueueItem(long)>
				parcel1.writeNoException();
		//  654 1610:aload_3         
		//  655 1611:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  656 1614:iconst_1        
		//  657 1615:ireturn         

			case 18: // '\022'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  658 1616:aload_2         
		//  659 1617:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  660 1619:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				pause();
		//  661 1622:aload_0         
		//  662 1623:invokevirtual   #336 <Method void pause()>
				parcel1.writeNoException();
		//  663 1626:aload_3         
		//  664 1627:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  665 1630:iconst_1        
		//  666 1631:ireturn         

			case 19: // '\023'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  667 1632:aload_2         
		//  668 1633:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  669 1635:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				stop();
		//  670 1638:aload_0         
		//  671 1639:invokevirtual   #339 <Method void stop()>
				parcel1.writeNoException();
		//  672 1642:aload_3         
		//  673 1643:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  674 1646:iconst_1        
		//  675 1647:ireturn         

			case 20: // '\024'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  676 1648:aload_2         
		//  677 1649:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  678 1651:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				next();
		//  679 1654:aload_0         
		//  680 1655:invokevirtual   #342 <Method void next()>
				parcel1.writeNoException();
		//  681 1658:aload_3         
		//  682 1659:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  683 1662:iconst_1        
		//  684 1663:ireturn         

			case 21: // '\025'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  685 1664:aload_2         
		//  686 1665:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  687 1667:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				previous();
		//  688 1670:aload_0         
		//  689 1671:invokevirtual   #345 <Method void previous()>
				parcel1.writeNoException();
		//  690 1674:aload_3         
		//  691 1675:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  692 1678:iconst_1        
		//  693 1679:ireturn         

			case 22: // '\026'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  694 1680:aload_2         
		//  695 1681:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  696 1683:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				fastForward();
		//  697 1686:aload_0         
		//  698 1687:invokevirtual   #348 <Method void fastForward()>
				parcel1.writeNoException();
		//  699 1690:aload_3         
		//  700 1691:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  701 1694:iconst_1        
		//  702 1695:ireturn         

			case 23: // '\027'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  703 1696:aload_2         
		//  704 1697:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  705 1699:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				rewind();
		//  706 1702:aload_0         
		//  707 1703:invokevirtual   #351 <Method void rewind()>
				parcel1.writeNoException();
		//  708 1706:aload_3         
		//  709 1707:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  710 1710:iconst_1        
		//  711 1711:ireturn         

			case 24: // '\030'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  712 1712:aload_2         
		//  713 1713:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  714 1715:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				seekTo(parcel.readLong());
		//  715 1718:aload_0         
		//  716 1719:aload_2         
		//  717 1720:invokevirtual   #330 <Method long Parcel.readLong()>
		//  718 1723:invokevirtual   #354 <Method void seekTo(long)>
				parcel1.writeNoException();
		//  719 1726:aload_3         
		//  720 1727:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  721 1730:iconst_1        
		//  722 1731:ireturn         

			case 25: // '\031'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  723 1732:aload_2         
		//  724 1733:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  725 1735:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 726 1738:aload_2         
		//* 727 1739:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 728 1742:ifeq            1761
					parcel = ((Parcel) ((RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel)));
		//  729 1745:getstatic       #357 <Field android.os.Parcelable$Creator RatingCompat.CREATOR>
		//  730 1748:aload_2         
		//  731 1749:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  732 1754:checkcast       #356 <Class RatingCompat>
		//  733 1757:astore_2        
				else
		//* 734 1758:goto            1763
					parcel = null;
		//  735 1761:aconst_null     
		//  736 1762:astore_2        
				rate(((RatingCompat) (parcel)));
		//  737 1763:aload_0         
		//  738 1764:aload_2         
		//  739 1765:invokevirtual   #361 <Method void rate(RatingCompat)>
				parcel1.writeNoException();
		//  740 1768:aload_3         
		//  741 1769:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  742 1772:iconst_1        
		//  743 1773:ireturn         

			case 39: // '\''
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  744 1774:aload_2         
		//  745 1775:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  746 1777:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				setRepeatMode(parcel.readInt());
		//  747 1780:aload_0         
		//  748 1781:aload_2         
		//  749 1782:invokevirtual   #146 <Method int Parcel.readInt()>
		//  750 1785:invokevirtual   #364 <Method void setRepeatMode(int)>
				parcel1.writeNoException();
		//  751 1788:aload_3         
		//  752 1789:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  753 1792:iconst_1        
		//  754 1793:ireturn         

			case 40: // '('
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  755 1794:aload_2         
		//  756 1795:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  757 1797:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				boolean flag3;
				if(parcel.readInt() != 0)
		//* 758 1800:aload_2         
		//* 759 1801:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 760 1804:ifeq            1813
					flag3 = true;
		//  761 1807:iconst_1        
		//  762 1808:istore          5
				else
		//* 763 1810:goto            1816
					flag3 = false;
		//  764 1813:iconst_0        
		//  765 1814:istore          5
				setShuffleModeEnabled(flag3);
		//  766 1816:aload_0         
		//  767 1817:iload           5
		//  768 1819:invokevirtual   #368 <Method void setShuffleModeEnabled(boolean)>
				parcel1.writeNoException();
		//  769 1822:aload_3         
		//  770 1823:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  771 1826:iconst_1        
		//  772 1827:ireturn         

			case 26: // '\032'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  773 1828:aload_2         
		//  774 1829:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  775 1831:invokevirtual   #138 <Method void Parcel.enforceInterface(String)>
				String s4 = parcel.readString();
		//  776 1834:aload_2         
		//  777 1835:invokevirtual   #142 <Method String Parcel.readString()>
		//  778 1838:astore          8
				if(parcel.readInt() != 0)
		//* 779 1840:aload_2         
		//* 780 1841:invokevirtual   #146 <Method int Parcel.readInt()>
		//* 781 1844:ifeq            1863
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  782 1847:getstatic       #152 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  783 1850:aload_2         
		//  784 1851:invokeinterface #158 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  785 1856:checkcast       #148 <Class Bundle>
		//  786 1859:astore_2        
				else
		//* 787 1860:goto            1865
					parcel = null;
		//  788 1863:aconst_null     
		//  789 1864:astore_2        
				sendCustomAction(s4, ((Bundle) (parcel)));
		//  790 1865:aload_0         
		//  791 1866:aload           8
		//  792 1868:aload_2         
		//  793 1869:invokevirtual   #371 <Method void sendCustomAction(String, Bundle)>
				parcel1.writeNoException();
		//  794 1872:aload_3         
		//  795 1873:invokevirtual   #168 <Method void Parcel.writeNoException()>
				return true;
		//  796 1876:iconst_1        
		//  797 1877:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  798 1878:aload_0         
		//  799 1879:iload_1         
		//  800 1880:aload_2         
		//  801 1881:aload_3         
		//  802 1882:iload           4
		//  803 1884:invokespecial   #373 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  804 1887:ireturn         
		}

		private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
		static final int TRANSACTION_addQueueItem = 41;
		static final int TRANSACTION_addQueueItemAt = 42;
		static final int TRANSACTION_adjustVolume = 11;
		static final int TRANSACTION_fastForward = 22;
		static final int TRANSACTION_getExtras = 31;
		static final int TRANSACTION_getFlags = 9;
		static final int TRANSACTION_getLaunchPendingIntent = 8;
		static final int TRANSACTION_getMetadata = 27;
		static final int TRANSACTION_getPackageName = 6;
		static final int TRANSACTION_getPlaybackState = 28;
		static final int TRANSACTION_getQueue = 29;
		static final int TRANSACTION_getQueueTitle = 30;
		static final int TRANSACTION_getRatingType = 32;
		static final int TRANSACTION_getRepeatMode = 37;
		static final int TRANSACTION_getTag = 7;
		static final int TRANSACTION_getVolumeAttributes = 10;
		static final int TRANSACTION_isShuffleModeEnabled = 38;
		static final int TRANSACTION_isTransportControlEnabled = 5;
		static final int TRANSACTION_next = 20;
		static final int TRANSACTION_pause = 18;
		static final int TRANSACTION_play = 13;
		static final int TRANSACTION_playFromMediaId = 14;
		static final int TRANSACTION_playFromSearch = 15;
		static final int TRANSACTION_playFromUri = 16;
		static final int TRANSACTION_prepare = 33;
		static final int TRANSACTION_prepareFromMediaId = 34;
		static final int TRANSACTION_prepareFromSearch = 35;
		static final int TRANSACTION_prepareFromUri = 36;
		static final int TRANSACTION_previous = 21;
		static final int TRANSACTION_rate = 25;
		static final int TRANSACTION_registerCallbackListener = 3;
		static final int TRANSACTION_removeQueueItem = 43;
		static final int TRANSACTION_removeQueueItemAt = 44;
		static final int TRANSACTION_rewind = 23;
		static final int TRANSACTION_seekTo = 24;
		static final int TRANSACTION_sendCommand = 1;
		static final int TRANSACTION_sendCustomAction = 26;
		static final int TRANSACTION_sendMediaButton = 2;
		static final int TRANSACTION_setRepeatMode = 39;
		static final int TRANSACTION_setShuffleModeEnabled = 40;
		static final int TRANSACTION_setVolumeTo = 12;
		static final int TRANSACTION_skipToQueueItem = 17;
		static final int TRANSACTION_stop = 19;
		static final int TRANSACTION_unregisterCallbackListener = 4;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #107 <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.v4.media.session.IMediaSession");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//    5    8:invokevirtual   #111 <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class Stub.Proxy
		implements IMediaSession
	{

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(mediadescriptioncompat == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mediadescriptioncompat.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(41, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #19  <Field IBinder mRemote>
		//   22   41:bipush          41
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			mediadescriptioncompat;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw mediadescriptioncompat;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(mediadescriptioncompat == null)
				break MISSING_BLOCK_LABEL_33;
		//    7   15:aload_1         
		//    8   16:ifnull          33
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mediadescriptioncompat.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   16   30:goto            38
			parcel.writeInt(0);
		//   17   33:aload_3         
		//   18   34:iconst_0        
		//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeInt(i);
		//   20   38:aload_3         
		//   21   39:iload_2         
		//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(42, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:bipush          42
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   64:aload           4
		//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   37   73:return          
			mediadescriptioncompat;
		//   38   74:astore_1        
			parcel1.recycle();
		//   39   75:aload           4
		//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   80:aload_3         
		//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
			throw mediadescriptioncompat;
		//   43   84:aload_1         
		//   44   85:athrow          
		}

		public void adjustVolume(int i, int j, String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   17:aload           4
		//    8   19:iload_1         
		//    9   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
		//   10   23:aload           4
		//   11   25:iload_2         
		//   12   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeString(s);
		//   13   29:aload           4
		//   14   31:aload_3         
		//   15   32:invokevirtual   #66  <Method void Parcel.writeString(String)>
			mRemote.transact(11, parcel, parcel1, 0);
		//   16   35:aload_0         
		//   17   36:getfield        #19  <Field IBinder mRemote>
		//   18   39:bipush          11
		//   19   41:aload           4
		//   20   43:aload           5
		//   21   45:iconst_0        
		//   22   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   51:pop             
			parcel1.readException();
		//   24   52:aload           5
		//   25   54:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   57:aload           5
		//   27   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   62:aload           4
		//   29   64:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   67:return          
			s;
		//   31   68:astore_3        
			parcel1.recycle();
		//   32   69:aload           5
		//   33   71:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   74:aload           4
		//   35   76:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   36   79:aload_3         
		//   37   80:athrow          
		}

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public void fastForward()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(22, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          22
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public Bundle getExtras()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			Bundle bundle;
label0:
			{
				parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(31, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          31
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #81  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #77  <Class Bundle>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				bundle = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return bundle;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public long getFlags()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			long l;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(9, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          9
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #55  <Method void Parcel.readException()>
			l = parcel1.readLong();
		//   17   36:aload           4
		//   18   38:invokevirtual   #92  <Method long Parcel.readLong()>
		//   19   41:lstore_1        
			parcel1.recycle();
		//   20   42:aload           4
		//   21   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   47:aload_3         
		//   23   48:invokevirtual   #58  <Method void Parcel.recycle()>
			return l;
		//   24   51:lload_1         
		//   25   52:lreturn         
			Exception exception;
			exception;
		//   26   53:astore          5
			parcel1.recycle();
		//   27   55:aload           4
		//   28   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   60:aload_3         
		//   30   61:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   64:aload           5
		//   32   66:athrow          
		}

		public String getInterfaceDescriptor()
		{
			return "android.support.v4.media.session.IMediaSession";
		//    0    0:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    1    2:areturn         
		}

		public PendingIntent getLaunchPendingIntent()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			PendingIntent pendingintent;
label0:
			{
				parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(8, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          8
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					pendingintent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #99  <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #98  <Class PendingIntent>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				pendingintent = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return pendingintent;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public MediaMetadataCompat getMetadata()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			MediaMetadataCompat mediametadatacompat;
label0:
			{
				parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(27, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          27
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					mediametadatacompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #104 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #103 <Class MediaMetadataCompat>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				mediametadatacompat = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return mediametadatacompat;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public String getPackageName()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			String s;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(6, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          6
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #108 <Method String Parcel.readString()>
		//   19   37:astore_3        
			parcel1.recycle();
		//   20   38:aload_2         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_1         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return s;
		//   24   46:aload_3         
		//   25   47:areturn         
			Exception exception;
			exception;
		//   26   48:astore_3        
			parcel1.recycle();
		//   27   49:aload_2         
		//   28   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   53:aload_1         
		//   30   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   57:aload_3         
		//   32   58:athrow          
		}

		public PlaybackStateCompat getPlaybackState()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			PlaybackStateCompat playbackstatecompat;
label0:
			{
				parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(28, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          28
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					playbackstatecompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #113 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #112 <Class PlaybackStateCompat>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				playbackstatecompat = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return playbackstatecompat;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public List getQueue()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			java.util.ArrayList arraylist;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(29, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          29
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			arraylist = parcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
		//   17   33:aload_2         
		//   18   34:getstatic       #118 <Field android.os.Parcelable$Creator MediaSessionCompat$QueueItem.CREATOR>
		//   19   37:invokevirtual   #122 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   20   40:astore_3        
			parcel1.recycle();
		//   21   41:aload_2         
		//   22   42:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   45:aload_1         
		//   24   46:invokevirtual   #58  <Method void Parcel.recycle()>
			return ((List) (arraylist));
		//   25   49:aload_3         
		//   26   50:areturn         
			Exception exception;
			exception;
		//   27   51:astore_3        
			parcel1.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   56:aload_1         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   32   60:aload_3         
		//   33   61:athrow          
		}

		public CharSequence getQueueTitle()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			CharSequence charsequence;
label0:
			{
				parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(30, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          30
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					charsequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #131 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #133 <Class CharSequence>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				charsequence = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return charsequence;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public int getRatingType()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(32, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          32
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public int getRepeatMode()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			int i;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(37, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          37
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public String getTag()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			String s;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(7, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          7
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #108 <Method String Parcel.readString()>
		//   19   37:astore_3        
			parcel1.recycle();
		//   20   38:aload_2         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_1         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return s;
		//   24   46:aload_3         
		//   25   47:areturn         
			Exception exception;
			exception;
		//   26   48:astore_3        
			parcel1.recycle();
		//   27   49:aload_2         
		//   28   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   53:aload_1         
		//   30   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   31   57:aload_3         
		//   32   58:athrow          
		}

		public ParcelableVolumeInfo getVolumeAttributes()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			ParcelableVolumeInfo parcelablevolumeinfo;
label0:
			{
				parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(10, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          10
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
				parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  17   33:aload_3         
		//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					parcelablevolumeinfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #141 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #140 <Class ParcelableVolumeInfo>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				parcelablevolumeinfo = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return parcelablevolumeinfo;
		//   32   66:aload_1         
		//   33   67:areturn         
			Exception exception;
			exception;
		//   34   68:astore_1        
			parcel1.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   73:aload_2         
		//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   77:aload_1         
		//   40   78:athrow          
		}

		public boolean isShuffleModeEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(38, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          38
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   41:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   42:iload_1         
		//*  21   43:ifeq            51
				flag = true;
		//   22   46:iconst_1        
		//   23   47:istore_2        
			else
		//*  24   48:goto            53
				flag = false;
		//   25   51:iconst_0        
		//   26   52:istore_2        
			parcel1.recycle();
		//   27   53:aload           4
		//   28   55:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public boolean isTransportControlEnabled()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			int i;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(5, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:iconst_5        
		//   10   20:aload_3         
		//   11   21:aload           4
		//   12   23:iconst_0        
		//   13   24:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   29:pop             
			parcel1.readException();
		//   15   30:aload           4
		//   16   32:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   35:aload           4
		//   18   37:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   40:istore_1        
			boolean flag;
			if(i != 0)
		//*  20   41:iload_1         
		//*  21   42:ifeq            50
				flag = true;
		//   22   45:iconst_1        
		//   23   46:istore_2        
			else
		//*  24   47:goto            52
				flag = false;
		//   25   50:iconst_0        
		//   26   51:istore_2        
			parcel1.recycle();
		//   27   52:aload           4
		//   28   54:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   57:aload_3         
		//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   31   61:iload_2         
		//   32   62:ireturn         
			Exception exception;
			exception;
		//   33   63:astore          5
			parcel1.recycle();
		//   34   65:aload           4
		//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   70:aload_3         
		//   37   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   38   74:aload           5
		//   39   76:athrow          
		}

		public void next()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(20, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          20
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void pause()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(18, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          18
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void play()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(13, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          13
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void playFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_38;
		//   10   20:aload_2         
		//   11   21:ifnull          38
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   19   35:goto            43
			parcel.writeInt(0);
		//   20   38:aload_3         
		//   21   39:iconst_0        
		//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(14, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:bipush          14
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   64:aload           4
		//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   37   73:return          
			s;
		//   38   74:astore_1        
			parcel1.recycle();
		//   39   75:aload           4
		//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   80:aload_3         
		//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   43   84:aload_1         
		//   44   85:athrow          
		}

		public void playFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_38;
		//   10   20:aload_2         
		//   11   21:ifnull          38
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   19   35:goto            43
			parcel.writeInt(0);
		//   20   38:aload_3         
		//   21   39:iconst_0        
		//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(15, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:bipush          15
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   64:aload           4
		//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   37   73:return          
			s;
		//   38   74:astore_1        
			parcel1.recycle();
		//   39   75:aload           4
		//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   80:aload_3         
		//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   43   84:aload_1         
		//   44   85:athrow          
		}

		public void playFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(uri == null)
				break MISSING_BLOCK_LABEL_33;
		//    7   15:aload_1         
		//    8   16:ifnull          33
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #156 <Method void Uri.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   16   30:goto            38
			parcel.writeInt(0);
		//   17   33:aload_3         
		//   18   34:iconst_0        
		//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_56;
		//   20   38:aload_2         
		//   21   39:ifnull          56
			parcel.writeInt(1);
		//   22   42:aload_3         
		//   23   43:iconst_1        
		//   24   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   25   47:aload_2         
		//   26   48:aload_3         
		//   27   49:iconst_0        
		//   28   50:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_61;
		//   29   53:goto            61
			parcel.writeInt(0);
		//   30   56:aload_3         
		//   31   57:iconst_0        
		//   32   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(16, parcel, parcel1, 0);
		//   33   61:aload_0         
		//   34   62:getfield        #19  <Field IBinder mRemote>
		//   35   65:bipush          16
		//   36   67:aload_3         
		//   37   68:aload           4
		//   38   70:iconst_0        
		//   39   71:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   40   76:pop             
			parcel1.readException();
		//   41   77:aload           4
		//   42   79:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   43   82:aload           4
		//   44   84:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   45   87:aload_3         
		//   46   88:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   47   91:return          
			uri;
		//   48   92:astore_1        
			parcel1.recycle();
		//   49   93:aload           4
		//   50   95:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   51   98:aload_3         
		//   52   99:invokevirtual   #58  <Method void Parcel.recycle()>
			throw uri;
		//   53  102:aload_1         
		//   54  103:athrow          
		}

		public void prepare()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(33, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          33
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_38;
		//   10   20:aload_2         
		//   11   21:ifnull          38
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   19   35:goto            43
			parcel.writeInt(0);
		//   20   38:aload_3         
		//   21   39:iconst_0        
		//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(34, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:bipush          34
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   64:aload           4
		//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   37   73:return          
			s;
		//   38   74:astore_1        
			parcel1.recycle();
		//   39   75:aload           4
		//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   80:aload_3         
		//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   43   84:aload_1         
		//   44   85:athrow          
		}

		public void prepareFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_38;
		//   10   20:aload_2         
		//   11   21:ifnull          38
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   19   35:goto            43
			parcel.writeInt(0);
		//   20   38:aload_3         
		//   21   39:iconst_0        
		//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(35, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:bipush          35
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   64:aload           4
		//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   37   73:return          
			s;
		//   38   74:astore_1        
			parcel1.recycle();
		//   39   75:aload           4
		//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   80:aload_3         
		//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   43   84:aload_1         
		//   44   85:athrow          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(uri == null)
				break MISSING_BLOCK_LABEL_33;
		//    7   15:aload_1         
		//    8   16:ifnull          33
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #156 <Method void Uri.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   16   30:goto            38
			parcel.writeInt(0);
		//   17   33:aload_3         
		//   18   34:iconst_0        
		//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_56;
		//   20   38:aload_2         
		//   21   39:ifnull          56
			parcel.writeInt(1);
		//   22   42:aload_3         
		//   23   43:iconst_1        
		//   24   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   25   47:aload_2         
		//   26   48:aload_3         
		//   27   49:iconst_0        
		//   28   50:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_61;
		//   29   53:goto            61
			parcel.writeInt(0);
		//   30   56:aload_3         
		//   31   57:iconst_0        
		//   32   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(36, parcel, parcel1, 0);
		//   33   61:aload_0         
		//   34   62:getfield        #19  <Field IBinder mRemote>
		//   35   65:bipush          36
		//   36   67:aload_3         
		//   37   68:aload           4
		//   38   70:iconst_0        
		//   39   71:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   40   76:pop             
			parcel1.readException();
		//   41   77:aload           4
		//   42   79:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   43   82:aload           4
		//   44   84:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   45   87:aload_3         
		//   46   88:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   47   91:return          
			uri;
		//   48   92:astore_1        
			parcel1.recycle();
		//   49   93:aload           4
		//   50   95:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   51   98:aload_3         
		//   52   99:invokevirtual   #58  <Method void Parcel.recycle()>
			throw uri;
		//   53  102:aload_1         
		//   54  103:athrow          
		}

		public void previous()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(21, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          21
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void rate(RatingCompat ratingcompat)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(ratingcompat == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			ratingcompat.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #166 <Method void RatingCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(25, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #19  <Field IBinder mRemote>
		//   22   41:bipush          25
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			ratingcompat;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw ratingcompat;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(imediacontrollercallback == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #172 <Method IBinder IMediaControllerCallback.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #175 <Method void Parcel.writeStrongBinder(IBinder)>
			mRemote.transact(3, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #19  <Field IBinder mRemote>
		//   18   37:iconst_3        
		//   19   38:aload_2         
		//   20   39:aload_3         
		//   21   40:iconst_0        
		//   22   41:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   46:pop             
			parcel1.readException();
		//   24   47:aload_3         
		//   25   48:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   51:aload_3         
		//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_2         
		//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   59:return          
			imediacontrollercallback;
		//   31   60:astore_1        
			parcel1.recycle();
		//   32   61:aload_3         
		//   33   62:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   65:aload_2         
		//   35   66:invokevirtual   #58  <Method void Parcel.recycle()>
			throw imediacontrollercallback;
		//   36   69:aload_1         
		//   37   70:athrow          
_L2:
			imediacontrollercallback = null;
		//   38   71:aconst_null     
		//   39   72:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   73:goto            28
_L3:
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(mediadescriptioncompat == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mediadescriptioncompat.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(43, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #19  <Field IBinder mRemote>
		//   22   41:bipush          43
		//   23   43:aload_2         
		//   24   44:aload_3         
		//   25   45:iconst_0        
		//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   51:pop             
			parcel1.readException();
		//   28   52:aload_3         
		//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   56:aload_3         
		//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   60:aload_2         
		//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   34   64:return          
			mediadescriptioncompat;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw mediadescriptioncompat;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void removeQueueItemAt(int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(44, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          44
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			Exception exception;
			exception;
		//   25   47:astore          4
			parcel1.recycle();
		//   26   49:aload_3         
		//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   53:aload_2         
		//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   57:aload           4
		//   31   59:athrow          
		}

		public void rewind()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(23, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          23
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void seekTo(long l)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeLong(l);
		//    7   15:aload_3         
		//    8   16:lload_1         
		//    9   17:invokevirtual   #183 <Method void Parcel.writeLong(long)>
			mRemote.transact(24, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:bipush          24
		//   13   26:aload_3         
		//   14   27:aload           4
		//   15   29:iconst_0        
		//   16   30:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   35:pop             
			parcel1.readException();
		//   18   36:aload           4
		//   19   38:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   41:aload           4
		//   21   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   46:aload_3         
		//   23   47:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   50:return          
			Exception exception;
			exception;
		//   25   51:astore          5
			parcel1.recycle();
		//   26   53:aload           4
		//   27   55:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   62:aload           5
		//   31   64:athrow          
		}

		public void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           4
		//    8   19:aload_1         
		//    9   20:invokevirtual   #66  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_43;
		//   10   23:aload_2         
		//   11   24:ifnull          43
			parcel.writeInt(1);
		//   12   27:aload           4
		//   13   29:iconst_1        
		//   14   30:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   33:aload_2         
		//   16   34:aload           4
		//   17   36:iconst_0        
		//   18   37:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_49;
		//   19   40:goto            49
			parcel.writeInt(0);
		//   20   43:aload           4
		//   21   45:iconst_0        
		//   22   46:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			if(resultreceiverwrapper == null)
				break MISSING_BLOCK_LABEL_69;
		//   23   49:aload_3         
		//   24   50:ifnull          69
			parcel.writeInt(1);
		//   25   53:aload           4
		//   26   55:iconst_1        
		//   27   56:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			resultreceiverwrapper.writeToParcel(parcel, 0);
		//   28   59:aload_3         
		//   29   60:aload           4
		//   30   62:iconst_0        
		//   31   63:invokevirtual   #188 <Method void MediaSessionCompat$ResultReceiverWrapper.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_75;
		//   32   66:goto            75
			parcel.writeInt(0);
		//   33   69:aload           4
		//   34   71:iconst_0        
		//   35   72:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(1, parcel, parcel1, 0);
		//   36   75:aload_0         
		//   37   76:getfield        #19  <Field IBinder mRemote>
		//   38   79:iconst_1        
		//   39   80:aload           4
		//   40   82:aload           5
		//   41   84:iconst_0        
		//   42   85:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   43   90:pop             
			parcel1.readException();
		//   44   91:aload           5
		//   45   93:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   46   96:aload           5
		//   47   98:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   48  101:aload           4
		//   49  103:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   50  106:return          
			s;
		//   51  107:astore_1        
			parcel1.recycle();
		//   52  108:aload           5
		//   53  110:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  113:aload           4
		//   55  115:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   56  118:aload_1         
		//   57  119:athrow          
		}

		public void sendCustomAction(String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_38;
		//   10   20:aload_2         
		//   11   21:ifnull          38
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #150 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   19   35:goto            43
			parcel.writeInt(0);
		//   20   38:aload_3         
		//   21   39:iconst_0        
		//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(26, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:bipush          26
		//   26   49:aload_3         
		//   27   50:aload           4
		//   28   52:iconst_0        
		//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   58:pop             
			parcel1.readException();
		//   31   59:aload           4
		//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   64:aload           4
		//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   69:aload_3         
		//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   37   73:return          
			s;
		//   38   74:astore_1        
			parcel1.recycle();
		//   39   75:aload           4
		//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   80:aload_3         
		//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   43   84:aload_1         
		//   44   85:athrow          
		}

		public boolean sendMediaButton(KeyEvent keyevent)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(keyevent == null)
				break MISSING_BLOCK_LABEL_37;
		//    7   17:aload_1         
		//    8   18:ifnull          37
			parcel.writeInt(1);
		//    9   21:aload           4
		//   10   23:iconst_1        
		//   11   24:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			keyevent.writeToParcel(parcel, 0);
		//   12   27:aload_1         
		//   13   28:aload           4
		//   14   30:iconst_0        
		//   15   31:invokevirtual   #194 <Method void KeyEvent.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   16   34:goto            43
			parcel.writeInt(0);
		//   17   37:aload           4
		//   18   39:iconst_0        
		//   19   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			int i;
			mRemote.transact(2, parcel, parcel1, 0);
		//   20   43:aload_0         
		//   21   44:getfield        #19  <Field IBinder mRemote>
		//   22   47:iconst_2        
		//   23   48:aload           4
		//   24   50:aload           5
		//   25   52:iconst_0        
		//   26   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   58:pop             
			parcel1.readException();
		//   28   59:aload           5
		//   29   61:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   30   64:aload           5
		//   31   66:invokevirtual   #75  <Method int Parcel.readInt()>
		//   32   69:istore_2        
			boolean flag;
			if(i != 0)
		//*  33   70:iload_2         
		//*  34   71:ifeq            79
				flag = true;
		//   35   74:iconst_1        
		//   36   75:istore_3        
			else
		//*  37   76:goto            81
				flag = false;
		//   38   79:iconst_0        
		//   39   80:istore_3        
			parcel1.recycle();
		//   40   81:aload           5
		//   41   83:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   42   86:aload           4
		//   43   88:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   44   91:iload_3         
		//   45   92:ireturn         
			keyevent;
		//   46   93:astore_1        
			parcel1.recycle();
		//   47   94:aload           5
		//   48   96:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   49   99:aload           4
		//   50  101:invokevirtual   #58  <Method void Parcel.recycle()>
			throw keyevent;
		//   51  104:aload_1         
		//   52  105:athrow          
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(39, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          39
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			Exception exception;
			exception;
		//   25   47:astore          4
			parcel1.recycle();
		//   26   49:aload_3         
		//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   53:aload_2         
		//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   57:aload           4
		//   31   59:athrow          
		}

		public void setShuffleModeEnabled(boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            74
				i = 1;
		//    9   19:iconst_1        
		//   10   20:istore_2        
			else
		//*  11   21:goto            24
		//*  12   24:aload_3         
		//*  13   25:iload_2         
		//*  14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #19  <Field IBinder mRemote>
		//*  17   33:bipush          40
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #55  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			mRemote.transact(40, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  39   76:goto            24
		}

		public void setVolumeTo(int i, int j, String s)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   17:aload           4
		//    8   19:iload_1         
		//    9   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
		//   10   23:aload           4
		//   11   25:iload_2         
		//   12   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeString(s);
		//   13   29:aload           4
		//   14   31:aload_3         
		//   15   32:invokevirtual   #66  <Method void Parcel.writeString(String)>
			mRemote.transact(12, parcel, parcel1, 0);
		//   16   35:aload_0         
		//   17   36:getfield        #19  <Field IBinder mRemote>
		//   18   39:bipush          12
		//   19   41:aload           4
		//   20   43:aload           5
		//   21   45:iconst_0        
		//   22   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   51:pop             
			parcel1.readException();
		//   24   52:aload           5
		//   25   54:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   57:aload           5
		//   27   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   62:aload           4
		//   29   64:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   67:return          
			s;
		//   31   68:astore_3        
			parcel1.recycle();
		//   32   69:aload           5
		//   33   71:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   74:aload           4
		//   35   76:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   36   79:aload_3         
		//   37   80:athrow          
		}

		public void skipToQueueItem(long l)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeLong(l);
		//    7   15:aload_3         
		//    8   16:lload_1         
		//    9   17:invokevirtual   #183 <Method void Parcel.writeLong(long)>
			mRemote.transact(17, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:bipush          17
		//   13   26:aload_3         
		//   14   27:aload           4
		//   15   29:iconst_0        
		//   16   30:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   35:pop             
			parcel1.readException();
		//   18   36:aload           4
		//   19   38:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   41:aload           4
		//   21   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   46:aload_3         
		//   23   47:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   24   50:return          
			Exception exception;
			exception;
		//   25   51:astore          5
			parcel1.recycle();
		//   26   53:aload           4
		//   27   55:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   30   62:aload           5
		//   31   64:athrow          
		}

		public void stop()
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(19, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          19
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   37:aload_1         
		//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   41:return          
			Exception exception;
			exception;
		//   22   42:astore_3        
			parcel1.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   51:aload_3         
		//   28   52:athrow          
		}

		public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(imediacontrollercallback == null) goto _L2; else goto _L1
		//    7   14:aload_1         
		//    8   15:ifnull          71
_L1:
			imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #172 <Method IBinder IMediaControllerCallback.asBinder()>
		//   11   24:astore_1        
		//*  12   25:goto            28
_L4:
			parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
		//   13   28:aload_2         
		//   14   29:aload_1         
		//   15   30:invokevirtual   #175 <Method void Parcel.writeStrongBinder(IBinder)>
			mRemote.transact(4, parcel, parcel1, 0);
		//   16   33:aload_0         
		//   17   34:getfield        #19  <Field IBinder mRemote>
		//   18   37:iconst_4        
		//   19   38:aload_2         
		//   20   39:aload_3         
		//   21   40:iconst_0        
		//   22   41:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   46:pop             
			parcel1.readException();
		//   24   47:aload_3         
		//   25   48:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   51:aload_3         
		//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_2         
		//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   59:return          
			imediacontrollercallback;
		//   31   60:astore_1        
			parcel1.recycle();
		//   32   61:aload_3         
		//   33   62:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   65:aload_2         
		//   35   66:invokevirtual   #58  <Method void Parcel.recycle()>
			throw imediacontrollercallback;
		//   36   69:aload_1         
		//   37   70:athrow          
_L2:
			imediacontrollercallback = null;
		//   38   71:aconst_null     
		//   39   72:astore_1        
			if(true) goto _L4; else goto _L3
		//   40   73:goto            28
_L3:
		}

		private IBinder mRemote;

		Stub.Proxy(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mRemote = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field IBinder mRemote>
		//    5    9:return          
		}
	}


	public abstract void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		throws RemoteException;

	public abstract void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		throws RemoteException;

	public abstract void adjustVolume(int i, int j, String s)
		throws RemoteException;

	public abstract void fastForward()
		throws RemoteException;

	public abstract Bundle getExtras()
		throws RemoteException;

	public abstract long getFlags()
		throws RemoteException;

	public abstract PendingIntent getLaunchPendingIntent()
		throws RemoteException;

	public abstract MediaMetadataCompat getMetadata()
		throws RemoteException;

	public abstract String getPackageName()
		throws RemoteException;

	public abstract PlaybackStateCompat getPlaybackState()
		throws RemoteException;

	public abstract List getQueue()
		throws RemoteException;

	public abstract CharSequence getQueueTitle()
		throws RemoteException;

	public abstract int getRatingType()
		throws RemoteException;

	public abstract int getRepeatMode()
		throws RemoteException;

	public abstract String getTag()
		throws RemoteException;

	public abstract ParcelableVolumeInfo getVolumeAttributes()
		throws RemoteException;

	public abstract boolean isShuffleModeEnabled()
		throws RemoteException;

	public abstract boolean isTransportControlEnabled()
		throws RemoteException;

	public abstract void next()
		throws RemoteException;

	public abstract void pause()
		throws RemoteException;

	public abstract void play()
		throws RemoteException;

	public abstract void playFromMediaId(String s, Bundle bundle)
		throws RemoteException;

	public abstract void playFromSearch(String s, Bundle bundle)
		throws RemoteException;

	public abstract void playFromUri(Uri uri, Bundle bundle)
		throws RemoteException;

	public abstract void prepare()
		throws RemoteException;

	public abstract void prepareFromMediaId(String s, Bundle bundle)
		throws RemoteException;

	public abstract void prepareFromSearch(String s, Bundle bundle)
		throws RemoteException;

	public abstract void prepareFromUri(Uri uri, Bundle bundle)
		throws RemoteException;

	public abstract void previous()
		throws RemoteException;

	public abstract void rate(RatingCompat ratingcompat)
		throws RemoteException;

	public abstract void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		throws RemoteException;

	public abstract void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		throws RemoteException;

	public abstract void removeQueueItemAt(int i)
		throws RemoteException;

	public abstract void rewind()
		throws RemoteException;

	public abstract void seekTo(long l)
		throws RemoteException;

	public abstract void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper)
		throws RemoteException;

	public abstract void sendCustomAction(String s, Bundle bundle)
		throws RemoteException;

	public abstract boolean sendMediaButton(KeyEvent keyevent)
		throws RemoteException;

	public abstract void setRepeatMode(int i)
		throws RemoteException;

	public abstract void setShuffleModeEnabled(boolean flag)
		throws RemoteException;

	public abstract void setVolumeTo(int i, int j, String s)
		throws RemoteException;

	public abstract void skipToQueueItem(long l)
		throws RemoteException;

	public abstract void stop()
		throws RemoteException;

	public abstract void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		throws RemoteException;
}

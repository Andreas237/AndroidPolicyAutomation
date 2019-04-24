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
		//    6    9:invokeinterface #130 <Method IInterface IBinder.queryLocalInterface(String)>
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
		//   19   36:invokespecial   #133 <Method void IMediaSession$Stub$Proxy(IBinder)>
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
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          6
			boolean flag2 = false;
		//    2    3:iconst_0        
		//    3    4:istore          7
			boolean flag3 = false;
		//    4    6:iconst_0        
		//    5    7:istore          8
			boolean flag = false;
		//    6    9:iconst_0        
		//    7   10:istore          5
			String s4;
			switch(i)
		//*   8   12:iload_1         
			{
		//*   9   13:lookupswitch    50: default 424
		//		               1: 442
		//		               2: 521
		//		               3: 580
		//		               4: 603
		//		               5: 626
		//		               6: 659
		//		               7: 681
		//		               8: 703
		//		               9: 742
		//		               10: 766
		//		               11: 805
		//		               12: 833
		//		               13: 1511
		//		               14: 1527
		//		               15: 1577
		//		               16: 1627
		//		               17: 1698
		//		               18: 1718
		//		               19: 1734
		//		               20: 1750
		//		               21: 1766
		//		               22: 1782
		//		               23: 1798
		//		               24: 1814
		//		               25: 1834
		//		               26: 2055
		//		               27: 861
		//		               28: 900
		//		               29: 939
		//		               30: 961
		//		               31: 1000
		//		               32: 1039
		//		               33: 1324
		//		               34: 1340
		//		               35: 1390
		//		               36: 1440
		//		               37: 1094
		//		               38: 1116
		//		               39: 1981
		//		               40: 2001
		//		               41: 1171
		//		               42: 1213
		//		               43: 1262
		//		               44: 1304
		//		               45: 1061
		//		               46: 1947
		//		               47: 1149
		//		               48: 2035
		//		               51: 1876
		//		               1598968902: 434
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//   10  424:aload_0         
		//   11  425:iload_1         
		//   12  426:aload_2         
		//   13  427:aload_3         
		//   14  428:iload           4
		//   15  430:invokespecial   #141 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   16  433:ireturn         

			case 1598968902: 
				parcel1.writeString("android.support.v4.media.session.IMediaSession");
		//   17  434:aload_3         
		//   18  435:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   19  437:invokevirtual   #147 <Method void Parcel.writeString(String)>
				return true;
		//   20  440:iconst_1        
		//   21  441:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   22  442:aload_2         
		//   23  443:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   24  445:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s5 = parcel.readString();
		//   25  448:aload_2         
		//   26  449:invokevirtual   #154 <Method String Parcel.readString()>
		//   27  452:astore          13
				Bundle bundle;
				if(parcel.readInt() != 0)
		//*  28  454:aload_2         
		//*  29  455:invokevirtual   #158 <Method int Parcel.readInt()>
		//*  30  458:ifeq            510
					bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
		//   31  461:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   32  464:aload_2         
		//   33  465:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   34  470:checkcast       #160 <Class Bundle>
		//   35  473:astore          12
				else
		//*  36  475:aload_2         
		//*  37  476:invokevirtual   #158 <Method int Parcel.readInt()>
		//*  38  479:ifeq            516
		//*  39  482:getstatic       #173 <Field android.os.Parcelable$Creator MediaSessionCompat$ResultReceiverWrapper.CREATOR>
		//*  40  485:aload_2         
		//*  41  486:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//*  42  491:checkcast       #172 <Class MediaSessionCompat$ResultReceiverWrapper>
		//*  43  494:astore_2        
		//*  44  495:aload_0         
		//*  45  496:aload           13
		//*  46  498:aload           12
		//*  47  500:aload_2         
		//*  48  501:invokevirtual   #177 <Method void sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
		//*  49  504:aload_3         
		//*  50  505:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//*  51  508:iconst_1        
		//*  52  509:ireturn         
					bundle = null;
		//   53  510:aconst_null     
		//   54  511:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel)));
				else
		//*  55  513:goto            475
					parcel = null;
		//   56  516:aconst_null     
		//   57  517:astore_2        
				sendCommand(s5, bundle, ((MediaSessionCompat.ResultReceiverWrapper) (parcel)));
				parcel1.writeNoException();
				return true;

		//*  58  518:goto            495
			case 2: // '\002'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   59  521:aload_2         
		//   60  522:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   61  524:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				boolean flag4;
				if(parcel.readInt() != 0)
		//*  62  527:aload_2         
		//*  63  528:invokevirtual   #158 <Method int Parcel.readInt()>
		//*  64  531:ifeq            575
					parcel = ((Parcel) ((KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel)));
		//   65  534:getstatic       #183 <Field android.os.Parcelable$Creator KeyEvent.CREATOR>
		//   66  537:aload_2         
		//   67  538:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   68  543:checkcast       #182 <Class KeyEvent>
		//   69  546:astore_2        
				else
		//*  70  547:aload_0         
		//*  71  548:aload_2         
		//*  72  549:invokevirtual   #187 <Method boolean sendMediaButton(KeyEvent)>
		//*  73  552:istore          9
		//*  74  554:aload_3         
		//*  75  555:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//*  76  558:iload           5
		//*  77  560:istore_1        
		//*  78  561:iload           9
		//*  79  563:ifeq            568
		//*  80  566:iconst_1        
		//*  81  567:istore_1        
		//*  82  568:aload_3         
		//*  83  569:iload_1         
		//*  84  570:invokevirtual   #191 <Method void Parcel.writeInt(int)>
		//*  85  573:iconst_1        
		//*  86  574:ireturn         
					parcel = null;
		//   87  575:aconst_null     
		//   88  576:astore_2        
				flag4 = sendMediaButton(((KeyEvent) (parcel)));
				parcel1.writeNoException();
				i = ((int) (flag));
				if(flag4)
					i = 1;
				parcel1.writeInt(i);
				return true;

		//*  89  577:goto            547
			case 3: // '\003'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   90  580:aload_2         
		//   91  581:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   92  583:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				registerCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
		//   93  586:aload_0         
		//   94  587:aload_2         
		//   95  588:invokevirtual   #194 <Method IBinder Parcel.readStrongBinder()>
		//   96  591:invokestatic    #199 <Method IMediaControllerCallback IMediaControllerCallback$Stub.asInterface(IBinder)>
		//   97  594:invokevirtual   #203 <Method void registerCallbackListener(IMediaControllerCallback)>
				parcel1.writeNoException();
		//   98  597:aload_3         
		//   99  598:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  100  601:iconst_1        
		//  101  602:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  102  603:aload_2         
		//  103  604:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  104  606:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
		//  105  609:aload_0         
		//  106  610:aload_2         
		//  107  611:invokevirtual   #194 <Method IBinder Parcel.readStrongBinder()>
		//  108  614:invokestatic    #199 <Method IMediaControllerCallback IMediaControllerCallback$Stub.asInterface(IBinder)>
		//  109  617:invokevirtual   #206 <Method void unregisterCallbackListener(IMediaControllerCallback)>
				parcel1.writeNoException();
		//  110  620:aload_3         
		//  111  621:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  112  624:iconst_1        
		//  113  625:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  114  626:aload_2         
		//  115  627:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  116  629:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				boolean flag5 = isTransportControlEnabled();
		//  117  632:aload_0         
		//  118  633:invokevirtual   #210 <Method boolean isTransportControlEnabled()>
		//  119  636:istore          9
				parcel1.writeNoException();
		//  120  638:aload_3         
		//  121  639:invokevirtual   #180 <Method void Parcel.writeNoException()>
				i = ((int) (flag1));
		//  122  642:iload           6
		//  123  644:istore_1        
				if(flag5)
		//* 124  645:iload           9
		//* 125  647:ifeq            652
					i = 1;
		//  126  650:iconst_1        
		//  127  651:istore_1        
				parcel1.writeInt(i);
		//  128  652:aload_3         
		//  129  653:iload_1         
		//  130  654:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  131  657:iconst_1        
		//  132  658:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  133  659:aload_2         
		//  134  660:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  135  662:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPackageName()));
		//  136  665:aload_0         
		//  137  666:invokevirtual   #213 <Method String getPackageName()>
		//  138  669:astore_2        
				parcel1.writeNoException();
		//  139  670:aload_3         
		//  140  671:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  141  674:aload_3         
		//  142  675:aload_2         
		//  143  676:invokevirtual   #147 <Method void Parcel.writeString(String)>
				return true;
		//  144  679:iconst_1        
		//  145  680:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  146  681:aload_2         
		//  147  682:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  148  684:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getTag()));
		//  149  687:aload_0         
		//  150  688:invokevirtual   #216 <Method String getTag()>
		//  151  691:astore_2        
				parcel1.writeNoException();
		//  152  692:aload_3         
		//  153  693:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  154  696:aload_3         
		//  155  697:aload_2         
		//  156  698:invokevirtual   #147 <Method void Parcel.writeString(String)>
				return true;
		//  157  701:iconst_1        
		//  158  702:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  159  703:aload_2         
		//  160  704:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  161  706:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getLaunchPendingIntent()));
		//  162  709:aload_0         
		//  163  710:invokevirtual   #220 <Method PendingIntent getLaunchPendingIntent()>
		//  164  713:astore_2        
				parcel1.writeNoException();
		//  165  714:aload_3         
		//  166  715:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 167  718:aload_2         
		//* 168  719:ifnull          735
				{
					parcel1.writeInt(1);
		//  169  722:aload_3         
		//  170  723:iconst_1        
		//  171  724:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((PendingIntent) (parcel)).writeToParcel(parcel1, 1);
		//  172  727:aload_2         
		//  173  728:aload_3         
		//  174  729:iconst_1        
		//  175  730:invokevirtual   #226 <Method void PendingIntent.writeToParcel(Parcel, int)>
					return true;
		//  176  733:iconst_1        
		//  177  734:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  178  735:aload_3         
		//  179  736:iconst_0        
		//  180  737:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  181  740:iconst_1        
		//  182  741:ireturn         
				}

			case 9: // '\t'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  183  742:aload_2         
		//  184  743:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  185  745:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				long l = getFlags();
		//  186  748:aload_0         
		//  187  749:invokevirtual   #230 <Method long getFlags()>
		//  188  752:lstore          10
				parcel1.writeNoException();
		//  189  754:aload_3         
		//  190  755:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeLong(l);
		//  191  758:aload_3         
		//  192  759:lload           10
		//  193  761:invokevirtual   #234 <Method void Parcel.writeLong(long)>
				return true;
		//  194  764:iconst_1        
		//  195  765:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  196  766:aload_2         
		//  197  767:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  198  769:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getVolumeAttributes()));
		//  199  772:aload_0         
		//  200  773:invokevirtual   #238 <Method ParcelableVolumeInfo getVolumeAttributes()>
		//  201  776:astore_2        
				parcel1.writeNoException();
		//  202  777:aload_3         
		//  203  778:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 204  781:aload_2         
		//* 205  782:ifnull          798
				{
					parcel1.writeInt(1);
		//  206  785:aload_3         
		//  207  786:iconst_1        
		//  208  787:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((ParcelableVolumeInfo) (parcel)).writeToParcel(parcel1, 1);
		//  209  790:aload_2         
		//  210  791:aload_3         
		//  211  792:iconst_1        
		//  212  793:invokevirtual   #241 <Method void ParcelableVolumeInfo.writeToParcel(Parcel, int)>
					return true;
		//  213  796:iconst_1        
		//  214  797:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  215  798:aload_3         
		//  216  799:iconst_0        
		//  217  800:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  218  803:iconst_1        
		//  219  804:ireturn         
				}

			case 11: // '\013'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  220  805:aload_2         
		//  221  806:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  222  808:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
		//  223  811:aload_0         
		//  224  812:aload_2         
		//  225  813:invokevirtual   #158 <Method int Parcel.readInt()>
		//  226  816:aload_2         
		//  227  817:invokevirtual   #158 <Method int Parcel.readInt()>
		//  228  820:aload_2         
		//  229  821:invokevirtual   #154 <Method String Parcel.readString()>
		//  230  824:invokevirtual   #245 <Method void adjustVolume(int, int, String)>
				parcel1.writeNoException();
		//  231  827:aload_3         
		//  232  828:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  233  831:iconst_1        
		//  234  832:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  235  833:aload_2         
		//  236  834:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  237  836:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
		//  238  839:aload_0         
		//  239  840:aload_2         
		//  240  841:invokevirtual   #158 <Method int Parcel.readInt()>
		//  241  844:aload_2         
		//  242  845:invokevirtual   #158 <Method int Parcel.readInt()>
		//  243  848:aload_2         
		//  244  849:invokevirtual   #154 <Method String Parcel.readString()>
		//  245  852:invokevirtual   #248 <Method void setVolumeTo(int, int, String)>
				parcel1.writeNoException();
		//  246  855:aload_3         
		//  247  856:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  248  859:iconst_1        
		//  249  860:ireturn         

			case 27: // '\033'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  250  861:aload_2         
		//  251  862:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  252  864:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getMetadata()));
		//  253  867:aload_0         
		//  254  868:invokevirtual   #252 <Method MediaMetadataCompat getMetadata()>
		//  255  871:astore_2        
				parcel1.writeNoException();
		//  256  872:aload_3         
		//  257  873:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 258  876:aload_2         
		//* 259  877:ifnull          893
				{
					parcel1.writeInt(1);
		//  260  880:aload_3         
		//  261  881:iconst_1        
		//  262  882:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((MediaMetadataCompat) (parcel)).writeToParcel(parcel1, 1);
		//  263  885:aload_2         
		//  264  886:aload_3         
		//  265  887:iconst_1        
		//  266  888:invokevirtual   #255 <Method void MediaMetadataCompat.writeToParcel(Parcel, int)>
					return true;
		//  267  891:iconst_1        
		//  268  892:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  269  893:aload_3         
		//  270  894:iconst_0        
		//  271  895:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  272  898:iconst_1        
		//  273  899:ireturn         
				}

			case 28: // '\034'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  274  900:aload_2         
		//  275  901:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  276  903:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPlaybackState()));
		//  277  906:aload_0         
		//  278  907:invokevirtual   #259 <Method PlaybackStateCompat getPlaybackState()>
		//  279  910:astore_2        
				parcel1.writeNoException();
		//  280  911:aload_3         
		//  281  912:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 282  915:aload_2         
		//* 283  916:ifnull          932
				{
					parcel1.writeInt(1);
		//  284  919:aload_3         
		//  285  920:iconst_1        
		//  286  921:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((PlaybackStateCompat) (parcel)).writeToParcel(parcel1, 1);
		//  287  924:aload_2         
		//  288  925:aload_3         
		//  289  926:iconst_1        
		//  290  927:invokevirtual   #262 <Method void PlaybackStateCompat.writeToParcel(Parcel, int)>
					return true;
		//  291  930:iconst_1        
		//  292  931:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  293  932:aload_3         
		//  294  933:iconst_0        
		//  295  934:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  296  937:iconst_1        
		//  297  938:ireturn         
				}

			case 29: // '\035'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  298  939:aload_2         
		//  299  940:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  300  942:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getQueue()));
		//  301  945:aload_0         
		//  302  946:invokevirtual   #266 <Method List getQueue()>
		//  303  949:astore_2        
				parcel1.writeNoException();
		//  304  950:aload_3         
		//  305  951:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//  306  954:aload_3         
		//  307  955:aload_2         
		//  308  956:invokevirtual   #270 <Method void Parcel.writeTypedList(List)>
				return true;
		//  309  959:iconst_1        
		//  310  960:ireturn         

			case 30: // '\036'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  311  961:aload_2         
		//  312  962:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  313  964:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getQueueTitle()));
		//  314  967:aload_0         
		//  315  968:invokevirtual   #274 <Method CharSequence getQueueTitle()>
		//  316  971:astore_2        
				parcel1.writeNoException();
		//  317  972:aload_3         
		//  318  973:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 319  976:aload_2         
		//* 320  977:ifnull          993
				{
					parcel1.writeInt(1);
		//  321  980:aload_3         
		//  322  981:iconst_1        
		//  323  982:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					TextUtils.writeToParcel(((CharSequence) (parcel)), parcel1, 1);
		//  324  985:aload_2         
		//  325  986:aload_3         
		//  326  987:iconst_1        
		//  327  988:invokestatic    #279 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
					return true;
		//  328  991:iconst_1        
		//  329  992:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  330  993:aload_3         
		//  331  994:iconst_0        
		//  332  995:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  333  998:iconst_1        
		//  334  999:ireturn         
				}

			case 31: // '\037'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  335 1000:aload_2         
		//  336 1001:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  337 1003:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getExtras()));
		//  338 1006:aload_0         
		//  339 1007:invokevirtual   #283 <Method Bundle getExtras()>
		//  340 1010:astore_2        
				parcel1.writeNoException();
		//  341 1011:aload_3         
		//  342 1012:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 343 1015:aload_2         
		//* 344 1016:ifnull          1032
				{
					parcel1.writeInt(1);
		//  345 1019:aload_3         
		//  346 1020:iconst_1        
		//  347 1021:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  348 1024:aload_2         
		//  349 1025:aload_3         
		//  350 1026:iconst_1        
		//  351 1027:invokevirtual   #284 <Method void Bundle.writeToParcel(Parcel, int)>
					return true;
		//  352 1030:iconst_1        
		//  353 1031:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  354 1032:aload_3         
		//  355 1033:iconst_0        
		//  356 1034:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  357 1037:iconst_1        
		//  358 1038:ireturn         
				}

			case 32: // ' '
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  359 1039:aload_2         
		//  360 1040:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  361 1042:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				i = getRatingType();
		//  362 1045:aload_0         
		//  363 1046:invokevirtual   #287 <Method int getRatingType()>
		//  364 1049:istore_1        
				parcel1.writeNoException();
		//  365 1050:aload_3         
		//  366 1051:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  367 1054:aload_3         
		//  368 1055:iload_1         
		//  369 1056:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  370 1059:iconst_1        
		//  371 1060:ireturn         

			case 45: // '-'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  372 1061:aload_2         
		//  373 1062:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  374 1064:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				boolean flag6 = isCaptioningEnabled();
		//  375 1067:aload_0         
		//  376 1068:invokevirtual   #290 <Method boolean isCaptioningEnabled()>
		//  377 1071:istore          9
				parcel1.writeNoException();
		//  378 1073:aload_3         
		//  379 1074:invokevirtual   #180 <Method void Parcel.writeNoException()>
				i = ((int) (flag2));
		//  380 1077:iload           7
		//  381 1079:istore_1        
				if(flag6)
		//* 382 1080:iload           9
		//* 383 1082:ifeq            1087
					i = 1;
		//  384 1085:iconst_1        
		//  385 1086:istore_1        
				parcel1.writeInt(i);
		//  386 1087:aload_3         
		//  387 1088:iload_1         
		//  388 1089:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  389 1092:iconst_1        
		//  390 1093:ireturn         

			case 37: // '%'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  391 1094:aload_2         
		//  392 1095:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  393 1097:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				i = getRepeatMode();
		//  394 1100:aload_0         
		//  395 1101:invokevirtual   #293 <Method int getRepeatMode()>
		//  396 1104:istore_1        
				parcel1.writeNoException();
		//  397 1105:aload_3         
		//  398 1106:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  399 1109:aload_3         
		//  400 1110:iload_1         
		//  401 1111:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  402 1114:iconst_1        
		//  403 1115:ireturn         

			case 38: // '&'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  404 1116:aload_2         
		//  405 1117:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  406 1119:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				boolean flag7 = isShuffleModeEnabledDeprecated();
		//  407 1122:aload_0         
		//  408 1123:invokevirtual   #296 <Method boolean isShuffleModeEnabledDeprecated()>
		//  409 1126:istore          9
				parcel1.writeNoException();
		//  410 1128:aload_3         
		//  411 1129:invokevirtual   #180 <Method void Parcel.writeNoException()>
				i = ((int) (flag3));
		//  412 1132:iload           8
		//  413 1134:istore_1        
				if(flag7)
		//* 414 1135:iload           9
		//* 415 1137:ifeq            1142
					i = 1;
		//  416 1140:iconst_1        
		//  417 1141:istore_1        
				parcel1.writeInt(i);
		//  418 1142:aload_3         
		//  419 1143:iload_1         
		//  420 1144:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  421 1147:iconst_1        
		//  422 1148:ireturn         

			case 47: // '/'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  423 1149:aload_2         
		//  424 1150:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  425 1152:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				i = getShuffleMode();
		//  426 1155:aload_0         
		//  427 1156:invokevirtual   #299 <Method int getShuffleMode()>
		//  428 1159:istore_1        
				parcel1.writeNoException();
		//  429 1160:aload_3         
		//  430 1161:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  431 1164:aload_3         
		//  432 1165:iload_1         
		//  433 1166:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  434 1169:iconst_1        
		//  435 1170:ireturn         

			case 41: // ')'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  436 1171:aload_2         
		//  437 1172:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  438 1174:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 439 1177:aload_2         
		//* 440 1178:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 441 1181:ifeq            1208
					parcel = ((Parcel) ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel)));
		//  442 1184:getstatic       #302 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  443 1187:aload_2         
		//  444 1188:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  445 1193:checkcast       #301 <Class MediaDescriptionCompat>
		//  446 1196:astore_2        
				else
		//* 447 1197:aload_0         
		//* 448 1198:aload_2         
		//* 449 1199:invokevirtual   #306 <Method void addQueueItem(MediaDescriptionCompat)>
		//* 450 1202:aload_3         
		//* 451 1203:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 452 1206:iconst_1        
		//* 453 1207:ireturn         
					parcel = null;
		//  454 1208:aconst_null     
		//  455 1209:astore_2        
				addQueueItem(((MediaDescriptionCompat) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 456 1210:goto            1197
			case 42: // '*'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  457 1213:aload_2         
		//  458 1214:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  459 1216:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				MediaDescriptionCompat mediadescriptioncompat;
				if(parcel.readInt() != 0)
		//* 460 1219:aload_2         
		//* 461 1220:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 462 1223:ifeq            1256
					mediadescriptioncompat = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
		//  463 1226:getstatic       #302 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  464 1229:aload_2         
		//  465 1230:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  466 1235:checkcast       #301 <Class MediaDescriptionCompat>
		//  467 1238:astore          12
				else
		//* 468 1240:aload_0         
		//* 469 1241:aload           12
		//* 470 1243:aload_2         
		//* 471 1244:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 472 1247:invokevirtual   #310 <Method void addQueueItemAt(MediaDescriptionCompat, int)>
		//* 473 1250:aload_3         
		//* 474 1251:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 475 1254:iconst_1        
		//* 476 1255:ireturn         
					mediadescriptioncompat = null;
		//  477 1256:aconst_null     
		//  478 1257:astore          12
				addQueueItemAt(mediadescriptioncompat, parcel.readInt());
				parcel1.writeNoException();
				return true;

		//* 479 1259:goto            1240
			case 43: // '+'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  480 1262:aload_2         
		//  481 1263:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  482 1265:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 483 1268:aload_2         
		//* 484 1269:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 485 1272:ifeq            1299
					parcel = ((Parcel) ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel)));
		//  486 1275:getstatic       #302 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  487 1278:aload_2         
		//  488 1279:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  489 1284:checkcast       #301 <Class MediaDescriptionCompat>
		//  490 1287:astore_2        
				else
		//* 491 1288:aload_0         
		//* 492 1289:aload_2         
		//* 493 1290:invokevirtual   #313 <Method void removeQueueItem(MediaDescriptionCompat)>
		//* 494 1293:aload_3         
		//* 495 1294:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 496 1297:iconst_1        
		//* 497 1298:ireturn         
					parcel = null;
		//  498 1299:aconst_null     
		//  499 1300:astore_2        
				removeQueueItem(((MediaDescriptionCompat) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 500 1301:goto            1288
			case 44: // ','
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  501 1304:aload_2         
		//  502 1305:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  503 1307:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				removeQueueItemAt(parcel.readInt());
		//  504 1310:aload_0         
		//  505 1311:aload_2         
		//  506 1312:invokevirtual   #158 <Method int Parcel.readInt()>
		//  507 1315:invokevirtual   #316 <Method void removeQueueItemAt(int)>
				parcel1.writeNoException();
		//  508 1318:aload_3         
		//  509 1319:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  510 1322:iconst_1        
		//  511 1323:ireturn         

			case 33: // '!'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  512 1324:aload_2         
		//  513 1325:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  514 1327:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				prepare();
		//  515 1330:aload_0         
		//  516 1331:invokevirtual   #319 <Method void prepare()>
				parcel1.writeNoException();
		//  517 1334:aload_3         
		//  518 1335:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  519 1338:iconst_1        
		//  520 1339:ireturn         

			case 34: // '"'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  521 1340:aload_2         
		//  522 1341:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  523 1343:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s = parcel.readString();
		//  524 1346:aload_2         
		//  525 1347:invokevirtual   #154 <Method String Parcel.readString()>
		//  526 1350:astore          12
				if(parcel.readInt() != 0)
		//* 527 1352:aload_2         
		//* 528 1353:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 529 1356:ifeq            1385
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  530 1359:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  531 1362:aload_2         
		//  532 1363:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  533 1368:checkcast       #160 <Class Bundle>
		//  534 1371:astore_2        
				else
		//* 535 1372:aload_0         
		//* 536 1373:aload           12
		//* 537 1375:aload_2         
		//* 538 1376:invokevirtual   #323 <Method void prepareFromMediaId(String, Bundle)>
		//* 539 1379:aload_3         
		//* 540 1380:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 541 1383:iconst_1        
		//* 542 1384:ireturn         
					parcel = null;
		//  543 1385:aconst_null     
		//  544 1386:astore_2        
				prepareFromMediaId(s, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 545 1387:goto            1372
			case 35: // '#'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  546 1390:aload_2         
		//  547 1391:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  548 1393:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s1 = parcel.readString();
		//  549 1396:aload_2         
		//  550 1397:invokevirtual   #154 <Method String Parcel.readString()>
		//  551 1400:astore          12
				if(parcel.readInt() != 0)
		//* 552 1402:aload_2         
		//* 553 1403:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 554 1406:ifeq            1435
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  555 1409:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  556 1412:aload_2         
		//  557 1413:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  558 1418:checkcast       #160 <Class Bundle>
		//  559 1421:astore_2        
				else
		//* 560 1422:aload_0         
		//* 561 1423:aload           12
		//* 562 1425:aload_2         
		//* 563 1426:invokevirtual   #326 <Method void prepareFromSearch(String, Bundle)>
		//* 564 1429:aload_3         
		//* 565 1430:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 566 1433:iconst_1        
		//* 567 1434:ireturn         
					parcel = null;
		//  568 1435:aconst_null     
		//  569 1436:astore_2        
				prepareFromSearch(s1, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 570 1437:goto            1422
			case 36: // '$'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  571 1440:aload_2         
		//  572 1441:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  573 1443:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				Uri uri;
				if(parcel.readInt() != 0)
		//* 574 1446:aload_2         
		//* 575 1447:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 576 1450:ifeq            1500
					uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
		//  577 1453:getstatic       #329 <Field android.os.Parcelable$Creator Uri.CREATOR>
		//  578 1456:aload_2         
		//  579 1457:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  580 1462:checkcast       #328 <Class Uri>
		//  581 1465:astore          12
				else
		//* 582 1467:aload_2         
		//* 583 1468:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 584 1471:ifeq            1506
		//* 585 1474:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//* 586 1477:aload_2         
		//* 587 1478:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 588 1483:checkcast       #160 <Class Bundle>
		//* 589 1486:astore_2        
		//* 590 1487:aload_0         
		//* 591 1488:aload           12
		//* 592 1490:aload_2         
		//* 593 1491:invokevirtual   #333 <Method void prepareFromUri(Uri, Bundle)>
		//* 594 1494:aload_3         
		//* 595 1495:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 596 1498:iconst_1        
		//* 597 1499:ireturn         
					uri = null;
		//  598 1500:aconst_null     
		//  599 1501:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
				else
		//* 600 1503:goto            1467
					parcel = null;
		//  601 1506:aconst_null     
		//  602 1507:astore_2        
				prepareFromUri(uri, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 603 1508:goto            1487
			case 13: // '\r'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  604 1511:aload_2         
		//  605 1512:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  606 1514:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				play();
		//  607 1517:aload_0         
		//  608 1518:invokevirtual   #336 <Method void play()>
				parcel1.writeNoException();
		//  609 1521:aload_3         
		//  610 1522:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  611 1525:iconst_1        
		//  612 1526:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  613 1527:aload_2         
		//  614 1528:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  615 1530:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s2 = parcel.readString();
		//  616 1533:aload_2         
		//  617 1534:invokevirtual   #154 <Method String Parcel.readString()>
		//  618 1537:astore          12
				if(parcel.readInt() != 0)
		//* 619 1539:aload_2         
		//* 620 1540:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 621 1543:ifeq            1572
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  622 1546:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  623 1549:aload_2         
		//  624 1550:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  625 1555:checkcast       #160 <Class Bundle>
		//  626 1558:astore_2        
				else
		//* 627 1559:aload_0         
		//* 628 1560:aload           12
		//* 629 1562:aload_2         
		//* 630 1563:invokevirtual   #339 <Method void playFromMediaId(String, Bundle)>
		//* 631 1566:aload_3         
		//* 632 1567:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 633 1570:iconst_1        
		//* 634 1571:ireturn         
					parcel = null;
		//  635 1572:aconst_null     
		//  636 1573:astore_2        
				playFromMediaId(s2, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 637 1574:goto            1559
			case 15: // '\017'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  638 1577:aload_2         
		//  639 1578:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  640 1580:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s3 = parcel.readString();
		//  641 1583:aload_2         
		//  642 1584:invokevirtual   #154 <Method String Parcel.readString()>
		//  643 1587:astore          12
				if(parcel.readInt() != 0)
		//* 644 1589:aload_2         
		//* 645 1590:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 646 1593:ifeq            1622
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  647 1596:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  648 1599:aload_2         
		//  649 1600:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  650 1605:checkcast       #160 <Class Bundle>
		//  651 1608:astore_2        
				else
		//* 652 1609:aload_0         
		//* 653 1610:aload           12
		//* 654 1612:aload_2         
		//* 655 1613:invokevirtual   #342 <Method void playFromSearch(String, Bundle)>
		//* 656 1616:aload_3         
		//* 657 1617:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 658 1620:iconst_1        
		//* 659 1621:ireturn         
					parcel = null;
		//  660 1622:aconst_null     
		//  661 1623:astore_2        
				playFromSearch(s3, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 662 1624:goto            1609
			case 16: // '\020'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  663 1627:aload_2         
		//  664 1628:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  665 1630:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				Uri uri1;
				if(parcel.readInt() != 0)
		//* 666 1633:aload_2         
		//* 667 1634:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 668 1637:ifeq            1687
					uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
		//  669 1640:getstatic       #329 <Field android.os.Parcelable$Creator Uri.CREATOR>
		//  670 1643:aload_2         
		//  671 1644:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  672 1649:checkcast       #328 <Class Uri>
		//  673 1652:astore          12
				else
		//* 674 1654:aload_2         
		//* 675 1655:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 676 1658:ifeq            1693
		//* 677 1661:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//* 678 1664:aload_2         
		//* 679 1665:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 680 1670:checkcast       #160 <Class Bundle>
		//* 681 1673:astore_2        
		//* 682 1674:aload_0         
		//* 683 1675:aload           12
		//* 684 1677:aload_2         
		//* 685 1678:invokevirtual   #345 <Method void playFromUri(Uri, Bundle)>
		//* 686 1681:aload_3         
		//* 687 1682:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 688 1685:iconst_1        
		//* 689 1686:ireturn         
					uri1 = null;
		//  690 1687:aconst_null     
		//  691 1688:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
				else
		//* 692 1690:goto            1654
					parcel = null;
		//  693 1693:aconst_null     
		//  694 1694:astore_2        
				playFromUri(uri1, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 695 1695:goto            1674
			case 17: // '\021'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  696 1698:aload_2         
		//  697 1699:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  698 1701:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				skipToQueueItem(parcel.readLong());
		//  699 1704:aload_0         
		//  700 1705:aload_2         
		//  701 1706:invokevirtual   #348 <Method long Parcel.readLong()>
		//  702 1709:invokevirtual   #351 <Method void skipToQueueItem(long)>
				parcel1.writeNoException();
		//  703 1712:aload_3         
		//  704 1713:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  705 1716:iconst_1        
		//  706 1717:ireturn         

			case 18: // '\022'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  707 1718:aload_2         
		//  708 1719:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  709 1721:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				pause();
		//  710 1724:aload_0         
		//  711 1725:invokevirtual   #354 <Method void pause()>
				parcel1.writeNoException();
		//  712 1728:aload_3         
		//  713 1729:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  714 1732:iconst_1        
		//  715 1733:ireturn         

			case 19: // '\023'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  716 1734:aload_2         
		//  717 1735:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  718 1737:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				stop();
		//  719 1740:aload_0         
		//  720 1741:invokevirtual   #357 <Method void stop()>
				parcel1.writeNoException();
		//  721 1744:aload_3         
		//  722 1745:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  723 1748:iconst_1        
		//  724 1749:ireturn         

			case 20: // '\024'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  725 1750:aload_2         
		//  726 1751:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  727 1753:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				next();
		//  728 1756:aload_0         
		//  729 1757:invokevirtual   #360 <Method void next()>
				parcel1.writeNoException();
		//  730 1760:aload_3         
		//  731 1761:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  732 1764:iconst_1        
		//  733 1765:ireturn         

			case 21: // '\025'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  734 1766:aload_2         
		//  735 1767:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  736 1769:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				previous();
		//  737 1772:aload_0         
		//  738 1773:invokevirtual   #363 <Method void previous()>
				parcel1.writeNoException();
		//  739 1776:aload_3         
		//  740 1777:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  741 1780:iconst_1        
		//  742 1781:ireturn         

			case 22: // '\026'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  743 1782:aload_2         
		//  744 1783:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  745 1785:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				fastForward();
		//  746 1788:aload_0         
		//  747 1789:invokevirtual   #366 <Method void fastForward()>
				parcel1.writeNoException();
		//  748 1792:aload_3         
		//  749 1793:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  750 1796:iconst_1        
		//  751 1797:ireturn         

			case 23: // '\027'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  752 1798:aload_2         
		//  753 1799:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  754 1801:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				rewind();
		//  755 1804:aload_0         
		//  756 1805:invokevirtual   #369 <Method void rewind()>
				parcel1.writeNoException();
		//  757 1808:aload_3         
		//  758 1809:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  759 1812:iconst_1        
		//  760 1813:ireturn         

			case 24: // '\030'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  761 1814:aload_2         
		//  762 1815:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  763 1817:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				seekTo(parcel.readLong());
		//  764 1820:aload_0         
		//  765 1821:aload_2         
		//  766 1822:invokevirtual   #348 <Method long Parcel.readLong()>
		//  767 1825:invokevirtual   #372 <Method void seekTo(long)>
				parcel1.writeNoException();
		//  768 1828:aload_3         
		//  769 1829:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  770 1832:iconst_1        
		//  771 1833:ireturn         

			case 25: // '\031'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  772 1834:aload_2         
		//  773 1835:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  774 1837:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 775 1840:aload_2         
		//* 776 1841:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 777 1844:ifeq            1871
					parcel = ((Parcel) ((RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel)));
		//  778 1847:getstatic       #375 <Field android.os.Parcelable$Creator RatingCompat.CREATOR>
		//  779 1850:aload_2         
		//  780 1851:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  781 1856:checkcast       #374 <Class RatingCompat>
		//  782 1859:astore_2        
				else
		//* 783 1860:aload_0         
		//* 784 1861:aload_2         
		//* 785 1862:invokevirtual   #379 <Method void rate(RatingCompat)>
		//* 786 1865:aload_3         
		//* 787 1866:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 788 1869:iconst_1        
		//* 789 1870:ireturn         
					parcel = null;
		//  790 1871:aconst_null     
		//  791 1872:astore_2        
				rate(((RatingCompat) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 792 1873:goto            1860
			case 51: // '3'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  793 1876:aload_2         
		//  794 1877:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  795 1879:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				RatingCompat ratingcompat;
				if(parcel.readInt() != 0)
		//* 796 1882:aload_2         
		//* 797 1883:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 798 1886:ifeq            1936
					ratingcompat = (RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel);
		//  799 1889:getstatic       #375 <Field android.os.Parcelable$Creator RatingCompat.CREATOR>
		//  800 1892:aload_2         
		//  801 1893:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  802 1898:checkcast       #374 <Class RatingCompat>
		//  803 1901:astore          12
				else
		//* 804 1903:aload_2         
		//* 805 1904:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 806 1907:ifeq            1942
		//* 807 1910:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//* 808 1913:aload_2         
		//* 809 1914:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 810 1919:checkcast       #160 <Class Bundle>
		//* 811 1922:astore_2        
		//* 812 1923:aload_0         
		//* 813 1924:aload           12
		//* 814 1926:aload_2         
		//* 815 1927:invokevirtual   #383 <Method void rateWithExtras(RatingCompat, Bundle)>
		//* 816 1930:aload_3         
		//* 817 1931:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 818 1934:iconst_1        
		//* 819 1935:ireturn         
					ratingcompat = null;
		//  820 1936:aconst_null     
		//  821 1937:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
				else
		//* 822 1939:goto            1903
					parcel = null;
		//  823 1942:aconst_null     
		//  824 1943:astore_2        
				rateWithExtras(ratingcompat, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 825 1944:goto            1923
			case 46: // '.'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  826 1947:aload_2         
		//  827 1948:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  828 1950:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				boolean flag8;
				if(parcel.readInt() != 0)
		//* 829 1953:aload_2         
		//* 830 1954:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 831 1957:ifeq            1975
					flag8 = true;
		//  832 1960:iconst_1        
		//  833 1961:istore          9
				else
		//* 834 1963:aload_0         
		//* 835 1964:iload           9
		//* 836 1966:invokevirtual   #387 <Method void setCaptioningEnabled(boolean)>
		//* 837 1969:aload_3         
		//* 838 1970:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 839 1973:iconst_1        
		//* 840 1974:ireturn         
					flag8 = false;
		//  841 1975:iconst_0        
		//  842 1976:istore          9
				setCaptioningEnabled(flag8);
				parcel1.writeNoException();
				return true;

		//* 843 1978:goto            1963
			case 39: // '\''
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  844 1981:aload_2         
		//  845 1982:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  846 1984:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				setRepeatMode(parcel.readInt());
		//  847 1987:aload_0         
		//  848 1988:aload_2         
		//  849 1989:invokevirtual   #158 <Method int Parcel.readInt()>
		//  850 1992:invokevirtual   #390 <Method void setRepeatMode(int)>
				parcel1.writeNoException();
		//  851 1995:aload_3         
		//  852 1996:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  853 1999:iconst_1        
		//  854 2000:ireturn         

			case 40: // '('
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  855 2001:aload_2         
		//  856 2002:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  857 2004:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				boolean flag9;
				if(parcel.readInt() != 0)
		//* 858 2007:aload_2         
		//* 859 2008:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 860 2011:ifeq            2029
					flag9 = true;
		//  861 2014:iconst_1        
		//  862 2015:istore          9
				else
		//* 863 2017:aload_0         
		//* 864 2018:iload           9
		//* 865 2020:invokevirtual   #393 <Method void setShuffleModeEnabledDeprecated(boolean)>
		//* 866 2023:aload_3         
		//* 867 2024:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 868 2027:iconst_1        
		//* 869 2028:ireturn         
					flag9 = false;
		//  870 2029:iconst_0        
		//  871 2030:istore          9
				setShuffleModeEnabledDeprecated(flag9);
				parcel1.writeNoException();
				return true;

		//* 872 2032:goto            2017
			case 48: // '0'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  873 2035:aload_2         
		//  874 2036:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  875 2038:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				setShuffleMode(parcel.readInt());
		//  876 2041:aload_0         
		//  877 2042:aload_2         
		//  878 2043:invokevirtual   #158 <Method int Parcel.readInt()>
		//  879 2046:invokevirtual   #396 <Method void setShuffleMode(int)>
				parcel1.writeNoException();
		//  880 2049:aload_3         
		//  881 2050:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  882 2053:iconst_1        
		//  883 2054:ireturn         

			case 26: // '\032'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  884 2055:aload_2         
		//  885 2056:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  886 2058:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				s4 = parcel.readString();
		//  887 2061:aload_2         
		//  888 2062:invokevirtual   #154 <Method String Parcel.readString()>
		//  889 2065:astore          12
				break;
			}
			if(parcel.readInt() != 0)
		//* 890 2067:aload_2         
		//* 891 2068:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 892 2071:ifeq            2100
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  893 2074:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  894 2077:aload_2         
		//  895 2078:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  896 2083:checkcast       #160 <Class Bundle>
		//  897 2086:astore_2        
			else
		//* 898 2087:aload_0         
		//* 899 2088:aload           12
		//* 900 2090:aload_2         
		//* 901 2091:invokevirtual   #399 <Method void sendCustomAction(String, Bundle)>
		//* 902 2094:aload_3         
		//* 903 2095:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 904 2098:iconst_1        
		//* 905 2099:ireturn         
				parcel = null;
		//  906 2100:aconst_null     
		//  907 2101:astore_2        
			sendCustomAction(s4, ((Bundle) (parcel)));
			parcel1.writeNoException();
			return true;
		//* 908 2102:goto            2087
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
		static final int TRANSACTION_getShuffleMode = 47;
		static final int TRANSACTION_getTag = 7;
		static final int TRANSACTION_getVolumeAttributes = 10;
		static final int TRANSACTION_isCaptioningEnabled = 45;
		static final int TRANSACTION_isShuffleModeEnabledDeprecated = 38;
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
		static final int TRANSACTION_rateWithExtras = 51;
		static final int TRANSACTION_registerCallbackListener = 3;
		static final int TRANSACTION_removeQueueItem = 43;
		static final int TRANSACTION_removeQueueItemAt = 44;
		static final int TRANSACTION_rewind = 23;
		static final int TRANSACTION_seekTo = 24;
		static final int TRANSACTION_sendCommand = 1;
		static final int TRANSACTION_sendCustomAction = 26;
		static final int TRANSACTION_sendMediaButton = 2;
		static final int TRANSACTION_setCaptioningEnabled = 46;
		static final int TRANSACTION_setRepeatMode = 39;
		static final int TRANSACTION_setShuffleMode = 48;
		static final int TRANSACTION_setShuffleModeEnabledDeprecated = 40;
		static final int TRANSACTION_setVolumeTo = 12;
		static final int TRANSACTION_skipToQueueItem = 17;
		static final int TRANSACTION_stop = 19;
		static final int TRANSACTION_unregisterCallbackListener = 4;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #117 <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.v4.media.session.IMediaSession");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//    5    8:invokevirtual   #121 <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
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
				break MISSING_BLOCK_LABEL_57;
		//    7   14:aload_1         
		//    8   15:ifnull          57
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mediadescriptioncompat.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(41, parcel, parcel1, 0);
		//   16   29:aload_0         
		//   17   30:getfield        #19  <Field IBinder mRemote>
		//   18   33:bipush          41
		//   19   35:aload_2         
		//   20   36:aload_3         
		//   21   37:iconst_0        
		//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   43:pop             
			parcel1.readException();
		//   24   44:aload_3         
		//   25   45:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   56:return          
			parcel.writeInt(0);
		//   31   57:aload_2         
		//   32   58:iconst_0        
		//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  34   62:goto            29
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
				break MISSING_BLOCK_LABEL_66;
		//    7   15:aload_1         
		//    8   16:ifnull          66
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mediadescriptioncompat.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
_L1:
			parcel.writeInt(i);
		//   16   30:aload_3         
		//   17   31:iload_2         
		//   18   32:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(42, parcel, parcel1, 0);
		//   19   35:aload_0         
		//   20   36:getfield        #19  <Field IBinder mRemote>
		//   21   39:bipush          42
		//   22   41:aload_3         
		//   23   42:aload           4
		//   24   44:iconst_0        
		//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   50:pop             
			parcel1.readException();
		//   27   51:aload           4
		//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   29   56:aload           4
		//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   61:aload_3         
		//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   33   65:return          
			parcel.writeInt(0);
		//   34   66:aload_3         
		//   35   67:iconst_0        
		//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   71:goto            30
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
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:ifeq            63
_L1:
			Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #81  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #77  <Class Bundle>
		//   24   52:astore_1        
_L4:
			parcel1.recycle();
		//   25   53:aload_3         
		//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   57:aload_2         
		//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
			return bundle;
		//   29   61:aload_1         
		//   30   62:areturn         
_L2:
			bundle = null;
		//   31   63:aconst_null     
		//   32   64:astore_1        
			if(true) goto _L4; else goto _L3
		//   33   65:goto            53
_L3:
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
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:ifeq            63
_L1:
			PendingIntent pendingintent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #99  <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #98  <Class PendingIntent>
		//   24   52:astore_1        
_L4:
			parcel1.recycle();
		//   25   53:aload_3         
		//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   57:aload_2         
		//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
			return pendingintent;
		//   29   61:aload_1         
		//   30   62:areturn         
_L2:
			pendingintent = null;
		//   31   63:aconst_null     
		//   32   64:astore_1        
			if(true) goto _L4; else goto _L3
		//   33   65:goto            53
_L3:
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
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:ifeq            63
_L1:
			MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #104 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #103 <Class MediaMetadataCompat>
		//   24   52:astore_1        
_L4:
			parcel1.recycle();
		//   25   53:aload_3         
		//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   57:aload_2         
		//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
			return mediametadatacompat;
		//   29   61:aload_1         
		//   30   62:areturn         
_L2:
			mediametadatacompat = null;
		//   31   63:aconst_null     
		//   32   64:astore_1        
			if(true) goto _L4; else goto _L3
		//   33   65:goto            53
_L3:
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
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:ifeq            63
_L1:
			PlaybackStateCompat playbackstatecompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #113 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #112 <Class PlaybackStateCompat>
		//   24   52:astore_1        
_L4:
			parcel1.recycle();
		//   25   53:aload_3         
		//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   57:aload_2         
		//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
			return playbackstatecompat;
		//   29   61:aload_1         
		//   30   62:areturn         
_L2:
			playbackstatecompat = null;
		//   31   63:aconst_null     
		//   32   64:astore_1        
			if(true) goto _L4; else goto _L3
		//   33   65:goto            53
_L3:
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
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:ifeq            63
_L1:
			CharSequence charsequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #131 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #133 <Class CharSequence>
		//   24   52:astore_1        
_L4:
			parcel1.recycle();
		//   25   53:aload_3         
		//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   57:aload_2         
		//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
			return charsequence;
		//   29   61:aload_1         
		//   30   62:areturn         
_L2:
			charsequence = null;
		//   31   63:aconst_null     
		//   32   64:astore_1        
			if(true) goto _L4; else goto _L3
		//   33   65:goto            53
_L3:
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

		public int getShuffleMode()
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
			mRemote.transact(47, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          47
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
			if(parcel1.readInt() == 0) goto _L2; else goto _L1
		//   17   33:aload_3         
		//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
		//   19   37:ifeq            63
_L1:
			ParcelableVolumeInfo parcelablevolumeinfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #142 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #141 <Class ParcelableVolumeInfo>
		//   24   52:astore_1        
_L4:
			parcel1.recycle();
		//   25   53:aload_3         
		//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   57:aload_2         
		//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
			return parcelablevolumeinfo;
		//   29   61:aload_1         
		//   30   62:areturn         
_L2:
			parcelablevolumeinfo = null;
		//   31   63:aconst_null     
		//   32   64:astore_1        
			if(true) goto _L4; else goto _L3
		//   33   65:goto            53
_L3:
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

		public boolean isCaptioningEnabled()
			throws RemoteException
		{
			boolean flag;
			Parcel parcel;
			Parcel parcel1;
			flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore_3        
			parcel1 = Parcel.obtain();
		//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5    9:astore          4
			int i;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    6   11:aload_3         
		//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(45, parcel, parcel1, 0);
		//    9   17:aload_0         
		//   10   18:getfield        #19  <Field IBinder mRemote>
		//   11   21:bipush          45
		//   12   23:aload_3         
		//   13   24:aload           4
		//   14   26:iconst_0        
		//   15   27:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   16   32:pop             
			parcel1.readException();
		//   17   33:aload           4
		//   18   35:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   19   38:aload           4
		//   20   40:invokevirtual   #75  <Method int Parcel.readInt()>
		//   21   43:istore_1        
			if(i != 0)
		//*  22   44:iload_1         
		//*  23   45:ifeq            50
				flag = true;
		//   24   48:iconst_1        
		//   25   49:istore_2        
			parcel1.recycle();
		//   26   50:aload           4
		//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_3         
		//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   30   59:iload_2         
		//   31   60:ireturn         
			Exception exception;
			exception;
		//   32   61:astore          5
			parcel1.recycle();
		//   33   63:aload           4
		//   34   65:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   68:aload_3         
		//   36   69:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   37   72:aload           5
		//   38   74:athrow          
		}

		public boolean isShuffleModeEnabledDeprecated()
			throws RemoteException
		{
			boolean flag;
			Parcel parcel;
			Parcel parcel1;
			flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore_3        
			parcel1 = Parcel.obtain();
		//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5    9:astore          4
			int i;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    6   11:aload_3         
		//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(38, parcel, parcel1, 0);
		//    9   17:aload_0         
		//   10   18:getfield        #19  <Field IBinder mRemote>
		//   11   21:bipush          38
		//   12   23:aload_3         
		//   13   24:aload           4
		//   14   26:iconst_0        
		//   15   27:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   16   32:pop             
			parcel1.readException();
		//   17   33:aload           4
		//   18   35:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   19   38:aload           4
		//   20   40:invokevirtual   #75  <Method int Parcel.readInt()>
		//   21   43:istore_1        
			if(i != 0)
		//*  22   44:iload_1         
		//*  23   45:ifeq            50
				flag = true;
		//   24   48:iconst_1        
		//   25   49:istore_2        
			parcel1.recycle();
		//   26   50:aload           4
		//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   55:aload_3         
		//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   30   59:iload_2         
		//   31   60:ireturn         
			Exception exception;
			exception;
		//   32   61:astore          5
			parcel1.recycle();
		//   33   63:aload           4
		//   34   65:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   68:aload_3         
		//   36   69:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   37   72:aload           5
		//   38   74:athrow          
		}

		public boolean isTransportControlEnabled()
			throws RemoteException
		{
			boolean flag;
			Parcel parcel;
			Parcel parcel1;
			flag = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore_3        
			parcel1 = Parcel.obtain();
		//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5    9:astore          4
			int i;
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    6   11:aload_3         
		//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(5, parcel, parcel1, 0);
		//    9   17:aload_0         
		//   10   18:getfield        #19  <Field IBinder mRemote>
		//   11   21:iconst_5        
		//   12   22:aload_3         
		//   13   23:aload           4
		//   14   25:iconst_0        
		//   15   26:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   16   31:pop             
			parcel1.readException();
		//   17   32:aload           4
		//   18   34:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   19   37:aload           4
		//   20   39:invokevirtual   #75  <Method int Parcel.readInt()>
		//   21   42:istore_1        
			if(i != 0)
		//*  22   43:iload_1         
		//*  23   44:ifeq            49
				flag = true;
		//   24   47:iconst_1        
		//   25   48:istore_2        
			parcel1.recycle();
		//   26   49:aload           4
		//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   54:aload_3         
		//   29   55:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   30   58:iload_2         
		//   31   59:ireturn         
			Exception exception;
			exception;
		//   32   60:astore          5
			parcel1.recycle();
		//   33   62:aload           4
		//   34   64:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   67:aload_3         
		//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   37   71:aload           5
		//   38   73:athrow          
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
				break MISSING_BLOCK_LABEL_66;
		//   10   20:aload_2         
		//   11   21:ifnull          66
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(14, parcel, parcel1, 0);
		//   19   35:aload_0         
		//   20   36:getfield        #19  <Field IBinder mRemote>
		//   21   39:bipush          14
		//   22   41:aload_3         
		//   23   42:aload           4
		//   24   44:iconst_0        
		//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   50:pop             
			parcel1.readException();
		//   27   51:aload           4
		//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   29   56:aload           4
		//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   61:aload_3         
		//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   33   65:return          
			parcel.writeInt(0);
		//   34   66:aload_3         
		//   35   67:iconst_0        
		//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   71:goto            35
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
				break MISSING_BLOCK_LABEL_66;
		//   10   20:aload_2         
		//   11   21:ifnull          66
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(15, parcel, parcel1, 0);
		//   19   35:aload_0         
		//   20   36:getfield        #19  <Field IBinder mRemote>
		//   21   39:bipush          15
		//   22   41:aload_3         
		//   23   42:aload           4
		//   24   44:iconst_0        
		//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   50:pop             
			parcel1.readException();
		//   27   51:aload           4
		//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   29   56:aload           4
		//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   61:aload_3         
		//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   33   65:return          
			parcel.writeInt(0);
		//   34   66:aload_3         
		//   35   67:iconst_0        
		//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   71:goto            35
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
			if(uri == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #158 <Method void Uri.writeToParcel(Parcel, int)>
_L3:
			if(bundle == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(16, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          16
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			uri;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #58  <Method void Parcel.recycle()>
			throw uri;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
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
				break MISSING_BLOCK_LABEL_66;
		//   10   20:aload_2         
		//   11   21:ifnull          66
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(34, parcel, parcel1, 0);
		//   19   35:aload_0         
		//   20   36:getfield        #19  <Field IBinder mRemote>
		//   21   39:bipush          34
		//   22   41:aload_3         
		//   23   42:aload           4
		//   24   44:iconst_0        
		//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   50:pop             
			parcel1.readException();
		//   27   51:aload           4
		//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   29   56:aload           4
		//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   61:aload_3         
		//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   33   65:return          
			parcel.writeInt(0);
		//   34   66:aload_3         
		//   35   67:iconst_0        
		//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   71:goto            35
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
				break MISSING_BLOCK_LABEL_66;
		//   10   20:aload_2         
		//   11   21:ifnull          66
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(35, parcel, parcel1, 0);
		//   19   35:aload_0         
		//   20   36:getfield        #19  <Field IBinder mRemote>
		//   21   39:bipush          35
		//   22   41:aload_3         
		//   23   42:aload           4
		//   24   44:iconst_0        
		//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   50:pop             
			parcel1.readException();
		//   27   51:aload           4
		//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   29   56:aload           4
		//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   61:aload_3         
		//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   33   65:return          
			parcel.writeInt(0);
		//   34   66:aload_3         
		//   35   67:iconst_0        
		//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   71:goto            35
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
			if(uri == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #158 <Method void Uri.writeToParcel(Parcel, int)>
_L3:
			if(bundle == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(36, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          36
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			uri;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #58  <Method void Parcel.recycle()>
			throw uri;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
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
				break MISSING_BLOCK_LABEL_57;
		//    7   14:aload_1         
		//    8   15:ifnull          57
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			ratingcompat.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #168 <Method void RatingCompat.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(25, parcel, parcel1, 0);
		//   16   29:aload_0         
		//   17   30:getfield        #19  <Field IBinder mRemote>
		//   18   33:bipush          25
		//   19   35:aload_2         
		//   20   36:aload_3         
		//   21   37:iconst_0        
		//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   43:pop             
			parcel1.readException();
		//   24   44:aload_3         
		//   25   45:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   56:return          
			parcel.writeInt(0);
		//   31   57:aload_2         
		//   32   58:iconst_0        
		//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  34   62:goto            29
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

		public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
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
			if(ratingcompat == null) goto _L2; else goto _L1
		//    7   15:aload_1         
		//    8   16:ifnull          76
_L1:
			parcel.writeInt(1);
		//    9   19:aload_3         
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			ratingcompat.writeToParcel(parcel, 0);
		//   12   24:aload_1         
		//   13   25:aload_3         
		//   14   26:iconst_0        
		//   15   27:invokevirtual   #168 <Method void RatingCompat.writeToParcel(Parcel, int)>
_L3:
			if(bundle == null)
				break MISSING_BLOCK_LABEL_96;
		//   16   30:aload_2         
		//   17   31:ifnull          96
			parcel.writeInt(1);
		//   18   34:aload_3         
		//   19   35:iconst_1        
		//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   21   39:aload_2         
		//   22   40:aload_3         
		//   23   41:iconst_0        
		//   24   42:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(51, parcel, parcel1, 0);
		//   25   45:aload_0         
		//   26   46:getfield        #19  <Field IBinder mRemote>
		//   27   49:bipush          51
		//   28   51:aload_3         
		//   29   52:aload           4
		//   30   54:iconst_0        
		//   31   55:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   32   60:pop             
			parcel1.readException();
		//   33   61:aload           4
		//   34   63:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   35   66:aload           4
		//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   71:aload_3         
		//   38   72:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   39   75:return          
_L2:
			parcel.writeInt(0);
		//   40   76:aload_3         
		//   41   77:iconst_0        
		//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  43   81:goto            30
			ratingcompat;
		//   44   84:astore_1        
			parcel1.recycle();
		//   45   85:aload           4
		//   46   87:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47   90:aload_3         
		//   48   91:invokevirtual   #58  <Method void Parcel.recycle()>
			throw ratingcompat;
		//   49   94:aload_1         
		//   50   95:athrow          
			parcel.writeInt(0);
		//   51   96:aload_3         
		//   52   97:iconst_0        
		//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  54  101:goto            45
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
			if(imediacontrollercallback == null)
				break MISSING_BLOCK_LABEL_57;
		//    7   14:aload_1         
		//    8   15:ifnull          57
			imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #176 <Method IBinder IMediaControllerCallback.asBinder()>
		//   11   24:astore_1        
_L1:
			parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
		//   12   25:aload_2         
		//   13   26:aload_1         
		//   14   27:invokevirtual   #179 <Method void Parcel.writeStrongBinder(IBinder)>
			mRemote.transact(3, parcel, parcel1, 0);
		//   15   30:aload_0         
		//   16   31:getfield        #19  <Field IBinder mRemote>
		//   17   34:iconst_3        
		//   18   35:aload_2         
		//   19   36:aload_3         
		//   20   37:iconst_0        
		//   21   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   22   43:pop             
			parcel1.readException();
		//   23   44:aload_3         
		//   24   45:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   25   48:aload_3         
		//   26   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   52:aload_2         
		//   28   53:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   29   56:return          
			imediacontrollercallback = null;
		//   30   57:aconst_null     
		//   31   58:astore_1        
			  goto _L1
		//*  32   59:goto            25
			imediacontrollercallback;
		//   33   62:astore_1        
			parcel1.recycle();
		//   34   63:aload_3         
		//   35   64:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   67:aload_2         
		//   37   68:invokevirtual   #58  <Method void Parcel.recycle()>
			throw imediacontrollercallback;
		//   38   71:aload_1         
		//   39   72:athrow          
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
				break MISSING_BLOCK_LABEL_57;
		//    7   14:aload_1         
		//    8   15:ifnull          57
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mediadescriptioncompat.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(43, parcel, parcel1, 0);
		//   16   29:aload_0         
		//   17   30:getfield        #19  <Field IBinder mRemote>
		//   18   33:bipush          43
		//   19   35:aload_2         
		//   20   36:aload_3         
		//   21   37:iconst_0        
		//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   43:pop             
			parcel1.readException();
		//   24   44:aload_3         
		//   25   45:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   56:return          
			parcel.writeInt(0);
		//   31   57:aload_2         
		//   32   58:iconst_0        
		//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  34   62:goto            29
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
		//    9   17:invokevirtual   #187 <Method void Parcel.writeLong(long)>
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
			if(bundle == null) goto _L2; else goto _L1
		//   10   23:aload_2         
		//   11   24:ifnull          89
_L1:
			parcel.writeInt(1);
		//   12   27:aload           4
		//   13   29:iconst_1        
		//   14   30:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   33:aload_2         
		//   16   34:aload           4
		//   17   36:iconst_0        
		//   18   37:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L3:
			if(resultreceiverwrapper == null)
				break MISSING_BLOCK_LABEL_111;
		//   19   40:aload_3         
		//   20   41:ifnull          111
			parcel.writeInt(1);
		//   21   44:aload           4
		//   22   46:iconst_1        
		//   23   47:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			resultreceiverwrapper.writeToParcel(parcel, 0);
		//   24   50:aload_3         
		//   25   51:aload           4
		//   26   53:iconst_0        
		//   27   54:invokevirtual   #192 <Method void MediaSessionCompat$ResultReceiverWrapper.writeToParcel(Parcel, int)>
_L4:
			mRemote.transact(1, parcel, parcel1, 0);
		//   28   57:aload_0         
		//   29   58:getfield        #19  <Field IBinder mRemote>
		//   30   61:iconst_1        
		//   31   62:aload           4
		//   32   64:aload           5
		//   33   66:iconst_0        
		//   34   67:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   35   72:pop             
			parcel1.readException();
		//   36   73:aload           5
		//   37   75:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   38   78:aload           5
		//   39   80:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   40   83:aload           4
		//   41   85:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   42   88:return          
_L2:
			parcel.writeInt(0);
		//   43   89:aload           4
		//   44   91:iconst_0        
		//   45   92:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  46   95:goto            40
			s;
		//   47   98:astore_1        
			parcel1.recycle();
		//   48   99:aload           5
		//   49  101:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   50  104:aload           4
		//   51  106:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   52  109:aload_1         
		//   53  110:athrow          
			parcel.writeInt(0);
		//   54  111:aload           4
		//   55  113:iconst_0        
		//   56  114:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L4
		//*  57  117:goto            57
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
				break MISSING_BLOCK_LABEL_66;
		//   10   20:aload_2         
		//   11   21:ifnull          66
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
			mRemote.transact(26, parcel, parcel1, 0);
		//   19   35:aload_0         
		//   20   36:getfield        #19  <Field IBinder mRemote>
		//   21   39:bipush          26
		//   22   41:aload_3         
		//   23   42:aload           4
		//   24   44:iconst_0        
		//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   26   50:pop             
			parcel1.readException();
		//   27   51:aload           4
		//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   29   56:aload           4
		//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   61:aload_3         
		//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   33   65:return          
			parcel.writeInt(0);
		//   34   66:aload_3         
		//   35   67:iconst_0        
		//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  37   71:goto            35
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
			boolean flag;
			Parcel parcel;
			Parcel parcel1;
			flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore          4
			parcel1 = Parcel.obtain();
		//    4    7:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5   10:astore          5
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    6   12:aload           4
		//    7   14:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    8   16:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(keyevent == null)
				break MISSING_BLOCK_LABEL_79;
		//    9   19:aload_1         
		//   10   20:ifnull          79
			parcel.writeInt(1);
		//   11   23:aload           4
		//   12   25:iconst_1        
		//   13   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			keyevent.writeToParcel(parcel, 0);
		//   14   29:aload_1         
		//   15   30:aload           4
		//   16   32:iconst_0        
		//   17   33:invokevirtual   #198 <Method void KeyEvent.writeToParcel(Parcel, int)>
_L1:
			int i;
			mRemote.transact(2, parcel, parcel1, 0);
		//   18   36:aload_0         
		//   19   37:getfield        #19  <Field IBinder mRemote>
		//   20   40:iconst_2        
		//   21   41:aload           4
		//   22   43:aload           5
		//   23   45:iconst_0        
		//   24   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   51:pop             
			parcel1.readException();
		//   26   52:aload           5
		//   27   54:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   28   57:aload           5
		//   29   59:invokevirtual   #75  <Method int Parcel.readInt()>
		//   30   62:istore_2        
			if(i == 0)
		//*  31   63:iload_2         
		//*  32   64:ifeq            101
		//*  33   67:aload           5
		//*  34   69:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  35   72:aload           4
		//*  36   74:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  37   77:iload_3         
		//*  38   78:ireturn         
		//*  39   79:aload           4
		//*  40   81:iconst_0        
		//*  41   82:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  42   85:goto            36
		//*  43   88:astore_1        
		//*  44   89:aload           5
		//*  45   91:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  46   94:aload           4
		//*  47   96:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  48   99:aload_1         
		//*  49  100:athrow          
				flag = false;
		//   50  101:iconst_0        
		//   51  102:istore_3        
			parcel1.recycle();
			parcel.recycle();
			return flag;
			parcel.writeInt(0);
			  goto _L1
			keyevent;
			parcel1.recycle();
			parcel.recycle();
			throw keyevent;
		//*  52  103:goto            67
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			int i;
			Parcel parcel;
			Parcel parcel1;
			i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore_3        
			parcel1 = Parcel.obtain();
		//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5    9:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    6   11:aload_3         
		//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(flag)
		//*   9   17:iload_1         
		//*  10   18:ifeq            23
				i = 1;
		//   11   21:iconst_1        
		//   12   22:istore_2        
			parcel.writeInt(i);
		//   13   23:aload_3         
		//   14   24:iload_2         
		//   15   25:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(46, parcel, parcel1, 0);
		//   16   28:aload_0         
		//   17   29:getfield        #19  <Field IBinder mRemote>
		//   18   32:bipush          46
		//   19   34:aload_3         
		//   20   35:aload           4
		//   21   37:iconst_0        
		//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   43:pop             
			parcel1.readException();
		//   24   44:aload           4
		//   25   46:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   49:aload           4
		//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   54:aload_3         
		//   29   55:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   58:return          
			Exception exception;
			exception;
		//   31   59:astore          5
			parcel1.recycle();
		//   32   61:aload           4
		//   33   63:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   66:aload_3         
		//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   36   70:aload           5
		//   37   72:athrow          
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

		public void setShuffleMode(int i)
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
			mRemote.transact(48, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          48
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

		public void setShuffleModeEnabledDeprecated(boolean flag)
			throws RemoteException
		{
			int i;
			Parcel parcel;
			Parcel parcel1;
			i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore_3        
			parcel1 = Parcel.obtain();
		//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    5    9:astore          4
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
		//    6   11:aload_3         
		//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
		//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(flag)
		//*   9   17:iload_1         
		//*  10   18:ifeq            23
				i = 1;
		//   11   21:iconst_1        
		//   12   22:istore_2        
			parcel.writeInt(i);
		//   13   23:aload_3         
		//   14   24:iload_2         
		//   15   25:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(40, parcel, parcel1, 0);
		//   16   28:aload_0         
		//   17   29:getfield        #19  <Field IBinder mRemote>
		//   18   32:bipush          40
		//   19   34:aload_3         
		//   20   35:aload           4
		//   21   37:iconst_0        
		//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   43:pop             
			parcel1.readException();
		//   24   44:aload           4
		//   25   46:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   49:aload           4
		//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   54:aload_3         
		//   29   55:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   58:return          
			Exception exception;
			exception;
		//   31   59:astore          5
			parcel1.recycle();
		//   32   61:aload           4
		//   33   63:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   34   66:aload_3         
		//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   36   70:aload           5
		//   37   72:athrow          
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
		//    9   17:invokevirtual   #187 <Method void Parcel.writeLong(long)>
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
			if(imediacontrollercallback == null)
				break MISSING_BLOCK_LABEL_57;
		//    7   14:aload_1         
		//    8   15:ifnull          57
			imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
		//    9   18:aload_1         
		//   10   19:invokeinterface #176 <Method IBinder IMediaControllerCallback.asBinder()>
		//   11   24:astore_1        
_L1:
			parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
		//   12   25:aload_2         
		//   13   26:aload_1         
		//   14   27:invokevirtual   #179 <Method void Parcel.writeStrongBinder(IBinder)>
			mRemote.transact(4, parcel, parcel1, 0);
		//   15   30:aload_0         
		//   16   31:getfield        #19  <Field IBinder mRemote>
		//   17   34:iconst_4        
		//   18   35:aload_2         
		//   19   36:aload_3         
		//   20   37:iconst_0        
		//   21   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   22   43:pop             
			parcel1.readException();
		//   23   44:aload_3         
		//   24   45:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   25   48:aload_3         
		//   26   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   27   52:aload_2         
		//   28   53:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   29   56:return          
			imediacontrollercallback = null;
		//   30   57:aconst_null     
		//   31   58:astore_1        
			  goto _L1
		//*  32   59:goto            25
			imediacontrollercallback;
		//   33   62:astore_1        
			parcel1.recycle();
		//   34   63:aload_3         
		//   35   64:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   67:aload_2         
		//   37   68:invokevirtual   #58  <Method void Parcel.recycle()>
			throw imediacontrollercallback;
		//   38   71:aload_1         
		//   39   72:athrow          
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

	public abstract int getShuffleMode()
		throws RemoteException;

	public abstract String getTag()
		throws RemoteException;

	public abstract ParcelableVolumeInfo getVolumeAttributes()
		throws RemoteException;

	public abstract boolean isCaptioningEnabled()
		throws RemoteException;

	public abstract boolean isShuffleModeEnabledDeprecated()
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

	public abstract void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
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

	public abstract void setCaptioningEnabled(boolean flag)
		throws RemoteException;

	public abstract void setRepeatMode(int i)
		throws RemoteException;

	public abstract void setShuffleMode(int i)
		throws RemoteException;

	public abstract void setShuffleModeEnabledDeprecated(boolean flag)
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

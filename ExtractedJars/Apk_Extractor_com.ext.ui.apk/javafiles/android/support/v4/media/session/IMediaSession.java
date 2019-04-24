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
			boolean flag5 = false;
		//    6    9:iconst_0        
		//    7   10:istore          9
			boolean flag = false;
		//    8   12:iconst_0        
		//    9   13:istore          5
			String s4;
			switch(i)
		//*  10   15:iload_1         
			{
		//*  11   16:lookupswitch    50: default 428
		//		               1: 446
		//		               2: 525
		//		               3: 586
		//		               4: 609
		//		               5: 632
		//		               6: 665
		//		               7: 687
		//		               8: 709
		//		               9: 748
		//		               10: 772
		//		               11: 811
		//		               12: 839
		//		               13: 1517
		//		               14: 1533
		//		               15: 1583
		//		               16: 1633
		//		               17: 1704
		//		               18: 1724
		//		               19: 1740
		//		               20: 1756
		//		               21: 1772
		//		               22: 1788
		//		               23: 1804
		//		               24: 1820
		//		               25: 1840
		//		               26: 2053
		//		               27: 867
		//		               28: 906
		//		               29: 945
		//		               30: 967
		//		               31: 1006
		//		               32: 1045
		//		               33: 1330
		//		               34: 1346
		//		               35: 1396
		//		               36: 1446
		//		               37: 1100
		//		               38: 1122
		//		               39: 1981
		//		               40: 2001
		//		               41: 1177
		//		               42: 1219
		//		               43: 1268
		//		               44: 1310
		//		               45: 1067
		//		               46: 1953
		//		               47: 1155
		//		               48: 2033
		//		               51: 1882
		//		               1598968902: 438
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//   12  428:aload_0         
		//   13  429:iload_1         
		//   14  430:aload_2         
		//   15  431:aload_3         
		//   16  432:iload           4
		//   17  434:invokespecial   #141 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   18  437:ireturn         

			case 1598968902: 
				parcel1.writeString("android.support.v4.media.session.IMediaSession");
		//   19  438:aload_3         
		//   20  439:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   21  441:invokevirtual   #147 <Method void Parcel.writeString(String)>
				return true;
		//   22  444:iconst_1        
		//   23  445:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   24  446:aload_2         
		//   25  447:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   26  449:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s5 = parcel.readString();
		//   27  452:aload_2         
		//   28  453:invokevirtual   #154 <Method String Parcel.readString()>
		//   29  456:astore          13
				Bundle bundle;
				if(parcel.readInt() != 0)
		//*  30  458:aload_2         
		//*  31  459:invokevirtual   #158 <Method int Parcel.readInt()>
		//*  32  462:ifeq            514
					bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
		//   33  465:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   34  468:aload_2         
		//   35  469:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   36  474:checkcast       #160 <Class Bundle>
		//   37  477:astore          12
				else
		//*  38  479:aload_2         
		//*  39  480:invokevirtual   #158 <Method int Parcel.readInt()>
		//*  40  483:ifeq            520
		//*  41  486:getstatic       #173 <Field android.os.Parcelable$Creator MediaSessionCompat$ResultReceiverWrapper.CREATOR>
		//*  42  489:aload_2         
		//*  43  490:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//*  44  495:checkcast       #172 <Class MediaSessionCompat$ResultReceiverWrapper>
		//*  45  498:astore_2        
		//*  46  499:aload_0         
		//*  47  500:aload           13
		//*  48  502:aload           12
		//*  49  504:aload_2         
		//*  50  505:invokevirtual   #177 <Method void sendCommand(String, Bundle, MediaSessionCompat$ResultReceiverWrapper)>
		//*  51  508:aload_3         
		//*  52  509:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//*  53  512:iconst_1        
		//*  54  513:ireturn         
					bundle = null;
		//   55  514:aconst_null     
		//   56  515:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel)));
				else
		//*  57  517:goto            479
					parcel = null;
		//   58  520:aconst_null     
		//   59  521:astore_2        
				sendCommand(s5, bundle, ((MediaSessionCompat.ResultReceiverWrapper) (parcel)));
				parcel1.writeNoException();
				return true;

		//*  60  522:goto            499
			case 2: // '\002'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   61  525:aload_2         
		//   62  526:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   63  528:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  64  531:aload_2         
		//*  65  532:invokevirtual   #158 <Method int Parcel.readInt()>
		//*  66  535:ifeq            576
					parcel = ((Parcel) ((KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel)));
		//   67  538:getstatic       #183 <Field android.os.Parcelable$Creator KeyEvent.CREATOR>
		//   68  541:aload_2         
		//   69  542:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   70  547:checkcast       #182 <Class KeyEvent>
		//   71  550:astore_2        
				else
		//*  72  551:aload_0         
		//*  73  552:aload_2         
		//*  74  553:invokevirtual   #187 <Method boolean sendMediaButton(KeyEvent)>
		//*  75  556:istore          8
		//*  76  558:aload_3         
		//*  77  559:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//*  78  562:iload           8
		//*  79  564:ifeq            581
		//*  80  567:iconst_1        
		//*  81  568:istore_1        
		//*  82  569:aload_3         
		//*  83  570:iload_1         
		//*  84  571:invokevirtual   #191 <Method void Parcel.writeInt(int)>
		//*  85  574:iconst_1        
		//*  86  575:ireturn         
					parcel = null;
		//   87  576:aconst_null     
		//   88  577:astore_2        
				flag3 = sendMediaButton(((KeyEvent) (parcel)));
				parcel1.writeNoException();
				if(flag3)
					i = 1;
				else
		//*  89  578:goto            551
					i = 0;
		//   90  581:iconst_0        
		//   91  582:istore_1        
				parcel1.writeInt(i);
				return true;

		//*  92  583:goto            569
			case 3: // '\003'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//   93  586:aload_2         
		//   94  587:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//   95  589:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				registerCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
		//   96  592:aload_0         
		//   97  593:aload_2         
		//   98  594:invokevirtual   #194 <Method IBinder Parcel.readStrongBinder()>
		//   99  597:invokestatic    #199 <Method IMediaControllerCallback IMediaControllerCallback$Stub.asInterface(IBinder)>
		//  100  600:invokevirtual   #203 <Method void registerCallbackListener(IMediaControllerCallback)>
				parcel1.writeNoException();
		//  101  603:aload_3         
		//  102  604:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  103  607:iconst_1        
		//  104  608:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  105  609:aload_2         
		//  106  610:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  107  612:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				unregisterCallbackListener(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
		//  108  615:aload_0         
		//  109  616:aload_2         
		//  110  617:invokevirtual   #194 <Method IBinder Parcel.readStrongBinder()>
		//  111  620:invokestatic    #199 <Method IMediaControllerCallback IMediaControllerCallback$Stub.asInterface(IBinder)>
		//  112  623:invokevirtual   #206 <Method void unregisterCallbackListener(IMediaControllerCallback)>
				parcel1.writeNoException();
		//  113  626:aload_3         
		//  114  627:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  115  630:iconst_1        
		//  116  631:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  117  632:aload_2         
		//  118  633:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  119  635:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				flag3 = isTransportControlEnabled();
		//  120  638:aload_0         
		//  121  639:invokevirtual   #210 <Method boolean isTransportControlEnabled()>
		//  122  642:istore          8
				parcel1.writeNoException();
		//  123  644:aload_3         
		//  124  645:invokevirtual   #180 <Method void Parcel.writeNoException()>
				i = ((int) (flag));
		//  125  648:iload           5
		//  126  650:istore_1        
				if(flag3)
		//* 127  651:iload           8
		//* 128  653:ifeq            658
					i = 1;
		//  129  656:iconst_1        
		//  130  657:istore_1        
				parcel1.writeInt(i);
		//  131  658:aload_3         
		//  132  659:iload_1         
		//  133  660:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  134  663:iconst_1        
		//  135  664:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  136  665:aload_2         
		//  137  666:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  138  668:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPackageName()));
		//  139  671:aload_0         
		//  140  672:invokevirtual   #213 <Method String getPackageName()>
		//  141  675:astore_2        
				parcel1.writeNoException();
		//  142  676:aload_3         
		//  143  677:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  144  680:aload_3         
		//  145  681:aload_2         
		//  146  682:invokevirtual   #147 <Method void Parcel.writeString(String)>
				return true;
		//  147  685:iconst_1        
		//  148  686:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  149  687:aload_2         
		//  150  688:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  151  690:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getTag()));
		//  152  693:aload_0         
		//  153  694:invokevirtual   #216 <Method String getTag()>
		//  154  697:astore_2        
				parcel1.writeNoException();
		//  155  698:aload_3         
		//  156  699:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//  157  702:aload_3         
		//  158  703:aload_2         
		//  159  704:invokevirtual   #147 <Method void Parcel.writeString(String)>
				return true;
		//  160  707:iconst_1        
		//  161  708:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  162  709:aload_2         
		//  163  710:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  164  712:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getLaunchPendingIntent()));
		//  165  715:aload_0         
		//  166  716:invokevirtual   #220 <Method PendingIntent getLaunchPendingIntent()>
		//  167  719:astore_2        
				parcel1.writeNoException();
		//  168  720:aload_3         
		//  169  721:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 170  724:aload_2         
		//* 171  725:ifnull          741
				{
					parcel1.writeInt(1);
		//  172  728:aload_3         
		//  173  729:iconst_1        
		//  174  730:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((PendingIntent) (parcel)).writeToParcel(parcel1, 1);
		//  175  733:aload_2         
		//  176  734:aload_3         
		//  177  735:iconst_1        
		//  178  736:invokevirtual   #226 <Method void PendingIntent.writeToParcel(Parcel, int)>
					return true;
		//  179  739:iconst_1        
		//  180  740:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  181  741:aload_3         
		//  182  742:iconst_0        
		//  183  743:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  184  746:iconst_1        
		//  185  747:ireturn         
				}

			case 9: // '\t'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  186  748:aload_2         
		//  187  749:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  188  751:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				long l = getFlags();
		//  189  754:aload_0         
		//  190  755:invokevirtual   #230 <Method long getFlags()>
		//  191  758:lstore          10
				parcel1.writeNoException();
		//  192  760:aload_3         
		//  193  761:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeLong(l);
		//  194  764:aload_3         
		//  195  765:lload           10
		//  196  767:invokevirtual   #234 <Method void Parcel.writeLong(long)>
				return true;
		//  197  770:iconst_1        
		//  198  771:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  199  772:aload_2         
		//  200  773:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  201  775:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getVolumeAttributes()));
		//  202  778:aload_0         
		//  203  779:invokevirtual   #238 <Method ParcelableVolumeInfo getVolumeAttributes()>
		//  204  782:astore_2        
				parcel1.writeNoException();
		//  205  783:aload_3         
		//  206  784:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 207  787:aload_2         
		//* 208  788:ifnull          804
				{
					parcel1.writeInt(1);
		//  209  791:aload_3         
		//  210  792:iconst_1        
		//  211  793:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((ParcelableVolumeInfo) (parcel)).writeToParcel(parcel1, 1);
		//  212  796:aload_2         
		//  213  797:aload_3         
		//  214  798:iconst_1        
		//  215  799:invokevirtual   #241 <Method void ParcelableVolumeInfo.writeToParcel(Parcel, int)>
					return true;
		//  216  802:iconst_1        
		//  217  803:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  218  804:aload_3         
		//  219  805:iconst_0        
		//  220  806:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  221  809:iconst_1        
		//  222  810:ireturn         
				}

			case 11: // '\013'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  223  811:aload_2         
		//  224  812:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  225  814:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				adjustVolume(parcel.readInt(), parcel.readInt(), parcel.readString());
		//  226  817:aload_0         
		//  227  818:aload_2         
		//  228  819:invokevirtual   #158 <Method int Parcel.readInt()>
		//  229  822:aload_2         
		//  230  823:invokevirtual   #158 <Method int Parcel.readInt()>
		//  231  826:aload_2         
		//  232  827:invokevirtual   #154 <Method String Parcel.readString()>
		//  233  830:invokevirtual   #245 <Method void adjustVolume(int, int, String)>
				parcel1.writeNoException();
		//  234  833:aload_3         
		//  235  834:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  236  837:iconst_1        
		//  237  838:ireturn         

			case 12: // '\f'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  238  839:aload_2         
		//  239  840:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  240  842:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				setVolumeTo(parcel.readInt(), parcel.readInt(), parcel.readString());
		//  241  845:aload_0         
		//  242  846:aload_2         
		//  243  847:invokevirtual   #158 <Method int Parcel.readInt()>
		//  244  850:aload_2         
		//  245  851:invokevirtual   #158 <Method int Parcel.readInt()>
		//  246  854:aload_2         
		//  247  855:invokevirtual   #154 <Method String Parcel.readString()>
		//  248  858:invokevirtual   #248 <Method void setVolumeTo(int, int, String)>
				parcel1.writeNoException();
		//  249  861:aload_3         
		//  250  862:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  251  865:iconst_1        
		//  252  866:ireturn         

			case 27: // '\033'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  253  867:aload_2         
		//  254  868:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  255  870:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getMetadata()));
		//  256  873:aload_0         
		//  257  874:invokevirtual   #252 <Method MediaMetadataCompat getMetadata()>
		//  258  877:astore_2        
				parcel1.writeNoException();
		//  259  878:aload_3         
		//  260  879:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 261  882:aload_2         
		//* 262  883:ifnull          899
				{
					parcel1.writeInt(1);
		//  263  886:aload_3         
		//  264  887:iconst_1        
		//  265  888:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((MediaMetadataCompat) (parcel)).writeToParcel(parcel1, 1);
		//  266  891:aload_2         
		//  267  892:aload_3         
		//  268  893:iconst_1        
		//  269  894:invokevirtual   #255 <Method void MediaMetadataCompat.writeToParcel(Parcel, int)>
					return true;
		//  270  897:iconst_1        
		//  271  898:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  272  899:aload_3         
		//  273  900:iconst_0        
		//  274  901:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  275  904:iconst_1        
		//  276  905:ireturn         
				}

			case 28: // '\034'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  277  906:aload_2         
		//  278  907:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  279  909:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getPlaybackState()));
		//  280  912:aload_0         
		//  281  913:invokevirtual   #259 <Method PlaybackStateCompat getPlaybackState()>
		//  282  916:astore_2        
				parcel1.writeNoException();
		//  283  917:aload_3         
		//  284  918:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 285  921:aload_2         
		//* 286  922:ifnull          938
				{
					parcel1.writeInt(1);
		//  287  925:aload_3         
		//  288  926:iconst_1        
		//  289  927:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((PlaybackStateCompat) (parcel)).writeToParcel(parcel1, 1);
		//  290  930:aload_2         
		//  291  931:aload_3         
		//  292  932:iconst_1        
		//  293  933:invokevirtual   #262 <Method void PlaybackStateCompat.writeToParcel(Parcel, int)>
					return true;
		//  294  936:iconst_1        
		//  295  937:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  296  938:aload_3         
		//  297  939:iconst_0        
		//  298  940:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  299  943:iconst_1        
		//  300  944:ireturn         
				}

			case 29: // '\035'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  301  945:aload_2         
		//  302  946:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  303  948:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getQueue()));
		//  304  951:aload_0         
		//  305  952:invokevirtual   #266 <Method List getQueue()>
		//  306  955:astore_2        
				parcel1.writeNoException();
		//  307  956:aload_3         
		//  308  957:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeTypedList(((List) (parcel)));
		//  309  960:aload_3         
		//  310  961:aload_2         
		//  311  962:invokevirtual   #270 <Method void Parcel.writeTypedList(List)>
				return true;
		//  312  965:iconst_1        
		//  313  966:ireturn         

			case 30: // '\036'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  314  967:aload_2         
		//  315  968:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  316  970:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getQueueTitle()));
		//  317  973:aload_0         
		//  318  974:invokevirtual   #274 <Method CharSequence getQueueTitle()>
		//  319  977:astore_2        
				parcel1.writeNoException();
		//  320  978:aload_3         
		//  321  979:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 322  982:aload_2         
		//* 323  983:ifnull          999
				{
					parcel1.writeInt(1);
		//  324  986:aload_3         
		//  325  987:iconst_1        
		//  326  988:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					TextUtils.writeToParcel(((CharSequence) (parcel)), parcel1, 1);
		//  327  991:aload_2         
		//  328  992:aload_3         
		//  329  993:iconst_1        
		//  330  994:invokestatic    #279 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
					return true;
		//  331  997:iconst_1        
		//  332  998:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  333  999:aload_3         
		//  334 1000:iconst_0        
		//  335 1001:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  336 1004:iconst_1        
		//  337 1005:ireturn         
				}

			case 31: // '\037'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  338 1006:aload_2         
		//  339 1007:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  340 1009:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (getExtras()));
		//  341 1012:aload_0         
		//  342 1013:invokevirtual   #283 <Method Bundle getExtras()>
		//  343 1016:astore_2        
				parcel1.writeNoException();
		//  344 1017:aload_3         
		//  345 1018:invokevirtual   #180 <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 346 1021:aload_2         
		//* 347 1022:ifnull          1038
				{
					parcel1.writeInt(1);
		//  348 1025:aload_3         
		//  349 1026:iconst_1        
		//  350 1027:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  351 1030:aload_2         
		//  352 1031:aload_3         
		//  353 1032:iconst_1        
		//  354 1033:invokevirtual   #284 <Method void Bundle.writeToParcel(Parcel, int)>
					return true;
		//  355 1036:iconst_1        
		//  356 1037:ireturn         
				} else
				{
					parcel1.writeInt(0);
		//  357 1038:aload_3         
		//  358 1039:iconst_0        
		//  359 1040:invokevirtual   #191 <Method void Parcel.writeInt(int)>
					return true;
		//  360 1043:iconst_1        
		//  361 1044:ireturn         
				}

			case 32: // ' '
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  362 1045:aload_2         
		//  363 1046:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  364 1048:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				i = getRatingType();
		//  365 1051:aload_0         
		//  366 1052:invokevirtual   #287 <Method int getRatingType()>
		//  367 1055:istore_1        
				parcel1.writeNoException();
		//  368 1056:aload_3         
		//  369 1057:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  370 1060:aload_3         
		//  371 1061:iload_1         
		//  372 1062:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  373 1065:iconst_1        
		//  374 1066:ireturn         

			case 45: // '-'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  375 1067:aload_2         
		//  376 1068:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  377 1070:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				flag3 = isCaptioningEnabled();
		//  378 1073:aload_0         
		//  379 1074:invokevirtual   #290 <Method boolean isCaptioningEnabled()>
		//  380 1077:istore          8
				parcel1.writeNoException();
		//  381 1079:aload_3         
		//  382 1080:invokevirtual   #180 <Method void Parcel.writeNoException()>
				i = ((int) (flag1));
		//  383 1083:iload           6
		//  384 1085:istore_1        
				if(flag3)
		//* 385 1086:iload           8
		//* 386 1088:ifeq            1093
					i = 1;
		//  387 1091:iconst_1        
		//  388 1092:istore_1        
				parcel1.writeInt(i);
		//  389 1093:aload_3         
		//  390 1094:iload_1         
		//  391 1095:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  392 1098:iconst_1        
		//  393 1099:ireturn         

			case 37: // '%'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  394 1100:aload_2         
		//  395 1101:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  396 1103:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				i = getRepeatMode();
		//  397 1106:aload_0         
		//  398 1107:invokevirtual   #293 <Method int getRepeatMode()>
		//  399 1110:istore_1        
				parcel1.writeNoException();
		//  400 1111:aload_3         
		//  401 1112:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  402 1115:aload_3         
		//  403 1116:iload_1         
		//  404 1117:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  405 1120:iconst_1        
		//  406 1121:ireturn         

			case 38: // '&'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  407 1122:aload_2         
		//  408 1123:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  409 1125:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				flag3 = isShuffleModeEnabledDeprecated();
		//  410 1128:aload_0         
		//  411 1129:invokevirtual   #296 <Method boolean isShuffleModeEnabledDeprecated()>
		//  412 1132:istore          8
				parcel1.writeNoException();
		//  413 1134:aload_3         
		//  414 1135:invokevirtual   #180 <Method void Parcel.writeNoException()>
				i = ((int) (flag2));
		//  415 1138:iload           7
		//  416 1140:istore_1        
				if(flag3)
		//* 417 1141:iload           8
		//* 418 1143:ifeq            1148
					i = 1;
		//  419 1146:iconst_1        
		//  420 1147:istore_1        
				parcel1.writeInt(i);
		//  421 1148:aload_3         
		//  422 1149:iload_1         
		//  423 1150:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  424 1153:iconst_1        
		//  425 1154:ireturn         

			case 47: // '/'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  426 1155:aload_2         
		//  427 1156:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  428 1158:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				i = getShuffleMode();
		//  429 1161:aload_0         
		//  430 1162:invokevirtual   #299 <Method int getShuffleMode()>
		//  431 1165:istore_1        
				parcel1.writeNoException();
		//  432 1166:aload_3         
		//  433 1167:invokevirtual   #180 <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  434 1170:aload_3         
		//  435 1171:iload_1         
		//  436 1172:invokevirtual   #191 <Method void Parcel.writeInt(int)>
				return true;
		//  437 1175:iconst_1        
		//  438 1176:ireturn         

			case 41: // ')'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  439 1177:aload_2         
		//  440 1178:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  441 1180:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 442 1183:aload_2         
		//* 443 1184:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 444 1187:ifeq            1214
					parcel = ((Parcel) ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel)));
		//  445 1190:getstatic       #302 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  446 1193:aload_2         
		//  447 1194:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  448 1199:checkcast       #301 <Class MediaDescriptionCompat>
		//  449 1202:astore_2        
				else
		//* 450 1203:aload_0         
		//* 451 1204:aload_2         
		//* 452 1205:invokevirtual   #306 <Method void addQueueItem(MediaDescriptionCompat)>
		//* 453 1208:aload_3         
		//* 454 1209:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 455 1212:iconst_1        
		//* 456 1213:ireturn         
					parcel = null;
		//  457 1214:aconst_null     
		//  458 1215:astore_2        
				addQueueItem(((MediaDescriptionCompat) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 459 1216:goto            1203
			case 42: // '*'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  460 1219:aload_2         
		//  461 1220:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  462 1222:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				MediaDescriptionCompat mediadescriptioncompat;
				if(parcel.readInt() != 0)
		//* 463 1225:aload_2         
		//* 464 1226:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 465 1229:ifeq            1262
					mediadescriptioncompat = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
		//  466 1232:getstatic       #302 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  467 1235:aload_2         
		//  468 1236:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  469 1241:checkcast       #301 <Class MediaDescriptionCompat>
		//  470 1244:astore          12
				else
		//* 471 1246:aload_0         
		//* 472 1247:aload           12
		//* 473 1249:aload_2         
		//* 474 1250:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 475 1253:invokevirtual   #310 <Method void addQueueItemAt(MediaDescriptionCompat, int)>
		//* 476 1256:aload_3         
		//* 477 1257:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 478 1260:iconst_1        
		//* 479 1261:ireturn         
					mediadescriptioncompat = null;
		//  480 1262:aconst_null     
		//  481 1263:astore          12
				addQueueItemAt(mediadescriptioncompat, parcel.readInt());
				parcel1.writeNoException();
				return true;

		//* 482 1265:goto            1246
			case 43: // '+'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  483 1268:aload_2         
		//  484 1269:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  485 1271:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 486 1274:aload_2         
		//* 487 1275:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 488 1278:ifeq            1305
					parcel = ((Parcel) ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel)));
		//  489 1281:getstatic       #302 <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//  490 1284:aload_2         
		//  491 1285:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  492 1290:checkcast       #301 <Class MediaDescriptionCompat>
		//  493 1293:astore_2        
				else
		//* 494 1294:aload_0         
		//* 495 1295:aload_2         
		//* 496 1296:invokevirtual   #313 <Method void removeQueueItem(MediaDescriptionCompat)>
		//* 497 1299:aload_3         
		//* 498 1300:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 499 1303:iconst_1        
		//* 500 1304:ireturn         
					parcel = null;
		//  501 1305:aconst_null     
		//  502 1306:astore_2        
				removeQueueItem(((MediaDescriptionCompat) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 503 1307:goto            1294
			case 44: // ','
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  504 1310:aload_2         
		//  505 1311:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  506 1313:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				removeQueueItemAt(parcel.readInt());
		//  507 1316:aload_0         
		//  508 1317:aload_2         
		//  509 1318:invokevirtual   #158 <Method int Parcel.readInt()>
		//  510 1321:invokevirtual   #316 <Method void removeQueueItemAt(int)>
				parcel1.writeNoException();
		//  511 1324:aload_3         
		//  512 1325:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  513 1328:iconst_1        
		//  514 1329:ireturn         

			case 33: // '!'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  515 1330:aload_2         
		//  516 1331:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  517 1333:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				prepare();
		//  518 1336:aload_0         
		//  519 1337:invokevirtual   #319 <Method void prepare()>
				parcel1.writeNoException();
		//  520 1340:aload_3         
		//  521 1341:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  522 1344:iconst_1        
		//  523 1345:ireturn         

			case 34: // '"'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  524 1346:aload_2         
		//  525 1347:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  526 1349:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s = parcel.readString();
		//  527 1352:aload_2         
		//  528 1353:invokevirtual   #154 <Method String Parcel.readString()>
		//  529 1356:astore          12
				if(parcel.readInt() != 0)
		//* 530 1358:aload_2         
		//* 531 1359:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 532 1362:ifeq            1391
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  533 1365:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  534 1368:aload_2         
		//  535 1369:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  536 1374:checkcast       #160 <Class Bundle>
		//  537 1377:astore_2        
				else
		//* 538 1378:aload_0         
		//* 539 1379:aload           12
		//* 540 1381:aload_2         
		//* 541 1382:invokevirtual   #323 <Method void prepareFromMediaId(String, Bundle)>
		//* 542 1385:aload_3         
		//* 543 1386:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 544 1389:iconst_1        
		//* 545 1390:ireturn         
					parcel = null;
		//  546 1391:aconst_null     
		//  547 1392:astore_2        
				prepareFromMediaId(s, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 548 1393:goto            1378
			case 35: // '#'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  549 1396:aload_2         
		//  550 1397:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  551 1399:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s1 = parcel.readString();
		//  552 1402:aload_2         
		//  553 1403:invokevirtual   #154 <Method String Parcel.readString()>
		//  554 1406:astore          12
				if(parcel.readInt() != 0)
		//* 555 1408:aload_2         
		//* 556 1409:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 557 1412:ifeq            1441
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  558 1415:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  559 1418:aload_2         
		//  560 1419:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  561 1424:checkcast       #160 <Class Bundle>
		//  562 1427:astore_2        
				else
		//* 563 1428:aload_0         
		//* 564 1429:aload           12
		//* 565 1431:aload_2         
		//* 566 1432:invokevirtual   #326 <Method void prepareFromSearch(String, Bundle)>
		//* 567 1435:aload_3         
		//* 568 1436:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 569 1439:iconst_1        
		//* 570 1440:ireturn         
					parcel = null;
		//  571 1441:aconst_null     
		//  572 1442:astore_2        
				prepareFromSearch(s1, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 573 1443:goto            1428
			case 36: // '$'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  574 1446:aload_2         
		//  575 1447:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  576 1449:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				Uri uri;
				if(parcel.readInt() != 0)
		//* 577 1452:aload_2         
		//* 578 1453:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 579 1456:ifeq            1506
					uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
		//  580 1459:getstatic       #329 <Field android.os.Parcelable$Creator Uri.CREATOR>
		//  581 1462:aload_2         
		//  582 1463:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  583 1468:checkcast       #328 <Class Uri>
		//  584 1471:astore          12
				else
		//* 585 1473:aload_2         
		//* 586 1474:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 587 1477:ifeq            1512
		//* 588 1480:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//* 589 1483:aload_2         
		//* 590 1484:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 591 1489:checkcast       #160 <Class Bundle>
		//* 592 1492:astore_2        
		//* 593 1493:aload_0         
		//* 594 1494:aload           12
		//* 595 1496:aload_2         
		//* 596 1497:invokevirtual   #333 <Method void prepareFromUri(Uri, Bundle)>
		//* 597 1500:aload_3         
		//* 598 1501:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 599 1504:iconst_1        
		//* 600 1505:ireturn         
					uri = null;
		//  601 1506:aconst_null     
		//  602 1507:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
				else
		//* 603 1509:goto            1473
					parcel = null;
		//  604 1512:aconst_null     
		//  605 1513:astore_2        
				prepareFromUri(uri, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 606 1514:goto            1493
			case 13: // '\r'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  607 1517:aload_2         
		//  608 1518:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  609 1520:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				play();
		//  610 1523:aload_0         
		//  611 1524:invokevirtual   #336 <Method void play()>
				parcel1.writeNoException();
		//  612 1527:aload_3         
		//  613 1528:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  614 1531:iconst_1        
		//  615 1532:ireturn         

			case 14: // '\016'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  616 1533:aload_2         
		//  617 1534:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  618 1536:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s2 = parcel.readString();
		//  619 1539:aload_2         
		//  620 1540:invokevirtual   #154 <Method String Parcel.readString()>
		//  621 1543:astore          12
				if(parcel.readInt() != 0)
		//* 622 1545:aload_2         
		//* 623 1546:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 624 1549:ifeq            1578
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  625 1552:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  626 1555:aload_2         
		//  627 1556:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  628 1561:checkcast       #160 <Class Bundle>
		//  629 1564:astore_2        
				else
		//* 630 1565:aload_0         
		//* 631 1566:aload           12
		//* 632 1568:aload_2         
		//* 633 1569:invokevirtual   #339 <Method void playFromMediaId(String, Bundle)>
		//* 634 1572:aload_3         
		//* 635 1573:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 636 1576:iconst_1        
		//* 637 1577:ireturn         
					parcel = null;
		//  638 1578:aconst_null     
		//  639 1579:astore_2        
				playFromMediaId(s2, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 640 1580:goto            1565
			case 15: // '\017'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  641 1583:aload_2         
		//  642 1584:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  643 1586:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				String s3 = parcel.readString();
		//  644 1589:aload_2         
		//  645 1590:invokevirtual   #154 <Method String Parcel.readString()>
		//  646 1593:astore          12
				if(parcel.readInt() != 0)
		//* 647 1595:aload_2         
		//* 648 1596:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 649 1599:ifeq            1628
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  650 1602:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  651 1605:aload_2         
		//  652 1606:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  653 1611:checkcast       #160 <Class Bundle>
		//  654 1614:astore_2        
				else
		//* 655 1615:aload_0         
		//* 656 1616:aload           12
		//* 657 1618:aload_2         
		//* 658 1619:invokevirtual   #342 <Method void playFromSearch(String, Bundle)>
		//* 659 1622:aload_3         
		//* 660 1623:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 661 1626:iconst_1        
		//* 662 1627:ireturn         
					parcel = null;
		//  663 1628:aconst_null     
		//  664 1629:astore_2        
				playFromSearch(s3, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 665 1630:goto            1615
			case 16: // '\020'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  666 1633:aload_2         
		//  667 1634:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  668 1636:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				Uri uri1;
				if(parcel.readInt() != 0)
		//* 669 1639:aload_2         
		//* 670 1640:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 671 1643:ifeq            1693
					uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
		//  672 1646:getstatic       #329 <Field android.os.Parcelable$Creator Uri.CREATOR>
		//  673 1649:aload_2         
		//  674 1650:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  675 1655:checkcast       #328 <Class Uri>
		//  676 1658:astore          12
				else
		//* 677 1660:aload_2         
		//* 678 1661:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 679 1664:ifeq            1699
		//* 680 1667:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//* 681 1670:aload_2         
		//* 682 1671:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 683 1676:checkcast       #160 <Class Bundle>
		//* 684 1679:astore_2        
		//* 685 1680:aload_0         
		//* 686 1681:aload           12
		//* 687 1683:aload_2         
		//* 688 1684:invokevirtual   #345 <Method void playFromUri(Uri, Bundle)>
		//* 689 1687:aload_3         
		//* 690 1688:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 691 1691:iconst_1        
		//* 692 1692:ireturn         
					uri1 = null;
		//  693 1693:aconst_null     
		//  694 1694:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
				else
		//* 695 1696:goto            1660
					parcel = null;
		//  696 1699:aconst_null     
		//  697 1700:astore_2        
				playFromUri(uri1, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 698 1701:goto            1680
			case 17: // '\021'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  699 1704:aload_2         
		//  700 1705:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  701 1707:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				skipToQueueItem(parcel.readLong());
		//  702 1710:aload_0         
		//  703 1711:aload_2         
		//  704 1712:invokevirtual   #348 <Method long Parcel.readLong()>
		//  705 1715:invokevirtual   #351 <Method void skipToQueueItem(long)>
				parcel1.writeNoException();
		//  706 1718:aload_3         
		//  707 1719:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  708 1722:iconst_1        
		//  709 1723:ireturn         

			case 18: // '\022'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  710 1724:aload_2         
		//  711 1725:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  712 1727:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				pause();
		//  713 1730:aload_0         
		//  714 1731:invokevirtual   #354 <Method void pause()>
				parcel1.writeNoException();
		//  715 1734:aload_3         
		//  716 1735:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  717 1738:iconst_1        
		//  718 1739:ireturn         

			case 19: // '\023'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  719 1740:aload_2         
		//  720 1741:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  721 1743:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				stop();
		//  722 1746:aload_0         
		//  723 1747:invokevirtual   #357 <Method void stop()>
				parcel1.writeNoException();
		//  724 1750:aload_3         
		//  725 1751:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  726 1754:iconst_1        
		//  727 1755:ireturn         

			case 20: // '\024'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  728 1756:aload_2         
		//  729 1757:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  730 1759:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				next();
		//  731 1762:aload_0         
		//  732 1763:invokevirtual   #360 <Method void next()>
				parcel1.writeNoException();
		//  733 1766:aload_3         
		//  734 1767:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  735 1770:iconst_1        
		//  736 1771:ireturn         

			case 21: // '\025'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  737 1772:aload_2         
		//  738 1773:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  739 1775:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				previous();
		//  740 1778:aload_0         
		//  741 1779:invokevirtual   #363 <Method void previous()>
				parcel1.writeNoException();
		//  742 1782:aload_3         
		//  743 1783:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  744 1786:iconst_1        
		//  745 1787:ireturn         

			case 22: // '\026'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  746 1788:aload_2         
		//  747 1789:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  748 1791:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				fastForward();
		//  749 1794:aload_0         
		//  750 1795:invokevirtual   #366 <Method void fastForward()>
				parcel1.writeNoException();
		//  751 1798:aload_3         
		//  752 1799:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  753 1802:iconst_1        
		//  754 1803:ireturn         

			case 23: // '\027'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  755 1804:aload_2         
		//  756 1805:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  757 1807:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				rewind();
		//  758 1810:aload_0         
		//  759 1811:invokevirtual   #369 <Method void rewind()>
				parcel1.writeNoException();
		//  760 1814:aload_3         
		//  761 1815:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  762 1818:iconst_1        
		//  763 1819:ireturn         

			case 24: // '\030'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  764 1820:aload_2         
		//  765 1821:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  766 1823:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				seekTo(parcel.readLong());
		//  767 1826:aload_0         
		//  768 1827:aload_2         
		//  769 1828:invokevirtual   #348 <Method long Parcel.readLong()>
		//  770 1831:invokevirtual   #372 <Method void seekTo(long)>
				parcel1.writeNoException();
		//  771 1834:aload_3         
		//  772 1835:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  773 1838:iconst_1        
		//  774 1839:ireturn         

			case 25: // '\031'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  775 1840:aload_2         
		//  776 1841:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  777 1843:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 778 1846:aload_2         
		//* 779 1847:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 780 1850:ifeq            1877
					parcel = ((Parcel) ((RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel)));
		//  781 1853:getstatic       #375 <Field android.os.Parcelable$Creator RatingCompat.CREATOR>
		//  782 1856:aload_2         
		//  783 1857:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  784 1862:checkcast       #374 <Class RatingCompat>
		//  785 1865:astore_2        
				else
		//* 786 1866:aload_0         
		//* 787 1867:aload_2         
		//* 788 1868:invokevirtual   #379 <Method void rate(RatingCompat)>
		//* 789 1871:aload_3         
		//* 790 1872:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 791 1875:iconst_1        
		//* 792 1876:ireturn         
					parcel = null;
		//  793 1877:aconst_null     
		//  794 1878:astore_2        
				rate(((RatingCompat) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 795 1879:goto            1866
			case 51: // '3'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  796 1882:aload_2         
		//  797 1883:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  798 1885:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				RatingCompat ratingcompat;
				if(parcel.readInt() != 0)
		//* 799 1888:aload_2         
		//* 800 1889:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 801 1892:ifeq            1942
					ratingcompat = (RatingCompat)RatingCompat.CREATOR.createFromParcel(parcel);
		//  802 1895:getstatic       #375 <Field android.os.Parcelable$Creator RatingCompat.CREATOR>
		//  803 1898:aload_2         
		//  804 1899:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  805 1904:checkcast       #374 <Class RatingCompat>
		//  806 1907:astore          12
				else
		//* 807 1909:aload_2         
		//* 808 1910:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 809 1913:ifeq            1948
		//* 810 1916:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//* 811 1919:aload_2         
		//* 812 1920:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//* 813 1925:checkcast       #160 <Class Bundle>
		//* 814 1928:astore_2        
		//* 815 1929:aload_0         
		//* 816 1930:aload           12
		//* 817 1932:aload_2         
		//* 818 1933:invokevirtual   #383 <Method void rateWithExtras(RatingCompat, Bundle)>
		//* 819 1936:aload_3         
		//* 820 1937:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 821 1940:iconst_1        
		//* 822 1941:ireturn         
					ratingcompat = null;
		//  823 1942:aconst_null     
		//  824 1943:astore          12
				if(parcel.readInt() != 0)
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
				else
		//* 825 1945:goto            1909
					parcel = null;
		//  826 1948:aconst_null     
		//  827 1949:astore_2        
				rateWithExtras(ratingcompat, ((Bundle) (parcel)));
				parcel1.writeNoException();
				return true;

		//* 828 1950:goto            1929
			case 46: // '.'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  829 1953:aload_2         
		//  830 1954:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  831 1956:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 832 1959:aload_2         
		//* 833 1960:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 834 1963:ifeq            1969
					flag3 = true;
		//  835 1966:iconst_1        
		//  836 1967:istore          8
				setCaptioningEnabled(flag3);
		//  837 1969:aload_0         
		//  838 1970:iload           8
		//  839 1972:invokevirtual   #387 <Method void setCaptioningEnabled(boolean)>
				parcel1.writeNoException();
		//  840 1975:aload_3         
		//  841 1976:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  842 1979:iconst_1        
		//  843 1980:ireturn         

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
				boolean flag4 = flag5;
		//  858 2007:iload           9
		//  859 2009:istore          8
				if(parcel.readInt() != 0)
		//* 860 2011:aload_2         
		//* 861 2012:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 862 2015:ifeq            2021
					flag4 = true;
		//  863 2018:iconst_1        
		//  864 2019:istore          8
				setShuffleModeEnabledDeprecated(flag4);
		//  865 2021:aload_0         
		//  866 2022:iload           8
		//  867 2024:invokevirtual   #393 <Method void setShuffleModeEnabledDeprecated(boolean)>
				parcel1.writeNoException();
		//  868 2027:aload_3         
		//  869 2028:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  870 2031:iconst_1        
		//  871 2032:ireturn         

			case 48: // '0'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  872 2033:aload_2         
		//  873 2034:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  874 2036:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				setShuffleMode(parcel.readInt());
		//  875 2039:aload_0         
		//  876 2040:aload_2         
		//  877 2041:invokevirtual   #158 <Method int Parcel.readInt()>
		//  878 2044:invokevirtual   #396 <Method void setShuffleMode(int)>
				parcel1.writeNoException();
		//  879 2047:aload_3         
		//  880 2048:invokevirtual   #180 <Method void Parcel.writeNoException()>
				return true;
		//  881 2051:iconst_1        
		//  882 2052:ireturn         

			case 26: // '\032'
				parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
		//  883 2053:aload_2         
		//  884 2054:ldc1            #14  <String "android.support.v4.media.session.IMediaSession">
		//  885 2056:invokevirtual   #150 <Method void Parcel.enforceInterface(String)>
				s4 = parcel.readString();
		//  886 2059:aload_2         
		//  887 2060:invokevirtual   #154 <Method String Parcel.readString()>
		//  888 2063:astore          12
				break;
			}
			if(parcel.readInt() != 0)
		//* 889 2065:aload_2         
		//* 890 2066:invokevirtual   #158 <Method int Parcel.readInt()>
		//* 891 2069:ifeq            2098
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  892 2072:getstatic       #164 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  893 2075:aload_2         
		//  894 2076:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  895 2081:checkcast       #160 <Class Bundle>
		//  896 2084:astore_2        
			else
		//* 897 2085:aload_0         
		//* 898 2086:aload           12
		//* 899 2088:aload_2         
		//* 900 2089:invokevirtual   #399 <Method void sendCustomAction(String, Bundle)>
		//* 901 2092:aload_3         
		//* 902 2093:invokevirtual   #180 <Method void Parcel.writeNoException()>
		//* 903 2096:iconst_1        
		//* 904 2097:ireturn         
				parcel = null;
		//  905 2098:aconst_null     
		//  906 2099:astore_2        
			sendCustomAction(s4, ((Bundle) (parcel)));
			parcel1.writeNoException();
			return true;
		//* 907 2100:goto            2085
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

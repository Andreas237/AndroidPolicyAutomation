// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat, ParcelableVolumeInfo

public interface IMediaControllerCallback
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IMediaControllerCallback
	{

		public static IMediaControllerCallback asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    6    9:invokeinterface #58  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof IMediaControllerCallback))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class IMediaControllerCallback>
		//*  12   23:ifeq            31
				return (IMediaControllerCallback)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class IMediaControllerCallback>
		//   15   30:areturn         
			else
				return ((IMediaControllerCallback) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class IMediaControllerCallback$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #61  <Method void IMediaControllerCallback$Stub$Proxy(IBinder)>
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
			if(i != 0x5f4e5446)
		//*   0    0:iload_1         
		//*   1    1:ldc1            #68  <Int 0x5f4e5446>
		//*   2    3:icmpeq          457
			{
				boolean flag2 = false;
		//    3    6:iconst_0        
		//    4    7:istore          6
				boolean flag = false;
		//    5    9:iconst_0        
		//    6   10:istore          5
				Object obj1 = null;
		//    7   12:aconst_null     
		//    8   13:astore          9
				Object obj2 = null;
		//    9   15:aconst_null     
		//   10   16:astore          10
				Object obj3 = null;
		//   11   18:aconst_null     
		//   12   19:astore          11
				Object obj4 = null;
		//   13   21:aconst_null     
		//   14   22:astore          12
				Object obj = null;
		//   15   24:aconst_null     
		//   16   25:astore          7
				String s = null;
		//   17   27:aconst_null     
		//   18   28:astore          8
				switch(i)
		//*  19   30:iload_1         
				{
		//*  20   31:tableswitch     1 13: default 96
		//		               1 413
		//		               2 401
		//		               3 365
		//		               4 329
		//		               5 310
		//		               6 274
		//		               7 238
		//		               8 202
		//		               9 186
		//		               10 158
		//		               11 134
		//		               12 118
		//		               13 106
				default:
					return super.onTransact(i, parcel, parcel1, j);
		//   21   96:aload_0         
		//   22   97:iload_1         
		//   23   98:aload_2         
		//   24   99:aload_3         
		//   25  100:iload           4
		//   26  102:invokespecial   #70  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   27  105:ireturn         

				case 13: // '\r'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   28  106:aload_2         
		//   29  107:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   30  109:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					onSessionReady();
		//   31  112:aload_0         
		//   32  113:invokevirtual   #79  <Method void onSessionReady()>
					return true;
		//   33  116:iconst_1        
		//   34  117:ireturn         

				case 12: // '\f'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   35  118:aload_2         
		//   36  119:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   37  121:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					onShuffleModeChanged(parcel.readInt());
		//   38  124:aload_0         
		//   39  125:aload_2         
		//   40  126:invokevirtual   #83  <Method int Parcel.readInt()>
		//   41  129:invokevirtual   #87  <Method void onShuffleModeChanged(int)>
					return true;
		//   42  132:iconst_1        
		//   43  133:ireturn         

				case 11: // '\013'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   44  134:aload_2         
		//   45  135:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   46  137:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					if(parcel.readInt() != 0)
		//*  47  140:aload_2         
		//*  48  141:invokevirtual   #83  <Method int Parcel.readInt()>
		//*  49  144:ifeq            150
						flag = true;
		//   50  147:iconst_1        
		//   51  148:istore          5
					onCaptioningEnabledChanged(flag);
		//   52  150:aload_0         
		//   53  151:iload           5
		//   54  153:invokevirtual   #91  <Method void onCaptioningEnabledChanged(boolean)>
					return true;
		//   55  156:iconst_1        
		//   56  157:ireturn         

				case 10: // '\n'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   57  158:aload_2         
		//   58  159:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   59  161:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					boolean flag1 = flag2;
		//   60  164:iload           6
		//   61  166:istore          5
					if(parcel.readInt() != 0)
		//*  62  168:aload_2         
		//*  63  169:invokevirtual   #83  <Method int Parcel.readInt()>
		//*  64  172:ifeq            178
						flag1 = true;
		//   65  175:iconst_1        
		//   66  176:istore          5
					onShuffleModeChangedRemoved(flag1);
		//   67  178:aload_0         
		//   68  179:iload           5
		//   69  181:invokevirtual   #94  <Method void onShuffleModeChangedRemoved(boolean)>
					return true;
		//   70  184:iconst_1        
		//   71  185:ireturn         

				case 9: // '\t'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   72  186:aload_2         
		//   73  187:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   74  189:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					onRepeatModeChanged(parcel.readInt());
		//   75  192:aload_0         
		//   76  193:aload_2         
		//   77  194:invokevirtual   #83  <Method int Parcel.readInt()>
		//   78  197:invokevirtual   #97  <Method void onRepeatModeChanged(int)>
					return true;
		//   79  200:iconst_1        
		//   80  201:ireturn         

				case 8: // '\b'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   81  202:aload_2         
		//   82  203:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   83  205:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (s));
		//   84  208:aload           8
		//   85  210:astore_3        
					if(parcel.readInt() != 0)
		//*  86  211:aload_2         
		//*  87  212:invokevirtual   #83  <Method int Parcel.readInt()>
		//*  88  215:ifeq            231
						parcel1 = ((Parcel) ((ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel)));
		//   89  218:getstatic       #103 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
		//   90  221:aload_2         
		//   91  222:invokeinterface #109 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   92  227:checkcast       #99  <Class ParcelableVolumeInfo>
		//   93  230:astore_3        
					onVolumeInfoChanged(((ParcelableVolumeInfo) (parcel1)));
		//   94  231:aload_0         
		//   95  232:aload_3         
		//   96  233:invokevirtual   #113 <Method void onVolumeInfoChanged(ParcelableVolumeInfo)>
					return true;
		//   97  236:iconst_1        
		//   98  237:ireturn         

				case 7: // '\007'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   99  238:aload_2         
		//  100  239:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  101  241:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (obj1));
		//  102  244:aload           9
		//  103  246:astore_3        
					if(parcel.readInt() != 0)
		//* 104  247:aload_2         
		//* 105  248:invokevirtual   #83  <Method int Parcel.readInt()>
		//* 106  251:ifeq            267
						parcel1 = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  107  254:getstatic       #116 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  108  257:aload_2         
		//  109  258:invokeinterface #109 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  110  263:checkcast       #115 <Class Bundle>
		//  111  266:astore_3        
					onExtrasChanged(((Bundle) (parcel1)));
		//  112  267:aload_0         
		//  113  268:aload_3         
		//  114  269:invokevirtual   #120 <Method void onExtrasChanged(Bundle)>
					return true;
		//  115  272:iconst_1        
		//  116  273:ireturn         

				case 6: // '\006'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  117  274:aload_2         
		//  118  275:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  119  277:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (obj2));
		//  120  280:aload           10
		//  121  282:astore_3        
					if(parcel.readInt() != 0)
		//* 122  283:aload_2         
		//* 123  284:invokevirtual   #83  <Method int Parcel.readInt()>
		//* 124  287:ifeq            303
						parcel1 = ((Parcel) ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel)));
		//  125  290:getstatic       #125 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//  126  293:aload_2         
		//  127  294:invokeinterface #109 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  128  299:checkcast       #127 <Class CharSequence>
		//  129  302:astore_3        
					onQueueTitleChanged(((CharSequence) (parcel1)));
		//  130  303:aload_0         
		//  131  304:aload_3         
		//  132  305:invokevirtual   #131 <Method void onQueueTitleChanged(CharSequence)>
					return true;
		//  133  308:iconst_1        
		//  134  309:ireturn         

				case 5: // '\005'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  135  310:aload_2         
		//  136  311:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  137  313:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					onQueueChanged(((List) (parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR))));
		//  138  316:aload_0         
		//  139  317:aload_2         
		//  140  318:getstatic       #134 <Field android.os.Parcelable$Creator MediaSessionCompat$QueueItem.CREATOR>
		//  141  321:invokevirtual   #138 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//  142  324:invokevirtual   #142 <Method void onQueueChanged(List)>
					return true;
		//  143  327:iconst_1        
		//  144  328:ireturn         

				case 4: // '\004'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  145  329:aload_2         
		//  146  330:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  147  332:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (obj3));
		//  148  335:aload           11
		//  149  337:astore_3        
					if(parcel.readInt() != 0)
		//* 150  338:aload_2         
		//* 151  339:invokevirtual   #83  <Method int Parcel.readInt()>
		//* 152  342:ifeq            358
						parcel1 = ((Parcel) ((MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel)));
		//  153  345:getstatic       #145 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
		//  154  348:aload_2         
		//  155  349:invokeinterface #109 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  156  354:checkcast       #144 <Class MediaMetadataCompat>
		//  157  357:astore_3        
					onMetadataChanged(((MediaMetadataCompat) (parcel1)));
		//  158  358:aload_0         
		//  159  359:aload_3         
		//  160  360:invokevirtual   #149 <Method void onMetadataChanged(MediaMetadataCompat)>
					return true;
		//  161  363:iconst_1        
		//  162  364:ireturn         

				case 3: // '\003'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  163  365:aload_2         
		//  164  366:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  165  368:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					parcel1 = ((Parcel) (obj4));
		//  166  371:aload           12
		//  167  373:astore_3        
					if(parcel.readInt() != 0)
		//* 168  374:aload_2         
		//* 169  375:invokevirtual   #83  <Method int Parcel.readInt()>
		//* 170  378:ifeq            394
						parcel1 = ((Parcel) ((PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel)));
		//  171  381:getstatic       #152 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
		//  172  384:aload_2         
		//  173  385:invokeinterface #109 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  174  390:checkcast       #151 <Class PlaybackStateCompat>
		//  175  393:astore_3        
					onPlaybackStateChanged(((PlaybackStateCompat) (parcel1)));
		//  176  394:aload_0         
		//  177  395:aload_3         
		//  178  396:invokevirtual   #156 <Method void onPlaybackStateChanged(PlaybackStateCompat)>
					return true;
		//  179  399:iconst_1        
		//  180  400:ireturn         

				case 2: // '\002'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  181  401:aload_2         
		//  182  402:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  183  404:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					onSessionDestroyed();
		//  184  407:aload_0         
		//  185  408:invokevirtual   #159 <Method void onSessionDestroyed()>
					return true;
		//  186  411:iconst_1        
		//  187  412:ireturn         

				case 1: // '\001'
					parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  188  413:aload_2         
		//  189  414:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  190  416:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
					s = parcel.readString();
		//  191  419:aload_2         
		//  192  420:invokevirtual   #163 <Method String Parcel.readString()>
		//  193  423:astore          8
					parcel1 = ((Parcel) (obj));
		//  194  425:aload           7
		//  195  427:astore_3        
					break;
				}
				if(parcel.readInt() != 0)
		//* 196  428:aload_2         
		//* 197  429:invokevirtual   #83  <Method int Parcel.readInt()>
		//* 198  432:ifeq            448
					parcel1 = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  199  435:getstatic       #116 <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  200  438:aload_2         
		//  201  439:invokeinterface #109 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  202  444:checkcast       #115 <Class Bundle>
		//  203  447:astore_3        
				onEvent(s, ((Bundle) (parcel1)));
		//  204  448:aload_0         
		//  205  449:aload           8
		//  206  451:aload_3         
		//  207  452:invokevirtual   #167 <Method void onEvent(String, Bundle)>
				return true;
		//  208  455:iconst_1        
		//  209  456:ireturn         
			} else
			{
				parcel1.writeString("android.support.v4.media.session.IMediaControllerCallback");
		//  210  457:aload_3         
		//  211  458:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  212  460:invokevirtual   #170 <Method void Parcel.writeString(String)>
				return true;
		//  213  463:iconst_1        
		//  214  464:ireturn         
			}
		}

		private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
		static final int TRANSACTION_onCaptioningEnabledChanged = 11;
		static final int TRANSACTION_onEvent = 1;
		static final int TRANSACTION_onExtrasChanged = 7;
		static final int TRANSACTION_onMetadataChanged = 4;
		static final int TRANSACTION_onPlaybackStateChanged = 3;
		static final int TRANSACTION_onQueueChanged = 5;
		static final int TRANSACTION_onQueueTitleChanged = 6;
		static final int TRANSACTION_onRepeatModeChanged = 9;
		static final int TRANSACTION_onSessionDestroyed = 2;
		static final int TRANSACTION_onSessionReady = 13;
		static final int TRANSACTION_onShuffleModeChanged = 12;
		static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
		static final int TRANSACTION_onVolumeInfoChanged = 8;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    5    8:invokevirtual   #49  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
		implements IMediaControllerCallback
	{

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public String getInterfaceDescriptor()
		{
			return "android.support.v4.media.session.IMediaControllerCallback";
		//    0    0:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    1    2:areturn         
		}

		public void onCaptioningEnabledChanged(boolean flag)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_3         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   5   10:iload_1         
		//*   6   11:ifeq            53
				i = 1;
		//    7   14:iconst_1        
		//    8   15:istore_2        
			else
		//*   9   16:goto            19
		//*  10   19:aload_3         
		//*  11   20:iload_2         
		//*  12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  13   24:aload_0         
		//*  14   25:getfield        #19  <Field IBinder mRemote>
		//*  15   28:bipush          11
		//*  16   30:aload_3         
		//*  17   31:aconst_null     
		//*  18   32:iconst_1        
		//*  19   33:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  20   38:pop             
		//*  21   39:aload_3         
		//*  22   40:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  23   43:return          
		//*  24   44:astore          4
		//*  25   46:aload_3         
		//*  26   47:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   50:aload           4
		//*  28   52:athrow          
				i = 0;
		//   29   53:iconst_0        
		//   30   54:istore_2        
			parcel.writeInt(i);
			mRemote.transact(11, parcel, ((Parcel) (null)), 1);
			parcel.recycle();
			return;
			exception;
			parcel.recycle();
			throw exception;
		//*  31   55:goto            19
		}

		public void onEvent(String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_3         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    5   10:aload_3         
		//    6   11:aload_1         
		//    7   12:invokevirtual   #59  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_33;
		//    8   15:aload_2         
		//    9   16:ifnull          33
			parcel.writeInt(1);
		//   10   19:aload_3         
		//   11   20:iconst_1        
		//   12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokevirtual   #65  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   17   30:goto            38
			parcel.writeInt(0);
		//   18   33:aload_3         
		//   19   34:iconst_0        
		//   20   35:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   21   38:aload_0         
		//   22   39:getfield        #19  <Field IBinder mRemote>
		//   23   42:iconst_1        
		//   24   43:aload_3         
		//   25   44:aconst_null     
		//   26   45:iconst_1        
		//   27   46:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   28   51:pop             
			parcel.recycle();
		//   29   52:aload_3         
		//   30   53:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   31   56:return          
			s;
		//   32   57:astore_1        
			parcel.recycle();
		//   33   58:aload_3         
		//   34   59:invokevirtual   #53  <Method void Parcel.recycle()>
			throw s;
		//   35   62:aload_1         
		//   36   63:athrow          
		}

		public void onExtrasChanged(Bundle bundle)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #65  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(7, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:bipush          7
		//   21   39:aload_2         
		//   22   40:aconst_null     
		//   23   41:iconst_1        
		//   24   42:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   47:pop             
			parcel.recycle();
		//   26   48:aload_2         
		//   27   49:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   28   52:return          
			bundle;
		//   29   53:astore_1        
			parcel.recycle();
		//   30   54:aload_2         
		//   31   55:invokevirtual   #53  <Method void Parcel.recycle()>
			throw bundle;
		//   32   58:aload_1         
		//   33   59:athrow          
		}

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			if(mediametadatacompat == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mediametadatacompat.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #72  <Method void MediaMetadataCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(4, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:iconst_4        
		//   21   38:aload_2         
		//   22   39:aconst_null     
		//   23   40:iconst_1        
		//   24   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   46:pop             
			parcel.recycle();
		//   26   47:aload_2         
		//   27   48:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   28   51:return          
			mediametadatacompat;
		//   29   52:astore_1        
			parcel.recycle();
		//   30   53:aload_2         
		//   31   54:invokevirtual   #53  <Method void Parcel.recycle()>
			throw mediametadatacompat;
		//   32   57:aload_1         
		//   33   58:athrow          
		}

		public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			if(playbackstatecompat == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			playbackstatecompat.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #77  <Method void PlaybackStateCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(3, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:iconst_3        
		//   21   38:aload_2         
		//   22   39:aconst_null     
		//   23   40:iconst_1        
		//   24   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   46:pop             
			parcel.recycle();
		//   26   47:aload_2         
		//   27   48:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   28   51:return          
			playbackstatecompat;
		//   29   52:astore_1        
			parcel.recycle();
		//   30   53:aload_2         
		//   31   54:invokevirtual   #53  <Method void Parcel.recycle()>
			throw playbackstatecompat;
		//   32   57:aload_1         
		//   33   58:athrow          
		}

		public void onQueueChanged(List list)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedList(list);
		//    5   10:aload_2         
		//    6   11:aload_1         
		//    7   12:invokevirtual   #82  <Method void Parcel.writeTypedList(List)>
			mRemote.transact(5, parcel, ((Parcel) (null)), 1);
		//    8   15:aload_0         
		//    9   16:getfield        #19  <Field IBinder mRemote>
		//   10   19:iconst_5        
		//   11   20:aload_2         
		//   12   21:aconst_null     
		//   13   22:iconst_1        
		//   14   23:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   15   28:pop             
			parcel.recycle();
		//   16   29:aload_2         
		//   17   30:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   18   33:return          
			list;
		//   19   34:astore_1        
			parcel.recycle();
		//   20   35:aload_2         
		//   21   36:invokevirtual   #53  <Method void Parcel.recycle()>
			throw list;
		//   22   39:aload_1         
		//   23   40:athrow          
		}

		public void onQueueTitleChanged(CharSequence charsequence)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			if(charsequence == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			TextUtils.writeToParcel(charsequence, parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokestatic    #91  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(6, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:bipush          6
		//   21   39:aload_2         
		//   22   40:aconst_null     
		//   23   41:iconst_1        
		//   24   42:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   47:pop             
			parcel.recycle();
		//   26   48:aload_2         
		//   27   49:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   28   52:return          
			charsequence;
		//   29   53:astore_1        
			parcel.recycle();
		//   30   54:aload_2         
		//   31   55:invokevirtual   #53  <Method void Parcel.recycle()>
			throw charsequence;
		//   32   58:aload_1         
		//   33   59:athrow          
		}

		public void onRepeatModeChanged(int i)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    5   10:aload_2         
		//    6   11:iload_1         
		//    7   12:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(9, parcel, ((Parcel) (null)), 1);
		//    8   15:aload_0         
		//    9   16:getfield        #19  <Field IBinder mRemote>
		//   10   19:bipush          9
		//   11   21:aload_2         
		//   12   22:aconst_null     
		//   13   23:iconst_1        
		//   14   24:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   15   29:pop             
			parcel.recycle();
		//   16   30:aload_2         
		//   17   31:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   18   34:return          
			Exception exception;
			exception;
		//   19   35:astore_3        
			parcel.recycle();
		//   20   36:aload_2         
		//   21   37:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   22   40:aload_3         
		//   23   41:athrow          
		}

		public void onSessionDestroyed()
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_1         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(2, parcel, ((Parcel) (null)), 1);
		//    5   10:aload_0         
		//    6   11:getfield        #19  <Field IBinder mRemote>
		//    7   14:iconst_2        
		//    8   15:aload_1         
		//    9   16:aconst_null     
		//   10   17:iconst_1        
		//   11   18:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   12   23:pop             
			parcel.recycle();
		//   13   24:aload_1         
		//   14   25:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   15   28:return          
			Exception exception;
			exception;
		//   16   29:astore_2        
			parcel.recycle();
		//   17   30:aload_1         
		//   18   31:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   19   34:aload_2         
		//   20   35:athrow          
		}

		public void onSessionReady()
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_1        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_1         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(13, parcel, ((Parcel) (null)), 1);
		//    5   10:aload_0         
		//    6   11:getfield        #19  <Field IBinder mRemote>
		//    7   14:bipush          13
		//    8   16:aload_1         
		//    9   17:aconst_null     
		//   10   18:iconst_1        
		//   11   19:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   12   24:pop             
			parcel.recycle();
		//   13   25:aload_1         
		//   14   26:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   15   29:return          
			Exception exception;
			exception;
		//   16   30:astore_2        
			parcel.recycle();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   19   35:aload_2         
		//   20   36:athrow          
		}

		public void onShuffleModeChanged(int i)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    5   10:aload_2         
		//    6   11:iload_1         
		//    7   12:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(12, parcel, ((Parcel) (null)), 1);
		//    8   15:aload_0         
		//    9   16:getfield        #19  <Field IBinder mRemote>
		//   10   19:bipush          12
		//   11   21:aload_2         
		//   12   22:aconst_null     
		//   13   23:iconst_1        
		//   14   24:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   15   29:pop             
			parcel.recycle();
		//   16   30:aload_2         
		//   17   31:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   18   34:return          
			Exception exception;
			exception;
		//   19   35:astore_3        
			parcel.recycle();
		//   20   36:aload_2         
		//   21   37:invokevirtual   #53  <Method void Parcel.recycle()>
			throw exception;
		//   22   40:aload_3         
		//   23   41:athrow          
		}

		public void onShuffleModeChangedRemoved(boolean flag)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_3         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   5   10:iload_1         
		//*   6   11:ifeq            53
				i = 1;
		//    7   14:iconst_1        
		//    8   15:istore_2        
			else
		//*   9   16:goto            19
		//*  10   19:aload_3         
		//*  11   20:iload_2         
		//*  12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  13   24:aload_0         
		//*  14   25:getfield        #19  <Field IBinder mRemote>
		//*  15   28:bipush          10
		//*  16   30:aload_3         
		//*  17   31:aconst_null     
		//*  18   32:iconst_1        
		//*  19   33:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  20   38:pop             
		//*  21   39:aload_3         
		//*  22   40:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  23   43:return          
		//*  24   44:astore          4
		//*  25   46:aload_3         
		//*  26   47:invokevirtual   #53  <Method void Parcel.recycle()>
		//*  27   50:aload           4
		//*  28   52:athrow          
				i = 0;
		//   29   53:iconst_0        
		//   30   54:istore_2        
			parcel.writeInt(i);
			mRemote.transact(10, parcel, ((Parcel) (null)), 1);
			parcel.recycle();
			return;
			exception;
			parcel.recycle();
			throw exception;
		//*  31   55:goto            19
		}

		public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
			if(parcelablevolumeinfo == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			parcelablevolumeinfo.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #101 <Method void ParcelableVolumeInfo.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
			mRemote.transact(8, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:bipush          8
		//   21   39:aload_2         
		//   22   40:aconst_null     
		//   23   41:iconst_1        
		//   24   42:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   47:pop             
			parcel.recycle();
		//   26   48:aload_2         
		//   27   49:invokevirtual   #53  <Method void Parcel.recycle()>
			return;
		//   28   52:return          
			parcelablevolumeinfo;
		//   29   53:astore_1        
			parcel.recycle();
		//   30   54:aload_2         
		//   31   55:invokevirtual   #53  <Method void Parcel.recycle()>
			throw parcelablevolumeinfo;
		//   32   58:aload_1         
		//   33   59:athrow          
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


	public abstract void onCaptioningEnabledChanged(boolean flag)
		throws RemoteException;

	public abstract void onEvent(String s, Bundle bundle)
		throws RemoteException;

	public abstract void onExtrasChanged(Bundle bundle)
		throws RemoteException;

	public abstract void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		throws RemoteException;

	public abstract void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
		throws RemoteException;

	public abstract void onQueueChanged(List list)
		throws RemoteException;

	public abstract void onQueueTitleChanged(CharSequence charsequence)
		throws RemoteException;

	public abstract void onRepeatModeChanged(int i)
		throws RemoteException;

	public abstract void onSessionDestroyed()
		throws RemoteException;

	public abstract void onSessionReady()
		throws RemoteException;

	public abstract void onShuffleModeChanged(int i)
		throws RemoteException;

	public abstract void onShuffleModeChangedRemoved(boolean flag)
		throws RemoteException;

	public abstract void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		throws RemoteException;
}

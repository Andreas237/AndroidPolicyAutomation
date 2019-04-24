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
		//    6    9:invokeinterface #52  <Method IInterface IBinder.queryLocalInterface(String)>
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
		//   19   36:invokespecial   #55  <Method void IMediaControllerCallback$Stub$Proxy(IBinder)>
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
		//*   1    1:lookupswitch    11: default 100
		//		               1: 111
		//		               2: 155
		//		               3: 167
		//		               4: 205
		//		               5: 243
		//		               6: 262
		//		               7: 300
		//		               8: 338
		//		               9: 376
		//		               10: 392
		//		               1598968902: 103
		//*   2  100:goto            422
			case 1598968902: 
				parcel1.writeString("android.support.v4.media.session.IMediaControllerCallback");
		//    3  103:aload_3         
		//    4  104:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    5  106:invokevirtual   #67  <Method void Parcel.writeString(String)>
				return true;
		//    6  109:iconst_1        
		//    7  110:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//    8  111:aload_2         
		//    9  112:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   10  114:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				parcel1 = ((Parcel) (parcel.readString()));
		//   11  117:aload_2         
		//   12  118:invokevirtual   #74  <Method String Parcel.readString()>
		//   13  121:astore_3        
				if(parcel.readInt() != 0)
		//*  14  122:aload_2         
		//*  15  123:invokevirtual   #78  <Method int Parcel.readInt()>
		//*  16  126:ifeq            145
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   17  129:getstatic       #84  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   18  132:aload_2         
		//   19  133:invokeinterface #90  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   20  138:checkcast       #80  <Class Bundle>
		//   21  141:astore_2        
				else
		//*  22  142:goto            147
					parcel = null;
		//   23  145:aconst_null     
		//   24  146:astore_2        
				onEvent(((String) (parcel1)), ((Bundle) (parcel)));
		//   25  147:aload_0         
		//   26  148:aload_3         
		//   27  149:aload_2         
		//   28  150:invokevirtual   #94  <Method void onEvent(String, Bundle)>
				return true;
		//   29  153:iconst_1        
		//   30  154:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   31  155:aload_2         
		//   32  156:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   33  158:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				onSessionDestroyed();
		//   34  161:aload_0         
		//   35  162:invokevirtual   #97  <Method void onSessionDestroyed()>
				return true;
		//   36  165:iconst_1        
		//   37  166:ireturn         

			case 3: // '\003'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   38  167:aload_2         
		//   39  168:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   40  170:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  41  173:aload_2         
		//*  42  174:invokevirtual   #78  <Method int Parcel.readInt()>
		//*  43  177:ifeq            196
					parcel = ((Parcel) ((PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel)));
		//   44  180:getstatic       #100 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
		//   45  183:aload_2         
		//   46  184:invokeinterface #90  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   47  189:checkcast       #99  <Class PlaybackStateCompat>
		//   48  192:astore_2        
				else
		//*  49  193:goto            198
					parcel = null;
		//   50  196:aconst_null     
		//   51  197:astore_2        
				onPlaybackStateChanged(((PlaybackStateCompat) (parcel)));
		//   52  198:aload_0         
		//   53  199:aload_2         
		//   54  200:invokevirtual   #104 <Method void onPlaybackStateChanged(PlaybackStateCompat)>
				return true;
		//   55  203:iconst_1        
		//   56  204:ireturn         

			case 4: // '\004'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   57  205:aload_2         
		//   58  206:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   59  208:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  60  211:aload_2         
		//*  61  212:invokevirtual   #78  <Method int Parcel.readInt()>
		//*  62  215:ifeq            234
					parcel = ((Parcel) ((MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel)));
		//   63  218:getstatic       #107 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
		//   64  221:aload_2         
		//   65  222:invokeinterface #90  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   66  227:checkcast       #106 <Class MediaMetadataCompat>
		//   67  230:astore_2        
				else
		//*  68  231:goto            236
					parcel = null;
		//   69  234:aconst_null     
		//   70  235:astore_2        
				onMetadataChanged(((MediaMetadataCompat) (parcel)));
		//   71  236:aload_0         
		//   72  237:aload_2         
		//   73  238:invokevirtual   #111 <Method void onMetadataChanged(MediaMetadataCompat)>
				return true;
		//   74  241:iconst_1        
		//   75  242:ireturn         

			case 5: // '\005'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   76  243:aload_2         
		//   77  244:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   78  246:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				onQueueChanged(((List) (parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR))));
		//   79  249:aload_0         
		//   80  250:aload_2         
		//   81  251:getstatic       #114 <Field android.os.Parcelable$Creator MediaSessionCompat$QueueItem.CREATOR>
		//   82  254:invokevirtual   #118 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
		//   83  257:invokevirtual   #122 <Method void onQueueChanged(List)>
				return true;
		//   84  260:iconst_1        
		//   85  261:ireturn         

			case 6: // '\006'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//   86  262:aload_2         
		//   87  263:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//   88  265:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  89  268:aload_2         
		//*  90  269:invokevirtual   #78  <Method int Parcel.readInt()>
		//*  91  272:ifeq            291
					parcel = ((Parcel) ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel)));
		//   92  275:getstatic       #127 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
		//   93  278:aload_2         
		//   94  279:invokeinterface #90  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   95  284:checkcast       #129 <Class CharSequence>
		//   96  287:astore_2        
				else
		//*  97  288:goto            293
					parcel = null;
		//   98  291:aconst_null     
		//   99  292:astore_2        
				onQueueTitleChanged(((CharSequence) (parcel)));
		//  100  293:aload_0         
		//  101  294:aload_2         
		//  102  295:invokevirtual   #133 <Method void onQueueTitleChanged(CharSequence)>
				return true;
		//  103  298:iconst_1        
		//  104  299:ireturn         

			case 7: // '\007'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  105  300:aload_2         
		//  106  301:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  107  303:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 108  306:aload_2         
		//* 109  307:invokevirtual   #78  <Method int Parcel.readInt()>
		//* 110  310:ifeq            329
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  111  313:getstatic       #84  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  112  316:aload_2         
		//  113  317:invokeinterface #90  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  114  322:checkcast       #80  <Class Bundle>
		//  115  325:astore_2        
				else
		//* 116  326:goto            331
					parcel = null;
		//  117  329:aconst_null     
		//  118  330:astore_2        
				onExtrasChanged(((Bundle) (parcel)));
		//  119  331:aload_0         
		//  120  332:aload_2         
		//  121  333:invokevirtual   #137 <Method void onExtrasChanged(Bundle)>
				return true;
		//  122  336:iconst_1        
		//  123  337:ireturn         

			case 8: // '\b'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  124  338:aload_2         
		//  125  339:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  126  341:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//* 127  344:aload_2         
		//* 128  345:invokevirtual   #78  <Method int Parcel.readInt()>
		//* 129  348:ifeq            367
					parcel = ((Parcel) ((ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel)));
		//  130  351:getstatic       #140 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
		//  131  354:aload_2         
		//  132  355:invokeinterface #90  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  133  360:checkcast       #139 <Class ParcelableVolumeInfo>
		//  134  363:astore_2        
				else
		//* 135  364:goto            369
					parcel = null;
		//  136  367:aconst_null     
		//  137  368:astore_2        
				onVolumeInfoChanged(((ParcelableVolumeInfo) (parcel)));
		//  138  369:aload_0         
		//  139  370:aload_2         
		//  140  371:invokevirtual   #144 <Method void onVolumeInfoChanged(ParcelableVolumeInfo)>
				return true;
		//  141  374:iconst_1        
		//  142  375:ireturn         

			case 9: // '\t'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  143  376:aload_2         
		//  144  377:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  145  379:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				onRepeatModeChanged(parcel.readInt());
		//  146  382:aload_0         
		//  147  383:aload_2         
		//  148  384:invokevirtual   #78  <Method int Parcel.readInt()>
		//  149  387:invokevirtual   #148 <Method void onRepeatModeChanged(int)>
				return true;
		//  150  390:iconst_1        
		//  151  391:ireturn         

			case 10: // '\n'
				parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
		//  152  392:aload_2         
		//  153  393:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//  154  395:invokevirtual   #70  <Method void Parcel.enforceInterface(String)>
				boolean flag;
				if(parcel.readInt() != 0)
		//* 155  398:aload_2         
		//* 156  399:invokevirtual   #78  <Method int Parcel.readInt()>
		//* 157  402:ifeq            411
					flag = true;
		//  158  405:iconst_1        
		//  159  406:istore          5
				else
		//* 160  408:goto            414
					flag = false;
		//  161  411:iconst_0        
		//  162  412:istore          5
				onShuffleModeChanged(flag);
		//  163  414:aload_0         
		//  164  415:iload           5
		//  165  417:invokevirtual   #152 <Method void onShuffleModeChanged(boolean)>
				return true;
		//  166  420:iconst_1        
		//  167  421:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//  168  422:aload_0         
		//  169  423:iload_1         
		//  170  424:aload_2         
		//  171  425:aload_3         
		//  172  426:iload           4
		//  173  428:invokespecial   #154 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//  174  431:ireturn         
		}

		private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
		static final int TRANSACTION_onEvent = 1;
		static final int TRANSACTION_onExtrasChanged = 7;
		static final int TRANSACTION_onMetadataChanged = 4;
		static final int TRANSACTION_onPlaybackStateChanged = 3;
		static final int TRANSACTION_onQueueChanged = 5;
		static final int TRANSACTION_onQueueTitleChanged = 6;
		static final int TRANSACTION_onRepeatModeChanged = 9;
		static final int TRANSACTION_onSessionDestroyed = 2;
		static final int TRANSACTION_onShuffleModeChanged = 10;
		static final int TRANSACTION_onVolumeInfoChanged = 8;

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.v4.media.session.IMediaControllerCallback");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
		//    5    8:invokevirtual   #43  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class Stub.Proxy
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
		//    7   12:invokevirtual   #43  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_33;
		//    8   15:aload_2         
		//    9   16:ifnull          33
			parcel.writeInt(1);
		//   10   19:aload_3         
		//   11   20:iconst_1        
		//   12   21:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokevirtual   #53  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_38;
		//   17   30:goto            38
			parcel.writeInt(0);
		//   18   33:aload_3         
		//   19   34:iconst_0        
		//   20   35:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mRemote.transact(1, parcel, ((Parcel) (null)), 1);
		//   21   38:aload_0         
		//   22   39:getfield        #19  <Field IBinder mRemote>
		//   23   42:iconst_1        
		//   24   43:aload_3         
		//   25   44:aconst_null     
		//   26   45:iconst_1        
		//   27   46:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   28   51:pop             
			parcel.recycle();
		//   29   52:aload_3         
		//   30   53:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   31   56:return          
			s;
		//   32   57:astore_1        
			parcel.recycle();
		//   33   58:aload_3         
		//   34   59:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//    9   16:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #53  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mRemote.transact(7, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:bipush          7
		//   21   39:aload_2         
		//   22   40:aconst_null     
		//   23   41:iconst_1        
		//   24   42:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   47:pop             
			parcel.recycle();
		//   26   48:aload_2         
		//   27   49:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   28   52:return          
			bundle;
		//   29   53:astore_1        
			parcel.recycle();
		//   30   54:aload_2         
		//   31   55:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//    9   16:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mediametadatacompat.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #70  <Method void MediaMetadataCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mRemote.transact(4, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:iconst_4        
		//   21   38:aload_2         
		//   22   39:aconst_null     
		//   23   40:iconst_1        
		//   24   41:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   46:pop             
			parcel.recycle();
		//   26   47:aload_2         
		//   27   48:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   28   51:return          
			mediametadatacompat;
		//   29   52:astore_1        
			parcel.recycle();
		//   30   53:aload_2         
		//   31   54:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//    9   16:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			playbackstatecompat.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #75  <Method void PlaybackStateCompat.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mRemote.transact(3, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:iconst_3        
		//   21   38:aload_2         
		//   22   39:aconst_null     
		//   23   40:iconst_1        
		//   24   41:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   46:pop             
			parcel.recycle();
		//   26   47:aload_2         
		//   27   48:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   28   51:return          
			playbackstatecompat;
		//   29   52:astore_1        
			parcel.recycle();
		//   30   53:aload_2         
		//   31   54:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//    7   12:invokevirtual   #80  <Method void Parcel.writeTypedList(List)>
			mRemote.transact(5, parcel, ((Parcel) (null)), 1);
		//    8   15:aload_0         
		//    9   16:getfield        #19  <Field IBinder mRemote>
		//   10   19:iconst_5        
		//   11   20:aload_2         
		//   12   21:aconst_null     
		//   13   22:iconst_1        
		//   14   23:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   15   28:pop             
			parcel.recycle();
		//   16   29:aload_2         
		//   17   30:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   18   33:return          
			list;
		//   19   34:astore_1        
			parcel.recycle();
		//   20   35:aload_2         
		//   21   36:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//    9   16:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			TextUtils.writeToParcel(charsequence, parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokestatic    #89  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mRemote.transact(6, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:bipush          6
		//   21   39:aload_2         
		//   22   40:aconst_null     
		//   23   41:iconst_1        
		//   24   42:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   47:pop             
			parcel.recycle();
		//   26   48:aload_2         
		//   27   49:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   28   52:return          
			charsequence;
		//   29   53:astore_1        
			parcel.recycle();
		//   30   54:aload_2         
		//   31   55:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//    7   12:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mRemote.transact(9, parcel, ((Parcel) (null)), 1);
		//    8   15:aload_0         
		//    9   16:getfield        #19  <Field IBinder mRemote>
		//   10   19:bipush          9
		//   11   21:aload_2         
		//   12   22:aconst_null     
		//   13   23:iconst_1        
		//   14   24:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   15   29:pop             
			parcel.recycle();
		//   16   30:aload_2         
		//   17   31:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   18   34:return          
			Exception exception;
			exception;
		//   19   35:astore_3        
			parcel.recycle();
		//   20   36:aload_2         
		//   21   37:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//   11   18:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   12   23:pop             
			parcel.recycle();
		//   13   24:aload_1         
		//   14   25:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   15   28:return          
			Exception exception;
			exception;
		//   16   29:astore_2        
			parcel.recycle();
		//   17   30:aload_1         
		//   18   31:invokevirtual   #62  <Method void Parcel.recycle()>
			throw exception;
		//   19   34:aload_2         
		//   20   35:athrow          
		}

		public void onShuffleModeChanged(boolean flag)
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
		//*  12   21:invokevirtual   #47  <Method void Parcel.writeInt(int)>
		//*  13   24:aload_0         
		//*  14   25:getfield        #19  <Field IBinder mRemote>
		//*  15   28:bipush          10
		//*  16   30:aload_3         
		//*  17   31:aconst_null     
		//*  18   32:iconst_1        
		//*  19   33:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  20   38:pop             
		//*  21   39:aload_3         
		//*  22   40:invokevirtual   #62  <Method void Parcel.recycle()>
		//*  23   43:return          
		//*  24   44:astore          4
		//*  25   46:aload_3         
		//*  26   47:invokevirtual   #62  <Method void Parcel.recycle()>
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
		//    9   16:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			parcelablevolumeinfo.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #98  <Method void ParcelableVolumeInfo.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #47  <Method void Parcel.writeInt(int)>
			mRemote.transact(8, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #19  <Field IBinder mRemote>
		//   20   37:bipush          8
		//   21   39:aload_2         
		//   22   40:aconst_null     
		//   23   41:iconst_1        
		//   24   42:invokeinterface #59  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   47:pop             
			parcel.recycle();
		//   26   48:aload_2         
		//   27   49:invokevirtual   #62  <Method void Parcel.recycle()>
			return;
		//   28   52:return          
			parcelablevolumeinfo;
		//   29   53:astore_1        
			parcel.recycle();
		//   30   54:aload_2         
		//   31   55:invokevirtual   #62  <Method void Parcel.recycle()>
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

	public abstract void onShuffleModeChanged(boolean flag)
		throws RemoteException;

	public abstract void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		throws RemoteException;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.mediacenter.localmusic;

import android.os.*;
import com.android.mediacenter.data.bean.SongBean;

// Referenced classes of package com.android.mediacenter.localmusic:
//			IMediaPlaybackService, NetSongInfo

public static abstract class IMediaPlaybackService$Stub extends Binder
	implements IMediaPlaybackService
{
	static class Proxy
		implements IMediaPlaybackService
	{

		public void addNextPlay(SongBean songbean)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(songbean == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			songbean.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void SongBean.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(65, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #19  <Field IBinder mRemote>
		//   22   41:bipush          65
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
			songbean;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw songbean;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public boolean addUrltoPlayList(SongBean asongbean[], boolean flag)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedArray(((android.os.Parcelable []) (asongbean)), 0);
		//    7   17:aload           4
		//    8   19:aload_1         
		//    9   20:iconst_0        
		//   10   21:invokevirtual   #65  <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			int i;
			if(flag)
		//*  11   24:iload_2         
		//*  12   25:ifeq            103
				i = 1;
		//   13   28:iconst_1        
		//   14   29:istore_3        
			else
		//*  15   30:goto            33
		//*  16   33:aload           4
		//*  17   35:iload_3         
		//*  18   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  19   39:aload_0         
		//*  20   40:getfield        #19  <Field IBinder mRemote>
		//*  21   43:bipush          35
		//*  22   45:aload           4
		//*  23   47:aload           5
		//*  24   49:iconst_0        
		//*  25   50:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  26   55:pop             
		//*  27   56:aload           5
		//*  28   58:invokevirtual   #55  <Method void Parcel.readException()>
		//*  29   61:aload           5
		//*  30   63:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  31   66:istore_3        
		//*  32   67:iload_3         
		//*  33   68:ifeq            76
		//*  34   71:iconst_1        
		//*  35   72:istore_2        
		//*  36   73:goto            78
		//*  37   76:iconst_0        
		//*  38   77:istore_2        
		//*  39   78:aload           5
		//*  40   80:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  41   83:aload           4
		//*  42   85:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  43   88:iload_2         
		//*  44   89:ireturn         
		//*  45   90:astore_1        
		//*  46   91:aload           5
		//*  47   93:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  48   96:aload           4
		//*  49   98:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  50  101:aload_1         
		//*  51  102:athrow          
				i = 0;
		//   52  103:iconst_0        
		//   53  104:istore_3        
			parcel.writeInt(i);
			mRemote.transact(35, parcel, parcel1, 0);
			parcel1.readException();
			i = parcel1.readInt();
			if(i != 0)
				flag = true;
			else
				flag = false;
			parcel1.recycle();
			parcel.recycle();
			return flag;
			asongbean;
			parcel1.recycle();
			parcel.recycle();
			throw asongbean;
		//*  54  105:goto            33
		}

		public void addUrltoPlayListInPieces(SongBean asongbean[], int i)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedArray(((android.os.Parcelable []) (asongbean)), 0);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #65  <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			parcel.writeInt(i);
		//   11   21:aload_3         
		//   12   22:iload_2         
		//   13   23:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(49, parcel, parcel1, 0);
		//   14   26:aload_0         
		//   15   27:getfield        #19  <Field IBinder mRemote>
		//   16   30:bipush          49
		//   17   32:aload_3         
		//   18   33:aload           4
		//   19   35:iconst_0        
		//   20   36:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   21   41:pop             
			parcel1.readException();
		//   22   42:aload           4
		//   23   44:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   24   47:aload           4
		//   25   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   26   52:aload_3         
		//   27   53:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   28   56:return          
			asongbean;
		//   29   57:astore_1        
			parcel1.recycle();
		//   30   58:aload           4
		//   31   60:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   63:aload_3         
		//   33   64:invokevirtual   #58  <Method void Parcel.recycle()>
			throw asongbean;
		//   34   67:aload_1         
		//   35   68:athrow          
		}

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public void deleteSongs(SongBean asongbean[])
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedArray(((android.os.Parcelable []) (asongbean)), 0);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:iconst_0        
		//   10   17:invokevirtual   #65  <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			mRemote.transact(39, parcel, parcel1, 0);
		//   11   20:aload_0         
		//   12   21:getfield        #19  <Field IBinder mRemote>
		//   13   24:bipush          39
		//   14   26:aload_2         
		//   15   27:aload_3         
		//   16   28:iconst_0        
		//   17   29:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   18   34:pop             
			parcel1.readException();
		//   19   35:aload_3         
		//   20   36:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   21   39:aload_3         
		//   22   40:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   25   47:return          
			asongbean;
		//   26   48:astore_1        
			parcel1.recycle();
		//   27   49:aload_3         
		//   28   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   53:aload_2         
		//   30   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw asongbean;
		//   31   57:aload_1         
		//   32   58:athrow          
		}

		public long duration()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(14, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          14
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
		//   18   38:invokevirtual   #80  <Method long Parcel.readLong()>
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

		public long getAlbumId()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
		//   18   38:invokevirtual   #80  <Method long Parcel.readLong()>
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

		public String getAlbumName()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
			s = parcel1.readString();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #86  <Method String Parcel.readString()>
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

		public long getArtistId()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(11, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          11
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
		//   18   38:invokevirtual   #80  <Method long Parcel.readLong()>
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

		public String getArtistName()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(12, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          12
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
		//   18   34:invokevirtual   #86  <Method String Parcel.readString()>
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

		public long getAudioId()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(7, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          7
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
		//   18   38:invokevirtual   #80  <Method long Parcel.readLong()>
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

		public int getAudioSessionId()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(58, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          58
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public int getBufferPercentage()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(24, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          24
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public String getCurrentDMRName()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(43, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          43
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
		//   18   34:invokevirtual   #86  <Method String Parcel.readString()>
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

		public long getCurrentPlayPlaylistId()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(32, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          32
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
		//   18   38:invokevirtual   #80  <Method long Parcel.readLong()>
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

		public int getCurrentQuality()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(70, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          70
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public boolean getDolbyEffectOn()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(36, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          36
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public long[] getErrorIds()
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
			long al[];
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(59, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          59
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			al = parcel1.createLongArray();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #101 <Method long[] Parcel.createLongArray()>
		//   19   37:astore_3        
			parcel1.recycle();
		//   20   38:aload_2         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_1         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return al;
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

		public int getFrequency()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(76, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          76
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public String getInterfaceDescriptor()
		{
			return "com.android.mediacenter.localmusic.IMediaPlaybackService";
		//    0    0:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    1    2:areturn         
		}

		public android.support.v4.media.session.MediaSessionCompat.Token getMediaSessionToken()
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
			android.support.v4.media.session.MediaSessionCompat.Token token;
label0:
			{
				parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(74, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          74
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
		//*  18   34:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					token = (android.support.v4.media.session.MediaSessionCompat.Token)android.support.v4.media.session.MediaSessionCompat.Token.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #111 <Field android.os.Parcelable$Creator android.support.v4.media.session.MediaSessionCompat$Token.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #117 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #107 <Class android.support.v4.media.session.MediaSessionCompat$Token>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				token = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return token;
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

		public SongBean[] getMusicIdOnly()
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
			SongBean asongbean[];
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(57, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          57
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			asongbean = (SongBean[])parcel1.createTypedArray(SongBean.CREATOR);
		//   17   33:aload_2         
		//   18   34:getstatic       #120 <Field android.os.Parcelable$Creator SongBean.CREATOR>
		//   19   37:invokevirtual   #124 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
		//   20   40:checkcast       #126 <Class SongBean[]>
		//   21   43:astore_3        
			parcel1.recycle();
		//   22   44:aload_2         
		//   23   45:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   24   48:aload_1         
		//   25   49:invokevirtual   #58  <Method void Parcel.recycle()>
			return asongbean;
		//   26   52:aload_3         
		//   27   53:areturn         
			Exception exception;
			exception;
		//   28   54:astore_3        
			parcel1.recycle();
		//   29   55:aload_2         
		//   30   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   59:aload_1         
		//   32   60:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   33   63:aload_3         
		//   34   64:athrow          
		}

		public SongBean[] getMusicInfos(int i, int j)
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
			SongBean asongbean[];
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   15:aload_3         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeInt(j);
		//   10   20:aload_3         
		//   11   21:iload_2         
		//   12   22:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(55, parcel, parcel1, 0);
		//   13   25:aload_0         
		//   14   26:getfield        #19  <Field IBinder mRemote>
		//   15   29:bipush          55
		//   16   31:aload_3         
		//   17   32:aload           4
		//   18   34:iconst_0        
		//   19   35:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   20   40:pop             
			parcel1.readException();
		//   21   41:aload           4
		//   22   43:invokevirtual   #55  <Method void Parcel.readException()>
			asongbean = (SongBean[])parcel1.createTypedArray(SongBean.CREATOR);
		//   23   46:aload           4
		//   24   48:getstatic       #120 <Field android.os.Parcelable$Creator SongBean.CREATOR>
		//   25   51:invokevirtual   #124 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
		//   26   54:checkcast       #126 <Class SongBean[]>
		//   27   57:astore          5
			parcel1.recycle();
		//   28   59:aload           4
		//   29   61:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   64:aload_3         
		//   31   65:invokevirtual   #58  <Method void Parcel.recycle()>
			return asongbean;
		//   32   68:aload           5
		//   33   70:areturn         
			Exception exception;
			exception;
		//   34   71:astore          5
			parcel1.recycle();
		//   35   73:aload           4
		//   36   75:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   37   78:aload_3         
		//   38   79:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   39   82:aload           5
		//   40   84:athrow          
		}

		public NetSongInfo getNetMusicInfo()
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
			NetSongInfo netsonginfo;
label0:
			{
				parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
		//*  18   34:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					netsonginfo = (NetSongInfo)NetSongInfo.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #133 <Field android.os.Parcelable$Creator NetSongInfo.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #117 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #132 <Class NetSongInfo>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				netsonginfo = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return netsonginfo;
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

		public SongBean[] getNetMusicInfos()
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
			SongBean asongbean[];
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(31, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          31
		//   10   20:aload_1         
		//   11   21:aload_2         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_2         
		//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			asongbean = (SongBean[])parcel1.createTypedArray(SongBean.CREATOR);
		//   17   33:aload_2         
		//   18   34:getstatic       #120 <Field android.os.Parcelable$Creator SongBean.CREATOR>
		//   19   37:invokevirtual   #124 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
		//   20   40:checkcast       #126 <Class SongBean[]>
		//   21   43:astore_3        
			parcel1.recycle();
		//   22   44:aload_2         
		//   23   45:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   24   48:aload_1         
		//   25   49:invokevirtual   #58  <Method void Parcel.recycle()>
			return asongbean;
		//   26   52:aload_3         
		//   27   53:areturn         
			Exception exception;
			exception;
		//   28   54:astore_3        
			parcel1.recycle();
		//   29   55:aload_2         
		//   30   56:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   31   59:aload_1         
		//   32   60:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   33   63:aload_3         
		//   34   64:athrow          
		}

		public SongBean getNextBean()
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
			SongBean songbean;
label0:
			{
				parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(68, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          68
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
		//*  18   34:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					songbean = (SongBean)SongBean.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #120 <Field android.os.Parcelable$Creator SongBean.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #117 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #42  <Class SongBean>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				songbean = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return songbean;
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

		public boolean getOneShot()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(28, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          28
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public String getOnlinePlaylistId()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(38, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          38
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
		//   18   34:invokevirtual   #86  <Method String Parcel.readString()>
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

		public String getOnlinePlaylistType()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(34, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          34
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
		//   18   34:invokevirtual   #86  <Method String Parcel.readString()>
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

		public String getPath()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
			s = parcel1.readString();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #86  <Method String Parcel.readString()>
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

		public int getPlayMode()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(22, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          22
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public int getPlaylistLength()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(56, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          56
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public SongBean getPrevBean()
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
			SongBean songbean;
label0:
			{
				parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				mRemote.transact(69, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          69
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
		//*  18   34:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					songbean = (SongBean)SongBean.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #120 <Field android.os.Parcelable$Creator SongBean.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #117 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #42  <Class SongBean>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				songbean = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return songbean;
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

		public long[] getQueue()
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
			long al[];
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
			al = parcel1.createLongArray();
		//   17   33:aload_2         
		//   18   34:invokevirtual   #101 <Method long[] Parcel.createLongArray()>
		//   19   37:astore_3        
			parcel1.recycle();
		//   20   38:aload_2         
		//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_1         
		//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
			return al;
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

		public int getQueuePosition()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(19, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          19
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public int getRepeatTime()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(67, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          67
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
		//   18   34:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public SongBean getSongBean()
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
			SongBean songbean;
label0:
			{
				parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
		//*  18   34:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  19   37:ifeq            56
				{
					songbean = (SongBean)SongBean.CREATOR.createFromParcel(parcel1);
		//   20   40:getstatic       #120 <Field android.os.Parcelable$Creator SongBean.CREATOR>
		//   21   43:aload_3         
		//   22   44:invokeinterface #117 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   23   49:checkcast       #42  <Class SongBean>
		//   24   52:astore_1        
					break label0;
		//   25   53:goto            58
				}
				songbean = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
			}
			parcel1.recycle();
		//   28   58:aload_3         
		//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   30   62:aload_2         
		//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
			return songbean;
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

		public SongBean getSongBeanFromId(long l)
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
			SongBean songbean;
label0:
			{
				parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
				parcel.writeLong(l);
		//    7   17:aload           4
		//    8   19:lload_1         
		//    9   20:invokevirtual   #153 <Method void Parcel.writeLong(long)>
				mRemote.transact(52, parcel, parcel1, 0);
		//   10   23:aload_0         
		//   11   24:getfield        #19  <Field IBinder mRemote>
		//   12   27:bipush          52
		//   13   29:aload           4
		//   14   31:aload           5
		//   15   33:iconst_0        
		//   16   34:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   39:pop             
				parcel1.readException();
		//   18   40:aload           5
		//   19   42:invokevirtual   #55  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  20   45:aload           5
		//*  21   47:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  22   50:ifeq            70
				{
					songbean = (SongBean)SongBean.CREATOR.createFromParcel(parcel1);
		//   23   53:getstatic       #120 <Field android.os.Parcelable$Creator SongBean.CREATOR>
		//   24   56:aload           5
		//   25   58:invokeinterface #117 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   26   63:checkcast       #42  <Class SongBean>
		//   27   66:astore_3        
					break label0;
		//   28   67:goto            72
				}
				songbean = null;
		//   29   70:aconst_null     
		//   30   71:astore_3        
			}
			parcel1.recycle();
		//   31   72:aload           5
		//   32   74:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   33   77:aload           4
		//   34   79:invokevirtual   #58  <Method void Parcel.recycle()>
			return songbean;
		//   35   82:aload_3         
		//   36   83:areturn         
			Exception exception;
			exception;
		//   37   84:astore_3        
			parcel1.recycle();
		//   38   85:aload           5
		//   39   87:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   40   90:aload           4
		//   41   92:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   42   95:aload_3         
		//   43   96:athrow          
		}

		public String getTrackName()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(8, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          8
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
		//   18   34:invokevirtual   #86  <Method String Parcel.readString()>
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

		public boolean hasMultiscreenDevice()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(53, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          53
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public void initializeDlna()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(40, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          40
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

		public boolean isAllSongsOnline()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(63, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          63
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public boolean isContainsOnlineSong()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(61, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          61
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public boolean isDownloadingLyric(String s)
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
			int i;
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           4
		//    8   19:aload_1         
		//    9   20:invokevirtual   #163 <Method void Parcel.writeString(String)>
			mRemote.transact(51, parcel, parcel1, 0);
		//   10   23:aload_0         
		//   11   24:getfield        #19  <Field IBinder mRemote>
		//   12   27:bipush          51
		//   13   29:aload           4
		//   14   31:aload           5
		//   15   33:iconst_0        
		//   16   34:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   39:pop             
			parcel1.readException();
		//   18   40:aload           5
		//   19   42:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   20   45:aload           5
		//   21   47:invokevirtual   #69  <Method int Parcel.readInt()>
		//   22   50:istore_2        
			boolean flag;
			if(i != 0)
		//*  23   51:iload_2         
		//*  24   52:ifeq            60
				flag = true;
		//   25   55:iconst_1        
		//   26   56:istore_3        
			else
		//*  27   57:goto            62
				flag = false;
		//   28   60:iconst_0        
		//   29   61:istore_3        
			parcel1.recycle();
		//   30   62:aload           5
		//   31   64:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   67:aload           4
		//   33   69:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   34   72:iload_3         
		//   35   73:ireturn         
			s;
		//   36   74:astore_1        
			parcel1.recycle();
		//   37   75:aload           5
		//   38   77:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   80:aload           4
		//   40   82:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   41   85:aload_1         
		//   42   86:athrow          
		}

		public boolean isInitialized()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(18, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          18
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public boolean isOnlinePrepearing()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(17, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          17
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public boolean isPauseAfterCurSong()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(73, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          73
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public boolean isPlayerClientRendering()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(42, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          42
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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

		public boolean isPlaying()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(6, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          6
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
		//   18   38:invokevirtual   #69  <Method int Parcel.readInt()>
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(5, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_5        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void openFile(String s, boolean flag)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           4
		//    8   19:aload_1         
		//    9   20:invokevirtual   #163 <Method void Parcel.writeString(String)>
			int i;
			if(flag)
		//*  10   23:iload_2         
		//*  11   24:ifeq            84
				i = 1;
		//   12   27:iconst_1        
		//   13   28:istore_3        
			else
		//*  14   29:goto            32
		//*  15   32:aload           4
		//*  16   34:iload_3         
		//*  17   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  18   38:aload_0         
		//*  19   39:getfield        #19  <Field IBinder mRemote>
		//*  20   42:bipush          25
		//*  21   44:aload           4
		//*  22   46:aload           5
		//*  23   48:iconst_0        
		//*  24   49:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  25   54:pop             
		//*  26   55:aload           5
		//*  27   57:invokevirtual   #55  <Method void Parcel.readException()>
		//*  28   60:aload           5
		//*  29   62:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  30   65:aload           4
		//*  31   67:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  32   70:return          
		//*  33   71:astore_1        
		//*  34   72:aload           5
		//*  35   74:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  36   77:aload           4
		//*  37   79:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  38   82:aload_1         
		//*  39   83:athrow          
				i = 0;
		//   40   84:iconst_0        
		//   41   85:istore_3        
			parcel.writeInt(i);
			mRemote.transact(25, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			s;
			parcel1.recycle();
			parcel.recycle();
			throw s;
		//*  42   86:goto            32
		}

		public void openFileAsync(String s)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #163 <Method void Parcel.writeString(String)>
			mRemote.transact(26, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          26
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
			s;
		//   25   47:astore_1        
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   30   56:aload_1         
		//   31   57:athrow          
		}

		public void openUrlMusic(SongBean asongbean[], int i, long l, String s, String s1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          7
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          8
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           7
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedArray(((android.os.Parcelable []) (asongbean)), 0);
		//    7   17:aload           7
		//    8   19:aload_1         
		//    9   20:iconst_0        
		//   10   21:invokevirtual   #65  <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			parcel.writeInt(i);
		//   11   24:aload           7
		//   12   26:iload_2         
		//   13   27:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			parcel.writeLong(l);
		//   14   30:aload           7
		//   15   32:lload_3         
		//   16   33:invokevirtual   #153 <Method void Parcel.writeLong(long)>
			parcel.writeString(s);
		//   17   36:aload           7
		//   18   38:aload           5
		//   19   40:invokevirtual   #163 <Method void Parcel.writeString(String)>
			parcel.writeString(s1);
		//   20   43:aload           7
		//   21   45:aload           6
		//   22   47:invokevirtual   #163 <Method void Parcel.writeString(String)>
			mRemote.transact(33, parcel, parcel1, 0);
		//   23   50:aload_0         
		//   24   51:getfield        #19  <Field IBinder mRemote>
		//   25   54:bipush          33
		//   26   56:aload           7
		//   27   58:aload           8
		//   28   60:iconst_0        
		//   29   61:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   66:pop             
			parcel1.readException();
		//   31   67:aload           8
		//   32   69:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   72:aload           8
		//   34   74:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   77:aload           7
		//   36   79:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   37   82:return          
			asongbean;
		//   38   83:astore_1        
			parcel1.recycle();
		//   39   84:aload           8
		//   40   86:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   89:aload           7
		//   42   91:invokevirtual   #58  <Method void Parcel.recycle()>
			throw asongbean;
		//   43   94:aload_1         
		//   44   95:athrow          
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(3, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_3        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public boolean playSong(SongBean songbean)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(songbean == null)
				break MISSING_BLOCK_LABEL_37;
		//    7   17:aload_1         
		//    8   18:ifnull          37
			parcel.writeInt(1);
		//    9   21:aload           4
		//   10   23:iconst_1        
		//   11   24:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			songbean.writeToParcel(parcel, 0);
		//   12   27:aload_1         
		//   13   28:aload           4
		//   14   30:iconst_0        
		//   15   31:invokevirtual   #46  <Method void SongBean.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   16   34:goto            43
			parcel.writeInt(0);
		//   17   37:aload           4
		//   18   39:iconst_0        
		//   19   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			int i;
			mRemote.transact(62, parcel, parcel1, 0);
		//   20   43:aload_0         
		//   21   44:getfield        #19  <Field IBinder mRemote>
		//   22   47:bipush          62
		//   23   49:aload           4
		//   24   51:aload           5
		//   25   53:iconst_0        
		//   26   54:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   59:pop             
			parcel1.readException();
		//   28   60:aload           5
		//   29   62:invokevirtual   #55  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   30   65:aload           5
		//   31   67:invokevirtual   #69  <Method int Parcel.readInt()>
		//   32   70:istore_2        
			boolean flag;
			if(i != 0)
		//*  33   71:iload_2         
		//*  34   72:ifeq            80
				flag = true;
		//   35   75:iconst_1        
		//   36   76:istore_3        
			else
		//*  37   77:goto            82
				flag = false;
		//   38   80:iconst_0        
		//   39   81:istore_3        
			parcel1.recycle();
		//   40   82:aload           5
		//   41   84:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   42   87:aload           4
		//   43   89:invokevirtual   #58  <Method void Parcel.recycle()>
			return flag;
		//   44   92:iload_3         
		//   45   93:ireturn         
			songbean;
		//   46   94:astore_1        
			parcel1.recycle();
		//   47   95:aload           5
		//   48   97:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   49  100:aload           4
		//   50  102:invokevirtual   #58  <Method void Parcel.recycle()>
			throw songbean;
		//   51  105:aload_1         
		//   52  106:athrow          
		}

		public long position()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(15, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #19  <Field IBinder mRemote>
		//    9   19:bipush          15
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
		//   18   38:invokevirtual   #80  <Method long Parcel.readLong()>
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

		public void prev()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(4, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_4        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void prevImmediately()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(50, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          50
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

		public void reloadQueue()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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

		public void replacePlayingBean(SongBean songbean, SongBean songbean1, boolean flag)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           5
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(songbean == null)
				break MISSING_BLOCK_LABEL_37;
		//    7   17:aload_1         
		//    8   18:ifnull          37
			parcel.writeInt(1);
		//    9   21:aload           5
		//   10   23:iconst_1        
		//   11   24:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			songbean.writeToParcel(parcel, 0);
		//   12   27:aload_1         
		//   13   28:aload           5
		//   14   30:iconst_0        
		//   15   31:invokevirtual   #46  <Method void SongBean.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   16   34:goto            43
			parcel.writeInt(0);
		//   17   37:aload           5
		//   18   39:iconst_0        
		//   19   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			if(songbean1 == null) goto _L2; else goto _L1
		//   20   43:aload_2         
		//   21   44:ifnull          63
_L1:
			parcel.writeInt(1);
		//   22   47:aload           5
		//   23   49:iconst_1        
		//   24   50:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			songbean1.writeToParcel(parcel, 0);
		//   25   53:aload_2         
		//   26   54:aload           5
		//   27   56:iconst_0        
		//   28   57:invokevirtual   #46  <Method void SongBean.writeToParcel(Parcel, int)>
			  goto _L3
		//*  29   60:goto            125
_L2:
			parcel.writeInt(0);
		//   30   63:aload           5
		//   31   65:iconst_0        
		//   32   66:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  33   69:goto            125
_L5:
			int i;
			parcel.writeInt(i);
		//   34   72:aload           5
		//   35   74:iload           4
		//   36   76:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(64, parcel, parcel1, 0);
		//   37   79:aload_0         
		//   38   80:getfield        #19  <Field IBinder mRemote>
		//   39   83:bipush          64
		//   40   85:aload           5
		//   41   87:aload           6
		//   42   89:iconst_0        
		//   43   90:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   44   95:pop             
			parcel1.readException();
		//   45   96:aload           6
		//   46   98:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   47  101:aload           6
		//   48  103:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   49  106:aload           5
		//   50  108:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   51  111:return          
			songbean;
		//   52  112:astore_1        
			parcel1.recycle();
		//   53  113:aload           6
		//   54  115:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   55  118:aload           5
		//   56  120:invokevirtual   #58  <Method void Parcel.recycle()>
			throw songbean;
		//   57  123:aload_1         
		//   58  124:athrow          
_L3:
			if(flag)
		//*  59  125:iload_3         
		//*  60  126:ifeq            135
				i = 1;
		//   61  129:iconst_1        
		//   62  130:istore          4
			else
		//*  63  132:goto            72
				i = 0;
		//   64  135:iconst_0        
		//   65  136:istore          4
			if(true) goto _L5; else goto _L4
		//   66  138:goto            72
_L4:
		}

		public long seek(long l)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeLong(l);
		//    7   15:aload_3         
		//    8   16:lload_1         
		//    9   17:invokevirtual   #153 <Method void Parcel.writeLong(long)>
			mRemote.transact(16, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:bipush          16
		//   13   26:aload_3         
		//   14   27:aload           4
		//   15   29:iconst_0        
		//   16   30:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   35:pop             
			parcel1.readException();
		//   18   36:aload           4
		//   19   38:invokevirtual   #55  <Method void Parcel.readException()>
			l = parcel1.readLong();
		//   20   41:aload           4
		//   21   43:invokevirtual   #80  <Method long Parcel.readLong()>
		//   22   46:lstore_1        
			parcel1.recycle();
		//   23   47:aload           4
		//   24   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   52:aload_3         
		//   26   53:invokevirtual   #58  <Method void Parcel.recycle()>
			return l;
		//   27   56:lload_1         
		//   28   57:lreturn         
			Exception exception;
			exception;
		//   29   58:astore          5
			parcel1.recycle();
		//   30   60:aload           4
		//   31   62:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   65:aload_3         
		//   33   66:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   34   69:aload           5
		//   35   71:athrow          
		}

		public long seekRepeat(long l, int i)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeLong(l);
		//    7   17:aload           4
		//    8   19:lload_1         
		//    9   20:invokevirtual   #153 <Method void Parcel.writeLong(long)>
			parcel.writeInt(i);
		//   10   23:aload           4
		//   11   25:iload_3         
		//   12   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(60, parcel, parcel1, 0);
		//   13   29:aload_0         
		//   14   30:getfield        #19  <Field IBinder mRemote>
		//   15   33:bipush          60
		//   16   35:aload           4
		//   17   37:aload           5
		//   18   39:iconst_0        
		//   19   40:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   20   45:pop             
			parcel1.readException();
		//   21   46:aload           5
		//   22   48:invokevirtual   #55  <Method void Parcel.readException()>
			l = parcel1.readLong();
		//   23   51:aload           5
		//   24   53:invokevirtual   #80  <Method long Parcel.readLong()>
		//   25   56:lstore_1        
			parcel1.recycle();
		//   26   57:aload           5
		//   27   59:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   62:aload           4
		//   29   64:invokevirtual   #58  <Method void Parcel.recycle()>
			return l;
		//   30   67:lload_1         
		//   31   68:lreturn         
			Exception exception;
			exception;
		//   32   69:astore          6
			parcel1.recycle();
		//   33   71:aload           5
		//   34   73:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   76:aload           4
		//   36   78:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   37   81:aload           6
		//   38   83:athrow          
		}

		public void setClearMediaInfoWhenPauseAudio(boolean flag)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
		//*  17   33:bipush          44
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
			mRemote.transact(44, parcel, parcel1, 0);
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

		public boolean setDolbyEffect(boolean flag)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			int i;
			Exception exception;
			if(flag)
		//*   7   15:iload_1         
		//*   8   16:ifeq            92
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
		//*  17   33:bipush          37
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #55  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #69  <Method int Parcel.readInt()>
		//*  27   55:istore_2        
		//*  28   56:iload_2         
		//*  29   57:ifeq            65
		//*  30   60:iconst_1        
		//*  31   61:istore_1        
		//*  32   62:goto            67
		//*  33   65:iconst_0        
		//*  34   66:istore_1        
		//*  35   67:aload           4
		//*  36   69:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  37   72:aload_3         
		//*  38   73:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  39   76:iload_1         
		//*  40   77:ireturn         
		//*  41   78:astore          5
		//*  42   80:aload           4
		//*  43   82:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  44   85:aload_3         
		//*  45   86:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  46   89:aload           5
		//*  47   91:athrow          
				i = 0;
		//   48   92:iconst_0        
		//   49   93:istore_2        
			parcel.writeInt(i);
			mRemote.transact(37, parcel, parcel1, 0);
			parcel1.readException();
			i = parcel1.readInt();
			if(i != 0)
				flag = true;
			else
				flag = false;
			parcel1.recycle();
			parcel.recycle();
			return flag;
			exception;
			parcel1.recycle();
			parcel.recycle();
			throw exception;
		//*  50   94:goto            24
		}

		public void setKtHistorySongPlayPos(long l)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeLong(l);
		//    7   15:aload_3         
		//    8   16:lload_1         
		//    9   17:invokevirtual   #153 <Method void Parcel.writeLong(long)>
			mRemote.transact(72, parcel, parcel1, 0);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field IBinder mRemote>
		//   12   24:bipush          72
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

		public void setMediaInfo()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(45, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          45
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

		public void setPauseAfterCurSong(boolean flag)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
		//*  17   33:bipush          71
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
			mRemote.transact(71, parcel, parcel1, 0);
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

		public void setPlayMode(int i)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(23, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          23
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

		public void setProcessSeq(String s)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:invokevirtual   #163 <Method void Parcel.writeString(String)>
			mRemote.transact(46, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          46
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
			s;
		//   25   47:astore_1        
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
			throw s;
		//   30   56:aload_1         
		//   31   57:athrow          
		}

		public void setPush(boolean flag)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
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
		//*  17   33:bipush          47
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
			mRemote.transact(47, parcel, parcel1, 0);
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

		public void setQueuePosition(int i)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(27, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          27
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

		public void setRepeatTime(int i)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(66, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          66
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

		public void showDeviceSelector()
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(41, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:bipush          41
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

		public void stepFrequency(int i)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   14:aload_2         
		//    8   15:iload_1         
		//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(75, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #19  <Field IBinder mRemote>
		//   12   23:bipush          75
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #19  <Field IBinder mRemote>
		//    9   18:iconst_2        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #58  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void stopRunning(Bundle bundle)
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #208 <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			mRemote.transact(77, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #19  <Field IBinder mRemote>
		//   22   41:bipush          77
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
			bundle;
		//   35   65:astore_1        
			parcel1.recycle();
		//   36   66:aload_3         
		//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   70:aload_2         
		//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
			throw bundle;
		//   40   74:aload_1         
		//   41   75:athrow          
		}

		public void updateSongInfo(String s, boolean flag, SongBean songbean, SongBean songbean1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore          6
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    8:astore          7
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4   10:aload           6
		//    5   12:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   17:aload           6
		//    8   19:aload_1         
		//    9   20:invokevirtual   #163 <Method void Parcel.writeString(String)>
			int i;
			if(flag)
		//*  10   23:iload_2         
		//*  11   24:ifeq            140
				i = 1;
		//   12   27:iconst_1        
		//   13   28:istore          5
			else
		//*  14   30:goto            33
		//*  15   33:aload           6
		//*  16   35:iload           5
		//*  17   37:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  18   40:aload_3         
		//*  19   41:ifnull          60
		//*  20   44:aload           6
		//*  21   46:iconst_1        
		//*  22   47:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  23   50:aload_3         
		//*  24   51:aload           6
		//*  25   53:iconst_0        
		//*  26   54:invokevirtual   #46  <Method void SongBean.writeToParcel(Parcel, int)>
		//*  27   57:goto            66
		//*  28   60:aload           6
		//*  29   62:iconst_0        
		//*  30   63:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  31   66:aload           4
		//*  32   68:ifnull          88
		//*  33   71:aload           6
		//*  34   73:iconst_1        
		//*  35   74:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  36   77:aload           4
		//*  37   79:aload           6
		//*  38   81:iconst_0        
		//*  39   82:invokevirtual   #46  <Method void SongBean.writeToParcel(Parcel, int)>
		//*  40   85:goto            94
		//*  41   88:aload           6
		//*  42   90:iconst_0        
		//*  43   91:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		//*  44   94:aload_0         
		//*  45   95:getfield        #19  <Field IBinder mRemote>
		//*  46   98:bipush          48
		//*  47  100:aload           6
		//*  48  102:aload           7
		//*  49  104:iconst_0        
		//*  50  105:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  51  110:pop             
		//*  52  111:aload           7
		//*  53  113:invokevirtual   #55  <Method void Parcel.readException()>
		//*  54  116:aload           7
		//*  55  118:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  56  121:aload           6
		//*  57  123:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  58  126:return          
		//*  59  127:astore_1        
		//*  60  128:aload           7
		//*  61  130:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  62  133:aload           6
		//*  63  135:invokevirtual   #58  <Method void Parcel.recycle()>
		//*  64  138:aload_1         
		//*  65  139:athrow          
				i = 0;
		//   66  140:iconst_0        
		//   67  141:istore          5
			parcel.writeInt(i);
			if(songbean == null)
				break MISSING_BLOCK_LABEL_60;
			parcel.writeInt(1);
			songbean.writeToParcel(parcel, 0);
			break MISSING_BLOCK_LABEL_66;
			parcel.writeInt(0);
			if(songbean1 == null)
				break MISSING_BLOCK_LABEL_88;
			parcel.writeInt(1);
			songbean1.writeToParcel(parcel, 0);
			break MISSING_BLOCK_LABEL_94;
			parcel.writeInt(0);
			mRemote.transact(48, parcel, parcel1, 0);
			parcel1.readException();
			parcel1.recycle();
			parcel.recycle();
			return;
			s;
			parcel1.recycle();
			parcel.recycle();
			throw s;
		//*  68  143:goto            33
		}

		public void updateSongs(SongBean asongbean[])
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
			parcel.writeInterfaceToken("com.android.mediacenter.localmusic.IMediaPlaybackService");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeTypedArray(((android.os.Parcelable []) (asongbean)), 0);
		//    7   14:aload_2         
		//    8   15:aload_1         
		//    9   16:iconst_0        
		//   10   17:invokevirtual   #65  <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			mRemote.transact(54, parcel, parcel1, 0);
		//   11   20:aload_0         
		//   12   21:getfield        #19  <Field IBinder mRemote>
		//   13   24:bipush          54
		//   14   26:aload_2         
		//   15   27:aload_3         
		//   16   28:iconst_0        
		//   17   29:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   18   34:pop             
			parcel1.readException();
		//   19   35:aload_3         
		//   20   36:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   21   39:aload_3         
		//   22   40:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   25   47:return          
			asongbean;
		//   26   48:astore_1        
			parcel1.recycle();
		//   27   49:aload_3         
		//   28   50:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   53:aload_2         
		//   30   54:invokevirtual   #58  <Method void Parcel.recycle()>
			throw asongbean;
		//   31   57:aload_1         
		//   32   58:athrow          
		}

		private IBinder mRemote;

		Proxy(IBinder ibinder)
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


	public static IMediaPlaybackService asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//    6    9:invokeinterface #186 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IMediaPlaybackService))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IMediaPlaybackService>
	//*  12   23:ifeq            31
			return (IMediaPlaybackService)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IMediaPlaybackService>
	//   15   30:areturn         
		else
			return ((IMediaPlaybackService) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IMediaPlaybackService$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #189 <Method void IMediaPlaybackService$Stub$Proxy(IBinder)>
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
	//*   1    1:lookupswitch    78: default 636
	//	               1: 647
	//	               2: 663
	//	               3: 679
	//	               4: 695
	//	               5: 711
	//	               6: 727
	//	               7: 762
	//	               8: 786
	//	               9: 808
	//	               10: 832
	//	               11: 872
	//	               12: 896
	//	               13: 918
	//	               14: 940
	//	               15: 964
	//	               16: 988
	//	               17: 1016
	//	               18: 1051
	//	               19: 1086
	//	               20: 1108
	//	               21: 1130
	//	               22: 1152
	//	               23: 1174
	//	               24: 1194
	//	               25: 1216
	//	               26: 1258
	//	               27: 1278
	//	               28: 1298
	//	               29: 1333
	//	               30: 1349
	//	               31: 1389
	//	               32: 1412
	//	               33: 1436
	//	               34: 1478
	//	               35: 1500
	//	               36: 1567
	//	               37: 1602
	//	               38: 1655
	//	               39: 1677
	//	               40: 1703
	//	               41: 1719
	//	               42: 1735
	//	               43: 1770
	//	               44: 1792
	//	               45: 1826
	//	               46: 1842
	//	               47: 1862
	//	               48: 1896
	//	               49: 1993
	//	               50: 2023
	//	               51: 2039
	//	               52: 2078
	//	               53: 2122
	//	               54: 2157
	//	               55: 2183
	//	               56: 2214
	//	               57: 2236
	//	               58: 2259
	//	               59: 2281
	//	               60: 2303
	//	               61: 2335
	//	               62: 2370
	//	               63: 2431
	//	               64: 2466
	//	               65: 2558
	//	               66: 2600
	//	               67: 2620
	//	               68: 2642
	//	               69: 2682
	//	               70: 2722
	//	               71: 2744
	//	               72: 2778
	//	               73: 2798
	//	               74: 2833
	//	               75: 2873
	//	               76: 2893
	//	               77: 2915
	//	               1598968902: 639
	//*   2  636:goto            2957
		case 1598968902: 
			parcel1.writeString("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//    3  639:aload_3         
	//    4  640:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//    5  642:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//    6  645:iconst_1        
	//    7  646:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//    8  647:aload_2         
	//    9  648:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   10  650:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			play();
	//   11  653:aload_0         
	//   12  654:invokevirtual   #207 <Method void play()>
			parcel1.writeNoException();
	//   13  657:aload_3         
	//   14  658:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//   15  661:iconst_1        
	//   16  662:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   17  663:aload_2         
	//   18  664:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   19  666:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			stop();
	//   20  669:aload_0         
	//   21  670:invokevirtual   #213 <Method void stop()>
			parcel1.writeNoException();
	//   22  673:aload_3         
	//   23  674:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//   24  677:iconst_1        
	//   25  678:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   26  679:aload_2         
	//   27  680:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   28  682:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			pause();
	//   29  685:aload_0         
	//   30  686:invokevirtual   #216 <Method void pause()>
			parcel1.writeNoException();
	//   31  689:aload_3         
	//   32  690:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//   33  693:iconst_1        
	//   34  694:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   35  695:aload_2         
	//   36  696:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   37  698:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			prev();
	//   38  701:aload_0         
	//   39  702:invokevirtual   #219 <Method void prev()>
			parcel1.writeNoException();
	//   40  705:aload_3         
	//   41  706:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//   42  709:iconst_1        
	//   43  710:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   44  711:aload_2         
	//   45  712:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   46  714:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			next();
	//   47  717:aload_0         
	//   48  718:invokevirtual   #222 <Method void next()>
			parcel1.writeNoException();
	//   49  721:aload_3         
	//   50  722:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//   51  725:iconst_1        
	//   52  726:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   53  727:aload_2         
	//   54  728:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   55  730:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag = isPlaying();
	//   56  733:aload_0         
	//   57  734:invokevirtual   #226 <Method boolean isPlaying()>
	//   58  737:istore          5
			parcel1.writeNoException();
	//   59  739:aload_3         
	//   60  740:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag)
	//*  61  743:iload           5
	//*  62  745:ifeq            753
				i = 1;
	//   63  748:iconst_1        
	//   64  749:istore_1        
			else
	//*  65  750:goto            755
				i = 0;
	//   66  753:iconst_0        
	//   67  754:istore_1        
			parcel1.writeInt(i);
	//   68  755:aload_3         
	//   69  756:iload_1         
	//   70  757:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//   71  760:iconst_1        
	//   72  761:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   73  762:aload_2         
	//   74  763:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   75  765:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l = getAudioId();
	//   76  768:aload_0         
	//   77  769:invokevirtual   #234 <Method long getAudioId()>
	//   78  772:lstore          6
			parcel1.writeNoException();
	//   79  774:aload_3         
	//   80  775:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l);
	//   81  778:aload_3         
	//   82  779:lload           6
	//   83  781:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//   84  784:iconst_1        
	//   85  785:ireturn         

		case 8: // '\b'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   86  786:aload_2         
	//   87  787:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//   88  789:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getTrackName()));
	//   89  792:aload_0         
	//   90  793:invokevirtual   #242 <Method String getTrackName()>
	//   91  796:astore_2        
			parcel1.writeNoException();
	//   92  797:aload_3         
	//   93  798:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   94  801:aload_3         
	//   95  802:aload_2         
	//   96  803:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//   97  806:iconst_1        
	//   98  807:ireturn         

		case 9: // '\t'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//   99  808:aload_2         
	//  100  809:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  101  811:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l1 = getAlbumId();
	//  102  814:aload_0         
	//  103  815:invokevirtual   #245 <Method long getAlbumId()>
	//  104  818:lstore          6
			parcel1.writeNoException();
	//  105  820:aload_3         
	//  106  821:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l1);
	//  107  824:aload_3         
	//  108  825:lload           6
	//  109  827:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//  110  830:iconst_1        
	//  111  831:ireturn         

		case 10: // '\n'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  112  832:aload_2         
	//  113  833:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  114  835:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getNetMusicInfo()));
	//  115  838:aload_0         
	//  116  839:invokevirtual   #249 <Method NetSongInfo getNetMusicInfo()>
	//  117  842:astore_2        
			parcel1.writeNoException();
	//  118  843:aload_3         
	//  119  844:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 120  847:aload_2         
	//* 121  848:ifnull          865
			{
				parcel1.writeInt(1);
	//  122  851:aload_3         
	//  123  852:iconst_1        
	//  124  853:invokevirtual   #230 <Method void Parcel.writeInt(int)>
				((NetSongInfo) (parcel)).writeToParcel(parcel1, 1);
	//  125  856:aload_2         
	//  126  857:aload_3         
	//  127  858:iconst_1        
	//  128  859:invokevirtual   #255 <Method void NetSongInfo.writeToParcel(Parcel, int)>
			} else
	//* 129  862:goto            870
			{
				parcel1.writeInt(0);
	//  130  865:aload_3         
	//  131  866:iconst_0        
	//  132  867:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			}
			return true;
	//  133  870:iconst_1        
	//  134  871:ireturn         

		case 11: // '\013'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  135  872:aload_2         
	//  136  873:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  137  875:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l2 = getArtistId();
	//  138  878:aload_0         
	//  139  879:invokevirtual   #258 <Method long getArtistId()>
	//  140  882:lstore          6
			parcel1.writeNoException();
	//  141  884:aload_3         
	//  142  885:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l2);
	//  143  888:aload_3         
	//  144  889:lload           6
	//  145  891:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//  146  894:iconst_1        
	//  147  895:ireturn         

		case 12: // '\f'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  148  896:aload_2         
	//  149  897:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  150  899:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getArtistName()));
	//  151  902:aload_0         
	//  152  903:invokevirtual   #261 <Method String getArtistName()>
	//  153  906:astore_2        
			parcel1.writeNoException();
	//  154  907:aload_3         
	//  155  908:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  156  911:aload_3         
	//  157  912:aload_2         
	//  158  913:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//  159  916:iconst_1        
	//  160  917:ireturn         

		case 13: // '\r'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  161  918:aload_2         
	//  162  919:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  163  921:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getAlbumName()));
	//  164  924:aload_0         
	//  165  925:invokevirtual   #264 <Method String getAlbumName()>
	//  166  928:astore_2        
			parcel1.writeNoException();
	//  167  929:aload_3         
	//  168  930:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  169  933:aload_3         
	//  170  934:aload_2         
	//  171  935:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//  172  938:iconst_1        
	//  173  939:ireturn         

		case 14: // '\016'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  174  940:aload_2         
	//  175  941:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  176  943:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l3 = duration();
	//  177  946:aload_0         
	//  178  947:invokevirtual   #267 <Method long duration()>
	//  179  950:lstore          6
			parcel1.writeNoException();
	//  180  952:aload_3         
	//  181  953:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l3);
	//  182  956:aload_3         
	//  183  957:lload           6
	//  184  959:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//  185  962:iconst_1        
	//  186  963:ireturn         

		case 15: // '\017'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  187  964:aload_2         
	//  188  965:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  189  967:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l4 = position();
	//  190  970:aload_0         
	//  191  971:invokevirtual   #270 <Method long position()>
	//  192  974:lstore          6
			parcel1.writeNoException();
	//  193  976:aload_3         
	//  194  977:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l4);
	//  195  980:aload_3         
	//  196  981:lload           6
	//  197  983:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//  198  986:iconst_1        
	//  199  987:ireturn         

		case 16: // '\020'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  200  988:aload_2         
	//  201  989:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  202  991:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l5 = seek(parcel.readLong());
	//  203  994:aload_0         
	//  204  995:aload_2         
	//  205  996:invokevirtual   #273 <Method long Parcel.readLong()>
	//  206  999:invokevirtual   #277 <Method long seek(long)>
	//  207 1002:lstore          6
			parcel1.writeNoException();
	//  208 1004:aload_3         
	//  209 1005:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l5);
	//  210 1008:aload_3         
	//  211 1009:lload           6
	//  212 1011:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//  213 1014:iconst_1        
	//  214 1015:ireturn         

		case 17: // '\021'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  215 1016:aload_2         
	//  216 1017:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  217 1019:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag1 = isOnlinePrepearing();
	//  218 1022:aload_0         
	//  219 1023:invokevirtual   #280 <Method boolean isOnlinePrepearing()>
	//  220 1026:istore          5
			parcel1.writeNoException();
	//  221 1028:aload_3         
	//  222 1029:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag1)
	//* 223 1032:iload           5
	//* 224 1034:ifeq            1042
				i = 1;
	//  225 1037:iconst_1        
	//  226 1038:istore_1        
			else
	//* 227 1039:goto            1044
				i = 0;
	//  228 1042:iconst_0        
	//  229 1043:istore_1        
			parcel1.writeInt(i);
	//  230 1044:aload_3         
	//  231 1045:iload_1         
	//  232 1046:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  233 1049:iconst_1        
	//  234 1050:ireturn         

		case 18: // '\022'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  235 1051:aload_2         
	//  236 1052:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  237 1054:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag2 = isInitialized();
	//  238 1057:aload_0         
	//  239 1058:invokevirtual   #283 <Method boolean isInitialized()>
	//  240 1061:istore          5
			parcel1.writeNoException();
	//  241 1063:aload_3         
	//  242 1064:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag2)
	//* 243 1067:iload           5
	//* 244 1069:ifeq            1077
				i = 1;
	//  245 1072:iconst_1        
	//  246 1073:istore_1        
			else
	//* 247 1074:goto            1079
				i = 0;
	//  248 1077:iconst_0        
	//  249 1078:istore_1        
			parcel1.writeInt(i);
	//  250 1079:aload_3         
	//  251 1080:iload_1         
	//  252 1081:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  253 1084:iconst_1        
	//  254 1085:ireturn         

		case 19: // '\023'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  255 1086:aload_2         
	//  256 1087:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  257 1089:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getQueuePosition();
	//  258 1092:aload_0         
	//  259 1093:invokevirtual   #287 <Method int getQueuePosition()>
	//  260 1096:istore_1        
			parcel1.writeNoException();
	//  261 1097:aload_3         
	//  262 1098:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  263 1101:aload_3         
	//  264 1102:iload_1         
	//  265 1103:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  266 1106:iconst_1        
	//  267 1107:ireturn         

		case 20: // '\024'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  268 1108:aload_2         
	//  269 1109:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  270 1111:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getQueue()));
	//  271 1114:aload_0         
	//  272 1115:invokevirtual   #291 <Method long[] getQueue()>
	//  273 1118:astore_2        
			parcel1.writeNoException();
	//  274 1119:aload_3         
	//  275 1120:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLongArray(((long []) (parcel)));
	//  276 1123:aload_3         
	//  277 1124:aload_2         
	//  278 1125:invokevirtual   #295 <Method void Parcel.writeLongArray(long[])>
			return true;
	//  279 1128:iconst_1        
	//  280 1129:ireturn         

		case 21: // '\025'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  281 1130:aload_2         
	//  282 1131:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  283 1133:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getPath()));
	//  284 1136:aload_0         
	//  285 1137:invokevirtual   #298 <Method String getPath()>
	//  286 1140:astore_2        
			parcel1.writeNoException();
	//  287 1141:aload_3         
	//  288 1142:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  289 1145:aload_3         
	//  290 1146:aload_2         
	//  291 1147:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//  292 1150:iconst_1        
	//  293 1151:ireturn         

		case 22: // '\026'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  294 1152:aload_2         
	//  295 1153:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  296 1155:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getPlayMode();
	//  297 1158:aload_0         
	//  298 1159:invokevirtual   #301 <Method int getPlayMode()>
	//  299 1162:istore_1        
			parcel1.writeNoException();
	//  300 1163:aload_3         
	//  301 1164:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  302 1167:aload_3         
	//  303 1168:iload_1         
	//  304 1169:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  305 1172:iconst_1        
	//  306 1173:ireturn         

		case 23: // '\027'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  307 1174:aload_2         
	//  308 1175:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  309 1177:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			setPlayMode(parcel.readInt());
	//  310 1180:aload_0         
	//  311 1181:aload_2         
	//  312 1182:invokevirtual   #304 <Method int Parcel.readInt()>
	//  313 1185:invokevirtual   #307 <Method void setPlayMode(int)>
			parcel1.writeNoException();
	//  314 1188:aload_3         
	//  315 1189:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  316 1192:iconst_1        
	//  317 1193:ireturn         

		case 24: // '\030'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  318 1194:aload_2         
	//  319 1195:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  320 1197:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getBufferPercentage();
	//  321 1200:aload_0         
	//  322 1201:invokevirtual   #310 <Method int getBufferPercentage()>
	//  323 1204:istore_1        
			parcel1.writeNoException();
	//  324 1205:aload_3         
	//  325 1206:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  326 1209:aload_3         
	//  327 1210:iload_1         
	//  328 1211:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  329 1214:iconst_1        
	//  330 1215:ireturn         

		case 25: // '\031'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  331 1216:aload_2         
	//  332 1217:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  333 1219:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			String s = parcel.readString();
	//  334 1222:aload_2         
	//  335 1223:invokevirtual   #313 <Method String Parcel.readString()>
	//  336 1226:astore          8
			boolean flag3;
			if(parcel.readInt() != 0)
	//* 337 1228:aload_2         
	//* 338 1229:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 339 1232:ifeq            1241
				flag3 = true;
	//  340 1235:iconst_1        
	//  341 1236:istore          5
			else
	//* 342 1238:goto            1244
				flag3 = false;
	//  343 1241:iconst_0        
	//  344 1242:istore          5
			openFile(s, flag3);
	//  345 1244:aload_0         
	//  346 1245:aload           8
	//  347 1247:iload           5
	//  348 1249:invokevirtual   #317 <Method void openFile(String, boolean)>
			parcel1.writeNoException();
	//  349 1252:aload_3         
	//  350 1253:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  351 1256:iconst_1        
	//  352 1257:ireturn         

		case 26: // '\032'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  353 1258:aload_2         
	//  354 1259:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  355 1261:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			openFileAsync(parcel.readString());
	//  356 1264:aload_0         
	//  357 1265:aload_2         
	//  358 1266:invokevirtual   #313 <Method String Parcel.readString()>
	//  359 1269:invokevirtual   #320 <Method void openFileAsync(String)>
			parcel1.writeNoException();
	//  360 1272:aload_3         
	//  361 1273:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  362 1276:iconst_1        
	//  363 1277:ireturn         

		case 27: // '\033'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  364 1278:aload_2         
	//  365 1279:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  366 1281:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			setQueuePosition(parcel.readInt());
	//  367 1284:aload_0         
	//  368 1285:aload_2         
	//  369 1286:invokevirtual   #304 <Method int Parcel.readInt()>
	//  370 1289:invokevirtual   #323 <Method void setQueuePosition(int)>
			parcel1.writeNoException();
	//  371 1292:aload_3         
	//  372 1293:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  373 1296:iconst_1        
	//  374 1297:ireturn         

		case 28: // '\034'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  375 1298:aload_2         
	//  376 1299:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  377 1301:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag4 = getOneShot();
	//  378 1304:aload_0         
	//  379 1305:invokevirtual   #326 <Method boolean getOneShot()>
	//  380 1308:istore          5
			parcel1.writeNoException();
	//  381 1310:aload_3         
	//  382 1311:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag4)
	//* 383 1314:iload           5
	//* 384 1316:ifeq            1324
				i = 1;
	//  385 1319:iconst_1        
	//  386 1320:istore_1        
			else
	//* 387 1321:goto            1326
				i = 0;
	//  388 1324:iconst_0        
	//  389 1325:istore_1        
			parcel1.writeInt(i);
	//  390 1326:aload_3         
	//  391 1327:iload_1         
	//  392 1328:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  393 1331:iconst_1        
	//  394 1332:ireturn         

		case 29: // '\035'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  395 1333:aload_2         
	//  396 1334:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  397 1336:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			reloadQueue();
	//  398 1339:aload_0         
	//  399 1340:invokevirtual   #329 <Method void reloadQueue()>
			parcel1.writeNoException();
	//  400 1343:aload_3         
	//  401 1344:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  402 1347:iconst_1        
	//  403 1348:ireturn         

		case 30: // '\036'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  404 1349:aload_2         
	//  405 1350:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  406 1352:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getSongBean()));
	//  407 1355:aload_0         
	//  408 1356:invokevirtual   #333 <Method SongBean getSongBean()>
	//  409 1359:astore_2        
			parcel1.writeNoException();
	//  410 1360:aload_3         
	//  411 1361:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 412 1364:aload_2         
	//* 413 1365:ifnull          1382
			{
				parcel1.writeInt(1);
	//  414 1368:aload_3         
	//  415 1369:iconst_1        
	//  416 1370:invokevirtual   #230 <Method void Parcel.writeInt(int)>
				((SongBean) (parcel)).writeToParcel(parcel1, 1);
	//  417 1373:aload_2         
	//  418 1374:aload_3         
	//  419 1375:iconst_1        
	//  420 1376:invokevirtual   #336 <Method void SongBean.writeToParcel(Parcel, int)>
			} else
	//* 421 1379:goto            1387
			{
				parcel1.writeInt(0);
	//  422 1382:aload_3         
	//  423 1383:iconst_0        
	//  424 1384:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			}
			return true;
	//  425 1387:iconst_1        
	//  426 1388:ireturn         

		case 31: // '\037'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  427 1389:aload_2         
	//  428 1390:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  429 1392:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getNetMusicInfos()));
	//  430 1395:aload_0         
	//  431 1396:invokevirtual   #340 <Method SongBean[] getNetMusicInfos()>
	//  432 1399:astore_2        
			parcel1.writeNoException();
	//  433 1400:aload_3         
	//  434 1401:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeTypedArray(((android.os.Parcelable []) (parcel)), 1);
	//  435 1404:aload_3         
	//  436 1405:aload_2         
	//  437 1406:iconst_1        
	//  438 1407:invokevirtual   #344 <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			return true;
	//  439 1410:iconst_1        
	//  440 1411:ireturn         

		case 32: // ' '
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  441 1412:aload_2         
	//  442 1413:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  443 1415:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l6 = getCurrentPlayPlaylistId();
	//  444 1418:aload_0         
	//  445 1419:invokevirtual   #347 <Method long getCurrentPlayPlaylistId()>
	//  446 1422:lstore          6
			parcel1.writeNoException();
	//  447 1424:aload_3         
	//  448 1425:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l6);
	//  449 1428:aload_3         
	//  450 1429:lload           6
	//  451 1431:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//  452 1434:iconst_1        
	//  453 1435:ireturn         

		case 33: // '!'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  454 1436:aload_2         
	//  455 1437:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  456 1439:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			openUrlMusic((SongBean[])parcel.createTypedArray(SongBean.CREATOR), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
	//  457 1442:aload_0         
	//  458 1443:aload_2         
	//  459 1444:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  460 1447:invokevirtual   #355 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//  461 1450:checkcast       #357 <Class SongBean[]>
	//  462 1453:aload_2         
	//  463 1454:invokevirtual   #304 <Method int Parcel.readInt()>
	//  464 1457:aload_2         
	//  465 1458:invokevirtual   #273 <Method long Parcel.readLong()>
	//  466 1461:aload_2         
	//  467 1462:invokevirtual   #313 <Method String Parcel.readString()>
	//  468 1465:aload_2         
	//  469 1466:invokevirtual   #313 <Method String Parcel.readString()>
	//  470 1469:invokevirtual   #361 <Method void openUrlMusic(SongBean[], int, long, String, String)>
			parcel1.writeNoException();
	//  471 1472:aload_3         
	//  472 1473:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  473 1476:iconst_1        
	//  474 1477:ireturn         

		case 34: // '"'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  475 1478:aload_2         
	//  476 1479:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  477 1481:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getOnlinePlaylistType()));
	//  478 1484:aload_0         
	//  479 1485:invokevirtual   #364 <Method String getOnlinePlaylistType()>
	//  480 1488:astore_2        
			parcel1.writeNoException();
	//  481 1489:aload_3         
	//  482 1490:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  483 1493:aload_3         
	//  484 1494:aload_2         
	//  485 1495:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//  486 1498:iconst_1        
	//  487 1499:ireturn         

		case 35: // '#'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  488 1500:aload_2         
	//  489 1501:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  490 1503:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			SongBean asongbean[] = (SongBean[])parcel.createTypedArray(SongBean.CREATOR);
	//  491 1506:aload_2         
	//  492 1507:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  493 1510:invokevirtual   #355 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//  494 1513:checkcast       #357 <Class SongBean[]>
	//  495 1516:astore          8
			boolean flag5;
			if(parcel.readInt() != 0)
	//* 496 1518:aload_2         
	//* 497 1519:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 498 1522:ifeq            1531
				flag5 = true;
	//  499 1525:iconst_1        
	//  500 1526:istore          5
			else
	//* 501 1528:goto            1534
				flag5 = false;
	//  502 1531:iconst_0        
	//  503 1532:istore          5
			flag5 = addUrltoPlayList(asongbean, flag5);
	//  504 1534:aload_0         
	//  505 1535:aload           8
	//  506 1537:iload           5
	//  507 1539:invokevirtual   #368 <Method boolean addUrltoPlayList(SongBean[], boolean)>
	//  508 1542:istore          5
			parcel1.writeNoException();
	//  509 1544:aload_3         
	//  510 1545:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag5)
	//* 511 1548:iload           5
	//* 512 1550:ifeq            1558
				i = 1;
	//  513 1553:iconst_1        
	//  514 1554:istore_1        
			else
	//* 515 1555:goto            1560
				i = 0;
	//  516 1558:iconst_0        
	//  517 1559:istore_1        
			parcel1.writeInt(i);
	//  518 1560:aload_3         
	//  519 1561:iload_1         
	//  520 1562:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  521 1565:iconst_1        
	//  522 1566:ireturn         

		case 36: // '$'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  523 1567:aload_2         
	//  524 1568:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  525 1570:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag6 = getDolbyEffectOn();
	//  526 1573:aload_0         
	//  527 1574:invokevirtual   #371 <Method boolean getDolbyEffectOn()>
	//  528 1577:istore          5
			parcel1.writeNoException();
	//  529 1579:aload_3         
	//  530 1580:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag6)
	//* 531 1583:iload           5
	//* 532 1585:ifeq            1593
				i = 1;
	//  533 1588:iconst_1        
	//  534 1589:istore_1        
			else
	//* 535 1590:goto            1595
				i = 0;
	//  536 1593:iconst_0        
	//  537 1594:istore_1        
			parcel1.writeInt(i);
	//  538 1595:aload_3         
	//  539 1596:iload_1         
	//  540 1597:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  541 1600:iconst_1        
	//  542 1601:ireturn         

		case 37: // '%'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  543 1602:aload_2         
	//  544 1603:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  545 1605:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag7;
			if(parcel.readInt() != 0)
	//* 546 1608:aload_2         
	//* 547 1609:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 548 1612:ifeq            1621
				flag7 = true;
	//  549 1615:iconst_1        
	//  550 1616:istore          5
			else
	//* 551 1618:goto            1624
				flag7 = false;
	//  552 1621:iconst_0        
	//  553 1622:istore          5
			flag7 = setDolbyEffect(flag7);
	//  554 1624:aload_0         
	//  555 1625:iload           5
	//  556 1627:invokevirtual   #375 <Method boolean setDolbyEffect(boolean)>
	//  557 1630:istore          5
			parcel1.writeNoException();
	//  558 1632:aload_3         
	//  559 1633:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag7)
	//* 560 1636:iload           5
	//* 561 1638:ifeq            1646
				i = 1;
	//  562 1641:iconst_1        
	//  563 1642:istore_1        
			else
	//* 564 1643:goto            1648
				i = 0;
	//  565 1646:iconst_0        
	//  566 1647:istore_1        
			parcel1.writeInt(i);
	//  567 1648:aload_3         
	//  568 1649:iload_1         
	//  569 1650:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  570 1653:iconst_1        
	//  571 1654:ireturn         

		case 38: // '&'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  572 1655:aload_2         
	//  573 1656:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  574 1658:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getOnlinePlaylistId()));
	//  575 1661:aload_0         
	//  576 1662:invokevirtual   #378 <Method String getOnlinePlaylistId()>
	//  577 1665:astore_2        
			parcel1.writeNoException();
	//  578 1666:aload_3         
	//  579 1667:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  580 1670:aload_3         
	//  581 1671:aload_2         
	//  582 1672:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//  583 1675:iconst_1        
	//  584 1676:ireturn         

		case 39: // '\''
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  585 1677:aload_2         
	//  586 1678:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  587 1680:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			deleteSongs((SongBean[])parcel.createTypedArray(SongBean.CREATOR));
	//  588 1683:aload_0         
	//  589 1684:aload_2         
	//  590 1685:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  591 1688:invokevirtual   #355 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//  592 1691:checkcast       #357 <Class SongBean[]>
	//  593 1694:invokevirtual   #382 <Method void deleteSongs(SongBean[])>
			parcel1.writeNoException();
	//  594 1697:aload_3         
	//  595 1698:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  596 1701:iconst_1        
	//  597 1702:ireturn         

		case 40: // '('
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  598 1703:aload_2         
	//  599 1704:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  600 1706:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			initializeDlna();
	//  601 1709:aload_0         
	//  602 1710:invokevirtual   #385 <Method void initializeDlna()>
			parcel1.writeNoException();
	//  603 1713:aload_3         
	//  604 1714:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  605 1717:iconst_1        
	//  606 1718:ireturn         

		case 41: // ')'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  607 1719:aload_2         
	//  608 1720:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  609 1722:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			showDeviceSelector();
	//  610 1725:aload_0         
	//  611 1726:invokevirtual   #388 <Method void showDeviceSelector()>
			parcel1.writeNoException();
	//  612 1729:aload_3         
	//  613 1730:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  614 1733:iconst_1        
	//  615 1734:ireturn         

		case 42: // '*'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  616 1735:aload_2         
	//  617 1736:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  618 1738:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag8 = isPlayerClientRendering();
	//  619 1741:aload_0         
	//  620 1742:invokevirtual   #391 <Method boolean isPlayerClientRendering()>
	//  621 1745:istore          5
			parcel1.writeNoException();
	//  622 1747:aload_3         
	//  623 1748:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag8)
	//* 624 1751:iload           5
	//* 625 1753:ifeq            1761
				i = 1;
	//  626 1756:iconst_1        
	//  627 1757:istore_1        
			else
	//* 628 1758:goto            1763
				i = 0;
	//  629 1761:iconst_0        
	//  630 1762:istore_1        
			parcel1.writeInt(i);
	//  631 1763:aload_3         
	//  632 1764:iload_1         
	//  633 1765:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  634 1768:iconst_1        
	//  635 1769:ireturn         

		case 43: // '+'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  636 1770:aload_2         
	//  637 1771:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  638 1773:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getCurrentDMRName()));
	//  639 1776:aload_0         
	//  640 1777:invokevirtual   #394 <Method String getCurrentDMRName()>
	//  641 1780:astore_2        
			parcel1.writeNoException();
	//  642 1781:aload_3         
	//  643 1782:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//  644 1785:aload_3         
	//  645 1786:aload_2         
	//  646 1787:invokevirtual   #201 <Method void Parcel.writeString(String)>
			return true;
	//  647 1790:iconst_1        
	//  648 1791:ireturn         

		case 44: // ','
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  649 1792:aload_2         
	//  650 1793:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  651 1795:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag9;
			if(parcel.readInt() != 0)
	//* 652 1798:aload_2         
	//* 653 1799:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 654 1802:ifeq            1811
				flag9 = true;
	//  655 1805:iconst_1        
	//  656 1806:istore          5
			else
	//* 657 1808:goto            1814
				flag9 = false;
	//  658 1811:iconst_0        
	//  659 1812:istore          5
			setClearMediaInfoWhenPauseAudio(flag9);
	//  660 1814:aload_0         
	//  661 1815:iload           5
	//  662 1817:invokevirtual   #398 <Method void setClearMediaInfoWhenPauseAudio(boolean)>
			parcel1.writeNoException();
	//  663 1820:aload_3         
	//  664 1821:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  665 1824:iconst_1        
	//  666 1825:ireturn         

		case 45: // '-'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  667 1826:aload_2         
	//  668 1827:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  669 1829:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			setMediaInfo();
	//  670 1832:aload_0         
	//  671 1833:invokevirtual   #401 <Method void setMediaInfo()>
			parcel1.writeNoException();
	//  672 1836:aload_3         
	//  673 1837:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  674 1840:iconst_1        
	//  675 1841:ireturn         

		case 46: // '.'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  676 1842:aload_2         
	//  677 1843:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  678 1845:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			setProcessSeq(parcel.readString());
	//  679 1848:aload_0         
	//  680 1849:aload_2         
	//  681 1850:invokevirtual   #313 <Method String Parcel.readString()>
	//  682 1853:invokevirtual   #404 <Method void setProcessSeq(String)>
			parcel1.writeNoException();
	//  683 1856:aload_3         
	//  684 1857:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  685 1860:iconst_1        
	//  686 1861:ireturn         

		case 47: // '/'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  687 1862:aload_2         
	//  688 1863:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  689 1865:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag10;
			if(parcel.readInt() != 0)
	//* 690 1868:aload_2         
	//* 691 1869:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 692 1872:ifeq            1881
				flag10 = true;
	//  693 1875:iconst_1        
	//  694 1876:istore          5
			else
	//* 695 1878:goto            1884
				flag10 = false;
	//  696 1881:iconst_0        
	//  697 1882:istore          5
			setPush(flag10);
	//  698 1884:aload_0         
	//  699 1885:iload           5
	//  700 1887:invokevirtual   #407 <Method void setPush(boolean)>
			parcel1.writeNoException();
	//  701 1890:aload_3         
	//  702 1891:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  703 1894:iconst_1        
	//  704 1895:ireturn         

		case 48: // '0'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  705 1896:aload_2         
	//  706 1897:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  707 1899:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			String s1 = parcel.readString();
	//  708 1902:aload_2         
	//  709 1903:invokevirtual   #313 <Method String Parcel.readString()>
	//  710 1906:astore          9
			boolean flag11;
			if(parcel.readInt() != 0)
	//* 711 1908:aload_2         
	//* 712 1909:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 713 1912:ifeq            1921
				flag11 = true;
	//  714 1915:iconst_1        
	//  715 1916:istore          5
			else
	//* 716 1918:goto            1924
				flag11 = false;
	//  717 1921:iconst_0        
	//  718 1922:istore          5
			SongBean songbean;
			if(parcel.readInt() != 0)
	//* 719 1924:aload_2         
	//* 720 1925:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 721 1928:ifeq            1948
				songbean = (SongBean)SongBean.CREATOR.createFromParcel(parcel);
	//  722 1931:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  723 1934:aload_2         
	//  724 1935:invokeinterface #413 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  725 1940:checkcast       #335 <Class SongBean>
	//  726 1943:astore          8
			else
	//* 727 1945:goto            1951
				songbean = null;
	//  728 1948:aconst_null     
	//  729 1949:astore          8
			if(parcel.readInt() != 0)
	//* 730 1951:aload_2         
	//* 731 1952:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 732 1955:ifeq            1974
				parcel = ((Parcel) ((SongBean)SongBean.CREATOR.createFromParcel(parcel)));
	//  733 1958:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  734 1961:aload_2         
	//  735 1962:invokeinterface #413 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  736 1967:checkcast       #335 <Class SongBean>
	//  737 1970:astore_2        
			else
	//* 738 1971:goto            1976
				parcel = null;
	//  739 1974:aconst_null     
	//  740 1975:astore_2        
			updateSongInfo(s1, flag11, songbean, ((SongBean) (parcel)));
	//  741 1976:aload_0         
	//  742 1977:aload           9
	//  743 1979:iload           5
	//  744 1981:aload           8
	//  745 1983:aload_2         
	//  746 1984:invokevirtual   #417 <Method void updateSongInfo(String, boolean, SongBean, SongBean)>
			parcel1.writeNoException();
	//  747 1987:aload_3         
	//  748 1988:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  749 1991:iconst_1        
	//  750 1992:ireturn         

		case 49: // '1'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  751 1993:aload_2         
	//  752 1994:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  753 1996:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			addUrltoPlayListInPieces((SongBean[])parcel.createTypedArray(SongBean.CREATOR), parcel.readInt());
	//  754 1999:aload_0         
	//  755 2000:aload_2         
	//  756 2001:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  757 2004:invokevirtual   #355 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//  758 2007:checkcast       #357 <Class SongBean[]>
	//  759 2010:aload_2         
	//  760 2011:invokevirtual   #304 <Method int Parcel.readInt()>
	//  761 2014:invokevirtual   #421 <Method void addUrltoPlayListInPieces(SongBean[], int)>
			parcel1.writeNoException();
	//  762 2017:aload_3         
	//  763 2018:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  764 2021:iconst_1        
	//  765 2022:ireturn         

		case 50: // '2'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  766 2023:aload_2         
	//  767 2024:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  768 2026:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			prevImmediately();
	//  769 2029:aload_0         
	//  770 2030:invokevirtual   #424 <Method void prevImmediately()>
			parcel1.writeNoException();
	//  771 2033:aload_3         
	//  772 2034:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  773 2037:iconst_1        
	//  774 2038:ireturn         

		case 51: // '3'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  775 2039:aload_2         
	//  776 2040:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  777 2042:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag12 = isDownloadingLyric(parcel.readString());
	//  778 2045:aload_0         
	//  779 2046:aload_2         
	//  780 2047:invokevirtual   #313 <Method String Parcel.readString()>
	//  781 2050:invokevirtual   #428 <Method boolean isDownloadingLyric(String)>
	//  782 2053:istore          5
			parcel1.writeNoException();
	//  783 2055:aload_3         
	//  784 2056:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag12)
	//* 785 2059:iload           5
	//* 786 2061:ifeq            2069
				i = 1;
	//  787 2064:iconst_1        
	//  788 2065:istore_1        
			else
	//* 789 2066:goto            2071
				i = 0;
	//  790 2069:iconst_0        
	//  791 2070:istore_1        
			parcel1.writeInt(i);
	//  792 2071:aload_3         
	//  793 2072:iload_1         
	//  794 2073:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  795 2076:iconst_1        
	//  796 2077:ireturn         

		case 52: // '4'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  797 2078:aload_2         
	//  798 2079:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  799 2081:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getSongBeanFromId(parcel.readLong())));
	//  800 2084:aload_0         
	//  801 2085:aload_2         
	//  802 2086:invokevirtual   #273 <Method long Parcel.readLong()>
	//  803 2089:invokevirtual   #432 <Method SongBean getSongBeanFromId(long)>
	//  804 2092:astore_2        
			parcel1.writeNoException();
	//  805 2093:aload_3         
	//  806 2094:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(parcel != null)
	//* 807 2097:aload_2         
	//* 808 2098:ifnull          2115
			{
				parcel1.writeInt(1);
	//  809 2101:aload_3         
	//  810 2102:iconst_1        
	//  811 2103:invokevirtual   #230 <Method void Parcel.writeInt(int)>
				((SongBean) (parcel)).writeToParcel(parcel1, 1);
	//  812 2106:aload_2         
	//  813 2107:aload_3         
	//  814 2108:iconst_1        
	//  815 2109:invokevirtual   #336 <Method void SongBean.writeToParcel(Parcel, int)>
			} else
	//* 816 2112:goto            2120
			{
				parcel1.writeInt(0);
	//  817 2115:aload_3         
	//  818 2116:iconst_0        
	//  819 2117:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			}
			return true;
	//  820 2120:iconst_1        
	//  821 2121:ireturn         

		case 53: // '5'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  822 2122:aload_2         
	//  823 2123:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  824 2125:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag13 = hasMultiscreenDevice();
	//  825 2128:aload_0         
	//  826 2129:invokevirtual   #435 <Method boolean hasMultiscreenDevice()>
	//  827 2132:istore          5
			parcel1.writeNoException();
	//  828 2134:aload_3         
	//  829 2135:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag13)
	//* 830 2138:iload           5
	//* 831 2140:ifeq            2148
				i = 1;
	//  832 2143:iconst_1        
	//  833 2144:istore_1        
			else
	//* 834 2145:goto            2150
				i = 0;
	//  835 2148:iconst_0        
	//  836 2149:istore_1        
			parcel1.writeInt(i);
	//  837 2150:aload_3         
	//  838 2151:iload_1         
	//  839 2152:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  840 2155:iconst_1        
	//  841 2156:ireturn         

		case 54: // '6'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  842 2157:aload_2         
	//  843 2158:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  844 2160:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			updateSongs((SongBean[])parcel.createTypedArray(SongBean.CREATOR));
	//  845 2163:aload_0         
	//  846 2164:aload_2         
	//  847 2165:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  848 2168:invokevirtual   #355 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//  849 2171:checkcast       #357 <Class SongBean[]>
	//  850 2174:invokevirtual   #438 <Method void updateSongs(SongBean[])>
			parcel1.writeNoException();
	//  851 2177:aload_3         
	//  852 2178:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	//  853 2181:iconst_1        
	//  854 2182:ireturn         

		case 55: // '7'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  855 2183:aload_2         
	//  856 2184:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  857 2186:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getMusicInfos(parcel.readInt(), parcel.readInt())));
	//  858 2189:aload_0         
	//  859 2190:aload_2         
	//  860 2191:invokevirtual   #304 <Method int Parcel.readInt()>
	//  861 2194:aload_2         
	//  862 2195:invokevirtual   #304 <Method int Parcel.readInt()>
	//  863 2198:invokevirtual   #442 <Method SongBean[] getMusicInfos(int, int)>
	//  864 2201:astore_2        
			parcel1.writeNoException();
	//  865 2202:aload_3         
	//  866 2203:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeTypedArray(((android.os.Parcelable []) (parcel)), 1);
	//  867 2206:aload_3         
	//  868 2207:aload_2         
	//  869 2208:iconst_1        
	//  870 2209:invokevirtual   #344 <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			return true;
	//  871 2212:iconst_1        
	//  872 2213:ireturn         

		case 56: // '8'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  873 2214:aload_2         
	//  874 2215:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  875 2217:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getPlaylistLength();
	//  876 2220:aload_0         
	//  877 2221:invokevirtual   #445 <Method int getPlaylistLength()>
	//  878 2224:istore_1        
			parcel1.writeNoException();
	//  879 2225:aload_3         
	//  880 2226:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  881 2229:aload_3         
	//  882 2230:iload_1         
	//  883 2231:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  884 2234:iconst_1        
	//  885 2235:ireturn         

		case 57: // '9'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  886 2236:aload_2         
	//  887 2237:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  888 2239:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getMusicIdOnly()));
	//  889 2242:aload_0         
	//  890 2243:invokevirtual   #448 <Method SongBean[] getMusicIdOnly()>
	//  891 2246:astore_2        
			parcel1.writeNoException();
	//  892 2247:aload_3         
	//  893 2248:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeTypedArray(((android.os.Parcelable []) (parcel)), 1);
	//  894 2251:aload_3         
	//  895 2252:aload_2         
	//  896 2253:iconst_1        
	//  897 2254:invokevirtual   #344 <Method void Parcel.writeTypedArray(android.os.Parcelable[], int)>
			return true;
	//  898 2257:iconst_1        
	//  899 2258:ireturn         

		case 58: // ':'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  900 2259:aload_2         
	//  901 2260:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  902 2262:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getAudioSessionId();
	//  903 2265:aload_0         
	//  904 2266:invokevirtual   #451 <Method int getAudioSessionId()>
	//  905 2269:istore_1        
			parcel1.writeNoException();
	//  906 2270:aload_3         
	//  907 2271:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  908 2274:aload_3         
	//  909 2275:iload_1         
	//  910 2276:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  911 2279:iconst_1        
	//  912 2280:ireturn         

		case 59: // ';'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  913 2281:aload_2         
	//  914 2282:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  915 2284:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getErrorIds()));
	//  916 2287:aload_0         
	//  917 2288:invokevirtual   #454 <Method long[] getErrorIds()>
	//  918 2291:astore_2        
			parcel1.writeNoException();
	//  919 2292:aload_3         
	//  920 2293:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLongArray(((long []) (parcel)));
	//  921 2296:aload_3         
	//  922 2297:aload_2         
	//  923 2298:invokevirtual   #295 <Method void Parcel.writeLongArray(long[])>
			return true;
	//  924 2301:iconst_1        
	//  925 2302:ireturn         

		case 60: // '<'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  926 2303:aload_2         
	//  927 2304:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  928 2306:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			long l7 = seekRepeat(parcel.readLong(), parcel.readInt());
	//  929 2309:aload_0         
	//  930 2310:aload_2         
	//  931 2311:invokevirtual   #273 <Method long Parcel.readLong()>
	//  932 2314:aload_2         
	//  933 2315:invokevirtual   #304 <Method int Parcel.readInt()>
	//  934 2318:invokevirtual   #458 <Method long seekRepeat(long, int)>
	//  935 2321:lstore          6
			parcel1.writeNoException();
	//  936 2323:aload_3         
	//  937 2324:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeLong(l7);
	//  938 2327:aload_3         
	//  939 2328:lload           6
	//  940 2330:invokevirtual   #238 <Method void Parcel.writeLong(long)>
			return true;
	//  941 2333:iconst_1        
	//  942 2334:ireturn         

		case 61: // '='
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  943 2335:aload_2         
	//  944 2336:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  945 2338:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag14 = isContainsOnlineSong();
	//  946 2341:aload_0         
	//  947 2342:invokevirtual   #461 <Method boolean isContainsOnlineSong()>
	//  948 2345:istore          5
			parcel1.writeNoException();
	//  949 2347:aload_3         
	//  950 2348:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag14)
	//* 951 2351:iload           5
	//* 952 2353:ifeq            2361
				i = 1;
	//  953 2356:iconst_1        
	//  954 2357:istore_1        
			else
	//* 955 2358:goto            2363
				i = 0;
	//  956 2361:iconst_0        
	//  957 2362:istore_1        
			parcel1.writeInt(i);
	//  958 2363:aload_3         
	//  959 2364:iload_1         
	//  960 2365:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  961 2368:iconst_1        
	//  962 2369:ireturn         

		case 62: // '>'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  963 2370:aload_2         
	//  964 2371:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  965 2373:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 966 2376:aload_2         
	//* 967 2377:invokevirtual   #304 <Method int Parcel.readInt()>
	//* 968 2380:ifeq            2399
				parcel = ((Parcel) ((SongBean)SongBean.CREATOR.createFromParcel(parcel)));
	//  969 2383:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	//  970 2386:aload_2         
	//  971 2387:invokeinterface #413 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  972 2392:checkcast       #335 <Class SongBean>
	//  973 2395:astore_2        
			else
	//* 974 2396:goto            2401
				parcel = null;
	//  975 2399:aconst_null     
	//  976 2400:astore_2        
			boolean flag15 = playSong(((SongBean) (parcel)));
	//  977 2401:aload_0         
	//  978 2402:aload_2         
	//  979 2403:invokevirtual   #465 <Method boolean playSong(SongBean)>
	//  980 2406:istore          5
			parcel1.writeNoException();
	//  981 2408:aload_3         
	//  982 2409:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag15)
	//* 983 2412:iload           5
	//* 984 2414:ifeq            2422
				i = 1;
	//  985 2417:iconst_1        
	//  986 2418:istore_1        
			else
	//* 987 2419:goto            2424
				i = 0;
	//  988 2422:iconst_0        
	//  989 2423:istore_1        
			parcel1.writeInt(i);
	//  990 2424:aload_3         
	//  991 2425:iload_1         
	//  992 2426:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	//  993 2429:iconst_1        
	//  994 2430:ireturn         

		case 63: // '?'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	//  995 2431:aload_2         
	//  996 2432:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//  997 2434:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag16 = isAllSongsOnline();
	//  998 2437:aload_0         
	//  999 2438:invokevirtual   #468 <Method boolean isAllSongsOnline()>
	// 1000 2441:istore          5
			parcel1.writeNoException();
	// 1001 2443:aload_3         
	// 1002 2444:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag16)
	//*1003 2447:iload           5
	//*1004 2449:ifeq            2457
				i = 1;
	// 1005 2452:iconst_1        
	// 1006 2453:istore_1        
			else
	//*1007 2454:goto            2459
				i = 0;
	// 1008 2457:iconst_0        
	// 1009 2458:istore_1        
			parcel1.writeInt(i);
	// 1010 2459:aload_3         
	// 1011 2460:iload_1         
	// 1012 2461:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	// 1013 2464:iconst_1        
	// 1014 2465:ireturn         

		case 64: // '@'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1015 2466:aload_2         
	// 1016 2467:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1017 2469:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			SongBean songbean1;
			if(parcel.readInt() != 0)
	//*1018 2472:aload_2         
	//*1019 2473:invokevirtual   #304 <Method int Parcel.readInt()>
	//*1020 2476:ifeq            2496
				songbean1 = (SongBean)SongBean.CREATOR.createFromParcel(parcel);
	// 1021 2479:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	// 1022 2482:aload_2         
	// 1023 2483:invokeinterface #413 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	// 1024 2488:checkcast       #335 <Class SongBean>
	// 1025 2491:astore          8
			else
	//*1026 2493:goto            2499
				songbean1 = null;
	// 1027 2496:aconst_null     
	// 1028 2497:astore          8
			SongBean songbean2;
			if(parcel.readInt() != 0)
	//*1029 2499:aload_2         
	//*1030 2500:invokevirtual   #304 <Method int Parcel.readInt()>
	//*1031 2503:ifeq            2523
				songbean2 = (SongBean)SongBean.CREATOR.createFromParcel(parcel);
	// 1032 2506:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	// 1033 2509:aload_2         
	// 1034 2510:invokeinterface #413 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	// 1035 2515:checkcast       #335 <Class SongBean>
	// 1036 2518:astore          9
			else
	//*1037 2520:goto            2526
				songbean2 = null;
	// 1038 2523:aconst_null     
	// 1039 2524:astore          9
			boolean flag17;
			if(parcel.readInt() != 0)
	//*1040 2526:aload_2         
	//*1041 2527:invokevirtual   #304 <Method int Parcel.readInt()>
	//*1042 2530:ifeq            2539
				flag17 = true;
	// 1043 2533:iconst_1        
	// 1044 2534:istore          5
			else
	//*1045 2536:goto            2542
				flag17 = false;
	// 1046 2539:iconst_0        
	// 1047 2540:istore          5
			replacePlayingBean(songbean1, songbean2, flag17);
	// 1048 2542:aload_0         
	// 1049 2543:aload           8
	// 1050 2545:aload           9
	// 1051 2547:iload           5
	// 1052 2549:invokevirtual   #472 <Method void replacePlayingBean(SongBean, SongBean, boolean)>
			parcel1.writeNoException();
	// 1053 2552:aload_3         
	// 1054 2553:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	// 1055 2556:iconst_1        
	// 1056 2557:ireturn         

		case 65: // 'A'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1057 2558:aload_2         
	// 1058 2559:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1059 2561:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*1060 2564:aload_2         
	//*1061 2565:invokevirtual   #304 <Method int Parcel.readInt()>
	//*1062 2568:ifeq            2587
				parcel = ((Parcel) ((SongBean)SongBean.CREATOR.createFromParcel(parcel)));
	// 1063 2571:getstatic       #351 <Field android.os.Parcelable$Creator SongBean.CREATOR>
	// 1064 2574:aload_2         
	// 1065 2575:invokeinterface #413 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	// 1066 2580:checkcast       #335 <Class SongBean>
	// 1067 2583:astore_2        
			else
	//*1068 2584:goto            2589
				parcel = null;
	// 1069 2587:aconst_null     
	// 1070 2588:astore_2        
			addNextPlay(((SongBean) (parcel)));
	// 1071 2589:aload_0         
	// 1072 2590:aload_2         
	// 1073 2591:invokevirtual   #476 <Method void addNextPlay(SongBean)>
			parcel1.writeNoException();
	// 1074 2594:aload_3         
	// 1075 2595:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	// 1076 2598:iconst_1        
	// 1077 2599:ireturn         

		case 66: // 'B'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1078 2600:aload_2         
	// 1079 2601:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1080 2603:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			setRepeatTime(parcel.readInt());
	// 1081 2606:aload_0         
	// 1082 2607:aload_2         
	// 1083 2608:invokevirtual   #304 <Method int Parcel.readInt()>
	// 1084 2611:invokevirtual   #479 <Method void setRepeatTime(int)>
			parcel1.writeNoException();
	// 1085 2614:aload_3         
	// 1086 2615:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	// 1087 2618:iconst_1        
	// 1088 2619:ireturn         

		case 67: // 'C'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1089 2620:aload_2         
	// 1090 2621:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1091 2623:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getRepeatTime();
	// 1092 2626:aload_0         
	// 1093 2627:invokevirtual   #482 <Method int getRepeatTime()>
	// 1094 2630:istore_1        
			parcel1.writeNoException();
	// 1095 2631:aload_3         
	// 1096 2632:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	// 1097 2635:aload_3         
	// 1098 2636:iload_1         
	// 1099 2637:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	// 1100 2640:iconst_1        
	// 1101 2641:ireturn         

		case 68: // 'D'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1102 2642:aload_2         
	// 1103 2643:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1104 2645:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getNextBean()));
	// 1105 2648:aload_0         
	// 1106 2649:invokevirtual   #485 <Method SongBean getNextBean()>
	// 1107 2652:astore_2        
			parcel1.writeNoException();
	// 1108 2653:aload_3         
	// 1109 2654:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*1110 2657:aload_2         
	//*1111 2658:ifnull          2675
			{
				parcel1.writeInt(1);
	// 1112 2661:aload_3         
	// 1113 2662:iconst_1        
	// 1114 2663:invokevirtual   #230 <Method void Parcel.writeInt(int)>
				((SongBean) (parcel)).writeToParcel(parcel1, 1);
	// 1115 2666:aload_2         
	// 1116 2667:aload_3         
	// 1117 2668:iconst_1        
	// 1118 2669:invokevirtual   #336 <Method void SongBean.writeToParcel(Parcel, int)>
			} else
	//*1119 2672:goto            2680
			{
				parcel1.writeInt(0);
	// 1120 2675:aload_3         
	// 1121 2676:iconst_0        
	// 1122 2677:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			}
			return true;
	// 1123 2680:iconst_1        
	// 1124 2681:ireturn         

		case 69: // 'E'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1125 2682:aload_2         
	// 1126 2683:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1127 2685:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getPrevBean()));
	// 1128 2688:aload_0         
	// 1129 2689:invokevirtual   #488 <Method SongBean getPrevBean()>
	// 1130 2692:astore_2        
			parcel1.writeNoException();
	// 1131 2693:aload_3         
	// 1132 2694:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*1133 2697:aload_2         
	//*1134 2698:ifnull          2715
			{
				parcel1.writeInt(1);
	// 1135 2701:aload_3         
	// 1136 2702:iconst_1        
	// 1137 2703:invokevirtual   #230 <Method void Parcel.writeInt(int)>
				((SongBean) (parcel)).writeToParcel(parcel1, 1);
	// 1138 2706:aload_2         
	// 1139 2707:aload_3         
	// 1140 2708:iconst_1        
	// 1141 2709:invokevirtual   #336 <Method void SongBean.writeToParcel(Parcel, int)>
			} else
	//*1142 2712:goto            2720
			{
				parcel1.writeInt(0);
	// 1143 2715:aload_3         
	// 1144 2716:iconst_0        
	// 1145 2717:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			}
			return true;
	// 1146 2720:iconst_1        
	// 1147 2721:ireturn         

		case 70: // 'F'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1148 2722:aload_2         
	// 1149 2723:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1150 2725:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getCurrentQuality();
	// 1151 2728:aload_0         
	// 1152 2729:invokevirtual   #491 <Method int getCurrentQuality()>
	// 1153 2732:istore_1        
			parcel1.writeNoException();
	// 1154 2733:aload_3         
	// 1155 2734:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	// 1156 2737:aload_3         
	// 1157 2738:iload_1         
	// 1158 2739:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	// 1159 2742:iconst_1        
	// 1160 2743:ireturn         

		case 71: // 'G'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1161 2744:aload_2         
	// 1162 2745:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1163 2747:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag18;
			if(parcel.readInt() != 0)
	//*1164 2750:aload_2         
	//*1165 2751:invokevirtual   #304 <Method int Parcel.readInt()>
	//*1166 2754:ifeq            2763
				flag18 = true;
	// 1167 2757:iconst_1        
	// 1168 2758:istore          5
			else
	//*1169 2760:goto            2766
				flag18 = false;
	// 1170 2763:iconst_0        
	// 1171 2764:istore          5
			setPauseAfterCurSong(flag18);
	// 1172 2766:aload_0         
	// 1173 2767:iload           5
	// 1174 2769:invokevirtual   #494 <Method void setPauseAfterCurSong(boolean)>
			parcel1.writeNoException();
	// 1175 2772:aload_3         
	// 1176 2773:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	// 1177 2776:iconst_1        
	// 1178 2777:ireturn         

		case 72: // 'H'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1179 2778:aload_2         
	// 1180 2779:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1181 2781:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			setKtHistorySongPlayPos(parcel.readLong());
	// 1182 2784:aload_0         
	// 1183 2785:aload_2         
	// 1184 2786:invokevirtual   #273 <Method long Parcel.readLong()>
	// 1185 2789:invokevirtual   #497 <Method void setKtHistorySongPlayPos(long)>
			parcel1.writeNoException();
	// 1186 2792:aload_3         
	// 1187 2793:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	// 1188 2796:iconst_1        
	// 1189 2797:ireturn         

		case 73: // 'I'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1190 2798:aload_2         
	// 1191 2799:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1192 2801:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			boolean flag19 = isPauseAfterCurSong();
	// 1193 2804:aload_0         
	// 1194 2805:invokevirtual   #500 <Method boolean isPauseAfterCurSong()>
	// 1195 2808:istore          5
			parcel1.writeNoException();
	// 1196 2810:aload_3         
	// 1197 2811:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(flag19)
	//*1198 2814:iload           5
	//*1199 2816:ifeq            2824
				i = 1;
	// 1200 2819:iconst_1        
	// 1201 2820:istore_1        
			else
	//*1202 2821:goto            2826
				i = 0;
	// 1203 2824:iconst_0        
	// 1204 2825:istore_1        
			parcel1.writeInt(i);
	// 1205 2826:aload_3         
	// 1206 2827:iload_1         
	// 1207 2828:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	// 1208 2831:iconst_1        
	// 1209 2832:ireturn         

		case 74: // 'J'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1210 2833:aload_2         
	// 1211 2834:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1212 2836:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getMediaSessionToken()));
	// 1213 2839:aload_0         
	// 1214 2840:invokevirtual   #504 <Method android.support.v4.media.session.MediaSessionCompat$Token getMediaSessionToken()>
	// 1215 2843:astore_2        
			parcel1.writeNoException();
	// 1216 2844:aload_3         
	// 1217 2845:invokevirtual   #210 <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*1218 2848:aload_2         
	//*1219 2849:ifnull          2866
			{
				parcel1.writeInt(1);
	// 1220 2852:aload_3         
	// 1221 2853:iconst_1        
	// 1222 2854:invokevirtual   #230 <Method void Parcel.writeInt(int)>
				((android.support.v4.media.session.MediaSessionCompat.Token) (parcel)).writeToParcel(parcel1, 1);
	// 1223 2857:aload_2         
	// 1224 2858:aload_3         
	// 1225 2859:iconst_1        
	// 1226 2860:invokevirtual   #507 <Method void android.support.v4.media.session.MediaSessionCompat$Token.writeToParcel(Parcel, int)>
			} else
	//*1227 2863:goto            2871
			{
				parcel1.writeInt(0);
	// 1228 2866:aload_3         
	// 1229 2867:iconst_0        
	// 1230 2868:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			}
			return true;
	// 1231 2871:iconst_1        
	// 1232 2872:ireturn         

		case 75: // 'K'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1233 2873:aload_2         
	// 1234 2874:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1235 2876:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			stepFrequency(parcel.readInt());
	// 1236 2879:aload_0         
	// 1237 2880:aload_2         
	// 1238 2881:invokevirtual   #304 <Method int Parcel.readInt()>
	// 1239 2884:invokevirtual   #510 <Method void stepFrequency(int)>
			parcel1.writeNoException();
	// 1240 2887:aload_3         
	// 1241 2888:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	// 1242 2891:iconst_1        
	// 1243 2892:ireturn         

		case 76: // 'L'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1244 2893:aload_2         
	// 1245 2894:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1246 2896:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			i = getFrequency();
	// 1247 2899:aload_0         
	// 1248 2900:invokevirtual   #513 <Method int getFrequency()>
	// 1249 2903:istore_1        
			parcel1.writeNoException();
	// 1250 2904:aload_3         
	// 1251 2905:invokevirtual   #210 <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	// 1252 2908:aload_3         
	// 1253 2909:iload_1         
	// 1254 2910:invokevirtual   #230 <Method void Parcel.writeInt(int)>
			return true;
	// 1255 2913:iconst_1        
	// 1256 2914:ireturn         

		case 77: // 'M'
			parcel.enforceInterface("com.android.mediacenter.localmusic.IMediaPlaybackService");
	// 1257 2915:aload_2         
	// 1258 2916:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	// 1259 2918:invokevirtual   #204 <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*1260 2921:aload_2         
	//*1261 2922:invokevirtual   #304 <Method int Parcel.readInt()>
	//*1262 2925:ifeq            2944
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	// 1263 2928:getstatic       #516 <Field android.os.Parcelable$Creator Bundle.CREATOR>
	// 1264 2931:aload_2         
	// 1265 2932:invokeinterface #413 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	// 1266 2937:checkcast       #515 <Class Bundle>
	// 1267 2940:astore_2        
			else
	//*1268 2941:goto            2946
				parcel = null;
	// 1269 2944:aconst_null     
	// 1270 2945:astore_2        
			stopRunning(((Bundle) (parcel)));
	// 1271 2946:aload_0         
	// 1272 2947:aload_2         
	// 1273 2948:invokevirtual   #520 <Method void stopRunning(Bundle)>
			parcel1.writeNoException();
	// 1274 2951:aload_3         
	// 1275 2952:invokevirtual   #210 <Method void Parcel.writeNoException()>
			return true;
	// 1276 2955:iconst_1        
	// 1277 2956:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	// 1278 2957:aload_0         
	// 1279 2958:iload_1         
	// 1280 2959:aload_2         
	// 1281 2960:aload_3         
	// 1282 2961:iload           4
	// 1283 2963:invokespecial   #522 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	// 1284 2966:ireturn         
	}

	private static final String DESCRIPTOR = "com.android.mediacenter.localmusic.IMediaPlaybackService";
	static final int TRANSACTION_addNextPlay = 65;
	static final int TRANSACTION_addUrltoPlayList = 35;
	static final int TRANSACTION_addUrltoPlayListInPieces = 49;
	static final int TRANSACTION_deleteSongs = 39;
	static final int TRANSACTION_duration = 14;
	static final int TRANSACTION_getAlbumId = 9;
	static final int TRANSACTION_getAlbumName = 13;
	static final int TRANSACTION_getArtistId = 11;
	static final int TRANSACTION_getArtistName = 12;
	static final int TRANSACTION_getAudioId = 7;
	static final int TRANSACTION_getAudioSessionId = 58;
	static final int TRANSACTION_getBufferPercentage = 24;
	static final int TRANSACTION_getCurrentDMRName = 43;
	static final int TRANSACTION_getCurrentPlayPlaylistId = 32;
	static final int TRANSACTION_getCurrentQuality = 70;
	static final int TRANSACTION_getDolbyEffectOn = 36;
	static final int TRANSACTION_getErrorIds = 59;
	static final int TRANSACTION_getFrequency = 76;
	static final int TRANSACTION_getMediaSessionToken = 74;
	static final int TRANSACTION_getMusicIdOnly = 57;
	static final int TRANSACTION_getMusicInfos = 55;
	static final int TRANSACTION_getNetMusicInfo = 10;
	static final int TRANSACTION_getNetMusicInfos = 31;
	static final int TRANSACTION_getNextBean = 68;
	static final int TRANSACTION_getOneShot = 28;
	static final int TRANSACTION_getOnlinePlaylistId = 38;
	static final int TRANSACTION_getOnlinePlaylistType = 34;
	static final int TRANSACTION_getPath = 21;
	static final int TRANSACTION_getPlayMode = 22;
	static final int TRANSACTION_getPlaylistLength = 56;
	static final int TRANSACTION_getPrevBean = 69;
	static final int TRANSACTION_getQueue = 20;
	static final int TRANSACTION_getQueuePosition = 19;
	static final int TRANSACTION_getRepeatTime = 67;
	static final int TRANSACTION_getSongBean = 30;
	static final int TRANSACTION_getSongBeanFromId = 52;
	static final int TRANSACTION_getTrackName = 8;
	static final int TRANSACTION_hasMultiscreenDevice = 53;
	static final int TRANSACTION_initializeDlna = 40;
	static final int TRANSACTION_isAllSongsOnline = 63;
	static final int TRANSACTION_isContainsOnlineSong = 61;
	static final int TRANSACTION_isDownloadingLyric = 51;
	static final int TRANSACTION_isInitialized = 18;
	static final int TRANSACTION_isOnlinePrepearing = 17;
	static final int TRANSACTION_isPauseAfterCurSong = 73;
	static final int TRANSACTION_isPlayerClientRendering = 42;
	static final int TRANSACTION_isPlaying = 6;
	static final int TRANSACTION_next = 5;
	static final int TRANSACTION_openFile = 25;
	static final int TRANSACTION_openFileAsync = 26;
	static final int TRANSACTION_openUrlMusic = 33;
	static final int TRANSACTION_pause = 3;
	static final int TRANSACTION_play = 1;
	static final int TRANSACTION_playSong = 62;
	static final int TRANSACTION_position = 15;
	static final int TRANSACTION_prev = 4;
	static final int TRANSACTION_prevImmediately = 50;
	static final int TRANSACTION_reloadQueue = 29;
	static final int TRANSACTION_replacePlayingBean = 64;
	static final int TRANSACTION_seek = 16;
	static final int TRANSACTION_seekRepeat = 60;
	static final int TRANSACTION_setClearMediaInfoWhenPauseAudio = 44;
	static final int TRANSACTION_setDolbyEffect = 37;
	static final int TRANSACTION_setKtHistorySongPlayPos = 72;
	static final int TRANSACTION_setMediaInfo = 45;
	static final int TRANSACTION_setPauseAfterCurSong = 71;
	static final int TRANSACTION_setPlayMode = 23;
	static final int TRANSACTION_setProcessSeq = 46;
	static final int TRANSACTION_setPush = 47;
	static final int TRANSACTION_setQueuePosition = 27;
	static final int TRANSACTION_setRepeatTime = 66;
	static final int TRANSACTION_showDeviceSelector = 41;
	static final int TRANSACTION_stepFrequency = 75;
	static final int TRANSACTION_stop = 2;
	static final int TRANSACTION_stopRunning = 77;
	static final int TRANSACTION_updateSongInfo = 48;
	static final int TRANSACTION_updateSongs = 54;

	public IMediaPlaybackService$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.android.mediacenter.localmusic.IMediaPlaybackService");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "com.android.mediacenter.localmusic.IMediaPlaybackService">
	//    5    8:invokevirtual   #177 <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}

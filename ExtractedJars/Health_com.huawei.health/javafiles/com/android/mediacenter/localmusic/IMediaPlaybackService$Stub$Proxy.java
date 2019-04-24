// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.mediacenter.localmusic;

import android.os.*;
import com.android.mediacenter.data.bean.SongBean;

// Referenced classes of package com.android.mediacenter.localmusic:
//			IMediaPlaybackService, NetSongInfo

static class IMediaPlaybackService$Stub$Proxy
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

	IMediaPlaybackService$Stub$Proxy(IBinder ibinder)
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

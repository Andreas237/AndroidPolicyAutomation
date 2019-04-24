// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zzh

public static abstract class zzh$zza extends Binder
	implements zzh
{
	static class zza
		implements zzh
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void clearTileCache()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(2, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_2        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #45  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #48  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public boolean getFadeIn()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(11, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          11
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #45  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #55  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #48  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public String getId()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(3, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_3        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #45  <Method void Parcel.readException()>
			s = parcel1.readString();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #60  <Method String Parcel.readString()>
		//   19   36:astore_3        
			parcel1.recycle();
		//   20   37:aload_2         
		//   21   38:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_1         
		//   23   42:invokevirtual   #48  <Method void Parcel.recycle()>
			return s;
		//   24   45:aload_3         
		//   25   46:areturn         
			Exception exception;
			exception;
		//   26   47:astore_3        
			parcel1.recycle();
		//   27   48:aload_2         
		//   28   49:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   52:aload_1         
		//   30   53:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   31   56:aload_3         
		//   32   57:athrow          
		}

		public float getTransparency()
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
			float f;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(13, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          13
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #45  <Method void Parcel.readException()>
			f = parcel1.readFloat();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #65  <Method float Parcel.readFloat()>
		//   19   37:fstore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #48  <Method void Parcel.recycle()>
			return f;
		//   24   46:fload_1         
		//   25   47:freturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public float getZIndex()
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
			float f;
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(5, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_5        
		//   10   19:aload_2         
		//   11   20:aload_3         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_3         
		//   16   29:invokevirtual   #45  <Method void Parcel.readException()>
			f = parcel1.readFloat();
		//   17   32:aload_3         
		//   18   33:invokevirtual   #65  <Method float Parcel.readFloat()>
		//   19   36:fstore_1        
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #48  <Method void Parcel.recycle()>
			return f;
		//   24   45:fload_1         
		//   25   46:freturn         
			Exception exception;
			exception;
		//   26   47:astore          4
			parcel1.recycle();
		//   27   49:aload_3         
		//   28   50:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   53:aload_2         
		//   30   54:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   31   57:aload           4
		//   32   59:athrow          
		}

		public int hashCodeRemote()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(9, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:bipush          9
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:iconst_0        
		//   13   23:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   28:pop             
			parcel1.readException();
		//   15   29:aload_3         
		//   16   30:invokevirtual   #45  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   33:aload_3         
		//   18   34:invokevirtual   #55  <Method int Parcel.readInt()>
		//   19   37:istore_1        
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #48  <Method void Parcel.recycle()>
			return i;
		//   24   46:iload_1         
		//   25   47:ireturn         
			Exception exception;
			exception;
		//   26   48:astore          4
			parcel1.recycle();
		//   27   50:aload_3         
		//   28   51:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   54:aload_2         
		//   30   55:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   31   58:aload           4
		//   32   60:athrow          
		}

		public boolean isVisible()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(7, parcel, parcel1, 0);
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field IBinder zzrk>
		//    9   19:bipush          7
		//   10   21:aload_3         
		//   11   22:aload           4
		//   12   24:iconst_0        
		//   13   25:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   30:pop             
			parcel1.readException();
		//   15   31:aload           4
		//   16   33:invokevirtual   #45  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   17   36:aload           4
		//   18   38:invokevirtual   #55  <Method int Parcel.readInt()>
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
		//   28   55:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   29   58:aload_3         
		//   30   59:invokevirtual   #48  <Method void Parcel.recycle()>
			return flag;
		//   31   62:iload_2         
		//   32   63:ireturn         
			Exception exception;
			exception;
		//   33   64:astore          5
			parcel1.recycle();
		//   34   66:aload           4
		//   35   68:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   36   71:aload_3         
		//   37   72:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   38   75:aload           5
		//   39   77:athrow          
		}

		public void remove()
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			zzrk.transact(1, parcel, parcel1, 0);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field IBinder zzrk>
		//    9   18:iconst_1        
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   14   27:pop             
			parcel1.readException();
		//   15   28:aload_2         
		//   16   29:invokevirtual   #45  <Method void Parcel.readException()>
			parcel1.recycle();
		//   17   32:aload_2         
		//   18   33:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   19   36:aload_1         
		//   20   37:invokevirtual   #48  <Method void Parcel.recycle()>
			return;
		//   21   40:return          
			Exception exception;
			exception;
		//   22   41:astore_3        
			parcel1.recycle();
		//   23   42:aload_2         
		//   24   43:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   25   46:aload_1         
		//   26   47:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   27   50:aload_3         
		//   28   51:athrow          
		}

		public void setFadeIn(boolean flag)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
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
		//*  14   26:invokevirtual   #75  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          10
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #45  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(10, parcel, parcel1, 0);
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

		public void setTransparency(float f)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   14:aload_2         
		//    8   15:fload_1         
		//    9   16:invokevirtual   #80  <Method void Parcel.writeFloat(float)>
			zzrk.transact(12, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:bipush          12
		//   13   25:aload_2         
		//   14   26:aload_3         
		//   15   27:iconst_0        
		//   16   28:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   33:pop             
			parcel1.readException();
		//   18   34:aload_3         
		//   19   35:invokevirtual   #45  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   38:aload_3         
		//   21   39:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   42:aload_2         
		//   23   43:invokevirtual   #48  <Method void Parcel.recycle()>
			return;
		//   24   46:return          
			Exception exception;
			exception;
		//   25   47:astore          4
			parcel1.recycle();
		//   26   49:aload_3         
		//   27   50:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   53:aload_2         
		//   29   54:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   30   57:aload           4
		//   31   59:athrow          
		}

		public void setVisible(boolean flag)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    9:aload_3         
		//    5   10:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
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
		//*  14   26:invokevirtual   #75  <Method void Parcel.writeInt(int)>
		//*  15   29:aload_0         
		//*  16   30:getfield        #18  <Field IBinder zzrk>
		//*  17   33:bipush          6
		//*  18   35:aload_3         
		//*  19   36:aload           4
		//*  20   38:iconst_0        
		//*  21   39:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//*  22   44:pop             
		//*  23   45:aload           4
		//*  24   47:invokevirtual   #45  <Method void Parcel.readException()>
		//*  25   50:aload           4
		//*  26   52:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  27   55:aload_3         
		//*  28   56:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  29   59:return          
		//*  30   60:astore          5
		//*  31   62:aload           4
		//*  32   64:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  33   67:aload_3         
		//*  34   68:invokevirtual   #48  <Method void Parcel.recycle()>
		//*  35   71:aload           5
		//*  36   73:athrow          
				i = 0;
		//   37   74:iconst_0        
		//   38   75:istore_2        
			parcel.writeInt(i);
			zzrk.transact(6, parcel, parcel1, 0);
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

		public void setZIndex(float f)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeFloat(f);
		//    7   14:aload_2         
		//    8   15:fload_1         
		//    9   16:invokevirtual   #80  <Method void Parcel.writeFloat(float)>
			zzrk.transact(4, parcel, parcel1, 0);
		//   10   19:aload_0         
		//   11   20:getfield        #18  <Field IBinder zzrk>
		//   12   23:iconst_4        
		//   13   24:aload_2         
		//   14   25:aload_3         
		//   15   26:iconst_0        
		//   16   27:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   17   32:pop             
			parcel1.readException();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #45  <Method void Parcel.readException()>
			parcel1.recycle();
		//   20   37:aload_3         
		//   21   38:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   22   41:aload_2         
		//   23   42:invokevirtual   #48  <Method void Parcel.recycle()>
			return;
		//   24   45:return          
			Exception exception;
			exception;
		//   25   46:astore          4
			parcel1.recycle();
		//   26   48:aload_3         
		//   27   49:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   52:aload_2         
		//   29   53:invokevirtual   #48  <Method void Parcel.recycle()>
			throw exception;
		//   30   56:aload           4
		//   31   58:athrow          
		}

		public boolean zza(zzh zzh1)
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
			parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
		//    4   10:aload           4
		//    5   12:ldc1            #32  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
		//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzh1 == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          101
_L1:
			zzh1 = ((zzh) (zzh1.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #85  <Method IBinder zzh.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			int i;
			parcel.writeStrongBinder(((IBinder) (zzh1)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #88  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(8, parcel, parcel1, 0);
		//   16   37:aload_0         
		//   17   38:getfield        #18  <Field IBinder zzrk>
		//   18   41:bipush          8
		//   19   43:aload           4
		//   20   45:aload           5
		//   21   47:iconst_0        
		//   22   48:invokeinterface #42  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   53:pop             
			parcel1.readException();
		//   24   54:aload           5
		//   25   56:invokevirtual   #45  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   26   59:aload           5
		//   27   61:invokevirtual   #55  <Method int Parcel.readInt()>
		//   28   64:istore_2        
			boolean flag;
			if(i != 0)
		//*  29   65:iload_2         
		//*  30   66:ifeq            74
				flag = true;
		//   31   69:iconst_1        
		//   32   70:istore_3        
			else
		//*  33   71:goto            76
				flag = false;
		//   34   74:iconst_0        
		//   35   75:istore_3        
			parcel1.recycle();
		//   36   76:aload           5
		//   37   78:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   81:aload           4
		//   39   83:invokevirtual   #48  <Method void Parcel.recycle()>
			return flag;
		//   40   86:iload_3         
		//   41   87:ireturn         
			zzh1;
		//   42   88:astore_1        
			parcel1.recycle();
		//   43   89:aload           5
		//   44   91:invokevirtual   #48  <Method void Parcel.recycle()>
			parcel.recycle();
		//   45   94:aload           4
		//   46   96:invokevirtual   #48  <Method void Parcel.recycle()>
			throw zzh1;
		//   47   99:aload_1         
		//   48  100:athrow          
_L2:
			zzh1 = null;
		//   49  101:aconst_null     
		//   50  102:astore_1        
			if(true) goto _L4; else goto _L3
		//   51  103:goto            31
_L3:
		}

		private IBinder zzrk;

		zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrk = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrk>
		//    5    9:return          
		}
	}


	public static zzh zzeq(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzh))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzh>
	//*  12   23:ifeq            31
			return (zzh)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzh>
	//   15   30:areturn         
		else
			return ((zzh) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzh$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zzh$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    14: default 124
	//	               1: 135
	//	               2: 151
	//	               3: 167
	//	               4: 189
	//	               5: 209
	//	               6: 233
	//	               7: 267
	//	               8: 302
	//	               9: 344
	//	               10: 366
	//	               11: 400
	//	               12: 435
	//	               13: 455
	//	               1598968902: 127
	//*   2  124:goto            479
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//    3  127:aload_3         
	//    4  128:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//    5  130:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6  133:iconst_1        
	//    7  134:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//    8  135:aload_2         
	//    9  136:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//   10  138:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			remove();
	//   11  141:aload_0         
	//   12  142:invokevirtual   #41  <Method void remove()>
			parcel1.writeNoException();
	//   13  145:aload_3         
	//   14  146:invokevirtual   #44  <Method void Parcel.writeNoException()>
			return true;
	//   15  149:iconst_1        
	//   16  150:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//   17  151:aload_2         
	//   18  152:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//   19  154:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			clearTileCache();
	//   20  157:aload_0         
	//   21  158:invokevirtual   #47  <Method void clearTileCache()>
			parcel1.writeNoException();
	//   22  161:aload_3         
	//   23  162:invokevirtual   #44  <Method void Parcel.writeNoException()>
			return true;
	//   24  165:iconst_1        
	//   25  166:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//   26  167:aload_2         
	//   27  168:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//   28  170:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getId()));
	//   29  173:aload_0         
	//   30  174:invokevirtual   #51  <Method String getId()>
	//   31  177:astore_2        
			parcel1.writeNoException();
	//   32  178:aload_3         
	//   33  179:invokevirtual   #44  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   34  182:aload_3         
	//   35  183:aload_2         
	//   36  184:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//   37  187:iconst_1        
	//   38  188:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//   39  189:aload_2         
	//   40  190:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//   41  192:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			setZIndex(parcel.readFloat());
	//   42  195:aload_0         
	//   43  196:aload_2         
	//   44  197:invokevirtual   #55  <Method float Parcel.readFloat()>
	//   45  200:invokevirtual   #59  <Method void setZIndex(float)>
			parcel1.writeNoException();
	//   46  203:aload_3         
	//   47  204:invokevirtual   #44  <Method void Parcel.writeNoException()>
			return true;
	//   48  207:iconst_1        
	//   49  208:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//   50  209:aload_2         
	//   51  210:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//   52  212:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			float f = getZIndex();
	//   53  215:aload_0         
	//   54  216:invokevirtual   #62  <Method float getZIndex()>
	//   55  219:fstore          5
			parcel1.writeNoException();
	//   56  221:aload_3         
	//   57  222:invokevirtual   #44  <Method void Parcel.writeNoException()>
			parcel1.writeFloat(f);
	//   58  225:aload_3         
	//   59  226:fload           5
	//   60  228:invokevirtual   #65  <Method void Parcel.writeFloat(float)>
			return true;
	//   61  231:iconst_1        
	//   62  232:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//   63  233:aload_2         
	//   64  234:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//   65  236:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag;
			if(parcel.readInt() != 0)
	//*  66  239:aload_2         
	//*  67  240:invokevirtual   #69  <Method int Parcel.readInt()>
	//*  68  243:ifeq            252
				flag = true;
	//   69  246:iconst_1        
	//   70  247:istore          6
			else
	//*  71  249:goto            255
				flag = false;
	//   72  252:iconst_0        
	//   73  253:istore          6
			setVisible(flag);
	//   74  255:aload_0         
	//   75  256:iload           6
	//   76  258:invokevirtual   #73  <Method void setVisible(boolean)>
			parcel1.writeNoException();
	//   77  261:aload_3         
	//   78  262:invokevirtual   #44  <Method void Parcel.writeNoException()>
			return true;
	//   79  265:iconst_1        
	//   80  266:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//   81  267:aload_2         
	//   82  268:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//   83  270:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag1 = isVisible();
	//   84  273:aload_0         
	//   85  274:invokevirtual   #77  <Method boolean isVisible()>
	//   86  277:istore          6
			parcel1.writeNoException();
	//   87  279:aload_3         
	//   88  280:invokevirtual   #44  <Method void Parcel.writeNoException()>
			if(flag1)
	//*  89  283:iload           6
	//*  90  285:ifeq            293
				i = 1;
	//   91  288:iconst_1        
	//   92  289:istore_1        
			else
	//*  93  290:goto            295
				i = 0;
	//   94  293:iconst_0        
	//   95  294:istore_1        
			parcel1.writeInt(i);
	//   96  295:aload_3         
	//   97  296:iload_1         
	//   98  297:invokevirtual   #81  <Method void Parcel.writeInt(int)>
			return true;
	//   99  300:iconst_1        
	//  100  301:ireturn         

		case 8: // '\b'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//  101  302:aload_2         
	//  102  303:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//  103  305:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag2 = zza(zzeq(parcel.readStrongBinder()));
	//  104  308:aload_0         
	//  105  309:aload_2         
	//  106  310:invokevirtual   #85  <Method IBinder Parcel.readStrongBinder()>
	//  107  313:invokestatic    #87  <Method zzh zzeq(IBinder)>
	//  108  316:invokevirtual   #90  <Method boolean zza(zzh)>
	//  109  319:istore          6
			parcel1.writeNoException();
	//  110  321:aload_3         
	//  111  322:invokevirtual   #44  <Method void Parcel.writeNoException()>
			if(flag2)
	//* 112  325:iload           6
	//* 113  327:ifeq            335
				i = 1;
	//  114  330:iconst_1        
	//  115  331:istore_1        
			else
	//* 116  332:goto            337
				i = 0;
	//  117  335:iconst_0        
	//  118  336:istore_1        
			parcel1.writeInt(i);
	//  119  337:aload_3         
	//  120  338:iload_1         
	//  121  339:invokevirtual   #81  <Method void Parcel.writeInt(int)>
			return true;
	//  122  342:iconst_1        
	//  123  343:ireturn         

		case 9: // '\t'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//  124  344:aload_2         
	//  125  345:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//  126  347:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			i = hashCodeRemote();
	//  127  350:aload_0         
	//  128  351:invokevirtual   #93  <Method int hashCodeRemote()>
	//  129  354:istore_1        
			parcel1.writeNoException();
	//  130  355:aload_3         
	//  131  356:invokevirtual   #44  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//  132  359:aload_3         
	//  133  360:iload_1         
	//  134  361:invokevirtual   #81  <Method void Parcel.writeInt(int)>
			return true;
	//  135  364:iconst_1        
	//  136  365:ireturn         

		case 10: // '\n'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//  137  366:aload_2         
	//  138  367:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//  139  369:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag3;
			if(parcel.readInt() != 0)
	//* 140  372:aload_2         
	//* 141  373:invokevirtual   #69  <Method int Parcel.readInt()>
	//* 142  376:ifeq            385
				flag3 = true;
	//  143  379:iconst_1        
	//  144  380:istore          6
			else
	//* 145  382:goto            388
				flag3 = false;
	//  146  385:iconst_0        
	//  147  386:istore          6
			setFadeIn(flag3);
	//  148  388:aload_0         
	//  149  389:iload           6
	//  150  391:invokevirtual   #96  <Method void setFadeIn(boolean)>
			parcel1.writeNoException();
	//  151  394:aload_3         
	//  152  395:invokevirtual   #44  <Method void Parcel.writeNoException()>
			return true;
	//  153  398:iconst_1        
	//  154  399:ireturn         

		case 11: // '\013'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//  155  400:aload_2         
	//  156  401:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//  157  403:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			boolean flag4 = getFadeIn();
	//  158  406:aload_0         
	//  159  407:invokevirtual   #99  <Method boolean getFadeIn()>
	//  160  410:istore          6
			parcel1.writeNoException();
	//  161  412:aload_3         
	//  162  413:invokevirtual   #44  <Method void Parcel.writeNoException()>
			if(flag4)
	//* 163  416:iload           6
	//* 164  418:ifeq            426
				i = 1;
	//  165  421:iconst_1        
	//  166  422:istore_1        
			else
	//* 167  423:goto            428
				i = 0;
	//  168  426:iconst_0        
	//  169  427:istore_1        
			parcel1.writeInt(i);
	//  170  428:aload_3         
	//  171  429:iload_1         
	//  172  430:invokevirtual   #81  <Method void Parcel.writeInt(int)>
			return true;
	//  173  433:iconst_1        
	//  174  434:ireturn         

		case 12: // '\f'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//  175  435:aload_2         
	//  176  436:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//  177  438:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			setTransparency(parcel.readFloat());
	//  178  441:aload_0         
	//  179  442:aload_2         
	//  180  443:invokevirtual   #55  <Method float Parcel.readFloat()>
	//  181  446:invokevirtual   #102 <Method void setTransparency(float)>
			parcel1.writeNoException();
	//  182  449:aload_3         
	//  183  450:invokevirtual   #44  <Method void Parcel.writeNoException()>
			return true;
	//  184  453:iconst_1        
	//  185  454:ireturn         

		case 13: // '\r'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
	//  186  455:aload_2         
	//  187  456:ldc1            #13  <String "com.google.android.gms.maps.model.internal.ITileOverlayDelegate">
	//  188  458:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			float f1 = getTransparency();
	//  189  461:aload_0         
	//  190  462:invokevirtual   #105 <Method float getTransparency()>
	//  191  465:fstore          5
			parcel1.writeNoException();
	//  192  467:aload_3         
	//  193  468:invokevirtual   #44  <Method void Parcel.writeNoException()>
			parcel1.writeFloat(f1);
	//  194  471:aload_3         
	//  195  472:fload           5
	//  196  474:invokevirtual   #65  <Method void Parcel.writeFloat(float)>
			return true;
	//  197  477:iconst_1        
	//  198  478:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//  199  479:aload_0         
	//  200  480:iload_1         
	//  201  481:aload_2         
	//  202  482:aload_3         
	//  203  483:iload           4
	//  204  485:invokespecial   #107 <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//  205  488:ireturn         
	}
}

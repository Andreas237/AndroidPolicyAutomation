// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zzg

static class zzg$zza$zza
	implements zzg
{

	public IBinder asBinder()
	{
		return zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zzrk>
	//    2    4:areturn         
	}

	public int getFillColor()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(12, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          12
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public List getHoles()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(6, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          6
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		arraylist = parcel1.readArrayList(((Object)this).getClass().getClassLoader());
	//   17   33:aload_2         
	//   18   34:aload_0         
	//   19   35:invokevirtual   #59  <Method Class Object.getClass()>
	//   20   38:invokevirtual   #65  <Method ClassLoader Class.getClassLoader()>
	//   21   41:invokevirtual   #69  <Method java.util.ArrayList Parcel.readArrayList(ClassLoader)>
	//   22   44:astore_3        
		parcel1.recycle();
	//   23   45:aload_2         
	//   24   46:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #52  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   27   53:aload_3         
	//   28   54:areturn         
		Exception exception;
		exception;
	//   29   55:astore_3        
		parcel1.recycle();
	//   30   56:aload_2         
	//   31   57:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_1         
	//   33   61:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   34   64:aload_3         
	//   35   65:athrow          
	}

	public String getId()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		String s;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(2, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_2        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #74  <Method String Parcel.readString()>
	//   19   36:astore_3        
		parcel1.recycle();
	//   20   37:aload_2         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return s;
	//   24   45:aload_3         
	//   25   46:areturn         
		Exception exception;
		exception;
	//   26   47:astore_3        
		parcel1.recycle();
	//   27   48:aload_2         
	//   28   49:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   52:aload_1         
	//   30   53:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   56:aload_3         
	//   32   57:athrow          
	}

	public List getPoints()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(4, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_4        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(LatLng.CREATOR);
	//   17   32:aload_2         
	//   18   33:getstatic       #81  <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//   19   36:invokevirtual   #85  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   20   39:astore_3        
		parcel1.recycle();
	//   21   40:aload_2         
	//   22   41:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #52  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   25   48:aload_3         
	//   26   49:areturn         
		Exception exception;
		exception;
	//   27   50:astore_3        
		parcel1.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   32   59:aload_3         
	//   33   60:athrow          
	}

	public int getStrokeColor()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(10, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          10
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getStrokeJointType()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(24, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          24
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public List getStrokePattern()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(26, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          26
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(PatternItem.CREATOR);
	//   17   33:aload_2         
	//   18   34:getstatic       #93  <Field android.os.Parcelable$Creator PatternItem.CREATOR>
	//   19   37:invokevirtual   #85  <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   20   40:astore_3        
		parcel1.recycle();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #52  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   25   49:aload_3         
	//   26   50:areturn         
		Exception exception;
		exception;
	//   27   51:astore_3        
		parcel1.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   32   60:aload_3         
	//   33   61:athrow          
	}

	public float getStrokeWidth()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		float f;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(8, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          8
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		f = parcel1.readFloat();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #99  <Method float Parcel.readFloat()>
	//   19   37:fstore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return f;
	//   24   46:fload_1         
	//   25   47:freturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public IObjectWrapper getTag()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		IObjectWrapper iobjectwrapper;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(28, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          28
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		iobjectwrapper = com.google.android.gms.dynamic.er.zza.zzcd(parcel1.readStrongBinder());
	//   17   33:aload_2         
	//   18   34:invokevirtual   #104 <Method IBinder Parcel.readStrongBinder()>
	//   19   37:invokestatic    #110 <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$zza.zzcd(IBinder)>
	//   20   40:astore_3        
		parcel1.recycle();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #52  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   25   49:aload_3         
	//   26   50:areturn         
		Exception exception;
		exception;
	//   27   51:astore_3        
		parcel1.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   32   60:aload_3         
	//   33   61:athrow          
	}

	public float getZIndex()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		float f;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(14, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          14
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		f = parcel1.readFloat();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #99  <Method float Parcel.readFloat()>
	//   19   37:fstore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return f;
	//   24   46:fload_1         
	//   25   47:freturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(20, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:bipush          20
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #49  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public boolean isClickable()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(22, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          22
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #49  <Method int Parcel.readInt()>
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
	//   28   55:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #52  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isGeodesic()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(18, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          18
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #49  <Method int Parcel.readInt()>
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
	//   28   55:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #52  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   38   75:aload           5
	//   39   77:athrow          
	}

	public boolean isVisible()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		int i;
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(16, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field IBinder zzrk>
	//    9   19:bipush          16
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   36:aload           4
	//   18   38:invokevirtual   #49  <Method int Parcel.readInt()>
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
	//   28   55:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   58:aload_3         
	//   30   59:invokevirtual   #52  <Method void Parcel.recycle()>
		return flag;
	//   31   62:iload_2         
	//   32   63:ireturn         
		Exception exception;
		exception;
	//   33   64:astore          5
		parcel1.recycle();
	//   34   66:aload           4
	//   35   68:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   71:aload_3         
	//   37   72:invokevirtual   #52  <Method void Parcel.recycle()>
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
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		zzrk.transact(1, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #18  <Field IBinder zzrk>
	//    9   18:iconst_1        
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   27:pop             
		parcel1.readException();
	//   15   28:aload_2         
	//   16   29:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   21   40:return          
		Exception exception;
		exception;
	//   22   41:astore_3        
		parcel1.recycle();
	//   23   42:aload_2         
	//   24   43:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   46:aload_1         
	//   26   47:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   27   50:aload_3         
	//   28   51:athrow          
	}

	public void setClickable(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
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
	//*  14   26:invokevirtual   #123 <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:bipush          21
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  27   55:aload_3         
	//*  28   56:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  29   59:return          
	//*  30   60:astore          5
	//*  31   62:aload           4
	//*  32   64:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  33   67:aload_3         
	//*  34   68:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  35   71:aload           5
	//*  36   73:athrow          
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore_2        
		parcel.writeInt(i);
		zzrk.transact(21, parcel, parcel1, 0);
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

	public void setFillColor(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #123 <Method void Parcel.writeInt(int)>
		zzrk.transact(11, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          11
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setGeodesic(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
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
	//*  14   26:invokevirtual   #123 <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:bipush          17
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  27   55:aload_3         
	//*  28   56:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  29   59:return          
	//*  30   60:astore          5
	//*  31   62:aload           4
	//*  32   64:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  33   67:aload_3         
	//*  34   68:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  35   71:aload           5
	//*  36   73:athrow          
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore_2        
		parcel.writeInt(i);
		zzrk.transact(17, parcel, parcel1, 0);
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

	public void setHoles(List list)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeList(list);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #130 <Method void Parcel.writeList(List)>
		zzrk.transact(5, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_5        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		list;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #52  <Method void Parcel.recycle()>
		throw list;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public void setPoints(List list)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeTypedList(list);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #134 <Method void Parcel.writeTypedList(List)>
		zzrk.transact(3, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:iconst_3        
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   32:pop             
		parcel1.readException();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   37:aload_3         
	//   21   38:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   41:aload_2         
	//   23   42:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   45:return          
		list;
	//   25   46:astore_1        
		parcel1.recycle();
	//   26   47:aload_3         
	//   27   48:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   51:aload_2         
	//   29   52:invokevirtual   #52  <Method void Parcel.recycle()>
		throw list;
	//   30   55:aload_1         
	//   31   56:athrow          
	}

	public void setStrokeColor(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #123 <Method void Parcel.writeInt(int)>
		zzrk.transact(9, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          9
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setStrokeJointType(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #123 <Method void Parcel.writeInt(int)>
		zzrk.transact(23, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          23
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setStrokePattern(List list)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeTypedList(list);
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #134 <Method void Parcel.writeTypedList(List)>
		zzrk.transact(25, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          25
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		list;
	//   25   47:astore_1        
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #52  <Method void Parcel.recycle()>
		throw list;
	//   30   56:aload_1         
	//   31   57:athrow          
	}

	public void setStrokeWidth(float f)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #144 <Method void Parcel.writeFloat(float)>
		zzrk.transact(7, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          7
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setTag(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(iobjectwrapper == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          72
_L1:
		iobjectwrapper = ((IObjectWrapper) (iobjectwrapper.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #150 <Method IBinder IObjectWrapper.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (iobjectwrapper)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #153 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(27, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #18  <Field IBinder zzrk>
	//   18   37:bipush          27
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:iconst_0        
	//   22   42:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   47:pop             
		parcel1.readException();
	//   24   48:aload_3         
	//   25   49:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   56:aload_2         
	//   29   57:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   30   60:return          
		iobjectwrapper;
	//   31   61:astore_1        
		parcel1.recycle();
	//   32   62:aload_3         
	//   33   63:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_2         
	//   35   67:invokevirtual   #52  <Method void Parcel.recycle()>
		throw iobjectwrapper;
	//   36   70:aload_1         
	//   37   71:athrow          
_L2:
		iobjectwrapper = null;
	//   38   72:aconst_null     
	//   39   73:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   74:goto            28
_L3:
	}

	public void setVisible(boolean flag)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
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
	//*  14   26:invokevirtual   #123 <Method void Parcel.writeInt(int)>
	//*  15   29:aload_0         
	//*  16   30:getfield        #18  <Field IBinder zzrk>
	//*  17   33:bipush          15
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:iconst_0        
	//*  21   39:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  22   44:pop             
	//*  23   45:aload           4
	//*  24   47:invokevirtual   #46  <Method void Parcel.readException()>
	//*  25   50:aload           4
	//*  26   52:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  27   55:aload_3         
	//*  28   56:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  29   59:return          
	//*  30   60:astore          5
	//*  31   62:aload           4
	//*  32   64:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  33   67:aload_3         
	//*  34   68:invokevirtual   #52  <Method void Parcel.recycle()>
	//*  35   71:aload           5
	//*  36   73:athrow          
			i = 0;
	//   37   74:iconst_0        
	//   38   75:istore_2        
		parcel.writeInt(i);
		zzrk.transact(15, parcel, parcel1, 0);
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
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   11:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeFloat(f);
	//    7   14:aload_2         
	//    8   15:fload_1         
	//    9   16:invokevirtual   #144 <Method void Parcel.writeFloat(float)>
		zzrk.transact(13, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #18  <Field IBinder zzrk>
	//   12   23:bipush          13
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #46  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #52  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #52  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public boolean zzb(zzg zzg1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
	//    4   10:aload           4
	//    5   12:ldc1            #33  <String "com.google.android.gms.maps.model.internal.IPolygonDelegate">
	//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(zzg1 == null) goto _L2; else goto _L1
	//    7   17:aload_1         
	//    8   18:ifnull          101
_L1:
		zzg1 = ((zzg) (zzg1.asBinder()));
	//    9   21:aload_1         
	//   10   22:invokeinterface #158 <Method IBinder zzg.asBinder()>
	//   11   27:astore_1        
	//*  12   28:goto            31
_L4:
		int i;
		parcel.writeStrongBinder(((IBinder) (zzg1)));
	//   13   31:aload           4
	//   14   33:aload_1         
	//   15   34:invokevirtual   #153 <Method void Parcel.writeStrongBinder(IBinder)>
		zzrk.transact(19, parcel, parcel1, 0);
	//   16   37:aload_0         
	//   17   38:getfield        #18  <Field IBinder zzrk>
	//   18   41:bipush          19
	//   19   43:aload           4
	//   20   45:aload           5
	//   21   47:iconst_0        
	//   22   48:invokeinterface #43  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   53:pop             
		parcel1.readException();
	//   24   54:aload           5
	//   25   56:invokevirtual   #46  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   26   59:aload           5
	//   27   61:invokevirtual   #49  <Method int Parcel.readInt()>
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
	//   37   78:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   81:aload           4
	//   39   83:invokevirtual   #52  <Method void Parcel.recycle()>
		return flag;
	//   40   86:iload_3         
	//   41   87:ireturn         
		zzg1;
	//   42   88:astore_1        
		parcel1.recycle();
	//   43   89:aload           5
	//   44   91:invokevirtual   #52  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   94:aload           4
	//   46   96:invokevirtual   #52  <Method void Parcel.recycle()>
		throw zzg1;
	//   47   99:aload_1         
	//   48  100:athrow          
_L2:
		zzg1 = null;
	//   49  101:aconst_null     
	//   50  102:astore_1        
		if(true) goto _L4; else goto _L3
	//   51  103:goto            31
_L3:
	}

	private IBinder zzrk;

	zzg$zza$zza(IBinder ibinder)
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

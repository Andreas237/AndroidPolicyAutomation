// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.os.*;

// Referenced classes of package android.support.v7:
//			bu

private static class bu$a$a
	implements bu
{

	public int a(int i, String s, String s1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
	//    4   10:aload           4
	//    5   12:ldc1            #29  <String "com.android.vending.billing.IInAppBillingService">
	//    6   14:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   23:aload           4
	//   11   25:aload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   13   29:aload           4
	//   14   31:aload_3         
	//   15   32:invokevirtual   #40  <Method void Parcel.writeString(String)>
		a.transact(1, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #17  <Field IBinder a>
	//   18   39:iconst_1        
	//   19   40:aload           4
	//   20   42:aload           5
	//   21   44:iconst_0        
	//   22   45:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   50:pop             
		parcel1.readException();
	//   24   51:aload           5
	//   25   53:invokevirtual   #49  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   26   56:aload           5
	//   27   58:invokevirtual   #53  <Method int Parcel.readInt()>
	//   28   61:istore_1        
		parcel1.recycle();
	//   29   62:aload           5
	//   30   64:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   67:aload           4
	//   32   69:invokevirtual   #56  <Method void Parcel.recycle()>
		return i;
	//   33   72:iload_1         
	//   34   73:ireturn         
		s;
	//   35   74:astore_2        
		parcel1.recycle();
	//   36   75:aload           5
	//   37   77:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   80:aload           4
	//   39   82:invokevirtual   #56  <Method void Parcel.recycle()>
		throw s;
	//   40   85:aload_2         
	//   41   86:athrow          
	}

	public Bundle a(int i, String s, String s1, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    3    8:astore          6
		parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
	//    4   10:aload           5
	//    5   12:ldc1            #29  <String "com.android.vending.billing.IInAppBillingService">
	//    6   14:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           5
	//    8   19:iload_1         
	//    9   20:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   23:aload           5
	//   11   25:aload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   13   29:aload           5
	//   14   31:aload_3         
	//   15   32:invokevirtual   #40  <Method void Parcel.writeString(String)>
		if(bundle == null) goto _L2; else goto _L1
	//   16   35:aload           4
	//   17   37:ifnull          109
_L1:
		parcel.writeInt(1);
	//   18   40:aload           5
	//   19   42:iconst_1        
	//   20   43:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   21   46:aload           4
	//   22   48:aload           5
	//   23   50:iconst_0        
	//   24   51:invokevirtual   #64  <Method void Bundle.writeToParcel(Parcel, int)>
_L3:
		a.transact(2, parcel, parcel1, 0);
	//   25   54:aload_0         
	//   26   55:getfield        #17  <Field IBinder a>
	//   27   58:iconst_2        
	//   28   59:aload           5
	//   29   61:aload           6
	//   30   63:iconst_0        
	//   31   64:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   69:pop             
		parcel1.readException();
	//   33   70:aload           6
	//   34   72:invokevirtual   #49  <Method void Parcel.readException()>
		if(parcel1.readInt() == 0)
			break MISSING_BLOCK_LABEL_131;
	//   35   75:aload           6
	//   36   77:invokevirtual   #53  <Method int Parcel.readInt()>
	//   37   80:ifeq            131
		s = ((String) ((Bundle)Bundle.CREATOR.createFromParcel(parcel1)));
	//   38   83:getstatic       #68  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   39   86:aload           6
	//   40   88:invokeinterface #74  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   41   93:checkcast       #60  <Class Bundle>
	//   42   96:astore_2        
_L4:
		parcel1.recycle();
	//   43   97:aload           6
	//   44   99:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45  102:aload           5
	//   46  104:invokevirtual   #56  <Method void Parcel.recycle()>
		return ((Bundle) (s));
	//   47  107:aload_2         
	//   48  108:areturn         
_L2:
		parcel.writeInt(0);
	//   49  109:aload           5
	//   50  111:iconst_0        
	//   51  112:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  52  115:goto            54
		s;
	//   53  118:astore_2        
		parcel1.recycle();
	//   54  119:aload           6
	//   55  121:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   56  124:aload           5
	//   57  126:invokevirtual   #56  <Method void Parcel.recycle()>
		throw s;
	//   58  129:aload_2         
	//   59  130:athrow          
		s = null;
	//   60  131:aconst_null     
	//   61  132:astore_2        
		  goto _L4
	//*  62  133:goto            97
	}

	public Bundle a(int i, String s, String s1, String s2)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    1    3:astore          5
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    3    8:astore          6
		parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
	//    4   10:aload           5
	//    5   12:ldc1            #29  <String "com.android.vending.billing.IInAppBillingService">
	//    6   14:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           5
	//    8   19:iload_1         
	//    9   20:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   23:aload           5
	//   11   25:aload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   13   29:aload           5
	//   14   31:aload_3         
	//   15   32:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s2);
	//   16   35:aload           5
	//   17   37:aload           4
	//   18   39:invokevirtual   #40  <Method void Parcel.writeString(String)>
		a.transact(4, parcel, parcel1, 0);
	//   19   42:aload_0         
	//   20   43:getfield        #17  <Field IBinder a>
	//   21   46:iconst_4        
	//   22   47:aload           5
	//   23   49:aload           6
	//   24   51:iconst_0        
	//   25   52:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   57:pop             
		parcel1.readException();
	//   27   58:aload           6
	//   28   60:invokevirtual   #49  <Method void Parcel.readException()>
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   29   63:aload           6
	//   30   65:invokevirtual   #53  <Method int Parcel.readInt()>
	//   31   68:ifeq            97
_L1:
		s = ((String) ((Bundle)Bundle.CREATOR.createFromParcel(parcel1)));
	//   32   71:getstatic       #68  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   33   74:aload           6
	//   34   76:invokeinterface #74  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   35   81:checkcast       #60  <Class Bundle>
	//   36   84:astore_2        
_L4:
		parcel1.recycle();
	//   37   85:aload           6
	//   38   87:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   39   90:aload           5
	//   40   92:invokevirtual   #56  <Method void Parcel.recycle()>
		return ((Bundle) (s));
	//   41   95:aload_2         
	//   42   96:areturn         
_L2:
		s = null;
	//   43   97:aconst_null     
	//   44   98:astore_2        
		if(true) goto _L4; else goto _L3
	//   45   99:goto            85
_L3:
		s;
	//   46  102:astore_2        
		parcel1.recycle();
	//   47  103:aload           6
	//   48  105:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49  108:aload           5
	//   50  110:invokevirtual   #56  <Method void Parcel.recycle()>
		throw s;
	//   51  113:aload_2         
	//   52  114:athrow          
	}

	public Bundle a(int i, String s, String s1, String s2, String s3)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    1    3:astore          6
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    3    8:astore          7
		parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
	//    4   10:aload           6
	//    5   12:ldc1            #29  <String "com.android.vending.billing.IInAppBillingService">
	//    6   14:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           6
	//    8   19:iload_1         
	//    9   20:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   23:aload           6
	//   11   25:aload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   13   29:aload           6
	//   14   31:aload_3         
	//   15   32:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s2);
	//   16   35:aload           6
	//   17   37:aload           4
	//   18   39:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s3);
	//   19   42:aload           6
	//   20   44:aload           5
	//   21   46:invokevirtual   #40  <Method void Parcel.writeString(String)>
		a.transact(3, parcel, parcel1, 0);
	//   22   49:aload_0         
	//   23   50:getfield        #17  <Field IBinder a>
	//   24   53:iconst_3        
	//   25   54:aload           6
	//   26   56:aload           7
	//   27   58:iconst_0        
	//   28   59:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   29   64:pop             
		parcel1.readException();
	//   30   65:aload           7
	//   31   67:invokevirtual   #49  <Method void Parcel.readException()>
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   32   70:aload           7
	//   33   72:invokevirtual   #53  <Method int Parcel.readInt()>
	//   34   75:ifeq            104
_L1:
		s = ((String) ((Bundle)Bundle.CREATOR.createFromParcel(parcel1)));
	//   35   78:getstatic       #68  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   36   81:aload           7
	//   37   83:invokeinterface #74  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   38   88:checkcast       #60  <Class Bundle>
	//   39   91:astore_2        
_L4:
		parcel1.recycle();
	//   40   92:aload           7
	//   41   94:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   97:aload           6
	//   43   99:invokevirtual   #56  <Method void Parcel.recycle()>
		return ((Bundle) (s));
	//   44  102:aload_2         
	//   45  103:areturn         
_L2:
		s = null;
	//   46  104:aconst_null     
	//   47  105:astore_2        
		if(true) goto _L4; else goto _L3
	//   48  106:goto            92
_L3:
		s;
	//   49  109:astore_2        
		parcel1.recycle();
	//   50  110:aload           7
	//   51  112:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   52  115:aload           6
	//   53  117:invokevirtual   #56  <Method void Parcel.recycle()>
		throw s;
	//   54  120:aload_2         
	//   55  121:athrow          
	}

	public IBinder asBinder()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field IBinder a>
	//    2    4:areturn         
	}

	public int b(int i, String s, String s1)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #27  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
	//    4   10:aload           4
	//    5   12:ldc1            #29  <String "com.android.vending.billing.IInAppBillingService">
	//    6   14:invokevirtual   #33  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #37  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   10   23:aload           4
	//   11   25:aload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//   13   29:aload           4
	//   14   31:aload_3         
	//   15   32:invokevirtual   #40  <Method void Parcel.writeString(String)>
		a.transact(5, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #17  <Field IBinder a>
	//   18   39:iconst_5        
	//   19   40:aload           4
	//   20   42:aload           5
	//   21   44:iconst_0        
	//   22   45:invokeinterface #46  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   50:pop             
		parcel1.readException();
	//   24   51:aload           5
	//   25   53:invokevirtual   #49  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   26   56:aload           5
	//   27   58:invokevirtual   #53  <Method int Parcel.readInt()>
	//   28   61:istore_1        
		parcel1.recycle();
	//   29   62:aload           5
	//   30   64:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   67:aload           4
	//   32   69:invokevirtual   #56  <Method void Parcel.recycle()>
		return i;
	//   33   72:iload_1         
	//   34   73:ireturn         
		s;
	//   35   74:astore_2        
		parcel1.recycle();
	//   36   75:aload           5
	//   37   77:invokevirtual   #56  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   80:aload           4
	//   39   82:invokevirtual   #56  <Method void Parcel.recycle()>
		throw s;
	//   40   85:aload_2         
	//   41   86:athrow          
	}

	private IBinder a;

	bu$a$a(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field IBinder a>
	//    5    9:return          
	}
}

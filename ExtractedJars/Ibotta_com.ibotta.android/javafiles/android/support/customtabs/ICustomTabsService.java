// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.*;
import java.util.List;

// Referenced classes of package android.support.customtabs:
//			ICustomTabsCallback

public interface ICustomTabsService
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements ICustomTabsService
	{

		public static ICustomTabsService asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "android.support.customtabs.ICustomTabsService">
		//    6    9:invokeinterface #20  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof ICustomTabsService))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class ICustomTabsService>
		//*  12   23:ifeq            31
				return (ICustomTabsService)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class ICustomTabsService>
		//   15   30:areturn         
			else
				return ((ICustomTabsService) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class ICustomTabsService$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #24  <Method void ICustomTabsService$Stub$Proxy(IBinder)>
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
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #33  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #35  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #40  <Method void Runtime(String)>
		//    4    9:athrow          
		}
	}

	private static class Stub.Proxy
		implements ICustomTabsService
	{

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public Bundle extraCommand(String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore_3        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    7:astore          4
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4    9:aload_3         
		//    5   10:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   12:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeString(s);
		//    7   15:aload_3         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #41  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_38;
		//   10   20:aload_2         
		//   11   21:ifnull          38
			parcel.writeInt(1);
		//   12   24:aload_3         
		//   13   25:iconst_1        
		//   14   26:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   15   29:aload_2         
		//   16   30:aload_3         
		//   17   31:iconst_0        
		//   18   32:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_43;
		//   19   35:goto            43
			parcel.writeInt(0);
		//   20   38:aload_3         
		//   21   39:iconst_0        
		//   22   40:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			mRemote.transact(5, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:iconst_5        
		//   26   48:aload_3         
		//   27   49:aload           4
		//   28   51:iconst_0        
		//   29   52:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   57:pop             
			parcel1.readException();
		//   31   58:aload           4
		//   32   60:invokevirtual   #60  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
		//*  33   63:aload           4
		//*  34   65:invokevirtual   #64  <Method int Parcel.readInt()>
		//*  35   68:ifeq            88
			{
				s = ((String) ((Bundle)Bundle.CREATOR.createFromParcel(parcel1)));
		//   36   71:getstatic       #68  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   37   74:aload           4
		//   38   76:invokeinterface #74  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   39   81:checkcast       #47  <Class Bundle>
		//   40   84:astore_1        
				break MISSING_BLOCK_LABEL_90;
		//   41   85:goto            90
			}
			s = null;
		//   42   88:aconst_null     
		//   43   89:astore_1        
			parcel1.recycle();
		//   44   90:aload           4
		//   45   92:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   95:aload_3         
		//   47   96:invokevirtual   #77  <Method void Parcel.recycle()>
			return ((Bundle) (s));
		//   48   99:aload_1         
		//   49  100:areturn         
			s;
		//   50  101:astore_1        
			parcel1.recycle();
		//   51  102:aload           4
		//   52  104:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   53  107:aload_3         
		//   54  108:invokevirtual   #77  <Method void Parcel.recycle()>
			throw s;
		//   55  111:aload_1         
		//   56  112:athrow          
		}

		public boolean mayLaunchUrl(ICustomTabsCallback icustomtabscallback, Uri uri, Bundle bundle, List list)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore          7
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    8:astore          8
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4   10:aload           7
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			if(icustomtabscallback == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          164
_L1:
			icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #84  <Method IBinder ICustomTabsCallback.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
		//   13   31:aload           7
		//   14   33:aload_1         
		//   15   34:invokevirtual   #87  <Method void Parcel.writeStrongBinder(IBinder)>
			boolean flag;
			flag = true;
		//   16   37:iconst_1        
		//   17   38:istore          6
			if(uri == null)
				break MISSING_BLOCK_LABEL_60;
		//   18   40:aload_2         
		//   19   41:ifnull          60
			parcel.writeInt(1);
		//   20   44:aload           7
		//   21   46:iconst_1        
		//   22   47:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   23   50:aload_2         
		//   24   51:aload           7
		//   25   53:iconst_0        
		//   26   54:invokevirtual   #90  <Method void Uri.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_66;
		//   27   57:goto            66
			parcel.writeInt(0);
		//   28   60:aload           7
		//   29   62:iconst_0        
		//   30   63:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_86;
		//   31   66:aload_3         
		//   32   67:ifnull          86
			parcel.writeInt(1);
		//   33   70:aload           7
		//   34   72:iconst_1        
		//   35   73:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   36   76:aload_3         
		//   37   77:aload           7
		//   38   79:iconst_0        
		//   39   80:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_92;
		//   40   83:goto            92
			parcel.writeInt(0);
		//   41   86:aload           7
		//   42   88:iconst_0        
		//   43   89:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			int i;
			parcel.writeTypedList(list);
		//   44   92:aload           7
		//   45   94:aload           4
		//   46   96:invokevirtual   #94  <Method void Parcel.writeTypedList(List)>
			mRemote.transact(4, parcel, parcel1, 0);
		//   47   99:aload_0         
		//   48  100:getfield        #19  <Field IBinder mRemote>
		//   49  103:iconst_4        
		//   50  104:aload           7
		//   51  106:aload           8
		//   52  108:iconst_0        
		//   53  109:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   54  114:pop             
			parcel1.readException();
		//   55  115:aload           8
		//   56  117:invokevirtual   #60  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   57  120:aload           8
		//   58  122:invokevirtual   #64  <Method int Parcel.readInt()>
		//   59  125:istore          5
			if(i == 0)
		//*  60  127:iload           5
		//*  61  129:ifeq            135
		//*  62  132:goto            138
				flag = false;
		//   63  135:iconst_0        
		//   64  136:istore          6
			parcel1.recycle();
		//   65  138:aload           8
		//   66  140:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   67  143:aload           7
		//   68  145:invokevirtual   #77  <Method void Parcel.recycle()>
			return flag;
		//   69  148:iload           6
		//   70  150:ireturn         
			icustomtabscallback;
		//   71  151:astore_1        
			parcel1.recycle();
		//   72  152:aload           8
		//   73  154:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   74  157:aload           7
		//   75  159:invokevirtual   #77  <Method void Parcel.recycle()>
			throw icustomtabscallback;
		//   76  162:aload_1         
		//   77  163:athrow          
_L2:
			icustomtabscallback = null;
		//   78  164:aconst_null     
		//   79  165:astore_1        
			if(true) goto _L4; else goto _L3
		//   80  166:goto            31
_L3:
		}

		public boolean newSession(ICustomTabsCallback icustomtabscallback)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore          4
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    8:astore          5
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4   10:aload           4
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			if(icustomtabscallback == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          99
_L1:
			icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #84  <Method IBinder ICustomTabsCallback.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
		//   13   31:aload           4
		//   14   33:aload_1         
		//   15   34:invokevirtual   #87  <Method void Parcel.writeStrongBinder(IBinder)>
			icustomtabscallback = ((ICustomTabsCallback) (mRemote));
		//   16   37:aload_0         
		//   17   38:getfield        #19  <Field IBinder mRemote>
		//   18   41:astore_1        
			boolean flag = false;
		//   19   42:iconst_0        
		//   20   43:istore_3        
			int i;
			((IBinder) (icustomtabscallback)).transact(3, parcel, parcel1, 0);
		//   21   44:aload_1         
		//   22   45:iconst_3        
		//   23   46:aload           4
		//   24   48:aload           5
		//   25   50:iconst_0        
		//   26   51:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   56:pop             
			parcel1.readException();
		//   28   57:aload           5
		//   29   59:invokevirtual   #60  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   30   62:aload           5
		//   31   64:invokevirtual   #64  <Method int Parcel.readInt()>
		//   32   67:istore_2        
			if(i != 0)
		//*  33   68:iload_2         
		//*  34   69:ifeq            74
				flag = true;
		//   35   72:iconst_1        
		//   36   73:istore_3        
			parcel1.recycle();
		//   37   74:aload           5
		//   38   76:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   79:aload           4
		//   40   81:invokevirtual   #77  <Method void Parcel.recycle()>
			return flag;
		//   41   84:iload_3         
		//   42   85:ireturn         
			icustomtabscallback;
		//   43   86:astore_1        
			parcel1.recycle();
		//   44   87:aload           5
		//   45   89:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46   92:aload           4
		//   47   94:invokevirtual   #77  <Method void Parcel.recycle()>
			throw icustomtabscallback;
		//   48   97:aload_1         
		//   49   98:athrow          
_L2:
			icustomtabscallback = null;
		//   50   99:aconst_null     
		//   51  100:astore_1        
			if(true) goto _L4; else goto _L3
		//   52  101:goto            31
_L3:
		}

		public int postMessage(ICustomTabsCallback icustomtabscallback, String s, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4   10:aload           5
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			if(icustomtabscallback == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          124
_L1:
			icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #84  <Method IBinder ICustomTabsCallback.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
		//   13   31:aload           5
		//   14   33:aload_1         
		//   15   34:invokevirtual   #87  <Method void Parcel.writeStrongBinder(IBinder)>
			parcel.writeString(s);
		//   16   37:aload           5
		//   17   39:aload_2         
		//   18   40:invokevirtual   #41  <Method void Parcel.writeString(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_63;
		//   19   43:aload_3         
		//   20   44:ifnull          63
			parcel.writeInt(1);
		//   21   47:aload           5
		//   22   49:iconst_1        
		//   23   50:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   24   53:aload_3         
		//   25   54:aload           5
		//   26   56:iconst_0        
		//   27   57:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_69;
		//   28   60:goto            69
			parcel.writeInt(0);
		//   29   63:aload           5
		//   30   65:iconst_0        
		//   31   66:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			int i;
			mRemote.transact(8, parcel, parcel1, 0);
		//   32   69:aload_0         
		//   33   70:getfield        #19  <Field IBinder mRemote>
		//   34   73:bipush          8
		//   35   75:aload           5
		//   36   77:aload           6
		//   37   79:iconst_0        
		//   38   80:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   39   85:pop             
			parcel1.readException();
		//   40   86:aload           6
		//   41   88:invokevirtual   #60  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   42   91:aload           6
		//   43   93:invokevirtual   #64  <Method int Parcel.readInt()>
		//   44   96:istore          4
			parcel1.recycle();
		//   45   98:aload           6
		//   46  100:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   47  103:aload           5
		//   48  105:invokevirtual   #77  <Method void Parcel.recycle()>
			return i;
		//   49  108:iload           4
		//   50  110:ireturn         
			icustomtabscallback;
		//   51  111:astore_1        
			parcel1.recycle();
		//   52  112:aload           6
		//   53  114:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   54  117:aload           5
		//   55  119:invokevirtual   #77  <Method void Parcel.recycle()>
			throw icustomtabscallback;
		//   56  122:aload_1         
		//   57  123:athrow          
_L2:
			icustomtabscallback = null;
		//   58  124:aconst_null     
		//   59  125:astore_1        
			if(true) goto _L4; else goto _L3
		//   60  126:goto            31
_L3:
		}

		public boolean requestPostMessageChannel(ICustomTabsCallback icustomtabscallback, Uri uri)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4   10:aload           5
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			if(icustomtabscallback == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          130
_L1:
			icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #84  <Method IBinder ICustomTabsCallback.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
		//   13   31:aload           5
		//   14   33:aload_1         
		//   15   34:invokevirtual   #87  <Method void Parcel.writeStrongBinder(IBinder)>
			boolean flag;
			flag = true;
		//   16   37:iconst_1        
		//   17   38:istore          4
			if(uri == null)
				break MISSING_BLOCK_LABEL_60;
		//   18   40:aload_2         
		//   19   41:ifnull          60
			parcel.writeInt(1);
		//   20   44:aload           5
		//   21   46:iconst_1        
		//   22   47:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   23   50:aload_2         
		//   24   51:aload           5
		//   25   53:iconst_0        
		//   26   54:invokevirtual   #90  <Method void Uri.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_66;
		//   27   57:goto            66
			parcel.writeInt(0);
		//   28   60:aload           5
		//   29   62:iconst_0        
		//   30   63:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			int i;
			mRemote.transact(7, parcel, parcel1, 0);
		//   31   66:aload_0         
		//   32   67:getfield        #19  <Field IBinder mRemote>
		//   33   70:bipush          7
		//   34   72:aload           5
		//   35   74:aload           6
		//   36   76:iconst_0        
		//   37   77:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   38   82:pop             
			parcel1.readException();
		//   39   83:aload           6
		//   40   85:invokevirtual   #60  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   41   88:aload           6
		//   42   90:invokevirtual   #64  <Method int Parcel.readInt()>
		//   43   93:istore_3        
			if(i == 0)
		//*  44   94:iload_3         
		//*  45   95:ifeq            101
		//*  46   98:goto            104
				flag = false;
		//   47  101:iconst_0        
		//   48  102:istore          4
			parcel1.recycle();
		//   49  104:aload           6
		//   50  106:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   51  109:aload           5
		//   52  111:invokevirtual   #77  <Method void Parcel.recycle()>
			return flag;
		//   53  114:iload           4
		//   54  116:ireturn         
			icustomtabscallback;
		//   55  117:astore_1        
			parcel1.recycle();
		//   56  118:aload           6
		//   57  120:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   58  123:aload           5
		//   59  125:invokevirtual   #77  <Method void Parcel.recycle()>
			throw icustomtabscallback;
		//   60  128:aload_1         
		//   61  129:athrow          
_L2:
			icustomtabscallback = null;
		//   62  130:aconst_null     
		//   63  131:astore_1        
			if(true) goto _L4; else goto _L3
		//   64  132:goto            31
_L3:
		}

		public boolean updateVisuals(ICustomTabsCallback icustomtabscallback, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4   10:aload           5
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			if(icustomtabscallback == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          130
_L1:
			icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #84  <Method IBinder ICustomTabsCallback.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
		//   13   31:aload           5
		//   14   33:aload_1         
		//   15   34:invokevirtual   #87  <Method void Parcel.writeStrongBinder(IBinder)>
			boolean flag;
			flag = true;
		//   16   37:iconst_1        
		//   17   38:istore          4
			if(bundle == null)
				break MISSING_BLOCK_LABEL_60;
		//   18   40:aload_2         
		//   19   41:ifnull          60
			parcel.writeInt(1);
		//   20   44:aload           5
		//   21   46:iconst_1        
		//   22   47:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   23   50:aload_2         
		//   24   51:aload           5
		//   25   53:iconst_0        
		//   26   54:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_66;
		//   27   57:goto            66
			parcel.writeInt(0);
		//   28   60:aload           5
		//   29   62:iconst_0        
		//   30   63:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			int i;
			mRemote.transact(6, parcel, parcel1, 0);
		//   31   66:aload_0         
		//   32   67:getfield        #19  <Field IBinder mRemote>
		//   33   70:bipush          6
		//   34   72:aload           5
		//   35   74:aload           6
		//   36   76:iconst_0        
		//   37   77:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   38   82:pop             
			parcel1.readException();
		//   39   83:aload           6
		//   40   85:invokevirtual   #60  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   41   88:aload           6
		//   42   90:invokevirtual   #64  <Method int Parcel.readInt()>
		//   43   93:istore_3        
			if(i == 0)
		//*  44   94:iload_3         
		//*  45   95:ifeq            101
		//*  46   98:goto            104
				flag = false;
		//   47  101:iconst_0        
		//   48  102:istore          4
			parcel1.recycle();
		//   49  104:aload           6
		//   50  106:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   51  109:aload           5
		//   52  111:invokevirtual   #77  <Method void Parcel.recycle()>
			return flag;
		//   53  114:iload           4
		//   54  116:ireturn         
			icustomtabscallback;
		//   55  117:astore_1        
			parcel1.recycle();
		//   56  118:aload           6
		//   57  120:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   58  123:aload           5
		//   59  125:invokevirtual   #77  <Method void Parcel.recycle()>
			throw icustomtabscallback;
		//   60  128:aload_1         
		//   61  129:athrow          
_L2:
			icustomtabscallback = null;
		//   62  130:aconst_null     
		//   63  131:astore_1        
			if(true) goto _L4; else goto _L3
		//   64  132:goto            31
_L3:
		}

		public boolean validateRelationship(ICustomTabsCallback icustomtabscallback, int i, Uri uri, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore          6
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    8:astore          7
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4   10:aload           6
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			if(icustomtabscallback == null) goto _L2; else goto _L1
		//    7   17:aload_1         
		//    8   18:ifnull          164
_L1:
			icustomtabscallback = ((ICustomTabsCallback) (icustomtabscallback.asBinder()));
		//    9   21:aload_1         
		//   10   22:invokeinterface #84  <Method IBinder ICustomTabsCallback.asBinder()>
		//   11   27:astore_1        
		//*  12   28:goto            31
_L4:
			parcel.writeStrongBinder(((IBinder) (icustomtabscallback)));
		//   13   31:aload           6
		//   14   33:aload_1         
		//   15   34:invokevirtual   #87  <Method void Parcel.writeStrongBinder(IBinder)>
			parcel.writeInt(i);
		//   16   37:aload           6
		//   17   39:iload_2         
		//   18   40:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			boolean flag;
			flag = true;
		//   19   43:iconst_1        
		//   20   44:istore          5
			if(uri == null)
				break MISSING_BLOCK_LABEL_66;
		//   21   46:aload_3         
		//   22   47:ifnull          66
			parcel.writeInt(1);
		//   23   50:aload           6
		//   24   52:iconst_1        
		//   25   53:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   26   56:aload_3         
		//   27   57:aload           6
		//   28   59:iconst_0        
		//   29   60:invokevirtual   #90  <Method void Uri.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_72;
		//   30   63:goto            72
			parcel.writeInt(0);
		//   31   66:aload           6
		//   32   68:iconst_0        
		//   33   69:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_94;
		//   34   72:aload           4
		//   35   74:ifnull          94
			parcel.writeInt(1);
		//   36   77:aload           6
		//   37   79:iconst_1        
		//   38   80:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   39   83:aload           4
		//   40   85:aload           6
		//   41   87:iconst_0        
		//   42   88:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_100;
		//   43   91:goto            100
			parcel.writeInt(0);
		//   44   94:aload           6
		//   45   96:iconst_0        
		//   46   97:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			mRemote.transact(9, parcel, parcel1, 0);
		//   47  100:aload_0         
		//   48  101:getfield        #19  <Field IBinder mRemote>
		//   49  104:bipush          9
		//   50  106:aload           6
		//   51  108:aload           7
		//   52  110:iconst_0        
		//   53  111:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   54  116:pop             
			parcel1.readException();
		//   55  117:aload           7
		//   56  119:invokevirtual   #60  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   57  122:aload           7
		//   58  124:invokevirtual   #64  <Method int Parcel.readInt()>
		//   59  127:istore_2        
			if(i == 0)
		//*  60  128:iload_2         
		//*  61  129:ifeq            135
		//*  62  132:goto            138
				flag = false;
		//   63  135:iconst_0        
		//   64  136:istore          5
			parcel1.recycle();
		//   65  138:aload           7
		//   66  140:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   67  143:aload           6
		//   68  145:invokevirtual   #77  <Method void Parcel.recycle()>
			return flag;
		//   69  148:iload           5
		//   70  150:ireturn         
			icustomtabscallback;
		//   71  151:astore_1        
			parcel1.recycle();
		//   72  152:aload           7
		//   73  154:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   74  157:aload           6
		//   75  159:invokevirtual   #77  <Method void Parcel.recycle()>
			throw icustomtabscallback;
		//   76  162:aload_1         
		//   77  163:athrow          
_L2:
			icustomtabscallback = null;
		//   78  164:aconst_null     
		//   79  165:astore_1        
			if(true) goto _L4; else goto _L3
		//   80  166:goto            31
_L3:
		}

		public boolean warmup(long l)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			IBinder ibinder;
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
		//    4   10:aload           5
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsService">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeLong(l);
		//    7   17:aload           5
		//    8   19:lload_1         
		//    9   20:invokevirtual   #112 <Method void Parcel.writeLong(long)>
			ibinder = mRemote;
		//   10   23:aload_0         
		//   11   24:getfield        #19  <Field IBinder mRemote>
		//   12   27:astore          7
			boolean flag = false;
		//   13   29:iconst_0        
		//   14   30:istore          4
			int i;
			ibinder.transact(2, parcel, parcel1, 0);
		//   15   32:aload           7
		//   16   34:iconst_2        
		//   17   35:aload           5
		//   18   37:aload           6
		//   19   39:iconst_0        
		//   20   40:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   21   45:pop             
			parcel1.readException();
		//   22   46:aload           6
		//   23   48:invokevirtual   #60  <Method void Parcel.readException()>
			i = parcel1.readInt();
		//   24   51:aload           6
		//   25   53:invokevirtual   #64  <Method int Parcel.readInt()>
		//   26   56:istore_3        
			if(i != 0)
		//*  27   57:iload_3         
		//*  28   58:ifeq            64
				flag = true;
		//   29   61:iconst_1        
		//   30   62:istore          4
			parcel1.recycle();
		//   31   64:aload           6
		//   32   66:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   33   69:aload           5
		//   34   71:invokevirtual   #77  <Method void Parcel.recycle()>
			return flag;
		//   35   74:iload           4
		//   36   76:ireturn         
			Exception exception;
			exception;
		//   37   77:astore          7
			parcel1.recycle();
		//   38   79:aload           6
		//   39   81:invokevirtual   #77  <Method void Parcel.recycle()>
			parcel.recycle();
		//   40   84:aload           5
		//   41   86:invokevirtual   #77  <Method void Parcel.recycle()>
			throw exception;
		//   42   89:aload           7
		//   43   91:athrow          
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


	public abstract Bundle extraCommand(String s, Bundle bundle)
		throws RemoteException;

	public abstract boolean mayLaunchUrl(ICustomTabsCallback icustomtabscallback, Uri uri, Bundle bundle, List list)
		throws RemoteException;

	public abstract boolean newSession(ICustomTabsCallback icustomtabscallback)
		throws RemoteException;

	public abstract int postMessage(ICustomTabsCallback icustomtabscallback, String s, Bundle bundle)
		throws RemoteException;

	public abstract boolean requestPostMessageChannel(ICustomTabsCallback icustomtabscallback, Uri uri)
		throws RemoteException;

	public abstract boolean updateVisuals(ICustomTabsCallback icustomtabscallback, Bundle bundle)
		throws RemoteException;

	public abstract boolean validateRelationship(ICustomTabsCallback icustomtabscallback, int i, Uri uri, Bundle bundle)
		throws RemoteException;

	public abstract boolean warmup(long l)
		throws RemoteException;
}

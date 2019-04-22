// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.*;

public interface ICustomTabsCallback
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements ICustomTabsCallback
	{

		public static ICustomTabsCallback asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
		//    4    6:aload_0         
		//    5    7:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//    6    9:invokeinterface #29  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof ICustomTabsCallback))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class ICustomTabsCallback>
		//*  12   23:ifeq            31
				return (ICustomTabsCallback)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class ICustomTabsCallback>
		//   15   30:areturn         
			else
				return ((ICustomTabsCallback) (new Proxy(ibinder)));
		//   16   31:new             #9   <Class ICustomTabsCallback$Stub$Proxy>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #32  <Method void ICustomTabsCallback$Stub$Proxy(IBinder)>
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
		//*   1    1:ldc1            #39  <Int 0x5f4e5446>
		//*   2    3:icmpeq          348
			{
				Object obj = null;
		//    3    6:aconst_null     
		//    4    7:astore          6
				Object obj2 = null;
		//    5    9:aconst_null     
		//    6   10:astore          9
				Object obj1 = null;
		//    7   12:aconst_null     
		//    8   13:astore          8
				Object obj3 = null;
		//    9   15:aconst_null     
		//   10   16:astore          10
				Bundle bundle = null;
		//   11   18:aconst_null     
		//   12   19:astore          7
				switch(i)
		//*  13   21:iload_1         
				{
		//*  14   22:tableswitch     2 6: default 56
		//		               2 299
		//		               3 248
		//		               4 205
		//		               5 158
		//		               6 66
				default:
					return super.onTransact(i, parcel, parcel1, j);
		//   15   56:aload_0         
		//   16   57:iload_1         
		//   17   58:aload_2         
		//   18   59:aload_3         
		//   19   60:iload           4
		//   20   62:invokespecial   #41  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   21   65:ireturn         

				case 6: // '\006'
					parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
		//   22   66:aload_2         
		//   23   67:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//   24   69:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
					i = parcel.readInt();
		//   25   72:aload_2         
		//   26   73:invokevirtual   #51  <Method int Parcel.readInt()>
		//   27   76:istore_1        
					if(parcel.readInt() != 0)
		//*  28   77:aload_2         
		//*  29   78:invokevirtual   #51  <Method int Parcel.readInt()>
		//*  30   81:ifeq            101
						obj = ((Object) ((Uri)Uri.CREATOR.createFromParcel(parcel)));
		//   31   84:getstatic       #57  <Field android.os.Parcelable$Creator Uri.CREATOR>
		//   32   87:aload_2         
		//   33   88:invokeinterface #63  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   34   93:checkcast       #53  <Class Uri>
		//   35   96:astore          6
					else
		//*  36   98:goto            104
						obj = null;
		//   37  101:aconst_null     
		//   38  102:astore          6
					boolean flag;
					if(parcel.readInt() != 0)
		//*  39  104:aload_2         
		//*  40  105:invokevirtual   #51  <Method int Parcel.readInt()>
		//*  41  108:ifeq            117
						flag = true;
		//   42  111:iconst_1        
		//   43  112:istore          5
					else
		//*  44  114:goto            120
						flag = false;
		//   45  117:iconst_0        
		//   46  118:istore          5
					if(parcel.readInt() != 0)
		//*  47  120:aload_2         
		//*  48  121:invokevirtual   #51  <Method int Parcel.readInt()>
		//*  49  124:ifeq            141
						bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
		//   50  127:getstatic       #66  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   51  130:aload_2         
		//   52  131:invokeinterface #63  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   53  136:checkcast       #65  <Class Bundle>
		//   54  139:astore          7
					onRelationshipValidationResult(i, ((Uri) (obj)), flag, bundle);
		//   55  141:aload_0         
		//   56  142:iload_1         
		//   57  143:aload           6
		//   58  145:iload           5
		//   59  147:aload           7
		//   60  149:invokevirtual   #70  <Method void onRelationshipValidationResult(int, Uri, boolean, Bundle)>
					parcel1.writeNoException();
		//   61  152:aload_3         
		//   62  153:invokevirtual   #73  <Method void Parcel.writeNoException()>
					return true;
		//   63  156:iconst_1        
		//   64  157:ireturn         

				case 5: // '\005'
					parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
		//   65  158:aload_2         
		//   66  159:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//   67  161:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
					String s = parcel.readString();
		//   68  164:aload_2         
		//   69  165:invokevirtual   #77  <Method String Parcel.readString()>
		//   70  168:astore          7
					if(parcel.readInt() != 0)
		//*  71  170:aload_2         
		//*  72  171:invokevirtual   #51  <Method int Parcel.readInt()>
		//*  73  174:ifeq            191
						obj = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   74  177:getstatic       #66  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   75  180:aload_2         
		//   76  181:invokeinterface #63  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   77  186:checkcast       #65  <Class Bundle>
		//   78  189:astore          6
					onPostMessage(s, ((Bundle) (obj)));
		//   79  191:aload_0         
		//   80  192:aload           7
		//   81  194:aload           6
		//   82  196:invokevirtual   #81  <Method void onPostMessage(String, Bundle)>
					parcel1.writeNoException();
		//   83  199:aload_3         
		//   84  200:invokevirtual   #73  <Method void Parcel.writeNoException()>
					return true;
		//   85  203:iconst_1        
		//   86  204:ireturn         

				case 4: // '\004'
					parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
		//   87  205:aload_2         
		//   88  206:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//   89  208:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
					obj = ((Object) (obj2));
		//   90  211:aload           9
		//   91  213:astore          6
					if(parcel.readInt() != 0)
		//*  92  215:aload_2         
		//*  93  216:invokevirtual   #51  <Method int Parcel.readInt()>
		//*  94  219:ifeq            236
						obj = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   95  222:getstatic       #66  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   96  225:aload_2         
		//   97  226:invokeinterface #63  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   98  231:checkcast       #65  <Class Bundle>
		//   99  234:astore          6
					onMessageChannelReady(((Bundle) (obj)));
		//  100  236:aload_0         
		//  101  237:aload           6
		//  102  239:invokevirtual   #85  <Method void onMessageChannelReady(Bundle)>
					parcel1.writeNoException();
		//  103  242:aload_3         
		//  104  243:invokevirtual   #73  <Method void Parcel.writeNoException()>
					return true;
		//  105  246:iconst_1        
		//  106  247:ireturn         

				case 3: // '\003'
					parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
		//  107  248:aload_2         
		//  108  249:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//  109  251:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
					String s1 = parcel.readString();
		//  110  254:aload_2         
		//  111  255:invokevirtual   #77  <Method String Parcel.readString()>
		//  112  258:astore          7
					obj = ((Object) (obj1));
		//  113  260:aload           8
		//  114  262:astore          6
					if(parcel.readInt() != 0)
		//* 115  264:aload_2         
		//* 116  265:invokevirtual   #51  <Method int Parcel.readInt()>
		//* 117  268:ifeq            285
						obj = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  118  271:getstatic       #66  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  119  274:aload_2         
		//  120  275:invokeinterface #63  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  121  280:checkcast       #65  <Class Bundle>
		//  122  283:astore          6
					extraCallback(s1, ((Bundle) (obj)));
		//  123  285:aload_0         
		//  124  286:aload           7
		//  125  288:aload           6
		//  126  290:invokevirtual   #88  <Method void extraCallback(String, Bundle)>
					parcel1.writeNoException();
		//  127  293:aload_3         
		//  128  294:invokevirtual   #73  <Method void Parcel.writeNoException()>
					return true;
		//  129  297:iconst_1        
		//  130  298:ireturn         

				case 2: // '\002'
					parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
		//  131  299:aload_2         
		//  132  300:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//  133  302:invokevirtual   #47  <Method void Parcel.enforceInterface(String)>
					i = parcel.readInt();
		//  134  305:aload_2         
		//  135  306:invokevirtual   #51  <Method int Parcel.readInt()>
		//  136  309:istore_1        
					obj = ((Object) (obj3));
		//  137  310:aload           10
		//  138  312:astore          6
					break;
				}
				if(parcel.readInt() != 0)
		//* 139  314:aload_2         
		//* 140  315:invokevirtual   #51  <Method int Parcel.readInt()>
		//* 141  318:ifeq            335
					obj = ((Object) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//  142  321:getstatic       #66  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//  143  324:aload_2         
		//  144  325:invokeinterface #63  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//  145  330:checkcast       #65  <Class Bundle>
		//  146  333:astore          6
				onNavigationEvent(i, ((Bundle) (obj)));
		//  147  335:aload_0         
		//  148  336:iload_1         
		//  149  337:aload           6
		//  150  339:invokevirtual   #92  <Method void onNavigationEvent(int, Bundle)>
				parcel1.writeNoException();
		//  151  342:aload_3         
		//  152  343:invokevirtual   #73  <Method void Parcel.writeNoException()>
				return true;
		//  153  346:iconst_1        
		//  154  347:ireturn         
			} else
			{
				parcel1.writeString("android.support.customtabs.ICustomTabsCallback");
		//  155  348:aload_3         
		//  156  349:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//  157  351:invokevirtual   #95  <Method void Parcel.writeString(String)>
				return true;
		//  158  354:iconst_1        
		//  159  355:ireturn         
			}
		}

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Binder()>
			attachInterface(((IInterface) (this)), "android.support.customtabs.ICustomTabsCallback");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #16  <String "android.support.customtabs.ICustomTabsCallback">
		//    5    8:invokevirtual   #20  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	private static class Stub.Proxy
		implements ICustomTabsCallback
	{

		public IBinder asBinder()
		{
			return mRemote;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field IBinder mRemote>
		//    2    4:areturn         
		}

		public void extraCallback(String s, Bundle bundle)
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
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
		//    4    9:aload_3         
		//    5   10:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
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
			mRemote.transact(3, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:iconst_3        
		//   26   48:aload_3         
		//   27   49:aload           4
		//   28   51:iconst_0        
		//   29   52:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   57:pop             
			parcel1.readException();
		//   31   58:aload           4
		//   32   60:invokevirtual   #60  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   63:aload           4
		//   34   65:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   68:aload_3         
		//   36   69:invokevirtual   #63  <Method void Parcel.recycle()>
			return;
		//   37   72:return          
			s;
		//   38   73:astore_1        
			parcel1.recycle();
		//   39   74:aload           4
		//   40   76:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   79:aload_3         
		//   42   80:invokevirtual   #63  <Method void Parcel.recycle()>
			throw s;
		//   43   83:aload_1         
		//   44   84:athrow          
		}

		public void onMessageChannelReady(Bundle bundle)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #32  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
		//    4    8:aload_2         
		//    5    9:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
		//    6   11:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_32;
		//    7   14:aload_1         
		//    8   15:ifnull          32
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_37;
		//   16   29:goto            37
			parcel.writeInt(0);
		//   17   32:aload_2         
		//   18   33:iconst_0        
		//   19   34:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			mRemote.transact(4, parcel, parcel1, 0);
		//   20   37:aload_0         
		//   21   38:getfield        #19  <Field IBinder mRemote>
		//   22   41:iconst_4        
		//   23   42:aload_2         
		//   24   43:aload_3         
		//   25   44:iconst_0        
		//   26   45:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   27   50:pop             
			parcel1.readException();
		//   28   51:aload_3         
		//   29   52:invokevirtual   #60  <Method void Parcel.readException()>
			parcel1.recycle();
		//   30   55:aload_3         
		//   31   56:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   32   59:aload_2         
		//   33   60:invokevirtual   #63  <Method void Parcel.recycle()>
			return;
		//   34   63:return          
			bundle;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #63  <Method void Parcel.recycle()>
			throw bundle;
		//   40   73:aload_1         
		//   41   74:athrow          
		}

		public void onNavigationEvent(int i, Bundle bundle)
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
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
		//    4    9:aload_3         
		//    5   10:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
		//    6   12:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   15:aload_3         
		//    8   16:iload_1         
		//    9   17:invokevirtual   #45  <Method void Parcel.writeInt(int)>
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
			mRemote.transact(2, parcel, parcel1, 0);
		//   23   43:aload_0         
		//   24   44:getfield        #19  <Field IBinder mRemote>
		//   25   47:iconst_2        
		//   26   48:aload_3         
		//   27   49:aload           4
		//   28   51:iconst_0        
		//   29   52:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   30   57:pop             
			parcel1.readException();
		//   31   58:aload           4
		//   32   60:invokevirtual   #60  <Method void Parcel.readException()>
			parcel1.recycle();
		//   33   63:aload           4
		//   34   65:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   68:aload_3         
		//   36   69:invokevirtual   #63  <Method void Parcel.recycle()>
			return;
		//   37   72:return          
			bundle;
		//   38   73:astore_2        
			parcel1.recycle();
		//   39   74:aload           4
		//   40   76:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   79:aload_3         
		//   42   80:invokevirtual   #63  <Method void Parcel.recycle()>
			throw bundle;
		//   43   83:aload_2         
		//   44   84:athrow          
		}

		public void onPostMessage(String s, Bundle bundle)
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
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
		//    4    9:aload_3         
		//    5   10:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
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
			parcel1.recycle();
		//   33   63:aload           4
		//   34   65:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   35   68:aload_3         
		//   36   69:invokevirtual   #63  <Method void Parcel.recycle()>
			return;
		//   37   72:return          
			s;
		//   38   73:astore_1        
			parcel1.recycle();
		//   39   74:aload           4
		//   40   76:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   41   79:aload_3         
		//   42   80:invokevirtual   #63  <Method void Parcel.recycle()>
			throw s;
		//   43   83:aload_1         
		//   44   84:athrow          
		}

		public void onRelationshipValidationResult(int i, Uri uri, boolean flag, Bundle bundle)
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
			parcel.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
		//    4   10:aload           5
		//    5   12:ldc1            #34  <String "android.support.customtabs.ICustomTabsCallback">
		//    6   14:invokevirtual   #38  <Method void Parcel.writeInterfaceToken(String)>
			parcel.writeInt(i);
		//    7   17:aload           5
		//    8   19:iload_1         
		//    9   20:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			if(uri == null) goto _L2; else goto _L1
		//   10   23:aload_2         
		//   11   24:ifnull          43
_L1:
			parcel.writeInt(1);
		//   12   27:aload           5
		//   13   29:iconst_1        
		//   14   30:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			uri.writeToParcel(parcel, 0);
		//   15   33:aload_2         
		//   16   34:aload           5
		//   17   36:iconst_0        
		//   18   37:invokevirtual   #74  <Method void Uri.writeToParcel(Parcel, int)>
			  goto _L3
		//*  19   40:goto            132
_L2:
			parcel.writeInt(0);
		//   20   43:aload           5
		//   21   45:iconst_0        
		//   22   46:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			  goto _L3
		//*  23   49:goto            132
_L5:
			parcel.writeInt(i);
		//   24   52:aload           5
		//   25   54:iload_1         
		//   26   55:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			if(bundle == null)
				break MISSING_BLOCK_LABEL_80;
		//   27   58:aload           4
		//   28   60:ifnull          80
			parcel.writeInt(1);
		//   29   63:aload           5
		//   30   65:iconst_1        
		//   31   66:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			bundle.writeToParcel(parcel, 0);
		//   32   69:aload           4
		//   33   71:aload           5
		//   34   73:iconst_0        
		//   35   74:invokevirtual   #51  <Method void Bundle.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_86;
		//   36   77:goto            86
			parcel.writeInt(0);
		//   37   80:aload           5
		//   38   82:iconst_0        
		//   39   83:invokevirtual   #45  <Method void Parcel.writeInt(int)>
			mRemote.transact(6, parcel, parcel1, 0);
		//   40   86:aload_0         
		//   41   87:getfield        #19  <Field IBinder mRemote>
		//   42   90:bipush          6
		//   43   92:aload           5
		//   44   94:aload           6
		//   45   96:iconst_0        
		//   46   97:invokeinterface #57  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   47  102:pop             
			parcel1.readException();
		//   48  103:aload           6
		//   49  105:invokevirtual   #60  <Method void Parcel.readException()>
			parcel1.recycle();
		//   50  108:aload           6
		//   51  110:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   52  113:aload           5
		//   53  115:invokevirtual   #63  <Method void Parcel.recycle()>
			return;
		//   54  118:return          
			uri;
		//   55  119:astore_2        
			parcel1.recycle();
		//   56  120:aload           6
		//   57  122:invokevirtual   #63  <Method void Parcel.recycle()>
			parcel.recycle();
		//   58  125:aload           5
		//   59  127:invokevirtual   #63  <Method void Parcel.recycle()>
			throw uri;
		//   60  130:aload_2         
		//   61  131:athrow          
_L3:
			if(flag)
		//*  62  132:iload_3         
		//*  63  133:ifeq            141
				i = 1;
		//   64  136:iconst_1        
		//   65  137:istore_1        
			else
		//*  66  138:goto            52
				i = 0;
		//   67  141:iconst_0        
		//   68  142:istore_1        
			if(true) goto _L5; else goto _L4
		//   69  143:goto            52
_L4:
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


	public abstract void extraCallback(String s, Bundle bundle)
		throws RemoteException;

	public abstract void onMessageChannelReady(Bundle bundle)
		throws RemoteException;

	public abstract void onNavigationEvent(int i, Bundle bundle)
		throws RemoteException;

	public abstract void onPostMessage(String s, Bundle bundle)
		throws RemoteException;

	public abstract void onRelationshipValidationResult(int i, Uri uri, boolean flag, Bundle bundle)
		throws RemoteException;
}

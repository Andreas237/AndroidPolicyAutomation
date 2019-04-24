// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.os.*;

public interface bu
	extends IInterface
{
	public static abstract class a extends Binder
		implements bu
	{

		public static bu a(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
		//    4    6:aload_0         
		//    5    7:ldc1            #12  <String "com.android.vending.billing.IInAppBillingService">
		//    6    9:invokeinterface #18  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof bu))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class bu>
		//*  12   23:ifeq            31
				return (bu)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class bu>
		//   15   30:areturn         
			else
				return ((bu) (new a(ibinder)));
		//   16   31:new             #9   <Class bu$a$a>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #22  <Method void bu$a$a(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    6: default 60
		//		               1: 78
		//		               2: 112
		//		               3: 200
		//		               4: 260
		//		               5: 316
		//		               1598968902: 70
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    2   60:aload_0         
		//    3   61:iload_1         
		//    4   62:aload_2         
		//    5   63:aload_3         
		//    6   64:iload           4
		//    7   66:invokespecial   #29  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//    8   69:ireturn         

			case 1598968902: 
				parcel1.writeString("com.android.vending.billing.IInAppBillingService");
		//    9   70:aload_3         
		//   10   71:ldc1            #12  <String "com.android.vending.billing.IInAppBillingService">
		//   11   73:invokevirtual   #35  <Method void Parcel.writeString(String)>
				return true;
		//   12   76:iconst_1        
		//   13   77:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
		//   14   78:aload_2         
		//   15   79:ldc1            #12  <String "com.android.vending.billing.IInAppBillingService">
		//   16   81:invokevirtual   #38  <Method void Parcel.enforceInterface(String)>
				i = a(parcel.readInt(), parcel.readString(), parcel.readString());
		//   17   84:aload_0         
		//   18   85:aload_2         
		//   19   86:invokevirtual   #42  <Method int Parcel.readInt()>
		//   20   89:aload_2         
		//   21   90:invokevirtual   #46  <Method String Parcel.readString()>
		//   22   93:aload_2         
		//   23   94:invokevirtual   #46  <Method String Parcel.readString()>
		//   24   97:invokevirtual   #49  <Method int a(int, String, String)>
		//   25  100:istore_1        
				parcel1.writeNoException();
		//   26  101:aload_3         
		//   27  102:invokevirtual   #53  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//   28  105:aload_3         
		//   29  106:iload_1         
		//   30  107:invokevirtual   #57  <Method void Parcel.writeInt(int)>
				return true;
		//   31  110:iconst_1        
		//   32  111:ireturn         

			case 2: // '\002'
				parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
		//   33  112:aload_2         
		//   34  113:ldc1            #12  <String "com.android.vending.billing.IInAppBillingService">
		//   35  115:invokevirtual   #38  <Method void Parcel.enforceInterface(String)>
				i = parcel.readInt();
		//   36  118:aload_2         
		//   37  119:invokevirtual   #42  <Method int Parcel.readInt()>
		//   38  122:istore_1        
				String s = parcel.readString();
		//   39  123:aload_2         
		//   40  124:invokevirtual   #46  <Method String Parcel.readString()>
		//   41  127:astore          5
				String s1 = parcel.readString();
		//   42  129:aload_2         
		//   43  130:invokevirtual   #46  <Method String Parcel.readString()>
		//   44  133:astore          6
				if(parcel.readInt() != 0)
		//*  45  135:aload_2         
		//*  46  136:invokevirtual   #42  <Method int Parcel.readInt()>
		//*  47  139:ifeq            187
					parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
		//   48  142:getstatic       #63  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   49  145:aload_2         
		//   50  146:invokeinterface #69  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   51  151:checkcast       #59  <Class Bundle>
		//   52  154:astore_2        
				else
		//*  53  155:aload_0         
		//*  54  156:iload_1         
		//*  55  157:aload           5
		//*  56  159:aload           6
		//*  57  161:aload_2         
		//*  58  162:invokevirtual   #72  <Method Bundle a(int, String, String, Bundle)>
		//*  59  165:astore_2        
		//*  60  166:aload_3         
		//*  61  167:invokevirtual   #53  <Method void Parcel.writeNoException()>
		//*  62  170:aload_2         
		//*  63  171:ifnull          192
		//*  64  174:aload_3         
		//*  65  175:iconst_1        
		//*  66  176:invokevirtual   #57  <Method void Parcel.writeInt(int)>
		//*  67  179:aload_2         
		//*  68  180:aload_3         
		//*  69  181:iconst_1        
		//*  70  182:invokevirtual   #76  <Method void Bundle.writeToParcel(Parcel, int)>
		//*  71  185:iconst_1        
		//*  72  186:ireturn         
					parcel = null;
		//   73  187:aconst_null     
		//   74  188:astore_2        
				parcel = ((Parcel) (a(i, s, s1, ((Bundle) (parcel)))));
				parcel1.writeNoException();
				if(parcel != null)
				{
					parcel1.writeInt(1);
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
				} else
		//*  75  189:goto            155
				{
					parcel1.writeInt(0);
		//   76  192:aload_3         
		//   77  193:iconst_0        
		//   78  194:invokevirtual   #57  <Method void Parcel.writeInt(int)>
				}
				return true;

		//*  79  197:goto            185
			case 3: // '\003'
				parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
		//   80  200:aload_2         
		//   81  201:ldc1            #12  <String "com.android.vending.billing.IInAppBillingService">
		//   82  203:invokevirtual   #38  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString())));
		//   83  206:aload_0         
		//   84  207:aload_2         
		//   85  208:invokevirtual   #42  <Method int Parcel.readInt()>
		//   86  211:aload_2         
		//   87  212:invokevirtual   #46  <Method String Parcel.readString()>
		//   88  215:aload_2         
		//   89  216:invokevirtual   #46  <Method String Parcel.readString()>
		//   90  219:aload_2         
		//   91  220:invokevirtual   #46  <Method String Parcel.readString()>
		//   92  223:aload_2         
		//   93  224:invokevirtual   #46  <Method String Parcel.readString()>
		//   94  227:invokevirtual   #79  <Method Bundle a(int, String, String, String, String)>
		//   95  230:astore_2        
				parcel1.writeNoException();
		//   96  231:aload_3         
		//   97  232:invokevirtual   #53  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//*  98  235:aload_2         
		//*  99  236:ifnull          252
				{
					parcel1.writeInt(1);
		//  100  239:aload_3         
		//  101  240:iconst_1        
		//  102  241:invokevirtual   #57  <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  103  244:aload_2         
		//  104  245:aload_3         
		//  105  246:iconst_1        
		//  106  247:invokevirtual   #76  <Method void Bundle.writeToParcel(Parcel, int)>
				} else
		//* 107  250:iconst_1        
		//* 108  251:ireturn         
				{
					parcel1.writeInt(0);
		//  109  252:aload_3         
		//  110  253:iconst_0        
		//  111  254:invokevirtual   #57  <Method void Parcel.writeInt(int)>
				}
				return true;

		//* 112  257:goto            250
			case 4: // '\004'
				parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
		//  113  260:aload_2         
		//  114  261:ldc1            #12  <String "com.android.vending.billing.IInAppBillingService">
		//  115  263:invokevirtual   #38  <Method void Parcel.enforceInterface(String)>
				parcel = ((Parcel) (a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString())));
		//  116  266:aload_0         
		//  117  267:aload_2         
		//  118  268:invokevirtual   #42  <Method int Parcel.readInt()>
		//  119  271:aload_2         
		//  120  272:invokevirtual   #46  <Method String Parcel.readString()>
		//  121  275:aload_2         
		//  122  276:invokevirtual   #46  <Method String Parcel.readString()>
		//  123  279:aload_2         
		//  124  280:invokevirtual   #46  <Method String Parcel.readString()>
		//  125  283:invokevirtual   #82  <Method Bundle a(int, String, String, String)>
		//  126  286:astore_2        
				parcel1.writeNoException();
		//  127  287:aload_3         
		//  128  288:invokevirtual   #53  <Method void Parcel.writeNoException()>
				if(parcel != null)
		//* 129  291:aload_2         
		//* 130  292:ifnull          308
				{
					parcel1.writeInt(1);
		//  131  295:aload_3         
		//  132  296:iconst_1        
		//  133  297:invokevirtual   #57  <Method void Parcel.writeInt(int)>
					((Bundle) (parcel)).writeToParcel(parcel1, 1);
		//  134  300:aload_2         
		//  135  301:aload_3         
		//  136  302:iconst_1        
		//  137  303:invokevirtual   #76  <Method void Bundle.writeToParcel(Parcel, int)>
				} else
		//* 138  306:iconst_1        
		//* 139  307:ireturn         
				{
					parcel1.writeInt(0);
		//  140  308:aload_3         
		//  141  309:iconst_0        
		//  142  310:invokevirtual   #57  <Method void Parcel.writeInt(int)>
				}
				return true;

		//* 143  313:goto            306
			case 5: // '\005'
				parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
		//  144  316:aload_2         
		//  145  317:ldc1            #12  <String "com.android.vending.billing.IInAppBillingService">
		//  146  319:invokevirtual   #38  <Method void Parcel.enforceInterface(String)>
				i = b(parcel.readInt(), parcel.readString(), parcel.readString());
		//  147  322:aload_0         
		//  148  323:aload_2         
		//  149  324:invokevirtual   #42  <Method int Parcel.readInt()>
		//  150  327:aload_2         
		//  151  328:invokevirtual   #46  <Method String Parcel.readString()>
		//  152  331:aload_2         
		//  153  332:invokevirtual   #46  <Method String Parcel.readString()>
		//  154  335:invokevirtual   #85  <Method int b(int, String, String)>
		//  155  338:istore_1        
				parcel1.writeNoException();
		//  156  339:aload_3         
		//  157  340:invokevirtual   #53  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//  158  343:aload_3         
		//  159  344:iload_1         
		//  160  345:invokevirtual   #57  <Method void Parcel.writeInt(int)>
				return true;
		//  161  348:iconst_1        
		//  162  349:ireturn         
			}
		}
	}

	private static class a.a
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

		a.a(IBinder ibinder)
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


	public abstract int a(int i, String s, String s1)
		throws RemoteException;

	public abstract Bundle a(int i, String s, String s1, Bundle bundle)
		throws RemoteException;

	public abstract Bundle a(int i, String s, String s1, String s2)
		throws RemoteException;

	public abstract Bundle a(int i, String s, String s1, String s2, String s3)
		throws RemoteException;

	public abstract int b(int i, String s, String s1)
		throws RemoteException;
}

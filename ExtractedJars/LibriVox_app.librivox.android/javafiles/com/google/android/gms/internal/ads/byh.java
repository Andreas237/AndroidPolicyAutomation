// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, byg, byi, bck, 
//			byj, byl

public abstract class byh extends bcj
	implements byg
{

	public byh()
	{
		super("com.google.android.gms.ads.internal.client.IVideoController");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoController">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static byg a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoController">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof byg)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class byg>
	//*  10   19:ifeq            27
			return (byg)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class byg>
	//   13   26:areturn         
		else
			return ((byg) (new byi(ibinder)));
	//   14   27:new             #24  <Class byi>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void byi(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 302
	//	               2 291
	//	               3 276
	//	               4 257
	//	               5 240
	//	               6 221
	//	               7 202
	//	               8 140
	//	               9 121
	//	               10 102
	//	               11 85
	//	               12 66
		default:
			return false;
	//    2   64:iconst_0        
	//    3   65:ireturn         

		case 12: // '\f'
			boolean flag = j();
	//    4   66:aload_0         
	//    5   67:invokevirtual   #33  <Method boolean j()>
	//    6   70:istore          6
			parcel1.writeNoException();
	//    7   72:aload_3         
	//    8   73:invokevirtual   #38  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag);
	//    9   76:aload_3         
	//   10   77:iload           6
	//   11   79:invokestatic    #43  <Method void bck.a(Parcel, boolean)>
			break;
	//   12   82:goto            310

		case 11: // '\013'
			parcel = ((Parcel) (g()));
	//   13   85:aload_0         
	//   14   86:invokevirtual   #47  <Method byj g()>
	//   15   89:astore_2        
			parcel1.writeNoException();
	//   16   90:aload_3         
	//   17   91:invokevirtual   #38  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   18   94:aload_3         
	//   19   95:aload_2         
	//   20   96:invokestatic    #50  <Method void bck.a(Parcel, android.os.IInterface)>
			break;
	//   21   99:goto            310

		case 10: // '\n'
			boolean flag1 = i();
	//   22  102:aload_0         
	//   23  103:invokevirtual   #53  <Method boolean i()>
	//   24  106:istore          6
			parcel1.writeNoException();
	//   25  108:aload_3         
	//   26  109:invokevirtual   #38  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag1);
	//   27  112:aload_3         
	//   28  113:iload           6
	//   29  115:invokestatic    #43  <Method void bck.a(Parcel, boolean)>
			break;
	//   30  118:goto            310

		case 9: // '\t'
			float f = h();
	//   31  121:aload_0         
	//   32  122:invokevirtual   #57  <Method float h()>
	//   33  125:fstore          5
			parcel1.writeNoException();
	//   34  127:aload_3         
	//   35  128:invokevirtual   #38  <Method void Parcel.writeNoException()>
			parcel1.writeFloat(f);
	//   36  131:aload_3         
	//   37  132:fload           5
	//   38  134:invokevirtual   #61  <Method void Parcel.writeFloat(float)>
			break;
	//   39  137:goto            310

		case 8: // '\b'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   40  140:aload_2         
	//   41  141:invokevirtual   #65  <Method IBinder Parcel.readStrongBinder()>
	//   42  144:astore_2        
			if(parcel == null)
	//*  43  145:aload_2         
	//*  44  146:ifnonnull       154
			{
				parcel = null;
	//   45  149:aconst_null     
	//   46  150:astore_2        
			} else
	//*  47  151:goto            190
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//   48  154:aload_2         
	//   49  155:ldc1            #67  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
	//   50  157:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   51  162:astore          7
				if(iinterface instanceof byj)
	//*  52  164:aload           7
	//*  53  166:instanceof      #69  <Class byj>
	//*  54  169:ifeq            181
					parcel = ((Parcel) ((byj)iinterface));
	//   55  172:aload           7
	//   56  174:checkcast       #69  <Class byj>
	//   57  177:astore_2        
				else
	//*  58  178:goto            190
					parcel = ((Parcel) (new byl(((IBinder) (parcel)))));
	//   59  181:new             #71  <Class byl>
	//   60  184:dup             
	//   61  185:aload_2         
	//   62  186:invokespecial   #72  <Method void byl(IBinder)>
	//   63  189:astore_2        
			}
			a(((byj) (parcel)));
	//   64  190:aload_0         
	//   65  191:aload_2         
	//   66  192:invokevirtual   #75  <Method void a(byj)>
			parcel1.writeNoException();
	//   67  195:aload_3         
	//   68  196:invokevirtual   #38  <Method void Parcel.writeNoException()>
			break;

	//*  69  199:goto            310
		case 7: // '\007'
			float f1 = f();
	//   70  202:aload_0         
	//   71  203:invokevirtual   #78  <Method float f()>
	//   72  206:fstore          5
			parcel1.writeNoException();
	//   73  208:aload_3         
	//   74  209:invokevirtual   #38  <Method void Parcel.writeNoException()>
			parcel1.writeFloat(f1);
	//   75  212:aload_3         
	//   76  213:fload           5
	//   77  215:invokevirtual   #61  <Method void Parcel.writeFloat(float)>
			break;

	//*  78  218:goto            310
		case 6: // '\006'
			float f2 = e();
	//   79  221:aload_0         
	//   80  222:invokevirtual   #81  <Method float e()>
	//   81  225:fstore          5
			parcel1.writeNoException();
	//   82  227:aload_3         
	//   83  228:invokevirtual   #38  <Method void Parcel.writeNoException()>
			parcel1.writeFloat(f2);
	//   84  231:aload_3         
	//   85  232:fload           5
	//   86  234:invokevirtual   #61  <Method void Parcel.writeFloat(float)>
			break;

	//*  87  237:goto            310
		case 5: // '\005'
			i = d();
	//   88  240:aload_0         
	//   89  241:invokevirtual   #85  <Method int d()>
	//   90  244:istore_1        
			parcel1.writeNoException();
	//   91  245:aload_3         
	//   92  246:invokevirtual   #38  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//   93  249:aload_3         
	//   94  250:iload_1         
	//   95  251:invokevirtual   #89  <Method void Parcel.writeInt(int)>
			break;

	//*  96  254:goto            310
		case 4: // '\004'
			boolean flag2 = c();
	//   97  257:aload_0         
	//   98  258:invokevirtual   #92  <Method boolean c()>
	//   99  261:istore          6
			parcel1.writeNoException();
	//  100  263:aload_3         
	//  101  264:invokevirtual   #38  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag2);
	//  102  267:aload_3         
	//  103  268:iload           6
	//  104  270:invokestatic    #43  <Method void bck.a(Parcel, boolean)>
			break;

	//* 105  273:goto            310
		case 3: // '\003'
			a(bck.a(parcel));
	//  106  276:aload_0         
	//  107  277:aload_2         
	//  108  278:invokestatic    #95  <Method boolean bck.a(Parcel)>
	//  109  281:invokevirtual   #98  <Method void a(boolean)>
			parcel1.writeNoException();
	//  110  284:aload_3         
	//  111  285:invokevirtual   #38  <Method void Parcel.writeNoException()>
			break;

	//* 112  288:goto            310
		case 2: // '\002'
			b();
	//  113  291:aload_0         
	//  114  292:invokevirtual   #101 <Method void b()>
			parcel1.writeNoException();
	//  115  295:aload_3         
	//  116  296:invokevirtual   #38  <Method void Parcel.writeNoException()>
			break;

	//* 117  299:goto            310
		case 1: // '\001'
			a();
	//  118  302:aload_0         
	//  119  303:invokevirtual   #103 <Method void a()>
			parcel1.writeNoException();
	//  120  306:aload_3         
	//  121  307:invokevirtual   #38  <Method void Parcel.writeNoException()>
			break;
		}
		return true;
	//  122  310:iconst_1        
	//  123  311:ireturn         
	}
}

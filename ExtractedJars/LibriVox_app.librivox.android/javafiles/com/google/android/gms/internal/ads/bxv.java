// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bxu, kn, bck

public abstract class bxv extends bcj
	implements bxu
{

	public bxv()
	{
		super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 11: default 60
	//	               1 239
	//	               2 224
	//	               3 209
	//	               4 194
	//	               5 172
	//	               6 150
	//	               7 131
	//	               8 112
	//	               9 95
	//	               10 80
	//	               11 62
		default:
			return false;
	//    2   60:iconst_0        
	//    3   61:ireturn         

		case 11: // '\013'
			a(kn.a(parcel.readStrongBinder()));
	//    4   62:aload_0         
	//    5   63:aload_2         
	//    6   64:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    7   67:invokestatic    #28  <Method km kn.a(android.os.IBinder)>
	//    8   70:invokevirtual   #31  <Method void a(km)>
			parcel1.writeNoException();
	//    9   73:aload_3         
	//   10   74:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  11   77:goto            247
		case 10: // '\n'
			b(parcel.readString());
	//   12   80:aload_0         
	//   13   81:aload_2         
	//   14   82:invokevirtual   #38  <Method String Parcel.readString()>
	//   15   85:invokevirtual   #41  <Method void b(String)>
			parcel1.writeNoException();
	//   16   88:aload_3         
	//   17   89:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  18   92:goto            247
		case 9: // '\t'
			parcel = ((Parcel) (d()));
	//   19   95:aload_0         
	//   20   96:invokevirtual   #44  <Method String d()>
	//   21   99:astore_2        
			parcel1.writeNoException();
	//   22  100:aload_3         
	//   23  101:invokevirtual   #34  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   24  104:aload_3         
	//   25  105:aload_2         
	//   26  106:invokevirtual   #47  <Method void Parcel.writeString(String)>
			break;

	//*  27  109:goto            247
		case 8: // '\b'
			boolean flag = c();
	//   28  112:aload_0         
	//   29  113:invokevirtual   #51  <Method boolean c()>
	//   30  116:istore          6
			parcel1.writeNoException();
	//   31  118:aload_3         
	//   32  119:invokevirtual   #34  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag);
	//   33  122:aload_3         
	//   34  123:iload           6
	//   35  125:invokestatic    #56  <Method void bck.a(Parcel, boolean)>
			break;

	//*  36  128:goto            247
		case 7: // '\007'
			float f = b();
	//   37  131:aload_0         
	//   38  132:invokevirtual   #59  <Method float b()>
	//   39  135:fstore          5
			parcel1.writeNoException();
	//   40  137:aload_3         
	//   41  138:invokevirtual   #34  <Method void Parcel.writeNoException()>
			parcel1.writeFloat(f);
	//   42  141:aload_3         
	//   43  142:fload           5
	//   44  144:invokevirtual   #63  <Method void Parcel.writeFloat(float)>
			break;

	//*  45  147:goto            247
		case 6: // '\006'
			a(parcel.readString(), b.a(parcel.readStrongBinder()));
	//   46  150:aload_0         
	//   47  151:aload_2         
	//   48  152:invokevirtual   #38  <Method String Parcel.readString()>
	//   49  155:aload_2         
	//   50  156:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   51  159:invokestatic    #68  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   52  162:invokevirtual   #71  <Method void a(String, com.google.android.gms.c.a)>
			parcel1.writeNoException();
	//   53  165:aload_3         
	//   54  166:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  55  169:goto            247
		case 5: // '\005'
			a(b.a(parcel.readStrongBinder()), parcel.readString());
	//   56  172:aload_0         
	//   57  173:aload_2         
	//   58  174:invokevirtual   #22  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   59  177:invokestatic    #68  <Method com.google.android.gms.c.a b.a(android.os.IBinder)>
	//   60  180:aload_2         
	//   61  181:invokevirtual   #38  <Method String Parcel.readString()>
	//   62  184:invokevirtual   #74  <Method void a(com.google.android.gms.c.a, String)>
			parcel1.writeNoException();
	//   63  187:aload_3         
	//   64  188:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  65  191:goto            247
		case 4: // '\004'
			a(bck.a(parcel));
	//   66  194:aload_0         
	//   67  195:aload_2         
	//   68  196:invokestatic    #77  <Method boolean bck.a(Parcel)>
	//   69  199:invokevirtual   #80  <Method void a(boolean)>
			parcel1.writeNoException();
	//   70  202:aload_3         
	//   71  203:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  72  206:goto            247
		case 3: // '\003'
			a(parcel.readString());
	//   73  209:aload_0         
	//   74  210:aload_2         
	//   75  211:invokevirtual   #38  <Method String Parcel.readString()>
	//   76  214:invokevirtual   #82  <Method void a(String)>
			parcel1.writeNoException();
	//   77  217:aload_3         
	//   78  218:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  79  221:goto            247
		case 2: // '\002'
			a(parcel.readFloat());
	//   80  224:aload_0         
	//   81  225:aload_2         
	//   82  226:invokevirtual   #85  <Method float Parcel.readFloat()>
	//   83  229:invokevirtual   #87  <Method void a(float)>
			parcel1.writeNoException();
	//   84  232:aload_3         
	//   85  233:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;

	//*  86  236:goto            247
		case 1: // '\001'
			a();
	//   87  239:aload_0         
	//   88  240:invokevirtual   #89  <Method void a()>
			parcel1.writeNoException();
	//   89  243:aload_3         
	//   90  244:invokevirtual   #34  <Method void Parcel.writeNoException()>
			break;
		}
		return true;
	//   91  247:iconst_1        
	//   92  248:ireturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, ks, ku, zzawd, 
//			bck, dc, kv, kx

public abstract class kt extends bcj
	implements ks
{

	public kt()
	{
		super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static ks a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof ks)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class ks>
	//*  10   19:ifeq            27
			return (ks)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ks>
	//   13   26:areturn         
		else
			return ((ks) (new ku(ibinder)));
	//   14   27:new             #24  <Class ku>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void ku(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 15: default 76
	//	               1 264
	//	               2 257
	//	               3 246
	//	               4 239
	//	               5 232
	//	               6 225
	//	               7 167
	//	               8 160
	//	               9 145
	//	               10 127
	//	               11 120
	//	               12 109
	//	               13 102
	//	               14 85
	//	               15 78
		default:
			return false;
	//    2   76:iconst_0        
	//    3   77:ireturn         

		case 15: // '\017'
			i();
	//    4   78:aload_0         
	//    5   79:invokevirtual   #32  <Method void i()>
			break;
	//    6   82:goto            268

		case 14: // '\016'
			a((zzawd)bck.a(parcel, zzawd.CREATOR));
	//    7   85:aload_0         
	//    8   86:aload_2         
	//    9   87:getstatic       #38  <Field android.os.Parcelable$Creator zzawd.CREATOR>
	//   10   90:invokestatic    #43  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   11   93:checkcast       #34  <Class zzawd>
	//   12   96:invokevirtual   #46  <Method void a(zzawd)>
			break;
	//   13   99:goto            268

		case 13: // '\r'
			h();
	//   14  102:aload_0         
	//   15  103:invokevirtual   #49  <Method void h()>
			break;
	//   16  106:goto            268

		case 12: // '\f'
			a(parcel.readString());
	//   17  109:aload_0         
	//   18  110:aload_2         
	//   19  111:invokevirtual   #55  <Method String Parcel.readString()>
	//   20  114:invokevirtual   #57  <Method void a(String)>
			break;
	//   21  117:goto            268

		case 11: // '\013'
			g();
	//   22  120:aload_0         
	//   23  121:invokevirtual   #60  <Method void g()>
			break;
	//   24  124:goto            268

		case 10: // '\n'
			a(dc.a(parcel.readStrongBinder()), parcel.readString());
	//   25  127:aload_0         
	//   26  128:aload_2         
	//   27  129:invokevirtual   #64  <Method IBinder Parcel.readStrongBinder()>
	//   28  132:invokestatic    #69  <Method db dc.a(IBinder)>
	//   29  135:aload_2         
	//   30  136:invokevirtual   #55  <Method String Parcel.readString()>
	//   31  139:invokevirtual   #72  <Method void a(db, String)>
			break;
	//   32  142:goto            268

		case 9: // '\t'
			a(parcel.readString(), parcel.readString());
	//   33  145:aload_0         
	//   34  146:aload_2         
	//   35  147:invokevirtual   #55  <Method String Parcel.readString()>
	//   36  150:aload_2         
	//   37  151:invokevirtual   #55  <Method String Parcel.readString()>
	//   38  154:invokevirtual   #75  <Method void a(String, String)>
			break;
	//   39  157:goto            268

		case 8: // '\b'
			f();
	//   40  160:aload_0         
	//   41  161:invokevirtual   #78  <Method void f()>
			break;
	//   42  164:goto            268

		case 7: // '\007'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   43  167:aload_2         
	//   44  168:invokevirtual   #64  <Method IBinder Parcel.readStrongBinder()>
	//   45  171:astore_2        
			if(parcel == null)
	//*  46  172:aload_2         
	//*  47  173:ifnonnull       181
			{
				parcel = null;
	//   48  176:aconst_null     
	//   49  177:astore_2        
			} else
	//*  50  178:goto            217
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
	//   51  181:aload_2         
	//   52  182:ldc1            #80  <String "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata">
	//   53  184:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   54  189:astore          5
				if(iinterface instanceof kv)
	//*  55  191:aload           5
	//*  56  193:instanceof      #82  <Class kv>
	//*  57  196:ifeq            208
					parcel = ((Parcel) ((kv)iinterface));
	//   58  199:aload           5
	//   59  201:checkcast       #82  <Class kv>
	//   60  204:astore_2        
				else
	//*  61  205:goto            217
					parcel = ((Parcel) (new kx(((IBinder) (parcel)))));
	//   62  208:new             #84  <Class kx>
	//   63  211:dup             
	//   64  212:aload_2         
	//   65  213:invokespecial   #85  <Method void kx(IBinder)>
	//   66  216:astore_2        
			}
			a(((kv) (parcel)));
	//   67  217:aload_0         
	//   68  218:aload_2         
	//   69  219:invokevirtual   #88  <Method void a(kv)>
			break;

	//*  70  222:goto            268
		case 6: // '\006'
			e();
	//   71  225:aload_0         
	//   72  226:invokevirtual   #91  <Method void e()>
			break;

	//*  73  229:goto            268
		case 5: // '\005'
			d();
	//   74  232:aload_0         
	//   75  233:invokevirtual   #94  <Method void d()>
			break;

	//*  76  236:goto            268
		case 4: // '\004'
			c();
	//   77  239:aload_0         
	//   78  240:invokevirtual   #97  <Method void c()>
			break;

	//*  79  243:goto            268
		case 3: // '\003'
			a(parcel.readInt());
	//   80  246:aload_0         
	//   81  247:aload_2         
	//   82  248:invokevirtual   #101 <Method int Parcel.readInt()>
	//   83  251:invokevirtual   #104 <Method void a(int)>
			break;

	//*  84  254:goto            268
		case 2: // '\002'
			b();
	//   85  257:aload_0         
	//   86  258:invokevirtual   #107 <Method void b()>
			break;

	//*  87  261:goto            268
		case 1: // '\001'
			a();
	//   88  264:aload_0         
	//   89  265:invokevirtual   #109 <Method void a()>
			break;
		}
		parcel1.writeNoException();
	//   90  268:aload_3         
	//   91  269:invokevirtual   #112 <Method void Parcel.writeNoException()>
		return true;
	//   92  272:iconst_1        
	//   93  273:ireturn         
	}
}

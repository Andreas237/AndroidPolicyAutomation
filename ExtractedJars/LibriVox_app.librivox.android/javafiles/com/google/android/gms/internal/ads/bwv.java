// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bwu, zzwb, bck

public abstract class bwv extends bcj
	implements bwu
{

	public bwv()
	{
		super("com.google.android.gms.ads.internal.client.IAdLoader");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoader">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 116
	//	               2 99
	//	               3 80
	//	               4 63
	//	               5 38
		default:
			return false;
	//    2   36:iconst_0        
	//    3   37:ireturn         

		case 5: // '\005'
			a((zzwb)bck.a(parcel, zzwb.CREATOR), parcel.readInt());
	//    4   38:aload_0         
	//    5   39:aload_2         
	//    6   40:getstatic       #22  <Field android.os.Parcelable$Creator zzwb.CREATOR>
	//    7   43:invokestatic    #28  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//    8   46:checkcast       #18  <Class zzwb>
	//    9   49:aload_2         
	//   10   50:invokevirtual   #34  <Method int Parcel.readInt()>
	//   11   53:invokevirtual   #37  <Method void a(zzwb, int)>
			parcel1.writeNoException();
	//   12   56:aload_3         
	//   13   57:invokevirtual   #40  <Method void Parcel.writeNoException()>
			break;

	//*  14   60:goto            134
		case 4: // '\004'
			parcel = ((Parcel) (b()));
	//   15   63:aload_0         
	//   16   64:invokevirtual   #44  <Method String b()>
	//   17   67:astore_2        
			parcel1.writeNoException();
	//   18   68:aload_3         
	//   19   69:invokevirtual   #40  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   20   72:aload_3         
	//   21   73:aload_2         
	//   22   74:invokevirtual   #47  <Method void Parcel.writeString(String)>
			break;

	//*  23   77:goto            134
		case 3: // '\003'
			boolean flag = c();
	//   24   80:aload_0         
	//   25   81:invokevirtual   #51  <Method boolean c()>
	//   26   84:istore          5
			parcel1.writeNoException();
	//   27   86:aload_3         
	//   28   87:invokevirtual   #40  <Method void Parcel.writeNoException()>
			bck.a(parcel1, flag);
	//   29   90:aload_3         
	//   30   91:iload           5
	//   31   93:invokestatic    #54  <Method void bck.a(Parcel, boolean)>
			break;

	//*  32   96:goto            134
		case 2: // '\002'
			parcel = ((Parcel) (a()));
	//   33   99:aload_0         
	//   34  100:invokevirtual   #56  <Method String a()>
	//   35  103:astore_2        
			parcel1.writeNoException();
	//   36  104:aload_3         
	//   37  105:invokevirtual   #40  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   38  108:aload_3         
	//   39  109:aload_2         
	//   40  110:invokevirtual   #47  <Method void Parcel.writeString(String)>
			break;

	//*  41  113:goto            134
		case 1: // '\001'
			a((zzwb)bck.a(parcel, zzwb.CREATOR));
	//   42  116:aload_0         
	//   43  117:aload_2         
	//   44  118:getstatic       #22  <Field android.os.Parcelable$Creator zzwb.CREATOR>
	//   45  121:invokestatic    #28  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   46  124:checkcast       #18  <Class zzwb>
	//   47  127:invokevirtual   #59  <Method void a(zzwb)>
			parcel1.writeNoException();
	//   48  130:aload_3         
	//   49  131:invokevirtual   #40  <Method void Parcel.writeNoException()>
			break;
		}
		return true;
	//   50  134:iconst_1        
	//   51  135:ireturn         
	}
}

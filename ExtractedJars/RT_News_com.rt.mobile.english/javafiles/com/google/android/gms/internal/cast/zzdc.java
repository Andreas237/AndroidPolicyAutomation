// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzb, zzdb, zzcv, zzc, 
//			zzcd

public abstract class zzdc extends zzb
	implements zzdb
{

	public zzdc()
	{
		super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.cast.internal.ICastDeviceControllerListener">
	//    2    3:invokespecial   #13  <Method void zzb(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 13: default 68
	//	               1 260
	//	               2 231
	//	               3 220
	//	               4 201
	//	               5 186
	//	               6 171
	//	               7 160
	//	               8 149
	//	               9 138
	//	               10 119
	//	               11 104
	//	               12 87
	//	               13 70
		default:
			return false;
	//    2   68:iconst_0        
	//    3   69:ireturn         

		case 13: // '\r'
			zzb((zzcv)zzc.zza(parcel, zzcv.CREATOR));
	//    4   70:aload_0         
	//    5   71:aload_2         
	//    6   72:getstatic       #24  <Field android.os.Parcelable$Creator zzcv.CREATOR>
	//    7   75:invokestatic    #30  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    8   78:checkcast       #20  <Class zzcv>
	//    9   81:invokevirtual   #34  <Method void zzb(zzcv)>
			break;

	//*  10   84:goto            268
		case 12: // '\f'
			zzb((zzcd)zzc.zza(parcel, zzcd.CREATOR));
	//   11   87:aload_0         
	//   12   88:aload_2         
	//   13   89:getstatic       #37  <Field android.os.Parcelable$Creator zzcd.CREATOR>
	//   14   92:invokestatic    #30  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   15   95:checkcast       #36  <Class zzcd>
	//   16   98:invokevirtual   #40  <Method void zzb(zzcd)>
			break;

	//*  17  101:goto            268
		case 11: // '\013'
			zza(parcel.readString(), parcel.readLong());
	//   18  104:aload_0         
	//   19  105:aload_2         
	//   20  106:invokevirtual   #46  <Method String Parcel.readString()>
	//   21  109:aload_2         
	//   22  110:invokevirtual   #50  <Method long Parcel.readLong()>
	//   23  113:invokevirtual   #53  <Method void zza(String, long)>
			break;

	//*  24  116:goto            268
		case 10: // '\n'
			zza(parcel.readString(), parcel.readLong(), parcel.readInt());
	//   25  119:aload_0         
	//   26  120:aload_2         
	//   27  121:invokevirtual   #46  <Method String Parcel.readString()>
	//   28  124:aload_2         
	//   29  125:invokevirtual   #50  <Method long Parcel.readLong()>
	//   30  128:aload_2         
	//   31  129:invokevirtual   #57  <Method int Parcel.readInt()>
	//   32  132:invokevirtual   #60  <Method void zza(String, long, int)>
			break;

	//*  33  135:goto            268
		case 9: // '\t'
			onApplicationDisconnected(parcel.readInt());
	//   34  138:aload_0         
	//   35  139:aload_2         
	//   36  140:invokevirtual   #57  <Method int Parcel.readInt()>
	//   37  143:invokevirtual   #64  <Method void onApplicationDisconnected(int)>
			break;

	//*  38  146:goto            268
		case 8: // '\b'
			zzo(parcel.readInt());
	//   39  149:aload_0         
	//   40  150:aload_2         
	//   41  151:invokevirtual   #57  <Method int Parcel.readInt()>
	//   42  154:invokevirtual   #67  <Method void zzo(int)>
			break;

	//*  43  157:goto            268
		case 7: // '\007'
			zzp(parcel.readInt());
	//   44  160:aload_0         
	//   45  161:aload_2         
	//   46  162:invokevirtual   #57  <Method int Parcel.readInt()>
	//   47  165:invokevirtual   #70  <Method void zzp(int)>
			break;

	//*  48  168:goto            268
		case 6: // '\006'
			zza(parcel.readString(), parcel.createByteArray());
	//   49  171:aload_0         
	//   50  172:aload_2         
	//   51  173:invokevirtual   #46  <Method String Parcel.readString()>
	//   52  176:aload_2         
	//   53  177:invokevirtual   #74  <Method byte[] Parcel.createByteArray()>
	//   54  180:invokevirtual   #77  <Method void zza(String, byte[])>
			break;

	//*  55  183:goto            268
		case 5: // '\005'
			zzb(parcel.readString(), parcel.readString());
	//   56  186:aload_0         
	//   57  187:aload_2         
	//   58  188:invokevirtual   #46  <Method String Parcel.readString()>
	//   59  191:aload_2         
	//   60  192:invokevirtual   #46  <Method String Parcel.readString()>
	//   61  195:invokevirtual   #80  <Method void zzb(String, String)>
			break;

	//*  62  198:goto            268
		case 4: // '\004'
			zza(parcel.readString(), parcel.readDouble(), zzc.zza(parcel));
	//   63  201:aload_0         
	//   64  202:aload_2         
	//   65  203:invokevirtual   #46  <Method String Parcel.readString()>
	//   66  206:aload_2         
	//   67  207:invokevirtual   #84  <Method double Parcel.readDouble()>
	//   68  210:aload_2         
	//   69  211:invokestatic    #87  <Method boolean zzc.zza(Parcel)>
	//   70  214:invokevirtual   #90  <Method void zza(String, double, boolean)>
			break;

	//*  71  217:goto            268
		case 3: // '\003'
			zzf(parcel.readInt());
	//   72  220:aload_0         
	//   73  221:aload_2         
	//   74  222:invokevirtual   #57  <Method int Parcel.readInt()>
	//   75  225:invokevirtual   #93  <Method void zzf(int)>
			break;

	//*  76  228:goto            268
		case 2: // '\002'
			zza((ApplicationMetadata)zzc.zza(parcel, ApplicationMetadata.CREATOR), parcel.readString(), parcel.readString(), zzc.zza(parcel));
	//   77  231:aload_0         
	//   78  232:aload_2         
	//   79  233:getstatic       #96  <Field android.os.Parcelable$Creator ApplicationMetadata.CREATOR>
	//   80  236:invokestatic    #30  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   81  239:checkcast       #95  <Class ApplicationMetadata>
	//   82  242:aload_2         
	//   83  243:invokevirtual   #46  <Method String Parcel.readString()>
	//   84  246:aload_2         
	//   85  247:invokevirtual   #46  <Method String Parcel.readString()>
	//   86  250:aload_2         
	//   87  251:invokestatic    #87  <Method boolean zzc.zza(Parcel)>
	//   88  254:invokevirtual   #99  <Method void zza(ApplicationMetadata, String, String, boolean)>
			break;

	//*  89  257:goto            268
		case 1: // '\001'
			zzn(parcel.readInt());
	//   90  260:aload_0         
	//   91  261:aload_2         
	//   92  262:invokevirtual   #57  <Method int Parcel.readInt()>
	//   93  265:invokevirtual   #102 <Method void zzn(int)>
			break;
		}
		return true;
	//   94  268:iconst_1        
	//   95  269:ireturn         
	}
}

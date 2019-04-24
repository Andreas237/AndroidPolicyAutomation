// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzaen, zzaey, zzel, 
//			zzaet, zzaeu, zzaef, zzaeq, 
//			zzaes

public abstract class zzaeo extends zzek
	implements zzaen
{

	public zzaeo()
	{
		super("com.google.android.gms.ads.internal.request.IAdRequestService");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
label0:
		{
label1:
			{
				zzaey zzaey2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
				Object obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
				Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
				switch(i)
	//*   6    9:iload_1         
				{
	//*   7   10:tableswitch     1 5: default 44
	//	               1 269
	//	               2 192
	//	               3 44
	//	               4 119
	//	               5 46
				case 3: // '\003'
				default:
					return false;
	//    8   44:iconst_0        
	//    9   45:ireturn         

				case 1: // '\001'
					break label1;

				case 5: // '\005'
					zzaey2 = (zzaey)zzel.zza(parcel, zzaey.CREATOR);
	//   10   46:aload_2         
	//   11   47:getstatic       #24  <Field android.os.Parcelable$Creator zzaey.CREATOR>
	//   12   50:invokestatic    #30  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   13   53:checkcast       #20  <Class zzaey>
	//   14   56:astore          6
					parcel = ((Parcel) (parcel.readStrongBinder()));
	//   15   58:aload_2         
	//   16   59:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//   17   62:astore_2        
					if(parcel == null)
	//*  18   63:aload_2         
	//*  19   64:ifnonnull       73
					{
						parcel = ((Parcel) (obj));
	//   20   67:aload           5
	//   21   69:astore_2        
					} else
	//*  22   70:goto            109
					{
						android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
	//   23   73:aload_2         
	//   24   74:ldc1            #38  <String "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener">
	//   25   76:invokeinterface #44  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   26   81:astore          5
						if(iinterface instanceof zzaet)
	//*  27   83:aload           5
	//*  28   85:instanceof      #46  <Class zzaet>
	//*  29   88:ifeq            100
							parcel = ((Parcel) ((zzaet)iinterface));
	//   30   91:aload           5
	//   31   93:checkcast       #46  <Class zzaet>
	//   32   96:astore_2        
						else
	//*  33   97:goto            109
							parcel = ((Parcel) (new zzaeu(((IBinder) (parcel)))));
	//   34  100:new             #48  <Class zzaeu>
	//   35  103:dup             
	//   36  104:aload_2         
	//   37  105:invokespecial   #51  <Method void zzaeu(IBinder)>
	//   38  108:astore_2        
					}
					zzb(zzaey2, ((zzaet) (parcel)));
	//   39  109:aload_0         
	//   40  110:aload           6
	//   41  112:aload_2         
	//   42  113:invokevirtual   #55  <Method void zzb(zzaey, zzaet)>
					break;
	//   43  116:goto            262

				case 4: // '\004'
					zzaey zzaey1 = (zzaey)zzel.zza(parcel, zzaey.CREATOR);
	//   44  119:aload_2         
	//   45  120:getstatic       #24  <Field android.os.Parcelable$Creator zzaey.CREATOR>
	//   46  123:invokestatic    #30  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   47  126:checkcast       #20  <Class zzaey>
	//   48  129:astore          5
					parcel = ((Parcel) (parcel.readStrongBinder()));
	//   49  131:aload_2         
	//   50  132:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//   51  135:astore_2        
					if(parcel == null)
	//*  52  136:aload_2         
	//*  53  137:ifnonnull       146
					{
						parcel = ((Parcel) (zzaey2));
	//   54  140:aload           6
	//   55  142:astore_2        
					} else
	//*  56  143:goto            182
					{
						android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
	//   57  146:aload_2         
	//   58  147:ldc1            #38  <String "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener">
	//   59  149:invokeinterface #44  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   60  154:astore          6
						if(iinterface1 instanceof zzaet)
	//*  61  156:aload           6
	//*  62  158:instanceof      #46  <Class zzaet>
	//*  63  161:ifeq            173
							parcel = ((Parcel) ((zzaet)iinterface1));
	//   64  164:aload           6
	//   65  166:checkcast       #46  <Class zzaet>
	//   66  169:astore_2        
						else
	//*  67  170:goto            182
							parcel = ((Parcel) (new zzaeu(((IBinder) (parcel)))));
	//   68  173:new             #48  <Class zzaeu>
	//   69  176:dup             
	//   70  177:aload_2         
	//   71  178:invokespecial   #51  <Method void zzaeu(IBinder)>
	//   72  181:astore_2        
					}
					zza(zzaey1, ((zzaet) (parcel)));
	//   73  182:aload_0         
	//   74  183:aload           5
	//   75  185:aload_2         
	//   76  186:invokevirtual   #57  <Method void zza(zzaey, zzaet)>
					break;
	//   77  189:goto            262

				case 2: // '\002'
					zzaef zzaef1 = (zzaef)zzel.zza(parcel, zzaef.CREATOR);
	//   78  192:aload_2         
	//   79  193:getstatic       #60  <Field android.os.Parcelable$Creator zzaef.CREATOR>
	//   80  196:invokestatic    #30  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   81  199:checkcast       #59  <Class zzaef>
	//   82  202:astore          5
					parcel = ((Parcel) (parcel.readStrongBinder()));
	//   83  204:aload_2         
	//   84  205:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//   85  208:astore_2        
					if(parcel == null)
	//*  86  209:aload_2         
	//*  87  210:ifnonnull       219
					{
						parcel = ((Parcel) (obj1));
	//   88  213:aload           7
	//   89  215:astore_2        
					} else
	//*  90  216:goto            255
					{
						android.os.IInterface iinterface2 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
	//   91  219:aload_2         
	//   92  220:ldc1            #62  <String "com.google.android.gms.ads.internal.request.IAdResponseListener">
	//   93  222:invokeinterface #44  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   94  227:astore          6
						if(iinterface2 instanceof zzaeq)
	//*  95  229:aload           6
	//*  96  231:instanceof      #64  <Class zzaeq>
	//*  97  234:ifeq            246
							parcel = ((Parcel) ((zzaeq)iinterface2));
	//   98  237:aload           6
	//   99  239:checkcast       #64  <Class zzaeq>
	//  100  242:astore_2        
						else
	//* 101  243:goto            255
							parcel = ((Parcel) (new zzaes(((IBinder) (parcel)))));
	//  102  246:new             #66  <Class zzaes>
	//  103  249:dup             
	//  104  250:aload_2         
	//  105  251:invokespecial   #67  <Method void zzaes(IBinder)>
	//  106  254:astore_2        
					}
					zza(zzaef1, ((zzaeq) (parcel)));
	//  107  255:aload_0         
	//  108  256:aload           5
	//  109  258:aload_2         
	//  110  259:invokevirtual   #70  <Method void zza(zzaef, zzaeq)>
					break;
				}
				parcel1.writeNoException();
	//  111  262:aload_3         
	//  112  263:invokevirtual   #73  <Method void Parcel.writeNoException()>
				break label0;
	//  113  266:goto            293
			}
			parcel = ((Parcel) (zzb((zzaef)zzel.zza(parcel, zzaef.CREATOR))));
	//  114  269:aload_0         
	//  115  270:aload_2         
	//  116  271:getstatic       #60  <Field android.os.Parcelable$Creator zzaef.CREATOR>
	//  117  274:invokestatic    #30  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//  118  277:checkcast       #59  <Class zzaef>
	//  119  280:invokevirtual   #76  <Method zzaej zzb(zzaef)>
	//  120  283:astore_2        
			parcel1.writeNoException();
	//  121  284:aload_3         
	//  122  285:invokevirtual   #73  <Method void Parcel.writeNoException()>
			zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//  123  288:aload_3         
	//  124  289:aload_2         
	//  125  290:invokestatic    #79  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
		}
		return true;
	//  126  293:iconst_1        
	//  127  294:ireturn         
	}
}

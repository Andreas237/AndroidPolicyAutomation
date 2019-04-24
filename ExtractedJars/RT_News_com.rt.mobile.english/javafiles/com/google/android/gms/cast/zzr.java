// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.cast.*;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.cast:
//			zzq, CastRemoteDisplayClient

final class zzr extends CastRemoteDisplayClient.zza
{

	zzr(zzq zzq1, TaskCompletionSource taskcompletionsource, zzdz zzdz1)
	{
		zzbl = zzq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzq zzbl>
		zzbj = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field TaskCompletionSource zzbj>
		zzbk = zzdz1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #18  <Field zzdz zzbk>
		super(((zzp) (null)));
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:invokespecial   #21  <Method void CastRemoteDisplayClient$zza(zzp)>
	//   12   20:return          
	}

	public final void onError(int i)
		throws RemoteException
	{
		CastRemoteDisplayClient.zza(zzbl.zzbi).d("onError: %d", new Object[] {
			Integer.valueOf(i)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzq zzbl>
	//    2    4:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//    3    7:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//    4   10:ldc1            #40  <String "onError: %d">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:iload_1         
	//   10   19:invokestatic    #48  <Method Integer Integer.valueOf(int)>
	//   11   22:aastore         
	//   12   23:invokevirtual   #54  <Method void zzdg.d(String, Object[])>
		CastRemoteDisplayClient.zzb(zzbl.zzbi);
	//   13   26:aload_0         
	//   14   27:getfield        #14  <Field zzq zzbl>
	//   15   30:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   16   33:invokestatic    #58  <Method void CastRemoteDisplayClient.zzb(CastRemoteDisplayClient)>
		TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, ((Object) (null)), zzbj);
	//   17   36:getstatic       #64  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   18   39:aconst_null     
	//   19   40:aload_0         
	//   20   41:getfield        #16  <Field TaskCompletionSource zzbj>
	//   21   44:invokestatic    #70  <Method void TaskUtil.setResultOrApiException(Status, Object, TaskCompletionSource)>
	//   22   47:return          
	}

	public final void zza(int i, int j, Surface surface)
		throws RemoteException
	{
		Object obj;
		CastRemoteDisplayClient.zza(zzbl.zzbi).d("onConnected", new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzq zzbl>
	//    2    4:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//    3    7:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//    4   10:ldc1            #76  <String "onConnected">
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #54  <Method void zzdg.d(String, Object[])>
		obj = ((Object) ((DisplayManager)zzbl.zzbi.getApplicationContext().getSystemService("display")));
	//    8   19:aload_0         
	//    9   20:getfield        #14  <Field zzq zzbl>
	//   10   23:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   11   26:invokevirtual   #80  <Method Context CastRemoteDisplayClient.getApplicationContext()>
	//   12   29:ldc1            #82  <String "display">
	//   13   31:invokevirtual   #88  <Method Object Context.getSystemService(String)>
	//   14   34:checkcast       #90  <Class DisplayManager>
	//   15   37:astore          5
		if(obj != null) goto _L2; else goto _L1
	//   16   39:aload           5
	//   17   41:ifnonnull       81
_L1:
		surface = ((Surface) (CastRemoteDisplayClient.zza(zzbl.zzbi)));
	//   18   44:aload_0         
	//   19   45:getfield        #14  <Field zzq zzbl>
	//   20   48:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   21   51:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//   22   54:astore_3        
		obj = "Unable to get the display manager";
	//   23   55:ldc1            #92  <String "Unable to get the display manager">
	//   24   57:astore          5
_L4:
		((zzdg) (surface)).e(((String) (obj)), new Object[0]);
	//   25   59:aload_3         
	//   26   60:aload           5
	//   27   62:iconst_0        
	//   28   63:anewarray       Object[]
	//   29   66:invokevirtual   #95  <Method void zzdg.e(String, Object[])>
		TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, ((Object) (null)), zzbj);
	//   30   69:getstatic       #64  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   31   72:aconst_null     
	//   32   73:aload_0         
	//   33   74:getfield        #16  <Field TaskCompletionSource zzbj>
	//   34   77:invokestatic    #70  <Method void TaskUtil.setResultOrApiException(Status, Object, TaskCompletionSource)>
		return;
	//   35   80:return          
_L2:
		CastRemoteDisplayClient.zzb(zzbl.zzbi);
	//   36   81:aload_0         
	//   37   82:getfield        #14  <Field zzq zzbl>
	//   38   85:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   39   88:invokestatic    #58  <Method void CastRemoteDisplayClient.zzb(CastRemoteDisplayClient)>
		int k = CastRemoteDisplayClient.zza(zzbl.zzbi, i, j);
	//   40   91:aload_0         
	//   41   92:getfield        #14  <Field zzq zzbl>
	//   42   95:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   43   98:iload_1         
	//   44   99:iload_2         
	//   45  100:invokestatic    #98  <Method int CastRemoteDisplayClient.zza(CastRemoteDisplayClient, int, int)>
	//   46  103:istore          4
		CastRemoteDisplayClient.zza(zzbl.zzbi, ((DisplayManager) (obj)).createVirtualDisplay("private_display", i, j, k, surface, 2));
	//   47  105:aload_0         
	//   48  106:getfield        #14  <Field zzq zzbl>
	//   49  109:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   50  112:aload           5
	//   51  114:ldc1            #100 <String "private_display">
	//   52  116:iload_1         
	//   53  117:iload_2         
	//   54  118:iload           4
	//   55  120:aload_3         
	//   56  121:iconst_2        
	//   57  122:invokevirtual   #104 <Method VirtualDisplay DisplayManager.createVirtualDisplay(String, int, int, int, Surface, int)>
	//   58  125:invokestatic    #107 <Method VirtualDisplay CastRemoteDisplayClient.zza(CastRemoteDisplayClient, VirtualDisplay)>
	//   59  128:pop             
		if(CastRemoteDisplayClient.zzc(zzbl.zzbi) == null)
	//*  60  129:aload_0         
	//*  61  130:getfield        #14  <Field zzq zzbl>
	//*  62  133:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//*  63  136:invokestatic    #111 <Method VirtualDisplay CastRemoteDisplayClient.zzc(CastRemoteDisplayClient)>
	//*  64  139:ifnonnull       160
		{
			surface = ((Surface) (CastRemoteDisplayClient.zza(zzbl.zzbi)));
	//   65  142:aload_0         
	//   66  143:getfield        #14  <Field zzq zzbl>
	//   67  146:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   68  149:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//   69  152:astore_3        
			obj = "Unable to create virtual display";
	//   70  153:ldc1            #113 <String "Unable to create virtual display">
	//   71  155:astore          5
			continue; /* Loop/switch isn't completed */
	//   72  157:goto            59
		}
		surface = ((Surface) (CastRemoteDisplayClient.zzc(zzbl.zzbi).getDisplay()));
	//   73  160:aload_0         
	//   74  161:getfield        #14  <Field zzq zzbl>
	//   75  164:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   76  167:invokestatic    #111 <Method VirtualDisplay CastRemoteDisplayClient.zzc(CastRemoteDisplayClient)>
	//   77  170:invokevirtual   #119 <Method Display VirtualDisplay.getDisplay()>
	//   78  173:astore_3        
		if(surface == null)
	//*  79  174:aload_3         
	//*  80  175:ifnonnull       196
		{
			surface = ((Surface) (CastRemoteDisplayClient.zza(zzbl.zzbi)));
	//   81  178:aload_0         
	//   82  179:getfield        #14  <Field zzq zzbl>
	//   83  182:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   84  185:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//   85  188:astore_3        
			obj = "Virtual display does not have a display";
	//   86  189:ldc1            #121 <String "Virtual display does not have a display">
	//   87  191:astore          5
			continue; /* Loop/switch isn't completed */
	//   88  193:goto            59
		}
		try
		{
			((zzee)zzbk.getService()).zza(((com.google.android.gms.internal.cast.zzec) (this)), ((Display) (surface)).getDisplayId());
	//   89  196:aload_0         
	//   90  197:getfield        #18  <Field zzdz zzbk>
	//   91  200:invokevirtual   #127 <Method android.os.IInterface zzdz.getService()>
	//   92  203:checkcast       #129 <Class zzee>
	//   93  206:aload_0         
	//   94  207:aload_3         
	//   95  208:invokevirtual   #135 <Method int Display.getDisplayId()>
	//   96  211:invokeinterface #138 <Method void zzee.zza(com.google.android.gms.internal.cast.zzec, int)>
			return;
	//   97  216:return          
		}
	//*  98  217:aload_0         
	//*  99  218:getfield        #14  <Field zzq zzbl>
	//* 100  221:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//* 101  224:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//* 102  227:astore_3        
	//* 103  228:ldc1            #140 <String "Unable to provision the route's new virtual Display">
	//* 104  230:astore          5
	//* 105  232:goto            59
		// Misplaced declaration of an exception variable
		catch(Surface surface)
		{
			surface = ((Surface) (CastRemoteDisplayClient.zza(zzbl.zzbi)));
		}
		obj = "Unable to provision the route's new virtual Display";
		if(true) goto _L4; else goto _L3
_L3:
	//* 106  235:astore_3        
	//* 107  236:goto            217
	}

	public final void zzc()
	{
		CastRemoteDisplayClient.zza(zzbl.zzbi).d("onConnectedWithDisplay", new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzq zzbl>
	//    2    4:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//    3    7:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//    4   10:ldc1            #143 <String "onConnectedWithDisplay">
	//    5   12:iconst_0        
	//    6   13:anewarray       Object[]
	//    7   16:invokevirtual   #54  <Method void zzdg.d(String, Object[])>
		if(CastRemoteDisplayClient.zzc(zzbl.zzbi) == null)
	//*   8   19:aload_0         
	//*   9   20:getfield        #14  <Field zzq zzbl>
	//*  10   23:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//*  11   26:invokestatic    #111 <Method VirtualDisplay CastRemoteDisplayClient.zzc(CastRemoteDisplayClient)>
	//*  12   29:ifnonnull       63
		{
			CastRemoteDisplayClient.zza(zzbl.zzbi).e("There is no virtual display", new Object[0]);
	//   13   32:aload_0         
	//   14   33:getfield        #14  <Field zzq zzbl>
	//   15   36:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   16   39:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//   17   42:ldc1            #145 <String "There is no virtual display">
	//   18   44:iconst_0        
	//   19   45:anewarray       Object[]
	//   20   48:invokevirtual   #95  <Method void zzdg.e(String, Object[])>
			TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, ((Object) (null)), zzbj);
	//   21   51:getstatic       #64  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   22   54:aconst_null     
	//   23   55:aload_0         
	//   24   56:getfield        #16  <Field TaskCompletionSource zzbj>
	//   25   59:invokestatic    #70  <Method void TaskUtil.setResultOrApiException(Status, Object, TaskCompletionSource)>
			return;
	//   26   62:return          
		}
		Display display = CastRemoteDisplayClient.zzc(zzbl.zzbi).getDisplay();
	//   27   63:aload_0         
	//   28   64:getfield        #14  <Field zzq zzbl>
	//   29   67:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   30   70:invokestatic    #111 <Method VirtualDisplay CastRemoteDisplayClient.zzc(CastRemoteDisplayClient)>
	//   31   73:invokevirtual   #119 <Method Display VirtualDisplay.getDisplay()>
	//   32   76:astore_1        
		if(display != null)
	//*  33   77:aload_1         
	//*  34   78:ifnull          93
		{
			TaskUtil.setResultOrApiException(Status.RESULT_SUCCESS, ((Object) (display)), zzbj);
	//   35   81:getstatic       #148 <Field Status Status.RESULT_SUCCESS>
	//   36   84:aload_1         
	//   37   85:aload_0         
	//   38   86:getfield        #16  <Field TaskCompletionSource zzbj>
	//   39   89:invokestatic    #70  <Method void TaskUtil.setResultOrApiException(Status, Object, TaskCompletionSource)>
			return;
	//   40   92:return          
		} else
		{
			CastRemoteDisplayClient.zza(zzbl.zzbi).e("Virtual display no longer has a display", new Object[0]);
	//   41   93:aload_0         
	//   42   94:getfield        #14  <Field zzq zzbl>
	//   43   97:getfield        #32  <Field CastRemoteDisplayClient zzq.zzbi>
	//   44  100:invokestatic    #38  <Method zzdg CastRemoteDisplayClient.zza(CastRemoteDisplayClient)>
	//   45  103:ldc1            #150 <String "Virtual display no longer has a display">
	//   46  105:iconst_0        
	//   47  106:anewarray       Object[]
	//   48  109:invokevirtual   #95  <Method void zzdg.e(String, Object[])>
			TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, ((Object) (null)), zzbj);
	//   49  112:getstatic       #64  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   50  115:aconst_null     
	//   51  116:aload_0         
	//   52  117:getfield        #16  <Field TaskCompletionSource zzbj>
	//   53  120:invokestatic    #70  <Method void TaskUtil.setResultOrApiException(Status, Object, TaskCompletionSource)>
			return;
	//   54  123:return          
		}
	}

	private final TaskCompletionSource zzbj;
	private final zzdz zzbk;
	private final zzq zzbl;
}

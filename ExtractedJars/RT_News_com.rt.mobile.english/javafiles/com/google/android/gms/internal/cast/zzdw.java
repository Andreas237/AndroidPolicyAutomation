// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdu, zzdq, zzdg, zzdv, 
//			zzdy, zzea, zzee

public final class zzdw extends zzdu
{

	public zzdw(zzdv zzdv1, zzea zzea1)
	{
		zzxx = zzdv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzdv zzxx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void zzdu()>
		zzxw = zzea1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field zzea zzxw>
	//    8   14:return          
	}

	public final void onError(int i)
		throws RemoteException
	{
		zzdq.zzdd().d("onError: %d", new Object[] {
			Integer.valueOf(i)
		});
	//    0    0:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//    1    3:ldc1            #33  <String "onError: %d">
	//    2    5:iconst_1        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:iload_1         
	//    7   12:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:invokevirtual   #47  <Method void zzdg.d(String, Object[])>
		zzdq.zza(zzxx.zzxu);
	//   10   19:aload_0         
	//   11   20:getfield        #15  <Field zzdv zzxx>
	//   12   23:getfield        #53  <Field zzdq zzdv.zzxu>
	//   13   26:invokestatic    #57  <Method void zzdq.zza(zzdq)>
		zzxx.setResult(((com.google.android.gms.common.api.Result) (new zzdy(Status.RESULT_INTERNAL_ERROR))));
	//   14   29:aload_0         
	//   15   30:getfield        #15  <Field zzdv zzxx>
	//   16   33:new             #59  <Class zzdy>
	//   17   36:dup             
	//   18   37:getstatic       #65  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   19   40:invokespecial   #68  <Method void zzdy(Status)>
	//   20   43:invokevirtual   #72  <Method void zzdv.setResult(com.google.android.gms.common.api.Result)>
	//   21   46:return          
	}

	public final void zza(int i, int j, Surface surface)
	{
		Object obj;
		zzdq.zzdd().d("onConnected", new Object[0]);
	//    0    0:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//    1    3:ldc1            #78  <String "onConnected">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #47  <Method void zzdg.d(String, Object[])>
		obj = ((Object) ((DisplayManager)zzxw.getContext().getSystemService("display")));
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field zzea zzxw>
	//    7   16:invokevirtual   #84  <Method Context zzea.getContext()>
	//    8   19:ldc1            #86  <String "display">
	//    9   21:invokevirtual   #92  <Method Object Context.getSystemService(String)>
	//   10   24:checkcast       #94  <Class DisplayManager>
	//   11   27:astore          5
		if(obj != null) goto _L2; else goto _L1
	//   12   29:aload           5
	//   13   31:ifnonnull       70
_L1:
		zzdq.zzdd().e("Unable to get the display manager", new Object[0]);
	//   14   34:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//   15   37:ldc1            #96  <String "Unable to get the display manager">
	//   16   39:iconst_0        
	//   17   40:anewarray       Object[]
	//   18   43:invokevirtual   #99  <Method void zzdg.e(String, Object[])>
		surface = ((Surface) (zzxx));
	//   19   46:aload_0         
	//   20   47:getfield        #15  <Field zzdv zzxx>
	//   21   50:astore_3        
		obj = ((Object) (new zzdy(Status.RESULT_INTERNAL_ERROR)));
	//   22   51:new             #59  <Class zzdy>
	//   23   54:dup             
	//   24   55:getstatic       #65  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   25   58:invokespecial   #68  <Method void zzdy(Status)>
	//   26   61:astore          5
_L4:
		((zzdv) (surface)).setResult(((com.google.android.gms.common.api.Result) (obj)));
	//   27   63:aload_3         
	//   28   64:aload           5
	//   29   66:invokevirtual   #72  <Method void zzdv.setResult(com.google.android.gms.common.api.Result)>
		return;
	//   30   69:return          
_L2:
		zzdq.zza(zzxx.zzxu);
	//   31   70:aload_0         
	//   32   71:getfield        #15  <Field zzdv zzxx>
	//   33   74:getfield        #53  <Field zzdq zzdv.zzxu>
	//   34   77:invokestatic    #57  <Method void zzdq.zza(zzdq)>
		int k;
		if(i < j)
	//*  35   80:iload_1         
	//*  36   81:iload_2         
	//*  37   82:icmpge          91
			k = i;
	//   38   85:iload_1         
	//   39   86:istore          4
		else
	//*  40   88:goto            94
			k = j;
	//   41   91:iload_2         
	//   42   92:istore          4
		k = (k * 320) / 1080;
	//   43   94:iload           4
	//   44   96:sipush          320
	//   45   99:imul            
	//   46  100:sipush          1080
	//   47  103:idiv            
	//   48  104:istore          4
		zzdq.zza(zzxx.zzxu, ((DisplayManager) (obj)).createVirtualDisplay("private_display", i, j, k, surface, 2));
	//   49  106:aload_0         
	//   50  107:getfield        #15  <Field zzdv zzxx>
	//   51  110:getfield        #53  <Field zzdq zzdv.zzxu>
	//   52  113:aload           5
	//   53  115:ldc1            #101 <String "private_display">
	//   54  117:iload_1         
	//   55  118:iload_2         
	//   56  119:iload           4
	//   57  121:aload_3         
	//   58  122:iconst_2        
	//   59  123:invokevirtual   #105 <Method VirtualDisplay DisplayManager.createVirtualDisplay(String, int, int, int, Surface, int)>
	//   60  126:invokestatic    #108 <Method VirtualDisplay zzdq.zza(zzdq, VirtualDisplay)>
	//   61  129:pop             
		if(zzdq.zzd(zzxx.zzxu) == null)
	//*  62  130:aload_0         
	//*  63  131:getfield        #15  <Field zzdv zzxx>
	//*  64  134:getfield        #53  <Field zzdq zzdv.zzxu>
	//*  65  137:invokestatic    #112 <Method VirtualDisplay zzdq.zzd(zzdq)>
	//*  66  140:ifnonnull       175
		{
			zzdq.zzdd().e("Unable to create virtual display", new Object[0]);
	//   67  143:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//   68  146:ldc1            #114 <String "Unable to create virtual display">
	//   69  148:iconst_0        
	//   70  149:anewarray       Object[]
	//   71  152:invokevirtual   #99  <Method void zzdg.e(String, Object[])>
			surface = ((Surface) (zzxx));
	//   72  155:aload_0         
	//   73  156:getfield        #15  <Field zzdv zzxx>
	//   74  159:astore_3        
			obj = ((Object) (new zzdy(Status.RESULT_INTERNAL_ERROR)));
	//   75  160:new             #59  <Class zzdy>
	//   76  163:dup             
	//   77  164:getstatic       #65  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   78  167:invokespecial   #68  <Method void zzdy(Status)>
	//   79  170:astore          5
			continue; /* Loop/switch isn't completed */
	//   80  172:goto            63
		}
		if(zzdq.zzd(zzxx.zzxu).getDisplay() == null)
	//*  81  175:aload_0         
	//*  82  176:getfield        #15  <Field zzdv zzxx>
	//*  83  179:getfield        #53  <Field zzdq zzdv.zzxu>
	//*  84  182:invokestatic    #112 <Method VirtualDisplay zzdq.zzd(zzdq)>
	//*  85  185:invokevirtual   #120 <Method Display VirtualDisplay.getDisplay()>
	//*  86  188:ifnonnull       223
		{
			zzdq.zzdd().e("Virtual display does not have a display", new Object[0]);
	//   87  191:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//   88  194:ldc1            #122 <String "Virtual display does not have a display">
	//   89  196:iconst_0        
	//   90  197:anewarray       Object[]
	//   91  200:invokevirtual   #99  <Method void zzdg.e(String, Object[])>
			surface = ((Surface) (zzxx));
	//   92  203:aload_0         
	//   93  204:getfield        #15  <Field zzdv zzxx>
	//   94  207:astore_3        
			obj = ((Object) (new zzdy(Status.RESULT_INTERNAL_ERROR)));
	//   95  208:new             #59  <Class zzdy>
	//   96  211:dup             
	//   97  212:getstatic       #65  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   98  215:invokespecial   #68  <Method void zzdy(Status)>
	//   99  218:astore          5
			continue; /* Loop/switch isn't completed */
	//  100  220:goto            63
		}
		try
		{
			surface = ((Surface) (zzxw));
	//  101  223:aload_0         
	//  102  224:getfield        #20  <Field zzea zzxw>
	//  103  227:astore_3        
			i = zzdq.zzd(zzxx.zzxu).getDisplay().getDisplayId();
	//  104  228:aload_0         
	//  105  229:getfield        #15  <Field zzdv zzxx>
	//  106  232:getfield        #53  <Field zzdq zzdv.zzxu>
	//  107  235:invokestatic    #112 <Method VirtualDisplay zzdq.zzd(zzdq)>
	//  108  238:invokevirtual   #120 <Method Display VirtualDisplay.getDisplay()>
	//  109  241:invokevirtual   #128 <Method int Display.getDisplayId()>
	//  110  244:istore_1        
			((zzee)((zzea) (surface)).getService()).zza(((zzec) (this)), i);
	//  111  245:aload_3         
	//  112  246:invokevirtual   #132 <Method android.os.IInterface zzea.getService()>
	//  113  249:checkcast       #134 <Class zzee>
	//  114  252:aload_0         
	//  115  253:iload_1         
	//  116  254:invokeinterface #137 <Method void zzee.zza(zzec, int)>
			return;
	//  117  259:return          
		}
	//* 118  260:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//* 119  263:ldc1            #139 <String "Unable to provision the route's new virtual Display">
	//* 120  265:iconst_0        
	//* 121  266:anewarray       Object[]
	//* 122  269:invokevirtual   #99  <Method void zzdg.e(String, Object[])>
	//* 123  272:aload_0         
	//* 124  273:getfield        #15  <Field zzdv zzxx>
	//* 125  276:astore_3        
	//* 126  277:new             #59  <Class zzdy>
	//* 127  280:dup             
	//* 128  281:getstatic       #65  <Field Status Status.RESULT_INTERNAL_ERROR>
	//* 129  284:invokespecial   #68  <Method void zzdy(Status)>
	//* 130  287:astore          5
	//* 131  289:goto            63
		// Misplaced declaration of an exception variable
		catch(Surface surface)
		{
			zzdq.zzdd().e("Unable to provision the route's new virtual Display", new Object[0]);
		}
		surface = ((Surface) (zzxx));
		obj = ((Object) (new zzdy(Status.RESULT_INTERNAL_ERROR)));
		if(true) goto _L4; else goto _L3
_L3:
	//* 132  292:astore_3        
	//* 133  293:goto            260
	}

	public final void zzc()
	{
		zzdq.zzdd().d("onConnectedWithDisplay", new Object[0]);
	//    0    0:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//    1    3:ldc1            #142 <String "onConnectedWithDisplay">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #47  <Method void zzdg.d(String, Object[])>
		if(zzdq.zzd(zzxx.zzxu) == null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #15  <Field zzdv zzxx>
	//*   7   16:getfield        #53  <Field zzdq zzdv.zzxu>
	//*   8   19:invokestatic    #112 <Method VirtualDisplay zzdq.zzd(zzdq)>
	//*   9   22:ifnonnull       55
		{
			zzdq.zzdd().e("There is no virtual display", new Object[0]);
	//   10   25:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//   11   28:ldc1            #144 <String "There is no virtual display">
	//   12   30:iconst_0        
	//   13   31:anewarray       Object[]
	//   14   34:invokevirtual   #99  <Method void zzdg.e(String, Object[])>
			zzxx.setResult(((com.google.android.gms.common.api.Result) (new zzdy(Status.RESULT_INTERNAL_ERROR))));
	//   15   37:aload_0         
	//   16   38:getfield        #15  <Field zzdv zzxx>
	//   17   41:new             #59  <Class zzdy>
	//   18   44:dup             
	//   19   45:getstatic       #65  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   20   48:invokespecial   #68  <Method void zzdy(Status)>
	//   21   51:invokevirtual   #72  <Method void zzdv.setResult(com.google.android.gms.common.api.Result)>
			return;
	//   22   54:return          
		}
		Display display = zzdq.zzd(zzxx.zzxu).getDisplay();
	//   23   55:aload_0         
	//   24   56:getfield        #15  <Field zzdv zzxx>
	//   25   59:getfield        #53  <Field zzdq zzdv.zzxu>
	//   26   62:invokestatic    #112 <Method VirtualDisplay zzdq.zzd(zzdq)>
	//   27   65:invokevirtual   #120 <Method Display VirtualDisplay.getDisplay()>
	//   28   68:astore_1        
		if(display != null)
	//*  29   69:aload_1         
	//*  30   70:ifnull          89
		{
			zzxx.setResult(((com.google.android.gms.common.api.Result) (new zzdy(display))));
	//   31   73:aload_0         
	//   32   74:getfield        #15  <Field zzdv zzxx>
	//   33   77:new             #59  <Class zzdy>
	//   34   80:dup             
	//   35   81:aload_1         
	//   36   82:invokespecial   #147 <Method void zzdy(Display)>
	//   37   85:invokevirtual   #72  <Method void zzdv.setResult(com.google.android.gms.common.api.Result)>
			return;
	//   38   88:return          
		} else
		{
			zzdq.zzdd().e("Virtual display no longer has a display", new Object[0]);
	//   39   89:invokestatic    #31  <Method zzdg zzdq.zzdd()>
	//   40   92:ldc1            #149 <String "Virtual display no longer has a display">
	//   41   94:iconst_0        
	//   42   95:anewarray       Object[]
	//   43   98:invokevirtual   #99  <Method void zzdg.e(String, Object[])>
			zzxx.setResult(((com.google.android.gms.common.api.Result) (new zzdy(Status.RESULT_INTERNAL_ERROR))));
	//   44  101:aload_0         
	//   45  102:getfield        #15  <Field zzdv zzxx>
	//   46  105:new             #59  <Class zzdy>
	//   47  108:dup             
	//   48  109:getstatic       #65  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   49  112:invokespecial   #68  <Method void zzdy(Status)>
	//   50  115:invokevirtual   #72  <Method void zzdv.setResult(com.google.android.gms.common.api.Result)>
			return;
	//   51  118:return          
		}
	}

	private final zzea zzxw;
	private final zzdv zzxx;
}

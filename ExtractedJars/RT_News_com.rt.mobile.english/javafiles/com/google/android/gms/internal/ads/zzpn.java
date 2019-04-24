// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.os.Bundle;
import android.view.*;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzqb, zzaor, zznk, zzkb, 
//			zzni, zzoy, zzoz, zzamu, 
//			zzpd, zzakb, zzaiy, zzaix, 
//			zzfp, zzakq, zzaqw, zzpo

public final class zzpn extends zzqb
	implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

	public zzpn(FrameLayout framelayout, FrameLayout framelayout1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void zzqb()>
	//    2    4:aload_0         
	//    3    5:new             #62  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #63  <Method void Object()>
	//    6   12:putfield        #65  <Field Object mLock>
		zzbjw = Collections.synchronizedMap(((Map) (new HashMap())));
	//    7   15:aload_0         
	//    8   16:new             #67  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #68  <Method void HashMap()>
	//   11   23:invokestatic    #74  <Method Map Collections.synchronizedMap(Map)>
	//   12   26:putfield        #76  <Field Map zzbjw>
		zzbjy = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #78  <Field boolean zzbjy>
		zzbjz = new Point();
	//   16   34:aload_0         
	//   17   35:new             #80  <Class Point>
	//   18   38:dup             
	//   19   39:invokespecial   #81  <Method void Point()>
	//   20   42:putfield        #83  <Field Point zzbjz>
		zzbka = new Point();
	//   21   45:aload_0         
	//   22   46:new             #80  <Class Point>
	//   23   49:dup             
	//   24   50:invokespecial   #81  <Method void Point()>
	//   25   53:putfield        #85  <Field Point zzbka>
		zzbkb = new WeakReference(((Object) (null)));
	//   26   56:aload_0         
	//   27   57:new             #87  <Class WeakReference>
	//   28   60:dup             
	//   29   61:aconst_null     
	//   30   62:invokespecial   #90  <Method void WeakReference(Object)>
	//   31   65:putfield        #92  <Field WeakReference zzbkb>
		zzbjt = framelayout;
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:putfield        #94  <Field FrameLayout zzbjt>
		zzvh = framelayout1;
	//   35   73:aload_0         
	//   36   74:aload_2         
	//   37   75:putfield        #96  <Field FrameLayout zzvh>
		zzbv.zzfg();
	//   38   78:invokestatic    #102 <Method zzaor zzbv.zzfg()>
	//   39   81:pop             
		zzaor.zza(((View) (zzbjt)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   40   82:aload_0         
	//   41   83:getfield        #94  <Field FrameLayout zzbjt>
	//   42   86:aload_0         
	//   43   87:invokestatic    #108 <Method void zzaor.zza(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		zzbv.zzfg();
	//   44   90:invokestatic    #102 <Method zzaor zzbv.zzfg()>
	//   45   93:pop             
		zzaor.zza(((View) (zzbjt)), ((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   46   94:aload_0         
	//   47   95:getfield        #94  <Field FrameLayout zzbjt>
	//   48   98:aload_0         
	//   49   99:invokestatic    #111 <Method void zzaor.zza(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
		zzbjt.setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//   50  102:aload_0         
	//   51  103:getfield        #94  <Field FrameLayout zzbjt>
	//   52  106:aload_0         
	//   53  107:invokevirtual   #117 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		zzbjt.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   54  110:aload_0         
	//   55  111:getfield        #94  <Field FrameLayout zzbjt>
	//   56  114:aload_0         
	//   57  115:invokevirtual   #121 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		if(framelayout1 != null && PlatformVersion.isAtLeastLollipop())
	//*  58  118:aload_2         
	//*  59  119:ifnull          134
	//*  60  122:invokestatic    #127 <Method boolean PlatformVersion.isAtLeastLollipop()>
	//*  61  125:ifeq            134
			framelayout1.setElevation(3.402823E+38F);
	//   62  128:aload_2         
	//   63  129:ldc1            #128 <Float 3.402823E+38F>
	//   64  131:invokevirtual   #132 <Method void FrameLayout.setElevation(float)>
		zznk.initialize(zzbjt.getContext());
	//   65  134:aload_0         
	//   66  135:getfield        #94  <Field FrameLayout zzbjt>
	//   67  138:invokevirtual   #136 <Method android.content.Context FrameLayout.getContext()>
	//   68  141:invokestatic    #142 <Method void zznk.initialize(android.content.Context)>
		framelayout = ((FrameLayout) (zznk.zzbcd));
	//   69  144:getstatic       #146 <Field zzna zznk.zzbcd>
	//   70  147:astore_1        
		zzbjv = ((Boolean)zzkb.zzik().zzd(((zzna) (framelayout)))).booleanValue();
	//   71  148:aload_0         
	//   72  149:invokestatic    #152 <Method zzni zzkb.zzik()>
	//   73  152:aload_1         
	//   74  153:invokevirtual   #158 <Method Object zzni.zzd(zzna)>
	//   75  156:checkcast       #160 <Class Boolean>
	//   76  159:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//   77  162:putfield        #165 <Field boolean zzbjv>
	//   78  165:return          
	}

	private final void zzkt()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i;
		int j;
		if(zzbjv || !zzbjy)
			break MISSING_BLOCK_LABEL_73;
	//    5    7:aload_0         
	//    6    8:getfield        #165 <Field boolean zzbjv>
	//    7   11:ifne            73
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field boolean zzbjy>
	//   10   18:ifeq            73
		i = zzbjt.getMeasuredWidth();
	//   11   21:aload_0         
	//   12   22:getfield        #94  <Field FrameLayout zzbjt>
	//   13   25:invokevirtual   #171 <Method int FrameLayout.getMeasuredWidth()>
	//   14   28:istore_1        
		j = zzbjt.getMeasuredHeight();
	//   15   29:aload_0         
	//   16   30:getfield        #94  <Field FrameLayout zzbjt>
	//   17   33:invokevirtual   #174 <Method int FrameLayout.getMeasuredHeight()>
	//   18   36:istore_2        
		if(i == 0 || j == 0)
			break MISSING_BLOCK_LABEL_73;
	//   19   37:iload_1         
	//   20   38:ifeq            73
	//   21   41:iload_2         
	//   22   42:ifeq            73
		if(zzvh != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #96  <Field FrameLayout zzvh>
	//*  25   49:ifnull          73
		{
			zzvh.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(i, j))));
	//   26   52:aload_0         
	//   27   53:getfield        #96  <Field FrameLayout zzvh>
	//   28   56:new             #176 <Class android.widget.FrameLayout$LayoutParams>
	//   29   59:dup             
	//   30   60:iload_1         
	//   31   61:iload_2         
	//   32   62:invokespecial   #179 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   33   65:invokevirtual   #183 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			zzbjy = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #78  <Field boolean zzbjy>
		}
		obj;
	//   37   73:aload_3         
		JVM INSTR monitorexit ;
	//   38   74:monitorexit     
		return;
	//   39   75:return          
		Exception exception;
		exception;
	//   40   76:astore          4
		obj;
	//   41   78:aload_3         
		JVM INSTR monitorexit ;
	//   42   79:monitorexit     
		throw exception;
	//   43   80:aload           4
	//   44   82:athrow          
	}

	private final void zzl(View view)
	{
		if(zzbij != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #187 <Field zzoz zzbij>
	//*   2    4:ifnull          47
		{
			zzoz zzoz1;
			if(zzbij instanceof zzoy)
	//*   3    7:aload_0         
	//*   4    8:getfield        #187 <Field zzoz zzbij>
	//*   5   11:instanceof      #189 <Class zzoy>
	//*   6   14:ifeq            31
				zzoz1 = ((zzoy)zzbij).zzkn();
	//    7   17:aload_0         
	//    8   18:getfield        #187 <Field zzoz zzbij>
	//    9   21:checkcast       #189 <Class zzoy>
	//   10   24:invokevirtual   #193 <Method zzoz zzoy.zzkn()>
	//   11   27:astore_2        
			else
	//*  12   28:goto            36
				zzoz1 = zzbij;
	//   13   31:aload_0         
	//   14   32:getfield        #187 <Field zzoz zzbij>
	//   15   35:astore_2        
			if(zzoz1 != null)
	//*  16   36:aload_2         
	//*  17   37:ifnull          47
				zzoz1.zzl(view);
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokeinterface #197 <Method void zzoz.zzl(View)>
		}
	//   21   47:return          
	}

	private final int zzv(int i)
	{
		zzkb.zzif();
	//    0    0:invokestatic    #204 <Method zzamu zzkb.zzif()>
	//    1    3:pop             
		return zzamu.zzb(zzbij.getContext(), i);
	//    2    4:aload_0         
	//    3    5:getfield        #187 <Field zzoz zzbij>
	//    4    8:invokeinterface #205 <Method android.content.Context zzoz.getContext()>
	//    5   13:iload_1         
	//    6   14:invokestatic    #211 <Method int zzamu.zzb(android.content.Context, int)>
	//    7   17:ireturn         
	}

	public final void destroy()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzvh != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #96  <Field FrameLayout zzvh>
	//*   7   11:ifnull          21
				zzvh.removeAllViews();
	//    8   14:aload_0         
	//    9   15:getfield        #96  <Field FrameLayout zzvh>
	//   10   18:invokevirtual   #215 <Method void FrameLayout.removeAllViews()>
			zzvh = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #96  <Field FrameLayout zzvh>
			zzbjw = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #76  <Field Map zzbjw>
			zzbjx = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #217 <Field View zzbjx>
			zzbij = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #187 <Field zzoz zzbij>
			zzbjz = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #83  <Field Point zzbjz>
			zzbka = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #85  <Field Point zzbka>
			zzbkb = null;
	//   29   51:aload_0         
	//   30   52:aconst_null     
	//   31   53:putfield        #92  <Field WeakReference zzbkb>
			zzbju = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #219 <Field View zzbju>
		}
	//   35   61:aload_1         
	//   36   62:monitorexit     
		return;
	//   37   63:return          
		exception;
	//   38   64:astore_2        
		obj;
	//   39   65:aload_1         
		JVM INSTR monitorexit ;
	//   40   66:monitorexit     
		throw exception;
	//   41   67:aload_2         
	//   42   68:athrow          
	}

	public final void onClick(View view)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object mLock>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
			{
				if(zzbij != null)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #187 <Field zzoz zzbij>
	//    7   13:ifnonnull       20
			}
	//    8   16:aload           5
	//    9   18:monitorexit     
			return;
	//   10   19:return          
		}
		zzoz zzoz1;
		Map map;
		FrameLayout framelayout;
		Bundle bundle;
		zzbij.cancelUnconfirmedClick();
	//   11   20:aload_0         
	//   12   21:getfield        #187 <Field zzoz zzbij>
	//   13   24:invokeinterface #223 <Method void zzoz.cancelUnconfirmedClick()>
		bundle = new Bundle();
	//   14   29:new             #225 <Class Bundle>
	//   15   32:dup             
	//   16   33:invokespecial   #226 <Method void Bundle()>
	//   17   36:astore          6
		bundle.putFloat("x", zzv(zzbjz.x));
	//   18   38:aload           6
	//   19   40:ldc1            #228 <String "x">
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #83  <Field Point zzbjz>
	//   23   47:getfield        #231 <Field int Point.x>
	//   24   50:invokespecial   #233 <Method int zzv(int)>
	//   25   53:i2f             
	//   26   54:invokevirtual   #237 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("y", zzv(zzbjz.y));
	//   27   57:aload           6
	//   28   59:ldc1            #239 <String "y">
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #83  <Field Point zzbjz>
	//   32   66:getfield        #241 <Field int Point.y>
	//   33   69:invokespecial   #233 <Method int zzv(int)>
	//   34   72:i2f             
	//   35   73:invokevirtual   #237 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("start_x", zzv(zzbka.x));
	//   36   76:aload           6
	//   37   78:ldc1            #243 <String "start_x">
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:getfield        #85  <Field Point zzbka>
	//   41   85:getfield        #231 <Field int Point.x>
	//   42   88:invokespecial   #233 <Method int zzv(int)>
	//   43   91:i2f             
	//   44   92:invokevirtual   #237 <Method void Bundle.putFloat(String, float)>
		bundle.putFloat("start_y", zzv(zzbka.y));
	//   45   95:aload           6
	//   46   97:ldc1            #245 <String "start_y">
	//   47   99:aload_0         
	//   48  100:aload_0         
	//   49  101:getfield        #85  <Field Point zzbka>
	//   50  104:getfield        #241 <Field int Point.y>
	//   51  107:invokespecial   #233 <Method int zzv(int)>
	//   52  110:i2f             
	//   53  111:invokevirtual   #237 <Method void Bundle.putFloat(String, float)>
		if(zzbjx == null || !((Object) (zzbjx)).equals(((Object) (view))))
			break MISSING_BLOCK_LABEL_213;
	//   54  114:aload_0         
	//   55  115:getfield        #217 <Field View zzbjx>
	//   56  118:ifnull          213
	//   57  121:aload_0         
	//   58  122:getfield        #217 <Field View zzbjx>
	//   59  125:aload_1         
	//   60  126:invokevirtual   #249 <Method boolean Object.equals(Object)>
	//   61  129:ifeq            213
		if(!(zzbij instanceof zzoy))
			break MISSING_BLOCK_LABEL_194;
	//   62  132:aload_0         
	//   63  133:getfield        #187 <Field zzoz zzbij>
	//   64  136:instanceof      #189 <Class zzoy>
	//   65  139:ifeq            194
		if(((zzoy)zzbij).zzkn() == null)
			break MISSING_BLOCK_LABEL_233;
	//   66  142:aload_0         
	//   67  143:getfield        #187 <Field zzoz zzbij>
	//   68  146:checkcast       #189 <Class zzoy>
	//   69  149:invokevirtual   #193 <Method zzoz zzoy.zzkn()>
	//   70  152:ifnull          233
		zzoz1 = ((zzoy)zzbij).zzkn();
	//   71  155:aload_0         
	//   72  156:getfield        #187 <Field zzoz zzbij>
	//   73  159:checkcast       #189 <Class zzoy>
	//   74  162:invokevirtual   #193 <Method zzoz zzoy.zzkn()>
	//   75  165:astore_2        
		map = zzbjw;
	//   76  166:aload_0         
	//   77  167:getfield        #76  <Field Map zzbjw>
	//   78  170:astore_3        
		framelayout = zzbjt;
	//   79  171:aload_0         
	//   80  172:getfield        #94  <Field FrameLayout zzbjt>
	//   81  175:astore          4
_L1:
		zzoz1.zza(view, "1007", bundle, map, ((View) (framelayout)));
	//   82  177:aload_2         
	//   83  178:aload_1         
	//   84  179:ldc1            #251 <String "1007">
	//   85  181:aload           6
	//   86  183:aload_3         
	//   87  184:aload           4
	//   88  186:invokeinterface #254 <Method void zzoz.zza(View, String, Bundle, Map, View)>
		break MISSING_BLOCK_LABEL_233;
	//   89  191:goto            233
		zzoz1 = zzbij;
	//   90  194:aload_0         
	//   91  195:getfield        #187 <Field zzoz zzbij>
	//   92  198:astore_2        
		map = zzbjw;
	//   93  199:aload_0         
	//   94  200:getfield        #76  <Field Map zzbjw>
	//   95  203:astore_3        
		framelayout = zzbjt;
	//   96  204:aload_0         
	//   97  205:getfield        #94  <Field FrameLayout zzbjt>
	//   98  208:astore          4
		  goto _L1
	//*  99  210:goto            177
		zzbij.zza(view, zzbjw, bundle, ((View) (zzbjt)));
	//  100  213:aload_0         
	//  101  214:getfield        #187 <Field zzoz zzbij>
	//  102  217:aload_1         
	//  103  218:aload_0         
	//  104  219:getfield        #76  <Field Map zzbjw>
	//  105  222:aload           6
	//  106  224:aload_0         
	//  107  225:getfield        #94  <Field FrameLayout zzbjt>
	//  108  228:invokeinterface #257 <Method void zzoz.zza(View, Map, Bundle, View)>
		obj;
	//  109  233:aload           5
		JVM INSTR monitorexit ;
	//  110  235:monitorexit     
		return;
	//  111  236:return          
		view;
	//  112  237:astore_1        
		obj;
	//  113  238:aload           5
		JVM INSTR monitorexit ;
	//  114  240:monitorexit     
		throw view;
	//  115  241:aload_1         
	//  116  242:athrow          
	}

	public final void onGlobalLayout()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzkt();
	//    5    7:aload_0         
	//    6    8:invokespecial   #260 <Method void zzkt()>
			if(zzbij != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #187 <Field zzoz zzbij>
	//*   9   15:ifnull          35
				zzbij.zzc(((View) (zzbjt)), zzbjw);
	//   10   18:aload_0         
	//   11   19:getfield        #187 <Field zzoz zzbij>
	//   12   22:aload_0         
	//   13   23:getfield        #94  <Field FrameLayout zzbjt>
	//   14   26:aload_0         
	//   15   27:getfield        #76  <Field Map zzbjw>
	//   16   30:invokeinterface #264 <Method void zzoz.zzc(View, Map)>
		}
	//   17   35:aload_1         
	//   18   36:monitorexit     
		return;
	//   19   37:return          
		exception;
	//   20   38:astore_2        
		obj;
	//   21   39:aload_1         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		throw exception;
	//   23   41:aload_2         
	//   24   42:athrow          
	}

	public final void onScrollChanged()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzbij != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #187 <Field zzoz zzbij>
	//*   7   11:ifnull          31
				zzbij.zzc(((View) (zzbjt)), zzbjw);
	//    8   14:aload_0         
	//    9   15:getfield        #187 <Field zzoz zzbij>
	//   10   18:aload_0         
	//   11   19:getfield        #94  <Field FrameLayout zzbjt>
	//   12   22:aload_0         
	//   13   23:getfield        #76  <Field Map zzbjw>
	//   14   26:invokeinterface #264 <Method void zzoz.zzc(View, Map)>
			zzkt();
	//   15   31:aload_0         
	//   16   32:invokespecial   #260 <Method void zzkt()>
		}
	//   17   35:aload_1         
	//   18   36:monitorexit     
		return;
	//   19   37:return          
		exception;
	//   20   38:astore_2        
		obj;
	//   21   39:aload_1         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		throw exception;
	//   23   41:aload_2         
	//   24   42:athrow          
	}

	public final boolean onTouch(View view, MotionEvent motionevent)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzbij != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #187 <Field zzoz zzbij>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		float f;
		int ai[];
		ai = new int[2];
	//   12   18:iconst_2        
	//   13   19:newarray        int[]
	//   14   21:astore          7
		zzbjt.getLocationOnScreen(ai);
	//   15   23:aload_0         
	//   16   24:getfield        #94  <Field FrameLayout zzbjt>
	//   17   27:aload           7
	//   18   29:invokevirtual   #271 <Method void FrameLayout.getLocationOnScreen(int[])>
		f = motionevent.getRawX();
	//   19   32:aload_2         
	//   20   33:invokevirtual   #277 <Method float MotionEvent.getRawX()>
	//   21   36:fstore_3        
		float f1 = ai[0];
	//   22   37:aload           7
	//   23   39:iconst_0        
	//   24   40:iaload          
	//   25   41:i2f             
	//   26   42:fstore          4
		float f2 = motionevent.getRawY();
	//   27   44:aload_2         
	//   28   45:invokevirtual   #280 <Method float MotionEvent.getRawY()>
	//   29   48:fstore          5
		float f3 = ai[1];
	//   30   50:aload           7
	//   31   52:iconst_1        
	//   32   53:iaload          
	//   33   54:i2f             
	//   34   55:fstore          6
		Point point = new Point((int)(f - f1), (int)(f2 - f3));
	//   35   57:new             #80  <Class Point>
	//   36   60:dup             
	//   37   61:fload_3         
	//   38   62:fload           4
	//   39   64:fsub            
	//   40   65:f2i             
	//   41   66:fload           5
	//   42   68:fload           6
	//   43   70:fsub            
	//   44   71:f2i             
	//   45   72:invokespecial   #281 <Method void Point(int, int)>
	//   46   75:astore          7
		zzbjz = point;
	//   47   77:aload_0         
	//   48   78:aload           7
	//   49   80:putfield        #83  <Field Point zzbjz>
		if(motionevent.getAction() == 0)
	//*  50   83:aload_2         
	//*  51   84:invokevirtual   #284 <Method int MotionEvent.getAction()>
	//*  52   87:ifne            96
			zzbka = point;
	//   53   90:aload_0         
	//   54   91:aload           7
	//   55   93:putfield        #85  <Field Point zzbka>
		motionevent = MotionEvent.obtain(motionevent);
	//   56   96:aload_2         
	//   57   97:invokestatic    #288 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//   58  100:astore_2        
		motionevent.setLocation(point.x, point.y);
	//   59  101:aload_2         
	//   60  102:aload           7
	//   61  104:getfield        #231 <Field int Point.x>
	//   62  107:i2f             
	//   63  108:aload           7
	//   64  110:getfield        #241 <Field int Point.y>
	//   65  113:i2f             
	//   66  114:invokevirtual   #292 <Method void MotionEvent.setLocation(float, float)>
		zzbij.zzd(motionevent);
	//   67  117:aload_0         
	//   68  118:getfield        #187 <Field zzoz zzbij>
	//   69  121:aload_2         
	//   70  122:invokeinterface #295 <Method void zzoz.zzd(MotionEvent)>
		motionevent.recycle();
	//   71  127:aload_2         
	//   72  128:invokevirtual   #298 <Method void MotionEvent.recycle()>
		view;
	//   73  131:aload_1         
		JVM INSTR monitorexit ;
	//   74  132:monitorexit     
		return false;
	//   75  133:iconst_0        
	//   76  134:ireturn         
		motionevent;
	//   77  135:astore_2        
		view;
	//   78  136:aload_1         
		JVM INSTR monitorexit ;
	//   79  137:monitorexit     
		throw motionevent;
	//   80  138:aload_2         
	//   81  139:athrow          
	}

	public final void zza(IObjectWrapper iobjectwrapper)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object mLock>
	//    2    4:astore          8
		obj1;
	//    3    6:aload           8
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj = null;
	//    5    9:aconst_null     
	//    6   10:astore          7
		zzl(((View) (null)));
	//    7   12:aload_0         
	//    8   13:aconst_null     
	//    9   14:invokespecial   #302 <Method void zzl(View)>
		iobjectwrapper = ((IObjectWrapper) (ObjectWrapper.unwrap(iobjectwrapper)));
	//   10   17:aload_1         
	//   11   18:invokestatic    #308 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   12   21:astore_1        
		if(iobjectwrapper instanceof zzpd)
			break MISSING_BLOCK_LABEL_39;
	//   13   22:aload_1         
	//   14   23:instanceof      #310 <Class zzpd>
	//   15   26:ifne            39
		zzakb.zzdk("Not an instance of native engine. This is most likely a transient error");
	//   16   29:ldc2            #312 <String "Not an instance of native engine. This is most likely a transient error">
	//   17   32:invokestatic    #318 <Method void zzakb.zzdk(String)>
		obj1;
	//   18   35:aload           8
		JVM INSTR monitorexit ;
	//   19   37:monitorexit     
		return;
	//   20   38:return          
		boolean flag1 = zzbjv;
	//   21   39:aload_0         
	//   22   40:getfield        #165 <Field boolean zzbjv>
	//   23   43:istore          5
		boolean flag;
		flag = false;
	//   24   45:iconst_0        
	//   25   46:istore_3        
		if(flag1)
			break MISSING_BLOCK_LABEL_82;
	//   26   47:iload           5
	//   27   49:ifne            82
		if(zzvh != null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #96  <Field FrameLayout zzvh>
	//*  30   56:ifnull          82
		{
			zzvh.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(0, 0))));
	//   31   59:aload_0         
	//   32   60:getfield        #96  <Field FrameLayout zzvh>
	//   33   63:new             #176 <Class android.widget.FrameLayout$LayoutParams>
	//   34   66:dup             
	//   35   67:iconst_0        
	//   36   68:iconst_0        
	//   37   69:invokespecial   #179 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   38   72:invokevirtual   #183 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			zzbjt.requestLayout();
	//   39   75:aload_0         
	//   40   76:getfield        #94  <Field FrameLayout zzbjt>
	//   41   79:invokevirtual   #321 <Method void FrameLayout.requestLayout()>
		}
		flag1 = true;
	//   42   82:iconst_1        
	//   43   83:istore          5
		zzpd zzpd1;
		zzbjy = true;
	//   44   85:aload_0         
	//   45   86:iconst_1        
	//   46   87:putfield        #78  <Field boolean zzbjy>
		zzpd1 = (zzpd)iobjectwrapper;
	//   47   90:aload_1         
	//   48   91:checkcast       #310 <Class zzpd>
	//   49   94:astore          9
		if(zzbij != null)
	//*  50   96:aload_0         
	//*  51   97:getfield        #187 <Field zzoz zzbij>
	//*  52  100:ifnull          140
		{
			iobjectwrapper = ((IObjectWrapper) (zznk.zzbbu));
	//   53  103:getstatic       #324 <Field zzna zznk.zzbbu>
	//   54  106:astore_1        
			if(((Boolean)zzkb.zzik().zzd(((zzna) (iobjectwrapper)))).booleanValue())
	//*  55  107:invokestatic    #152 <Method zzni zzkb.zzik()>
	//*  56  110:aload_1         
	//*  57  111:invokevirtual   #158 <Method Object zzni.zzd(zzna)>
	//*  58  114:checkcast       #160 <Class Boolean>
	//*  59  117:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//*  60  120:ifeq            140
				zzbij.zzb(((View) (zzbjt)), zzbjw);
	//   61  123:aload_0         
	//   62  124:getfield        #187 <Field zzoz zzbij>
	//   63  127:aload_0         
	//   64  128:getfield        #94  <Field FrameLayout zzbjt>
	//   65  131:aload_0         
	//   66  132:getfield        #76  <Field Map zzbjw>
	//   67  135:invokeinterface #326 <Method void zzoz.zzb(View, Map)>
		}
		if(!(zzbij instanceof zzpd))
			break MISSING_BLOCK_LABEL_226;
	//   68  140:aload_0         
	//   69  141:getfield        #187 <Field zzoz zzbij>
	//   70  144:instanceof      #310 <Class zzpd>
	//   71  147:ifeq            226
		iobjectwrapper = ((IObjectWrapper) ((zzpd)zzbij));
	//   72  150:aload_0         
	//   73  151:getfield        #187 <Field zzoz zzbij>
	//   74  154:checkcast       #310 <Class zzpd>
	//   75  157:astore_1        
		if(iobjectwrapper == null)
			break MISSING_BLOCK_LABEL_226;
	//   76  158:aload_1         
	//   77  159:ifnull          226
		if(((zzpd) (iobjectwrapper)).getContext() == null || !zzbv.zzfh().zzu(zzbjt.getContext()))
			break MISSING_BLOCK_LABEL_226;
	//   78  162:aload_1         
	//   79  163:invokevirtual   #327 <Method android.content.Context zzpd.getContext()>
	//   80  166:ifnull          226
	//   81  169:invokestatic    #331 <Method zzaiy zzbv.zzfh()>
	//   82  172:aload_0         
	//   83  173:getfield        #94  <Field FrameLayout zzbjt>
	//   84  176:invokevirtual   #136 <Method android.content.Context FrameLayout.getContext()>
	//   85  179:invokevirtual   #337 <Method boolean zzaiy.zzu(android.content.Context)>
	//   86  182:ifeq            226
		iobjectwrapper = ((IObjectWrapper) (((zzpd) (iobjectwrapper)).zzks()));
	//   87  185:aload_1         
	//   88  186:invokevirtual   #341 <Method zzaix zzpd.zzks()>
	//   89  189:astore_1        
		if(iobjectwrapper == null)
			break MISSING_BLOCK_LABEL_199;
	//   90  190:aload_1         
	//   91  191:ifnull          199
		((zzaix) (iobjectwrapper)).zzx(false);
	//   92  194:aload_1         
	//   93  195:iconst_0        
	//   94  196:invokevirtual   #347 <Method void zzaix.zzx(boolean)>
		Object obj2 = ((Object) ((zzfp)zzbkb.get()));
	//   95  199:aload_0         
	//   96  200:getfield        #92  <Field WeakReference zzbkb>
	//   97  203:invokevirtual   #351 <Method Object WeakReference.get()>
	//   98  206:checkcast       #353 <Class zzfp>
	//   99  209:astore          10
		if(obj2 == null || iobjectwrapper == null)
			break MISSING_BLOCK_LABEL_226;
	//  100  211:aload           10
	//  101  213:ifnull          226
	//  102  216:aload_1         
	//  103  217:ifnull          226
		((zzfp) (obj2)).zzb(((zzft) (iobjectwrapper)));
	//  104  220:aload           10
	//  105  222:aload_1         
	//  106  223:invokevirtual   #356 <Method void zzfp.zzb(zzft)>
		if((zzbij instanceof zzoy) && ((zzoy)zzbij).zzkm())
	//* 107  226:aload_0         
	//* 108  227:getfield        #187 <Field zzoz zzbij>
	//* 109  230:instanceof      #189 <Class zzoy>
	//* 110  233:ifeq            264
	//* 111  236:aload_0         
	//* 112  237:getfield        #187 <Field zzoz zzbij>
	//* 113  240:checkcast       #189 <Class zzoy>
	//* 114  243:invokevirtual   #359 <Method boolean zzoy.zzkm()>
	//* 115  246:ifeq            264
		{
			((zzoy)zzbij).zzc(((zzoz) (zzpd1)));
	//  116  249:aload_0         
	//  117  250:getfield        #187 <Field zzoz zzbij>
	//  118  253:checkcast       #189 <Class zzoy>
	//  119  256:aload           9
	//  120  258:invokevirtual   #362 <Method void zzoy.zzc(zzoz)>
			break MISSING_BLOCK_LABEL_287;
	//  121  261:goto            287
		}
		zzbij = ((zzoz) (zzpd1));
	//  122  264:aload_0         
	//  123  265:aload           9
	//  124  267:putfield        #187 <Field zzoz zzbij>
		if(zzpd1 instanceof zzoy)
	//* 125  270:aload           9
	//* 126  272:instanceof      #189 <Class zzoy>
	//* 127  275:ifeq            287
			((zzoy)zzpd1).zzc(((zzoz) (null)));
	//  128  278:aload           9
	//  129  280:checkcast       #189 <Class zzoy>
	//  130  283:aconst_null     
	//  131  284:invokevirtual   #362 <Method void zzoy.zzc(zzoz)>
		if(zzvh != null)
			break MISSING_BLOCK_LABEL_298;
	//  132  287:aload_0         
	//  133  288:getfield        #96  <Field FrameLayout zzvh>
	//  134  291:ifnonnull       298
		obj1;
	//  135  294:aload           8
		JVM INSTR monitorexit ;
	//  136  296:monitorexit     
		return;
	//  137  297:return          
		boolean flag2;
		iobjectwrapper = ((IObjectWrapper) (zznk.zzbbu));
	//  138  298:getstatic       #324 <Field zzna zznk.zzbbu>
	//  139  301:astore_1        
		if(((Boolean)zzkb.zzik().zzd(((zzna) (iobjectwrapper)))).booleanValue())
	//* 140  302:invokestatic    #152 <Method zzni zzkb.zzik()>
	//* 141  305:aload_1         
	//* 142  306:invokevirtual   #158 <Method Object zzni.zzd(zzna)>
	//* 143  309:checkcast       #160 <Class Boolean>
	//* 144  312:invokevirtual   #163 <Method boolean Boolean.booleanValue()>
	//* 145  315:ifeq            326
			zzvh.setClickable(false);
	//  146  318:aload_0         
	//  147  319:getfield        #96  <Field FrameLayout zzvh>
	//  148  322:iconst_0        
	//  149  323:invokevirtual   #365 <Method void FrameLayout.setClickable(boolean)>
		zzvh.removeAllViews();
	//  150  326:aload_0         
	//  151  327:getfield        #96  <Field FrameLayout zzvh>
	//  152  330:invokevirtual   #215 <Method void FrameLayout.removeAllViews()>
		flag2 = zzpd1.zzkj();
	//  153  333:aload           9
	//  154  335:invokevirtual   #368 <Method boolean zzpd.zzkj()>
	//  155  338:istore          6
		if(!flag2) goto _L2; else goto _L1
	//  156  340:iload           6
	//  157  342:ifeq            1001
_L1:
		if(zzbjw == null) goto _L4; else goto _L3
	//  158  345:aload_0         
	//  159  346:getfield        #76  <Field Map zzbjw>
	//  160  349:ifnull          996
_L3:
		int i = 0;
	//  161  352:iconst_0        
	//  162  353:istore_2        
_L20:
		if(i >= 2) goto _L4; else goto _L5
	//  163  354:iload_2         
	//  164  355:iconst_2        
	//  165  356:icmpge          996
_L5:
		iobjectwrapper = ((IObjectWrapper) ((new String[] {
			"1098", "3011"
		})[i]));
	//  166  359:iconst_2        
	//  167  360:anewarray       String[]
	//  168  363:dup             
	//  169  364:iconst_0        
	//  170  365:ldc2            #370 <String "1098">
	//  171  368:aastore         
	//  172  369:dup             
	//  173  370:iconst_1        
	//  174  371:ldc2            #372 <String "3011">
	//  175  374:aastore         
	//  176  375:iload_2         
	//  177  376:aaload          
	//  178  377:astore_1        
		iobjectwrapper = ((IObjectWrapper) ((WeakReference)zzbjw.get(((Object) (iobjectwrapper)))));
	//  179  378:aload_0         
	//  180  379:getfield        #76  <Field Map zzbjw>
	//  181  382:aload_1         
	//  182  383:invokeinterface #377 <Method Object Map.get(Object)>
	//  183  388:checkcast       #87  <Class WeakReference>
	//  184  391:astore_1        
		if(iobjectwrapper == null) goto _L7; else goto _L6
	//  185  392:aload_1         
	//  186  393:ifnull          989
_L6:
		iobjectwrapper = ((IObjectWrapper) ((View)((WeakReference) (iobjectwrapper)).get()));
	//  187  396:aload_1         
	//  188  397:invokevirtual   #351 <Method Object WeakReference.get()>
	//  189  400:checkcast       #379 <Class View>
	//  190  403:astore_1        
	//* 191  404:goto            407
_L21:
		if(!(iobjectwrapper instanceof ViewGroup)) goto _L2; else goto _L8
	//  192  407:aload_1         
	//  193  408:instanceof      #381 <Class ViewGroup>
	//  194  411:ifeq            1001
_L8:
		iobjectwrapper = ((IObjectWrapper) ((ViewGroup)iobjectwrapper));
	//  195  414:aload_1         
	//  196  415:checkcast       #381 <Class ViewGroup>
	//  197  418:astore_1        
		  goto _L9
	//* 198  419:goto            1003
_L22:
		zzbjx = zzpd1.zza(((android.view.View.OnClickListener) (this)), flag1);
	//  199  422:aload_0         
	//  200  423:aload           9
	//  201  425:aload_0         
	//  202  426:iload           5
	//  203  428:invokevirtual   #384 <Method View zzpd.zza(android.view.View$OnClickListener, boolean)>
	//  204  431:putfield        #217 <Field View zzbjx>
		if(zzbjx == null)
			break MISSING_BLOCK_LABEL_540;
	//  205  434:aload_0         
	//  206  435:getfield        #217 <Field View zzbjx>
	//  207  438:ifnull          540
		if(zzbjw != null)
	//* 208  441:aload_0         
	//* 209  442:getfield        #76  <Field Map zzbjw>
	//* 210  445:ifnull          471
			zzbjw.put("1007", ((Object) (new WeakReference(((Object) (zzbjx))))));
	//  211  448:aload_0         
	//  212  449:getfield        #76  <Field Map zzbjw>
	//  213  452:ldc1            #251 <String "1007">
	//  214  454:new             #87  <Class WeakReference>
	//  215  457:dup             
	//  216  458:aload_0         
	//  217  459:getfield        #217 <Field View zzbjx>
	//  218  462:invokespecial   #90  <Method void WeakReference(Object)>
	//  219  465:invokeinterface #388 <Method Object Map.put(Object, Object)>
	//  220  470:pop             
		if(!flag1)
			break MISSING_BLOCK_LABEL_491;
	//  221  471:iload           5
	//  222  473:ifeq            491
		((ViewGroup) (iobjectwrapper)).removeAllViews();
	//  223  476:aload_1         
	//  224  477:invokevirtual   #389 <Method void ViewGroup.removeAllViews()>
		((ViewGroup) (iobjectwrapper)).addView(zzbjx);
	//  225  480:aload_1         
	//  226  481:aload_0         
	//  227  482:getfield        #217 <Field View zzbjx>
	//  228  485:invokevirtual   #392 <Method void ViewGroup.addView(View)>
		break MISSING_BLOCK_LABEL_540;
	//  229  488:goto            540
		iobjectwrapper = ((IObjectWrapper) (new AdChoicesView(zzpd1.getContext())));
	//  230  491:new             #394 <Class AdChoicesView>
	//  231  494:dup             
	//  232  495:aload           9
	//  233  497:invokevirtual   #327 <Method android.content.Context zzpd.getContext()>
	//  234  500:invokespecial   #396 <Method void AdChoicesView(android.content.Context)>
	//  235  503:astore_1        
		((ViewGroup) (iobjectwrapper)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//  236  504:aload_1         
	//  237  505:new             #176 <Class android.widget.FrameLayout$LayoutParams>
	//  238  508:dup             
	//  239  509:iconst_m1       
	//  240  510:iconst_m1       
	//  241  511:invokespecial   #179 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//  242  514:invokevirtual   #397 <Method void ViewGroup.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((ViewGroup) (iobjectwrapper)).addView(zzbjx);
	//  243  517:aload_1         
	//  244  518:aload_0         
	//  245  519:getfield        #217 <Field View zzbjx>
	//  246  522:invokevirtual   #392 <Method void ViewGroup.addView(View)>
		if(zzvh != null)
	//* 247  525:aload_0         
	//* 248  526:getfield        #96  <Field FrameLayout zzvh>
	//* 249  529:ifnull          540
			zzvh.addView(((View) (iobjectwrapper)));
	//  250  532:aload_0         
	//  251  533:getfield        #96  <Field FrameLayout zzvh>
	//  252  536:aload_1         
	//  253  537:invokevirtual   #398 <Method void FrameLayout.addView(View)>
		zzpd1.zza(((View) (zzbjt)), zzbjw, ((Map) (null)), ((android.view.View.OnTouchListener) (this)), ((android.view.View.OnClickListener) (this)));
	//  254  540:aload           9
	//  255  542:aload_0         
	//  256  543:getfield        #94  <Field FrameLayout zzbjt>
	//  257  546:aload_0         
	//  258  547:getfield        #76  <Field Map zzbjw>
	//  259  550:aconst_null     
	//  260  551:aload_0         
	//  261  552:aload_0         
	//  262  553:invokevirtual   #401 <Method void zzpd.zza(View, Map, Map, android.view.View$OnTouchListener, android.view.View$OnClickListener)>
		if(zzbjv)
	//* 263  556:aload_0         
	//* 264  557:getfield        #165 <Field boolean zzbjv>
	//* 265  560:ifeq            629
		{
			if(zzbju == null)
	//* 266  563:aload_0         
	//* 267  564:getfield        #219 <Field View zzbju>
	//* 268  567:ifnonnull       604
			{
				zzbju = new View(zzbjt.getContext());
	//  269  570:aload_0         
	//  270  571:new             #379 <Class View>
	//  271  574:dup             
	//  272  575:aload_0         
	//  273  576:getfield        #94  <Field FrameLayout zzbjt>
	//  274  579:invokevirtual   #136 <Method android.content.Context FrameLayout.getContext()>
	//  275  582:invokespecial   #402 <Method void View(android.content.Context)>
	//  276  585:putfield        #219 <Field View zzbju>
				zzbju.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, 0))));
	//  277  588:aload_0         
	//  278  589:getfield        #219 <Field View zzbju>
	//  279  592:new             #176 <Class android.widget.FrameLayout$LayoutParams>
	//  280  595:dup             
	//  281  596:iconst_m1       
	//  282  597:iconst_0        
	//  283  598:invokespecial   #179 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//  284  601:invokevirtual   #403 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			if(zzbjt != zzbju.getParent())
	//* 285  604:aload_0         
	//* 286  605:getfield        #94  <Field FrameLayout zzbjt>
	//* 287  608:aload_0         
	//* 288  609:getfield        #219 <Field View zzbju>
	//* 289  612:invokevirtual   #407 <Method android.view.ViewParent View.getParent()>
	//* 290  615:if_acmpeq       629
				zzbjt.addView(zzbju);
	//  291  618:aload_0         
	//  292  619:getfield        #94  <Field FrameLayout zzbjt>
	//  293  622:aload_0         
	//  294  623:getfield        #219 <Field View zzbju>
	//  295  626:invokevirtual   #398 <Method void FrameLayout.addView(View)>
		}
		iobjectwrapper = ((IObjectWrapper) (zzpd1.zzko()));
	//  296  629:aload           9
	//  297  631:invokevirtual   #411 <Method zzaqw zzpd.zzko()>
	//  298  634:astore_1        
		  goto _L10
	//* 299  635:goto            668
		iobjectwrapper;
	//  300  638:astore_1        
		zzbv.zzem();
	//  301  639:invokestatic    #415 <Method zzakq zzbv.zzem()>
	//  302  642:pop             
		if(!zzakq.zzrp()) goto _L12; else goto _L11
	//  303  643:invokestatic    #420 <Method boolean zzakq.zzrp()>
	//  304  646:ifeq            658
_L11:
		zzakb.zzdk("Privileged processes cannot create HTML overlays.");
	//  305  649:ldc2            #422 <String "Privileged processes cannot create HTML overlays.">
	//  306  652:invokestatic    #318 <Method void zzakb.zzdk(String)>
		  goto _L13
	//* 307  655:goto            1021
_L12:
		zzakb.zzb("Error obtaining overlay.", ((Throwable) (iobjectwrapper)));
	//  308  658:ldc2            #424 <String "Error obtaining overlay.">
	//  309  661:aload_1         
	//  310  662:invokestatic    #427 <Method void zzakb.zzb(String, Throwable)>
		  goto _L13
	//* 311  665:goto            1021
_L10:
		if(iobjectwrapper == null)
			break MISSING_BLOCK_LABEL_692;
	//  312  668:aload_1         
	//  313  669:ifnull          692
		if(zzvh != null)
	//* 314  672:aload_0         
	//* 315  673:getfield        #96  <Field FrameLayout zzvh>
	//* 316  676:ifnull          692
			zzvh.addView(((zzaqw) (iobjectwrapper)).getView());
	//  317  679:aload_0         
	//  318  680:getfield        #96  <Field FrameLayout zzvh>
	//  319  683:aload_1         
	//  320  684:invokeinterface #433 <Method View zzaqw.getView()>
	//  321  689:invokevirtual   #398 <Method void FrameLayout.addView(View)>
		obj2 = mLock;
	//  322  692:aload_0         
	//  323  693:getfield        #65  <Field Object mLock>
	//  324  696:astore          10
		obj2;
	//  325  698:aload           10
		JVM INSTR monitorenter ;
	//  326  700:monitorenter    
		zzpd1.zzf(zzbjw);
	//  327  701:aload           9
	//  328  703:aload_0         
	//  329  704:getfield        #76  <Field Map zzbjw>
	//  330  707:invokevirtual   #437 <Method void zzpd.zzf(Map)>
		iobjectwrapper = ((IObjectWrapper) (obj));
	//  331  710:aload           7
	//  332  712:astore_1        
		if(zzbjw == null) goto _L15; else goto _L14
	//  333  713:aload_0         
	//  334  714:getfield        #76  <Field Map zzbjw>
	//  335  717:ifnull          775
_L14:
		int j;
		String as[];
		as = zzbjs;
	//  336  720:getstatic       #52  <Field String[] zzbjs>
	//  337  723:astore          11
		j = as.length;
	//  338  725:aload           11
	//  339  727:arraylength     
	//  340  728:istore          4
		i = ((int) (flag));
	//  341  730:iload_3         
	//  342  731:istore_2        
_L24:
		iobjectwrapper = ((IObjectWrapper) (obj));
	//  343  732:aload           7
	//  344  734:astore_1        
		if(i >= j) goto _L15; else goto _L16
	//  345  735:iload_2         
	//  346  736:iload           4
	//  347  738:icmpge          775
_L16:
		iobjectwrapper = ((IObjectWrapper) (as[i]));
	//  348  741:aload           11
	//  349  743:iload_2         
	//  350  744:aaload          
	//  351  745:astore_1        
		iobjectwrapper = ((IObjectWrapper) ((WeakReference)zzbjw.get(((Object) (iobjectwrapper)))));
	//  352  746:aload_0         
	//  353  747:getfield        #76  <Field Map zzbjw>
	//  354  750:aload_1         
	//  355  751:invokeinterface #377 <Method Object Map.get(Object)>
	//  356  756:checkcast       #87  <Class WeakReference>
	//  357  759:astore_1        
		if(iobjectwrapper == null)
			break MISSING_BLOCK_LABEL_1026;
	//  358  760:aload_1         
	//  359  761:ifnull          1026
		iobjectwrapper = ((IObjectWrapper) ((View)((WeakReference) (iobjectwrapper)).get()));
	//  360  764:aload_1         
	//  361  765:invokevirtual   #351 <Method Object WeakReference.get()>
	//  362  768:checkcast       #379 <Class View>
	//  363  771:astore_1        
	//* 364  772:goto            775
_L15:
		if(iobjectwrapper instanceof FrameLayout) goto _L18; else goto _L17
	//  365  775:aload_1         
	//  366  776:instanceof      #113 <Class FrameLayout>
	//  367  779:ifne            793
_L17:
		zzpd1.zzkq();
	//  368  782:aload           9
	//  369  784:invokevirtual   #440 <Method void zzpd.zzkq()>
_L19:
		obj2;
	//  370  787:aload           10
		JVM INSTR monitorexit ;
	//  371  789:monitorexit     
		break MISSING_BLOCK_LABEL_835;
	//  372  790:goto            835
_L18:
label0:
		{
			obj = ((Object) (new zzpo(this, ((View) (iobjectwrapper)))));
	//  373  793:new             #442 <Class zzpo>
	//  374  796:dup             
	//  375  797:aload_0         
	//  376  798:aload_1         
	//  377  799:invokespecial   #445 <Method void zzpo(zzpn, View)>
	//  378  802:astore          7
			if(!(zzpd1 instanceof zzoy))
				break label0;
	//  379  804:aload           9
	//  380  806:instanceof      #189 <Class zzoy>
	//  381  809:ifeq            824
			zzpd1.zzb(((View) (iobjectwrapper)), ((zzox) (obj)));
	//  382  812:aload           9
	//  383  814:aload_1         
	//  384  815:aload           7
	//  385  817:invokevirtual   #448 <Method boolean zzpd.zzb(View, zzox)>
	//  386  820:pop             
		}
		  goto _L19
	//* 387  821:goto            787
		zzpd1.zza(((View) (iobjectwrapper)), ((zzox) (obj)));
	//  388  824:aload           9
	//  389  826:aload_1         
	//  390  827:aload           7
	//  391  829:invokevirtual   #451 <Method void zzpd.zza(View, zzox)>
		  goto _L19
	//* 392  832:goto            787
		zzpd1.zzi(((View) (zzbjt)));
	//  393  835:aload           9
	//  394  837:aload_0         
	//  395  838:getfield        #94  <Field FrameLayout zzbjt>
	//  396  841:invokevirtual   #454 <Method void zzpd.zzi(View)>
		zzl(((View) (zzbjt)));
	//  397  844:aload_0         
	//  398  845:aload_0         
	//  399  846:getfield        #94  <Field FrameLayout zzbjt>
	//  400  849:invokespecial   #302 <Method void zzl(View)>
		zzbij.zzj(((View) (zzbjt)));
	//  401  852:aload_0         
	//  402  853:getfield        #187 <Field zzoz zzbij>
	//  403  856:aload_0         
	//  404  857:getfield        #94  <Field FrameLayout zzbjt>
	//  405  860:invokeinterface #457 <Method void zzoz.zzj(View)>
		if(!(zzbij instanceof zzpd))
			break MISSING_BLOCK_LABEL_973;
	//  406  865:aload_0         
	//  407  866:getfield        #187 <Field zzoz zzbij>
	//  408  869:instanceof      #310 <Class zzpd>
	//  409  872:ifeq            973
		zzpd1 = (zzpd)zzbij;
	//  410  875:aload_0         
	//  411  876:getfield        #187 <Field zzoz zzbij>
	//  412  879:checkcast       #310 <Class zzpd>
	//  413  882:astore          9
		if(zzpd1 == null)
			break MISSING_BLOCK_LABEL_973;
	//  414  884:aload           9
	//  415  886:ifnull          973
		if(zzpd1.getContext() == null || !zzbv.zzfh().zzu(zzbjt.getContext()))
			break MISSING_BLOCK_LABEL_973;
	//  416  889:aload           9
	//  417  891:invokevirtual   #327 <Method android.content.Context zzpd.getContext()>
	//  418  894:ifnull          973
	//  419  897:invokestatic    #331 <Method zzaiy zzbv.zzfh()>
	//  420  900:aload_0         
	//  421  901:getfield        #94  <Field FrameLayout zzbjt>
	//  422  904:invokevirtual   #136 <Method android.content.Context FrameLayout.getContext()>
	//  423  907:invokevirtual   #337 <Method boolean zzaiy.zzu(android.content.Context)>
	//  424  910:ifeq            973
		obj = ((Object) ((zzfp)zzbkb.get()));
	//  425  913:aload_0         
	//  426  914:getfield        #92  <Field WeakReference zzbkb>
	//  427  917:invokevirtual   #351 <Method Object WeakReference.get()>
	//  428  920:checkcast       #353 <Class zzfp>
	//  429  923:astore          7
		iobjectwrapper = ((IObjectWrapper) (obj));
	//  430  925:aload           7
	//  431  927:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_964;
	//  432  928:aload           7
	//  433  930:ifnonnull       964
		iobjectwrapper = ((IObjectWrapper) (new zzfp(zzbjt.getContext(), ((View) (zzbjt)))));
	//  434  933:new             #353 <Class zzfp>
	//  435  936:dup             
	//  436  937:aload_0         
	//  437  938:getfield        #94  <Field FrameLayout zzbjt>
	//  438  941:invokevirtual   #136 <Method android.content.Context FrameLayout.getContext()>
	//  439  944:aload_0         
	//  440  945:getfield        #94  <Field FrameLayout zzbjt>
	//  441  948:invokespecial   #460 <Method void zzfp(android.content.Context, View)>
	//  442  951:astore_1        
		zzbkb = new WeakReference(((Object) (iobjectwrapper)));
	//  443  952:aload_0         
	//  444  953:new             #87  <Class WeakReference>
	//  445  956:dup             
	//  446  957:aload_1         
	//  447  958:invokespecial   #90  <Method void WeakReference(Object)>
	//  448  961:putfield        #92  <Field WeakReference zzbkb>
		((zzfp) (iobjectwrapper)).zza(((zzft) (zzpd1.zzks())));
	//  449  964:aload_1         
	//  450  965:aload           9
	//  451  967:invokevirtual   #341 <Method zzaix zzpd.zzks()>
	//  452  970:invokevirtual   #462 <Method void zzfp.zza(zzft)>
		obj1;
	//  453  973:aload           8
		JVM INSTR monitorexit ;
	//  454  975:monitorexit     
		return;
	//  455  976:return          
		iobjectwrapper;
	//  456  977:astore_1        
		obj2;
	//  457  978:aload           10
		JVM INSTR monitorexit ;
	//  458  980:monitorexit     
		throw iobjectwrapper;
	//  459  981:aload_1         
	//  460  982:athrow          
		iobjectwrapper;
	//  461  983:astore_1        
		obj1;
	//  462  984:aload           8
		JVM INSTR monitorexit ;
	//  463  986:monitorexit     
		throw iobjectwrapper;
	//  464  987:aload_1         
	//  465  988:athrow          
_L7:
		i++;
	//  466  989:iload_2         
	//  467  990:iconst_1        
	//  468  991:iadd            
	//  469  992:istore_2        
		  goto _L20
	//* 470  993:goto            354
_L4:
		iobjectwrapper = null;
	//  471  996:aconst_null     
	//  472  997:astore_1        
		  goto _L21
	//* 473  998:goto            407
_L2:
		iobjectwrapper = null;
	//  474 1001:aconst_null     
	//  475 1002:astore_1        
_L9:
		if(!flag2 || iobjectwrapper == null) goto _L23; else goto _L22
	//  476 1003:iload           6
	//  477 1005:ifeq            1015
	//  478 1008:aload_1         
	//  479 1009:ifnull          1015
	//* 480 1012:goto            422
_L23:
		flag1 = false;
	//  481 1015:iconst_0        
	//  482 1016:istore          5
		  goto _L22
	//* 483 1018:goto            422
_L13:
		iobjectwrapper = null;
	//  484 1021:aconst_null     
	//  485 1022:astore_1        
		  goto _L10
	//* 486 1023:goto            668
		i++;
	//  487 1026:iload_2         
	//  488 1027:iconst_1        
	//  489 1028:iadd            
	//  490 1029:istore_2        
		  goto _L24
	//* 491 1030:goto            732
	}

	public final IObjectWrapper zzak(String s)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Object mLock>
	//    2    4:astore_3        
		obj1;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Map map = zzbjw;
	//    5    7:aload_0         
	//    6    8:getfield        #76  <Field Map zzbjw>
	//    7   11:astore          4
		Object obj;
		obj = null;
	//    8   13:aconst_null     
	//    9   14:astore_2        
		if(map != null)
			break MISSING_BLOCK_LABEL_24;
	//   10   15:aload           4
	//   11   17:ifnonnull       24
		obj1;
	//   12   20:aload_3         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		s = ((String) ((WeakReference)zzbjw.get(((Object) (s)))));
	//   16   24:aload_0         
	//   17   25:getfield        #76  <Field Map zzbjw>
	//   18   28:aload_1         
	//   19   29:invokeinterface #377 <Method Object Map.get(Object)>
	//   20   34:checkcast       #87  <Class WeakReference>
	//   21   37:astore_1        
		if(s == null)
	//*  22   38:aload_1         
	//*  23   39:ifnonnull       47
		{
			s = ((String) (obj));
	//   24   42:aload_2         
	//   25   43:astore_1        
			break MISSING_BLOCK_LABEL_55;
	//   26   44:goto            55
		}
		s = ((String) ((View)((WeakReference) (s)).get()));
	//   27   47:aload_1         
	//   28   48:invokevirtual   #351 <Method Object WeakReference.get()>
	//   29   51:checkcast       #379 <Class View>
	//   30   54:astore_1        
		s = ((String) (ObjectWrapper.wrap(((Object) (s)))));
	//   31   55:aload_1         
	//   32   56:invokestatic    #468 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   33   59:astore_1        
		obj1;
	//   34   60:aload_3         
		JVM INSTR monitorexit ;
	//   35   61:monitorexit     
		return ((IObjectWrapper) (s));
	//   36   62:aload_1         
	//   37   63:areturn         
		s;
	//   38   64:astore_1        
		obj1;
	//   39   65:aload_3         
		JVM INSTR monitorexit ;
	//   40   66:monitorexit     
		throw s;
	//   41   67:aload_1         
	//   42   68:athrow          
	}

	public final void zzb(IObjectWrapper iobjectwrapper, int i)
	{
		if(zzbv.zzfh().zzu(zzbjt.getContext()) && zzbkb != null)
	//*   0    0:invokestatic    #331 <Method zzaiy zzbv.zzfh()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #94  <Field FrameLayout zzbjt>
	//*   3    7:invokevirtual   #136 <Method android.content.Context FrameLayout.getContext()>
	//*   4   10:invokevirtual   #337 <Method boolean zzaiy.zzu(android.content.Context)>
	//*   5   13:ifeq            42
	//*   6   16:aload_0         
	//*   7   17:getfield        #92  <Field WeakReference zzbkb>
	//*   8   20:ifnull          42
		{
			iobjectwrapper = ((IObjectWrapper) ((zzfp)zzbkb.get()));
	//    9   23:aload_0         
	//   10   24:getfield        #92  <Field WeakReference zzbkb>
	//   11   27:invokevirtual   #351 <Method Object WeakReference.get()>
	//   12   30:checkcast       #353 <Class zzfp>
	//   13   33:astore_1        
			if(iobjectwrapper != null)
	//*  14   34:aload_1         
	//*  15   35:ifnull          42
				((zzfp) (iobjectwrapper)).zzgm();
	//   16   38:aload_1         
	//   17   39:invokevirtual   #472 <Method void zzfp.zzgm()>
		}
		zzkt();
	//   18   42:aload_0         
	//   19   43:invokespecial   #260 <Method void zzkt()>
	//   20   46:return          
	}

	public final void zzb(String s, IObjectWrapper iobjectwrapper)
	{
		View view;
label0:
		{
			view = (View)ObjectWrapper.unwrap(iobjectwrapper);
	//    0    0:aload_2         
	//    1    1:invokestatic    #308 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #379 <Class View>
	//    3    7:astore_3        
			synchronized(mLock)
	//*   4    8:aload_0         
	//*   5    9:getfield        #65  <Field Object mLock>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:monitorenter    
			{
				if(zzbjw != null)
					break label0;
	//    9   15:aload_0         
	//   10   16:getfield        #76  <Field Map zzbjw>
	//   11   19:ifnonnull       25
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return;
	//   14   24:return          
		}
		if(view != null)
			break MISSING_BLOCK_LABEL_43;
	//   15   25:aload_3         
	//   16   26:ifnonnull       43
		zzbjw.remove(((Object) (s)));
	//   17   29:aload_0         
	//   18   30:getfield        #76  <Field Map zzbjw>
	//   19   33:aload_1         
	//   20   34:invokeinterface #476 <Method Object Map.remove(Object)>
	//   21   39:pop             
		break MISSING_BLOCK_LABEL_100;
	//   22   40:goto            100
		zzbjw.put(((Object) (s)), ((Object) (new WeakReference(((Object) (view))))));
	//   23   43:aload_0         
	//   24   44:getfield        #76  <Field Map zzbjw>
	//   25   47:aload_1         
	//   26   48:new             #87  <Class WeakReference>
	//   27   51:dup             
	//   28   52:aload_3         
	//   29   53:invokespecial   #90  <Method void WeakReference(Object)>
	//   30   56:invokeinterface #388 <Method Object Map.put(Object, Object)>
	//   31   61:pop             
		if("1098".equals(((Object) (s))) || "3011".equals(((Object) (s))))
	//*  32   62:ldc2            #370 <String "1098">
	//*  33   65:aload_1         
	//*  34   66:invokevirtual   #477 <Method boolean String.equals(Object)>
	//*  35   69:ifne            103
	//*  36   72:ldc2            #372 <String "3011">
	//*  37   75:aload_1         
	//*  38   76:invokevirtual   #477 <Method boolean String.equals(Object)>
	//*  39   79:ifeq            85
			break MISSING_BLOCK_LABEL_103;
	//   40   82:goto            103
		view.setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//   41   85:aload_3         
	//   42   86:aload_0         
	//   43   87:invokevirtual   #478 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		view.setClickable(true);
	//   44   90:aload_3         
	//   45   91:iconst_1        
	//   46   92:invokevirtual   #479 <Method void View.setClickable(boolean)>
		view.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   47   95:aload_3         
	//   48   96:aload_0         
	//   49   97:invokevirtual   #480 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		iobjectwrapper;
	//   50  100:aload_2         
		JVM INSTR monitorexit ;
	//   51  101:monitorexit     
		return;
	//   52  102:return          
		iobjectwrapper;
	//   53  103:aload_2         
		JVM INSTR monitorexit ;
	//   54  104:monitorexit     
		return;
	//   55  105:return          
		s;
	//   56  106:astore_1        
		iobjectwrapper;
	//   57  107:aload_2         
		JVM INSTR monitorexit ;
	//   58  108:monitorexit     
		throw s;
	//   59  109:aload_1         
	//   60  110:athrow          
	}

	public final void zzc(IObjectWrapper iobjectwrapper)
	{
		zzbij.setClickConfirmingView((View)ObjectWrapper.unwrap(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field zzoz zzbij>
	//    2    4:aload_1         
	//    3    5:invokestatic    #308 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #379 <Class View>
	//    5   11:invokeinterface #483 <Method void zzoz.setClickConfirmingView(View)>
	//    6   16:return          
	}

	private static final String zzbjs[] = {
		"2011", "1009", "3010"
	};
	private final Object mLock = new Object();
	private zzoz zzbij;
	private final FrameLayout zzbjt;
	private View zzbju;
	private final boolean zzbjv;
	private Map zzbjw;
	private View zzbjx;
	private boolean zzbjy;
	private Point zzbjz;
	private Point zzbka;
	private WeakReference zzbkb;
	private FrameLayout zzvh;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #46  <String "2011">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #48  <String "1009">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #50  <String "3010">
	//   13   18:aastore         
	//   14   19:putstatic       #52  <Field String[] zzbjs>
	//*  15   22:return          
	}
}

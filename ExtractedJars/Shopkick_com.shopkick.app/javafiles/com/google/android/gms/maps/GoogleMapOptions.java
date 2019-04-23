// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.maps:
//			zzaa

public final class GoogleMapOptions extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public GoogleMapOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void AbstractSafeParcelable()>
		mapType = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #88  <Field int mapType>
		zzav = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #90  <Field Float zzav>
		zzaw = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #92  <Field Float zzaw>
		zzax = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #94  <Field LatLngBounds zzax>
	//   14   24:return          
	}

	GoogleMapOptions(byte byte0, byte byte1, int i, CameraPosition cameraposition, byte byte2, byte byte3, byte byte4, 
			byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10, Float float1, 
			Float float2, LatLngBounds latlngbounds)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void AbstractSafeParcelable()>
		mapType = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #88  <Field int mapType>
		zzav = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #90  <Field Float zzav>
		zzaw = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #92  <Field Float zzaw>
		zzax = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #94  <Field LatLngBounds zzax>
		zzaj = com.google.android.gms.maps.internal.zza.zza(byte0);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   17   29:putfield        #105 <Field Boolean zzaj>
		zzak = com.google.android.gms.maps.internal.zza.zza(byte1);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   21   37:putfield        #107 <Field Boolean zzak>
		mapType = i;
	//   22   40:aload_0         
	//   23   41:iload_3         
	//   24   42:putfield        #88  <Field int mapType>
		zzal = cameraposition;
	//   25   45:aload_0         
	//   26   46:aload           4
	//   27   48:putfield        #109 <Field CameraPosition zzal>
		zzam = com.google.android.gms.maps.internal.zza.zza(byte2);
	//   28   51:aload_0         
	//   29   52:iload           5
	//   30   54:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   31   57:putfield        #111 <Field Boolean zzam>
		zzan = com.google.android.gms.maps.internal.zza.zza(byte3);
	//   32   60:aload_0         
	//   33   61:iload           6
	//   34   63:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   35   66:putfield        #113 <Field Boolean zzan>
		zzao = com.google.android.gms.maps.internal.zza.zza(byte4);
	//   36   69:aload_0         
	//   37   70:iload           7
	//   38   72:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   39   75:putfield        #115 <Field Boolean zzao>
		zzap = com.google.android.gms.maps.internal.zza.zza(byte5);
	//   40   78:aload_0         
	//   41   79:iload           8
	//   42   81:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   43   84:putfield        #117 <Field Boolean zzap>
		zzaq = com.google.android.gms.maps.internal.zza.zza(byte6);
	//   44   87:aload_0         
	//   45   88:iload           9
	//   46   90:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   47   93:putfield        #119 <Field Boolean zzaq>
		zzar = com.google.android.gms.maps.internal.zza.zza(byte7);
	//   48   96:aload_0         
	//   49   97:iload           10
	//   50   99:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   51  102:putfield        #121 <Field Boolean zzar>
		zzas = com.google.android.gms.maps.internal.zza.zza(byte8);
	//   52  105:aload_0         
	//   53  106:iload           11
	//   54  108:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   55  111:putfield        #123 <Field Boolean zzas>
		zzat = com.google.android.gms.maps.internal.zza.zza(byte9);
	//   56  114:aload_0         
	//   57  115:iload           12
	//   58  117:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   59  120:putfield        #125 <Field Boolean zzat>
		zzau = com.google.android.gms.maps.internal.zza.zza(byte10);
	//   60  123:aload_0         
	//   61  124:iload           13
	//   62  126:invokestatic    #103 <Method Boolean zza.zza(byte)>
	//   63  129:putfield        #127 <Field Boolean zzau>
		zzav = float1;
	//   64  132:aload_0         
	//   65  133:aload           14
	//   66  135:putfield        #90  <Field Float zzav>
		zzaw = float2;
	//   67  138:aload_0         
	//   68  139:aload           15
	//   69  141:putfield        #92  <Field Float zzaw>
		zzax = latlngbounds;
	//   70  144:aload_0         
	//   71  145:aload           16
	//   72  147:putfield        #94  <Field LatLngBounds zzax>
	//   73  150:return          
	}

	public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeset)
	{
		if(context != null && attributeset != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          381
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            381
		{
			TypedArray typedarray = context.getResources().obtainAttributes(attributeset, R.styleable.MapAttrs);
	//    5   11:aload_0         
	//    6   12:invokevirtual   #137 <Method Resources Context.getResources()>
	//    7   15:aload_1         
	//    8   16:getstatic       #143 <Field int[] R$styleable.MapAttrs>
	//    9   19:invokevirtual   #149 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//   10   22:astore_2        
			GoogleMapOptions googlemapoptions = new GoogleMapOptions();
	//   11   23:new             #2   <Class GoogleMapOptions>
	//   12   26:dup             
	//   13   27:invokespecial   #150 <Method void GoogleMapOptions()>
	//   14   30:astore_3        
			if(typedarray.hasValue(R.styleable.MapAttrs_mapType))
	//*  15   31:aload_2         
	//*  16   32:getstatic       #153 <Field int R$styleable.MapAttrs_mapType>
	//*  17   35:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  18   38:ifeq            54
				googlemapoptions.mapType(typedarray.getInt(R.styleable.MapAttrs_mapType, -1));
	//   19   41:aload_3         
	//   20   42:aload_2         
	//   21   43:getstatic       #153 <Field int R$styleable.MapAttrs_mapType>
	//   22   46:iconst_m1       
	//   23   47:invokevirtual   #163 <Method int TypedArray.getInt(int, int)>
	//   24   50:invokevirtual   #166 <Method GoogleMapOptions mapType(int)>
	//   25   53:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_zOrderOnTop))
	//*  26   54:aload_2         
	//*  27   55:getstatic       #169 <Field int R$styleable.MapAttrs_zOrderOnTop>
	//*  28   58:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  29   61:ifeq            77
				googlemapoptions.zOrderOnTop(typedarray.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
	//   30   64:aload_3         
	//   31   65:aload_2         
	//   32   66:getstatic       #169 <Field int R$styleable.MapAttrs_zOrderOnTop>
	//   33   69:iconst_0        
	//   34   70:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   35   73:invokevirtual   #177 <Method GoogleMapOptions zOrderOnTop(boolean)>
	//   36   76:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_useViewLifecycle))
	//*  37   77:aload_2         
	//*  38   78:getstatic       #180 <Field int R$styleable.MapAttrs_useViewLifecycle>
	//*  39   81:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  40   84:ifeq            100
				googlemapoptions.useViewLifecycleInFragment(typedarray.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
	//   41   87:aload_3         
	//   42   88:aload_2         
	//   43   89:getstatic       #180 <Field int R$styleable.MapAttrs_useViewLifecycle>
	//   44   92:iconst_0        
	//   45   93:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   46   96:invokevirtual   #183 <Method GoogleMapOptions useViewLifecycleInFragment(boolean)>
	//   47   99:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_uiCompass))
	//*  48  100:aload_2         
	//*  49  101:getstatic       #186 <Field int R$styleable.MapAttrs_uiCompass>
	//*  50  104:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  51  107:ifeq            123
				googlemapoptions.compassEnabled(typedarray.getBoolean(R.styleable.MapAttrs_uiCompass, true));
	//   52  110:aload_3         
	//   53  111:aload_2         
	//   54  112:getstatic       #186 <Field int R$styleable.MapAttrs_uiCompass>
	//   55  115:iconst_1        
	//   56  116:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   57  119:invokevirtual   #189 <Method GoogleMapOptions compassEnabled(boolean)>
	//   58  122:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_uiRotateGestures))
	//*  59  123:aload_2         
	//*  60  124:getstatic       #192 <Field int R$styleable.MapAttrs_uiRotateGestures>
	//*  61  127:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  62  130:ifeq            146
				googlemapoptions.rotateGesturesEnabled(typedarray.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
	//   63  133:aload_3         
	//   64  134:aload_2         
	//   65  135:getstatic       #192 <Field int R$styleable.MapAttrs_uiRotateGestures>
	//   66  138:iconst_1        
	//   67  139:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   68  142:invokevirtual   #195 <Method GoogleMapOptions rotateGesturesEnabled(boolean)>
	//   69  145:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_uiScrollGestures))
	//*  70  146:aload_2         
	//*  71  147:getstatic       #198 <Field int R$styleable.MapAttrs_uiScrollGestures>
	//*  72  150:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  73  153:ifeq            169
				googlemapoptions.scrollGesturesEnabled(typedarray.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
	//   74  156:aload_3         
	//   75  157:aload_2         
	//   76  158:getstatic       #198 <Field int R$styleable.MapAttrs_uiScrollGestures>
	//   77  161:iconst_1        
	//   78  162:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   79  165:invokevirtual   #201 <Method GoogleMapOptions scrollGesturesEnabled(boolean)>
	//   80  168:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_uiTiltGestures))
	//*  81  169:aload_2         
	//*  82  170:getstatic       #204 <Field int R$styleable.MapAttrs_uiTiltGestures>
	//*  83  173:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  84  176:ifeq            192
				googlemapoptions.tiltGesturesEnabled(typedarray.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
	//   85  179:aload_3         
	//   86  180:aload_2         
	//   87  181:getstatic       #204 <Field int R$styleable.MapAttrs_uiTiltGestures>
	//   88  184:iconst_1        
	//   89  185:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   90  188:invokevirtual   #207 <Method GoogleMapOptions tiltGesturesEnabled(boolean)>
	//   91  191:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_uiZoomGestures))
	//*  92  192:aload_2         
	//*  93  193:getstatic       #210 <Field int R$styleable.MapAttrs_uiZoomGestures>
	//*  94  196:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  95  199:ifeq            215
				googlemapoptions.zoomGesturesEnabled(typedarray.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
	//   96  202:aload_3         
	//   97  203:aload_2         
	//   98  204:getstatic       #210 <Field int R$styleable.MapAttrs_uiZoomGestures>
	//   99  207:iconst_1        
	//  100  208:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  101  211:invokevirtual   #213 <Method GoogleMapOptions zoomGesturesEnabled(boolean)>
	//  102  214:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_uiZoomControls))
	//* 103  215:aload_2         
	//* 104  216:getstatic       #216 <Field int R$styleable.MapAttrs_uiZoomControls>
	//* 105  219:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//* 106  222:ifeq            238
				googlemapoptions.zoomControlsEnabled(typedarray.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
	//  107  225:aload_3         
	//  108  226:aload_2         
	//  109  227:getstatic       #216 <Field int R$styleable.MapAttrs_uiZoomControls>
	//  110  230:iconst_1        
	//  111  231:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  112  234:invokevirtual   #219 <Method GoogleMapOptions zoomControlsEnabled(boolean)>
	//  113  237:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_liteMode))
	//* 114  238:aload_2         
	//* 115  239:getstatic       #222 <Field int R$styleable.MapAttrs_liteMode>
	//* 116  242:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//* 117  245:ifeq            261
				googlemapoptions.liteMode(typedarray.getBoolean(R.styleable.MapAttrs_liteMode, false));
	//  118  248:aload_3         
	//  119  249:aload_2         
	//  120  250:getstatic       #222 <Field int R$styleable.MapAttrs_liteMode>
	//  121  253:iconst_0        
	//  122  254:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  123  257:invokevirtual   #225 <Method GoogleMapOptions liteMode(boolean)>
	//  124  260:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_uiMapToolbar))
	//* 125  261:aload_2         
	//* 126  262:getstatic       #228 <Field int R$styleable.MapAttrs_uiMapToolbar>
	//* 127  265:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//* 128  268:ifeq            284
				googlemapoptions.mapToolbarEnabled(typedarray.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
	//  129  271:aload_3         
	//  130  272:aload_2         
	//  131  273:getstatic       #228 <Field int R$styleable.MapAttrs_uiMapToolbar>
	//  132  276:iconst_1        
	//  133  277:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  134  280:invokevirtual   #231 <Method GoogleMapOptions mapToolbarEnabled(boolean)>
	//  135  283:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_ambientEnabled))
	//* 136  284:aload_2         
	//* 137  285:getstatic       #234 <Field int R$styleable.MapAttrs_ambientEnabled>
	//* 138  288:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//* 139  291:ifeq            307
				googlemapoptions.ambientEnabled(typedarray.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
	//  140  294:aload_3         
	//  141  295:aload_2         
	//  142  296:getstatic       #234 <Field int R$styleable.MapAttrs_ambientEnabled>
	//  143  299:iconst_0        
	//  144  300:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  145  303:invokevirtual   #237 <Method GoogleMapOptions ambientEnabled(boolean)>
	//  146  306:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference))
	//* 147  307:aload_2         
	//* 148  308:getstatic       #240 <Field int R$styleable.MapAttrs_cameraMinZoomPreference>
	//* 149  311:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//* 150  314:ifeq            331
				googlemapoptions.minZoomPreference(typedarray.getFloat(R.styleable.MapAttrs_cameraMinZoomPreference, (-1.0F / 0.0F)));
	//  151  317:aload_3         
	//  152  318:aload_2         
	//  153  319:getstatic       #240 <Field int R$styleable.MapAttrs_cameraMinZoomPreference>
	//  154  322:ldc1            #241 <Float (-1.0F / 0.0F)>
	//  155  324:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//  156  327:invokevirtual   #249 <Method GoogleMapOptions minZoomPreference(float)>
	//  157  330:pop             
			if(typedarray.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference))
	//* 158  331:aload_2         
	//* 159  332:getstatic       #240 <Field int R$styleable.MapAttrs_cameraMinZoomPreference>
	//* 160  335:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//* 161  338:ifeq            355
				googlemapoptions.maxZoomPreference(typedarray.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, (1.0F / 0.0F)));
	//  162  341:aload_3         
	//  163  342:aload_2         
	//  164  343:getstatic       #252 <Field int R$styleable.MapAttrs_cameraMaxZoomPreference>
	//  165  346:ldc1            #253 <Float (1.0F / 0.0F)>
	//  166  348:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//  167  351:invokevirtual   #256 <Method GoogleMapOptions maxZoomPreference(float)>
	//  168  354:pop             
			googlemapoptions.latLngBoundsForCameraTarget(zza(context, attributeset));
	//  169  355:aload_3         
	//  170  356:aload_0         
	//  171  357:aload_1         
	//  172  358:invokestatic    #259 <Method LatLngBounds zza(Context, AttributeSet)>
	//  173  361:invokevirtual   #263 <Method GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds)>
	//  174  364:pop             
			googlemapoptions.camera(zzb(context, attributeset));
	//  175  365:aload_3         
	//  176  366:aload_0         
	//  177  367:aload_1         
	//  178  368:invokestatic    #267 <Method CameraPosition zzb(Context, AttributeSet)>
	//  179  371:invokevirtual   #271 <Method GoogleMapOptions camera(CameraPosition)>
	//  180  374:pop             
			typedarray.recycle();
	//  181  375:aload_2         
	//  182  376:invokevirtual   #274 <Method void TypedArray.recycle()>
			return googlemapoptions;
	//  183  379:aload_3         
	//  184  380:areturn         
		} else
		{
			return null;
	//  185  381:aconst_null     
	//  186  382:areturn         
		}
	}

	public static LatLngBounds zza(Context context, AttributeSet attributeset)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		Object obj = ((Object) (obj1));
	//    2    3:aload           5
	//    3    5:astore_3        
		if(context != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          213
		{
			if(attributeset == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
				return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
			obj = ((Object) (context.getResources().obtainAttributes(attributeset, R.styleable.MapAttrs)));
	//   10   16:aload_0         
	//   11   17:invokevirtual   #137 <Method Resources Context.getResources()>
	//   12   20:aload_1         
	//   13   21:getstatic       #143 <Field int[] R$styleable.MapAttrs>
	//   14   24:invokevirtual   #149 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//   15   27:astore_3        
			if(((TypedArray) (obj)).hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude))
	//*  16   28:aload_3         
	//*  17   29:getstatic       #277 <Field int R$styleable.MapAttrs_latLngBoundsSouthWestLatitude>
	//*  18   32:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  19   35:ifeq            53
				context = ((Context) (Float.valueOf(((TypedArray) (obj)).getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0F))));
	//   20   38:aload_3         
	//   21   39:getstatic       #277 <Field int R$styleable.MapAttrs_latLngBoundsSouthWestLatitude>
	//   22   42:fconst_0        
	//   23   43:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   24   46:invokestatic    #283 <Method Float Float.valueOf(float)>
	//   25   49:astore_0        
			else
	//*  26   50:goto            55
				context = null;
	//   27   53:aconst_null     
	//   28   54:astore_0        
			if(((TypedArray) (obj)).hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude))
	//*  29   55:aload_3         
	//*  30   56:getstatic       #286 <Field int R$styleable.MapAttrs_latLngBoundsSouthWestLongitude>
	//*  31   59:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  32   62:ifeq            80
				attributeset = ((AttributeSet) (Float.valueOf(((TypedArray) (obj)).getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0F))));
	//   33   65:aload_3         
	//   34   66:getstatic       #286 <Field int R$styleable.MapAttrs_latLngBoundsSouthWestLongitude>
	//   35   69:fconst_0        
	//   36   70:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   37   73:invokestatic    #283 <Method Float Float.valueOf(float)>
	//   38   76:astore_1        
			else
	//*  39   77:goto            82
				attributeset = null;
	//   40   80:aconst_null     
	//   41   81:astore_1        
			Float float1;
			if(((TypedArray) (obj)).hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude))
	//*  42   82:aload_3         
	//*  43   83:getstatic       #289 <Field int R$styleable.MapAttrs_latLngBoundsNorthEastLatitude>
	//*  44   86:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  45   89:ifeq            107
				float1 = Float.valueOf(((TypedArray) (obj)).getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0F));
	//   46   92:aload_3         
	//   47   93:getstatic       #289 <Field int R$styleable.MapAttrs_latLngBoundsNorthEastLatitude>
	//   48   96:fconst_0        
	//   49   97:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   50  100:invokestatic    #283 <Method Float Float.valueOf(float)>
	//   51  103:astore_2        
			else
	//*  52  104:goto            109
				float1 = null;
	//   53  107:aconst_null     
	//   54  108:astore_2        
			Float float2;
			if(((TypedArray) (obj)).hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude))
	//*  55  109:aload_3         
	//*  56  110:getstatic       #292 <Field int R$styleable.MapAttrs_latLngBoundsNorthEastLongitude>
	//*  57  113:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  58  116:ifeq            135
				float2 = Float.valueOf(((TypedArray) (obj)).getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0F));
	//   59  119:aload_3         
	//   60  120:getstatic       #292 <Field int R$styleable.MapAttrs_latLngBoundsNorthEastLongitude>
	//   61  123:fconst_0        
	//   62  124:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   63  127:invokestatic    #283 <Method Float Float.valueOf(float)>
	//   64  130:astore          4
			else
	//*  65  132:goto            138
				float2 = null;
	//   66  135:aconst_null     
	//   67  136:astore          4
			((TypedArray) (obj)).recycle();
	//   68  138:aload_3         
	//   69  139:invokevirtual   #274 <Method void TypedArray.recycle()>
			obj = ((Object) (obj1));
	//   70  142:aload           5
	//   71  144:astore_3        
			if(context != null)
	//*  72  145:aload_0         
	//*  73  146:ifnull          213
			{
				obj = ((Object) (obj1));
	//   74  149:aload           5
	//   75  151:astore_3        
				if(attributeset != null)
	//*  76  152:aload_1         
	//*  77  153:ifnull          213
				{
					obj = ((Object) (obj1));
	//   78  156:aload           5
	//   79  158:astore_3        
					if(float1 != null)
	//*  80  159:aload_2         
	//*  81  160:ifnull          213
					{
						if(float2 == null)
	//*  82  163:aload           4
	//*  83  165:ifnonnull       170
							return null;
	//   84  168:aconst_null     
	//   85  169:areturn         
						obj = ((Object) (new LatLngBounds(new LatLng(((Float) (context)).floatValue(), ((Float) (attributeset)).floatValue()), new LatLng(float1.floatValue(), float2.floatValue()))));
	//   86  170:new             #294 <Class LatLngBounds>
	//   87  173:dup             
	//   88  174:new             #296 <Class LatLng>
	//   89  177:dup             
	//   90  178:aload_0         
	//   91  179:invokevirtual   #300 <Method float Float.floatValue()>
	//   92  182:f2d             
	//   93  183:aload_1         
	//   94  184:invokevirtual   #300 <Method float Float.floatValue()>
	//   95  187:f2d             
	//   96  188:invokespecial   #303 <Method void LatLng(double, double)>
	//   97  191:new             #296 <Class LatLng>
	//   98  194:dup             
	//   99  195:aload_2         
	//  100  196:invokevirtual   #300 <Method float Float.floatValue()>
	//  101  199:f2d             
	//  102  200:aload           4
	//  103  202:invokevirtual   #300 <Method float Float.floatValue()>
	//  104  205:f2d             
	//  105  206:invokespecial   #303 <Method void LatLng(double, double)>
	//  106  209:invokespecial   #306 <Method void LatLngBounds(LatLng, LatLng)>
	//  107  212:astore_3        
					}
				}
			}
		}
		return ((LatLngBounds) (obj));
	//  108  213:aload_3         
	//  109  214:areturn         
	}

	public static CameraPosition zzb(Context context, AttributeSet attributeset)
	{
		if(context != null && attributeset != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          177
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            177
		{
			context = ((Context) (context.getResources().obtainAttributes(attributeset, R.styleable.MapAttrs)));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #137 <Method Resources Context.getResources()>
	//    7   15:aload_1         
	//    8   16:getstatic       #143 <Field int[] R$styleable.MapAttrs>
	//    9   19:invokevirtual   #149 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//   10   22:astore_0        
			float f;
			if(((TypedArray) (context)).hasValue(R.styleable.MapAttrs_cameraTargetLat))
	//*  11   23:aload_0         
	//*  12   24:getstatic       #309 <Field int R$styleable.MapAttrs_cameraTargetLat>
	//*  13   27:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  14   30:ifeq            45
				f = ((TypedArray) (context)).getFloat(R.styleable.MapAttrs_cameraTargetLat, 0.0F);
	//   15   33:aload_0         
	//   16   34:getstatic       #309 <Field int R$styleable.MapAttrs_cameraTargetLat>
	//   17   37:fconst_0        
	//   18   38:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   19   41:fstore_2        
			else
	//*  20   42:goto            47
				f = 0.0F;
	//   21   45:fconst_0        
	//   22   46:fstore_2        
			float f1;
			if(((TypedArray) (context)).hasValue(R.styleable.MapAttrs_cameraTargetLng))
	//*  23   47:aload_0         
	//*  24   48:getstatic       #312 <Field int R$styleable.MapAttrs_cameraTargetLng>
	//*  25   51:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  26   54:ifeq            69
				f1 = ((TypedArray) (context)).getFloat(R.styleable.MapAttrs_cameraTargetLng, 0.0F);
	//   27   57:aload_0         
	//   28   58:getstatic       #312 <Field int R$styleable.MapAttrs_cameraTargetLng>
	//   29   61:fconst_0        
	//   30   62:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   31   65:fstore_3        
			else
	//*  32   66:goto            71
				f1 = 0.0F;
	//   33   69:fconst_0        
	//   34   70:fstore_3        
			attributeset = ((AttributeSet) (new LatLng(f, f1)));
	//   35   71:new             #296 <Class LatLng>
	//   36   74:dup             
	//   37   75:fload_2         
	//   38   76:f2d             
	//   39   77:fload_3         
	//   40   78:f2d             
	//   41   79:invokespecial   #303 <Method void LatLng(double, double)>
	//   42   82:astore_1        
			com.google.android.gms.maps.model.CameraPosition.Builder builder = CameraPosition.builder();
	//   43   83:invokestatic    #318 <Method com.google.android.gms.maps.model.CameraPosition$Builder CameraPosition.builder()>
	//   44   86:astore          4
			builder.target(((LatLng) (attributeset)));
	//   45   88:aload           4
	//   46   90:aload_1         
	//   47   91:invokevirtual   #324 <Method com.google.android.gms.maps.model.CameraPosition$Builder com.google.android.gms.maps.model.CameraPosition$Builder.target(LatLng)>
	//   48   94:pop             
			if(((TypedArray) (context)).hasValue(R.styleable.MapAttrs_cameraZoom))
	//*  49   95:aload_0         
	//*  50   96:getstatic       #327 <Field int R$styleable.MapAttrs_cameraZoom>
	//*  51   99:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  52  102:ifeq            119
				builder.zoom(((TypedArray) (context)).getFloat(R.styleable.MapAttrs_cameraZoom, 0.0F));
	//   53  105:aload           4
	//   54  107:aload_0         
	//   55  108:getstatic       #327 <Field int R$styleable.MapAttrs_cameraZoom>
	//   56  111:fconst_0        
	//   57  112:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   58  115:invokevirtual   #331 <Method com.google.android.gms.maps.model.CameraPosition$Builder com.google.android.gms.maps.model.CameraPosition$Builder.zoom(float)>
	//   59  118:pop             
			if(((TypedArray) (context)).hasValue(R.styleable.MapAttrs_cameraBearing))
	//*  60  119:aload_0         
	//*  61  120:getstatic       #334 <Field int R$styleable.MapAttrs_cameraBearing>
	//*  62  123:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  63  126:ifeq            143
				builder.bearing(((TypedArray) (context)).getFloat(R.styleable.MapAttrs_cameraBearing, 0.0F));
	//   64  129:aload           4
	//   65  131:aload_0         
	//   66  132:getstatic       #334 <Field int R$styleable.MapAttrs_cameraBearing>
	//   67  135:fconst_0        
	//   68  136:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   69  139:invokevirtual   #337 <Method com.google.android.gms.maps.model.CameraPosition$Builder com.google.android.gms.maps.model.CameraPosition$Builder.bearing(float)>
	//   70  142:pop             
			if(((TypedArray) (context)).hasValue(R.styleable.MapAttrs_cameraTilt))
	//*  71  143:aload_0         
	//*  72  144:getstatic       #340 <Field int R$styleable.MapAttrs_cameraTilt>
	//*  73  147:invokevirtual   #159 <Method boolean TypedArray.hasValue(int)>
	//*  74  150:ifeq            167
				builder.tilt(((TypedArray) (context)).getFloat(R.styleable.MapAttrs_cameraTilt, 0.0F));
	//   75  153:aload           4
	//   76  155:aload_0         
	//   77  156:getstatic       #340 <Field int R$styleable.MapAttrs_cameraTilt>
	//   78  159:fconst_0        
	//   79  160:invokevirtual   #245 <Method float TypedArray.getFloat(int, float)>
	//   80  163:invokevirtual   #343 <Method com.google.android.gms.maps.model.CameraPosition$Builder com.google.android.gms.maps.model.CameraPosition$Builder.tilt(float)>
	//   81  166:pop             
			((TypedArray) (context)).recycle();
	//   82  167:aload_0         
	//   83  168:invokevirtual   #274 <Method void TypedArray.recycle()>
			return builder.build();
	//   84  171:aload           4
	//   85  173:invokevirtual   #347 <Method CameraPosition com.google.android.gms.maps.model.CameraPosition$Builder.build()>
	//   86  176:areturn         
		} else
		{
			return null;
	//   87  177:aconst_null     
	//   88  178:areturn         
		}
	}

	public final GoogleMapOptions ambientEnabled(boolean flag)
	{
		zzau = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #127 <Field Boolean zzau>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions camera(CameraPosition cameraposition)
	{
		zzal = cameraposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field CameraPosition zzal>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final GoogleMapOptions compassEnabled(boolean flag)
	{
		zzan = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #113 <Field Boolean zzan>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final Boolean getAmbientEnabled()
	{
		return zzau;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Boolean zzau>
	//    2    4:areturn         
	}

	public final CameraPosition getCamera()
	{
		return zzal;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field CameraPosition zzal>
	//    2    4:areturn         
	}

	public final Boolean getCompassEnabled()
	{
		return zzan;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Boolean zzan>
	//    2    4:areturn         
	}

	public final LatLngBounds getLatLngBoundsForCameraTarget()
	{
		return zzax;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field LatLngBounds zzax>
	//    2    4:areturn         
	}

	public final Boolean getLiteMode()
	{
		return zzas;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Boolean zzas>
	//    2    4:areturn         
	}

	public final Boolean getMapToolbarEnabled()
	{
		return zzat;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Boolean zzat>
	//    2    4:areturn         
	}

	public final int getMapType()
	{
		return mapType;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int mapType>
	//    2    4:ireturn         
	}

	public final Float getMaxZoomPreference()
	{
		return zzaw;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Float zzaw>
	//    2    4:areturn         
	}

	public final Float getMinZoomPreference()
	{
		return zzav;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Float zzav>
	//    2    4:areturn         
	}

	public final Boolean getRotateGesturesEnabled()
	{
		return zzar;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Boolean zzar>
	//    2    4:areturn         
	}

	public final Boolean getScrollGesturesEnabled()
	{
		return zzao;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Boolean zzao>
	//    2    4:areturn         
	}

	public final Boolean getTiltGesturesEnabled()
	{
		return zzaq;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Boolean zzaq>
	//    2    4:areturn         
	}

	public final Boolean getUseViewLifecycleInFragment()
	{
		return zzak;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Boolean zzak>
	//    2    4:areturn         
	}

	public final Boolean getZOrderOnTop()
	{
		return zzaj;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Boolean zzaj>
	//    2    4:areturn         
	}

	public final Boolean getZoomControlsEnabled()
	{
		return zzam;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Boolean zzam>
	//    2    4:areturn         
	}

	public final Boolean getZoomGesturesEnabled()
	{
		return zzap;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Boolean zzap>
	//    2    4:areturn         
	}

	public final GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latlngbounds)
	{
		zzax = latlngbounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field LatLngBounds zzax>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final GoogleMapOptions liteMode(boolean flag)
	{
		zzas = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #123 <Field Boolean zzas>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions mapToolbarEnabled(boolean flag)
	{
		zzat = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #125 <Field Boolean zzat>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions mapType(int i)
	{
		mapType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field int mapType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final GoogleMapOptions maxZoomPreference(float f)
	{
		zzaw = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #283 <Method Float Float.valueOf(float)>
	//    3    5:putfield        #92  <Field Float zzaw>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions minZoomPreference(float f)
	{
		zzav = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #283 <Method Float Float.valueOf(float)>
	//    3    5:putfield        #90  <Field Float zzav>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions rotateGesturesEnabled(boolean flag)
	{
		zzar = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #121 <Field Boolean zzar>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions scrollGesturesEnabled(boolean flag)
	{
		zzao = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #115 <Field Boolean zzao>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions tiltGesturesEnabled(boolean flag)
	{
		zzaq = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #119 <Field Boolean zzaq>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("MapType", ((Object) (Integer.valueOf(mapType)))).add("LiteMode", ((Object) (zzas))).add("Camera", ((Object) (zzal))).add("CompassEnabled", ((Object) (zzan))).add("ZoomControlsEnabled", ((Object) (zzam))).add("ScrollGesturesEnabled", ((Object) (zzao))).add("ZoomGesturesEnabled", ((Object) (zzap))).add("TiltGesturesEnabled", ((Object) (zzaq))).add("RotateGesturesEnabled", ((Object) (zzar))).add("MapToolbarEnabled", ((Object) (zzat))).add("AmbientEnabled", ((Object) (zzau))).add("MinZoomPreference", ((Object) (zzav))).add("MaxZoomPreference", ((Object) (zzaw))).add("LatLngBoundsForCameraTarget", ((Object) (zzax))).add("ZOrderOnTop", ((Object) (zzaj))).add("UseViewLifecycleInFragment", ((Object) (zzak))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #375 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc2            #377 <String "MapType">
	//    3    7:aload_0         
	//    4    8:getfield        #88  <Field int mapType>
	//    5   11:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//    6   14:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    7   17:ldc2            #390 <String "LiteMode">
	//    8   20:aload_0         
	//    9   21:getfield        #123 <Field Boolean zzas>
	//   10   24:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   11   27:ldc2            #392 <String "Camera">
	//   12   30:aload_0         
	//   13   31:getfield        #109 <Field CameraPosition zzal>
	//   14   34:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   15   37:ldc2            #394 <String "CompassEnabled">
	//   16   40:aload_0         
	//   17   41:getfield        #113 <Field Boolean zzan>
	//   18   44:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   19   47:ldc2            #396 <String "ZoomControlsEnabled">
	//   20   50:aload_0         
	//   21   51:getfield        #111 <Field Boolean zzam>
	//   22   54:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   23   57:ldc2            #398 <String "ScrollGesturesEnabled">
	//   24   60:aload_0         
	//   25   61:getfield        #115 <Field Boolean zzao>
	//   26   64:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   27   67:ldc2            #400 <String "ZoomGesturesEnabled">
	//   28   70:aload_0         
	//   29   71:getfield        #117 <Field Boolean zzap>
	//   30   74:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   31   77:ldc2            #402 <String "TiltGesturesEnabled">
	//   32   80:aload_0         
	//   33   81:getfield        #119 <Field Boolean zzaq>
	//   34   84:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   35   87:ldc2            #404 <String "RotateGesturesEnabled">
	//   36   90:aload_0         
	//   37   91:getfield        #121 <Field Boolean zzar>
	//   38   94:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   39   97:ldc2            #406 <String "MapToolbarEnabled">
	//   40  100:aload_0         
	//   41  101:getfield        #125 <Field Boolean zzat>
	//   42  104:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   43  107:ldc2            #408 <String "AmbientEnabled">
	//   44  110:aload_0         
	//   45  111:getfield        #127 <Field Boolean zzau>
	//   46  114:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   47  117:ldc2            #410 <String "MinZoomPreference">
	//   48  120:aload_0         
	//   49  121:getfield        #90  <Field Float zzav>
	//   50  124:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   51  127:ldc2            #412 <String "MaxZoomPreference">
	//   52  130:aload_0         
	//   53  131:getfield        #92  <Field Float zzaw>
	//   54  134:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   55  137:ldc2            #414 <String "LatLngBoundsForCameraTarget">
	//   56  140:aload_0         
	//   57  141:getfield        #94  <Field LatLngBounds zzax>
	//   58  144:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   59  147:ldc2            #416 <String "ZOrderOnTop">
	//   60  150:aload_0         
	//   61  151:getfield        #105 <Field Boolean zzaj>
	//   62  154:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   63  157:ldc2            #418 <String "UseViewLifecycleInFragment">
	//   64  160:aload_0         
	//   65  161:getfield        #107 <Field Boolean zzak>
	//   66  164:invokevirtual   #388 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   67  167:invokevirtual   #420 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   68  170:areturn         
	}

	public final GoogleMapOptions useViewLifecycleInFragment(boolean flag)
	{
		zzak = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #107 <Field Boolean zzak>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #428 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(zzaj));
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #105 <Field Boolean zzaj>
	//    7   11:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//    8   14:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(zzak));
	//    9   17:aload_1         
	//   10   18:iconst_3        
	//   11   19:aload_0         
	//   12   20:getfield        #107 <Field Boolean zzak>
	//   13   23:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   14   26:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeInt(parcel, 4, getMapType());
	//   15   29:aload_1         
	//   16   30:iconst_4        
	//   17   31:aload_0         
	//   18   32:invokevirtual   #437 <Method int getMapType()>
	//   19   35:invokestatic    #441 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 5, ((android.os.Parcelable) (getCamera())), i, false);
	//   20   38:aload_1         
	//   21   39:iconst_5        
	//   22   40:aload_0         
	//   23   41:invokevirtual   #443 <Method CameraPosition getCamera()>
	//   24   44:iload_2         
	//   25   45:iconst_0        
	//   26   46:invokestatic    #447 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(zzam));
	//   27   49:aload_1         
	//   28   50:bipush          6
	//   29   52:aload_0         
	//   30   53:getfield        #111 <Field Boolean zzam>
	//   31   56:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   32   59:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(zzan));
	//   33   62:aload_1         
	//   34   63:bipush          7
	//   35   65:aload_0         
	//   36   66:getfield        #113 <Field Boolean zzan>
	//   37   69:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   38   72:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(zzao));
	//   39   75:aload_1         
	//   40   76:bipush          8
	//   41   78:aload_0         
	//   42   79:getfield        #115 <Field Boolean zzao>
	//   43   82:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   44   85:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(zzap));
	//   45   88:aload_1         
	//   46   89:bipush          9
	//   47   91:aload_0         
	//   48   92:getfield        #117 <Field Boolean zzap>
	//   49   95:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   50   98:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(zzaq));
	//   51  101:aload_1         
	//   52  102:bipush          10
	//   53  104:aload_0         
	//   54  105:getfield        #119 <Field Boolean zzaq>
	//   55  108:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   56  111:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(zzar));
	//   57  114:aload_1         
	//   58  115:bipush          11
	//   59  117:aload_0         
	//   60  118:getfield        #121 <Field Boolean zzar>
	//   61  121:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   62  124:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(zzas));
	//   63  127:aload_1         
	//   64  128:bipush          12
	//   65  130:aload_0         
	//   66  131:getfield        #123 <Field Boolean zzas>
	//   67  134:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   68  137:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(zzat));
	//   69  140:aload_1         
	//   70  141:bipush          14
	//   71  143:aload_0         
	//   72  144:getfield        #125 <Field Boolean zzat>
	//   73  147:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   74  150:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(zzau));
	//   75  153:aload_1         
	//   76  154:bipush          15
	//   77  156:aload_0         
	//   78  157:getfield        #127 <Field Boolean zzau>
	//   79  160:invokestatic    #431 <Method byte zza.zza(Boolean)>
	//   80  163:invokestatic    #435 <Method void SafeParcelWriter.writeByte(Parcel, int, byte)>
		SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
	//   81  166:aload_1         
	//   82  167:bipush          16
	//   83  169:aload_0         
	//   84  170:invokevirtual   #449 <Method Float getMinZoomPreference()>
	//   85  173:iconst_0        
	//   86  174:invokestatic    #453 <Method void SafeParcelWriter.writeFloatObject(Parcel, int, Float, boolean)>
		SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
	//   87  177:aload_1         
	//   88  178:bipush          17
	//   89  180:aload_0         
	//   90  181:invokevirtual   #455 <Method Float getMaxZoomPreference()>
	//   91  184:iconst_0        
	//   92  185:invokestatic    #453 <Method void SafeParcelWriter.writeFloatObject(Parcel, int, Float, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 18, ((android.os.Parcelable) (getLatLngBoundsForCameraTarget())), i, false);
	//   93  188:aload_1         
	//   94  189:bipush          18
	//   95  191:aload_0         
	//   96  192:invokevirtual   #457 <Method LatLngBounds getLatLngBoundsForCameraTarget()>
	//   97  195:iload_2         
	//   98  196:iconst_0        
	//   99  197:invokestatic    #447 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//  100  200:aload_1         
	//  101  201:iload_3         
	//  102  202:invokestatic    #460 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//  103  205:return          
	}

	public final GoogleMapOptions zOrderOnTop(boolean flag)
	{
		zzaj = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #105 <Field Boolean zzaj>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions zoomControlsEnabled(boolean flag)
	{
		zzam = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #111 <Field Boolean zzam>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public final GoogleMapOptions zoomGesturesEnabled(boolean flag)
	{
		zzap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #352 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #117 <Field Boolean zzap>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaa();
	private int mapType;
	private Boolean zzaj;
	private Boolean zzak;
	private CameraPosition zzal;
	private Boolean zzam;
	private Boolean zzan;
	private Boolean zzao;
	private Boolean zzap;
	private Boolean zzaq;
	private Boolean zzar;
	private Boolean zzas;
	private Boolean zzat;
	private Boolean zzau;
	private Float zzav;
	private Float zzaw;
	private LatLngBounds zzax;

	static 
	{
	//    0    0:new             #79  <Class zzaa>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void zzaa()>
	//    3    7:putstatic       #84  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

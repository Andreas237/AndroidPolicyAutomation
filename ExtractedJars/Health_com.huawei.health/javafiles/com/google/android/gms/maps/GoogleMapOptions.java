// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.maps:
//			zza

public final class GoogleMapOptions extends zza
	implements ReflectedParcelable
{

	public GoogleMapOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zza()>
		zzboa = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #43  <Field int zzboa>
		zzbol = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field Float zzbol>
		zzbom = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field Float zzbom>
		zzbon = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field LatLngBounds zzbon>
	//   14   24:return          
	}

	GoogleMapOptions(byte byte0, byte byte1, int i, CameraPosition cameraposition, byte byte2, byte byte3, byte byte4, 
			byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10, Float float1, 
			Float float2, LatLngBounds latlngbounds)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void zza()>
		zzboa = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #43  <Field int zzboa>
		zzbol = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field Float zzbol>
		zzbom = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field Float zzbom>
		zzbon = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field LatLngBounds zzbon>
		zzbnY = com.google.android.gms.maps.internal.zza.zza(byte0);
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   17   29:putfield        #58  <Field Boolean zzbnY>
		zzbnZ = com.google.android.gms.maps.internal.zza.zza(byte1);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   21   37:putfield        #60  <Field Boolean zzbnZ>
		zzboa = i;
	//   22   40:aload_0         
	//   23   41:iload_3         
	//   24   42:putfield        #43  <Field int zzboa>
		zzbob = cameraposition;
	//   25   45:aload_0         
	//   26   46:aload           4
	//   27   48:putfield        #62  <Field CameraPosition zzbob>
		zzboc = com.google.android.gms.maps.internal.zza.zza(byte2);
	//   28   51:aload_0         
	//   29   52:iload           5
	//   30   54:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   31   57:putfield        #64  <Field Boolean zzboc>
		zzbod = com.google.android.gms.maps.internal.zza.zza(byte3);
	//   32   60:aload_0         
	//   33   61:iload           6
	//   34   63:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   35   66:putfield        #66  <Field Boolean zzbod>
		zzboe = com.google.android.gms.maps.internal.zza.zza(byte4);
	//   36   69:aload_0         
	//   37   70:iload           7
	//   38   72:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   39   75:putfield        #68  <Field Boolean zzboe>
		zzbof = com.google.android.gms.maps.internal.zza.zza(byte5);
	//   40   78:aload_0         
	//   41   79:iload           8
	//   42   81:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   43   84:putfield        #70  <Field Boolean zzbof>
		zzbog = com.google.android.gms.maps.internal.zza.zza(byte6);
	//   44   87:aload_0         
	//   45   88:iload           9
	//   46   90:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   47   93:putfield        #72  <Field Boolean zzbog>
		zzboh = com.google.android.gms.maps.internal.zza.zza(byte7);
	//   48   96:aload_0         
	//   49   97:iload           10
	//   50   99:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   51  102:putfield        #74  <Field Boolean zzboh>
		zzboi = com.google.android.gms.maps.internal.zza.zza(byte8);
	//   52  105:aload_0         
	//   53  106:iload           11
	//   54  108:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   55  111:putfield        #76  <Field Boolean zzboi>
		zzboj = com.google.android.gms.maps.internal.zza.zza(byte9);
	//   56  114:aload_0         
	//   57  115:iload           12
	//   58  117:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   59  120:putfield        #78  <Field Boolean zzboj>
		zzbok = com.google.android.gms.maps.internal.zza.zza(byte10);
	//   60  123:aload_0         
	//   61  124:iload           13
	//   62  126:invokestatic    #56  <Method Boolean com.google.android.gms.maps.internal.zza.zza(byte)>
	//   63  129:putfield        #80  <Field Boolean zzbok>
		zzbol = float1;
	//   64  132:aload_0         
	//   65  133:aload           14
	//   66  135:putfield        #45  <Field Float zzbol>
		zzbom = float2;
	//   67  138:aload_0         
	//   68  139:aload           15
	//   69  141:putfield        #47  <Field Float zzbom>
		zzbon = latlngbounds;
	//   70  144:aload_0         
	//   71  145:aload           16
	//   72  147:putfield        #49  <Field LatLngBounds zzbon>
	//   73  150:return          
	}

	public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeset)
	{
		if(attributeset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		TypedArray typedarray = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #88  <Method Resources Context.getResources()>
	//    6   10:aload_1         
	//    7   11:getstatic       #94  <Field int[] com.google.android.gms.R$styleable.MapAttrs>
	//    8   14:invokevirtual   #100 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    9   17:astore_2        
		GoogleMapOptions googlemapoptions = new GoogleMapOptions();
	//   10   18:new             #2   <Class GoogleMapOptions>
	//   11   21:dup             
	//   12   22:invokespecial   #101 <Method void GoogleMapOptions()>
	//   13   25:astore_3        
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_mapType))
	//*  14   26:aload_2         
	//*  15   27:getstatic       #104 <Field int com.google.android.gms.R$styleable.MapAttrs_mapType>
	//*  16   30:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  17   33:ifeq            49
			googlemapoptions.mapType(typedarray.getInt(com.google.android.gms.R.styleable.MapAttrs_mapType, -1));
	//   18   36:aload_3         
	//   19   37:aload_2         
	//   20   38:getstatic       #104 <Field int com.google.android.gms.R$styleable.MapAttrs_mapType>
	//   21   41:iconst_m1       
	//   22   42:invokevirtual   #114 <Method int TypedArray.getInt(int, int)>
	//   23   45:invokevirtual   #118 <Method GoogleMapOptions mapType(int)>
	//   24   48:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop))
	//*  25   49:aload_2         
	//*  26   50:getstatic       #121 <Field int com.google.android.gms.R$styleable.MapAttrs_zOrderOnTop>
	//*  27   53:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  28   56:ifeq            72
			googlemapoptions.zOrderOnTop(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop, false));
	//   29   59:aload_3         
	//   30   60:aload_2         
	//   31   61:getstatic       #121 <Field int com.google.android.gms.R$styleable.MapAttrs_zOrderOnTop>
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   34   68:invokevirtual   #129 <Method GoogleMapOptions zOrderOnTop(boolean)>
	//   35   71:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle))
	//*  36   72:aload_2         
	//*  37   73:getstatic       #132 <Field int com.google.android.gms.R$styleable.MapAttrs_useViewLifecycle>
	//*  38   76:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  39   79:ifeq            95
			googlemapoptions.useViewLifecycleInFragment(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle, false));
	//   40   82:aload_3         
	//   41   83:aload_2         
	//   42   84:getstatic       #132 <Field int com.google.android.gms.R$styleable.MapAttrs_useViewLifecycle>
	//   43   87:iconst_0        
	//   44   88:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   45   91:invokevirtual   #135 <Method GoogleMapOptions useViewLifecycleInFragment(boolean)>
	//   46   94:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiCompass))
	//*  47   95:aload_2         
	//*  48   96:getstatic       #138 <Field int com.google.android.gms.R$styleable.MapAttrs_uiCompass>
	//*  49   99:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  50  102:ifeq            118
			googlemapoptions.compassEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiCompass, true));
	//   51  105:aload_3         
	//   52  106:aload_2         
	//   53  107:getstatic       #138 <Field int com.google.android.gms.R$styleable.MapAttrs_uiCompass>
	//   54  110:iconst_1        
	//   55  111:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   56  114:invokevirtual   #141 <Method GoogleMapOptions compassEnabled(boolean)>
	//   57  117:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures))
	//*  58  118:aload_2         
	//*  59  119:getstatic       #144 <Field int com.google.android.gms.R$styleable.MapAttrs_uiRotateGestures>
	//*  60  122:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  61  125:ifeq            141
			googlemapoptions.rotateGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures, true));
	//   62  128:aload_3         
	//   63  129:aload_2         
	//   64  130:getstatic       #144 <Field int com.google.android.gms.R$styleable.MapAttrs_uiRotateGestures>
	//   65  133:iconst_1        
	//   66  134:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   67  137:invokevirtual   #147 <Method GoogleMapOptions rotateGesturesEnabled(boolean)>
	//   68  140:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures))
	//*  69  141:aload_2         
	//*  70  142:getstatic       #150 <Field int com.google.android.gms.R$styleable.MapAttrs_uiScrollGestures>
	//*  71  145:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  72  148:ifeq            164
			googlemapoptions.scrollGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures, true));
	//   73  151:aload_3         
	//   74  152:aload_2         
	//   75  153:getstatic       #150 <Field int com.google.android.gms.R$styleable.MapAttrs_uiScrollGestures>
	//   76  156:iconst_1        
	//   77  157:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   78  160:invokevirtual   #153 <Method GoogleMapOptions scrollGesturesEnabled(boolean)>
	//   79  163:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures))
	//*  80  164:aload_2         
	//*  81  165:getstatic       #156 <Field int com.google.android.gms.R$styleable.MapAttrs_uiTiltGestures>
	//*  82  168:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  83  171:ifeq            187
			googlemapoptions.tiltGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures, true));
	//   84  174:aload_3         
	//   85  175:aload_2         
	//   86  176:getstatic       #156 <Field int com.google.android.gms.R$styleable.MapAttrs_uiTiltGestures>
	//   87  179:iconst_1        
	//   88  180:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   89  183:invokevirtual   #159 <Method GoogleMapOptions tiltGesturesEnabled(boolean)>
	//   90  186:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures))
	//*  91  187:aload_2         
	//*  92  188:getstatic       #162 <Field int com.google.android.gms.R$styleable.MapAttrs_uiZoomGestures>
	//*  93  191:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//*  94  194:ifeq            210
			googlemapoptions.zoomGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures, true));
	//   95  197:aload_3         
	//   96  198:aload_2         
	//   97  199:getstatic       #162 <Field int com.google.android.gms.R$styleable.MapAttrs_uiZoomGestures>
	//   98  202:iconst_1        
	//   99  203:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  100  206:invokevirtual   #165 <Method GoogleMapOptions zoomGesturesEnabled(boolean)>
	//  101  209:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls))
	//* 102  210:aload_2         
	//* 103  211:getstatic       #168 <Field int com.google.android.gms.R$styleable.MapAttrs_uiZoomControls>
	//* 104  214:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//* 105  217:ifeq            233
			googlemapoptions.zoomControlsEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls, true));
	//  106  220:aload_3         
	//  107  221:aload_2         
	//  108  222:getstatic       #168 <Field int com.google.android.gms.R$styleable.MapAttrs_uiZoomControls>
	//  109  225:iconst_1        
	//  110  226:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  111  229:invokevirtual   #171 <Method GoogleMapOptions zoomControlsEnabled(boolean)>
	//  112  232:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_liteMode))
	//* 113  233:aload_2         
	//* 114  234:getstatic       #174 <Field int com.google.android.gms.R$styleable.MapAttrs_liteMode>
	//* 115  237:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//* 116  240:ifeq            256
			googlemapoptions.liteMode(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_liteMode, false));
	//  117  243:aload_3         
	//  118  244:aload_2         
	//  119  245:getstatic       #174 <Field int com.google.android.gms.R$styleable.MapAttrs_liteMode>
	//  120  248:iconst_0        
	//  121  249:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  122  252:invokevirtual   #177 <Method GoogleMapOptions liteMode(boolean)>
	//  123  255:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar))
	//* 124  256:aload_2         
	//* 125  257:getstatic       #180 <Field int com.google.android.gms.R$styleable.MapAttrs_uiMapToolbar>
	//* 126  260:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//* 127  263:ifeq            279
			googlemapoptions.mapToolbarEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar, true));
	//  128  266:aload_3         
	//  129  267:aload_2         
	//  130  268:getstatic       #180 <Field int com.google.android.gms.R$styleable.MapAttrs_uiMapToolbar>
	//  131  271:iconst_1        
	//  132  272:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  133  275:invokevirtual   #183 <Method GoogleMapOptions mapToolbarEnabled(boolean)>
	//  134  278:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_ambientEnabled))
	//* 135  279:aload_2         
	//* 136  280:getstatic       #186 <Field int com.google.android.gms.R$styleable.MapAttrs_ambientEnabled>
	//* 137  283:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//* 138  286:ifeq            302
			googlemapoptions.ambientEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_ambientEnabled, false));
	//  139  289:aload_3         
	//  140  290:aload_2         
	//  141  291:getstatic       #186 <Field int com.google.android.gms.R$styleable.MapAttrs_ambientEnabled>
	//  142  294:iconst_0        
	//  143  295:invokevirtual   #125 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  144  298:invokevirtual   #189 <Method GoogleMapOptions ambientEnabled(boolean)>
	//  145  301:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraMinZoomPreference))
	//* 146  302:aload_2         
	//* 147  303:getstatic       #192 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraMinZoomPreference>
	//* 148  306:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//* 149  309:ifeq            326
			googlemapoptions.minZoomPreference(typedarray.getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraMinZoomPreference, (-1.0F / 0.0F)));
	//  150  312:aload_3         
	//  151  313:aload_2         
	//  152  314:getstatic       #192 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraMinZoomPreference>
	//  153  317:ldc1            #193 <Float (-1.0F / 0.0F)>
	//  154  319:invokevirtual   #197 <Method float TypedArray.getFloat(int, float)>
	//  155  322:invokevirtual   #201 <Method GoogleMapOptions minZoomPreference(float)>
	//  156  325:pop             
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraMinZoomPreference))
	//* 157  326:aload_2         
	//* 158  327:getstatic       #192 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraMinZoomPreference>
	//* 159  330:invokevirtual   #110 <Method boolean TypedArray.hasValue(int)>
	//* 160  333:ifeq            350
			googlemapoptions.maxZoomPreference(typedarray.getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraMaxZoomPreference, (1.0F / 0.0F)));
	//  161  336:aload_3         
	//  162  337:aload_2         
	//  163  338:getstatic       #204 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraMaxZoomPreference>
	//  164  341:ldc1            #205 <Float (1.0F / 0.0F)>
	//  165  343:invokevirtual   #197 <Method float TypedArray.getFloat(int, float)>
	//  166  346:invokevirtual   #208 <Method GoogleMapOptions maxZoomPreference(float)>
	//  167  349:pop             
		googlemapoptions.latLngBoundsForCameraTarget(LatLngBounds.createFromAttributes(context, attributeset));
	//  168  350:aload_3         
	//  169  351:aload_0         
	//  170  352:aload_1         
	//  171  353:invokestatic    #213 <Method LatLngBounds LatLngBounds.createFromAttributes(Context, AttributeSet)>
	//  172  356:invokevirtual   #217 <Method GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds)>
	//  173  359:pop             
		googlemapoptions.camera(CameraPosition.createFromAttributes(context, attributeset));
	//  174  360:aload_3         
	//  175  361:aload_0         
	//  176  362:aload_1         
	//  177  363:invokestatic    #222 <Method CameraPosition CameraPosition.createFromAttributes(Context, AttributeSet)>
	//  178  366:invokevirtual   #226 <Method GoogleMapOptions camera(CameraPosition)>
	//  179  369:pop             
		typedarray.recycle();
	//  180  370:aload_2         
	//  181  371:invokevirtual   #229 <Method void TypedArray.recycle()>
		return googlemapoptions;
	//  182  374:aload_3         
	//  183  375:areturn         
	}

	public GoogleMapOptions ambientEnabled(boolean flag)
	{
		zzbok = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #80  <Field Boolean zzbok>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions camera(CameraPosition cameraposition)
	{
		zzbob = cameraposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field CameraPosition zzbob>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GoogleMapOptions compassEnabled(boolean flag)
	{
		zzbod = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #66  <Field Boolean zzbod>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Boolean getAmbientEnabled()
	{
		return zzbok;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Boolean zzbok>
	//    2    4:areturn         
	}

	public CameraPosition getCamera()
	{
		return zzbob;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field CameraPosition zzbob>
	//    2    4:areturn         
	}

	public Boolean getCompassEnabled()
	{
		return zzbod;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Boolean zzbod>
	//    2    4:areturn         
	}

	public LatLngBounds getLatLngBoundsForCameraTarget()
	{
		return zzbon;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field LatLngBounds zzbon>
	//    2    4:areturn         
	}

	public Boolean getLiteMode()
	{
		return zzboi;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Boolean zzboi>
	//    2    4:areturn         
	}

	public Boolean getMapToolbarEnabled()
	{
		return zzboj;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Boolean zzboj>
	//    2    4:areturn         
	}

	public int getMapType()
	{
		return zzboa;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zzboa>
	//    2    4:ireturn         
	}

	public Float getMaxZoomPreference()
	{
		return zzbom;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Float zzbom>
	//    2    4:areturn         
	}

	public Float getMinZoomPreference()
	{
		return zzbol;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Float zzbol>
	//    2    4:areturn         
	}

	public Boolean getRotateGesturesEnabled()
	{
		return zzboh;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Boolean zzboh>
	//    2    4:areturn         
	}

	public Boolean getScrollGesturesEnabled()
	{
		return zzboe;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Boolean zzboe>
	//    2    4:areturn         
	}

	public Boolean getTiltGesturesEnabled()
	{
		return zzbog;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Boolean zzbog>
	//    2    4:areturn         
	}

	public Boolean getUseViewLifecycleInFragment()
	{
		return zzbnZ;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Boolean zzbnZ>
	//    2    4:areturn         
	}

	public Boolean getZOrderOnTop()
	{
		return zzbnY;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Boolean zzbnY>
	//    2    4:areturn         
	}

	public Boolean getZoomControlsEnabled()
	{
		return zzboc;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Boolean zzboc>
	//    2    4:areturn         
	}

	public Boolean getZoomGesturesEnabled()
	{
		return zzbof;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Boolean zzbof>
	//    2    4:areturn         
	}

	public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latlngbounds)
	{
		zzbon = latlngbounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field LatLngBounds zzbon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GoogleMapOptions liteMode(boolean flag)
	{
		zzboi = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #76  <Field Boolean zzboi>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions mapToolbarEnabled(boolean flag)
	{
		zzboj = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #78  <Field Boolean zzboj>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions mapType(int i)
	{
		zzboa = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int zzboa>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GoogleMapOptions maxZoomPreference(float f)
	{
		zzbom = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #261 <Method Float Float.valueOf(float)>
	//    3    5:putfield        #47  <Field Float zzbom>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions minZoomPreference(float f)
	{
		zzbol = Float.valueOf(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #261 <Method Float Float.valueOf(float)>
	//    3    5:putfield        #45  <Field Float zzbol>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions rotateGesturesEnabled(boolean flag)
	{
		zzboh = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #74  <Field Boolean zzboh>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions scrollGesturesEnabled(boolean flag)
	{
		zzboe = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #68  <Field Boolean zzboe>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions tiltGesturesEnabled(boolean flag)
	{
		zzbog = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #72  <Field Boolean zzbog>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
	{
		zzbnZ = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #60  <Field Boolean zzbnZ>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.zza.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #266 <Method void com.google.android.gms.maps.zza.zza(GoogleMapOptions, Parcel, int)>
	//    4    6:return          
	}

	public GoogleMapOptions zOrderOnTop(boolean flag)
	{
		zzbnY = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #58  <Field Boolean zzbnY>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions zoomControlsEnabled(boolean flag)
	{
		zzboc = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #64  <Field Boolean zzboc>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public GoogleMapOptions zoomGesturesEnabled(boolean flag)
	{
		zzbof = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #235 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #70  <Field Boolean zzbof>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	byte zzJo()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbnY);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Boolean zzbnY>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJp()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbnZ);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Boolean zzbnZ>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJq()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboc);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Boolean zzboc>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJr()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbod);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Boolean zzbod>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJs()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboe);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Boolean zzboe>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJt()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbof);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Boolean zzbof>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJu()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbog);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Boolean zzbog>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJv()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboh);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Boolean zzboh>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJw()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboi);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Boolean zzboi>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJx()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzboj);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Boolean zzboj>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	byte zzJy()
	{
		return com.google.android.gms.maps.internal.zza.zzd(zzbok);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Boolean zzbok>
	//    2    4:invokestatic    #272 <Method byte com.google.android.gms.maps.internal.zza.zzd(Boolean)>
	//    3    7:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.maps.zza();
	private Boolean zzbnY;
	private Boolean zzbnZ;
	private int zzboa;
	private CameraPosition zzbob;
	private Boolean zzboc;
	private Boolean zzbod;
	private Boolean zzboe;
	private Boolean zzbof;
	private Boolean zzbog;
	private Boolean zzboh;
	private Boolean zzboi;
	private Boolean zzboj;
	private Boolean zzbok;
	private Float zzbol;
	private Float zzbom;
	private LatLngBounds zzbon;

	static 
	{
	//    0    0:new             #34  <Class com.google.android.gms.maps.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void com.google.android.gms.maps.zza()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}

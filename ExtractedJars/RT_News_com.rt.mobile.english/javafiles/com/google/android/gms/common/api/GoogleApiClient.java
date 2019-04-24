// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zzav;
import com.google.android.gms.common.api.internal.zzch;
import com.google.android.gms.common.api.internal.zzi;
import com.google.android.gms.common.api.internal.zzp;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignIn;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//			PendingResult, Api, Scope

public abstract class GoogleApiClient
{
	public static final class Builder
	{

		private final transient void zza(Api api, Api.ApiOptions apioptions, Scope ascope[])
		{
			apioptions = ((Api.ApiOptions) (new HashSet(((java.util.Collection) (api.zzj().getImpliedScopes(((Object) (apioptions))))))));
		//    0    0:new             #55  <Class HashSet>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #148 <Method Api$BaseClientBuilder Api.zzj()>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #154 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//    6   12:invokespecial   #157 <Method void HashSet(java.util.Collection)>
		//    7   15:astore_2        
			int i = 0;
		//    8   16:iconst_0        
		//    9   17:istore          4
			for(int j = ascope.length; i < j; i++)
		//*  10   19:aload_3         
		//*  11   20:arraylength     
		//*  12   21:istore          5
		//*  13   23:iload           4
		//*  14   25:iload           5
		//*  15   27:icmpge          50
				((Set) (apioptions)).add(((Object) (ascope[i])));
		//   16   30:aload_2         
		//   17   31:aload_3         
		//   18   32:iload           4
		//   19   34:aaload          
		//   20   35:invokeinterface #160 <Method boolean Set.add(Object)>
		//   21   40:pop             

		//   22   41:iload           4
		//   23   43:iconst_1        
		//   24   44:iadd            
		//   25   45:istore          4
		//*  26   47:goto            23
			zzdb.put(((Object) (api)), ((Object) (new com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings(((Set) (apioptions))))));
		//   27   50:aload_0         
		//   28   51:getfield        #65  <Field Map zzdb>
		//   29   54:aload_1         
		//   30   55:new             #162 <Class com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings>
		//   31   58:dup             
		//   32   59:aload_2         
		//   33   60:invokespecial   #165 <Method void com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings(Set)>
		//   34   63:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   35   68:pop             
		//   36   69:return          
		}

		public final Builder addApi(Api api)
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #176 <String "Api must not be null">
		//    2    3:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zzdc.put(((Object) (api)), ((Object) (null)));
		//    4    7:aload_0         
		//    5    8:getfield        #67  <Field Map zzdc>
		//    6   11:aload_1         
		//    7   12:aconst_null     
		//    8   13:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//    9   18:pop             
			api = ((Api) (api.zzj().getImpliedScopes(((Object) (null)))));
		//   10   19:aload_1         
		//   11   20:invokevirtual   #148 <Method Api$BaseClientBuilder Api.zzj()>
		//   12   23:aconst_null     
		//   13   24:invokevirtual   #154 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//   14   27:astore_1        
			zzcw.addAll(((java.util.Collection) (api)));
		//   15   28:aload_0         
		//   16   29:getfield        #60  <Field Set zzcw>
		//   17   32:aload_1         
		//   18   33:invokeinterface #180 <Method boolean Set.addAll(java.util.Collection)>
		//   19   38:pop             
			zzcv.addAll(((java.util.Collection) (api)));
		//   20   39:aload_0         
		//   21   40:getfield        #58  <Field Set zzcv>
		//   22   43:aload_1         
		//   23   44:invokeinterface #180 <Method boolean Set.addAll(java.util.Collection)>
		//   24   49:pop             
			return this;
		//   25   50:aload_0         
		//   26   51:areturn         
		}

		public final Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #176 <String "Api must not be null">
		//    2    3:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			Preconditions.checkNotNull(((Object) (hasoptions)), "Null options are not permitted for this Api");
		//    4    7:aload_2         
		//    5    8:ldc1            #184 <String "Null options are not permitted for this Api">
		//    6   10:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    7   13:pop             
			zzdc.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   14:aload_0         
		//    9   15:getfield        #67  <Field Map zzdc>
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   13   25:pop             
			api = ((Api) (api.zzj().getImpliedScopes(((Object) (hasoptions)))));
		//   14   26:aload_1         
		//   15   27:invokevirtual   #148 <Method Api$BaseClientBuilder Api.zzj()>
		//   16   30:aload_2         
		//   17   31:invokevirtual   #154 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//   18   34:astore_1        
			zzcw.addAll(((java.util.Collection) (api)));
		//   19   35:aload_0         
		//   20   36:getfield        #60  <Field Set zzcw>
		//   21   39:aload_1         
		//   22   40:invokeinterface #180 <Method boolean Set.addAll(java.util.Collection)>
		//   23   45:pop             
			zzcv.addAll(((java.util.Collection) (api)));
		//   24   46:aload_0         
		//   25   47:getfield        #58  <Field Set zzcv>
		//   26   50:aload_1         
		//   27   51:invokeinterface #180 <Method boolean Set.addAll(java.util.Collection)>
		//   28   56:pop             
			return this;
		//   29   57:aload_0         
		//   30   58:areturn         
		}

		public final transient Builder addApiIfAvailable(Api api, Api.ApiOptions.HasOptions hasoptions, Scope ascope[])
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #176 <String "Api must not be null">
		//    2    3:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			Preconditions.checkNotNull(((Object) (hasoptions)), "Null options are not permitted for this Api");
		//    4    7:aload_2         
		//    5    8:ldc1            #184 <String "Null options are not permitted for this Api">
		//    6   10:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    7   13:pop             
			zzdc.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   14:aload_0         
		//    9   15:getfield        #67  <Field Map zzdc>
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   13   25:pop             
			zza(api, ((Api.ApiOptions) (hasoptions)), ascope);
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:aload_2         
		//   17   29:aload_3         
		//   18   30:invokespecial   #189 <Method void zza(Api, Api$ApiOptions, Scope[])>
			return this;
		//   19   33:aload_0         
		//   20   34:areturn         
		}

		public final transient Builder addApiIfAvailable(Api api, Scope ascope[])
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #176 <String "Api must not be null">
		//    2    3:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zzdc.put(((Object) (api)), ((Object) (null)));
		//    4    7:aload_0         
		//    5    8:getfield        #67  <Field Map zzdc>
		//    6   11:aload_1         
		//    7   12:aconst_null     
		//    8   13:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//    9   18:pop             
			zza(api, ((Api.ApiOptions) (null)), ascope);
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:aconst_null     
		//   13   22:aload_2         
		//   14   23:invokespecial   #189 <Method void zza(Api, Api$ApiOptions, Scope[])>
			return this;
		//   15   26:aload_0         
		//   16   27:areturn         
		}

		public final Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
		{
			Preconditions.checkNotNull(((Object) (connectioncallbacks)), "Listener must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #196 <String "Listener must not be null">
		//    2    3:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zzdi.add(((Object) (connectioncallbacks)));
		//    4    7:aload_0         
		//    5    8:getfield        #89  <Field ArrayList zzdi>
		//    6   11:aload_1         
		//    7   12:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//    8   15:pop             
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public final Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
		{
			Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)), "Listener must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #196 <String "Listener must not be null">
		//    2    3:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zzdj.add(((Object) (onconnectionfailedlistener)));
		//    4    7:aload_0         
		//    5    8:getfield        #91  <Field ArrayList zzdj>
		//    6   11:aload_1         
		//    7   12:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//    8   15:pop             
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public final Builder addScope(Scope scope)
		{
			Preconditions.checkNotNull(((Object) (scope)), "Scope must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #202 <String "Scope must not be null">
		//    2    3:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zzcv.add(((Object) (scope)));
		//    4    7:aload_0         
		//    5    8:getfield        #58  <Field Set zzcv>
		//    6   11:aload_1         
		//    7   12:invokeinterface #160 <Method boolean Set.add(Object)>
		//    8   17:pop             
			return this;
		//    9   18:aload_0         
		//   10   19:areturn         
		}

		public final Builder addScopeNames(String as[])
		{
			for(int i = 0; i < as.length; i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_2        
		//*   2    2:iload_2         
		//*   3    3:aload_1         
		//*   4    4:arraylength     
		//*   5    5:icmpge          35
				zzcv.add(((Object) (new Scope(as[i]))));
		//    6    8:aload_0         
		//    7    9:getfield        #58  <Field Set zzcv>
		//    8   12:new             #206 <Class Scope>
		//    9   15:dup             
		//   10   16:aload_1         
		//   11   17:iload_2         
		//   12   18:aaload          
		//   13   19:invokespecial   #209 <Method void Scope(String)>
		//   14   22:invokeinterface #160 <Method boolean Set.add(Object)>
		//   15   27:pop             

		//   16   28:iload_2         
		//   17   29:iconst_1        
		//   18   30:iadd            
		//   19   31:istore_2        
		//*  20   32:goto            2
			return this;
		//   21   35:aload_0         
		//   22   36:areturn         
		}

		public final GoogleApiClient build()
		{
			Preconditions.checkArgument(zzdc.isEmpty() ^ true, "must call addApi() to add at least one API");
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field Map zzdc>
		//    2    4:invokeinterface #215 <Method boolean Map.isEmpty()>
		//    3    9:iconst_1        
		//    4   10:ixor            
		//    5   11:ldc1            #217 <String "must call addApi() to add at least one API">
		//    6   13:invokestatic    #221 <Method void Preconditions.checkArgument(boolean, Object)>
			ClientSettings clientsettings = buildClientSettings();
		//    7   16:aload_0         
		//    8   17:invokevirtual   #225 <Method ClientSettings buildClientSettings()>
		//    9   20:astore          8
			Object obj = null;
		//   10   22:aconst_null     
		//   11   23:astore_3        
			Map map = clientsettings.getOptionalApiSettings();
		//   12   24:aload           8
		//   13   26:invokevirtual   #231 <Method Map ClientSettings.getOptionalApiSettings()>
		//   14   29:astore          5
			ArrayMap arraymap = new ArrayMap();
		//   15   31:new             #62  <Class ArrayMap>
		//   16   34:dup             
		//   17   35:invokespecial   #63  <Method void ArrayMap()>
		//   18   38:astore          9
			ArrayMap arraymap1 = new ArrayMap();
		//   19   40:new             #62  <Class ArrayMap>
		//   20   43:dup             
		//   21   44:invokespecial   #63  <Method void ArrayMap()>
		//   22   47:astore          10
			ArrayList arraylist = new ArrayList();
		//   23   49:new             #86  <Class ArrayList>
		//   24   52:dup             
		//   25   53:invokespecial   #87  <Method void ArrayList()>
		//   26   56:astore          11
			Object obj1 = ((Object) (zzdc.keySet().iterator()));
		//   27   58:aload_0         
		//   28   59:getfield        #67  <Field Map zzdc>
		//   29   62:invokeinterface #235 <Method Set Map.keySet()>
		//   30   67:invokeinterface #239 <Method Iterator Set.iterator()>
		//   31   72:astore          4
			boolean flag = false;
		//   32   74:iconst_0        
		//   33   75:istore_1        
			Object obj2;
			for(; ((Iterator) (obj1)).hasNext(); obj = obj2)
		//*  34   76:aload           4
		//*  35   78:invokeinterface #244 <Method boolean Iterator.hasNext()>
		//*  36   83:ifeq            334
			{
				Api api = (Api)((Iterator) (obj1)).next();
		//   37   86:aload           4
		//   38   88:invokeinterface #248 <Method Object Iterator.next()>
		//   39   93:checkcast       #144 <Class Api>
		//   40   96:astore          7
				obj2 = zzdc.get(((Object) (api)));
		//   41   98:aload_0         
		//   42   99:getfield        #67  <Field Map zzdc>
		//   43  102:aload           7
		//   44  104:invokeinterface #252 <Method Object Map.get(Object)>
		//   45  109:astore          6
				boolean flag1;
				if(map.get(((Object) (api))) != null)
		//*  46  111:aload           5
		//*  47  113:aload           7
		//*  48  115:invokeinterface #252 <Method Object Map.get(Object)>
		//*  49  120:ifnull          128
					flag1 = true;
		//   50  123:iconst_1        
		//   51  124:istore_2        
				else
		//*  52  125:goto            130
					flag1 = false;
		//   53  128:iconst_0        
		//   54  129:istore_2        
				((Map) (arraymap)).put(((Object) (api)), ((Object) (Boolean.valueOf(flag1))));
		//   55  130:aload           9
		//   56  132:aload           7
		//   57  134:iload_2         
		//   58  135:invokestatic    #258 <Method Boolean Boolean.valueOf(boolean)>
		//   59  138:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   60  143:pop             
				Object obj3 = ((Object) (new zzp(api, flag1)));
		//   61  144:new             #260 <Class zzp>
		//   62  147:dup             
		//   63  148:aload           7
		//   64  150:iload_2         
		//   65  151:invokespecial   #263 <Method void zzp(Api, boolean)>
		//   66  154:astore          13
				arraylist.add(obj3);
		//   67  156:aload           11
		//   68  158:aload           13
		//   69  160:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//   70  163:pop             
				Api.AbstractClientBuilder abstractclientbuilder = api.zzk();
		//   71  164:aload           7
		//   72  166:invokevirtual   #267 <Method Api$AbstractClientBuilder Api.zzk()>
		//   73  169:astore          12
				obj3 = ((Object) (abstractclientbuilder.buildClient(mContext, zzcn, clientsettings, obj2, ((ConnectionCallbacks) (obj3)), ((OnConnectionFailedListener) (obj3)))));
		//   74  171:aload           12
		//   75  173:aload_0         
		//   76  174:getfield        #95  <Field Context mContext>
		//   77  177:aload_0         
		//   78  178:getfield        #103 <Field Looper zzcn>
		//   79  181:aload           8
		//   80  183:aload           6
		//   81  185:aload           13
		//   82  187:aload           13
		//   83  189:invokevirtual   #273 <Method Api$Client Api$AbstractClientBuilder.buildClient(Context, Looper, ClientSettings, Object, GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener)>
		//   84  192:astore          13
				((Map) (arraymap1)).put(((Object) (api.getClientKey())), obj3);
		//   85  194:aload           10
		//   86  196:aload           7
		//   87  198:invokevirtual   #277 <Method Api$AnyClientKey Api.getClientKey()>
		//   88  201:aload           13
		//   89  203:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   90  208:pop             
				if(((Api.BaseClientBuilder) (abstractclientbuilder)).getPriority() == 1)
		//*  91  209:aload           12
		//*  92  211:invokevirtual   #281 <Method int Api$BaseClientBuilder.getPriority()>
		//*  93  214:iconst_1        
		//*  94  215:icmpne          230
					if(obj2 != null)
		//*  95  218:aload           6
		//*  96  220:ifnull          228
						flag = true;
		//   97  223:iconst_1        
		//   98  224:istore_1        
					else
		//*  99  225:goto            230
						flag = false;
		//  100  228:iconst_0        
		//  101  229:istore_1        
				obj2 = obj;
		//  102  230:aload_3         
		//  103  231:astore          6
				if(!((Api.Client) (obj3)).providesSignIn())
					continue;
		//  104  233:aload           13
		//  105  235:invokeinterface #286 <Method boolean Api$Client.providesSignIn()>
		//  106  240:ifeq            328
				if(obj != null)
		//* 107  243:aload_3         
		//* 108  244:ifnull          324
				{
					obj1 = ((Object) (api.getName()));
		//  109  247:aload           7
		//  110  249:invokevirtual   #287 <Method String Api.getName()>
		//  111  252:astore          4
					obj = ((Object) (((Api) (obj)).getName()));
		//  112  254:aload_3         
		//  113  255:invokevirtual   #287 <Method String Api.getName()>
		//  114  258:astore_3        
					StringBuilder stringbuilder = new StringBuilder(21 + String.valueOf(obj1).length() + String.valueOf(obj).length());
		//  115  259:new             #289 <Class StringBuilder>
		//  116  262:dup             
		//  117  263:bipush          21
		//  118  265:aload           4
		//  119  267:invokestatic    #294 <Method String String.valueOf(Object)>
		//  120  270:invokevirtual   #297 <Method int String.length()>
		//  121  273:iadd            
		//  122  274:aload_3         
		//  123  275:invokestatic    #294 <Method String String.valueOf(Object)>
		//  124  278:invokevirtual   #297 <Method int String.length()>
		//  125  281:iadd            
		//  126  282:invokespecial   #300 <Method void StringBuilder(int)>
		//  127  285:astore          5
					stringbuilder.append(((String) (obj1)));
		//  128  287:aload           5
		//  129  289:aload           4
		//  130  291:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  131  294:pop             
					stringbuilder.append(" cannot be used with ");
		//  132  295:aload           5
		//  133  297:ldc2            #306 <String " cannot be used with ">
		//  134  300:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  135  303:pop             
					stringbuilder.append(((String) (obj)));
		//  136  304:aload           5
		//  137  306:aload_3         
		//  138  307:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  139  310:pop             
					throw new IllegalStateException(stringbuilder.toString());
		//  140  311:new             #308 <Class IllegalStateException>
		//  141  314:dup             
		//  142  315:aload           5
		//  143  317:invokevirtual   #311 <Method String StringBuilder.toString()>
		//  144  320:invokespecial   #312 <Method void IllegalStateException(String)>
		//  145  323:athrow          
				}
				obj2 = ((Object) (api));
		//  146  324:aload           7
		//  147  326:astore          6
			}

		//  148  328:aload           6
		//  149  330:astore_3        
		//* 150  331:goto            76
			if(obj != null)
		//* 151  334:aload_3         
		//* 152  335:ifnull          469
			{
				if(flag)
		//* 153  338:iload_1         
		//* 154  339:ifeq            404
				{
					obj = ((Object) (((Api) (obj)).getName()));
		//  155  342:aload_3         
		//  156  343:invokevirtual   #287 <Method String Api.getName()>
		//  157  346:astore_3        
					obj1 = ((Object) (new StringBuilder(82 + String.valueOf(obj).length())));
		//  158  347:new             #289 <Class StringBuilder>
		//  159  350:dup             
		//  160  351:bipush          82
		//  161  353:aload_3         
		//  162  354:invokestatic    #294 <Method String String.valueOf(Object)>
		//  163  357:invokevirtual   #297 <Method int String.length()>
		//  164  360:iadd            
		//  165  361:invokespecial   #300 <Method void StringBuilder(int)>
		//  166  364:astore          4
					((StringBuilder) (obj1)).append("With using ");
		//  167  366:aload           4
		//  168  368:ldc2            #314 <String "With using ">
		//  169  371:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  170  374:pop             
					((StringBuilder) (obj1)).append(((String) (obj)));
		//  171  375:aload           4
		//  172  377:aload_3         
		//  173  378:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  174  381:pop             
					((StringBuilder) (obj1)).append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
		//  175  382:aload           4
		//  176  384:ldc2            #316 <String ", GamesOptions can only be specified within GoogleSignInOptions.Builder">
		//  177  387:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  178  390:pop             
					throw new IllegalStateException(((StringBuilder) (obj1)).toString());
		//  179  391:new             #308 <Class IllegalStateException>
		//  180  394:dup             
		//  181  395:aload           4
		//  182  397:invokevirtual   #311 <Method String StringBuilder.toString()>
		//  183  400:invokespecial   #312 <Method void IllegalStateException(String)>
		//  184  403:athrow          
				}
				boolean flag2;
				if(zzs == null)
		//* 185  404:aload_0         
		//* 186  405:getfield        #318 <Field Account zzs>
		//* 187  408:ifnonnull       416
					flag2 = true;
		//  188  411:iconst_1        
		//  189  412:istore_2        
				else
		//* 190  413:goto            418
					flag2 = false;
		//  191  416:iconst_0        
		//  192  417:istore_2        
				Preconditions.checkState(flag2, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] {
					((Api) (obj)).getName()
				});
		//  193  418:iload_2         
		//  194  419:ldc2            #320 <String "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead">
		//  195  422:iconst_1        
		//  196  423:anewarray       Object[]
		//  197  426:dup             
		//  198  427:iconst_0        
		//  199  428:aload_3         
		//  200  429:invokevirtual   #287 <Method String Api.getName()>
		//  201  432:aastore         
		//  202  433:invokestatic    #324 <Method void Preconditions.checkState(boolean, String, Object[])>
				Preconditions.checkState(zzcv.equals(((Object) (zzcw))), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] {
					((Api) (obj)).getName()
				});
		//  203  436:aload_0         
		//  204  437:getfield        #58  <Field Set zzcv>
		//  205  440:aload_0         
		//  206  441:getfield        #60  <Field Set zzcw>
		//  207  444:invokeinterface #327 <Method boolean Set.equals(Object)>
		//  208  449:ldc2            #329 <String "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.">
		//  209  452:iconst_1        
		//  210  453:anewarray       Object[]
		//  211  456:dup             
		//  212  457:iconst_0        
		//  213  458:aload_3         
		//  214  459:invokevirtual   #287 <Method String Api.getName()>
		//  215  462:aastore         
		//  216  463:invokestatic    #324 <Method void Preconditions.checkState(boolean, String, Object[])>
			}
		//* 217  466:goto            469
			int i = zzav.zza(((Iterable) (((Map) (arraymap1)).values())), true);
		//  218  469:aload           10
		//  219  471:invokeinterface #333 <Method java.util.Collection Map.values()>
		//  220  476:iconst_1        
		//  221  477:invokestatic    #338 <Method int zzav.zza(Iterable, boolean)>
		//  222  480:istore_1        
			obj1 = ((Object) (new zzav(mContext, ((java.util.concurrent.locks.Lock) (new ReentrantLock())), zzcn, clientsettings, zzdg, zzdh, ((Map) (arraymap)), ((java.util.List) (zzdi)), ((java.util.List) (zzdj)), ((Map) (arraymap1)), zzde, i, arraylist, false)));
		//  223  481:new             #335 <Class zzav>
		//  224  484:dup             
		//  225  485:aload_0         
		//  226  486:getfield        #95  <Field Context mContext>
		//  227  489:new             #340 <Class ReentrantLock>
		//  228  492:dup             
		//  229  493:invokespecial   #341 <Method void ReentrantLock()>
		//  230  496:aload_0         
		//  231  497:getfield        #103 <Field Looper zzcn>
		//  232  500:aload           8
		//  233  502:aload_0         
		//  234  503:getfield        #77  <Field GoogleApiAvailability zzdg>
		//  235  506:aload_0         
		//  236  507:getfield        #84  <Field Api$AbstractClientBuilder zzdh>
		//  237  510:aload           9
		//  238  512:aload_0         
		//  239  513:getfield        #89  <Field ArrayList zzdi>
		//  240  516:aload_0         
		//  241  517:getfield        #91  <Field ArrayList zzdj>
		//  242  520:aload           10
		//  243  522:aload_0         
		//  244  523:getfield        #69  <Field int zzde>
		//  245  526:iload_1         
		//  246  527:aload           11
		//  247  529:iconst_0        
		//  248  530:invokespecial   #344 <Method void zzav(Context, java.util.concurrent.locks.Lock, Looper, ClientSettings, GoogleApiAvailability, Api$AbstractClientBuilder, Map, java.util.List, java.util.List, Map, int, int, ArrayList, boolean)>
		//  249  533:astore          4
			synchronized(GoogleApiClient.zzn())
		//* 250  535:invokestatic    #347 <Method Set GoogleApiClient.zzn()>
		//* 251  538:astore_3        
		//* 252  539:aload_3         
		//* 253  540:monitorenter    
			{
				GoogleApiClient.zzn().add(obj1);
		//  254  541:invokestatic    #347 <Method Set GoogleApiClient.zzn()>
		//  255  544:aload           4
		//  256  546:invokeinterface #160 <Method boolean Set.add(Object)>
		//  257  551:pop             
			}
		//  258  552:aload_3         
		//  259  553:monitorexit     
			if(zzde >= 0)
		//* 260  554:aload_0         
		//* 261  555:getfield        #69  <Field int zzde>
		//* 262  558:iflt            581
				zzi.zza(zzdd).zza(zzde, ((GoogleApiClient) (obj1)), zzdf);
		//  263  561:aload_0         
		//  264  562:getfield        #349 <Field LifecycleActivity zzdd>
		//  265  565:invokestatic    #354 <Method zzi zzi.zza(LifecycleActivity)>
		//  266  568:aload_0         
		//  267  569:getfield        #69  <Field int zzde>
		//  268  572:aload           4
		//  269  574:aload_0         
		//  270  575:getfield        #356 <Field GoogleApiClient$OnConnectionFailedListener zzdf>
		//  271  578:invokevirtual   #359 <Method void zzi.zza(int, GoogleApiClient, GoogleApiClient$OnConnectionFailedListener)>
			return ((GoogleApiClient) (obj1));
		//  272  581:aload           4
		//  273  583:areturn         
			exception;
		//  274  584:astore          4
			set;
		//  275  586:aload_3         
			JVM INSTR monitorexit ;
		//  276  587:monitorexit     
			throw exception;
		//  277  588:aload           4
		//  278  590:athrow          
		}

		public final ClientSettings buildClientSettings()
		{
			SignInOptions signinoptions = SignInOptions.DEFAULT;
		//    0    0:getstatic       #366 <Field SignInOptions SignInOptions.DEFAULT>
		//    1    3:astore_1        
			if(zzdc.containsKey(((Object) (SignIn.API))))
		//*   2    4:aload_0         
		//*   3    5:getfield        #67  <Field Map zzdc>
		//*   4    8:getstatic       #370 <Field Api SignIn.API>
		//*   5   11:invokeinterface #373 <Method boolean Map.containsKey(Object)>
		//*   6   16:ifeq            35
				signinoptions = (SignInOptions)zzdc.get(((Object) (SignIn.API)));
		//    7   19:aload_0         
		//    8   20:getfield        #67  <Field Map zzdc>
		//    9   23:getstatic       #370 <Field Api SignIn.API>
		//   10   26:invokeinterface #252 <Method Object Map.get(Object)>
		//   11   31:checkcast       #362 <Class SignInOptions>
		//   12   34:astore_1        
			return new ClientSettings(zzs, zzcv, zzdb, zzcx, zzcy, zzcz, zzda, signinoptions);
		//   13   35:new             #227 <Class ClientSettings>
		//   14   38:dup             
		//   15   39:aload_0         
		//   16   40:getfield        #318 <Field Account zzs>
		//   17   43:aload_0         
		//   18   44:getfield        #58  <Field Set zzcv>
		//   19   47:aload_0         
		//   20   48:getfield        #65  <Field Map zzdb>
		//   21   51:aload_0         
		//   22   52:getfield        #375 <Field int zzcx>
		//   23   55:aload_0         
		//   24   56:getfield        #377 <Field View zzcy>
		//   25   59:aload_0         
		//   26   60:getfield        #109 <Field String zzcz>
		//   27   63:aload_0         
		//   28   64:getfield        #120 <Field String zzda>
		//   29   67:aload_1         
		//   30   68:invokespecial   #380 <Method void ClientSettings(Account, Set, Map, int, View, String, String, SignInOptions)>
		//   31   71:areturn         
		}

		public final Builder enableAutoManage(FragmentActivity fragmentactivity, int i, OnConnectionFailedListener onconnectionfailedlistener)
		{
			fragmentactivity = ((FragmentActivity) (new LifecycleActivity(((android.app.Activity) (fragmentactivity)))));
		//    0    0:new             #385 <Class LifecycleActivity>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #388 <Method void LifecycleActivity(android.app.Activity)>
		//    4    8:astore_1        
			boolean flag;
			if(i >= 0)
		//*   5    9:iload_2         
		//*   6   10:iflt            19
				flag = true;
		//    7   13:iconst_1        
		//    8   14:istore          4
			else
		//*   9   16:goto            22
				flag = false;
		//   10   19:iconst_0        
		//   11   20:istore          4
			Preconditions.checkArgument(flag, "clientId must be non-negative");
		//   12   22:iload           4
		//   13   24:ldc2            #390 <String "clientId must be non-negative">
		//   14   27:invokestatic    #221 <Method void Preconditions.checkArgument(boolean, Object)>
			zzde = i;
		//   15   30:aload_0         
		//   16   31:iload_2         
		//   17   32:putfield        #69  <Field int zzde>
			zzdf = onconnectionfailedlistener;
		//   18   35:aload_0         
		//   19   36:aload_3         
		//   20   37:putfield        #356 <Field GoogleApiClient$OnConnectionFailedListener zzdf>
			zzdd = ((LifecycleActivity) (fragmentactivity));
		//   21   40:aload_0         
		//   22   41:aload_1         
		//   23   42:putfield        #349 <Field LifecycleActivity zzdd>
			return this;
		//   24   45:aload_0         
		//   25   46:areturn         
		}

		public final Builder enableAutoManage(FragmentActivity fragmentactivity, OnConnectionFailedListener onconnectionfailedlistener)
		{
			return enableAutoManage(fragmentactivity, 0, onconnectionfailedlistener);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:aload_2         
		//    4    4:invokevirtual   #393 <Method GoogleApiClient$Builder enableAutoManage(FragmentActivity, int, GoogleApiClient$OnConnectionFailedListener)>
		//    5    7:areturn         
		}

		public final Builder setAccountName(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       9
				s = null;
		//    2    4:aconst_null     
		//    3    5:astore_1        
			else
		//*   4    6:goto            21
				s = ((String) (new Account(s, "com.google")));
		//    5    9:new             #397 <Class Account>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:ldc2            #399 <String "com.google">
		//    9   17:invokespecial   #402 <Method void Account(String, String)>
		//   10   20:astore_1        
			zzs = ((Account) (s));
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:putfield        #318 <Field Account zzs>
			return this;
		//   14   26:aload_0         
		//   15   27:areturn         
		}

		public final Builder setGravityForPopups(int i)
		{
			zzcx = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #375 <Field int zzcx>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setHandler(Handler handler)
		{
			Preconditions.checkNotNull(((Object) (handler)), "Handler must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #408 <String "Handler must not be null">
		//    2    4:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    7:pop             
			zzcn = handler.getLooper();
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #413 <Method Looper Handler.getLooper()>
		//    7   13:putfield        #103 <Field Looper zzcn>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public final Builder setViewForPopups(View view)
		{
			Preconditions.checkNotNull(((Object) (view)), "View must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #417 <String "View must not be null">
		//    2    4:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    7:pop             
			zzcy = view;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #377 <Field View zzcy>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public final Builder useDefaultAccount()
		{
			return setAccountName("<<default account>>");
		//    0    0:aload_0         
		//    1    1:ldc2            #421 <String "<<default account>>">
		//    2    4:invokevirtual   #423 <Method GoogleApiClient$Builder setAccountName(String)>
		//    3    7:areturn         
		}

		private final Context mContext;
		private Looper zzcn;
		private final Set zzcv;
		private final Set zzcw;
		private int zzcx;
		private View zzcy;
		private String zzcz;
		private String zzda;
		private final Map zzdb;
		private final Map zzdc;
		private LifecycleActivity zzdd;
		private int zzde;
		private OnConnectionFailedListener zzdf;
		private GoogleApiAvailability zzdg;
		private Api.AbstractClientBuilder zzdh;
		private final ArrayList zzdi;
		private final ArrayList zzdj;
		private boolean zzdk;
		private Account zzs;

		public Builder(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #53  <Method void Object()>
			zzcv = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #55  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #56  <Method void HashSet()>
		//    6   12:putfield        #58  <Field Set zzcv>
			zzcw = ((Set) (new HashSet()));
		//    7   15:aload_0         
		//    8   16:new             #55  <Class HashSet>
		//    9   19:dup             
		//   10   20:invokespecial   #56  <Method void HashSet()>
		//   11   23:putfield        #60  <Field Set zzcw>
			zzdb = ((Map) (new ArrayMap()));
		//   12   26:aload_0         
		//   13   27:new             #62  <Class ArrayMap>
		//   14   30:dup             
		//   15   31:invokespecial   #63  <Method void ArrayMap()>
		//   16   34:putfield        #65  <Field Map zzdb>
			zzdc = ((Map) (new ArrayMap()));
		//   17   37:aload_0         
		//   18   38:new             #62  <Class ArrayMap>
		//   19   41:dup             
		//   20   42:invokespecial   #63  <Method void ArrayMap()>
		//   21   45:putfield        #67  <Field Map zzdc>
			zzde = -1;
		//   22   48:aload_0         
		//   23   49:iconst_m1       
		//   24   50:putfield        #69  <Field int zzde>
			zzdg = GoogleApiAvailability.getInstance();
		//   25   53:aload_0         
		//   26   54:invokestatic    #75  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
		//   27   57:putfield        #77  <Field GoogleApiAvailability zzdg>
			zzdh = SignIn.CLIENT_BUILDER;
		//   28   60:aload_0         
		//   29   61:getstatic       #82  <Field Api$AbstractClientBuilder SignIn.CLIENT_BUILDER>
		//   30   64:putfield        #84  <Field Api$AbstractClientBuilder zzdh>
			zzdi = new ArrayList();
		//   31   67:aload_0         
		//   32   68:new             #86  <Class ArrayList>
		//   33   71:dup             
		//   34   72:invokespecial   #87  <Method void ArrayList()>
		//   35   75:putfield        #89  <Field ArrayList zzdi>
			zzdj = new ArrayList();
		//   36   78:aload_0         
		//   37   79:new             #86  <Class ArrayList>
		//   38   82:dup             
		//   39   83:invokespecial   #87  <Method void ArrayList()>
		//   40   86:putfield        #91  <Field ArrayList zzdj>
			zzdk = false;
		//   41   89:aload_0         
		//   42   90:iconst_0        
		//   43   91:putfield        #93  <Field boolean zzdk>
			mContext = context;
		//   44   94:aload_0         
		//   45   95:aload_1         
		//   46   96:putfield        #95  <Field Context mContext>
			zzcn = context.getMainLooper();
		//   47   99:aload_0         
		//   48  100:aload_1         
		//   49  101:invokevirtual   #101 <Method Looper Context.getMainLooper()>
		//   50  104:putfield        #103 <Field Looper zzcn>
			zzcz = context.getPackageName();
		//   51  107:aload_0         
		//   52  108:aload_1         
		//   53  109:invokevirtual   #107 <Method String Context.getPackageName()>
		//   54  112:putfield        #109 <Field String zzcz>
			zzda = ((Object) (context)).getClass().getName();
		//   55  115:aload_0         
		//   56  116:aload_1         
		//   57  117:invokevirtual   #113 <Method Class Object.getClass()>
		//   58  120:invokevirtual   #118 <Method String Class.getName()>
		//   59  123:putfield        #120 <Field String zzda>
		//   60  126:return          
		}

		public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
		{
			this(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #126 <Method void GoogleApiClient$Builder(Context)>
			Preconditions.checkNotNull(((Object) (connectioncallbacks)), "Must provide a connected listener");
		//    3    5:aload_2         
		//    4    6:ldc1            #128 <String "Must provide a connected listener">
		//    5    8:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    6   11:pop             
			zzdi.add(((Object) (connectioncallbacks)));
		//    7   12:aload_0         
		//    8   13:getfield        #89  <Field ArrayList zzdi>
		//    9   16:aload_2         
		//   10   17:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//   11   20:pop             
			Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)), "Must provide a connection failed listener");
		//   12   21:aload_3         
		//   13   22:ldc1            #140 <String "Must provide a connection failed listener">
		//   14   24:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//   15   27:pop             
			zzdj.add(((Object) (onconnectionfailedlistener)));
		//   16   28:aload_0         
		//   17   29:getfield        #91  <Field ArrayList zzdj>
		//   18   32:aload_3         
		//   19   33:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//   20   36:pop             
		//   21   37:return          
		}
	}

	public static interface ConnectionCallbacks
	{

		public abstract void onConnected(Bundle bundle);

		public abstract void onConnectionSuspended(int i);

		public static final int CAUSE_NETWORK_LOST = 2;
		public static final int CAUSE_SERVICE_DISCONNECTED = 1;
	}

	public static interface OnConnectionFailedListener
	{

		public abstract void onConnectionFailed(ConnectionResult connectionresult);
	}


	public GoogleApiClient()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:return          
	}

	public static void dumpAll(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		Set set = zzcu;
	//    0    0:getstatic       #44  <Field Set zzcu>
	//    1    3:astore          5
		set;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore          4
		String s1;
		Iterator iterator;
		s1 = String.valueOf(((Object) (s))).concat("  ");
	//    6   11:aload_0         
	//    7   12:invokestatic    #54  <Method String String.valueOf(Object)>
	//    8   15:ldc1            #56  <String "  ">
	//    9   17:invokevirtual   #60  <Method String String.concat(String)>
	//   10   20:astore          6
		iterator = zzcu.iterator();
	//   11   22:getstatic       #44  <Field Set zzcu>
	//   12   25:invokeinterface #66  <Method Iterator Set.iterator()>
	//   13   30:astore          7
_L1:
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_88;
	//   14   32:aload           7
	//   15   34:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//   16   39:ifeq            88
		GoogleApiClient googleapiclient = (GoogleApiClient)iterator.next();
	//   17   42:aload           7
	//   18   44:invokeinterface #76  <Method Object Iterator.next()>
	//   19   49:checkcast       #2   <Class GoogleApiClient>
	//   20   52:astore          8
		printwriter.append(((CharSequence) (s))).append("GoogleApiClient#").println(i);
	//   21   54:aload_2         
	//   22   55:aload_0         
	//   23   56:invokevirtual   #82  <Method PrintWriter PrintWriter.append(CharSequence)>
	//   24   59:ldc1            #84  <String "GoogleApiClient#">
	//   25   61:invokevirtual   #82  <Method PrintWriter PrintWriter.append(CharSequence)>
	//   26   64:iload           4
	//   27   66:invokevirtual   #88  <Method void PrintWriter.println(int)>
		googleapiclient.dump(s1, filedescriptor, printwriter, as);
	//   28   69:aload           8
	//   29   71:aload           6
	//   30   73:aload_1         
	//   31   74:aload_2         
	//   32   75:aload_3         
	//   33   76:invokevirtual   #91  <Method void dump(String, FileDescriptor, PrintWriter, String[])>
		i++;
	//   34   79:iload           4
	//   35   81:iconst_1        
	//   36   82:iadd            
	//   37   83:istore          4
		  goto _L1
	//*  38   85:goto            32
		set;
	//   39   88:aload           5
		JVM INSTR monitorexit ;
	//   40   90:monitorexit     
		return;
	//   41   91:return          
		s;
	//   42   92:astore_0        
		set;
	//   43   93:aload           5
		JVM INSTR monitorexit ;
	//   44   95:monitorexit     
		throw s;
	//   45   96:aload_0         
	//   46   97:athrow          
	}

	public static Set getAllClients()
	{
		Set set1;
		synchronized(zzcu)
	//*   0    0:getstatic       #44  <Field Set zzcu>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			set1 = zzcu;
	//    4    6:getstatic       #44  <Field Set zzcu>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return set1;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		set;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	static Set zzn()
	{
		return zzcu;
	//    0    0:getstatic       #44  <Field Set zzcu>
	//    1    3:areturn         
	}

	public abstract ConnectionResult blockingConnect();

	public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

	public abstract PendingResult clearDefaultAccountAndReconnect();

	public abstract void connect();

	public void connect(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void disconnect();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl enqueue(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl execute(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Api.Client getClient(Api.AnyClientKey anyclientkey)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract ConnectionResult getConnectionResult(Api api);

	public Context getContext()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Looper getLooper()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean hasApi(Api api)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract boolean hasConnectedApi(Api api);

	public abstract boolean isConnected();

	public abstract boolean isConnecting();

	public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectioncallbacks);

	public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onconnectionfailedlistener);

	public boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void maybeSignOut()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void reconnect();

	public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

	public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

	public ListenerHolder registerListener(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void stopAutoManage(FragmentActivity fragmentactivity);

	public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

	public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

	public void zza(zzch zzch)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void zzb(zzch zzch)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public static final String DEFAULT_ACCOUNT = "<<default account>>";
	public static final int SIGN_IN_MODE_OPTIONAL = 2;
	public static final int SIGN_IN_MODE_REQUIRED = 1;
	private static final Set zzcu = Collections.newSetFromMap(((Map) (new WeakHashMap())));

	static 
	{
	//    0    0:new             #33  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void WeakHashMap()>
	//    3    7:invokestatic    #42  <Method Set Collections.newSetFromMap(Map)>
	//    4   10:putstatic       #44  <Field Set zzcu>
	//*   5   13:return          
	}
}

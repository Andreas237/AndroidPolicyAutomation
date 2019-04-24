// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.support.v4.f.a;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.api.internal.zaj;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zaa;
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

		private final transient void zaa(Api api, Api.ApiOptions apioptions, Scope ascope[])
		{
			apioptions = ((Api.ApiOptions) (new HashSet(((java.util.Collection) (api.zah().getImpliedScopes(((Object) (apioptions))))))));
		//    0    0:new             #54  <Class HashSet>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #146 <Method Api$BaseClientBuilder Api.zah()>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #152 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//    6   12:invokespecial   #155 <Method void HashSet(java.util.Collection)>
		//    7   15:astore_2        
			int j = ascope.length;
		//    8   16:aload_3         
		//    9   17:arraylength     
		//   10   18:istore          5
			for(int i = 0; i < j; i++)
		//*  11   20:iconst_0        
		//*  12   21:istore          4
		//*  13   23:iload           4
		//*  14   25:iload           5
		//*  15   27:icmpge          50
				((Set) (apioptions)).add(((Object) (ascope[i])));
		//   16   30:aload_2         
		//   17   31:aload_3         
		//   18   32:iload           4
		//   19   34:aaload          
		//   20   35:invokeinterface #158 <Method boolean Set.add(Object)>
		//   21   40:pop             

		//   22   41:iload           4
		//   23   43:iconst_1        
		//   24   44:iadd            
		//   25   45:istore          4
		//*  26   47:goto            23
			zabx.put(((Object) (api)), ((Object) (new com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings(((Set) (apioptions))))));
		//   27   50:aload_0         
		//   28   51:getfield        #64  <Field Map zabx>
		//   29   54:aload_1         
		//   30   55:new             #160 <Class com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings>
		//   31   58:dup             
		//   32   59:aload_2         
		//   33   60:invokespecial   #163 <Method void com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings(Set)>
		//   34   63:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   35   68:pop             
		//   36   69:return          
		}

		public final Builder addApi(Api api)
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #174 <String "Api must not be null">
		//    2    3:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zaby.put(((Object) (api)), ((Object) (null)));
		//    4    7:aload_0         
		//    5    8:getfield        #66  <Field Map zaby>
		//    6   11:aload_1         
		//    7   12:aconst_null     
		//    8   13:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//    9   18:pop             
			api = ((Api) (api.zah().getImpliedScopes(((Object) (null)))));
		//   10   19:aload_1         
		//   11   20:invokevirtual   #146 <Method Api$BaseClientBuilder Api.zah()>
		//   12   23:aconst_null     
		//   13   24:invokevirtual   #152 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//   14   27:astore_1        
			zabs.addAll(((java.util.Collection) (api)));
		//   15   28:aload_0         
		//   16   29:getfield        #59  <Field Set zabs>
		//   17   32:aload_1         
		//   18   33:invokeinterface #178 <Method boolean Set.addAll(java.util.Collection)>
		//   19   38:pop             
			zabr.addAll(((java.util.Collection) (api)));
		//   20   39:aload_0         
		//   21   40:getfield        #57  <Field Set zabr>
		//   22   43:aload_1         
		//   23   44:invokeinterface #178 <Method boolean Set.addAll(java.util.Collection)>
		//   24   49:pop             
			return this;
		//   25   50:aload_0         
		//   26   51:areturn         
		}

		public final Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #174 <String "Api must not be null">
		//    2    3:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			Preconditions.checkNotNull(((Object) (hasoptions)), "Null options are not permitted for this Api");
		//    4    7:aload_2         
		//    5    8:ldc1            #182 <String "Null options are not permitted for this Api">
		//    6   10:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    7   13:pop             
			zaby.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   14:aload_0         
		//    9   15:getfield        #66  <Field Map zaby>
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   13   25:pop             
			api = ((Api) (api.zah().getImpliedScopes(((Object) (hasoptions)))));
		//   14   26:aload_1         
		//   15   27:invokevirtual   #146 <Method Api$BaseClientBuilder Api.zah()>
		//   16   30:aload_2         
		//   17   31:invokevirtual   #152 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//   18   34:astore_1        
			zabs.addAll(((java.util.Collection) (api)));
		//   19   35:aload_0         
		//   20   36:getfield        #59  <Field Set zabs>
		//   21   39:aload_1         
		//   22   40:invokeinterface #178 <Method boolean Set.addAll(java.util.Collection)>
		//   23   45:pop             
			zabr.addAll(((java.util.Collection) (api)));
		//   24   46:aload_0         
		//   25   47:getfield        #57  <Field Set zabr>
		//   26   50:aload_1         
		//   27   51:invokeinterface #178 <Method boolean Set.addAll(java.util.Collection)>
		//   28   56:pop             
			return this;
		//   29   57:aload_0         
		//   30   58:areturn         
		}

		public final transient Builder addApiIfAvailable(Api api, Api.ApiOptions.HasOptions hasoptions, Scope ascope[])
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #174 <String "Api must not be null">
		//    2    3:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			Preconditions.checkNotNull(((Object) (hasoptions)), "Null options are not permitted for this Api");
		//    4    7:aload_2         
		//    5    8:ldc1            #182 <String "Null options are not permitted for this Api">
		//    6   10:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    7   13:pop             
			zaby.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   14:aload_0         
		//    9   15:getfield        #66  <Field Map zaby>
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   13   25:pop             
			zaa(api, ((Api.ApiOptions) (hasoptions)), ascope);
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:aload_2         
		//   17   29:aload_3         
		//   18   30:invokespecial   #187 <Method void zaa(Api, Api$ApiOptions, Scope[])>
			return this;
		//   19   33:aload_0         
		//   20   34:areturn         
		}

		public final transient Builder addApiIfAvailable(Api api, Scope ascope[])
		{
			Preconditions.checkNotNull(((Object) (api)), "Api must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #174 <String "Api must not be null">
		//    2    3:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zaby.put(((Object) (api)), ((Object) (null)));
		//    4    7:aload_0         
		//    5    8:getfield        #66  <Field Map zaby>
		//    6   11:aload_1         
		//    7   12:aconst_null     
		//    8   13:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//    9   18:pop             
			zaa(api, ((Api.ApiOptions) (null)), ascope);
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:aconst_null     
		//   13   22:aload_2         
		//   14   23:invokespecial   #187 <Method void zaa(Api, Api$ApiOptions, Scope[])>
			return this;
		//   15   26:aload_0         
		//   16   27:areturn         
		}

		public final Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
		{
			Preconditions.checkNotNull(((Object) (connectioncallbacks)), "Listener must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #194 <String "Listener must not be null">
		//    2    3:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zace.add(((Object) (connectioncallbacks)));
		//    4    7:aload_0         
		//    5    8:getfield        #88  <Field ArrayList zace>
		//    6   11:aload_1         
		//    7   12:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//    8   15:pop             
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public final Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
		{
			Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)), "Listener must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #194 <String "Listener must not be null">
		//    2    3:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zacf.add(((Object) (onconnectionfailedlistener)));
		//    4    7:aload_0         
		//    5    8:getfield        #90  <Field ArrayList zacf>
		//    6   11:aload_1         
		//    7   12:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//    8   15:pop             
			return this;
		//    9   16:aload_0         
		//   10   17:areturn         
		}

		public final Builder addScope(Scope scope)
		{
			Preconditions.checkNotNull(((Object) (scope)), "Scope must not be null");
		//    0    0:aload_1         
		//    1    1:ldc1            #200 <String "Scope must not be null">
		//    2    3:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			zabr.add(((Object) (scope)));
		//    4    7:aload_0         
		//    5    8:getfield        #57  <Field Set zabr>
		//    6   11:aload_1         
		//    7   12:invokeinterface #158 <Method boolean Set.add(Object)>
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
				zabr.add(((Object) (new Scope(as[i]))));
		//    6    8:aload_0         
		//    7    9:getfield        #57  <Field Set zabr>
		//    8   12:new             #204 <Class Scope>
		//    9   15:dup             
		//   10   16:aload_1         
		//   11   17:iload_2         
		//   12   18:aaload          
		//   13   19:invokespecial   #207 <Method void Scope(String)>
		//   14   22:invokeinterface #158 <Method boolean Set.add(Object)>
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
			Preconditions.checkArgument(zaby.isEmpty() ^ true, "must call addApi() to add at least one API");
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field Map zaby>
		//    2    4:invokeinterface #213 <Method boolean Map.isEmpty()>
		//    3    9:iconst_1        
		//    4   10:ixor            
		//    5   11:ldc1            #215 <String "must call addApi() to add at least one API">
		//    6   13:invokestatic    #219 <Method void Preconditions.checkArgument(boolean, Object)>
			ClientSettings clientsettings = buildClientSettings();
		//    7   16:aload_0         
		//    8   17:invokevirtual   #223 <Method ClientSettings buildClientSettings()>
		//    9   20:astore          8
			Object obj = null;
		//   10   22:aconst_null     
		//   11   23:astore_3        
			Map map = clientsettings.getOptionalApiSettings();
		//   12   24:aload           8
		//   13   26:invokevirtual   #229 <Method Map ClientSettings.getOptionalApiSettings()>
		//   14   29:astore          5
			a a1 = new a();
		//   15   31:new             #61  <Class a>
		//   16   34:dup             
		//   17   35:invokespecial   #62  <Method void a()>
		//   18   38:astore          9
			a a2 = new a();
		//   19   40:new             #61  <Class a>
		//   20   43:dup             
		//   21   44:invokespecial   #62  <Method void a()>
		//   22   47:astore          10
			ArrayList arraylist = new ArrayList();
		//   23   49:new             #85  <Class ArrayList>
		//   24   52:dup             
		//   25   53:invokespecial   #86  <Method void ArrayList()>
		//   26   56:astore          11
			Object obj1 = ((Object) (zaby.keySet().iterator()));
		//   27   58:aload_0         
		//   28   59:getfield        #66  <Field Map zaby>
		//   29   62:invokeinterface #233 <Method Set Map.keySet()>
		//   30   67:invokeinterface #237 <Method Iterator Set.iterator()>
		//   31   72:astore          4
			boolean flag = false;
		//   32   74:iconst_0        
		//   33   75:istore_1        
			Object obj2;
			for(; ((Iterator) (obj1)).hasNext(); obj = obj2)
		//*  34   76:aload           4
		//*  35   78:invokeinterface #242 <Method boolean Iterator.hasNext()>
		//*  36   83:ifeq            334
			{
				Api api = (Api)((Iterator) (obj1)).next();
		//   37   86:aload           4
		//   38   88:invokeinterface #246 <Method Object Iterator.next()>
		//   39   93:checkcast       #142 <Class Api>
		//   40   96:astore          7
				obj2 = zaby.get(((Object) (api)));
		//   41   98:aload_0         
		//   42   99:getfield        #66  <Field Map zaby>
		//   43  102:aload           7
		//   44  104:invokeinterface #250 <Method Object Map.get(Object)>
		//   45  109:astore          6
				boolean flag1;
				if(map.get(((Object) (api))) != null)
		//*  46  111:aload           5
		//*  47  113:aload           7
		//*  48  115:invokeinterface #250 <Method Object Map.get(Object)>
		//*  49  120:ifnull          128
					flag1 = true;
		//   50  123:iconst_1        
		//   51  124:istore_2        
				else
		//*  52  125:goto            130
					flag1 = false;
		//   53  128:iconst_0        
		//   54  129:istore_2        
				((Map) (a1)).put(((Object) (api)), ((Object) (Boolean.valueOf(flag1))));
		//   55  130:aload           9
		//   56  132:aload           7
		//   57  134:iload_2         
		//   58  135:invokestatic    #256 <Method Boolean Boolean.valueOf(boolean)>
		//   59  138:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   60  143:pop             
				Object obj3 = ((Object) (new zaq(api, flag1)));
		//   61  144:new             #258 <Class zaq>
		//   62  147:dup             
		//   63  148:aload           7
		//   64  150:iload_2         
		//   65  151:invokespecial   #261 <Method void zaq(Api, boolean)>
		//   66  154:astore          13
				arraylist.add(obj3);
		//   67  156:aload           11
		//   68  158:aload           13
		//   69  160:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//   70  163:pop             
				Api.AbstractClientBuilder abstractclientbuilder = api.zai();
		//   71  164:aload           7
		//   72  166:invokevirtual   #265 <Method Api$AbstractClientBuilder Api.zai()>
		//   73  169:astore          12
				obj3 = ((Object) (abstractclientbuilder.buildClient(mContext, zabj, clientsettings, obj2, ((ConnectionCallbacks) (obj3)), ((OnConnectionFailedListener) (obj3)))));
		//   74  171:aload           12
		//   75  173:aload_0         
		//   76  174:getfield        #94  <Field Context mContext>
		//   77  177:aload_0         
		//   78  178:getfield        #102 <Field Looper zabj>
		//   79  181:aload           8
		//   80  183:aload           6
		//   81  185:aload           13
		//   82  187:aload           13
		//   83  189:invokevirtual   #271 <Method Api$Client Api$AbstractClientBuilder.buildClient(Context, Looper, ClientSettings, Object, GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener)>
		//   84  192:astore          13
				((Map) (a2)).put(((Object) (api.getClientKey())), obj3);
		//   85  194:aload           10
		//   86  196:aload           7
		//   87  198:invokevirtual   #275 <Method Api$AnyClientKey Api.getClientKey()>
		//   88  201:aload           13
		//   89  203:invokeinterface #168 <Method Object Map.put(Object, Object)>
		//   90  208:pop             
				if(((Api.BaseClientBuilder) (abstractclientbuilder)).getPriority() == 1)
		//*  91  209:aload           12
		//*  92  211:invokevirtual   #279 <Method int Api$BaseClientBuilder.getPriority()>
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
		//  105  235:invokeinterface #284 <Method boolean Api$Client.providesSignIn()>
		//  106  240:ifeq            328
				if(obj != null)
		//* 107  243:aload_3         
		//* 108  244:ifnull          324
				{
					obj1 = ((Object) (api.getName()));
		//  109  247:aload           7
		//  110  249:invokevirtual   #285 <Method String Api.getName()>
		//  111  252:astore          4
					obj = ((Object) (((Api) (obj)).getName()));
		//  112  254:aload_3         
		//  113  255:invokevirtual   #285 <Method String Api.getName()>
		//  114  258:astore_3        
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj1).length() + 21 + String.valueOf(obj).length());
		//  115  259:new             #287 <Class StringBuilder>
		//  116  262:dup             
		//  117  263:aload           4
		//  118  265:invokestatic    #292 <Method String String.valueOf(Object)>
		//  119  268:invokevirtual   #295 <Method int String.length()>
		//  120  271:bipush          21
		//  121  273:iadd            
		//  122  274:aload_3         
		//  123  275:invokestatic    #292 <Method String String.valueOf(Object)>
		//  124  278:invokevirtual   #295 <Method int String.length()>
		//  125  281:iadd            
		//  126  282:invokespecial   #298 <Method void StringBuilder(int)>
		//  127  285:astore          5
					stringbuilder.append(((String) (obj1)));
		//  128  287:aload           5
		//  129  289:aload           4
		//  130  291:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
		//  131  294:pop             
					stringbuilder.append(" cannot be used with ");
		//  132  295:aload           5
		//  133  297:ldc2            #304 <String " cannot be used with ">
		//  134  300:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
		//  135  303:pop             
					stringbuilder.append(((String) (obj)));
		//  136  304:aload           5
		//  137  306:aload_3         
		//  138  307:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
		//  139  310:pop             
					throw new IllegalStateException(stringbuilder.toString());
		//  140  311:new             #306 <Class IllegalStateException>
		//  141  314:dup             
		//  142  315:aload           5
		//  143  317:invokevirtual   #309 <Method String StringBuilder.toString()>
		//  144  320:invokespecial   #310 <Method void IllegalStateException(String)>
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
		//  156  343:invokevirtual   #285 <Method String Api.getName()>
		//  157  346:astore_3        
					obj1 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 82)));
		//  158  347:new             #287 <Class StringBuilder>
		//  159  350:dup             
		//  160  351:aload_3         
		//  161  352:invokestatic    #292 <Method String String.valueOf(Object)>
		//  162  355:invokevirtual   #295 <Method int String.length()>
		//  163  358:bipush          82
		//  164  360:iadd            
		//  165  361:invokespecial   #298 <Method void StringBuilder(int)>
		//  166  364:astore          4
					((StringBuilder) (obj1)).append("With using ");
		//  167  366:aload           4
		//  168  368:ldc2            #312 <String "With using ">
		//  169  371:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
		//  170  374:pop             
					((StringBuilder) (obj1)).append(((String) (obj)));
		//  171  375:aload           4
		//  172  377:aload_3         
		//  173  378:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
		//  174  381:pop             
					((StringBuilder) (obj1)).append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
		//  175  382:aload           4
		//  176  384:ldc2            #314 <String ", GamesOptions can only be specified within GoogleSignInOptions.Builder">
		//  177  387:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
		//  178  390:pop             
					throw new IllegalStateException(((StringBuilder) (obj1)).toString());
		//  179  391:new             #306 <Class IllegalStateException>
		//  180  394:dup             
		//  181  395:aload           4
		//  182  397:invokevirtual   #309 <Method String StringBuilder.toString()>
		//  183  400:invokespecial   #310 <Method void IllegalStateException(String)>
		//  184  403:athrow          
				}
				boolean flag2;
				if(zax == null)
		//* 185  404:aload_0         
		//* 186  405:getfield        #316 <Field Account zax>
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
		//  194  419:ldc2            #318 <String "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead">
		//  195  422:iconst_1        
		//  196  423:anewarray       Object[]
		//  197  426:dup             
		//  198  427:iconst_0        
		//  199  428:aload_3         
		//  200  429:invokevirtual   #285 <Method String Api.getName()>
		//  201  432:aastore         
		//  202  433:invokestatic    #322 <Method void Preconditions.checkState(boolean, String, Object[])>
				Preconditions.checkState(zabr.equals(((Object) (zabs))), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] {
					((Api) (obj)).getName()
				});
		//  203  436:aload_0         
		//  204  437:getfield        #57  <Field Set zabr>
		//  205  440:aload_0         
		//  206  441:getfield        #59  <Field Set zabs>
		//  207  444:invokeinterface #325 <Method boolean Set.equals(Object)>
		//  208  449:ldc2            #327 <String "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.">
		//  209  452:iconst_1        
		//  210  453:anewarray       Object[]
		//  211  456:dup             
		//  212  457:iconst_0        
		//  213  458:aload_3         
		//  214  459:invokevirtual   #285 <Method String Api.getName()>
		//  215  462:aastore         
		//  216  463:invokestatic    #322 <Method void Preconditions.checkState(boolean, String, Object[])>
			}
		//* 217  466:goto            469
			int i = zaaw.zaa(((Iterable) (((Map) (a2)).values())), true);
		//  218  469:aload           10
		//  219  471:invokeinterface #331 <Method java.util.Collection Map.values()>
		//  220  476:iconst_1        
		//  221  477:invokestatic    #336 <Method int zaaw.zaa(Iterable, boolean)>
		//  222  480:istore_1        
			obj1 = ((Object) (new zaaw(mContext, ((java.util.concurrent.locks.Lock) (new ReentrantLock())), zabj, clientsettings, zacc, zacd, ((Map) (a1)), ((java.util.List) (zace)), ((java.util.List) (zacf)), ((Map) (a2)), zaca, i, arraylist, false)));
		//  223  481:new             #333 <Class zaaw>
		//  224  484:dup             
		//  225  485:aload_0         
		//  226  486:getfield        #94  <Field Context mContext>
		//  227  489:new             #338 <Class ReentrantLock>
		//  228  492:dup             
		//  229  493:invokespecial   #339 <Method void ReentrantLock()>
		//  230  496:aload_0         
		//  231  497:getfield        #102 <Field Looper zabj>
		//  232  500:aload           8
		//  233  502:aload_0         
		//  234  503:getfield        #76  <Field GoogleApiAvailability zacc>
		//  235  506:aload_0         
		//  236  507:getfield        #83  <Field Api$AbstractClientBuilder zacd>
		//  237  510:aload           9
		//  238  512:aload_0         
		//  239  513:getfield        #88  <Field ArrayList zace>
		//  240  516:aload_0         
		//  241  517:getfield        #90  <Field ArrayList zacf>
		//  242  520:aload           10
		//  243  522:aload_0         
		//  244  523:getfield        #68  <Field int zaca>
		//  245  526:iload_1         
		//  246  527:aload           11
		//  247  529:iconst_0        
		//  248  530:invokespecial   #342 <Method void zaaw(Context, java.util.concurrent.locks.Lock, Looper, ClientSettings, GoogleApiAvailability, Api$AbstractClientBuilder, Map, java.util.List, java.util.List, Map, int, int, ArrayList, boolean)>
		//  249  533:astore          4
			synchronized(GoogleApiClient.zal())
		//* 250  535:invokestatic    #345 <Method Set GoogleApiClient.zal()>
		//* 251  538:astore_3        
		//* 252  539:aload_3         
		//* 253  540:monitorenter    
			{
				GoogleApiClient.zal().add(obj1);
		//  254  541:invokestatic    #345 <Method Set GoogleApiClient.zal()>
		//  255  544:aload           4
		//  256  546:invokeinterface #158 <Method boolean Set.add(Object)>
		//  257  551:pop             
			}
		//  258  552:aload_3         
		//  259  553:monitorexit     
			if(zaca >= 0)
		//* 260  554:aload_0         
		//* 261  555:getfield        #68  <Field int zaca>
		//* 262  558:iflt            581
				zaj.zaa(zabz).zaa(zaca, ((GoogleApiClient) (obj1)), zacb);
		//  263  561:aload_0         
		//  264  562:getfield        #347 <Field LifecycleActivity zabz>
		//  265  565:invokestatic    #352 <Method zaj zaj.zaa(LifecycleActivity)>
		//  266  568:aload_0         
		//  267  569:getfield        #68  <Field int zaca>
		//  268  572:aload           4
		//  269  574:aload_0         
		//  270  575:getfield        #354 <Field GoogleApiClient$OnConnectionFailedListener zacb>
		//  271  578:invokevirtual   #357 <Method void zaj.zaa(int, GoogleApiClient, GoogleApiClient$OnConnectionFailedListener)>
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
		//    0    0:getstatic       #364 <Field SignInOptions SignInOptions.DEFAULT>
		//    1    3:astore_1        
			if(zaby.containsKey(((Object) (zaa.API))))
		//*   2    4:aload_0         
		//*   3    5:getfield        #66  <Field Map zaby>
		//*   4    8:getstatic       #368 <Field Api zaa.API>
		//*   5   11:invokeinterface #371 <Method boolean Map.containsKey(Object)>
		//*   6   16:ifeq            35
				signinoptions = (SignInOptions)zaby.get(((Object) (zaa.API)));
		//    7   19:aload_0         
		//    8   20:getfield        #66  <Field Map zaby>
		//    9   23:getstatic       #368 <Field Api zaa.API>
		//   10   26:invokeinterface #250 <Method Object Map.get(Object)>
		//   11   31:checkcast       #360 <Class SignInOptions>
		//   12   34:astore_1        
			return new ClientSettings(zax, zabr, zabx, zabt, zabu, zabv, zabw, signinoptions);
		//   13   35:new             #225 <Class ClientSettings>
		//   14   38:dup             
		//   15   39:aload_0         
		//   16   40:getfield        #316 <Field Account zax>
		//   17   43:aload_0         
		//   18   44:getfield        #57  <Field Set zabr>
		//   19   47:aload_0         
		//   20   48:getfield        #64  <Field Map zabx>
		//   21   51:aload_0         
		//   22   52:getfield        #373 <Field int zabt>
		//   23   55:aload_0         
		//   24   56:getfield        #375 <Field View zabu>
		//   25   59:aload_0         
		//   26   60:getfield        #108 <Field String zabv>
		//   27   63:aload_0         
		//   28   64:getfield        #119 <Field String zabw>
		//   29   67:aload_1         
		//   30   68:invokespecial   #378 <Method void ClientSettings(Account, Set, Map, int, View, String, String, SignInOptions)>
		//   31   71:areturn         
		}

		public final Builder enableAutoManage(FragmentActivity fragmentactivity, int i, OnConnectionFailedListener onconnectionfailedlistener)
		{
			fragmentactivity = ((FragmentActivity) (new LifecycleActivity(((android.app.Activity) (fragmentactivity)))));
		//    0    0:new             #382 <Class LifecycleActivity>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #385 <Method void LifecycleActivity(android.app.Activity)>
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
		//   13   24:ldc2            #387 <String "clientId must be non-negative">
		//   14   27:invokestatic    #219 <Method void Preconditions.checkArgument(boolean, Object)>
			zaca = i;
		//   15   30:aload_0         
		//   16   31:iload_2         
		//   17   32:putfield        #68  <Field int zaca>
			zacb = onconnectionfailedlistener;
		//   18   35:aload_0         
		//   19   36:aload_3         
		//   20   37:putfield        #354 <Field GoogleApiClient$OnConnectionFailedListener zacb>
			zabz = ((LifecycleActivity) (fragmentactivity));
		//   21   40:aload_0         
		//   22   41:aload_1         
		//   23   42:putfield        #347 <Field LifecycleActivity zabz>
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
		//    4    4:invokevirtual   #390 <Method GoogleApiClient$Builder enableAutoManage(FragmentActivity, int, GoogleApiClient$OnConnectionFailedListener)>
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
		//    5    9:new             #394 <Class Account>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:ldc2            #396 <String "com.google">
		//    9   17:invokespecial   #399 <Method void Account(String, String)>
		//   10   20:astore_1        
			zax = ((Account) (s));
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:putfield        #316 <Field Account zax>
			return this;
		//   14   26:aload_0         
		//   15   27:areturn         
		}

		public final Builder setGravityForPopups(int i)
		{
			zabt = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #373 <Field int zabt>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setHandler(Handler handler)
		{
			Preconditions.checkNotNull(((Object) (handler)), "Handler must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #405 <String "Handler must not be null">
		//    2    4:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    7:pop             
			zabj = handler.getLooper();
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #410 <Method Looper Handler.getLooper()>
		//    7   13:putfield        #102 <Field Looper zabj>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public final Builder setViewForPopups(View view)
		{
			Preconditions.checkNotNull(((Object) (view)), "View must not be null");
		//    0    0:aload_1         
		//    1    1:ldc2            #414 <String "View must not be null">
		//    2    4:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    7:pop             
			zabu = view;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #375 <Field View zabu>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public final Builder useDefaultAccount()
		{
			return setAccountName("<<default account>>");
		//    0    0:aload_0         
		//    1    1:ldc2            #418 <String "<<default account>>">
		//    2    4:invokevirtual   #420 <Method GoogleApiClient$Builder setAccountName(String)>
		//    3    7:areturn         
		}

		private final Context mContext;
		private Looper zabj;
		private final Set zabr;
		private final Set zabs;
		private int zabt;
		private View zabu;
		private String zabv;
		private String zabw;
		private final Map zabx;
		private final Map zaby;
		private LifecycleActivity zabz;
		private int zaca;
		private OnConnectionFailedListener zacb;
		private GoogleApiAvailability zacc;
		private Api.AbstractClientBuilder zacd;
		private final ArrayList zace;
		private final ArrayList zacf;
		private boolean zacg;
		private Account zax;

		public Builder(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #52  <Method void Object()>
			zabr = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #54  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #55  <Method void HashSet()>
		//    6   12:putfield        #57  <Field Set zabr>
			zabs = ((Set) (new HashSet()));
		//    7   15:aload_0         
		//    8   16:new             #54  <Class HashSet>
		//    9   19:dup             
		//   10   20:invokespecial   #55  <Method void HashSet()>
		//   11   23:putfield        #59  <Field Set zabs>
			zabx = ((Map) (new a()));
		//   12   26:aload_0         
		//   13   27:new             #61  <Class a>
		//   14   30:dup             
		//   15   31:invokespecial   #62  <Method void a()>
		//   16   34:putfield        #64  <Field Map zabx>
			zaby = ((Map) (new a()));
		//   17   37:aload_0         
		//   18   38:new             #61  <Class a>
		//   19   41:dup             
		//   20   42:invokespecial   #62  <Method void a()>
		//   21   45:putfield        #66  <Field Map zaby>
			zaca = -1;
		//   22   48:aload_0         
		//   23   49:iconst_m1       
		//   24   50:putfield        #68  <Field int zaca>
			zacc = GoogleApiAvailability.getInstance();
		//   25   53:aload_0         
		//   26   54:invokestatic    #74  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
		//   27   57:putfield        #76  <Field GoogleApiAvailability zacc>
			zacd = zaa.zapg;
		//   28   60:aload_0         
		//   29   61:getstatic       #81  <Field Api$AbstractClientBuilder zaa.zapg>
		//   30   64:putfield        #83  <Field Api$AbstractClientBuilder zacd>
			zace = new ArrayList();
		//   31   67:aload_0         
		//   32   68:new             #85  <Class ArrayList>
		//   33   71:dup             
		//   34   72:invokespecial   #86  <Method void ArrayList()>
		//   35   75:putfield        #88  <Field ArrayList zace>
			zacf = new ArrayList();
		//   36   78:aload_0         
		//   37   79:new             #85  <Class ArrayList>
		//   38   82:dup             
		//   39   83:invokespecial   #86  <Method void ArrayList()>
		//   40   86:putfield        #90  <Field ArrayList zacf>
			zacg = false;
		//   41   89:aload_0         
		//   42   90:iconst_0        
		//   43   91:putfield        #92  <Field boolean zacg>
			mContext = context;
		//   44   94:aload_0         
		//   45   95:aload_1         
		//   46   96:putfield        #94  <Field Context mContext>
			zabj = context.getMainLooper();
		//   47   99:aload_0         
		//   48  100:aload_1         
		//   49  101:invokevirtual   #100 <Method Looper Context.getMainLooper()>
		//   50  104:putfield        #102 <Field Looper zabj>
			zabv = context.getPackageName();
		//   51  107:aload_0         
		//   52  108:aload_1         
		//   53  109:invokevirtual   #106 <Method String Context.getPackageName()>
		//   54  112:putfield        #108 <Field String zabv>
			zabw = ((Object) (context)).getClass().getName();
		//   55  115:aload_0         
		//   56  116:aload_1         
		//   57  117:invokevirtual   #112 <Method Class Object.getClass()>
		//   58  120:invokevirtual   #117 <Method String Class.getName()>
		//   59  123:putfield        #119 <Field String zabw>
		//   60  126:return          
		}

		public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
		{
			this(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #124 <Method void GoogleApiClient$Builder(Context)>
			Preconditions.checkNotNull(((Object) (connectioncallbacks)), "Must provide a connected listener");
		//    3    5:aload_2         
		//    4    6:ldc1            #126 <String "Must provide a connected listener">
		//    5    8:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    6   11:pop             
			zace.add(((Object) (connectioncallbacks)));
		//    7   12:aload_0         
		//    8   13:getfield        #88  <Field ArrayList zace>
		//    9   16:aload_2         
		//   10   17:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
		//   11   20:pop             
			Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)), "Must provide a connection failed listener");
		//   12   21:aload_3         
		//   13   22:ldc1            #138 <String "Must provide a connection failed listener">
		//   14   24:invokestatic    #132 <Method Object Preconditions.checkNotNull(Object, Object)>
		//   15   27:pop             
			zacf.add(((Object) (onconnectionfailedlistener)));
		//   16   28:aload_0         
		//   17   29:getfield        #90  <Field ArrayList zacf>
		//   18   32:aload_3         
		//   19   33:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
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
		Set set = zabq;
	//    0    0:getstatic       #44  <Field Set zabq>
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
		iterator = zabq.iterator();
	//   11   22:getstatic       #44  <Field Set zabq>
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
		synchronized(zabq)
	//*   0    0:getstatic       #44  <Field Set zabq>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			set1 = zabq;
	//    4    6:getstatic       #44  <Field Set zabq>
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

	static Set zal()
	{
		return zabq;
	//    0    0:getstatic       #44  <Field Set zabq>
	//    1    3:areturn         
	}

	public abstract ConnectionResult blockingConnect();

	public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

	public abstract PendingResult clearDefaultAccountAndReconnect();

	public abstract void connect();

	public void connect(int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void disconnect();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl enqueue(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl execute(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Api.Client getClient(Api.AnyClientKey anyclientkey)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract ConnectionResult getConnectionResult(Api api);

	public Context getContext()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Looper getLooper()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean hasApi(Api api)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
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
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void maybeSignOut()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void reconnect();

	public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

	public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

	public ListenerHolder registerListener(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void stopAutoManage(FragmentActivity fragmentactivity);

	public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

	public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

	public void zaa(zacm zacm)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void zab(zacm zacm)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #105 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public static final String DEFAULT_ACCOUNT = "<<default account>>";
	public static final int SIGN_IN_MODE_OPTIONAL = 2;
	public static final int SIGN_IN_MODE_REQUIRED = 1;
	private static final Set zabq = Collections.newSetFromMap(((Map) (new WeakHashMap())));

	static 
	{
	//    0    0:new             #33  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void WeakHashMap()>
	//    3    7:invokestatic    #42  <Method Set Collections.newSetFromMap(Map)>
	//    4   10:putstatic       #44  <Field Set zabq>
	//*   5   13:return          
	}
}

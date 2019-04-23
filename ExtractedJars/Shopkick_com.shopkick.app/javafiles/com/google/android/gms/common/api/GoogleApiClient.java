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
		//    0    0:new             #55  <Class HashSet>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #148 <Method Api$BaseClientBuilder Api.zah()>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #154 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//    6   12:invokespecial   #157 <Method void HashSet(java.util.Collection)>
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
		//   20   35:invokeinterface #160 <Method boolean Set.add(Object)>
		//   21   40:pop             

		//   22   41:iload           4
		//   23   43:iconst_1        
		//   24   44:iadd            
		//   25   45:istore          4
		//*  26   47:goto            23
			zabx.put(((Object) (api)), ((Object) (new com.google.android.gms.common.internal.ClientSettings.OptionalApiSettings(((Set) (apioptions))))));
		//   27   50:aload_0         
		//   28   51:getfield        #65  <Field Map zabx>
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
			zaby.put(((Object) (api)), ((Object) (null)));
		//    4    7:aload_0         
		//    5    8:getfield        #67  <Field Map zaby>
		//    6   11:aload_1         
		//    7   12:aconst_null     
		//    8   13:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//    9   18:pop             
			api = ((Api) (api.zah().getImpliedScopes(((Object) (null)))));
		//   10   19:aload_1         
		//   11   20:invokevirtual   #148 <Method Api$BaseClientBuilder Api.zah()>
		//   12   23:aconst_null     
		//   13   24:invokevirtual   #154 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//   14   27:astore_1        
			zabs.addAll(((java.util.Collection) (api)));
		//   15   28:aload_0         
		//   16   29:getfield        #60  <Field Set zabs>
		//   17   32:aload_1         
		//   18   33:invokeinterface #180 <Method boolean Set.addAll(java.util.Collection)>
		//   19   38:pop             
			zabr.addAll(((java.util.Collection) (api)));
		//   20   39:aload_0         
		//   21   40:getfield        #58  <Field Set zabr>
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
			zaby.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   14:aload_0         
		//    9   15:getfield        #67  <Field Map zaby>
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   13   25:pop             
			api = ((Api) (api.zah().getImpliedScopes(((Object) (hasoptions)))));
		//   14   26:aload_1         
		//   15   27:invokevirtual   #148 <Method Api$BaseClientBuilder Api.zah()>
		//   16   30:aload_2         
		//   17   31:invokevirtual   #154 <Method java.util.List Api$BaseClientBuilder.getImpliedScopes(Object)>
		//   18   34:astore_1        
			zabs.addAll(((java.util.Collection) (api)));
		//   19   35:aload_0         
		//   20   36:getfield        #60  <Field Set zabs>
		//   21   39:aload_1         
		//   22   40:invokeinterface #180 <Method boolean Set.addAll(java.util.Collection)>
		//   23   45:pop             
			zabr.addAll(((java.util.Collection) (api)));
		//   24   46:aload_0         
		//   25   47:getfield        #58  <Field Set zabr>
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
			zaby.put(((Object) (api)), ((Object) (hasoptions)));
		//    8   14:aload_0         
		//    9   15:getfield        #67  <Field Map zaby>
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   13   25:pop             
			zaa(api, ((Api.ApiOptions) (hasoptions)), ascope);
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:aload_2         
		//   17   29:aload_3         
		//   18   30:invokespecial   #189 <Method void zaa(Api, Api$ApiOptions, Scope[])>
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
			zaby.put(((Object) (api)), ((Object) (null)));
		//    4    7:aload_0         
		//    5    8:getfield        #67  <Field Map zaby>
		//    6   11:aload_1         
		//    7   12:aconst_null     
		//    8   13:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//    9   18:pop             
			zaa(api, ((Api.ApiOptions) (null)), ascope);
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:aconst_null     
		//   13   22:aload_2         
		//   14   23:invokespecial   #189 <Method void zaa(Api, Api$ApiOptions, Scope[])>
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
			zace.add(((Object) (connectioncallbacks)));
		//    4    7:aload_0         
		//    5    8:getfield        #89  <Field ArrayList zace>
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
			zacf.add(((Object) (onconnectionfailedlistener)));
		//    4    7:aload_0         
		//    5    8:getfield        #91  <Field ArrayList zacf>
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
			zabr.add(((Object) (scope)));
		//    4    7:aload_0         
		//    5    8:getfield        #58  <Field Set zabr>
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
				zabr.add(((Object) (new Scope(as[i]))));
		//    6    8:aload_0         
		//    7    9:getfield        #58  <Field Set zabr>
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
			Preconditions.checkArgument(zaby.isEmpty() ^ true, "must call addApi() to add at least one API");
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field Map zaby>
		//    2    4:invokeinterface #215 <Method boolean Map.isEmpty()>
		//    3    9:iconst_1        
		//    4   10:ixor            
		//    5   11:ldc1            #217 <String "must call addApi() to add at least one API">
		//    6   13:invokestatic    #221 <Method void Preconditions.checkArgument(boolean, Object)>
			Object obj2 = ((Object) (buildClientSettings()));
		//    7   16:aload_0         
		//    8   17:invokevirtual   #225 <Method ClientSettings buildClientSettings()>
		//    9   20:astore          6
			Object obj = null;
		//   10   22:aconst_null     
		//   11   23:astore          4
			Map map = ((ClientSettings) (obj2)).getOptionalApiSettings();
		//   12   25:aload           6
		//   13   27:invokevirtual   #231 <Method Map ClientSettings.getOptionalApiSettings()>
		//   14   30:astore          7
			ArrayMap arraymap = new ArrayMap();
		//   15   32:new             #62  <Class ArrayMap>
		//   16   35:dup             
		//   17   36:invokespecial   #63  <Method void ArrayMap()>
		//   18   39:astore          8
			ArrayMap arraymap1 = new ArrayMap();
		//   19   41:new             #62  <Class ArrayMap>
		//   20   44:dup             
		//   21   45:invokespecial   #63  <Method void ArrayMap()>
		//   22   48:astore          9
			ArrayList arraylist = new ArrayList();
		//   23   50:new             #86  <Class ArrayList>
		//   24   53:dup             
		//   25   54:invokespecial   #87  <Method void ArrayList()>
		//   26   57:astore          10
			Iterator iterator = zaby.keySet().iterator();
		//   27   59:aload_0         
		//   28   60:getfield        #67  <Field Map zaby>
		//   29   63:invokeinterface #235 <Method Set Map.keySet()>
		//   30   68:invokeinterface #239 <Method Iterator Set.iterator()>
		//   31   73:astore          11
			boolean flag = false;
		//   32   75:iconst_0        
		//   33   76:istore_1        
			do
			{
				if(!iterator.hasNext())
					break;
		//   34   77:aload           11
		//   35   79:invokeinterface #244 <Method boolean Iterator.hasNext()>
		//   36   84:ifeq            342
				Object obj1 = ((Object) ((Api)iterator.next()));
		//   37   87:aload           11
		//   38   89:invokeinterface #248 <Method Object Iterator.next()>
		//   39   94:checkcast       #144 <Class Api>
		//   40   97:astore          5
				Object obj3 = zaby.get(obj1);
		//   41   99:aload_0         
		//   42  100:getfield        #67  <Field Map zaby>
		//   43  103:aload           5
		//   44  105:invokeinterface #252 <Method Object Map.get(Object)>
		//   45  110:astore          12
				boolean flag2;
				if(map.get(obj1) != null)
		//*  46  112:aload           7
		//*  47  114:aload           5
		//*  48  116:invokeinterface #252 <Method Object Map.get(Object)>
		//*  49  121:ifnull          129
					flag2 = true;
		//   50  124:iconst_1        
		//   51  125:istore_3        
				else
		//*  52  126:goto            131
					flag2 = false;
		//   53  129:iconst_0        
		//   54  130:istore_3        
				((Map) (arraymap)).put(obj1, ((Object) (Boolean.valueOf(flag2))));
		//   55  131:aload           8
		//   56  133:aload           5
		//   57  135:iload_3         
		//   58  136:invokestatic    #258 <Method Boolean Boolean.valueOf(boolean)>
		//   59  139:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   60  144:pop             
				Object obj4 = ((Object) (new zaq(((Api) (obj1)), flag2)));
		//   61  145:new             #260 <Class zaq>
		//   62  148:dup             
		//   63  149:aload           5
		//   64  151:iload_3         
		//   65  152:invokespecial   #263 <Method void zaq(Api, boolean)>
		//   66  155:astore          14
				arraylist.add(obj4);
		//   67  157:aload           10
		//   68  159:aload           14
		//   69  161:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//   70  164:pop             
				Api.AbstractClientBuilder abstractclientbuilder = ((Api) (obj1)).zai();
		//   71  165:aload           5
		//   72  167:invokevirtual   #267 <Method Api$AbstractClientBuilder Api.zai()>
		//   73  170:astore          13
				obj4 = ((Object) (abstractclientbuilder.buildClient(mContext, zabj, ((ClientSettings) (obj2)), obj3, ((ConnectionCallbacks) (obj4)), ((OnConnectionFailedListener) (obj4)))));
		//   74  172:aload           13
		//   75  174:aload_0         
		//   76  175:getfield        #95  <Field Context mContext>
		//   77  178:aload_0         
		//   78  179:getfield        #103 <Field Looper zabj>
		//   79  182:aload           6
		//   80  184:aload           12
		//   81  186:aload           14
		//   82  188:aload           14
		//   83  190:invokevirtual   #273 <Method Api$Client Api$AbstractClientBuilder.buildClient(Context, Looper, ClientSettings, Object, GoogleApiClient$ConnectionCallbacks, GoogleApiClient$OnConnectionFailedListener)>
		//   84  193:astore          14
				((Map) (arraymap1)).put(((Object) (((Api) (obj1)).getClientKey())), obj4);
		//   85  195:aload           9
		//   86  197:aload           5
		//   87  199:invokevirtual   #277 <Method Api$AnyClientKey Api.getClientKey()>
		//   88  202:aload           14
		//   89  204:invokeinterface #170 <Method Object Map.put(Object, Object)>
		//   90  209:pop             
				boolean flag1 = flag;
		//   91  210:iload_1         
		//   92  211:istore_2        
				if(((Api.BaseClientBuilder) (abstractclientbuilder)).getPriority() == 1)
		//*  93  212:aload           13
		//*  94  214:invokevirtual   #281 <Method int Api$BaseClientBuilder.getPriority()>
		//*  95  217:iconst_1        
		//*  96  218:icmpne          235
				{
					if(obj3 != null)
		//*  97  221:aload           12
		//*  98  223:ifnull          231
						flag = true;
		//   99  226:iconst_1        
		//  100  227:istore_1        
					else
		//* 101  228:goto            233
						flag = false;
		//  102  231:iconst_0        
		//  103  232:istore_1        
					flag1 = flag;
		//  104  233:iload_1         
		//  105  234:istore_2        
				}
				flag = flag1;
		//  106  235:iload_2         
		//  107  236:istore_1        
				if(((Api.Client) (obj4)).providesSignIn())
		//* 108  237:aload           14
		//* 109  239:invokeinterface #286 <Method boolean Api$Client.providesSignIn()>
		//* 110  244:ifeq            77
					if(obj == null)
		//* 111  247:aload           4
		//* 112  249:ifnonnull       261
					{
						obj = obj1;
		//  113  252:aload           5
		//  114  254:astore          4
						flag = flag1;
		//  115  256:iload_2         
		//  116  257:istore_1        
					} else
		//* 117  258:goto            77
					{
						obj1 = ((Object) (((Api) (obj1)).getName()));
		//  118  261:aload           5
		//  119  263:invokevirtual   #287 <Method String Api.getName()>
		//  120  266:astore          5
						obj = ((Object) (((Api) (obj)).getName()));
		//  121  268:aload           4
		//  122  270:invokevirtual   #287 <Method String Api.getName()>
		//  123  273:astore          4
						obj2 = ((Object) (new StringBuilder(String.valueOf(obj1).length() + 21 + String.valueOf(obj).length())));
		//  124  275:new             #289 <Class StringBuilder>
		//  125  278:dup             
		//  126  279:aload           5
		//  127  281:invokestatic    #294 <Method String String.valueOf(Object)>
		//  128  284:invokevirtual   #297 <Method int String.length()>
		//  129  287:bipush          21
		//  130  289:iadd            
		//  131  290:aload           4
		//  132  292:invokestatic    #294 <Method String String.valueOf(Object)>
		//  133  295:invokevirtual   #297 <Method int String.length()>
		//  134  298:iadd            
		//  135  299:invokespecial   #300 <Method void StringBuilder(int)>
		//  136  302:astore          6
						((StringBuilder) (obj2)).append(((String) (obj1)));
		//  137  304:aload           6
		//  138  306:aload           5
		//  139  308:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  140  311:pop             
						((StringBuilder) (obj2)).append(" cannot be used with ");
		//  141  312:aload           6
		//  142  314:ldc2            #306 <String " cannot be used with ">
		//  143  317:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  144  320:pop             
						((StringBuilder) (obj2)).append(((String) (obj)));
		//  145  321:aload           6
		//  146  323:aload           4
		//  147  325:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  148  328:pop             
						throw new IllegalStateException(((StringBuilder) (obj2)).toString());
		//  149  329:new             #308 <Class IllegalStateException>
		//  150  332:dup             
		//  151  333:aload           6
		//  152  335:invokevirtual   #311 <Method String StringBuilder.toString()>
		//  153  338:invokespecial   #312 <Method void IllegalStateException(String)>
		//  154  341:athrow          
					}
			} while(true);
			if(obj != null)
		//* 155  342:aload           4
		//* 156  344:ifnull          484
				if(!flag)
		//* 157  347:iload_1         
		//* 158  348:ifne            418
				{
					boolean flag3;
					if(zax == null)
		//* 159  351:aload_0         
		//* 160  352:getfield        #314 <Field Account zax>
		//* 161  355:ifnonnull       363
						flag3 = true;
		//  162  358:iconst_1        
		//  163  359:istore_3        
					else
		//* 164  360:goto            365
						flag3 = false;
		//  165  363:iconst_0        
		//  166  364:istore_3        
					Preconditions.checkState(flag3, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] {
						((Api) (obj)).getName()
					});
		//  167  365:iload_3         
		//  168  366:ldc2            #316 <String "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead">
		//  169  369:iconst_1        
		//  170  370:anewarray       Object[]
		//  171  373:dup             
		//  172  374:iconst_0        
		//  173  375:aload           4
		//  174  377:invokevirtual   #287 <Method String Api.getName()>
		//  175  380:aastore         
		//  176  381:invokestatic    #320 <Method void Preconditions.checkState(boolean, String, Object[])>
					Preconditions.checkState(zabr.equals(((Object) (zabs))), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] {
						((Api) (obj)).getName()
					});
		//  177  384:aload_0         
		//  178  385:getfield        #58  <Field Set zabr>
		//  179  388:aload_0         
		//  180  389:getfield        #60  <Field Set zabs>
		//  181  392:invokeinterface #323 <Method boolean Set.equals(Object)>
		//  182  397:ldc2            #325 <String "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.">
		//  183  400:iconst_1        
		//  184  401:anewarray       Object[]
		//  185  404:dup             
		//  186  405:iconst_0        
		//  187  406:aload           4
		//  188  408:invokevirtual   #287 <Method String Api.getName()>
		//  189  411:aastore         
		//  190  412:invokestatic    #320 <Method void Preconditions.checkState(boolean, String, Object[])>
				} else
		//* 191  415:goto            484
				{
					obj = ((Object) (((Api) (obj)).getName()));
		//  192  418:aload           4
		//  193  420:invokevirtual   #287 <Method String Api.getName()>
		//  194  423:astore          4
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 82);
		//  195  425:new             #289 <Class StringBuilder>
		//  196  428:dup             
		//  197  429:aload           4
		//  198  431:invokestatic    #294 <Method String String.valueOf(Object)>
		//  199  434:invokevirtual   #297 <Method int String.length()>
		//  200  437:bipush          82
		//  201  439:iadd            
		//  202  440:invokespecial   #300 <Method void StringBuilder(int)>
		//  203  443:astore          5
					stringbuilder.append("With using ");
		//  204  445:aload           5
		//  205  447:ldc2            #327 <String "With using ">
		//  206  450:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  207  453:pop             
					stringbuilder.append(((String) (obj)));
		//  208  454:aload           5
		//  209  456:aload           4
		//  210  458:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  211  461:pop             
					stringbuilder.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
		//  212  462:aload           5
		//  213  464:ldc2            #329 <String ", GamesOptions can only be specified within GoogleSignInOptions.Builder">
		//  214  467:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
		//  215  470:pop             
					throw new IllegalStateException(stringbuilder.toString());
		//  216  471:new             #308 <Class IllegalStateException>
		//  217  474:dup             
		//  218  475:aload           5
		//  219  477:invokevirtual   #311 <Method String StringBuilder.toString()>
		//  220  480:invokespecial   #312 <Method void IllegalStateException(String)>
		//  221  483:athrow          
				}
			int i = zaaw.zaa(((Iterable) (((Map) (arraymap1)).values())), true);
		//  222  484:aload           9
		//  223  486:invokeinterface #333 <Method java.util.Collection Map.values()>
		//  224  491:iconst_1        
		//  225  492:invokestatic    #338 <Method int zaaw.zaa(Iterable, boolean)>
		//  226  495:istore_1        
			zaaw zaaw1 = new zaaw(mContext, ((java.util.concurrent.locks.Lock) (new ReentrantLock())), zabj, ((ClientSettings) (obj2)), zacc, zacd, ((Map) (arraymap)), ((java.util.List) (zace)), ((java.util.List) (zacf)), ((Map) (arraymap1)), zaca, i, arraylist, false);
		//  227  496:new             #335 <Class zaaw>
		//  228  499:dup             
		//  229  500:aload_0         
		//  230  501:getfield        #95  <Field Context mContext>
		//  231  504:new             #340 <Class ReentrantLock>
		//  232  507:dup             
		//  233  508:invokespecial   #341 <Method void ReentrantLock()>
		//  234  511:aload_0         
		//  235  512:getfield        #103 <Field Looper zabj>
		//  236  515:aload           6
		//  237  517:aload_0         
		//  238  518:getfield        #77  <Field GoogleApiAvailability zacc>
		//  239  521:aload_0         
		//  240  522:getfield        #84  <Field Api$AbstractClientBuilder zacd>
		//  241  525:aload           8
		//  242  527:aload_0         
		//  243  528:getfield        #89  <Field ArrayList zace>
		//  244  531:aload_0         
		//  245  532:getfield        #91  <Field ArrayList zacf>
		//  246  535:aload           9
		//  247  537:aload_0         
		//  248  538:getfield        #69  <Field int zaca>
		//  249  541:iload_1         
		//  250  542:aload           10
		//  251  544:iconst_0        
		//  252  545:invokespecial   #344 <Method void zaaw(Context, java.util.concurrent.locks.Lock, Looper, ClientSettings, GoogleApiAvailability, Api$AbstractClientBuilder, Map, java.util.List, java.util.List, Map, int, int, ArrayList, boolean)>
		//  253  548:astore          5
			synchronized(GoogleApiClient.zal())
		//* 254  550:invokestatic    #347 <Method Set GoogleApiClient.zal()>
		//* 255  553:astore          4
		//* 256  555:aload           4
		//* 257  557:monitorenter    
			{
				GoogleApiClient.zal().add(((Object) (zaaw1)));
		//  258  558:invokestatic    #347 <Method Set GoogleApiClient.zal()>
		//  259  561:aload           5
		//  260  563:invokeinterface #160 <Method boolean Set.add(Object)>
		//  261  568:pop             
			}
		//  262  569:aload           4
		//  263  571:monitorexit     
			if(zaca >= 0)
		//* 264  572:aload_0         
		//* 265  573:getfield        #69  <Field int zaca>
		//* 266  576:iflt            599
				zaj.zaa(zabz).zaa(zaca, ((GoogleApiClient) (zaaw1)), zacb);
		//  267  579:aload_0         
		//  268  580:getfield        #349 <Field LifecycleActivity zabz>
		//  269  583:invokestatic    #354 <Method zaj zaj.zaa(LifecycleActivity)>
		//  270  586:aload_0         
		//  271  587:getfield        #69  <Field int zaca>
		//  272  590:aload           5
		//  273  592:aload_0         
		//  274  593:getfield        #356 <Field GoogleApiClient$OnConnectionFailedListener zacb>
		//  275  596:invokevirtual   #359 <Method void zaj.zaa(int, GoogleApiClient, GoogleApiClient$OnConnectionFailedListener)>
			return ((GoogleApiClient) (zaaw1));
		//  276  599:aload           5
		//  277  601:areturn         
			exception;
		//  278  602:astore          5
			set;
		//  279  604:aload           4
			JVM INSTR monitorexit ;
		//  280  606:monitorexit     
			throw exception;
		//  281  607:aload           5
		//  282  609:athrow          
		}

		public final ClientSettings buildClientSettings()
		{
			SignInOptions signinoptions = SignInOptions.DEFAULT;
		//    0    0:getstatic       #366 <Field SignInOptions SignInOptions.DEFAULT>
		//    1    3:astore_1        
			if(zaby.containsKey(((Object) (zaa.API))))
		//*   2    4:aload_0         
		//*   3    5:getfield        #67  <Field Map zaby>
		//*   4    8:getstatic       #370 <Field Api zaa.API>
		//*   5   11:invokeinterface #373 <Method boolean Map.containsKey(Object)>
		//*   6   16:ifeq            38
				signinoptions = (SignInOptions)zaby.get(((Object) (zaa.API)));
		//    7   19:aload_0         
		//    8   20:getfield        #67  <Field Map zaby>
		//    9   23:getstatic       #370 <Field Api zaa.API>
		//   10   26:invokeinterface #252 <Method Object Map.get(Object)>
		//   11   31:checkcast       #362 <Class SignInOptions>
		//   12   34:astore_1        
		//*  13   35:goto            38
			return new ClientSettings(zax, zabr, zabx, zabt, zabu, zabv, zabw, signinoptions);
		//   14   38:new             #227 <Class ClientSettings>
		//   15   41:dup             
		//   16   42:aload_0         
		//   17   43:getfield        #314 <Field Account zax>
		//   18   46:aload_0         
		//   19   47:getfield        #58  <Field Set zabr>
		//   20   50:aload_0         
		//   21   51:getfield        #65  <Field Map zabx>
		//   22   54:aload_0         
		//   23   55:getfield        #375 <Field int zabt>
		//   24   58:aload_0         
		//   25   59:getfield        #377 <Field View zabu>
		//   26   62:aload_0         
		//   27   63:getfield        #109 <Field String zabv>
		//   28   66:aload_0         
		//   29   67:getfield        #120 <Field String zabw>
		//   30   70:aload_1         
		//   31   71:invokespecial   #380 <Method void ClientSettings(Account, Set, Map, int, View, String, String, SignInOptions)>
		//   32   74:areturn         
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
			zaca = i;
		//   15   30:aload_0         
		//   16   31:iload_2         
		//   17   32:putfield        #69  <Field int zaca>
			zacb = onconnectionfailedlistener;
		//   18   35:aload_0         
		//   19   36:aload_3         
		//   20   37:putfield        #356 <Field GoogleApiClient$OnConnectionFailedListener zacb>
			zabz = ((LifecycleActivity) (fragmentactivity));
		//   21   40:aload_0         
		//   22   41:aload_1         
		//   23   42:putfield        #349 <Field LifecycleActivity zabz>
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
			zax = ((Account) (s));
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:putfield        #314 <Field Account zax>
			return this;
		//   14   26:aload_0         
		//   15   27:areturn         
		}

		public final Builder setGravityForPopups(int i)
		{
			zabt = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #375 <Field int zabt>
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
			zabj = handler.getLooper();
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #413 <Method Looper Handler.getLooper()>
		//    7   13:putfield        #103 <Field Looper zabj>
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
			zabu = view;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #377 <Field View zabu>
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
		//    1    1:invokespecial   #53  <Method void Object()>
			zabr = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #55  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #56  <Method void HashSet()>
		//    6   12:putfield        #58  <Field Set zabr>
			zabs = ((Set) (new HashSet()));
		//    7   15:aload_0         
		//    8   16:new             #55  <Class HashSet>
		//    9   19:dup             
		//   10   20:invokespecial   #56  <Method void HashSet()>
		//   11   23:putfield        #60  <Field Set zabs>
			zabx = ((Map) (new ArrayMap()));
		//   12   26:aload_0         
		//   13   27:new             #62  <Class ArrayMap>
		//   14   30:dup             
		//   15   31:invokespecial   #63  <Method void ArrayMap()>
		//   16   34:putfield        #65  <Field Map zabx>
			zaby = ((Map) (new ArrayMap()));
		//   17   37:aload_0         
		//   18   38:new             #62  <Class ArrayMap>
		//   19   41:dup             
		//   20   42:invokespecial   #63  <Method void ArrayMap()>
		//   21   45:putfield        #67  <Field Map zaby>
			zaca = -1;
		//   22   48:aload_0         
		//   23   49:iconst_m1       
		//   24   50:putfield        #69  <Field int zaca>
			zacc = GoogleApiAvailability.getInstance();
		//   25   53:aload_0         
		//   26   54:invokestatic    #75  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
		//   27   57:putfield        #77  <Field GoogleApiAvailability zacc>
			zacd = zaa.zapg;
		//   28   60:aload_0         
		//   29   61:getstatic       #82  <Field Api$AbstractClientBuilder zaa.zapg>
		//   30   64:putfield        #84  <Field Api$AbstractClientBuilder zacd>
			zace = new ArrayList();
		//   31   67:aload_0         
		//   32   68:new             #86  <Class ArrayList>
		//   33   71:dup             
		//   34   72:invokespecial   #87  <Method void ArrayList()>
		//   35   75:putfield        #89  <Field ArrayList zace>
			zacf = new ArrayList();
		//   36   78:aload_0         
		//   37   79:new             #86  <Class ArrayList>
		//   38   82:dup             
		//   39   83:invokespecial   #87  <Method void ArrayList()>
		//   40   86:putfield        #91  <Field ArrayList zacf>
			zacg = false;
		//   41   89:aload_0         
		//   42   90:iconst_0        
		//   43   91:putfield        #93  <Field boolean zacg>
			mContext = context;
		//   44   94:aload_0         
		//   45   95:aload_1         
		//   46   96:putfield        #95  <Field Context mContext>
			zabj = context.getMainLooper();
		//   47   99:aload_0         
		//   48  100:aload_1         
		//   49  101:invokevirtual   #101 <Method Looper Context.getMainLooper()>
		//   50  104:putfield        #103 <Field Looper zabj>
			zabv = context.getPackageName();
		//   51  107:aload_0         
		//   52  108:aload_1         
		//   53  109:invokevirtual   #107 <Method String Context.getPackageName()>
		//   54  112:putfield        #109 <Field String zabv>
			zabw = ((Object) (context)).getClass().getName();
		//   55  115:aload_0         
		//   56  116:aload_1         
		//   57  117:invokevirtual   #113 <Method Class Object.getClass()>
		//   58  120:invokevirtual   #118 <Method String Class.getName()>
		//   59  123:putfield        #120 <Field String zabw>
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
			zace.add(((Object) (connectioncallbacks)));
		//    7   12:aload_0         
		//    8   13:getfield        #89  <Field ArrayList zace>
		//    9   16:aload_2         
		//   10   17:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//   11   20:pop             
			Preconditions.checkNotNull(((Object) (onconnectionfailedlistener)), "Must provide a connection failed listener");
		//   12   21:aload_3         
		//   13   22:ldc1            #140 <String "Must provide a connection failed listener">
		//   14   24:invokestatic    #134 <Method Object Preconditions.checkNotNull(Object, Object)>
		//   15   27:pop             
			zacf.add(((Object) (onconnectionfailedlistener)));
		//   16   28:aload_0         
		//   17   29:getfield        #91  <Field ArrayList zacf>
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

	public void zaa(zacm zacm)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #106 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void zab(zacm zacm)
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

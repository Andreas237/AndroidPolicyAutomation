// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.*;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.service.zac;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabt, ListenerHolders, zaax, zabb, 
//			zacp, zaba, zabs, zax, 
//			zas, zabe, StatusPendingResult, zaay, 
//			zaaz, BasePendingResult, LifecycleActivity, zaj, 
//			zabq, zabc, SignInConnectionListener, ListenerHolder, 
//			zacm

public final class zaaw extends GoogleApiClient
	implements zabt
{

	public zaaw(Context context, Lock lock, Looper looper, ClientSettings clientsettings, GoogleApiAvailability googleapiavailability, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, Map map, 
			List list, List list1, Map map1, int i, int j, ArrayList arraylist, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void GoogleApiClient()>
		zags = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #67  <Field zabs zags>
	//    5    9:aload_0         
	//    6   10:new             #69  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #70  <Method void LinkedList()>
	//    9   17:putfield        #72  <Field Queue zafb>
		long l;
		if(ClientLibraryUtils.isPackageSide())
	//*  10   20:invokestatic    #78  <Method boolean ClientLibraryUtils.isPackageSide()>
	//*  11   23:ifeq            34
			l = 10000L;
	//   12   26:ldc2w           #79  <Long 10000L>
	//   13   29:lstore          15
		else
	//*  14   31:goto            39
			l = 0x1d4c0L;
	//   15   34:ldc2w           #81  <Long 0x1d4c0L>
	//   16   37:lstore          15
		zagu = l;
	//   17   39:aload_0         
	//   18   40:lload           15
	//   19   42:putfield        #84  <Field long zagu>
		zagv = 5000L;
	//   20   45:aload_0         
	//   21   46:ldc2w           #85  <Long 5000L>
	//   22   49:putfield        #88  <Field long zagv>
		zagz = ((Set) (new HashSet()));
	//   23   52:aload_0         
	//   24   53:new             #90  <Class HashSet>
	//   25   56:dup             
	//   26   57:invokespecial   #91  <Method void HashSet()>
	//   27   60:putfield        #93  <Field Set zagz>
	//   28   63:aload_0         
	//   29   64:new             #95  <Class ListenerHolders>
	//   30   67:dup             
	//   31   68:invokespecial   #96  <Method void ListenerHolders()>
	//   32   71:putfield        #98  <Field ListenerHolders zaha>
		zahc = null;
	//   33   74:aload_0         
	//   34   75:aconst_null     
	//   35   76:putfield        #100 <Field Integer zahc>
		zahd = null;
	//   36   79:aload_0         
	//   37   80:aconst_null     
	//   38   81:putfield        #102 <Field Set zahd>
	//   39   84:aload_0         
	//   40   85:new             #104 <Class zaax>
	//   41   88:dup             
	//   42   89:aload_0         
	//   43   90:invokespecial   #107 <Method void zaax(zaaw)>
	//   44   93:putfield        #109 <Field com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState zahf>
		mContext = context;
	//   45   96:aload_0         
	//   46   97:aload_1         
	//   47   98:putfield        #111 <Field Context mContext>
		zaen = lock;
	//   48  101:aload_0         
	//   49  102:aload_2         
	//   50  103:putfield        #113 <Field Lock zaen>
		zacg = false;
	//   51  106:aload_0         
	//   52  107:iconst_0        
	//   53  108:putfield        #115 <Field boolean zacg>
		zagr = new GmsClientEventManager(looper, zahf);
	//   54  111:aload_0         
	//   55  112:new             #117 <Class GmsClientEventManager>
	//   56  115:dup             
	//   57  116:aload_3         
	//   58  117:aload_0         
	//   59  118:getfield        #109 <Field com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState zahf>
	//   60  121:invokespecial   #120 <Method void GmsClientEventManager(Looper, com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState)>
	//   61  124:putfield        #122 <Field GmsClientEventManager zagr>
		zabj = looper;
	//   62  127:aload_0         
	//   63  128:aload_3         
	//   64  129:putfield        #124 <Field Looper zabj>
		zagw = new zabb(this, looper);
	//   65  132:aload_0         
	//   66  133:new             #126 <Class zabb>
	//   67  136:dup             
	//   68  137:aload_0         
	//   69  138:aload_3         
	//   70  139:invokespecial   #129 <Method void zabb(zaaw, Looper)>
	//   71  142:putfield        #131 <Field zabb zagw>
		zacc = googleapiavailability;
	//   72  145:aload_0         
	//   73  146:aload           5
	//   74  148:putfield        #133 <Field GoogleApiAvailability zacc>
		zaca = i;
	//   75  151:aload_0         
	//   76  152:iload           11
	//   77  154:putfield        #135 <Field int zaca>
		if(zaca >= 0)
	//*  78  157:aload_0         
	//*  79  158:getfield        #135 <Field int zaca>
	//*  80  161:iflt            173
			zahc = Integer.valueOf(j);
	//   81  164:aload_0         
	//   82  165:iload           12
	//   83  167:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//   84  170:putfield        #100 <Field Integer zahc>
		zaev = map;
	//   85  173:aload_0         
	//   86  174:aload           7
	//   87  176:putfield        #143 <Field Map zaev>
		zagy = map1;
	//   88  179:aload_0         
	//   89  180:aload           10
	//   90  182:putfield        #145 <Field Map zagy>
		zahb = arraylist;
	//   91  185:aload_0         
	//   92  186:aload           13
	//   93  188:putfield        #147 <Field ArrayList zahb>
		zahe = new zacp(zagy);
	//   94  191:aload_0         
	//   95  192:new             #149 <Class zacp>
	//   96  195:dup             
	//   97  196:aload_0         
	//   98  197:getfield        #145 <Field Map zagy>
	//   99  200:invokespecial   #152 <Method void zacp(Map)>
	//  100  203:putfield        #154 <Field zacp zahe>
		for(context = ((Context) (list.iterator())); ((Iterator) (context)).hasNext(); zagr.registerConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (lock))))
	//* 101  206:aload           8
	//* 102  208:invokeinterface #160 <Method Iterator List.iterator()>
	//* 103  213:astore_1        
	//* 104  214:aload_1         
	//* 105  215:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//* 106  220:ifeq            244
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (context)).next()));
	//  107  223:aload_1         
	//  108  224:invokeinterface #169 <Method Object Iterator.next()>
	//  109  229:checkcast       #171 <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//  110  232:astore_2        

	//  111  233:aload_0         
	//  112  234:getfield        #122 <Field GmsClientEventManager zagr>
	//  113  237:aload_2         
	//  114  238:invokevirtual   #175 <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//* 115  241:goto            214
		for(context = ((Context) (list1.iterator())); ((Iterator) (context)).hasNext(); zagr.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (lock))))
	//* 116  244:aload           9
	//* 117  246:invokeinterface #160 <Method Iterator List.iterator()>
	//* 118  251:astore_1        
	//* 119  252:aload_1         
	//* 120  253:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//* 121  258:ifeq            282
			lock = ((Lock) ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (context)).next()));
	//  122  261:aload_1         
	//  123  262:invokeinterface #169 <Method Object Iterator.next()>
	//  124  267:checkcast       #177 <Class com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener>
	//  125  270:astore_2        

	//  126  271:aload_0         
	//  127  272:getfield        #122 <Field GmsClientEventManager zagr>
	//  128  275:aload_2         
	//  129  276:invokevirtual   #181 <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//* 130  279:goto            252
		zaes = clientsettings;
	//  131  282:aload_0         
	//  132  283:aload           4
	//  133  285:putfield        #183 <Field ClientSettings zaes>
		zacd = abstractclientbuilder;
	//  134  288:aload_0         
	//  135  289:aload           6
	//  136  291:putfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  137  294:return          
	}

	private final void resume()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zagt)
	//*   3    9:aload_0         
	//*   4   10:getfield        #196 <Field boolean zagt>
	//*   5   13:ifeq            20
			zaau();
	//    6   16:aload_0         
	//    7   17:invokespecial   #199 <Method void zaau()>
		zaen.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #113 <Field Lock zaen>
	//   10   24:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zaen.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #113 <Field Lock zaen>
	//   15   35:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	public static int zaa(Iterable iterable, boolean flag)
	{
		iterable = ((Iterable) (iterable.iterator()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #207 <Method Iterator Iterable.iterator()>
	//    2    6:astore_0        
		boolean flag2 = false;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		do
		{
			if(!((Iterator) (iterable)).hasNext())
				break;
	//    7   11:aload_0         
	//    8   12:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//    9   17:ifeq            68
			com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)((Iterator) (iterable)).next();
	//   10   20:aload_0         
	//   11   21:invokeinterface #169 <Method Object Iterator.next()>
	//   12   26:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//   13   29:astore          5
			boolean flag3 = flag2;
	//   14   31:iload_3         
	//   15   32:istore          4
			if(client.requiresSignIn())
	//*  16   34:aload           5
	//*  17   36:invokeinterface #212 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  18   41:ifeq            47
				flag3 = true;
	//   19   44:iconst_1        
	//   20   45:istore          4
			flag2 = flag3;
	//   21   47:iload           4
	//   22   49:istore_3        
			if(client.providesSignIn())
	//*  23   50:aload           5
	//*  24   52:invokeinterface #215 <Method boolean com.google.android.gms.common.api.Api$Client.providesSignIn()>
	//*  25   57:ifeq            11
			{
				flag1 = true;
	//   26   60:iconst_1        
	//   27   61:istore_2        
				flag2 = flag3;
	//   28   62:iload           4
	//   29   64:istore_3        
			}
		} while(true);
	//   30   65:goto            11
		if(flag2)
	//*  31   68:iload_3         
	//*  32   69:ifeq            84
			return !flag1 || !flag ? 1 : 2;
	//   33   72:iload_2         
	//   34   73:ifeq            82
	//   35   76:iload_1         
	//   36   77:ifeq            82
	//   37   80:iconst_2        
	//   38   81:ireturn         
	//   39   82:iconst_1        
	//   40   83:ireturn         
		else
			return 3;
	//   41   84:iconst_3        
	//   42   85:ireturn         
	}

	private final void zaa(GoogleApiClient googleapiclient, StatusPendingResult statuspendingresult, boolean flag)
	{
		Common.zaph.zaa(googleapiclient).setResultCallback(((com.google.android.gms.common.api.ResultCallback) (new zaba(this, statuspendingresult, flag, googleapiclient))));
	//    0    0:getstatic       #223 <Field zac Common.zaph>
	//    1    3:aload_1         
	//    2    4:invokeinterface #228 <Method PendingResult zac.zaa(GoogleApiClient)>
	//    3    9:new             #230 <Class zaba>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:aload_1         
	//    9   17:invokespecial   #233 <Method void zaba(zaaw, StatusPendingResult, boolean, GoogleApiClient)>
	//   10   20:invokevirtual   #239 <Method void PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback)>
	//   11   23:return          
	}

	static void zaa(zaaw zaaw1)
	{
		zaaw1.resume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method void resume()>
	//    2    4:return          
	}

	static void zaa(zaaw zaaw1, GoogleApiClient googleapiclient, StatusPendingResult statuspendingresult, boolean flag)
	{
		zaaw1.zaa(googleapiclient, statuspendingresult, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #244 <Method void zaa(GoogleApiClient, StatusPendingResult, boolean)>
	//    5    7:return          
	}

	private final void zaau()
	{
		zagr.enableCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:invokevirtual   #250 <Method void GmsClientEventManager.enableCallbacks()>
		zags.connect();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field zabs zags>
	//    5   11:invokeinterface #255 <Method void zabs.connect()>
	//    6   16:return          
	}

	private final void zaav()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zaaw())
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #260 <Method boolean zaaw()>
	//*   5   13:ifeq            20
			zaau();
	//    6   16:aload_0         
	//    7   17:invokespecial   #199 <Method void zaau()>
		zaen.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #113 <Field Lock zaen>
	//   10   24:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   11   29:return          
		Exception exception;
		exception;
	//   12   30:astore_1        
		zaen.unlock();
	//   13   31:aload_0         
	//   14   32:getfield        #113 <Field Lock zaen>
	//   15   35:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   16   40:aload_1         
	//   17   41:athrow          
	}

	static void zab(zaaw zaaw1)
	{
		zaaw1.zaav();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method void zaav()>
	//    2    4:return          
	}

	static Context zac(zaaw zaaw1)
	{
		return zaaw1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Context mContext>
	//    2    4:areturn         
	}

	private final void zae(int i)
	{
		if(zahc == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field Integer zahc>
	//*   2    4:ifnonnull       18
			zahc = Integer.valueOf(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//    6   12:putfield        #100 <Field Integer zahc>
		else
	//*   7   15:goto            123
		if(zahc.intValue() != i)
	//*   8   18:aload_0         
	//*   9   19:getfield        #100 <Field Integer zahc>
	//*  10   22:invokevirtual   #271 <Method int Integer.intValue()>
	//*  11   25:iload_1         
	//*  12   26:icmpeq          123
		{
			String s = zaf(i);
	//   13   29:iload_1         
	//   14   30:invokestatic    #275 <Method String zaf(int)>
	//   15   33:astore          4
			String s1 = zaf(zahc.intValue());
	//   16   35:aload_0         
	//   17   36:getfield        #100 <Field Integer zahc>
	//   18   39:invokevirtual   #271 <Method int Integer.intValue()>
	//   19   42:invokestatic    #275 <Method String zaf(int)>
	//   20   45:astore          5
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51 + String.valueOf(((Object) (s1))).length());
	//   21   47:new             #277 <Class StringBuilder>
	//   22   50:dup             
	//   23   51:aload           4
	//   24   53:invokestatic    #282 <Method String String.valueOf(Object)>
	//   25   56:invokevirtual   #285 <Method int String.length()>
	//   26   59:bipush          51
	//   27   61:iadd            
	//   28   62:aload           5
	//   29   64:invokestatic    #282 <Method String String.valueOf(Object)>
	//   30   67:invokevirtual   #285 <Method int String.length()>
	//   31   70:iadd            
	//   32   71:invokespecial   #287 <Method void StringBuilder(int)>
	//   33   74:astore          6
			stringbuilder.append("Cannot use sign-in mode: ");
	//   34   76:aload           6
	//   35   78:ldc2            #289 <String "Cannot use sign-in mode: ">
	//   36   81:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder.append(s);
	//   38   85:aload           6
	//   39   87:aload           4
	//   40   89:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   41   92:pop             
			stringbuilder.append(". Mode was already set to ");
	//   42   93:aload           6
	//   43   95:ldc2            #295 <String ". Mode was already set to ">
	//   44   98:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:pop             
			stringbuilder.append(s1);
	//   46  102:aload           6
	//   47  104:aload           5
	//   48  106:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   49  109:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   50  110:new             #297 <Class IllegalStateException>
	//   51  113:dup             
	//   52  114:aload           6
	//   53  116:invokevirtual   #301 <Method String StringBuilder.toString()>
	//   54  119:invokespecial   #304 <Method void IllegalStateException(String)>
	//   55  122:athrow          
		}
		if(zags != null)
	//*  56  123:aload_0         
	//*  57  124:getfield        #67  <Field zabs zags>
	//*  58  127:ifnull          131
			return;
	//   59  130:return          
		Iterator iterator = zagy.values().iterator();
	//   60  131:aload_0         
	//   61  132:getfield        #145 <Field Map zagy>
	//   62  135:invokeinterface #310 <Method Collection Map.values()>
	//   63  140:invokeinterface #313 <Method Iterator Collection.iterator()>
	//   64  145:astore          4
		boolean flag = false;
	//   65  147:iconst_0        
	//   66  148:istore_2        
		i = 0;
	//   67  149:iconst_0        
	//   68  150:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   69  151:aload           4
	//   70  153:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//   71  158:ifeq            206
			com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client)iterator.next();
	//   72  161:aload           4
	//   73  163:invokeinterface #169 <Method Object Iterator.next()>
	//   74  168:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//   75  171:astore          5
			boolean flag1 = flag;
	//   76  173:iload_2         
	//   77  174:istore_3        
			if(client.requiresSignIn())
	//*  78  175:aload           5
	//*  79  177:invokeinterface #212 <Method boolean com.google.android.gms.common.api.Api$Client.requiresSignIn()>
	//*  80  182:ifeq            187
				flag1 = true;
	//   81  185:iconst_1        
	//   82  186:istore_3        
			flag = flag1;
	//   83  187:iload_3         
	//   84  188:istore_2        
			if(client.providesSignIn())
	//*  85  189:aload           5
	//*  86  191:invokeinterface #215 <Method boolean com.google.android.gms.common.api.Api$Client.providesSignIn()>
	//*  87  196:ifeq            151
			{
				i = 1;
	//   88  199:iconst_1        
	//   89  200:istore_1        
				flag = flag1;
	//   90  201:iload_3         
	//   91  202:istore_2        
			}
		} while(true);
	//   92  203:goto            151
		switch(zahc.intValue())
	//*  93  206:aload_0         
	//*  94  207:getfield        #100 <Field Integer zahc>
	//*  95  210:invokevirtual   #271 <Method int Integer.intValue()>
		{
	//*  96  213:tableswitch     1 3: default 240
	//	               1 349
	//	               2 243
	//	               3 379
	//*  97  240:goto            379
		case 2: // '\002'
			if(flag)
	//*  98  243:iload_2         
	//*  99  244:ifeq            379
				if(zacg)
	//* 100  247:aload_0         
	//* 101  248:getfield        #115 <Field boolean zacg>
	//* 102  251:ifeq            304
				{
					zags = ((zabs) (new zax(mContext, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb, this, true)));
	//  103  254:aload_0         
	//  104  255:new             #315 <Class zax>
	//  105  258:dup             
	//  106  259:aload_0         
	//  107  260:getfield        #111 <Field Context mContext>
	//  108  263:aload_0         
	//  109  264:getfield        #113 <Field Lock zaen>
	//  110  267:aload_0         
	//  111  268:getfield        #124 <Field Looper zabj>
	//  112  271:aload_0         
	//  113  272:getfield        #133 <Field GoogleApiAvailability zacc>
	//  114  275:aload_0         
	//  115  276:getfield        #145 <Field Map zagy>
	//  116  279:aload_0         
	//  117  280:getfield        #183 <Field ClientSettings zaes>
	//  118  283:aload_0         
	//  119  284:getfield        #143 <Field Map zaev>
	//  120  287:aload_0         
	//  121  288:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  122  291:aload_0         
	//  123  292:getfield        #147 <Field ArrayList zahb>
	//  124  295:aload_0         
	//  125  296:iconst_1        
	//  126  297:invokespecial   #318 <Method void zax(Context, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zaaw, boolean)>
	//  127  300:putfield        #67  <Field zabs zags>
					return;
	//  128  303:return          
				} else
				{
					zags = ((zabs) (zas.zaa(mContext, this, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb)));
	//  129  304:aload_0         
	//  130  305:aload_0         
	//  131  306:getfield        #111 <Field Context mContext>
	//  132  309:aload_0         
	//  133  310:aload_0         
	//  134  311:getfield        #113 <Field Lock zaen>
	//  135  314:aload_0         
	//  136  315:getfield        #124 <Field Looper zabj>
	//  137  318:aload_0         
	//  138  319:getfield        #133 <Field GoogleApiAvailability zacc>
	//  139  322:aload_0         
	//  140  323:getfield        #145 <Field Map zagy>
	//  141  326:aload_0         
	//  142  327:getfield        #183 <Field ClientSettings zaes>
	//  143  330:aload_0         
	//  144  331:getfield        #143 <Field Map zaev>
	//  145  334:aload_0         
	//  146  335:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  147  338:aload_0         
	//  148  339:getfield        #147 <Field ArrayList zahb>
	//  149  342:invokestatic    #323 <Method zas zas.zaa(Context, zaaw, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList)>
	//  150  345:putfield        #67  <Field zabs zags>
					return;
	//  151  348:return          
				}
			break;

		case 1: // '\001'
			if(!flag)
	//* 152  349:iload_2         
	//* 153  350:ifne            364
				throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
	//  154  353:new             #297 <Class IllegalStateException>
	//  155  356:dup             
	//  156  357:ldc2            #325 <String "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.">
	//  157  360:invokespecial   #304 <Method void IllegalStateException(String)>
	//  158  363:athrow          
			if(i != 0)
	//* 159  364:iload_1         
	//* 160  365:ifeq            379
				throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//  161  368:new             #297 <Class IllegalStateException>
	//  162  371:dup             
	//  163  372:ldc2            #327 <String "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//  164  375:invokespecial   #304 <Method void IllegalStateException(String)>
	//  165  378:athrow          
			break;
		}
		if(zacg && i == 0)
	//* 166  379:aload_0         
	//* 167  380:getfield        #115 <Field boolean zacg>
	//* 168  383:ifeq            440
	//* 169  386:iload_1         
	//* 170  387:ifne            440
		{
			zags = ((zabs) (new zax(mContext, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb, this, false)));
	//  171  390:aload_0         
	//  172  391:new             #315 <Class zax>
	//  173  394:dup             
	//  174  395:aload_0         
	//  175  396:getfield        #111 <Field Context mContext>
	//  176  399:aload_0         
	//  177  400:getfield        #113 <Field Lock zaen>
	//  178  403:aload_0         
	//  179  404:getfield        #124 <Field Looper zabj>
	//  180  407:aload_0         
	//  181  408:getfield        #133 <Field GoogleApiAvailability zacc>
	//  182  411:aload_0         
	//  183  412:getfield        #145 <Field Map zagy>
	//  184  415:aload_0         
	//  185  416:getfield        #183 <Field ClientSettings zaes>
	//  186  419:aload_0         
	//  187  420:getfield        #143 <Field Map zaev>
	//  188  423:aload_0         
	//  189  424:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  190  427:aload_0         
	//  191  428:getfield        #147 <Field ArrayList zahb>
	//  192  431:aload_0         
	//  193  432:iconst_0        
	//  194  433:invokespecial   #318 <Method void zax(Context, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zaaw, boolean)>
	//  195  436:putfield        #67  <Field zabs zags>
			return;
	//  196  439:return          
		} else
		{
			zags = ((zabs) (new zabe(mContext, this, zaen, zabj, ((GoogleApiAvailabilityLight) (zacc)), zagy, zaes, zaev, zacd, zahb, ((zabt) (this)))));
	//  197  440:aload_0         
	//  198  441:new             #329 <Class zabe>
	//  199  444:dup             
	//  200  445:aload_0         
	//  201  446:getfield        #111 <Field Context mContext>
	//  202  449:aload_0         
	//  203  450:aload_0         
	//  204  451:getfield        #113 <Field Lock zaen>
	//  205  454:aload_0         
	//  206  455:getfield        #124 <Field Looper zabj>
	//  207  458:aload_0         
	//  208  459:getfield        #133 <Field GoogleApiAvailability zacc>
	//  209  462:aload_0         
	//  210  463:getfield        #145 <Field Map zagy>
	//  211  466:aload_0         
	//  212  467:getfield        #183 <Field ClientSettings zaes>
	//  213  470:aload_0         
	//  214  471:getfield        #143 <Field Map zaev>
	//  215  474:aload_0         
	//  216  475:getfield        #185 <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//  217  478:aload_0         
	//  218  479:getfield        #147 <Field ArrayList zahb>
	//  219  482:aload_0         
	//  220  483:invokespecial   #332 <Method void zabe(Context, zaaw, Lock, Looper, GoogleApiAvailabilityLight, Map, ClientSettings, Map, com.google.android.gms.common.api.Api$AbstractClientBuilder, ArrayList, zabt)>
	//  221  486:putfield        #67  <Field zabs zags>
			return;
	//  222  489:return          
		}
	}

	private static String zaf(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 40
	//	               2 36
	//	               3 32
		default:
			return "UNKNOWN";
	//    2   28:ldc2            #334 <String "UNKNOWN">
	//    3   31:areturn         

		case 3: // '\003'
			return "SIGN_IN_MODE_NONE";
	//    4   32:ldc2            #336 <String "SIGN_IN_MODE_NONE">
	//    5   35:areturn         

		case 2: // '\002'
			return "SIGN_IN_MODE_OPTIONAL";
	//    6   36:ldc2            #338 <String "SIGN_IN_MODE_OPTIONAL">
	//    7   39:areturn         

		case 1: // '\001'
			return "SIGN_IN_MODE_REQUIRED";
	//    8   40:ldc2            #340 <String "SIGN_IN_MODE_REQUIRED">
	//    9   43:areturn         
		}
	}

	public final ConnectionResult blockingConnect()
	{
		boolean flag2;
		Looper looper = Looper.myLooper();
	//    0    0:invokestatic    #348 <Method Looper Looper.myLooper()>
	//    1    3:astore_3        
		Looper looper1 = Looper.getMainLooper();
	//    2    4:invokestatic    #351 <Method Looper Looper.getMainLooper()>
	//    3    7:astore          4
		flag2 = true;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		boolean flag;
		if(looper != looper1)
	//*   6   11:aload_3         
	//*   7   12:aload           4
	//*   8   14:if_acmpeq       22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		Preconditions.checkState(flag, "blockingConnect must not be called on the UI thread");
	//   14   24:iload_1         
	//   15   25:ldc2            #353 <String "blockingConnect must not be called on the UI thread">
	//   16   28:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		zaen.lock();
	//   17   31:aload_0         
	//   18   32:getfield        #113 <Field Lock zaen>
	//   19   35:invokeinterface #194 <Method void Lock.lock()>
		if(zaca < 0)
			break MISSING_BLOCK_LABEL_69;
	//   20   40:aload_0         
	//   21   41:getfield        #135 <Field int zaca>
	//   22   44:iflt            69
		boolean flag1;
		ConnectionResult connectionresult;
		Exception exception;
		if(zahc != null)
	//*  23   47:aload_0         
	//*  24   48:getfield        #100 <Field Integer zahc>
	//*  25   51:ifnull          172
			flag1 = flag2;
	//   26   54:iload_2         
	//   27   55:istore_1        
		else
	//*  28   56:goto            59
	//*  29   59:iload_1         
	//*  30   60:ldc2            #361 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//*  31   63:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
	//*  32   66:goto            121
	//*  33   69:aload_0         
	//*  34   70:getfield        #100 <Field Integer zahc>
	//*  35   73:ifnonnull       99
	//*  36   76:aload_0         
	//*  37   77:aload_0         
	//*  38   78:getfield        #145 <Field Map zagy>
	//*  39   81:invokeinterface #310 <Method Collection Map.values()>
	//*  40   86:iconst_0        
	//*  41   87:invokestatic    #363 <Method int zaa(Iterable, boolean)>
	//*  42   90:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//*  43   93:putfield        #100 <Field Integer zahc>
	//*  44   96:goto            121
	//*  45   99:aload_0         
	//*  46  100:getfield        #100 <Field Integer zahc>
	//*  47  103:invokevirtual   #271 <Method int Integer.intValue()>
	//*  48  106:iconst_2        
	//*  49  107:icmpne          121
	//*  50  110:new             #297 <Class IllegalStateException>
	//*  51  113:dup             
	//*  52  114:ldc2            #365 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//*  53  117:invokespecial   #304 <Method void IllegalStateException(String)>
	//*  54  120:athrow          
	//*  55  121:aload_0         
	//*  56  122:aload_0         
	//*  57  123:getfield        #100 <Field Integer zahc>
	//*  58  126:invokevirtual   #271 <Method int Integer.intValue()>
	//*  59  129:invokespecial   #367 <Method void zae(int)>
	//*  60  132:aload_0         
	//*  61  133:getfield        #122 <Field GmsClientEventManager zagr>
	//*  62  136:invokevirtual   #250 <Method void GmsClientEventManager.enableCallbacks()>
	//*  63  139:aload_0         
	//*  64  140:getfield        #67  <Field zabs zags>
	//*  65  143:invokeinterface #369 <Method ConnectionResult zabs.blockingConnect()>
	//*  66  148:astore_3        
	//*  67  149:aload_0         
	//*  68  150:getfield        #113 <Field Lock zaen>
	//*  69  153:invokeinterface #202 <Method void Lock.unlock()>
	//*  70  158:aload_3         
	//*  71  159:areturn         
	//*  72  160:astore_3        
	//*  73  161:aload_0         
	//*  74  162:getfield        #113 <Field Lock zaen>
	//*  75  165:invokeinterface #202 <Method void Lock.unlock()>
	//*  76  170:aload_3         
	//*  77  171:athrow          
			flag1 = false;
	//   78  172:iconst_0        
	//   79  173:istore_1        
		Preconditions.checkState(flag1, "Sign-in mode should have been set explicitly by auto-manage.");
		break MISSING_BLOCK_LABEL_121;
		if(zahc == null)
		{
			zahc = Integer.valueOf(zaa(((Iterable) (zagy.values())), false));
			break MISSING_BLOCK_LABEL_121;
		}
		if(zahc.intValue() == 2)
			throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
		zae(zahc.intValue());
		zagr.enableCallbacks();
		connectionresult = zags.blockingConnect();
		zaen.unlock();
		return connectionresult;
		exception;
		zaen.unlock();
		throw exception;
	//*  80  174:goto            59
	}

	public final ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		boolean flag;
		if(Looper.myLooper() != Looper.getMainLooper())
	//*   0    0:invokestatic    #348 <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #351 <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpeq       15
			flag = true;
	//    3    9:iconst_1        
	//    4   10:istore          4
		else
	//*   5   12:goto            18
			flag = false;
	//    6   15:iconst_0        
	//    7   16:istore          4
		Preconditions.checkState(flag, "blockingConnect must not be called on the UI thread");
	//    8   18:iload           4
	//    9   20:ldc2            #353 <String "blockingConnect must not be called on the UI thread">
	//   10   23:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		Preconditions.checkNotNull(((Object) (timeunit)), "TimeUnit must not be null");
	//   11   26:aload_3         
	//   12   27:ldc2            #372 <String "TimeUnit must not be null">
	//   13   30:invokestatic    #376 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   14   33:pop             
		zaen.lock();
	//   15   34:aload_0         
	//   16   35:getfield        #113 <Field Lock zaen>
	//   17   38:invokeinterface #194 <Method void Lock.lock()>
		if(zahc == null)
	//*  18   43:aload_0         
	//*  19   44:getfield        #100 <Field Integer zahc>
	//*  20   47:ifnonnull       73
		{
			zahc = Integer.valueOf(zaa(((Iterable) (zagy.values())), false));
	//   21   50:aload_0         
	//   22   51:aload_0         
	//   23   52:getfield        #145 <Field Map zagy>
	//   24   55:invokeinterface #310 <Method Collection Map.values()>
	//   25   60:iconst_0        
	//   26   61:invokestatic    #363 <Method int zaa(Iterable, boolean)>
	//   27   64:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//   28   67:putfield        #100 <Field Integer zahc>
			break MISSING_BLOCK_LABEL_95;
	//   29   70:goto            95
		}
		if(zahc.intValue() == 2)
	//*  30   73:aload_0         
	//*  31   74:getfield        #100 <Field Integer zahc>
	//*  32   77:invokevirtual   #271 <Method int Integer.intValue()>
	//*  33   80:iconst_2        
	//*  34   81:icmpne          95
			throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   35   84:new             #297 <Class IllegalStateException>
	//   36   87:dup             
	//   37   88:ldc2            #365 <String "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   38   91:invokespecial   #304 <Method void IllegalStateException(String)>
	//   39   94:athrow          
		zae(zahc.intValue());
	//   40   95:aload_0         
	//   41   96:aload_0         
	//   42   97:getfield        #100 <Field Integer zahc>
	//   43  100:invokevirtual   #271 <Method int Integer.intValue()>
	//   44  103:invokespecial   #367 <Method void zae(int)>
		zagr.enableCallbacks();
	//   45  106:aload_0         
	//   46  107:getfield        #122 <Field GmsClientEventManager zagr>
	//   47  110:invokevirtual   #250 <Method void GmsClientEventManager.enableCallbacks()>
		timeunit = ((TimeUnit) (zags.blockingConnect(l, timeunit)));
	//   48  113:aload_0         
	//   49  114:getfield        #67  <Field zabs zags>
	//   50  117:lload_1         
	//   51  118:aload_3         
	//   52  119:invokeinterface #378 <Method ConnectionResult zabs.blockingConnect(long, TimeUnit)>
	//   53  124:astore_3        
		zaen.unlock();
	//   54  125:aload_0         
	//   55  126:getfield        #113 <Field Lock zaen>
	//   56  129:invokeinterface #202 <Method void Lock.unlock()>
		return ((ConnectionResult) (timeunit));
	//   57  134:aload_3         
	//   58  135:areturn         
		timeunit;
	//   59  136:astore_3        
		zaen.unlock();
	//   60  137:aload_0         
	//   61  138:getfield        #113 <Field Lock zaen>
	//   62  141:invokeinterface #202 <Method void Lock.unlock()>
		throw timeunit;
	//   63  146:aload_3         
	//   64  147:athrow          
	}

	public final PendingResult clearDefaultAccountAndReconnect()
	{
		Preconditions.checkState(((GoogleApiClient)this).isConnected(), "GoogleApiClient is not connected yet.");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #383 <Method boolean GoogleApiClient.isConnected()>
	//    2    4:ldc2            #385 <String "GoogleApiClient is not connected yet.">
	//    3    7:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		boolean flag;
		if(zahc.intValue() != 2)
	//*   4   10:aload_0         
	//*   5   11:getfield        #100 <Field Integer zahc>
	//*   6   14:invokevirtual   #271 <Method int Integer.intValue()>
	//*   7   17:iconst_2        
	//*   8   18:icmpeq          26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		Preconditions.checkState(flag, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
	//   14   28:iload_1         
	//   15   29:ldc2            #387 <String "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API">
	//   16   32:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		StatusPendingResult statuspendingresult = new StatusPendingResult(((GoogleApiClient) (this)));
	//   17   35:new             #389 <Class StatusPendingResult>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #392 <Method void StatusPendingResult(GoogleApiClient)>
	//   21   43:astore_2        
		if(zagy.containsKey(((Object) (Common.CLIENT_KEY))))
	//*  22   44:aload_0         
	//*  23   45:getfield        #145 <Field Map zagy>
	//*  24   48:getstatic       #396 <Field com.google.android.gms.common.api.Api$ClientKey Common.CLIENT_KEY>
	//*  25   51:invokeinterface #400 <Method boolean Map.containsKey(Object)>
	//*  26   56:ifeq            68
		{
			zaa(((GoogleApiClient) (this)), statuspendingresult, false);
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:iconst_0        
	//   31   63:invokespecial   #244 <Method void zaa(GoogleApiClient, StatusPendingResult, boolean)>
			return ((PendingResult) (statuspendingresult));
	//   32   66:aload_2         
	//   33   67:areturn         
		} else
		{
			AtomicReference atomicreference = new AtomicReference();
	//   34   68:new             #402 <Class AtomicReference>
	//   35   71:dup             
	//   36   72:invokespecial   #403 <Method void AtomicReference()>
	//   37   75:astore_3        
			Object obj = ((Object) (new zaay(this, atomicreference, statuspendingresult)));
	//   38   76:new             #405 <Class zaay>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:aload_3         
	//   42   82:aload_2         
	//   43   83:invokespecial   #408 <Method void zaay(zaaw, AtomicReference, StatusPendingResult)>
	//   44   86:astore          4
			zaaz zaaz1 = new zaaz(this, statuspendingresult);
	//   45   88:new             #410 <Class zaaz>
	//   46   91:dup             
	//   47   92:aload_0         
	//   48   93:aload_2         
	//   49   94:invokespecial   #413 <Method void zaaz(zaaw, StatusPendingResult)>
	//   50   97:astore          5
			obj = ((Object) ((new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(Common.API).addConnectionCallbacks(((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (obj))).addOnConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zaaz1))).setHandler(((android.os.Handler) (zagw))).build()));
	//   51   99:new             #415 <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//   52  102:dup             
	//   53  103:aload_0         
	//   54  104:getfield        #111 <Field Context mContext>
	//   55  107:invokespecial   #418 <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(Context)>
	//   56  110:getstatic       #422 <Field Api Common.API>
	//   57  113:invokevirtual   #426 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addApi(Api)>
	//   58  116:aload           4
	//   59  118:invokevirtual   #430 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//   60  121:aload           5
	//   61  123:invokevirtual   #434 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   62  126:aload_0         
	//   63  127:getfield        #131 <Field zabb zagw>
	//   64  130:invokevirtual   #438 <Method com.google.android.gms.common.api.GoogleApiClient$Builder com.google.android.gms.common.api.GoogleApiClient$Builder.setHandler(android.os.Handler)>
	//   65  133:invokevirtual   #442 <Method GoogleApiClient com.google.android.gms.common.api.GoogleApiClient$Builder.build()>
	//   66  136:astore          4
			atomicreference.set(obj);
	//   67  138:aload_3         
	//   68  139:aload           4
	//   69  141:invokevirtual   #446 <Method void AtomicReference.set(Object)>
			((GoogleApiClient) (obj)).connect();
	//   70  144:aload           4
	//   71  146:invokevirtual   #447 <Method void GoogleApiClient.connect()>
			return ((PendingResult) (statuspendingresult));
	//   72  149:aload_2         
	//   73  150:areturn         
		}
	}

	public final void connect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		int i = zaca;
	//    3    9:aload_0         
	//    4   10:getfield        #135 <Field int zaca>
	//    5   13:istore_1        
		boolean flag;
		flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		if(i < 0)
			break MISSING_BLOCK_LABEL_39;
	//    8   16:iload_1         
	//    9   17:iflt            39
		if(zahc != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #100 <Field Integer zahc>
	//*  12   24:ifnull          29
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_2        
		Preconditions.checkState(flag, "Sign-in mode should have been set explicitly by auto-manage.");
	//   15   29:iload_2         
	//   16   30:ldc2            #361 <String "Sign-in mode should have been set explicitly by auto-manage.">
	//   17   33:invokestatic    #359 <Method void Preconditions.checkState(boolean, Object)>
		break MISSING_BLOCK_LABEL_91;
	//   18   36:goto            91
		if(zahc == null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #100 <Field Integer zahc>
	//*  21   43:ifnonnull       69
		{
			zahc = Integer.valueOf(zaa(((Iterable) (zagy.values())), false));
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #145 <Field Map zagy>
	//   25   51:invokeinterface #310 <Method Collection Map.values()>
	//   26   56:iconst_0        
	//   27   57:invokestatic    #363 <Method int zaa(Iterable, boolean)>
	//   28   60:invokestatic    #141 <Method Integer Integer.valueOf(int)>
	//   29   63:putfield        #100 <Field Integer zahc>
			break MISSING_BLOCK_LABEL_91;
	//   30   66:goto            91
		}
		if(zahc.intValue() == 2)
	//*  31   69:aload_0         
	//*  32   70:getfield        #100 <Field Integer zahc>
	//*  33   73:invokevirtual   #271 <Method int Integer.intValue()>
	//*  34   76:iconst_2        
	//*  35   77:icmpne          91
			throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
	//   36   80:new             #297 <Class IllegalStateException>
	//   37   83:dup             
	//   38   84:ldc2            #450 <String "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.">
	//   39   87:invokespecial   #304 <Method void IllegalStateException(String)>
	//   40   90:athrow          
		((GoogleApiClient)this).connect(zahc.intValue());
	//   41   91:aload_0         
	//   42   92:aload_0         
	//   43   93:getfield        #100 <Field Integer zahc>
	//   44   96:invokevirtual   #271 <Method int Integer.intValue()>
	//   45   99:invokevirtual   #452 <Method void GoogleApiClient.connect(int)>
		zaen.unlock();
	//   46  102:aload_0         
	//   47  103:getfield        #113 <Field Lock zaen>
	//   48  106:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   49  111:return          
		Exception exception;
		exception;
	//   50  112:astore_3        
		zaen.unlock();
	//   51  113:aload_0         
	//   52  114:getfield        #113 <Field Lock zaen>
	//   53  117:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   54  122:aload_3         
	//   55  123:athrow          
	}

	public final void connect(int i)
	{
		boolean flag;
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		boolean flag1 = true;
	//    3    9:iconst_1        
	//    4   10:istore_3        
		flag = flag1;
	//    5   11:iload_3         
	//    6   12:istore_2        
		if(i != 3)
	//*   7   13:iload_1         
	//*   8   14:iconst_3        
	//*   9   15:icmpeq          37
		{
			flag = flag1;
	//   10   18:iload_3         
	//   11   19:istore_2        
			if(i != 1)
	//*  12   20:iload_1         
	//*  13   21:iconst_1        
	//*  14   22:icmpeq          37
				if(i == 2)
	//*  15   25:iload_1         
	//*  16   26:iconst_2        
	//*  17   27:icmpne          35
					flag = flag1;
	//   18   30:iload_3         
	//   19   31:istore_2        
				else
	//*  20   32:goto            37
					flag = false;
	//   21   35:iconst_0        
	//   22   36:istore_2        
		}
		StringBuilder stringbuilder = new StringBuilder(33);
	//   23   37:new             #277 <Class StringBuilder>
	//   24   40:dup             
	//   25   41:bipush          33
	//   26   43:invokespecial   #287 <Method void StringBuilder(int)>
	//   27   46:astore          4
		stringbuilder.append("Illegal sign-in mode: ");
	//   28   48:aload           4
	//   29   50:ldc2            #454 <String "Illegal sign-in mode: ">
	//   30   53:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
		stringbuilder.append(i);
	//   32   57:aload           4
	//   33   59:iload_1         
	//   34   60:invokevirtual   #457 <Method StringBuilder StringBuilder.append(int)>
	//   35   63:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   36   64:iload_2         
	//   37   65:aload           4
	//   38   67:invokevirtual   #301 <Method String StringBuilder.toString()>
	//   39   70:invokestatic    #460 <Method void Preconditions.checkArgument(boolean, Object)>
		zae(i);
	//   40   73:aload_0         
	//   41   74:iload_1         
	//   42   75:invokespecial   #367 <Method void zae(int)>
		zaau();
	//   43   78:aload_0         
	//   44   79:invokespecial   #199 <Method void zaau()>
		zaen.unlock();
	//   45   82:aload_0         
	//   46   83:getfield        #113 <Field Lock zaen>
	//   47   86:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   48   91:return          
		Exception exception;
		exception;
	//   49   92:astore          4
		zaen.unlock();
	//   50   94:aload_0         
	//   51   95:getfield        #113 <Field Lock zaen>
	//   52   98:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   53  103:aload           4
	//   54  105:athrow          
	}

	public final void disconnect()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		zahe.release();
	//    3    9:aload_0         
	//    4   10:getfield        #154 <Field zacp zahe>
	//    5   13:invokevirtual   #464 <Method void zacp.release()>
		if(zags != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #67  <Field zabs zags>
	//*   8   20:ifnull          32
			zags.disconnect();
	//    9   23:aload_0         
	//   10   24:getfield        #67  <Field zabs zags>
	//   11   27:invokeinterface #466 <Method void zabs.disconnect()>
		zaha.release();
	//   12   32:aload_0         
	//   13   33:getfield        #98  <Field ListenerHolders zaha>
	//   14   36:invokevirtual   #467 <Method void ListenerHolders.release()>
		BaseImplementation.ApiMethodImpl apimethodimpl;
		for(Iterator iterator = zafb.iterator(); iterator.hasNext(); ((PendingResult) (apimethodimpl)).cancel())
	//*  15   39:aload_0         
	//*  16   40:getfield        #72  <Field Queue zafb>
	//*  17   43:invokeinterface #470 <Method Iterator Queue.iterator()>
	//*  18   48:astore_1        
	//*  19   49:aload_1         
	//*  20   50:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//*  21   55:ifeq            80
		{
			apimethodimpl = (BaseImplementation.ApiMethodImpl)iterator.next();
	//   22   58:aload_1         
	//   23   59:invokeinterface #169 <Method Object Iterator.next()>
	//   24   64:checkcast       #472 <Class BaseImplementation$ApiMethodImpl>
	//   25   67:astore_2        
			((BasePendingResult) (apimethodimpl)).zaa(((zacs) (null)));
	//   26   68:aload_2         
	//   27   69:aconst_null     
	//   28   70:invokevirtual   #477 <Method void BasePendingResult.zaa(zacs)>
		}

	//   29   73:aload_2         
	//   30   74:invokevirtual   #480 <Method void PendingResult.cancel()>
	//*  31   77:goto            49
		zabs zabs1;
		zafb.clear();
	//   32   80:aload_0         
	//   33   81:getfield        #72  <Field Queue zafb>
	//   34   84:invokeinterface #483 <Method void Queue.clear()>
		zabs1 = zags;
	//   35   89:aload_0         
	//   36   90:getfield        #67  <Field zabs zags>
	//   37   93:astore_1        
		if(zabs1 != null) goto _L2; else goto _L1
	//   38   94:aload_1         
	//   39   95:ifnonnull       108
_L1:
		zaen.unlock();
	//   40   98:aload_0         
	//   41   99:getfield        #113 <Field Lock zaen>
	//   42  102:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   43  107:return          
_L2:
		zaaw();
	//   44  108:aload_0         
	//   45  109:invokevirtual   #260 <Method boolean zaaw()>
	//   46  112:pop             
		zagr.disableCallbacks();
	//   47  113:aload_0         
	//   48  114:getfield        #122 <Field GmsClientEventManager zagr>
	//   49  117:invokevirtual   #486 <Method void GmsClientEventManager.disableCallbacks()>
		if(true) goto _L1; else goto _L3
	//   50  120:goto            98
_L3:
		Exception exception;
		exception;
	//   51  123:astore_1        
		zaen.unlock();
	//   52  124:aload_0         
	//   53  125:getfield        #113 <Field Lock zaen>
	//   54  128:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   55  133:aload_1         
	//   56  134:athrow          
	}

	public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.append(((CharSequence) (s))).append("mContext=").println(((Object) (mContext)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    5:ldc2            #495 <String "mContext=">
	//    4    8:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    5   11:aload_0         
	//    6   12:getfield        #111 <Field Context mContext>
	//    7   15:invokevirtual   #498 <Method void PrintWriter.println(Object)>
		printwriter.append(((CharSequence) (s))).append("mResuming=").print(zagt);
	//    8   18:aload_3         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   11   23:ldc2            #500 <String "mResuming=">
	//   12   26:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   13   29:aload_0         
	//   14   30:getfield        #196 <Field boolean zagt>
	//   15   33:invokevirtual   #504 <Method void PrintWriter.print(boolean)>
		printwriter.append(" mWorkQueue.size()=").print(zafb.size());
	//   16   36:aload_3         
	//   17   37:ldc2            #506 <String " mWorkQueue.size()=">
	//   18   40:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   19   43:aload_0         
	//   20   44:getfield        #72  <Field Queue zafb>
	//   21   47:invokeinterface #509 <Method int Queue.size()>
	//   22   52:invokevirtual   #511 <Method void PrintWriter.print(int)>
		zacp zacp1 = zahe;
	//   23   55:aload_0         
	//   24   56:getfield        #154 <Field zacp zahe>
	//   25   59:astore          5
		printwriter.append(" mUnconsumedApiCalls.size()=").println(zacp1.zaky.size());
	//   26   61:aload_3         
	//   27   62:ldc2            #513 <String " mUnconsumedApiCalls.size()=">
	//   28   65:invokevirtual   #493 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   29   68:aload           5
	//   30   70:getfield        #516 <Field Set zacp.zaky>
	//   31   73:invokeinterface #519 <Method int Set.size()>
	//   32   78:invokevirtual   #521 <Method void PrintWriter.println(int)>
		if(zags != null)
	//*  33   81:aload_0         
	//*  34   82:getfield        #67  <Field zabs zags>
	//*  35   85:ifnull          102
			zags.dump(s, filedescriptor, printwriter, as);
	//   36   88:aload_0         
	//   37   89:getfield        #67  <Field zabs zags>
	//   38   92:aload_1         
	//   39   93:aload_2         
	//   40   94:aload_3         
	//   41   95:aload           4
	//   42   97:invokeinterface #523 <Method void zabs.dump(String, FileDescriptor, PrintWriter, String[])>
	//   43  102:return          
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		boolean flag;
		if(apimethodimpl.getClientKey() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #529 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Preconditions.checkArgument(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
	//    8   14:iload_2         
	//    9   15:ldc2            #531 <String "This task can not be enqueued (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #460 <Method void Preconditions.checkArgument(boolean, Object)>
		flag = zagy.containsKey(((Object) (apimethodimpl.getClientKey())));
	//   11   21:aload_0         
	//   12   22:getfield        #145 <Field Map zagy>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #529 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   15   29:invokeinterface #400 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(apimethodimpl.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #535 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//*  19   39:ifnull          53
			s = apimethodimpl.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #535 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//   22   46:invokevirtual   #540 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #542 <String "the API">
	//   26   56:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   27   57:new             #277 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_3         
	//   30   62:invokestatic    #282 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #285 <Method int String.length()>
	//   32   68:bipush          65
	//   33   70:iadd            
	//   34   71:invokespecial   #287 <Method void StringBuilder(int)>
	//   35   74:astore          4
		stringbuilder.append("GoogleApiClient is not configured to use ");
	//   36   76:aload           4
	//   37   78:ldc2            #544 <String "GoogleApiClient is not configured to use ">
	//   38   81:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
		stringbuilder.append(s);
	//   40   85:aload           4
	//   41   87:aload_3         
	//   42   88:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		stringbuilder.append(" required for this call.");
	//   44   92:aload           4
	//   45   94:ldc2            #546 <String " required for this call.">
	//   46   97:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   48  101:iload_2         
	//   49  102:aload           4
	//   50  104:invokevirtual   #301 <Method String StringBuilder.toString()>
	//   51  107:invokestatic    #460 <Method void Preconditions.checkArgument(boolean, Object)>
		zaen.lock();
	//   52  110:aload_0         
	//   53  111:getfield        #113 <Field Lock zaen>
	//   54  114:invokeinterface #194 <Method void Lock.lock()>
		if(zags != null) goto _L2; else goto _L1
	//   55  119:aload_0         
	//   56  120:getfield        #67  <Field zabs zags>
	//   57  123:ifnonnull       148
_L1:
		zafb.add(((Object) (apimethodimpl)));
	//   58  126:aload_0         
	//   59  127:getfield        #72  <Field Queue zafb>
	//   60  130:aload_1         
	//   61  131:invokeinterface #549 <Method boolean Queue.add(Object)>
	//   62  136:pop             
_L4:
		zaen.unlock();
	//   63  137:aload_0         
	//   64  138:getfield        #113 <Field Lock zaen>
	//   65  141:invokeinterface #202 <Method void Lock.unlock()>
		return apimethodimpl;
	//   66  146:aload_1         
	//   67  147:areturn         
_L2:
		apimethodimpl = zags.enqueue(apimethodimpl);
	//   68  148:aload_0         
	//   69  149:getfield        #67  <Field zabs zags>
	//   70  152:aload_1         
	//   71  153:invokeinterface #551 <Method BaseImplementation$ApiMethodImpl zabs.enqueue(BaseImplementation$ApiMethodImpl)>
	//   72  158:astore_1        
		if(true) goto _L4; else goto _L3
	//   73  159:goto            137
_L3:
		apimethodimpl;
	//   74  162:astore_1        
		zaen.unlock();
	//   75  163:aload_0         
	//   76  164:getfield        #113 <Field Lock zaen>
	//   77  167:invokeinterface #202 <Method void Lock.unlock()>
		throw apimethodimpl;
	//   78  172:aload_1         
	//   79  173:athrow          
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		boolean flag;
		if(apimethodimpl.getClientKey() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #529 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Preconditions.checkArgument(flag, "This task can not be executed (it's probably a Batch or malformed)");
	//    8   14:iload_2         
	//    9   15:ldc2            #555 <String "This task can not be executed (it's probably a Batch or malformed)">
	//   10   18:invokestatic    #460 <Method void Preconditions.checkArgument(boolean, Object)>
		flag = zagy.containsKey(((Object) (apimethodimpl.getClientKey())));
	//   11   21:aload_0         
	//   12   22:getfield        #145 <Field Map zagy>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #529 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   15   29:invokeinterface #400 <Method boolean Map.containsKey(Object)>
	//   16   34:istore_2        
		String s;
		if(apimethodimpl.getApi() != null)
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #535 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//*  19   39:ifnull          53
			s = apimethodimpl.getApi().getName();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #535 <Method Api BaseImplementation$ApiMethodImpl.getApi()>
	//   22   46:invokevirtual   #540 <Method String Api.getName()>
	//   23   49:astore_3        
		else
	//*  24   50:goto            57
			s = "the API";
	//   25   53:ldc2            #542 <String "the API">
	//   26   56:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 65);
	//   27   57:new             #277 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_3         
	//   30   62:invokestatic    #282 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #285 <Method int String.length()>
	//   32   68:bipush          65
	//   33   70:iadd            
	//   34   71:invokespecial   #287 <Method void StringBuilder(int)>
	//   35   74:astore          4
		stringbuilder.append("GoogleApiClient is not configured to use ");
	//   36   76:aload           4
	//   37   78:ldc2            #544 <String "GoogleApiClient is not configured to use ">
	//   38   81:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
		stringbuilder.append(s);
	//   40   85:aload           4
	//   41   87:aload_3         
	//   42   88:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		stringbuilder.append(" required for this call.");
	//   44   92:aload           4
	//   45   94:ldc2            #546 <String " required for this call.">
	//   46   97:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   48  101:iload_2         
	//   49  102:aload           4
	//   50  104:invokevirtual   #301 <Method String StringBuilder.toString()>
	//   51  107:invokestatic    #460 <Method void Preconditions.checkArgument(boolean, Object)>
		zaen.lock();
	//   52  110:aload_0         
	//   53  111:getfield        #113 <Field Lock zaen>
	//   54  114:invokeinterface #194 <Method void Lock.lock()>
		if(zags == null)
	//*  55  119:aload_0         
	//*  56  120:getfield        #67  <Field zabs zags>
	//*  57  123:ifnonnull       137
			throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//   58  126:new             #297 <Class IllegalStateException>
	//   59  129:dup             
	//   60  130:ldc2            #385 <String "GoogleApiClient is not connected yet.">
	//   61  133:invokespecial   #304 <Method void IllegalStateException(String)>
	//   62  136:athrow          
		if(!zagt) goto _L2; else goto _L1
	//   63  137:aload_0         
	//   64  138:getfield        #196 <Field boolean zagt>
	//   65  141:ifeq            211
_L1:
		zafb.add(((Object) (apimethodimpl)));
	//   66  144:aload_0         
	//   67  145:getfield        #72  <Field Queue zafb>
	//   68  148:aload_1         
	//   69  149:invokeinterface #549 <Method boolean Queue.add(Object)>
	//   70  154:pop             
_L4:
		BaseImplementation.ApiMethodImpl apimethodimpl1 = apimethodimpl;
	//   71  155:aload_1         
	//   72  156:astore_3        
		if(zafb.isEmpty())
			break; /* Loop/switch isn't completed */
	//   73  157:aload_0         
	//   74  158:getfield        #72  <Field Queue zafb>
	//   75  161:invokeinterface #558 <Method boolean Queue.isEmpty()>
	//   76  166:ifne            200
		apimethodimpl1 = (BaseImplementation.ApiMethodImpl)zafb.remove();
	//   77  169:aload_0         
	//   78  170:getfield        #72  <Field Queue zafb>
	//   79  173:invokeinterface #561 <Method Object Queue.remove()>
	//   80  178:checkcast       #472 <Class BaseImplementation$ApiMethodImpl>
	//   81  181:astore_3        
		zahe.zab(((BasePendingResult) (apimethodimpl1)));
	//   82  182:aload_0         
	//   83  183:getfield        #154 <Field zacp zahe>
	//   84  186:aload_3         
	//   85  187:invokevirtual   #564 <Method void zacp.zab(BasePendingResult)>
		apimethodimpl1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
	//   86  190:aload_3         
	//   87  191:getstatic       #570 <Field Status Status.RESULT_INTERNAL_ERROR>
	//   88  194:invokevirtual   #574 <Method void BaseImplementation$ApiMethodImpl.setFailedResult(Status)>
		if(true) goto _L4; else goto _L3
	//   89  197:goto            155
_L3:
		zaen.unlock();
	//   90  200:aload_0         
	//   91  201:getfield        #113 <Field Lock zaen>
	//   92  204:invokeinterface #202 <Method void Lock.unlock()>
		return apimethodimpl1;
	//   93  209:aload_3         
	//   94  210:areturn         
_L2:
		apimethodimpl1 = zags.execute(apimethodimpl);
	//   95  211:aload_0         
	//   96  212:getfield        #67  <Field zabs zags>
	//   97  215:aload_1         
	//   98  216:invokeinterface #576 <Method BaseImplementation$ApiMethodImpl zabs.execute(BaseImplementation$ApiMethodImpl)>
	//   99  221:astore_3        
		if(true) goto _L3; else goto _L5
	//  100  222:goto            200
_L5:
		apimethodimpl;
	//  101  225:astore_1        
		zaen.unlock();
	//  102  226:aload_0         
	//  103  227:getfield        #113 <Field Lock zaen>
	//  104  230:invokeinterface #202 <Method void Lock.unlock()>
		throw apimethodimpl;
	//  105  235:aload_1         
	//  106  236:athrow          
	}

	public final com.google.android.gms.common.api.Api.Client getClient(com.google.android.gms.common.api.Api.AnyClientKey anyclientkey)
	{
		anyclientkey = ((com.google.android.gms.common.api.Api.AnyClientKey) ((com.google.android.gms.common.api.Api.Client)zagy.get(((Object) (anyclientkey)))));
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Map zagy>
	//    2    4:aload_1         
	//    3    5:invokeinterface #583 <Method Object Map.get(Object)>
	//    4   10:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//    5   13:astore_1        
		Preconditions.checkNotNull(((Object) (anyclientkey)), "Appropriate Api was not requested.");
	//    6   14:aload_1         
	//    7   15:ldc2            #585 <String "Appropriate Api was not requested.">
	//    8   18:invokestatic    #376 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   21:pop             
		return ((com.google.android.gms.common.api.Api.Client) (anyclientkey));
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		ConnectionResult connectionresult;
		if(!((GoogleApiClient)this).isConnected() && !zagt)
	//*   3    9:aload_0         
	//*   4   10:invokevirtual   #383 <Method boolean GoogleApiClient.isConnected()>
	//*   5   13:ifne            34
	//*   6   16:aload_0         
	//*   7   17:getfield        #196 <Field boolean zagt>
	//*   8   20:ifne            34
			throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
	//    9   23:new             #297 <Class IllegalStateException>
	//   10   26:dup             
	//   11   27:ldc2            #590 <String "Cannot invoke getConnectionResult unless GoogleApiClient is connected">
	//   12   30:invokespecial   #304 <Method void IllegalStateException(String)>
	//   13   33:athrow          
		if(!zagy.containsKey(((Object) (api.getClientKey()))))
			break MISSING_BLOCK_LABEL_150;
	//   14   34:aload_0         
	//   15   35:getfield        #145 <Field Map zagy>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #591 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   18   42:invokeinterface #400 <Method boolean Map.containsKey(Object)>
	//   19   47:ifeq            150
		connectionresult = zags.getConnectionResult(api);
	//   20   50:aload_0         
	//   21   51:getfield        #67  <Field zabs zags>
	//   22   54:aload_1         
	//   23   55:invokeinterface #593 <Method ConnectionResult zabs.getConnectionResult(Api)>
	//   24   60:astore_2        
		if(connectionresult != null) goto _L2; else goto _L1
	//   25   61:aload_2         
	//   26   62:ifnonnull       139
_L1:
		if(!zagt) goto _L4; else goto _L3
	//   27   65:aload_0         
	//   28   66:getfield        #196 <Field boolean zagt>
	//   29   69:ifeq            87
_L3:
		api = ((Api) (ConnectionResult.RESULT_SUCCESS));
	//   30   72:getstatic       #599 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   31   75:astore_1        
_L5:
		zaen.unlock();
	//   32   76:aload_0         
	//   33   77:getfield        #113 <Field Lock zaen>
	//   34   80:invokeinterface #202 <Method void Lock.unlock()>
		return ((ConnectionResult) (api));
	//   35   85:aload_1         
	//   36   86:areturn         
_L4:
		Log.w("GoogleApiClientImpl", zaay());
	//   37   87:ldc2            #601 <String "GoogleApiClientImpl">
	//   38   90:aload_0         
	//   39   91:invokevirtual   #604 <Method String zaay()>
	//   40   94:invokestatic    #610 <Method int Log.w(String, String)>
	//   41   97:pop             
		Log.wtf("GoogleApiClientImpl", String.valueOf(((Object) (api.getName()))).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), ((Throwable) (new Exception())));
	//   42   98:ldc2            #601 <String "GoogleApiClientImpl">
	//   43  101:aload_1         
	//   44  102:invokevirtual   #540 <Method String Api.getName()>
	//   45  105:invokestatic    #282 <Method String String.valueOf(Object)>
	//   46  108:ldc2            #612 <String " requested in getConnectionResult is not connected but is not present in the failed  connections map">
	//   47  111:invokevirtual   #616 <Method String String.concat(String)>
	//   48  114:new             #618 <Class Exception>
	//   49  117:dup             
	//   50  118:invokespecial   #619 <Method void Exception()>
	//   51  121:invokestatic    #623 <Method int Log.wtf(String, String, Throwable)>
	//   52  124:pop             
		api = ((Api) (new ConnectionResult(8, ((android.app.PendingIntent) (null)))));
	//   53  125:new             #595 <Class ConnectionResult>
	//   54  128:dup             
	//   55  129:bipush          8
	//   56  131:aconst_null     
	//   57  132:invokespecial   #626 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   58  135:astore_1        
		if(true) goto _L5; else goto _L2
	//   59  136:goto            76
_L2:
		zaen.unlock();
	//   60  139:aload_0         
	//   61  140:getfield        #113 <Field Lock zaen>
	//   62  143:invokeinterface #202 <Method void Lock.unlock()>
		return connectionresult;
	//   63  148:aload_2         
	//   64  149:areturn         
		throw new IllegalArgumentException(String.valueOf(((Object) (api.getName()))).concat(" was never registered with GoogleApiClient"));
	//   65  150:new             #628 <Class IllegalArgumentException>
	//   66  153:dup             
	//   67  154:aload_1         
	//   68  155:invokevirtual   #540 <Method String Api.getName()>
	//   69  158:invokestatic    #282 <Method String String.valueOf(Object)>
	//   70  161:ldc2            #630 <String " was never registered with GoogleApiClient">
	//   71  164:invokevirtual   #616 <Method String String.concat(String)>
	//   72  167:invokespecial   #631 <Method void IllegalArgumentException(String)>
	//   73  170:athrow          
		api;
	//   74  171:astore_1        
		zaen.unlock();
	//   75  172:aload_0         
	//   76  173:getfield        #113 <Field Lock zaen>
	//   77  176:invokeinterface #202 <Method void Lock.unlock()>
		throw api;
	//   78  181:aload_1         
	//   79  182:athrow          
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Context mContext>
	//    2    4:areturn         
	}

	public final Looper getLooper()
	{
		return zabj;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Looper zabj>
	//    2    4:areturn         
	}

	public final boolean hasApi(Api api)
	{
		return zagy.containsKey(((Object) (api.getClientKey())));
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Map zagy>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #591 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    4    8:invokeinterface #400 <Method boolean Map.containsKey(Object)>
	//    5   13:ireturn         
	}

	public final boolean hasConnectedApi(Api api)
	{
		if(!((GoogleApiClient)this).isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #383 <Method boolean GoogleApiClient.isConnected()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		api = ((Api) ((com.google.android.gms.common.api.Api.Client)zagy.get(((Object) (api.getClientKey())))));
	//    5    9:aload_0         
	//    6   10:getfield        #145 <Field Map zagy>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #591 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    9   17:invokeinterface #583 <Method Object Map.get(Object)>
	//   10   22:checkcast       #209 <Class com.google.android.gms.common.api.Api$Client>
	//   11   25:astore_1        
		return api != null && ((com.google.android.gms.common.api.Api.Client) (api)).isConnected();
	//   12   26:aload_1         
	//   13   27:ifnull          41
	//   14   30:aload_1         
	//   15   31:invokeinterface #640 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//   16   36:ifeq            41
	//   17   39:iconst_1        
	//   18   40:ireturn         
	//   19   41:iconst_0        
	//   20   42:ireturn         
	}

	public final boolean isConnected()
	{
		return zags != null && zags.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zabs zags>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field zabs zags>
	//    5   11:invokeinterface #641 <Method boolean zabs.isConnected()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public final boolean isConnecting()
	{
		return zags != null && zags.isConnecting();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zabs zags>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field zabs zags>
	//    5   11:invokeinterface #644 <Method boolean zabs.isConnecting()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		return zagr.isConnectionCallbacksRegistered(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #648 <Method boolean GmsClientEventManager.isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:ireturn         
	}

	public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return zagr.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #652 <Method boolean GmsClientEventManager.isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:ireturn         
	}

	public final boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		return zags != null && zags.maybeSignIn(signinconnectionlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field zabs zags>
	//    2    4:ifnull          22
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field zabs zags>
	//    5   11:aload_1         
	//    6   12:invokeinterface #656 <Method boolean zabs.maybeSignIn(SignInConnectionListener)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public final void maybeSignOut()
	{
		if(zags != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field zabs zags>
	//*   2    4:ifnull          16
			zags.maybeSignOut();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field zabs zags>
	//    5   11:invokeinterface #659 <Method void zabs.maybeSignOut()>
	//    6   16:return          
	}

	public final void reconnect()
	{
		((GoogleApiClient)this).disconnect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #661 <Method void GoogleApiClient.disconnect()>
		((GoogleApiClient)this).connect();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #447 <Method void GoogleApiClient.connect()>
	//    4    8:return          
	}

	public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zagr.registerConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #175 <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zagr.registerConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #181 <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public final ListenerHolder registerListener(Object obj)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		obj = ((Object) (zaha.zaa(obj, zabj, "NO_TYPE")));
	//    3    9:aload_0         
	//    4   10:getfield        #98  <Field ListenerHolders zaha>
	//    5   13:aload_1         
	//    6   14:aload_0         
	//    7   15:getfield        #124 <Field Looper zabj>
	//    8   18:ldc2            #665 <String "NO_TYPE">
	//    9   21:invokevirtual   #668 <Method ListenerHolder ListenerHolders.zaa(Object, Looper, String)>
	//   10   24:astore_1        
		zaen.unlock();
	//   11   25:aload_0         
	//   12   26:getfield        #113 <Field Lock zaen>
	//   13   29:invokeinterface #202 <Method void Lock.unlock()>
		return ((ListenerHolder) (obj));
	//   14   34:aload_1         
	//   15   35:areturn         
		obj;
	//   16   36:astore_1        
		zaen.unlock();
	//   17   37:aload_0         
	//   18   38:getfield        #113 <Field Lock zaen>
	//   19   41:invokeinterface #202 <Method void Lock.unlock()>
		throw obj;
	//   20   46:aload_1         
	//   21   47:athrow          
	}

	public final void stopAutoManage(FragmentActivity fragmentactivity)
	{
		fragmentactivity = ((FragmentActivity) (new LifecycleActivity(((android.app.Activity) (fragmentactivity)))));
	//    0    0:new             #673 <Class LifecycleActivity>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #676 <Method void LifecycleActivity(android.app.Activity)>
	//    4    8:astore_1        
		if(zaca >= 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #135 <Field int zaca>
	//*   7   13:iflt            28
		{
			zaj.zaa(((LifecycleActivity) (fragmentactivity))).zaa(zaca);
	//    8   16:aload_1         
	//    9   17:invokestatic    #681 <Method zaj zaj.zaa(LifecycleActivity)>
	//   10   20:aload_0         
	//   11   21:getfield        #135 <Field int zaca>
	//   12   24:invokevirtual   #683 <Method void zaj.zaa(int)>
			return;
	//   13   27:return          
		} else
		{
			throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
	//   14   28:new             #297 <Class IllegalStateException>
	//   15   31:dup             
	//   16   32:ldc2            #685 <String "Called stopAutoManage but automatic lifecycle management is not enabled.">
	//   17   35:invokespecial   #304 <Method void IllegalStateException(String)>
	//   18   38:athrow          
		}
	}

	public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zagr.unregisterConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #688 <Method void GmsClientEventManager.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zagr.unregisterConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field GmsClientEventManager zagr>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #691 <Method void GmsClientEventManager.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public final void zaa(zacm zacm)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zahd == null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #102 <Field Set zahd>
	//*   5   13:ifnonnull       27
			zahd = ((Set) (new HashSet()));
	//    6   16:aload_0         
	//    7   17:new             #90  <Class HashSet>
	//    8   20:dup             
	//    9   21:invokespecial   #91  <Method void HashSet()>
	//   10   24:putfield        #102 <Field Set zahd>
		zahd.add(((Object) (zacm)));
	//   11   27:aload_0         
	//   12   28:getfield        #102 <Field Set zahd>
	//   13   31:aload_1         
	//   14   32:invokeinterface #693 <Method boolean Set.add(Object)>
	//   15   37:pop             
		zaen.unlock();
	//   16   38:aload_0         
	//   17   39:getfield        #113 <Field Lock zaen>
	//   18   42:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   19   47:return          
		zacm;
	//   20   48:astore_1        
		zaen.unlock();
	//   21   49:aload_0         
	//   22   50:getfield        #113 <Field Lock zaen>
	//   23   53:invokeinterface #202 <Method void Lock.unlock()>
		throw zacm;
	//   24   58:aload_1         
	//   25   59:athrow          
	}

	final boolean zaaw()
	{
		if(!zagt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field boolean zagt>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		zagt = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #196 <Field boolean zagt>
		zagw.removeMessages(2);
	//    8   14:aload_0         
	//    9   15:getfield        #131 <Field zabb zagw>
	//   10   18:iconst_2        
	//   11   19:invokevirtual   #696 <Method void zabb.removeMessages(int)>
		zagw.removeMessages(1);
	//   12   22:aload_0         
	//   13   23:getfield        #131 <Field zabb zagw>
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #696 <Method void zabb.removeMessages(int)>
		if(zagx != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #698 <Field zabq zagx>
	//*  18   34:ifnull          49
		{
			zagx.unregister();
	//   19   37:aload_0         
	//   20   38:getfield        #698 <Field zabq zagx>
	//   21   41:invokevirtual   #703 <Method void zabq.unregister()>
			zagx = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #698 <Field zabq zagx>
		}
		return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
	}

	final boolean zaax()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		Set set = zahd;
	//    3    9:aload_0         
	//    4   10:getfield        #102 <Field Set zahd>
	//    5   13:astore_2        
		if(set == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       29
		{
			zaen.unlock();
	//    8   18:aload_0         
	//    9   19:getfield        #113 <Field Lock zaen>
	//   10   22:invokeinterface #202 <Method void Lock.unlock()>
			return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
		}
		boolean flag = zahd.isEmpty();
	//   13   29:aload_0         
	//   14   30:getfield        #102 <Field Set zahd>
	//   15   33:invokeinterface #705 <Method boolean Set.isEmpty()>
	//   16   38:istore_1        
		zaen.unlock();
	//   17   39:aload_0         
	//   18   40:getfield        #113 <Field Lock zaen>
	//   19   43:invokeinterface #202 <Method void Lock.unlock()>
		return flag ^ true;
	//   20   48:iload_1         
	//   21   49:iconst_1        
	//   22   50:ixor            
	//   23   51:ireturn         
		Exception exception;
		exception;
	//   24   52:astore_2        
		zaen.unlock();
	//   25   53:aload_0         
	//   26   54:getfield        #113 <Field Lock zaen>
	//   27   57:invokeinterface #202 <Method void Lock.unlock()>
		throw exception;
	//   28   62:aload_2         
	//   29   63:athrow          
	}

	final String zaay()
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #707 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #708 <Method void StringWriter()>
	//    3    7:astore_1        
		((GoogleApiClient)this).dump("", ((FileDescriptor) (null)), new PrintWriter(((java.io.Writer) (stringwriter))), ((String []) (null)));
	//    4    8:aload_0         
	//    5    9:ldc2            #710 <String "">
	//    6   12:aconst_null     
	//    7   13:new             #490 <Class PrintWriter>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #713 <Method void PrintWriter(java.io.Writer)>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #714 <Method void GoogleApiClient.dump(String, FileDescriptor, PrintWriter, String[])>
		return stringwriter.toString();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #715 <Method String StringWriter.toString()>
	//   15   29:areturn         
	}

	public final void zab(int i, boolean flag)
	{
		if(i == 1 && !flag && !zagt)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          100
	//*   3    5:iload_2         
	//*   4    6:ifne            100
	//*   5    9:aload_0         
	//*   6   10:getfield        #196 <Field boolean zagt>
	//*   7   13:ifne            100
		{
			zagt = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #196 <Field boolean zagt>
			if(zagx == null && !ClientLibraryUtils.isPackageSide())
	//*  11   21:aload_0         
	//*  12   22:getfield        #698 <Field zabq zagx>
	//*  13   25:ifnonnull       60
	//*  14   28:invokestatic    #78  <Method boolean ClientLibraryUtils.isPackageSide()>
	//*  15   31:ifne            60
				zagx = zacc.zaa(mContext.getApplicationContext(), ((zabr) (new zabc(this))));
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #133 <Field GoogleApiAvailability zacc>
	//   19   39:aload_0         
	//   20   40:getfield        #111 <Field Context mContext>
	//   21   43:invokevirtual   #721 <Method Context Context.getApplicationContext()>
	//   22   46:new             #723 <Class zabc>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #724 <Method void zabc(zaaw)>
	//   26   54:invokevirtual   #729 <Method zabq GoogleApiAvailability.zaa(Context, zabr)>
	//   27   57:putfield        #698 <Field zabq zagx>
			zagw.sendMessageDelayed(zagw.obtainMessage(1), zagu);
	//   28   60:aload_0         
	//   29   61:getfield        #131 <Field zabb zagw>
	//   30   64:aload_0         
	//   31   65:getfield        #131 <Field zabb zagw>
	//   32   68:iconst_1        
	//   33   69:invokevirtual   #733 <Method android.os.Message zabb.obtainMessage(int)>
	//   34   72:aload_0         
	//   35   73:getfield        #84  <Field long zagu>
	//   36   76:invokevirtual   #737 <Method boolean zabb.sendMessageDelayed(android.os.Message, long)>
	//   37   79:pop             
			zagw.sendMessageDelayed(zagw.obtainMessage(2), zagv);
	//   38   80:aload_0         
	//   39   81:getfield        #131 <Field zabb zagw>
	//   40   84:aload_0         
	//   41   85:getfield        #131 <Field zabb zagw>
	//   42   88:iconst_2        
	//   43   89:invokevirtual   #733 <Method android.os.Message zabb.obtainMessage(int)>
	//   44   92:aload_0         
	//   45   93:getfield        #88  <Field long zagv>
	//   46   96:invokevirtual   #737 <Method boolean zabb.sendMessageDelayed(android.os.Message, long)>
	//   47   99:pop             
		}
		zahe.zabx();
	//   48  100:aload_0         
	//   49  101:getfield        #154 <Field zacp zahe>
	//   50  104:invokevirtual   #740 <Method void zacp.zabx()>
		zagr.onUnintentionalDisconnection(i);
	//   51  107:aload_0         
	//   52  108:getfield        #122 <Field GmsClientEventManager zagr>
	//   53  111:iload_1         
	//   54  112:invokevirtual   #743 <Method void GmsClientEventManager.onUnintentionalDisconnection(int)>
		zagr.disableCallbacks();
	//   55  115:aload_0         
	//   56  116:getfield        #122 <Field GmsClientEventManager zagr>
	//   57  119:invokevirtual   #486 <Method void GmsClientEventManager.disableCallbacks()>
		if(i == 2)
	//*  58  122:iload_1         
	//*  59  123:iconst_2        
	//*  60  124:icmpne          131
			zaau();
	//   61  127:aload_0         
	//   62  128:invokespecial   #199 <Method void zaau()>
	//   63  131:return          
	}

	public final void zab(Bundle bundle)
	{
		for(; !zafb.isEmpty(); ((GoogleApiClient)this).execute((BaseImplementation.ApiMethodImpl)zafb.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Queue zafb>
	//    2    4:invokeinterface #558 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #72  <Field Queue zafb>
	//    7   17:invokeinterface #561 <Method Object Queue.remove()>
	//    8   22:checkcast       #472 <Class BaseImplementation$ApiMethodImpl>
	//    9   25:invokevirtual   #745 <Method BaseImplementation$ApiMethodImpl GoogleApiClient.execute(BaseImplementation$ApiMethodImpl)>
	//   10   28:pop             
	//*  11   29:goto            0
		zagr.onConnectionSuccess(bundle);
	//   12   32:aload_0         
	//   13   33:getfield        #122 <Field GmsClientEventManager zagr>
	//   14   36:aload_1         
	//   15   37:invokevirtual   #748 <Method void GmsClientEventManager.onConnectionSuccess(Bundle)>
	//   16   40:return          
	}

	public final void zab(zacm zacm)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Lock zaen>
	//    2    4:invokeinterface #194 <Method void Lock.lock()>
		if(zahd != null) goto _L2; else goto _L1
	//    3    9:aload_0         
	//    4   10:getfield        #102 <Field Set zahd>
	//    5   13:ifnonnull       40
_L1:
		zacm = "Attempted to remove pending transform when no transforms are registered.";
	//    6   16:ldc2            #750 <String "Attempted to remove pending transform when no transforms are registered.">
	//    7   19:astore_1        
		Exception exception = new Exception();
	//    8   20:new             #618 <Class Exception>
	//    9   23:dup             
	//   10   24:invokespecial   #619 <Method void Exception()>
	//   11   27:astore_2        
_L3:
		Log.wtf("GoogleApiClientImpl", ((String) (zacm)), ((Throwable) (exception)));
	//   12   28:ldc2            #601 <String "GoogleApiClientImpl">
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:invokestatic    #623 <Method int Log.wtf(String, String, Throwable)>
	//   16   36:pop             
		break MISSING_BLOCK_LABEL_84;
	//   17   37:goto            84
_L2:
		if(zahd.remove(((Object) (zacm))))
			break MISSING_BLOCK_LABEL_68;
	//   18   40:aload_0         
	//   19   41:getfield        #102 <Field Set zahd>
	//   20   44:aload_1         
	//   21   45:invokeinterface #752 <Method boolean Set.remove(Object)>
	//   22   50:ifne            68
		zacm = "Failed to remove pending transform - this may lead to memory leaks!";
	//   23   53:ldc2            #754 <String "Failed to remove pending transform - this may lead to memory leaks!">
	//   24   56:astore_1        
		exception = new Exception();
	//   25   57:new             #618 <Class Exception>
	//   26   60:dup             
	//   27   61:invokespecial   #619 <Method void Exception()>
	//   28   64:astore_2        
		  goto _L3
	//*  29   65:goto            28
		if(!zaax())
	//*  30   68:aload_0         
	//*  31   69:invokevirtual   #756 <Method boolean zaax()>
	//*  32   72:ifne            84
			zags.zaw();
	//   33   75:aload_0         
	//   34   76:getfield        #67  <Field zabs zags>
	//   35   79:invokeinterface #759 <Method void zabs.zaw()>
		zaen.unlock();
	//   36   84:aload_0         
	//   37   85:getfield        #113 <Field Lock zaen>
	//   38   88:invokeinterface #202 <Method void Lock.unlock()>
		return;
	//   39   93:return          
		zacm;
	//   40   94:astore_1        
		zaen.unlock();
	//   41   95:aload_0         
	//   42   96:getfield        #113 <Field Lock zaen>
	//   43   99:invokeinterface #202 <Method void Lock.unlock()>
		throw zacm;
	//   44  104:aload_1         
	//   45  105:athrow          
	}

	public final void zac(ConnectionResult connectionresult)
	{
		if(!((GoogleApiAvailabilityLight) (zacc)).isPlayServicesPossiblyUpdating(mContext, connectionresult.getErrorCode()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field GoogleApiAvailability zacc>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field Context mContext>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #763 <Method int ConnectionResult.getErrorCode()>
	//*   6   12:invokevirtual   #769 <Method boolean GoogleApiAvailabilityLight.isPlayServicesPossiblyUpdating(Context, int)>
	//*   7   15:ifne            23
			zaaw();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #260 <Method boolean zaaw()>
	//   10   22:pop             
		if(!zagt)
	//*  11   23:aload_0         
	//*  12   24:getfield        #196 <Field boolean zagt>
	//*  13   27:ifne            45
		{
			zagr.onConnectionFailure(connectionresult);
	//   14   30:aload_0         
	//   15   31:getfield        #122 <Field GmsClientEventManager zagr>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #772 <Method void GmsClientEventManager.onConnectionFailure(ConnectionResult)>
			zagr.disableCallbacks();
	//   18   38:aload_0         
	//   19   39:getfield        #122 <Field GmsClientEventManager zagr>
	//   20   42:invokevirtual   #486 <Method void GmsClientEventManager.disableCallbacks()>
		}
	//   21   45:return          
	}

	private final Context mContext;
	private final Looper zabj;
	private final int zaca;
	private final GoogleApiAvailability zacc;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zacd;
	private boolean zacg;
	private final Lock zaen;
	private final ClientSettings zaes;
	private final Map zaev;
	final Queue zafb = new LinkedList();
	private final GmsClientEventManager zagr;
	private zabs zags;
	private volatile boolean zagt;
	private long zagu;
	private long zagv;
	private final zabb zagw;
	private zabq zagx;
	final Map zagy;
	Set zagz;
	private final ListenerHolders zaha = new ListenerHolders();
	private final ArrayList zahb;
	private Integer zahc;
	Set zahd;
	final zacp zahe;
	private final com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState zahf = new zaax(this);
}

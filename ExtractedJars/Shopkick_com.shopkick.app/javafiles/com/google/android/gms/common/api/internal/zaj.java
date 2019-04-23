// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zal, LifecycleFragment, zam, LifecycleActivity

public class zaj extends zal
{
	private final class zaa
		implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
	{

		public final void onConnectionFailed(ConnectionResult connectionresult)
		{
			String s = String.valueOf(((Object) (connectionresult)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #46  <Method String String.valueOf(Object)>
		//    2    4:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 27);
		//    3    5:new             #48  <Class StringBuilder>
		//    4    8:dup             
		//    5    9:aload_2         
		//    6   10:invokestatic    #46  <Method String String.valueOf(Object)>
		//    7   13:invokevirtual   #52  <Method int String.length()>
		//    8   16:bipush          27
		//    9   18:iadd            
		//   10   19:invokespecial   #55  <Method void StringBuilder(int)>
		//   11   22:astore_3        
			stringbuilder.append("beginFailureResolution for ");
		//   12   23:aload_3         
		//   13   24:ldc1            #57  <String "beginFailureResolution for ">
		//   14   26:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
		//   15   29:pop             
			stringbuilder.append(s);
		//   16   30:aload_3         
		//   17   31:aload_2         
		//   18   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
		//   19   35:pop             
			Log.d("AutoManageHelper", stringbuilder.toString());
		//   20   36:ldc1            #63  <String "AutoManageHelper">
		//   21   38:aload_3         
		//   22   39:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   23   42:invokestatic    #73  <Method int Log.d(String, String)>
		//   24   45:pop             
			((zal) (zacz)).zab(connectionresult, zacw);
		//   25   46:aload_0         
		//   26   47:getfield        #21  <Field zaj zacz>
		//   27   50:aload_1         
		//   28   51:aload_0         
		//   29   52:getfield        #26  <Field int zacw>
		//   30   55:invokevirtual   #79  <Method void zal.zab(ConnectionResult, int)>
		//   31   58:return          
		}

		public final int zacw;
		public final GoogleApiClient zacx;
		public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zacy;
		private final zaj zacz;

		public zaa(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			zacz = zaj.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field zaj zacz>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			zacw = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int zacw>
			zacx = googleapiclient;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field GoogleApiClient zacx>
			zacy = onconnectionfailedlistener;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zacy>
			googleapiclient.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
		//   14   25:aload_3         
		//   15   26:aload_0         
		//   16   27:invokevirtual   #36  <Method void GoogleApiClient.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//   17   30:return          
		}
	}


	private zaj(LifecycleFragment lifecyclefragment)
	{
		super(lifecyclefragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void zal(LifecycleFragment)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class SparseArray>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void SparseArray()>
	//    7   13:putfield        #21  <Field SparseArray zacv>
		mLifecycleFragment.addCallback("AutoManageHelper", ((LifecycleCallback) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field LifecycleFragment mLifecycleFragment>
	//   10   20:ldc1            #27  <String "AutoManageHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #33  <Method void LifecycleFragment.addCallback(String, LifecycleCallback)>
	//   13   28:return          
	}

	public static zaj zaa(LifecycleActivity lifecycleactivity)
	{
		lifecycleactivity = ((LifecycleActivity) (getFragment(lifecycleactivity)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method LifecycleFragment getFragment(LifecycleActivity)>
	//    2    4:astore_0        
		zaj zaj1 = (zaj)((LifecycleFragment) (lifecycleactivity)).getCallbackOrNull("AutoManageHelper", com/google/android/gms/common/api/internal/zaj);
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <String "AutoManageHelper">
	//    5    8:ldc1            #2   <Class zaj>
	//    6   10:invokeinterface #43  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
	//    7   15:checkcast       #2   <Class zaj>
	//    8   18:astore_1        
		if(zaj1 != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          25
			return zaj1;
	//   11   23:aload_1         
	//   12   24:areturn         
		else
			return new zaj(((LifecycleFragment) (lifecycleactivity)));
	//   13   25:new             #2   <Class zaj>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #44  <Method void zaj(LifecycleFragment)>
	//   17   33:areturn         
	}

	private final zaa zab(int i)
	{
		if(zacv.size() <= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field SparseArray zacv>
	//*   2    4:invokevirtual   #51  <Method int SparseArray.size()>
	//*   3    7:iload_1         
	//*   4    8:icmpgt          13
		{
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		} else
		{
			SparseArray sparsearray = zacv;
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field SparseArray zacv>
	//    9   17:astore_2        
			return (zaa)sparsearray.get(sparsearray.keyAt(i));
	//   10   18:aload_2         
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #55  <Method int SparseArray.keyAt(int)>
	//   14   24:invokevirtual   #59  <Method Object SparseArray.get(int)>
	//   15   27:checkcast       #6   <Class zaj$zaa>
	//   16   30:areturn         
		}
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		for(int i = 0; i < zacv.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field SparseArray zacv>
	//*   5    9:invokevirtual   #51  <Method int SparseArray.size()>
	//*   6   12:icmpge          82
		{
			zaa zaa1 = zab(i);
	//    7   15:aload_0         
	//    8   16:iload           5
	//    9   18:invokespecial   #64  <Method zaj$zaa zab(int)>
	//   10   21:astore          6
			if(zaa1 != null)
	//*  11   23:aload           6
	//*  12   25:ifnull          73
			{
				printwriter.append(((CharSequence) (s))).append("GoogleApiClient #").print(zaa1.zacw);
	//   13   28:aload_3         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #70  <Method PrintWriter PrintWriter.append(CharSequence)>
	//   16   33:ldc1            #72  <String "GoogleApiClient #">
	//   17   35:invokevirtual   #70  <Method PrintWriter PrintWriter.append(CharSequence)>
	//   18   38:aload           6
	//   19   40:getfield        #76  <Field int zaj$zaa.zacw>
	//   20   43:invokevirtual   #80  <Method void PrintWriter.print(int)>
				printwriter.println(":");
	//   21   46:aload_3         
	//   22   47:ldc1            #82  <String ":">
	//   23   49:invokevirtual   #86  <Method void PrintWriter.println(String)>
				zaa1.zacx.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
	//   24   52:aload           6
	//   25   54:getfield        #90  <Field GoogleApiClient zaj$zaa.zacx>
	//   26   57:aload_1         
	//   27   58:invokestatic    #96  <Method String String.valueOf(Object)>
	//   28   61:ldc1            #98  <String "  ">
	//   29   63:invokevirtual   #102 <Method String String.concat(String)>
	//   30   66:aload_2         
	//   31   67:aload_3         
	//   32   68:aload           4
	//   33   70:invokevirtual   #106 <Method void GoogleApiClient.dump(String, FileDescriptor, PrintWriter, String[])>
			}
		}

	//   34   73:iload           5
	//   35   75:iconst_1        
	//   36   76:iadd            
	//   37   77:istore          5
	//*  38   79:goto            3
	//   39   82:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void zal.onStart()>
		boolean flag = mStarted;
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field boolean mStarted>
	//    4    8:istore_2        
		String s = String.valueOf(((Object) (zacv)));
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field SparseArray zacv>
	//    7   13:invokestatic    #96  <Method String String.valueOf(Object)>
	//    8   16:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 14);
	//    9   17:new             #115 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:aload_3         
	//   12   22:invokestatic    #96  <Method String String.valueOf(Object)>
	//   13   25:invokevirtual   #118 <Method int String.length()>
	//   14   28:bipush          14
	//   15   30:iadd            
	//   16   31:invokespecial   #120 <Method void StringBuilder(int)>
	//   17   34:astore          4
		stringbuilder.append("onStart ");
	//   18   36:aload           4
	//   19   38:ldc1            #122 <String "onStart ">
	//   20   40:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
		stringbuilder.append(flag);
	//   22   44:aload           4
	//   23   46:iload_2         
	//   24   47:invokevirtual   #128 <Method StringBuilder StringBuilder.append(boolean)>
	//   25   50:pop             
		stringbuilder.append(" ");
	//   26   51:aload           4
	//   27   53:ldc1            #130 <String " ">
	//   28   55:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		stringbuilder.append(s);
	//   30   59:aload           4
	//   31   61:aload_3         
	//   32   62:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		Log.d("AutoManageHelper", stringbuilder.toString());
	//   34   66:ldc1            #27  <String "AutoManageHelper">
	//   35   68:aload           4
	//   36   70:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   37   73:invokestatic    #140 <Method int Log.d(String, String)>
	//   38   76:pop             
		if(zade.get() == null)
	//*  39   77:aload_0         
	//*  40   78:getfield        #144 <Field AtomicReference zade>
	//*  41   81:invokevirtual   #149 <Method Object AtomicReference.get()>
	//*  42   84:ifnonnull       124
		{
			for(int i = 0; i < zacv.size(); i++)
	//*  43   87:iconst_0        
	//*  44   88:istore_1        
	//*  45   89:iload_1         
	//*  46   90:aload_0         
	//*  47   91:getfield        #21  <Field SparseArray zacv>
	//*  48   94:invokevirtual   #51  <Method int SparseArray.size()>
	//*  49   97:icmpge          124
			{
				zaa zaa1 = zab(i);
	//   50  100:aload_0         
	//   51  101:iload_1         
	//   52  102:invokespecial   #64  <Method zaj$zaa zab(int)>
	//   53  105:astore_3        
				if(zaa1 != null)
	//*  54  106:aload_3         
	//*  55  107:ifnull          117
					zaa1.zacx.connect();
	//   56  110:aload_3         
	//   57  111:getfield        #90  <Field GoogleApiClient zaj$zaa.zacx>
	//   58  114:invokevirtual   #152 <Method void GoogleApiClient.connect()>
			}

	//   59  117:iload_1         
	//   60  118:iconst_1        
	//   61  119:iadd            
	//   62  120:istore_1        
		}
	//*  63  121:goto            89
	//   64  124:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #155 <Method void zal.onStop()>
		for(int i = 0; i < zacv.size(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_1        
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field SparseArray zacv>
	//*   7   11:invokevirtual   #51  <Method int SparseArray.size()>
	//*   8   14:icmpge          41
		{
			zaa zaa1 = zab(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokespecial   #64  <Method zaj$zaa zab(int)>
	//   12   22:astore_2        
			if(zaa1 != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          34
				zaa1.zacx.disconnect();
	//   15   27:aload_2         
	//   16   28:getfield        #90  <Field GoogleApiClient zaj$zaa.zacx>
	//   17   31:invokevirtual   #158 <Method void GoogleApiClient.disconnect()>
		}

	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_1        
	//*  22   38:goto            6
	//   23   41:return          
	}

	public final void zaa(int i)
	{
		zaa zaa1 = (zaa)zacv.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SparseArray zacv>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #59  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #6   <Class zaj$zaa>
	//    5   11:astore_2        
		zacv.remove(i);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SparseArray zacv>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #161 <Method void SparseArray.remove(int)>
		if(zaa1 != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          39
		{
			zaa1.zacx.unregisterConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (zaa1)));
	//   12   24:aload_2         
	//   13   25:getfield        #90  <Field GoogleApiClient zaj$zaa.zacx>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #165 <Method void GoogleApiClient.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			zaa1.zacx.disconnect();
	//   16   32:aload_2         
	//   17   33:getfield        #90  <Field GoogleApiClient zaj$zaa.zacx>
	//   18   36:invokevirtual   #158 <Method void GoogleApiClient.disconnect()>
		}
	//   19   39:return          
	}

	public final void zaa(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		Preconditions.checkNotNull(((Object) (googleapiclient)), "GoogleApiClient instance cannot be null");
	//    0    0:aload_2         
	//    1    1:ldc1            #168 <String "GoogleApiClient instance cannot be null">
	//    2    3:invokestatic    #174 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		boolean flag;
		if(zacv.indexOfKey(i) < 0)
	//*   4    7:aload_0         
	//*   5    8:getfield        #21  <Field SparseArray zacv>
	//*   6   11:iload_1         
	//*   7   12:invokevirtual   #177 <Method int SparseArray.indexOfKey(int)>
	//*   8   15:ifge            24
			flag = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
		else
	//*  11   21:goto            27
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore          4
		Object obj = ((Object) (new StringBuilder(54)));
	//   14   27:new             #115 <Class StringBuilder>
	//   15   30:dup             
	//   16   31:bipush          54
	//   17   33:invokespecial   #120 <Method void StringBuilder(int)>
	//   18   36:astore          5
		((StringBuilder) (obj)).append("Already managing a GoogleApiClient with id ");
	//   19   38:aload           5
	//   20   40:ldc1            #179 <String "Already managing a GoogleApiClient with id ">
	//   21   42:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
		((StringBuilder) (obj)).append(i);
	//   23   46:aload           5
	//   24   48:iload_1         
	//   25   49:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   26   52:pop             
		Preconditions.checkState(flag, ((Object) (((StringBuilder) (obj)).toString())));
	//   27   53:iload           4
	//   28   55:aload           5
	//   29   57:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   30   60:invokestatic    #186 <Method void Preconditions.checkState(boolean, Object)>
		obj = ((Object) ((zam)zade.get()));
	//   31   63:aload_0         
	//   32   64:getfield        #144 <Field AtomicReference zade>
	//   33   67:invokevirtual   #149 <Method Object AtomicReference.get()>
	//   34   70:checkcast       #188 <Class zam>
	//   35   73:astore          5
		flag = mStarted;
	//   36   75:aload_0         
	//   37   76:getfield        #113 <Field boolean mStarted>
	//   38   79:istore          4
		String s = String.valueOf(obj);
	//   39   81:aload           5
	//   40   83:invokestatic    #96  <Method String String.valueOf(Object)>
	//   41   86:astore          6
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s))).length() + 49);
	//   42   88:new             #115 <Class StringBuilder>
	//   43   91:dup             
	//   44   92:aload           6
	//   45   94:invokestatic    #96  <Method String String.valueOf(Object)>
	//   46   97:invokevirtual   #118 <Method int String.length()>
	//   47  100:bipush          49
	//   48  102:iadd            
	//   49  103:invokespecial   #120 <Method void StringBuilder(int)>
	//   50  106:astore          7
		stringbuilder1.append("starting AutoManage for client ");
	//   51  108:aload           7
	//   52  110:ldc1            #190 <String "starting AutoManage for client ">
	//   53  112:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   54  115:pop             
		stringbuilder1.append(i);
	//   55  116:aload           7
	//   56  118:iload_1         
	//   57  119:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   58  122:pop             
		stringbuilder1.append(" ");
	//   59  123:aload           7
	//   60  125:ldc1            #130 <String " ">
	//   61  127:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   62  130:pop             
		stringbuilder1.append(flag);
	//   63  131:aload           7
	//   64  133:iload           4
	//   65  135:invokevirtual   #128 <Method StringBuilder StringBuilder.append(boolean)>
	//   66  138:pop             
		stringbuilder1.append(" ");
	//   67  139:aload           7
	//   68  141:ldc1            #130 <String " ">
	//   69  143:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   70  146:pop             
		stringbuilder1.append(s);
	//   71  147:aload           7
	//   72  149:aload           6
	//   73  151:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   74  154:pop             
		Log.d("AutoManageHelper", stringbuilder1.toString());
	//   75  155:ldc1            #27  <String "AutoManageHelper">
	//   76  157:aload           7
	//   77  159:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   78  162:invokestatic    #140 <Method int Log.d(String, String)>
	//   79  165:pop             
		onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new zaa(i, googleapiclient, onconnectionfailedlistener)));
	//   80  166:new             #6   <Class zaj$zaa>
	//   81  169:dup             
	//   82  170:aload_0         
	//   83  171:iload_1         
	//   84  172:aload_2         
	//   85  173:aload_3         
	//   86  174:invokespecial   #193 <Method void zaj$zaa(zaj, int, GoogleApiClient, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   87  177:astore_3        
		zacv.put(i, ((Object) (onconnectionfailedlistener)));
	//   88  178:aload_0         
	//   89  179:getfield        #21  <Field SparseArray zacv>
	//   90  182:iload_1         
	//   91  183:aload_3         
	//   92  184:invokevirtual   #197 <Method void SparseArray.put(int, Object)>
		if(mStarted && obj == null)
	//*  93  187:aload_0         
	//*  94  188:getfield        #113 <Field boolean mStarted>
	//*  95  191:ifeq            253
	//*  96  194:aload           5
	//*  97  196:ifnonnull       253
		{
			onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (String.valueOf(((Object) (googleapiclient)))));
	//   98  199:aload_2         
	//   99  200:invokestatic    #96  <Method String String.valueOf(Object)>
	//  100  203:astore_3        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (onconnectionfailedlistener))).length() + 11);
	//  101  204:new             #115 <Class StringBuilder>
	//  102  207:dup             
	//  103  208:aload_3         
	//  104  209:invokestatic    #96  <Method String String.valueOf(Object)>
	//  105  212:invokevirtual   #118 <Method int String.length()>
	//  106  215:bipush          11
	//  107  217:iadd            
	//  108  218:invokespecial   #120 <Method void StringBuilder(int)>
	//  109  221:astore          5
			stringbuilder.append("connecting ");
	//  110  223:aload           5
	//  111  225:ldc1            #199 <String "connecting ">
	//  112  227:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  113  230:pop             
			stringbuilder.append(((String) (onconnectionfailedlistener)));
	//  114  231:aload           5
	//  115  233:aload_3         
	//  116  234:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  117  237:pop             
			Log.d("AutoManageHelper", stringbuilder.toString());
	//  118  238:ldc1            #27  <String "AutoManageHelper">
	//  119  240:aload           5
	//  120  242:invokevirtual   #134 <Method String StringBuilder.toString()>
	//  121  245:invokestatic    #140 <Method int Log.d(String, String)>
	//  122  248:pop             
			googleapiclient.connect();
	//  123  249:aload_2         
	//  124  250:invokevirtual   #152 <Method void GoogleApiClient.connect()>
		}
	//  125  253:return          
	}

	protected final void zaa(ConnectionResult connectionresult, int i)
	{
		Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
	//    0    0:ldc1            #27  <String "AutoManageHelper">
	//    1    2:ldc1            #202 <String "Unresolved error while connecting client. Stopping auto-manage.">
	//    2    4:invokestatic    #205 <Method int Log.w(String, String)>
	//    3    7:pop             
		if(i < 0)
	//*   4    8:iload_2         
	//*   5    9:ifge            28
		{
			Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", ((Throwable) (new Exception())));
	//    6   12:ldc1            #27  <String "AutoManageHelper">
	//    7   14:ldc1            #207 <String "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set">
	//    8   16:new             #209 <Class Exception>
	//    9   19:dup             
	//   10   20:invokespecial   #210 <Method void Exception()>
	//   11   23:invokestatic    #214 <Method int Log.wtf(String, String, Throwable)>
	//   12   26:pop             
			return;
	//   13   27:return          
		}
		Object obj = ((Object) ((zaa)zacv.get(i)));
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field SparseArray zacv>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #59  <Method Object SparseArray.get(int)>
	//   18   36:checkcast       #6   <Class zaj$zaa>
	//   19   39:astore_3        
		if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          65
		{
			zaa(i);
	//   22   44:aload_0         
	//   23   45:iload_2         
	//   24   46:invokevirtual   #216 <Method void zaa(int)>
			obj = ((Object) (((zaa) (obj)).zacy));
	//   25   49:aload_3         
	//   26   50:getfield        #220 <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zaj$zaa.zacy>
	//   27   53:astore_3        
			if(obj != null)
	//*  28   54:aload_3         
	//*  29   55:ifnull          65
				((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
	//   30   58:aload_3         
	//   31   59:aload_1         
	//   32   60:invokeinterface #226 <Method void com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		}
	//   33   65:return          
	}

	protected final void zao()
	{
		for(int i = 0; i < zacv.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #21  <Field SparseArray zacv>
	//*   5    7:invokevirtual   #51  <Method int SparseArray.size()>
	//*   6   10:icmpge          37
		{
			zaa zaa1 = zab(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #64  <Method zaj$zaa zab(int)>
	//   10   18:astore_2        
			if(zaa1 != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          30
				zaa1.zacx.connect();
	//   13   23:aload_2         
	//   14   24:getfield        #90  <Field GoogleApiClient zaj$zaa.zacx>
	//   15   27:invokevirtual   #152 <Method void GoogleApiClient.connect()>
		}

	//   16   30:iload_1         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_1        
	//*  20   34:goto            2
	//   21   37:return          
	}

	private final SparseArray zacv = new SparseArray();
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzac;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.internal:
//			zzzw, zzaax, zzaav

public class zzzt extends zzzw
{
	private class zza
		implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
	{

		public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
		{
			printwriter.append(((CharSequence) (s))).append("GoogleApiClient #").print(zzayy);
		//    0    0:aload_3         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method PrintWriter PrintWriter.append(CharSequence)>
		//    3    5:ldc1            #47  <String "GoogleApiClient #">
		//    4    7:invokevirtual   #45  <Method PrintWriter PrintWriter.append(CharSequence)>
		//    5   10:aload_0         
		//    6   11:getfield        #26  <Field int zzayy>
		//    7   14:invokevirtual   #51  <Method void PrintWriter.print(int)>
			printwriter.println(":");
		//    8   17:aload_3         
		//    9   18:ldc1            #53  <String ":">
		//   10   20:invokevirtual   #57  <Method void PrintWriter.println(String)>
			zzayz.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
		//   11   23:aload_0         
		//   12   24:getfield        #28  <Field GoogleApiClient zzayz>
		//   13   27:aload_1         
		//   14   28:invokestatic    #63  <Method String String.valueOf(Object)>
		//   15   31:ldc1            #65  <String "  ">
		//   16   33:invokevirtual   #69  <Method String String.concat(String)>
		//   17   36:aload_2         
		//   18   37:aload_3         
		//   19   38:aload           4
		//   20   40:invokevirtual   #71  <Method void GoogleApiClient.dump(String, FileDescriptor, PrintWriter, String[])>
		//   21   43:return          
		}

		public void onConnectionFailed(ConnectionResult connectionresult)
		{
			String s = String.valueOf(((Object) (connectionresult)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #63  <Method String String.valueOf(Object)>
		//    2    4:astore_2        
			Log.d("AutoManageHelper", (new StringBuilder(String.valueOf(((Object) (s))).length() + 27)).append("beginFailureResolution for ").append(s).toString());
		//    3    5:ldc1            #76  <String "AutoManageHelper">
		//    4    7:new             #78  <Class StringBuilder>
		//    5   10:dup             
		//    6   11:aload_2         
		//    7   12:invokestatic    #63  <Method String String.valueOf(Object)>
		//    8   15:invokevirtual   #82  <Method int String.length()>
		//    9   18:bipush          27
		//   10   20:iadd            
		//   11   21:invokespecial   #84  <Method void StringBuilder(int)>
		//   12   24:ldc1            #86  <String "beginFailureResolution for ">
		//   13   26:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
		//   14   29:aload_2         
		//   15   30:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
		//   16   33:invokevirtual   #93  <Method String StringBuilder.toString()>
		//   17   36:invokestatic    #99  <Method int Log.d(String, String)>
		//   18   39:pop             
			zzayB.zzb(connectionresult, zzayy);
		//   19   40:aload_0         
		//   20   41:getfield        #21  <Field zzzt zzayB>
		//   21   44:aload_1         
		//   22   45:aload_0         
		//   23   46:getfield        #26  <Field int zzayy>
		//   24   49:invokevirtual   #103 <Method void zzzt.zzb(ConnectionResult, int)>
		//   25   52:return          
		}

		public void zzuX()
		{
			zzayz.unregisterConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field GoogleApiClient zzayz>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #108 <Method void GoogleApiClient.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			zzayz.disconnect();
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field GoogleApiClient zzayz>
		//    6   12:invokevirtual   #111 <Method void GoogleApiClient.disconnect()>
		//    7   15:return          
		}

		public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zzayA;
		final zzzt zzayB;
		public final int zzayy;
		public final GoogleApiClient zzayz;

		public zza(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			zzayB = zzzt.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field zzzt zzayB>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			zzayy = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int zzayy>
			zzayz = googleapiclient;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field GoogleApiClient zzayz>
			zzayA = onconnectionfailedlistener;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzayA>
			googleapiclient.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
		//   14   25:aload_3         
		//   15   26:aload_0         
		//   16   27:invokevirtual   #36  <Method void GoogleApiClient.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//   17   30:return          
		}
	}


	private zzzt(zzaax zzaax1)
	{
		super(zzaax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void zzzw(zzaax)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class SparseArray>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void SparseArray()>
	//    7   13:putfield        #21  <Field SparseArray zzayx>
		zzaBs.zza("AutoManageHelper", ((zzaaw) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field zzaax zzaBs>
	//   10   20:ldc1            #27  <String "AutoManageHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #32  <Method void zzaax.zza(String, zzaaw)>
	//   13   28:return          
	}

	public static zzzt zza(zzaav zzaav)
	{
		zzaav = ((zzaav) (zzc(zzaav)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method zzaax zzc(zzaav)>
	//    2    4:astore_0        
		zzzt zzzt1 = (zzzt)((zzaax) (zzaav)).zza("AutoManageHelper", com/google/android/gms/internal/zzzt);
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <String "AutoManageHelper">
	//    5    8:ldc1            #2   <Class zzzt>
	//    6   10:invokeinterface #41  <Method zzaaw zzaax.zza(String, Class)>
	//    7   15:checkcast       #2   <Class zzzt>
	//    8   18:astore_1        
		if(zzzt1 != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          25
			return zzzt1;
	//   11   23:aload_1         
	//   12   24:areturn         
		else
			return new zzzt(((zzaax) (zzaav)));
	//   13   25:new             #2   <Class zzzt>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #42  <Method void zzzt(zzaax)>
	//   17   33:areturn         
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		for(int i = 0; i < zzayx.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field SparseArray zzayx>
	//*   5    9:invokevirtual   #48  <Method int SparseArray.size()>
	//*   6   12:icmpge          44
			((zza)zzayx.valueAt(i)).dump(s, filedescriptor, printwriter, as);
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field SparseArray zzayx>
	//    9   19:iload           5
	//   10   21:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   11   24:checkcast       #6   <Class zzzt$zza>
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:aload_3         
	//   15   30:aload           4
	//   16   32:invokevirtual   #54  <Method void zzzt$zza.dump(String, FileDescriptor, PrintWriter, String[])>

	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:iadd            
	//   20   39:istore          5
	//*  21   41:goto            3
	//   22   44:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void zzzw.onStart()>
		boolean flag = mStarted;
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field boolean mStarted>
	//    4    8:istore_2        
		String s = String.valueOf(((Object) (zzayx)));
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field SparseArray zzayx>
	//    7   13:invokestatic    #67  <Method String String.valueOf(Object)>
	//    8   16:astore_3        
		Log.d("AutoManageHelper", (new StringBuilder(String.valueOf(((Object) (s))).length() + 14)).append("onStart ").append(flag).append(" ").append(s).toString());
	//    9   17:ldc1            #27  <String "AutoManageHelper">
	//   10   19:new             #69  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:aload_3         
	//   13   24:invokestatic    #67  <Method String String.valueOf(Object)>
	//   14   27:invokevirtual   #72  <Method int String.length()>
	//   15   30:bipush          14
	//   16   32:iadd            
	//   17   33:invokespecial   #75  <Method void StringBuilder(int)>
	//   18   36:ldc1            #77  <String "onStart ">
	//   19   38:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:iload_2         
	//   21   42:invokevirtual   #84  <Method StringBuilder StringBuilder.append(boolean)>
	//   22   45:ldc1            #86  <String " ">
	//   23   47:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:aload_3         
	//   25   51:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   27   57:invokestatic    #96  <Method int Log.d(String, String)>
	//   28   60:pop             
		if(!zzayG)
	//*  29   61:aload_0         
	//*  30   62:getfield        #99  <Field boolean zzayG>
	//*  31   65:ifne            105
		{
			for(int i = 0; i < zzayx.size(); i++)
	//*  32   68:iconst_0        
	//*  33   69:istore_1        
	//*  34   70:iload_1         
	//*  35   71:aload_0         
	//*  36   72:getfield        #21  <Field SparseArray zzayx>
	//*  37   75:invokevirtual   #48  <Method int SparseArray.size()>
	//*  38   78:icmpge          105
				((zza)zzayx.valueAt(i)).zzayz.connect();
	//   39   81:aload_0         
	//   40   82:getfield        #21  <Field SparseArray zzayx>
	//   41   85:iload_1         
	//   42   86:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   43   89:checkcast       #6   <Class zzzt$zza>
	//   44   92:getfield        #103 <Field GoogleApiClient zzzt$zza.zzayz>
	//   45   95:invokevirtual   #108 <Method void GoogleApiClient.connect()>

	//   46   98:iload_1         
	//   47   99:iconst_1        
	//   48  100:iadd            
	//   49  101:istore_1        
		}
	//*  50  102:goto            70
	//   51  105:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void zzzw.onStop()>
		for(int i = 0; i < zzayx.size(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_1        
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field SparseArray zzayx>
	//*   7   11:invokevirtual   #48  <Method int SparseArray.size()>
	//*   8   14:icmpge          41
			((zza)zzayx.valueAt(i)).zzayz.disconnect();
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field SparseArray zzayx>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   13   25:checkcast       #6   <Class zzzt$zza>
	//   14   28:getfield        #103 <Field GoogleApiClient zzzt$zza.zzayz>
	//   15   31:invokevirtual   #114 <Method void GoogleApiClient.disconnect()>

	//   16   34:iload_1         
	//   17   35:iconst_1        
	//   18   36:iadd            
	//   19   37:istore_1        
	//*  20   38:goto            6
	//   21   41:return          
	}

	public void zza(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzac.zzb(((Object) (googleapiclient)), "GoogleApiClient instance cannot be null");
	//    0    0:aload_2         
	//    1    1:ldc1            #117 <String "GoogleApiClient instance cannot be null">
	//    2    3:invokestatic    #123 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		boolean flag;
		boolean flag1;
		if(zzayx.indexOfKey(i) < 0)
	//*   4    7:aload_0         
	//*   5    8:getfield        #21  <Field SparseArray zzayx>
	//*   6   11:iload_1         
	//*   7   12:invokevirtual   #127 <Method int SparseArray.indexOfKey(int)>
	//*   8   15:ifge            186
			flag = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
		else
	//*  11   21:iload           4
	//*  12   23:new             #69  <Class StringBuilder>
	//*  13   26:dup             
	//*  14   27:bipush          54
	//*  15   29:invokespecial   #75  <Method void StringBuilder(int)>
	//*  16   32:ldc1            #129 <String "Already managing a GoogleApiClient with id ">
	//*  17   34:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//*  18   37:iload_1         
	//*  19   38:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//*  20   41:invokevirtual   #90  <Method String StringBuilder.toString()>
	//*  21   44:invokestatic    #135 <Method void zzac.zza(boolean, Object)>
	//*  22   47:aload_0         
	//*  23   48:getfield        #61  <Field boolean mStarted>
	//*  24   51:istore          4
	//*  25   53:aload_0         
	//*  26   54:getfield        #99  <Field boolean zzayG>
	//*  27   57:istore          5
	//*  28   59:ldc1            #27  <String "AutoManageHelper">
	//*  29   61:new             #69  <Class StringBuilder>
	//*  30   64:dup             
	//*  31   65:bipush          54
	//*  32   67:invokespecial   #75  <Method void StringBuilder(int)>
	//*  33   70:ldc1            #137 <String "starting AutoManage for client ">
	//*  34   72:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//*  35   75:iload_1         
	//*  36   76:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//*  37   79:ldc1            #86  <String " ">
	//*  38   81:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//*  39   84:iload           4
	//*  40   86:invokevirtual   #84  <Method StringBuilder StringBuilder.append(boolean)>
	//*  41   89:ldc1            #86  <String " ">
	//*  42   91:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//*  43   94:iload           5
	//*  44   96:invokevirtual   #84  <Method StringBuilder StringBuilder.append(boolean)>
	//*  45   99:invokevirtual   #90  <Method String StringBuilder.toString()>
	//*  46  102:invokestatic    #96  <Method int Log.d(String, String)>
	//*  47  105:pop             
	//*  48  106:new             #6   <Class zzzt$zza>
	//*  49  109:dup             
	//*  50  110:aload_0         
	//*  51  111:iload_1         
	//*  52  112:aload_2         
	//*  53  113:aload_3         
	//*  54  114:invokespecial   #140 <Method void zzzt$zza(zzzt, int, GoogleApiClient, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//*  55  117:astore_3        
	//*  56  118:aload_0         
	//*  57  119:getfield        #21  <Field SparseArray zzayx>
	//*  58  122:iload_1         
	//*  59  123:aload_3         
	//*  60  124:invokevirtual   #144 <Method void SparseArray.put(int, Object)>
	//*  61  127:aload_0         
	//*  62  128:getfield        #61  <Field boolean mStarted>
	//*  63  131:ifeq            185
	//*  64  134:aload_0         
	//*  65  135:getfield        #99  <Field boolean zzayG>
	//*  66  138:ifne            185
	//*  67  141:aload_2         
	//*  68  142:invokestatic    #67  <Method String String.valueOf(Object)>
	//*  69  145:astore_3        
	//*  70  146:ldc1            #27  <String "AutoManageHelper">
	//*  71  148:new             #69  <Class StringBuilder>
	//*  72  151:dup             
	//*  73  152:aload_3         
	//*  74  153:invokestatic    #67  <Method String String.valueOf(Object)>
	//*  75  156:invokevirtual   #72  <Method int String.length()>
	//*  76  159:bipush          11
	//*  77  161:iadd            
	//*  78  162:invokespecial   #75  <Method void StringBuilder(int)>
	//*  79  165:ldc1            #146 <String "connecting ">
	//*  80  167:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//*  81  170:aload_3         
	//*  82  171:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//*  83  174:invokevirtual   #90  <Method String StringBuilder.toString()>
	//*  84  177:invokestatic    #96  <Method int Log.d(String, String)>
	//*  85  180:pop             
	//*  86  181:aload_2         
	//*  87  182:invokevirtual   #108 <Method void GoogleApiClient.connect()>
	//*  88  185:return          
			flag = false;
	//   89  186:iconst_0        
	//   90  187:istore          4
		zzac.zza(flag, ((Object) ((new StringBuilder(54)).append("Already managing a GoogleApiClient with id ").append(i).toString())));
		flag = mStarted;
		flag1 = zzayG;
		Log.d("AutoManageHelper", (new StringBuilder(54)).append("starting AutoManage for client ").append(i).append(" ").append(flag).append(" ").append(flag1).toString());
		onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new zza(i, googleapiclient, onconnectionfailedlistener)));
		zzayx.put(i, ((Object) (onconnectionfailedlistener)));
		if(mStarted && !zzayG)
		{
			onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (String.valueOf(((Object) (googleapiclient)))));
			Log.d("AutoManageHelper", (new StringBuilder(String.valueOf(((Object) (onconnectionfailedlistener))).length() + 11)).append("connecting ").append(((String) (onconnectionfailedlistener))).toString());
			googleapiclient.connect();
		}
	//*  91  189:goto            21
	}

	protected void zza(ConnectionResult connectionresult, int i)
	{
		Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
	//    0    0:ldc1            #27  <String "AutoManageHelper">
	//    1    2:ldc1            #149 <String "Unresolved error while connecting client. Stopping auto-manage.">
	//    2    4:invokestatic    #152 <Method int Log.w(String, String)>
	//    3    7:pop             
		if(i < 0)
	//*   4    8:iload_2         
	//*   5    9:ifge            28
		{
			Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", ((Throwable) (new Exception())));
	//    6   12:ldc1            #27  <String "AutoManageHelper">
	//    7   14:ldc1            #154 <String "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set">
	//    8   16:new             #156 <Class Exception>
	//    9   19:dup             
	//   10   20:invokespecial   #157 <Method void Exception()>
	//   11   23:invokestatic    #161 <Method int Log.wtf(String, String, Throwable)>
	//   12   26:pop             
		} else
	//*  13   27:return          
		{
			Object obj = ((Object) ((zza)zzayx.get(i)));
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field SparseArray zzayx>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #164 <Method Object SparseArray.get(int)>
	//   18   36:checkcast       #6   <Class zzzt$zza>
	//   19   39:astore_3        
			if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          27
			{
				zzcu(i);
	//   22   44:aload_0         
	//   23   45:iload_2         
	//   24   46:invokevirtual   #167 <Method void zzcu(int)>
				obj = ((Object) (((zza) (obj)).zzayA));
	//   25   49:aload_3         
	//   26   50:getfield        #171 <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzzt$zza.zzayA>
	//   27   53:astore_3        
				if(obj != null)
	//*  28   54:aload_3         
	//*  29   55:ifnull          27
				{
					((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
	//   30   58:aload_3         
	//   31   59:aload_1         
	//   32   60:invokeinterface #177 <Method void com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
					return;
	//   33   65:return          
				}
			}
		}
	}

	public void zzcu(int i)
	{
		zza zza1 = (zza)zzayx.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SparseArray zzayx>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #164 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #6   <Class zzzt$zza>
	//    5   11:astore_2        
		zzayx.remove(i);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SparseArray zzayx>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #180 <Method void SparseArray.remove(int)>
		if(zza1 != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          28
			zza1.zzuX();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #183 <Method void zzzt$zza.zzuX()>
	//   14   28:return          
	}

	protected void zzuW()
	{
		for(int i = 0; i < zzayx.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #21  <Field SparseArray zzayx>
	//*   5    7:invokevirtual   #48  <Method int SparseArray.size()>
	//*   6   10:icmpge          37
			((zza)zzayx.valueAt(i)).zzayz.connect();
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field SparseArray zzayx>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   11   21:checkcast       #6   <Class zzzt$zza>
	//   12   24:getfield        #103 <Field GoogleApiClient zzzt$zza.zzayz>
	//   13   27:invokevirtual   #108 <Method void GoogleApiClient.connect()>

	//   14   30:iload_1         
	//   15   31:iconst_1        
	//   16   32:iadd            
	//   17   33:istore_1        
	//*  18   34:goto            2
	//   19   37:return          
	}

	private final SparseArray zzayx = new SparseArray();
}

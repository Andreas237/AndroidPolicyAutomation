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
//			zzaae, zzabf, zzabd

public class zzaaa extends zzaae
{
	class zza
		implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
	{

		public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
		{
			printwriter.append(((CharSequence) (s))).append("GoogleApiClient #").print(zzazO);
		//    0    0:aload_3         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method PrintWriter PrintWriter.append(CharSequence)>
		//    3    5:ldc1            #47  <String "GoogleApiClient #">
		//    4    7:invokevirtual   #45  <Method PrintWriter PrintWriter.append(CharSequence)>
		//    5   10:aload_0         
		//    6   11:getfield        #26  <Field int zzazO>
		//    7   14:invokevirtual   #51  <Method void PrintWriter.print(int)>
			printwriter.println(":");
		//    8   17:aload_3         
		//    9   18:ldc1            #53  <String ":">
		//   10   20:invokevirtual   #57  <Method void PrintWriter.println(String)>
			zzazP.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
		//   11   23:aload_0         
		//   12   24:getfield        #28  <Field GoogleApiClient zzazP>
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
			zzazR.zzb(connectionresult, zzazO);
		//   19   40:aload_0         
		//   20   41:getfield        #21  <Field zzaaa zzazR>
		//   21   44:aload_1         
		//   22   45:aload_0         
		//   23   46:getfield        #26  <Field int zzazO>
		//   24   49:invokevirtual   #103 <Method void zzaaa.zzb(ConnectionResult, int)>
		//   25   52:return          
		}

		public void zzvy()
		{
			zzazP.unregisterConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field GoogleApiClient zzazP>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #108 <Method void GoogleApiClient.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
			zzazP.disconnect();
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field GoogleApiClient zzazP>
		//    6   12:invokevirtual   #111 <Method void GoogleApiClient.disconnect()>
		//    7   15:return          
		}

		public final int zzazO;
		public final GoogleApiClient zzazP;
		public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zzazQ;
		final zzaaa zzazR;

		public zza(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
		{
			zzazR = zzaaa.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field zzaaa zzazR>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			zzazO = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int zzazO>
			zzazP = googleapiclient;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field GoogleApiClient zzazP>
			zzazQ = onconnectionfailedlistener;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzazQ>
			googleapiclient.registerConnectionFailedListener(((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (this)));
		//   14   25:aload_3         
		//   15   26:aload_0         
		//   16   27:invokevirtual   #36  <Method void GoogleApiClient.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		//   17   30:return          
		}
	}


	private zzaaa(zzabf zzabf1)
	{
		super(zzabf1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void zzaae(zzabf)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class SparseArray>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void SparseArray()>
	//    7   13:putfield        #21  <Field SparseArray zzazN>
		zzaCR.zza("AutoManageHelper", ((zzabe) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field zzabf zzaCR>
	//   10   20:ldc1            #27  <String "AutoManageHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #32  <Method void zzabf.zza(String, zzabe)>
	//   13   28:return          
	}

	public static zzaaa zza(zzabd zzabd)
	{
		zzabd = ((zzabd) (zzc(zzabd)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method zzabf zzc(zzabd)>
	//    2    4:astore_0        
		zzaaa zzaaa1 = (zzaaa)((zzabf) (zzabd)).zza("AutoManageHelper", com/google/android/gms/internal/zzaaa);
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <String "AutoManageHelper">
	//    5    8:ldc1            #2   <Class zzaaa>
	//    6   10:invokeinterface #41  <Method zzabe zzabf.zza(String, Class)>
	//    7   15:checkcast       #2   <Class zzaaa>
	//    8   18:astore_1        
		if(zzaaa1 != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          25
			return zzaaa1;
	//   11   23:aload_1         
	//   12   24:areturn         
		else
			return new zzaaa(((zzabf) (zzabd)));
	//   13   25:new             #2   <Class zzaaa>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #42  <Method void zzaaa(zzabf)>
	//   17   33:areturn         
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		for(int i = 0; i < zzazN.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field SparseArray zzazN>
	//*   5    9:invokevirtual   #48  <Method int SparseArray.size()>
	//*   6   12:icmpge          44
			((zza)zzazN.valueAt(i)).dump(s, filedescriptor, printwriter, as);
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field SparseArray zzazN>
	//    9   19:iload           5
	//   10   21:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   11   24:checkcast       #6   <Class zzaaa$zza>
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:aload_3         
	//   15   30:aload           4
	//   16   32:invokevirtual   #54  <Method void zzaaa$zza.dump(String, FileDescriptor, PrintWriter, String[])>

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
	//    1    1:invokespecial   #57  <Method void zzaae.onStart()>
		boolean flag = mStarted;
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field boolean mStarted>
	//    4    8:istore_2        
		String s = String.valueOf(((Object) (zzazN)));
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field SparseArray zzazN>
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
		if(!zzazZ)
	//*  29   61:aload_0         
	//*  30   62:getfield        #99  <Field boolean zzazZ>
	//*  31   65:ifne            105
		{
			for(int i = 0; i < zzazN.size(); i++)
	//*  32   68:iconst_0        
	//*  33   69:istore_1        
	//*  34   70:iload_1         
	//*  35   71:aload_0         
	//*  36   72:getfield        #21  <Field SparseArray zzazN>
	//*  37   75:invokevirtual   #48  <Method int SparseArray.size()>
	//*  38   78:icmpge          105
				((zza)zzazN.valueAt(i)).zzazP.connect();
	//   39   81:aload_0         
	//   40   82:getfield        #21  <Field SparseArray zzazN>
	//   41   85:iload_1         
	//   42   86:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   43   89:checkcast       #6   <Class zzaaa$zza>
	//   44   92:getfield        #103 <Field GoogleApiClient zzaaa$zza.zzazP>
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
	//    1    1:invokespecial   #111 <Method void zzaae.onStop()>
		for(int i = 0; i < zzazN.size(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_1        
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field SparseArray zzazN>
	//*   7   11:invokevirtual   #48  <Method int SparseArray.size()>
	//*   8   14:icmpge          41
			((zza)zzazN.valueAt(i)).zzazP.disconnect();
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field SparseArray zzazN>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   13   25:checkcast       #6   <Class zzaaa$zza>
	//   14   28:getfield        #103 <Field GoogleApiClient zzaaa$zza.zzazP>
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
		if(zzazN.indexOfKey(i) < 0)
	//*   4    7:aload_0         
	//*   5    8:getfield        #21  <Field SparseArray zzazN>
	//*   6   11:iload_1         
	//*   7   12:invokevirtual   #127 <Method int SparseArray.indexOfKey(int)>
	//*   8   15:ifge            24
			flag = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
		else
	//*  11   21:goto            27
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore          4
		zzac.zza(flag, ((Object) ((new StringBuilder(54)).append("Already managing a GoogleApiClient with id ").append(i).toString())));
	//   14   27:iload           4
	//   15   29:new             #69  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:bipush          54
	//   18   35:invokespecial   #75  <Method void StringBuilder(int)>
	//   19   38:ldc1            #129 <String "Already managing a GoogleApiClient with id ">
	//   20   40:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:iload_1         
	//   22   44:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   23   47:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   24   50:invokestatic    #135 <Method void zzac.zza(boolean, Object)>
		flag = mStarted;
	//   25   53:aload_0         
	//   26   54:getfield        #61  <Field boolean mStarted>
	//   27   57:istore          4
		boolean flag1 = zzazZ;
	//   28   59:aload_0         
	//   29   60:getfield        #99  <Field boolean zzazZ>
	//   30   63:istore          5
		Log.d("AutoManageHelper", (new StringBuilder(54)).append("starting AutoManage for client ").append(i).append(" ").append(flag).append(" ").append(flag1).toString());
	//   31   65:ldc1            #27  <String "AutoManageHelper">
	//   32   67:new             #69  <Class StringBuilder>
	//   33   70:dup             
	//   34   71:bipush          54
	//   35   73:invokespecial   #75  <Method void StringBuilder(int)>
	//   36   76:ldc1            #137 <String "starting AutoManage for client ">
	//   37   78:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   38   81:iload_1         
	//   39   82:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   40   85:ldc1            #86  <String " ">
	//   41   87:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   42   90:iload           4
	//   43   92:invokevirtual   #84  <Method StringBuilder StringBuilder.append(boolean)>
	//   44   95:ldc1            #86  <String " ">
	//   45   97:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   46  100:iload           5
	//   47  102:invokevirtual   #84  <Method StringBuilder StringBuilder.append(boolean)>
	//   48  105:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   49  108:invokestatic    #96  <Method int Log.d(String, String)>
	//   50  111:pop             
		onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (new zza(i, googleapiclient, onconnectionfailedlistener)));
	//   51  112:new             #6   <Class zzaaa$zza>
	//   52  115:dup             
	//   53  116:aload_0         
	//   54  117:iload_1         
	//   55  118:aload_2         
	//   56  119:aload_3         
	//   57  120:invokespecial   #140 <Method void zzaaa$zza(zzaaa, int, GoogleApiClient, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   58  123:astore_3        
		zzazN.put(i, ((Object) (onconnectionfailedlistener)));
	//   59  124:aload_0         
	//   60  125:getfield        #21  <Field SparseArray zzazN>
	//   61  128:iload_1         
	//   62  129:aload_3         
	//   63  130:invokevirtual   #144 <Method void SparseArray.put(int, Object)>
		if(mStarted && !zzazZ)
	//*  64  133:aload_0         
	//*  65  134:getfield        #61  <Field boolean mStarted>
	//*  66  137:ifeq            191
	//*  67  140:aload_0         
	//*  68  141:getfield        #99  <Field boolean zzazZ>
	//*  69  144:ifne            191
		{
			onconnectionfailedlistener = ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (String.valueOf(((Object) (googleapiclient)))));
	//   70  147:aload_2         
	//   71  148:invokestatic    #67  <Method String String.valueOf(Object)>
	//   72  151:astore_3        
			Log.d("AutoManageHelper", (new StringBuilder(String.valueOf(((Object) (onconnectionfailedlistener))).length() + 11)).append("connecting ").append(((String) (onconnectionfailedlistener))).toString());
	//   73  152:ldc1            #27  <String "AutoManageHelper">
	//   74  154:new             #69  <Class StringBuilder>
	//   75  157:dup             
	//   76  158:aload_3         
	//   77  159:invokestatic    #67  <Method String String.valueOf(Object)>
	//   78  162:invokevirtual   #72  <Method int String.length()>
	//   79  165:bipush          11
	//   80  167:iadd            
	//   81  168:invokespecial   #75  <Method void StringBuilder(int)>
	//   82  171:ldc1            #146 <String "connecting ">
	//   83  173:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   84  176:aload_3         
	//   85  177:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   86  180:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   87  183:invokestatic    #96  <Method int Log.d(String, String)>
	//   88  186:pop             
			googleapiclient.connect();
	//   89  187:aload_2         
	//   90  188:invokevirtual   #108 <Method void GoogleApiClient.connect()>
		}
	//   91  191:return          
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
			return;
	//   13   27:return          
		}
		Object obj = ((Object) ((zza)zzazN.get(i)));
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field SparseArray zzazN>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #164 <Method Object SparseArray.get(int)>
	//   18   36:checkcast       #6   <Class zzaaa$zza>
	//   19   39:astore_3        
		if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          65
		{
			zzcA(i);
	//   22   44:aload_0         
	//   23   45:iload_2         
	//   24   46:invokevirtual   #167 <Method void zzcA(int)>
			obj = ((Object) (((zza) (obj)).zzazQ));
	//   25   49:aload_3         
	//   26   50:getfield        #171 <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzaaa$zza.zzazQ>
	//   27   53:astore_3        
			if(obj != null)
	//*  28   54:aload_3         
	//*  29   55:ifnull          65
				((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
	//   30   58:aload_3         
	//   31   59:aload_1         
	//   32   60:invokeinterface #177 <Method void com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		}
	//   33   65:return          
	}

	public void zzcA(int i)
	{
		zza zza1 = (zza)zzazN.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SparseArray zzazN>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #164 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #6   <Class zzaaa$zza>
	//    5   11:astore_2        
		zzazN.remove(i);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field SparseArray zzazN>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #180 <Method void SparseArray.remove(int)>
		if(zza1 != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          28
			zza1.zzvy();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #183 <Method void zzaaa$zza.zzvy()>
	//   14   28:return          
	}

	protected void zzvx()
	{
		for(int i = 0; i < zzazN.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #21  <Field SparseArray zzazN>
	//*   5    7:invokevirtual   #48  <Method int SparseArray.size()>
	//*   6   10:icmpge          37
			((zza)zzazN.valueAt(i)).zzazP.connect();
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field SparseArray zzazN>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #52  <Method Object SparseArray.valueAt(int)>
	//   11   21:checkcast       #6   <Class zzaaa$zza>
	//   12   24:getfield        #103 <Field GoogleApiClient zzaaa$zza.zzazP>
	//   13   27:invokevirtual   #108 <Method void GoogleApiClient.connect()>

	//   14   30:iload_1         
	//   15   31:iconst_1        
	//   16   32:iadd            
	//   17   33:istore_1        
	//*  18   34:goto            2
	//   19   37:return          
	}

	private final SparseArray zzazN = new SparseArray();
}

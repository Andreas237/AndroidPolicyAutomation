// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.SafeBrowsingThreat;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzk

public static final class zzk$zzi
	implements com.google.android.gms.safetynet.tApi.SafeBrowsingResult
{

	public final List getDetectedThreats()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #66  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void ArrayList()>
	//    3    7:astore_2        
		Object obj = ((Object) (zzm));
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field String zzm>
	//    6   12:astore_3        
		if(obj == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       19
			return ((List) (arraylist));
	//    9   17:aload_2         
	//   10   18:areturn         
		int i;
		try
		{
			obj = ((Object) ((new JSONObject(((String) (obj)))).getJSONArray("matches")));
	//   11   19:new             #69  <Class JSONObject>
	//   12   22:dup             
	//   13   23:aload_3         
	//   14   24:invokespecial   #72  <Method void JSONObject(String)>
	//   15   27:ldc1            #74  <String "matches">
	//   16   29:invokevirtual   #78  <Method JSONArray JSONObject.getJSONArray(String)>
	//   17   32:astore_3        
		}
	//*  18   33:iconst_0        
	//*  19   34:istore_1        
	//*  20   35:iload_1         
	//*  21   36:aload_3         
	//*  22   37:invokevirtual   #84  <Method int JSONArray.length()>
	//*  23   40:icmpge          77
	//*  24   43:aload_2         
	//*  25   44:new             #86  <Class SafeBrowsingThreat>
	//*  26   47:dup             
	//*  27   48:aload_3         
	//*  28   49:iload_1         
	//*  29   50:invokevirtual   #90  <Method JSONObject JSONArray.getJSONObject(int)>
	//*  30   53:ldc1            #92  <String "threat_type">
	//*  31   55:invokevirtual   #96  <Method String JSONObject.getString(String)>
	//*  32   58:invokestatic    #102 <Method int Integer.parseInt(String)>
	//*  33   61:invokespecial   #103 <Method void SafeBrowsingThreat(int)>
	//*  34   64:invokeinterface #109 <Method boolean List.add(Object)>
	//*  35   69:pop             
	//*  36   70:iload_1         
	//*  37   71:iconst_1        
	//*  38   72:iadd            
	//*  39   73:istore_1        
	//*  40   74:goto            35
	//*  41   77:aload_2         
	//*  42   78:areturn         
		catch(JSONException jsonexception)
	//*  43   79:astore_3        
		{
			return ((List) (arraylist));
	//   44   80:aload_2         
	//   45   81:areturn         
		}
		i = 0;
		if(i >= ((JSONArray) (obj)).length()) goto _L2; else goto _L1
_L1:
		try
		{
			((List) (arraylist)).add(((Object) (new SafeBrowsingThreat(Integer.parseInt(((JSONArray) (obj)).getJSONObject(i).getString("threat_type"))))));
		}
		catch(Object obj1) { }
	//   46   82:astore          4
		i++;
		break MISSING_BLOCK_LABEL_35;
	//   47   84:goto            70
_L2:
		return ((List) (arraylist));
	}

	public final long getLastUpdateTimeMs()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field long zzp>
	//    2    4:lreturn         
	}

	public final String getMetadata()
	{
		return zzm;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String zzm>
	//    2    4:areturn         
	}

	public final byte[] getState()
	{
		return zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field byte[] zzq>
	//    2    4:areturn         
	}

	public final Status getStatus()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Status zzad>
	//    2    4:areturn         
	}

	private Status zzad;
	private final SafeBrowsingData zzan;
	private String zzm;
	private long zzp;
	private byte zzq[];

	public zzk$zzi(Status status, SafeBrowsingData safebrowsingdata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzad = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Status zzad>
		zzan = safebrowsingdata;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field SafeBrowsingData zzan>
		zzm = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field String zzm>
		status = ((Status) (zzan));
	//   11   19:aload_0         
	//   12   20:getfield        #28  <Field SafeBrowsingData zzan>
	//   13   23:astore_1        
		if(status != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          59
		{
			zzm = ((SafeBrowsingData) (status)).getMetadata();
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #36  <Method String SafeBrowsingData.getMetadata()>
	//   19   33:putfield        #30  <Field String zzm>
			zzp = zzan.getLastUpdateTimeMs();
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #28  <Field SafeBrowsingData zzan>
	//   23   41:invokevirtual   #40  <Method long SafeBrowsingData.getLastUpdateTimeMs()>
	//   24   44:putfield        #42  <Field long zzp>
			zzq = zzan.getState();
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #28  <Field SafeBrowsingData zzan>
	//   28   52:invokevirtual   #46  <Method byte[] SafeBrowsingData.getState()>
	//   29   55:putfield        #48  <Field byte[] zzq>
			return;
	//   30   58:return          
		}
		if(zzad.isSuccess())
	//*  31   59:aload_0         
	//*  32   60:getfield        #26  <Field Status zzad>
	//*  33   63:invokevirtual   #54  <Method boolean Status.isSuccess()>
	//*  34   66:ifeq            82
			zzad = new Status(8);
	//   35   69:aload_0         
	//   36   70:new             #50  <Class Status>
	//   37   73:dup             
	//   38   74:bipush          8
	//   39   76:invokespecial   #57  <Method void Status(int)>
	//   40   79:putfield        #26  <Field Status zzad>
	//   41   82:return          
	}
}

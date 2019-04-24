// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.JsonUtils;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcu

public final class zzcb
	implements PlayerInfo
{

	public zzcb(String s, int i, JSONObject jsonobject, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzts = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String zzts>
		zzee = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int zzee>
		zzup = jsonobject;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field JSONObject zzup>
		zzuq = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field boolean zzuq>
	//   14   25:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          78
		{
			if(!(obj instanceof PlayerInfo))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #6   <Class PlayerInfo>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((PlayerInfo)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class PlayerInfo>
	//    9   17:astore_1        
			if(zzuq == ((PlayerInfo) (obj)).isControllable() && zzee == ((PlayerInfo) (obj)).getPlayerState() && zzcu.zza(((Object) (zzts)), ((Object) (((PlayerInfo) (obj)).getPlayerId()))) && JsonUtils.areJsonValuesEquivalent(((Object) (zzup)), ((Object) (((PlayerInfo) (obj)).getPlayerData()))))
	//*  10   18:aload_0         
	//*  11   19:getfield        #27  <Field boolean zzuq>
	//*  12   22:aload_1         
	//*  13   23:invokeinterface #34  <Method boolean PlayerInfo.isControllable()>
	//*  14   28:icmpne          78
	//*  15   31:aload_0         
	//*  16   32:getfield        #23  <Field int zzee>
	//*  17   35:aload_1         
	//*  18   36:invokeinterface #38  <Method int PlayerInfo.getPlayerState()>
	//*  19   41:icmpne          78
	//*  20   44:aload_0         
	//*  21   45:getfield        #21  <Field String zzts>
	//*  22   48:aload_1         
	//*  23   49:invokeinterface #42  <Method String PlayerInfo.getPlayerId()>
	//*  24   54:invokestatic    #48  <Method boolean zzcu.zza(Object, Object)>
	//*  25   57:ifeq            78
	//*  26   60:aload_0         
	//*  27   61:getfield        #25  <Field JSONObject zzup>
	//*  28   64:aload_1         
	//*  29   65:invokeinterface #52  <Method JSONObject PlayerInfo.getPlayerData()>
	//*  30   70:invokestatic    #57  <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//*  31   73:ifeq            78
				return true;
	//   32   76:iconst_1        
	//   33   77:ireturn         
		}
		return false;
	//   34   78:iconst_0        
	//   35   79:ireturn         
	}

	public final JSONObject getPlayerData()
	{
		return zzup;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JSONObject zzup>
	//    2    4:areturn         
	}

	public final String getPlayerId()
	{
		return zzts;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String zzts>
	//    2    4:areturn         
	}

	public final int getPlayerState()
	{
		return zzee;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int zzee>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzts, Integer.valueOf(zzee), zzup, Boolean.valueOf(zzuq)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field String zzts>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #23  <Field int zzee>
	//   11   17:invokestatic    #64  <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #25  <Field JSONObject zzup>
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_3        
	//   20   30:aload_0         
	//   21   31:getfield        #27  <Field boolean zzuq>
	//   22   34:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//   23   37:aastore         
	//   24   38:invokestatic    #74  <Method int Objects.hashCode(Object[])>
	//   25   41:ireturn         
	}

	public final boolean isConnected()
	{
		switch(zzee)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int zzee>
		{
	//*   2    4:tableswitch     3 6: default 36
	//	               3 38
	//	               4 38
	//	               5 38
	//	               6 38
		default:
			return false;
	//    3   36:iconst_0        
	//    4   37:ireturn         

		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			return true;
	//    5   38:iconst_1        
	//    6   39:ireturn         
		}
	}

	public final boolean isControllable()
	{
		return zzuq;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean zzuq>
	//    2    4:ireturn         
	}

	private final int zzee;
	private final String zzts;
	private final JSONObject zzup;
	private final boolean zzuq;
}

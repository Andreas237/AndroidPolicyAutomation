// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import java.io.*;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			Util

public class AdjustAttribution
	implements Serializable
{

	public AdjustAttribution()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	public static AdjustAttribution fromJson(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			AdjustAttribution adjustattribution = new AdjustAttribution();
	//    4    6:new             #2   <Class AdjustAttribution>
	//    5    9:dup             
	//    6   10:invokespecial   #45  <Method void AdjustAttribution()>
	//    7   13:astore_1        
			adjustattribution.trackerToken = jsonobject.optString("tracker_token", ((String) (null)));
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:ldc1            #47  <String "tracker_token">
	//   11   18:aconst_null     
	//   12   19:invokevirtual   #53  <Method String JSONObject.optString(String, String)>
	//   13   22:putfield        #55  <Field String trackerToken>
			adjustattribution.trackerName = jsonobject.optString("tracker_name", ((String) (null)));
	//   14   25:aload_1         
	//   15   26:aload_0         
	//   16   27:ldc1            #57  <String "tracker_name">
	//   17   29:aconst_null     
	//   18   30:invokevirtual   #53  <Method String JSONObject.optString(String, String)>
	//   19   33:putfield        #59  <Field String trackerName>
			adjustattribution.network = jsonobject.optString("network", ((String) (null)));
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:ldc1            #33  <String "network">
	//   23   40:aconst_null     
	//   24   41:invokevirtual   #53  <Method String JSONObject.optString(String, String)>
	//   25   44:putfield        #61  <Field String network>
			adjustattribution.campaign = jsonobject.optString("campaign", ((String) (null)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:ldc1            #34  <String "campaign">
	//   29   51:aconst_null     
	//   30   52:invokevirtual   #53  <Method String JSONObject.optString(String, String)>
	//   31   55:putfield        #63  <Field String campaign>
			adjustattribution.adgroup = jsonobject.optString("adgroup", ((String) (null)));
	//   32   58:aload_1         
	//   33   59:aload_0         
	//   34   60:ldc1            #35  <String "adgroup">
	//   35   62:aconst_null     
	//   36   63:invokevirtual   #53  <Method String JSONObject.optString(String, String)>
	//   37   66:putfield        #65  <Field String adgroup>
			adjustattribution.creative = jsonobject.optString("creative", ((String) (null)));
	//   38   69:aload_1         
	//   39   70:aload_0         
	//   40   71:ldc1            #36  <String "creative">
	//   41   73:aconst_null     
	//   42   74:invokevirtual   #53  <Method String JSONObject.optString(String, String)>
	//   43   77:putfield        #67  <Field String creative>
			adjustattribution.clickLabel = jsonobject.optString("click_label", ((String) (null)));
	//   44   80:aload_1         
	//   45   81:aload_0         
	//   46   82:ldc1            #69  <String "click_label">
	//   47   84:aconst_null     
	//   48   85:invokevirtual   #53  <Method String JSONObject.optString(String, String)>
	//   49   88:putfield        #71  <Field String clickLabel>
			return adjustattribution;
	//   50   91:aload_1         
	//   51   92:areturn         
		}
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws ClassNotFoundException, IOException
	{
		objectinputstream.defaultReadObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #82  <Method void ObjectInputStream.defaultReadObject()>
	//    2    4:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.defaultWriteObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #90  <Method void ObjectOutputStream.defaultWriteObject()>
	//    2    4:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #96  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #96  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AdjustAttribution)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AdjustAttribution>
	//   18   30:astore_1        
		if(!Util.equalString(trackerToken, ((AdjustAttribution) (obj)).trackerToken))
	//*  19   31:aload_0         
	//*  20   32:getfield        #55  <Field String trackerToken>
	//*  21   35:aload_1         
	//*  22   36:getfield        #55  <Field String trackerToken>
	//*  23   39:invokestatic    #102 <Method boolean Util.equalString(String, String)>
	//*  24   42:ifne            47
			return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(!Util.equalString(trackerName, ((AdjustAttribution) (obj)).trackerName))
	//*  27   47:aload_0         
	//*  28   48:getfield        #59  <Field String trackerName>
	//*  29   51:aload_1         
	//*  30   52:getfield        #59  <Field String trackerName>
	//*  31   55:invokestatic    #102 <Method boolean Util.equalString(String, String)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(!Util.equalString(network, ((AdjustAttribution) (obj)).network))
	//*  35   63:aload_0         
	//*  36   64:getfield        #61  <Field String network>
	//*  37   67:aload_1         
	//*  38   68:getfield        #61  <Field String network>
	//*  39   71:invokestatic    #102 <Method boolean Util.equalString(String, String)>
	//*  40   74:ifne            79
			return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		if(!Util.equalString(campaign, ((AdjustAttribution) (obj)).campaign))
	//*  43   79:aload_0         
	//*  44   80:getfield        #63  <Field String campaign>
	//*  45   83:aload_1         
	//*  46   84:getfield        #63  <Field String campaign>
	//*  47   87:invokestatic    #102 <Method boolean Util.equalString(String, String)>
	//*  48   90:ifne            95
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		if(!Util.equalString(adgroup, ((AdjustAttribution) (obj)).adgroup))
	//*  51   95:aload_0         
	//*  52   96:getfield        #65  <Field String adgroup>
	//*  53   99:aload_1         
	//*  54  100:getfield        #65  <Field String adgroup>
	//*  55  103:invokestatic    #102 <Method boolean Util.equalString(String, String)>
	//*  56  106:ifne            111
			return false;
	//   57  109:iconst_0        
	//   58  110:ireturn         
		if(!Util.equalString(creative, ((AdjustAttribution) (obj)).creative))
	//*  59  111:aload_0         
	//*  60  112:getfield        #67  <Field String creative>
	//*  61  115:aload_1         
	//*  62  116:getfield        #67  <Field String creative>
	//*  63  119:invokestatic    #102 <Method boolean Util.equalString(String, String)>
	//*  64  122:ifne            127
			return false;
	//   65  125:iconst_0        
	//   66  126:ireturn         
		return Util.equalString(clickLabel, ((AdjustAttribution) (obj)).clickLabel);
	//   67  127:aload_0         
	//   68  128:getfield        #71  <Field String clickLabel>
	//   69  131:aload_1         
	//   70  132:getfield        #71  <Field String clickLabel>
	//   71  135:invokestatic    #102 <Method boolean Util.equalString(String, String)>
	//   72  138:ifne            143
	//   73  141:iconst_0        
	//   74  142:ireturn         
	//   75  143:iconst_1        
	//   76  144:ireturn         
	}

	public int hashCode()
	{
		return 37 * ((((((629 + Util.hashString(trackerToken)) * 37 + Util.hashString(trackerName)) * 37 + Util.hashString(network)) * 37 + Util.hashString(campaign)) * 37 + Util.hashString(adgroup)) * 37 + Util.hashString(creative)) + Util.hashString(clickLabel);
	//    0    0:bipush          37
	//    1    2:sipush          629
	//    2    5:aload_0         
	//    3    6:getfield        #55  <Field String trackerToken>
	//    4    9:invokestatic    #108 <Method int Util.hashString(String)>
	//    5   12:iadd            
	//    6   13:bipush          37
	//    7   15:imul            
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field String trackerName>
	//   10   20:invokestatic    #108 <Method int Util.hashString(String)>
	//   11   23:iadd            
	//   12   24:bipush          37
	//   13   26:imul            
	//   14   27:aload_0         
	//   15   28:getfield        #61  <Field String network>
	//   16   31:invokestatic    #108 <Method int Util.hashString(String)>
	//   17   34:iadd            
	//   18   35:bipush          37
	//   19   37:imul            
	//   20   38:aload_0         
	//   21   39:getfield        #63  <Field String campaign>
	//   22   42:invokestatic    #108 <Method int Util.hashString(String)>
	//   23   45:iadd            
	//   24   46:bipush          37
	//   25   48:imul            
	//   26   49:aload_0         
	//   27   50:getfield        #65  <Field String adgroup>
	//   28   53:invokestatic    #108 <Method int Util.hashString(String)>
	//   29   56:iadd            
	//   30   57:bipush          37
	//   31   59:imul            
	//   32   60:aload_0         
	//   33   61:getfield        #67  <Field String creative>
	//   34   64:invokestatic    #108 <Method int Util.hashString(String)>
	//   35   67:iadd            
	//   36   68:imul            
	//   37   69:aload_0         
	//   38   70:getfield        #71  <Field String clickLabel>
	//   39   73:invokestatic    #108 <Method int Util.hashString(String)>
	//   40   76:iadd            
	//   41   77:ireturn         
	}

	public String toString()
	{
		return String.format(Locale.US, "tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s", new Object[] {
			trackerToken, trackerName, network, campaign, adgroup, creative, clickLabel
		});
	//    0    0:getstatic       #116 <Field Locale Locale.US>
	//    1    3:ldc1            #118 <String "tt:%s tn:%s net:%s cam:%s adg:%s cre:%s cl:%s">
	//    2    5:bipush          7
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field String trackerToken>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:getfield        #59  <Field String trackerName>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #61  <Field String network>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #63  <Field String campaign>
	//   23   37:aastore         
	//   24   38:dup             
	//   25   39:iconst_4        
	//   26   40:aload_0         
	//   27   41:getfield        #65  <Field String adgroup>
	//   28   44:aastore         
	//   29   45:dup             
	//   30   46:iconst_5        
	//   31   47:aload_0         
	//   32   48:getfield        #67  <Field String creative>
	//   33   51:aastore         
	//   34   52:dup             
	//   35   53:bipush          6
	//   36   55:aload_0         
	//   37   56:getfield        #71  <Field String clickLabel>
	//   38   59:aastore         
	//   39   60:invokestatic    #122 <Method String String.format(Locale, String, Object[])>
	//   40   63:areturn         
	}

	private static final ObjectStreamField serialPersistentFields[] = {
		new ObjectStreamField("trackerToken", java/lang/String), new ObjectStreamField("trackerName", java/lang/String), new ObjectStreamField("network", java/lang/String), new ObjectStreamField("campaign", java/lang/String), new ObjectStreamField("adgroup", java/lang/String), new ObjectStreamField("creative", java/lang/String), new ObjectStreamField("clickLabel", java/lang/String)
	};
	private static final long serialVersionUID = 1L;
	public String adgroup;
	public String campaign;
	public String clickLabel;
	public String creative;
	public String network;
	public String trackerName;
	public String trackerToken;

	static 
	{
	//    0    0:bipush          7
	//    1    2:anewarray       ObjectStreamField[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:new             #24  <Class ObjectStreamField>
	//    5   10:dup             
	//    6   11:ldc1            #25  <String "trackerToken">
	//    7   13:ldc1            #27  <Class String>
	//    8   15:invokespecial   #31  <Method void ObjectStreamField(String, Class)>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:new             #24  <Class ObjectStreamField>
	//   13   24:dup             
	//   14   25:ldc1            #32  <String "trackerName">
	//   15   27:ldc1            #27  <Class String>
	//   16   29:invokespecial   #31  <Method void ObjectStreamField(String, Class)>
	//   17   32:aastore         
	//   18   33:dup             
	//   19   34:iconst_2        
	//   20   35:new             #24  <Class ObjectStreamField>
	//   21   38:dup             
	//   22   39:ldc1            #33  <String "network">
	//   23   41:ldc1            #27  <Class String>
	//   24   43:invokespecial   #31  <Method void ObjectStreamField(String, Class)>
	//   25   46:aastore         
	//   26   47:dup             
	//   27   48:iconst_3        
	//   28   49:new             #24  <Class ObjectStreamField>
	//   29   52:dup             
	//   30   53:ldc1            #34  <String "campaign">
	//   31   55:ldc1            #27  <Class String>
	//   32   57:invokespecial   #31  <Method void ObjectStreamField(String, Class)>
	//   33   60:aastore         
	//   34   61:dup             
	//   35   62:iconst_4        
	//   36   63:new             #24  <Class ObjectStreamField>
	//   37   66:dup             
	//   38   67:ldc1            #35  <String "adgroup">
	//   39   69:ldc1            #27  <Class String>
	//   40   71:invokespecial   #31  <Method void ObjectStreamField(String, Class)>
	//   41   74:aastore         
	//   42   75:dup             
	//   43   76:iconst_5        
	//   44   77:new             #24  <Class ObjectStreamField>
	//   45   80:dup             
	//   46   81:ldc1            #36  <String "creative">
	//   47   83:ldc1            #27  <Class String>
	//   48   85:invokespecial   #31  <Method void ObjectStreamField(String, Class)>
	//   49   88:aastore         
	//   50   89:dup             
	//   51   90:bipush          6
	//   52   92:new             #24  <Class ObjectStreamField>
	//   53   95:dup             
	//   54   96:ldc1            #37  <String "clickLabel">
	//   55   98:ldc1            #27  <Class String>
	//   56  100:invokespecial   #31  <Method void ObjectStreamField(String, Class)>
	//   57  103:aastore         
	//   58  104:putstatic       #39  <Field ObjectStreamField[] serialPersistentFields>
	//*  59  107:return          
	}
}

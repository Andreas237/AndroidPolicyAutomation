// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import java.io.*;
import java.util.*;

// Referenced classes of package com.adjust.sdk:
//			ActivityKind, Util

public class ActivityPackage
	implements Serializable
{

	public ActivityPackage(ActivityKind activitykind)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		activityKind = ActivityKind.UNKNOWN;
	//    2    4:aload_0         
	//    3    5:getstatic       #51  <Field ActivityKind ActivityKind.UNKNOWN>
	//    4    8:putfield        #53  <Field ActivityKind activityKind>
		activityKind = activitykind;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #53  <Field ActivityKind activityKind>
	//    8   16:return          
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws ClassNotFoundException, IOException
	{
		objectinputstream = ((ObjectInputStream) (objectinputstream.readFields()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method java.io.ObjectInputStream$GetField ObjectInputStream.readFields()>
	//    2    4:astore_1        
		path = Util.readStringField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "path", ((String) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #28  <String "path">
	//    6    9:aconst_null     
	//    7   10:invokestatic    #71  <Method String Util.readStringField(java.io.ObjectInputStream$GetField, String, String)>
	//    8   13:putfield        #73  <Field String path>
		clientSdk = Util.readStringField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "clientSdk", ((String) (null)));
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:ldc1            #35  <String "clientSdk">
	//   12   20:aconst_null     
	//   13   21:invokestatic    #71  <Method String Util.readStringField(java.io.ObjectInputStream$GetField, String, String)>
	//   14   24:putfield        #75  <Field String clientSdk>
		parameters = (Map)Util.readObjectField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "parameters", ((Object) (null)));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:ldc1            #36  <String "parameters">
	//   18   31:aconst_null     
	//   19   32:invokestatic    #79  <Method Object Util.readObjectField(java.io.ObjectInputStream$GetField, String, Object)>
	//   20   35:checkcast       #38  <Class Map>
	//   21   38:putfield        #81  <Field Map parameters>
		activityKind = (ActivityKind)Util.readObjectField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "activityKind", ((Object) (ActivityKind.UNKNOWN)));
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:ldc1            #39  <String "activityKind">
	//   25   45:getstatic       #51  <Field ActivityKind ActivityKind.UNKNOWN>
	//   26   48:invokestatic    #79  <Method Object Util.readObjectField(java.io.ObjectInputStream$GetField, String, Object)>
	//   27   51:checkcast       #41  <Class ActivityKind>
	//   28   54:putfield        #53  <Field ActivityKind activityKind>
		suffix = Util.readStringField(((java.io.ObjectInputStream.GetField) (objectinputstream)), "suffix", ((String) (null)));
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:ldc1            #42  <String "suffix">
	//   32   61:aconst_null     
	//   33   62:invokestatic    #71  <Method String Util.readStringField(java.io.ObjectInputStream$GetField, String, String)>
	//   34   65:putfield        #83  <Field String suffix>
	//   35   68:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.defaultWriteObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method void ObjectOutputStream.defaultWriteObject()>
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
	//*  10   14:invokevirtual   #97  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #97  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ActivityPackage)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ActivityPackage>
	//   18   30:astore_1        
		if(!Util.equalString(path, ((ActivityPackage) (obj)).path))
	//*  19   31:aload_0         
	//*  20   32:getfield        #73  <Field String path>
	//*  21   35:aload_1         
	//*  22   36:getfield        #73  <Field String path>
	//*  23   39:invokestatic    #101 <Method boolean Util.equalString(String, String)>
	//*  24   42:ifne            47
			return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(!Util.equalString(clientSdk, ((ActivityPackage) (obj)).clientSdk))
	//*  27   47:aload_0         
	//*  28   48:getfield        #75  <Field String clientSdk>
	//*  29   51:aload_1         
	//*  30   52:getfield        #75  <Field String clientSdk>
	//*  31   55:invokestatic    #101 <Method boolean Util.equalString(String, String)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(!Util.equalsMap(parameters, ((ActivityPackage) (obj)).parameters))
	//*  35   63:aload_0         
	//*  36   64:getfield        #81  <Field Map parameters>
	//*  37   67:aload_1         
	//*  38   68:getfield        #81  <Field Map parameters>
	//*  39   71:invokestatic    #105 <Method boolean Util.equalsMap(Map, Map)>
	//*  40   74:ifne            79
			return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		if(!Util.equalEnum(((Enum) (activityKind)), ((Enum) (((ActivityPackage) (obj)).activityKind))))
	//*  43   79:aload_0         
	//*  44   80:getfield        #53  <Field ActivityKind activityKind>
	//*  45   83:aload_1         
	//*  46   84:getfield        #53  <Field ActivityKind activityKind>
	//*  47   87:invokestatic    #109 <Method boolean Util.equalEnum(Enum, Enum)>
	//*  48   90:ifne            95
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		return Util.equalString(suffix, ((ActivityPackage) (obj)).suffix);
	//   51   95:aload_0         
	//   52   96:getfield        #83  <Field String suffix>
	//   53   99:aload_1         
	//   54  100:getfield        #83  <Field String suffix>
	//   55  103:invokestatic    #101 <Method boolean Util.equalString(String, String)>
	//   56  106:ifne            111
	//   57  109:iconst_0        
	//   58  110:ireturn         
	//   59  111:iconst_1        
	//   60  112:ireturn         
	}

	public ActivityKind getActivityKind()
	{
		return activityKind;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ActivityKind activityKind>
	//    2    4:areturn         
	}

	public String getClientSdk()
	{
		return clientSdk;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String clientSdk>
	//    2    4:areturn         
	}

	public String getExtendedString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #116 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(String.format(Locale.US, "Path:      %s\n", new Object[] {
			path
		}));
	//    4    8:aload_1         
	//    5    9:getstatic       #123 <Field Locale Locale.US>
	//    6   12:ldc1            #125 <String "Path:      %s\n">
	//    7   14:iconst_1        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_0         
	//   12   21:getfield        #73  <Field String path>
	//   13   24:aastore         
	//   14   25:invokestatic    #129 <Method String String.format(Locale, String, Object[])>
	//   15   28:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(String.format(Locale.US, "ClientSdk: %s\n", new Object[] {
			clientSdk
		}));
	//   17   32:aload_1         
	//   18   33:getstatic       #123 <Field Locale Locale.US>
	//   19   36:ldc1            #135 <String "ClientSdk: %s\n">
	//   20   38:iconst_1        
	//   21   39:anewarray       Object[]
	//   22   42:dup             
	//   23   43:iconst_0        
	//   24   44:aload_0         
	//   25   45:getfield        #75  <Field String clientSdk>
	//   26   48:aastore         
	//   27   49:invokestatic    #129 <Method String String.format(Locale, String, Object[])>
	//   28   52:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
		if(parameters != null)
	//*  30   56:aload_0         
	//*  31   57:getfield        #81  <Field Map parameters>
	//*  32   60:ifnull          149
		{
			stringbuilder.append("Parameters:");
	//   33   63:aload_1         
	//   34   64:ldc1            #137 <String "Parameters:">
	//   35   66:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
			java.util.Map.Entry entry;
			for(Iterator iterator = ((SortedMap) (new TreeMap(parameters))).entrySet().iterator(); iterator.hasNext(); stringbuilder.append(String.format(Locale.US, "\n\t%-16s %s", new Object[] {
	entry.getKey(), entry.getValue()
})))
	//*  37   70:new             #139 <Class TreeMap>
	//*  38   73:dup             
	//*  39   74:aload_0         
	//*  40   75:getfield        #81  <Field Map parameters>
	//*  41   78:invokespecial   #142 <Method void TreeMap(Map)>
	//*  42   81:invokeinterface #148 <Method Set SortedMap.entrySet()>
	//*  43   86:invokeinterface #154 <Method Iterator Set.iterator()>
	//*  44   91:astore_2        
	//*  45   92:aload_2         
	//*  46   93:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//*  47   98:ifeq            149
				entry = (java.util.Map.Entry)iterator.next();
	//   48  101:aload_2         
	//   49  102:invokeinterface #164 <Method Object Iterator.next()>
	//   50  107:checkcast       #166 <Class java.util.Map$Entry>
	//   51  110:astore_3        

	//   52  111:aload_1         
	//   53  112:getstatic       #123 <Field Locale Locale.US>
	//   54  115:ldc1            #168 <String "\n\t%-16s %s">
	//   55  117:iconst_2        
	//   56  118:anewarray       Object[]
	//   57  121:dup             
	//   58  122:iconst_0        
	//   59  123:aload_3         
	//   60  124:invokeinterface #171 <Method Object java.util.Map$Entry.getKey()>
	//   61  129:aastore         
	//   62  130:dup             
	//   63  131:iconst_1        
	//   64  132:aload_3         
	//   65  133:invokeinterface #174 <Method Object java.util.Map$Entry.getValue()>
	//   66  138:aastore         
	//   67  139:invokestatic    #129 <Method String String.format(Locale, String, Object[])>
	//   68  142:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   69  145:pop             
		}
	//*  70  146:goto            92
		return stringbuilder.toString();
	//   71  149:aload_1         
	//   72  150:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   73  153:areturn         
	}

	protected String getFailureMessage()
	{
		return String.format(Locale.US, "Failed to track %s%s", new Object[] {
			activityKind.toString(), suffix
		});
	//    0    0:getstatic       #123 <Field Locale Locale.US>
	//    1    3:ldc1            #180 <String "Failed to track %s%s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #53  <Field ActivityKind activityKind>
	//    8   15:invokevirtual   #181 <Method String ActivityKind.toString()>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #83  <Field String suffix>
	//   14   25:aastore         
	//   15   26:invokestatic    #129 <Method String String.format(Locale, String, Object[])>
	//   16   29:areturn         
	}

	public Map getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Map parameters>
	//    2    4:areturn         
	}

	public String getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String path>
	//    2    4:areturn         
	}

	public String getSuffix()
	{
		return suffix;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String suffix>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field int hashCode>
	//*   2    4:ifne            108
		{
			hashCode = 17;
	//    3    7:aload_0         
	//    4    8:bipush          17
	//    5   10:putfield        #190 <Field int hashCode>
			hashCode = hashCode * 37 + Util.hashString(path);
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:getfield        #190 <Field int hashCode>
	//    9   18:bipush          37
	//   10   20:imul            
	//   11   21:aload_0         
	//   12   22:getfield        #73  <Field String path>
	//   13   25:invokestatic    #194 <Method int Util.hashString(String)>
	//   14   28:iadd            
	//   15   29:putfield        #190 <Field int hashCode>
			hashCode = hashCode * 37 + Util.hashString(clientSdk);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #190 <Field int hashCode>
	//   19   37:bipush          37
	//   20   39:imul            
	//   21   40:aload_0         
	//   22   41:getfield        #75  <Field String clientSdk>
	//   23   44:invokestatic    #194 <Method int Util.hashString(String)>
	//   24   47:iadd            
	//   25   48:putfield        #190 <Field int hashCode>
			hashCode = hashCode * 37 + Util.hashMap(parameters);
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #190 <Field int hashCode>
	//   29   56:bipush          37
	//   30   58:imul            
	//   31   59:aload_0         
	//   32   60:getfield        #81  <Field Map parameters>
	//   33   63:invokestatic    #198 <Method int Util.hashMap(Map)>
	//   34   66:iadd            
	//   35   67:putfield        #190 <Field int hashCode>
			hashCode = hashCode * 37 + Util.hashEnum(((Enum) (activityKind)));
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #190 <Field int hashCode>
	//   39   75:bipush          37
	//   40   77:imul            
	//   41   78:aload_0         
	//   42   79:getfield        #53  <Field ActivityKind activityKind>
	//   43   82:invokestatic    #202 <Method int Util.hashEnum(Enum)>
	//   44   85:iadd            
	//   45   86:putfield        #190 <Field int hashCode>
			hashCode = 37 * hashCode + Util.hashString(suffix);
	//   46   89:aload_0         
	//   47   90:bipush          37
	//   48   92:aload_0         
	//   49   93:getfield        #190 <Field int hashCode>
	//   50   96:imul            
	//   51   97:aload_0         
	//   52   98:getfield        #83  <Field String suffix>
	//   53  101:invokestatic    #194 <Method int Util.hashString(String)>
	//   54  104:iadd            
	//   55  105:putfield        #190 <Field int hashCode>
		}
		return hashCode;
	//   56  108:aload_0         
	//   57  109:getfield        #190 <Field int hashCode>
	//   58  112:ireturn         
	}

	public void setClientSdk(String s)
	{
		clientSdk = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field String clientSdk>
	//    3    5:return          
	}

	public void setParameters(Map map)
	{
		parameters = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field Map parameters>
	//    3    5:return          
	}

	public void setPath(String s)
	{
		path = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field String path>
	//    3    5:return          
	}

	public void setSuffix(String s)
	{
		suffix = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field String suffix>
	//    3    5:return          
	}

	public String toString()
	{
		return String.format(Locale.US, "%s%s", new Object[] {
			activityKind.toString(), suffix
		});
	//    0    0:getstatic       #123 <Field Locale Locale.US>
	//    1    3:ldc1            #210 <String "%s%s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #53  <Field ActivityKind activityKind>
	//    8   15:invokevirtual   #181 <Method String ActivityKind.toString()>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #83  <Field String suffix>
	//   14   25:aastore         
	//   15   26:invokestatic    #129 <Method String String.format(Locale, String, Object[])>
	//   16   29:areturn         
	}

	private static final ObjectStreamField serialPersistentFields[] = {
		new ObjectStreamField("path", java/lang/String), new ObjectStreamField("clientSdk", java/lang/String), new ObjectStreamField("parameters", java/util/Map), new ObjectStreamField("activityKind", com/adjust/sdk/ActivityKind), new ObjectStreamField("suffix", java/lang/String)
	};
	private static final long serialVersionUID = 0x3f4b79dfL;
	private ActivityKind activityKind;
	private String clientSdk;
	private transient int hashCode;
	private Map parameters;
	private String path;
	private String suffix;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       ObjectStreamField[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #27  <Class ObjectStreamField>
	//    5    9:dup             
	//    6   10:ldc1            #28  <String "path">
	//    7   12:ldc1            #30  <Class String>
	//    8   14:invokespecial   #34  <Method void ObjectStreamField(String, Class)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:new             #27  <Class ObjectStreamField>
	//   13   23:dup             
	//   14   24:ldc1            #35  <String "clientSdk">
	//   15   26:ldc1            #30  <Class String>
	//   16   28:invokespecial   #34  <Method void ObjectStreamField(String, Class)>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_2        
	//   20   34:new             #27  <Class ObjectStreamField>
	//   21   37:dup             
	//   22   38:ldc1            #36  <String "parameters">
	//   23   40:ldc1            #38  <Class Map>
	//   24   42:invokespecial   #34  <Method void ObjectStreamField(String, Class)>
	//   25   45:aastore         
	//   26   46:dup             
	//   27   47:iconst_3        
	//   28   48:new             #27  <Class ObjectStreamField>
	//   29   51:dup             
	//   30   52:ldc1            #39  <String "activityKind">
	//   31   54:ldc1            #41  <Class ActivityKind>
	//   32   56:invokespecial   #34  <Method void ObjectStreamField(String, Class)>
	//   33   59:aastore         
	//   34   60:dup             
	//   35   61:iconst_4        
	//   36   62:new             #27  <Class ObjectStreamField>
	//   37   65:dup             
	//   38   66:ldc1            #42  <String "suffix">
	//   39   68:ldc1            #30  <Class String>
	//   40   70:invokespecial   #34  <Method void ObjectStreamField(String, Class)>
	//   41   73:aastore         
	//   42   74:putstatic       #44  <Field ObjectStreamField[] serialPersistentFields>
	//*  43   77:return          
	}
}

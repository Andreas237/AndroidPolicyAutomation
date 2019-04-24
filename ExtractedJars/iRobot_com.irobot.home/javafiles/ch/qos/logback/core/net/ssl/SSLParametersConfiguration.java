// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StringCollectionUtil;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.net.ssl:
//			SSLConfigurable

public class SSLParametersConfiguration extends ContextAwareBase
{

	public SSLParametersConfiguration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	private String[] enabledCipherSuites(String as[], String as1[])
	{
		if(enabledCipherSuites == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field String[] enabledCipherSuites>
	//*   2    4:ifnonnull       120
		{
			if(OptionHelper.isEmpty(getIncludedCipherSuites()) && OptionHelper.isEmpty(getExcludedCipherSuites()))
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #27  <Method String getIncludedCipherSuites()>
	//*   5   11:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//*   6   14:ifeq            40
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #36  <Method String getExcludedCipherSuites()>
	//*   9   21:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//*  10   24:ifeq            40
				as = (String[])Arrays.copyOf(((Object []) (as1)), as1.length);
	//   11   27:aload_2         
	//   12   28:aload_2         
	//   13   29:arraylength     
	//   14   30:invokestatic    #42  <Method Object[] Arrays.copyOf(Object[], int)>
	//   15   33:checkcast       #43  <Class String[]>
	//   16   36:astore_1        
			else
	//*  17   37:goto            54
				as = includedStrings(as, getIncludedCipherSuites(), getExcludedCipherSuites());
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:invokevirtual   #27  <Method String getIncludedCipherSuites()>
	//   22   46:aload_0         
	//   23   47:invokevirtual   #36  <Method String getExcludedCipherSuites()>
	//   24   50:invokespecial   #47  <Method String[] includedStrings(String[], String, String)>
	//   25   53:astore_1        
			enabledCipherSuites = as;
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:putfield        #23  <Field String[] enabledCipherSuites>
			as = enabledCipherSuites;
	//   29   59:aload_0         
	//   30   60:getfield        #23  <Field String[] enabledCipherSuites>
	//   31   63:astore_1        
			int j = as.length;
	//   32   64:aload_1         
	//   33   65:arraylength     
	//   34   66:istore          4
			for(int i = 0; i < j; i++)
	//*  35   68:iconst_0        
	//*  36   69:istore_3        
	//*  37   70:iload_3         
	//*  38   71:iload           4
	//*  39   73:icmpge          120
			{
				as1 = ((String []) (as[i]));
	//   40   76:aload_1         
	//   41   77:iload_3         
	//   42   78:aaload          
	//   43   79:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   44   80:new             #49  <Class StringBuilder>
	//   45   83:dup             
	//   46   84:invokespecial   #50  <Method void StringBuilder()>
	//   47   87:astore          5
				stringbuilder.append("enabled cipher suite: ");
	//   48   89:aload           5
	//   49   91:ldc1            #52  <String "enabled cipher suite: ">
	//   50   93:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   51   96:pop             
				stringbuilder.append(((String) (as1)));
	//   52   97:aload           5
	//   53   99:aload_2         
	//   54  100:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   55  103:pop             
				addInfo(stringbuilder.toString());
	//   56  104:aload_0         
	//   57  105:aload           5
	//   58  107:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   59  110:invokevirtual   #63  <Method void addInfo(String)>
			}

	//   60  113:iload_3         
	//   61  114:iconst_1        
	//   62  115:iadd            
	//   63  116:istore_3        
		}
	//*  64  117:goto            70
		return enabledCipherSuites;
	//   65  120:aload_0         
	//   66  121:getfield        #23  <Field String[] enabledCipherSuites>
	//   67  124:areturn         
	}

	private String[] enabledProtocols(String as[], String as1[])
	{
		if(enabledProtocols == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field String[] enabledProtocols>
	//*   2    4:ifnonnull       120
		{
			if(OptionHelper.isEmpty(getIncludedProtocols()) && OptionHelper.isEmpty(getExcludedProtocols()))
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #68  <Method String getIncludedProtocols()>
	//*   5   11:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//*   6   14:ifeq            40
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #71  <Method String getExcludedProtocols()>
	//*   9   21:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//*  10   24:ifeq            40
				as = (String[])Arrays.copyOf(((Object []) (as1)), as1.length);
	//   11   27:aload_2         
	//   12   28:aload_2         
	//   13   29:arraylength     
	//   14   30:invokestatic    #42  <Method Object[] Arrays.copyOf(Object[], int)>
	//   15   33:checkcast       #43  <Class String[]>
	//   16   36:astore_1        
			else
	//*  17   37:goto            54
				as = includedStrings(as, getIncludedProtocols(), getExcludedProtocols());
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:invokevirtual   #68  <Method String getIncludedProtocols()>
	//   22   46:aload_0         
	//   23   47:invokevirtual   #71  <Method String getExcludedProtocols()>
	//   24   50:invokespecial   #47  <Method String[] includedStrings(String[], String, String)>
	//   25   53:astore_1        
			enabledProtocols = as;
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:putfield        #65  <Field String[] enabledProtocols>
			as = enabledProtocols;
	//   29   59:aload_0         
	//   30   60:getfield        #65  <Field String[] enabledProtocols>
	//   31   63:astore_1        
			int j = as.length;
	//   32   64:aload_1         
	//   33   65:arraylength     
	//   34   66:istore          4
			for(int i = 0; i < j; i++)
	//*  35   68:iconst_0        
	//*  36   69:istore_3        
	//*  37   70:iload_3         
	//*  38   71:iload           4
	//*  39   73:icmpge          120
			{
				as1 = ((String []) (as[i]));
	//   40   76:aload_1         
	//   41   77:iload_3         
	//   42   78:aaload          
	//   43   79:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   44   80:new             #49  <Class StringBuilder>
	//   45   83:dup             
	//   46   84:invokespecial   #50  <Method void StringBuilder()>
	//   47   87:astore          5
				stringbuilder.append("enabled protocol: ");
	//   48   89:aload           5
	//   49   91:ldc1            #73  <String "enabled protocol: ">
	//   50   93:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   51   96:pop             
				stringbuilder.append(((String) (as1)));
	//   52   97:aload           5
	//   53   99:aload_2         
	//   54  100:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   55  103:pop             
				addInfo(stringbuilder.toString());
	//   56  104:aload_0         
	//   57  105:aload           5
	//   58  107:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   59  110:invokevirtual   #63  <Method void addInfo(String)>
			}

	//   60  113:iload_3         
	//   61  114:iconst_1        
	//   62  115:iadd            
	//   63  116:istore_3        
		}
	//*  64  117:goto            70
		return enabledProtocols;
	//   65  120:aload_0         
	//   66  121:getfield        #65  <Field String[] enabledProtocols>
	//   67  124:areturn         
	}

	private String[] includedStrings(String as[], String s, String s1)
	{
		ArrayList arraylist = new ArrayList(as.length);
	//    0    0:new             #75  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:invokespecial   #78  <Method void ArrayList(int)>
	//    5    9:astore          4
		((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (as))))));
	//    6   11:aload           4
	//    7   13:aload_1         
	//    8   14:invokestatic    #82  <Method List Arrays.asList(Object[])>
	//    9   17:invokeinterface #88  <Method boolean List.addAll(java.util.Collection)>
	//   10   22:pop             
		if(s != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          37
			StringCollectionUtil.retainMatching(((java.util.Collection) (arraylist)), stringToArray(s));
	//   13   27:aload           4
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:invokespecial   #92  <Method String[] stringToArray(String)>
	//   17   34:invokestatic    #98  <Method void StringCollectionUtil.retainMatching(java.util.Collection, String[])>
		if(s1 != null)
	//*  18   37:aload_3         
	//*  19   38:ifnull          51
			StringCollectionUtil.removeMatching(((java.util.Collection) (arraylist)), stringToArray(s1));
	//   20   41:aload           4
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokespecial   #92  <Method String[] stringToArray(String)>
	//   24   48:invokestatic    #101 <Method void StringCollectionUtil.removeMatching(java.util.Collection, String[])>
		return (String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()])));
	//   25   51:aload           4
	//   26   53:aload           4
	//   27   55:invokeinterface #105 <Method int List.size()>
	//   28   60:anewarray       String[]
	//   29   63:invokeinterface #111 <Method Object[] List.toArray(Object[])>
	//   30   68:checkcast       #43  <Class String[]>
	//   31   71:areturn         
	}

	private String[] stringToArray(String s)
	{
		return s.split("\\s*,\\s*");
	//    0    0:aload_1         
	//    1    1:ldc1            #113 <String "\\s*,\\s*">
	//    2    3:invokevirtual   #116 <Method String[] String.split(String)>
	//    3    6:areturn         
	}

	public void configure(SSLConfigurable sslconfigurable)
	{
		sslconfigurable.setEnabledProtocols(enabledProtocols(sslconfigurable.getSupportedProtocols(), sslconfigurable.getDefaultProtocols()));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokeinterface #124 <Method String[] SSLConfigurable.getSupportedProtocols()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #127 <Method String[] SSLConfigurable.getDefaultProtocols()>
	//    6   14:invokespecial   #129 <Method String[] enabledProtocols(String[], String[])>
	//    7   17:invokeinterface #133 <Method void SSLConfigurable.setEnabledProtocols(String[])>
		sslconfigurable.setEnabledCipherSuites(enabledCipherSuites(sslconfigurable.getSupportedCipherSuites(), sslconfigurable.getDefaultCipherSuites()));
	//    8   22:aload_1         
	//    9   23:aload_0         
	//   10   24:aload_1         
	//   11   25:invokeinterface #136 <Method String[] SSLConfigurable.getSupportedCipherSuites()>
	//   12   30:aload_1         
	//   13   31:invokeinterface #139 <Method String[] SSLConfigurable.getDefaultCipherSuites()>
	//   14   36:invokespecial   #141 <Method String[] enabledCipherSuites(String[], String[])>
	//   15   39:invokeinterface #144 <Method void SSLConfigurable.setEnabledCipherSuites(String[])>
		if(isNeedClientAuth() != null)
	//*  16   44:aload_0         
	//*  17   45:invokevirtual   #148 <Method Boolean isNeedClientAuth()>
	//*  18   48:ifnull          64
			sslconfigurable.setNeedClientAuth(isNeedClientAuth().booleanValue());
	//   19   51:aload_1         
	//   20   52:aload_0         
	//   21   53:invokevirtual   #148 <Method Boolean isNeedClientAuth()>
	//   22   56:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//   23   59:invokeinterface #158 <Method void SSLConfigurable.setNeedClientAuth(boolean)>
		if(isWantClientAuth() != null)
	//*  24   64:aload_0         
	//*  25   65:invokevirtual   #161 <Method Boolean isWantClientAuth()>
	//*  26   68:ifnull          84
			sslconfigurable.setWantClientAuth(isWantClientAuth().booleanValue());
	//   27   71:aload_1         
	//   28   72:aload_0         
	//   29   73:invokevirtual   #161 <Method Boolean isWantClientAuth()>
	//   30   76:invokevirtual   #154 <Method boolean Boolean.booleanValue()>
	//   31   79:invokeinterface #164 <Method void SSLConfigurable.setWantClientAuth(boolean)>
	//   32   84:return          
	}

	public String getExcludedCipherSuites()
	{
		return excludedCipherSuites;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field String excludedCipherSuites>
	//    2    4:areturn         
	}

	public String getExcludedProtocols()
	{
		return excludedProtocols;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field String excludedProtocols>
	//    2    4:areturn         
	}

	public String getIncludedCipherSuites()
	{
		return includedCipherSuites;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field String includedCipherSuites>
	//    2    4:areturn         
	}

	public String getIncludedProtocols()
	{
		return includedProtocols;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field String includedProtocols>
	//    2    4:areturn         
	}

	public Boolean isNeedClientAuth()
	{
		return needClientAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field Boolean needClientAuth>
	//    2    4:areturn         
	}

	public Boolean isWantClientAuth()
	{
		return wantClientAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field Boolean wantClientAuth>
	//    2    4:areturn         
	}

	public void setExcludedCipherSuites(String s)
	{
		excludedCipherSuites = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #166 <Field String excludedCipherSuites>
	//    3    5:return          
	}

	public void setExcludedProtocols(String s)
	{
		excludedProtocols = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field String excludedProtocols>
	//    3    5:return          
	}

	public void setIncludedCipherSuites(String s)
	{
		includedCipherSuites = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #170 <Field String includedCipherSuites>
	//    3    5:return          
	}

	public void setIncludedProtocols(String s)
	{
		includedProtocols = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field String includedProtocols>
	//    3    5:return          
	}

	public void setNeedClientAuth(Boolean boolean1)
	{
		needClientAuth = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #174 <Field Boolean needClientAuth>
	//    3    5:return          
	}

	public void setWantClientAuth(Boolean boolean1)
	{
		wantClientAuth = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field Boolean wantClientAuth>
	//    3    5:return          
	}

	private String enabledCipherSuites[];
	private String enabledProtocols[];
	private String excludedCipherSuites;
	private String excludedProtocols;
	private String includedCipherSuites;
	private String includedProtocols;
	private Boolean needClientAuth;
	private Boolean wantClientAuth;
}

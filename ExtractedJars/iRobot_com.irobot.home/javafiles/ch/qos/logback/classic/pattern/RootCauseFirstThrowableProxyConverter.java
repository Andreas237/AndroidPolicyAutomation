// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ExtendedThrowableProxyConverter

public class RootCauseFirstThrowableProxyConverter extends ExtendedThrowableProxyConverter
{

	public RootCauseFirstThrowableProxyConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ExtendedThrowableProxyConverter()>
	//    2    4:return          
	}

	protected void recursiveAppendRootCauseFirst(StringBuilder stringbuilder, String s, int i, IThrowableProxy ithrowableproxy)
	{
		String s1 = s;
	//    0    0:aload_2         
	//    1    1:astore          7
		if(ithrowableproxy.getCause() != null)
	//*   2    3:aload           4
	//*   3    5:invokeinterface #17  <Method IThrowableProxy IThrowableProxy.getCause()>
	//*   4   10:ifnull          30
		{
			recursiveAppendRootCauseFirst(stringbuilder, s, i, ithrowableproxy.getCause());
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:iload_3         
	//    9   17:aload           4
	//   10   19:invokeinterface #17  <Method IThrowableProxy IThrowableProxy.getCause()>
	//   11   24:invokevirtual   #19  <Method void recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)>
			s1 = null;
	//   12   27:aconst_null     
	//   13   28:astore          7
		}
		ThrowableProxyUtil.indent(stringbuilder, i - 1);
	//   14   30:aload_1         
	//   15   31:iload_3         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:invokestatic    #25  <Method void ThrowableProxyUtil.indent(StringBuilder, int)>
		if(s1 != null)
	//*  19   37:aload           7
	//*  20   39:ifnull          49
			stringbuilder.append(s1);
	//   21   42:aload_1         
	//   22   43:aload           7
	//   23   45:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(stringbuilder, ithrowableproxy);
	//   25   49:aload_1         
	//   26   50:aload           4
	//   27   52:invokestatic    #35  <Method void ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(StringBuilder, IThrowableProxy)>
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   28   55:aload_1         
	//   29   56:getstatic       #41  <Field String CoreConstants.LINE_SEPARATOR>
	//   30   59:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		subjoinSTEPArray(stringbuilder, i, ithrowableproxy);
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:iload_3         
	//   35   66:aload           4
	//   36   68:invokevirtual   #45  <Method void subjoinSTEPArray(StringBuilder, int, IThrowableProxy)>
		s = ((String) (ithrowableproxy.getSuppressed()));
	//   37   71:aload           4
	//   38   73:invokeinterface #49  <Method IThrowableProxy[] IThrowableProxy.getSuppressed()>
	//   39   78:astore_2        
		if(s != null)
	//*  40   79:aload_2         
	//*  41   80:ifnull          120
		{
			int k = s.length;
	//   42   83:aload_2         
	//   43   84:arraylength     
	//   44   85:istore          6
			for(int j = 0; j < k; j++)
	//*  45   87:iconst_0        
	//*  46   88:istore          5
	//*  47   90:iload           5
	//*  48   92:iload           6
	//*  49   94:icmpge          120
				recursiveAppendRootCauseFirst(stringbuilder, "Suppressed: ", i + 1, ((IThrowableProxy) (s[j])));
	//   50   97:aload_0         
	//   51   98:aload_1         
	//   52   99:ldc1            #51  <String "Suppressed: ">
	//   53  101:iload_3         
	//   54  102:iconst_1        
	//   55  103:iadd            
	//   56  104:aload_2         
	//   57  105:iload           5
	//   58  107:aaload          
	//   59  108:invokevirtual   #19  <Method void recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)>

	//   60  111:iload           5
	//   61  113:iconst_1        
	//   62  114:iadd            
	//   63  115:istore          5
		}
	//*  64  117:goto            90
	//   65  120:return          
	}

	protected String throwableProxyToString(IThrowableProxy ithrowableproxy)
	{
		StringBuilder stringbuilder = new StringBuilder(2048);
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          2048
	//    3    7:invokespecial   #56  <Method void StringBuilder(int)>
	//    4   10:astore_2        
		recursiveAppendRootCauseFirst(stringbuilder, ((String) (null)), 1, ithrowableproxy);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:aconst_null     
	//    8   14:iconst_1        
	//    9   15:aload_1         
	//   10   16:invokevirtual   #19  <Method void recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)>
		return stringbuilder.toString();
	//   11   19:aload_2         
	//   12   20:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   13   23:areturn         
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package ch.qos.logback.classic.spi:
//			IThrowableProxy, StackTraceElementProxy

public class ThrowableProxyVO
	implements IThrowableProxy, Serializable
{

	public ThrowableProxyVO()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static ThrowableProxyVO build(IThrowableProxy ithrowableproxy)
	{
		if(ithrowableproxy == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ThrowableProxyVO throwableproxyvo = new ThrowableProxyVO();
	//    4    6:new             #2   <Class ThrowableProxyVO>
	//    5    9:dup             
	//    6   10:invokespecial   #31  <Method void ThrowableProxyVO()>
	//    7   13:astore_2        
		throwableproxyvo.className = ithrowableproxy.getClassName();
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokeinterface #35  <Method String IThrowableProxy.getClassName()>
	//   11   21:putfield        #37  <Field String className>
		throwableproxyvo.message = ithrowableproxy.getMessage();
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:invokeinterface #40  <Method String IThrowableProxy.getMessage()>
	//   15   31:putfield        #42  <Field String message>
		throwableproxyvo.commonFramesCount = ithrowableproxy.getCommonFrames();
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:invokeinterface #46  <Method int IThrowableProxy.getCommonFrames()>
	//   19   41:putfield        #48  <Field int commonFramesCount>
		throwableproxyvo.stackTraceElementProxyArray = ithrowableproxy.getStackTraceElementProxyArray();
	//   20   44:aload_2         
	//   21   45:aload_0         
	//   22   46:invokeinterface #52  <Method StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//   23   51:putfield        #54  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
		IThrowableProxy ithrowableproxy1 = ithrowableproxy.getCause();
	//   24   54:aload_0         
	//   25   55:invokeinterface #58  <Method IThrowableProxy IThrowableProxy.getCause()>
	//   26   60:astore_3        
		if(ithrowableproxy1 != null)
	//*  27   61:aload_3         
	//*  28   62:ifnull          73
			throwableproxyvo.cause = ((IThrowableProxy) (build(ithrowableproxy1)));
	//   29   65:aload_2         
	//   30   66:aload_3         
	//   31   67:invokestatic    #60  <Method ThrowableProxyVO build(IThrowableProxy)>
	//   32   70:putfield        #62  <Field IThrowableProxy cause>
		ithrowableproxy = ((IThrowableProxy) (ithrowableproxy.getSuppressed()));
	//   33   73:aload_0         
	//   34   74:invokeinterface #66  <Method IThrowableProxy[] IThrowableProxy.getSuppressed()>
	//   35   79:astore_0        
		if(ithrowableproxy != null)
	//*  36   80:aload_0         
	//*  37   81:ifnull          120
		{
			throwableproxyvo.suppressed = new IThrowableProxy[ithrowableproxy.length];
	//   38   84:aload_2         
	//   39   85:aload_0         
	//   40   86:arraylength     
	//   41   87:anewarray       IThrowableProxy[]
	//   42   90:putfield        #68  <Field IThrowableProxy[] suppressed>
			for(int i = 0; i < ithrowableproxy.length; i++)
	//*  43   93:iconst_0        
	//*  44   94:istore_1        
	//*  45   95:iload_1         
	//*  46   96:aload_0         
	//*  47   97:arraylength     
	//*  48   98:icmpge          120
				throwableproxyvo.suppressed[i] = ((IThrowableProxy) (build(((IThrowableProxy) (ithrowableproxy[i])))));
	//   49  101:aload_2         
	//   50  102:getfield        #68  <Field IThrowableProxy[] suppressed>
	//   51  105:iload_1         
	//   52  106:aload_0         
	//   53  107:iload_1         
	//   54  108:aaload          
	//   55  109:invokestatic    #60  <Method ThrowableProxyVO build(IThrowableProxy)>
	//   56  112:aastore         

	//   57  113:iload_1         
	//   58  114:iconst_1        
	//   59  115:iadd            
	//   60  116:istore_1        
		}
	//*  61  117:goto            95
		return throwableproxyvo;
	//   62  120:aload_2         
	//   63  121:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
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
	//*  10   14:invokevirtual   #74  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #74  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ThrowableProxyVO)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ThrowableProxyVO>
	//   18   30:astore_1        
		if(className == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #37  <Field String className>
	//*  21   35:ifnonnull       47
		{
			if(((ThrowableProxyVO) (obj)).className != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #37  <Field String className>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!className.equals(((Object) (((ThrowableProxyVO) (obj)).className))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #37  <Field String className>
	//*  29   51:aload_1         
	//*  30   52:getfield        #37  <Field String className>
	//*  31   55:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(!Arrays.equals(((Object []) (stackTraceElementProxyArray)), ((Object []) (((ThrowableProxyVO) (obj)).stackTraceElementProxyArray))))
	//*  35   63:aload_0         
	//*  36   64:getfield        #54  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
	//*  37   67:aload_1         
	//*  38   68:getfield        #54  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
	//*  39   71:invokestatic    #83  <Method boolean Arrays.equals(Object[], Object[])>
	//*  40   74:ifne            79
			return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		if(!Arrays.equals(((Object []) (suppressed)), ((Object []) (((ThrowableProxyVO) (obj)).suppressed))))
	//*  43   79:aload_0         
	//*  44   80:getfield        #68  <Field IThrowableProxy[] suppressed>
	//*  45   83:aload_1         
	//*  46   84:getfield        #68  <Field IThrowableProxy[] suppressed>
	//*  47   87:invokestatic    #83  <Method boolean Arrays.equals(Object[], Object[])>
	//*  48   90:ifne            95
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		if(cause == null)
	//*  51   95:aload_0         
	//*  52   96:getfield        #62  <Field IThrowableProxy cause>
	//*  53   99:ifnonnull       111
		{
			if(((ThrowableProxyVO) (obj)).cause != null)
	//*  54  102:aload_1         
	//*  55  103:getfield        #62  <Field IThrowableProxy cause>
	//*  56  106:ifnull          127
				return false;
	//   57  109:iconst_0        
	//   58  110:ireturn         
		} else
		if(!((Object) (cause)).equals(((Object) (((ThrowableProxyVO) (obj)).cause))))
	//*  59  111:aload_0         
	//*  60  112:getfield        #62  <Field IThrowableProxy cause>
	//*  61  115:aload_1         
	//*  62  116:getfield        #62  <Field IThrowableProxy cause>
	//*  63  119:invokevirtual   #84  <Method boolean Object.equals(Object)>
	//*  64  122:ifne            127
			return false;
	//   65  125:iconst_0        
	//   66  126:ireturn         
		return true;
	//   67  127:iconst_1        
	//   68  128:ireturn         
	}

	public IThrowableProxy getCause()
	{
		return cause;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field IThrowableProxy cause>
	//    2    4:areturn         
	}

	public String getClassName()
	{
		return className;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String className>
	//    2    4:areturn         
	}

	public int getCommonFrames()
	{
		return commonFramesCount;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int commonFramesCount>
	//    2    4:ireturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String message>
	//    2    4:areturn         
	}

	public StackTraceElementProxy[] getStackTraceElementProxyArray()
	{
		return stackTraceElementProxyArray;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
	//    2    4:areturn         
	}

	public IThrowableProxy[] getSuppressed()
	{
		return suppressed;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field IThrowableProxy[] suppressed>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int i;
		if(className == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field String className>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = className.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field String className>
	//    8   16:invokevirtual   #87  <Method int String.hashCode()>
	//    9   19:istore_1        
		return 31 + i;
	//   10   20:bipush          31
	//   11   22:iload_1         
	//   12   23:iadd            
	//   13   24:ireturn         
	}

	private static final long serialVersionUID = 0x5b2763ddL;
	private IThrowableProxy cause;
	private String className;
	private int commonFramesCount;
	private String message;
	private StackTraceElementProxy stackTraceElementProxyArray[];
	private IThrowableProxy suppressed[];
}

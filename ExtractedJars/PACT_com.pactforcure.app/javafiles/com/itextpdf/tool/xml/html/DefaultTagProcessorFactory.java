// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.NoTagProcessorException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			TagProcessorFactory, TagProcessor

public class DefaultTagProcessorFactory
	implements TagProcessorFactory
{
	protected final class FactoryObject
	{

		public String getClassName()
		{
			return className;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String className>
		//    2    4:areturn         
		}

		public TagProcessor getProcessor()
		{
			if(proc == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field TagProcessor proc>
		//*   2    4:ifnonnull       22
				proc = load(className);
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #17  <Field DefaultTagProcessorFactory this$0>
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field String className>
		//    8   16:invokevirtual   #36  <Method TagProcessor DefaultTagProcessorFactory.load(String)>
		//    9   19:putfield        #28  <Field TagProcessor proc>
			return proc;
		//   10   22:aload_0         
		//   11   23:getfield        #28  <Field TagProcessor proc>
		//   12   26:areturn         
		}

		private final String className;
		private TagProcessor proc;
		final DefaultTagProcessorFactory this$0;

		public FactoryObject(String s)
		{
			this$0 = DefaultTagProcessorFactory.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field DefaultTagProcessorFactory this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			className = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String className>
		//    8   14:return          
		}

		public FactoryObject(String s, TagProcessor tagprocessor)
		{
			this(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #26  <Method void DefaultTagProcessorFactory$FactoryObject(DefaultTagProcessorFactory, String)>
			proc = tagprocessor;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #28  <Field TagProcessor proc>
		//    7   11:return          
		}
	}


	public DefaultTagProcessorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #21  <Field Map map>
	//    7   15:return          
	}

	public transient void addProcessor(TagProcessor tagprocessor, String as[])
	{
		int j = as.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          27
			addProcessor(as[i], tagprocessor);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:iload_3         
	//   11   15:aaload          
	//   12   16:aload_1         
	//   13   17:invokevirtual   #27  <Method void addProcessor(String, TagProcessor)>

	//   14   20:iload_3         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_3        
	//*  18   24:goto            6
	//   19   27:return          
	}

	public void addProcessor(String s, TagProcessor tagprocessor)
	{
		map.put(((Object) (s)), ((Object) (new FactoryObject(((Object) (tagprocessor)).getClass().getName(), tagprocessor))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map map>
	//    2    4:aload_1         
	//    3    5:new             #8   <Class DefaultTagProcessorFactory$FactoryObject>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #31  <Method Class Object.getClass()>
	//    8   14:invokevirtual   #37  <Method String Class.getName()>
	//    9   17:aload_2         
	//   10   18:invokespecial   #40  <Method void DefaultTagProcessorFactory$FactoryObject(DefaultTagProcessorFactory, String, TagProcessor)>
	//   11   21:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addProcessor(String s, String s1)
	{
		map.put(((Object) (s)), ((Object) (new FactoryObject(s1))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map map>
	//    2    4:aload_1         
	//    3    5:new             #8   <Class DefaultTagProcessorFactory$FactoryObject>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #50  <Method void DefaultTagProcessorFactory$FactoryObject(DefaultTagProcessorFactory, String)>
	//    8   14:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public transient void addProcessor(String s, String as[])
	{
		int j = as.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          27
			addProcessor(as[i], s);
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:iload_3         
	//   11   15:aaload          
	//   12   16:aload_1         
	//   13   17:invokevirtual   #53  <Method void addProcessor(String, String)>

	//   14   20:iload_3         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_3        
	//*  18   24:goto            6
	//   19   27:return          
	}

	public TagProcessor getProcessor(String s, String s1)
	{
		s1 = ((String) ((FactoryObject)map.get(((Object) (s.toLowerCase())))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method String String.toLowerCase()>
	//    4    8:invokeinterface #64  <Method Object Map.get(Object)>
	//    5   13:checkcast       #8   <Class DefaultTagProcessorFactory$FactoryObject>
	//    6   16:astore_2        
		if(s1 != null)
	//*   7   17:aload_2         
	//*   8   18:ifnull          26
			return ((FactoryObject) (s1)).getProcessor();
	//    9   21:aload_2         
	//   10   22:invokevirtual   #67  <Method TagProcessor DefaultTagProcessorFactory$FactoryObject.getProcessor()>
	//   11   25:areturn         
		else
			throw new NoTagProcessorException(s);
	//   12   26:new             #69  <Class NoTagProcessorException>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:invokespecial   #72  <Method void NoTagProcessorException(String)>
	//   16   34:athrow          
	}

	protected TagProcessor load(String s)
		throws NoTagProcessorException
	{
		TagProcessor tagprocessor;
		try
		{
			tagprocessor = (TagProcessor)Class.forName(s).newInstance();
	//    0    0:aload_1         
	//    1    1:invokestatic    #86  <Method Class Class.forName(String)>
	//    2    4:invokevirtual   #90  <Method Object Class.newInstance()>
	//    3    7:checkcast       #92  <Class TagProcessor>
	//    4   10:astore_2        
		}
	//*   5   11:aload_2         
	//*   6   12:areturn         
		catch(LinkageError linkageerror)
	//*   7   13:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}));
	//    8   14:new             #69  <Class NoTagProcessorException>
	//    9   17:dup             
	//   10   18:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   11   21:ldc1            #100 <String "tag.noprocessor">
	//   12   23:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   13   26:iconst_1        
	//   14   27:anewarray       Object[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:aload_1         
	//   18   33:aastore         
	//   19   34:invokestatic    #108 <Method String String.format(String, Object[])>
	//   20   37:invokespecial   #72  <Method void NoTagProcessorException(String)>
	//   21   40:athrow          
		}
		catch(ClassNotFoundException classnotfoundexception)
	//*  22   41:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}), ((Exception) (classnotfoundexception)));
	//   23   42:new             #69  <Class NoTagProcessorException>
	//   24   45:dup             
	//   25   46:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   26   49:ldc1            #100 <String "tag.noprocessor">
	//   27   51:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   28   54:iconst_1        
	//   29   55:anewarray       Object[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:aload_1         
	//   33   61:aastore         
	//   34   62:invokestatic    #108 <Method String String.format(String, Object[])>
	//   35   65:aload_2         
	//   36   66:invokespecial   #111 <Method void NoTagProcessorException(String, Exception)>
	//   37   69:athrow          
		}
		catch(InstantiationException instantiationexception)
	//*  38   70:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}), ((Exception) (instantiationexception)));
	//   39   71:new             #69  <Class NoTagProcessorException>
	//   40   74:dup             
	//   41   75:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   42   78:ldc1            #100 <String "tag.noprocessor">
	//   43   80:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   44   83:iconst_1        
	//   45   84:anewarray       Object[]
	//   46   87:dup             
	//   47   88:iconst_0        
	//   48   89:aload_1         
	//   49   90:aastore         
	//   50   91:invokestatic    #108 <Method String String.format(String, Object[])>
	//   51   94:aload_2         
	//   52   95:invokespecial   #111 <Method void NoTagProcessorException(String, Exception)>
	//   53   98:athrow          
		}
		catch(IllegalAccessException illegalaccessexception)
	//*  54   99:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}), ((Exception) (illegalaccessexception)));
	//   55  100:new             #69  <Class NoTagProcessorException>
	//   56  103:dup             
	//   57  104:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   58  107:ldc1            #100 <String "tag.noprocessor">
	//   59  109:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   60  112:iconst_1        
	//   61  113:anewarray       Object[]
	//   62  116:dup             
	//   63  117:iconst_0        
	//   64  118:aload_1         
	//   65  119:aastore         
	//   66  120:invokestatic    #108 <Method String String.format(String, Object[])>
	//   67  123:aload_2         
	//   68  124:invokespecial   #111 <Method void NoTagProcessorException(String, Exception)>
	//   69  127:athrow          
		}
		return tagprocessor;
	}

	protected TagProcessor load(String s, ClassLoader classloader)
		throws NoTagProcessorException
	{
		try
		{
			classloader = ((ClassLoader) ((TagProcessor)classloader.loadClass(s).newInstance()));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method Class ClassLoader.loadClass(String)>
	//    3    5:invokevirtual   #90  <Method Object Class.newInstance()>
	//    4    8:checkcast       #92  <Class TagProcessor>
	//    5   11:astore_2        
		}
	//*   6   12:aload_2         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*   8   14:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}));
	//    9   15:new             #69  <Class NoTagProcessorException>
	//   10   18:dup             
	//   11   19:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   12   22:ldc1            #100 <String "tag.noprocessor">
	//   13   24:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   14   27:iconst_1        
	//   15   28:anewarray       Object[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:aload_1         
	//   19   34:aastore         
	//   20   35:invokestatic    #108 <Method String String.format(String, Object[])>
	//   21   38:invokespecial   #72  <Method void NoTagProcessorException(String)>
	//   22   41:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  23   42:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}), ((Exception) (classloader)));
	//   24   43:new             #69  <Class NoTagProcessorException>
	//   25   46:dup             
	//   26   47:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   27   50:ldc1            #100 <String "tag.noprocessor">
	//   28   52:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   29   55:iconst_1        
	//   30   56:anewarray       Object[]
	//   31   59:dup             
	//   32   60:iconst_0        
	//   33   61:aload_1         
	//   34   62:aastore         
	//   35   63:invokestatic    #108 <Method String String.format(String, Object[])>
	//   36   66:aload_2         
	//   37   67:invokespecial   #111 <Method void NoTagProcessorException(String, Exception)>
	//   38   70:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  39   71:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}), ((Exception) (classloader)));
	//   40   72:new             #69  <Class NoTagProcessorException>
	//   41   75:dup             
	//   42   76:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   43   79:ldc1            #100 <String "tag.noprocessor">
	//   44   81:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   45   84:iconst_1        
	//   46   85:anewarray       Object[]
	//   47   88:dup             
	//   48   89:iconst_0        
	//   49   90:aload_1         
	//   50   91:aastore         
	//   51   92:invokestatic    #108 <Method String String.format(String, Object[])>
	//   52   95:aload_2         
	//   53   96:invokespecial   #111 <Method void NoTagProcessorException(String, Exception)>
	//   54   99:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  55  100:astore_2        
		{
			throw new NoTagProcessorException(String.format(LocaleMessages.getInstance().getMessage("tag.noprocessor"), new Object[] {
				s
			}), ((Exception) (classloader)));
	//   56  101:new             #69  <Class NoTagProcessorException>
	//   57  104:dup             
	//   58  105:invokestatic    #98  <Method LocaleMessages LocaleMessages.getInstance()>
	//   59  108:ldc1            #100 <String "tag.noprocessor">
	//   60  110:invokevirtual   #104 <Method String LocaleMessages.getMessage(String)>
	//   61  113:iconst_1        
	//   62  114:anewarray       Object[]
	//   63  117:dup             
	//   64  118:iconst_0        
	//   65  119:aload_1         
	//   66  120:aastore         
	//   67  121:invokestatic    #108 <Method String String.format(String, Object[])>
	//   68  124:aload_2         
	//   69  125:invokespecial   #111 <Method void NoTagProcessorException(String, Exception)>
	//   70  128:athrow          
		}
		return ((TagProcessor) (classloader));
	}

	public void removeProcessor(String s)
	{
		map.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map map>
	//    2    4:aload_1         
	//    3    5:invokeinterface #122 <Method Object Map.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private final Map map = new ConcurrentHashMap();
}

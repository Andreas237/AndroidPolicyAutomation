// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.tool.xml.CustomContext;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.css.apply.MarginMemory;
import com.itextpdf.tool.xml.css.apply.PageSizeContainable;
import com.itextpdf.tool.xml.exceptions.NoDataException;
import com.itextpdf.tool.xml.html.*;
import java.nio.charset.Charset;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.pipeline.html:
//			StackKeeper, NoStackException, ImageProvider, LinkProvider

public class HtmlPipelineContext
	implements CustomContext, Cloneable, MarginMemory, PageSizeContainable, CssAppliersAware
{

	public HtmlPipelineContext(CssAppliers cssappliers)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		acceptUnknown = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #55  <Field boolean acceptUnknown>
	//    5    9:aload_0         
	//    6   10:new             #57  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #58  <Method void ArrayList()>
	//    9   17:putfield        #60  <Field List ctn>
		pageSize = PageSize.A4;
	//   10   20:aload_0         
	//   11   21:getstatic       #65  <Field Rectangle PageSize.A4>
	//   12   24:putfield        #67  <Field Rectangle pageSize>
		roottags = Arrays.asList(((Object []) (new String[] {
			"body", "div"
		})));
	//   13   27:aload_0         
	//   14   28:iconst_2        
	//   15   29:anewarray       String[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:ldc1            #71  <String "body">
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_1        
	//   22   39:ldc1            #73  <String "div">
	//   23   41:aastore         
	//   24   42:invokestatic    #79  <Method List Arrays.asList(Object[])>
	//   25   45:putfield        #81  <Field List roottags>
		autoBookmark = true;
	//   26   48:aload_0         
	//   27   49:iconst_1        
	//   28   50:putfield        #83  <Field boolean autoBookmark>
	//   29   53:aload_0         
	//   30   54:new             #85  <Class LinkedList>
	//   31   57:dup             
	//   32   58:invokespecial   #86  <Method void LinkedList()>
	//   33   61:putfield        #88  <Field LinkedList queue>
	//   34   64:aload_0         
	//   35   65:new             #90  <Class HashMap>
	//   36   68:dup             
	//   37   69:invokespecial   #91  <Method void HashMap()>
	//   38   72:putfield        #93  <Field Map memory>
		cssAppliers = cssappliers;
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:putfield        #95  <Field CssAppliers cssAppliers>
		if(cssAppliers == null)
	//*  42   80:aload_0         
	//*  43   81:getfield        #95  <Field CssAppliers cssAppliers>
	//*  44   84:ifnonnull       105
			cssAppliers = ((CssAppliers) (new CssAppliersImpl(((com.itextpdf.text.FontProvider) (new XMLWorkerFontProvider())))));
	//   45   87:aload_0         
	//   46   88:new             #97  <Class CssAppliersImpl>
	//   47   91:dup             
	//   48   92:new             #99  <Class XMLWorkerFontProvider>
	//   49   95:dup             
	//   50   96:invokespecial   #100 <Method void XMLWorkerFontProvider()>
	//   51   99:invokespecial   #103 <Method void CssAppliersImpl(com.itextpdf.text.FontProvider)>
	//   52  102:putfield        #95  <Field CssAppliers cssAppliers>
	//   53  105:return          
	}

	public boolean acceptUnknown()
	{
		return acceptUnknown;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean acceptUnknown>
	//    2    4:ireturn         
	}

	protected void addFirst(StackKeeper stackkeeper)
	{
		queue.addFirst(((Object) (stackkeeper)));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field LinkedList queue>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method void LinkedList.addFirst(Object)>
	//    4    8:return          
	}

	public HtmlPipelineContext autoBookmark(boolean flag)
	{
		autoBookmark = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field boolean autoBookmark>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean autoBookmark()
	{
		return autoBookmark;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean autoBookmark>
	//    2    4:ireturn         
	}

	public HtmlPipelineContext charSet(Charset charset1)
	{
		charset = charset1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field Charset charset>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Charset charSet()
	{
		return charset;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Charset charset>
	//    2    4:areturn         
	}

	public HtmlPipelineContext clone()
		throws CloneNotSupportedException
	{
		CssAppliers cssappliers = cssAppliers.clone();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field CssAppliers cssAppliers>
	//    2    4:invokeinterface #125 <Method CssAppliers CssAppliers.clone()>
	//    3    9:astore_1        
		HtmlPipelineContext htmlpipelinecontext = new HtmlPipelineContext(cssappliers);
	//    4   10:new             #2   <Class HtmlPipelineContext>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokespecial   #127 <Method void HtmlPipelineContext(CssAppliers)>
	//    8   18:astore_2        
		if(imageProvider != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #129 <Field ImageProvider imageProvider>
	//*  11   23:ifnull          35
			htmlpipelinecontext.setImageProvider(imageProvider);
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #129 <Field ImageProvider imageProvider>
	//   15   31:invokevirtual   #133 <Method HtmlPipelineContext setImageProvider(ImageProvider)>
	//   16   34:pop             
		if(resourcesRootPath != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #135 <Field String resourcesRootPath>
	//*  19   39:ifnull          50
			htmlpipelinecontext.setResourcesRootPath(resourcesRootPath);
	//   20   42:aload_2         
	//   21   43:aload_0         
	//   22   44:getfield        #135 <Field String resourcesRootPath>
	//   23   47:invokevirtual   #139 <Method void setResourcesRootPath(String)>
		if(charset != null)
	//*  24   50:aload_0         
	//*  25   51:getfield        #115 <Field Charset charset>
	//*  26   54:ifnull          72
			htmlpipelinecontext.charSet(Charset.forName(charset.name()));
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:getfield        #115 <Field Charset charset>
	//   30   62:invokevirtual   #145 <Method String Charset.name()>
	//   31   65:invokestatic    #149 <Method Charset Charset.forName(String)>
	//   32   68:invokevirtual   #151 <Method HtmlPipelineContext charSet(Charset)>
	//   33   71:pop             
		htmlpipelinecontext.setPageSize(new Rectangle(pageSize)).setLinkProvider(linkprovider).setRootTags(((List) (new ArrayList(((java.util.Collection) (roottags)))))).autoBookmark(autoBookmark).setTagFactory(tagFactory).setAcceptUnknown(acceptUnknown).setCssApplier(cssappliers);
	//   34   72:aload_2         
	//   35   73:new             #153 <Class Rectangle>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:getfield        #67  <Field Rectangle pageSize>
	//   39   81:invokespecial   #156 <Method void Rectangle(Rectangle)>
	//   40   84:invokevirtual   #160 <Method HtmlPipelineContext setPageSize(Rectangle)>
	//   41   87:aload_0         
	//   42   88:getfield        #162 <Field LinkProvider linkprovider>
	//   43   91:invokevirtual   #166 <Method HtmlPipelineContext setLinkProvider(LinkProvider)>
	//   44   94:new             #57  <Class ArrayList>
	//   45   97:dup             
	//   46   98:aload_0         
	//   47   99:getfield        #81  <Field List roottags>
	//   48  102:invokespecial   #169 <Method void ArrayList(java.util.Collection)>
	//   49  105:invokevirtual   #173 <Method HtmlPipelineContext setRootTags(List)>
	//   50  108:aload_0         
	//   51  109:getfield        #83  <Field boolean autoBookmark>
	//   52  112:invokevirtual   #175 <Method HtmlPipelineContext autoBookmark(boolean)>
	//   53  115:aload_0         
	//   54  116:getfield        #177 <Field TagProcessorFactory tagFactory>
	//   55  119:invokevirtual   #181 <Method HtmlPipelineContext setTagFactory(TagProcessorFactory)>
	//   56  122:aload_0         
	//   57  123:getfield        #55  <Field boolean acceptUnknown>
	//   58  126:invokevirtual   #184 <Method HtmlPipelineContext setAcceptUnknown(boolean)>
	//   59  129:aload_1         
	//   60  130:invokevirtual   #188 <Method HtmlPipelineContext setCssApplier(CssAppliers)>
	//   61  133:pop             
		return htmlpipelinecontext;
	//   62  134:aload_2         
	//   63  135:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #192 <Method HtmlPipelineContext clone()>
	//    2    4:areturn         
	}

	protected List currentContent()
	{
		return ctn;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List ctn>
	//    2    4:areturn         
	}

	public CssAppliers getCssAppliers()
	{
		return cssAppliers;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field CssAppliers cssAppliers>
	//    2    4:areturn         
	}

	public ImageProvider getImageProvider()
	{
		return imageProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field ImageProvider imageProvider>
	//    2    4:areturn         
	}

	public Float getLastMarginBottom()
		throws NoDataException
	{
		Object obj = getMemory().get("lastMarginBottom");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method Map getMemory()>
	//    2    4:ldc1            #21  <String "lastMarginBottom">
	//    3    6:invokeinterface #213 <Method Object Map.get(Object)>
	//    4   11:astore_1        
		if(obj == null)
	//*   5   12:aload_1         
	//*   6   13:ifnonnull       24
			throw new NoDataException();
	//    7   16:new             #203 <Class NoDataException>
	//    8   19:dup             
	//    9   20:invokespecial   #214 <Method void NoDataException()>
	//   10   23:athrow          
		else
			return (Float)obj;
	//   11   24:aload_1         
	//   12   25:checkcast       #216 <Class Float>
	//   13   28:areturn         
	}

	public LinkProvider getLinkProvider()
	{
		return linkprovider;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field LinkProvider linkprovider>
	//    2    4:areturn         
	}

	public Map getMemory()
	{
		return memory;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Map memory>
	//    2    4:areturn         
	}

	public Rectangle getPageSize()
	{
		return pageSize;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Rectangle pageSize>
	//    2    4:areturn         
	}

	public String getResourcesRootPath()
	{
		return resourcesRootPath;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field String resourcesRootPath>
	//    2    4:areturn         
	}

	public List getRootTags()
	{
		return roottags;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field List roottags>
	//    2    4:areturn         
	}

	protected boolean isEmpty()
	{
		return queue.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field LinkedList queue>
	//    2    4:invokevirtual   #227 <Method boolean LinkedList.isEmpty()>
	//    3    7:ireturn         
	}

	protected StackKeeper peek()
	{
		if(!queue.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field LinkedList queue>
	//*   2    4:invokevirtual   #227 <Method boolean LinkedList.isEmpty()>
	//*   3    7:ifne            21
			return (StackKeeper)queue.getFirst();
	//    4   10:aload_0         
	//    5   11:getfield        #88  <Field LinkedList queue>
	//    6   14:invokevirtual   #232 <Method Object LinkedList.getFirst()>
	//    7   17:checkcast       #234 <Class StackKeeper>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	protected StackKeeper poll()
		throws NoStackException
	{
		StackKeeper stackkeeper;
		try
		{
			stackkeeper = (StackKeeper)queue.removeFirst();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field LinkedList queue>
	//    2    4:invokevirtual   #242 <Method Object LinkedList.removeFirst()>
	//    3    7:checkcast       #234 <Class StackKeeper>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		catch(NoSuchElementException nosuchelementexception)
	//*   7   13:astore_1        
		{
			throw new NoStackException();
	//    8   14:new             #237 <Class NoStackException>
	//    9   17:dup             
	//   10   18:invokespecial   #243 <Method void NoStackException()>
	//   11   21:athrow          
		}
		return stackkeeper;
	}

	protected TagProcessor resolveProcessor(String s, String s1)
	{
		s = ((String) (tagFactory.getProcessor(s, s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field TagProcessorFactory tagFactory>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #250 <Method TagProcessor TagProcessorFactory.getProcessor(String, String)>
	//    5   11:astore_1        
		if(s instanceof CssAppliersAware)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #14  <Class CssAppliersAware>
	//*   8   16:ifeq            32
			((CssAppliersAware)s).setCssAppliers(cssAppliers);
	//    9   19:aload_1         
	//   10   20:checkcast       #14  <Class CssAppliersAware>
	//   11   23:aload_0         
	//   12   24:getfield        #95  <Field CssAppliers cssAppliers>
	//   13   27:invokeinterface #253 <Method void CssAppliersAware.setCssAppliers(CssAppliers)>
		return ((TagProcessor) (s));
	//   14   32:aload_1         
	//   15   33:areturn         
	}

	public HtmlPipelineContext setAcceptUnknown(boolean flag)
	{
		acceptUnknown = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field boolean acceptUnknown>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public HtmlPipelineContext setCssApplier(CssAppliers cssappliers)
	{
		cssAppliers = cssappliers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field CssAppliers cssAppliers>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setCssAppliers(CssAppliers cssappliers)
	{
		cssAppliers = cssappliers;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field CssAppliers cssAppliers>
	//    3    5:return          
	}

	public HtmlPipelineContext setImageProvider(ImageProvider imageprovider)
	{
		imageProvider = imageprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field ImageProvider imageProvider>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setLastMarginBottom(Float float1)
	{
		getMemory().put("lastMarginBottom", ((Object) (float1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method Map getMemory()>
	//    2    4:ldc1            #21  <String "lastMarginBottom">
	//    3    6:aload_1         
	//    4    7:invokeinterface #259 <Method Object Map.put(Object, Object)>
	//    5   12:pop             
	//    6   13:return          
	}

	public HtmlPipelineContext setLinkProvider(LinkProvider linkprovider1)
	{
		linkprovider = linkprovider1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field LinkProvider linkprovider>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public HtmlPipelineContext setPageSize(Rectangle rectangle)
	{
		pageSize = rectangle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Rectangle pageSize>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setResourcesRootPath(String s)
	{
		resourcesRootPath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field String resourcesRootPath>
	//    3    5:return          
	}

	public HtmlPipelineContext setRootTags(List list)
	{
		roottags = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field List roottags>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public HtmlPipelineContext setTagFactory(TagProcessorFactory tagprocessorfactory)
	{
		tagFactory = tagprocessorfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #177 <Field TagProcessorFactory tagFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final String BOOKMARK_TREE = "header.autobookmark.RootNode";
	public static final String LAST_MARGIN_BOTTOM = "lastMarginBottom";
	private boolean acceptUnknown;
	private boolean autoBookmark;
	private Charset charset;
	private CssAppliers cssAppliers;
	private final List ctn = new ArrayList();
	private ImageProvider imageProvider;
	private LinkProvider linkprovider;
	private final Map memory = new HashMap();
	private Rectangle pageSize;
	private final LinkedList queue = new LinkedList();
	private String resourcesRootPath;
	private List roottags;
	private TagProcessorFactory tagFactory;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.tagvalue;

import cn.com.fmsh.communication.message.enumerate.ETagType;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package cn.com.fmsh.communication.message.tagvalue:
//			StringValueHandler4asc, StringValueHandler4cn, StringValueHandler4utf, StringValueHandler4hex, 
//			StringValueHandler4gbk, StringValueHandler

public class HandlerFactory
{

	private HandlerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		stringValueHandler = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:putfield        #18  <Field Map stringValueHandler>
		stringValueHandlerInit();
	//    7   15:aload_0         
	//    8   16:invokespecial   #21  <Method void stringValueHandlerInit()>
	//    9   19:return          
	}

	public static HandlerFactory instance()
	{
		if(handlerFactory == null)
	//*   0    0:getstatic       #26  <Field HandlerFactory handlerFactory>
	//*   1    3:ifnonnull       16
			handlerFactory = new HandlerFactory();
	//    2    6:new             #2   <Class HandlerFactory>
	//    3    9:dup             
	//    4   10:invokespecial   #27  <Method void HandlerFactory()>
	//    5   13:putstatic       #26  <Field HandlerFactory handlerFactory>
		return handlerFactory;
	//    6   16:getstatic       #26  <Field HandlerFactory handlerFactory>
	//    7   19:areturn         
	}

	private void stringValueHandlerInit()
	{
		stringValueHandler.put(((Object) (ETagType.S)), ((Object) (new StringValueHandler4asc())));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map stringValueHandler>
	//    2    4:getstatic       #33  <Field ETagType ETagType.S>
	//    3    7:new             #35  <Class StringValueHandler4asc>
	//    4   10:dup             
	//    5   11:invokespecial   #36  <Method void StringValueHandler4asc()>
	//    6   14:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//    7   19:pop             
		stringValueHandler.put(((Object) (ETagType.N)), ((Object) (new StringValueHandler4cn())));
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field Map stringValueHandler>
	//   10   24:getstatic       #45  <Field ETagType ETagType.N>
	//   11   27:new             #47  <Class StringValueHandler4cn>
	//   12   30:dup             
	//   13   31:invokespecial   #48  <Method void StringValueHandler4cn()>
	//   14   34:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   15   39:pop             
		stringValueHandler.put(((Object) (ETagType.U)), ((Object) (new StringValueHandler4utf())));
	//   16   40:aload_0         
	//   17   41:getfield        #18  <Field Map stringValueHandler>
	//   18   44:getstatic       #51  <Field ETagType ETagType.U>
	//   19   47:new             #53  <Class StringValueHandler4utf>
	//   20   50:dup             
	//   21   51:invokespecial   #54  <Method void StringValueHandler4utf()>
	//   22   54:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   23   59:pop             
		stringValueHandler.put(((Object) (ETagType.H)), ((Object) (new StringValueHandler4hex())));
	//   24   60:aload_0         
	//   25   61:getfield        #18  <Field Map stringValueHandler>
	//   26   64:getstatic       #57  <Field ETagType ETagType.H>
	//   27   67:new             #59  <Class StringValueHandler4hex>
	//   28   70:dup             
	//   29   71:invokespecial   #60  <Method void StringValueHandler4hex()>
	//   30   74:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   31   79:pop             
		stringValueHandler.put(((Object) (ETagType.G)), ((Object) (new StringValueHandler4gbk())));
	//   32   80:aload_0         
	//   33   81:getfield        #18  <Field Map stringValueHandler>
	//   34   84:getstatic       #63  <Field ETagType ETagType.G>
	//   35   87:new             #65  <Class StringValueHandler4gbk>
	//   36   90:dup             
	//   37   91:invokespecial   #66  <Method void StringValueHandler4gbk()>
	//   38   94:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   39   99:pop             
	//   40  100:return          
	}

	public StringValueHandler getStringValueHandle(ETagType etagtype)
	{
		return (StringValueHandler)stringValueHandler.get(((Object) (etagtype)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map stringValueHandler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #72  <Method Object Map.get(Object)>
	//    4   10:checkcast       #74  <Class StringValueHandler>
	//    5   13:areturn         
	}

	private static HandlerFactory handlerFactory;
	private Map stringValueHandler;
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			BeanDeserializer, SettableBeanProperty, UnresolvedForwardReference

static class BeanDeserializer$BeanReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
{

	public void handleResolvedForwardReference(Object obj, Object obj1)
		throws IOException
	{
		if(_bean == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Object _bean>
	//*   2    4:ifnonnull       49
		{
			obj = ((Object) (_context));
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field DeserializationContext _context>
	//    5   11:astore_1        
			SettableBeanProperty settablebeanproperty = _prop;
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field SettableBeanProperty _prop>
	//    8   16:astore_3        
			((DeserializationContext) (obj)).reportInputMismatch(((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty)), "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", new Object[] {
				settablebeanproperty.getName(), _prop.getDeclaringClass().getName()
			});
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:ldc1            #31  <String "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved">
	//   12   21:iconst_2        
	//   13   22:anewarray       Object[]
	//   14   25:dup             
	//   15   26:iconst_0        
	//   16   27:aload_3         
	//   17   28:invokevirtual   #39  <Method String SettableBeanProperty.getName()>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_1        
	//   21   34:aload_0         
	//   22   35:getfield        #22  <Field SettableBeanProperty _prop>
	//   23   38:invokevirtual   #43  <Method Class SettableBeanProperty.getDeclaringClass()>
	//   24   41:invokevirtual   #46  <Method String Class.getName()>
	//   25   44:aastore         
	//   26   45:invokevirtual   #52  <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.BeanProperty, String, Object[])>
	//   27   48:pop             
		}
		_prop.set(_bean, obj1);
	//   28   49:aload_0         
	//   29   50:getfield        #22  <Field SettableBeanProperty _prop>
	//   30   53:aload_0         
	//   31   54:getfield        #29  <Field Object _bean>
	//   32   57:aload_2         
	//   33   58:invokevirtual   #55  <Method void SettableBeanProperty.set(Object, Object)>
	//   34   61:return          
	}

	public void setBean(Object obj)
	{
		_bean = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Object _bean>
	//    3    5:return          
	}

	private Object _bean;
	private final DeserializationContext _context;
	private final SettableBeanProperty _prop;

	BeanDeserializer$BeanReferring(DeserializationContext deserializationcontext, UnresolvedForwardReference unresolvedforwardreference, JavaType javatype, PropertyValueBuffer propertyvaluebuffer, SettableBeanProperty settablebeanproperty)
	{
		super(unresolvedforwardreference, javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #18  <Method void com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring(UnresolvedForwardReference, JavaType)>
		_context = deserializationcontext;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #20  <Field DeserializationContext _context>
		_prop = settablebeanproperty;
	//    7   11:aload_0         
	//    8   12:aload           5
	//    9   14:putfield        #22  <Field SettableBeanProperty _prop>
	//   10   17:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;

public class MergingSettableBeanProperty extends com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
{

	protected MergingSettableBeanProperty(SettableBeanProperty settablebeanproperty, AnnotatedMember annotatedmember)
	{
		super(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating(SettableBeanProperty)>
		_accessor = annotatedmember;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field AnnotatedMember _accessor>
	//    6   10:return          
	}

	public static MergingSettableBeanProperty construct(SettableBeanProperty settablebeanproperty, AnnotatedMember annotatedmember)
	{
		return new MergingSettableBeanProperty(settablebeanproperty, annotatedmember);
	//    0    0:new             #2   <Class MergingSettableBeanProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #22  <Method void MergingSettableBeanProperty(SettableBeanProperty, AnnotatedMember)>
	//    5    9:areturn         
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		Object obj1 = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnnotatedMember _accessor>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #32  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore          4
		if(obj1 == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       28
			jsonparser = ((JsonParser) (_flddelegate.deserialize(jsonparser, deserializationcontext)));
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #42  <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//   12   24:astore_1        
		else
	//*  13   25:goto            40
			jsonparser = ((JsonParser) (_flddelegate.deserializeWith(jsonparser, deserializationcontext, obj1)));
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:aload           4
	//   19   36:invokevirtual   #46  <Method Object SettableBeanProperty.deserializeWith(JsonParser, DeserializationContext, Object)>
	//   20   39:astore_1        
		if(jsonparser != obj1)
	//*  21   40:aload_1         
	//*  22   41:aload           4
	//*  23   43:if_acmpeq       55
			_flddelegate.set(obj, ((Object) (jsonparser)));
	//   24   46:aload_0         
	//   25   47:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//   26   50:aload_3         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #50  <Method void SettableBeanProperty.set(Object, Object)>
	//   29   55:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		Object obj1 = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnnotatedMember _accessor>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #32  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore          4
		if(obj1 == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       28
			jsonparser = ((JsonParser) (_flddelegate.deserialize(jsonparser, deserializationcontext)));
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #42  <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//   12   24:astore_1        
		else
	//*  13   25:goto            40
			jsonparser = ((JsonParser) (_flddelegate.deserializeWith(jsonparser, deserializationcontext, obj1)));
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:aload           4
	//   19   36:invokevirtual   #46  <Method Object SettableBeanProperty.deserializeWith(JsonParser, DeserializationContext, Object)>
	//   20   39:astore_1        
		if(jsonparser != obj1 && jsonparser != null)
	//*  21   40:aload_1         
	//*  22   41:aload           4
	//*  23   43:if_acmpeq       60
	//*  24   46:aload_1         
	//*  25   47:ifnull          60
			return _flddelegate.setAndReturn(obj, ((Object) (jsonparser)));
	//   26   50:aload_0         
	//   27   51:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//   28   54:aload_3         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #56  <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//   31   59:areturn         
		else
			return obj;
	//   32   60:aload_3         
	//   33   61:areturn         
	}

	public void set(Object obj, Object obj1)
		throws IOException
	{
		if(obj1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			_flddelegate.set(obj, obj1);
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #50  <Method void SettableBeanProperty.set(Object, Object)>
	//    7   13:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		if(obj1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          14
			return _flddelegate.setAndReturn(obj, obj1);
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field SettableBeanProperty _flddelegate>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #56  <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//    7   13:areturn         
		else
			return obj;
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	protected SettableBeanProperty withDelegate(SettableBeanProperty settablebeanproperty)
	{
		return ((SettableBeanProperty) (new MergingSettableBeanProperty(settablebeanproperty, _accessor)));
	//    0    0:new             #2   <Class MergingSettableBeanProperty>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field AnnotatedMember _accessor>
	//    5    9:invokespecial   #22  <Method void MergingSettableBeanProperty(SettableBeanProperty, AnnotatedMember)>
	//    6   12:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMember _accessor;
}

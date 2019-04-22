// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			UnresolvedId

public class UnresolvedForwardReference extends JsonMappingException
{

	public UnresolvedForwardReference(JsonParser jsonparser, String s)
	{
		super(((java.io.Closeable) (jsonparser)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void JsonMappingException(java.io.Closeable, String)>
		_unresolvedIds = ((List) (new ArrayList()));
	//    4    6:aload_0         
	//    5    7:new             #20  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #23  <Method void ArrayList()>
	//    8   14:putfield        #25  <Field List _unresolvedIds>
	//    9   17:return          
	}

	public UnresolvedForwardReference(JsonParser jsonparser, String s, JsonLocation jsonlocation, ReadableObjectId readableobjectid)
	{
		super(((java.io.Closeable) (jsonparser)), s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #30  <Method void JsonMappingException(java.io.Closeable, String, JsonLocation)>
		_roid = readableobjectid;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #32  <Field ReadableObjectId _roid>
	//    8   13:return          
	}

	public void addUnresolvedId(Object obj, Class class1, JsonLocation jsonlocation)
	{
		_unresolvedIds.add(((Object) (new UnresolvedId(obj, class1, jsonlocation))));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List _unresolvedIds>
	//    2    4:new             #36  <Class UnresolvedId>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #38  <Method void UnresolvedId(Object, Class, JsonLocation)>
	//    8   14:invokeinterface #44  <Method boolean List.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public String getMessage()
	{
		Object obj = ((Object) (super.getMessage()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method String JsonMappingException.getMessage()>
	//    2    4:astore_1        
		if(_unresolvedIds == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field List _unresolvedIds>
	//*   5    9:ifnonnull       14
			return ((String) (obj));
	//    6   12:aload_1         
	//    7   13:areturn         
		obj = ((Object) (new StringBuilder(((String) (obj)))));
	//    8   14:new             #52  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #55  <Method void StringBuilder(String)>
	//   12   22:astore_1        
		Iterator iterator = _unresolvedIds.iterator();
	//   13   23:aload_0         
	//   14   24:getfield        #25  <Field List _unresolvedIds>
	//   15   27:invokeinterface #59  <Method Iterator List.iterator()>
	//   16   32:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   17   33:aload_2         
	//   18   34:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//   19   39:ifeq            78
			((StringBuilder) (obj)).append(((UnresolvedId)iterator.next()).toString());
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:invokeinterface #69  <Method Object Iterator.next()>
	//   23   49:checkcast       #36  <Class UnresolvedId>
	//   24   52:invokevirtual   #72  <Method String UnresolvedId.toString()>
	//   25   55:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   26   58:pop             
			if(iterator.hasNext())
	//*  27   59:aload_2         
	//*  28   60:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*  29   65:ifeq            33
				((StringBuilder) (obj)).append(", ");
	//   30   68:aload_1         
	//   31   69:ldc1            #78  <String ", ">
	//   32   71:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   33   74:pop             
		} while(true);
	//   34   75:goto            33
		((StringBuilder) (obj)).append('.');
	//   35   78:aload_1         
	//   36   79:bipush          46
	//   37   81:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   38   84:pop             
		return ((StringBuilder) (obj)).toString();
	//   39   85:aload_1         
	//   40   86:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   41   89:areturn         
	}

	public ReadableObjectId getRoid()
	{
		return _roid;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ReadableObjectId _roid>
	//    2    4:areturn         
	}

	public Object getUnresolvedId()
	{
		return _roid.getKey().key;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ReadableObjectId _roid>
	//    2    4:invokevirtual   #91  <Method com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey ReadableObjectId.getKey()>
	//    3    7:getfield        #97  <Field Object com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey.key>
	//    4   10:areturn         
	}

	private static final long serialVersionUID = 1L;
	private ReadableObjectId _roid;
	private List _unresolvedIds;
}

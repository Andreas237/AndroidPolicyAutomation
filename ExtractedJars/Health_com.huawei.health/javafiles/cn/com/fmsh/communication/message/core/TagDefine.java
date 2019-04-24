// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.core;

import cn.com.fmsh.communication.message.enumerate.ETagType;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package cn.com.fmsh.communication.message.core:
//			TagItemDefine

class TagDefine
{

	public TagDefine()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		tagItems = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List tagItems>
	//    7   15:return          
	}

	public void addTagItem(TagItemDefine tagitemdefine)
	{
		if(tagitemdefine != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			tagItems.add(((Object) (tagitemdefine)));
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field List tagItems>
	//    4    8:aload_1         
	//    5    9:invokeinterface #33  <Method boolean List.add(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public String getDesc()
	{
		return desc;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String desc>
	//    2    4:areturn         
	}

	public byte getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field byte id>
	//    2    4:ireturn         
	}

	public int getLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int length>
	//    2    4:ireturn         
	}

	public TagItemDefine[] getTagItemDefines()
	{
		return (TagItemDefine[])tagItems.toArray(((Object []) (new TagItemDefine[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List tagItems>
	//    2    4:iconst_0        
	//    3    5:anewarray       TagItemDefine[]
	//    4    8:invokeinterface #53  <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #55  <Class TagItemDefine[]>
	//    6   16:areturn         
	}

	public ETagType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ETagType type>
	//    2    4:areturn         
	}

	public void setDesc(String s)
	{
		desc = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String desc>
	//    3    5:return          
	}

	public void setId(byte byte0)
	{
		id = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field byte id>
	//    3    5:return          
	}

	public void setLength(int i)
	{
		length = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int length>
	//    3    5:return          
	}

	public void setType(ETagType etagtype)
	{
		type = etagtype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field ETagType type>
	//    3    5:return          
	}

	private String desc;
	private byte id;
	private int length;
	private List tagItems;
	private ETagType type;
}

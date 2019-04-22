// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public class BinaryNode extends ValueNode
{

	public BinaryNode(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ValueNode()>
		_data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field byte[] _data>
	//    5    9:return          
	}

	public BinaryNode(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ValueNode()>
		if(i == 0 && j == abyte0.length)
	//*   2    4:iload_2         
	//*   3    5:ifne            20
	//*   4    8:iload_3         
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:icmpne          20
		{
			_data = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #21  <Field byte[] _data>
			return;
	//   11   19:return          
		} else
		{
			_data = new byte[j];
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:newarray        byte[]
	//   15   24:putfield        #21  <Field byte[] _data>
			System.arraycopy(((Object) (abyte0)), i, ((Object) (_data)), 0, j);
	//   16   27:aload_1         
	//   17   28:iload_2         
	//   18   29:aload_0         
	//   19   30:getfield        #21  <Field byte[] _data>
	//   20   33:iconst_0        
	//   21   34:iload_3         
	//   22   35:invokestatic    #28  <Method void System.arraycopy(Object, int, Object, int, int)>
			return;
	//   23   38:return          
		}
	}

	public static BinaryNode valueOf(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(abyte0.length == 0)
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:ifne            15
			return EMPTY_BINARY_NODE;
	//    7   11:getstatic       #16  <Field BinaryNode EMPTY_BINARY_NODE>
	//    8   14:areturn         
		else
			return new BinaryNode(abyte0);
	//    9   15:new             #2   <Class BinaryNode>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #14  <Method void BinaryNode(byte[])>
	//   13   23:areturn         
	}

	public static BinaryNode valueOf(byte abyte0[], int i, int j)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(j == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            14
			return EMPTY_BINARY_NODE;
	//    6   10:getstatic       #16  <Field BinaryNode EMPTY_BINARY_NODE>
	//    7   13:areturn         
		else
			return new BinaryNode(abyte0, i, j);
	//    8   14:new             #2   <Class BinaryNode>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:invokespecial   #33  <Method void BinaryNode(byte[], int, int)>
	//   14   24:areturn         
	}

	public String asText()
	{
		return Base64Variants.getDefaultVariant().encode(_data, false);
	//    0    0:invokestatic    #41  <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    1    3:aload_0         
	//    2    4:getfield        #21  <Field byte[] _data>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #47  <Method String Base64Variant.encode(byte[], boolean)>
	//    5   11:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_EMBEDDED_OBJECT;
	//    0    0:getstatic       #55  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
	{
		return _data;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field byte[] _data>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
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
		if(!(obj instanceof BinaryNode))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class BinaryNode>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		else
			return Arrays.equals(((BinaryNode)obj)._data, _data);
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class BinaryNode>
	//   16   26:getfield        #21  <Field byte[] _data>
	//   17   29:aload_0         
	//   18   30:getfield        #21  <Field byte[] _data>
	//   19   33:invokestatic    #64  <Method boolean Arrays.equals(byte[], byte[])>
	//   20   36:ireturn         
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.BINARY;
	//    0    0:getstatic       #72  <Field JsonNodeType JsonNodeType.BINARY>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		byte abyte0[] = _data;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field byte[] _data>
	//    2    4:astore_1        
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return abyte0.length;
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.getConfig().getBase64Variant()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #86  <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:invokevirtual   #91  <Method Base64Variant SerializationConfig.getBase64Variant()>
	//    3    7:astore_2        
		byte abyte0[] = _data;
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field byte[] _data>
	//    6   12:astore_3        
		jsongenerator.writeBinary(((Base64Variant) (serializerprovider)), abyte0, 0, abyte0.length);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_0        
	//   11   17:aload_3         
	//   12   18:arraylength     
	//   13   19:invokevirtual   #97  <Method void JsonGenerator.writeBinary(Base64Variant, byte[], int, int)>
	//   14   22:return          
	}

	public String toString()
	{
		return Base64Variants.getDefaultVariant().encode(_data, true);
	//    0    0:invokestatic    #41  <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    1    3:aload_0         
	//    2    4:getfield        #21  <Field byte[] _data>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #47  <Method String Base64Variant.encode(byte[], boolean)>
	//    5   11:areturn         
	}

	static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
	protected final byte _data[];

	static 
	{
	//    0    0:new             #2   <Class BinaryNode>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:newarray        byte[]
	//    4    7:invokespecial   #14  <Method void BinaryNode(byte[])>
	//    5   10:putstatic       #16  <Field BinaryNode EMPTY_BINARY_NODE>
	//*   6   13:return          
	}
}

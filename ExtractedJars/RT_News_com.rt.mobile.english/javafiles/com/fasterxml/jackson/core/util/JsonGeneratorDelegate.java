// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonGeneratorDelegate extends JsonGenerator
{

	public JsonGeneratorDelegate(JsonGenerator jsongenerator)
	{
		this(jsongenerator, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #13  <Method void JsonGeneratorDelegate(JsonGenerator, boolean)>
	//    4    6:return          
	}

	public JsonGeneratorDelegate(JsonGenerator jsongenerator, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void JsonGenerator()>
		_flddelegate = jsongenerator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field JsonGenerator _flddelegate>
		delegateCopyMethods = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean delegateCopyMethods>
	//    8   14:return          
	}

	public boolean canOmitFields()
	{
		return _flddelegate.canOmitFields();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #25  <Method boolean JsonGenerator.canOmitFields()>
	//    3    7:ireturn         
	}

	public boolean canUseSchema(FormatSchema formatschema)
	{
		return _flddelegate.canUseSchema(formatschema);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method boolean JsonGenerator.canUseSchema(FormatSchema)>
	//    4    8:ireturn         
	}

	public boolean canWriteBinaryNatively()
	{
		return _flddelegate.canWriteBinaryNatively();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #32  <Method boolean JsonGenerator.canWriteBinaryNatively()>
	//    3    7:ireturn         
	}

	public boolean canWriteObjectId()
	{
		return _flddelegate.canWriteObjectId();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #35  <Method boolean JsonGenerator.canWriteObjectId()>
	//    3    7:ireturn         
	}

	public boolean canWriteTypeId()
	{
		return _flddelegate.canWriteTypeId();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #38  <Method boolean JsonGenerator.canWriteTypeId()>
	//    3    7:ireturn         
	}

	public void close()
		throws IOException
	{
		_flddelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #43  <Method void JsonGenerator.close()>
	//    3    7:return          
	}

	public void copyCurrentEvent(JsonParser jsonparser)
		throws IOException
	{
		if(delegateCopyMethods)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean delegateCopyMethods>
	//*   2    4:ifeq            16
		{
			_flddelegate.copyCurrentEvent(jsonparser);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #48  <Method void JsonGenerator.copyCurrentEvent(JsonParser)>
			return;
	//    7   15:return          
		} else
		{
			super.copyCurrentEvent(jsonparser);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #48  <Method void JsonGenerator.copyCurrentEvent(JsonParser)>
			return;
	//   11   21:return          
		}
	}

	public void copyCurrentStructure(JsonParser jsonparser)
		throws IOException
	{
		if(delegateCopyMethods)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean delegateCopyMethods>
	//*   2    4:ifeq            16
		{
			_flddelegate.copyCurrentStructure(jsonparser);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #51  <Method void JsonGenerator.copyCurrentStructure(JsonParser)>
			return;
	//    7   15:return          
		} else
		{
			super.copyCurrentStructure(jsonparser);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #51  <Method void JsonGenerator.copyCurrentStructure(JsonParser)>
			return;
	//   11   21:return          
		}
	}

	public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		_flddelegate.disable(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		_flddelegate.enable(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method JsonGenerator JsonGenerator.enable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public void flush()
		throws IOException
	{
		_flddelegate.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #61  <Method void JsonGenerator.flush()>
	//    3    7:return          
	}

	public CharacterEscapes getCharacterEscapes()
	{
		return _flddelegate.getCharacterEscapes();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #65  <Method CharacterEscapes JsonGenerator.getCharacterEscapes()>
	//    3    7:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _flddelegate.getCodec();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #69  <Method ObjectCodec JsonGenerator.getCodec()>
	//    3    7:areturn         
	}

	public Object getCurrentValue()
	{
		return _flddelegate.getCurrentValue();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #73  <Method Object JsonGenerator.getCurrentValue()>
	//    3    7:areturn         
	}

	public JsonGenerator getDelegate()
	{
		return _flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:areturn         
	}

	public int getFeatureMask()
	{
		return _flddelegate.getFeatureMask();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #79  <Method int JsonGenerator.getFeatureMask()>
	//    3    7:ireturn         
	}

	public int getHighestEscapedChar()
	{
		return _flddelegate.getHighestEscapedChar();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #82  <Method int JsonGenerator.getHighestEscapedChar()>
	//    3    7:ireturn         
	}

	public int getOutputBuffered()
	{
		return _flddelegate.getOutputBuffered();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #85  <Method int JsonGenerator.getOutputBuffered()>
	//    3    7:ireturn         
	}

	public JsonStreamContext getOutputContext()
	{
		return _flddelegate.getOutputContext();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #89  <Method JsonStreamContext JsonGenerator.getOutputContext()>
	//    3    7:areturn         
	}

	public Object getOutputTarget()
	{
		return _flddelegate.getOutputTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #92  <Method Object JsonGenerator.getOutputTarget()>
	//    3    7:areturn         
	}

	public PrettyPrinter getPrettyPrinter()
	{
		return _flddelegate.getPrettyPrinter();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #96  <Method PrettyPrinter JsonGenerator.getPrettyPrinter()>
	//    3    7:areturn         
	}

	public FormatSchema getSchema()
	{
		return _flddelegate.getSchema();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #100 <Method FormatSchema JsonGenerator.getSchema()>
	//    3    7:areturn         
	}

	public boolean isClosed()
	{
		return _flddelegate.isClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #103 <Method boolean JsonGenerator.isClosed()>
	//    3    7:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		return _flddelegate.isEnabled(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #107 <Method boolean JsonGenerator.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    4    8:ireturn         
	}

	public JsonGenerator overrideFormatFeatures(int i, int j)
	{
		_flddelegate.overrideFormatFeatures(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #111 <Method JsonGenerator JsonGenerator.overrideFormatFeatures(int, int)>
	//    5    9:pop             
		return ((JsonGenerator) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public JsonGenerator overrideStdFeatures(int i, int j)
	{
		_flddelegate.overrideStdFeatures(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #114 <Method JsonGenerator JsonGenerator.overrideStdFeatures(int, int)>
	//    5    9:pop             
		return ((JsonGenerator) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
	{
		_flddelegate.setCharacterEscapes(characterescapes);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #118 <Method JsonGenerator JsonGenerator.setCharacterEscapes(CharacterEscapes)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public JsonGenerator setCodec(ObjectCodec objectcodec)
	{
		_flddelegate.setCodec(objectcodec);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #122 <Method JsonGenerator JsonGenerator.setCodec(ObjectCodec)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_flddelegate.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #126 <Method void JsonGenerator.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonGenerator setFeatureMask(int i)
	{
		_flddelegate.setFeatureMask(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #131 <Method JsonGenerator JsonGenerator.setFeatureMask(int)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public JsonGenerator setHighestNonEscapedChar(int i)
	{
		_flddelegate.setHighestNonEscapedChar(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method JsonGenerator JsonGenerator.setHighestNonEscapedChar(int)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public JsonGenerator setPrettyPrinter(PrettyPrinter prettyprinter)
	{
		_flddelegate.setPrettyPrinter(prettyprinter);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #139 <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
	{
		_flddelegate.setRootValueSeparator(serializablestring);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #143 <Method JsonGenerator JsonGenerator.setRootValueSeparator(SerializableString)>
	//    4    8:pop             
		return ((JsonGenerator) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public void setSchema(FormatSchema formatschema)
	{
		_flddelegate.setSchema(formatschema);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method void JsonGenerator.setSchema(FormatSchema)>
	//    4    8:return          
	}

	public JsonGenerator useDefaultPrettyPrinter()
	{
		_flddelegate.useDefaultPrettyPrinter();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #150 <Method JsonGenerator JsonGenerator.useDefaultPrettyPrinter()>
	//    3    7:pop             
		return ((JsonGenerator) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Version version()
	{
		return _flddelegate.version();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #154 <Method Version JsonGenerator.version()>
	//    3    7:areturn         
	}

	public void writeArray(double ad[], int i, int j)
		throws IOException
	{
		_flddelegate.writeArray(ad, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #158 <Method void JsonGenerator.writeArray(double[], int, int)>
	//    6   10:return          
	}

	public void writeArray(int ai[], int i, int j)
		throws IOException
	{
		_flddelegate.writeArray(ai, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #161 <Method void JsonGenerator.writeArray(int[], int, int)>
	//    6   10:return          
	}

	public void writeArray(long al[], int i, int j)
		throws IOException
	{
		_flddelegate.writeArray(al, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #164 <Method void JsonGenerator.writeArray(long[], int, int)>
	//    6   10:return          
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException
	{
		return _flddelegate.writeBinary(base64variant, inputstream, i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #168 <Method int JsonGenerator.writeBinary(Base64Variant, InputStream, int)>
	//    6   10:ireturn         
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException
	{
		_flddelegate.writeBinary(base64variant, abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #171 <Method void JsonGenerator.writeBinary(Base64Variant, byte[], int, int)>
	//    7   12:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		_flddelegate.writeBoolean(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #175 <Method void JsonGenerator.writeBoolean(boolean)>
	//    4    8:return          
	}

	public void writeEmbeddedObject(Object obj)
		throws IOException
	{
		_flddelegate.writeEmbeddedObject(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #178 <Method void JsonGenerator.writeEmbeddedObject(Object)>
	//    4    8:return          
	}

	public void writeEndArray()
		throws IOException
	{
		_flddelegate.writeEndArray();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #181 <Method void JsonGenerator.writeEndArray()>
	//    3    7:return          
	}

	public void writeEndObject()
		throws IOException
	{
		_flddelegate.writeEndObject();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #184 <Method void JsonGenerator.writeEndObject()>
	//    3    7:return          
	}

	public void writeFieldId(long l)
		throws IOException
	{
		_flddelegate.writeFieldId(l);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #188 <Method void JsonGenerator.writeFieldId(long)>
	//    4    8:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		_flddelegate.writeFieldName(serializablestring);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #192 <Method void JsonGenerator.writeFieldName(SerializableString)>
	//    4    8:return          
	}

	public void writeFieldName(String s)
		throws IOException
	{
		_flddelegate.writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #195 <Method void JsonGenerator.writeFieldName(String)>
	//    4    8:return          
	}

	public void writeNull()
		throws IOException
	{
		_flddelegate.writeNull();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #198 <Method void JsonGenerator.writeNull()>
	//    3    7:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		_flddelegate.writeNumber(d);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #202 <Method void JsonGenerator.writeNumber(double)>
	//    4    8:return          
	}

	public void writeNumber(float f)
		throws IOException
	{
		_flddelegate.writeNumber(f);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #205 <Method void JsonGenerator.writeNumber(float)>
	//    4    8:return          
	}

	public void writeNumber(int i)
		throws IOException
	{
		_flddelegate.writeNumber(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #208 <Method void JsonGenerator.writeNumber(int)>
	//    4    8:return          
	}

	public void writeNumber(long l)
		throws IOException
	{
		_flddelegate.writeNumber(l);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #210 <Method void JsonGenerator.writeNumber(long)>
	//    4    8:return          
	}

	public void writeNumber(String s)
		throws IOException, UnsupportedOperationException
	{
		_flddelegate.writeNumber(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #214 <Method void JsonGenerator.writeNumber(String)>
	//    4    8:return          
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		_flddelegate.writeNumber(bigdecimal);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #217 <Method void JsonGenerator.writeNumber(BigDecimal)>
	//    4    8:return          
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		_flddelegate.writeNumber(biginteger);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #220 <Method void JsonGenerator.writeNumber(BigInteger)>
	//    4    8:return          
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_flddelegate.writeNumber(word0);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #223 <Method void JsonGenerator.writeNumber(short)>
	//    4    8:return          
	}

	public void writeObject(Object obj)
		throws IOException, JsonProcessingException
	{
		if(delegateCopyMethods)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean delegateCopyMethods>
	//*   2    4:ifeq            16
		{
			_flddelegate.writeObject(obj);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #228 <Method void JsonGenerator.writeObject(Object)>
			return;
	//    7   15:return          
		}
		if(obj == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       25
		{
			writeNull();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #229 <Method void writeNull()>
			return;
	//   12   24:return          
		}
		if(getCodec() != null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #230 <Method ObjectCodec getCodec()>
	//*  15   29:ifnull          42
		{
			getCodec().writeValue(((JsonGenerator) (this)), obj);
	//   16   32:aload_0         
	//   17   33:invokevirtual   #230 <Method ObjectCodec getCodec()>
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #236 <Method void ObjectCodec.writeValue(JsonGenerator, Object)>
			return;
	//   21   41:return          
		} else
		{
			_writeSimpleObject(obj);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #239 <Method void _writeSimpleObject(Object)>
			return;
	//   25   47:return          
		}
	}

	public void writeObjectId(Object obj)
		throws IOException
	{
		_flddelegate.writeObjectId(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #242 <Method void JsonGenerator.writeObjectId(Object)>
	//    4    8:return          
	}

	public void writeObjectRef(Object obj)
		throws IOException
	{
		_flddelegate.writeObjectRef(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #245 <Method void JsonGenerator.writeObjectRef(Object)>
	//    4    8:return          
	}

	public void writeOmittedField(String s)
		throws IOException
	{
		_flddelegate.writeOmittedField(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #248 <Method void JsonGenerator.writeOmittedField(String)>
	//    4    8:return          
	}

	public void writeRaw(char c)
		throws IOException
	{
		_flddelegate.writeRaw(c);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #252 <Method void JsonGenerator.writeRaw(char)>
	//    4    8:return          
	}

	public void writeRaw(SerializableString serializablestring)
		throws IOException
	{
		_flddelegate.writeRaw(serializablestring);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #254 <Method void JsonGenerator.writeRaw(SerializableString)>
	//    4    8:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		_flddelegate.writeRaw(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #256 <Method void JsonGenerator.writeRaw(String)>
	//    4    8:return          
	}

	public void writeRaw(String s, int i, int j)
		throws IOException
	{
		_flddelegate.writeRaw(s, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #259 <Method void JsonGenerator.writeRaw(String, int, int)>
	//    6   10:return          
	}

	public void writeRaw(char ac[], int i, int j)
		throws IOException
	{
		_flddelegate.writeRaw(ac, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #262 <Method void JsonGenerator.writeRaw(char[], int, int)>
	//    6   10:return          
	}

	public void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_flddelegate.writeRawUTF8String(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #266 <Method void JsonGenerator.writeRawUTF8String(byte[], int, int)>
	//    6   10:return          
	}

	public void writeRawValue(String s)
		throws IOException
	{
		_flddelegate.writeRawValue(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #269 <Method void JsonGenerator.writeRawValue(String)>
	//    4    8:return          
	}

	public void writeRawValue(String s, int i, int j)
		throws IOException
	{
		_flddelegate.writeRawValue(s, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #271 <Method void JsonGenerator.writeRawValue(String, int, int)>
	//    6   10:return          
	}

	public void writeRawValue(char ac[], int i, int j)
		throws IOException
	{
		_flddelegate.writeRawValue(ac, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #273 <Method void JsonGenerator.writeRawValue(char[], int, int)>
	//    6   10:return          
	}

	public void writeStartArray()
		throws IOException
	{
		_flddelegate.writeStartArray();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #276 <Method void JsonGenerator.writeStartArray()>
	//    3    7:return          
	}

	public void writeStartArray(int i)
		throws IOException
	{
		_flddelegate.writeStartArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #278 <Method void JsonGenerator.writeStartArray(int)>
	//    4    8:return          
	}

	public void writeStartObject()
		throws IOException
	{
		_flddelegate.writeStartObject();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:invokevirtual   #281 <Method void JsonGenerator.writeStartObject()>
	//    3    7:return          
	}

	public void writeStartObject(Object obj)
		throws IOException
	{
		_flddelegate.writeStartObject(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #283 <Method void JsonGenerator.writeStartObject(Object)>
	//    4    8:return          
	}

	public void writeString(SerializableString serializablestring)
		throws IOException
	{
		_flddelegate.writeString(serializablestring);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #286 <Method void JsonGenerator.writeString(SerializableString)>
	//    4    8:return          
	}

	public void writeString(String s)
		throws IOException
	{
		_flddelegate.writeString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #288 <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		_flddelegate.writeString(ac, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #290 <Method void JsonGenerator.writeString(char[], int, int)>
	//    6   10:return          
	}

	public void writeTree(TreeNode treenode)
		throws IOException
	{
		if(delegateCopyMethods)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean delegateCopyMethods>
	//*   2    4:ifeq            16
		{
			_flddelegate.writeTree(treenode);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field JsonGenerator _flddelegate>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #294 <Method void JsonGenerator.writeTree(TreeNode)>
			return;
	//    7   15:return          
		}
		if(treenode == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       25
		{
			writeNull();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #229 <Method void writeNull()>
			return;
	//   12   24:return          
		}
		if(getCodec() == null)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #230 <Method ObjectCodec getCodec()>
	//*  15   29:ifnonnull       43
		{
			throw new IllegalStateException("No ObjectCodec defined");
	//   16   32:new             #296 <Class IllegalStateException>
	//   17   35:dup             
	//   18   36:ldc2            #298 <String "No ObjectCodec defined">
	//   19   39:invokespecial   #300 <Method void IllegalStateException(String)>
	//   20   42:athrow          
		} else
		{
			getCodec().writeValue(((JsonGenerator) (this)), ((Object) (treenode)));
	//   21   43:aload_0         
	//   22   44:invokevirtual   #230 <Method ObjectCodec getCodec()>
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #236 <Method void ObjectCodec.writeValue(JsonGenerator, Object)>
			return;
	//   26   52:return          
		}
	}

	public void writeTypeId(Object obj)
		throws IOException
	{
		_flddelegate.writeTypeId(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #303 <Method void JsonGenerator.writeTypeId(Object)>
	//    4    8:return          
	}

	public void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_flddelegate.writeUTF8String(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #306 <Method void JsonGenerator.writeUTF8String(byte[], int, int)>
	//    6   10:return          
	}

	protected JsonGenerator _flddelegate;
	protected boolean delegateCopyMethods;
}

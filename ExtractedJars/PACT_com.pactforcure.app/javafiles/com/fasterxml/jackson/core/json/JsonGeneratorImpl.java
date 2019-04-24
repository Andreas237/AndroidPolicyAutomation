// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.*;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;

public abstract class JsonGeneratorImpl extends GeneratorBase
{

	public JsonGeneratorImpl(IOContext iocontext, int i, ObjectCodec objectcodec)
	{
		super(i, objectcodec);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #33  <Method void GeneratorBase(int, ObjectCodec)>
		_outputEscapes = sOutputEscapes;
	//    4    6:aload_0         
	//    5    7:getstatic       #27  <Field int[] sOutputEscapes>
	//    6   10:putfield        #35  <Field int[] _outputEscapes>
		_rootValueSeparator = ((SerializableString) (DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
	//    7   13:aload_0         
	//    8   14:getstatic       #41  <Field com.fasterxml.jackson.core.io.SerializedString DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR>
	//    9   17:putfield        #43  <Field SerializableString _rootValueSeparator>
		_ioContext = iocontext;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #45  <Field IOContext _ioContext>
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i))
	//*  13   25:getstatic       #51  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  14   28:iload_2         
	//*  15   29:invokevirtual   #55  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  16   32:ifeq            41
			_maximumNonEscapedChar = 127;
	//   17   35:aload_0         
	//   18   36:bipush          127
	//   19   38:putfield        #57  <Field int _maximumNonEscapedChar>
		boolean flag;
		if(!com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i))
	//*  20   41:getstatic       #60  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_FIELD_NAMES>
	//*  21   44:iload_2         
	//*  22   45:invokevirtual   #55  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  23   48:ifne            61
			flag = true;
	//   24   51:iconst_1        
	//   25   52:istore          4
		else
	//*  26   54:aload_0         
	//*  27   55:iload           4
	//*  28   57:putfield        #62  <Field boolean _cfgUnqNames>
	//*  29   60:return          
			flag = false;
	//   30   61:iconst_0        
	//   31   62:istore          4
		_cfgUnqNames = flag;
	//*  32   64:goto            54
	}

	protected void _checkStdFeatureChanges(int i, int j)
	{
		super._checkStdFeatureChanges(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void GeneratorBase._checkStdFeatureChanges(int, int)>
		boolean flag;
		if(!com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i))
	//*   4    6:getstatic       #60  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_FIELD_NAMES>
	//*   5    9:iload_1         
	//*   6   10:invokevirtual   #55  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*   7   13:ifne            24
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_3        
		else
	//*  10   18:aload_0         
	//*  11   19:iload_3         
	//*  12   20:putfield        #62  <Field boolean _cfgUnqNames>
	//*  13   23:return          
			flag = false;
	//   14   24:iconst_0        
	//   15   25:istore_3        
		_cfgUnqNames = flag;
	//*  16   26:goto            18
	}

	public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		super.disable(feature);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method JsonGenerator GeneratorBase.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    3    5:pop             
		if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES)
	//*   4    6:aload_1         
	//*   5    7:getstatic       #60  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_FIELD_NAMES>
	//*   6   10:if_acmpne       18
			_cfgUnqNames = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #62  <Field boolean _cfgUnqNames>
		return ((JsonGenerator) (this));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		super.enable(feature);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method JsonGenerator GeneratorBase.enable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//    3    5:pop             
		if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES)
	//*   4    6:aload_1         
	//*   5    7:getstatic       #60  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.QUOTE_FIELD_NAMES>
	//*   6   10:if_acmpne       18
			_cfgUnqNames = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #62  <Field boolean _cfgUnqNames>
		return ((JsonGenerator) (this));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public CharacterEscapes getCharacterEscapes()
	{
		return _characterEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CharacterEscapes _characterEscapes>
	//    2    4:areturn         
	}

	public int getHighestEscapedChar()
	{
		return _maximumNonEscapedChar;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _maximumNonEscapedChar>
	//    2    4:ireturn         
	}

	public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
	{
		_characterEscapes = characterescapes;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field CharacterEscapes _characterEscapes>
		if(characterescapes == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       18
		{
			_outputEscapes = sOutputEscapes;
	//    5    9:aload_0         
	//    6   10:getstatic       #27  <Field int[] sOutputEscapes>
	//    7   13:putfield        #35  <Field int[] _outputEscapes>
			return ((JsonGenerator) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			_outputEscapes = characterescapes.getEscapeCodesForAscii();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #86  <Method int[] CharacterEscapes.getEscapeCodesForAscii()>
	//   13   23:putfield        #35  <Field int[] _outputEscapes>
			return ((JsonGenerator) (this));
	//   14   26:aload_0         
	//   15   27:areturn         
		}
	}

	public JsonGenerator setHighestNonEscapedChar(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		_maximumNonEscapedChar = j;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:putfield        #57  <Field int _maximumNonEscapedChar>
		return ((JsonGenerator) (this));
	//    9   13:aload_0         
	//   10   14:areturn         
	}

	public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
	{
		_rootValueSeparator = serializablestring;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field SerializableString _rootValueSeparator>
		return ((JsonGenerator) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Version version()
	{
		return VersionUtil.versionFor(((Object)this).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Class Object.getClass()>
	//    2    4:invokestatic    #104 <Method Version VersionUtil.versionFor(Class)>
	//    3    7:areturn         
	}

	public final void writeStringField(String s, String s1)
		throws IOException
	{
		writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #112 <Method void writeFieldName(String)>
		writeString(s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #115 <Method void writeString(String)>
	//    6   10:return          
	}

	protected static final int sOutputEscapes[] = CharTypes.get7BitOutputEscapes();
	protected boolean _cfgUnqNames;
	protected CharacterEscapes _characterEscapes;
	protected final IOContext _ioContext;
	protected int _maximumNonEscapedChar;
	protected int _outputEscapes[];
	protected SerializableString _rootValueSeparator;

	static 
	{
	//    0    0:invokestatic    #25  <Method int[] CharTypes.get7BitOutputEscapes()>
	//    1    3:putstatic       #27  <Field int[] sOutputEscapes>
	//*   2    6:return          
	}
}

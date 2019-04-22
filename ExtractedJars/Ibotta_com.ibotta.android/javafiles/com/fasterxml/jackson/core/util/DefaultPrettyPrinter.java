// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			Instantiatable, DefaultIndenter, Separators

public class DefaultPrettyPrinter
	implements PrettyPrinter, Instantiatable, Serializable
{
	public static class FixedSpaceIndenter extends NopIndenter
	{

		public boolean isInline()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void writeIndentation(JsonGenerator jsongenerator, int i)
			throws IOException
		{
			jsongenerator.writeRaw(' ');
		//    0    0:aload_1         
		//    1    1:bipush          32
		//    2    3:invokevirtual   #30  <Method void JsonGenerator.writeRaw(char)>
		//    3    6:return          
		}

		public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

		static 
		{
		//    0    0:new             #2   <Class DefaultPrettyPrinter$FixedSpaceIndenter>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void DefaultPrettyPrinter$FixedSpaceIndenter()>
		//    3    7:putstatic       #16  <Field DefaultPrettyPrinter$FixedSpaceIndenter instance>
		//*   4   10:return          
		}

		public FixedSpaceIndenter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void DefaultPrettyPrinter$NopIndenter()>
		//    2    4:return          
		}
	}

	public static interface Indenter
	{

		public abstract boolean isInline();

		public abstract void writeIndentation(JsonGenerator jsongenerator, int i)
			throws IOException;
	}

	public static class NopIndenter
		implements Indenter, Serializable
	{

		public boolean isInline()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void writeIndentation(JsonGenerator jsongenerator, int i)
			throws IOException
		{
		//    0    0:return          
		}

		public static final NopIndenter instance = new NopIndenter();

		static 
		{
		//    0    0:new             #2   <Class DefaultPrettyPrinter$NopIndenter>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void DefaultPrettyPrinter$NopIndenter()>
		//    3    7:putstatic       #20  <Field DefaultPrettyPrinter$NopIndenter instance>
		//*   4   10:return          
		}

		public NopIndenter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}
	}


	public DefaultPrettyPrinter()
	{
		this(((SerializableString) (DEFAULT_ROOT_VALUE_SEPARATOR)));
	//    0    0:aload_0         
	//    1    1:getstatic       #51  <Field SerializedString DEFAULT_ROOT_VALUE_SEPARATOR>
	//    2    4:invokespecial   #55  <Method void DefaultPrettyPrinter(SerializableString)>
	//    3    7:return          
	}

	public DefaultPrettyPrinter(SerializableString serializablestring)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		_arrayIndenter = ((Indenter) (FixedSpaceIndenter.instance));
	//    2    4:aload_0         
	//    3    5:getstatic       #61  <Field DefaultPrettyPrinter$FixedSpaceIndenter DefaultPrettyPrinter$FixedSpaceIndenter.instance>
	//    4    8:putfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
		_objectIndenter = ((Indenter) (DefaultIndenter.SYSTEM_LINEFEED_INSTANCE));
	//    5   11:aload_0         
	//    6   12:getstatic       #69  <Field DefaultIndenter DefaultIndenter.SYSTEM_LINEFEED_INSTANCE>
	//    7   15:putfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
		_spacesInObjectEntries = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #73  <Field boolean _spacesInObjectEntries>
		_rootSeparator = serializablestring;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #75  <Field SerializableString _rootSeparator>
		withSeparators(DEFAULT_SEPARATORS);
	//   14   28:aload_0         
	//   15   29:getstatic       #78  <Field Separators DEFAULT_SEPARATORS>
	//   16   32:invokevirtual   #82  <Method DefaultPrettyPrinter withSeparators(Separators)>
	//   17   35:pop             
	//   18   36:return          
	}

	public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter)
	{
		this(defaultprettyprinter, defaultprettyprinter._rootSeparator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #75  <Field SerializableString _rootSeparator>
	//    4    6:invokespecial   #86  <Method void DefaultPrettyPrinter(DefaultPrettyPrinter, SerializableString)>
	//    5    9:return          
	}

	public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter, SerializableString serializablestring)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		_arrayIndenter = ((Indenter) (FixedSpaceIndenter.instance));
	//    2    4:aload_0         
	//    3    5:getstatic       #61  <Field DefaultPrettyPrinter$FixedSpaceIndenter DefaultPrettyPrinter$FixedSpaceIndenter.instance>
	//    4    8:putfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
		_objectIndenter = ((Indenter) (DefaultIndenter.SYSTEM_LINEFEED_INSTANCE));
	//    5   11:aload_0         
	//    6   12:getstatic       #69  <Field DefaultIndenter DefaultIndenter.SYSTEM_LINEFEED_INSTANCE>
	//    7   15:putfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
		_spacesInObjectEntries = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #73  <Field boolean _spacesInObjectEntries>
		_arrayIndenter = defaultprettyprinter._arrayIndenter;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//   14   28:putfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
		_objectIndenter = defaultprettyprinter._objectIndenter;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//   18   36:putfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
		_spacesInObjectEntries = defaultprettyprinter._spacesInObjectEntries;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #73  <Field boolean _spacesInObjectEntries>
	//   22   44:putfield        #73  <Field boolean _spacesInObjectEntries>
		_nesting = defaultprettyprinter._nesting;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #88  <Field int _nesting>
	//   26   52:putfield        #88  <Field int _nesting>
		_separators = defaultprettyprinter._separators;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #90  <Field Separators _separators>
	//   30   60:putfield        #90  <Field Separators _separators>
		_objectFieldValueSeparatorWithSpaces = defaultprettyprinter._objectFieldValueSeparatorWithSpaces;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getfield        #92  <Field String _objectFieldValueSeparatorWithSpaces>
	//   34   68:putfield        #92  <Field String _objectFieldValueSeparatorWithSpaces>
		_rootSeparator = serializablestring;
	//   35   71:aload_0         
	//   36   72:aload_2         
	//   37   73:putfield        #75  <Field SerializableString _rootSeparator>
	//   38   76:return          
	}

	public void beforeArrayValues(JsonGenerator jsongenerator)
		throws IOException
	{
		_arrayIndenter.writeIndentation(jsongenerator, _nesting);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field int _nesting>
	//    5    9:invokeinterface #100 <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//    6   14:return          
	}

	public void beforeObjectEntries(JsonGenerator jsongenerator)
		throws IOException
	{
		_objectIndenter.writeIndentation(jsongenerator, _nesting);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field int _nesting>
	//    5    9:invokeinterface #100 <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//    6   14:return          
	}

	public DefaultPrettyPrinter createInstance()
	{
		return new DefaultPrettyPrinter(this);
	//    0    0:new             #2   <Class DefaultPrettyPrinter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #106 <Method void DefaultPrettyPrinter(DefaultPrettyPrinter)>
	//    4    8:areturn         
	}

	public volatile Object createInstance()
	{
		return ((Object) (createInstance()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #109 <Method DefaultPrettyPrinter createInstance()>
	//    2    4:areturn         
	}

	public DefaultPrettyPrinter withSeparators(Separators separators)
	{
		_separators = separators;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field Separators _separators>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #111 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #112 <Method void StringBuilder()>
	//    6   12:astore_2        
		stringbuilder.append(" ");
	//    7   13:aload_2         
	//    8   14:ldc1            #45  <String " ">
	//    9   16:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		stringbuilder.append(separators.getObjectFieldValueSeparator());
	//   11   20:aload_2         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #122 <Method char Separators.getObjectFieldValueSeparator()>
	//   14   25:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
	//   15   28:pop             
		stringbuilder.append(" ");
	//   16   29:aload_2         
	//   17   30:ldc1            #45  <String " ">
	//   18   32:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		_objectFieldValueSeparatorWithSpaces = stringbuilder.toString();
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   23   41:putfield        #92  <Field String _objectFieldValueSeparatorWithSpaces>
		return this;
	//   24   44:aload_0         
	//   25   45:areturn         
	}

	public void writeArrayValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw(_separators.getArrayValueSeparator());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #90  <Field Separators _separators>
	//    3    5:invokevirtual   #133 <Method char Separators.getArrayValueSeparator()>
	//    4    8:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
		_arrayIndenter.writeIndentation(jsongenerator, _nesting);
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #88  <Field int _nesting>
	//   10   20:invokeinterface #100 <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//   11   25:return          
	}

	public void writeEndArray(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		if(!_arrayIndenter.isInline())
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//*   2    4:invokeinterface #144 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   3    9:ifne            22
			_nesting = _nesting - 1;
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #88  <Field int _nesting>
	//    7   17:iconst_1        
	//    8   18:isub            
	//    9   19:putfield        #88  <Field int _nesting>
		if(i > 0)
	//*  10   22:iload_2         
	//*  11   23:ifle            43
			_arrayIndenter.writeIndentation(jsongenerator, _nesting);
	//   12   26:aload_0         
	//   13   27:getfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #88  <Field int _nesting>
	//   17   35:invokeinterface #100 <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
		else
	//*  18   40:goto            49
			jsongenerator.writeRaw(' ');
	//   19   43:aload_1         
	//   20   44:bipush          32
	//   21   46:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
		jsongenerator.writeRaw(']');
	//   22   49:aload_1         
	//   23   50:bipush          93
	//   24   52:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
	//   25   55:return          
	}

	public void writeEndObject(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		if(!_objectIndenter.isInline())
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//*   2    4:invokeinterface #144 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   3    9:ifne            22
			_nesting = _nesting - 1;
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #88  <Field int _nesting>
	//    7   17:iconst_1        
	//    8   18:isub            
	//    9   19:putfield        #88  <Field int _nesting>
		if(i > 0)
	//*  10   22:iload_2         
	//*  11   23:ifle            43
			_objectIndenter.writeIndentation(jsongenerator, _nesting);
	//   12   26:aload_0         
	//   13   27:getfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #88  <Field int _nesting>
	//   17   35:invokeinterface #100 <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
		else
	//*  18   40:goto            49
			jsongenerator.writeRaw(' ');
	//   19   43:aload_1         
	//   20   44:bipush          32
	//   21   46:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
		jsongenerator.writeRaw('}');
	//   22   49:aload_1         
	//   23   50:bipush          125
	//   24   52:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
	//   25   55:return          
	}

	public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw(_separators.getObjectEntrySeparator());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #90  <Field Separators _separators>
	//    3    5:invokevirtual   #149 <Method char Separators.getObjectEntrySeparator()>
	//    4    8:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
		_objectIndenter.writeIndentation(jsongenerator, _nesting);
	//    5   11:aload_0         
	//    6   12:getfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #88  <Field int _nesting>
	//   10   20:invokeinterface #100 <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//   11   25:return          
	}

	public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_spacesInObjectEntries)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean _spacesInObjectEntries>
	//*   2    4:ifeq            16
		{
			jsongenerator.writeRaw(_objectFieldValueSeparatorWithSpaces);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #92  <Field String _objectFieldValueSeparatorWithSpaces>
	//    6   12:invokevirtual   #152 <Method void JsonGenerator.writeRaw(String)>
			return;
	//    7   15:return          
		} else
		{
			jsongenerator.writeRaw(_separators.getObjectFieldValueSeparator());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #90  <Field Separators _separators>
	//   11   21:invokevirtual   #122 <Method char Separators.getObjectFieldValueSeparator()>
	//   12   24:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
			return;
	//   13   27:return          
		}
	}

	public void writeRootValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		SerializableString serializablestring = _rootSeparator;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field SerializableString _rootSeparator>
	//    2    4:astore_2        
		if(serializablestring != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			jsongenerator.writeRaw(serializablestring);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #155 <Method void JsonGenerator.writeRaw(SerializableString)>
	//    8   14:return          
	}

	public void writeStartArray(JsonGenerator jsongenerator)
		throws IOException
	{
		if(!_arrayIndenter.isInline())
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//*   2    4:invokeinterface #144 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   3    9:ifne            22
			_nesting = _nesting + 1;
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #88  <Field int _nesting>
	//    7   17:iconst_1        
	//    8   18:iadd            
	//    9   19:putfield        #88  <Field int _nesting>
		jsongenerator.writeRaw('[');
	//   10   22:aload_1         
	//   11   23:bipush          91
	//   12   25:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
	//   13   28:return          
	}

	public void writeStartObject(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw('{');
	//    0    0:aload_1         
	//    1    1:bipush          123
	//    2    3:invokevirtual   #139 <Method void JsonGenerator.writeRaw(char)>
		if(!_objectIndenter.isInline())
	//*   3    6:aload_0         
	//*   4    7:getfield        #71  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//*   5   10:invokeinterface #144 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   6   15:ifne            28
			_nesting = _nesting + 1;
	//    7   18:aload_0         
	//    8   19:aload_0         
	//    9   20:getfield        #88  <Field int _nesting>
	//   10   23:iconst_1        
	//   11   24:iadd            
	//   12   25:putfield        #88  <Field int _nesting>
	//   13   28:return          
	}

	public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
	private static final long serialVersionUID = 1L;
	protected Indenter _arrayIndenter;
	protected transient int _nesting;
	protected String _objectFieldValueSeparatorWithSpaces;
	protected Indenter _objectIndenter;
	protected final SerializableString _rootSeparator;
	protected Separators _separators;
	protected boolean _spacesInObjectEntries;

	static 
	{
	//    0    0:new             #43  <Class SerializedString>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String " ">
	//    3    6:invokespecial   #49  <Method void SerializedString(String)>
	//    4    9:putstatic       #51  <Field SerializedString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*   5   12:return          
	}
}

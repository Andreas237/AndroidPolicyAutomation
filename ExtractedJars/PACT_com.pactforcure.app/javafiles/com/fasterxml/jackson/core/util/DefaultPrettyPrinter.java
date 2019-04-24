// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			Instantiatable, DefaultIndenter

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
	//    1    1:getstatic       #47  <Field SerializedString DEFAULT_ROOT_VALUE_SEPARATOR>
	//    2    4:invokespecial   #51  <Method void DefaultPrettyPrinter(SerializableString)>
	//    3    7:return          
	}

	public DefaultPrettyPrinter(SerializableString serializablestring)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		_arrayIndenter = ((Indenter) (FixedSpaceIndenter.instance));
	//    2    4:aload_0         
	//    3    5:getstatic       #57  <Field DefaultPrettyPrinter$FixedSpaceIndenter DefaultPrettyPrinter$FixedSpaceIndenter.instance>
	//    4    8:putfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
		_objectIndenter = ((Indenter) (DefaultIndenter.SYSTEM_LINEFEED_INSTANCE));
	//    5   11:aload_0         
	//    6   12:getstatic       #65  <Field DefaultIndenter DefaultIndenter.SYSTEM_LINEFEED_INSTANCE>
	//    7   15:putfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
		_spacesInObjectEntries = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #69  <Field boolean _spacesInObjectEntries>
		_rootSeparator = serializablestring;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #71  <Field SerializableString _rootSeparator>
	//   14   28:return          
	}

	public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter)
	{
		this(defaultprettyprinter, defaultprettyprinter._rootSeparator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #71  <Field SerializableString _rootSeparator>
	//    4    6:invokespecial   #75  <Method void DefaultPrettyPrinter(DefaultPrettyPrinter, SerializableString)>
	//    5    9:return          
	}

	public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter, SerializableString serializablestring)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		_arrayIndenter = ((Indenter) (FixedSpaceIndenter.instance));
	//    2    4:aload_0         
	//    3    5:getstatic       #57  <Field DefaultPrettyPrinter$FixedSpaceIndenter DefaultPrettyPrinter$FixedSpaceIndenter.instance>
	//    4    8:putfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
		_objectIndenter = ((Indenter) (DefaultIndenter.SYSTEM_LINEFEED_INSTANCE));
	//    5   11:aload_0         
	//    6   12:getstatic       #65  <Field DefaultIndenter DefaultIndenter.SYSTEM_LINEFEED_INSTANCE>
	//    7   15:putfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
		_spacesInObjectEntries = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #69  <Field boolean _spacesInObjectEntries>
		_arrayIndenter = defaultprettyprinter._arrayIndenter;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//   14   28:putfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
		_objectIndenter = defaultprettyprinter._objectIndenter;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//   18   36:putfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
		_spacesInObjectEntries = defaultprettyprinter._spacesInObjectEntries;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #69  <Field boolean _spacesInObjectEntries>
	//   22   44:putfield        #69  <Field boolean _spacesInObjectEntries>
		_nesting = defaultprettyprinter._nesting;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #77  <Field int _nesting>
	//   26   52:putfield        #77  <Field int _nesting>
		_rootSeparator = serializablestring;
	//   27   55:aload_0         
	//   28   56:aload_2         
	//   29   57:putfield        #71  <Field SerializableString _rootSeparator>
	//   30   60:return          
	}

	public DefaultPrettyPrinter(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:invokespecial   #51  <Method void DefaultPrettyPrinter(SerializableString)>
	//*   7   11:return          
			s = ((String) (new SerializedString(s)));
	//    8   12:new             #39  <Class SerializedString>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #45  <Method void SerializedString(String)>
	//   12   20:astore_1        
		this(((SerializableString) (s)));
	//*  13   21:goto            6
	}

	protected DefaultPrettyPrinter _withSpaces(boolean flag)
	{
		if(_spacesInObjectEntries == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field boolean _spacesInObjectEntries>
	//*   2    4:iload_1         
	//*   3    5:icmpne          10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			DefaultPrettyPrinter defaultprettyprinter = new DefaultPrettyPrinter(this);
	//    6   10:new             #2   <Class DefaultPrettyPrinter>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #81  <Method void DefaultPrettyPrinter(DefaultPrettyPrinter)>
	//   10   18:astore_2        
			defaultprettyprinter._spacesInObjectEntries = flag;
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:putfield        #69  <Field boolean _spacesInObjectEntries>
			return defaultprettyprinter;
	//   14   24:aload_2         
	//   15   25:areturn         
		}
	}

	public void beforeArrayValues(JsonGenerator jsongenerator)
		throws IOException
	{
		_arrayIndenter.writeIndentation(jsongenerator, _nesting);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field int _nesting>
	//    5    9:invokeinterface #89  <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//    6   14:return          
	}

	public void beforeObjectEntries(JsonGenerator jsongenerator)
		throws IOException
	{
		_objectIndenter.writeIndentation(jsongenerator, _nesting);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field int _nesting>
	//    5    9:invokeinterface #89  <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//    6   14:return          
	}

	public DefaultPrettyPrinter createInstance()
	{
		return new DefaultPrettyPrinter(this);
	//    0    0:new             #2   <Class DefaultPrettyPrinter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #81  <Method void DefaultPrettyPrinter(DefaultPrettyPrinter)>
	//    4    8:areturn         
	}

	public volatile Object createInstance()
	{
		return ((Object) (createInstance()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method DefaultPrettyPrinter createInstance()>
	//    2    4:areturn         
	}

	public void indentArraysWith(Indenter indenter)
	{
		Object obj = ((Object) (indenter));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(indenter == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (NopIndenter.instance));
	//    4    6:getstatic       #101 <Field DefaultPrettyPrinter$NopIndenter DefaultPrettyPrinter$NopIndenter.instance>
	//    5    9:astore_2        
		_arrayIndenter = ((Indenter) (obj));
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//    9   15:return          
	}

	public void indentObjectsWith(Indenter indenter)
	{
		Object obj = ((Object) (indenter));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(indenter == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (NopIndenter.instance));
	//    4    6:getstatic       #101 <Field DefaultPrettyPrinter$NopIndenter DefaultPrettyPrinter$NopIndenter.instance>
	//    5    9:astore_2        
		_objectIndenter = ((Indenter) (obj));
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//    9   15:return          
	}

	public void spacesInObjectEntries(boolean flag)
	{
		_spacesInObjectEntries = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean _spacesInObjectEntries>
	//    3    5:return          
	}

	public DefaultPrettyPrinter withArrayIndenter(Indenter indenter)
	{
		Object obj = ((Object) (indenter));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(indenter == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (NopIndenter.instance));
	//    4    6:getstatic       #101 <Field DefaultPrettyPrinter$NopIndenter DefaultPrettyPrinter$NopIndenter.instance>
	//    5    9:astore_2        
		if(_arrayIndenter == obj)
	//*   6   10:aload_0         
	//*   7   11:getfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//*   8   14:aload_2         
	//*   9   15:if_acmpne       20
		{
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		} else
		{
			indenter = ((Indenter) (new DefaultPrettyPrinter(this)));
	//   12   20:new             #2   <Class DefaultPrettyPrinter>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #81  <Method void DefaultPrettyPrinter(DefaultPrettyPrinter)>
	//   16   28:astore_1        
			indenter._arrayIndenter = ((Indenter) (obj));
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:putfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
			return ((DefaultPrettyPrinter) (indenter));
	//   20   34:aload_1         
	//   21   35:areturn         
		}
	}

	public DefaultPrettyPrinter withObjectIndenter(Indenter indenter)
	{
		Object obj = ((Object) (indenter));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(indenter == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = ((Object) (NopIndenter.instance));
	//    4    6:getstatic       #101 <Field DefaultPrettyPrinter$NopIndenter DefaultPrettyPrinter$NopIndenter.instance>
	//    5    9:astore_2        
		if(_objectIndenter == obj)
	//*   6   10:aload_0         
	//*   7   11:getfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//*   8   14:aload_2         
	//*   9   15:if_acmpne       20
		{
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		} else
		{
			indenter = ((Indenter) (new DefaultPrettyPrinter(this)));
	//   12   20:new             #2   <Class DefaultPrettyPrinter>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #81  <Method void DefaultPrettyPrinter(DefaultPrettyPrinter)>
	//   16   28:astore_1        
			indenter._objectIndenter = ((Indenter) (obj));
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:putfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
			return ((DefaultPrettyPrinter) (indenter));
	//   20   34:aload_1         
	//   21   35:areturn         
		}
	}

	public DefaultPrettyPrinter withRootSeparator(SerializableString serializablestring)
	{
		if(_rootSeparator == serializablestring || serializablestring != null && ((Object) (serializablestring)).equals(((Object) (_rootSeparator))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field SerializableString _rootSeparator>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       23
	//*   4    8:aload_1         
	//*   5    9:ifnull          25
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #71  <Field SerializableString _rootSeparator>
	//*   9   17:invokevirtual   #115 <Method boolean Object.equals(Object)>
	//*  10   20:ifeq            25
			return this;
	//   11   23:aload_0         
	//   12   24:areturn         
		else
			return new DefaultPrettyPrinter(this, serializablestring);
	//   13   25:new             #2   <Class DefaultPrettyPrinter>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokespecial   #75  <Method void DefaultPrettyPrinter(DefaultPrettyPrinter, SerializableString)>
	//   18   34:areturn         
	}

	public DefaultPrettyPrinter withRootSeparator(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #118 <Method DefaultPrettyPrinter withRootSeparator(SerializableString)>
	//*   7   11:areturn         
			s = ((String) (new SerializedString(s)));
	//    8   12:new             #39  <Class SerializedString>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #45  <Method void SerializedString(String)>
	//   12   20:astore_1        
		return withRootSeparator(((SerializableString) (s)));
	//*  13   21:goto            6
	}

	public DefaultPrettyPrinter withSpacesInObjectEntries()
	{
		return _withSpaces(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #121 <Method DefaultPrettyPrinter _withSpaces(boolean)>
	//    3    5:areturn         
	}

	public DefaultPrettyPrinter withoutSpacesInObjectEntries()
	{
		return _withSpaces(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #121 <Method DefaultPrettyPrinter _withSpaces(boolean)>
	//    3    5:areturn         
	}

	public void writeArrayValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw(',');
	//    0    0:aload_1         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
		_arrayIndenter.writeIndentation(jsongenerator, _nesting);
	//    3    6:aload_0         
	//    4    7:getfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #77  <Field int _nesting>
	//    8   15:invokeinterface #89  <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//    9   20:return          
	}

	public void writeEndArray(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		if(!_arrayIndenter.isInline())
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//*   2    4:invokeinterface #134 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   3    9:ifne            22
			_nesting = _nesting - 1;
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #77  <Field int _nesting>
	//    7   17:iconst_1        
	//    8   18:isub            
	//    9   19:putfield        #77  <Field int _nesting>
		if(i > 0)
	//*  10   22:iload_2         
	//*  11   23:ifle            47
			_arrayIndenter.writeIndentation(jsongenerator, _nesting);
	//   12   26:aload_0         
	//   13   27:getfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #77  <Field int _nesting>
	//   17   35:invokeinterface #89  <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
		else
	//*  18   40:aload_1         
	//*  19   41:bipush          93
	//*  20   43:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
	//*  21   46:return          
			jsongenerator.writeRaw(' ');
	//   22   47:aload_1         
	//   23   48:bipush          32
	//   24   50:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
		jsongenerator.writeRaw(']');
	//*  25   53:goto            40
	}

	public void writeEndObject(JsonGenerator jsongenerator, int i)
		throws IOException
	{
		if(!_objectIndenter.isInline())
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//*   2    4:invokeinterface #134 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   3    9:ifne            22
			_nesting = _nesting - 1;
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #77  <Field int _nesting>
	//    7   17:iconst_1        
	//    8   18:isub            
	//    9   19:putfield        #77  <Field int _nesting>
		if(i > 0)
	//*  10   22:iload_2         
	//*  11   23:ifle            47
			_objectIndenter.writeIndentation(jsongenerator, _nesting);
	//   12   26:aload_0         
	//   13   27:getfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #77  <Field int _nesting>
	//   17   35:invokeinterface #89  <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
		else
	//*  18   40:aload_1         
	//*  19   41:bipush          125
	//*  20   43:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
	//*  21   46:return          
			jsongenerator.writeRaw(' ');
	//   22   47:aload_1         
	//   23   48:bipush          32
	//   24   50:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
		jsongenerator.writeRaw('}');
	//*  25   53:goto            40
	}

	public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw(',');
	//    0    0:aload_1         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
		_objectIndenter.writeIndentation(jsongenerator, _nesting);
	//    3    6:aload_0         
	//    4    7:getfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #77  <Field int _nesting>
	//    8   15:invokeinterface #89  <Method void DefaultPrettyPrinter$Indenter.writeIndentation(JsonGenerator, int)>
	//    9   20:return          
	}

	public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_spacesInObjectEntries)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field boolean _spacesInObjectEntries>
	//*   2    4:ifeq            14
		{
			jsongenerator.writeRaw(" : ");
	//    3    7:aload_1         
	//    4    8:ldc1            #139 <String " : ">
	//    5   10:invokevirtual   #141 <Method void JsonGenerator.writeRaw(String)>
			return;
	//    6   13:return          
		} else
		{
			jsongenerator.writeRaw(':');
	//    7   14:aload_1         
	//    8   15:bipush          58
	//    9   17:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
			return;
	//   10   20:return          
		}
	}

	public void writeRootValueSeparator(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_rootSeparator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field SerializableString _rootSeparator>
	//*   2    4:ifnull          15
			jsongenerator.writeRaw(_rootSeparator);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field SerializableString _rootSeparator>
	//    6   12:invokevirtual   #144 <Method void JsonGenerator.writeRaw(SerializableString)>
	//    7   15:return          
	}

	public void writeStartArray(JsonGenerator jsongenerator)
		throws IOException
	{
		if(!_arrayIndenter.isInline())
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field DefaultPrettyPrinter$Indenter _arrayIndenter>
	//*   2    4:invokeinterface #134 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   3    9:ifne            22
			_nesting = _nesting + 1;
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #77  <Field int _nesting>
	//    7   17:iconst_1        
	//    8   18:iadd            
	//    9   19:putfield        #77  <Field int _nesting>
		jsongenerator.writeRaw('[');
	//   10   22:aload_1         
	//   11   23:bipush          91
	//   12   25:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
	//   13   28:return          
	}

	public void writeStartObject(JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeRaw('{');
	//    0    0:aload_1         
	//    1    1:bipush          123
	//    2    3:invokevirtual   #129 <Method void JsonGenerator.writeRaw(char)>
		if(!_objectIndenter.isInline())
	//*   3    6:aload_0         
	//*   4    7:getfield        #67  <Field DefaultPrettyPrinter$Indenter _objectIndenter>
	//*   5   10:invokeinterface #134 <Method boolean DefaultPrettyPrinter$Indenter.isInline()>
	//*   6   15:ifne            28
			_nesting = _nesting + 1;
	//    7   18:aload_0         
	//    8   19:aload_0         
	//    9   20:getfield        #77  <Field int _nesting>
	//   10   23:iconst_1        
	//   11   24:iadd            
	//   12   25:putfield        #77  <Field int _nesting>
	//   13   28:return          
	}

	public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
	private static final long serialVersionUID = 1L;
	protected Indenter _arrayIndenter;
	protected transient int _nesting;
	protected Indenter _objectIndenter;
	protected final SerializableString _rootSeparator;
	protected boolean _spacesInObjectEntries;

	static 
	{
	//    0    0:new             #39  <Class SerializedString>
	//    1    3:dup             
	//    2    4:ldc1            #41  <String " ">
	//    3    6:invokespecial   #45  <Method void SerializedString(String)>
	//    4    9:putstatic       #47  <Field SerializedString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*   5   12:return          
	}
}

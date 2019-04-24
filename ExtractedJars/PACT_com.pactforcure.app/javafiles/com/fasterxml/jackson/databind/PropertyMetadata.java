// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import java.io.Serializable;

public class PropertyMetadata
	implements Serializable
{

	protected PropertyMetadata(Boolean boolean1, String s)
	{
		this(boolean1, s, ((Integer) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//    6    8:return          
	}

	protected PropertyMetadata(Boolean boolean1, String s, Integer integer, String s1)
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
			_required = boolean1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Boolean _required>
			_description = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field String _description>
			_index = integer;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #53  <Field Integer _index>
			if(s1 != null)
	//*  11   19:aload           4
	//*  12   21:ifnull          35
			{
				boolean1 = ((Boolean) (s1));
	//   13   24:aload           4
	//   14   26:astore_1        
				if(!s1.isEmpty())
					break label0;
	//   15   27:aload           4
	//   16   29:invokevirtual   #59  <Method boolean String.isEmpty()>
	//   17   32:ifeq            37
			}
			boolean1 = null;
	//   18   35:aconst_null     
	//   19   36:astore_1        
		}
		_defaultValue = ((String) (boolean1));
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:putfield        #61  <Field String _defaultValue>
	//   23   42:return          
	}

	public static PropertyMetadata construct(boolean flag, String s)
	{
		return construct(flag, s, ((Integer) (null)), ((String) (null)));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokestatic    #66  <Method PropertyMetadata construct(boolean, String, Integer, String)>
	//    5    7:areturn         
	}

	public static PropertyMetadata construct(boolean flag, String s, Integer integer, String s1)
	{
		if(s != null || integer != null || s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       12
	//*   4    8:aload_3         
	//*   5    9:ifnull          27
			return new PropertyMetadata(Boolean.valueOf(flag), s, integer, s1);
	//    6   12:new             #2   <Class PropertyMetadata>
	//    7   15:dup             
	//    8   16:iload_0         
	//    9   17:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//   14   26:areturn         
		if(flag)
	//*  15   27:iload_0         
	//*  16   28:ifeq            35
			return STD_REQUIRED;
	//   17   31:getstatic       #34  <Field PropertyMetadata STD_REQUIRED>
	//   18   34:areturn         
		else
			return STD_OPTIONAL;
	//   19   35:getstatic       #39  <Field PropertyMetadata STD_OPTIONAL>
	//   20   38:areturn         
	}

	public String getDefaultValue()
	{
		return _defaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String _defaultValue>
	//    2    4:areturn         
	}

	public String getDescription()
	{
		return _description;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String _description>
	//    2    4:areturn         
	}

	public Integer getIndex()
	{
		return _index;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Integer _index>
	//    2    4:areturn         
	}

	public Boolean getRequired()
	{
		return _required;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Boolean _required>
	//    2    4:areturn         
	}

	public boolean hasDefaultValue()
	{
		return _defaultValue != null;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String _defaultValue>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasDefuaultValue()
	{
		return hasDefaultValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method boolean hasDefaultValue()>
	//    2    4:ireturn         
	}

	public boolean hasIndex()
	{
		return _index != null;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Integer _index>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isRequired()
	{
		return _required != null && _required.booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Boolean _required>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field Boolean _required>
	//    5   11:invokevirtual   #86  <Method boolean Boolean.booleanValue()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected Object readResolve()
	{
		if(_description == null && _index == null && _defaultValue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field String _description>
	//*   2    4:ifnonnull       50
	//*   3    7:aload_0         
	//*   4    8:getfield        #53  <Field Integer _index>
	//*   5   11:ifnonnull       50
	//*   6   14:aload_0         
	//*   7   15:getfield        #61  <Field String _defaultValue>
	//*   8   18:ifnonnull       50
		{
			if(_required == null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #49  <Field Boolean _required>
	//*  11   25:ifnonnull       32
				return ((Object) (STD_REQUIRED_OR_OPTIONAL));
	//   12   28:getstatic       #41  <Field PropertyMetadata STD_REQUIRED_OR_OPTIONAL>
	//   13   31:areturn         
			if(_required.booleanValue())
	//*  14   32:aload_0         
	//*  15   33:getfield        #49  <Field Boolean _required>
	//*  16   36:invokevirtual   #86  <Method boolean Boolean.booleanValue()>
	//*  17   39:ifeq            46
				return ((Object) (STD_REQUIRED));
	//   18   42:getstatic       #34  <Field PropertyMetadata STD_REQUIRED>
	//   19   45:areturn         
			else
				return ((Object) (STD_OPTIONAL));
	//   20   46:getstatic       #39  <Field PropertyMetadata STD_OPTIONAL>
	//   21   49:areturn         
		} else
		{
			return ((Object) (this));
	//   22   50:aload_0         
	//   23   51:areturn         
		}
	}

	public PropertyMetadata withDefaultValue(String s)
	{
		String s1;
		if(s == null || s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #59  <Method boolean String.isEmpty()>
	//*   4    8:ifeq            43
		{
			if(_defaultValue == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #61  <Field String _defaultValue>
	//*   7   15:ifnonnull       20
				return this;
	//    8   18:aload_0         
	//    9   19:areturn         
			s1 = null;
	//   10   20:aconst_null     
	//   11   21:astore_2        
		} else
	//*  12   22:new             #2   <Class PropertyMetadata>
	//*  13   25:dup             
	//*  14   26:aload_0         
	//*  15   27:getfield        #49  <Field Boolean _required>
	//*  16   30:aload_0         
	//*  17   31:getfield        #51  <Field String _description>
	//*  18   34:aload_0         
	//*  19   35:getfield        #53  <Field Integer _index>
	//*  20   38:aload_2         
	//*  21   39:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//*  22   42:areturn         
		{
			s1 = s;
	//   23   43:aload_1         
	//   24   44:astore_2        
			if(_defaultValue.equals(((Object) (s))))
	//*  25   45:aload_0         
	//*  26   46:getfield        #61  <Field String _defaultValue>
	//*  27   49:aload_1         
	//*  28   50:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*  29   53:ifeq            22
				return this;
	//   30   56:aload_0         
	//   31   57:areturn         
		}
		return new PropertyMetadata(_required, _description, _index, s1);
	}

	public PropertyMetadata withDescription(String s)
	{
		return new PropertyMetadata(_required, s, _index, _defaultValue);
	//    0    0:new             #2   <Class PropertyMetadata>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field Boolean _required>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field Integer _index>
	//    7   13:aload_0         
	//    8   14:getfield        #61  <Field String _defaultValue>
	//    9   17:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//   10   20:areturn         
	}

	public PropertyMetadata withIndex(Integer integer)
	{
		return new PropertyMetadata(_required, _description, integer, _defaultValue);
	//    0    0:new             #2   <Class PropertyMetadata>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field Boolean _required>
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field String _description>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #61  <Field String _defaultValue>
	//    9   17:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//   10   20:areturn         
	}

	public PropertyMetadata withRequired(Boolean boolean1)
	{
		if(boolean1 != null ? _required != null && _required.booleanValue() == boolean1.booleanValue() : _required == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
	//*   2    4:aload_0         
	//*   3    5:getfield        #49  <Field Boolean _required>
	//*   4    8:ifnonnull       34
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
	//*   7   13:aload_0         
	//*   8   14:getfield        #49  <Field Boolean _required>
	//*   9   17:ifnull          34
	//*  10   20:aload_0         
	//*  11   21:getfield        #49  <Field Boolean _required>
	//*  12   24:invokevirtual   #86  <Method boolean Boolean.booleanValue()>
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #86  <Method boolean Boolean.booleanValue()>
	//*  15   31:icmpeq          11
			return new PropertyMetadata(boolean1, _description, _index, _defaultValue);
	//   16   34:new             #2   <Class PropertyMetadata>
	//   17   37:dup             
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #51  <Field String _description>
	//   21   43:aload_0         
	//   22   44:getfield        #53  <Field Integer _index>
	//   23   47:aload_0         
	//   24   48:getfield        #61  <Field String _defaultValue>
	//   25   51:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//   26   54:areturn         
	}

	public static final PropertyMetadata STD_OPTIONAL;
	public static final PropertyMetadata STD_REQUIRED;
	public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(((Boolean) (null)), ((String) (null)), ((Integer) (null)), ((String) (null)));
	private static final long serialVersionUID = -1L;
	protected final String _defaultValue;
	protected final String _description;
	protected final Integer _index;
	protected final Boolean _required;

	static 
	{
		STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, ((String) (null)), ((Integer) (null)), ((String) (null)));
	//    0    0:new             #2   <Class PropertyMetadata>
	//    1    3:dup             
	//    2    4:getstatic       #28  <Field Boolean Boolean.TRUE>
	//    3    7:aconst_null     
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//    7   13:putstatic       #34  <Field PropertyMetadata STD_REQUIRED>
		STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, ((String) (null)), ((Integer) (null)), ((String) (null)));
	//    8   16:new             #2   <Class PropertyMetadata>
	//    9   19:dup             
	//   10   20:getstatic       #37  <Field Boolean Boolean.FALSE>
	//   11   23:aconst_null     
	//   12   24:aconst_null     
	//   13   25:aconst_null     
	//   14   26:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//   15   29:putstatic       #39  <Field PropertyMetadata STD_OPTIONAL>
	//   16   32:new             #2   <Class PropertyMetadata>
	//   17   35:dup             
	//   18   36:aconst_null     
	//   19   37:aconst_null     
	//   20   38:aconst_null     
	//   21   39:aconst_null     
	//   22   40:invokespecial   #32  <Method void PropertyMetadata(Boolean, String, Integer, String)>
	//   23   43:putstatic       #41  <Field PropertyMetadata STD_REQUIRED_OR_OPTIONAL>
	//*  24   46:return          
	}
}

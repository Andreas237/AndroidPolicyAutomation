// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

public class PropertyMetadata
	implements Serializable
{
	public static final class MergeInfo
	{

		public static MergeInfo createForDefaults(AnnotatedMember annotatedmember)
		{
			return new MergeInfo(annotatedmember, true);
		//    0    0:new             #2   <Class PropertyMetadata$MergeInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:invokespecial   #25  <Method void PropertyMetadata$MergeInfo(AnnotatedMember, boolean)>
		//    5    9:areturn         
		}

		public static MergeInfo createForPropertyOverride(AnnotatedMember annotatedmember)
		{
			return new MergeInfo(annotatedmember, false);
		//    0    0:new             #2   <Class PropertyMetadata$MergeInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokespecial   #25  <Method void PropertyMetadata$MergeInfo(AnnotatedMember, boolean)>
		//    5    9:areturn         
		}

		public static MergeInfo createForTypeOverride(AnnotatedMember annotatedmember)
		{
			return new MergeInfo(annotatedmember, false);
		//    0    0:new             #2   <Class PropertyMetadata$MergeInfo>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokespecial   #25  <Method void PropertyMetadata$MergeInfo(AnnotatedMember, boolean)>
		//    5    9:areturn         
		}

		public final boolean fromDefaults;
		public final AnnotatedMember getter;

		protected MergeInfo(AnnotatedMember annotatedmember, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			getter = annotatedmember;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field AnnotatedMember getter>
			fromDefaults = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field boolean fromDefaults>
		//    8   14:return          
		}
	}


	protected PropertyMetadata(Boolean boolean1, String s, Integer integer, String s1, MergeInfo mergeinfo, Nulls nulls, Nulls nulls1)
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
			_required = boolean1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field Boolean _required>
			_description = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field String _description>
			_index = integer;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field Integer _index>
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
	//   16   29:invokevirtual   #64  <Method boolean String.isEmpty()>
	//   17   32:ifeq            37
			}
			boolean1 = null;
	//   18   35:aconst_null     
	//   19   36:astore_1        
		}
		_defaultValue = ((String) (boolean1));
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:putfield        #66  <Field String _defaultValue>
		_mergeInfo = mergeinfo;
	//   23   42:aload_0         
	//   24   43:aload           5
	//   25   45:putfield        #68  <Field PropertyMetadata$MergeInfo _mergeInfo>
		_valueNulls = nulls;
	//   26   48:aload_0         
	//   27   49:aload           6
	//   28   51:putfield        #70  <Field Nulls _valueNulls>
		_contentNulls = nulls1;
	//   29   54:aload_0         
	//   30   55:aload           7
	//   31   57:putfield        #72  <Field Nulls _contentNulls>
	//   32   60:return          
	}

	public static PropertyMetadata construct(Boolean boolean1, String s, Integer integer, String s1)
	{
		if(s == null && integer == null && s1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       38
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       38
	//*   4    8:aload_3         
	//*   5    9:ifnull          15
	//*   6   12:goto            38
		{
			if(boolean1 == null)
	//*   7   15:aload_0         
	//*   8   16:ifnonnull       23
				return STD_REQUIRED_OR_OPTIONAL;
	//    9   19:getstatic       #49  <Field PropertyMetadata STD_REQUIRED_OR_OPTIONAL>
	//   10   22:areturn         
			if(boolean1.booleanValue())
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #77  <Method boolean Boolean.booleanValue()>
	//*  13   27:ifeq            34
				return STD_REQUIRED;
	//   14   30:getstatic       #42  <Field PropertyMetadata STD_REQUIRED>
	//   15   33:areturn         
			else
				return STD_OPTIONAL;
	//   16   34:getstatic       #47  <Field PropertyMetadata STD_OPTIONAL>
	//   17   37:areturn         
		} else
		{
			return new PropertyMetadata(boolean1, s, integer, s1, ((MergeInfo) (null)), ((Nulls) (null)), ((Nulls) (null)));
	//   18   38:new             #2   <Class PropertyMetadata>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:aconst_null     
	//   25   47:aconst_null     
	//   26   48:aconst_null     
	//   27   49:invokespecial   #40  <Method void PropertyMetadata(Boolean, String, Integer, String, PropertyMetadata$MergeInfo, Nulls, Nulls)>
	//   28   52:areturn         
		}
	}

	public Nulls getContentNulls()
	{
		return _contentNulls;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Nulls _contentNulls>
	//    2    4:areturn         
	}

	public MergeInfo getMergeInfo()
	{
		return _mergeInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field PropertyMetadata$MergeInfo _mergeInfo>
	//    2    4:areturn         
	}

	public Nulls getValueNulls()
	{
		return _valueNulls;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Nulls _valueNulls>
	//    2    4:areturn         
	}

	public boolean isRequired()
	{
		Boolean boolean1 = _required;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Boolean _required>
	//    2    4:astore_1        
		return boolean1 != null && boolean1.booleanValue();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #77  <Method boolean Boolean.booleanValue()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	protected Object readResolve()
	{
		if(_description == null && _index == null && _defaultValue == null && _mergeInfo == null && _valueNulls == null && _contentNulls == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field String _description>
	//*   2    4:ifnonnull       70
	//*   3    7:aload_0         
	//*   4    8:getfield        #58  <Field Integer _index>
	//*   5   11:ifnonnull       70
	//*   6   14:aload_0         
	//*   7   15:getfield        #66  <Field String _defaultValue>
	//*   8   18:ifnonnull       70
	//*   9   21:aload_0         
	//*  10   22:getfield        #68  <Field PropertyMetadata$MergeInfo _mergeInfo>
	//*  11   25:ifnonnull       70
	//*  12   28:aload_0         
	//*  13   29:getfield        #70  <Field Nulls _valueNulls>
	//*  14   32:ifnonnull       70
	//*  15   35:aload_0         
	//*  16   36:getfield        #72  <Field Nulls _contentNulls>
	//*  17   39:ifnonnull       70
		{
			Boolean boolean1 = _required;
	//   18   42:aload_0         
	//   19   43:getfield        #54  <Field Boolean _required>
	//   20   46:astore_1        
			if(boolean1 == null)
	//*  21   47:aload_1         
	//*  22   48:ifnonnull       55
				return ((Object) (STD_REQUIRED_OR_OPTIONAL));
	//   23   51:getstatic       #49  <Field PropertyMetadata STD_REQUIRED_OR_OPTIONAL>
	//   24   54:areturn         
			if(boolean1.booleanValue())
	//*  25   55:aload_1         
	//*  26   56:invokevirtual   #77  <Method boolean Boolean.booleanValue()>
	//*  27   59:ifeq            66
				return ((Object) (STD_REQUIRED));
	//   28   62:getstatic       #42  <Field PropertyMetadata STD_REQUIRED>
	//   29   65:areturn         
			else
				return ((Object) (STD_OPTIONAL));
	//   30   66:getstatic       #47  <Field PropertyMetadata STD_OPTIONAL>
	//   31   69:areturn         
		} else
		{
			return ((Object) (this));
	//   32   70:aload_0         
	//   33   71:areturn         
		}
	}

	public PropertyMetadata withDescription(String s)
	{
		return new PropertyMetadata(_required, s, _index, _defaultValue, _mergeInfo, _valueNulls, _contentNulls);
	//    0    0:new             #2   <Class PropertyMetadata>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Boolean _required>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #58  <Field Integer _index>
	//    7   13:aload_0         
	//    8   14:getfield        #66  <Field String _defaultValue>
	//    9   17:aload_0         
	//   10   18:getfield        #68  <Field PropertyMetadata$MergeInfo _mergeInfo>
	//   11   21:aload_0         
	//   12   22:getfield        #70  <Field Nulls _valueNulls>
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field Nulls _contentNulls>
	//   15   29:invokespecial   #40  <Method void PropertyMetadata(Boolean, String, Integer, String, PropertyMetadata$MergeInfo, Nulls, Nulls)>
	//   16   32:areturn         
	}

	public PropertyMetadata withMergeInfo(MergeInfo mergeinfo)
	{
		return new PropertyMetadata(_required, _description, _index, _defaultValue, mergeinfo, _valueNulls, _contentNulls);
	//    0    0:new             #2   <Class PropertyMetadata>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Boolean _required>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field String _description>
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field Integer _index>
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field String _defaultValue>
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #70  <Field Nulls _valueNulls>
	//   13   25:aload_0         
	//   14   26:getfield        #72  <Field Nulls _contentNulls>
	//   15   29:invokespecial   #40  <Method void PropertyMetadata(Boolean, String, Integer, String, PropertyMetadata$MergeInfo, Nulls, Nulls)>
	//   16   32:areturn         
	}

	public PropertyMetadata withNulls(Nulls nulls, Nulls nulls1)
	{
		return new PropertyMetadata(_required, _description, _index, _defaultValue, _mergeInfo, nulls, nulls1);
	//    0    0:new             #2   <Class PropertyMetadata>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Boolean _required>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field String _description>
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field Integer _index>
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field String _defaultValue>
	//   10   20:aload_0         
	//   11   21:getfield        #68  <Field PropertyMetadata$MergeInfo _mergeInfo>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokespecial   #40  <Method void PropertyMetadata(Boolean, String, Integer, String, PropertyMetadata$MergeInfo, Nulls, Nulls)>
	//   15   29:areturn         
	}

	public static final PropertyMetadata STD_OPTIONAL;
	public static final PropertyMetadata STD_REQUIRED;
	public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(((Boolean) (null)), ((String) (null)), ((Integer) (null)), ((String) (null)), ((MergeInfo) (null)), ((Nulls) (null)), ((Nulls) (null)));
	private static final long serialVersionUID = -1L;
	protected Nulls _contentNulls;
	protected final String _defaultValue;
	protected final String _description;
	protected final Integer _index;
	protected final transient MergeInfo _mergeInfo;
	protected final Boolean _required;
	protected Nulls _valueNulls;

	static 
	{
		STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, ((String) (null)), ((Integer) (null)), ((String) (null)), ((MergeInfo) (null)), ((Nulls) (null)), ((Nulls) (null)));
	//    0    0:new             #2   <Class PropertyMetadata>
	//    1    3:dup             
	//    2    4:getstatic       #36  <Field Boolean Boolean.TRUE>
	//    3    7:aconst_null     
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:invokespecial   #40  <Method void PropertyMetadata(Boolean, String, Integer, String, PropertyMetadata$MergeInfo, Nulls, Nulls)>
	//   10   16:putstatic       #42  <Field PropertyMetadata STD_REQUIRED>
		STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, ((String) (null)), ((Integer) (null)), ((String) (null)), ((MergeInfo) (null)), ((Nulls) (null)), ((Nulls) (null)));
	//   11   19:new             #2   <Class PropertyMetadata>
	//   12   22:dup             
	//   13   23:getstatic       #45  <Field Boolean Boolean.FALSE>
	//   14   26:aconst_null     
	//   15   27:aconst_null     
	//   16   28:aconst_null     
	//   17   29:aconst_null     
	//   18   30:aconst_null     
	//   19   31:aconst_null     
	//   20   32:invokespecial   #40  <Method void PropertyMetadata(Boolean, String, Integer, String, PropertyMetadata$MergeInfo, Nulls, Nulls)>
	//   21   35:putstatic       #47  <Field PropertyMetadata STD_OPTIONAL>
	//   22   38:new             #2   <Class PropertyMetadata>
	//   23   41:dup             
	//   24   42:aconst_null     
	//   25   43:aconst_null     
	//   26   44:aconst_null     
	//   27   45:aconst_null     
	//   28   46:aconst_null     
	//   29   47:aconst_null     
	//   30   48:aconst_null     
	//   31   49:invokespecial   #40  <Method void PropertyMetadata(Boolean, String, Integer, String, PropertyMetadata$MergeInfo, Nulls, Nulls)>
	//   32   52:putstatic       #49  <Field PropertyMetadata STD_REQUIRED_OR_OPTIONAL>
	//*  33   55:return          
	}
}

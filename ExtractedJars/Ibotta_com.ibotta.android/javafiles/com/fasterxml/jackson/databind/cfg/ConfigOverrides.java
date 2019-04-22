// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			MutableConfigOverride, ConfigOverride

public class ConfigOverrides
	implements Serializable
{

	public ConfigOverrides()
	{
		this(((Map) (null)), com.fasterxml.jackson.annotation.JsonInclude.Value.empty(), com.fasterxml.jackson.annotation.JsonSetter.Value.empty(), ((VisibilityChecker) (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance())), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #30  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    3    5:invokestatic    #35  <Method com.fasterxml.jackson.annotation.JsonSetter$Value com.fasterxml.jackson.annotation.JsonSetter$Value.empty()>
	//    4    8:invokestatic    #41  <Method com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std.defaultInstance()>
	//    5   11:aconst_null     
	//    6   12:invokespecial   #44  <Method void ConfigOverrides(Map, com.fasterxml.jackson.annotation.JsonInclude$Value, com.fasterxml.jackson.annotation.JsonSetter$Value, VisibilityChecker, Boolean)>
	//    7   15:return          
	}

	protected ConfigOverrides(Map map, com.fasterxml.jackson.annotation.JsonInclude.Value value, com.fasterxml.jackson.annotation.JsonSetter.Value value1, VisibilityChecker visibilitychecker, Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		_overrides = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Map _overrides>
		_defaultInclusion = value;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
		_defaultSetterInfo = value1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #53  <Field com.fasterxml.jackson.annotation.JsonSetter$Value _defaultSetterInfo>
		_visibilityChecker = visibilitychecker;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #55  <Field VisibilityChecker _visibilityChecker>
		_defaultMergeable = boolean1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #57  <Field Boolean _defaultMergeable>
	//   17   31:return          
	}

	protected Map _newMap()
	{
		return ((Map) (new HashMap()));
	//    0    0:new             #63  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void HashMap()>
	//    3    7:areturn         
	}

	public MutableConfigOverride findOrCreateOverride(Class class1)
	{
		if(_overrides == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field Map _overrides>
	//*   2    4:ifnonnull       15
			_overrides = _newMap();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method Map _newMap()>
	//    6   12:putfield        #49  <Field Map _overrides>
		MutableConfigOverride mutableconfigoverride1 = (MutableConfigOverride)_overrides.get(((Object) (class1)));
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field Map _overrides>
	//    9   19:aload_1         
	//   10   20:invokeinterface #75  <Method Object Map.get(Object)>
	//   11   25:checkcast       #77  <Class MutableConfigOverride>
	//   12   28:astore_3        
		MutableConfigOverride mutableconfigoverride = mutableconfigoverride1;
	//   13   29:aload_3         
	//   14   30:astore_2        
		if(mutableconfigoverride1 == null)
	//*  15   31:aload_3         
	//*  16   32:ifnonnull       55
		{
			mutableconfigoverride = new MutableConfigOverride();
	//   17   35:new             #77  <Class MutableConfigOverride>
	//   18   38:dup             
	//   19   39:invokespecial   #78  <Method void MutableConfigOverride()>
	//   20   42:astore_2        
			_overrides.put(((Object) (class1)), ((Object) (mutableconfigoverride)));
	//   21   43:aload_0         
	//   22   44:getfield        #49  <Field Map _overrides>
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokeinterface #82  <Method Object Map.put(Object, Object)>
	//   26   54:pop             
		}
		return mutableconfigoverride;
	//   27   55:aload_2         
	//   28   56:areturn         
	}

	public ConfigOverride findOverride(Class class1)
	{
		Map map = _overrides;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Map _overrides>
	//    2    4:astore_2        
		if(map == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (ConfigOverride)map.get(((Object) (class1)));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokeinterface #75  <Method Object Map.get(Object)>
	//   10   18:checkcast       #87  <Class ConfigOverride>
	//   11   21:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultInclusion()
	{
		return _defaultInclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
	//    2    4:areturn         
	}

	public Boolean getDefaultMergeable()
	{
		return _defaultMergeable;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Boolean _defaultMergeable>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonSetter.Value getDefaultSetterInfo()
	{
		return _defaultSetterInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field com.fasterxml.jackson.annotation.JsonSetter$Value _defaultSetterInfo>
	//    2    4:areturn         
	}

	public VisibilityChecker getDefaultVisibility()
	{
		return _visibilityChecker;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field VisibilityChecker _visibilityChecker>
	//    2    4:areturn         
	}

	public void setDefaultInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		_defaultInclusion = value;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
	//    3    5:return          
	}

	private static final long serialVersionUID = 1L;
	protected com.fasterxml.jackson.annotation.JsonInclude.Value _defaultInclusion;
	protected Boolean _defaultMergeable;
	protected com.fasterxml.jackson.annotation.JsonSetter.Value _defaultSetterInfo;
	protected Map _overrides;
	protected VisibilityChecker _visibilityChecker;
}

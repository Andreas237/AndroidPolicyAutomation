// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;


public abstract class ConfigOverride
{
	static final class Empty extends ConfigOverride
	{

		static final Empty INSTANCE = new Empty();

		static 
		{
		//    0    0:new             #2   <Class ConfigOverride$Empty>
		//    1    3:dup             
		//    2    4:invokespecial   #12  <Method void ConfigOverride$Empty()>
		//    3    7:putstatic       #14  <Field ConfigOverride$Empty INSTANCE>
		//*   4   10:return          
		}

		private Empty()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ConfigOverride()>
		//    2    4:return          
		}
	}


	protected ConfigOverride()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public static ConfigOverride empty()
	{
		return ((ConfigOverride) (Empty.INSTANCE));
	//    0    0:getstatic       #32  <Field ConfigOverride$Empty ConfigOverride$Empty.INSTANCE>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value getFormat()
	{
		return _format;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _format>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value getIgnorals()
	{
		return _ignorals;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value _ignorals>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value getInclude()
	{
		return _include;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _include>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value getIncludeAsProperty()
	{
		return _includeAsProperty;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _includeAsProperty>
	//    2    4:areturn         
	}

	public Boolean getIsIgnoredType()
	{
		return _isIgnoredType;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Boolean _isIgnoredType>
	//    2    4:areturn         
	}

	public Boolean getMergeable()
	{
		return _mergeable;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Boolean _mergeable>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonSetter.Value getSetterInfo()
	{
		return _setterInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field com.fasterxml.jackson.annotation.JsonSetter$Value _setterInfo>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonAutoDetect.Value getVisibility()
	{
		return _visibility;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Value _visibility>
	//    2    4:areturn         
	}

	protected com.fasterxml.jackson.annotation.JsonFormat.Value _format;
	protected com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value _ignorals;
	protected com.fasterxml.jackson.annotation.JsonInclude.Value _include;
	protected com.fasterxml.jackson.annotation.JsonInclude.Value _includeAsProperty;
	protected Boolean _isIgnoredType;
	protected Boolean _mergeable;
	protected com.fasterxml.jackson.annotation.JsonSetter.Value _setterInfo;
	protected com.fasterxml.jackson.annotation.JsonAutoDetect.Value _visibility;
}

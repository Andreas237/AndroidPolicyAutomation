// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;


public final class FormatParameters
{
	public static class Builder
	{

		public FormatParameters build()
		{
			return new FormatParameters(this);
		//    0    0:new             #6   <Class FormatParameters>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #19  <Method void FormatParameters(FormatParameters$Builder)>
		//    4    8:areturn         
		}

		public Builder region(String s)
		{
			region = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field String region>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		String region;

		Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	FormatParameters(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		region = builder.region;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #30  <Field String FormatParameters$Builder.region>
	//    5    9:putfield        #31  <Field String region>
	//    6   12:return          
	}

	public static Builder newBuilder()
	{
		return new Builder();
	//    0    0:new             #6   <Class FormatParameters$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void FormatParameters$Builder()>
	//    3    7:areturn         
	}

	public String getRegion()
	{
		return region;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String region>
	//    2    4:areturn         
	}

	public static final FormatParameters DEFAULT = newBuilder().build();
	private final String region;

	static 
	{
	//    0    0:invokestatic    #17  <Method FormatParameters$Builder newBuilder()>
	//    1    3:invokevirtual   #21  <Method FormatParameters FormatParameters$Builder.build()>
	//    2    6:putstatic       #23  <Field FormatParameters DEFAULT>
	//*   3    9:return          
	}
}

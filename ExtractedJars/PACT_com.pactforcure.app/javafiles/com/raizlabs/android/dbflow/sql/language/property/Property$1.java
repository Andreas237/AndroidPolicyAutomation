// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.language.NameAlias;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			Property, IProperty

static final class Property$1 extends Property
{

	public volatile IProperty as(String s)
	{
		return ((IProperty) (super.as(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method Property Property.as(String)>
	//    3    5:areturn         
	}

	public volatile IProperty concatenate(IProperty iproperty)
	{
		return ((IProperty) (super.concatenate(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method Property Property.concatenate(IProperty)>
	//    3    5:areturn         
	}

	public volatile IProperty distinct()
	{
		return ((IProperty) (super.distinct()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method Property Property.distinct()>
	//    2    4:areturn         
	}

	public volatile IProperty dividedBy(IProperty iproperty)
	{
		return ((IProperty) (super.dividedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method Property Property.dividedBy(IProperty)>
	//    3    5:areturn         
	}

	public volatile IProperty minus(IProperty iproperty)
	{
		return ((IProperty) (super.minus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method Property Property.minus(IProperty)>
	//    3    5:areturn         
	}

	public volatile IProperty mod(IProperty iproperty)
	{
		return ((IProperty) (super.mod(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method Property Property.mod(IProperty)>
	//    3    5:areturn         
	}

	public volatile IProperty multipliedBy(IProperty iproperty)
	{
		return ((IProperty) (super.multipliedBy(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method Property Property.multipliedBy(IProperty)>
	//    3    5:areturn         
	}

	public volatile IProperty plus(IProperty iproperty)
	{
		return ((IProperty) (super.plus(iproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method Property Property.plus(IProperty)>
	//    3    5:areturn         
	}

	public String toString()
	{
		return nameAlias.nameRaw();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field NameAlias nameAlias>
	//    2    4:invokevirtual   #51  <Method String NameAlias.nameRaw()>
	//    3    7:areturn         
	}

	public volatile IProperty withTable(NameAlias namealias)
	{
		return ((IProperty) (super.withTable(namealias)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method Property Property.withTable(NameAlias)>
	//    3    5:areturn         
	}

	Property$1(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void Property(Class, String)>
	//    4    6:return          
	}
}

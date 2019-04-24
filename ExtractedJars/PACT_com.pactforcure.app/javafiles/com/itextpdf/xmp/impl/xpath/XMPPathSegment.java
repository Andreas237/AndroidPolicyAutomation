// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl.xpath;


public class XMPPathSegment
{

	public XMPPathSegment(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String name>
	//    5    9:return          
	}

	public XMPPathSegment(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String name>
		kind = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int kind>
	//    8   14:return          
	}

	public int getAliasForm()
	{
		return aliasForm;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int aliasForm>
	//    2    4:ireturn         
	}

	public int getKind()
	{
		return kind;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int kind>
	//    2    4:ireturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String name>
	//    2    4:areturn         
	}

	public boolean isAlias()
	{
		return alias;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean alias>
	//    2    4:ireturn         
	}

	public void setAlias(boolean flag)
	{
		alias = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean alias>
	//    3    5:return          
	}

	public void setAliasForm(int i)
	{
		aliasForm = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int aliasForm>
	//    3    5:return          
	}

	public void setKind(int i)
	{
		kind = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int kind>
	//    3    5:return          
	}

	public void setName(String s)
	{
		name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String name>
	//    3    5:return          
	}

	public String toString()
	{
		switch(kind)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int kind>
		{
	//*   2    4:tableswitch     1 6: default 44
	//	               1 49
	//	               2 49
	//	               3 49
	//	               4 49
	//	               5 54
	//	               6 54
		default:
			return name;
	//    3   44:aload_0         
	//    4   45:getfield        #18  <Field String name>
	//    5   48:areturn         

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
			return name;
	//    6   49:aload_0         
	//    7   50:getfield        #18  <Field String name>
	//    8   53:areturn         

		case 5: // '\005'
		case 6: // '\006'
			return name;
	//    9   54:aload_0         
	//   10   55:getfield        #18  <Field String name>
	//   11   58:areturn         
		}
	}

	private boolean alias;
	private int aliasForm;
	private int kind;
	private String name;
}

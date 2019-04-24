// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;


public class ForeignCollectionInfo
{

	public ForeignCollectionInfo(boolean flag, int i, String s, String s1, String s2, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		eager = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field boolean eager>
		maxEagerLevel = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int maxEagerLevel>
		orderBy = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field String orderBy>
		foreignFieldName = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field String foreignFieldName>
		variableName = s2;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #29  <Field String variableName>
		foreignFieldType = class1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #31  <Field Class foreignFieldType>
	//   20   37:return          
	}

	public final boolean eager;
	public final String foreignFieldName;
	public final Class foreignFieldType;
	public final int maxEagerLevel;
	public final String orderBy;
	public final String variableName;
}

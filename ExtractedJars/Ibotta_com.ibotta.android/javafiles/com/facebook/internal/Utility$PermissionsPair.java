// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.List;

// Referenced classes of package com.facebook.internal:
//			Utility

public static class Utility$PermissionsPair
{

	public List getDeclinedPermissions()
	{
		return declinedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List declinedPermissions>
	//    2    4:areturn         
	}

	public List getGrantedPermissions()
	{
		return grantedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List grantedPermissions>
	//    2    4:areturn         
	}

	List declinedPermissions;
	List grantedPermissions;

	public Utility$PermissionsPair(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		grantedPermissions = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field List grantedPermissions>
		declinedPermissions = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field List declinedPermissions>
	//    8   14:return          
	}
}

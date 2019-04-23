// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class AppInviteDialogFeature extends Enum
	implements DialogFeature
{

	private AppInviteDialogFeature(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		minVersion = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #31  <Field int minVersion>
	//    7   11:return          
	}

	public static AppInviteDialogFeature valueOf(String s)
	{
		return (AppInviteDialogFeature)Enum.valueOf(com/facebook/share/internal/AppInviteDialogFeature, s);
	//    0    0:ldc1            #2   <Class AppInviteDialogFeature>
	//    1    2:aload_0         
	//    2    3:invokestatic    #38  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppInviteDialogFeature>
	//    4    9:areturn         
	}

	public static AppInviteDialogFeature[] values()
	{
		return (AppInviteDialogFeature[])((AppInviteDialogFeature []) ($VALUES)).clone();
	//    0    0:getstatic       #25  <Field AppInviteDialogFeature[] $VALUES>
	//    1    3:invokevirtual   #45  <Method Object _5B_Lcom.facebook.share.internal.AppInviteDialogFeature_3B_.clone()>
	//    2    6:checkcast       #41  <Class AppInviteDialogFeature[]>
	//    3    9:areturn         
	}

	public String getAction()
	{
		return "com.facebook.platform.action.request.APPINVITES_DIALOG";
	//    0    0:ldc1            #49  <String "com.facebook.platform.action.request.APPINVITES_DIALOG">
	//    1    2:areturn         
	}

	public int getMinVersion()
	{
		return minVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int minVersion>
	//    2    4:ireturn         
	}

	private static final AppInviteDialogFeature $VALUES[];
	public static final AppInviteDialogFeature APP_INVITES_DIALOG;
	private int minVersion;

	static 
	{
		APP_INVITES_DIALOG = new AppInviteDialogFeature("APP_INVITES_DIALOG", 0, 0x133529d);
	//    0    0:new             #2   <Class AppInviteDialogFeature>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "APP_INVITES_DIALOG">
	//    3    6:iconst_0        
	//    4    7:ldc1            #17  <Int 0x133529d>
	//    5    9:invokespecial   #21  <Method void AppInviteDialogFeature(String, int, int)>
	//    6   12:putstatic       #23  <Field AppInviteDialogFeature APP_INVITES_DIALOG>
		$VALUES = (new AppInviteDialogFeature[] {
			APP_INVITES_DIALOG
		});
	//    7   15:iconst_1        
	//    8   16:anewarray       AppInviteDialogFeature[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:getstatic       #23  <Field AppInviteDialogFeature APP_INVITES_DIALOG>
	//   12   24:aastore         
	//   13   25:putstatic       #25  <Field AppInviteDialogFeature[] $VALUES>
	//*  14   28:return          
	}
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.aws.authentication.model;


public class AssetPoolAssociationInfo
{

	public AssetPoolAssociationInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mAssetId = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field String mAssetId>
		mAssetPassword = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field String mAssetPassword>
		mIsDeleted = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #25  <Field boolean mIsDeleted>
	//   11   19:return          
	}

	public AssetPoolAssociationInfo(String s, String s1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mAssetId = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field String mAssetId>
		mAssetPassword = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field String mAssetPassword>
		mIsDeleted = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #25  <Field boolean mIsDeleted>
		mAssetId = s;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #21  <Field String mAssetId>
		mAssetPassword = s1;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #23  <Field String mAssetPassword>
		mIsDeleted = flag;
	//   17   29:aload_0         
	//   18   30:iload_3         
	//   19   31:putfield        #25  <Field boolean mIsDeleted>
	//   20   34:return          
	}

	public String getAssetId()
	{
		return mAssetId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String mAssetId>
	//    2    4:areturn         
	}

	public String getAssetPassword()
	{
		return mAssetPassword;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mAssetPassword>
	//    2    4:areturn         
	}

	public boolean isDeleted()
	{
		return mIsDeleted;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean mIsDeleted>
	//    2    4:ireturn         
	}

	private String mAssetId;
	private String mAssetPassword;
	private boolean mIsDeleted;
}

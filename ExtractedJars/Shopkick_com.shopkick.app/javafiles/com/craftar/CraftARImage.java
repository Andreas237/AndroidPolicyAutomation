// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


public class CraftARImage
{

	CraftARImage(String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mImageUUID = s3;
	//    2    4:aload_0         
	//    3    5:aload           4
	//    4    7:putfield        #17  <Field String mImageUUID>
		s = s.replace("{0}", ((CharSequence) (s1))).replace("{1}", ((CharSequence) (s2))).replace("{2}", ((CharSequence) (s3))).replace("{collection_uuid}", ((CharSequence) (s1))).replace("{item_uuid}", ((CharSequence) (s2))).replace("{image_uuid}", ((CharSequence) (s3)));
	//    5   10:aload_1         
	//    6   11:ldc1            #19  <String "{0}">
	//    7   13:aload_2         
	//    8   14:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//    9   17:ldc1            #27  <String "{1}">
	//   10   19:aload_3         
	//   11   20:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//   12   23:ldc1            #29  <String "{2}">
	//   13   25:aload           4
	//   14   27:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//   15   30:ldc1            #31  <String "{collection_uuid}">
	//   16   32:aload_2         
	//   17   33:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//   18   36:ldc1            #33  <String "{item_uuid}">
	//   19   38:aload_3         
	//   20   39:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//   21   42:ldc1            #35  <String "{image_uuid}">
	//   22   44:aload           4
	//   23   46:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//   24   49:astore_1        
		mThumbnail60 = s.replace("_120", "_60");
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:ldc1            #37  <String "_120">
	//   28   54:ldc1            #39  <String "_60">
	//   29   56:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//   30   59:putfield        #41  <Field String mThumbnail60>
		mThumbnail120 = s;
	//   31   62:aload_0         
	//   32   63:aload_1         
	//   33   64:putfield        #43  <Field String mThumbnail120>
		mThumbnail320 = s.replace("_120", "_320");
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:ldc1            #37  <String "_120">
	//   37   71:ldc1            #45  <String "_320">
	//   38   73:invokevirtual   #25  <Method String String.replace(CharSequence, CharSequence)>
	//   39   76:putfield        #47  <Field String mThumbnail320>
	//   40   79:return          
	}

	public String getThumbnail120URL()
	{
		return mThumbnail120;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String mThumbnail120>
	//    2    4:areturn         
	}

	public String getThumbnail320URL()
	{
		return mThumbnail320;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String mThumbnail320>
	//    2    4:areturn         
	}

	public String getThumbnail60URL()
	{
		return mThumbnail60;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String mThumbnail60>
	//    2    4:areturn         
	}

	public String getUUID()
	{
		return mImageUUID;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String mImageUUID>
	//    2    4:areturn         
	}

	protected String mImageTemplate;
	protected String mImageUUID;
	protected String mThumbnail120;
	protected String mThumbnail320;
	protected String mThumbnail60;
}

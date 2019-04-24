// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class FirmwareUpdateItem
{

	public FirmwareUpdateItem(String s, String s1, String s2, String s3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mVersion = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String mVersion>
		mNotes = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String mNotes>
		mReleaseDate = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field String mReleaseDate>
		mDownloadUrl = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #23  <Field String mDownloadUrl>
		mMetaPackage = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #25  <Field String mMetaPackage>
	//   17   31:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof FirmwareUpdateItem;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class FirmwareUpdateItem>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((FirmwareUpdateItem)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class FirmwareUpdateItem>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(mVersion.equals(((Object) (((FirmwareUpdateItem) (obj)).mVersion))))
	//*  14   20:aload_0         
	//*  15   21:getfield        #17  <Field String mVersion>
	//*  16   24:aload_1         
	//*  17   25:getfield        #17  <Field String mVersion>
	//*  18   28:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  19   31:ifeq            100
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(mNotes.equals(((Object) (((FirmwareUpdateItem) (obj)).mNotes))))
	//*  22   36:aload_0         
	//*  23   37:getfield        #19  <Field String mNotes>
	//*  24   40:aload_1         
	//*  25   41:getfield        #19  <Field String mNotes>
	//*  26   44:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  27   47:ifeq            100
			{
				flag = flag1;
	//   28   50:iload_3         
	//   29   51:istore_2        
				if(mReleaseDate.equals(((Object) (((FirmwareUpdateItem) (obj)).mReleaseDate))))
	//*  30   52:aload_0         
	//*  31   53:getfield        #21  <Field String mReleaseDate>
	//*  32   56:aload_1         
	//*  33   57:getfield        #21  <Field String mReleaseDate>
	//*  34   60:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  35   63:ifeq            100
				{
					flag = flag1;
	//   36   66:iload_3         
	//   37   67:istore_2        
					if(mDownloadUrl.equals(((Object) (((FirmwareUpdateItem) (obj)).mDownloadUrl))))
	//*  38   68:aload_0         
	//*  39   69:getfield        #23  <Field String mDownloadUrl>
	//*  40   72:aload_1         
	//*  41   73:getfield        #23  <Field String mDownloadUrl>
	//*  42   76:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  43   79:ifeq            100
					{
						flag = flag1;
	//   44   82:iload_3         
	//   45   83:istore_2        
						if(mMetaPackage.equals(((Object) (((FirmwareUpdateItem) (obj)).mMetaPackage))))
	//*  46   84:aload_0         
	//*  47   85:getfield        #25  <Field String mMetaPackage>
	//*  48   88:aload_1         
	//*  49   89:getfield        #25  <Field String mMetaPackage>
	//*  50   92:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  51   95:ifeq            100
							flag = true;
	//   52   98:iconst_1        
	//   53   99:istore_2        
					}
				}
			}
		}
		return flag;
	//   54  100:iload_2         
	//   55  101:ireturn         
	}

	public String getDownloadUrl()
	{
		return mDownloadUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String mDownloadUrl>
	//    2    4:areturn         
	}

	public String getMetaPackage()
	{
		return mMetaPackage;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String mMetaPackage>
	//    2    4:areturn         
	}

	public String getNotes()
	{
		return mNotes;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String mNotes>
	//    2    4:areturn         
	}

	public String getReleaseDate()
	{
		return mReleaseDate;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String mReleaseDate>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return mVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String mVersion>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((((527 + mVersion.hashCode()) * 31 + mNotes.hashCode()) * 31 + mReleaseDate.hashCode()) * 31 + mDownloadUrl.hashCode()) * 31 + mMetaPackage.hashCode();
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field String mVersion>
	//    3    7:invokevirtual   #42  <Method int String.hashCode()>
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field String mNotes>
	//    9   18:invokevirtual   #42  <Method int String.hashCode()>
	//   10   21:iadd            
	//   11   22:bipush          31
	//   12   24:imul            
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field String mReleaseDate>
	//   15   29:invokevirtual   #42  <Method int String.hashCode()>
	//   16   32:iadd            
	//   17   33:bipush          31
	//   18   35:imul            
	//   19   36:aload_0         
	//   20   37:getfield        #23  <Field String mDownloadUrl>
	//   21   40:invokevirtual   #42  <Method int String.hashCode()>
	//   22   43:iadd            
	//   23   44:bipush          31
	//   24   46:imul            
	//   25   47:aload_0         
	//   26   48:getfield        #25  <Field String mMetaPackage>
	//   27   51:invokevirtual   #42  <Method int String.hashCode()>
	//   28   54:iadd            
	//   29   55:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("FirmwareUpdateItem{mVersion=");
	//    4    8:aload_1         
	//    5    9:ldc1            #48  <String "FirmwareUpdateItem{mVersion=">
	//    6   11:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mVersion);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #17  <Field String mVersion>
	//   11   20:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(",mNotes=");
	//   13   24:aload_1         
	//   14   25:ldc1            #54  <String ",mNotes=">
	//   15   27:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mNotes);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #19  <Field String mNotes>
	//   20   36:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(",mReleaseDate=");
	//   22   40:aload_1         
	//   23   41:ldc1            #56  <String ",mReleaseDate=">
	//   24   43:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mReleaseDate);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #21  <Field String mReleaseDate>
	//   29   52:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(",mDownloadUrl=");
	//   31   56:aload_1         
	//   32   57:ldc1            #58  <String ",mDownloadUrl=">
	//   33   59:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mDownloadUrl);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #23  <Field String mDownloadUrl>
	//   38   68:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(",mMetaPackage=");
	//   40   72:aload_1         
	//   41   73:ldc1            #60  <String ",mMetaPackage=">
	//   42   75:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mMetaPackage);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #25  <Field String mMetaPackage>
	//   47   84:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   48   87:pop             
		stringbuilder.append("}");
	//   49   88:aload_1         
	//   50   89:ldc1            #62  <String "}">
	//   51   91:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		return stringbuilder.toString();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   55   99:areturn         
	}

	final String mDownloadUrl;
	final String mMetaPackage;
	final String mNotes;
	final String mReleaseDate;
	final String mVersion;
}

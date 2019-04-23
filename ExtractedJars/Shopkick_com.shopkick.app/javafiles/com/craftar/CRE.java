// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.ArrayList;

// Referenced classes of package com.craftar:
//			CREResult, CLog, CraftARBoundingBox

class CRE
{

	CRE()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private native int addImageInternal(String s);

	private native int createInternal();

	private native void deleteInternal();

	private native int initInternal(String s);

	private native boolean loadGroupInternal(String s, String s1, String s2, String s3);

	private native boolean loadImageInternal(String s, String s1);

	private void onSearchError(int i)
	{
	//    0    0:return          
	}

	private native void searchInternal(String s, Object obj);

	private native void searchJPEGInternal(byte abyte0[], Object obj);

	private native void searchNV21Internal(byte abyte0[], int i, int j, Object obj);

	private native void setGroupInternal(String s);

	private native int sizeInternal();

	private native boolean unloadGroupInternal(String s);

	private native boolean unloadImageInternal(String s, String s1);

	void addCREError(ArrayList arraylist, int i)
	{
		CREResult creresult = new CREResult();
	//    0    0:new             #47  <Class CREResult>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void CREResult()>
	//    3    7:astore_3        
		creresult.errorCode = i;
	//    4    8:aload_3         
	//    5    9:iload_2         
	//    6   10:putfield        #52  <Field int CREResult.errorCode>
		arraylist.add(((Object) (creresult)));
	//    7   13:aload_1         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
	//   10   18:pop             
	//   11   19:return          
	}

	void addCREResult(ArrayList arraylist, String s, double d, float f, float f1, float f2, 
			float f3, float f4, float f5, float f6, float f7)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void StringBuilder()>
	//    3    7:astore          13
		stringbuilder.append("Adding CREResult! ");
	//    4    9:aload           13
	//    5   11:ldc1            #69  <String "Adding CREResult! ">
	//    6   13:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           13
	//    9   19:aload_2         
	//   10   20:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		CLog.i(stringbuilder.toString());
	//   12   24:aload           13
	//   13   26:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   14   29:invokestatic    #82  <Method void CLog.i(String)>
		if(arraylist instanceof ArrayList)
	//*  15   32:aload_1         
	//*  16   33:instanceof      #54  <Class ArrayList>
	//*  17   36:ifeq            164
		{
			CREResult creresult = new CREResult();
	//   18   39:new             #47  <Class CREResult>
	//   19   42:dup             
	//   20   43:invokespecial   #48  <Method void CREResult()>
	//   21   46:astore          13
			creresult.errorCode = 0;
	//   22   48:aload           13
	//   23   50:iconst_0        
	//   24   51:putfield        #52  <Field int CREResult.errorCode>
			creresult.id = s;
	//   25   54:aload           13
	//   26   56:aload_2         
	//   27   57:putfield        #86  <Field String CREResult.id>
			creresult.bb.TLx = f;
	//   28   60:aload           13
	//   29   62:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   30   65:fload           5
	//   31   67:putfield        #96  <Field float CraftARBoundingBox.TLx>
			creresult.bb.TLy = f1;
	//   32   70:aload           13
	//   33   72:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   34   75:fload           6
	//   35   77:putfield        #99  <Field float CraftARBoundingBox.TLy>
			creresult.bb.TRx = f2;
	//   36   80:aload           13
	//   37   82:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   38   85:fload           7
	//   39   87:putfield        #102 <Field float CraftARBoundingBox.TRx>
			creresult.bb.TRy = f3;
	//   40   90:aload           13
	//   41   92:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   42   95:fload           8
	//   43   97:putfield        #105 <Field float CraftARBoundingBox.TRy>
			creresult.bb.BLx = f4;
	//   44  100:aload           13
	//   45  102:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   46  105:fload           9
	//   47  107:putfield        #108 <Field float CraftARBoundingBox.BLx>
			creresult.bb.BLy = f5;
	//   48  110:aload           13
	//   49  112:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   50  115:fload           10
	//   51  117:putfield        #111 <Field float CraftARBoundingBox.BLy>
			creresult.bb.BRx = f6;
	//   52  120:aload           13
	//   53  122:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   54  125:fload           11
	//   55  127:putfield        #114 <Field float CraftARBoundingBox.BRx>
			creresult.bb.BRy = f7;
	//   56  130:aload           13
	//   57  132:getfield        #90  <Field CraftARBoundingBox CREResult.bb>
	//   58  135:fload           12
	//   59  137:putfield        #117 <Field float CraftARBoundingBox.BRy>
			creresult.score = d;
	//   60  140:aload           13
	//   61  142:dload_3         
	//   62  143:putfield        #121 <Field double CREResult.score>
			try
			{
				arraylist.add(((Object) (creresult)));
	//   63  146:aload_1         
	//   64  147:aload           13
	//   65  149:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
	//   66  152:pop             
				return;
	//   67  153:return          
			}
			// Misplaced declaration of an exception variable
			catch(ArrayList arraylist)
	//*  68  154:astore_1        
			{
				CLog.d("Error adding result to results list");
	//   69  155:ldc1            #123 <String "Error adding result to results list">
	//   70  157:invokestatic    #126 <Method void CLog.d(String)>
			}
			((Exception) (arraylist)).printStackTrace();
	//   71  160:aload_1         
	//   72  161:invokevirtual   #129 <Method void Exception.printStackTrace()>
		}
	//   73  164:return          
	}

	public int addImage(String s)
	{
		return addImageInternal(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #133 <Method int addImageInternal(String)>
	//    3    5:ireturn         
	}

	public int create()
	{
		return createInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method int createInternal()>
	//    2    4:ireturn         
	}

	public void delete()
	{
		deleteInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method void deleteInternal()>
	//    2    4:return          
	}

	public int init(String s)
	{
		return initInternal(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method int initInternal(String)>
	//    3    5:ireturn         
	}

	public boolean loadGroup(String s, String s1, String s2, String s3)
	{
		return loadGroupInternal(s, s1, s2, s3.replaceAll("\r", "").replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", ""));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:ldc1            #145 <String "\r">
	//    6    8:ldc1            #147 <String "">
	//    7   10:invokevirtual   #153 <Method String String.replaceAll(String, String)>
	//    8   13:ldc1            #155 <String "-----BEGIN PUBLIC KEY-----\n">
	//    9   15:ldc1            #147 <String "">
	//   10   17:invokevirtual   #159 <Method String String.replace(CharSequence, CharSequence)>
	//   11   20:ldc1            #161 <String "-----END PUBLIC KEY-----">
	//   12   22:ldc1            #147 <String "">
	//   13   24:invokevirtual   #159 <Method String String.replace(CharSequence, CharSequence)>
	//   14   27:invokespecial   #163 <Method boolean loadGroupInternal(String, String, String, String)>
	//   15   30:ireturn         
	}

	public boolean loadImage(String s, String s1)
	{
		return loadImageInternal(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #166 <Method boolean loadImageInternal(String, String)>
	//    4    6:ireturn         
	}

	public ArrayList search(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #169 <Method void ArrayList()>
	//    3    7:astore_2        
		searchInternal(s, ((Object) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #171 <Method void searchInternal(String, Object)>
		return arraylist;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public ArrayList searchJPEG(byte abyte0[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #169 <Method void ArrayList()>
	//    3    7:astore_2        
		searchJPEGInternal(abyte0, ((Object) (arraylist)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #176 <Method void searchJPEGInternal(byte[], Object)>
		return arraylist;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public ArrayList searchNV21(byte abyte0[], int i, int j)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #169 <Method void ArrayList()>
	//    3    7:astore          4
		searchNV21Internal(abyte0, i, j, ((Object) (arraylist)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:iload_2         
	//    7   12:iload_3         
	//    8   13:aload           4
	//    9   15:invokespecial   #181 <Method void searchNV21Internal(byte[], int, int, Object)>
		return arraylist;
	//   10   18:aload           4
	//   11   20:areturn         
	}

	public void setGroup(String s)
	{
		setGroupInternal(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void setGroupInternal(String)>
	//    3    5:return          
	}

	public int size()
	{
		return sizeInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method int sizeInternal()>
	//    2    4:ireturn         
	}

	public boolean unloadGroup(String s)
	{
		return unloadGroupInternal(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #191 <Method boolean unloadGroupInternal(String)>
	//    3    5:ireturn         
	}

	public boolean unloadImage(String s, String s1)
	{
		return unloadImageInternal(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #194 <Method boolean unloadImageInternal(String, String)>
	//    4    6:ireturn         
	}

	static 
	{
		System.loadLibrary("CRE");
	//    0    0:ldc1            #8   <String "CRE">
	//    1    2:invokestatic    #14  <Method void System.loadLibrary(String)>
		System.loadLibrary("crewrapper");
	//    2    5:ldc1            #16  <String "crewrapper">
	//    3    7:invokestatic    #14  <Method void System.loadLibrary(String)>
	//*   4   10:return          
	}
}

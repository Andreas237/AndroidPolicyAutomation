// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.io.*;
import java.util.*;
import org.json.*;

// Referenced classes of package com.craftar:
//			CraftARCollection, CLog, CraftARItemFactory, CraftAROnDeviceCollectionManager, 
//			CraftARItem

public class CraftAROnDeviceCollection extends CraftARCollection
{

	CraftAROnDeviceCollection(JSONObject jsonobject)
		throws JSONException
	{
		super(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void CraftARCollection(JSONObject)>
		reloadOnDeviceFromJSONObject(jsonobject);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #26  <Method void reloadOnDeviceFromJSONObject(JSONObject)>
	//    6   10:return          
	}

	String getBundleVersion()
	{
		return mBundleSDKVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mBundleSDKVersion>
	//    2    4:areturn         
	}

	public CraftARItem getItem(String s)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("Generating item from itemUUID");
	//    4    8:aload_2         
	//    5    9:ldc1            #43  <String "Generating item from itemUUID">
	//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		CLog.d(((StringBuilder) (obj)).toString());
	//   12   21:aload_2         
	//   13   22:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #56  <Method void CLog.d(String)>
		try
		{
			obj = ((Object) (mItems.getJSONObject(s)));
	//   15   28:aload_0         
	//   16   29:getfield        #58  <Field JSONObject mItems>
	//   17   32:aload_1         
	//   18   33:invokevirtual   #64  <Method JSONObject JSONObject.getJSONObject(String)>
	//   19   36:astore_2        
		}
	//*  20   37:aload_2         
	//*  21   38:ifnull          49
	//*  22   41:aload_2         
	//*  23   42:ldc1            #66  <String "uuid">
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #70  <Method JSONObject JSONObject.put(String, Object)>
	//*  26   48:pop             
	//*  27   49:aload_0         
	//*  28   50:aload_2         
	//*  29   51:invokestatic    #76  <Method CraftARItem CraftARItemFactory.createItem(CraftARCollection, JSONObject)>
	//*  30   54:astore_1        
	//*  31   55:aload_1         
	//*  32   56:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  33   57:astore_1        
		{
			((Exception) (s)).printStackTrace();
	//   34   58:aload_1         
	//   35   59:invokevirtual   #79  <Method void Exception.printStackTrace()>
			return null;
	//   36   62:aconst_null     
	//   37   63:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_49;
		((JSONObject) (obj)).put("uuid", ((Object) (s)));
		s = ((String) (CraftARItemFactory.createItem(((CraftARCollection) (this)), ((JSONObject) (obj)))));
		return ((CraftARItem) (s));
	}

	long getLastModified()
	{
		return mLastModified;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field long mLastModified>
	//    2    4:lreturn         
	}

	HashSet getListOfImages()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #87  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void HashSet()>
	//    3    7:astore_2        
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #38  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #41  <Method void StringBuilder()>
	//    7   15:astore_1        
		((StringBuilder) (obj)).append(mRefDirPath);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #90  <Field String mRefDirPath>
	//   11   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (obj)).append("/list.txt");
	//   13   25:aload_1         
	//   14   26:ldc1            #92  <String "/list.txt">
	//   15   28:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		obj = ((Object) (new File(((StringBuilder) (obj)).toString())));
	//   17   32:new             #94  <Class File>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #96  <Method void File(String)>
	//   22   43:astore_1        
		BufferedReader bufferedreader;
		try
		{
			bufferedreader = new BufferedReader(((java.io.Reader) (new FileReader(((File) (obj))))));
	//   23   44:new             #98  <Class BufferedReader>
	//   24   47:dup             
	//   25   48:new             #100 <Class FileReader>
	//   26   51:dup             
	//   27   52:aload_1         
	//   28   53:invokespecial   #103 <Method void FileReader(File)>
	//   29   56:invokespecial   #106 <Method void BufferedReader(java.io.Reader)>
	//   30   59:astore_3        
			obj = ((Object) (bufferedreader.readLine()));
	//   31   60:aload_3         
	//   32   61:invokevirtual   #109 <Method String BufferedReader.readLine()>
	//   33   64:astore_1        
		}
	//*  34   65:aload_1         
	//*  35   66:ifnull          92
	//*  36   69:aload_1         
	//*  37   70:ldc1            #111 <String "">
	//*  38   72:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  39   75:ifne            84
	//*  40   78:aload_2         
	//*  41   79:aload_1         
	//*  42   80:invokevirtual   #120 <Method boolean HashSet.add(Object)>
	//*  43   83:pop             
	//*  44   84:aload_3         
	//*  45   85:invokevirtual   #109 <Method String BufferedReader.readLine()>
	//*  46   88:astore_1        
	//*  47   89:goto            65
	//*  48   92:aload_3         
	//*  49   93:invokevirtual   #123 <Method void BufferedReader.close()>
	//*  50   96:aload_2         
	//*  51   97:areturn         
	//*  52   98:ldc1            #125 <String "Collection has no list.txt">
	//*  53  100:invokestatic    #56  <Method void CLog.d(String)>
	//*  54  103:aconst_null     
	//*  55  104:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			CLog.d("Collection has no list.txt");
			return null;
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_92;
		if(!((String) (obj)).equals(""))
			hashset.add(obj);
		obj = ((Object) (bufferedreader.readLine()));
		break MISSING_BLOCK_LABEL_65;
		bufferedreader.close();
		Exception exception;
		return hashset;
	//*  56  105:astore_1        
	//*  57  106:goto            98
	}

	String getLocalPath()
	{
		return mRefDirPath;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String mRefDirPath>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mCollectionName;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field String mCollectionName>
	//    2    4:areturn         
	}

	public ArrayList getTokens()
	{
		return mTokens;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field ArrayList mTokens>
	//    2    4:areturn         
	}

	public ArrayList listItems()
	{
		return mItemUUIDS;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ArrayList mItemUUIDS>
	//    2    4:areturn         
	}

	void reloadOnDeviceFromJSONObject(JSONObject jsonobject)
		throws JSONException
	{
		super.reloadFromJSONObject(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method void CraftARCollection.reloadFromJSONObject(JSONObject)>
		mCollectionJSON = jsonobject;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #144 <Field JSONObject mCollectionJSON>
		mCollectionName = jsonobject.getString("name");
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:ldc1            #146 <String "name">
	//    9   14:invokevirtual   #150 <Method String JSONObject.getString(String)>
	//   10   17:putfield        #131 <Field String mCollectionName>
		mItems = jsonobject.getJSONObject("items");
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:ldc1            #152 <String "items">
	//   14   24:invokevirtual   #64  <Method JSONObject JSONObject.getJSONObject(String)>
	//   15   27:putfield        #58  <Field JSONObject mItems>
		mBundleSDKVersion = jsonobject.getString("sdk_version");
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:ldc1            #154 <String "sdk_version">
	//   19   34:invokevirtual   #150 <Method String JSONObject.getString(String)>
	//   20   37:putfield        #32  <Field String mBundleSDKVersion>
		mLastModified = Long.parseLong(jsonobject.getString("last-modified"));
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:ldc1            #156 <String "last-modified">
	//   24   44:invokevirtual   #150 <Method String JSONObject.getString(String)>
	//   25   47:invokestatic    #162 <Method long Long.parseLong(String)>
	//   26   50:putfield        #83  <Field long mLastModified>
		mItemUUIDS = new ArrayList();
	//   27   53:aload_0         
	//   28   54:new             #164 <Class ArrayList>
	//   29   57:dup             
	//   30   58:invokespecial   #165 <Method void ArrayList()>
	//   31   61:putfield        #139 <Field ArrayList mItemUUIDS>
		for(Iterator iterator = mItems.keys(); iterator.hasNext(); mItemUUIDS.add(iterator.next()));
	//   32   64:aload_0         
	//   33   65:getfield        #58  <Field JSONObject mItems>
	//   34   68:invokevirtual   #169 <Method Iterator JSONObject.keys()>
	//   35   71:astore_3        
	//   36   72:aload_3         
	//   37   73:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//   38   78:ifeq            98
	//   39   81:aload_0         
	//   40   82:getfield        #139 <Field ArrayList mItemUUIDS>
	//   41   85:aload_3         
	//   42   86:invokeinterface #179 <Method Object Iterator.next()>
	//   43   91:invokevirtual   #180 <Method boolean ArrayList.add(Object)>
	//   44   94:pop             
	//*  45   95:goto            72
		if(CraftAROnDeviceCollectionManager.Instance().collectionsRoot != null)
	//*  46   98:invokestatic    #186 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//*  47  101:getfield        #189 <Field String CraftAROnDeviceCollectionManager.collectionsRoot>
	//*  48  104:ifnull          171
		{
			if(CraftAROnDeviceCollectionManager.Instance().collectionsRoot.length() == 0)
	//*  49  107:invokestatic    #186 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//*  50  110:getfield        #189 <Field String CraftAROnDeviceCollectionManager.collectionsRoot>
	//*  51  113:invokevirtual   #193 <Method int String.length()>
	//*  52  116:ifne            125
			{
				CLog.e("collections root folder could not be determined. Check that the CraftARCollectionManager was initialized correctly");
	//   53  119:ldc1            #195 <String "collections root folder could not be determined. Check that the CraftARCollectionManager was initialized correctly">
	//   54  121:invokestatic    #198 <Method void CLog.e(String)>
				return;
	//   55  124:return          
			}
			StringBuilder stringbuilder = new StringBuilder();
	//   56  125:new             #38  <Class StringBuilder>
	//   57  128:dup             
	//   58  129:invokespecial   #41  <Method void StringBuilder()>
	//   59  132:astore_3        
			stringbuilder.append(CraftAROnDeviceCollectionManager.Instance().collectionsRoot);
	//   60  133:aload_3         
	//   61  134:invokestatic    #186 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//   62  137:getfield        #189 <Field String CraftAROnDeviceCollectionManager.collectionsRoot>
	//   63  140:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   64  143:pop             
			stringbuilder.append("/");
	//   65  144:aload_3         
	//   66  145:ldc1            #200 <String "/">
	//   67  147:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   68  150:pop             
			stringbuilder.append(mUUID);
	//   69  151:aload_3         
	//   70  152:aload_0         
	//   71  153:getfield        #203 <Field String mUUID>
	//   72  156:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   73  159:pop             
			mRefDirPath = stringbuilder.toString();
	//   74  160:aload_0         
	//   75  161:aload_3         
	//   76  162:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   77  165:putfield        #90  <Field String mRefDirPath>
		} else
	//*  78  168:goto            176
		{
			CLog.e("collections root folder could not be determined. Check that the CraftARCollectionManager already initialized");
	//   79  171:ldc1            #205 <String "collections root folder could not be determined. Check that the CraftARCollectionManager already initialized">
	//   80  173:invokestatic    #198 <Method void CLog.e(String)>
		}
		mTokens = new ArrayList();
	//   81  176:aload_0         
	//   82  177:new             #164 <Class ArrayList>
	//   83  180:dup             
	//   84  181:invokespecial   #165 <Method void ArrayList()>
	//   85  184:putfield        #135 <Field ArrayList mTokens>
		jsonobject = ((JSONObject) (jsonobject.getJSONArray("tokens")));
	//   86  187:aload_1         
	//   87  188:ldc1            #207 <String "tokens">
	//   88  190:invokevirtual   #211 <Method JSONArray JSONObject.getJSONArray(String)>
	//   89  193:astore_1        
		for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  90  194:iconst_0        
	//*  91  195:istore_2        
	//*  92  196:iload_2         
	//*  93  197:aload_1         
	//*  94  198:invokevirtual   #214 <Method int JSONArray.length()>
	//*  95  201:icmpge          224
			mTokens.add(((Object) (((JSONArray) (jsonobject)).getString(i))));
	//   96  204:aload_0         
	//   97  205:getfield        #135 <Field ArrayList mTokens>
	//   98  208:aload_1         
	//   99  209:iload_2         
	//  100  210:invokevirtual   #217 <Method String JSONArray.getString(int)>
	//  101  213:invokevirtual   #180 <Method boolean ArrayList.add(Object)>
	//  102  216:pop             

	//  103  217:iload_2         
	//  104  218:iconst_1        
	//  105  219:iadd            
	//  106  220:istore_2        
	//* 107  221:goto            196
	//  108  224:return          
	}

	public void sync(CraftAROnDeviceCollectionManager.SyncCollectionListener synccollectionlistener)
	{
		CraftAROnDeviceCollectionManager.Instance().syncCollection(this, synccollectionlistener);
	//    0    0:invokestatic    #186 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #223 <Method void CraftAROnDeviceCollectionManager.syncCollection(CraftAROnDeviceCollection, CraftAROnDeviceCollectionManager$SyncCollectionListener)>
	//    4    8:return          
	}

	public void sync(CraftAROnDeviceCollectionManager.SyncCollectionListener synccollectionlistener, String s)
	{
		CraftAROnDeviceCollectionManager.Instance().syncCollection(this, s, synccollectionlistener);
	//    0    0:invokestatic    #186 <Method CraftAROnDeviceCollectionManager CraftAROnDeviceCollectionManager.Instance()>
	//    1    3:aload_0         
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #227 <Method void CraftAROnDeviceCollectionManager.syncCollection(CraftAROnDeviceCollection, String, CraftAROnDeviceCollectionManager$SyncCollectionListener)>
	//    5    9:return          
	}

	String mBundleSDKVersion;
	JSONObject mCollectionJSON;
	String mCollectionName;
	ArrayList mItemUUIDS;
	JSONObject mItems;
	long mLastModified;
	String mRefDirPath;
	ArrayList mTokens;
}

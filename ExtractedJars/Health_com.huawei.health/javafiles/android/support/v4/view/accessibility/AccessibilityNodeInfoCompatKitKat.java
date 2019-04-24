// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatKitKat
{
	static class CollectionInfo
	{

		static int getColumnCount(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getColumnCount();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    2    4:invokevirtual   #19  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getColumnCount()>
		//    3    7:ireturn         
		}

		static int getRowCount(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getRowCount();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    2    4:invokevirtual   #22  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getRowCount()>
		//    3    7:ireturn         
		}

		static boolean isHierarchical(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).isHierarchical();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    2    4:invokevirtual   #27  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.isHierarchical()>
		//    3    7:ireturn         
		}

		CollectionInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class CollectionItemInfo
	{

		static int getColumnIndex(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getColumnIndex();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    2    4:invokevirtual   #19  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getColumnIndex()>
		//    3    7:ireturn         
		}

		static int getColumnSpan(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getColumnSpan();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    2    4:invokevirtual   #22  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getColumnSpan()>
		//    3    7:ireturn         
		}

		static int getRowIndex(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getRowIndex();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    2    4:invokevirtual   #25  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getRowIndex()>
		//    3    7:ireturn         
		}

		static int getRowSpan(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getRowSpan();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    2    4:invokevirtual   #28  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getRowSpan()>
		//    3    7:ireturn         
		}

		static boolean isHeading(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).isHeading();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    2    4:invokevirtual   #33  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.isHeading()>
		//    3    7:ireturn         
		}

		CollectionItemInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class RangeInfo
	{

		static float getCurrent(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getCurrent();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #19  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getCurrent()>
		//    3    7:freturn         
		}

		static float getMax(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getMax();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #22  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMax()>
		//    3    7:freturn         
		}

		static float getMin(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getMin();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #25  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMin()>
		//    3    7:freturn         
		}

		static int getType(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getType();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #30  <Method int android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getType()>
		//    3    7:ireturn         
		}

		RangeInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	AccessibilityNodeInfoCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static boolean canOpenPopup(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).canOpenPopup();
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #42  <Method boolean AccessibilityNodeInfo.canOpenPopup()>
	//    3    7:ireturn         
	}

	static Object getCollectionInfo(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getCollectionInfo()));
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #47  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo AccessibilityNodeInfo.getCollectionInfo()>
	//    3    7:areturn         
	}

	static Object getCollectionItemInfo(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getCollectionItemInfo()));
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #51  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo AccessibilityNodeInfo.getCollectionItemInfo()>
	//    3    7:areturn         
	}

	public static Bundle getExtras(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #56  <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    3    7:areturn         
	}

	public static int getInputType(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getInputType();
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #61  <Method int AccessibilityNodeInfo.getInputType()>
	//    3    7:ireturn         
	}

	static int getLiveRegion(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getLiveRegion();
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #64  <Method int AccessibilityNodeInfo.getLiveRegion()>
	//    3    7:ireturn         
	}

	static Object getRangeInfo(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getRangeInfo()));
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #68  <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo AccessibilityNodeInfo.getRangeInfo()>
	//    3    7:areturn         
	}

	public static CharSequence getRoleDescription(Object obj)
	{
		return getExtras(obj).getCharSequence("AccessibilityNodeInfo.roleDescription");
	//    0    0:aload_0         
	//    1    1:invokestatic    #72  <Method Bundle getExtras(Object)>
	//    2    4:ldc1            #20  <String "AccessibilityNodeInfo.roleDescription">
	//    3    6:invokevirtual   #78  <Method CharSequence Bundle.getCharSequence(String)>
	//    4    9:areturn         
	}

	private static long getTraits(Object obj)
	{
		return getExtras(obj).getLong("android.view.accessibility.AccessibilityNodeInfo.traits", -1L);
	//    0    0:aload_0         
	//    1    1:invokestatic    #72  <Method Bundle getExtras(Object)>
	//    2    4:ldc1            #23  <String "android.view.accessibility.AccessibilityNodeInfo.traits">
	//    3    6:ldc2w           #81  <Long -1L>
	//    4    9:invokevirtual   #86  <Method long Bundle.getLong(String, long)>
	//    5   12:lreturn         
	}

	public static boolean isContentInvalid(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isContentInvalid();
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #89  <Method boolean AccessibilityNodeInfo.isContentInvalid()>
	//    3    7:ireturn         
	}

	public static boolean isDismissable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isDismissable();
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #92  <Method boolean AccessibilityNodeInfo.isDismissable()>
	//    3    7:ireturn         
	}

	public static boolean isMultiLine(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isMultiLine();
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #95  <Method boolean AccessibilityNodeInfo.isMultiLine()>
	//    3    7:ireturn         
	}

	public static Object obtainCollectionInfo(int i, int j, boolean flag)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #103 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//    4    6:areturn         
	}

	public static Object obtainCollectionInfo(int i, int j, boolean flag, int k)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #103 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//    4    6:areturn         
	}

	public static Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #111 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean)>
	//    6    9:areturn         
	}

	public static Object obtainRangeInfo(int i, float f, float f1, float f2)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i, f, f1, f2)));
	//    0    0:iload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:invokestatic    #118 <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo android.view.accessibility.AccessibilityNodeInfo$RangeInfo.obtain(int, float, float, float)>
	//    5    7:areturn         
	}

	public static void setCanOpenPopup(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setCanOpenPopup(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #123 <Method void AccessibilityNodeInfo.setCanOpenPopup(boolean)>
	//    4    8:return          
	}

	public static void setCollectionInfo(Object obj, Object obj1)
	{
		((AccessibilityNodeInfo)obj).setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:checkcast       #99  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    4    8:invokevirtual   #128 <Method void AccessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo)>
	//    5   11:return          
	}

	public static void setCollectionItemInfo(Object obj, Object obj1)
	{
		((AccessibilityNodeInfo)obj).setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:checkcast       #108 <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    4    8:invokevirtual   #132 <Method void AccessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo)>
	//    5   11:return          
	}

	public static void setContentInvalid(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setContentInvalid(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method void AccessibilityNodeInfo.setContentInvalid(boolean)>
	//    4    8:return          
	}

	public static void setDismissable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setDismissable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #138 <Method void AccessibilityNodeInfo.setDismissable(boolean)>
	//    4    8:return          
	}

	public static void setInputType(Object obj, int i)
	{
		((AccessibilityNodeInfo)obj).setInputType(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #143 <Method void AccessibilityNodeInfo.setInputType(int)>
	//    4    8:return          
	}

	static void setLiveRegion(Object obj, int i)
	{
		((AccessibilityNodeInfo)obj).setLiveRegion(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #146 <Method void AccessibilityNodeInfo.setLiveRegion(int)>
	//    4    8:return          
	}

	public static void setMultiLine(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setMultiLine(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #149 <Method void AccessibilityNodeInfo.setMultiLine(boolean)>
	//    4    8:return          
	}

	public static void setRangeInfo(Object obj, Object obj1)
	{
		((AccessibilityNodeInfo)obj).setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #39  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:checkcast       #115 <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    4    8:invokevirtual   #153 <Method void AccessibilityNodeInfo.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo$RangeInfo)>
	//    5   11:return          
	}

	public static void setRoleDescription(Object obj, CharSequence charsequence)
	{
		getExtras(obj).putCharSequence("AccessibilityNodeInfo.roleDescription", charsequence);
	//    0    0:aload_0         
	//    1    1:invokestatic    #72  <Method Bundle getExtras(Object)>
	//    2    4:ldc1            #20  <String "AccessibilityNodeInfo.roleDescription">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #159 <Method void Bundle.putCharSequence(String, CharSequence)>
	//    5   10:return          
	}

	private static void setTrait(Object obj, long l)
	{
		obj = ((Object) (getExtras(obj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #72  <Method Bundle getExtras(Object)>
	//    2    4:astore_0        
		((Bundle) (obj)).putLong("android.view.accessibility.AccessibilityNodeInfo.traits", ((Bundle) (obj)).getLong("android.view.accessibility.AccessibilityNodeInfo.traits", 0L) | l);
	//    3    5:aload_0         
	//    4    6:ldc1            #23  <String "android.view.accessibility.AccessibilityNodeInfo.traits">
	//    5    8:aload_0         
	//    6    9:ldc1            #23  <String "android.view.accessibility.AccessibilityNodeInfo.traits">
	//    7   11:lconst_0        
	//    8   12:invokevirtual   #86  <Method long Bundle.getLong(String, long)>
	//    9   15:lload_1         
	//   10   16:lor             
	//   11   17:invokevirtual   #165 <Method void Bundle.putLong(String, long)>
	//   12   20:return          
	}

	private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
	private static final String TRAITS_KEY = "android.view.accessibility.AccessibilityNodeInfo.traits";
	private static final long TRAIT_HAS_IMAGE = 1L;
	private static final byte TRAIT_UNSET = -1;
}

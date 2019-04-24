// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public class AccessibilityRecordCompat
{
	static class AccessibilityRecordCompatApi15Impl extends AccessibilityRecordCompatBaseImpl
	{

		public int getMaxScrollX(AccessibilityRecord accessibilityrecord)
		{
			return accessibilityrecord.getMaxScrollX();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int AccessibilityRecord.getMaxScrollX()>
		//    2    4:ireturn         
		}

		public int getMaxScrollY(AccessibilityRecord accessibilityrecord)
		{
			return accessibilityrecord.getMaxScrollY();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method int AccessibilityRecord.getMaxScrollY()>
		//    2    4:ireturn         
		}

		public void setMaxScrollX(AccessibilityRecord accessibilityrecord, int i)
		{
			accessibilityrecord.setMaxScrollX(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #30  <Method void AccessibilityRecord.setMaxScrollX(int)>
		//    3    5:return          
		}

		public void setMaxScrollY(AccessibilityRecord accessibilityrecord, int i)
		{
			accessibilityrecord.setMaxScrollY(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #33  <Method void AccessibilityRecord.setMaxScrollY(int)>
		//    3    5:return          
		}

		AccessibilityRecordCompatApi15Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityRecordCompatApi16Impl extends AccessibilityRecordCompatApi15Impl
	{

		public void setSource(AccessibilityRecord accessibilityrecord, View view, int i)
		{
			accessibilityrecord.setSource(view, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokevirtual   #22  <Method void AccessibilityRecord.setSource(View, int)>
		//    4    6:return          
		}

		AccessibilityRecordCompatApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatApi15Impl()>
		//    2    4:return          
		}
	}

	static class AccessibilityRecordCompatBaseImpl
	{

		public int getMaxScrollX(AccessibilityRecord accessibilityrecord)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getMaxScrollY(AccessibilityRecord accessibilityrecord)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void setMaxScrollX(AccessibilityRecord accessibilityrecord, int i)
		{
		//    0    0:return          
		}

		public void setMaxScrollY(AccessibilityRecord accessibilityrecord, int i)
		{
		//    0    0:return          
		}

		public void setSource(AccessibilityRecord accessibilityrecord, View view, int i)
		{
		//    0    0:return          
		}

		AccessibilityRecordCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public AccessibilityRecordCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mRecord = (AccessibilityRecord)obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:checkcast       #38  <Class AccessibilityRecord>
	//    5    9:putfield        #40  <Field AccessibilityRecord mRecord>
	//    6   12:return          
	}

	public static int getMaxScrollX(AccessibilityRecord accessibilityrecord)
	{
		return IMPL.getMaxScrollX(accessibilityrecord);
	//    0    0:getstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #45  <Method int AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl.getMaxScrollX(AccessibilityRecord)>
	//    3    7:ireturn         
	}

	public static int getMaxScrollY(AccessibilityRecord accessibilityrecord)
	{
		return IMPL.getMaxScrollY(accessibilityrecord);
	//    0    0:getstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method int AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl.getMaxScrollY(AccessibilityRecord)>
	//    3    7:ireturn         
	}

	public static AccessibilityRecordCompat obtain()
	{
		return new AccessibilityRecordCompat(((Object) (AccessibilityRecord.obtain())));
	//    0    0:new             #2   <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:invokestatic    #53  <Method AccessibilityRecord AccessibilityRecord.obtain()>
	//    3    7:invokespecial   #55  <Method void AccessibilityRecordCompat(Object)>
	//    4   10:areturn         
	}

	public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityrecordcompat)
	{
		return new AccessibilityRecordCompat(((Object) (AccessibilityRecord.obtain(accessibilityrecordcompat.mRecord))));
	//    0    0:new             #2   <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field AccessibilityRecord mRecord>
	//    4    8:invokestatic    #59  <Method AccessibilityRecord AccessibilityRecord.obtain(AccessibilityRecord)>
	//    5   11:invokespecial   #55  <Method void AccessibilityRecordCompat(Object)>
	//    6   14:areturn         
	}

	public static void setMaxScrollX(AccessibilityRecord accessibilityrecord, int i)
	{
		IMPL.setMaxScrollX(accessibilityrecord, i);
	//    0    0:getstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #63  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl.setMaxScrollX(AccessibilityRecord, int)>
	//    4    8:return          
	}

	public static void setMaxScrollY(AccessibilityRecord accessibilityrecord, int i)
	{
		IMPL.setMaxScrollY(accessibilityrecord, i);
	//    0    0:getstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #66  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl.setMaxScrollY(AccessibilityRecord, int)>
	//    4    8:return          
	}

	public static void setSource(AccessibilityRecord accessibilityrecord, View view, int i)
	{
		IMPL.setSource(accessibilityrecord, view, i);
	//    0    0:getstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #71  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl.setSource(AccessibilityRecord, View, int)>
	//    5    9:return          
	}

	public boolean equals(Object obj)
	{
		if(this != obj) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
_L1:
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
_L2:
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #78  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #78  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AccessibilityRecordCompat)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AccessibilityRecordCompat>
	//   18   30:astore_1        
		if(mRecord != null)
			continue; /* Loop/switch isn't completed */
	//   19   31:aload_0         
	//   20   32:getfield        #40  <Field AccessibilityRecord mRecord>
	//   21   35:ifnonnull       47
		if(((AccessibilityRecordCompat) (obj)).mRecord == null) goto _L1; else goto _L3
	//   22   38:aload_1         
	//   23   39:getfield        #40  <Field AccessibilityRecord mRecord>
	//   24   42:ifnull          5
_L3:
		return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(((Object) (mRecord)).equals(((Object) (((AccessibilityRecordCompat) (obj)).mRecord)))) goto _L1; else goto _L4
	//   27   47:aload_0         
	//   28   48:getfield        #40  <Field AccessibilityRecord mRecord>
	//   29   51:aload_1         
	//   30   52:getfield        #40  <Field AccessibilityRecord mRecord>
	//   31   55:invokevirtual   #80  <Method boolean Object.equals(Object)>
	//   32   58:ifne            5
_L4:
		return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
	}

	public int getAddedCount()
	{
		return mRecord.getAddedCount();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #84  <Method int AccessibilityRecord.getAddedCount()>
	//    3    7:ireturn         
	}

	public CharSequence getBeforeText()
	{
		return mRecord.getBeforeText();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #88  <Method CharSequence AccessibilityRecord.getBeforeText()>
	//    3    7:areturn         
	}

	public CharSequence getClassName()
	{
		return mRecord.getClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #91  <Method CharSequence AccessibilityRecord.getClassName()>
	//    3    7:areturn         
	}

	public CharSequence getContentDescription()
	{
		return mRecord.getContentDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #94  <Method CharSequence AccessibilityRecord.getContentDescription()>
	//    3    7:areturn         
	}

	public int getCurrentItemIndex()
	{
		return mRecord.getCurrentItemIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #97  <Method int AccessibilityRecord.getCurrentItemIndex()>
	//    3    7:ireturn         
	}

	public int getFromIndex()
	{
		return mRecord.getFromIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #100 <Method int AccessibilityRecord.getFromIndex()>
	//    3    7:ireturn         
	}

	public Object getImpl()
	{
		return ((Object) (mRecord));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:areturn         
	}

	public int getItemCount()
	{
		return mRecord.getItemCount();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #105 <Method int AccessibilityRecord.getItemCount()>
	//    3    7:ireturn         
	}

	public int getMaxScrollX()
	{
		return getMaxScrollX(mRecord);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokestatic    #106 <Method int getMaxScrollX(AccessibilityRecord)>
	//    3    7:ireturn         
	}

	public int getMaxScrollY()
	{
		return getMaxScrollY(mRecord);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokestatic    #107 <Method int getMaxScrollY(AccessibilityRecord)>
	//    3    7:ireturn         
	}

	public Parcelable getParcelableData()
	{
		return mRecord.getParcelableData();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #111 <Method Parcelable AccessibilityRecord.getParcelableData()>
	//    3    7:areturn         
	}

	public int getRemovedCount()
	{
		return mRecord.getRemovedCount();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #114 <Method int AccessibilityRecord.getRemovedCount()>
	//    3    7:ireturn         
	}

	public int getScrollX()
	{
		return mRecord.getScrollX();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #117 <Method int AccessibilityRecord.getScrollX()>
	//    3    7:ireturn         
	}

	public int getScrollY()
	{
		return mRecord.getScrollY();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #120 <Method int AccessibilityRecord.getScrollY()>
	//    3    7:ireturn         
	}

	public AccessibilityNodeInfoCompat getSource()
	{
		return AccessibilityNodeInfoCompat.wrapNonNullInstance(((Object) (mRecord.getSource())));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #125 <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityRecord.getSource()>
	//    3    7:invokestatic    #131 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrapNonNullInstance(Object)>
	//    4   10:areturn         
	}

	public List getText()
	{
		return mRecord.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #135 <Method List AccessibilityRecord.getText()>
	//    3    7:areturn         
	}

	public int getToIndex()
	{
		return mRecord.getToIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #140 <Method int AccessibilityRecord.getToIndex()>
	//    3    7:ireturn         
	}

	public int getWindowId()
	{
		return mRecord.getWindowId();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #143 <Method int AccessibilityRecord.getWindowId()>
	//    3    7:ireturn         
	}

	public int hashCode()
	{
		if(mRecord == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ((Object) (mRecord)).hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field AccessibilityRecord mRecord>
	//    7   13:invokevirtual   #146 <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isChecked()
	{
		return mRecord.isChecked();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #150 <Method boolean AccessibilityRecord.isChecked()>
	//    3    7:ireturn         
	}

	public boolean isEnabled()
	{
		return mRecord.isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #153 <Method boolean AccessibilityRecord.isEnabled()>
	//    3    7:ireturn         
	}

	public boolean isFullScreen()
	{
		return mRecord.isFullScreen();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #156 <Method boolean AccessibilityRecord.isFullScreen()>
	//    3    7:ireturn         
	}

	public boolean isPassword()
	{
		return mRecord.isPassword();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #159 <Method boolean AccessibilityRecord.isPassword()>
	//    3    7:ireturn         
	}

	public boolean isScrollable()
	{
		return mRecord.isScrollable();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #162 <Method boolean AccessibilityRecord.isScrollable()>
	//    3    7:ireturn         
	}

	public void recycle()
	{
		mRecord.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:invokevirtual   #165 <Method void AccessibilityRecord.recycle()>
	//    3    7:return          
	}

	public void setAddedCount(int i)
	{
		mRecord.setAddedCount(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #169 <Method void AccessibilityRecord.setAddedCount(int)>
	//    4    8:return          
	}

	public void setBeforeText(CharSequence charsequence)
	{
		mRecord.setBeforeText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #173 <Method void AccessibilityRecord.setBeforeText(CharSequence)>
	//    4    8:return          
	}

	public void setChecked(boolean flag)
	{
		mRecord.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #177 <Method void AccessibilityRecord.setChecked(boolean)>
	//    4    8:return          
	}

	public void setClassName(CharSequence charsequence)
	{
		mRecord.setClassName(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #180 <Method void AccessibilityRecord.setClassName(CharSequence)>
	//    4    8:return          
	}

	public void setContentDescription(CharSequence charsequence)
	{
		mRecord.setContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method void AccessibilityRecord.setContentDescription(CharSequence)>
	//    4    8:return          
	}

	public void setCurrentItemIndex(int i)
	{
		mRecord.setCurrentItemIndex(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #186 <Method void AccessibilityRecord.setCurrentItemIndex(int)>
	//    4    8:return          
	}

	public void setEnabled(boolean flag)
	{
		mRecord.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #189 <Method void AccessibilityRecord.setEnabled(boolean)>
	//    4    8:return          
	}

	public void setFromIndex(int i)
	{
		mRecord.setFromIndex(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #192 <Method void AccessibilityRecord.setFromIndex(int)>
	//    4    8:return          
	}

	public void setFullScreen(boolean flag)
	{
		mRecord.setFullScreen(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #195 <Method void AccessibilityRecord.setFullScreen(boolean)>
	//    4    8:return          
	}

	public void setItemCount(int i)
	{
		mRecord.setItemCount(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #198 <Method void AccessibilityRecord.setItemCount(int)>
	//    4    8:return          
	}

	public void setMaxScrollX(int i)
	{
		setMaxScrollX(mRecord, i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokestatic    #199 <Method void setMaxScrollX(AccessibilityRecord, int)>
	//    4    8:return          
	}

	public void setMaxScrollY(int i)
	{
		setMaxScrollY(mRecord, i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokestatic    #200 <Method void setMaxScrollY(AccessibilityRecord, int)>
	//    4    8:return          
	}

	public void setParcelableData(Parcelable parcelable)
	{
		mRecord.setParcelableData(parcelable);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #204 <Method void AccessibilityRecord.setParcelableData(Parcelable)>
	//    4    8:return          
	}

	public void setPassword(boolean flag)
	{
		mRecord.setPassword(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #207 <Method void AccessibilityRecord.setPassword(boolean)>
	//    4    8:return          
	}

	public void setRemovedCount(int i)
	{
		mRecord.setRemovedCount(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #210 <Method void AccessibilityRecord.setRemovedCount(int)>
	//    4    8:return          
	}

	public void setScrollX(int i)
	{
		mRecord.setScrollX(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #213 <Method void AccessibilityRecord.setScrollX(int)>
	//    4    8:return          
	}

	public void setScrollY(int i)
	{
		mRecord.setScrollY(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #216 <Method void AccessibilityRecord.setScrollY(int)>
	//    4    8:return          
	}

	public void setScrollable(boolean flag)
	{
		mRecord.setScrollable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #219 <Method void AccessibilityRecord.setScrollable(boolean)>
	//    4    8:return          
	}

	public void setSource(View view)
	{
		mRecord.setSource(view);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #222 <Method void AccessibilityRecord.setSource(View)>
	//    4    8:return          
	}

	public void setSource(View view, int i)
	{
		setSource(mRecord, view, i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #224 <Method void setSource(AccessibilityRecord, View, int)>
	//    5    9:return          
	}

	public void setToIndex(int i)
	{
		mRecord.setToIndex(i);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AccessibilityRecord mRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #227 <Method void AccessibilityRecord.setToIndex(int)>
	//    4    8:return          
	}

	private static final AccessibilityRecordCompatBaseImpl IMPL;
	private final AccessibilityRecord mRecord;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityRecordCompatBaseImpl) (new AccessibilityRecordCompatApi16Impl()));
	//    3    8:new             #9   <Class AccessibilityRecordCompat$AccessibilityRecordCompatApi16Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #28  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatApi16Impl()>
	//    6   15:putstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   8   19:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          15
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityRecordCompatBaseImpl) (new AccessibilityRecordCompatApi15Impl()));
	//   11   27:new             #6   <Class AccessibilityRecordCompat$AccessibilityRecordCompatApi15Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #31  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatApi15Impl()>
	//   14   34:putstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//   15   37:return          
		else
			IMPL = new AccessibilityRecordCompatBaseImpl();
	//   16   38:new             #12  <Class AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #32  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl()>
	//   19   45:putstatic       #30  <Field AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl IMPL>
	//*  20   48:return          
	}
}

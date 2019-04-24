// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.preference:
//			PreferenceGroup, Preference

public class PreferenceCategory extends PreferenceGroup
{

	public PreferenceCategory(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #13  <Method void PreferenceCategory(Context, AttributeSet)>
	//    4    6:return          
	}

	public PreferenceCategory(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, R.attr.preferenceCategoryStyle, 0x101008c));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #20  <Field int R$attr.preferenceCategoryStyle>
	//    5    7:ldc1            #21  <Int 0x101008c>
	//    6    9:invokestatic    #27  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #30  <Method void PreferenceCategory(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public PreferenceCategory(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #33  <Method void PreferenceCategory(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public PreferenceCategory(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #34  <Method void PreferenceGroup(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	public boolean isEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void PreferenceGroup.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat)>
		android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectioniteminfocompat = accessibilitynodeinfocompat.getCollectionItemInfo();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #46  <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat AccessibilityNodeInfoCompat.getCollectionItemInfo()>
	//    5    9:astore_2        
		if(collectioniteminfocompat == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       15
		{
			return;
	//    8   14:return          
		} else
		{
			accessibilitynodeinfocompat.setCollectionItemInfo(((Object) (android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectioniteminfocompat.getRowIndex(), collectioniteminfocompat.getRowSpan(), collectioniteminfocompat.getColumnIndex(), collectioniteminfocompat.getColumnSpan(), true, collectioniteminfocompat.isSelected()))));
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #52  <Method int android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.getRowIndex()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #55  <Method int android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.getRowSpan()>
	//   14   24:aload_2         
	//   15   25:invokevirtual   #58  <Method int android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.getColumnIndex()>
	//   16   28:aload_2         
	//   17   29:invokevirtual   #61  <Method int android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.getColumnSpan()>
	//   18   32:iconst_1        
	//   19   33:aload_2         
	//   20   34:invokevirtual   #64  <Method boolean android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.isSelected()>
	//   21   37:invokestatic    #68  <Method android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(int, int, int, int, boolean, boolean)>
	//   22   40:invokevirtual   #72  <Method void AccessibilityNodeInfoCompat.setCollectionItemInfo(Object)>
			return;
	//   23   43:return          
		}
	}

	protected boolean onPrepareAddPreference(Preference preference)
	{
		if(preference instanceof PreferenceCategory)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class PreferenceCategory>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("Cannot add a PreferenceCategory directly to a PreferenceCategory");
	//    3    7:new             #76  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #78  <String "Cannot add a PreferenceCategory directly to a PreferenceCategory">
	//    6   13:invokespecial   #81  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return super.onPrepareAddPreference(preference);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #83  <Method boolean PreferenceGroup.onPrepareAddPreference(Preference)>
	//   11   22:ireturn         
	}

	public boolean shouldDisableDependents()
	{
		return !super.isEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method boolean PreferenceGroup.isEnabled()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static final String TAG = "PreferenceCategory";
}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.*;
import java.util.*;

// Referenced classes of package android.support.v7.preference:
//			PreferenceGroup, PreferenceScreen, Preference, PreferenceViewHolder

public class PreferenceGroupAdapter extends android.support.v7.widget.RecyclerView.Adapter
	implements Preference.OnPreferenceChangeInternalListener, PreferenceGroup.PreferencePositionCallback
{
	private static class PreferenceLayout
	{

		public boolean equals(Object obj)
		{
			if(obj instanceof PreferenceLayout)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class PreferenceGroupAdapter$PreferenceLayout>
		//*   2    4:ifne            9
		//*   3    7:iconst_0        
		//*   4    8:ireturn         
		//*   5    9:aload_1         
		//*   6   10:checkcast       #2   <Class PreferenceGroupAdapter$PreferenceLayout>
		//*   7   13:astore_1        
				if(resId == ((PreferenceLayout) (obj = ((Object) ((PreferenceLayout)obj)))).resId && widgetResId == ((PreferenceLayout) (obj)).widgetResId && TextUtils.equals(((CharSequence) (name)), ((CharSequence) (((PreferenceLayout) (obj)).name))))
		//*   8   14:aload_0         
		//*   9   15:getfield        #20  <Field int resId>
		//*  10   18:aload_1         
		//*  11   19:getfield        #20  <Field int resId>
		//*  12   22:icmpne          7
		//*  13   25:aload_0         
		//*  14   26:getfield        #22  <Field int widgetResId>
		//*  15   29:aload_1         
		//*  16   30:getfield        #22  <Field int widgetResId>
		//*  17   33:icmpne          7
		//*  18   36:aload_0         
		//*  19   37:getfield        #24  <Field String name>
		//*  20   40:aload_1         
		//*  21   41:getfield        #24  <Field String name>
		//*  22   44:invokestatic    #39  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//*  23   47:ifeq            7
					return true;
		//   24   50:iconst_1        
		//   25   51:ireturn         
			return false;
		}

		public int hashCode()
		{
			return ((resId + 527) * 31 + widgetResId) * 31 + name.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int resId>
		//    2    4:sipush          527
		//    3    7:iadd            
		//    4    8:bipush          31
		//    5   10:imul            
		//    6   11:aload_0         
		//    7   12:getfield        #22  <Field int widgetResId>
		//    8   15:iadd            
		//    9   16:bipush          31
		//   10   18:imul            
		//   11   19:aload_0         
		//   12   20:getfield        #24  <Field String name>
		//   13   23:invokevirtual   #45  <Method int String.hashCode()>
		//   14   26:iadd            
		//   15   27:ireturn         
		}

		private String name;
		private int resId;
		private int widgetResId;


/*
		static String access$102(PreferenceLayout preferencelayout, String s)
		{
			preferencelayout.name = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field String name>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static int access$200(PreferenceLayout preferencelayout)
		{
			return preferencelayout.resId;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int resId>
		//    2    4:ireturn         
		}

*/


/*
		static int access$202(PreferenceLayout preferencelayout, int i)
		{
			preferencelayout.resId = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #20  <Field int resId>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static int access$300(PreferenceLayout preferencelayout)
		{
			return preferencelayout.widgetResId;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int widgetResId>
		//    2    4:ireturn         
		}

*/


/*
		static int access$302(PreferenceLayout preferencelayout, int i)
		{
			preferencelayout.widgetResId = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #22  <Field int widgetResId>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/

		public PreferenceLayout()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

		public PreferenceLayout(PreferenceLayout preferencelayout)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			resId = preferencelayout.resId;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #20  <Field int resId>
		//    5    9:putfield        #20  <Field int resId>
			widgetResId = preferencelayout.widgetResId;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #22  <Field int widgetResId>
		//    9   17:putfield        #22  <Field int widgetResId>
			name = preferencelayout.name;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #24  <Field String name>
		//   13   25:putfield        #24  <Field String name>
		//   14   28:return          
		}
	}


	public PreferenceGroupAdapter(PreferenceGroup preferencegroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		mTempPreferenceLayout = new PreferenceLayout();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class PreferenceGroupAdapter$PreferenceLayout>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void PreferenceGroupAdapter$PreferenceLayout()>
	//    6   12:putfield        #44  <Field PreferenceGroupAdapter$PreferenceLayout mTempPreferenceLayout>
		mHandler = new Handler();
	//    7   15:aload_0         
	//    8   16:new             #46  <Class Handler>
	//    9   19:dup             
	//   10   20:invokespecial   #47  <Method void Handler()>
	//   11   23:putfield        #49  <Field Handler mHandler>
		mSyncRunnable = new Runnable() {

			public void run()
			{
				syncMyPreferences();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field PreferenceGroupAdapter this$0>
			//    2    4:invokestatic    #22  <Method void PreferenceGroupAdapter.access$000(PreferenceGroupAdapter)>
			//    3    7:return          
			}

			final PreferenceGroupAdapter this$0;

			
			{
				this$0 = PreferenceGroupAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PreferenceGroupAdapter this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   12   26:aload_0         
	//   13   27:new             #11  <Class PreferenceGroupAdapter$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #52  <Method void PreferenceGroupAdapter$1(PreferenceGroupAdapter)>
	//   17   35:putfield        #54  <Field Runnable mSyncRunnable>
		mPreferenceGroup = preferencegroup;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:putfield        #56  <Field PreferenceGroup mPreferenceGroup>
		mPreferenceGroup.setOnPreferenceChangeInternalListener(((Preference.OnPreferenceChangeInternalListener) (this)));
	//   21   43:aload_0         
	//   22   44:getfield        #56  <Field PreferenceGroup mPreferenceGroup>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #62  <Method void PreferenceGroup.setOnPreferenceChangeInternalListener(Preference$OnPreferenceChangeInternalListener)>
		mPreferenceList = ((List) (new ArrayList()));
	//   25   51:aload_0         
	//   26   52:new             #64  <Class ArrayList>
	//   27   55:dup             
	//   28   56:invokespecial   #65  <Method void ArrayList()>
	//   29   59:putfield        #67  <Field List mPreferenceList>
		mPreferenceListInternal = ((List) (new ArrayList()));
	//   30   62:aload_0         
	//   31   63:new             #64  <Class ArrayList>
	//   32   66:dup             
	//   33   67:invokespecial   #65  <Method void ArrayList()>
	//   34   70:putfield        #69  <Field List mPreferenceListInternal>
		mPreferenceLayouts = ((List) (new ArrayList()));
	//   35   73:aload_0         
	//   36   74:new             #64  <Class ArrayList>
	//   37   77:dup             
	//   38   78:invokespecial   #65  <Method void ArrayList()>
	//   39   81:putfield        #71  <Field List mPreferenceLayouts>
		if(mPreferenceGroup instanceof PreferenceScreen)
	//*  40   84:aload_0         
	//*  41   85:getfield        #56  <Field PreferenceGroup mPreferenceGroup>
	//*  42   88:instanceof      #73  <Class PreferenceScreen>
	//*  43   91:ifeq            113
			setHasStableIds(((PreferenceScreen)mPreferenceGroup).shouldUseGeneratedIds());
	//   44   94:aload_0         
	//   45   95:aload_0         
	//   46   96:getfield        #56  <Field PreferenceGroup mPreferenceGroup>
	//   47   99:checkcast       #73  <Class PreferenceScreen>
	//   48  102:invokevirtual   #77  <Method boolean PreferenceScreen.shouldUseGeneratedIds()>
	//   49  105:invokevirtual   #81  <Method void setHasStableIds(boolean)>
		else
	//*  50  108:aload_0         
	//*  51  109:invokespecial   #84  <Method void syncMyPreferences()>
	//*  52  112:return          
			setHasStableIds(true);
	//   53  113:aload_0         
	//   54  114:iconst_1        
	//   55  115:invokevirtual   #81  <Method void setHasStableIds(boolean)>
		syncMyPreferences();
	//*  56  118:goto            108
	}

	private void addPreferenceClassName(Preference preference)
	{
		preference = ((Preference) (createPreferenceLayout(preference, ((PreferenceLayout) (null)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #92  <Method PreferenceGroupAdapter$PreferenceLayout createPreferenceLayout(Preference, PreferenceGroupAdapter$PreferenceLayout)>
	//    4    6:astore_1        
		if(!mPreferenceLayouts.contains(((Object) (preference))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #71  <Field List mPreferenceLayouts>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #98  <Method boolean List.contains(Object)>
	//*   9   17:ifne            31
			mPreferenceLayouts.add(((Object) (preference)));
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field List mPreferenceLayouts>
	//   12   24:aload_1         
	//   13   25:invokeinterface #101 <Method boolean List.add(Object)>
	//   14   30:pop             
	//   15   31:return          
	}

	private PreferenceLayout createPreferenceLayout(Preference preference, PreferenceLayout preferencelayout)
	{
		if(preferencelayout == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          36
	//*   2    4:aload_2         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #107 <Method Class Object.getClass()>
	//*   5    9:invokevirtual   #113 <Method String Class.getName()>
	//*   6   12:invokestatic    #117 <Method String PreferenceGroupAdapter$PreferenceLayout.access$102(PreferenceGroupAdapter$PreferenceLayout, String)>
	//*   7   15:pop             
	//*   8   16:aload_2         
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #123 <Method int Preference.getLayoutResource()>
	//*  11   21:invokestatic    #127 <Method int PreferenceGroupAdapter$PreferenceLayout.access$202(PreferenceGroupAdapter$PreferenceLayout, int)>
	//*  12   24:pop             
	//*  13   25:aload_2         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #130 <Method int Preference.getWidgetLayoutResource()>
	//*  16   30:invokestatic    #133 <Method int PreferenceGroupAdapter$PreferenceLayout.access$302(PreferenceGroupAdapter$PreferenceLayout, int)>
	//*  17   33:pop             
	//*  18   34:aload_2         
	//*  19   35:areturn         
			preferencelayout = new PreferenceLayout();
	//   20   36:new             #13  <Class PreferenceGroupAdapter$PreferenceLayout>
	//   21   39:dup             
	//   22   40:invokespecial   #42  <Method void PreferenceGroupAdapter$PreferenceLayout()>
	//   23   43:astore_2        
		preferencelayout.name = ((Object) (preference)).getClass().getName();
		preferencelayout.resId = preference.getLayoutResource();
		preferencelayout.widgetResId = preference.getWidgetLayoutResource();
		return preferencelayout;
	//*  24   44:goto            4
	}

	private void flattenPreferenceGroup(List list, PreferenceGroup preferencegroup)
	{
		preferencegroup.sortPreferences();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #138 <Method void PreferenceGroup.sortPreferences()>
		int j = preferencegroup.getPreferenceCount();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #141 <Method int PreferenceGroup.getPreferenceCount()>
	//    4    8:istore          4
		for(int i = 0; i < j; i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_3        
	//*   7   12:iload_3         
	//*   8   13:iload           4
	//*   9   15:icmpge          83
		{
			Preference preference = preferencegroup.getPreference(i);
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #145 <Method Preference PreferenceGroup.getPreference(int)>
	//   13   23:astore          5
			list.add(((Object) (preference)));
	//   14   25:aload_1         
	//   15   26:aload           5
	//   16   28:invokeinterface #101 <Method boolean List.add(Object)>
	//   17   33:pop             
			addPreferenceClassName(preference);
	//   18   34:aload_0         
	//   19   35:aload           5
	//   20   37:invokespecial   #147 <Method void addPreferenceClassName(Preference)>
			if(preference instanceof PreferenceGroup)
	//*  21   40:aload           5
	//*  22   42:instanceof      #58  <Class PreferenceGroup>
	//*  23   45:ifeq            70
			{
				PreferenceGroup preferencegroup1 = (PreferenceGroup)preference;
	//   24   48:aload           5
	//   25   50:checkcast       #58  <Class PreferenceGroup>
	//   26   53:astore          6
				if(preferencegroup1.isOnSameScreenAsChildren())
	//*  27   55:aload           6
	//*  28   57:invokevirtual   #150 <Method boolean PreferenceGroup.isOnSameScreenAsChildren()>
	//*  29   60:ifeq            70
					flattenPreferenceGroup(list, preferencegroup1);
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:aload           6
	//   33   67:invokespecial   #152 <Method void flattenPreferenceGroup(List, PreferenceGroup)>
			}
			preference.setOnPreferenceChangeInternalListener(((Preference.OnPreferenceChangeInternalListener) (this)));
	//   34   70:aload           5
	//   35   72:aload_0         
	//   36   73:invokevirtual   #153 <Method void Preference.setOnPreferenceChangeInternalListener(Preference$OnPreferenceChangeInternalListener)>
		}

	//   37   76:iload_3         
	//   38   77:iconst_1        
	//   39   78:iadd            
	//   40   79:istore_3        
	//*  41   80:goto            12
	//   42   83:return          
	}

	private void syncMyPreferences()
	{
		for(Iterator iterator = mPreferenceListInternal.iterator(); iterator.hasNext(); ((Preference)iterator.next()).setOnPreferenceChangeInternalListener(((Preference.OnPreferenceChangeInternalListener) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List mPreferenceListInternal>
	//    2    4:invokeinterface #159 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_1         
	//    8   20:invokeinterface #168 <Method Object Iterator.next()>
	//    9   25:checkcast       #119 <Class Preference>
	//   10   28:aconst_null     
	//   11   29:invokevirtual   #153 <Method void Preference.setOnPreferenceChangeInternalListener(Preference$OnPreferenceChangeInternalListener)>
	//*  12   32:goto            10
		ArrayList arraylist = new ArrayList(mPreferenceListInternal.size());
	//   13   35:new             #64  <Class ArrayList>
	//   14   38:dup             
	//   15   39:aload_0         
	//   16   40:getfield        #69  <Field List mPreferenceListInternal>
	//   17   43:invokeinterface #171 <Method int List.size()>
	//   18   48:invokespecial   #174 <Method void ArrayList(int)>
	//   19   51:astore_1        
		flattenPreferenceGroup(((List) (arraylist)), mPreferenceGroup);
	//   20   52:aload_0         
	//   21   53:aload_1         
	//   22   54:aload_0         
	//   23   55:getfield        #56  <Field PreferenceGroup mPreferenceGroup>
	//   24   58:invokespecial   #152 <Method void flattenPreferenceGroup(List, PreferenceGroup)>
		ArrayList arraylist1 = new ArrayList(((List) (arraylist)).size());
	//   25   61:new             #64  <Class ArrayList>
	//   26   64:dup             
	//   27   65:aload_1         
	//   28   66:invokeinterface #171 <Method int List.size()>
	//   29   71:invokespecial   #174 <Method void ArrayList(int)>
	//   30   74:astore_2        
		Iterator iterator1 = ((List) (arraylist)).iterator();
	//   31   75:aload_1         
	//   32   76:invokeinterface #159 <Method Iterator List.iterator()>
	//   33   81:astore_3        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   34   82:aload_3         
	//   35   83:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//   36   88:ifeq            122
			Preference preference = (Preference)iterator1.next();
	//   37   91:aload_3         
	//   38   92:invokeinterface #168 <Method Object Iterator.next()>
	//   39   97:checkcast       #119 <Class Preference>
	//   40  100:astore          4
			if(preference.isVisible())
	//*  41  102:aload           4
	//*  42  104:invokevirtual   #177 <Method boolean Preference.isVisible()>
	//*  43  107:ifeq            82
				((List) (arraylist1)).add(((Object) (preference)));
	//   44  110:aload_2         
	//   45  111:aload           4
	//   46  113:invokeinterface #101 <Method boolean List.add(Object)>
	//   47  118:pop             
		} while(true);
	//   48  119:goto            82
		mPreferenceList = ((List) (arraylist1));
	//   49  122:aload_0         
	//   50  123:aload_2         
	//   51  124:putfield        #67  <Field List mPreferenceList>
		mPreferenceListInternal = ((List) (arraylist));
	//   52  127:aload_0         
	//   53  128:aload_1         
	//   54  129:putfield        #69  <Field List mPreferenceListInternal>
		notifyDataSetChanged();
	//   55  132:aload_0         
	//   56  133:invokevirtual   #180 <Method void notifyDataSetChanged()>
	//   57  136:return          
	}

	public Preference getItem(int i)
	{
		if(i < 0 || i >= getItemCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #184 <Method int getItemCount()>
	//*   5    9:icmplt          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return (Preference)mPreferenceList.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #67  <Field List mPreferenceList>
	//   10   18:iload_1         
	//   11   19:invokeinterface #188 <Method Object List.get(int)>
	//   12   24:checkcast       #119 <Class Preference>
	//   13   27:areturn         
	}

	public int getItemCount()
	{
		return mPreferenceList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List mPreferenceList>
	//    2    4:invokeinterface #171 <Method int List.size()>
	//    3    9:ireturn         
	}

	public long getItemId(int i)
	{
		if(!hasStableIds())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #193 <Method boolean hasStableIds()>
	//*   2    4:ifne            11
			return -1L;
	//    3    7:ldc2w           #194 <Long -1L>
	//    4   10:lreturn         
		else
			return getItem(i).getId();
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokevirtual   #197 <Method Preference getItem(int)>
	//    8   16:invokevirtual   #201 <Method long Preference.getId()>
	//    9   19:lreturn         
	}

	public int getItemViewType(int i)
	{
		mTempPreferenceLayout = createPreferenceLayout(getItem(i), mTempPreferenceLayout);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #197 <Method Preference getItem(int)>
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field PreferenceGroupAdapter$PreferenceLayout mTempPreferenceLayout>
	//    7   11:invokespecial   #92  <Method PreferenceGroupAdapter$PreferenceLayout createPreferenceLayout(Preference, PreferenceGroupAdapter$PreferenceLayout)>
	//    8   14:putfield        #44  <Field PreferenceGroupAdapter$PreferenceLayout mTempPreferenceLayout>
		i = mPreferenceLayouts.indexOf(((Object) (mTempPreferenceLayout)));
	//    9   17:aload_0         
	//   10   18:getfield        #71  <Field List mPreferenceLayouts>
	//   11   21:aload_0         
	//   12   22:getfield        #44  <Field PreferenceGroupAdapter$PreferenceLayout mTempPreferenceLayout>
	//   13   25:invokeinterface #207 <Method int List.indexOf(Object)>
	//   14   30:istore_1        
		if(i != -1)
	//*  15   31:iload_1         
	//*  16   32:iconst_m1       
	//*  17   33:icmpeq          38
		{
			return i;
	//   18   36:iload_1         
	//   19   37:ireturn         
		} else
		{
			i = mPreferenceLayouts.size();
	//   20   38:aload_0         
	//   21   39:getfield        #71  <Field List mPreferenceLayouts>
	//   22   42:invokeinterface #171 <Method int List.size()>
	//   23   47:istore_1        
			mPreferenceLayouts.add(((Object) (new PreferenceLayout(mTempPreferenceLayout))));
	//   24   48:aload_0         
	//   25   49:getfield        #71  <Field List mPreferenceLayouts>
	//   26   52:new             #13  <Class PreferenceGroupAdapter$PreferenceLayout>
	//   27   55:dup             
	//   28   56:aload_0         
	//   29   57:getfield        #44  <Field PreferenceGroupAdapter$PreferenceLayout mTempPreferenceLayout>
	//   30   60:invokespecial   #210 <Method void PreferenceGroupAdapter$PreferenceLayout(PreferenceGroupAdapter$PreferenceLayout)>
	//   31   63:invokeinterface #101 <Method boolean List.add(Object)>
	//   32   68:pop             
			return i;
	//   33   69:iload_1         
	//   34   70:ireturn         
		}
	}

	public int getPreferenceAdapterPosition(Preference preference)
	{
		int j = mPreferenceList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List mPreferenceList>
	//    2    4:invokeinterface #171 <Method int List.size()>
	//    3    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          55
		{
			Preference preference1 = (Preference)mPreferenceList.get(i);
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field List mPreferenceList>
	//   11   21:iload_2         
	//   12   22:invokeinterface #188 <Method Object List.get(int)>
	//   13   27:checkcast       #119 <Class Preference>
	//   14   30:astore          4
			if(preference1 != null && ((Object) (preference1)).equals(((Object) (preference))))
	//*  15   32:aload           4
	//*  16   34:ifnull          48
	//*  17   37:aload           4
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #215 <Method boolean Object.equals(Object)>
	//*  20   43:ifeq            48
				return i;
	//   21   46:iload_2         
	//   22   47:ireturn         
		}

	//   23   48:iload_2         
	//   24   49:iconst_1        
	//   25   50:iadd            
	//   26   51:istore_2        
	//*  27   52:goto            12
		return -1;
	//   28   55:iconst_m1       
	//   29   56:ireturn         
	}

	public int getPreferenceAdapterPosition(String s)
	{
		int j = mPreferenceList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List mPreferenceList>
	//    2    4:invokeinterface #171 <Method int List.size()>
	//    3    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          49
			if(TextUtils.equals(((CharSequence) (s)), ((CharSequence) (((Preference)mPreferenceList.get(i)).getKey()))))
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #67  <Field List mPreferenceList>
	//*  12   22:iload_2         
	//*  13   23:invokeinterface #188 <Method Object List.get(int)>
	//*  14   28:checkcast       #119 <Class Preference>
	//*  15   31:invokevirtual   #219 <Method String Preference.getKey()>
	//*  16   34:invokestatic    #224 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  17   37:ifeq            42
				return i;
	//   18   40:iload_2         
	//   19   41:ireturn         

	//   20   42:iload_2         
	//   21   43:iconst_1        
	//   22   44:iadd            
	//   23   45:istore_2        
	//*  24   46:goto            12
		return -1;
	//   25   49:iconst_m1       
	//   26   50:ireturn         
	}

	public void onBindViewHolder(PreferenceViewHolder preferenceviewholder, int i)
	{
		getItem(i).onBindViewHolder(preferenceviewholder);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #197 <Method Preference getItem(int)>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #229 <Method void Preference.onBindViewHolder(PreferenceViewHolder)>
	//    5    9:return          
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((PreferenceViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #232 <Class PreferenceViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #234 <Method void onBindViewHolder(PreferenceViewHolder, int)>
	//    5    9:return          
	}

	public PreferenceViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		PreferenceLayout preferencelayout = (PreferenceLayout)mPreferenceLayouts.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List mPreferenceLayouts>
	//    2    4:iload_2         
	//    3    5:invokeinterface #188 <Method Object List.get(int)>
	//    4   10:checkcast       #13  <Class PreferenceGroupAdapter$PreferenceLayout>
	//    5   13:astore          5
		LayoutInflater layoutinflater = LayoutInflater.from(viewgroup.getContext());
	//    6   15:aload_1         
	//    7   16:invokevirtual   #242 <Method Context ViewGroup.getContext()>
	//    8   19:invokestatic    #248 <Method LayoutInflater LayoutInflater.from(Context)>
	//    9   22:astore          6
		TypedArray typedarray = viewgroup.getContext().obtainStyledAttributes(((android.util.AttributeSet) (null)), R.styleable.BackgroundStyle);
	//   10   24:aload_1         
	//   11   25:invokevirtual   #242 <Method Context ViewGroup.getContext()>
	//   12   28:aconst_null     
	//   13   29:getstatic       #254 <Field int[] R$styleable.BackgroundStyle>
	//   14   32:invokevirtual   #260 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[])>
	//   15   35:astore          7
		android.graphics.drawable.Drawable drawable = typedarray.getDrawable(R.styleable.BackgroundStyle_android_selectableItemBackground);
	//   16   37:aload           7
	//   17   39:getstatic       #264 <Field int R$styleable.BackgroundStyle_android_selectableItemBackground>
	//   18   42:invokevirtual   #270 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
	//   19   45:astore          4
		Object obj = ((Object) (drawable));
	//   20   47:aload           4
	//   21   49:astore_3        
		if(drawable == null)
	//*  22   50:aload           4
	//*  23   52:ifnonnull       69
			obj = ((Object) (viewgroup.getContext().getResources().getDrawable(0x1080062)));
	//   24   55:aload_1         
	//   25   56:invokevirtual   #242 <Method Context ViewGroup.getContext()>
	//   26   59:invokevirtual   #274 <Method Resources Context.getResources()>
	//   27   62:ldc2            #275 <Int 0x1080062>
	//   28   65:invokevirtual   #278 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   29   68:astore_3        
		typedarray.recycle();
	//   30   69:aload           7
	//   31   71:invokevirtual   #281 <Method void TypedArray.recycle()>
		viewgroup = ((ViewGroup) (layoutinflater.inflate(preferencelayout.resId, viewgroup, false)));
	//   32   74:aload           6
	//   33   76:aload           5
	//   34   78:invokestatic    #285 <Method int PreferenceGroupAdapter$PreferenceLayout.access$200(PreferenceGroupAdapter$PreferenceLayout)>
	//   35   81:aload_1         
	//   36   82:iconst_0        
	//   37   83:invokevirtual   #289 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   38   86:astore_1        
		if(((View) (viewgroup)).getBackground() == null)
	//*  39   87:aload_1         
	//*  40   88:invokevirtual   #295 <Method android.graphics.drawable.Drawable View.getBackground()>
	//*  41   91:ifnonnull       99
			ViewCompat.setBackground(((View) (viewgroup)), ((android.graphics.drawable.Drawable) (obj)));
	//   42   94:aload_1         
	//   43   95:aload_3         
	//   44   96:invokestatic    #301 <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		obj = ((Object) ((ViewGroup)((View) (viewgroup)).findViewById(0x1020018)));
	//   45   99:aload_1         
	//   46  100:ldc2            #302 <Int 0x1020018>
	//   47  103:invokevirtual   #306 <Method View View.findViewById(int)>
	//   48  106:checkcast       #238 <Class ViewGroup>
	//   49  109:astore_3        
		if(obj != null)
	//*  50  110:aload_3         
	//*  51  111:ifnull          134
			if(preferencelayout.widgetResId != 0)
	//*  52  114:aload           5
	//*  53  116:invokestatic    #309 <Method int PreferenceGroupAdapter$PreferenceLayout.access$300(PreferenceGroupAdapter$PreferenceLayout)>
	//*  54  119:ifeq            143
				layoutinflater.inflate(preferencelayout.widgetResId, ((ViewGroup) (obj)));
	//   55  122:aload           6
	//   56  124:aload           5
	//   57  126:invokestatic    #309 <Method int PreferenceGroupAdapter$PreferenceLayout.access$300(PreferenceGroupAdapter$PreferenceLayout)>
	//   58  129:aload_3         
	//   59  130:invokevirtual   #312 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   60  133:pop             
			else
	//*  61  134:new             #232 <Class PreferenceViewHolder>
	//*  62  137:dup             
	//*  63  138:aload_1         
	//*  64  139:invokespecial   #315 <Method void PreferenceViewHolder(View)>
	//*  65  142:areturn         
				((ViewGroup) (obj)).setVisibility(8);
	//   66  143:aload_3         
	//   67  144:bipush          8
	//   68  146:invokevirtual   #318 <Method void ViewGroup.setVisibility(int)>
		return new PreferenceViewHolder(((View) (viewgroup)));
	//*  69  149:goto            134
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #321 <Method PreferenceViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public void onPreferenceChange(Preference preference)
	{
		int i = mPreferenceList.indexOf(((Object) (preference)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field List mPreferenceList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #207 <Method int List.indexOf(Object)>
	//    4   10:istore_2        
		if(i != -1)
	//*   5   11:iload_2         
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          22
			notifyItemChanged(i, ((Object) (preference)));
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #326 <Method void notifyItemChanged(int, Object)>
	//   12   22:return          
	}

	public void onPreferenceHierarchyChange(Preference preference)
	{
		mHandler.removeCallbacks(mSyncRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Runnable mSyncRunnable>
	//    4    8:invokevirtual   #331 <Method void Handler.removeCallbacks(Runnable)>
		mHandler.post(mSyncRunnable);
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field Handler mHandler>
	//    7   15:aload_0         
	//    8   16:getfield        #54  <Field Runnable mSyncRunnable>
	//    9   19:invokevirtual   #335 <Method boolean Handler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void onPreferenceVisibilityChange(Preference preference)
	{
		if(!mPreferenceListInternal.contains(((Object) (preference))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field List mPreferenceListInternal>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #98  <Method boolean List.contains(Object)>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		if(preference.isVisible())
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #177 <Method boolean Preference.isVisible()>
	//*   8   18:ifeq            101
		{
			int i = -1;
	//    9   21:iconst_m1       
	//   10   22:istore_2        
			Iterator iterator = mPreferenceListInternal.iterator();
	//   11   23:aload_0         
	//   12   24:getfield        #69  <Field List mPreferenceListInternal>
	//   13   27:invokeinterface #159 <Method Iterator List.iterator()>
	//   14   32:astore          4
			do
			{
				Preference preference1;
label0:
				{
					if(iterator.hasNext())
	//*  15   34:aload           4
	//*  16   36:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*  17   41:ifeq            65
					{
						preference1 = (Preference)iterator.next();
	//   18   44:aload           4
	//   19   46:invokeinterface #168 <Method Object Iterator.next()>
	//   20   51:checkcast       #119 <Class Preference>
	//   21   54:astore          5
						if(!((Object) (preference)).equals(((Object) (preference1))))
							break label0;
	//   22   56:aload_1         
	//   23   57:aload           5
	//   24   59:invokevirtual   #215 <Method boolean Object.equals(Object)>
	//   25   62:ifeq            86
					}
					mPreferenceList.add(i + 1, ((Object) (preference)));
	//   26   65:aload_0         
	//   27   66:getfield        #67  <Field List mPreferenceList>
	//   28   69:iload_2         
	//   29   70:iconst_1        
	//   30   71:iadd            
	//   31   72:aload_1         
	//   32   73:invokeinterface #338 <Method void List.add(int, Object)>
					notifyItemInserted(i + 1);
	//   33   78:aload_0         
	//   34   79:iload_2         
	//   35   80:iconst_1        
	//   36   81:iadd            
	//   37   82:invokevirtual   #341 <Method void notifyItemInserted(int)>
					return;
	//   38   85:return          
				}
				if(preference1.isVisible())
	//*  39   86:aload           5
	//*  40   88:invokevirtual   #177 <Method boolean Preference.isVisible()>
	//*  41   91:ifeq            34
					i++;
	//   42   94:iload_2         
	//   43   95:iconst_1        
	//   44   96:iadd            
	//   45   97:istore_2        
			} while(true);
	//   46   98:goto            34
		} else
		{
			int k = mPreferenceList.size();
	//   47  101:aload_0         
	//   48  102:getfield        #67  <Field List mPreferenceList>
	//   49  105:invokeinterface #171 <Method int List.size()>
	//   50  110:istore_3        
			int j = 0;
	//   51  111:iconst_0        
	//   52  112:istore_2        
			do
			{
				if(j >= k || ((Object) (preference)).equals(mPreferenceList.get(j)))
	//*  53  113:iload_2         
	//*  54  114:iload_3         
	//*  55  115:icmpge          135
	//*  56  118:aload_1         
	//*  57  119:aload_0         
	//*  58  120:getfield        #67  <Field List mPreferenceList>
	//*  59  123:iload_2         
	//*  60  124:invokeinterface #188 <Method Object List.get(int)>
	//*  61  129:invokevirtual   #215 <Method boolean Object.equals(Object)>
	//*  62  132:ifeq            152
				{
					mPreferenceList.remove(j);
	//   63  135:aload_0         
	//   64  136:getfield        #67  <Field List mPreferenceList>
	//   65  139:iload_2         
	//   66  140:invokeinterface #344 <Method Object List.remove(int)>
	//   67  145:pop             
					notifyItemRemoved(j);
	//   68  146:aload_0         
	//   69  147:iload_2         
	//   70  148:invokevirtual   #347 <Method void notifyItemRemoved(int)>
					return;
	//   71  151:return          
				}
				j++;
	//   72  152:iload_2         
	//   73  153:iconst_1        
	//   74  154:iadd            
	//   75  155:istore_2        
			} while(true);
	//   76  156:goto            113
		}
	}

	private static final String TAG = "PreferenceGroupAdapter";
	private Handler mHandler;
	private PreferenceGroup mPreferenceGroup;
	private List mPreferenceLayouts;
	private List mPreferenceList;
	private List mPreferenceListInternal;
	private Runnable mSyncRunnable;
	private PreferenceLayout mTempPreferenceLayout;


/*
	static void access$000(PreferenceGroupAdapter preferencegroupadapter)
	{
		preferencegroupadapter.syncMyPreferences();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void syncMyPreferences()>
		return;
	//    2    4:return          
	}

*/
}

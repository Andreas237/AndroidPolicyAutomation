// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MaintenanceUIServiceData
{
	private static final class CppProxy extends MaintenanceUIServiceData
	{

		private native void nativeDestroy(long l);

		private native String native_getBuyPartsWebAddress(long l);

		private native String native_getCategoriesListTitle(long l);

		private native String native_getCategoryHelpGuideAddress(long l);

		private native HashSet native_getDataStateChangelist(long l);

		private native ArrayList native_getMaintenanceCategories(long l);

		private native ArrayList native_getMaintenancePartsForFocusedCategory(long l);

		private native ArrayList native_getViewStateChangelist(long l);

		private native void native_setCategoryIdForFocus(long l, String s);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #53  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #55  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #62  <Method void Object.finalize()>
		//    4    8:return          
		}

		public String getBuyPartsWebAddress()
		{
			return native_getBuyPartsWebAddress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #66  <Method String native_getBuyPartsWebAddress(long)>
		//    4    8:areturn         
		}

		public String getCategoriesListTitle()
		{
			return native_getCategoriesListTitle(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #69  <Method String native_getCategoriesListTitle(long)>
		//    4    8:areturn         
		}

		public String getCategoryHelpGuideAddress()
		{
			return native_getCategoryHelpGuideAddress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #72  <Method String native_getCategoryHelpGuideAddress(long)>
		//    4    8:areturn         
		}

		public HashSet getDataStateChangelist()
		{
			return native_getDataStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #76  <Method HashSet native_getDataStateChangelist(long)>
		//    4    8:areturn         
		}

		public ArrayList getMaintenanceCategories()
		{
			return native_getMaintenanceCategories(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #82  <Method ArrayList native_getMaintenanceCategories(long)>
		//    4    8:areturn         
		}

		public ArrayList getMaintenancePartsForFocusedCategory()
		{
			return native_getMaintenancePartsForFocusedCategory(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #86  <Method ArrayList native_getMaintenancePartsForFocusedCategory(long)>
		//    4    8:areturn         
		}

		public ArrayList getViewStateChangelist()
		{
			return native_getViewStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #90  <Method ArrayList native_getViewStateChangelist(long)>
		//    4    8:areturn         
		}

		public void setCategoryIdForFocus(String s)
		{
			native_setCategoryIdForFocus(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #94  <Method void native_setCategoryIdForFocus(long, String)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void MaintenanceUIServiceData()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public MaintenanceUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	public static native MaintenanceUIServiceData create();

	public abstract String getBuyPartsWebAddress();

	public abstract String getCategoriesListTitle();

	public abstract String getCategoryHelpGuideAddress();

	public abstract HashSet getDataStateChangelist();

	public abstract ArrayList getMaintenanceCategories();

	public abstract ArrayList getMaintenancePartsForFocusedCategory();

	public abstract ArrayList getViewStateChangelist();

	public abstract void setCategoryIdForFocus(String s);

	public static final String CATEGORY_ID_BIN = "bin";
	public static final String CATEGORY_ID_BRUSH = "brushes";
	public static final String CATEGORY_ID_CORE = "core";
	public static final String CATEGORY_ID_EXTRACTOR = "extractor";
	public static final String CATEGORY_ID_MAIN_BRUSH = "main brushes";
	public static final double MAINTENANCE_REQUIRED_THRESHOLD = 1D;
	public static final double MAINTENANCE_SUGGESTED_THRESHOLD = 0.59999999999999998D;
	public static final double NO_MAINTENANCE_NEEDED_THRESHOLD = 0.29999999999999999D;
}

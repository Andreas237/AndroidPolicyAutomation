// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.ads.zzlw;

// Referenced classes of package com.google.android.gms.ads.search:
//			SearchAdRequest, zza

public final class DynamicHeightSearchAdRequest
{
	public static final class Builder
	{

		static SearchAdRequest.Builder zza(Builder builder)
		{
			return builder.zzdgx;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SearchAdRequest$Builder zzdgx>
		//    2    4:areturn         
		}

		public final Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
		{
			zzdgx.addCustomEventExtrasBundle(class1, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SearchAdRequest$Builder zzdgx>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #33  <Method SearchAdRequest$Builder SearchAdRequest$Builder.addCustomEventExtrasBundle(Class, Bundle)>
		//    5    9:pop             
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public final Builder addNetworkExtras(NetworkExtras networkextras)
		{
			zzdgx.addNetworkExtras(networkextras);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SearchAdRequest$Builder zzdgx>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method SearchAdRequest$Builder SearchAdRequest$Builder.addNetworkExtras(NetworkExtras)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
		{
			zzdgx.addNetworkExtrasBundle(class1, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SearchAdRequest$Builder zzdgx>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #43  <Method SearchAdRequest$Builder SearchAdRequest$Builder.addNetworkExtrasBundle(Class, Bundle)>
		//    5    9:pop             
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public final DynamicHeightSearchAdRequest build()
		{
			zzdgx.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, zzdgy);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SearchAdRequest$Builder zzdgx>
		//    2    4:ldc1            #48  <Class AdMobAdapter>
		//    3    6:aload_0         
		//    4    7:getfield        #25  <Field Bundle zzdgy>
		//    5   10:invokevirtual   #43  <Method SearchAdRequest$Builder SearchAdRequest$Builder.addNetworkExtrasBundle(Class, Bundle)>
		//    6   13:pop             
			return new DynamicHeightSearchAdRequest(this, ((zza) (null)));
		//    7   14:new             #6   <Class DynamicHeightSearchAdRequest>
		//    8   17:dup             
		//    9   18:aload_0         
		//   10   19:aconst_null     
		//   11   20:invokespecial   #51  <Method void DynamicHeightSearchAdRequest(DynamicHeightSearchAdRequest$Builder, zza)>
		//   12   23:areturn         
		}

		public final Builder setAdBorderSelectors(String s)
		{
			zzdgy.putString("csa_adBorderSelectors", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #55  <String "csa_adBorderSelectors">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setAdTest(boolean flag)
		{
			Bundle bundle = zzdgy;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:astore_3        
			String s;
			if(flag)
		//*   3    5:iload_1         
		//*   4    6:ifeq            15
				s = "on";
		//    5    9:ldc1            #63  <String "on">
		//    6   11:astore_2        
			else
		//*   7   12:goto            18
				s = "off";
		//    8   15:ldc1            #65  <String "off">
		//    9   17:astore_2        
			bundle.putString("csa_adtest", s);
		//   10   18:aload_3         
		//   11   19:ldc1            #67  <String "csa_adtest">
		//   12   21:aload_2         
		//   13   22:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//   14   25:aload_0         
		//   15   26:areturn         
		}

		public final Builder setAdjustableLineHeight(int i)
		{
			zzdgy.putString("csa_adjustableLineHeight", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #71  <String "csa_adjustableLineHeight">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setAdvancedOptionValue(String s, String s1)
		{
			zzdgy.putString(s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder setAttributionSpacingBelow(int i)
		{
			zzdgy.putString("csa_attributionSpacingBelow", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #82  <String "csa_attributionSpacingBelow">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setBorderSelections(String s)
		{
			zzdgy.putString("csa_borderSelections", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #85  <String "csa_borderSelections">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setChannel(String s)
		{
			zzdgy.putString("csa_channel", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #88  <String "csa_channel">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorAdBorder(String s)
		{
			zzdgy.putString("csa_colorAdBorder", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #91  <String "csa_colorAdBorder">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorAdSeparator(String s)
		{
			zzdgy.putString("csa_colorAdSeparator", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #94  <String "csa_colorAdSeparator">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorAnnotation(String s)
		{
			zzdgy.putString("csa_colorAnnotation", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #97  <String "csa_colorAnnotation">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorAttribution(String s)
		{
			zzdgy.putString("csa_colorAttribution", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #100 <String "csa_colorAttribution">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorBackground(String s)
		{
			zzdgy.putString("csa_colorBackground", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #103 <String "csa_colorBackground">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorBorder(String s)
		{
			zzdgy.putString("csa_colorBorder", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #106 <String "csa_colorBorder">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorDomainLink(String s)
		{
			zzdgy.putString("csa_colorDomainLink", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #109 <String "csa_colorDomainLink">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorText(String s)
		{
			zzdgy.putString("csa_colorText", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #112 <String "csa_colorText">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setColorTitleLink(String s)
		{
			zzdgy.putString("csa_colorTitleLink", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #115 <String "csa_colorTitleLink">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setCssWidth(int i)
		{
			zzdgy.putString("csa_width", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #118 <String "csa_width">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setDetailedAttribution(boolean flag)
		{
			zzdgy.putString("csa_detailedAttribution", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #121 <String "csa_detailedAttribution">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setFontFamily(String s)
		{
			zzdgy.putString("csa_fontFamily", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #129 <String "csa_fontFamily">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setFontFamilyAttribution(String s)
		{
			zzdgy.putString("csa_fontFamilyAttribution", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #132 <String "csa_fontFamilyAttribution">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setFontSizeAnnotation(int i)
		{
			zzdgy.putString("csa_fontSizeAnnotation", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #135 <String "csa_fontSizeAnnotation">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setFontSizeAttribution(int i)
		{
			zzdgy.putString("csa_fontSizeAttribution", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #138 <String "csa_fontSizeAttribution">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setFontSizeDescription(int i)
		{
			zzdgy.putString("csa_fontSizeDescription", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #141 <String "csa_fontSizeDescription">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setFontSizeDomainLink(int i)
		{
			zzdgy.putString("csa_fontSizeDomainLink", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #144 <String "csa_fontSizeDomainLink">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setFontSizeTitle(int i)
		{
			zzdgy.putString("csa_fontSizeTitle", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #147 <String "csa_fontSizeTitle">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setHostLanguage(String s)
		{
			zzdgy.putString("csa_hl", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #150 <String "csa_hl">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setIsClickToCallEnabled(boolean flag)
		{
			zzdgy.putString("csa_clickToCall", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #153 <String "csa_clickToCall">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setIsLocationEnabled(boolean flag)
		{
			zzdgy.putString("csa_location", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #156 <String "csa_location">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setIsPlusOnesEnabled(boolean flag)
		{
			zzdgy.putString("csa_plusOnes", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #159 <String "csa_plusOnes">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setIsSellerRatingsEnabled(boolean flag)
		{
			zzdgy.putString("csa_sellerRatings", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #162 <String "csa_sellerRatings">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setIsSiteLinksEnabled(boolean flag)
		{
			zzdgy.putString("csa_siteLinks", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #165 <String "csa_siteLinks">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setIsTitleBold(boolean flag)
		{
			zzdgy.putString("csa_titleBold", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #168 <String "csa_titleBold">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setIsTitleUnderlined(boolean flag)
		{
			zzdgy.putString("csa_noTitleUnderline", Boolean.toString(flag ^ true));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #171 <String "csa_noTitleUnderline">
		//    3    6:iload_1         
		//    4    7:iconst_1        
		//    5    8:ixor            
		//    6    9:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    7   12:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    8   15:aload_0         
		//    9   16:areturn         
		}

		public final Builder setLocationColor(String s)
		{
			zzdgy.putString("csa_colorLocation", s);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #174 <String "csa_colorLocation">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public final Builder setLocationFontSize(int i)
		{
			zzdgy.putString("csa_fontSizeLocation", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #177 <String "csa_fontSizeLocation">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setLongerHeadlines(boolean flag)
		{
			zzdgy.putString("csa_longerHeadlines", Boolean.toString(flag));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #180 <String "csa_longerHeadlines">
		//    3    6:iload_1         
		//    4    7:invokestatic    #126 <Method String Boolean.toString(boolean)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setNumber(int i)
		{
			zzdgy.putString("csa_number", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #183 <String "csa_number">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setPage(int i)
		{
			zzdgy.putString("csa_adPage", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #186 <String "csa_adPage">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public final Builder setQuery(String s)
		{
			zzdgx.setQuery(s);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SearchAdRequest$Builder zzdgx>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #190 <Method SearchAdRequest$Builder SearchAdRequest$Builder.setQuery(String)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder setVerticalSpacing(int i)
		{
			zzdgy.putString("csa_verticalSpacing", Integer.toString(i));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bundle zzdgy>
		//    2    4:ldc1            #193 <String "csa_verticalSpacing">
		//    3    6:iload_1         
		//    4    7:invokestatic    #77  <Method String Integer.toString(int)>
		//    5   10:invokevirtual   #59  <Method void Bundle.putString(String, String)>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		private final SearchAdRequest.Builder zzdgx = new SearchAdRequest.Builder();
		private final Bundle zzdgy = new Bundle();

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #17  <Class SearchAdRequest$Builder>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void SearchAdRequest$Builder()>
		//    6   12:putfield        #20  <Field SearchAdRequest$Builder zzdgx>
		//    7   15:aload_0         
		//    8   16:new             #22  <Class Bundle>
		//    9   19:dup             
		//   10   20:invokespecial   #23  <Method void Bundle()>
		//   11   23:putfield        #25  <Field Bundle zzdgy>
		//   12   26:return          
		}
	}


	private DynamicHeightSearchAdRequest(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzdgw = Builder.zza(builder).build();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method SearchAdRequest$Builder DynamicHeightSearchAdRequest$Builder.zza(DynamicHeightSearchAdRequest$Builder)>
	//    5    9:invokevirtual   #24  <Method SearchAdRequest SearchAdRequest$Builder.build()>
	//    6   12:putfield        #26  <Field SearchAdRequest zzdgw>
	//    7   15:return          
	}

	DynamicHeightSearchAdRequest(Builder builder, zza zza)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void DynamicHeightSearchAdRequest(DynamicHeightSearchAdRequest$Builder)>
	//    3    5:return          
	}

	public final Bundle getCustomEventExtrasBundle(Class class1)
	{
		return zzdgw.getCustomEventExtrasBundle(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SearchAdRequest zzdgw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method Bundle SearchAdRequest.getCustomEventExtrasBundle(Class)>
	//    4    8:areturn         
	}

	public final NetworkExtras getNetworkExtras(Class class1)
	{
		return zzdgw.getNetworkExtras(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SearchAdRequest zzdgw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method NetworkExtras SearchAdRequest.getNetworkExtras(Class)>
	//    4    8:areturn         
	}

	public final Bundle getNetworkExtrasBundle(Class class1)
	{
		return zzdgw.getNetworkExtrasBundle(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SearchAdRequest zzdgw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method Bundle SearchAdRequest.getNetworkExtrasBundle(Class)>
	//    4    8:areturn         
	}

	public final String getQuery()
	{
		return zzdgw.getQuery();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SearchAdRequest zzdgw>
	//    2    4:invokevirtual   #53  <Method String SearchAdRequest.getQuery()>
	//    3    7:areturn         
	}

	public final boolean isTestDevice(Context context)
	{
		return zzdgw.isTestDevice(context);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SearchAdRequest zzdgw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method boolean SearchAdRequest.isTestDevice(Context)>
	//    4    8:ireturn         
	}

	final zzlw zzay()
	{
		return zzdgw.zzay();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SearchAdRequest zzdgw>
	//    2    4:invokevirtual   #61  <Method zzlw SearchAdRequest.zzay()>
	//    3    7:areturn         
	}

	private final SearchAdRequest zzdgw;
}

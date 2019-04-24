// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import com.irobot.home.model.aa;
import com.irobot.home.model.l;
import com.irobot.home.model.rest.*;
import org.androidannotations.a.a.a.a;

public interface CustomerCareRestClient
	extends a
{

	public abstract AppVersionItemList getAppVersionInfo(String s);

	public abstract ContactInfo getContactInfo(String s, String s1, String s2);

	public abstract CustomerCareInfo getCustomerCareInfo(String s, String s1, String s2);

	public abstract FirmwareUpdateItemList getFirmwareUpdates(String s);

	public abstract CommonQuestionList getHelpCommonQuestionsList(String s, String s1, String s2);

	public abstract l getHelpGuideTourPagesList(String s, String s1, String s2);

	public abstract HelpInfo getHelpInfo(String s, String s1, String s2);

	public abstract LanguagePackList getLanguagePack(String s, String s1, String s2);

	public abstract LearnMoreInfo getLearnMoreInfo(String s, String s1);

	public abstract NewFeatureInfo getNewFeatureInfo(String s, String s1, String s2);

	public abstract CompletePartsInfo getPartsContentInfo(String s, String s1, String s2);

	public abstract RobotErrorHelpContentList getRobotErrorHelp(String s, String s1, String s2);

	public abstract SocialInfoList getSocialInfo(String s, String s1, String s2);

	public abstract StandbyModeInfo getStandbyModeInfo(String s, String s1, String s2);

	public abstract aa getSupportedCountries();

	public abstract String getSupportedCountriesString();

	public abstract TermsInfo getTermsInfo(String s, String s1, String s2);

	public abstract void setRootUrl(String s);
}

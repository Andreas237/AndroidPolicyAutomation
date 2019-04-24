// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AnalyticsConst
{
	private static final class CppProxy extends AnalyticsConst
	{

		private native void nativeDestroy(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #37  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field long nativeRef>
		//    8   16:invokespecial   #39  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #46  <Method void Object.finalize()>
		//    4    8:return          
		}

		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AnalyticsConst()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #19  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #21  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #23  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #25  <String "nativeRef is zero">
		//   15   28:invokespecial   #28  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #30  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public AnalyticsConst()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #1516 <Method void Object()>
	//    2    4:return          
	}

	public static final String ABOUT_ROBOT_VIEWED = "about robot viewed";
	public static final String ABOUT_THIS_APP_EULA_VIEWED = "about this app eula viewed";
	public static final String ABOUT_THIS_APP_FOLLOW_BUTTON_PRESSED = "about this app follow button pressed";
	public static final String ABOUT_THIS_APP_VIEWED = "about this app viewed";
	public static final String ACCOUNT_AND_PRIVACY_VIEWED = "account and privacy viewed";
	public static final String ACCOUNT_ERROR = "account error";
	public static final String ACCOUNT_ERROR_ACCOUNT_INFO_REFRESH = "account info refresh failed";
	public static final String ACCOUNT_ERROR_APP_SERVICE_DISCOVERY = "app service discovery failed";
	public static final String ACCOUNT_ERROR_TYPE = "account error type";
	public static final String ACCOUNT_INFO_REQUEST_RESULT = "account info request";
	public static final String ACCOUNT_INFO_REQUEST_SUMMARY = "account info request summary";
	public static final String ACCOUNT_OPTIONS_VIEWED = "account options viewed";
	public static final String ACCOUNT_PROFILE_UPDATED = "account profile updated";
	public static final String ACCOUNT_SERVICE_UNAVAILABLE_DIALOG_VIEWED = "account service unavailable dialog viewed";
	public static final String ACCOUNT_UPDATE_PASSWORD_VIEWED = "account update password viewed";
	public static final String ADDITIONAL_HELP_CONTACT_BUTTON_PRESSED = "additional help contact button pressed";
	public static final String ADDITIONAL_HELP_VIEWED = "additional help viewed";
	public static final String ADD_ROBOT_SELECTION_ALREADY_PROVISIONED = "already provisioned";
	public static final String ADD_ROBOT_SELECTION_BLUETOOTH = "bluetooth";
	public static final String ADD_ROBOT_SELECTION_BRAAVA_JET = "braava jet";
	public static final String ADD_ROBOT_SELECTION_BRAAVA_JET_M = "braava jet m";
	public static final String ADD_ROBOT_SELECTION_ROOMBA = "roomba";
	public static final String ANY_COMMON_QUESTIONS_OPENED = "any common question opened";
	public static final String APP_BACKGROUNDED = "app backgrounded";
	public static final String APP_FEEDBACK_RESPONSE_CANCELLED = "app feedback cancelled";
	public static final String APP_FEEDBACK_RESPONSE_GIVEN = "app feedback response";
	public static final String APP_FOREGROUNDED = "app foregrounded";
	public static final String APP_LANGUAGE_CODE_KEY = "app language code";
	public static final String APP_LAUNCHED = "app launched";
	public static final String APP_LAUNCHED_AFTER_APP_INSTALL = "app launched after app install";
	public static final String APP_LAUNCHED_AFTER_APP_UPGRADE = "app launched after app upgrade";
	public static final String APP_SERVICE_DISCOVERY_AVG_FAILURE_TIME = "app service discovery failure average";
	public static final String APP_SERVICE_DISCOVERY_AVG_SUCCESS_TIME = "app service discovery success average";
	public static final String APP_SERVICE_DISCOVERY_RESULT = "app service discovery";
	public static final String APP_SERVICE_DISCOVERY_SUMMARY = "app service discovery summary";
	public static final String APP_WELCOME_VIEWED = "app welcome viewed";
	public static final String AREA_CLEANED_SQ_FT_KEY = "area cleaned square footage";
	public static final String ASSET_IDS_KEY = "assetIds";
	public static final String ASSET_ID_KEY = "assetId";
	public static final String ASSET_REGISTRATION_WITH_CLOUD_FINISHED = "asset registration with cloud finished";
	public static final String ASSET_SERVICE_DISCOVERY_SUMMARY = "asset service discovery summary";
	public static final String ASSET_SKU_KEY = "sku";
	public static final String ATTEMPT_COUNT = "attempt count";
	public static final String AVERAGE_FAILURE_DURATION = "average failure duration";
	public static final String AVERAGE_PENDING_DURATION = "average pending duration";
	public static final String AVERAGE_SUCCESS_DURATION = "average success duration";
	public static final String BADGED_APP_OPENED = "badged app opened";
	public static final String BETA_PROGRAM_FEEDBACK_MESSAGE = "message";
	public static final String BETA_PROGRAM_FEEDBACK_SUBMITTED = "beta program feedback submitted";
	public static final String BETA_PROGRAM_FEEDBACK_TITLE = "title";
	public static final String BETA_PROGRAM_INTRODUCTION_PAGE_VIEWED = "beta program introduction page viewed";
	public static final String BETA_PROGRAM_I_WANT_IN_BUTTON_PRESSED = "beta program i want in button pressed";
	public static final String BETA_PROGRAM_PAGE_VIEWED = "beta program page viewed";
	public static final String BETA_PROGRAM_THREE_DOTS_BUTTON_PRESSED = "beta program three dots button pressed";
	public static final String BIN_FULL_NOTIFICATION_SETTING_KEY = "bin full notification setting";
	public static final String BLE_DISCOVERY_RESULT_BLE_ROBOT_SELECTED = "bluetooth robot selected";
	public static final String BLE_DISCOVERY_RESULT_I_DONT_SEE_MY_ROBOT = "i dont see my robot";
	public static final String BLE_DISCOVERY_RESULT_TIMEOUT = "discovery timed out";
	public static final String BRAAVA_CLEAN_MISSION_COUNT_KEY = "braava lifetime manual clean mission count";
	public static final String BRAAVA_CLEAN_MISSION_STARTED = "braava clean mission started";
	public static final String BRAAVA_PAD_OPTIONS_CHANGED = "braava pad options changed";
	public static final String BRAAVA_PAD_OPTIONS_VIEWED = "braava pad options viewed";
	public static final String BRAAVA_SPOT_CLEAN_PRESSED = "braava spot clean pressed";
	public static final String BRAAVA_SPOT_CLEAN_VIEWED = "braava spot clean viewed";
	public static final String BRAAVA_STORE_BUTTON_PRESSED = "braava store button pressed";
	public static final String CARE_BIN_VIEWED = "care bin viewed";
	public static final String CARE_CORE_ROBOT_VIEWED = "care core robot viewed";
	public static final String CARE_DEBRIS_EXTRACTORS_VIEWED = "care debris extractors viewed";
	public static final String CARE_RESET_STATUS_BUTTON_PRESSED = "care reset status button pressed";
	public static final String CARE_STEP_BY_STEP_GUIDE_VIEWED = "care step-by-step guide viewed";
	public static final String CARE_TYPE_BIN = "bin";
	public static final String CARE_TYPE_CORE = "core";
	public static final String CARE_TYPE_DEBRIS = "debris";
	public static final String CARE_VIEW = "care viewed";
	public static final String CARPET_BOOST_AUTOMATIC_MODE = "automatic";
	public static final String CARPET_BOOST_ECO_MODE = "eco";
	public static final String CARPET_BOOST_PERFORMANCE_MODE = "performance";
	public static final String CARPET_BOOST_SETTINGS_VIEW = "carpet boost settings viewed";
	public static final String CARPET_BOOST_SETTING_CHANGED = "carpet boost setting changed";
	public static final String CHANGED = "changed";
	public static final String CLEANING_ERROR_NOTIFICATION_SETTING_KEY = "cleaning error notification setting";
	public static final String CLEANING_JOBS_COUNT_KEY = "number of cleaning jobs";
	public static final String CLEANING_PASSES_AUTOMATIC = "automatic";
	public static final String CLEANING_PASSES_ONE_PASS = "one";
	public static final String CLEANING_PASSES_SETTINGS_VIEW = "cleaning passes settings viewed";
	public static final String CLEANING_PASSES_SETTING_CHANGED = "cleaning passes setting changed";
	public static final String CLEANING_PASSES_TWO_PASS = "two";
	public static final String CLEANING_PREFERENCES_DEFAULTS_RESTORED = "cleaning preferences defaults restored";
	public static final String CLEANING_PREFERENCES_VIEW = "cleaning preferences viewed";
	public static final String CLEANING_PRESET_CUSTOM_MODE = "custom";
	public static final String CLEANING_PRESET_DETAIL_MODE = "detail";
	public static final String CLEANING_PRESET_QUIET_MODE = "quiet";
	public static final String CLEANING_PRESET_SETTING_CHANGED = "cleaning preset setting changed";
	public static final String CLEAN_MAP_ENABLED_SETTING_CHANGED = "clean map enabled setting changed";
	public static final String CLEAN_MAP_INTERACTION = "clean map interaction session";
	public static final String CLEAN_SCHEDULE_TWO_ADD_PRESSED = "clean schedule 2 new schedule pressed";
	public static final String CLEAN_SCHEDULE_TWO_CLEANING_PRESET_VIEWED = "clean schedule 2 cleaning preset viewed";
	public static final String CLEAN_SCHEDULE_TWO_CREATE_SCREEN_VIEWED = "clean schedule 2 create screen viewed";
	public static final String CLEAN_SCHEDULE_TWO_DAYS = "days";
	public static final String CLEAN_SCHEDULE_TWO_EXISTING_SCHEDULE_DELETED = "clean schedule 2 schedule delete attempt";
	public static final String CLEAN_SCHEDULE_TWO_EXISTING_SCHEDULE_EDITED = "clean schedule 2 schedule edit attempt";
	public static final String CLEAN_SCHEDULE_TWO_EXISTING_SCHEDULE_ENABLED = "clean schedule 2 toggled";
	public static final String CLEAN_SCHEDULE_TWO_EXISTING_SCHEDULE_TOGGLED = "clean schedule 2 schedule toggle attempt";
	public static final String CLEAN_SCHEDULE_TWO_EXISTING_SCHEDULE_VIEWED = "clean schedule 2 existing schedule viewed";
	public static final String CLEAN_SCHEDULE_TWO_LOCATION_TYPE = "location type";
	public static final String CLEAN_SCHEDULE_TWO_MISSION_PARAMETERS = "mission parameters";
	public static final String CLEAN_SCHEDULE_TWO_NEW_SCHEDULE_CLEAN_ALL = "clean all";
	public static final String CLEAN_SCHEDULE_TWO_NEW_SCHEDULE_CLEAN_BY_ROOM = "clean by room";
	public static final String CLEAN_SCHEDULE_TWO_NEW_SCHEDULE_CREATED = "clean schedule 2 new schedule creation attempt";
	public static final String CLEAN_SCHEDULE_TWO_NEW_SCHEDULE_ONCE = "once";
	public static final String CLEAN_SCHEDULE_TWO_NEW_SCHEDULE_TYPE = "schedule type";
	public static final String CLEAN_SCHEDULE_TWO_NEW_SCHEDULE_WEEKLY = "weekly";
	public static final String CLEAN_SCHEDULE_TWO_NUMBER_OF_DELETED_SCHEDULES = "number of schedules deleted";
	public static final String CLEAN_SCHEDULE_TWO_POPULAR_PRESSED = "clean schedule 2 most popular pressed";
	public static final String CLEAN_SCHEDULE_TWO_P_M_A_P_S_CHANGE_LAYOUT_PROMPT_VIEWED = "clean schedule 2 pmaps Map Change affects schedules prompt viewed";
	public static final String CLEAN_SCHEDULE_TWO_SCHEDULES_DELETED_FROM_P_M_A_P_S_CHANGE = "clean schedule 2 pmaps Map Change deleted schedules";
	public static final String CLEAN_SCHEDULE_TWO_SCHEDULE_LIMIT_VIEWED = "clean schedule 2 schedule limit prompt viewed";
	public static final String CLEAN_SCHEDULE_TWO_SCHEDULE_TIME = "clean schedule 2 time";
	public static final String CLEAN_SCHEDULE_TWO_TIMEOUT_ERROR = "clean schedule 2 timeout occured";
	public static final String CLEAN_SCHEDULE_TWO_UPDATE_FINISHED = "clean schedule 2 update time";
	public static final String CLEAN_SCHEDULE_TWO_WELCOME_VIEWED = "clean schedule 2 welcome viewed";
	public static final String CLEAN_SCREEN_ERROR_INDICATOR_PRESSED = "clean screen error indicator pressed";
	public static final String CLOUD_BUTTON_PRESSED = "cloud button pressed";
	public static final String COMMAND_TIMED_OUT = "command timed out";
	public static final String COMMAND_TYPE = "command type";
	public static final String COMMON_QUESTIONS_VIEWED = "help common questions viewed";
	public static final String COMPLETION_STATUS_KEY = "completion status";
	public static final String CONNECTED = "connected";
	public static final String CONNECTED_HOME_VIEWED = "connected home viewed";
	public static final String CONNECTING = "connecting";
	public static final String CONTACT_TYPE_CALL = "call";
	public static final String CONTACT_TYPE_EMAIL = "email";
	public static final String CONTACT_TYPE_ONLINE = "online";
	public static final String COUNTRY_PICKER_VIEWED = "country picker viewed";
	public static final String CREATE_ACCOUNT_FROM_SIDE_MENU_VIEWED = "create account from side menu viewed";
	public static final String CREATE_ACCOUNT_VIEWED = "create account viewed";
	public static final String DIRT_DETECT_COUNT = "dirt detect count";
	public static final String DISCONNECTED = "disconnected";
	public static final String EDGE_CLEAN_SETTING_CHANGED = "edge clean setting changed";
	public static final String EMPTY = "empty";
	public static final String ENJOYING_APP = "enjoying app";
	public static final String ENJOYING_APP_NOT_NOW = "not now";
	public static final String ENJOYING_APP_PROMPT_RESPONSE_GIVEN = "enjoying app response";
	public static final String ERROR_CODE = "error code";
	public static final String ERROR_DEFAULT = "robot connection";
	public static final String ERROR_DETAILS = "error details";
	public static final String ERROR_MESSAGE = "error message";
	public static final String ERROR_PROV_CONFIGURATION = "unexpected provisioning configuration";
	public static final String EVACUATION_DOCK_ABOUT_DOCK_VIEWED = "evacuation dock about the dock page viewed";
	public static final String EVACUATION_DOCK_BAG_MISSING_HELP_CONTENT_VIEWED = "evacuation dock bag missing help content viewed";
	public static final String EVACUATION_DOCK_EMPTY_BIN_BUTTON_PRESSED = "evacuation dock empty bin button pressed";
	public static final String EVACUATION_DOCK_ERROR_HELP_CONTENT_VIEWED = "evacuation dock help content viewed";
	public static final String EXPEDITED_OTA_REQUESTED = "expedited ota requested";
	public static final String EXPEDITED_OTA_VIEWED = "expedited ota viewed";
	public static final String FAILURE_COUNT = "failure count";
	public static final String FEEDBACK_RESPONSE = "response";
	public static final String FINISHED_LOADING = "finished loading";
	public static final String FINISH_WHEN_BIN_FULL_SETTING_CHANGED = "finish cleaning when bin full setting changed";
	public static final String FIRMWARE_VERSIONS_KEY = "firmware versions";
	public static final String FIRST_LAUNCHED_DATE = "first launched date";
	public static final String FRIDAY = "friday";
	public static final String FROM_PUSH_KEY = "from push notification";
	public static final String HEART_BEAT_MISSED = "heart beat missed";
	public static final String HELP_DOCUMENT_TYPE_OWNERS_GUIDE = "owners guide";
	public static final String HELP_DOCUMENT_TYPE_QUICK_START_GUIDE = "quick start guide";
	public static final String HELP_DOCUMENT_TYPE_WARRANTY = "warranty";
	public static final String HELP_DOCUMENT_VIEWED = "help document viewed";
	public static final String HELP_VIDEO_TYPE_MAINTAINING_ROOMBA = "maintaining roomba";
	public static final String HELP_VIDEO_TYPE_OPTIMIZING_ROOMBA = "optimizing roomba";
	public static final String HELP_VIDEO_TYPE_WELCOME = "welcome";
	public static final String HELP_VIDEO_WATCHED = "help video watched";
	public static final String HELP_VIEW = "help viewed";
	public static final String HISTORY_DETAIL_ERROR_INDICATOR_PRESSED = "history detail screen error indicator pressed";
	public static final String HISTORY_DETAIL_VIEW = "history detail view";
	public static final String HISTORY_MISSION_MAP_RATED = "history mission map rated";
	public static final String HISTORY_PROVIDE_FEEDBACK_BUTTON_PRESSED = "history provide feedback button pressed";
	public static final String HISTORY_SUMMARY_TAB_CHANGED = "history summary tab changed";
	public static final String HISTORY_SUMMARY_VIEW = "history summary view";
	public static final String HTTP_REQUESTOR_AVG_FAILURE_TIME = "http requestor failure average";
	public static final String HTTP_REQUESTOR_AVG_SUCCESS_TIME = "http requestor success average";
	public static final String IS_ENJOYING_APP = "yes";
	public static final String LATEST_APP_VERSION = "latest app version";
	public static final String LEAVE_BETA_PROGRAM_CONFIRMATION_BUTTON_PRESSED = "leave beta program confirmation button pressed";
	public static final String LEGACY_USER_KEY = "legacy user for 1.10 version";
	public static final String LEVEL = "level";
	public static final String LIFETIME_HISTORY_INFO_BUTTON_PRESSED = "lifetime history info button pressed";
	public static final String LOCAL_CONNECTION_STATE = "local connection state";
	public static final String LOCAL_CONNECT_AVG_FAILURE_TIME = "local connect failure average";
	public static final String LOCAL_CONNECT_AVG_SUCCESS_TIME = "local connect success average";
	public static final String LOCAL_OTA_FIRMWARE_UPDATE_FINISHED = "local OTA firmware update finished";
	public static final String LOCAL_SSL_HANDSHAKE_AVG_FAILURE_TIME = "local ssl handshake failure average";
	public static final String LOCAL_SSL_HANDSHAKE_AVG_SUCCESS_TIME = "local ssl handshake success average";
	public static final String LOCATE_ROOMBA_BUTTON_PRESSED = "locate roomba button pressed";
	public static final String LOGIN_VIEWED = "login viewed";
	public static final String MANAGE_ACCOUNT_VIEWED = "manage account viewed";
	public static final String MAP_AVAILABLE_KEY = "map available";
	public static final String MISSION_COMPLETE_STATUS_BUSY = "busy";
	public static final String MISSION_COMPLETE_STATUS_CANCELED = "canceled";
	public static final String MISSION_COMPLETE_STATUS_CLOCK_ERROR = "clock error";
	public static final String MISSION_COMPLETE_STATUS_COMPLETED = "completed";
	public static final String MISSION_COMPLETE_STATUS_FULL = "full";
	public static final String MISSION_COMPLETE_STATUS_LOW_BATTERY = "low battery";
	public static final String MISSION_COMPLETE_STATUS_STUCK = "stuck";
	public static final String MISSION_COMPLETE_STATUS_UNKNOWN = "unknown";
	public static final String MISSION_HISTORY_DETAIL_BOTTOM_SHEET_VIEWED = "mission history detail bottom sheet view";
	public static final String MISSION_ID_KEY = "mission id";
	public static final String MISSION_MAP_ID_KEY = "mission map id";
	public static final String MISSION_MAP_RATING_KEY = "mission map rating";
	public static final String MISSION_STATUS_NOTIFICATION_SETTING_KEY = "mission status notification setting";
	public static final String MONDAY = "monday";
	public static final String MORE_VIEW = "more viewed";
	public static final int NETWORKING_SUMMARY_ID_INVALID = -1;
	public static final String NETWORK_ERROR = "error";
	public static final String NETWORK_INVALID = "invalid";
	public static final String NEW_APP_VERSION_AVAILABLE_SKIP_CLICKED = "new app version available skip clicked";
	public static final String NEW_APP_VERSION_AVAILABLE_UPDATE_CLICKED = "new app version available update clicked";
	public static final String NEW_APP_VERSION_AVAILABLE_VIEWED = "new app version available viewed";
	public static final String NEW_USER = "new user";
	public static final String NOTIFICATION_BACK_SELECTED = "notification back selected";
	public static final String NOTIFICATION_BACK_SMART_SCHEDULE_SELECTED = "notification smart schedule back selected";
	public static final String NOTIFICATION_CENTER_BELL_ICON_PRESSED = "notification center bell icon pressed";
	public static final String NOTIFICATION_CENTER_NOTIFICATION_DETAILS_CONTENT_ID = "notification center notification details content id";
	public static final String NOTIFICATION_CENTER_NOTIFICATION_DETAILS_CONTENT_VERSION = "notification center notification details content version";
	public static final String NOTIFICATION_CENTER_NOTIFICATION_EVENT_ID = "notification center notification event id";
	public static final String NOTIFICATION_CENTER_NUMBER_OF_NOTIFICATION = "noticiation center number of notifications";
	public static final String NOTIFICATION_CENTER_SMART_SCHEDULES_COUNT = "notification center smart schedules count";
	public static final String NOTIFICATION_CENTER_SMART_SCHEDULE_ACCEPTED = "notification center smart schedule accepted";
	public static final String NOTIFICATION_CENTER_SMART_SCHEDULE_DECLINED = "notification center smart schedule declined";
	public static final String NOTIFICATION_CENTER_SMART_SCHEDULE_MESSAGE_CLICKED = "notification center smart schedule message clicked";
	public static final String NOTIFICATION_CENTER_SMART_SCHEDULE_VERSION = "notification center smart schedule verion";
	public static final String NOTIFICATION_CENTER_VIDEO_VIEWED = "notification center video viewed";
	public static final String NOTIFICATION_CENTER_VIEWED = "notification center viewed";
	public static final String NOTIFICATION_CENTER_WAS_BELL_BADGED = "notification center was bell badged";
	public static final String NOTIFICATION_CENTER_WAS_POSITIVE_FEEDBACK = "notification center was positive feedback";
	public static final String NOTIFICATION_FEEDBACK = "notification feedback";
	public static final String NOTIFICATION_SELECTED = "notification selected";
	public static final String NOTIFICATION_SETTINGS_CHANGED = "notification settings changed";
	public static final String NOTIFICATION_SETTINGS_VIEWED = "notification settings viewed";
	public static final String NOT_ENJOYING_APP = "no";
	public static final String ONBOARDING_BEGAN = "onboarding began";
	public static final String ON_DEMAND_OTA_AVAILABLE_HELP_BUTTON_PRESSED = "on-demand ota available help button pressed";
	public static final String ON_DEMAND_OTA_AVAILABLE_VIEWED = "on-demand ota available viewed";
	public static final String ON_DEMAND_OTA_FAILED_HELP_BUTTON_PRESSED = "on-demand ota failed help button pressed";
	public static final String ON_DEMAND_OTA_FAILED_TRY_AGAIN_BUTTON_PRESSED = "on-demand ota failed try again button pressed";
	public static final String ON_DEMAND_OTA_FAILED_UPDATE_LATER_BUTTON_PRESSED = "on-demand ota failed update later button pressed";
	public static final String ON_DEMAND_OTA_FAILED_VIEWED = "on-demand ota failed viewed";
	public static final String ON_DEMAND_OTA_FIRMWARE_UPDATE_AVAILABLE_FINISHED = "on-demand OTA firmware update available";
	public static final String ON_DEMAND_OTA_FIRMWARE_UPDATE_ERROR = "on-demand OTA firmware update error";
	public static final String ON_DEMAND_OTA_FIRMWARE_UPDATE_INSTALLING_FINISHED = "on-demand OTA firmware update installing";
	public static final String ON_DEMAND_OTA_FIRMWARE_UPDATE_LOADING_FINISHED = "on-demand OTA firmware update loading";
	public static final String ON_DEMAND_OTA_FIRMWARE_UPDATE_READY_FINISHED = "on-demand OTA firmware update ready";
	public static final String ON_DEMAND_OTA_FIRMWARE_UPDATE_SUCCESS_FINISHED = "on-demand OTA firmware update success";
	public static final String ON_DEMAND_OTA_IN_PROGRESS_HELP_BUTTON_PRESSED = "on-demand ota in progress help button pressed";
	public static final String ON_DEMAND_OTA_IN_PROGRESS_VIEWED = "on-demand ota in progress viewed";
	public static final String ON_DEMAND_OTA_PATH = "on-demand ota path";
	public static final String ON_DEMAND_OTA_PATH_PROVISIONING = "provisioning";
	public static final String ON_DEMAND_OTA_PATH_SETTINGS = "settings";
	public static final String ON_DEMAND_OTA_SETUP_COMPLETE_VIEWED = "on-demand ota setup complete viewed";
	public static final String ON_DEMAND_OTA_SUCCEEDED_VIEWED = "on-demand ota succeeded viewed";
	public static final String ON_DEMAND_OTA_UPDATE_LATER_BUTTON_PRESSED = "on-demand ota update later button pressed";
	public static final String ON_DEMAND_OTA_UPDATE_NOW_BUTTON_PRESSED = "on-demand ota update now button pressed";
	public static final String PAD_TYPE = "pad type";
	public static final String PAD_TYPE_ALL = "all";
	public static final String PAD_TYPE_DAMP = "damp";
	public static final String PAD_TYPE_DRY = "dry";
	public static final String PAD_TYPE_INVALID = "invalid";
	public static final String PAD_TYPE_NONE = "none";
	public static final String PAD_TYPE_REUSABLE_DAMP = "reusable damp";
	public static final String PAD_TYPE_REUSABLE_DRY = "reusable dry";
	public static final String PAD_TYPE_REUSABLE_WET = "reusable wet";
	public static final String PAD_TYPE_WET = "wet";
	public static final String PANNED_KEY = "panned";
	public static final String PENDING_COUNT = "pending count";
	public static final String PRIVACY_VIEWED = "privacy viewed";
	public static final String PROVISIONING_STEP_ACTIVATE_ROOMBA = "activate roomba";
	public static final String PROVISIONING_STEP_ADD_ROBOT = "add robot";
	public static final String PROVISIONING_STEP_ADVANCED_WIFI_SETTINGS = "advanced wifi settings";
	public static final String PROVISIONING_STEP_BLE_DISCOVERY = "ble discovery";
	public static final String PROVISIONING_STEP_CONNECT_TO_ROOMBA = "connect to roomba";
	public static final String PROVISIONING_STEP_CURRENT_NETWORK = "current network";
	public static final String PROVISIONING_STEP_DOCK_PLACEMENT = "dock placement";
	public static final String PROVISIONING_STEP_ENABLE_BLUETOOTH = "enable bluetooth";
	public static final String PROVISIONING_STEP_ERROR = "provisioning error";
	public static final String PROVISIONING_STEP_PROVISIONING = "provisioning";
	public static final String PROVISIONING_STEP_ROBOT_NAME = "robot name";
	public static final String PROVISIONING_STEP_SETUP_CHECKLIST = "setup checklist";
	public static final String PROVISIONING_STEP_WIFI_PASSWORD = "wifi password";
	public static final String PROVISIONING_TYPE_BLE = "ble";
	public static final String PROVISIONING_TYPE_V1 = "v1";
	public static final String PROVISIONING_TYPE_V2 = "v2";
	public static final String PROVISIONING_TYPE_V3 = "v3";
	public static final String PROV_ACTIVATE_ROOMBA_CONFIRMATION = "provisioning activate roomba confirmation";
	public static final String PROV_ACTIVATE_ROOMBA_CONTINUE_BUTTON_PRESSED = "provisioning activate roomba continue button pressed";
	public static final String PROV_ACTIVATE_ROOMBA_VIEWED = "provisioning activate roomba viewed";
	public static final String PROV_ADD_ROBOT_SELECTED = "provisioning add a robot selected";
	public static final String PROV_ADD_ROBOT_VIEWED = "provisioning add a robot viewed";
	public static final String PROV_ADVANCED_WIFI_SETTINGS_VIEWED = "provisioning advanced wifi settings viewed";
	public static final String PROV_BLE_DISCOVERY_RESULT = "provisioning ble discovery result";
	public static final String PROV_BLE_DISCOVERY_VIEWED = "provisioning ble discovery viewed";
	public static final String PROV_CANCEL_BUTTON_PRESSED = "provisioning cancel button pressed";
	public static final String PROV_CONNECT_TO_ROOMBA_VIEWED = "provisioning connect to roomba viewed";
	public static final String PROV_CURRENT_NETWORK_CHANGE_BUTTON_PRESSED = "provisioning current network change button pressed";
	public static final String PROV_CURRENT_NETWORK_VIEWED = "provisioning current network viewed";
	public static final String PROV_ENABLE_BLUETOOTH_ERROR_VIEWED = "provisioning enable bluetooth error viewed";
	public static final String PROV_ERROR = "provisioning error";
	public static final String PROV_ERROR_VIEWED = "provisioning error viewed";
	public static final String PROV_FINISHED = "provisioning finished";
	public static final String PROV_HOME_BASE_PLACEMENT_VIEWED = "provisioning home base placement viewed";
	public static final String PROV_INFO_BUTTON_PRESSED = "provisioning info button pressed";
	public static final String PROV_ROBOT_NAME_DONE = "provisioning robot name done";
	public static final String PROV_ROBOT_NAME_VIEWED = "provisioning robot name viewed";
	public static final String PROV_SETUP_CHECKLIST_VIEWED = "provisioning setup checklist viewed";
	public static final String PROV_STARTED = "provisioning started";
	public static final String PROV_STATUS_ACTIVATING_WIFI = "activating wifi";
	public static final String PROV_STATUS_CHECKING_CONFIG = "checking config";
	public static final String PROV_STATUS_CONNECTED = "connected";
	public static final String PROV_STATUS_SENDING_CONFIG = "sending config";
	public static final String PROV_STATUS_VERIFYING_CONNECTION = "verifying connection on home network";
	public static final String PROV_VIEWED = "provisioning viewed";
	public static final String PROV_WIFI_PASSWORD_DONE = "provisioning wifi password done";
	public static final String PROV_WIFI_PASSWORD_VIEWED = "provisioning wifi password viewed";
	public static final String P_MAPS_CHOOSE_ROOMS_BUTTON_PRESSED = "pmaps choose rooms button pressed";
	public static final String P_MAPS_CHOOSE_ROOMS_VIEWED = "pmaps choose rooms viewed";
	public static final String P_MAPS_CLEAN_BUTTON_INTRO1_CANCEL_BUTTON_PRESSED = "pmaps clean button intro 1 cancel button pressed";
	public static final String P_MAPS_CLEAN_BUTTON_INTRO1_NEXT_BUTTON_PRESSED = "pmaps clean button intro 1 next button pressed";
	public static final String P_MAPS_CLEAN_BUTTON_INTRO1_VIEWED = "pmaps clean button intro 1 viewed";
	public static final String P_MAPS_CLEAN_BUTTON_INTRO2_CANCEL_BUTTON_PRESSED = "pmaps clean button intro 2 cancel button pressed";
	public static final String P_MAPS_CLEAN_BUTTON_INTRO2_COMPLETE_BUTTON_PRESSED = "pmaps clean button intro 2 complete button pressed";
	public static final String P_MAPS_CLEAN_BUTTON_INTRO2_VIEWED = "pmaps clean button intro 2 viewed";
	public static final String P_MAPS_CUSTOMIZE_COMPLETE_CLEAN_BUTTON_PRESSED = "pmaps customize complete clean button pressed";
	public static final String P_MAPS_CUSTOMIZE_COMPLETE_SCHEDULE_BUTTON_PRESSED = "pmaps customize compelte schedule button pressed";
	public static final String P_MAPS_CUSTOMIZE_COMPLETE_VIEWED = "pmaps customize complete viewed";
	public static final String P_MAPS_CUSTOMIZE_LABEL_ROOMS_CANCEL_BUTTON_PRESSED = "pmaps customize setup rooms cancel pressed";
	public static final String P_MAPS_CUSTOMIZE_LABEL_ROOMS_DONE_BUTTON_PRESSED = "pmaps customize setup rooms done pressed";
	public static final String P_MAPS_CUSTOMIZE_LABEL_ROOMS_VIEWED = "pmaps customize label rooms viewed";
	public static final String P_MAPS_CUSTOMIZE_NAME_MAP_CANCEL_BUTTON_PRESSED = "pmaps customize name map cancel button pressed";
	public static final String P_MAPS_CUSTOMIZE_NAME_MAP_NEXT_BUTTON_PRESSED = "pmaps customize name map next button pressed";
	public static final String P_MAPS_CUSTOMIZE_NAME_MAP_VIEWED = "pmaps customize name map viewed";
	public static final String P_MAPS_CUSTOMIZE_SETTING_UP_INSTRUCTIONS_VIEWED = "pmaps customize setting up instructions viewed";
	public static final String P_MAPS_CUSTOMIZE_SETUP_ROOMS_CANCEL_BUTTON_PRESSED = "pmaps customize setup rooms cancel pressed";
	public static final String P_MAPS_CUSTOMIZE_SETUP_ROOMS_NEXT_BUTTON_PRESSED = "pmaps customize setup rooms next pressed";
	public static final String P_MAPS_CUSTOMIZE_SETUP_ROOMS_VIEWED = "pmaps customize setup rooms viewed";
	public static final String P_MAPS_DIRECTED_ROOM_CLEAN_COUNT_KEY = "directed room clean count";
	public static final String P_MAPS_DIRECTED_ROOM_CLEAN_STARTED = "directed room clean started";
	public static final String P_MAPS_ERROR_EMPTY_MAP = "pmaps error empty map";
	public static final String P_MAPS_ERROR_REGION_DUPLICATE_POINTS = "pmaps error region has duplicate points";
	public static final String P_MAPS_ERROR_ROOM_TOO_SMALL = "pmaps error room to small";
	public static final String P_MAPS_ERROR_SAVE_FLOOR_NAME_TIMED_OUT = "pmaps error save floor name timed out";
	public static final String P_MAPS_ERROR_SAVE_TIMED_OUT = "pmaps error save timed out";
	public static final String P_MAPS_ERROR_SEGMENTATION_TRANSFER_FAILED = "pmaps error segmentation transfer failed";
	public static final String P_MAPS_ERROR_SPLIT_INVALID_MAP = "pmaps error split failed invalid map";
	public static final String P_MAPS_SECTION_INTRO1_CANCEL_BUTTON_PRESSED = "pmaps section intro cancel 1 button pressed";
	public static final String P_MAPS_SECTION_INTRO1_NEXT_BUTTON_PRESSED = "pmaps section intro next 1 button pressed";
	public static final String P_MAPS_SECTION_INTRO1_VIEWED = "pmaps section intro 1 viewed";
	public static final String P_MAPS_SECTION_INTRO2_CANCEL_BUTTON_PRESSED = "pmaps section intro cancel 2 button pressed";
	public static final String P_MAPS_SECTION_INTRO2_NEXT_BUTTON_PRESSED = "pmaps section intro next 2 button pressed";
	public static final String P_MAPS_SECTION_INTRO2_VIEWED = "pmaps section intro 2 viewed";
	public static final String P_MAPS_SECTION_INTRO3_ACTIVATE_BUTTON_PRESSED = "pmaps section intro activate 3 button pressed";
	public static final String P_MAPS_SECTION_INTRO3_CANCEL_BUTTON_PRESSED = "pmaps section intro cancel 3 button pressed";
	public static final String P_MAPS_SECTION_INTRO3_VIEWED = "pmaps section intro 3 viewed";
	public static final String P_MAPS_SECTION_INTRO4_ADD_TRAINING_RUN_BUTTON_PRESSED = "pmaps section intro add training run 4 button pressed";
	public static final String P_MAPS_SECTION_INTRO4_CANCEL_BUTTON_PRESSED = "pmaps section intro cancel 4 button pressed";
	public static final String P_MAPS_SECTION_INTRO4_MAYBE_LATER_BUTTON_PRESSED = "pmaps section intro maybe later 4 button pressed";
	public static final String P_MAPS_SECTION_INTRO4_VIEWED = "pmaps section intro 4 viewed";
	public static final String P_MAPS_SECTION_INTRO5_CANCEL_BUTTON_PRESSED = "pmaps section intro cancel 5 button pressed";
	public static final String P_MAPS_SECTION_INTRO5_START_TRAINING_RUN_BUTTON_PRESSED = "pmaps section intro start training run 5 button pressed";
	public static final String P_MAPS_SECTION_INTRO5_VIEWED = "pmaps section intro 5 viewed";
	public static final String P_MAPS_SECTION_INTRO_COMPLETE_CANCEL_BUTTON_PRESSED = "pmaps section intro complete cancel button pressed";
	public static final String P_MAPS_SECTION_INTRO_COMPLETE_TIPS_BUTTON_PRESSED = "pmaps section intro complete tips button pressed";
	public static final String P_MAPS_SECTION_INTRO_COMPLETE_VIEWED = "pmaps section intro complete viewed";
	public static final String P_MAPS_SECTION_MAP_LIST_CLEAN_BUTTON_PRESSED = "pmaps section map list clean button pressed";
	public static final String P_MAPS_SECTION_MAP_LIST_TRAIN_BUTTON_PRESSED = "pmaps section map list train button pressed";
	public static final String P_MAPS_SECTION_MAP_LIST_VIEWED = "pmaps section map list viewed";
	public static final String P_MAPS_SECTION_MAP_PREVIEW_NOT_RIGHT_BUTTON_PRESSED = "pmaps section map preview not right button pressed";
	public static final String P_MAPS_SECTION_MAP_PREVIEW_VIEWED = "pmaps section map preview viewed";
	public static final String P_MAPS_SECTION_MAP_READY_CUSTOMIZE_BUTTON_PRESSED = "pmaps section map ready customized button pressed";
	public static final String P_MAPS_SECTION_MAP_READY_NOT_RIGHT_BUTTON_PRESSED = "pmaps section map ready not right button pressed";
	public static final String P_MAPS_SECTION_MAP_READY_VIEWED = "pmaps section map ready viewed";
	public static final String P_MAPS_SECTION_NO_MAP_VIEWED = "pmaps section no map viewed";
	public static final String P_MAPS_SMART_MAPS_BUTTON_PRESSED = "pmaps smart maps button pressed";
	public static final String P_MAPS_TIPS1_CANCEL_BUTTON_PRESSED = "pmaps tips 1 cancel button pressed";
	public static final String P_MAPS_TIPS1_NEXT_BUTTON_PRESSED = "pmaps tips 1 next button pressed";
	public static final String P_MAPS_TIPS1_VIEWED = "pmaps tips 1 viewed";
	public static final String P_MAPS_TIPS2_CANCEL_BUTTON_PRESSED = "pmaps tips 2 cancel button pressed";
	public static final String P_MAPS_TIPS2_NEXT_BUTTON_PRESSED = "pmaps tips 2 next button pressed";
	public static final String P_MAPS_TIPS2_VIEWED = "pmaps tips 2 viewed";
	public static final String P_MAPS_TIPS3_CANCEL_BUTTON_PRESSED = "pmaps tips 3 cancel button pressed";
	public static final String P_MAPS_TIPS3_COMPLETE_BUTTON_PRESSED = "pmaps tips 3 complete button pressed";
	public static final String P_MAPS_TIPS3_VIEWED = "pmaps tips 3 viewed";
	public static final String P_MAPS_TRAINING_RUN_COUNT_KEY = "training run count";
	public static final String P_MAPS_TRAINING_RUN_PREPARATION_VIEWED = "pmaps training run preparation viewed";
	public static final String P_MAPS_TRAINING_RUN_STARTED = "training run started";
	public static final String P_MAP_CUSTOMIZE_INTRO_VIEWED = "pmaps customize intro viewed";
	public static final String P_MAP_ID_KEY = "pmap_id";
	public static final String P_MAP_TROUBLESHOOTING_INCOMPLETE_CLEAN_BUTTON_PRESSED = "pmap troubleshooting incomplete clean button pressed";
	public static final String P_MAP_TROUBLESHOOTING_INCOMPLETE_TRAIN_BUTTON_PRESSED = "pmap troubleshooting incomplete train button pressed";
	public static final String P_MAP_TROUBLESHOOTING_INCOMPLETE_VIEWED = "pmap troubleshooting incomplete viewed";
	public static final String P_MAP_TROUBLESHOOTING_LIST_VIEWED = "pmap troubleshooting list viewed";
	public static final String P_MAP_TROUBLESHOOTING_UNDERSTANDING_VIEWED = "pmap troubleshooting understanding viewed";
	public static final String P_MAP_TROUBLESHOOTING_WRONG_DELETE_BUTTON_PRESSED = "pmap troubleshooting wrong delete button pressed";
	public static final String P_MAP_TROUBLESHOOTING_WRONG_VIEWED = "pmap troubleshooting wrong viewed";
	public static final String P_MAP_VERSION_KEY = "pmap_version";
	public static final String RATING_DISSATISFIED = "dissatisfied";
	public static final String RATING_NEUTRAL = "neutral";
	public static final String RATING_SATISFIED = "satisfied";
	public static final String RATING_VERY_DISSATISFIED = "very dissatisfied";
	public static final String RATING_VERY_SATISFIED = "very satisfied";
	public static final String REDUCED_POWER_STANDBY_MODE_VIEWED = "reduced power standby mode viewed";
	public static final String REMOTE_CONNECTION_STATE = "remote connection state";
	public static final String REMOVE_ROBOT_VIEWED = "remove robot viewed";
	public static final String RESET_ROBOT_VIEWED = "reset robot viewed";
	public static final String RESULT = "result";
	public static final String RE_ACTIVATE_APP_OVERVIEW_PRESSED = "re-activate app overview pressed";
	public static final String RE_ADD_ROBOT_PRESSED = "re-add the robot pressed";
	public static final String ROBOT_ADDED = "robot added";
	public static final String ROBOT_COUNT_KEY = "robot count";
	public static final String ROBOT_HEALED_MESSAGE = "dup BLID Bug fixed message shown";
	public static final String ROBOT_REMOVED = "robot removed";
	public static final String ROBOT_SERVICE_DISCOVERY_AVG_FAILURE_TIME = "robot service discovery failure average";
	public static final String ROBOT_SERVICE_DISCOVERY_AVG_SUCCESS_TIME = "robot service discovery success average";
	public static final String ROBOT_SKUS_KEY = "robot skus";
	public static final String ROBOT_SOFTWARE_UPDATE_NOTIFICATION_SETTING_KEY = "robot software update notification setting";
	public static final String ROBOT_SOFTWARE_VERSION_KEY = "robot software version";
	public static final String ROOMBA_CLEAN_MISSION_COUNT_KEY = "lifetime manual clean mission count";
	public static final String ROOMBA_CLEAN_MISSION_STARTED = "clean mission started";
	public static final String ROOMBA_PROVISIONING_ERROR_KEY = "error";
	public static final String ROOMBA_PROVISIONING_FINISHED = "roomba provisioning finished";
	public static final String ROOMBA_PROVISIONING_RESULT_KEY = "result";
	public static final String ROOMBA_SETUP_ACTIVATE_ROOMBA = "roomba setup activate roomba viewed";
	public static final String ROOMBA_SETUP_ADVANCED_WIFI_INFO = "roomba setup advanced wifi info viewed";
	public static final String ROOMBA_SETUP_CHECKLIST = "roomba setup checklist viewed";
	public static final String ROOMBA_SETUP_CONNECT_TO_ROOMBA = "roomba setup connect to roomba viewed";
	public static final String ROOMBA_SETUP_CUSTOMER_REGISTRATION = "roomba setup customer registration viewed";
	public static final String ROOMBA_SETUP_DOCK_PLACEMENT = "roomba setup dock placement viewed";
	public static final String ROOMBA_SETUP_FINISHED = "roomba setup finished";
	public static final String ROOMBA_SETUP_PROVISIONING_ERROR_VIEWED = "roomba provisioning error viewed";
	public static final String ROOMBA_SETUP_PROVISIONING_VIEWED = "roomba setup provisioning viewed";
	public static final String ROOMBA_SETUP_WIFI_INFO = "roomba setup wifi info viewed";
	public static final String ROOMBA_V1_PROVISIONING_ERROR = "roomba provisioning v1 error";
	public static final String ROOMBA_V2_PROVISIONING_ERROR = "roomba provisioning v2 error";
	public static final String ROOMBA_WELCOME_VIDEO_VIEWED = "roomba welcome video viewed";
	public static final String ROTATED_KEY = "rotated";
	public static final String SAME_DATE_MISSION_VIEWED = "same date mission viewed";
	public static final String SATURDAY = "saturday";
	public static final String SCHEDULE_CHANGED = "schedule changed";
	public static final String SCHEDULE_CYCLE_CLEAN = "clean";
	public static final String SCHEDULE_CYCLE_KEY = "cycle";
	public static final String SCHEDULE_CYCLE_NONE = "none";
	public static final String SCHEDULE_CYCLE_QUICK = "quick";
	public static final String SCHEDULE_CYCLE_START = "start";
	public static final String SCHEDULE_DAY_KEY = "day";
	public static final String SCHEDULE_ENABLED_KEY = "enabled";
	public static final String SCHEDULE_TIME_KEY = "time";
	public static final String SCHEDULE_VIEWED = "schedule viewed";
	public static final String SELECTION = "selection";
	public static final String SETTINGS_VIEW = "settings viewed";
	public static final String SETTING_ENABLED_KEY = "enabled";
	public static final String SETTING_KEY = "setting";
	public static final String SETUP_PAGE_VIEW_INDEX_KEY = "page index";
	public static final String SIDE_MENU_VIEW = "side menu viewed";
	public static final String STATUS_CODE = "status code";
	public static final String STEP = "step";
	public static final String STORE_VIEWED = "iRobot store viewed";
	public static final String SUCCESS_COUNT = "success count";
	public static final String SUNDAY = "sunday";
	public static final String THURSDAY = "thursday";
	public static final String TIMEOUT_TAG = "timeout tag";
	public static final String TUESDAY = "tuesday";
	public static final String TYPE_KEY = "type";
	public static final String UPDATE_PROFILE_VIEWED = "update profile viewed";
	public static final String USER_LOGGED_IN = "user logged in";
	public static final String USER_LOGGED_OUT = "user logged out";
	public static final String USER_SELECTED_COUNTRY = "user selected country";
	public static final String USER_TERMS_LINK_PRESSED = "user terms link pressed";
	public static final String V1_ERROR_DHCP = "dhcp";
	public static final String V1_ERROR_LINK = "link";
	public static final String V1_ERROR_NETWORK = "network";
	public static final String V1_ERROR_NETWORK_RECONNECT = "network reconnect";
	public static final String V1_ERROR_PASSWORD = "incorrect password";
	public static final String V1_ERROR_ROBOT_COMMS = "robot communications";
	public static final String V1_ERROR_ROBOT_CONNECTION = "robot connection";
	public static final String V1_ERROR_ROBOT_DISCOVERY = "robot discovery";
	public static final String V1_ERROR_SSL = "ssl";
	public static final String V2_ERROR_ACCESS_POINT_OUT_OF_RANGE = "access point out of range";
	public static final String V2_ERROR_CANT_FIND_ASSET = "cannot find asset on network";
	public static final String V2_ERROR_DHCP = "dhcp";
	public static final String V2_ERROR_FIVE_GHZ = "5Ghz access point";
	public static final String V2_ERROR_INVALID_CREDENTIALS = "invalid credentials";
	public static final String V2_ERROR_OVERALL_TIMEOUT = "provisioning overall timeout";
	public static final String V2_ERROR_PASSWORD_REQUEST = "password request";
	public static final String V2_ERROR_PROVISIONING_TO_SOFT_A_P = "provisioning to soft ap";
	public static final String V2_ERROR_SSL = "invalid ssl certificate";
	public static final String V2_PROVISIONING_PART1 = "roomba v2 provisioning step 1 connected";
	public static final String V2_PROVISIONING_PART2 = "roomba v2 provisioning step 2 sending wifi config";
	public static final String V2_PROVISIONING_PART3 = "roomba v2 provisioning step 3 checking config";
	public static final String V2_PROVISIONING_PART4 = "roomba v2 provisioning step 4 activating wifi";
	public static final String V2_PROVISIONING_PART5 = "roomba v2 provisioning step 5 verifying connection on home network";
	public static final String WEDNESDAY = "wednesday";
	public static final String WIFI_COVERAGE_MAP_SCREEN_VIEWED = "wifi coverage map screen viewed";
	public static final String WIFI_COVERAGE_TOGGLE = "wifi coverage toggled";
	public static final String WIFI_COVERAGE_TOGGLED = "wifi coverage toggled";
	public static final String WIFI_MAP_ACCURATE = "wifi map accurate";
	public static final String WIFI_MAP_BOTTOM_SHEET_VIEWED = "wifi map bottom sheet viewed";
	public static final String WIFI_MAP_FEEDBACK_RESPONSE_GIVEN = "wifi map feedback response";
	public static final String WIFI_MAP_HELPFUL = "wifi map helpful";
	public static final String WIFI_MAP_INTERESTING = "wifi map interest";
	public static final String WIFI_MAP_TAB_VIEWED = "wifi map tab viewed";
	public static final String WI_FI_SETTINGS_VIEWED = "wifi settings viewed";
	public static final String ZOOMED_IN_KEY = "zoomed in";
	public static final String ZOOMED_OUT_KEY = "zoomed out";
}

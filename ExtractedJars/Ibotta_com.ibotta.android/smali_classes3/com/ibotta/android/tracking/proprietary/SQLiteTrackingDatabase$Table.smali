.class public final enum Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;
.super Ljava/lang/Enum;
.source "SQLiteTrackingDatabase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Table"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum ACCOUNT_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum BONUS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum CATEGORY_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum DEAL_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum DEEPLINK_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum LAUNCH_APP_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum MODULE_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum MY_EARNINGS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum NOTIFICATION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum OFFER_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum PARTNER_APP_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum PRODUCT_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum QUEST_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum REGISTRATION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum RETAILER_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum REWARD_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum SEARCH_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum SESSION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum SETTINGS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

.field public static final enum TILE_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;


# instance fields
.field private final representativeObject:Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

.field private final tableName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 98
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "BONUS_EVENT"

    const-string v2, "bonus_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;-><init>()V

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->BONUS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 99
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "DEEPLINK_EVENT"

    const-string v2, "deeplink_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;-><init>()V

    const/4 v5, 0x1

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->DEEPLINK_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 100
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "LAUNCH_APP_EVENT"

    const-string v2, "launch_app_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;-><init>()V

    const/4 v6, 0x2

    invoke-direct {v0, v1, v6, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->LAUNCH_APP_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 101
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "OFFER_EVENT"

    const-string v2, "offer_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    const/4 v7, 0x3

    invoke-direct {v0, v1, v7, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->OFFER_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 102
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "REGISTRATION_EVENT"

    const-string v2, "registration_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;-><init>()V

    const/4 v8, 0x4

    invoke-direct {v0, v1, v8, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->REGISTRATION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 103
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "RETAILER_EVENT"

    const-string v2, "retailer_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    const/4 v9, 0x5

    invoke-direct {v0, v1, v9, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->RETAILER_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 104
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "REWARD_EVENT"

    const-string v2, "reward_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;-><init>()V

    const/4 v10, 0x6

    invoke-direct {v0, v1, v10, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->REWARD_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 105
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "SEARCH_EVENT"

    const-string v2, "search_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;-><init>()V

    const/4 v11, 0x7

    invoke-direct {v0, v1, v11, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->SEARCH_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 106
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "SESSION_EVENT"

    const-string v2, "session_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;-><init>()V

    const/16 v12, 0x8

    invoke-direct {v0, v1, v12, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->SESSION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 107
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "TILE_EVENT"

    const-string v2, "tile_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;-><init>()V

    const/16 v13, 0x9

    invoke-direct {v0, v1, v13, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->TILE_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 108
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "PRODUCT_EVENT"

    const-string v2, "product_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;-><init>()V

    const/16 v14, 0xa

    invoke-direct {v0, v1, v14, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->PRODUCT_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 109
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "DEAL_EVENT"

    const-string v2, "deal_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;-><init>()V

    const/16 v15, 0xb

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->DEAL_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 110
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "MODULE_EVENT"

    const-string v2, "module_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;-><init>()V

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->MODULE_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 111
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "PARTNER_APP_EVENT"

    const-string v2, "partner_app_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;-><init>()V

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->PARTNER_APP_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 112
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "QUEST_EVENT"

    const-string v2, "quest_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;-><init>()V

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->QUEST_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 113
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "CATEGORY_EVENT"

    const-string v2, "category_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;-><init>()V

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->CATEGORY_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 114
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "NOTIFICATION_EVENT"

    const-string v2, "notification_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;-><init>()V

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->NOTIFICATION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 115
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "ACCOUNT_EVENT"

    const-string v2, "account_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;-><init>()V

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->ACCOUNT_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 116
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "MY_EARNINGS_EVENT"

    const-string v2, "my_earnings_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;-><init>()V

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->MY_EARNINGS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 117
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const-string v1, "SETTINGS_EVENT"

    const-string v2, "settings_event"

    new-instance v3, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    invoke-direct {v3}, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;-><init>()V

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15, v2, v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->SETTINGS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v0, 0x14

    .line 97
    new-array v0, v0, [Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->BONUS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->DEEPLINK_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->LAUNCH_APP_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->OFFER_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->REGISTRATION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->RETAILER_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->REWARD_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->SEARCH_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->SESSION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->TILE_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->PRODUCT_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->DEAL_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->MODULE_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->PARTNER_APP_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->QUEST_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->CATEGORY_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->NOTIFICATION_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->ACCOUNT_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->MY_EARNINGS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->SETTINGS_EVENT:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ")V"
        }
    .end annotation

    .line 122
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 123
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->tableName:Ljava/lang/String;

    .line 124
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->representativeObject:Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    .locals 0

    .line 97
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->representativeObject:Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    return-object p0
.end method

.method public static fromTableName(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 139
    invoke-static {}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->values()[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 140
    invoke-virtual {v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getTableName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz p0, :cond_2

    return-object v3

    .line 148
    :cond_2
    new-instance p0, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;

    const-string v0, "Unsupported table."

    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;
    .locals 1

    .line 97
    const-class v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;
    .locals 1

    .line 97
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->$VALUES:[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    invoke-virtual {v0}, [Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    return-object v0
.end method


# virtual methods
.method public getRepresentativeObject()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->representativeObject:Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    return-object v0
.end method

.method public getTableName()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->tableName:Ljava/lang/String;

    return-object v0
.end method

.class public Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseUtil;
.super Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;
.source "TrackingDatabaseUtil.java"


# static fields
.field private static final classes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x15

    .line 34
    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseUtil;->classes:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;-><init>()V

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 59
    new-instance p0, Ljava/io/File;

    const-string v0, "/tmp/ormlite_config_tracking.txt"

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseUtil;->classes:[Ljava/lang/Class;

    invoke-static {p0, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseUtil;->writeConfigFile(Ljava/io/File;[Ljava/lang/Class;)V

    return-void
.end method

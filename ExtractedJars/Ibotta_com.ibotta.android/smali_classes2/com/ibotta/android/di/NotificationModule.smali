.class public abstract Lcom/ibotta/android/di/NotificationModule;
.super Ljava/lang/Object;
.source "NotificationModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static createNotificationChannel(Landroid/content/Context;Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 98
    new-instance v0, Landroid/app/NotificationChannel;

    const v1, 0x7f1100a8

    .line 100
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x3

    invoke-direct {v0, p1, p0, v1}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    return-object v0
.end method

.method public static provideDefaultNotificationChannelId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "NotificationChannelDefaultId"
    .end annotation

    const v0, 0x7f110447

    .line 93
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static provideDefaultNotificationComposer(Ljava/lang/String;)Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "NotificationChannelDefaultId"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 65
    new-instance v0, Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static provideNotificationDetailFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/DigitalProductHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;
    .locals 12
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 121
    new-instance v11, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/DigitalProductHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v11
.end method

.method public static provideNotificationManager(Landroid/content/Context;Ljava/lang/String;)Landroid/app/NotificationManager;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "NotificationChannelDefaultId"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "notification"

    .line 82
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 84
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    .line 85
    invoke-static {p0, p1}, Lcom/ibotta/android/di/NotificationModule;->createNotificationChannel(Landroid/content/Context;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-object v0
.end method

.method static provideNotificationRoutingUtil(Lcom/ibotta/android/routing/RoutePreviewer;)Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 106
    new-instance v0, Lcom/ibotta/android/routing/notification/NotificationRoutingUtilImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/notification/NotificationRoutingUtilImpl;-><init>(Lcom/ibotta/android/routing/RoutePreviewer;)V

    return-object v0
.end method

.method public static providePushMessaging(Landroid/content/Context;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/notification/StatusBarNotificationHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;)Lcom/ibotta/android/service/push/PushMessaging;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation runtime Lcom/ibotta/android/di/AppContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 74
    new-instance v0, Lcom/ibotta/android/service/push/PushMessaging;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/service/push/PushMessaging;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/notification/StatusBarNotificationHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V

    return-object v0
.end method

.method public static provideStatusBarNotificationHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;Lcom/ibotta/android/state/app/fcm/FcmState;Landroid/app/NotificationManager;)Lcom/ibotta/android/notification/StatusBarNotificationHelper;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 53
    new-instance v0, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;

    .line 54
    invoke-interface {p2}, Lcom/ibotta/android/state/app/fcm/FcmState;->getNextPushMessageId()I

    move-result v1

    invoke-direct {v0, p0, p1, p3, v1}, Lcom/ibotta/android/notification/StatusBarNotificationHelperImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/notification/composer/NotificationComposer;Landroid/app/NotificationManager;I)V

    .line 55
    invoke-interface {p2}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertSound()Z

    move-result p0

    invoke-interface {v0, p0}, Lcom/ibotta/android/notification/StatusBarNotificationHelper;->setSoundAllowed(Z)V

    .line 56
    invoke-interface {p2}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertVibrate()Z

    move-result p0

    invoke-interface {v0, p0}, Lcom/ibotta/android/notification/StatusBarNotificationHelper;->setVibrateAllowed(Z)V

    .line 57
    invoke-interface {p2}, Lcom/ibotta/android/state/app/fcm/FcmState;->isAlertLight()Z

    move-result p0

    invoke-interface {v0, p0}, Lcom/ibotta/android/notification/StatusBarNotificationHelper;->setLightAllowed(Z)V

    return-object v0
.end method

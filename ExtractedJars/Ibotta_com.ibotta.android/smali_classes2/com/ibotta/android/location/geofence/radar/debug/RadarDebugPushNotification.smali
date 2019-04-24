.class public final Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;
.super Ljava/lang/Object;
.source "RadarDebugPushNotification.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarDebugPushNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarDebugPushNotification.kt\ncom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,109:1\n1574#2,2:110\n10720#3,2:112\n*E\n*S KotlinDebug\n*F\n+ 1 RadarDebugPushNotification.kt\ncom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification\n*L\n31#1,2:110\n39#1,2:112\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J)\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0015\u00a2\u0006\u0002\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;",
        "",
        "()V",
        "createNotification",
        "Landroid/app/Notification;",
        "context",
        "Landroid/content/Context;",
        "data",
        "Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;",
        "createNotificationChannel",
        "",
        "notificationManager",
        "Landroid/app/NotificationManager;",
        "mapEventToPushNotificationData",
        "event",
        "Lio/radar/sdk/model/RadarEvent;",
        "messageFormat",
        "",
        "mapEventsToPushNotificationData",
        "",
        "events",
        "",
        "(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;)Ljava/util/List;",
        "sendDebugPushNotification",
        "sendPushNotificationsForEvents",
        "(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;)V",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createNotification(Landroid/content/Context;Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;)Landroid/app/Notification;
    .locals 2

    .line 93
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Builder;

    const-string v1, "radar-notif-channel"

    invoke-direct {v0, p1, v1}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->getSmallIconResId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "Radar Test Event"

    .line 95
    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "radar-notif-channel"

    .line 96
    invoke-virtual {p1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    .line 97
    new-instance v0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;

    invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->getMessage()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;

    move-result-object p2

    check-cast p2, Landroid/support/v4/app/NotificationCompat$Style;

    invoke-virtual {p1, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object p1

    .line 98
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string p2, "NotificationCompat.Build\u2026ge))\n            .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final createNotificationChannel(Landroid/app/NotificationManager;)V
    .locals 4

    .line 101
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 102
    new-instance v0, Landroid/app/NotificationChannel;

    const-string v1, "radar-notif-channel"

    const-string v2, "Radar Test Notifications"

    .line 104
    check-cast v2, Ljava/lang/CharSequence;

    const/4 v3, 0x3

    .line 102
    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 106
    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method private final mapEventToPushNotificationData(Lio/radar/sdk/model/RadarEvent;Ljava/lang/String;)Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;
    .locals 5

    .line 53
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarEvent;->getType()Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-result-object v0

    sget-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 54
    :goto_0
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarEvent;->getType()Lio/radar/sdk/model/RadarEvent$RadarEventType;

    move-result-object v1

    sget-object v4, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    if-ne v1, v4, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 55
    :goto_1
    invoke-virtual {p1}, Lio/radar/sdk/model/RadarEvent;->getPlace()Lio/radar/sdk/model/RadarPlace;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/radar/sdk/model/RadarPlace;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "unknown"

    :goto_2
    const/4 v4, 0x2

    if-eqz v0, :cond_3

    .line 60
    sget v0, Lcom/ibotta/android/location/geofence/R$drawable;->ic_arrive:I

    .line 61
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    new-array v1, v4, [Ljava/lang/Object;

    const-string v4, "entering"

    aput-object v4, v1, v3

    aput-object p1, v1, v2

    array-length p1, v1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x13185

    .line 59
    new-instance v1, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    invoke-direct {v1, v0, p1, p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;-><init>(ILjava/lang/String;I)V

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    .line 66
    sget v0, Lcom/ibotta/android/location/geofence/R$drawable;->ic_leave:I

    .line 67
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    new-array v1, v4, [Ljava/lang/Object;

    const-string v4, "exiting"

    aput-object v4, v1, v3

    aput-object p1, v1, v2

    array-length p1, v1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x13186

    .line 65
    new-instance v1, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    invoke-direct {v1, v0, p1, p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;-><init>(ILjava/lang/String;I)V

    goto :goto_3

    :cond_4
    const-string p2, "Event at %s is not a Radar Place"

    .line 71
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v3

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    :goto_3
    return-object v1
.end method

.method private final mapEventsToPushNotificationData(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[",
            "Lio/radar/sdk/model/RadarEvent;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;",
            ">;"
        }
    .end annotation

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    sget v1, Lcom/ibotta/android/location/geofence/R$string;->debug_push_message_format:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 112
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p2, v2

    const-string v4, "messageFormat"

    .line 40
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v3, p1}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;->mapEventToPushNotificationData(Lio/radar/sdk/model/RadarEvent;Ljava/lang/String;)Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 43
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final sendDebugPushNotification(Landroid/content/Context;Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;)V
    .locals 2

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;->createNotification(Landroid/content/Context;Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;)Landroid/app/Notification;

    move-result-object v0

    const-string v1, "notification"

    .line 80
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/app/NotificationManager;

    if-nez v1, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Landroid/app/NotificationManager;

    if-nez p1, :cond_1

    const-string p1, "Failed to find notification service"

    const/4 p2, 0x0

    .line 83
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 87
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;->createNotificationChannel(Landroid/app/NotificationManager;)V

    .line 89
    invoke-virtual {p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->getNotificationId()I

    move-result p2

    invoke-virtual {p1, p2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method


# virtual methods
.method public final sendPushNotificationsForEvents(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Lio/radar/sdk/model/RadarEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "events"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;->mapEventsToPushNotificationData(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;)Ljava/util/List;

    move-result-object p2

    .line 28
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "No Radar Place entry or exit events founds"

    const/4 p2, 0x0

    .line 29
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 31
    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    .line 110
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotification;->sendDebugPushNotification(Landroid/content/Context;Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

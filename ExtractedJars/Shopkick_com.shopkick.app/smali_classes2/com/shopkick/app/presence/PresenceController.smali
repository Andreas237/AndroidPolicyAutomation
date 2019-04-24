.class public Lcom/shopkick/app/presence/PresenceController;
.super Ljava/lang/Object;
.source "PresenceController.java"

# interfaces
.implements Lcom/shopkick/app/presence/IPresenceListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;
    }
.end annotation


# static fields
.field public static final DETECTED_CODE:Ljava/lang/String; = "PresenceControllerDetectedCode"

.field public static final DETECTED_SIGNAL:Ljava/lang/String; = "PresenceControllerDetectedSignal"

.field public static final DETECTED_SIGNAL_LOST:Ljava/lang/String; = "PresenceControllerDetectedSignalLost"


# instance fields
.field private audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private clock:Lcom/shopkick/app/util/Clock;

.field private context:Landroid/content/Context;

.field private debugFileName:Ljava/lang/String;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field final handler:Landroid/os/Handler;

.field private lastEvent:Ljava/lang/String;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

.field private presenceEnabled:Z

.field private previousCodes:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

.field private triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private walkinController:Lcom/shopkick/app/presence/WalkinController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/presence/AudioThreadController;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/presence/NativePresencePipelineInterop;Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/Clock;Ljava/lang/String;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/presence/WalkinController;)V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "PresenceControllerDetectedSignalLost"

    .line 83
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    .line 86
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->handler:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p0, Lcom/shopkick/app/presence/PresenceController;->presenceEnabled:Z

    .line 93
    new-instance v0, Lcom/shopkick/app/presence/PresenceController$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/presence/PresenceController$1;-><init>(Lcom/shopkick/app/presence/PresenceController;)V

    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 113
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->context:Landroid/content/Context;

    .line 114
    iput-object p2, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    .line 115
    iput-object p3, p0, Lcom/shopkick/app/presence/PresenceController;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 116
    iput-object p4, p0, Lcom/shopkick/app/presence/PresenceController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 117
    iput-object p5, p0, Lcom/shopkick/app/presence/PresenceController;->pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    .line 118
    iput-object p6, p0, Lcom/shopkick/app/presence/PresenceController;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    .line 119
    iput-object p7, p0, Lcom/shopkick/app/presence/PresenceController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 120
    iput-object p8, p0, Lcom/shopkick/app/presence/PresenceController;->clock:Lcom/shopkick/app/util/Clock;

    .line 121
    iput-object p10, p0, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 122
    iput-object p11, p0, Lcom/shopkick/app/presence/PresenceController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 123
    iput-object p12, p0, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 124
    iput-object p13, p0, Lcom/shopkick/app/presence/PresenceController;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    .line 126
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->previousCodes:Ljava/util/HashSet;

    .line 127
    iput-object p9, p0, Lcom/shopkick/app/presence/PresenceController;->debugFileName:Ljava/lang/String;

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    new-instance p2, Lcom/shopkick/app/util/SKHandler;

    iget-object p3, p0, Lcom/shopkick/app/presence/PresenceController;->handler:Landroid/os/Handler;

    invoke-direct {p2, p3}, Lcom/shopkick/app/util/SKHandler;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->setHandler(Lcom/shopkick/app/util/SKHandler;)V

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->addPresenceListener(Lcom/shopkick/app/presence/IPresenceListener;)V

    const-string p1, "UserAccountIdChangedEvent"

    .line 133
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "AppActivityManagerAppForegroundedEvent"

    .line 134
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string/jumbo p1, "transmittersUpdatedEvent"

    .line 135
    invoke-virtual {p4, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/presence/PresenceController;)Lcom/shopkick/app/presence/NativePresencePipelineInterop;
    .locals 0

    .line 54
    iget-object p0, p0, Lcom/shopkick/app/presence/PresenceController;->pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    return-object p0
.end method

.method static synthetic access$100([B)Ljava/lang/String;
    .locals 0

    .line 54
    invoke-static {p0}, Lcom/shopkick/app/presence/PresenceController;->compressFFTData([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private addLocationToParams(Ljava/util/Map;DDFI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;DDFI)V"
        }
    .end annotation

    const-string v0, "lat"

    .line 248
    invoke-static {p2, p3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "lng"

    .line 249
    invoke-static {p4, p5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "accuracy"

    .line 250
    invoke-static {p6}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "coordAge"

    .line 251
    invoke-static {p7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private addLocationToParams(Ljava/util/Map;Landroid/location/Location;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/location/Location;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->clock:Lcom/shopkick/app/util/Clock;

    invoke-virtual {v0}, Lcom/shopkick/app/util/Clock;->millis()J

    move-result-wide v0

    invoke-virtual {p2}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v9, v0

    .line 233
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    .line 234
    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    .line 235
    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result v8

    move-object v2, p0

    move-object v3, p1

    .line 232
    invoke-direct/range {v2 .. v9}, Lcom/shopkick/app/presence/PresenceController;->addLocationToParams(Ljava/util/Map;DDFI)V

    :cond_0
    return-void
.end method

.method private static compressFFTData([B)Ljava/lang/String;
    .locals 2

    .line 60
    invoke-static {p0}, Lcom/shopkick/app/util/StringUtils;->gzip([B)[B

    move-result-object p0

    .line 62
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {p0}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object p0

    const-string v1, "ASCII"

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 64
    const-class v0, Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/UnsupportedEncodingException;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method private generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 9

    .line 540
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 541
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 542
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getSource()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string/jumbo v1, "source"

    .line 543
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getSource()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCheckinFailureReason()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "reason"

    .line 546
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCheckinFailureReason()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getPresenceCode()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "presenceCode"

    .line 549
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getPresenceCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    :cond_2
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getPresenceCandidate()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "presenceCandidate"

    .line 552
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getPresenceCandidate()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    :cond_3
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getChainId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v1, "chainId"

    .line 555
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getChainId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    :cond_4
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getDepartmentId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v1, "departmentId"

    .line 558
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getDepartmentId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    :cond_5
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getTransmitterId()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string/jumbo v1, "transmitterId"

    .line 561
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getTransmitterId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 563
    :cond_6
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getNumTransmitters()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v1, "numTransmitters"

    .line 564
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getNumTransmitters()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    :cond_7
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLat()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLng()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAccuracy()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 569
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLat()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 570
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getLng()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    .line 571
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAccuracy()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    move-result v7

    .line 572
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getCoordAge()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v1, p0

    move-object v2, v0

    .line 568
    invoke-direct/range {v1 .. v8}, Lcom/shopkick/app/presence/PresenceController;->addLocationToParams(Ljava/util/Map;DDFI)V

    .line 574
    :cond_8
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getEventType()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v1, v2, v3, p1, v0}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    :cond_9
    return-void
.end method

.method private logWalkinFailure(ILjava/lang/String;I)V
    .locals 6

    .line 591
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v0

    const/16 v1, 0x3b8

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 592
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v3, "reason"

    .line 593
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v3, "source"

    .line 594
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "presenceCandidate"

    .line 595
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v3

    .line 597
    invoke-virtual {v3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 598
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5, v1, v0}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    .line 602
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 603
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 604
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 605
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCode(Ljava/lang/String;)V

    .line 606
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 607
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCandidate(Ljava/lang/Integer;)V

    .line 608
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method private makeWalkinCallback(ZLjava/lang/String;I)V
    .locals 1

    .line 532
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/presence/WalkinController;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public clearWalkinHistory()V
    .locals 2

    .line 776
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    new-instance v1, Lcom/shopkick/app/presence/PresenceController$5;

    invoke-direct {v1, p0}, Lcom/shopkick/app/presence/PresenceController$5;-><init>(Lcom/shopkick/app/presence/PresenceController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->postCallback(Ljava/lang/Runnable;)V

    return-void
.end method

.method public crcMatchedCodeDetected()V
    .locals 2

    const-string v0, "PresenceControllerDetectedCode"

    .line 681
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    .line 682
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method public destroy()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    if-eqz v0, :cond_0

    .line 151
    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 152
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    :cond_0
    return-void
.end method

.method public disablePresence()V
    .locals 1

    const/4 v0, 0x0

    .line 181
    iput-boolean v0, p0, Lcom/shopkick/app/presence/PresenceController;->presenceEnabled:Z

    .line 182
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController;->stopPresenceListening()V

    return-void
.end method

.method public enablePresence()V
    .locals 1

    const/4 v0, 0x1

    .line 176
    iput-boolean v0, p0, Lcom/shopkick/app/presence/PresenceController;->presenceEnabled:Z

    .line 177
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController;->startPresenceListening()V

    return-void
.end method

.method public getEncodedFFTData()Ljava/lang/String;
    .locals 2

    .line 790
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/AudioThreadController;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 793
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    new-instance v1, Lcom/shopkick/app/presence/PresenceController$6;

    invoke-direct {v1, p0}, Lcom/shopkick/app/presence/PresenceController$6;-><init>(Lcom/shopkick/app/presence/PresenceController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->callCallback(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 800
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method

.method public getLastPresenceEvent()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    return-object v0
.end method

.method public getLocationListVersion()I
    .locals 3

    .line 710
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/AudioThreadController;->isInitialized()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 713
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    new-instance v2, Lcom/shopkick/app/presence/PresenceController$3;

    invoke-direct {v2, p0}, Lcom/shopkick/app/presence/PresenceController$3;-><init>(Lcom/shopkick/app/presence/PresenceController;)V

    invoke-virtual {v0, v2}, Lcom/shopkick/app/presence/AudioThreadController;->callCallback(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 720
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    return v1
.end method

.method public getPdEvents()Ljava/lang/String;
    .locals 2

    .line 807
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/AudioThreadController;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 810
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    new-instance v1, Lcom/shopkick/app/presence/PresenceController$7;

    invoke-direct {v1, p0}, Lcom/shopkick/app/presence/PresenceController$7;-><init>(Lcom/shopkick/app/presence/PresenceController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->callCallback(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 817
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method

.method public getPreviousCodes()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 871
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->previousCodes:Ljava/util/HashSet;

    return-object v0
.end method

.method public getTriggerCodeRunnable()Ljava/lang/Runnable;
    .locals 1

    .line 863
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    return-object v0
.end method

.method public getWalkinHistory()Ljava/lang/String;
    .locals 2

    .line 759
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/AudioThreadController;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 762
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    new-instance v1, Lcom/shopkick/app/presence/PresenceController$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/presence/PresenceController$4;-><init>(Lcom/shopkick/app/presence/PresenceController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->callCallback(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 769
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method

.method public handleLocationUpdate(Landroid/location/Location;)V
    .locals 0

    if-eqz p1, :cond_1

    .line 740
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    if-nez p1, :cond_0

    goto :goto_0

    .line 743
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController;->triggerSendPresenceCode()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method protected isBleEnabled()Z
    .locals 5

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.bluetooth_le"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    .line 191
    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/shopkick/utilities/GooglePlayServicesUtility;->isGooglePlayServicesAvailable(Landroid/content/Context;)Z

    move-result v1

    .line 193
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 194
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    return v3
.end method

.method protected isLocationEnabled()Z
    .locals 3

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->context:Landroid/content/Context;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-string v1, "gps"

    .line 204
    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "network"

    .line 205
    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method protected isLocationPermissionAvailable()Z
    .locals 5

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->context:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 216
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/presence/PresenceController;->context:Landroid/content/Context;

    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v3, v4}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-nez v0, :cond_3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :cond_3
    :goto_2
    return v1
.end method

.method public logPdEvents(Ljava/lang/String;)V
    .locals 2

    .line 834
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x79

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 835
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPdEvents(Ljava/lang/String;)V

    .line 836
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "UserAccountIdChangedEvent"

    .line 748
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    if-eqz p2, :cond_0

    .line 749
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 750
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController;->triggerSendPresenceCode()V

    goto :goto_0

    :cond_0
    const-string/jumbo p2, "transmittersUpdatedEvent"

    .line 752
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    if-eqz p1, :cond_1

    .line 754
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController;->triggerSendPresenceCode()V

    :cond_1
    :goto_0
    return-void
.end method

.method public presenceCodeDetected(Ljava/lang/String;I[B[BJIZLjava/util/ArrayList;[II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I[B[BJIZ",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;[II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p9

    move-object/from16 v3, p10

    const/16 v4, 0x3b8

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_22

    .line 265
    array-length v7, v3

    if-nez v7, :cond_0

    goto/16 :goto_d

    .line 279
    :cond_0
    iget-object v7, v1, Lcom/shopkick/app/presence/PresenceController;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    invoke-virtual {v7}, Lcom/shopkick/app/presence/WalkinController;->isManualWalkin()Z

    move-result v7

    if-nez v7, :cond_1

    iget-object v7, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v7}, Lcom/shopkick/app/util/FeatureFlagHelper;->isAutomaticWalkinsDisabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 280
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 281
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 282
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v2, v6

    const-string v4, "CHECKIN: PresenceController: presenceCodeDetected() from automatic when manual only"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 287
    :cond_1
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v7

    invoke-virtual {v7}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v7

    invoke-virtual {v7}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v7

    .line 289
    iget-object v8, v1, Lcom/shopkick/app/presence/PresenceController;->clock:Lcom/shopkick/app/util/Clock;

    invoke-virtual {v8}, Lcom/shopkick/app/util/Clock;->millis()J

    move-result-wide v8

    if-eqz v7, :cond_2

    .line 290
    invoke-virtual {v7}, Landroid/location/Location;->getTime()J

    move-result-wide v11

    sub-long v11, v8, v11

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    .line 293
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/presence/PresenceController;->isBleEnabled()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    .line 294
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v13

    invoke-virtual {v13}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v13

    sget-object v14, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v15, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    move-object/from16 p4, v11

    invoke-virtual {v15}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v10

    invoke-virtual {v13, v14, v10, v11}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v10

    const/16 v11, 0x80

    if-eqz v10, :cond_4

    .line 295
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v13, "source"

    .line 296
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v10, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v13, "count"

    .line 297
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v10, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v12, :cond_3

    const-string v13, "bt_enabled"

    .line 299
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    invoke-static {v14}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v10, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v13, "presenceCandidate"

    .line 302
    aget v14, v3, v5

    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v10, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    invoke-direct {v1, v10, v7}, Lcom/shopkick/app/presence/PresenceController;->addLocationToParams(Ljava/util/Map;Landroid/location/Location;)V

    .line 304
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v13

    .line 305
    invoke-virtual {v13}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v13

    sget-object v14, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 306
    invoke-virtual {v14}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v14

    invoke-virtual {v13, v14, v15, v11, v10}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    .line 310
    :cond_4
    iget-object v10, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v10, v10, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_6

    .line 311
    new-instance v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 312
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 313
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCount(Ljava/lang/Integer;)V

    .line 314
    invoke-virtual {v10, v12}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBtEnabled(Ljava/lang/Boolean;)V

    .line 315
    aget v11, v3, v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCandidate(Ljava/lang/Integer;)V

    if-eqz v7, :cond_5

    .line 317
    invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 318
    invoke-virtual {v7}, Landroid/location/Location;->getLongitude()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 319
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v11

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    move-object/from16 v11, p4

    .line 320
    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    goto :goto_1

    :cond_5
    move-object/from16 v11, p4

    .line 322
    :goto_1
    iget-object v12, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v12, v10}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_2

    :cond_6
    move-object/from16 v11, p4

    .line 325
    :goto_2
    new-instance v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v10}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 326
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v12}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 327
    aget v12, v3, v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v10, v12}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCandidate(Ljava/lang/Integer;)V

    .line 329
    :try_start_0
    iget-object v12, v1, Lcom/shopkick/app/presence/PresenceController;->pipeline:Lcom/shopkick/app/presence/NativePresencePipelineInterop;

    invoke-virtual {v12}, Lcom/shopkick/app/presence/NativePresencePipelineInterop;->isBackgroundMode()Z

    move-result v12

    if-eqz v12, :cond_8

    .line 331
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/16 v0, 0xb

    .line 332
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    const-string v0, "Ultrasonic: PresenceController: App backgrounded"

    .line 333
    invoke-direct {v1, v5, v0, v6}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_7
    return-void

    .line 339
    :cond_8
    :try_start_1
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v12

    if-eqz v12, :cond_a

    const-string v13, "DEBUG_FLAG_IGNORE_TRANSMITTER"

    .line 340
    invoke-virtual {v12, v13}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_a

    if-eqz v2, :cond_a

    .line 343
    invoke-virtual/range {p9 .. p9}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-lez v12, :cond_a

    .line 345
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/16 v0, 0x10

    .line 346
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    const-string v0, "Ultrasonic: PresenceController: Ultrasonic flag disabled"

    .line 347
    invoke-direct {v1, v5, v0, v6}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_9
    return-void

    :cond_a
    :try_start_2
    const-string v12, "PresenceControllerDetectedCode"

    .line 353
    iput-object v12, v1, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    .line 354
    iget-object v12, v1, Lcom/shopkick/app/presence/PresenceController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v13, v1, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    invoke-virtual {v12, v13}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 357
    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    .line 358
    array-length v13, v3

    move v14, v5

    :goto_3
    if-ge v14, v13, :cond_b

    aget v15, v3, v14

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    .line 359
    invoke-virtual {v12, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    .line 361
    :cond_b
    iget-object v13, v1, Lcom/shopkick/app/presence/PresenceController;->previousCodes:Ljava/util/HashSet;

    invoke-virtual {v13, v12}, Ljava/util/HashSet;->containsAll(Ljava/util/Collection;)Z

    move-result v13

    if-eqz v13, :cond_e

    .line 362
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    if-nez v0, :cond_c

    .line 363
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->blockedDuplicateCodeRetryDelayMs:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 364
    new-instance v2, Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    invoke-direct {v2, v1, v1}, Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;-><init>(Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/presence/PresenceController;)V

    iput-object v2, v1, Lcom/shopkick/app/presence/PresenceController;->triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    .line 365
    iget-object v2, v1, Lcom/shopkick/app/presence/PresenceController;->handler:Landroid/os/Handler;

    iget-object v3, v1, Lcom/shopkick/app/presence/PresenceController;->triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    int-to-long v7, v0

    invoke-virtual {v2, v3, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 367
    :cond_c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/16 v0, 0xe

    .line 368
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    const-string v0, "Ultrasonic: PresenceController: All candidates previously seen"

    .line 369
    invoke-direct {v1, v5, v0, v6}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_d
    return-void

    .line 374
    :cond_e
    :try_start_3
    iget-object v13, v1, Lcom/shopkick/app/presence/PresenceController;->previousCodes:Ljava/util/HashSet;

    invoke-virtual {v13, v12}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 377
    iget-object v12, v1, Lcom/shopkick/app/presence/PresenceController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v12}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v12

    if-nez v12, :cond_10

    .line 378
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/4 v0, 0x4

    .line 379
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    const-string v0, "Ultrasonic: PresenceController: No user account"

    .line 380
    invoke-direct {v1, v5, v0, v6}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_f
    return-void

    :cond_10
    if-nez v7, :cond_14

    .line 390
    :try_start_4
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/presence/PresenceController;->isLocationPermissionAvailable()Z

    move-result v2

    if-nez v2, :cond_11

    const/16 v2, 0x9

    .line 391
    aget v3, v3, v5

    invoke-direct {v1, v2, v0, v3}, Lcom/shopkick/app/presence/PresenceController;->logWalkinFailure(ILjava/lang/String;I)V

    goto :goto_4

    .line 394
    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/presence/PresenceController;->isLocationEnabled()Z

    move-result v2

    if-nez v2, :cond_12

    const/16 v2, 0xa

    .line 395
    aget v3, v3, v5

    invoke-direct {v1, v2, v0, v3}, Lcom/shopkick/app/presence/PresenceController;->logWalkinFailure(ILjava/lang/String;I)V

    .line 398
    :cond_12
    :goto_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/4 v0, 0x5

    .line 399
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    const-string v0, "Ultrasonic: PresenceController: No location found"

    .line 400
    invoke-direct {v1, v5, v0, v6}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_13
    return-void

    .line 407
    :cond_14
    :try_start_5
    iget-object v12, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v12, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    .line 408
    iget-object v13, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocUseThresholdForAccuracy:Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    .line 409
    iget-object v14, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocAccuracyThresholdForErrorCorrectionMeters:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    int-to-double v14, v14

    if-eqz v13, :cond_16

    .line 410
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v13

    float-to-double v5, v13

    cmpl-double v5, v5, v14

    if-lez v5, :cond_16

    .line 411
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/4 v0, 0x6

    .line 412
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 413
    invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 414
    invoke-virtual {v7}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 415
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 416
    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    const-string v0, "Ultrasonic: PresenceController: Location inaccurate, radius too large"

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 417
    invoke-direct {v1, v3, v0, v2}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_15
    return-void

    .line 424
    :cond_16
    :try_start_6
    iget-object v5, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocPresenceDetectCheckinRadiusMeters:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 425
    iget-object v6, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->pdLocBingErrorRadiusMeters:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    int-to-float v5, v5

    int-to-float v6, v6

    .line 426
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v12

    add-float/2addr v6, v12

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    float-to-double v5, v5

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    .line 433
    array-length v13, v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move/from16 v16, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_5
    if-ge v12, v13, :cond_1a

    :try_start_7
    aget v4, v3, v12

    .line 434
    iget-object v3, v1, Lcom/shopkick/app/presence/PresenceController;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    move/from16 p7, v13

    move/from16 v13, p11

    invoke-virtual {v3, v4, v13}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->getTransmitters(II)Ljava/util/ArrayList;

    move-result-object v3

    if-nez v3, :cond_17

    goto :goto_8

    .line 439
    :cond_17
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v15, v4

    .line 440
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;

    move-object/from16 v17, v3

    .line 441
    new-instance v3, Landroid/location/Location;

    const-string/jumbo v13, "shopkick"

    invoke-direct {v3, v13}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 442
    iget-object v13, v4, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->latitude:Ljava/lang/Double;

    move-object/from16 v18, v14

    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    invoke-virtual {v3, v13, v14}, Landroid/location/Location;->setLatitude(D)V

    .line 443
    iget-object v13, v4, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->longitude:Ljava/lang/Double;

    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    invoke-virtual {v3, v13, v14}, Landroid/location/Location;->setLongitude(D)V

    .line 444
    invoke-virtual {v7, v3}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v3
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    cmpg-float v13, v3, v16

    if-gez v13, :cond_18

    float-to-double v13, v3

    cmpg-double v13, v13, v5

    if-gtz v13, :cond_18

    move/from16 v16, v3

    move-object v14, v4

    goto :goto_7

    :cond_18
    move-object/from16 v14, v18

    :goto_7
    move-object/from16 v3, v17

    move/from16 v13, p11

    goto :goto_6

    :cond_19
    move-object/from16 v18, v14

    :goto_8
    add-int/lit8 v12, v12, 0x1

    move/from16 v13, p7

    move-object/from16 v3, p10

    const/16 v4, 0x3b8

    goto :goto_5

    :catch_0
    move-exception v0

    const/16 v2, 0x3b8

    goto/16 :goto_b

    :cond_1a
    if-nez v14, :cond_1c

    const/16 v3, 0x3b8

    .line 452
    :try_start_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/4 v0, 0x7

    .line 453
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 454
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumTransmitters(Ljava/lang/Integer;)V

    .line 455
    invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 456
    invoke-virtual {v7}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 457
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 458
    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    const-string v0, "Ultrasonic: PresenceController: No nearby stores"

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 459
    invoke-direct {v1, v3, v0, v2}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_1b
    return-void

    :catch_1
    move-exception v0

    move v2, v3

    goto/16 :goto_b

    .line 466
    :cond_1c
    :try_start_a
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;-><init>()V

    .line 467
    invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->lat:Ljava/lang/Double;

    .line 468
    invoke-virtual {v7}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->lng:Ljava/lang/Double;

    .line 469
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->accuracy:Ljava/lang/Double;

    .line 470
    invoke-virtual {v7}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->coordTimestamp:Ljava/lang/Long;

    .line 471
    iget-object v4, v1, Lcom/shopkick/app/presence/PresenceController;->clock:Lcom/shopkick/app/util/Clock;

    invoke-virtual {v4}, Lcom/shopkick/app/util/Clock;->millis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->currTimestamp:Ljava/lang/Long;

    .line 472
    iget-object v4, v1, Lcom/shopkick/app/presence/PresenceController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v4}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->add:Ljava/lang/String;

    .line 473
    iget-object v4, v1, Lcom/shopkick/app/presence/PresenceController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const v5, 0x7f10000a

    invoke-virtual {v4, v5}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->kcid:Ljava/lang/String;

    .line 474
    iget-object v4, v1, Lcom/shopkick/app/presence/PresenceController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v4}, Lcom/shopkick/app/application/DeviceInfo;->getCarrierName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->carrier:Ljava/lang/String;

    .line 475
    iget-object v4, v1, Lcom/shopkick/app/presence/PresenceController;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    invoke-virtual {v4}, Lcom/shopkick/app/location/LocationNotifier;->getLocationConnectionState()I

    move-result v4

    if-eqz v4, :cond_1d

    const/4 v4, 0x1

    goto :goto_9

    :cond_1d
    const/4 v4, 0x0

    :goto_9
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->locationDisabled:Ljava/lang/Boolean;

    const/4 v4, 0x1

    .line 477
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->checkinStarter:Ljava/lang/Integer;

    const/16 v5, 0x2d

    .line 480
    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-ltz v5, :cond_1e

    .line 482
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v4

    if-ge v5, v6, :cond_1e

    add-int/2addr v5, v4

    .line 483
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_a

    :cond_1e
    const-string v4, "0"

    .line 487
    :goto_a
    iget-object v5, v14, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->transmitterId:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    .line 488
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "-"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 489
    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->presenceCode:Ljava/lang/String;

    .line 490
    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->presenceCodeByPd:Ljava/lang/String;

    if-eqz p2, :cond_1f

    .line 495
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->correctedBits:Ljava/lang/Integer;

    :cond_1f
    sub-long v8, v8, p5

    .line 497
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->msSinceSigDetection:Ljava/lang/Long;

    .line 498
    invoke-static/range {p8 .. p8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->partialMatch:Ljava/lang/Boolean;

    .line 499
    iput-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->presenceFactors:Ljava/util/List;

    const/16 v0, 0x81

    .line 502
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 503
    invoke-virtual {v10, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCode(Ljava/lang/String;)V

    .line 504
    iget-object v0, v14, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->chainId:Ljava/lang/String;

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 505
    iget-object v0, v14, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->locationId:Ljava/lang/String;

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 506
    invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 507
    invoke-virtual {v7}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 508
    invoke-virtual {v7}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 509
    invoke-virtual {v10, v11}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 511
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->walkinController:Lcom/shopkick/app/presence/WalkinController;

    iget-object v2, v14, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->chainId:Ljava/lang/String;

    iget-object v4, v14, Lcom/shopkick/app/fetchers/api/skapi/UltrasonicTransmitter;->locationId:Ljava/lang/String;

    const/4 v5, 0x1

    invoke-virtual {v0, v3, v2, v4, v5}, Lcom/shopkick/app/presence/WalkinController;->issueWalkinRequest(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 524
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 526
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_20
    return-void

    :catchall_0
    move-exception v0

    goto :goto_c

    :catch_2
    move-exception v0

    move v2, v4

    .line 517
    :goto_b
    :try_start_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    const/16 v2, 0xd

    .line 518
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 519
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    .line 520
    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 521
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "detectWalkinFromPresence() failed"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 522
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 524
    :goto_c
    invoke-direct {v1, v10}, Lcom/shopkick/app/presence/PresenceController;->generateDevLogFromLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 525
    iget-object v2, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_21

    .line 526
    iget-object v2, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v3, v10, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_21
    throw v0

    .line 267
    :cond_22
    :goto_d
    iget-object v0, v1, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_23

    .line 268
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x3b8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 269
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    const/16 v3, 0xf

    .line 270
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCheckinFailureReason(Ljava/lang/Integer;)V

    .line 271
    iget-object v3, v1, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_e

    :cond_23
    const/4 v2, 0x1

    :goto_e
    const-string v0, "Ultrasonic: PresenceController: No prefix candidate found"

    const/4 v3, 0x0

    .line 273
    invoke-direct {v1, v3, v0, v2}, Lcom/shopkick/app/presence/PresenceController;->makeWalkinCallback(ZLjava/lang/String;I)V

    return-void
.end method

.method public reset()V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->previousCodes:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const-string v0, "PresenceControllerDetectedSignalLost"

    .line 158
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    return-void
.end method

.method public resetPdEvents()V
    .locals 2

    .line 824
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    new-instance v1, Lcom/shopkick/app/presence/PresenceController$8;

    invoke-direct {v1, p0}, Lcom/shopkick/app/presence/PresenceController$8;-><init>(Lcom/shopkick/app/presence/PresenceController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->postCallback(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setPreviousCodes(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 867
    iput-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->previousCodes:Ljava/util/HashSet;

    return-void
.end method

.method public setupLocationManager()V
    .locals 2

    .line 140
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 141
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 143
    invoke-virtual {p0, v0}, Lcom/shopkick/app/presence/PresenceController;->handleLocationUpdate(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public signalDetected()V
    .locals 7

    const-string v0, "PresenceControllerDetectedSignal"

    .line 618
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    .line 619
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 620
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 623
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v1

    const/16 v2, 0x7e

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 624
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v4, "source"

    .line 625
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/presence/PresenceController;->addLocationToParams(Ljava/util/Map;Landroid/location/Location;)V

    .line 627
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    .line 628
    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 629
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6, v2, v1}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    .line 633
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 634
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 635
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    if-eqz v0, :cond_1

    .line 637
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 638
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 639
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 640
    iget-object v2, p0, Lcom/shopkick/app/presence/PresenceController;->clock:Lcom/shopkick/app/util/Clock;

    invoke-virtual {v2}, Lcom/shopkick/app/util/Clock;->millis()J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 642
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_2
    return-void
.end method

.method public signalLost(I)V
    .locals 7

    const-string v0, "PresenceControllerDetectedSignalLost"

    .line 648
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    .line 649
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->lastEvent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 650
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    .line 653
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    sget-object v3, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v1

    const/16 v2, 0x7f

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 654
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v4, "source"

    .line 655
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "count"

    .line 656
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/presence/PresenceController;->addLocationToParams(Ljava/util/Map;Landroid/location/Location;)V

    .line 658
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v4

    .line 659
    invoke-virtual {v4}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v4

    sget-object v5, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 660
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6, v2, v1}, Lcom/shopkick/logging/DiagnosticLogger;->i(JILjava/util/Map;)V

    .line 664
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enablePresenceDetectionLogging:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 665
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 666
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSource(Ljava/lang/Integer;)V

    .line 667
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCount(Ljava/lang/Integer;)V

    if-eqz v0, :cond_1

    .line 669
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 670
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 671
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 672
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->clock:Lcom/shopkick/app/util/Clock;

    invoke-virtual {p1}, Lcom/shopkick/app/util/Clock;->millis()J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 674
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/presence/PresenceController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_2
    return-void
.end method

.method public startPresenceListening()V
    .locals 2

    .line 162
    iget-boolean v0, p0, Lcom/shopkick/app/presence/PresenceController;->presenceEnabled:Z

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceController;->debugFileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->startRecording(Ljava/lang/String;)V

    .line 166
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/presence/PresenceController;->handleLocationUpdate(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public stopPresenceListening()V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/AudioThreadController;->stopRecording()V

    .line 172
    invoke-virtual {p0}, Lcom/shopkick/app/presence/PresenceController;->reset()V

    return-void
.end method

.method public triggerSendPresenceCode()V
    .locals 1

    const/4 v0, 0x0

    .line 730
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->triggerCodeRunnable:Lcom/shopkick/app/presence/PresenceController$TriggerSendPresenceCodeRunnable;

    .line 731
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->previousCodes:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 732
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/AudioThreadController;->triggerSendPresenceCode()V

    return-void
.end method

.method public updateLocationList(Ljava/lang/String;)V
    .locals 2

    .line 690
    iget-object v0, p0, Lcom/shopkick/app/presence/PresenceController;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    new-instance v1, Lcom/shopkick/app/presence/PresenceController$2;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/presence/PresenceController$2;-><init>(Lcom/shopkick/app/presence/PresenceController;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/presence/AudioThreadController;->postCallback(Ljava/lang/Runnable;)V

    return-void
.end method

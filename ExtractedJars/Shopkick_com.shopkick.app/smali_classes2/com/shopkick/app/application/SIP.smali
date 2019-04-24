.class public Lcom/shopkick/app/application/SIP;
.super Ljava/lang/Object;
.source "SIP.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# static fields
.field private static final INVALID_EVENT_TYPE:I = -0x1

.field private static final STATE_IDLE:I = 0x0

.field private static final STATE_WAIT_FOR_PREDRAW_AFTER_CONTENT:I = 0x2

.field private static final STATE_WAIT_FOR_REAL_CONTENT:I = 0x1

.field private static applogger:Lcom/shopkick/app/application/SKLogger; = null

.field private static clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord; = null

.field private static current_eventType:I = -0x1

.field private static screenToMonitor:Lcom/shopkick/app/screens/AppScreen;

.field private static singleton:Lcom/shopkick/app/application/SIP;

.field private static state:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addPreDrawListener(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 2

    .line 153
    invoke-static {p0}, Lcom/shopkick/app/application/SIP;->removePreDrawListener(Lcom/shopkick/app/screens/AppScreen;)V

    .line 154
    invoke-virtual {p0}, Lcom/shopkick/app/screens/AppScreen;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 161
    sget-object v1, Lcom/shopkick/app/application/SIP;->singleton:Lcom/shopkick/app/application/SIP;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 162
    sput-object p0, Lcom/shopkick/app/application/SIP;->screenToMonitor:Lcom/shopkick/app/screens/AppScreen;

    :cond_0
    return-void
.end method

.method private static endEvent(I)V
    .locals 3

    .line 167
    invoke-static {}, Lcom/shopkick/app/application/SIP;->removePreDrawListener()V

    .line 168
    sget-object v0, Lcom/shopkick/app/application/SIP;->applogger:Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/application/SKLogger;->getDuration(I)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 173
    :cond_0
    sget-object v1, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    if-nez v1, :cond_1

    .line 174
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    sput-object v1, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    .line 176
    :cond_1
    sget-object v1, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 177
    sget-object v1, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDurationMs(Ljava/lang/Integer;)V

    .line 178
    sget-object v0, Lcom/shopkick/app/application/SIP;->applogger:Lcom/shopkick/app/application/SKLogger;

    sget-object v1, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 179
    sget-object v0, Lcom/shopkick/app/application/SIP;->applogger:Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/application/SKLogger;->removeEventTypeTimestamp(I)V

    const/4 p0, -0x1

    .line 180
    sput p0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    const/4 p0, 0x0

    .line 181
    sput p0, Lcom/shopkick/app/application/SIP;->state:I

    const/4 p0, 0x0

    .line 182
    sput-object p0, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    return-void
.end method

.method public static initialize(Lcom/shopkick/app/application/SKLogger;)V
    .locals 1

    .line 101
    new-instance v0, Lcom/shopkick/app/application/SIP;

    invoke-direct {v0}, Lcom/shopkick/app/application/SIP;-><init>()V

    sput-object v0, Lcom/shopkick/app/application/SIP;->singleton:Lcom/shopkick/app/application/SIP;

    .line 102
    sput-object p0, Lcom/shopkick/app/application/SIP;->applogger:Lcom/shopkick/app/application/SKLogger;

    return-void
.end method

.method public static onCancelEvent(I)V
    .locals 1

    .line 66
    sget v0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    if-ne v0, p0, :cond_0

    .line 67
    invoke-static {}, Lcom/shopkick/app/application/SIP;->removePreDrawListener()V

    const/4 p0, -0x1

    .line 68
    sput p0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    const/4 p0, 0x0

    .line 69
    sput p0, Lcom/shopkick/app/application/SIP;->state:I

    const/4 p0, 0x0

    .line 70
    sput-object p0, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    :cond_0
    return-void
.end method

.method public static onEndCurrentEvent()V
    .locals 1

    .line 90
    sget v0, Lcom/shopkick/app/application/SIP;->state:I

    if-eqz v0, :cond_0

    .line 91
    sget v0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->endEvent(I)V

    :cond_0
    return-void
.end method

.method public static onEndEvent(I)V
    .locals 2

    .line 83
    sget v0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    if-ne p0, v0, :cond_0

    sget v0, Lcom/shopkick/app/application/SIP;->state:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 84
    invoke-static {p0}, Lcom/shopkick/app/application/SIP;->endEvent(I)V

    :cond_0
    return-void
.end method

.method public static onPause(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 106
    sget-object v0, Lcom/shopkick/app/application/SIP;->screenToMonitor:Lcom/shopkick/app/screens/AppScreen;

    if-ne v0, p0, :cond_0

    .line 107
    invoke-static {}, Lcom/shopkick/app/application/SIP;->removePreDrawListener()V

    :cond_0
    return-void
.end method

.method public static onRealContent(I)V
    .locals 1

    .line 76
    sget v0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    if-ne p0, v0, :cond_0

    sget p0, Lcom/shopkick/app/application/SIP;->state:I

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/4 p0, 0x2

    .line 77
    sput p0, Lcom/shopkick/app/application/SIP;->state:I

    :cond_0
    return-void
.end method

.method public static onUserAction(I)V
    .locals 8

    .line 46
    sget-object v0, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getEventType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, p0, :cond_0

    .line 52
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "Event type mismatch. Before : %d, after %d"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v7, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    .line 53
    invoke-virtual {v7}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getEventType()Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    .line 52
    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 54
    sput-object v0, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    .line 59
    :cond_0
    sput p0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    .line 60
    sget-object p0, Lcom/shopkick/app/application/SIP;->applogger:Lcom/shopkick/app/application/SKLogger;

    sget v0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/SKLogger;->startTimedLogEvent(I)V

    .line 61
    sput v1, Lcom/shopkick/app/application/SIP;->state:I

    return-void
.end method

.method public static onViewAttached(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 112
    sget-object v0, Lcom/shopkick/app/application/SIP;->screenToMonitor:Lcom/shopkick/app/screens/AppScreen;

    if-eq v0, p0, :cond_0

    .line 113
    invoke-static {p0}, Lcom/shopkick/app/application/SIP;->addPreDrawListener(Lcom/shopkick/app/screens/AppScreen;)V

    :cond_0
    return-void
.end method

.method private static removePreDrawListener()V
    .locals 2

    .line 134
    sget-object v0, Lcom/shopkick/app/application/SIP;->screenToMonitor:Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 136
    sget-object v1, Lcom/shopkick/app/application/SIP;->singleton:Lcom/shopkick/app/application/SIP;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x0

    .line 137
    sput-object v0, Lcom/shopkick/app/application/SIP;->screenToMonitor:Lcom/shopkick/app/screens/AppScreen;

    :cond_0
    return-void
.end method

.method private static removePreDrawListener(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 3

    .line 143
    :try_start_0
    invoke-static {}, Lcom/shopkick/app/application/SIP;->removePreDrawListener()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 145
    :catch_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3c1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 146
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remove listener from: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/shopkick/app/application/SIP;->screenToMonitor:Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", add listener to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 146
    invoke-virtual {v0, p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMessage(Ljava/lang/String;)V

    .line 148
    sget-object p0, Lcom/shopkick/app/application/SIP;->applogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method public static setupClientLogRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    .line 41
    sput-object p0, Lcom/shopkick/app/application/SIP;->clientLogRecordToUse:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    .line 123
    sget v0, Lcom/shopkick/app/application/SIP;->state:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 124
    sget v0, Lcom/shopkick/app/application/SIP;->current_eventType:I

    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->endEvent(I)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

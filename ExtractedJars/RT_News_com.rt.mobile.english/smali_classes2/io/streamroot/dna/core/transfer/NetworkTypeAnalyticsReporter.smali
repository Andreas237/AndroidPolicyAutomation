.class public final Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;
.super Ljava/lang/Object;
.source "NetworkTypeAnalyticsReporter.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetworkTypeAnalyticsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkTypeAnalyticsReporter.kt\nio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter\n*L\n1#1,72:1\n*E\n"
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0008R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "connectivityManager",
        "Landroid/net/ConnectivityManager;",
        "timer",
        "Lio/streamroot/dna/core/analytics/Timer;",
        "(Landroid/net/ConnectivityManager;Lio/streamroot/dna/core/analytics/Timer;)V",
        "currentNetworkType",
        "Lio/streamroot/dna/core/transfer/NetworkType;",
        "timeSpentOnCellularNetwork",
        "",
        "timeSpentOnWifiAndEthernetNetwork",
        "timeSpentWithoutNetwork",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "networkChange",
        "networkType",
        "Companion",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter$Companion;

.field private static final MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

.field private static final MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;


# instance fields
.field private volatile currentNetworkType:Lio/streamroot/dna/core/transfer/NetworkType;

.field private volatile timeSpentOnCellularNetwork:J

.field private volatile timeSpentOnWifiAndEthernetNetwork:J

.field private volatile timeSpentWithoutNetwork:J

.field private final timer:Lio/streamroot/dna/core/analytics/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->Companion:Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter$Companion;

    .line 67
    new-instance v0, Ljava/math/BigDecimal;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    sput-object v0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

    .line 70
    new-instance v0, Ljava/math/MathContext;

    sget-object v1, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ljava/math/MathContext;-><init>(ILjava/math/RoundingMode;)V

    sput-object v0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;

    return-void
.end method

.method public constructor <init>(Landroid/net/ConnectivityManager;Lio/streamroot/dna/core/analytics/Timer;)V
    .locals 1
    .param p1    # Landroid/net/ConnectivityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/analytics/Timer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timer:Lio/streamroot/dna/core/analytics/Timer;

    .line 34
    invoke-static {p1}, Lio/streamroot/dna/core/utils/ConnectivityManagerExtensionKt;->currentNetworkType(Landroid/net/ConnectivityManager;)Lio/streamroot/dna/core/transfer/NetworkType;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->currentNetworkType:Lio/streamroot/dna/core/transfer/NetworkType;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/ConnectivityManager;Lio/streamroot/dna/core/analytics/Timer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 22
    new-instance p2, Lio/streamroot/dna/core/analytics/Timer;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3, p4}, Lio/streamroot/dna/core/analytics/Timer;-><init>(Lio/streamroot/dna/core/utils/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;-><init>(Landroid/net/ConnectivityManager;Lio/streamroot/dna/core/analytics/Timer;)V

    return-void
.end method


# virtual methods
.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public declared-synchronized appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->currentNetworkType:Lio/streamroot/dna/core/transfer/NetworkType;

    invoke-virtual {p0, v0}, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V

    const-string v0, "timeSpentOnWifi"

    .line 56
    iget-wide v1, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnWifiAndEthernetNetwork:J

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    const-string v2, "BigDecimal.valueOf(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

    sget-object v3, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;

    invoke-virtual {v1, v2, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "timeSpentOnCellular"

    .line 57
    iget-wide v1, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnCellularNetwork:J

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    const-string v2, "BigDecimal.valueOf(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

    sget-object v3, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;

    invoke-virtual {v1, v2, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "timeSpentWithoutNetwork"

    .line 58
    iget-wide v1, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentWithoutNetwork:J

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    const-string v2, "BigDecimal.valueOf(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_IN_ONE_SECOND:Ljava/math/BigDecimal;

    sget-object v3, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->MILLIS_TO_SECOND_ROUNDING:Ljava/math/MathContext;

    invoke-virtual {v1, v2, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide/16 v0, 0x0

    .line 60
    iput-wide v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnWifiAndEthernetNetwork:J

    .line 61
    iput-wide v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnCellularNetwork:J

    .line 62
    iput-wide v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentWithoutNetwork:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 54
    monitor-exit p0

    throw p1
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final declared-synchronized networkChange(Lio/streamroot/dna/core/transfer/NetworkType;)V
    .locals 6
    .param p1    # Lio/streamroot/dna/core/transfer/NetworkType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "networkType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->currentNetworkType:Lio/streamroot/dna/core/transfer/NetworkType;

    sget-object v1, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lio/streamroot/dna/core/transfer/NetworkType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 47
    iget-wide v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentWithoutNetwork:J

    goto :goto_0

    .line 44
    :pswitch_0
    iget-wide v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnCellularNetwork:J

    iget-object v2, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timer:Lio/streamroot/dna/core/analytics/Timer;

    invoke-virtual {v2}, Lio/streamroot/dna/core/analytics/Timer;->elapseMillis()J

    move-result-wide v2

    add-long v4, v0, v2

    iput-wide v4, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnCellularNetwork:J

    goto :goto_1

    .line 41
    :pswitch_1
    iget-wide v0, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnWifiAndEthernetNetwork:J

    iget-object v2, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timer:Lio/streamroot/dna/core/analytics/Timer;

    invoke-virtual {v2}, Lio/streamroot/dna/core/analytics/Timer;->elapseMillis()J

    move-result-wide v2

    add-long v4, v0, v2

    iput-wide v4, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentOnWifiAndEthernetNetwork:J

    goto :goto_1

    .line 47
    :goto_0
    iget-object v2, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timer:Lio/streamroot/dna/core/analytics/Timer;

    invoke-virtual {v2}, Lio/streamroot/dna/core/analytics/Timer;->elapseMillis()J

    move-result-wide v2

    add-long v4, v0, v2

    iput-wide v4, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->timeSpentWithoutNetwork:J

    .line 50
    :goto_1
    iput-object p1, p0, Lio/streamroot/dna/core/transfer/NetworkTypeAnalyticsReporter;->currentNetworkType:Lio/streamroot/dna/core/transfer/NetworkType;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 38
    monitor-exit p0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public priority()I
    .locals 1

    .line 20
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

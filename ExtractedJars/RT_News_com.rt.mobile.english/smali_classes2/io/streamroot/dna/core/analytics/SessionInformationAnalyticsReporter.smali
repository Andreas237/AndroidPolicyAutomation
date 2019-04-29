.class public final Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;
.super Ljava/lang/Object;
.source "AnalyticsReporter.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnalyticsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsReporter.kt\nio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter\n*L\n1#1,138:1\n95#1,7:139\n*E\n*S KotlinDebug\n*F\n+ 1 AnalyticsReporter.kt\nio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter\n*L\n41#1,7:139\n*E\n"
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
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016JC\u0010\u0017\u001a\u00020\u000e28\u0008\u0004\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0008(\u001c\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\u000c\u0008\u001a\u0012\u0008\u0008\u001b\u0012\u0004\u0008\u0008(\u001e\u0012\u0004\u0012\u00020\u000e0\u0019H\u0082\u0008J\u0018\u0010\u001f\u001a\n  *\u0004\u0018\u00010\u00100\u00102\u0006\u0010!\u001a\u00020\u0010H\u0002R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "sessionInformation",
        "Lio/streamroot/dna/core/context/config/SessionInformation;",
        "infrastructure",
        "Lio/streamroot/dna/core/context/config/Infrastructure;",
        "customerProperties",
        "Lio/streamroot/dna/core/context/loader/CustomerProperties;",
        "streamrootKey",
        "",
        "(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/config/Infrastructure;Lio/streamroot/dna/core/context/loader/CustomerProperties;Ljava/lang/String;)V",
        "appendControlAnalytics",
        "",
        "controlPayload",
        "Lorg/json/JSONObject;",
        "appendStatsAnalytics",
        "statsPayload",
        "appendSupportAnalytics",
        "supportPayload",
        "appendTrafficAnalytics",
        "trafficPayload",
        "currentState",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "shutdownCause",
        "",
        "isLastPayload",
        "enrichSessionInformation",
        "kotlin.jvm.PlatformType",
        "payload",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

.field private final infrastructure:Lio/streamroot/dna/core/context/config/Infrastructure;

.field private final sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;

.field private final streamrootKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/config/Infrastructure;Lio/streamroot/dna/core/context/loader/CustomerProperties;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/context/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/streamroot/dna/core/context/config/Infrastructure;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/streamroot/dna/core/context/loader/CustomerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "stateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionInformation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infrastructure"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerProperties"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamrootKey"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    iput-object p2, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    iput-object p3, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->infrastructure:Lio/streamroot/dna/core/context/config/Infrastructure;

    iput-object p4, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    iput-object p5, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->streamrootKey:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/config/Infrastructure;Lio/streamroot/dna/core/context/loader/CustomerProperties;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 36
    invoke-virtual {p2}, Lio/streamroot/dna/core/context/config/SessionInformation;->getStreamrootKey()Ljava/lang/String;

    move-result-object p5

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;-><init>(Lio/streamroot/dna/core/context/state/StateManager;Lio/streamroot/dna/core/context/config/SessionInformation;Lio/streamroot/dna/core/context/config/Infrastructure;Lio/streamroot/dna/core/context/loader/CustomerProperties;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->customerProperties:Lio/streamroot/dna/core/context/loader/CustomerProperties;

    return-object p0
.end method

.method public static final synthetic access$getInfrastructure$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/config/Infrastructure;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->infrastructure:Lio/streamroot/dna/core/context/config/Infrastructure;

    return-object p0
.end method

.method public static final synthetic access$getSessionInformation$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/config/SessionInformation;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    return-object p0
.end method

.method public static final synthetic access$getStateManager$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/state/StateManager;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    iget-object p0, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    return-object p0
.end method

.method private final currentState(Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 95
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getStateManager$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/state/StateManager;->getCurrentState()Lio/streamroot/dna/core/State;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    const-string v0, "running"

    const/4 v1, 0x0

    .line 99
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_0
    const-string v0, "user"

    .line 98
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_1
    const-string v0, "loadingFailed"

    .line 97
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_2
    const-string v0, "watchdog"

    .line 96
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final enrichSessionInformation(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    const-string v0, "customer"

    .line 88
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->streamrootKey:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "content"

    .line 89
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/Media;->getContentId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "peerAgentVersion"

    const-string v1, "5.7.0"

    .line 90
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "platform"

    const-string v1, "android"

    .line 91
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "token"

    .line 92
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
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

    .line 48
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->enrichSessionInformation(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->enrichSessionInformation(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 139
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getStateManager$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/state/StateManager;

    move-result-object v0

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/state/StateManager;->getCurrentState()Lio/streamroot/dna/core/State;

    move-result-object v0

    sget-object v1, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lio/streamroot/dna/core/State;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    const-string v0, "running"

    const/4 v1, 0x0

    :goto_0
    const-string v2, "shutdownCause"

    .line 42
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "isLastPayload"

    .line 43
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_1

    :pswitch_0
    const-string v0, "user"

    goto :goto_0

    :pswitch_1
    const-string v0, "loadingFailed"

    goto :goto_0

    :pswitch_2
    const-string v0, "watchdog"

    goto :goto_0

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->enrichSessionInformation(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    const-string v0, "backend"

    .line 57
    new-instance v1, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$1;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$1;-><init>(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "media"

    .line 62
    new-instance v1, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;-><init>(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "native"

    .line 67
    new-instance v1, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$3;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$3;-><init>(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "properties"

    .line 71
    new-instance v1, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;-><init>(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "srElements"

    .line 82
    new-instance v1, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$5;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$5;-><init>(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

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

    .line 52
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->enrichSessionInformation(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    return-void
.end method

.method public priority()I
    .locals 1

    .line 31
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

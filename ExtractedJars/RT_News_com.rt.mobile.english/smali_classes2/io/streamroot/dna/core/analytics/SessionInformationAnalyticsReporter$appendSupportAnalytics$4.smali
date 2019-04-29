.class final Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;
.super Lkotlin/jvm/internal/Lambda;
.source "AnalyticsReporter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->appendSupportAnalytics(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lorg/json/JSONObject;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lorg/json/JSONObject;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->invoke(Lorg/json/JSONObject;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/json/JSONObject;)V
    .locals 3
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestedProperty"

    .line 72
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getSessionInformation$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getProperty()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "usedProperty"

    .line 73
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, ""

    :goto_1
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "cellularOtherDownload"

    .line 74
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getCellularOtherDownload()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "cellularOtherUpload"

    .line 75
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getCellularOtherUpload()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "wifiEthernetDownload"

    .line 76
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getWifiEthernetDownload()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "wifiEthernetUpload"

    .line 77
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getWifiEthernetUpload()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "ssaiEnabled"

    .line 78
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getSsaiEnabled()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "superSeederRatio"

    .line 79
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getSuperSeederRatio()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    goto :goto_3

    :cond_3
    const-wide/16 v1, 0x0

    :goto_3
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v0, "activationRatio"

    .line 80
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$4;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getCustomerProperties$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/loader/CustomerProperties;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/loader/CustomerProperties;->getActivationRatio()D

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    return-void
.end method

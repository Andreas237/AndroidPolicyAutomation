.class final Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnalyticsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsReporter.kt\nio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2\n*L\n1#1,138:1\n*E\n"
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

    iput-object p1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;->invoke(Lorg/json/JSONObject;)V

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

    const-string v0, "contentUrl"

    .line 63
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getSessionInformation$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/Media;->getOriginalUrl()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "latency"

    .line 64
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getSessionInformation$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/Media;->getLatency()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "videoFormat"

    .line 65
    iget-object v1, p0, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter$appendSupportAnalytics$2;->this$0:Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;

    invoke-static {v1}, Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;->access$getSessionInformation$p(Lio/streamroot/dna/core/analytics/SessionInformationAnalyticsReporter;)Lio/streamroot/dna/core/context/config/SessionInformation;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/SessionInformation;->getMedia()Lio/streamroot/dna/core/context/config/Media;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/Media;->getFormat()Lio/streamroot/dna/core/context/config/StreamFormat;

    move-result-object v1

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/config/StreamFormat;->name()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "(this as java.lang.String).toLowerCase()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

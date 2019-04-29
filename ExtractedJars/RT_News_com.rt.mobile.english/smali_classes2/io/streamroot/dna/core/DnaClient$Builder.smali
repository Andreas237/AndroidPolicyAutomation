.class final Lio/streamroot/dna/core/DnaClient$Builder;
.super Ljava/lang/Object;
.source "DnaClient.kt"

# interfaces
.implements Lio/streamroot/dna/core/DnaClientBuilder;
.implements Lio/streamroot/dna/core/InteractorBuilder;
.implements Lio/streamroot/dna/core/Configure;
.implements Lio/streamroot/dna/core/OptionalConfigBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/DnaClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/streamroot/dna/core/DnaClientBuilder;",
        "Lio/streamroot/dna/core/InteractorBuilder<",
        "Lio/streamroot/dna/core/Configure;",
        ">;",
        "Lio/streamroot/dna/core/Configure;",
        "Lio/streamroot/dna/core/OptionalConfigBuilder;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDnaClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DnaClient.kt\nio/streamroot/dna/core/DnaClient$Builder\n*L\n1#1,406:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010B\u001a\u000201H\u0016J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\rH\u0016J!\u0010E\u001a\u00020F2\u0017\u0010G\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020F0H\u00a2\u0006\u0002\u0008IH\u0016J\u0010\u0010J\u001a\u00020\u00042\u0006\u0010J\u001a\u000201H\u0016J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u000201H\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010K\u001a\u00020F2\u0006\u0010L\u001a\u00020DH\u0016J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010<\u001a\u000201H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001a\u0010*\u001a\u00020+X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u000101X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008=\u00103\"\u0004\u0008>\u00105R\u001c\u0010?\u001a\u0004\u0018\u000101X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u00103\"\u0004\u0008A\u00105\u00a8\u0006M"
    }
    d2 = {
        "Lio/streamroot/dna/core/DnaClient$Builder;",
        "Lio/streamroot/dna/core/DnaClientBuilder;",
        "Lio/streamroot/dna/core/InteractorBuilder;",
        "Lio/streamroot/dna/core/Configure;",
        "Lio/streamroot/dna/core/OptionalConfigBuilder;",
        "()V",
        "backendHttpUrl",
        "Lokhttp3/HttpUrl;",
        "getBackendHttpUrl$dna_core_release",
        "()Lokhttp3/HttpUrl;",
        "setBackendHttpUrl$dna_core_release",
        "(Lokhttp3/HttpUrl;)V",
        "bandwidthListener",
        "Lio/streamroot/dna/core/BandwidthListener;",
        "getBandwidthListener$dna_core_release",
        "()Lio/streamroot/dna/core/BandwidthListener;",
        "setBandwidthListener$dna_core_release",
        "(Lio/streamroot/dna/core/BandwidthListener;)V",
        "context",
        "Landroid/content/Context;",
        "getContext$dna_core_release",
        "()Landroid/content/Context;",
        "setContext$dna_core_release",
        "(Landroid/content/Context;)V",
        "experimentalFlags",
        "",
        "getExperimentalFlags$dna_core_release",
        "()J",
        "setExperimentalFlags$dna_core_release",
        "(J)V",
        "latency",
        "",
        "getLatency$dna_core_release",
        "()I",
        "setLatency$dna_core_release",
        "(I)V",
        "logLevel",
        "Lio/streamroot/dna/core/log/LogLevel;",
        "getLogLevel$dna_core_release",
        "()Lio/streamroot/dna/core/log/LogLevel;",
        "setLogLevel$dna_core_release",
        "(Lio/streamroot/dna/core/log/LogLevel;)V",
        "playerInteractor",
        "Lio/streamroot/dna/core/PlayerInteractor;",
        "getPlayerInteractor$dna_core_release",
        "()Lio/streamroot/dna/core/PlayerInteractor;",
        "setPlayerInteractor$dna_core_release",
        "(Lio/streamroot/dna/core/PlayerInteractor;)V",
        "property",
        "",
        "getProperty$dna_core_release",
        "()Ljava/lang/String;",
        "setProperty$dna_core_release",
        "(Ljava/lang/String;)V",
        "qosModule",
        "Lio/streamroot/dna/core/QosModule;",
        "getQosModule$dna_core_release",
        "()Lio/streamroot/dna/core/QosModule;",
        "setQosModule$dna_core_release",
        "(Lio/streamroot/dna/core/QosModule;)V",
        "streamrootKey",
        "getStreamrootKey$dna_core_release",
        "setStreamrootKey$dna_core_release",
        "userContentId",
        "getUserContentId$dna_core_release",
        "setUserContentId$dna_core_release",
        "backendHost",
        "backendUri",
        "Landroid/net/Uri;",
        "configure",
        "Lio/streamroot/dna/core/DnaClient;",
        "init",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
        "contentId",
        "start",
        "manifestUri",
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
.field private backendHttpUrl:Lokhttp3/HttpUrl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private experimentalFlags:J

.field private latency:I

.field private logLevel:Lio/streamroot/dna/core/log/LogLevel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private property:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private qosModule:Lio/streamroot/dna/core/QosModule;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private streamrootKey:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private userContentId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    sget-object v0, Lio/streamroot/dna/core/log/LogLevel;->ERROR:Lio/streamroot/dna/core/log/LogLevel;

    iput-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->logLevel:Lio/streamroot/dna/core/log/LogLevel;

    const/4 v0, -0x1

    .line 174
    iput v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->latency:I

    const-string v0, "https://backend.dna-delivery.com"

    .line 176
    invoke-static {v0}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    const-string v1, "HttpUrl.parse(\"https://b\u2026kend.dna-delivery.com\")!!"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->backendHttpUrl:Lokhttp3/HttpUrl;

    return-void
.end method


# virtual methods
.method public backendHost(Ljava/lang/String;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "backendHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/16 v1, 0x60

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "` is not valid."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 246
    :cond_0
    :try_start_0
    new-instance v0, Lokhttp3/HttpUrl$Builder;

    invoke-direct {v0}, Lokhttp3/HttpUrl$Builder;-><init>()V

    const-string v2, "https"

    .line 248
    invoke-virtual {v0, v2}, Lokhttp3/HttpUrl$Builder;->scheme(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 249
    move-object v3, p1

    check-cast v3, Ljava/lang/CharSequence;

    const/16 v4, 0x3a

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    if-lez v2, :cond_1

    const/4 v3, 0x0

    .line 251
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/text/StringsKt;->substring(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lokhttp3/HttpUrl$Builder;->host(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    add-int/lit8 v2, v2, 0x1

    .line 252
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Lokhttp3/HttpUrl$Builder;->port(I)Lokhttp3/HttpUrl$Builder;

    goto :goto_0

    .line 254
    :cond_1
    invoke-virtual {v0, p1}, Lokhttp3/HttpUrl$Builder;->host(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 257
    :goto_0
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->backendHttpUrl:Lokhttp3/HttpUrl;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 261
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1

    .line 257
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "` is not valid."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 259
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "` is not valid."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {v2, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
.end method

.method public backendUri(Landroid/net/Uri;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 3
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "backendUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string p1, "HttpUrl.parse(backendUri\u2026ackendUri] is not valid\")"

    .line 237
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    iput-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->backendHttpUrl:Lokhttp3/HttpUrl;

    .line 240
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1

    .line 237
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The backend url ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "] is not valid"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public bandwidthListener(Lio/streamroot/dna/core/BandwidthListener;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 1
    .param p1    # Lio/streamroot/dna/core/BandwidthListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "bandwidthListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;

    .line 266
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

.method public configure(Lkotlin/jvm/functions/Function1;)Lio/streamroot/dna/core/DnaClient;
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/streamroot/dna/core/OptionalConfigBuilder;",
            "Lio/streamroot/dna/core/DnaClient;",
            ">;)",
            "Lio/streamroot/dna/core/DnaClient;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/DnaClient;

    return-object p1
.end method

.method public contentId(Ljava/lang/String;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "contentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 223
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ContentId can\'t be empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 226
    :cond_1
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->userContentId:Ljava/lang/String;

    .line 227
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

.method public context(Landroid/content/Context;)Lio/streamroot/dna/core/InteractorBuilder;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lio/streamroot/dna/core/InteractorBuilder<",
            "Lio/streamroot/dna/core/Configure;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->context:Landroid/content/Context;

    .line 185
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/InteractorBuilder;

    return-object p1
.end method

.method public bridge synthetic context(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 170
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/DnaClient$Builder;->context(Landroid/content/Context;)Lio/streamroot/dna/core/InteractorBuilder;

    move-result-object p1

    return-object p1
.end method

.method public experimentalFlags(J)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 198
    iget-wide v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->experimentalFlags:J

    or-long v2, p1, v0

    iput-wide v2, p0, Lio/streamroot/dna/core/DnaClient$Builder;->experimentalFlags:J

    .line 199
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

.method public final getBackendHttpUrl$dna_core_release()Lokhttp3/HttpUrl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 176
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->backendHttpUrl:Lokhttp3/HttpUrl;

    return-object v0
.end method

.method public final getBandwidthListener$dna_core_release()Lio/streamroot/dna/core/BandwidthListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 177
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;

    return-object v0
.end method

.method public final getContext$dna_core_release()Landroid/content/Context;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 171
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->context:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v1, "context"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getExperimentalFlags$dna_core_release()J
    .locals 2

    .line 179
    iget-wide v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->experimentalFlags:J

    return-wide v0
.end method

.method public final getLatency$dna_core_release()I
    .locals 1

    .line 174
    iget v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->latency:I

    return v0
.end method

.method public final getLogLevel$dna_core_release()Lio/streamroot/dna/core/log/LogLevel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 173
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->logLevel:Lio/streamroot/dna/core/log/LogLevel;

    return-object v0
.end method

.method public final getPlayerInteractor$dna_core_release()Lio/streamroot/dna/core/PlayerInteractor;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 172
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    if-nez v0, :cond_0

    const-string v1, "playerInteractor"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getProperty$dna_core_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 178
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->property:Ljava/lang/String;

    return-object v0
.end method

.method public final getQosModule$dna_core_release()Lio/streamroot/dna/core/QosModule;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 180
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->qosModule:Lio/streamroot/dna/core/QosModule;

    return-object v0
.end method

.method public final getStreamrootKey$dna_core_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 181
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->streamrootKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserContentId$dna_core_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 175
    iget-object v0, p0, Lio/streamroot/dna/core/DnaClient$Builder;->userContentId:Ljava/lang/String;

    return-object v0
.end method

.method public latency(I)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 208
    iput p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->latency:I

    .line 209
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

.method public logLevel(Lio/streamroot/dna/core/log/LogLevel;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 1
    .param p1    # Lio/streamroot/dna/core/log/LogLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "logLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->logLevel:Lio/streamroot/dna/core/log/LogLevel;

    .line 204
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

.method public playerInteractor(Lio/streamroot/dna/core/PlayerInteractor;)Lio/streamroot/dna/core/Configure;
    .locals 1
    .param p1    # Lio/streamroot/dna/core/PlayerInteractor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "playerInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    .line 190
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/Configure;

    return-object p1
.end method

.method public bridge synthetic playerInteractor(Lio/streamroot/dna/core/PlayerInteractor;)Ljava/lang/Object;
    .locals 0

    .line 170
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/DnaClient$Builder;->playerInteractor(Lio/streamroot/dna/core/PlayerInteractor;)Lio/streamroot/dna/core/Configure;

    move-result-object p1

    return-object p1
.end method

.method public property(Ljava/lang/String;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->property:Ljava/lang/String;

    .line 232
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

.method public qosModule(Lio/streamroot/dna/core/QosModule;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 1
    .param p1    # Lio/streamroot/dna/core/QosModule;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "qosModule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->qosModule:Lio/streamroot/dna/core/QosModule;

    .line 271
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

.method public final setBackendHttpUrl$dna_core_release(Lokhttp3/HttpUrl;)V
    .locals 1
    .param p1    # Lokhttp3/HttpUrl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->backendHttpUrl:Lokhttp3/HttpUrl;

    return-void
.end method

.method public final setBandwidthListener$dna_core_release(Lio/streamroot/dna/core/BandwidthListener;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/BandwidthListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 177
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;

    return-void
.end method

.method public final setContext$dna_core_release(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->context:Landroid/content/Context;

    return-void
.end method

.method public final setExperimentalFlags$dna_core_release(J)V
    .locals 0

    .line 179
    iput-wide p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->experimentalFlags:J

    return-void
.end method

.method public final setLatency$dna_core_release(I)V
    .locals 0

    .line 174
    iput p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->latency:I

    return-void
.end method

.method public final setLogLevel$dna_core_release(Lio/streamroot/dna/core/log/LogLevel;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/log/LogLevel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->logLevel:Lio/streamroot/dna/core/log/LogLevel;

    return-void
.end method

.method public final setPlayerInteractor$dna_core_release(Lio/streamroot/dna/core/PlayerInteractor;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/PlayerInteractor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    return-void
.end method

.method public final setProperty$dna_core_release(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 178
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->property:Ljava/lang/String;

    return-void
.end method

.method public final setQosModule$dna_core_release(Lio/streamroot/dna/core/QosModule;)V
    .locals 0
    .param p1    # Lio/streamroot/dna/core/QosModule;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 180
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->qosModule:Lio/streamroot/dna/core/QosModule;

    return-void
.end method

.method public final setStreamrootKey$dna_core_release(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 181
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->streamrootKey:Ljava/lang/String;

    return-void
.end method

.method public final setUserContentId$dna_core_release(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 175
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->userContentId:Ljava/lang/String;

    return-void
.end method

.method public start(Landroid/net/Uri;)Lio/streamroot/dna/core/DnaClient;
    .locals 18
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "manifestUri"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v4

    if-eqz v4, :cond_8

    const-string v1, "HttpUrl.parse(manifestUr\u2026nifestUri] is not valid\")"

    .line 276
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    iget-object v1, v0, Lio/streamroot/dna/core/DnaClient$Builder;->userContentId:Ljava/lang/String;

    invoke-static {v4, v1}, Lio/streamroot/dna/core/stream/ContentIdGeneratorKt;->generateDefaultContentId(Lokhttp3/HttpUrl;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 280
    iget-object v1, v0, Lio/streamroot/dna/core/DnaClient$Builder;->streamrootKey:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_3

    iget-object v1, v0, Lio/streamroot/dna/core/DnaClient$Builder;->streamrootKey:Ljava/lang/String;

    if-nez v1, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    :goto_2
    move-object v6, v1

    goto :goto_3

    .line 281
    :cond_3
    sget-object v1, Lio/streamroot/dna/core/utils/Lookup;->INSTANCE:Lio/streamroot/dna/core/utils/Lookup;

    iget-object v2, v0, Lio/streamroot/dna/core/DnaClient$Builder;->context:Landroid/content/Context;

    if-nez v2, :cond_4

    const-string v3, "context"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v1, v2}, Lio/streamroot/dna/core/utils/Lookup;->streamrootKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    goto :goto_2

    .line 285
    :goto_3
    new-instance v1, Lio/streamroot/dna/core/DnaClient;

    .line 287
    iget-object v5, v0, Lio/streamroot/dna/core/DnaClient$Builder;->backendHttpUrl:Lokhttp3/HttpUrl;

    .line 289
    iget v7, v0, Lio/streamroot/dna/core/DnaClient$Builder;->latency:I

    .line 291
    iget-object v9, v0, Lio/streamroot/dna/core/DnaClient$Builder;->property:Ljava/lang/String;

    .line 292
    iget-wide v10, v0, Lio/streamroot/dna/core/DnaClient$Builder;->experimentalFlags:J

    .line 293
    iget-object v12, v0, Lio/streamroot/dna/core/DnaClient$Builder;->logLevel:Lio/streamroot/dna/core/log/LogLevel;

    .line 294
    iget-object v13, v0, Lio/streamroot/dna/core/DnaClient$Builder;->context:Landroid/content/Context;

    if-nez v13, :cond_5

    const-string v2, "context"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 295
    :cond_5
    iget-object v14, v0, Lio/streamroot/dna/core/DnaClient$Builder;->playerInteractor:Lio/streamroot/dna/core/PlayerInteractor;

    if-nez v14, :cond_6

    const-string v2, "playerInteractor"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 296
    :cond_6
    iget-object v15, v0, Lio/streamroot/dna/core/DnaClient$Builder;->qosModule:Lio/streamroot/dna/core/QosModule;

    .line 297
    iget-object v2, v0, Lio/streamroot/dna/core/DnaClient$Builder;->bandwidthListener:Lio/streamroot/dna/core/BandwidthListener;

    const/16 v17, 0x0

    move-object v3, v1

    move-object/from16 v16, v2

    .line 285
    invoke-direct/range {v3 .. v17}, Lio/streamroot/dna/core/DnaClient;-><init>(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLio/streamroot/dna/core/log/LogLevel;Landroid/content/Context;Lio/streamroot/dna/core/PlayerInteractor;Lio/streamroot/dna/core/QosModule;Lio/streamroot/dna/core/BandwidthListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 282
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "A StreamrootKey must be set in the DnaBuilder or in meta-data of your application manifest"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 276
    :cond_8
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The manifest url ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] is not valid"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    throw v2
.end method

.method public streamrootKey(Ljava/lang/String;)Lio/streamroot/dna/core/OptionalConfigBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "streamrootKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 214
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "StreamrootKey can\'t be empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 217
    :cond_1
    iput-object p1, p0, Lio/streamroot/dna/core/DnaClient$Builder;->streamrootKey:Ljava/lang/String;

    .line 218
    move-object p1, p0

    check-cast p1, Lio/streamroot/dna/core/OptionalConfigBuilder;

    return-object p1
.end method

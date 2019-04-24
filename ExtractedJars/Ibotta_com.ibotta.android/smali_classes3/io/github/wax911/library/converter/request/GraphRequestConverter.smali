.class public Lio/github/wax911/library/converter/request/GraphRequestConverter;
.super Ljava/lang/Object;
.source "GraphRequestConverter.kt"

# interfaces
.implements Lretrofit2/Converter;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Converter<",
        "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
        "Lokhttp3/RequestBody;",
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
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u0008X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/github/wax911/library/converter/request/GraphRequestConverter;",
        "Lretrofit2/Converter;",
        "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
        "Lokhttp3/RequestBody;",
        "methodAnnotations",
        "",
        "",
        "graphProcessor",
        "Lio/github/wax911/library/annotation/processor/GraphProcessor;",
        "gson",
        "Lcom/google/gson/Gson;",
        "([Ljava/lang/annotation/Annotation;Lio/github/wax911/library/annotation/processor/GraphProcessor;Lcom/google/gson/Gson;)V",
        "getGraphProcessor",
        "()Lio/github/wax911/library/annotation/processor/GraphProcessor;",
        "getGson",
        "()Lcom/google/gson/Gson;",
        "getMethodAnnotations",
        "()[Ljava/lang/annotation/Annotation;",
        "[Ljava/lang/annotation/Annotation;",
        "convert",
        "containerBuilder",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final graphProcessor:Lio/github/wax911/library/annotation/processor/GraphProcessor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final gson:Lcom/google/gson/Gson;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final methodAnnotations:[Ljava/lang/annotation/Annotation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/annotation/Annotation;Lio/github/wax911/library/annotation/processor/GraphProcessor;Lcom/google/gson/Gson;)V
    .locals 1
    .param p1    # [Ljava/lang/annotation/Annotation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/github/wax911/library/annotation/processor/GraphProcessor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/gson/Gson;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "methodAnnotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphProcessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gson"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/wax911/library/converter/request/GraphRequestConverter;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    iput-object p2, p0, Lio/github/wax911/library/converter/request/GraphRequestConverter;->graphProcessor:Lio/github/wax911/library/annotation/processor/GraphProcessor;

    iput-object p3, p0, Lio/github/wax911/library/converter/request/GraphRequestConverter;->gson:Lcom/google/gson/Gson;

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    check-cast p1, Lio/github/wax911/library/model/request/QueryContainerBuilder;

    invoke-virtual {p0, p1}, Lio/github/wax911/library/converter/request/GraphRequestConverter;->convert(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public convert(Lio/github/wax911/library/model/request/QueryContainerBuilder;)Lokhttp3/RequestBody;
    .locals 2
    .param p1    # Lio/github/wax911/library/model/request/QueryContainerBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "containerBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lio/github/wax911/library/converter/request/GraphRequestConverter;->graphProcessor:Lio/github/wax911/library/annotation/processor/GraphProcessor;

    iget-object v1, p0, Lio/github/wax911/library/converter/request/GraphRequestConverter;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, v1}, Lio/github/wax911/library/annotation/processor/GraphProcessor;->getQuery([Ljava/lang/annotation/Annotation;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/github/wax911/library/model/request/QueryContainerBuilder;->setQuery(Ljava/lang/String;)Lio/github/wax911/library/model/request/QueryContainerBuilder;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lio/github/wax911/library/model/request/QueryContainerBuilder;->build()Lio/github/wax911/library/model/request/QueryContainer;

    move-result-object p1

    .line 33
    iget-object v0, p0, Lio/github/wax911/library/converter/request/GraphRequestConverter;->gson:Lcom/google/gson/Gson;

    instance-of v1, v0, Lcom/google/gson/Gson;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/google/gson/Gson;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v0, "GraphRequestConverter"

    .line 34
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "application/graphql"

    .line 35
    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    invoke-static {v0, p1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p1

    const-string v0, "RequestBody.create(Media\u2026ter.MimeType), queryJson)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

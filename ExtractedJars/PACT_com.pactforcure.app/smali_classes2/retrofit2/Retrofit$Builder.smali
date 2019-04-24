.class public final Lretrofit2/Retrofit$Builder;
.super Ljava/lang/Object;
.source "Retrofit.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/Retrofit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private adapterFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lretrofit2/CallAdapter$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private baseUrl:Lokhttp3/HttpUrl;

.field private callFactory:Lokhttp3/Call$Factory;

.field private callbackExecutor:Ljava/util/concurrent/Executor;

.field private converterFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lretrofit2/Converter$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private platform:Lretrofit2/Platform;

.field private validateEagerly:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 402
    invoke-static {}, Lretrofit2/Platform;->get()Lretrofit2/Platform;

    move-result-object v0

    invoke-direct {p0, v0}, Lretrofit2/Retrofit$Builder;-><init>(Lretrofit2/Platform;)V

    .line 403
    return-void
.end method

.method constructor <init>(Lretrofit2/Platform;)V
    .locals 2
    .param p1, "platform"    # Lretrofit2/Platform;

    .prologue
    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 389
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    .line 390
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->adapterFactories:Ljava/util/List;

    .line 395
    iput-object p1, p0, Lretrofit2/Retrofit$Builder;->platform:Lretrofit2/Platform;

    .line 398
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    new-instance v1, Lretrofit2/BuiltInConverters;

    invoke-direct {v1}, Lretrofit2/BuiltInConverters;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 399
    return-void
.end method


# virtual methods
.method public addCallAdapterFactory(Lretrofit2/CallAdapter$Factory;)Lretrofit2/Retrofit$Builder;
    .locals 2
    .param p1, "factory"    # Lretrofit2/CallAdapter$Factory;

    .prologue
    .line 513
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->adapterFactories:Ljava/util/List;

    const-string v1, "factory == null"

    invoke-static {p1, v1}, Lretrofit2/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 514
    return-object p0
.end method

.method public addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;
    .locals 2
    .param p1, "factory"    # Lretrofit2/Converter$Factory;

    .prologue
    .line 504
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    const-string v1, "factory == null"

    invoke-static {p1, v1}, Lretrofit2/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    return-object p0
.end method

.method public baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;
    .locals 4
    .param p1, "baseUrl"    # Ljava/lang/String;

    .prologue
    .line 434
    const-string v1, "baseUrl == null"

    invoke-static {p1, v1}, Lretrofit2/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 435
    invoke-static {p1}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    .line 436
    .local v0, "httpUrl":Lokhttp3/HttpUrl;
    if-nez v0, :cond_0

    .line 437
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Illegal URL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 439
    :cond_0
    invoke-virtual {p0, v0}, Lretrofit2/Retrofit$Builder;->baseUrl(Lokhttp3/HttpUrl;)Lretrofit2/Retrofit$Builder;

    move-result-object v1

    return-object v1
.end method

.method public baseUrl(Lokhttp3/HttpUrl;)Lretrofit2/Retrofit$Builder;
    .locals 4
    .param p1, "baseUrl"    # Lokhttp3/HttpUrl;

    .prologue
    .line 493
    const-string v1, "baseUrl == null"

    invoke-static {p1, v1}, Lretrofit2/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 494
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->pathSegments()Ljava/util/List;

    move-result-object v0

    .line 495
    .local v0, "pathSegments":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v1, ""

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 496
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baseUrl must end in /: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 498
    :cond_0
    iput-object p1, p0, Lretrofit2/Retrofit$Builder;->baseUrl:Lokhttp3/HttpUrl;

    .line 499
    return-object p0
.end method

.method public build()Lretrofit2/Retrofit;
    .locals 7

    .prologue
    .line 545
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->baseUrl:Lokhttp3/HttpUrl;

    if-nez v0, :cond_0

    .line 546
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Base URL required."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 549
    :cond_0
    iget-object v1, p0, Lretrofit2/Retrofit$Builder;->callFactory:Lokhttp3/Call$Factory;

    .line 550
    .local v1, "callFactory":Lokhttp3/Call$Factory;
    if-nez v1, :cond_1

    .line 551
    new-instance v1, Lokhttp3/OkHttpClient;

    .end local v1    # "callFactory":Lokhttp3/Call$Factory;
    invoke-direct {v1}, Lokhttp3/OkHttpClient;-><init>()V

    .line 554
    .restart local v1    # "callFactory":Lokhttp3/Call$Factory;
    :cond_1
    iget-object v5, p0, Lretrofit2/Retrofit$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 555
    .local v5, "callbackExecutor":Ljava/util/concurrent/Executor;
    if-nez v5, :cond_2

    .line 556
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->platform:Lretrofit2/Platform;

    invoke-virtual {v0}, Lretrofit2/Platform;->defaultCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v5

    .line 560
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->adapterFactories:Ljava/util/List;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 561
    .local v4, "adapterFactories":Ljava/util/List;, "Ljava/util/List<Lretrofit2/CallAdapter$Factory;>;"
    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->platform:Lretrofit2/Platform;

    invoke-virtual {v0, v5}, Lretrofit2/Platform;->defaultCallAdapterFactory(Ljava/util/concurrent/Executor;)Lretrofit2/CallAdapter$Factory;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 564
    new-instance v3, Ljava/util/ArrayList;

    iget-object v0, p0, Lretrofit2/Retrofit$Builder;->converterFactories:Ljava/util/List;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 566
    .local v3, "converterFactories":Ljava/util/List;, "Ljava/util/List<Lretrofit2/Converter$Factory;>;"
    new-instance v0, Lretrofit2/Retrofit;

    iget-object v2, p0, Lretrofit2/Retrofit$Builder;->baseUrl:Lokhttp3/HttpUrl;

    iget-boolean v6, p0, Lretrofit2/Retrofit$Builder;->validateEagerly:Z

    invoke-direct/range {v0 .. v6}, Lretrofit2/Retrofit;-><init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/Executor;Z)V

    return-object v0
.end method

.method public callFactory(Lokhttp3/Call$Factory;)Lretrofit2/Retrofit$Builder;
    .locals 1
    .param p1, "factory"    # Lokhttp3/Call$Factory;

    .prologue
    .line 424
    const-string v0, "factory == null"

    invoke-static {p1, v0}, Lretrofit2/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/Call$Factory;

    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->callFactory:Lokhttp3/Call$Factory;

    .line 425
    return-object p0
.end method

.method public callbackExecutor(Ljava/util/concurrent/Executor;)Lretrofit2/Retrofit$Builder;
    .locals 1
    .param p1, "executor"    # Ljava/util/concurrent/Executor;

    .prologue
    .line 525
    const-string v0, "executor == null"

    invoke-static {p1, v0}, Lretrofit2/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lretrofit2/Retrofit$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 526
    return-object p0
.end method

.method public client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;
    .locals 1
    .param p1, "client"    # Lokhttp3/OkHttpClient;

    .prologue
    .line 415
    const-string v0, "client == null"

    invoke-static {p1, v0}, Lretrofit2/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/Call$Factory;

    invoke-virtual {p0, v0}, Lretrofit2/Retrofit$Builder;->callFactory(Lokhttp3/Call$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object v0

    return-object v0
.end method

.method public validateEagerly(Z)Lretrofit2/Retrofit$Builder;
    .locals 0
    .param p1, "validateEagerly"    # Z

    .prologue
    .line 534
    iput-boolean p1, p0, Lretrofit2/Retrofit$Builder;->validateEagerly:Z

    .line 535
    return-object p0
.end method

.class public Lretrofit/RestAdapter$Builder;
.super Ljava/lang/Object;
.source "RestAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RestAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private callbackExecutor:Ljava/util/concurrent/Executor;

.field private clientProvider:Lretrofit/client/Client$Provider;

.field private converter:Lretrofit/converter/Converter;

.field private endpoint:Lretrofit/Endpoint;

.field private errorHandler:Lretrofit/ErrorHandler;

.field private httpExecutor:Ljava/util/concurrent/Executor;

.field private log:Lretrofit/RestAdapter$Log;

.field private logLevel:Lretrofit/RestAdapter$LogLevel;

.field private profiler:Lretrofit/Profiler;

.field private requestInterceptor:Lretrofit/RequestInterceptor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 543
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 553
    sget-object v0, Lretrofit/RestAdapter$LogLevel;->NONE:Lretrofit/RestAdapter$LogLevel;

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->logLevel:Lretrofit/RestAdapter$LogLevel;

    return-void
.end method

.method private ensureSaneDefaults()V
    .locals 1

    .line 682
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    if-nez v0, :cond_0

    .line 683
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultConverter()Lretrofit/converter/Converter;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    .line 685
    :cond_0
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    if-nez v0, :cond_1

    .line 686
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultClient()Lretrofit/client/Client$Provider;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    .line 688
    :cond_1
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_2

    .line 689
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultHttpExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    .line 691
    :cond_2
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_3

    .line 692
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 694
    :cond_3
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    if-nez v0, :cond_4

    .line 695
    sget-object v0, Lretrofit/ErrorHandler;->DEFAULT:Lretrofit/ErrorHandler;

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    .line 697
    :cond_4
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    if-nez v0, :cond_5

    .line 698
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultLog()Lretrofit/RestAdapter$Log;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    .line 700
    :cond_5
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    if-nez v0, :cond_6

    .line 701
    sget-object v0, Lretrofit/RequestInterceptor;->NONE:Lretrofit/RequestInterceptor;

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    :cond_6
    return-void
.end method


# virtual methods
.method public build()Lretrofit/RestAdapter;
    .locals 13

    .line 673
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    if-eqz v0, :cond_0

    .line 676
    invoke-direct {p0}, Lretrofit/RestAdapter$Builder;->ensureSaneDefaults()V

    .line 677
    new-instance v0, Lretrofit/RestAdapter;

    iget-object v2, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    iget-object v3, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    iget-object v4, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    iget-object v5, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v6, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    iget-object v7, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    iget-object v8, p0, Lretrofit/RestAdapter$Builder;->profiler:Lretrofit/Profiler;

    iget-object v9, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    iget-object v10, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    iget-object v11, p0, Lretrofit/RestAdapter$Builder;->logLevel:Lretrofit/RestAdapter$LogLevel;

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lretrofit/RestAdapter;-><init>(Lretrofit/Endpoint;Lretrofit/client/Client$Provider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lretrofit/RequestInterceptor;Lretrofit/converter/Converter;Lretrofit/Profiler;Lretrofit/ErrorHandler;Lretrofit/RestAdapter$Log;Lretrofit/RestAdapter$LogLevel;Lretrofit/RestAdapter$1;)V

    return-object v0

    .line 674
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Endpoint may not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setClient(Lretrofit/client/Client$Provider;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 590
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    return-object p0

    .line 588
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Client provider may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 578
    new-instance v0, Lretrofit/RestAdapter$Builder$1;

    invoke-direct {v0, p0, p1}, Lretrofit/RestAdapter$Builder$1;-><init>(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)V

    invoke-virtual {p0, v0}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client$Provider;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1

    .line 576
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Client may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setConverter(Lretrofit/converter/Converter;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 628
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    return-object p0

    .line 626
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Converter may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 557
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 560
    invoke-static {p1}, Lretrofit/Endpoints;->newFixedEndpoint(Ljava/lang/String;)Lretrofit/Endpoint;

    move-result-object p1

    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    return-object p0

    .line 558
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Endpoint may not be blank."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEndpoint(Lretrofit/Endpoint;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 569
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    return-object p0

    .line 567
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Endpoint may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setErrorHandler(Lretrofit/ErrorHandler;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 649
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    return-object p0

    .line 647
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Error handler may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setExecutors(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    .line 607
    new-instance p2, Lretrofit/Utils$SynchronousExecutor;

    invoke-direct {p2}, Lretrofit/Utils$SynchronousExecutor;-><init>()V

    .line 609
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    .line 610
    iput-object p2, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    return-object p0

    .line 604
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "HTTP executor may not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLog(Lretrofit/RestAdapter$Log;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 658
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    return-object p0

    .line 656
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Log may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLogLevel(Lretrofit/RestAdapter$LogLevel;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 667
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->logLevel:Lretrofit/RestAdapter$LogLevel;

    return-object p0

    .line 665
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Log level may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setProfiler(Lretrofit/Profiler;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 637
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->profiler:Lretrofit/Profiler;

    return-object p0

    .line 635
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Profiler may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRequestInterceptor(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 619
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    return-object p0

    .line 617
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Request interceptor may not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

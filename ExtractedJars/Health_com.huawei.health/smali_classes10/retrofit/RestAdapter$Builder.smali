.class public Lretrofit/RestAdapter$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


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

    .line 548
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 558
    sget-object v0, Lretrofit/RestAdapter$LogLevel;->NONE:Lretrofit/RestAdapter$LogLevel;

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->logLevel:Lretrofit/RestAdapter$LogLevel;

    return-void
.end method

.method private ensureSaneDefaults()V
    .locals 1

    .line 687
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    if-nez v0, :cond_0

    .line 688
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultConverter()Lretrofit/converter/Converter;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    .line 690
    :cond_0
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    if-nez v0, :cond_1

    .line 691
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultClient()Lretrofit/client/Client$Provider;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    .line 693
    :cond_1
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_2

    .line 694
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultHttpExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    .line 696
    :cond_2
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_3

    .line 697
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultCallbackExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 699
    :cond_3
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    if-nez v0, :cond_4

    .line 700
    sget-object v0, Lretrofit/ErrorHandler;->DEFAULT:Lretrofit/ErrorHandler;

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    .line 702
    :cond_4
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    if-nez v0, :cond_5

    .line 703
    invoke-static {}, Lretrofit/Platform;->get()Lretrofit/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit/Platform;->defaultLog()Lretrofit/RestAdapter$Log;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    .line 705
    :cond_5
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    if-nez v0, :cond_6

    .line 706
    sget-object v0, Lretrofit/RequestInterceptor;->NONE:Lretrofit/RequestInterceptor;

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    .line 708
    :cond_6
    return-void
.end method


# virtual methods
.method public build()Lretrofit/RestAdapter;
    .locals 12

    .line 678
    iget-object v0, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    if-nez v0, :cond_0

    .line 679
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Endpoint may not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 681
    :cond_0
    invoke-direct {p0}, Lretrofit/RestAdapter$Builder;->ensureSaneDefaults()V

    .line 682
    new-instance v0, Lretrofit/RestAdapter;

    iget-object v1, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    iget-object v2, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    iget-object v3, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v5, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    iget-object v6, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    iget-object v7, p0, Lretrofit/RestAdapter$Builder;->profiler:Lretrofit/Profiler;

    iget-object v8, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    iget-object v9, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    iget-object v10, p0, Lretrofit/RestAdapter$Builder;->logLevel:Lretrofit/RestAdapter$LogLevel;

    const/4 v11, 0x0

    invoke-direct/range {v0 .. v11}, Lretrofit/RestAdapter;-><init>(Lretrofit/Endpoint;Lretrofit/client/Client$Provider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lretrofit/RequestInterceptor;Lretrofit/converter/Converter;Lretrofit/Profiler;Lretrofit/ErrorHandler;Lretrofit/RestAdapter$Log;Lretrofit/RestAdapter$LogLevel;Lretrofit/RestAdapter$1;)V

    return-object v0
.end method

.method public setClient(Lretrofit/client/Client$Provider;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 592
    if-nez p1, :cond_0

    .line 593
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Client provider may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 595
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->clientProvider:Lretrofit/client/Client$Provider;

    .line 596
    return-object p0
.end method

.method public setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 580
    if-nez p1, :cond_0

    .line 581
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Client may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 583
    :cond_0
    new-instance v0, Lretrofit/RestAdapter$Builder$1;

    invoke-direct {v0, p0, p1}, Lretrofit/RestAdapter$Builder$1;-><init>(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)V

    invoke-virtual {p0, v0}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client$Provider;)Lretrofit/RestAdapter$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setConverter(Lretrofit/converter/Converter;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 630
    if-nez p1, :cond_0

    .line 631
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Converter may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 633
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->converter:Lretrofit/converter/Converter;

    .line 634
    return-object p0
.end method

.method public setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 562
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 563
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Endpoint may not be blank."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 565
    :cond_1
    invoke-static {p1}, Lretrofit/Endpoints;->newFixedEndpoint(Ljava/lang/String;)Lretrofit/Endpoint;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    .line 566
    return-object p0
.end method

.method public setEndpoint(Lretrofit/Endpoint;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 571
    if-nez p1, :cond_0

    .line 572
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Endpoint may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 574
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->endpoint:Lretrofit/Endpoint;

    .line 575
    return-object p0
.end method

.method public setErrorHandler(Lretrofit/ErrorHandler;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 651
    if-nez p1, :cond_0

    .line 652
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Error handler may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 654
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->errorHandler:Lretrofit/ErrorHandler;

    .line 655
    return-object p0
.end method

.method public setExecutors(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 608
    if-nez p1, :cond_0

    .line 609
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "HTTP executor may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 611
    :cond_0
    if-nez p2, :cond_1

    .line 612
    new-instance p2, Lretrofit/Utils$SynchronousExecutor;

    invoke-direct {p2}, Lretrofit/Utils$SynchronousExecutor;-><init>()V

    .line 614
    :cond_1
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->httpExecutor:Ljava/util/concurrent/Executor;

    .line 615
    iput-object p2, p0, Lretrofit/RestAdapter$Builder;->callbackExecutor:Ljava/util/concurrent/Executor;

    .line 616
    return-object p0
.end method

.method public setLog(Lretrofit/RestAdapter$Log;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 660
    if-nez p1, :cond_0

    .line 661
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Log may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 663
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->log:Lretrofit/RestAdapter$Log;

    .line 664
    return-object p0
.end method

.method public setLogLevel(Lretrofit/RestAdapter$LogLevel;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 669
    if-nez p1, :cond_0

    .line 670
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Log level may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 672
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->logLevel:Lretrofit/RestAdapter$LogLevel;

    .line 673
    return-object p0
.end method

.method public setProfiler(Lretrofit/Profiler;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 639
    if-nez p1, :cond_0

    .line 640
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Profiler may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 642
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->profiler:Lretrofit/Profiler;

    .line 643
    return-object p0
.end method

.method public setRequestInterceptor(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;
    .locals 2

    .line 621
    if-nez p1, :cond_0

    .line 622
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Request interceptor may not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 624
    :cond_0
    iput-object p1, p0, Lretrofit/RestAdapter$Builder;->requestInterceptor:Lretrofit/RequestInterceptor;

    .line 625
    return-object p0
.end method

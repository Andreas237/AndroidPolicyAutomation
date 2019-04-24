.class Lretrofit/RestAdapter$RestHandler;
.super Ljava/lang/Object;
.source "RestAdapter.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RestAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RestHandler"
.end annotation


# instance fields
.field private final methodDetailsCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lretrofit/RestMethodInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lretrofit/RestAdapter;


# direct methods
.method constructor <init>(Lretrofit/RestAdapter;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Method;",
            "Lretrofit/RestMethodInfo;",
            ">;)V"
        }
    .end annotation

    .line 223
    iput-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    iput-object p2, p0, Lretrofit/RestAdapter$RestHandler;->methodDetailsCache:Ljava/util/Map;

    return-void
.end method

.method static synthetic access$100(Lretrofit/RestAdapter$RestHandler;Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 220
    invoke-direct {p0, p1, p2, p3}, Lretrofit/RestAdapter$RestHandler;->invokeRequest(Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private invokeRequest(Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const/4 v0, 0x0

    .line 294
    :try_start_0
    invoke-virtual {p2}, Lretrofit/RestMethodInfo;->init()V

    .line 296
    iget-object v1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v1, v1, Lretrofit/RestAdapter;->server:Lretrofit/Endpoint;

    invoke-interface {v1}, Lretrofit/Endpoint;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 297
    new-instance v2, Lretrofit/RequestBuilder;

    iget-object v3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v3, v3, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    invoke-direct {v2, v1, p2, v3}, Lretrofit/RequestBuilder;-><init>(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/converter/Converter;)V

    .line 298
    invoke-virtual {v2, p3}, Lretrofit/RequestBuilder;->setArguments([Ljava/lang/Object;)V

    .line 300
    invoke-interface {p1, v2}, Lretrofit/RequestInterceptor;->intercept(Lretrofit/RequestInterceptor$RequestFacade;)V

    .line 302
    invoke-virtual {v2}, Lretrofit/RequestBuilder;->build()Lretrofit/client/Request;

    move-result-object p1

    .line 303
    invoke-virtual {p1}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Lretrofit/RetrofitError; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
    :try_start_1
    iget-boolean v3, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v3, :cond_0

    .line 307
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Retrofit-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 310
    :cond_0
    iget-object v3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v3, v3, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v3}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 312
    iget-object v3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    const-string v4, "HTTP"

    invoke-virtual {v3, v4, p1, p3}, Lretrofit/RestAdapter;->logAndReplaceRequest(Ljava/lang/String;Lretrofit/client/Request;[Ljava/lang/Object;)Lretrofit/client/Request;

    move-result-object p1

    .line 316
    :cond_1
    iget-object p3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {p3}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 317
    iget-object p3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {p3}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object p3

    invoke-interface {p3}, Lretrofit/Profiler;->beforeCall()Ljava/lang/Object;

    move-result-object p3

    move-object v8, p3

    goto :goto_0

    :cond_2
    move-object v8, v0

    .line 320
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 321
    iget-object p3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {p3}, Lretrofit/RestAdapter;->access$300(Lretrofit/RestAdapter;)Lretrofit/client/Client$Provider;

    move-result-object p3

    invoke-interface {p3}, Lretrofit/client/Client$Provider;->get()Lretrofit/client/Client;

    move-result-object p3

    invoke-interface {p3, p1}, Lretrofit/client/Client;->execute(Lretrofit/client/Request;)Lretrofit/client/Response;

    move-result-object p3

    .line 322
    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long/2addr v6, v3

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    .line 324
    invoke-virtual {p3}, Lretrofit/client/Response;->getStatus()I

    move-result v11

    .line 325
    iget-object v3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v3}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 326
    invoke-static {v1, p2, p1}, Lretrofit/RestAdapter;->access$400(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;

    move-result-object v4

    .line 328
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {p1}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object v3

    move-wide v5, v9

    move v7, v11

    invoke-interface/range {v3 .. v8}, Lretrofit/Profiler;->afterCall(Lretrofit/Profiler$RequestInformation;JILjava/lang/Object;)V

    .line 331
    :cond_3
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p1, p1, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {p1}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 333
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {p1, v2, p3, v9, v10}, Lretrofit/RestAdapter;->access$500(Lretrofit/RestAdapter;Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;

    move-result-object p3

    .line 336
    :cond_4
    iget-object p1, p2, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    const/16 v1, 0xc8

    if-lt v11, v1, :cond_12

    const/16 v1, 0x12c

    if-ge v11, v1, :cond_12

    .line 340
    const-class v1, Lretrofit/client/Response;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 341
    iget-boolean p1, p2, Lretrofit/RestMethodInfo;->isStreaming:Z

    if-nez p1, :cond_5

    .line 343
    invoke-static {p3}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;

    move-result-object p3

    .line 346
    :cond_5
    iget-boolean p1, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z
    :try_end_1
    .catch Lretrofit/RetrofitError; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_7

    .line 397
    iget-boolean p1, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez p1, :cond_6

    .line 398
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    const-string p2, "Retrofit-Idle"

    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_6
    return-object p3

    .line 349
    :cond_7
    :try_start_2
    new-instance p1, Lretrofit/ResponseWrapper;

    invoke-direct {p1, p3, p3}, Lretrofit/ResponseWrapper;-><init>(Lretrofit/client/Response;Ljava/lang/Object;)V
    :try_end_2
    .catch Lretrofit/RetrofitError; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 397
    iget-boolean p2, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez p2, :cond_8

    .line 398
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    const-string p3, "Retrofit-Idle"

    invoke-virtual {p2, p3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_8
    return-object p1

    .line 352
    :cond_9
    :try_start_3
    invoke-virtual {p3}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v1

    if-nez v1, :cond_d

    .line 354
    iget-boolean p1, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z
    :try_end_3
    .catch Lretrofit/RetrofitError; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p1, :cond_b

    .line 397
    iget-boolean p1, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez p1, :cond_a

    .line 398
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    const-string p2, "Retrofit-Idle"

    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_a
    return-object v0

    .line 357
    :cond_b
    :try_start_4
    new-instance p1, Lretrofit/ResponseWrapper;

    invoke-direct {p1, p3, v0}, Lretrofit/ResponseWrapper;-><init>(Lretrofit/client/Response;Ljava/lang/Object;)V
    :try_end_4
    .catch Lretrofit/RetrofitError; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 397
    iget-boolean p2, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez p2, :cond_c

    .line 398
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    const-string p3, "Retrofit-Idle"

    invoke-virtual {p2, p3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_c
    return-object p1

    .line 360
    :cond_d
    :try_start_5
    new-instance v3, Lretrofit/ExceptionCatchingTypedInput;

    invoke-direct {v3, v1}, Lretrofit/ExceptionCatchingTypedInput;-><init>(Lretrofit/mime/TypedInput;)V
    :try_end_5
    .catch Lretrofit/RetrofitError; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 362
    :try_start_6
    iget-object v4, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v4, v4, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    invoke-interface {v4, v3, p1}, Lretrofit/converter/Converter;->fromBody(Lretrofit/mime/TypedInput;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v4

    .line 363
    iget-object v5, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v5, v1, v4}, Lretrofit/RestAdapter;->access$600(Lretrofit/RestAdapter;Lretrofit/mime/TypedInput;Ljava/lang/Object;)V

    .line 364
    iget-boolean v1, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z
    :try_end_6
    .catch Lretrofit/converter/ConversionException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lretrofit/RetrofitError; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v1, :cond_f

    .line 397
    iget-boolean p1, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez p1, :cond_e

    .line 398
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    const-string p2, "Retrofit-Idle"

    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_e
    return-object v4

    .line 367
    :cond_f
    :try_start_7
    new-instance v1, Lretrofit/ResponseWrapper;

    invoke-direct {v1, p3, v4}, Lretrofit/ResponseWrapper;-><init>(Lretrofit/client/Response;Ljava/lang/Object;)V
    :try_end_7
    .catch Lretrofit/converter/ConversionException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Lretrofit/RetrofitError; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 397
    iget-boolean p1, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez p1, :cond_10

    .line 398
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    const-string p2, "Retrofit-Idle"

    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_10
    return-object v1

    :catch_0
    move-exception v1

    .line 371
    :try_start_8
    invoke-virtual {v3}, Lretrofit/ExceptionCatchingTypedInput;->threwException()Z

    move-result v4

    if-eqz v4, :cond_11

    .line 372
    invoke-virtual {v3}, Lretrofit/ExceptionCatchingTypedInput;->getThrownException()Ljava/io/IOException;

    move-result-object p1

    throw p1

    .line 376
    :cond_11
    invoke-static {p3, v0}, Lretrofit/Utils;->replaceResponseBody(Lretrofit/client/Response;Lretrofit/mime/TypedInput;)Lretrofit/client/Response;

    move-result-object p3

    .line 378
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    invoke-static {v2, p3, v0, p1, v1}, Lretrofit/RetrofitError;->conversionError(Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/converter/ConversionException;)Lretrofit/RetrofitError;

    move-result-object p1

    throw p1

    .line 382
    :cond_12
    invoke-static {p3}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;

    move-result-object p3

    .line 383
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    invoke-static {v2, p3, v0, p1}, Lretrofit/RetrofitError;->httpError(Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;)Lretrofit/RetrofitError;

    move-result-object p1

    throw p1
    :try_end_8
    .catch Lretrofit/RetrofitError; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p1

    move-object v2, v0

    .line 392
    :goto_1
    :try_start_9
    iget-object p3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p3, p3, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {p3}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result p3

    if-eqz p3, :cond_13

    .line 393
    iget-object p3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-virtual {p3, p1, v2}, Lretrofit/RestAdapter;->logException(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 395
    :cond_13
    invoke-static {v2, p1}, Lretrofit/RetrofitError;->unexpectedError(Ljava/lang/String;Ljava/lang/Throwable;)Lretrofit/RetrofitError;

    move-result-object p1

    throw p1

    :catch_4
    move-exception p1

    move-object v2, v0

    .line 387
    :goto_2
    iget-object p3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p3, p3, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {p3}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result p3

    if-eqz p3, :cond_14

    .line 388
    iget-object p3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-virtual {p3, p1, v2}, Lretrofit/RestAdapter;->logException(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 390
    :cond_14
    invoke-static {v2, p1}, Lretrofit/RetrofitError;->networkError(Ljava/lang/String;Ljava/io/IOException;)Lretrofit/RetrofitError;

    move-result-object p1

    throw p1

    :catch_5
    move-exception p1

    .line 385
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 397
    :goto_3
    iget-boolean p2, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez p2, :cond_15

    .line 398
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    const-string p3, "Retrofit-Idle"

    invoke-virtual {p2, p3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_15
    throw p1
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 231
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    .line 232
    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 236
    :cond_0
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->methodDetailsCache:Ljava/util/Map;

    invoke-static {p1, p2}, Lretrofit/RestAdapter;->getMethodInfo(Ljava/util/Map;Ljava/lang/reflect/Method;)Lretrofit/RestMethodInfo;

    move-result-object v6

    .line 238
    iget-boolean p1, v6, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-eqz p1, :cond_2

    .line 240
    :try_start_0
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p1, p1, Lretrofit/RestAdapter;->requestInterceptor:Lretrofit/RequestInterceptor;

    invoke-direct {p0, p1, v6, p3}, Lretrofit/RestAdapter$RestHandler;->invokeRequest(Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lretrofit/RetrofitError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 242
    iget-object p2, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p2, p2, Lretrofit/RestAdapter;->errorHandler:Lretrofit/ErrorHandler;

    invoke-interface {p2, p1}, Lretrofit/ErrorHandler;->handleError(Lretrofit/RetrofitError;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_1

    .line 244
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Error handler returned null for wrapped exception."

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 247
    :cond_1
    throw p2

    .line 251
    :cond_2
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p1, p1, Lretrofit/RestAdapter;->httpExecutor:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p1, p1, Lretrofit/RestAdapter;->callbackExecutor:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_6

    .line 255
    iget-boolean p1, v6, Lretrofit/RestMethodInfo;->isObservable:Z

    if-eqz p1, :cond_5

    .line 256
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {p1}, Lretrofit/RestAdapter;->access$000(Lretrofit/RestAdapter;)Lretrofit/RxSupport;

    move-result-object p1

    if-nez p1, :cond_4

    .line 257
    sget-boolean p1, Lretrofit/Platform;->HAS_RX_JAVA:Z

    if-eqz p1, :cond_3

    .line 258
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    new-instance p2, Lretrofit/RxSupport;

    iget-object v0, p1, Lretrofit/RestAdapter;->httpExecutor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v1, v1, Lretrofit/RestAdapter;->errorHandler:Lretrofit/ErrorHandler;

    iget-object v2, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v2, v2, Lretrofit/RestAdapter;->requestInterceptor:Lretrofit/RequestInterceptor;

    invoke-direct {p2, v0, v1, v2}, Lretrofit/RxSupport;-><init>(Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;Lretrofit/RequestInterceptor;)V

    invoke-static {p1, p2}, Lretrofit/RestAdapter;->access$002(Lretrofit/RestAdapter;Lretrofit/RxSupport;)Lretrofit/RxSupport;

    goto :goto_0

    .line 260
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Observable method found but no RxJava on classpath."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 263
    :cond_4
    :goto_0
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {p1}, Lretrofit/RestAdapter;->access$000(Lretrofit/RestAdapter;)Lretrofit/RxSupport;

    move-result-object p1

    new-instance p2, Lretrofit/RestAdapter$RestHandler$1;

    invoke-direct {p2, p0, v6, p3}, Lretrofit/RestAdapter$RestHandler$1;-><init>(Lretrofit/RestAdapter$RestHandler;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lretrofit/RxSupport;->createRequestObservable(Lretrofit/RxSupport$Invoker;)Lrx/Observable;

    move-result-object p1

    return-object p1

    .line 272
    :cond_5
    new-instance v5, Lretrofit/RequestInterceptorTape;

    invoke-direct {v5}, Lretrofit/RequestInterceptorTape;-><init>()V

    .line 273
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p1, p1, Lretrofit/RestAdapter;->requestInterceptor:Lretrofit/RequestInterceptor;

    invoke-interface {p1, v5}, Lretrofit/RequestInterceptor;->intercept(Lretrofit/RequestInterceptor$RequestFacade;)V

    .line 275
    array-length p1, p3

    add-int/lit8 p1, p1, -0x1

    aget-object p1, p3, p1

    move-object v2, p1

    check-cast v2, Lretrofit/Callback;

    .line 276
    iget-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object p1, p1, Lretrofit/RestAdapter;->httpExecutor:Ljava/util/concurrent/Executor;

    new-instance p2, Lretrofit/RestAdapter$RestHandler$2;

    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v3, v0, Lretrofit/RestAdapter;->callbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v4, v0, Lretrofit/RestAdapter;->errorHandler:Lretrofit/ErrorHandler;

    move-object v0, p2

    move-object v1, p0

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lretrofit/RestAdapter$RestHandler$2;-><init>(Lretrofit/RestAdapter$RestHandler;Lretrofit/Callback;Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;Lretrofit/RequestInterceptorTape;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return-object p1

    .line 252
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Asynchronous invocation requires calling setExecutors."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

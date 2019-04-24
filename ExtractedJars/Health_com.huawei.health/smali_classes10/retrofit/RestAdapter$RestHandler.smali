.class Lretrofit/RestAdapter$RestHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RestAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RestHandler"
.end annotation


# instance fields
.field private final methodDetailsCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/reflect/Method;Lretrofit/RestMethodInfo;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lretrofit/RestAdapter;


# direct methods
.method constructor <init>(Lretrofit/RestAdapter;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/reflect/Method;Lretrofit/RestMethodInfo;>;)V"
        }
    .end annotation

    .line 223
    iput-object p1, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    iput-object p2, p0, Lretrofit/RestAdapter$RestHandler;->methodDetailsCache:Ljava/util/Map;

    .line 225
    return-void
.end method

.method static synthetic access$100(Lretrofit/RestAdapter$RestHandler;Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 220
    invoke-direct {p0, p1, p2, p3}, Lretrofit/RestAdapter$RestHandler;->invokeRequest(Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private invokeRequest(Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 292
    const/4 v6, 0x0

    .line 294
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lretrofit/RestMethodInfo;->init()V

    .line 296
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->server:Lretrofit/Endpoint;

    invoke-interface {v0}, Lretrofit/Endpoint;->getUrl()Ljava/lang/String;

    move-result-object v7

    .line 297
    new-instance v8, Lretrofit/RequestBuilder;

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    move-object/from16 v1, p2

    invoke-direct {v8, v7, v1, v0}, Lretrofit/RequestBuilder;-><init>(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/converter/Converter;)V

    .line 298
    move-object/from16 v0, p3

    invoke-virtual {v8, v0}, Lretrofit/RequestBuilder;->setArguments([Ljava/lang/Object;)V

    .line 300
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Lretrofit/RequestInterceptor;->intercept(Lretrofit/RequestInterceptor$RequestFacade;)V

    .line 302
    invoke-virtual {v8}, Lretrofit/RequestBuilder;->build()Lretrofit/client/Request;

    move-result-object v9

    .line 303
    invoke-virtual {v9}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 305
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_1

    .line 307
    const-string v0, "?"

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v10

    .line 308
    const/4 v0, -0x1

    if-ne v10, v0, :cond_0

    .line 309
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v10

    .line 311
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Retrofit-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 312
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v6, v2, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 315
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 317
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    const-string v1, "HTTP"

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v9, v2}, Lretrofit/RestAdapter;->logAndReplaceRequest(Ljava/lang/String;Lretrofit/client/Request;[Ljava/lang/Object;)Lretrofit/client/Request;

    move-result-object v9

    .line 320
    :cond_2
    const/4 v10, 0x0

    .line 321
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 322
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object v0

    invoke-interface {v0}, Lretrofit/Profiler;->beforeCall()Ljava/lang/Object;

    move-result-object v10

    .line 325
    :cond_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v11

    .line 326
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0}, Lretrofit/RestAdapter;->access$300(Lretrofit/RestAdapter;)Lretrofit/client/Client$Provider;

    move-result-object v0

    invoke-interface {v0}, Lretrofit/client/Client$Provider;->get()Lretrofit/client/Client;

    move-result-object v0

    invoke-interface {v0, v9}, Lretrofit/client/Client;->execute(Lretrofit/client/Request;)Lretrofit/client/Response;

    move-result-object v13

    .line 327
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long/2addr v1, v11

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v14

    .line 329
    invoke-virtual {v13}, Lretrofit/client/Response;->getStatus()I

    move-result v16

    .line 330
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 331
    move-object/from16 v0, p2

    invoke-static {v7, v0, v9}, Lretrofit/RestAdapter;->access$400(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/client/Request;)Lretrofit/Profiler$RequestInformation;

    move-result-object v17

    .line 333
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0}, Lretrofit/RestAdapter;->access$200(Lretrofit/RestAdapter;)Lretrofit/Profiler;

    move-result-object v0

    move-object/from16 v1, v17

    move-wide v2, v14

    move/from16 v4, v16

    move-object v5, v10

    invoke-interface/range {v0 .. v5}, Lretrofit/Profiler;->afterCall(Lretrofit/Profiler$RequestInformation;JILjava/lang/Object;)V

    .line 336
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 338
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0, v6, v13, v14, v15}, Lretrofit/RestAdapter;->access$500(Lretrofit/RestAdapter;Ljava/lang/String;Lretrofit/client/Response;J)Lretrofit/client/Response;

    move-result-object v13

    .line 341
    :cond_5
    move-object/from16 v0, p2

    iget-object v0, v0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    move-object/from16 v17, v0

    .line 343
    move/from16 v0, v16

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_13

    move/from16 v0, v16

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_13

    .line 345
    const-class v0, Lretrofit/client/Response;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 346
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isStreaming:Z

    if-nez v0, :cond_6

    .line 348
    invoke-static {v13}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;

    move-result-object v13

    .line 351
    :cond_6
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z
    :try_end_0
    .catch Lretrofit/RetrofitError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_8

    .line 352
    move-object/from16 v18, v13

    .line 402
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_7

    .line 403
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "Retrofit-Idle"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_7
    return-object v18

    .line 354
    :cond_8
    :try_start_1
    new-instance v0, Lretrofit/ResponseWrapper;

    move-object v1, v13

    move-object v2, v13

    invoke-direct {v0, v1, v2}, Lretrofit/ResponseWrapper;-><init>(Lretrofit/client/Response;Ljava/lang/Object;)V
    :try_end_1
    .catch Lretrofit/RetrofitError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v18, v0

    .line 402
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_9

    .line 403
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "Retrofit-Idle"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_9
    return-object v18

    .line 357
    :cond_a
    :try_start_2
    invoke-virtual {v13}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v18

    .line 358
    if-nez v18, :cond_e

    .line 359
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z
    :try_end_2
    .catch Lretrofit/RetrofitError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_c

    .line 360
    const/16 v19, 0x0

    .line 402
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_b

    .line 403
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "Retrofit-Idle"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_b
    return-object v19

    .line 362
    :cond_c
    :try_start_3
    new-instance v0, Lretrofit/ResponseWrapper;

    move-object v1, v13

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lretrofit/ResponseWrapper;-><init>(Lretrofit/client/Response;Ljava/lang/Object;)V
    :try_end_3
    .catch Lretrofit/RetrofitError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v19, v0

    .line 402
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_d

    .line 403
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "Retrofit-Idle"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_d
    return-object v19

    .line 365
    :cond_e
    :try_start_4
    new-instance v0, Lretrofit/ExceptionCatchingTypedInput;

    move-object/from16 v1, v18

    invoke-direct {v0, v1}, Lretrofit/ExceptionCatchingTypedInput;-><init>(Lretrofit/mime/TypedInput;)V
    :try_end_4
    .catch Lretrofit/RetrofitError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v19, v0

    .line 367
    move-object/from16 v0, p0

    :try_start_5
    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    move-object/from16 v1, v19

    move-object/from16 v2, v17

    invoke-interface {v0, v1, v2}, Lretrofit/converter/Converter;->fromBody(Lretrofit/mime/TypedInput;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v20

    .line 368
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    move-object/from16 v1, v18

    move-object/from16 v2, v20

    invoke-static {v0, v1, v2}, Lretrofit/RestAdapter;->access$600(Lretrofit/RestAdapter;Lretrofit/mime/TypedInput;Ljava/lang/Object;)V

    .line 369
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z
    :try_end_5
    .catch Lretrofit/converter/ConversionException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Lretrofit/RetrofitError; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v0, :cond_10

    .line 370
    move-object/from16 v21, v20

    .line 402
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_f

    .line 403
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "Retrofit-Idle"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_f
    return-object v21

    .line 372
    :cond_10
    :try_start_6
    new-instance v0, Lretrofit/ResponseWrapper;

    move-object v1, v13

    move-object/from16 v2, v20

    invoke-direct {v0, v1, v2}, Lretrofit/ResponseWrapper;-><init>(Lretrofit/client/Response;Ljava/lang/Object;)V
    :try_end_6
    .catch Lretrofit/converter/ConversionException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Lretrofit/RetrofitError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object/from16 v21, v0

    .line 402
    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_11

    .line 403
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "Retrofit-Idle"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_11
    return-object v21

    .line 373
    :catch_0
    move-exception v20

    .line 376
    :try_start_7
    invoke-virtual/range {v19 .. v19}, Lretrofit/ExceptionCatchingTypedInput;->threwException()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 377
    invoke-virtual/range {v19 .. v19}, Lretrofit/ExceptionCatchingTypedInput;->getThrownException()Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 381
    :cond_12
    const/4 v0, 0x0

    invoke-static {v13, v0}, Lretrofit/Utils;->replaceResponseBody(Lretrofit/client/Response;Lretrofit/mime/TypedInput;)Lretrofit/client/Response;

    move-result-object v13

    .line 383
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    move-object/from16 v1, v17

    move-object/from16 v2, v20

    invoke-static {v6, v13, v0, v1, v2}, Lretrofit/RetrofitError;->conversionError(Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/converter/ConversionException;)Lretrofit/RetrofitError;

    move-result-object v0

    throw v0

    .line 387
    :cond_13
    invoke-static {v13}, Lretrofit/Utils;->readBodyToBytesIfNecessary(Lretrofit/client/Response;)Lretrofit/client/Response;

    move-result-object v13

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->converter:Lretrofit/converter/Converter;

    move-object/from16 v1, v17

    invoke-static {v6, v13, v0, v1}, Lretrofit/RetrofitError;->httpError(Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;)Lretrofit/RetrofitError;

    move-result-object v0

    throw v0
    :try_end_7
    .catch Lretrofit/RetrofitError; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 389
    :catch_1
    move-exception v7

    .line 390
    :try_start_8
    throw v7

    .line 391
    :catch_2
    move-exception v7

    .line 392
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result v0

    if-eqz v0, :cond_14

    .line 393
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-virtual {v0, v7, v6}, Lretrofit/RestAdapter;->logException(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 395
    :cond_14
    invoke-static {v6, v7}, Lretrofit/RetrofitError;->networkError(Ljava/lang/String;Ljava/io/IOException;)Lretrofit/RetrofitError;

    move-result-object v0

    throw v0

    .line 396
    :catch_3
    move-exception v7

    .line 397
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->logLevel:Lretrofit/RestAdapter$LogLevel;

    invoke-virtual {v0}, Lretrofit/RestAdapter$LogLevel;->log()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 398
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-virtual {v0, v7, v6}, Lretrofit/RestAdapter;->logException(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 400
    :cond_15
    invoke-static {v6, v7}, Lretrofit/RetrofitError;->unexpectedError(Ljava/lang/String;Ljava/lang/Throwable;)Lretrofit/RetrofitError;

    move-result-object v0

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 402
    :catchall_0
    move-exception v22

    move-object/from16 v0, p2

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_16

    .line 403
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    const-string v1, "Retrofit-Idle"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_16
    throw v22
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 231
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    .line 232
    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 236
    :cond_0
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->methodDetailsCache:Ljava/util/Map;

    invoke-static {v0, p2}, Lretrofit/RestAdapter;->getMethodInfo(Ljava/util/Map;Ljava/lang/reflect/Method;)Lretrofit/RestMethodInfo;

    move-result-object v9

    .line 238
    iget-boolean v0, v9, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-eqz v0, :cond_2

    .line 240
    :try_start_0
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->requestInterceptor:Lretrofit/RequestInterceptor;

    invoke-direct {p0, v0, v9, p3}, Lretrofit/RestAdapter$RestHandler;->invokeRequest(Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lretrofit/RetrofitError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 241
    :catch_0
    move-exception v10

    .line 242
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->errorHandler:Lretrofit/ErrorHandler;

    invoke-interface {v0, v10}, Lretrofit/ErrorHandler;->handleError(Lretrofit/RetrofitError;)Ljava/lang/Throwable;

    move-result-object v11

    .line 243
    if-nez v11, :cond_1

    .line 244
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Error handler returned null for wrapped exception."

    invoke-direct {v0, v1, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 247
    :cond_1
    throw v11

    .line 251
    :cond_2
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->httpExecutor:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->callbackExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_4

    .line 252
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Asynchronous invocation requires calling setExecutors."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_4
    iget-boolean v0, v9, Lretrofit/RestMethodInfo;->isObservable:Z

    if-eqz v0, :cond_7

    .line 256
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0}, Lretrofit/RestAdapter;->access$000(Lretrofit/RestAdapter;)Lretrofit/RxSupport;

    move-result-object v0

    if-nez v0, :cond_6

    .line 257
    sget-boolean v0, Lretrofit/Platform;->HAS_RX_JAVA:Z

    if-eqz v0, :cond_5

    .line 258
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    new-instance v1, Lretrofit/RxSupport;

    iget-object v2, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v2, v2, Lretrofit/RestAdapter;->httpExecutor:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v3, v3, Lretrofit/RestAdapter;->errorHandler:Lretrofit/ErrorHandler;

    iget-object v4, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v4, v4, Lretrofit/RestAdapter;->requestInterceptor:Lretrofit/RequestInterceptor;

    invoke-direct {v1, v2, v3, v4}, Lretrofit/RxSupport;-><init>(Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;Lretrofit/RequestInterceptor;)V

    invoke-static {v0, v1}, Lretrofit/RestAdapter;->access$002(Lretrofit/RestAdapter;Lretrofit/RxSupport;)Lretrofit/RxSupport;

    goto :goto_0

    .line 260
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Observable method found but no RxJava on classpath."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_6
    :goto_0
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    invoke-static {v0}, Lretrofit/RestAdapter;->access$000(Lretrofit/RestAdapter;)Lretrofit/RxSupport;

    move-result-object v0

    new-instance v1, Lretrofit/RestAdapter$RestHandler$1;

    invoke-direct {v1, p0, v9, p3}, Lretrofit/RestAdapter$RestHandler$1;-><init>(Lretrofit/RestAdapter$RestHandler;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lretrofit/RxSupport;->createRequestObservable(Lretrofit/RxSupport$Invoker;)Lrx/Observable;

    move-result-object v0

    return-object v0

    .line 272
    :cond_7
    new-instance v10, Lretrofit/RequestInterceptorTape;

    invoke-direct {v10}, Lretrofit/RequestInterceptorTape;-><init>()V

    .line 273
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->requestInterceptor:Lretrofit/RequestInterceptor;

    invoke-interface {v0, v10}, Lretrofit/RequestInterceptor;->intercept(Lretrofit/RequestInterceptor$RequestFacade;)V

    .line 275
    array-length v0, p3

    add-int/lit8 v0, v0, -0x1

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lretrofit/Callback;

    .line 276
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v0, v0, Lretrofit/RestAdapter;->httpExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Lretrofit/RestAdapter$RestHandler$2;

    iget-object v2, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v4, v2, Lretrofit/RestAdapter;->callbackExecutor:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lretrofit/RestAdapter$RestHandler;->this$0:Lretrofit/RestAdapter;

    iget-object v5, v2, Lretrofit/RestAdapter;->errorHandler:Lretrofit/ErrorHandler;

    move-object v2, p0

    move-object v3, v11

    move-object v6, v10

    move-object v7, v9

    move-object v8, p3

    invoke-direct/range {v1 .. v8}, Lretrofit/RestAdapter$RestHandler$2;-><init>(Lretrofit/RestAdapter$RestHandler;Lretrofit/Callback;Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;Lretrofit/RequestInterceptorTape;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 281
    const/4 v0, 0x0

    return-object v0
.end method

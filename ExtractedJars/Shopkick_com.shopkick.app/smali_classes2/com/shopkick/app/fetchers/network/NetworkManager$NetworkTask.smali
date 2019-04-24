.class public Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;
.super Landroid/os/AsyncTask;
.source "NetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/fetchers/network/NetworkManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "NetworkTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Lcom/shopkick/app/fetchers/DataResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/fetchers/network/INetworkCallback;",
            ">;"
        }
    .end annotation
.end field

.field private request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

.field private requestHeadersMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/network/INetworkCallback;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/network/NetworkRequest;",
            "Lcom/shopkick/app/fetchers/network/INetworkCallback;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 302
    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 303
    iput-object p2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    if-eqz p3, :cond_0

    .line 305
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 307
    :cond_0
    iput-object p4, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->requestHeadersMap:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Lcom/shopkick/app/fetchers/DataResponse;
    .locals 10

    .line 323
    iget-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {p1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$000(Lcom/shopkick/app/fetchers/network/NetworkManager;)Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 324
    iget-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {p1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$000(Lcom/shopkick/app/fetchers/network/NetworkManager;)Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result p1

    if-nez p1, :cond_0

    .line 326
    iget-object p1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {p1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$100(Lcom/shopkick/app/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;

    move-result-object p1

    const-string v1, "no_network_error_count"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->increment(Ljava/lang/String;)V

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_11

    .line 335
    :try_start_0
    new-instance v3, Ljava/net/URL;

    iget-object v4, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 336
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v4, 0x1388

    .line 337
    :try_start_1
    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v4, 0x7530

    .line 338
    invoke-virtual {v3, v4}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 339
    iget-object v4, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-boolean v4, v4, Lcom/shopkick/app/fetchers/network/NetworkRequest;->ignoreRequestHeaders:Z

    if-nez v4, :cond_1

    .line 340
    iget-object v4, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->requestHeadersMap:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 341
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v6, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 344
    :cond_1
    iget-object v4, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    if-eqz v4, :cond_2

    const-string v4, "Content-Type"

    .line 345
    iget-object v5, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    .line 348
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "-"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Accept-Language"

    .line 349
    invoke-virtual {v3, v5, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    iget-object v4, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-boolean v4, v4, Lcom/shopkick/app/fetchers/network/NetworkRequest;->isPost:Z

    if-eqz v4, :cond_5

    .line 351
    invoke-virtual {v3, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 352
    invoke-virtual {v3, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 353
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    .line 354
    iget-object v5, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/network/NetworkRequest;->bodyString:Ljava/lang/String;

    if-eqz v5, :cond_3

    .line 355
    new-instance v5, Ljava/io/BufferedWriter;

    new-instance v6, Ljava/io/OutputStreamWriter;

    const-string v7, "UTF-8"

    invoke-direct {v6, v4, v7}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v5, v6}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 356
    iget-object v6, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/network/NetworkRequest;->bodyString:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 357
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->flush()V

    .line 358
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V

    goto :goto_2

    .line 359
    :cond_3
    iget-object v5, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/network/NetworkRequest;->bodyBytes:[B

    if-eqz v5, :cond_4

    .line 360
    new-instance v5, Ljava/io/DataOutputStream;

    invoke-direct {v5, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 361
    iget-object v6, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/network/NetworkRequest;->bodyBytes:[B

    invoke-virtual {v5, v6}, Ljava/io/DataOutputStream;->write([B)V

    .line 362
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V

    .line 363
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->close()V

    .line 365
    :cond_4
    :goto_2
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 368
    :cond_5
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    :goto_3
    const/16 v4, 0x12e

    if-eq v0, v4, :cond_9

    const/16 v4, 0x12d

    if-ne v0, v4, :cond_6

    goto :goto_6

    .line 376
    :cond_6
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 377
    :try_start_2
    iget-object v5, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 378
    iget-object v5, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/network/INetworkCallback;

    iget-object v6, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    invoke-interface {v5, v6, v4}, Lcom/shopkick/app/fetchers/network/INetworkCallback;->parseResponse(Lcom/shopkick/app/fetchers/network/NetworkRequest;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    goto :goto_4

    :cond_7
    move-object v1, v2

    .line 394
    :goto_4
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_5

    :catch_0
    move-exception v4

    .line 396
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    :goto_5
    if-eqz v3, :cond_8

    .line 400
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v2

    .line 401
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    move v7, p1

    move v6, v0

    move-object v8, v1

    move-object v9, v2

    goto/16 :goto_12

    :cond_8
    move v7, p1

    move v6, v0

    move-object v8, v1

    move-object v9, v2

    goto/16 :goto_12

    :catch_1
    move-exception p1

    goto :goto_9

    :catch_2
    move-exception p1

    goto/16 :goto_d

    .line 371
    :cond_9
    :goto_6
    :try_start_4
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 372
    new-instance v4, Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 373
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 374
    :try_start_5
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object v3, v4

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object v3, v4

    goto/16 :goto_10

    :catch_3
    move-exception p1

    move-object v3, v4

    goto :goto_7

    :catch_4
    move-exception p1

    move-object v3, v4

    goto :goto_8

    :catchall_1
    move-exception p1

    goto/16 :goto_10

    :catch_5
    move-exception p1

    :goto_7
    move-object v4, v2

    goto :goto_9

    :catch_6
    move-exception p1

    :goto_8
    move-object v4, v2

    goto :goto_d

    :catchall_2
    move-exception p1

    move-object v3, v2

    goto/16 :goto_10

    :catch_7
    move-exception p1

    move-object v3, v2

    move-object v4, v3

    .line 388
    :goto_9
    :try_start_6
    const-class v5, Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz v4, :cond_a

    .line 394
    :try_start_7
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8

    goto :goto_a

    :catch_8
    move-exception p1

    .line 396
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :cond_a
    :goto_a
    if-eqz v3, :cond_b

    .line 400
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object p1

    .line 401
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    move-object v9, p1

    move v6, v0

    move v7, v1

    :goto_b
    move-object v8, v2

    goto/16 :goto_12

    :cond_b
    move v6, v0

    move v7, v1

    :goto_c
    move-object v8, v2

    move-object v9, v8

    goto/16 :goto_12

    :catch_9
    move-exception p1

    move-object v3, v2

    move-object v4, v3

    .line 381
    :goto_d
    :try_start_8
    const-class v5, Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "doInBackground IOException for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 382
    instance-of p1, p1, Ljava/net/SocketTimeoutException;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-eqz p1, :cond_c

    const/4 p1, 0x7

    goto :goto_e

    :cond_c
    move p1, v1

    :goto_e
    if-eqz v4, :cond_d

    .line 394
    :try_start_9
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_a

    goto :goto_f

    :catch_a
    move-exception v1

    .line 396
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :cond_d
    :goto_f
    if-eqz v3, :cond_e

    .line 400
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v1

    .line 401
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    move v7, p1

    move v6, v0

    move-object v9, v1

    goto :goto_b

    :cond_e
    move v7, p1

    move v6, v0

    goto :goto_c

    :catchall_3
    move-exception p1

    move-object v2, v4

    :goto_10
    if-eqz v2, :cond_f

    .line 394
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_b

    goto :goto_11

    :catch_b
    move-exception v0

    .line 396
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :cond_f
    :goto_11
    if-eqz v3, :cond_10

    .line 400
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    .line 401
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_10
    throw p1

    :cond_11
    move v7, p1

    move v6, v0

    move-object v8, v2

    move-object v9, v8

    :goto_12
    if-nez v7, :cond_13

    const/16 p1, 0x190

    if-lt v6, p1, :cond_12

    goto :goto_13

    .line 410
    :cond_12
    new-instance p1, Lcom/shopkick/app/fetchers/DataResponse;

    const/4 v5, 0x1

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lcom/shopkick/app/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;Ljava/util/Map;)V

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$100(Lcom/shopkick/app/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;

    move-result-object v0

    const-string/jumbo v1, "success_count"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->increment(Ljava/lang/String;)V

    goto :goto_14

    .line 408
    :cond_13
    :goto_13
    new-instance p1, Lcom/shopkick/app/fetchers/DataResponse;

    const/4 v5, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lcom/shopkick/app/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;Ljava/util/Map;)V

    .line 413
    :goto_14
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$100(Lcom/shopkick/app/fetchers/network/NetworkManager;)Lcom/shopkick/app/controllers/NetworkStatsCounter;

    move-result-object v0

    const-string v1, "response_count"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/NetworkStatsCounter;->increment(Ljava/lang/String;)V

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 294
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->doInBackground([Ljava/lang/Object;)Lcom/shopkick/app/fetchers/DataResponse;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lcom/shopkick/app/fetchers/DataResponse;)V
    .locals 3

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$200(Lcom/shopkick/app/fetchers/network/NetworkManager;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/network/INetworkCallback;

    .line 421
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$300(Lcom/shopkick/app/fetchers/network/NetworkManager;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 424
    iget-object v1, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    invoke-interface {v0, v1, p1}, Lcom/shopkick/app/fetchers/network/INetworkCallback;->receivedResponse(Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/DataResponse;)V

    .line 425
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$300(Lcom/shopkick/app/fetchers/network/NetworkManager;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->this$0:Lcom/shopkick/app/fetchers/network/NetworkManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/fetchers/network/NetworkManager;->access$400(Lcom/shopkick/app/fetchers/network/NetworkManager;Z)V

    .line 436
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/DataResponse;->getCookies()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->request:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/fetchers/network/NetworkManager;->getDomainName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 439
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catch_0
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 442
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 294
    check-cast p1, Lcom/shopkick/app/fetchers/DataResponse;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/network/NetworkManager$NetworkTask;->onPostExecute(Lcom/shopkick/app/fetchers/DataResponse;)V

    return-void
.end method

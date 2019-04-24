.class Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;
.super Landroid/os/AsyncTask;
.source "TrackingUrlManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tracking/TrackingUrlManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TrackingUrlTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;",
        "Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tracking/TrackingUrlManager;

.field private trackingUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tracking/TrackingUrlManager;Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->this$0:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 146
    iput-object p2, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->trackingUrl:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;
    .locals 3

    .line 153
    new-instance p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;

    invoke-direct {p1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;-><init>()V

    .line 154
    sget-object v0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->SUCCESS:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    iput-object v0, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->type:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    const/4 v0, 0x0

    .line 156
    :try_start_0
    new-instance v1, Ljava/net/URL;

    iget-object v2, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->trackingUrl:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x1388

    .line 159
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v2, 0x7530

    .line 160
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 161
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V

    .line 162
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    iput v2, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->responseCode:I

    .line 163
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_a
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_0

    .line 188
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 190
    const-class v2, Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object v1, v0

    goto :goto_4

    :catch_1
    move-object v1, v0

    .line 183
    :catch_2
    :try_start_3
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    .line 184
    sget-object v2, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->OTHER:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    iput-object v2, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->type:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_1

    .line 188
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    :catch_3
    move-exception v0

    .line 190
    const-class v2, Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    goto :goto_3

    :catch_4
    move-object v1, v0

    .line 172
    :catch_5
    :try_start_5
    sget-object v2, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->OTHER:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    iput-object v2, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->type:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 178
    :try_start_6
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    iput v2, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->responseCode:I
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catch_6
    move-exception v2

    .line 180
    :try_start_7
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    :goto_2
    if-eqz v1, :cond_2

    goto :goto_3

    :catch_7
    move-object v1, v0

    .line 169
    :catch_8
    sget-object v2, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->REQUEST_TIMED_OUT:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    iput-object v2, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->type:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    if-eqz v1, :cond_2

    goto :goto_3

    :catch_9
    move-object v1, v0

    .line 166
    :catch_a
    sget-object v2, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->INVALID_URL:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    iput-object v2, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->type:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v1, :cond_2

    .line 194
    :goto_3
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2
    return-object p1

    :catchall_1
    move-exception p1

    :goto_4
    if-eqz v0, :cond_3

    .line 188
    :try_start_8
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_b

    goto :goto_5

    :catch_b
    move-exception v0

    .line 190
    const-class v2, Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_5
    if-eqz v1, :cond_4

    .line 194
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    throw p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 141
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->doInBackground([Ljava/lang/Object;)Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;)V
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->this$0:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-static {v0}, Lcom/shopkick/app/tracking/TrackingUrlManager;->access$010(Lcom/shopkick/app/tracking/TrackingUrlManager;)I

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->this$0:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-static {v0}, Lcom/shopkick/app/tracking/TrackingUrlManager;->access$100(Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    .line 205
    iget-object v0, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->type:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    sget-object v1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;->SUCCESS:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    if-eq v0, v1, :cond_0

    .line 206
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 207
    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->trackingUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTrackingUrl(Ljava/lang/String;)V

    .line 208
    iget v1, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->responseCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStatusCode(Ljava/lang/Integer;)V

    .line 209
    iget-object v1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->this$0:Lcom/shopkick/app/tracking/TrackingUrlManager;

    iget-object p1, p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;->type:Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;

    invoke-static {v1, p1}, Lcom/shopkick/app/tracking/TrackingUrlManager;->access$200(Lcom/shopkick/app/tracking/TrackingUrlManager;Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResultType;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTrackingUrlFailureReason(Ljava/lang/Integer;)V

    .line 210
    iget-object p1, p0, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->this$0:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-static {p1}, Lcom/shopkick/app/tracking/TrackingUrlManager;->access$300(Lcom/shopkick/app/tracking/TrackingUrlManager;)Lcom/shopkick/app/application/SKLogger;

    move-result-object p1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 141
    check-cast p1, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTask;->onPostExecute(Lcom/shopkick/app/tracking/TrackingUrlManager$TrackingUrlTaskResult;)V

    return-void
.end method

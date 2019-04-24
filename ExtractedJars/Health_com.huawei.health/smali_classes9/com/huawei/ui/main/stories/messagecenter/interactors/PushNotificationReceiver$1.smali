.class final Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver;->b(Landroid/content/Context;Lcom/huawei/hwcloudmodel/model/push/PushMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/String;Ljava/lang/Void;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwcloudmodel/model/push/PushMessage;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/huawei/hwcloudmodel/model/push/PushMessage;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver$1;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver$1;->b:Lcom/huawei/hwcloudmodel/model/push/PushMessage;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 11

    .line 228
    const/4 v4, 0x0

    .line 229
    const/4 v5, 0x0

    .line 231
    :try_start_0
    new-instance v6, Ljava/net/URL;

    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-direct {v6, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 232
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/HttpURLConnection;

    .line 233
    const/16 v0, 0x1770

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 234
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 235
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 236
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->connect()V

    .line 237
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    .line 238
    const/16 v0, 0xc8

    if-ne v8, v0, :cond_0

    .line 239
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 240
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v4, v0

    .line 241
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 250
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 253
    goto/16 :goto_1

    .line 251
    :catch_0
    move-exception v6

    .line 252
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap Exception !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    goto/16 :goto_1

    .line 243
    :catch_1
    move-exception v6

    .line 244
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap Exception !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 248
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 250
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 253
    goto/16 :goto_1

    .line 251
    :catch_2
    move-exception v6

    .line 252
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap Exception !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    goto :goto_1

    .line 245
    :catch_3
    move-exception v6

    .line 246
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap Exception !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 248
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 250
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 253
    goto :goto_1

    .line 251
    :catch_4
    move-exception v6

    .line 252
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap Exception !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    goto :goto_1

    .line 248
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 250
    :try_start_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 253
    goto :goto_0

    .line 251
    :catch_5
    move-exception v10

    .line 252
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap Exception !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    :cond_1
    :goto_0
    throw v9

    .line 256
    :cond_2
    :goto_1
    return-object v4
.end method

.method protected b(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 261
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 262
    const-string v0, "UIHLH_PushNotificationReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bitmap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver$1;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver$1;->b:Lcom/huawei/hwcloudmodel/model/push/PushMessage;

    invoke-static {v0, v1, p1}, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver;->d(Landroid/content/Context;Lcom/huawei/hwcloudmodel/model/push/PushMessage;Landroid/graphics/Bitmap;)V

    .line 266
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 224
    move-object v0, p1

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver$1;->a([Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 224
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver$1;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method

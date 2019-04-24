.class final Lcom/huawei/ui/main/stories/nps/https/Http$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/https/Http;->postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callBack:Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;

.field final synthetic val$httpURLConnection:Ljava/net/HttpURLConnection;

.field final synthetic val$strBody:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$strBody:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$callBack:Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, -0x1

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$strBody:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v4, v0

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$strBody:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    .line 77
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    .line 82
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->responseCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const/16 v0, 0xc8

    if-ne v7, v0, :cond_1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 85
    invoke-static {v5}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->readInputStream(Ljava/io/InputStream;)[B

    move-result-object v8

    .line 86
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v8, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v6, v0

    .line 87
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->jsonResult:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 v7, -0x1

    .line 99
    :goto_0
    if-eqz v4, :cond_2

    .line 100
    :try_start_1
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    const/4 v4, 0x0

    .line 105
    :cond_2
    goto :goto_1

    .line 103
    :catch_0
    move-exception v8

    .line 104
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_1
    if-eqz v5, :cond_3

    .line 109
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 110
    const/4 v5, 0x0

    .line 114
    :cond_3
    goto/16 :goto_6

    .line 112
    :catch_1
    move-exception v8

    .line 113
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    goto/16 :goto_6

    .line 91
    :catch_2
    move-exception v8

    .line 92
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "http IOException e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    const/4 v7, -0x1

    .line 99
    if-eqz v4, :cond_4

    .line 100
    :try_start_4
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 101
    const/4 v4, 0x0

    .line 105
    :cond_4
    goto :goto_2

    .line 103
    :catch_3
    move-exception v8

    .line 104
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_2
    if-eqz v5, :cond_5

    .line 109
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 110
    const/4 v5, 0x0

    .line 114
    :cond_5
    goto/16 :goto_6

    .line 112
    :catch_4
    move-exception v8

    .line 113
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    goto/16 :goto_6

    .line 94
    :catch_5
    move-exception v8

    .line 95
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x2

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "http Exception e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 96
    const/4 v7, -0x1

    .line 99
    if-eqz v4, :cond_6

    .line 100
    :try_start_7
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 101
    const/4 v4, 0x0

    .line 105
    :cond_6
    goto :goto_3

    .line 103
    :catch_6
    move-exception v8

    .line 104
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_3
    if-eqz v5, :cond_7

    .line 109
    :try_start_8
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 110
    const/4 v5, 0x0

    .line 114
    :cond_7
    goto :goto_6

    .line 112
    :catch_7
    move-exception v8

    .line 113
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    goto :goto_6

    .line 98
    :catchall_0
    move-exception v9

    .line 99
    if-eqz v4, :cond_8

    .line 100
    :try_start_9
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 101
    const/4 v4, 0x0

    .line 105
    :cond_8
    goto :goto_4

    .line 103
    :catch_8
    move-exception v10

    .line 104
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_4
    if-eqz v5, :cond_9

    .line 109
    :try_start_a
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 110
    const/4 v5, 0x0

    .line 114
    :cond_9
    goto :goto_5

    .line 112
    :catch_9
    move-exception v10

    .line 113
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :goto_5
    throw v9

    .line 117
    :goto_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$callBack:Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;

    if-eqz v0, :cond_a

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/https/Http$1;->val$callBack:Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;

    invoke-interface {v0, v7, v6}, Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;->onFinished(ILjava/lang/String;)V

    .line 120
    :cond_a
    return-void
.end method

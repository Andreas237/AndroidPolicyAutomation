.class final Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->postReq(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lo/czi;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callBack:Lo/czi;

.field final synthetic val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

.field final synthetic val$strBody:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljavax/net/ssl/HttpsURLConnection;Lo/czi;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$strBody:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    iput-object p3, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$callBack:Lo/czi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 137
    const/4 v4, 0x0

    .line 138
    const/4 v5, 0x0

    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v7, -0x1

    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$strBody:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v4, v0

    .line 145
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$strBody:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    .line 146
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 150
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v7

    .line 151
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x3

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

    const-string v2, " message "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v2}, Ljavax/net/ssl/HttpsURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postReq-->responseHeader: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v2}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const/16 v0, 0xc8

    if-ne v7, v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 155
    invoke-static {v5}, Lo/czj;->c(Ljava/io/InputStream;)[B

    move-result-object v8

    .line 156
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v8, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v6, v0

    .line 157
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->jsonResult :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    goto :goto_0

    .line 159
    :cond_1
    const/4 v7, -0x1

    .line 169
    :goto_0
    if-eqz v4, :cond_2

    .line 170
    :try_start_1
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 174
    :cond_2
    goto :goto_1

    .line 172
    :catch_0
    move-exception v8

    .line 173
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :goto_1
    if-eqz v5, :cond_3

    .line 178
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 182
    :cond_3
    goto/16 :goto_6

    .line 180
    :catch_1
    move-exception v8

    .line 181
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    goto/16 :goto_6

    .line 161
    :catch_2
    move-exception v8

    .line 162
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    const/4 v7, -0x1

    .line 169
    if-eqz v4, :cond_4

    .line 170
    :try_start_4
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 174
    :cond_4
    goto :goto_2

    .line 172
    :catch_3
    move-exception v8

    .line 173
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :goto_2
    if-eqz v5, :cond_5

    .line 178
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 182
    :cond_5
    goto/16 :goto_6

    .line 180
    :catch_4
    move-exception v8

    .line 181
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    goto/16 :goto_6

    .line 164
    :catch_5
    move-exception v8

    .line 165
    const/4 v7, -0x1

    .line 166
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 169
    if-eqz v4, :cond_6

    .line 170
    :try_start_7
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 174
    :cond_6
    goto :goto_3

    .line 172
    :catch_6
    move-exception v8

    .line 173
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :goto_3
    if-eqz v5, :cond_7

    .line 178
    :try_start_8
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 182
    :cond_7
    goto :goto_6

    .line 180
    :catch_7
    move-exception v8

    .line 181
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    goto :goto_6

    .line 168
    :catchall_0
    move-exception v9

    .line 169
    if-eqz v4, :cond_8

    .line 170
    :try_start_9
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 174
    :cond_8
    goto :goto_4

    .line 172
    :catch_8
    move-exception v10

    .line 173
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    :goto_4
    if-eqz v5, :cond_9

    .line 178
    :try_start_a
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 182
    :cond_9
    goto :goto_5

    .line 180
    :catch_9
    move-exception v10

    .line 181
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    :goto_5
    throw v9

    .line 185
    :goto_6
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$callBack:Lo/czi;

    if-eqz v0, :cond_a

    .line 187
    :try_start_b
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;->val$callBack:Lo/czi;

    invoke-interface {v0, v7, v6}, Lo/czi;->b(ILjava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a

    .line 190
    goto :goto_7

    .line 188
    :catch_a
    move-exception v8

    .line 189
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :cond_a
    :goto_7
    return-void
.end method

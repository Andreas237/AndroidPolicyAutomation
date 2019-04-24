.class public Lcom/huawei/hwcloudmodel/model/RequestResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mConnection:Ljava/net/HttpURLConnection;

.field private mInputStream:Ljava/io/InputStream;

.field private mResponseAsString:Ljava/lang/String;

.field private mStatusCode:I


# direct methods
.method public constructor <init>(Ljava/net/HttpURLConnection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mResponseAsString:Ljava/lang/String;

    .line 23
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mConnection:Ljava/net/HttpURLConnection;

    .line 24
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mStatusCode:I

    .line 25
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mInputStream:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 26
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mInputStream:Ljava/io/InputStream;

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mInputStream:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, "gzip"

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mInputStream:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mInputStream:Ljava/io/InputStream;

    .line 32
    :cond_1
    return-void
.end method


# virtual methods
.method public asByte()[B
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    const/16 v0, 0x400

    new-array v4, v0, [B

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/RequestResult;->asStream()Ljava/io/InputStream;

    move-result-object v7

    .line 59
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 61
    :goto_0
    const/4 v0, 0x0

    const/16 v1, 0x400

    :try_start_0
    invoke-virtual {v7, v4, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 62
    const/4 v0, 0x0

    invoke-virtual {v8, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    add-int/2addr v6, v5

    goto :goto_0

    .line 67
    :cond_0
    goto :goto_1

    .line 65
    :catch_0
    move-exception v9

    .line 66
    const-string v0, ""

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    :goto_1
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V

    .line 69
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 70
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public asFile(Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 109
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 110
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_0

    .line 113
    :catch_0
    move-exception v5

    .line 114
    const-string v0, "RequestResult"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :cond_0
    :goto_0
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 129
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/RequestResult;->asByte()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 130
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 136
    goto :goto_1

    .line 131
    :catch_1
    move-exception v6

    .line 132
    const-string v0, "RequestResult"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 136
    goto :goto_1

    .line 135
    :catchall_0
    move-exception v7

    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 136
    throw v7

    .line 138
    :goto_1
    const/4 v5, 0x0

    .line 139
    const/4 v4, 0x0

    .line 140
    return-void
.end method

.method public asStream()Ljava/io/InputStream;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mInputStream:Ljava/io/InputStream;

    return-object v0
.end method

.method public asString()Ljava/lang/String;
    .locals 8

    .line 80
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mResponseAsString:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 83
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/RequestResult;->asStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 85
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 89
    :cond_0
    :try_start_1
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v5, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v4, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 90
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 93
    :goto_0
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 94
    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mResponseAsString:Ljava/lang/String;

    .line 97
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 98
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 99
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 100
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 103
    goto :goto_1

    .line 101
    :catch_0
    move-exception v5

    .line 102
    const-string v0, "error Exception"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mResponseAsString:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/RequestResult;->mStatusCode:I

    return v0
.end method

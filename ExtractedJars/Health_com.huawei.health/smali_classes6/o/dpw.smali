.class public Lo/dpw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private c:Lo/doz;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/doz;Z)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dpw;->c:Lo/doz;

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dpw;->d:Z

    .line 30
    iput-object p2, p0, Lo/dpw;->c:Lo/doz;

    .line 31
    iput-boolean p3, p0, Lo/dpw;->d:Z

    .line 32
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 129
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 130
    const-string v0, "updateLog"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 131
    const-string v0, "updateLog"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 132
    const-string v0, "IMEI"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    const-string v0, "IMEI"

    const-string v1, "IMEI"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dbf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    :cond_0
    const-string v0, "udid"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    const-string v0, "udid"

    const-string v1, "udid"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dbf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    :cond_1
    const-string v0, "deviceId"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    const-string v0, "deviceId"

    const-string v1, "deviceId"

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dbf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    :cond_2
    const-string v0, "updateLog"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 144
    :cond_3
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not have updateLog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 148
    goto :goto_0

    .line 146
    :catch_0
    move-exception v4

    .line 147
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get log content exption :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public d()Ljava/io/OutputStream;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 80
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convertUpdateLogXMLToStream JSON begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 82
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 83
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 84
    iget-object v0, p0, Lo/dpw;->c:Lo/doz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "appStatusReportInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_0
    const-string v0, "operateType"

    iget-object v1, p0, Lo/dpw;->c:Lo/doz;

    iget v1, v1, Lo/doz;->e:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    iget-boolean v0, p0, Lo/dpw;->d:Z

    if-eqz v0, :cond_3

    .line 90
    invoke-static {}, Lo/dbf;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    const-string v0, "udid"

    invoke-static {}, Lo/dbf;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    const-string v0, "deviceId"

    invoke-static {}, Lo/dbf;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 96
    :cond_1
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    const-string v0, "IMEI"

    iget-object v1, p0, Lo/dpw;->c:Lo/doz;

    iget-object v1, v1, Lo/doz;->b:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 100
    :cond_2
    const-string v0, "udid"

    invoke-static {}, Lo/dbf;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    const-string v0, "deviceId"

    invoke-static {}, Lo/dbf;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 105
    :cond_3
    iget-object v0, p0, Lo/dpw;->c:Lo/doz;

    iget-object v0, v0, Lo/doz;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dbf;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 106
    const-string v0, "deviceId"

    iget-object v1, p0, Lo/dpw;->c:Lo/doz;

    iget-object v1, v1, Lo/doz;->b:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 108
    :cond_4
    const-string v0, "IMEI"

    iget-object v1, p0, Lo/dpw;->c:Lo/doz;

    iget-object v1, v1, Lo/doz;->b:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    :goto_0
    const-string v0, "versionID"

    iget-object v1, p0, Lo/dpw;->c:Lo/doz;

    iget-object v1, v1, Lo/doz;->a:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    const-string v0, "clientversion"

    iget-object v1, p0, Lo/dpw;->c:Lo/doz;

    iget-object v1, v1, Lo/doz;->c:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    const-string v0, "descinfo"

    iget-object v1, p0, Lo/dpw;->c:Lo/doz;

    iget-object v1, v1, Lo/doz;->d:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    const-string v0, "updateLog"

    invoke-virtual {v5, v0, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 116
    invoke-virtual {v4, v7}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 117
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 118
    return-object v4
.end method

.method public run()V
    .locals 10

    .line 35
    const/4 v4, 0x0

    .line 37
    :try_start_0
    invoke-virtual {p0}, Lo/dpw;->d()Ljava/io/OutputStream;

    move-result-object v0

    move-object v4, v0

    .line 38
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dpw;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 42
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "app status : \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/dpw;->d:Z

    if-nez v0, :cond_0

    .line 46
    const-string v6, "https://query.hwcloudtest.cn/ring/v2/UpdateReport.action"

    goto :goto_0

    .line 48
    :cond_0
    invoke-static {}, Lo/dpm;->b()Ljava/lang/String;

    move-result-object v6

    .line 50
    :goto_0
    const/4 v7, 0x0

    .line 51
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 52
    invoke-static {v6}, Lo/dpk;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    invoke-static {v6, v4}, Lo/dpj;->d(Ljava/lang/String;Ljava/io/OutputStream;)I

    move-result v7

    goto :goto_1

    .line 55
    :cond_1
    invoke-static {v6, v4}, Lo/dph;->d(Ljava/lang/String;Ljava/io/OutputStream;)I

    move-result v7

    .line 58
    :cond_2
    :goto_1
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statusCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 70
    :try_start_1
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 75
    :cond_4
    goto/16 :goto_3

    .line 73
    :catch_0
    move-exception v5

    .line 74
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally JSONException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    goto/16 :goto_3

    .line 60
    :catch_1
    move-exception v5

    .line 61
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 70
    :try_start_3
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 75
    :cond_5
    goto/16 :goto_3

    .line 73
    :catch_2
    move-exception v5

    .line 74
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally JSONException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    goto :goto_3

    .line 62
    :catch_3
    move-exception v5

    .line 63
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RuntimeException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 70
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 75
    :cond_6
    goto :goto_3

    .line 73
    :catch_4
    move-exception v5

    .line 74
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally JSONException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    goto :goto_3

    .line 64
    :catch_5
    move-exception v5

    .line 65
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 69
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 70
    :try_start_7
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 75
    :cond_7
    goto :goto_3

    .line 73
    :catch_6
    move-exception v5

    .line 74
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally JSONException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    goto :goto_3

    .line 67
    :catchall_0
    move-exception v8

    .line 69
    const/4 v0, 0x0

    if-eq v0, v4, :cond_8

    .line 70
    :try_start_8
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 75
    :cond_8
    goto :goto_2

    .line 73
    :catch_7
    move-exception v9

    .line 74
    const-string v0, "AppStatusReportThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally JSONException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_2
    throw v8

    .line 77
    :goto_3
    return-void
.end method

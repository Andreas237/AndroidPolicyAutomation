.class public final Lcom/huawei/hwdevicedfxmanager/upload/UploadRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "LogUpload Service"

.field private static final PAUSE_STATUS:Ljava/lang/String; = "1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static deleteEncryFile(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V
    .locals 6

    .line 228
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 229
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "encryfilePath"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    if-eqz v4, :cond_1

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 231
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 232
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "encryfilePath"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6587\u4ef6\u5220\u9664\u6210\u529f\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 237
    :cond_0
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6587\u4ef6\u4e0d\u5b58\u5728 \u6216\u8005 \u51fa\u9519\uff01\u6587\u4ef6\u5220\u9664\u5931\u8d25!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    :cond_1
    :goto_0
    return-void
.end method

.method public static upLoadEventLog(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V
    .locals 19

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const v11, 0xfa000

    .line 37
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    new-instance v12, Ljava/net/URL;

    const-string v0, "http://223.202.123.136:10180/transformCenter/logUpload"

    invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 41
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==ww==\u4e0a\u4f20\u5230\u670d\u52a1\u5668 \u670d\u52a1\u5668\u5730\u5740 url="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/net/HttpURLConnection;

    .line 44
    const-string v0, "POST"

    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 46
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 47
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 48
    invoke-virtual {v13, v11}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 49
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {v13, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v13, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const-string v0, "Content-Type"

    const-string v1, "multipart/form-data;boundary=---------------------------40612316912668"

    invoke-virtual {v13, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "x-huid"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string v0, "x-version"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const v0, 0xfa000

    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 58
    const v0, 0x1d4c0

    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 59
    const v0, 0x1d4c0

    invoke-virtual {v13, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 60
    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->connect()V

    .line 61
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v9, v0

    .line 62
    const-string v0, "\r\n"

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 63
    new-instance v14, Lcom/google/gson/Gson;

    invoke-direct {v14}, Lcom/google/gson/Gson;-><init>()V

    .line 64
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logUpload "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getInfo()Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getInfo()Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lcom/huawei/hwdevicedfxmanager/upload/UploadFile;->addJsonField(Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 66
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/upload/UploadFile;->addOctetServiceField(Ljava/io/DataOutputStream;Ljava/lang/String;)I

    .line 67
    invoke-static {v9}, Lcom/huawei/hwdevicedfxmanager/upload/UploadFile;->addEndField(Ljava/lang/Object;)I

    .line 68
    invoke-virtual {v9}, Ljava/io/DataOutputStream;->flush()V

    .line 70
    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    .line 71
    new-instance v15, Ljava/lang/StringBuffer;

    invoke-direct {v15}, Ljava/lang/StringBuffer;-><init>()V

    .line 72
    const/16 v0, 0x400

    new-array v0, v0, [B

    move-object/from16 v16, v0

    .line 73
    const/16 v17, 0x0

    .line 75
    :goto_0
    move-object/from16 v0, v16

    invoke-virtual {v8, v0}, Ljava/io/InputStream;->read([B)I

    move-result v17

    .line 76
    const/4 v0, -0x1

    move/from16 v1, v17

    if-ne v0, v1, :cond_0

    .line 78
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadEventLog \u8bfb\u53d6\u5b8c\u6bd5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    goto :goto_1

    .line 81
    :cond_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    move-object/from16 v2, v16

    const/4 v3, 0x0

    move/from16 v4, v17

    invoke-direct {v0, v2, v3, v4, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v15, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 82
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upLoadEventLog \u8bfb\u53d6"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/lang/String;

    const-string v4, "utf-8"

    move-object/from16 v5, v16

    const/4 v6, 0x0

    move/from16 v7, v17

    invoke-direct {v3, v5, v6, v7, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 86
    :goto_1
    invoke-virtual {v15}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    .line 87
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upLoadEventLog \u8bfb\u53d6\u5b8c\u6210 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadEventLog finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 98
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 99
    goto/16 :goto_2

    .line 88
    :catch_0
    move-exception v12

    .line 89
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadEventLog \u5f02\u5e38\u60c5\u51b5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upLoadEventLog exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadEventLog finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 98
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 99
    goto/16 :goto_2

    .line 91
    :catch_1
    move-exception v12

    .line 92
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upLoadEventLog exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

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

    .line 96
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadEventLog finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 98
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 99
    goto :goto_2

    .line 93
    :catch_2
    move-exception v12

    .line 94
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " upLoadEventLog OutOfMemoryError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadEventLog finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 98
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 99
    goto :goto_2

    .line 96
    :catchall_0
    move-exception v18

    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadEventLog finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 98
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 99
    throw v18

    .line 101
    :goto_2
    new-instance v12, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;

    invoke-direct {v12}, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;-><init>()V

    .line 102
    invoke-virtual {v12, v10}, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;->parse(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 103
    invoke-virtual {v12}, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;->getResultCode()I

    move-result v0

    const/16 v1, 0x2710

    if-ne v1, v0, :cond_1

    .line 104
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u65e5\u5fd7\u5206\u53d1\u670d\u52a1\u5668\u7ed3\u679c\u89e3\u6790\u6b63\u786e,\u6570\u636e\u6210\u529f\u53d1\u9001"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    invoke-static/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/UploadRequest;->deleteEncryFile(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V

    goto :goto_3

    .line 107
    :cond_1
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f02\u5e38\u60c5\u51b5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    :goto_3
    return-void
.end method

.method public static upLoadHttpsEventLog(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V
    .locals 19

    .line 115
    const/4 v8, 0x0

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v10, 0x0

    .line 118
    const v11, 0xfa000

    .line 120
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    new-instance v12, Ljava/net/URL;

    const-string v0, "https://logtransform.hicloud.com/transformCenter/logUpload"

    invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 122
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==ww==\u4e0a\u4f20\u5230\u670d\u52a1\u5668 \u670d\u52a1\u5668\u5730\u5740 url="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==ww== 00000000000000000000000"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    const-string v0, "TLSv1.2"

    :try_start_1
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v14

    .line 128
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TLSv1.2!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v0, 0x1

    new-array v0, v0, [Ljavax/net/ssl/TrustManager;

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/utils/HwX509TrustMangerEx;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/HwX509TrustMangerEx;-><init>(Ljava/security/KeyStore;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v14, v1, v0, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 131
    invoke-virtual {v14}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v15

    .line 132
    const/4 v0, 0x0

    if-ne v0, v15, :cond_0

    .line 133
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "socketFactory is null error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/KeyManagementException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 134
    return-void

    .line 136
    :cond_0
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwOucSSLSocketFactory hssocketFactory !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    new-instance v0, Lo/dpf;

    move-object v1, v15

    invoke-direct {v0, v1}, Lo/dpf;-><init>(Ljavax/net/ssl/SSLSocketFactory;)V

    move-object/from16 v16, v0

    .line 139
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/security/KeyManagementException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    goto/16 :goto_0

    .line 140
    :catch_0
    move-exception v14

    .line 141
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NoSuchAlgorithmException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 142
    return-void

    .line 143
    :catch_1
    move-exception v14

    .line 144
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KeyManagementException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/security/KeyManagementException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 145
    return-void

    .line 146
    :catch_2
    move-exception v14

    .line 147
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KeyStoreException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/security/KeyStoreException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 148
    return-void

    .line 151
    :goto_0
    const-string v0, "POST"

    :try_start_6
    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 152
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 153
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 155
    invoke-virtual {v13, v11}, Ljavax/net/ssl/HttpsURLConnection;->setChunkedStreamingMode(I)V

    .line 157
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {v13, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v13, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "Content-Type"

    const-string v1, "multipart/form-data;boundary=---------------------------40612316912668"

    invoke-virtual {v13, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string v0, "x-huid"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "x-version"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const v0, 0xfa000

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setChunkedStreamingMode(I)V

    .line 166
    const v0, 0x1d4c0

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 167
    const v0, 0x1d4c0

    invoke-virtual {v13, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 168
    invoke-virtual {v13}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 169
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v13}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v9, v0

    .line 170
    const-string v0, "\r\n"

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 171
    new-instance v14, Lcom/google/gson/Gson;

    invoke-direct {v14}, Lcom/google/gson/Gson;-><init>()V

    .line 172
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logUpload.getInfo() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getInfo()Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getInfo()Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lcom/huawei/hwdevicedfxmanager/upload/UploadFile;->addJsonField(Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 174
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/upload/UploadFile;->addOctetServiceField(Ljava/io/DataOutputStream;Ljava/lang/String;)I

    .line 175
    invoke-static {v9}, Lcom/huawei/hwdevicedfxmanager/upload/UploadFile;->addEndField(Ljava/lang/Object;)I

    .line 176
    invoke-virtual {v9}, Ljava/io/DataOutputStream;->flush()V

    .line 178
    invoke-virtual {v13}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    .line 179
    new-instance v15, Ljava/lang/StringBuffer;

    invoke-direct {v15}, Ljava/lang/StringBuffer;-><init>()V

    .line 180
    const/16 v0, 0x400

    new-array v0, v0, [B

    move-object/from16 v16, v0

    .line 181
    const/16 v17, 0x0

    .line 183
    :goto_1
    move-object/from16 v0, v16

    invoke-virtual {v8, v0}, Ljava/io/InputStream;->read([B)I

    move-result v17

    .line 184
    const/4 v0, -0x1

    move/from16 v1, v17

    if-ne v0, v1, :cond_1

    .line 186
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8bfb\u53d6\u5b8c\u6bd5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    goto :goto_2

    .line 189
    :cond_1
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    move-object/from16 v2, v16

    const/4 v3, 0x0

    move/from16 v4, v17

    invoke-direct {v0, v2, v3, v4, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v15, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 190
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bfb\u53d6"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/lang/String;

    const-string v4, "utf-8"

    move-object/from16 v5, v16

    const/4 v6, 0x0

    move/from16 v7, v17

    invoke-direct {v3, v5, v6, v7, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 193
    :goto_2
    invoke-virtual {v15}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    .line 194
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bfb\u53d6\u5b8c\u6210 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 206
    goto/16 :goto_3

    .line 195
    :catch_3
    move-exception v12

    .line 196
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f02\u5e38\u60c5\u51b5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 206
    goto/16 :goto_3

    .line 198
    :catch_4
    move-exception v12

    .line 199
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_8
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 206
    goto :goto_3

    .line 200
    :catch_5
    move-exception v12

    .line 201
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " OutOfMemoryError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 203
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 206
    goto :goto_3

    .line 203
    :catchall_0
    move-exception v18

    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally close "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const-string v0, "LogUpload Service"

    invoke-static {v8, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->close(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 205
    const-string v0, "LogUpload Service"

    invoke-static {v9, v0}, Lcom/huawei/hwdevicedfxmanager/utils/Utils;->closeDataOutputStream(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 206
    throw v18

    .line 208
    :goto_3
    new-instance v12, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;

    invoke-direct {v12}, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;-><init>()V

    .line 210
    invoke-virtual {v12, v10}, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;->parse(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 211
    invoke-virtual {v12}, Lcom/huawei/hwdevicedfxmanager/upload/EventUploadResponse;->getResultCode()I

    move-result v0

    const/16 v1, 0x2710

    if-ne v1, v0, :cond_2

    .line 212
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u65e5\u5fd7\u5206\u53d1\u670d\u52a1\u5668\u7ed3\u679c\u89e3\u6790\u6b63\u786e,\u6570\u636e\u6210\u529f\u53d1\u9001"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-static/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/upload/UploadRequest;->deleteEncryFile(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V

    goto :goto_4

    .line 215
    :cond_2
    const-string v0, "LogUpload Service"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f02\u5e38\u60c5\u51b5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    :goto_4
    return-void
.end method

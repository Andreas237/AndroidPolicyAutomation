.class public Lo/exe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "healthdevice"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/exe;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lo/exc;
    .locals 6

    .line 79
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DataManager parse single Result"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    new-instance v4, Lo/exc;

    invoke-direct {v4}, Lo/exc;-><init>()V

    .line 81
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 85
    :cond_1
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 86
    const-string v0, "fileId"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    const-string v0, "fileId"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/exc;->e(Ljava/lang/String;)V

    .line 89
    :cond_2
    const-string v0, "ver"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 90
    const-string v0, "ver"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/exc;->d(Ljava/lang/String;)V

    .line 92
    :cond_3
    const-string v0, "downloadUrl"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 93
    const-string v0, "downloadUrl"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/exc;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :cond_4
    goto :goto_0

    .line 95
    :catch_0
    move-exception v5

    .line 96
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    :goto_0
    return-object v4
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V
    .locals 21

    .line 238
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest url servicesupport/updateserver/getLatestVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    const/4 v4, -0x1

    .line 240
    const-string v5, ""

    .line 241
    const/4 v6, 0x0

    .line 242
    const/4 v7, 0x0

    .line 243
    const/4 v8, 0x0

    .line 244
    const/4 v9, 0x0

    .line 245
    const/4 v10, 0x0

    .line 247
    :try_start_0
    new-instance v11, Ljava/net/URL;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 248
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    invoke-virtual {v11}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v6, v0

    .line 250
    const-string v0, "POST"

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 251
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest setRequestMethod"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 254
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 255
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 256
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 257
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 259
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest param = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 262
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v10, v0

    .line 263
    const-string v0, "UTF-8"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V

    .line 264
    invoke-virtual {v10}, Ljava/io/OutputStream;->flush()V

    goto :goto_0

    .line 266
    :cond_0
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest parm is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    :goto_0
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->connect()V

    .line 269
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move v4, v0

    .line 270
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest connect code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_2

    .line 272
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v9, v0

    .line 273
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v9, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v8, v0

    .line 274
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v7, v0

    .line 275
    new-instance v12, Ljava/lang/StringBuffer;

    const/16 v0, 0x20

    invoke-direct {v12, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 277
    const/16 v0, 0x400

    new-array v14, v0, [B

    .line 278
    :goto_1
    invoke-virtual {v9, v14}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v13, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 280
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    const/4 v2, 0x0

    invoke-direct {v0, v14, v2, v13, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 282
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 283
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 293
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 294
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 295
    const/4 v6, 0x0

    .line 297
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 299
    :try_start_1
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 302
    goto :goto_2

    .line 300
    :catch_0
    move-exception v11

    .line 301
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    :cond_4
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 306
    :try_start_2
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 309
    goto :goto_3

    .line 307
    :catch_1
    move-exception v11

    .line 308
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :cond_5
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v9, :cond_6

    .line 313
    :try_start_3
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 316
    goto :goto_4

    .line 314
    :catch_2
    move-exception v11

    .line 315
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :cond_6
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v10, :cond_7

    .line 320
    :try_start_4
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 323
    goto :goto_5

    .line 321
    :catch_3
    move-exception v11

    .line 322
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    :cond_7
    :goto_5
    sget-object v11, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v11

    .line 326
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_8

    .line 327
    move-object/from16 v0, p2

    :try_start_5
    invoke-interface {v0, v4, v5}, Lo/exf;->b(ILjava/lang/String;)V

    goto :goto_6

    .line 329
    :cond_8
    const-string v0, "postHttpRequest getMessage err"

    move-object/from16 v1, p2

    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 331
    :goto_6
    monitor-exit v11

    goto :goto_7

    :catchall_0
    move-exception v15

    monitor-exit v11

    throw v15

    .line 332
    :goto_7
    goto/16 :goto_18

    .line 286
    :catch_4
    move-exception v11

    .line 287
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest MalformedURLException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 288
    const/4 v4, -0x1

    .line 293
    const/4 v0, 0x0

    if-eq v0, v6, :cond_9

    .line 294
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 295
    const/4 v6, 0x0

    .line 297
    :cond_9
    const/4 v0, 0x0

    if-eq v0, v7, :cond_a

    .line 299
    :try_start_7
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 302
    goto :goto_8

    .line 300
    :catch_5
    move-exception v11

    .line 301
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    :cond_a
    :goto_8
    const/4 v0, 0x0

    if-eq v0, v8, :cond_b

    .line 306
    :try_start_8
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 309
    goto :goto_9

    .line 307
    :catch_6
    move-exception v11

    .line 308
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :cond_b
    :goto_9
    const/4 v0, 0x0

    if-eq v0, v9, :cond_c

    .line 313
    :try_start_9
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    .line 316
    goto :goto_a

    .line 314
    :catch_7
    move-exception v11

    .line 315
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :cond_c
    :goto_a
    const/4 v0, 0x0

    if-eq v0, v10, :cond_d

    .line 320
    :try_start_a
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 323
    goto :goto_b

    .line 321
    :catch_8
    move-exception v11

    .line 322
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    :cond_d
    :goto_b
    sget-object v11, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v11

    .line 326
    nop

    .line 327
    .line 329
    const-string v0, "postHttpRequest getMessage err"

    move-object/from16 v1, p2

    :try_start_b
    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 331
    monitor-exit v11

    goto :goto_c

    :catchall_1
    move-exception v16

    monitor-exit v11

    throw v16

    .line 332
    :goto_c
    goto/16 :goto_18

    .line 289
    :catch_9
    move-exception v11

    .line 290
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    :try_start_c
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest IOException:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 291
    const/4 v4, -0x1

    .line 293
    const/4 v0, 0x0

    if-eq v0, v6, :cond_e

    .line 294
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 295
    const/4 v6, 0x0

    .line 297
    :cond_e
    const/4 v0, 0x0

    if-eq v0, v7, :cond_f

    .line 299
    :try_start_d
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_a

    .line 302
    goto :goto_d

    .line 300
    :catch_a
    move-exception v11

    .line 301
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    :cond_f
    :goto_d
    const/4 v0, 0x0

    if-eq v0, v8, :cond_10

    .line 306
    :try_start_e
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    .line 309
    goto :goto_e

    .line 307
    :catch_b
    move-exception v11

    .line 308
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :cond_10
    :goto_e
    const/4 v0, 0x0

    if-eq v0, v9, :cond_11

    .line 313
    :try_start_f
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_c

    .line 316
    goto :goto_f

    .line 314
    :catch_c
    move-exception v11

    .line 315
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :cond_11
    :goto_f
    const/4 v0, 0x0

    if-eq v0, v10, :cond_12

    .line 320
    :try_start_10
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_d

    .line 323
    goto :goto_10

    .line 321
    :catch_d
    move-exception v11

    .line 322
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    :cond_12
    :goto_10
    sget-object v11, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v11

    .line 326
    nop

    .line 327
    .line 329
    const-string v0, "postHttpRequest getMessage err"

    move-object/from16 v1, p2

    :try_start_11
    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 331
    monitor-exit v11

    goto :goto_11

    :catchall_2
    move-exception v17

    monitor-exit v11

    throw v17

    .line 332
    :goto_11
    goto/16 :goto_18

    .line 293
    :catchall_3
    move-exception v18

    const/4 v0, 0x0

    if-eq v0, v6, :cond_13

    .line 294
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 295
    const/4 v6, 0x0

    .line 297
    :cond_13
    const/4 v0, 0x0

    if-eq v0, v7, :cond_14

    .line 299
    :try_start_12
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_e

    .line 302
    goto :goto_12

    .line 300
    :catch_e
    move-exception v19

    .line 301
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    :cond_14
    :goto_12
    const/4 v0, 0x0

    if-eq v0, v8, :cond_15

    .line 306
    :try_start_13
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_f

    .line 309
    goto :goto_13

    .line 307
    :catch_f
    move-exception v19

    .line 308
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :cond_15
    :goto_13
    const/4 v0, 0x0

    if-eq v0, v9, :cond_16

    .line 313
    :try_start_14
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_10

    .line 316
    goto :goto_14

    .line 314
    :catch_10
    move-exception v19

    .line 315
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :cond_16
    :goto_14
    const/4 v0, 0x0

    if-eq v0, v10, :cond_17

    .line 320
    :try_start_15
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_11

    .line 323
    goto :goto_15

    .line 321
    :catch_11
    move-exception v19

    .line 322
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    :cond_17
    :goto_15
    sget-object v19, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v19

    .line 326
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_18

    .line 327
    move-object/from16 v0, p2

    :try_start_16
    invoke-interface {v0, v4, v5}, Lo/exf;->b(ILjava/lang/String;)V

    goto :goto_16

    .line 329
    :cond_18
    const-string v0, "postHttpRequest getMessage err"

    move-object/from16 v1, p2

    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 331
    :goto_16
    monitor-exit v19

    goto :goto_17

    :catchall_4
    move-exception v20

    monitor-exit v19

    throw v20

    .line 332
    :goto_17
    throw v18

    .line 333
    :goto_18
    return-void
.end method

.method public static a(Lo/exf;)V
    .locals 7

    .line 54
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceCloudUtil toDownloadSingleXmlFile()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const-string v4, ""

    .line 56
    const-string v5, ""

    .line 57
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "to download case_phone.xml"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    const-string v0, "case_phone"

    invoke-static {v0}, Lo/exe;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/exe;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "case_phone.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 60
    move-object v6, v5

    .line 61
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6587\u4ef6\u5730\u5740= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const-string v0, "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion"

    new-instance v1, Lo/exe$4;

    invoke-direct {v1, v6, p0}, Lo/exe$4;-><init>(Ljava/lang/String;Lo/exf;)V

    invoke-static {v0, v4, v1}, Lo/exe;->d(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V

    .line 77
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V
    .locals 21

    .line 140
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest url servicesupport/updateserver/getLatestVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const/4 v4, -0x1

    .line 142
    const-string v5, ""

    .line 143
    const/4 v6, 0x0

    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v8, 0x0

    .line 146
    const/4 v9, 0x0

    .line 147
    const/4 v10, 0x0

    .line 149
    :try_start_0
    new-instance v11, Ljava/net/URL;

    move-object/from16 v0, p0

    invoke-direct {v11, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 150
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    invoke-virtual {v11}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v6, v0

    .line 152
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 153
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 154
    const-string v0, "POST"

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 155
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest setRequestMethod"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v6, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 158
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 159
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 160
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 161
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 163
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest param = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v10, v0

    .line 167
    const-string v0, "UTF-8"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V

    .line 168
    invoke-virtual {v10}, Ljava/io/OutputStream;->flush()V

    goto :goto_0

    .line 170
    :cond_0
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest parm is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :goto_0
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 173
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v0

    move v4, v0

    .line 174
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest connect code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_2

    .line 176
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v9, v0

    .line 177
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v9, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v8, v0

    .line 178
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v7, v0

    .line 179
    new-instance v12, Ljava/lang/StringBuffer;

    const/16 v0, 0x20

    invoke-direct {v12, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 181
    const/16 v0, 0x400

    new-array v14, v0, [B

    .line 182
    :goto_1
    invoke-virtual {v9, v14}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v13, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 183
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    const/4 v2, 0x0

    invoke-direct {v0, v14, v2, v13, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 185
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 186
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 195
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 196
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 197
    const/4 v6, 0x0

    .line 199
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 201
    :try_start_1
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 204
    goto :goto_2

    .line 202
    :catch_0
    move-exception v11

    .line 203
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_4
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 208
    :try_start_2
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 211
    goto :goto_3

    .line 209
    :catch_1
    move-exception v11

    .line 210
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :cond_5
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v9, :cond_6

    .line 215
    :try_start_3
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 218
    goto :goto_4

    .line 216
    :catch_2
    move-exception v11

    .line 217
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :cond_6
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v10, :cond_7

    .line 222
    :try_start_4
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 225
    goto :goto_5

    .line 223
    :catch_3
    move-exception v11

    .line 224
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :cond_7
    :goto_5
    sget-object v11, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v11

    .line 228
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_8

    .line 229
    move-object/from16 v0, p2

    :try_start_5
    invoke-interface {v0, v4, v5}, Lo/exf;->b(ILjava/lang/String;)V

    goto :goto_6

    .line 231
    :cond_8
    const-string v0, "postHttpsRequest getMessage err"

    move-object/from16 v1, p2

    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 233
    :goto_6
    monitor-exit v11

    goto :goto_7

    :catchall_0
    move-exception v15

    monitor-exit v11

    throw v15

    .line 234
    :goto_7
    goto/16 :goto_18

    .line 188
    :catch_4
    move-exception v11

    .line 189
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest MalformedURLException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 190
    const/4 v4, -0x1

    .line 195
    const/4 v0, 0x0

    if-eq v0, v6, :cond_9

    .line 196
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 197
    const/4 v6, 0x0

    .line 199
    :cond_9
    const/4 v0, 0x0

    if-eq v0, v7, :cond_a

    .line 201
    :try_start_7
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 204
    goto :goto_8

    .line 202
    :catch_5
    move-exception v11

    .line 203
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_a
    :goto_8
    const/4 v0, 0x0

    if-eq v0, v8, :cond_b

    .line 208
    :try_start_8
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 211
    goto :goto_9

    .line 209
    :catch_6
    move-exception v11

    .line 210
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :cond_b
    :goto_9
    const/4 v0, 0x0

    if-eq v0, v9, :cond_c

    .line 215
    :try_start_9
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    .line 218
    goto :goto_a

    .line 216
    :catch_7
    move-exception v11

    .line 217
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :cond_c
    :goto_a
    const/4 v0, 0x0

    if-eq v0, v10, :cond_d

    .line 222
    :try_start_a
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 225
    goto :goto_b

    .line 223
    :catch_8
    move-exception v11

    .line 224
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :cond_d
    :goto_b
    sget-object v11, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v11

    .line 228
    nop

    .line 229
    .line 231
    const-string v0, "postHttpsRequest getMessage err"

    move-object/from16 v1, p2

    :try_start_b
    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 233
    monitor-exit v11

    goto :goto_c

    :catchall_1
    move-exception v16

    monitor-exit v11

    throw v16

    .line 234
    :goto_c
    goto/16 :goto_18

    .line 191
    :catch_9
    move-exception v11

    .line 192
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    :try_start_c
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest IOException:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 193
    const/4 v4, -0x1

    .line 195
    const/4 v0, 0x0

    if-eq v0, v6, :cond_e

    .line 196
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 197
    const/4 v6, 0x0

    .line 199
    :cond_e
    const/4 v0, 0x0

    if-eq v0, v7, :cond_f

    .line 201
    :try_start_d
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_a

    .line 204
    goto :goto_d

    .line 202
    :catch_a
    move-exception v11

    .line 203
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_f
    :goto_d
    const/4 v0, 0x0

    if-eq v0, v8, :cond_10

    .line 208
    :try_start_e
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b

    .line 211
    goto :goto_e

    .line 209
    :catch_b
    move-exception v11

    .line 210
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :cond_10
    :goto_e
    const/4 v0, 0x0

    if-eq v0, v9, :cond_11

    .line 215
    :try_start_f
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_c

    .line 218
    goto :goto_f

    .line 216
    :catch_c
    move-exception v11

    .line 217
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :cond_11
    :goto_f
    const/4 v0, 0x0

    if-eq v0, v10, :cond_12

    .line 222
    :try_start_10
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_d

    .line 225
    goto :goto_10

    .line 223
    :catch_d
    move-exception v11

    .line 224
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :cond_12
    :goto_10
    sget-object v11, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v11

    .line 228
    nop

    .line 229
    .line 231
    const-string v0, "postHttpsRequest getMessage err"

    move-object/from16 v1, p2

    :try_start_11
    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 233
    monitor-exit v11

    goto :goto_11

    :catchall_2
    move-exception v17

    monitor-exit v11

    throw v17

    .line 234
    :goto_11
    goto/16 :goto_18

    .line 195
    :catchall_3
    move-exception v18

    const/4 v0, 0x0

    if-eq v0, v6, :cond_13

    .line 196
    invoke-virtual {v6}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 197
    const/4 v6, 0x0

    .line 199
    :cond_13
    const/4 v0, 0x0

    if-eq v0, v7, :cond_14

    .line 201
    :try_start_12
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_e

    .line 204
    goto :goto_12

    .line 202
    :catch_e
    move-exception v19

    .line 203
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpUtil postRequest bufferedReader"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_14
    :goto_12
    const/4 v0, 0x0

    if-eq v0, v8, :cond_15

    .line 208
    :try_start_13
    invoke-virtual {v8}, Ljava/io/InputStreamReader;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_f

    .line 211
    goto :goto_13

    .line 209
    :catch_f
    move-exception v19

    .line 210
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :cond_15
    :goto_13
    const/4 v0, 0x0

    if-eq v0, v9, :cond_16

    .line 215
    :try_start_14
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_10

    .line 218
    goto :goto_14

    .line 216
    :catch_10
    move-exception v19

    .line 217
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :cond_16
    :goto_14
    const/4 v0, 0x0

    if-eq v0, v10, :cond_17

    .line 222
    :try_start_15
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_11

    .line 225
    goto :goto_15

    .line 223
    :catch_11
    move-exception v19

    .line 224
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v19 .. v19}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :cond_17
    :goto_15
    sget-object v19, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v19

    .line 228
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_18

    .line 229
    move-object/from16 v0, p2

    :try_start_16
    invoke-interface {v0, v4, v5}, Lo/exf;->b(ILjava/lang/String;)V

    goto :goto_16

    .line 231
    :cond_18
    const-string v0, "postHttpsRequest getMessage err"

    move-object/from16 v1, p2

    invoke-interface {v1, v4, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 233
    :goto_16
    monitor-exit v19

    goto :goto_17

    :catchall_4
    move-exception v20

    monitor-exit v19

    throw v20

    .line 234
    :goto_17
    throw v18

    .line 235
    :goto_18
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V
    .locals 16

    .line 356
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager download file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    const/4 v5, 0x0

    .line 358
    const/4 v6, 0x0

    .line 359
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_6

    .line 361
    :try_start_0
    new-instance v7, Ljava/net/URL;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 362
    const/4 v8, 0x0

    .line 363
    invoke-virtual {v7}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 364
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager download https"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljavax/net/ssl/HttpsURLConnection;

    goto :goto_0

    .line 367
    :cond_0
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/net/HttpURLConnection;

    .line 369
    :goto_0
    const/16 v0, 0x2710

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 370
    const/16 v0, 0x2710

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 371
    const-string v0, "GET"

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 373
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v9

    .line 374
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager download resCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    const/16 v0, 0xc8

    if-ne v0, v9, :cond_5

    .line 376
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 377
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager download health_file = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 380
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 381
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 382
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z

    move-result v12

    .line 385
    :cond_1
    new-instance v12, Ljava/io/File;

    move-object/from16 v0, p1

    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 386
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 387
    invoke-virtual {v12}, Ljava/io/File;->createNewFile()Z

    move-result v13

    .line 388
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "create_result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :cond_2
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 391
    const/16 v0, 0x400

    new-array v13, v0, [B

    .line 393
    :goto_1
    invoke-virtual {v5, v13}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v14, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 394
    const/4 v0, 0x0

    invoke-virtual {v6, v13, v0, v14}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1

    .line 396
    :cond_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    .line 397
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "----"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    invoke-static/range {p1 .. p1}, Lo/exe;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".xml"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 399
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FileManager download the extension is xml"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group parse success callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    const-string v0, "SUCCESS"

    move-object/from16 v1, p2

    const/16 v2, 0xc8

    invoke-interface {v1, v2, v0}, Lo/exf;->b(ILjava/lang/String;)V

    goto :goto_2

    .line 403
    :cond_4
    const-string v0, "FileManager download the extension not is  xml"

    move-object/from16 v1, p2

    const/4 v2, -0x1

    invoke-interface {v1, v2, v0}, Lo/exf;->d(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 413
    :cond_5
    :goto_2
    invoke-static {v5, v6}, Lo/exe;->e(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 414
    goto :goto_3

    .line 406
    :catch_0
    move-exception v7

    .line 407
    const-string v0, "ResourceManager download MalformedURLException "

    move-object/from16 v1, p2

    const/4 v2, -0x1

    :try_start_1
    invoke-interface {v1, v2, v0}, Lo/exf;->d(ILjava/lang/String;)V

    .line 408
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager download MalformedURLException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 413
    invoke-static {v5, v6}, Lo/exe;->e(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 414
    goto :goto_3

    .line 409
    :catch_1
    move-exception v7

    .line 410
    const-string v0, "ResourceManager download IOException e"

    move-object/from16 v1, p2

    const/4 v2, -0x1

    :try_start_2
    invoke-interface {v1, v2, v0}, Lo/exf;->d(ILjava/lang/String;)V

    .line 411
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager download IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 413
    invoke-static {v5, v6}, Lo/exe;->e(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 414
    goto :goto_3

    .line 413
    :catchall_0
    move-exception v15

    invoke-static {v5, v6}, Lo/exe;->e(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 414
    throw v15

    .line 416
    :cond_6
    :goto_3
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 102
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 104
    const-string v0, "fileId"

    :try_start_0
    invoke-virtual {v4, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    const-string v0, "ver"

    const-string v1, "0"

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    goto :goto_0

    .line 106
    :catch_0
    move-exception v5

    .line 107
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V
    .locals 4

    .line 112
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    :cond_0
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toFresh parame is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const-string v0, "toFresh parame is null"

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lo/exf;->d(ILjava/lang/String;)V

    .line 115
    return-void

    .line 117
    :cond_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/exe$2;

    invoke-direct {v1, p0, p1, p2}, Lo/exe$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 123
    return-void
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 419
    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 420
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 421
    return-object v2
.end method

.method public static e(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V
    .locals 5

    .line 425
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 427
    :try_start_0
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 430
    goto :goto_0

    .line 428
    :catch_0
    move-exception v4

    .line 429
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager download IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 435
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 438
    goto :goto_1

    .line 436
    :catch_1
    move-exception v4

    .line 437
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager download IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    :cond_1
    :goto_1
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V
    .locals 4

    .line 126
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest url servicesupport/updateserver/getLatestVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 128
    const-string v0, "https"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    invoke-static {p0, p1, p2}, Lo/exe;->b(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V

    goto :goto_0

    .line 131
    :cond_0
    invoke-static {p0, p1, p2}, Lo/exe;->a(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V

    goto :goto_0

    .line 134
    :cond_1
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest  httpUrl is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    const-string v0, "postRequest  httpUrl is null "

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lo/exf;->d(ILjava/lang/String;)V

    .line 137
    :goto_0
    return-void
.end method

.method public static e(Lo/exc;Ljava/lang/String;Lo/exf;)V
    .locals 5

    .line 337
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 338
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager toDownloadFile resultObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    const-string v0, "ResourceManager toDownloadFile resultObject is null"

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lo/exf;->d(ILjava/lang/String;)V

    .line 340
    return-void

    .line 342
    :cond_0
    invoke-virtual {p0}, Lo/exc;->e()Ljava/lang/String;

    move-result-object v4

    .line 343
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 344
    :cond_1
    const-string v0, "PluginDevice_CasePhoneDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager toDownloadFile url is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const-string v0, "ResourceManager toDownloadFile url is null"

    const/4 v1, -0x1

    invoke-interface {p2, v1, v0}, Lo/exf;->d(ILjava/lang/String;)V

    .line 346
    return-void

    .line 348
    :cond_2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/exe$1;

    invoke-direct {v1, v4, p1, p2}, Lo/exe$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/exf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 354
    return-void
.end method

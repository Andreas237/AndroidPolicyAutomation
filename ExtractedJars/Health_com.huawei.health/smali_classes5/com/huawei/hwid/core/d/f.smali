.class public Lcom/huawei/hwid/core/d/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/io/FileOutputStream;

.field private static b:Ljava/io/FileInputStream;

.field private static c:Ljava/util/Properties;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    .line 62
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    .line 63
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;

    return-void
.end method

.method public static a(Ljava/lang/String;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 8

    .line 568
    const-string v0, "FileUtil"

    const-string v1, "begin to put  result string To intent"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    const/4 v2, 0x0

    .line 571
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 572
    const-string v0, "&"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 574
    :cond_0
    const-string v0, "FileUtil"

    const-string v1, "string is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 575
    const/4 v0, 0x0

    return-object v0

    .line 578
    :goto_0
    move-object v3, v2

    :try_start_1
    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 579
    const-string v0, "="

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 580
    array-length v0, v7

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 581
    const/4 v0, 0x0

    aget-object v0, v7, v0

    const/4 v1, 0x1

    aget-object v1, v7, v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 578
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 586
    :cond_2
    goto :goto_2

    .line 584
    :catch_0
    move-exception v3

    .line 585
    const-string v0, "FileUtil"

    const-string v1, "put  result string To intent occur "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    :goto_2
    return-object p1
.end method

.method public static a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;)Ljava/lang/String;"
        }
    .end annotation

    .line 506
    const-string v0, "FileUtil"

    const-string v1, "begin to upLoad photo"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 511
    :try_start_0
    invoke-static {p1, p3}, Lcom/huawei/hwid/core/d/f;->a(Ljava/io/File;Ljava/util/HashMap;)[Lcom/android/internal/http/multipart/Part;

    move-result-object v4

    .line 512
    const/4 v5, 0x5

    .line 513
    array-length v0, v4

    if-ge v0, v5, :cond_0

    .line 514
    const-string v0, "FileUtil"

    const-string v1, "param is null or not enough"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    return-object v6

    .line 518
    :cond_0
    const/4 v6, 0x0

    .line 520
    :try_start_1
    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v0

    const/16 v1, 0x46a0

    const/16 v2, 0x480b

    invoke-virtual {v0, p0, v1, v2}, Lcom/huawei/hwid/vermanager/d;->a(Landroid/content/Context;II)Lorg/apache/http/client/HttpClient;

    move-result-object v6

    .line 522
    new-instance v7, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v7, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 524
    move-object/from16 v0, p4

    invoke-static {p0, v0, v7}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;Lorg/apache/http/client/methods/HttpPost;)V

    .line 526
    invoke-interface {v6}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.protocol.content-charset"

    const-string v2, "UTF-8"

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 528
    invoke-virtual {v7}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.timeout"

    const/16 v2, 0x4e20

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 529
    invoke-virtual {v7}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.connection.timeout"

    const/16 v2, 0x4e20

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 531
    new-instance v0, Lcom/android/internal/http/multipart/MultipartEntity;

    invoke-virtual {v7}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v1

    invoke-direct {v0, v4, v1}, Lcom/android/internal/http/multipart/MultipartEntity;-><init>([Lcom/android/internal/http/multipart/Part;Lorg/apache/http/params/HttpParams;)V

    invoke-virtual {v7, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 533
    invoke-interface {v6, v7}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v8

    .line 535
    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v9

    .line 537
    const/16 v0, 0xc8

    if-ne v0, v9, :cond_1

    .line 538
    const-string v0, "FileUtil"

    const-string v1, "resultCode is ok"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 542
    const-string v0, "FileUtil"

    const-string v1, "response responseXMLContent "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    invoke-virtual {v3, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 546
    goto :goto_0

    .line 547
    :cond_1
    const-string v0, "FileUtil"

    const-string v1, "resultCode "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 555
    :goto_0
    goto :goto_1

    .line 549
    :catch_0
    move-exception v4

    .line 550
    const-string v0, "FileUtil"

    const-string v1, "upload photo failed, IOException "

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 555
    goto :goto_1

    .line 551
    :catch_1
    move-exception v4

    .line 552
    const-string v0, "FileUtil"

    const-string v1, "upload photo failed Exception "

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 555
    goto :goto_1

    .line 553
    :catchall_0
    move-exception v11

    throw v11

    .line 556
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-class v5, Lcom/huawei/hwid/core/d/f;

    monitor-enter v5

    .line 221
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 222
    :cond_0
    const-string v0, "FileUtil"

    const-string v1, "at least 1 param is null"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    monitor-exit v5

    return-void

    .line 225
    :cond_1
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    .line 226
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    .line 227
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 229
    :try_start_1
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    :try_start_2
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 235
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 239
    :cond_2
    goto :goto_0

    .line 237
    :catch_0
    move-exception v2

    .line 238
    const-string v0, "FileUtil"

    const-string v1, "setProperties IOException"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 241
    :goto_0
    :try_start_4
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 242
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 246
    :cond_3
    goto/16 :goto_4

    .line 244
    :catch_1
    move-exception v2

    .line 245
    const-string v0, "FileUtil"

    const-string v1, "IOException"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 247
    goto :goto_4

    .line 230
    :catch_2
    move-exception v2

    .line 231
    const-string v0, "FileUtil"

    const-string v1, "IOException"

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 234
    :try_start_7
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 235
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 239
    :cond_4
    goto :goto_1

    .line 237
    :catch_3
    move-exception v2

    .line 238
    const-string v0, "FileUtil"

    const-string v1, "setProperties IOException"

    :try_start_8
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 241
    :goto_1
    :try_start_9
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 242
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 246
    :cond_5
    goto :goto_4

    .line 244
    :catch_4
    move-exception v2

    .line 245
    const-string v0, "FileUtil"

    const-string v1, "IOException"

    :try_start_a
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 247
    goto :goto_4

    .line 233
    :catchall_0
    move-exception v3

    .line 234
    :try_start_b
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 235
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 239
    :cond_6
    goto :goto_2

    .line 237
    :catch_5
    move-exception v4

    .line 238
    const-string v0, "FileUtil"

    const-string v1, "setProperties IOException"

    :try_start_c
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 241
    :goto_2
    :try_start_d
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 242
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 246
    :cond_7
    goto :goto_3

    .line 244
    :catch_6
    move-exception v4

    .line 245
    const-string v0, "FileUtil"

    const-string v1, "IOException"

    :try_start_e
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    :goto_3
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 248
    :goto_4
    monitor-exit v5

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lorg/apache/http/client/methods/HttpPost;)V
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TrulyRandom"
        }
    .end annotation

    .line 460
    invoke-static {p0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v3

    .line 461
    const/4 v0, 0x0

    invoke-interface {v3, p0, p1, v0}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v4

    .line 462
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 463
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v5

    .line 464
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v6

    .line 466
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/hwid/c/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 467
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 468
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 469
    const-string v9, ""

    .line 470
    invoke-static {}, Lcom/huawei/hwid/core/b/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 471
    invoke-static {}, Lcom/huawei/hwid/core/b/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwid/core/b/a/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "?Version=12000"

    const-string v2, ""

    .line 472
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 476
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 481
    const-string v0, "Authorization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Digest user="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "nonce"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "response"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 482
    invoke-static {v10, v5}, Lcom/huawei/hwid/core/encrypt/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 481
    invoke-virtual {p2, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 485
    const-string v0, "Cookie"

    invoke-virtual {p2, v0, v7}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    :cond_1
    goto :goto_0

    .line 488
    :cond_2
    const-string v0, "FileUtil"

    const-string v1, "token or userId is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    :goto_0
    goto :goto_1

    .line 491
    :cond_3
    const-string v0, "FileUtil"

    const-string v1, "account is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    :goto_1
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 6

    const-class v5, Lcom/huawei/hwid/core/d/f;

    monitor-enter v5

    .line 276
    const/4 v0, 0x0

    :try_start_0
    sput-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    .line 277
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    .line 278
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 280
    :try_start_1
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 285
    :try_start_2
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 286
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 290
    :cond_0
    goto :goto_0

    .line 288
    :catch_0
    move-exception v2

    .line 289
    const-string v0, "FileUtil"

    const-string v1, "removeProperties IOException:"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 292
    :goto_0
    :try_start_4
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 293
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 297
    :cond_1
    goto :goto_4

    .line 295
    :catch_1
    move-exception v2

    .line 296
    const-string v0, "FileUtil"

    const-string v1, "IOException"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 298
    goto :goto_4

    .line 281
    :catch_2
    move-exception v2

    .line 282
    const-string v0, "FileUtil"

    const-string v1, "Exception "

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 285
    :try_start_7
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 286
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 290
    :cond_2
    goto :goto_1

    .line 288
    :catch_3
    move-exception v2

    .line 289
    const-string v0, "FileUtil"

    const-string v1, "removeProperties IOException:"

    :try_start_8
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 292
    :goto_1
    :try_start_9
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 293
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 297
    :cond_3
    goto :goto_4

    .line 295
    :catch_4
    move-exception v2

    .line 296
    const-string v0, "FileUtil"

    const-string v1, "IOException"

    :try_start_a
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 298
    goto :goto_4

    .line 284
    :catchall_0
    move-exception v3

    .line 285
    :try_start_b
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 286
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 290
    :cond_4
    goto :goto_2

    .line 288
    :catch_5
    move-exception v4

    .line 289
    const-string v0, "FileUtil"

    const-string v1, "removeProperties IOException:"

    :try_start_c
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 292
    :goto_2
    :try_start_d
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 293
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 297
    :cond_5
    goto :goto_3

    .line 295
    :catch_6
    move-exception v4

    .line 296
    const-string v0, "FileUtil"

    const-string v1, "IOException"

    :try_start_e
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    :goto_3
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 299
    :goto_4
    monitor-exit v5

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method public static a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 437
    const-string v0, ""

    :try_start_0
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 438
    invoke-interface {p0, p2}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 439
    const-string v0, ""

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 448
    goto :goto_0

    .line 440
    :catch_0
    move-exception v2

    .line 441
    const-string v0, "FileUtil"

    const-string v1, "IllegalArgumentException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    goto :goto_0

    .line 442
    :catch_1
    move-exception v2

    .line 443
    const-string v0, "FileUtil"

    const-string v1, "IllegalStateException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    goto :goto_0

    .line 444
    :catch_2
    move-exception v2

    .line 445
    const-string v0, "FileUtil"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    goto :goto_0

    .line 446
    :catch_3
    move-exception v2

    .line 447
    const-string v0, "FileUtil"

    const-string v1, "Exception "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;Z)Z
    .locals 11

    .line 621
    const/4 v3, 0x0

    .line 622
    const/4 v4, 0x0

    .line 623
    const/4 v5, 0x0

    .line 625
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "rw"

    invoke-virtual {v0, p2, v1}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    move-object v5, v0

    .line 626
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    if-eqz p1, :cond_0

    .line 627
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->createOutputStream()Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v3, v0

    .line 628
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 630
    const/16 v0, 0x4000

    new-array v6, v0, [B

    .line 632
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 633
    :goto_0
    invoke-virtual {v4, v6}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v7, v0

    if-lez v0, :cond_0

    .line 634
    const/4 v0, 0x0

    invoke-virtual {v3, v6, v0, v7}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 642
    :cond_0
    if-eqz v4, :cond_1

    .line 643
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 645
    :cond_1
    if-eqz v3, :cond_2

    .line 646
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 648
    :cond_2
    if-eqz p3, :cond_3

    if-eqz p1, :cond_3

    .line 649
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 651
    :cond_3
    if-eqz v5, :cond_4

    .line 652
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 656
    :cond_4
    goto/16 :goto_3

    .line 654
    :catch_0
    move-exception v6

    .line 655
    const-string v0, "FileUtil"

    const-string v1, "error e"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    goto/16 :goto_3

    .line 638
    :catch_1
    move-exception v6

    .line 639
    const/4 v7, 0x0

    .line 642
    if-eqz v4, :cond_5

    .line 643
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 645
    :cond_5
    if-eqz v3, :cond_6

    .line 646
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 648
    :cond_6
    if-eqz p3, :cond_7

    if-eqz p1, :cond_7

    .line 649
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 651
    :cond_7
    if-eqz v5, :cond_8

    .line 652
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 656
    :cond_8
    goto :goto_1

    .line 654
    :catch_2
    move-exception v8

    .line 655
    const-string v0, "FileUtil"

    const-string v1, "error e"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    :goto_1
    return v7

    .line 641
    :catchall_0
    move-exception v9

    .line 642
    if-eqz v4, :cond_9

    .line 643
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 645
    :cond_9
    if-eqz v3, :cond_a

    .line 646
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 648
    :cond_a
    if-eqz p3, :cond_b

    if-eqz p1, :cond_b

    .line 649
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 651
    :cond_b
    if-eqz v5, :cond_c

    .line 652
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 656
    :cond_c
    goto :goto_2

    .line 654
    :catch_3
    move-exception v10

    .line 655
    const-string v0, "FileUtil"

    const-string v1, "error e"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    :goto_2
    throw v9

    .line 659
    :goto_3
    const/4 v0, 0x1

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .line 85
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 88
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 90
    invoke-static {v1}, Lcom/huawei/hwid/core/d/f;->a(Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method public static a(Ljava/io/File;)Z
    .locals 7

    .line 66
    const-string v0, "FileUtil"

    const-string v1, "deleteFile : file.getName"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    const/4 v0, 0x1

    return v0

    .line 72
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 74
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 75
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 76
    invoke-static {v6}, Lcom/huawei/hwid/core/d/f;->a(Ljava/io/File;)Z

    .line 75
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 81
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[B)Z
    .locals 8

    .line 94
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 95
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_1
    const/4 v2, 0x0

    .line 101
    :try_start_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 103
    const/4 v4, 0x0

    .line 119
    nop

    .line 103
    .line 121
    .line 122
    .line 123
    .line 124
    return v4

    .line 106
    :cond_2
    :try_start_1
    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 107
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 108
    invoke-virtual {v2, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    const/4 v0, 0x0

    if-eq v0, v2, :cond_6

    .line 121
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 124
    goto/16 :goto_3

    .line 122
    :catch_0
    move-exception v3

    .line 123
    const-string v0, "FileUtil"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    goto/16 :goto_3

    .line 110
    :catch_1
    move-exception v3

    .line 111
    const-string v0, "FileUtil"

    const-string v1, "writeAgreement FileNotFoundException"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    const/4 v4, 0x0

    .line 119
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 121
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 124
    goto :goto_0

    .line 122
    :catch_2
    move-exception v5

    .line 123
    const-string v0, "FileUtil"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    :cond_3
    :goto_0
    return v4

    .line 113
    :catch_3
    move-exception v3

    .line 114
    const-string v0, "FileUtil"

    const-string v1, "writeAgreement IOException"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 115
    const/4 v4, 0x0

    .line 119
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 121
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 124
    goto :goto_1

    .line 122
    :catch_4
    move-exception v5

    .line 123
    const-string v0, "FileUtil"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :cond_4
    :goto_1
    return v4

    .line 116
    :catch_5
    move-exception v3

    .line 117
    const-string v0, "FileUtil"

    const-string v1, "Exception "

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 119
    const/4 v0, 0x0

    if-eq v0, v2, :cond_6

    .line 121
    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 124
    goto :goto_3

    .line 122
    :catch_6
    move-exception v3

    .line 123
    const-string v0, "FileUtil"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    goto :goto_3

    .line 119
    :catchall_0
    move-exception v6

    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    .line 121
    :try_start_9
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    .line 124
    goto :goto_2

    .line 122
    :catch_7
    move-exception v7

    .line 123
    const-string v0, "FileUtil"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    :cond_5
    :goto_2
    throw v6

    .line 127
    :cond_6
    :goto_3
    const/4 v0, 0x1

    return v0
.end method

.method public static a(Ljava/io/File;Ljava/util/HashMap;)[Lcom/android/internal/http/multipart/Part;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)[Lcom/android/internal/http/multipart/Part;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 599
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 600
    :cond_0
    const-string v0, "FileUtil"

    const-string v1, "init body failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 601
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/android/internal/http/multipart/Part;

    return-object v0

    .line 603
    :cond_1
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    .line 604
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    .line 605
    add-int/lit8 v0, v4, 0x1

    new-array v5, v0, [Lcom/android/internal/http/multipart/Part;

    .line 607
    const-string v0, "FileUtil"

    const-string v1, "begin to init body"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 608
    const/4 v6, 0x0

    .line 609
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 610
    new-instance v0, Lcom/android/internal/http/multipart/StringPart;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/android/internal/http/multipart/StringPart;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v5, v6

    .line 611
    add-int/lit8 v6, v6, 0x1

    .line 612
    goto :goto_0

    .line 613
    :cond_2
    const-string v7, "BigImage"

    .line 614
    new-instance v0, Lcom/android/internal/http/multipart/FilePart;

    invoke-direct {v0, v7, p0}, Lcom/android/internal/http/multipart/FilePart;-><init>(Ljava/lang/String;Ljava/io/File;)V

    aput-object v0, v5, v4

    .line 615
    return-object v5
.end method

.method public static declared-synchronized b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 16

    const-class v15, Lcom/huawei/hwid/core/d/f;

    monitor-enter v15

    .line 132
    const/4 v3, 0x0

    .line 133
    const/4 v4, 0x0

    .line 135
    :try_start_0
    new-instance v5, Ljava/util/Properties;

    invoke-direct {v5}, Ljava/util/Properties;-><init>()V

    .line 136
    new-instance v6, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "settings.properties"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 137
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    const-string v0, "settings.properties"

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v4, v0

    .line 140
    :cond_0
    const-string v0, "settings.properties"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    move-object v3, v0

    .line 141
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 142
    invoke-virtual {v5, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    goto :goto_0

    .line 144
    :cond_1
    const-string v0, "FileUtil"

    const-string v1, "getProperties inStream is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    :goto_0
    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 149
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_4

    .line 150
    move-object v8, v7

    .line 169
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 170
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    :cond_2
    goto :goto_1

    .line 172
    :catch_0
    move-exception v9

    .line 173
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 176
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    .line 177
    :try_start_3
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 181
    :cond_3
    goto :goto_2

    .line 179
    :catch_1
    move-exception v9

    .line 180
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 150
    :goto_2
    monitor-exit v15

    return-object v8

    .line 154
    :cond_4
    :try_start_5
    invoke-static {}, Lcom/huawei/hwid/core/constants/a$a;->a()[Ljava/lang/String;

    move-result-object v8

    .line 155
    move-object v9, v8

    array-length v10, v9

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_6

    aget-object v12, v9, v11

    .line 156
    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 157
    move-object/from16 v0, p0

    invoke-static {v0, v7}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v7

    .line 158
    goto :goto_4

    .line 155
    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 162
    :cond_6
    :goto_4
    move-object v9, v7

    .line 169
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 170
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 174
    :cond_7
    goto :goto_5

    .line 172
    :catch_2
    move-exception v10

    .line 173
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 176
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v3, :cond_8

    .line 177
    :try_start_8
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 181
    :cond_8
    goto :goto_6

    .line 179
    :catch_3
    move-exception v10

    .line 180
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_9
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 162
    :goto_6
    monitor-exit v15

    return-object v9

    .line 163
    :catch_4
    move-exception v5

    .line 164
    const-string v0, "FileUtil"

    const-string v1, "Can not find the file settings.properties"

    :try_start_a
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 169
    const/4 v0, 0x0

    if-eq v0, v4, :cond_9

    .line 170
    :try_start_b
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 174
    :cond_9
    goto :goto_7

    .line 172
    :catch_5
    move-exception v5

    .line 173
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_c
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 176
    :goto_7
    const/4 v0, 0x0

    if-eq v0, v3, :cond_a

    .line 177
    :try_start_d
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 181
    :cond_a
    goto :goto_b

    .line 179
    :catch_6
    move-exception v5

    .line 180
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_e
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 182
    goto :goto_b

    .line 165
    :catch_7
    move-exception v5

    .line 166
    const-string v0, "FileUtil"

    const-string v1, "Throwable / "

    :try_start_f
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 169
    const/4 v0, 0x0

    if-eq v0, v4, :cond_b

    .line 170
    :try_start_10
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 174
    :cond_b
    goto :goto_8

    .line 172
    :catch_8
    move-exception v5

    .line 173
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_11
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 176
    :goto_8
    const/4 v0, 0x0

    if-eq v0, v3, :cond_c

    .line 177
    :try_start_12
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_9
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 181
    :cond_c
    goto :goto_b

    .line 179
    :catch_9
    move-exception v5

    .line 180
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_13
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 182
    goto :goto_b

    .line 168
    :catchall_0
    move-exception v13

    .line 169
    const/4 v0, 0x0

    if-eq v0, v4, :cond_d

    .line 170
    :try_start_14
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_a
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    .line 174
    :cond_d
    goto :goto_9

    .line 172
    :catch_a
    move-exception v14

    .line 173
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_15
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    .line 176
    :goto_9
    const/4 v0, 0x0

    if-eq v0, v3, :cond_e

    .line 177
    :try_start_16
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_b
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    .line 181
    :cond_e
    goto :goto_a

    .line 179
    :catch_b
    move-exception v14

    .line 180
    const-string v0, "FileUtil"

    const-string v1, "getProperties IOException / "

    :try_start_17
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    :goto_a
    throw v13
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    .line 184
    :goto_b
    const-string v0, ""

    monitor-exit v15

    return-object v0

    :catchall_1
    move-exception p0

    monitor-exit v15

    throw p0
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 189
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    .line 190
    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 191
    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "settings.properties"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 192
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    const-string v0, "settings.properties"

    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    .line 194
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 195
    sget-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;

    sget-object v1, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    goto :goto_0

    .line 197
    :cond_0
    const-string v0, "FileUtil"

    const-string v1, "inStream is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    :cond_1
    :goto_0
    const-string v0, "settings.properties"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    .line 203
    invoke-static {}, Lcom/huawei/hwid/core/constants/a$a;->a()[Ljava/lang/String;

    move-result-object v5

    .line 204
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_3

    aget-object v9, v6, v8

    .line 205
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 206
    invoke-static {p0, p2}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 207
    goto :goto_2

    .line 204
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 211
    :cond_3
    :goto_2
    sget-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;

    invoke-virtual {v0, p1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 212
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 213
    sget-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;

    sget-object v1, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const-string v2, "accountagent"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_3

    .line 215
    :cond_4
    const-string v0, "FileUtil"

    const-string v1, "outStream is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    :cond_5
    :goto_3
    return-void
.end method

.method private static b(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 251
    new-instance v3, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "settings.properties"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 252
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    const-string v0, "settings.properties"

    invoke-virtual {p0, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    .line 254
    sget-object v0, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 255
    sget-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;

    sget-object v1, Lcom/huawei/hwid/core/d/f;->b:Ljava/io/FileInputStream;

    invoke-virtual {v0, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    goto :goto_0

    .line 257
    :cond_0
    const-string v0, "FileUtil"

    const-string v1, "inStream is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    :cond_1
    :goto_0
    const-string v0, "settings.properties"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    .line 261
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    array-length v0, p1

    const/4 v1, 0x0

    if-ge v1, v0, :cond_3

    .line 262
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_3

    aget-object v7, v4, v6

    .line 263
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 264
    sget-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;

    invoke-virtual {v0, v7}, Ljava/util/Properties;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 268
    :cond_3
    sget-object v0, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 269
    sget-object v0, Lcom/huawei/hwid/core/d/f;->c:Ljava/util/Properties;

    sget-object v1, Lcom/huawei/hwid/core/d/f;->a:Ljava/io/FileOutputStream;

    const-string v2, "accountagent"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_2

    .line 271
    :cond_4
    const-string v0, "FileUtil"

    const-string v1, "outStream is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    :goto_2
    return-void
.end method

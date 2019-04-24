.class public final Lcom/huawei/logupload/c/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/logupload/c/i$a;,
        Lcom/huawei/logupload/c/i$b;
    }
.end annotation


# static fields
.field public static final A:I = 0x1

.field public static final B:I = 0x2

.field public static final C:Ljava/lang/String; = "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

.field private static final D:Ljava/lang/String; = "feedback_upload_Utils"

.field private static E:Ljava/lang/String; = null

.field public static final a:Ljava/lang/String; = "android.net.conn.CONNECTIVITY_CHANGE"

.field public static final b:I = 0x14

.field public static final c:J = 0xfa000L

.field public static final d:I = 0x64

.field public static final e:I = 0xf731400

.field public static final f:I = 0x1

.field public static final g:I = 0x2

.field public static final h:I = 0x3

.field public static final i:I = 0x1

.field public static final j:I = 0x2

.field public static final k:I = 0x4

.field public static final l:Ljava/lang/String; = "Input param invalid."

.field public static final m:I = 0x3e9

.field public static final n:Ljava/lang/String; = "00001001"

.field public static final o:I = 0x3f0

.field public static final p:I = 0x3ef

.field public static final q:I = 0x0

.field public static final r:I = 0x3f2

.field public static final s:Ljava/lang/String; = "com.huawei.lcagent.UPLOAD_RESULT"

.field public static final t:I = 0x0

.field public static final u:I = 0x1

.field public static final v:I = 0x2

.field public static final w:I = 0x3

.field public static final x:Ljava/lang/String; = "2"

.field public static final y:Ljava/lang/String; = "1"

.field public static final z:I = 0x0


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 141
    const-string v0, "SyyMUlxd0y0G/pBHzj6yO9h1PA8CZWjD4xmMbOM4owxPTaU/zmsxEluA1GZ01i3ocnUlfQcQKBgBAR/qvKtUs21v7dj+jcC3d6hzoKt91GV9GzPseUxSetwOXONgMdVhv6jmTdiwtbmg39RXO4DhJTLxvTxV3UB/Ir8BtaEKT6AqVDra9ahgCgyoLpNcCUuYgjlKHdPwJ1+0c32+j/OD4gmEH+ga"

    sput-object v0, Lcom/huawei/logupload/c/i;->E:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 352
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 359
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 369
    :pswitch_1
    const/4 v0, 0x2

    return v0

    .line 371
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 373
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Landroid/net/NetworkInfo;)I
    .locals 3

    .line 306
    const/4 v1, 0x0

    .line 307
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 309
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    .line 310
    const/4 v0, 0x1

    if-ne v0, v2, :cond_0

    .line 312
    const/4 v1, 0x1

    .line 313
    goto :goto_1

    .line 314
    :cond_0
    if-nez v2, :cond_1

    .line 316
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->a(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 320
    :pswitch_0
    const/4 v1, 0x2

    .line 321
    goto :goto_1

    .line 323
    :pswitch_1
    const/4 v1, 0x3

    .line 324
    goto :goto_1

    .line 326
    :pswitch_2
    const/4 v1, 0x4

    .line 327
    goto :goto_1

    .line 329
    :goto_0
    const/4 v1, 0x2

    .line 331
    goto :goto_1

    .line 332
    :cond_1
    const/16 v0, 0x9

    if-ne v0, v2, :cond_2

    .line 334
    const/4 v1, 0x1

    .line 335
    goto :goto_1

    .line 336
    :cond_2
    const/4 v0, 0x6

    if-ne v0, v2, :cond_3

    .line 338
    const/4 v1, 0x4

    .line 341
    :cond_3
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 5

    .line 158
    const/4 v2, 0x0

    .line 159
    if-eqz p0, :cond_0

    .line 160
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 163
    .line 164
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 163
    move-object v2, v0

    .line 165
    goto :goto_0

    .line 166
    :catch_0
    move-exception v4

    .line 168
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    const-string v0, "feedback_upload_Utils"

    const-string v1, "get packageInfo error"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    :cond_0
    :goto_0
    return-object v2
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 143
    sget-object v0, Lcom/huawei/logupload/c/i;->E:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 985
    const/4 v0, 0x2

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 988
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    .line 991
    new-instance v4, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v4, v2}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 992
    const-string v0, "RSA"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v5

    .line 993
    invoke-virtual {v5, v4}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v6

    .line 996
    const-string v0, "RSA/ECB/PKCS1Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v7

    .line 997
    const/4 v0, 0x1

    invoke-virtual {v7, v0, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 1000
    invoke-virtual {v7, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/logupload/LogUpload;Z)V
    .locals 8

    .line 624
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.lcagent.UPLOAD_RESULT"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 625
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    .line 626
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->F()Ljava/lang/String;

    move-result-object v1

    .line 625
    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 627
    const-string v0, "logId"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 628
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->n()Ljava/lang/String;

    move-result-object v4

    .line 629
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 630
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "policy\u5b58\u5728\uff0c\u5c06policy\u4fe1\u606f\u53d1\u9001\u7ed9\u670d\u52a1\u5668 ="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 631
    const-string v0, "serverCommand"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 634
    :cond_0
    if-eqz p2, :cond_1

    .line 635
    const-string v0, "feedback_upload_Utils"

    const-string v1, "Upload successfully! The file is deleting... "

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 636
    const-string v0, "uploadResult"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 637
    goto :goto_0

    .line 638
    :cond_1
    const-string v0, "feedback_upload_Utils"

    const-string v1, "Upload failed!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 639
    const-string v0, "uploadResult"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 642
    :goto_0
    const-string v0, "submitFlag"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 643
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "submitFlag"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 645
    invoke-static {p0}, Lcom/huawei/logupload/c/i;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v5

    .line 646
    invoke-static {v5}, Lcom/huawei/logupload/c/i;->a(Landroid/net/NetworkInfo;)I

    move-result v6

    .line 647
    invoke-static {v6}, Lcom/huawei/logupload/c/i;->b(I)I

    move-result v7

    .line 648
    const-string v0, "resultFlag"

    invoke-virtual {v3, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 649
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "resultFlag"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 650
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Upload sendBroadcast to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 651
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->F()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 650
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 652
    invoke-virtual {p0, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 653
    return-void
.end method

.method public static a(Lcom/huawei/logupload/LogUpload;)V
    .locals 4

    .line 661
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v2

    .line 663
    if-eqz v2, :cond_1

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 664
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 667
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 668
    const-string v0, "feedback_upload_Utils"

    const-string v1, "\u6587\u4ef6\u5220\u9664\u6210\u529f\uff01"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 669
    goto :goto_0

    .line 671
    :cond_0
    const-string v0, "feedback_upload_Utils"

    const-string v1, "\u6587\u4ef6\u4e0d\u5b58\u5728 \u6216\u8005 \u51fa\u9519\uff01\u6587\u4ef6\u5220\u9664\u5931\u8d25!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 674
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    .locals 3

    .line 501
    if-eqz p0, :cond_1

    .line 503
    :try_start_0
    invoke-virtual {p0}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 505
    goto :goto_0

    .line 506
    :catch_0
    move-exception v2

    .line 508
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 512
    const-string v0, "feedback_upload_Utils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 514
    goto :goto_0

    .line 517
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 523
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 3

    .line 472
    if-eqz p0, :cond_1

    .line 474
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 476
    goto :goto_0

    .line 477
    :catch_0
    move-exception v2

    .line 479
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 481
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 483
    const-string v0, "feedback_upload_Utils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    goto :goto_0

    .line 488
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 490
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 3

    .line 427
    if-eqz p0, :cond_1

    .line 429
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 431
    goto :goto_0

    .line 432
    :catch_0
    move-exception v2

    .line 434
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 438
    const-string v0, "feedback_upload_Utils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 440
    goto :goto_0

    .line 443
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 445
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 449
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1

    .line 458
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 460
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 462
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 465
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 147
    sput-object p0, Lcom/huawei/logupload/c/i;->E:Ljava/lang/String;

    .line 148
    return-void
.end method

.method public static a(Ljava/lang/String;I)V
    .locals 3

    .line 788
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setTaskStatus id: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 789
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 790
    return-void
.end method

.method private static a(Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    .line 1215
    if-eqz p0, :cond_0

    .line 1216
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1218
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Z)Z
    .locals 2

    .line 1194
    if-nez p0, :cond_0

    .line 1195
    const/4 v0, 0x0

    return v0

    .line 1197
    :cond_0
    if-eqz p1, :cond_1

    .line 1198
    invoke-static {p0}, Lcom/huawei/logupload/c/i;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/logupload/c/i;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1199
    const-string v0, "feedback_upload_Utils"

    const-string v1, "supportNewPermission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1200
    const/4 v0, 0x1

    return v0

    .line 1204
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_2

    .line 1205
    .line 1206
    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    .line 1205
    if-eqz v0, :cond_2

    .line 1207
    const-string v0, "feedback_upload_Utils"

    const-string v1, "no have READ_PHONE_STATE Permission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1208
    const/4 v0, 0x0

    return v0

    .line 1210
    :cond_2
    const-string v0, "feedback_upload_Utils"

    const-string v1, "have READ_PHONE_STATE permission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1211
    const/4 v0, 0x1

    return v0
.end method

.method public static a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1126
    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(I)I
    .locals 1

    .line 385
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 387
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 389
    :pswitch_1
    const/4 v0, 0x4

    return v0

    .line 391
    :pswitch_2
    const/4 v0, 0x2

    return v0

    .line 395
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 4

    .line 405
    const/4 v2, 0x0

    .line 409
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 410
    goto :goto_0

    .line 411
    :catch_0
    move-exception v3

    .line 414
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    const-string v0, "feedback_upload_Utils"

    invoke-virtual {v3}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 419
    :cond_0
    :goto_0
    return-object v2
.end method

.method public static b()Ljava/lang/String;
    .locals 7

    .line 235
    const-string v5, ""

    .line 237
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    .line 238
    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 237
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 239
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ro.serialno"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    move-object v5, v0

    .line 240
    goto :goto_0

    :catch_0
    move-exception v6

    .line 241
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 242
    :catch_1
    move-exception v6

    .line 243
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 244
    :catch_2
    move-exception v6

    .line 245
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 246
    :catch_3
    move-exception v6

    .line 247
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 248
    :catch_4
    move-exception v6

    .line 249
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 252
    :goto_0
    return-object v5
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 184
    const-string v2, ""

    .line 187
    const/4 v0, 0x1

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/logupload/c/i;->a(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    .line 189
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 188
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 189
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 188
    move-object v2, v0

    .line 191
    goto :goto_0

    .line 192
    :catch_0
    move-exception v3

    .line 194
    const-string v0, "feedback_upload_Utils"

    const-string v1, "get imei error"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    :cond_0
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 197
    const-string v0, "feedback_upload_Utils"

    const-string v1, "imei empty!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    invoke-static {p0}, Lcom/huawei/logupload/c/i;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 199
    const-string v0, "feedback_upload_Utils"

    const-string v1, "isWifiOnly!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    invoke-static {p0}, Lcom/huawei/logupload/c/i;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 201
    goto :goto_1

    .line 202
    :cond_1
    const-string v0, "feedback_upload_Utils"

    const-string v1, "not WifiOnly!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    const-string v2, "000000000000000"

    .line 206
    :cond_2
    :goto_1
    return-object v2
.end method

.method public static b(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .line 1026
    if-nez p1, :cond_0

    .line 1027
    return-object p0

    .line 1028
    :cond_0
    if-lez p1, :cond_1

    .line 1029
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/2addr p1, v0

    .line 1030
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1031
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1032
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1033
    return-object v4

    .line 1035
    :cond_1
    neg-int p1, p1

    .line 1036
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/2addr p1, v0

    .line 1037
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-static {p0, v0}, Lcom/huawei/logupload/c/i;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/huawei/logupload/LogUpload;)V
    .locals 2

    .line 1087
    const-string v0, "feedback_upload_Utils"

    const-string v1, "finish"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1088
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->D()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Lcom/huawei/logupload/k;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1089
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1090
    const-string v0, "feedback_upload_Utils"

    const-string v1, "*****Beta Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1091
    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1092
    const-string v0, "feedback_upload_Utils"

    const-string v1, "*****Fans Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1093
    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 1094
    const-string v0, "feedback_upload_Utils"

    const-string v1, "*****Dev Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1095
    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 1096
    const-string v0, "feedback_upload_Utils"

    const-string v1, "*****FEEDBACK Log End Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 1098
    :cond_3
    :goto_0
    new-instance v0, Lcom/huawei/logupload/c/j;

    invoke-direct {v0, p0}, Lcom/huawei/logupload/c/j;-><init>(Lcom/huawei/logupload/LogUpload;)V

    .line 1114
    invoke-virtual {v0}, Lcom/huawei/logupload/c/j;->start()V

    .line 1116
    :cond_4
    return-void
.end method

.method public static b(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 3

    .line 535
    if-eqz p0, :cond_1

    .line 537
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 539
    goto :goto_0

    .line 540
    :catch_0
    move-exception v2

    .line 542
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 544
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 546
    const-string v0, "feedback_upload_Utils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 548
    goto :goto_0

    .line 551
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 553
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 557
    :cond_1
    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;)I
    .locals 2

    .line 755
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    .line 756
    if-eqz v1, :cond_0

    .line 757
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 759
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 216
    const-string v2, ""

    .line 219
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/logupload/c/i;->a(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    .line 221
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 220
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 221
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 220
    move-object v2, v0

    .line 223
    goto :goto_0

    .line 224
    :catch_0
    move-exception v3

    .line 226
    const-string v0, "feedback_upload_Utils"

    const-string v1, "get imei error"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    :cond_0
    :goto_0
    return-object v2
.end method

.method public static c()V
    .locals 4

    .line 706
    const/4 v2, 0x0

    .line 708
    :try_start_0
    new-instance v0, Lcom/huawei/logupload/h;

    invoke-direct {v0}, Lcom/huawei/logupload/h;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 709
    goto :goto_0

    :catch_0
    move-exception v3

    .line 712
    const-string v0, "feedback_upload_Utils"

    const-string v1, "Utils:initHttpsURLConnection Exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 715
    :goto_0
    if-eqz v2, :cond_0

    .line 716
    invoke-static {v2}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 740
    :cond_0
    :try_start_1
    sget-object v3, Lorg/apache/http/conn/ssl/SSLSocketFactory;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 741
    invoke-static {v3}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 742
    goto :goto_1

    :catch_1
    move-exception v3

    .line 743
    const-string v0, "Fail to set DefaultHostnameVerifier!"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 745
    :goto_1
    return-void
.end method

.method public static d()V
    .locals 2

    .line 817
    const-string v0, "feedback_upload_Utils"

    const-string v1, "acquire: get wake and wifi lock!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 818
    invoke-static {}, Lcom/huawei/logupload/c/c;->d()Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/logupload/c/i;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 820
    invoke-static {}, Lcom/huawei/logupload/c/c;->d()Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 822
    :cond_0
    invoke-static {}, Lcom/huawei/logupload/c/c;->e()Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/logupload/c/i;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 824
    invoke-static {}, Lcom/huawei/logupload/c/c;->e()Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    .line 826
    :cond_1
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 3

    .line 770
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "removeTaskStatus id: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 780
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    return-void
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 7

    .line 261
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/ConnectivityManager;

    .line 263
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "isNetworkSupported"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 264
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 265
    :catch_0
    move-exception v6

    .line 266
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 267
    :catch_1
    move-exception v6

    .line 268
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 269
    :catch_2
    move-exception v6

    .line 270
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 271
    :catch_3
    move-exception v6

    .line 272
    const-string v0, "feedback_upload_Utils"

    invoke-static {v6, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 274
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 3

    .line 379
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 380
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 381
    return-object v2
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1006
    const/4 v2, 0x0

    .line 1007
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 1008
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    new-array v4, v0, [C

    .line 1009
    goto :goto_0

    .line 1010
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    aput-char v0, v4, v2

    .line 1011
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    aput-char v0, v4, v3

    .line 1012
    add-int/lit8 v2, v2, 0x1

    .line 1013
    add-int/lit8 v3, v3, -0x1

    .line 1009
    :goto_0
    if-le v2, v3, :cond_0

    .line 1015
    invoke-static {v4}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e()V
    .locals 3

    .line 830
    const-string v0, "feedback_upload_Utils"

    const-string v1, "release: release wake and wifi lock!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 831
    invoke-static {}, Lcom/huawei/logupload/c/i;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 832
    const-string v0, "feedback_upload_Utils"

    const-string v1, "release: have holden the wake lock"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 835
    :try_start_0
    invoke-static {}, Lcom/huawei/logupload/c/c;->d()Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 836
    goto :goto_0

    :catch_0
    move-exception v2

    .line 837
    const-string v0, "feedback_upload_Utils"

    const-string v1, "release wake lock exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 840
    :cond_0
    :goto_0
    invoke-static {}, Lcom/huawei/logupload/c/i;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 841
    const-string v0, "feedback_upload_Utils"

    const-string v1, "release: have holden the wifi lock"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 844
    :try_start_1
    invoke-static {}, Lcom/huawei/logupload/c/c;->e()Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 845
    goto :goto_1

    :catch_1
    move-exception v2

    .line 846
    const-string v0, "feedback_upload_Utils"

    const-string v1, "release wifi lock exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 849
    :cond_1
    :goto_1
    return-void
.end method

.method public static f(Landroid/content/Context;)I
    .locals 5

    .line 682
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 684
    if-nez v2, :cond_0

    .line 685
    const/4 v0, -0x1

    return v0

    .line 688
    :cond_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    move-result-object v3

    .line 689
    if-nez v3, :cond_1

    .line 690
    const/4 v0, -0x1

    return v0

    .line 693
    :cond_1
    const/4 v4, 0x0

    goto :goto_0

    .line 694
    :cond_2
    aget-object v0, v3, v4

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v0, v1, :cond_3

    .line 695
    aget-object v0, v3, v4

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    return v0

    .line 693
    :cond_3
    add-int/lit8 v4, v4, 0x1

    :goto_0
    array-length v0, v3

    if-lt v4, v0, :cond_2

    .line 698
    const/4 v0, -0x1

    return v0
.end method

.method public static f()Z
    .locals 1

    .line 854
    invoke-static {}, Lcom/huawei/logupload/c/c;->e()Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 855
    invoke-static {}, Lcom/huawei/logupload/c/c;->e()Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    return v0

    .line 857
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static g(Landroid/content/Context;)V
    .locals 4

    .line 794
    const-string v0, "feedback_upload_Utils"

    const-string v1, "lockCreate"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 796
    invoke-static {}, Lcom/huawei/logupload/c/c;->d()Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    if-nez v0, :cond_0

    .line 798
    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/PowerManager;

    .line 799
    const-string v0, "phoneservice_logupload_wakelock"

    const/4 v1, 0x1

    invoke-virtual {v2, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v3

    .line 800
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 801
    invoke-static {v3}, Lcom/huawei/logupload/c/c;->a(Landroid/os/PowerManager$WakeLock;)V

    .line 804
    :cond_0
    invoke-static {}, Lcom/huawei/logupload/c/c;->e()Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    if-nez v0, :cond_1

    .line 806
    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/wifi/WifiManager;

    .line 807
    const-string v0, "phoneservice_logupload_wifilock"

    invoke-virtual {v2, v0}, Landroid/net/wifi/WifiManager;->createWifiLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v3

    .line 808
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 809
    invoke-static {v3}, Lcom/huawei/logupload/c/c;->a(Landroid/net/wifi/WifiManager$WifiLock;)V

    .line 813
    :cond_1
    return-void
.end method

.method public static g()Z
    .locals 1

    .line 863
    invoke-static {}, Lcom/huawei/logupload/c/c;->d()Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 864
    invoke-static {}, Lcom/huawei/logupload/c/c;->d()Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    return v0

    .line 866
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static h()Ljava/lang/String;
    .locals 8

    .line 1044
    const/4 v2, 0x0

    .line 1050
    :try_start_0
    new-instance v3, Ljava/security/SecureRandom;

    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    .line 1051
    const v0, 0xdbba0

    invoke-virtual {v3, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    const v1, 0x186a0

    add-int v4, v0, v1

    .line 1052
    const-string v5, "osgforandroid"

    .line 1053
    const/4 v6, 0x0

    .line 1054
    invoke-static {}, Lcom/huawei/logupload/c/i;->i()Ljava/lang/String;

    move-result-object v7

    .line 1058
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1059
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 1062
    goto :goto_0

    :catch_0
    move-exception v3

    .line 1063
    const-string v0, "feedback_upload_Utils"

    const-string v1, "encrypt By Private Key error ...."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1066
    :goto_0
    return-object v2
.end method

.method public static h(Landroid/content/Context;)Z
    .locals 4

    .line 1167
    if-nez p0, :cond_0

    .line 1168
    const/4 v0, 0x0

    return v0

    .line 1170
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 1172
    :try_start_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1173
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1174
    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    .line 1173
    .line 1175
    iget v0, v3, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 1176
    const/4 v0, 0x1

    return v0

    .line 1179
    :catch_0
    move-exception v3

    .line 1180
    const-string v0, "feedback_upload_Utils"

    const-string v1, "isSystemApp NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1182
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static i()Ljava/lang/String;
    .locals 4

    .line 1073
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/huawei/logupload/c/c;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x3

    invoke-static {v1, v2}, Lcom/huawei/logupload/c/i;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1074
    invoke-static {}, Lcom/huawei/logupload/c/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1075
    invoke-static {}, Lcom/huawei/logupload/c/e;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x3

    invoke-static {v1, v2}, Lcom/huawei/logupload/c/i;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1076
    invoke-static {}, Lcom/huawei/logupload/c/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1077
    invoke-static {}, Lcom/huawei/logupload/c/i;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x3

    invoke-static {v1, v2}, Lcom/huawei/logupload/c/i;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1078
    invoke-static {}, Lcom/huawei/logupload/c/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1073
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1080
    return-object v3
.end method

.method public static i(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1229
    if-eqz p0, :cond_2

    .line 1230
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 1231
    const-string v0, "feedback_upload_Utils"

    const-string v1, "is o version"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1232
    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1233
    invoke-static {}, Landroid/os/Build;->getSerial()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1235
    :cond_0
    const-string v0, "feedback_upload_Utils"

    const-string v1, "is o version,but have not permission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1236
    goto :goto_0

    .line 1237
    :cond_1
    const-string v0, "feedback_upload_Utils"

    const-string v1, "is not o version"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1238
    invoke-static {}, Lcom/huawei/logupload/c/i;->b()Ljava/lang/String;

    move-result-object v2

    .line 1239
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1240
    return-object v2

    .line 1244
    :cond_2
    :goto_0
    const-string v0, "000000000000000"

    return-object v0
.end method

.method private static j()Z
    .locals 6

    .line 1134
    const/4 v3, 0x0

    .line 1136
    const-string v0, "android.telephony.HwTelephonyManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v3

    .line 1137
    if-nez v3, :cond_0

    .line 1138
    const/4 v0, 0x0

    return v0

    .line 1140
    .line 1141
    :cond_0
    const-string v0, "SUPPORT_SYSTEMAPP_GET_DEVICEID"

    :try_start_1
    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 1140
    .line 1142
    invoke-static {v4}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/reflect/AccessibleObject;)V

    .line 1143
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    .line 1144
    const-string v0, "feedback_upload_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "supportNewPermissionCheck value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 1145
    const/4 v0, 0x1

    if-ne v5, v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0

    .line 1146
    :catch_0
    move-exception v4

    .line 1147
    const-string v0, "feedback_upload_Utils"

    const-string v1, "ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1148
    :catch_1
    move-exception v4

    .line 1149
    const-string v0, "feedback_upload_Utils"

    const-string v1, "NoSuchFieldException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1150
    :catch_2
    move-exception v4

    .line 1151
    const-string v0, "feedback_upload_Utils"

    const-string v1, "IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1152
    :catch_3
    move-exception v4

    .line 1153
    const-string v0, "feedback_upload_Utils"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1154
    :catch_4
    move-exception v4

    .line 1155
    const-string v0, "feedback_upload_Utils"

    const-string v1, "Exception "

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1157
    :goto_0
    const-string v0, "feedback_upload_Utils"

    const-string v1, "not support New Permission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 1158
    const/4 v0, 0x0

    return v0
.end method

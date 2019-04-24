.class public Lcom/sina/weibo/sdk/utils/AidTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;,
        Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;,
        Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;
    }
.end annotation


# static fields
.field private static final AID_FILE_NAME:Ljava/lang/String; = "weibo_sdk_aid"

.field public static final AID_TAG:Ljava/lang/String; = "weibo_aid_value"

.field private static final MAX_RETRY_NUM:I = 0x3

.field private static final TAG:Ljava/lang/String; = "AidTask"

.field private static final VERSION:I = 0x1

.field public static final WHAT_LOAD_AID_ERR:I = 0x3ea

.field public static final WHAT_LOAD_AID_SUC:I = 0x3e9

.field private static mExtras:Ljava/lang/String; = null

.field private static sInstance:Lcom/sina/weibo/sdk/utils/AidTask; = null


# instance fields
.field private hash:Ljava/lang/String;

.field private mAidInfo:Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

.field private mAppKey:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mHandler:Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;

.field private mListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/sina/weibo/sdk/utils/WeiboUtilListener;>;"
        }
    .end annotation
.end field

.field private volatile mTaskLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private pkg:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>(Z)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mTaskLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    .line 176
    if-nez p1, :cond_0

    .line 177
    return-void

    .line 179
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mContext:Landroid/content/Context;

    .line 180
    new-instance v0, Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;

    iget-object v1, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mHandler:Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;

    .line 181
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/sina/weibo/sdk/utils/AidTask$1;

    invoke-direct {v1, p0}, Lcom/sina/weibo/sdk/utils/AidTask$1;-><init>(Lcom/sina/weibo/sdk/utils/AidTask;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 192
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 193
    return-void
.end method

.method static synthetic access$000(Lcom/sina/weibo/sdk/utils/AidTask;I)Ljava/io/File;
    .locals 1

    .line 55
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/utils/AidTask;->getAidInfoFile(I)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lcom/sina/weibo/sdk/utils/AidTask;)Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mTaskLock:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method static synthetic access$200(Lcom/sina/weibo/sdk/utils/AidTask;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/utils/AidTask;->cacheAidInfo(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/sina/weibo/sdk/utils/AidTask;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAidInfo:Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    return-object v0
.end method

.method static synthetic access$302(Lcom/sina/weibo/sdk/utils/AidTask;Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAidInfo:Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    return-object p1
.end method

.method static synthetic access$400(Lcom/sina/weibo/sdk/utils/AidTask;Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/utils/AidTask;->notifyListener(Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)V

    return-void
.end method

.method static synthetic access$500(Lcom/sina/weibo/sdk/utils/AidTask;)Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mHandler:Lcom/sina/weibo/sdk/utils/AidTask$CallbackHandler;

    return-object v0
.end method

.method private aidTaskInit(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 216
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    return-void

    .line 219
    :cond_0
    const-string v0, "AidTask"

    const-string v1, "aidTaskInit "

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    invoke-virtual {p0, p1, p2, p3}, Lcom/sina/weibo/sdk/utils/AidTask;->initAidInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    return-void
.end method

.method private declared-synchronized cacheAidInfo(Ljava/lang/String;)V
    .locals 5

    monitor-enter p0

    .line 457
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    monitor-exit p0

    return-void

    .line 461
    :cond_0
    const/4 v1, 0x0

    .line 463
    const/4 v0, 0x1

    :try_start_1
    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/utils/AidTask;->getAidInfoFile(I)Ljava/io/File;

    move-result-object v2

    .line 464
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v1, v0

    .line 465
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 468
    if-eqz v1, :cond_2

    .line 470
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 472
    goto :goto_1

    .line 471
    :catch_0
    move-exception v2

    .line 472
    goto :goto_1

    .line 466
    :catch_1
    move-exception v2

    .line 468
    if-eqz v1, :cond_2

    .line 470
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 472
    goto :goto_1

    .line 471
    :catch_2
    move-exception v2

    .line 472
    goto :goto_1

    .line 468
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_1

    .line 470
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 472
    goto :goto_0

    .line 471
    :catch_3
    move-exception v4

    .line 472
    :cond_1
    :goto_0
    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 475
    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static encryptRsa(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 599
    const-string v0, "RSA/ECB/PKCS1Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 600
    invoke-static/range {p1 .. p1}, Lcom/sina/weibo/sdk/utils/AidTask;->getPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v4

    .line 601
    const/4 v0, 0x1

    invoke-virtual {v3, v0, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 603
    const/4 v5, 0x0

    .line 604
    const-string v0, "UTF-8"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v6

    .line 606
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v5, v0

    .line 607
    const/4 v7, 0x0

    .line 608
    const/4 v8, 0x0

    .line 609
    :goto_0
    const/16 v0, 0x75

    invoke-static {v6, v8, v0}, Lcom/sina/weibo/sdk/utils/AidTask;->splite([BII)I

    move-result v0

    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 610
    invoke-virtual {v3, v6, v8, v7}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v9

    .line 611
    invoke-virtual {v5, v9}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 612
    const-string v0, "AidTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encryptRsa offset = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "     len = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "     enBytes len = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, v9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    add-int/2addr v8, v7

    .line 615
    goto :goto_0

    .line 616
    :cond_0
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 617
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v9

    .line 618
    const-string v0, "AidTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encryptRsa total enBytes len = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, v9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    invoke-static {v9}, Lcom/sina/weibo/sdk/utils/Base64;->encodebyte([B)[B

    move-result-object v10

    .line 621
    const-string v0, "AidTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encryptRsa total base64byte len = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, v10

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 623
    const-string v11, "01"

    .line 624
    new-instance v12, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v12, v10, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 625
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "01"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 626
    const-string v0, "AidTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encryptRsa total base64string : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 628
    move-object v13, v12

    .line 632
    if-eqz v5, :cond_1

    .line 634
    :try_start_1
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 636
    goto :goto_1

    .line 635
    :catch_0
    move-exception v14

    .line 636
    :cond_1
    :goto_1
    return-object v13

    .line 632
    :catchall_0
    move-exception v15

    if-eqz v5, :cond_2

    .line 634
    :try_start_2
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 636
    goto :goto_2

    .line 635
    :catch_1
    move-exception v16

    .line 636
    :cond_2
    :goto_2
    throw v15
.end method

.method private static genMfpString(Landroid/content/Context;)Ljava/lang/String;
    .locals 24

    .line 506
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 508
    :try_start_0
    invoke-static {}, Lcom/sina/weibo/sdk/utils/AidTask;->getOS()Ljava/lang/String;

    move-result-object v4

    .line 509
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 510
    const-string v0, "1"

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 512
    :cond_0
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getImei(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 513
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 514
    const-string v0, "2"

    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 516
    :cond_1
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getMeid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 517
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 518
    const-string v0, "3"

    invoke-virtual {v3, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 520
    :cond_2
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getImsi(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 521
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 522
    const-string v0, "4"

    invoke-virtual {v3, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 524
    :cond_3
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getMac(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 525
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 526
    const-string v0, "5"

    invoke-virtual {v3, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 528
    :cond_4
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getIccid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 529
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 530
    const-string v0, "6"

    invoke-virtual {v3, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 532
    :cond_5
    invoke-static {}, Lcom/sina/weibo/sdk/utils/AidTask;->getSerialNo()Ljava/lang/String;

    move-result-object v10

    .line 533
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 534
    const-string v0, "7"

    invoke-virtual {v3, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 536
    :cond_6
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getAndroidId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    .line 537
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 538
    const-string v0, "10"

    invoke-virtual {v3, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 540
    :cond_7
    invoke-static {}, Lcom/sina/weibo/sdk/utils/AidTask;->getCpu()Ljava/lang/String;

    move-result-object v12

    .line 541
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 542
    const-string v0, "13"

    invoke-virtual {v3, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 544
    :cond_8
    invoke-static {}, Lcom/sina/weibo/sdk/utils/AidTask;->getModel()Ljava/lang/String;

    move-result-object v13

    .line 545
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 546
    const-string v0, "14"

    invoke-virtual {v3, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 548
    :cond_9
    invoke-static {}, Lcom/sina/weibo/sdk/utils/AidTask;->getSdSize()Ljava/lang/String;

    move-result-object v14

    .line 549
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 550
    const-string v0, "15"

    invoke-virtual {v3, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 552
    :cond_a
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getResolution(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v15

    .line 553
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 554
    const-string v0, "16"

    invoke-virtual {v3, v0, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 556
    :cond_b
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getSsid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v16

    .line 557
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 558
    const-string v0, "17"

    move-object/from16 v1, v16

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 560
    :cond_c
    invoke-static {}, Lcom/sina/weibo/sdk/utils/AidTask;->getDeviceName()Ljava/lang/String;

    move-result-object v17

    .line 561
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 562
    const-string v0, "18"

    move-object/from16 v1, v17

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 564
    :cond_d
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/AidTask;->getConnectType(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v18

    .line 565
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 566
    const-string v0, "19"

    move-object/from16 v1, v18

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 569
    :cond_e
    const-string v19, ""

    .line 571
    :try_start_1
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/utils/Utility;->generateUAAid(Landroid/content/Context;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object/from16 v19, v0

    .line 574
    goto :goto_0

    .line 572
    :catch_0
    move-exception v20

    .line 573
    :try_start_2
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Exception;->printStackTrace()V

    .line 576
    :goto_0
    invoke-static/range {v19 .. v19}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 577
    const-string v0, "20"

    move-object/from16 v1, v19

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 580
    :cond_f
    sget-object v0, Lcom/sina/weibo/sdk/utils/AidTask;->mExtras:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 581
    new-instance v0, Lorg/json/JSONObject;

    sget-object v1, Lcom/sina/weibo/sdk/utils/AidTask;->mExtras:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object/from16 v20, v0

    .line 582
    const-string v0, "extras"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v21

    .line 583
    if-eqz v21, :cond_10

    .line 584
    const/16 v22, 0x0

    :goto_1
    invoke-virtual/range {v21 .. v21}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v22

    if-ge v1, v0, :cond_10

    .line 585
    move-object/from16 v0, v21

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v23

    .line 586
    const-string v0, "extra_key"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "extra_value"

    move-object/from16 v2, v23

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 584
    add-int/lit8 v22, v22, 0x1

    goto :goto_1

    .line 591
    :cond_10
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    return-object v0

    .line 592
    :catch_1
    move-exception v4

    .line 595
    const-string v0, ""

    return-object v0
.end method

.method private generateAid(Ljava/lang/String;Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;)V
    .locals 2

    .line 314
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/sina/weibo/sdk/utils/AidTask;->generateAid(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;)V

    .line 315
    return-void
.end method

.method private generateAid(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;)V
    .locals 2

    .line 319
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 320
    return-void

    .line 323
    :cond_0
    iput-object p1, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAppKey:Ljava/lang/String;

    .line 324
    iput-object p3, p0, Lcom/sina/weibo/sdk/utils/AidTask;->hash:Ljava/lang/String;

    .line 325
    iput-object p2, p0, Lcom/sina/weibo/sdk/utils/AidTask;->pkg:Ljava/lang/String;

    .line 327
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/sina/weibo/sdk/utils/AidTask$3;

    invoke-direct {v1, p0, p4}, Lcom/sina/weibo/sdk/utils/AidTask$3;-><init>(Lcom/sina/weibo/sdk/utils/AidTask;Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 358
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 359
    return-void
.end method

.method private getAidInfoFile(I)Ljava/io/File;
    .locals 4

    .line 396
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    .line 397
    new-instance v3, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "weibo_sdk_aid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 398
    return-object v3
.end method

.method private static getAndroidId(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 748
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 750
    return-object v2

    .line 751
    :catch_0
    move-exception v2

    .line 754
    const-string v0, ""

    return-object v0
.end method

.method private static getConnectType(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 817
    const-string v2, "none"

    .line 819
    const-string v0, "connectivity"

    .line 820
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/ConnectivityManager;

    .line 821
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v4

    .line 826
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 827
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-nez v0, :cond_0

    .line 828
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 837
    :pswitch_0
    const-string v0, "2G"

    move-object v2, v0

    .line 838
    goto :goto_1

    .line 852
    :pswitch_1
    const-string v0, "3G"

    move-object v2, v0

    .line 853
    goto :goto_1

    .line 856
    :pswitch_2
    const-string v0, "4G"

    move-object v2, v0

    .line 857
    goto :goto_1

    .line 860
    :goto_0
    const-string v0, "none"

    move-object v2, v0

    .line 861
    goto :goto_1

    .line 863
    :cond_0
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getType()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 864
    const-string v0, "wifi"

    move-object v2, v0

    .line 868
    :cond_1
    :goto_1
    goto :goto_2

    .line 867
    :catch_0
    move-exception v3

    .line 870
    :goto_2
    return-object v2

    nop

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

.method private static getCpu()Ljava/lang/String;
    .locals 2

    .line 759
    :try_start_0
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 760
    :catch_0
    move-exception v1

    .line 762
    const-string v0, ""

    return-object v0
.end method

.method private static getDeviceName()Ljava/lang/String;
    .locals 2

    .line 810
    :try_start_0
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 811
    :catch_0
    move-exception v1

    .line 813
    const-string v0, ""

    return-object v0
.end method

.method private static getIccid(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 711
    const-string v0, "phone"

    .line 712
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 713
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 714
    :catch_0
    move-exception v1

    .line 716
    const-string v0, ""

    return-object v0
.end method

.method public static getImei(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 668
    const-string v0, "phone"

    .line 669
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 670
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 671
    :catch_0
    move-exception v1

    .line 673
    const-string v0, ""

    return-object v0
.end method

.method private static getImsi(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 688
    const-string v0, "phone"

    .line 689
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 690
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 691
    :catch_0
    move-exception v1

    .line 693
    const-string v0, ""

    return-object v0
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/utils/AidTask;
    .locals 2

    const-class v1, Lcom/sina/weibo/sdk/utils/AidTask;

    monitor-enter v1

    .line 196
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/utils/AidTask;->sInstance:Lcom/sina/weibo/sdk/utils/AidTask;

    if-nez v0, :cond_0

    .line 197
    new-instance v0, Lcom/sina/weibo/sdk/utils/AidTask;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/utils/AidTask;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/sina/weibo/sdk/utils/AidTask;->sInstance:Lcom/sina/weibo/sdk/utils/AidTask;

    .line 199
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/utils/AidTask;->sInstance:Lcom/sina/weibo/sdk/utils/AidTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method private static getMac(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 698
    const-string v0, "wifi"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/wifi/WifiManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 699
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 700
    const-string v0, ""

    return-object v0

    .line 702
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v2

    .line 703
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ""

    :goto_0
    return-object v0

    .line 704
    :catch_0
    move-exception v1

    .line 706
    const-string v0, ""

    return-object v0
.end method

.method private static getMeid(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 678
    const-string v0, "phone"

    .line 679
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 680
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 681
    :catch_0
    move-exception v1

    .line 683
    const-string v0, ""

    return-object v0
.end method

.method private static getMfp(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 486
    const-string v3, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHHM0Fi2Z6+QYKXqFUX2Cy6AaWq3cPi+GSn9oeAwQbPZR75JB7Netm0HtBVVbtPhzT7UO2p1JhFUKWqrqoYuAjkgMVPmA0sFrQohns5EE44Y86XQopD4ZO+dE5KjUZFE6vrPO3rWW3np2BqlgKpjnYZri6TJApmIpGcQg9/G/3zQIDAQAB"

    .line 490
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/AidTask;->genMfpString(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 491
    const-string v5, ""

    .line 493
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 495
    goto :goto_0

    .line 494
    :catch_0
    move-exception v6

    .line 497
    :goto_0
    const-string v0, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHHM0Fi2Z6+QYKXqFUX2Cy6AaWq3cPi+GSn9oeAwQbPZR75JB7Netm0HtBVVbtPhzT7UO2p1JhFUKWqrqoYuAjkgMVPmA0sFrQohns5EE44Y86XQopD4ZO+dE5KjUZFE6vrPO3rWW3np2BqlgKpjnYZri6TJApmIpGcQg9/G/3zQIDAQAB"

    :try_start_1
    invoke-static {v5, v0}, Lcom/sina/weibo/sdk/utils/AidTask;->encryptRsa(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v6

    .line 498
    return-object v6

    .line 499
    :catch_1
    move-exception v6

    .line 500
    const-string v0, "AidTask"

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    const-string v0, ""

    return-object v0
.end method

.method private static getModel()Ljava/lang/String;
    .locals 2

    .line 767
    :try_start_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 768
    :catch_0
    move-exception v1

    .line 770
    const-string v0, ""

    return-object v0
.end method

.method private static getOS()Ljava/lang/String;
    .locals 3

    .line 660
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 661
    :catch_0
    move-exception v2

    .line 663
    const-string v0, ""

    return-object v0
.end method

.method private static getPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 651
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/Base64;->decode([B)[B

    move-result-object v1

    .line 652
    new-instance v2, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v2, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 653
    const-string v0, "RSA"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v3

    .line 654
    invoke-virtual {v3, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v4

    .line 655
    return-object v4
.end method

.method private static getResolution(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 787
    :try_start_0
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 788
    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 789
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 790
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 791
    :catch_0
    move-exception v2

    .line 793
    const-string v0, ""

    return-object v0
.end method

.method private static getSdSize()Ljava/lang/String;
    .locals 8

    .line 775
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    .line 776
    new-instance v3, Landroid/os/StatFs;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 777
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v4, v0

    .line 778
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v6, v0

    .line 779
    mul-long v0, v6, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 780
    :catch_0
    move-exception v2

    .line 782
    const-string v0, ""

    return-object v0
.end method

.method private static getSerialNo()Ljava/lang/String;
    .locals 7

    .line 720
    const-string v4, ""

    .line 721
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 722
    invoke-static {}, Lcom/sina/weibo/sdk/utils/AidTask;->getSerialNoForO()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 725
    :cond_0
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 726
    const-string v0, "get"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 727
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ro.serialno"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "unknown"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 730
    goto :goto_0

    .line 728
    :catch_0
    move-exception v5

    .line 729
    const-string v0, "weibosdk "

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getSerialNo"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 732
    :goto_0
    return-object v4
.end method

.method private static getSerialNoForO()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 737
    const-string v1, ""

    .line 739
    :try_start_0
    invoke-static {}, Landroid/os/Build;->getSerial()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 742
    goto :goto_0

    .line 740
    :catch_0
    move-exception v2

    .line 741
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 743
    :goto_0
    return-object v1
.end method

.method private static getSsid(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 798
    const-string v0, "wifi"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 799
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v2

    .line 800
    if-eqz v2, :cond_0

    .line 801
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 804
    :cond_0
    goto :goto_0

    .line 803
    :catch_0
    move-exception v1

    .line 805
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method private initAidInfo(Ljava/lang/String;)V
    .locals 2

    .line 270
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/sina/weibo/sdk/utils/AidTask;->initAidInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    return-void
.end method

.method private notifyListener(Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)V
    .locals 4

    .line 882
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 883
    if-eqz p1, :cond_0

    .line 884
    const-string v0, "weibo_aid_value"

    invoke-virtual {p1}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 887
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 888
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 889
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sina/weibo/sdk/utils/WeiboUtilListener;

    invoke-interface {v0, v2}, Lcom/sina/weibo/sdk/utils/WeiboUtilListener;->onComplete(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 888
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 894
    :cond_1
    goto :goto_1

    .line 892
    :catch_0
    move-exception v3

    .line 893
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 895
    :goto_1
    return-void
.end method

.method private static splite([BII)I
    .locals 2

    .line 642
    array-length v0, p0

    if-lt p1, v0, :cond_0

    .line 643
    const/4 v0, -0x1

    return v0

    .line 645
    :cond_0
    array-length v0, p0

    sub-int v1, v0, p1

    .line 646
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method public addListener(Lcom/sina/weibo/sdk/utils/WeiboUtilListener;)V
    .locals 1

    .line 875
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 876
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    .line 878
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 879
    return-void
.end method

.method public aidTaskInit(Ljava/lang/String;)V
    .locals 2

    .line 208
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    return-void

    .line 211
    :cond_0
    const-string v0, "AidTask"

    const-string v1, "aidTaskInit "

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/utils/AidTask;->initAidInfo(Ljava/lang/String;)V

    .line 213
    return-void
.end method

.method public getAidAsync(Ljava/lang/String;Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;)V
    .locals 1

    .line 297
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    return-void

    .line 300
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAidInfo:Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 301
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAidInfo:Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->cloneAidInfo()Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;->onAidGenSuccessed(Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;)V

    .line 302
    return-void

    .line 304
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sina/weibo/sdk/utils/AidTask;->generateAid(Ljava/lang/String;Lcom/sina/weibo/sdk/utils/AidTask$AidResultCallBack;)V

    .line 305
    return-void
.end method

.method public getAidSync(Ljava/lang/String;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/exception/WeiboException;
        }
    .end annotation

    .line 280
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    const/4 v0, 0x0

    return-object v0

    .line 283
    :cond_0
    const-string v0, "AidTask"

    const-string v1, "getAidSync "

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAidInfo:Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    if-nez v0, :cond_1

    .line 285
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/utils/AidTask;->aidTaskInit(Ljava/lang/String;)V

    .line 287
    :cond_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAidInfo:Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    return-object v0
.end method

.method public initAidInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 225
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    return-void

    .line 228
    :cond_0
    iput-object p1, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAppKey:Ljava/lang/String;

    .line 229
    iput-object p2, p0, Lcom/sina/weibo/sdk/utils/AidTask;->pkg:Ljava/lang/String;

    .line 230
    iput-object p3, p0, Lcom/sina/weibo/sdk/utils/AidTask;->hash:Ljava/lang/String;

    .line 231
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/sina/weibo/sdk/utils/AidTask$2;

    invoke-direct {v1, p0}, Lcom/sina/weibo/sdk/utils/AidTask$2;-><init>(Lcom/sina/weibo/sdk/utils/AidTask;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 266
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 267
    return-void
.end method

.method public loadAidFromCache()Ljava/lang/String;
    .locals 2

    .line 387
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/utils/AidTask;->loadAidInfoFromCache()Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;

    move-result-object v1

    .line 388
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 389
    invoke-virtual {v1}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 391
    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public loadAidFromNet()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/exception/WeiboException;
        }
    .end annotation

    .line 409
    const-string v2, "https://api.weibo.com/oauth2/getaid.json"

    .line 410
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->pkg:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/sina/weibo/sdk/utils/AidTask;->pkg:Ljava/lang/String;

    .line 411
    :goto_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->hash:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/sina/weibo/sdk/utils/Utility;->getSign(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lcom/sina/weibo/sdk/utils/AidTask;->hash:Ljava/lang/String;

    .line 412
    :goto_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask;->getMfp(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 414
    new-instance v6, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;

    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;-><init>(Landroid/content/Context;)V

    .line 415
    sget-object v0, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->GET:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    invoke-virtual {v6, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setRequestType(Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;)V

    .line 416
    const-string v0, "https://api.weibo.com/oauth2/getaid.json"

    invoke-virtual {v6, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setShortUrl(Ljava/lang/String;)V

    .line 417
    const-string v0, "appkey"

    iget-object v1, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAppKey:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addGetParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    const-string v0, "mfp"

    invoke-virtual {v6, v0, v5}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addGetParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    const-string v0, "packagename"

    invoke-virtual {v6, v0, v3}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addGetParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    const-string v0, "key_hash"

    invoke-virtual {v6, v0, v4}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addGetParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setNeedIntercept(Z)V

    .line 422
    invoke-static {}, Lcom/sina/weibo/sdk/network/impl/RequestService;->getInstance()Lcom/sina/weibo/sdk/network/IRequestService;

    move-result-object v7

    .line 424
    :try_start_0
    invoke-virtual {v6}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->build()Lcom/sina/weibo/sdk/network/impl/RequestParam;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/sina/weibo/sdk/network/IRequestService;->request(Lcom/sina/weibo/sdk/network/IRequestParam;)Lcom/sina/weibo/sdk/network/base/RequestResult;

    move-result-object v8

    .line 425
    invoke-virtual {v8}, Lcom/sina/weibo/sdk/network/base/RequestResult;->getResponse()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 427
    :catch_0
    move-exception v8

    .line 428
    const-string v0, "AidTask"

    invoke-virtual {v8}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    const/4 v0, 0x0

    return-object v0
.end method

.method protected declared-synchronized loadAidInfoFromCache()Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    .locals 8

    monitor-enter p0

    .line 367
    const/4 v1, 0x0

    .line 369
    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0}, Lcom/sina/weibo/sdk/utils/AidTask;->getAidInfoFile(I)Ljava/io/File;

    move-result-object v2

    .line 370
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v1, v0

    .line 371
    invoke-virtual {v1}, Ljava/io/FileInputStream;->available()I

    move-result v0

    new-array v3, v0, [B

    .line 372
    invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I

    .line 373
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;->parseJson(Ljava/lang/String;)Lcom/sina/weibo/sdk/utils/AidTask$AidInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 376
    if-eqz v1, :cond_0

    .line 378
    :try_start_1
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 380
    goto :goto_0

    .line 379
    :catch_0
    move-exception v5

    .line 380
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v4

    .line 374
    :catch_1
    move-exception v2

    .line 376
    if-eqz v1, :cond_2

    .line 378
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 380
    goto :goto_2

    .line 379
    :catch_2
    move-exception v2

    .line 380
    goto :goto_2

    .line 376
    :catchall_0
    move-exception v6

    if-eqz v1, :cond_1

    .line 378
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 380
    goto :goto_1

    .line 379
    :catch_3
    move-exception v7

    .line 380
    :cond_1
    :goto_1
    :try_start_4
    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 383
    :cond_2
    :goto_2
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_1
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public removeListener(Lcom/sina/weibo/sdk/utils/WeiboUtilListener;)V
    .locals 1

    .line 899
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 900
    iget-object v0, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 902
    :cond_0
    return-void
.end method

.method public declared-synchronized setAppkey(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 168
    :try_start_0
    iput-object p1, p0, Lcom/sina/weibo/sdk/utils/AidTask;->mAppKey:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized setExtras(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 172
    :try_start_0
    sput-object p1, Lcom/sina/weibo/sdk/utils/AidTask;->mExtras:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

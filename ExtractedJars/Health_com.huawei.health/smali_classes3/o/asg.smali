.class public Lo/asg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:J

.field private static b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/asn;>;"
        }
    .end annotation
.end field

.field private static d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/Long;Lo/asn;>;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final f:Ljava/lang/Object;

.field private static g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/asl;>;"
        }
    .end annotation
.end field

.field private static final i:Ljava/lang/Object;

.field private static k:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/Long;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 100
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/asg;->a:J

    .line 105
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lo/asg;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lo/asg;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/asg;->c:Ljava/util/List;

    .line 117
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lo/asg;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 122
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sput-object v0, Lo/asg;->k:Ljava/util/concurrent/BlockingQueue;

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/asg;->g:Ljava/util/List;

    .line 132
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/asg;->i:Ljava/lang/Object;

    .line 137
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/asg;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(J)Lcom/huawei/health/sns/logic/contacts/SnsFriend;
    .locals 9

    .line 251
    const/4 v6, 0x0

    .line 252
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 255
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    move-object v6, v0

    goto :goto_0

    .line 262
    :cond_0
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axi;->c(J)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v8

    .line 263
    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 265
    new-instance v0, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 266
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    move-object v6, v0

    .line 270
    :cond_1
    :goto_0
    if-nez v6, :cond_2

    .line 272
    const-string v0, "ContactPhotoManager"

    const-string v1, "getSnsFriends(long):error, no SnsFriend!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    :cond_2
    return-object v6
.end method

.method private static a()V
    .locals 13

    .line 629
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 630
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 632
    sget-object v3, Lo/asg;->f:Ljava/lang/Object;

    monitor-enter v3

    .line 635
    :try_start_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v4

    .line 636
    const-string v0, "PhotoSync"

    invoke-static {v4, v5, v0}, Lo/bop;->d(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 637
    const/4 v0, 0x0

    invoke-virtual {v2, v6, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    .line 638
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 639
    const/4 v9, 0x0

    .line 642
    :try_start_1
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v8}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v9, v0

    .line 644
    sget-object v0, Lo/asg;->c:Ljava/util/List;

    invoke-virtual {v9, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 646
    new-instance v10, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v10, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 647
    if-eqz v7, :cond_0

    .line 650
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "photoSyncInfo"

    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 659
    :cond_0
    :try_start_2
    invoke-static {v9}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 660
    invoke-static {v8}, Lo/bpe;->b(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 661
    goto :goto_0

    .line 653
    :catch_0
    move-exception v10

    .line 655
    const-string v0, "ContactPhotoManager"

    const-string v1, "savePhotoSyncInfoList IOException"

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 659
    :try_start_4
    invoke-static {v9}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 660
    invoke-static {v8}, Lo/bpe;->b(Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 661
    goto :goto_0

    .line 659
    :catchall_0
    move-exception v11

    :try_start_5
    invoke-static {v9}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 660
    invoke-static {v8}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 661
    throw v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 662
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_1
    move-exception v12

    monitor-exit v3

    throw v12

    .line 664
    :cond_1
    :goto_1
    return-void
.end method

.method private static a(Landroid/content/Context;)V
    .locals 14

    .line 560
    if-eqz p0, :cond_3

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 562
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v2

    .line 563
    const-string v0, "PhotoSync"

    invoke-static {v2, v3, v0}, Lo/bop;->d(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 564
    const/4 v0, 0x0

    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 565
    const-string v0, "photoSyncInfo"

    const-string v1, ""

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 566
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 568
    return-void

    .line 570
    :cond_0
    sget-object v7, Lo/asg;->f:Ljava/lang/Object;

    monitor-enter v7

    .line 573
    const/4 v8, 0x0

    .line 576
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {v6, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode([BI)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    move-object v8, v0

    .line 581
    goto :goto_0

    .line 578
    :catch_0
    move-exception v9

    .line 580
    const-string v0, "ContactPhotoManager"

    const-string v1, "initPhotoSyncInfoList UnsupportedEncodingException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 583
    :goto_0
    if-nez v8, :cond_1

    .line 585
    monitor-exit v7

    return-void

    .line 588
    :cond_1
    const/4 v9, 0x0

    .line 589
    const/4 v10, 0x0

    .line 592
    :try_start_2
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v8}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v9, v0

    .line 593
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v9}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v10, v0

    .line 595
    invoke-virtual {v10}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v11

    .line 596
    instance-of v0, v11, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 599
    move-object v0, v11

    check-cast v0, Ljava/util/List;

    sput-object v0, Lo/asg;->c:Ljava/util/List;
    :try_end_2
    .catch Ljava/io/OptionalDataException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 617
    :cond_2
    :try_start_3
    invoke-static {v10}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 618
    invoke-static {v9}, Lo/bpe;->d(Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 619
    goto :goto_1

    .line 603
    :catch_1
    move-exception v11

    .line 605
    const-string v0, "ContactPhotoManager"

    const-string v1, "initPhotoSyncInfoList OptionalDataException"

    :try_start_4
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 617
    :try_start_5
    invoke-static {v10}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 618
    invoke-static {v9}, Lo/bpe;->d(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 619
    goto :goto_1

    .line 607
    :catch_2
    move-exception v11

    .line 609
    const-string v0, "ContactPhotoManager"

    const-string v1, "initPhotoSyncInfoList ClassNotFoundException"

    :try_start_6
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 617
    :try_start_7
    invoke-static {v10}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 618
    invoke-static {v9}, Lo/bpe;->d(Ljava/io/InputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 619
    goto :goto_1

    .line 611
    :catch_3
    move-exception v11

    .line 613
    const-string v0, "ContactPhotoManager"

    const-string v1, "initPhotoSyncInfoList IOException"

    :try_start_8
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 617
    :try_start_9
    invoke-static {v10}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 618
    invoke-static {v9}, Lo/bpe;->d(Ljava/io/InputStream;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 619
    goto :goto_1

    .line 617
    :catchall_0
    move-exception v12

    :try_start_a
    invoke-static {v10}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 618
    invoke-static {v9}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 619
    throw v12
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 620
    :goto_1
    monitor-exit v7

    goto :goto_2

    :catchall_1
    move-exception v13

    monitor-exit v7

    throw v13

    .line 622
    :cond_3
    :goto_2
    return-void
.end method

.method private static a(JLjava/lang/String;)Z
    .locals 4

    .line 511
    invoke-static {p2}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 512
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 514
    sget-object v0, Lo/asg;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 516
    sget-object v0, Lo/asg;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/asn;

    .line 517
    invoke-virtual {v3}, Lo/asn;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 519
    const/4 v0, 0x1

    return v0

    .line 523
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static b()V
    .locals 2

    .line 483
    sget-object v0, Lo/asg;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 484
    return-void
.end method

.method private static b(JLjava/lang/String;)V
    .locals 6

    .line 534
    invoke-static {p2}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 535
    sget-object v0, Lo/asg;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 537
    sget-object v0, Lo/asg;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/asn;

    .line 538
    invoke-virtual {v3, v2}, Lo/asn;->c(Ljava/lang/String;)V

    .line 539
    goto :goto_0

    .line 542
    :cond_0
    new-instance v3, Lo/asn;

    invoke-direct {v3, p0, p1, v2}, Lo/asn;-><init>(JLjava/lang/String;)V

    .line 543
    sget-object v0, Lo/asg;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    sget-object v4, Lo/asg;->f:Ljava/lang/Object;

    monitor-enter v4

    .line 546
    :try_start_0
    sget-object v0, Lo/asg;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 547
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 549
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 7

    .line 146
    invoke-static {p0}, Lo/asg;->a(Landroid/content/Context;)V

    .line 147
    sget-object v3, Lo/asg;->f:Ljava/lang/Object;

    monitor-enter v3

    .line 149
    :try_start_0
    sget-object v0, Lo/asg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/asn;

    .line 151
    sget-object v0, Lo/asg;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5}, Lo/asn;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    goto :goto_0

    .line 153
    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 154
    :goto_1
    return-void
.end method

.method private static b(JLjava/lang/String;Landroid/content/ContentResolver;)Z
    .locals 3

    .line 394
    const/4 v2, 0x0

    .line 395
    invoke-static {p3, p0, p1, p2}, Lo/asf;->b(Landroid/content/ContentResolver;JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 397
    const/4 v2, 0x1

    .line 399
    invoke-static {p0, p1, p2}, Lo/asg;->b(JLjava/lang/String;)V

    .line 400
    const-string v0, "ContactPhotoManager"

    const-string v1, "Update phone-contact photo."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 404
    :cond_0
    const-string v0, "ContactPhotoManager"

    const-string v1, "Update phone-contact photo failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    :goto_0
    return v2
.end method

.method private static b(Landroid/content/Context;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;)Z"
        }
    .end annotation

    .line 381
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static c(Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Ljava/util/List<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;"
        }
    .end annotation

    .line 285
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 286
    if-eqz p0, :cond_0

    .line 288
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    :cond_0
    return-object v1
.end method

.method private static c(Landroid/content/Context;)V
    .locals 8

    .line 431
    sget-object v4, Lo/asg;->i:Ljava/lang/Object;

    monitor-enter v4

    .line 433
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 434
    sget-wide v0, Lo/asg;->a:J

    sub-long v0, v5, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    sget-object v0, Lo/asg;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 436
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0}, Lo/ask;->b(Landroid/content/ContentResolver;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lo/asg;->g:Ljava/util/List;

    .line 437
    sput-wide v5, Lo/asg;->a:J

    .line 438
    const-string v0, "ContactPhotoManager"

    const-string v1, "loadPhoneContacts() reloadPhoneContacts."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 440
    :cond_1
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 441
    :goto_0
    return-void
.end method

.method static c()Z
    .locals 1

    .line 499
    sget-object v0, Lo/asg;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public static c(J)Z
    .locals 4

    .line 171
    const/4 v2, 0x0

    .line 174
    :try_start_0
    sget-object v0, Lo/asg;->k:Ljava/util/concurrent/BlockingQueue;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    move v2, v0

    .line 187
    goto :goto_0

    .line 176
    :catch_0
    move-exception v3

    .line 178
    const-string v0, "ContactPhotoManager"

    const-string v1, "addQueue IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    goto :goto_0

    .line 180
    :catch_1
    move-exception v3

    .line 182
    const-string v0, "ContactPhotoManager"

    const-string v1, "addQueue ClassCastException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    goto :goto_0

    .line 184
    :catch_2
    move-exception v3

    .line 186
    const-string v0, "ContactPhotoManager"

    const-string v1, "addQueue IllegalArgumentException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    :goto_0
    return v2
.end method

.method static c(Landroid/content/Context;Ljava/util/List;Z)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/logic/contacts/SnsFriend;>;Z)Z"
        }
    .end annotation

    .line 305
    invoke-static {p0, p1}, Lo/asg;->b(Landroid/content/Context;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    const-string v0, "ContactPhotoManager"

    const-string v1, "syncContactPhoto throw IllegalArgumentException, Null context or Null account or Null snsFriends."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null context or Null account or Null snsFriends."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 311
    :cond_0
    sget-object v0, Lo/asg;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    const/4 v0, 0x0

    return v0

    .line 317
    :cond_1
    invoke-static {p0}, Lo/asg;->c(Landroid/content/Context;)V

    .line 319
    const-string v0, "ContactPhotoManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter syncContactPhoto, SnsFriends Number: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    const/4 v3, 0x0

    .line 325
    const/4 v4, 0x0

    .line 326
    const-wide/16 v5, 0x0

    .line 327
    const/4 v7, 0x0

    .line 328
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    .line 329
    new-instance v9, Lo/ash;

    invoke-direct {v9}, Lo/ash;-><init>()V

    .line 331
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    .line 333
    sget-object v12, Lo/asg;->i:Ljava/lang/Object;

    monitor-enter v12
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    :try_start_1
    sget-object v0, Lo/asg;->g:Ljava/util/List;

    invoke-virtual {v9, v0, v11}, Lo/ash;->e(Ljava/util/List;Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Lo/aso;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 336
    monitor-exit v12

    goto :goto_1

    :catchall_0
    move-exception v13

    monitor-exit v12

    :try_start_2
    throw v13

    .line 337
    :goto_1
    if-eqz v4, :cond_3

    .line 340
    invoke-static {v4, v8, v11}, Lo/asg;->d(Lo/aso;Landroid/content/ContentResolver;Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 342
    invoke-virtual {v4}, Lo/aso;->b()J

    move-result-wide v5

    .line 343
    invoke-virtual {v11}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->getPhotoUri()Ljava/lang/String;

    move-result-object v7

    .line 344
    invoke-static {v5, v6, v7, v8}, Lo/asg;->b(JLjava/lang/String;Landroid/content/ContentResolver;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 346
    const/4 v3, 0x1

    goto :goto_2

    .line 351
    :cond_2
    const-string v0, "ContactPhotoManager"

    const-string v1, "Update phone-contact photo, already synchornized photo."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 356
    :cond_3
    const-string v0, "ContactPhotoManager"

    const-string v1, "Update phone-contact photo, not the contact."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    :cond_4
    :goto_2
    goto :goto_0

    .line 360
    :cond_5
    if-eqz v3, :cond_6

    if-eqz p2, :cond_6

    .line 362
    invoke-static {}, Lo/asg;->a()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    .line 368
    :cond_6
    goto :goto_3

    .line 365
    :catch_0
    move-exception v4

    .line 367
    const-string v0, "ContactPhotoManager"

    const-string v1, "syncContactPhoto exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    :goto_3
    return v3
.end method

.method private static d(Lo/aso;Landroid/content/ContentResolver;Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Z
    .locals 3

    .line 420
    invoke-virtual {p0}, Lo/aso;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1, p2}, Lo/asg;->e(Landroid/content/ContentResolver;JLcom/huawei/health/sns/logic/contacts/SnsFriend;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    invoke-virtual {p0}, Lo/aso;->b()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->getPhotoUri()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/asg;->a(JLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 420
    :goto_0
    return v0
.end method

.method static e()V
    .locals 2

    .line 491
    sget-object v0, Lo/asg;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 492
    return-void
.end method

.method static e(Landroid/content/Context;)V
    .locals 8

    .line 199
    const/4 v4, 0x0

    .line 201
    sget-object v0, Lo/asg;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    return-void

    .line 205
    :cond_0
    const-string v0, "ContactPhotoManager"

    const-string v1, "incSyncContactPhoto."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const/4 v5, 0x0

    .line 210
    :try_start_0
    sget-object v0, Lo/asg;->k:Ljava/util/concurrent/BlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Long;

    .line 212
    :goto_0
    if-eqz v6, :cond_3

    .line 214
    sget-object v0, Lo/asg;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    goto :goto_1

    .line 218
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/asg;->a(J)Lcom/huawei/health/sns/logic/contacts/SnsFriend;

    move-result-object v5

    .line 219
    if-eqz v5, :cond_2

    invoke-static {v5}, Lo/asg;->c(Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo/asg;->c(Landroid/content/Context;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 221
    const/4 v4, 0x1

    .line 223
    :cond_2
    sget-object v0, Lo/asg;->k:Ljava/util/concurrent/BlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 233
    :cond_3
    :goto_1
    goto :goto_2

    .line 226
    :catch_0
    move-exception v7

    .line 228
    const-string v0, "ContactPhotoManager"

    const-string v1, "incSyncContactPhoto InterruptedException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    goto :goto_2

    .line 230
    :catch_1
    move-exception v7

    .line 232
    const-string v0, "ContactPhotoManager"

    const-string v1, "incSyncContactPhoto IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    :goto_2
    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v0}, Lo/asj;->b()V

    .line 237
    if-eqz v4, :cond_4

    .line 239
    invoke-static {}, Lo/asg;->a()V

    .line 241
    :cond_4
    return-void
.end method

.method private static e(Landroid/content/ContentResolver;JLcom/huawei/health/sns/logic/contacts/SnsFriend;)Z
    .locals 7

    .line 453
    const/4 v2, 0x0

    .line 454
    invoke-static {p0, p1, p2}, Lo/ask;->d(Landroid/content/ContentResolver;J)Lo/asl;

    move-result-object v3

    .line 455
    if-nez v3, :cond_0

    .line 457
    const/4 v2, 0x1

    goto :goto_0

    .line 461
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 462
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 463
    new-instance v5, Lo/ash;

    invoke-direct {v5}, Lo/ash;-><init>()V

    .line 464
    invoke-virtual {v5, v4, p3}, Lo/ash;->e(Ljava/util/List;Lcom/huawei/health/sns/logic/contacts/SnsFriend;)Lo/aso;

    move-result-object v6

    .line 465
    if-nez v6, :cond_1

    .line 467
    const/4 v2, 0x1

    .line 471
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 473
    const-string v0, "ContactPhotoManager"

    const-string v1, "Phone Number Deleted."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    :cond_2
    return v2
.end method

.class public Lo/dks;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# static fields
.field private static b:Z

.field private static f:Ljava/util/concurrent/ExecutorService;

.field private static final g:Landroid/net/Uri;

.field private static final h:Landroid/net/Uri;

.field private static final l:[Ljava/lang/String;

.field private static final n:Ljava/lang/Object;

.field private static final u:[Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private c:Landroid/telephony/TelephonyManager;

.field private d:Z

.field private e:Lo/dar;

.field private i:Lo/dkn;

.field private k:Z

.field private m:Landroid/content/BroadcastReceiver;

.field private o:Landroid/telephony/PhoneStateListener;

.field private p:J

.field private final q:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 46
    const/4 v0, 0x0

    sput-boolean v0, Lo/dks;->b:Z

    .line 57
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dks;->f:Ljava/util/concurrent/ExecutorService;

    .line 63
    const-string v0, "content://com.android.contacts.app/yellow_page_data"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lo/dks;->h:Landroid/net/Uri;

    .line 64
    const-string v0, "content://com.android.contacts.app/number_mark"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lo/dks;->g:Landroid/net/Uri;

    .line 65
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "number"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/dks;->l:[Ljava/lang/String;

    .line 78
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dks;->n:Ljava/lang/Object;

    .line 441
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/dks;->u:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 82
    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dks;->d:Z

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dks;->k:Z

    .line 119
    new-instance v0, Lo/dks$3;

    invoke-direct {v0, p0}, Lo/dks$3;-><init>(Lo/dks;)V

    iput-object v0, p0, Lo/dks;->m:Landroid/content/BroadcastReceiver;

    .line 175
    new-instance v0, Lo/dks$1;

    invoke-direct {v0, p0}, Lo/dks$1;-><init>(Lo/dks;)V

    iput-object v0, p0, Lo/dks;->o:Landroid/telephony/PhoneStateListener;

    .line 196
    new-instance v0, Lo/dks$8;

    invoke-direct {v0, p0}, Lo/dks$8;-><init>(Lo/dks;)V

    iput-object v0, p0, Lo/dks;->q:Landroid/content/BroadcastReceiver;

    .line 83
    iput-object p1, p0, Lo/dks;->a:Landroid/content/Context;

    .line 85
    const-string v0, "phone"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iput-object v0, p0, Lo/dks;->c:Landroid/telephony/TelephonyManager;

    .line 86
    invoke-static {p1}, Lo/dkn;->a(Landroid/content/Context;)Lo/dkn;

    move-result-object v0

    iput-object v0, p0, Lo/dks;->i:Lo/dkn;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    goto :goto_0

    .line 87
    :catch_0
    move-exception v4

    .line 88
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 517
    invoke-static {}, Lo/dbf;->r()Z

    move-result v6

    .line 518
    if-nez v6, :cond_0

    .line 519
    const/4 v0, 0x0

    return-object v0

    .line 521
    :cond_0
    const/4 v7, 0x0

    .line 522
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter getNumberMark number : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    const/4 v8, 0x0

    .line 524
    sget-object v0, Lo/dks;->g:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "number"

    .line 525
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "call_type"

    const-string v2, "18"

    .line 526
    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v9

    .line 527
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNumberMark uri: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, v9

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 530
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 531
    const/4 v10, 0x0

    .line 563
    if-eqz v8, :cond_1

    .line 564
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 565
    const/4 v8, 0x0

    .line 531
    :cond_1
    return-object v10

    .line 533
    :cond_2
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNumberMark cursor: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 535
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 536
    const/4 v0, 0x1

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 537
    const/4 v0, 0x2

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 539
    const-string v0, "others"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 540
    move-object v7, v12

    goto/16 :goto_0

    .line 541
    :cond_3
    const-string v0, "fraud"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 542
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->number_mark_fraud:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto/16 :goto_0

    .line 543
    :cond_4
    const-string v0, "crank"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 544
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->number_mark_crank:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto/16 :goto_0

    .line 545
    :cond_5
    const-string v0, "express"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 546
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->number_mark_express:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    .line 547
    :cond_6
    const-string v0, "house agent"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 548
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->number_mark_house_agent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    .line 549
    :cond_7
    const-string v0, "promote sales"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 550
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->number_mark_promote_sales:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    .line 551
    :cond_8
    const-string v0, "taxi"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 552
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->number_mark_taxi:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    .line 553
    :cond_9
    const-string v0, "satelite"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 554
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->contacts_str_filter_Maritime_Satellite_calls:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    .line 556
    :cond_a
    move-object v7, v12

    .line 558
    :goto_0
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNumberMark  classify: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; phoneNum: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; phoneName : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; numberMark : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 563
    :cond_b
    if-eqz v8, :cond_d

    .line 564
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 565
    const/4 v8, 0x0

    goto :goto_1

    .line 560
    :catch_0
    move-exception v10

    .line 561
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

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

    .line 563
    if-eqz v8, :cond_d

    .line 564
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 565
    const/4 v8, 0x0

    goto :goto_1

    .line 563
    :catchall_0
    move-exception v13

    if-eqz v8, :cond_c

    .line 564
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 565
    const/4 v8, 0x0

    .line 567
    :cond_c
    throw v13

    .line 568
    :cond_d
    :goto_1
    return-object v7
.end method

.method static synthetic a(Lo/dks;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/dks;->d()V

    return-void
.end method

.method static synthetic b(Lo/dks;)Landroid/telephony/TelephonyManager;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dks;->c:Landroid/telephony/TelephonyManager;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 221
    sget-object v0, Lo/dks;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dks$6;

    invoke-direct {v1, p0, p1}, Lo/dks$6;-><init>(Lo/dks;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 227
    return-void
.end method

.method static synthetic b(Lo/dks;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/dks;->e(Ljava/lang/String;)V

    return-void
.end method

.method private b()Z
    .locals 3

    .line 438
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    sget-object v1, Lo/dks;->u:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v2

    .line 439
    return v2
.end method

.method static synthetic c(Lo/dks;)Landroid/telephony/PhoneStateListener;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dks;->o:Landroid/telephony/PhoneStateListener;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 447
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "VdeferDoRing number : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 449
    invoke-direct {p0, p1}, Lo/dks;->b(Ljava/lang/String;)V

    .line 450
    return-void

    .line 452
    :cond_0
    sget-boolean v0, Lo/dks;->b:Z

    if-eqz v0, :cond_1

    .line 453
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deferDoRing: phone was ringing, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    return-void

    .line 456
    :cond_1
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deferDoRing has no number"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    sget-object v0, Lo/dks;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dks$10;

    invoke-direct {v1, p0, p1}, Lo/dks$10;-><init>(Lo/dks;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 476
    return-void
.end method

.method static synthetic c(Lo/dks;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/dks;->c(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .line 385
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getContactDisplayNameByNumber() number-------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    const/4 v6, 0x1

    .line 389
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 390
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    iget-object v1, p0, Lo/dks;->a:Landroid/content/Context;

    const-string v2, "android.permission.READ_CONTACTS"

    invoke-virtual {v0, v1, v2}, Lo/dbn;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    .line 392
    :cond_0
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getContactDisplayNameByNumber hasPermission ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    move-object v7, p1

    .line 395
    if-eqz v6, :cond_3

    .line 397
    :try_start_0
    sget-object v0, Landroid/provider/ContactsContract$PhoneLookup;->CONTENT_FILTER_URI:Landroid/net/Uri;

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 398
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    .line 399
    move-object v0, v9

    move-object v1, v8

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "display_name"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 401
    if-eqz v10, :cond_1

    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 402
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 403
    const-string v0, "display_name"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    .line 406
    :cond_1
    if-eqz v10, :cond_2

    .line 407
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    :cond_2
    goto :goto_0

    .line 409
    :catch_0
    move-exception v8

    .line 410
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getContactDisplayNameByNumber() Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    :cond_3
    :goto_0
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getContactDisplayNameByNumber() leave name-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    return-object v7
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/dar;
    .locals 8

    .line 315
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrapCallStateMsgData(): enter ------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 317
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 319
    new-instance v6, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    invoke-direct {v6}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;-><init>()V

    .line 321
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextType(I)V

    .line 322
    invoke-virtual {v6, p1}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextContent(Ljava/lang/String;)V

    .line 324
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 325
    new-instance v7, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    invoke-direct {v7}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;-><init>()V

    .line 326
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextType(I)V

    .line 327
    invoke-virtual {v7, p2}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextContent(Ljava/lang/String;)V

    .line 328
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    const-string v0, ""

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 331
    new-instance v7, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    invoke-direct {v7}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;-><init>()V

    .line 332
    const/4 v0, 0x6

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextType(I)V

    .line 333
    invoke-virtual {v7, p3}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextContent(Ljava/lang/String;)V

    .line 334
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    :cond_1
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    new-instance v0, Lo/dar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v4, v5, v2}, Lo/dar;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Z)V

    return-object v0
.end method

.method private d()V
    .locals 9

    .line 344
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPhoneIdleOrOffHook mPhoneRing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/dks;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dks;->p:J

    .line 347
    iget-boolean v0, p0, Lo/dks;->k:Z

    if-eqz v0, :cond_0

    .line 348
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isForbidden,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    return-void

    .line 351
    :cond_0
    sget-boolean v0, Lo/dks;->b:Z

    if-eqz v0, :cond_3

    .line 352
    const/4 v0, 0x0

    sput-boolean v0, Lo/dks;->b:Z

    .line 354
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 355
    new-instance v7, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    invoke-direct {v7}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;-><init>()V

    .line 357
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextType(I)V

    .line 358
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextContent(Ljava/lang/String;)V

    .line 359
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    .line 363
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Send Call off Notification to 3rd device."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->b()V

    goto :goto_0

    .line 365
    :cond_1
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 366
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "V0 protocol do not need call off info."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 368
    :cond_2
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneIdleOrOffHook start NotifySendData to send command"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    move-object v4, v6

    const/16 v1, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dkn;->a(IZLjava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v8

    .line 370
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    const/4 v1, 0x3

    invoke-virtual {v0, v8, v1}, Lo/dkn;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;I)V

    .line 371
    iget-object v0, p0, Lo/dks;->e:Lo/dar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/dks;->e:Lo/dar;

    invoke-virtual {v0}, Lo/dar;->c()Z

    move-result v0

    if-nez v0, :cond_3

    .line 372
    iget-object v0, p0, Lo/dks;->e:Lo/dar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dar;->d(Z)V

    .line 376
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/dks;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lo/dks;->k:Z

    return v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 482
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter getYellowPagesCursor number : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    invoke-static {}, Lo/dbf;->s()Z

    move-result v6

    .line 484
    if-nez v6, :cond_0

    .line 485
    const/4 v0, 0x0

    return-object v0

    .line 488
    :cond_0
    const/4 v7, 0x0

    .line 489
    const/4 v8, 0x0

    .line 491
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/dks;->h:Landroid/net/Uri;

    sget-object v2, Lo/dks;->l:[Ljava/lang/String;

    const-string v3, "PHONE_NUMBERS_EQUAL(number,?)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 495
    if-eqz v8, :cond_1

    .line 496
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 497
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    .line 498
    const/4 v0, 0x1

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 499
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPredefineCursor  numbers: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; name: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 505
    :cond_1
    if-eqz v8, :cond_3

    .line 506
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 507
    const/4 v8, 0x0

    goto :goto_0

    .line 502
    :catch_0
    move-exception v9

    .line 503
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

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

    .line 505
    if-eqz v8, :cond_3

    .line 506
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 507
    const/4 v8, 0x0

    goto :goto_0

    .line 505
    :catchall_0
    move-exception v10

    if-eqz v8, :cond_2

    .line 506
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 507
    const/4 v8, 0x0

    .line 509
    :cond_2
    throw v10

    .line 510
    :cond_3
    :goto_0
    return-object v7
.end method

.method private e(Ljava/lang/String;)V
    .locals 11

    .line 230
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentThread = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mPhoneRing = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/dks;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-boolean v0, p0, Lo/dks;->k:Z

    if-eqz v0, :cond_0

    .line 232
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isForbidden,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    return-void

    .line 235
    :cond_0
    sget-boolean v0, Lo/dks;->b:Z

    if-eqz v0, :cond_1

    .line 236
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneRing: phone was ringing, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    return-void

    .line 240
    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lo/dks;->b:Z

    .line 243
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 244
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no device so do not start PhoneService."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    return-void

    .line 249
    :cond_2
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 250
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    invoke-static {v6, v0}, Lo/dbf;->c(Landroid/content/Intent;Landroid/content/Context;)V

    .line 253
    move-object v7, p1

    .line 254
    const/4 v8, 0x0

    .line 255
    const/4 v9, 0x0

    .line 256
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 258
    invoke-direct {p0, p1}, Lo/dks;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 259
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 260
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/dks;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 261
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    const-string v0, ""

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 262
    :cond_3
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lo/dks;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 266
    :cond_4
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneRing incomingNumber is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    invoke-direct {p0}, Lo/dks;->b()Z

    move-result v0

    if-nez v0, :cond_5

    .line 268
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneRing no READ_PHONE_STATE permission "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :cond_5
    :goto_0
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPhoneRing userName : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; yellowPage : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; markStr : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_8

    .line 275
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 277
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneRing incomingNumber is empty device is B1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    return-void

    .line 283
    :cond_6
    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 284
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneRing, B1 push need delay(ms): 2000"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 287
    goto :goto_1

    .line 285
    :catch_0
    move-exception v10

    .line 286
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    :goto_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 291
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneRing userName is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    return-void

    .line 294
    :cond_7
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0, v7}, Lo/dkn;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 295
    :cond_8
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_9

    .line 297
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Send Call on Notification to 3rd device."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0, p1}, Lo/dkn;->d(Ljava/lang/String;)V

    goto :goto_2

    .line 301
    :cond_9
    invoke-direct {p0, v7, v9, v8}, Lo/dks;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/dar;

    move-result-object v0

    iput-object v0, p0, Lo/dks;->e:Lo/dar;

    .line 302
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPhoneRing start NotifySendData to send command"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    iget-object v1, p0, Lo/dks;->e:Lo/dar;

    invoke-virtual {v1}, Lo/dar;->b()I

    move-result v1

    iget-object v2, p0, Lo/dks;->e:Lo/dar;

    invoke-virtual {v2}, Lo/dar;->a()Ljava/util/ArrayList;

    move-result-object v3

    iget-object v2, p0, Lo/dks;->e:Lo/dar;

    invoke-virtual {v2}, Lo/dar;->d()Ljava/util/ArrayList;

    move-result-object v4

    const/4 v2, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dkn;->a(IZLjava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v10

    .line 305
    sget-boolean v0, Lo/dks;->b:Z

    if-eqz v0, :cond_a

    .line 306
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    const/4 v1, 0x3

    invoke-virtual {v0, v10, v1}, Lo/dkn;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;I)V

    goto :goto_2

    .line 308
    :cond_a
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "phone is not ring, not start NotifySendData to send command"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :goto_2
    return-void
.end method

.method static synthetic e(Lo/dks;)Z
    .locals 1

    .line 41
    invoke-direct {p0}, Lo/dks;->b()Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/dks;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lo/dks;->k:Z

    return p1
.end method

.method static synthetic g(Lo/dks;)J
    .locals 2

    .line 41
    iget-wide v0, p0, Lo/dks;->p:J

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 161
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshRegister()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    sget-object v0, Lo/dks;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dks$5;

    invoke-direct {v1, p0}, Lo/dks$5;-><init>(Lo/dks;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 170
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dks;->d:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    goto :goto_0

    .line 171
    :catch_0
    move-exception v4

    .line 172
    const-string v0, "PhoneListManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    :goto_0
    return-void
.end method

.method public c()V
    .locals 6

    .line 94
    iget-boolean v0, p0, Lo/dks;->d:Z

    if-nez v0, :cond_1

    .line 96
    :try_start_0
    invoke-direct {p0}, Lo/dks;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCallStateChanged() has READ_PHONE_STATE permission "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dks;->d:Z

    .line 100
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    sget-object v0, Lo/dks;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dks$4;

    invoke-direct {v1, p0}, Lo/dks$4;-><init>(Lo/dks;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 107
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.PHONE_STATE"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/dks;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 110
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 111
    const-string v0, "midware_phone_flag"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/dks;->m:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_0

    .line 113
    :catch_0
    move-exception v4

    .line 114
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    :cond_1
    :goto_0
    return-void
.end method

.method public d([B)V
    .locals 4

    .line 424
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 425
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 427
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 428
    array-length v0, p1

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const/4 v0, 0x2

    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_0

    .line 429
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "V0 Notification command send time out."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 431
    :cond_0
    iget-object v0, p0, Lo/dks;->i:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->d()V

    .line 436
    :cond_1
    :goto_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 136
    iget-boolean v0, p0, Lo/dks;->d:Z

    if-eqz v0, :cond_2

    .line 138
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lo/dks;->d:Z

    .line 139
    const-string v0, "PhoneListManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregister()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    sget-object v0, Lo/dks;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dks$2;

    invoke-direct {v1, p0}, Lo/dks$2;-><init>(Lo/dks;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 146
    iget-object v0, p0, Lo/dks;->q:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 147
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/dks;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 149
    :cond_0
    iget-object v0, p0, Lo/dks;->m:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 150
    iget-object v0, p0, Lo/dks;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/dks;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :cond_1
    goto :goto_0

    .line 152
    :catch_0
    move-exception v4

    .line 153
    const-string v0, "PhoneListManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    :cond_2
    :goto_0
    return-void
.end method

.class public final enum Lo/act;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/act;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/act;

.field private static d:Ljava/lang/String;

.field private static final synthetic o:[Lo/act;


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/acu;>;"
        }
    .end annotation
.end field

.field private c:Lo/acu;

.field private e:Lo/acu;

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private g:Lo/acu;

.field private h:Ljava/util/concurrent/ExecutorService;

.field private i:Lo/cmg;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 49
    new-instance v0, Lo/act;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/act;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/act;->a:Lo/act;

    .line 48
    const/4 v0, 0x1

    new-array v0, v0, [Lo/act;

    sget-object v1, Lo/act;->a:Lo/act;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/act;->o:[Lo/act;

    .line 51
    const-string v0, "PluginDevice_MultiUsersManager"

    sput-object v0, Lo/act;->d:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 68
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 56
    new-instance v0, Lo/acu;

    invoke-direct {v0}, Lo/acu;-><init>()V

    iput-object v0, p0, Lo/act;->c:Lo/acu;

    .line 57
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/act;->b:Ljava/util/Map;

    .line 58
    new-instance v0, Lo/acu;

    invoke-direct {v0}, Lo/acu;-><init>()V

    iput-object v0, p0, Lo/act;->e:Lo/acu;

    .line 59
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/act;->h:Ljava/util/concurrent/ExecutorService;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/act;->k:Ljava/util/List;

    .line 454
    new-instance v0, Lo/act$3;

    invoke-direct {v0, p0}, Lo/act$3;-><init>(Lo/act;)V

    iput-object v0, p0, Lo/act;->i:Lo/cmg;

    .line 69
    invoke-direct {p0}, Lo/act;->g()V

    .line 70
    return-void
.end method

.method static synthetic a(Lo/act;Z)Ljava/lang/String;
    .locals 1

    .line 48
    invoke-direct {p0, p1}, Lo/act;->a(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Z)Ljava/lang/String;
    .locals 12

    .line 364
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v4

    .line 365
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.weight_multi_userinfo_expand"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v5

    .line 366
    invoke-direct {p0, v4}, Lo/act;->b(Lcom/huawei/hihealth/HiUserPreference;)I

    move-result v6

    .line 367
    invoke-direct {p0, v5}, Lo/act;->b(Lcom/huawei/hihealth/HiUserPreference;)I

    move-result v7

    .line 368
    sget-object v0, Lo/act;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAllUserString baseCount\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",expandCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",isExpand:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 371
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 372
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/acu;

    .line 373
    invoke-virtual {v11}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/act;->b(Lcom/huawei/hihealth/HiUserPreference;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 374
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/acu;->c(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    .line 375
    :cond_0
    invoke-virtual {v11}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v5, v0}, Lo/act;->b(Lcom/huawei/hihealth/HiUserPreference;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/acu;->c(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    .line 378
    :cond_1
    if-nez p1, :cond_2

    .line 379
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/acu;->c(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    .line 381
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/acu;->c(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 384
    :goto_1
    goto :goto_0

    .line 385
    :cond_3
    invoke-virtual {v8}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v10

    .line 387
    if-nez p1, :cond_4

    .line 388
    :try_start_0
    invoke-static {v10}, Lo/cnp;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto :goto_2

    .line 390
    :cond_4
    invoke-virtual {v9}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cnp;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v10, v0

    .line 394
    :goto_2
    goto :goto_3

    .line 392
    :catch_0
    move-exception v11

    .line 393
    sget-object v0, Lo/act;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAllUserString "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    :goto_3
    return-object v10
.end method

.method static synthetic a(Lo/act;Lo/acu;)Lo/acu;
    .locals 0

    .line 48
    iput-object p1, p0, Lo/act;->c:Lo/acu;

    return-object p1
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Lo/acu;ZZZ)V
    .locals 2

    .line 515
    if-nez p6, :cond_0

    .line 516
    new-instance v1, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 517
    const-string v0, "custom.weight_multi_userinfo"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 518
    invoke-virtual {v1, p2}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 519
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 520
    goto :goto_0

    .line 521
    :cond_0
    new-instance v1, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 522
    const-string v0, "custom.weight_multi_userinfo_expand"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 523
    invoke-virtual {v1, p2}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 524
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 527
    :goto_0
    new-instance v1, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 528
    const-string v0, "custom.weight_multi_userinfo_base"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 529
    invoke-direct {p0}, Lo/act;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 530
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 532
    invoke-direct {p0, p3, p4, p5}, Lo/act;->a(Lo/acu;ZZ)V

    .line 535
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiUserPreference;Z)V
    .locals 2

    .line 183
    if-eqz p1, :cond_1

    .line 184
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 185
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 186
    invoke-direct {p0, v1, p2}, Lo/act;->d(Ljava/lang/String;Z)V

    goto :goto_0

    .line 188
    :cond_0
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 192
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/act;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lo/act;->f()V

    return-void
.end method

.method static synthetic a(Lo/act;Landroid/content/Context;Ljava/lang/String;Lo/acu;ZZZ)V
    .locals 0

    .line 48
    invoke-direct/range {p0 .. p6}, Lo/act;->a(Landroid/content/Context;Ljava/lang/String;Lo/acu;ZZZ)V

    return-void
.end method

.method private a(Lo/acu;Lo/acu;)V
    .locals 4

    .line 345
    sget-object v0, Lo/act;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMapUserData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    invoke-virtual {p2}, Lo/acu;->k()Z

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->a(Z)V

    .line 347
    invoke-virtual {p2}, Lo/acu;->c()B

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->e(B)V

    .line 348
    invoke-virtual {p2}, Lo/acu;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->c(I)V

    .line 349
    invoke-virtual {p2}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/acu;->c(Ljava/lang/String;)V

    .line 350
    invoke-virtual {p2}, Lo/acu;->i()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->a(I)V

    .line 351
    invoke-virtual {p2}, Lo/acu;->f()F

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->e(F)V

    .line 352
    invoke-virtual {p2}, Lo/acu;->h()F

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->b(F)V

    .line 353
    invoke-virtual {p2}, Lo/acu;->g()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->d(I)V

    .line 354
    invoke-virtual {p2}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/acu;->b(Landroid/graphics/Bitmap;)V

    .line 355
    invoke-virtual {p2}, Lo/acu;->o()F

    move-result v0

    invoke-virtual {p1, v0}, Lo/acu;->d(F)V

    .line 356
    return-void
.end method

.method private a(Lo/acu;ZZ)V
    .locals 2

    .line 544
    if-eqz p3, :cond_1

    .line 545
    if-eqz p2, :cond_0

    .line 546
    iget-object v0, p0, Lo/act;->c:Lo/acu;

    invoke-virtual {p0, v0}, Lo/act;->c(Lo/acu;)V

    goto :goto_0

    .line 547
    :cond_0
    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/act;->e:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 548
    invoke-virtual {p0, p1}, Lo/act;->c(Lo/acu;)V

    .line 552
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    .line 657
    :try_start_0
    invoke-static {p1}, Lo/cnp;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 658
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 659
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    .line 660
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    .line 661
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    .line 662
    new-instance v9, Lo/acu;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {v9, v0}, Lo/acu;-><init>(Lorg/json/JSONObject;)V

    .line 663
    invoke-virtual {v9}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    .line 664
    const/4 v0, 0x1

    return v0

    .line 660
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 671
    :cond_1
    goto :goto_1

    .line 667
    :catch_0
    move-exception v4

    .line 668
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserCountByKey_uncompressUserData "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 671
    goto :goto_1

    .line 669
    :catch_1
    move-exception v4

    .line 670
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserCountByKey_uncompressUserData json "

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

    .line 672
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private b(Lcom/huawei/hihealth/HiUserPreference;)I
    .locals 6

    .line 602
    if-eqz p1, :cond_0

    .line 603
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v4

    .line 604
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 606
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 607
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 608
    :catch_0
    move-exception v5

    .line 609
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserCountByKey_parseAllUserData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    invoke-direct {p0, v4}, Lo/act;->b(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 614
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private b(Ljava/lang/String;)I
    .locals 6

    .line 619
    :try_start_0
    invoke-static {p1}, Lo/cnp;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 620
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 621
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 622
    :catch_0
    move-exception v4

    .line 623
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserCountByKey_uncompressUserData "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    goto :goto_0

    .line 624
    :catch_1
    move-exception v4

    .line 625
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserCountByKey_uncompressUserData json "

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

    .line 627
    :goto_0
    const/4 v0, -0x1

    return v0
.end method

.method static synthetic b(Lo/act;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lo/act;->l()V

    return-void
.end method

.method private b(Lorg/json/JSONArray;)V
    .locals 7

    .line 232
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    .line 233
    sget-object v0, Lo/act;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " array count "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 236
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    .line 237
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lo/act;->b(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 241
    :cond_0
    goto :goto_1

    .line 239
    :catch_0
    move-exception v4

    .line 240
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseArrayUserData "

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

    .line 243
    :goto_1
    return-void
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 6

    .line 251
    new-instance v4, Lo/acu;

    invoke-direct {v4, p1}, Lo/acu;-><init>(Lorg/json/JSONObject;)V

    .line 252
    invoke-virtual {v4}, Lo/acu;->m()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    invoke-virtual {v4}, Lo/acu;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    :cond_0
    invoke-virtual {v4}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/act;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 254
    invoke-virtual {v4, v5}, Lo/acu;->e(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v4}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, Lo/act;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    goto :goto_0

    .line 257
    :cond_1
    invoke-virtual {v4}, Lo/acu;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/act;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    :goto_0
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-virtual {v4}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 260
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-virtual {v4}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initMap sidlist: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/act;->f:Ljava/util/Map;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    return-void
.end method

.method private b(Lcom/huawei/hihealth/HiUserPreference;Ljava/lang/String;)Z
    .locals 10

    .line 633
    if-eqz p1, :cond_2

    .line 634
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v4

    .line 635
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 637
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 638
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    .line 639
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    .line 640
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    .line 641
    new-instance v9, Lo/acu;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {v9, v0}, Lo/acu;-><init>(Lorg/json/JSONObject;)V

    .line 642
    invoke-virtual {v9}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 643
    const/4 v0, 0x1

    return v0

    .line 639
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 649
    :cond_1
    goto :goto_1

    .line 646
    :catch_0
    move-exception v5

    .line 647
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseUserCountByKey_parseAllUserData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    invoke-direct {p0, v4, p2}, Lo/act;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 652
    :cond_2
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Ljava/lang/String;)Z
    .locals 1

    .line 48
    invoke-direct {p0, p1, p2}, Lo/act;->b(Lcom/huawei/hihealth/HiUserPreference;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/act;)Lo/acu;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/act;->c:Lo/acu;

    return-object v0
.end method

.method private d(Ljava/lang/String;Z)V
    .locals 5

    .line 201
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseAllUserData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/act;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",isShowExpandUser:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    if-nez p2, :cond_0

    .line 203
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 206
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 207
    invoke-direct {p0, v4}, Lo/act;->b(Lorg/json/JSONArray;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    goto :goto_0

    .line 208
    :catch_0
    move-exception v4

    .line 209
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseAllUserData "

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

    .line 210
    invoke-direct {p0, p1}, Lo/act;->e(Ljava/lang/String;)V

    .line 214
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/act;Lcom/huawei/hihealth/HiUserPreference;Z)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lo/act;->a(Lcom/huawei/hihealth/HiUserPreference;Z)V

    return-void
.end method

.method static synthetic e(Lo/act;Lcom/huawei/hihealth/HiUserPreference;)I
    .locals 1

    .line 48
    invoke-direct {p0, p1}, Lo/act;->b(Lcom/huawei/hihealth/HiUserPreference;)I

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/act;)Ljava/util/Map;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 6

    .line 218
    :try_start_0
    invoke-static {p1}, Lo/cnp;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 219
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 220
    invoke-direct {p0, v5}, Lo/act;->b(Lorg/json/JSONArray;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 225
    goto :goto_0

    .line 221
    :catch_0
    move-exception v4

    .line 222
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uncompressUserData "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    goto :goto_0

    .line 223
    :catch_1
    move-exception v4

    .line 224
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "uncompressUserData json "

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

    .line 227
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/act;Lo/acu;Lo/acu;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lo/act;->a(Lo/acu;Lo/acu;)V

    return-void
.end method

.method private f()V
    .locals 2

    .line 157
    new-instance v1, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 158
    const-string v0, "custom.weight_multi_userinfo_base"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 159
    invoke-direct {p0}, Lo/act;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 160
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 161
    return-void
.end method

.method private g()V
    .locals 4

    .line 448
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regUserInfoListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    iget-object v0, p0, Lo/act;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 450
    iget-object v0, p0, Lo/act;->k:Ljava/util/List;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 451
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/act;->k:Ljava/util/List;

    iget-object v2, p0, Lo/act;->i:Lo/cmg;

    invoke-interface {v0, v1, v2}, Lo/clt;->a(Ljava/util/List;Lo/cmg;)V

    .line 452
    return-void
.end method

.method private h()V
    .locals 3

    .line 74
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lo/act;->f:Ljava/util/Map;

    .line 77
    :cond_1
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo2"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo3"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo4"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo5"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo6"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo7"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo8"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo9"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, "userInfo10"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    return-void
.end method

.method private i()Ljava/lang/String;
    .locals 7

    .line 405
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 406
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/acu;

    .line 407
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/acu;->c(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 408
    goto :goto_0

    .line 410
    :cond_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v5

    .line 412
    :try_start_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cnp;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 415
    goto :goto_1

    .line 413
    :catch_0
    move-exception v6

    .line 414
    sget-object v0, Lo/act;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAllUserString "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    :goto_1
    return-object v5
.end method

.method static synthetic k()Ljava/lang/String;
    .locals 1

    .line 48
    sget-object v0, Lo/act;->d:Ljava/lang/String;

    return-object v0
.end method

.method private l()V
    .locals 2

    .line 471
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/act$7;

    invoke-direct {v1, p0}, Lo/act$7;-><init>(Lo/act;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 504
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/act;
    .locals 1

    .line 48
    const-class v0, Lo/act;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/act;

    return-object v0
.end method

.method public static values()[Lo/act;
    .locals 1

    .line 48
    sget-object v0, Lo/act;->o:[Lo/act;

    invoke-virtual {v0}, [Lo/act;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/act;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 165
    iget-object v0, p0, Lo/act;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/act$1;

    invoke-direct {v1, p0}, Lo/act$1;-><init>(Lo/act;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 173
    return-void
.end method

.method public a(Lo/acu;)V
    .locals 1

    .line 90
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 91
    invoke-direct {p0}, Lo/act;->h()V

    .line 92
    invoke-virtual {p0, p1}, Lo/act;->d(Lo/acu;)V

    .line 93
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/acu;->a(I)V

    .line 94
    invoke-virtual {p0, p1}, Lo/act;->b(Lo/acu;)V

    .line 95
    iget-object v0, p0, Lo/act;->c:Lo/acu;

    invoke-virtual {p0, v0}, Lo/act;->c(Lo/acu;)V

    .line 96
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/act;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 97
    return-void
.end method

.method public b()Lo/acu;
    .locals 1

    .line 420
    iget-object v0, p0, Lo/act;->e:Lo/acu;

    return-object v0
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 110
    iget-object v0, p0, Lo/act;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/act$2;

    invoke-direct {v1, p0, p1}, Lo/act$2;-><init>(Lo/act;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 153
    return-void
.end method

.method public b(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 322
    iget-object v0, p0, Lo/act;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/act$5;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/act$5;-><init>(Lo/act;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 336
    return-void
.end method

.method public b(Lo/acu;)V
    .locals 4

    .line 430
    if-eqz p1, :cond_0

    .line 431
    iput-object p1, p0, Lo/act;->c:Lo/acu;

    goto :goto_0

    .line 433
    :cond_0
    sget-object v0, Lo/act;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainUser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    :goto_0
    return-void
.end method

.method public c()Lo/acu;
    .locals 1

    .line 106
    iget-object v0, p0, Lo/act;->g:Lo/acu;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lo/acu;
    .locals 4

    .line 560
    invoke-virtual {p0}, Lo/act;->e()Ljava/util/List;

    move-result-object v1

    .line 561
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/acu;

    .line 562
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    return-object v3

    .line 565
    :cond_0
    goto :goto_0

    .line 566
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 704
    invoke-virtual {p0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v4

    .line 705
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, "0"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 706
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "this is mainUser,uuid is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 707
    return-void

    .line 709
    :cond_1
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 710
    const-string v0, "delete"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 712
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    const-string v1, ""

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 714
    :cond_2
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    :cond_3
    :goto_0
    return-void
.end method

.method public c(Lo/acu;)V
    .locals 0

    .line 424
    if-eqz p1, :cond_0

    .line 425
    iput-object p1, p0, Lo/act;->e:Lo/acu;

    .line 427
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 682
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 683
    const-string v5, ""

    .line 684
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 685
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 686
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 687
    iget-object v0, p0, Lo/act;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 688
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 690
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 691
    goto :goto_1

    .line 693
    :cond_0
    const-string v0, ""

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 695
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 696
    goto :goto_1

    .line 698
    :cond_1
    goto :goto_0

    .line 699
    :cond_2
    :goto_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "@@getSid, sid is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    return-object v5
.end method

.method public d()Lo/acu;
    .locals 2

    .line 438
    iget-object v0, p0, Lo/act;->c:Lo/acu;

    if-nez v0, :cond_0

    .line 439
    new-instance v0, Lo/acu;

    invoke-direct {v0}, Lo/acu;-><init>()V

    iput-object v0, p0, Lo/act;->c:Lo/acu;

    .line 440
    iget-object v0, p0, Lo/act;->c:Lo/acu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/acu;->a(I)V

    .line 441
    iget-object v0, p0, Lo/act;->c:Lo/acu;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acu;->b(Ljava/lang/String;)V

    .line 442
    invoke-direct {p0}, Lo/act;->l()V

    .line 444
    :cond_0
    iget-object v0, p0, Lo/act;->c:Lo/acu;

    return-object v0
.end method

.method public d(Lo/acu;)V
    .locals 1

    .line 100
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 101
    iput-object p1, p0, Lo/act;->g:Lo/acu;

    .line 103
    :cond_0
    return-void
.end method

.method public e()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/acu;>;"
        }
    .end annotation

    .line 573
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 574
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 575
    invoke-virtual {p0}, Lo/act;->d()Lo/acu;

    move-result-object v3

    .line 576
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 577
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 578
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 579
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/acu;->c(Ljava/lang/String;)V

    .line 580
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/acu;->a(Ljava/lang/String;)V

    .line 583
    :cond_0
    iget-object v0, p0, Lo/act;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 584
    new-instance v0, Lo/act$10;

    invoke-direct {v0, p0}, Lo/act$10;-><init>(Lo/act;)V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 594
    invoke-virtual {p0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 595
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 596
    return-object v1
.end method

.method public e(Lo/acu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 270
    iget-object v0, p0, Lo/act;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/act$4;

    invoke-direct {v1, p0, p1, p2}, Lo/act$4;-><init>(Lo/act;Lo/acu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 315
    return-void
.end method

.class public Lo/afq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/afq$c;
    }
.end annotation


# static fields
.field private static c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lo/afj;>;"
        }
    .end annotation
.end field

.field public static final d:Ljava/lang/Object;

.field private static e:Lo/afq;


# instance fields
.field private a:Lo/aey;

.field private b:Lo/aff;

.field private f:Ljava/util/concurrent/ExecutorService;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const/4 v0, 0x0

    sput-object v0, Lo/afq;->e:Lo/afq;

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/afq;->d:Ljava/lang/Object;

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/afq;->c:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afq;->a:Lo/aey;

    .line 75
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager getInstance()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    new-instance v0, Lo/aey;

    invoke-direct {v0}, Lo/aey;-><init>()V

    iput-object v0, p0, Lo/afq;->a:Lo/aey;

    .line 77
    return-void
.end method

.method public static a(Ljava/lang/String;)D
    .locals 9

    .line 696
    if-nez p0, :cond_0

    .line 697
    const-wide/16 v0, 0x0

    return-wide v0

    .line 698
    :cond_0
    const/4 v4, 0x0

    .line 699
    const-wide/16 v5, 0x0

    .line 701
    :try_start_0
    new-instance v7, Ljava/net/URL;

    invoke-direct {v7, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 702
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v4, v0

    .line 703
    if-eqz v4, :cond_1

    .line 704
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getContentLength()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    int-to-double v0, v0

    move-wide v5, v0

    .line 709
    :cond_1
    if-eqz v4, :cond_3

    .line 710
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    .line 706
    :catch_0
    move-exception v7

    .line 707
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager IOException e1="

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 709
    if-eqz v4, :cond_3

    .line 710
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    .line 709
    :catchall_0
    move-exception v8

    if-eqz v4, :cond_2

    .line 710
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 712
    :cond_2
    throw v8

    .line 713
    :cond_3
    :goto_0
    return-wide v5
.end method

.method static synthetic a(Lo/afq;)Ljava/util/ArrayList;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/afq;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a(Ljava/util/ArrayList;Lo/aev;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afk;>;Lo/aev;Ljava/lang/String;)V"
        }
    .end annotation

    .line 636
    const-string v0, "0"

    invoke-virtual {p2, p3}, Lo/aev;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 637
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/afq$6;

    invoke-direct {v1, p0, p1}, Lo/afq$6;-><init>(Lo/afq;Ljava/util/ArrayList;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 656
    const-string v0, "NoFirst"

    invoke-virtual {p2, p3, v0}, Lo/aev;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    :cond_0
    return-void
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V
    .locals 2

    .line 585
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 586
    :cond_0
    return-void

    .line 588
    :cond_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/afq$8;

    invoke-direct {v1, p0, p1, p2}, Lo/afq$8;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 594
    return-void
.end method

.method static synthetic b(Lo/afq;Ljava/util/List;Z)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/afq;->c(Ljava/util/List;Z)V

    return-void
.end method

.method private c(Ljava/util/List;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/afr;>;Z)V"
        }
    .end annotation

    .line 412
    if-eqz p1, :cond_0

    .line 413
    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 414
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceCloudUtil downloadFileListZIP is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afr;

    .line 416
    new-instance v0, Lo/afq$7;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-direct {v0, p0, v1, v6, p2}, Lo/afq$7;-><init>(Lo/afq;ILo/afr;Z)V

    invoke-static {v0}, Lo/ahj;->b(Ljava/lang/Runnable;)V

    .line 502
    goto :goto_0

    .line 507
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/afq;)Lo/aff;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/afq;->b:Lo/aff;

    return-object v0
.end method

.method static synthetic d(Lo/afq;Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/afq;->k(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lo/afq;)Lo/aey;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/afq;->a:Lo/aey;

    return-object v0
.end method

.method public static e()Lo/afq;
    .locals 4

    .line 55
    sget-object v2, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 56
    :try_start_0
    sget-object v0, Lo/afq;->e:Lo/afq;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 57
    new-instance v0, Lo/afq;

    invoke-direct {v0}, Lo/afq;-><init>()V

    sput-object v0, Lo/afq;->e:Lo/afq;

    .line 59
    :cond_0
    sget-object v0, Lo/afq;->e:Lo/afq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 60
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic e(Lo/afq;Lo/afr;Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/afq;->e(Lo/afr;Ljava/lang/String;)V

    return-void
.end method

.method private e(Lo/afr;Ljava/lang/String;)V
    .locals 5

    .line 598
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 599
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager toDownloadFile resultObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    return-void

    .line 602
    :cond_0
    invoke-virtual {p1}, Lo/afr;->c()Ljava/lang/String;

    move-result-object v4

    .line 603
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 604
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager toDownloadFile url is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    return-void

    .line 607
    :cond_2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/afq$10;

    invoke-direct {v1, p0, v4, p2}, Lo/afq$10;-><init>(Lo/afq;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 613
    return-void
.end method

.method private k(Ljava/lang/String;)V
    .locals 6

    .line 398
    const-string v0, "_new"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 399
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager setProductsCatch productID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afe;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 401
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager setProductsCatch filePath "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    invoke-static {v4}, Lo/afm;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 403
    if-eqz v5, :cond_1

    .line 404
    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    iget-object v1, v5, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 405
    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    iget-object v1, v5, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    :cond_0
    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    iget-object v1, v5, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    :cond_1
    return-void
.end method

.method private m()Ljava/lang/String;
    .locals 5

    .line 391
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 393
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserAgreeStatus onclick userAgreed :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    return-object v4
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 69
    invoke-virtual {p0}, Lo/afq;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo/afq;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResoureManager is isToUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-virtual {p0}, Lo/afq;->i()V

    .line 73
    :cond_1
    return-void
.end method

.method public a(Lo/aff;)V
    .locals 6

    .line 80
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====registerResultCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    sget-object v4, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 82
    :try_start_0
    iput-object p1, p0, Lo/afq;->b:Lo/aff;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 84
    :goto_0
    return-void
.end method

.method public b()V
    .locals 0

    .line 64
    invoke-virtual {p0}, Lo/afq;->g()V

    .line 65
    invoke-virtual {p0}, Lo/afq;->h()V

    .line 66
    return-void
.end method

.method public b(Ljava/lang/String;Lo/aff;)V
    .locals 2

    .line 525
    iget-object v0, p0, Lo/afq;->f:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/afq;->f:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 526
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/afq;->f:Ljava/util/concurrent/ExecutorService;

    .line 528
    :cond_1
    iget-object v0, p0, Lo/afq;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/afq$9;

    invoke-direct {v1, p0, p1, p2}, Lo/afq$9;-><init>(Lo/afq;Ljava/lang/String;Lo/aff;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 577
    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 359
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 360
    iput-object p1, p0, Lo/afq;->k:Ljava/util/ArrayList;

    .line 362
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 363
    invoke-direct {p0}, Lo/afq;->m()Ljava/lang/String;

    move-result-object v4

    .line 365
    const-string v0, "true"

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 366
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownResZip user disagree download resoure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    new-instance v0, Lo/ahi$a;

    const-string v1, "single_device_download_dialog"

    invoke-direct {v0, v1}, Lo/ahi$a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 368
    return-void

    .line 371
    :cond_1
    iget-object v0, p0, Lo/afq;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/afq;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 372
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceCloudUtil toDownloadZipFilesFromKind fileIds size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afq;->k:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    const-string v0, "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion"

    iget-object v1, p0, Lo/afq;->k:Ljava/util/ArrayList;

    invoke-static {v1}, Lo/aet;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/afq$2;

    invoke-direct {v2, p0}, Lo/afq$2;-><init>(Lo/afq;)V

    invoke-static {v0, v1, v2}, Lo/afq;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 388
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    .line 233
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afn;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 107
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afe;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 108
    return-object v1
.end method

.method public c()Lo/aey;
    .locals 1

    .line 103
    iget-object v0, p0, Lo/afq;->a:Lo/aey;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/aey;

    return-object v0
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afl;>;)V"
        }
    .end annotation

    .line 280
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 281
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afl;

    .line 282
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/afl;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    invoke-virtual {v6}, Lo/afl;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 286
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download ids size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    return-void

    .line 289
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    rem-int/lit8 v5, v0, 0x14

    .line 290
    if-lez v5, :cond_2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x14

    add-int/lit8 v6, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/lit8 v6, v0, 0x14

    .line 291
    :goto_1
    const/4 v7, 0x1

    :goto_2
    if-gt v7, v6, :cond_4

    .line 292
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 293
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    rem-int/lit8 v0, v0, 0x14

    if-lez v0, :cond_3

    if-ne v7, v6, :cond_3

    .line 294
    add-int/lit8 v0, v7, -0x1

    mul-int/lit8 v0, v0, 0x14

    add-int/lit8 v1, v7, -0x1

    mul-int/lit8 v1, v1, 0x14

    add-int/2addr v1, v5

    invoke-virtual {v4, v0, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    .line 296
    :cond_3
    add-int/lit8 v0, v7, -0x1

    mul-int/lit8 v0, v0, 0x14

    mul-int/lit8 v1, v7, 0x14

    invoke-virtual {v4, v0, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 298
    :goto_3
    invoke-virtual {p0, v8}, Lo/afq;->e(Ljava/util/ArrayList;)V

    .line 291
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 300
    :cond_4
    return-void
.end method

.method public c(Ljava/util/ArrayList;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Z)V"
        }
    .end annotation

    .line 323
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownResZipGetSize download resoure enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 325
    iput-object p1, p0, Lo/afq;->k:Ljava/util/ArrayList;

    .line 327
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownResZipGetSize mFileIds.size > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 329
    invoke-direct {p0}, Lo/afq;->m()Ljava/lang/String;

    move-result-object v4

    .line 330
    const-string v0, "true"

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 331
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownResZipGetSize download resoure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    new-instance v0, Lo/ahi$a;

    const-string v1, "single_device_download_dialog"

    invoke-direct {v0, v1}, Lo/ahi$a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 333
    return-void

    .line 337
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownResZipGetSize china network"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    iget-object v0, p0, Lo/afq;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/afq;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 339
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "toDownResZipGetSize fileIds size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/afq;->k:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    const-string v0, "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion"

    iget-object v1, p0, Lo/afq;->k:Ljava/util/ArrayList;

    invoke-static {v1}, Lo/aet;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/afq$1;

    invoke-direct {v2, p0, p2}, Lo/afq$1;-><init>(Lo/afq;Z)V

    invoke-static {v0, v1, v2}, Lo/afq;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 355
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownResZipGetSize end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    return-void
.end method

.method public d()V
    .locals 3

    .line 97
    sget-object v1, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 98
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lo/afq;->b:Lo/aff;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 100
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 6

    .line 87
    sget-object v4, Lo/afq;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 88
    :try_start_0
    iget-object v0, p0, Lo/afq;->b:Lo/aff;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 89
    iget-object v0, p0, Lo/afq;->b:Lo/aff;

    invoke-interface {v0, p1, p2}, Lo/aff;->onResult(ILjava/lang/String;)V

    goto :goto_0

    .line 91
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resultCallBack is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 94
    :goto_1
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1

    .line 238
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afn;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 510
    const-string v4, ""

    .line 512
    :try_start_0
    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    .line 513
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 514
    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v6

    .line 515
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/afn;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 520
    goto :goto_0

    .line 516
    :catch_0
    move-exception v5

    .line 517
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager getHashCodeForString e1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    goto :goto_0

    .line 518
    :catch_1
    move-exception v5

    .line 519
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManager getHashCodeForString e2="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    :goto_0
    return-object v4
.end method

.method public e(Ljava/lang/String;)Lo/afj;
    .locals 8

    .line 111
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager getProductInfo ID:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    .line 114
    :cond_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afe;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 115
    invoke-static {v5}, Lo/afm;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 116
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 117
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 118
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 122
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getProductInfo file is not exists ID:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :goto_0
    goto/16 :goto_1

    :cond_2
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 125
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/acp;

    .line 126
    if-eqz v6, :cond_5

    .line 127
    const-string v0, "0"

    invoke-virtual {v6}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 128
    new-instance v4, Lo/afj;

    invoke-direct {v4}, Lo/afj;-><init>()V

    .line 129
    invoke-virtual {v4, p1}, Lo/afj;->d(Ljava/lang/String;)V

    .line 130
    const-string v0, "ic_heartrate_devices"

    invoke-virtual {v6}, Lo/acp;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lo/acp;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v0, v1, v2}, Lo/afj;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "1"

    invoke-virtual {v4, v0}, Lo/afj;->a(Ljava/lang/String;)V

    .line 132
    new-instance v7, Lo/acf$d;

    invoke-direct {v7}, Lo/acf$d;-><init>()V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/acf$d;->b(I)Lo/acf$d;

    .line 138
    const-string v0, "10"

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v0, v1}, Lo/acf$d;->e(ILjava/util/concurrent/TimeUnit;)Lo/acf$d;

    .line 139
    invoke-virtual {v7}, Lo/acf$d;->d()Lo/acf;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->e(Lo/acf;)V

    .line 140
    invoke-virtual {v6}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->b(Ljava/lang/String;)V

    .line 141
    invoke-virtual {v6}, Lo/acp;->h()Lo/acl$a;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->b(Lo/acl$a;)V

    .line 143
    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    goto/16 :goto_1

    :cond_3
    const-string v0, "0"

    invoke-virtual {v6}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 145
    new-instance v4, Lo/afj;

    invoke-direct {v4}, Lo/afj;-><init>()V

    .line 146
    invoke-virtual {v4, p1}, Lo/afj;->d(Ljava/lang/String;)V

    .line 147
    const-string v0, ""

    const-string v1, ""

    const-string v2, ""

    invoke-virtual {v4, v0, v1, v2}, Lo/afj;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v0, "1"

    invoke-virtual {v4, v0}, Lo/afj;->a(Ljava/lang/String;)V

    .line 149
    new-instance v7, Lo/acf$d;

    invoke-direct {v7}, Lo/acf$d;-><init>()V

    .line 153
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/acf$d;->b(I)Lo/acf$d;

    .line 155
    const-string v0, "10"

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v0, v1}, Lo/acf$d;->e(ILjava/util/concurrent/TimeUnit;)Lo/acf$d;

    .line 156
    invoke-virtual {v7}, Lo/acf$d;->d()Lo/acf;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->e(Lo/acf;)V

    .line 157
    invoke-virtual {v6}, Lo/acp;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->b(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v6}, Lo/acp;->h()Lo/acl$a;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/afj;->b(Lo/acl$a;)V

    .line 159
    goto :goto_1

    .line 160
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the device is error! ID:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 163
    :cond_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the device is null! ID:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    :cond_6
    :goto_1
    goto :goto_2

    .line 167
    :cond_7
    sget-object v0, Lo/afq;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afj;

    .line 197
    :goto_2
    return-object v4
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 303
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 304
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceCloudUtil toDownloadZipFilesFromKind fileIds size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    const-string v0, "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion"

    invoke-static {p1}, Lo/aet;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/afq$3;

    invoke-direct {v2, p0}, Lo/afq$3;-><init>(Lo/afq;)V

    invoke-static {v0, v1, v2}, Lo/afq;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 318
    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 3

    .line 718
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    sget-object v1, Lo/agx;->a:Ljava/lang/String;

    new-instance v2, Lo/afq$4;

    invoke-direct {v2, p0}, Lo/afq$4;-><init>(Lo/afq;)V

    invoke-virtual {v0, p1, v1, v2}, Lo/afn;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 724
    return-void
.end method

.method public f()Z
    .locals 4

    .line 223
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager isToUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    invoke-virtual {v0}, Lo/afn;->b()Z

    move-result v0

    return v0
.end method

.method public g()V
    .locals 4

    .line 209
    new-instance v2, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "devicedownloadtime"

    invoke-direct {v2, v0, v1}, Lo/aev;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 210
    const-string v0, "userchange"

    invoke-virtual {v2, v0}, Lo/aev;->b(Ljava/lang/String;)Z

    move-result v3

    .line 211
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eq v3, v0, :cond_2

    .line 212
    iget-object v0, p0, Lo/afq;->a:Lo/aey;

    invoke-virtual {v0}, Lo/aey;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 213
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 214
    const-string v0, "userchange"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lo/aev;->d(Ljava/lang/String;Z)V

    goto :goto_1

    .line 216
    :cond_1
    const-string v0, "userchange"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Lo/aev;->d(Ljava/lang/String;Z)V

    .line 220
    :cond_2
    :goto_1
    return-void
.end method

.method public h()V
    .locals 6

    .line 616
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager unzipForRes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    iget-object v0, p0, Lo/afq;->a:Lo/aey;

    invoke-virtual {v0}, Lo/aey;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 618
    new-instance v5, Lo/aev;

    .line 619
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "devicedownloadtime"

    invoke-direct {v5, v0, v1}, Lo/aev;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 622
    const-string v0, "NoFirst"

    const-string v1, "firstUnzipRes"

    invoke-virtual {v5, v1}, Lo/aev;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 624
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager unzipForRes() firstUnzipRes is NoFirst"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    return-void

    .line 627
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 628
    const-string v0, "abroadFirstUnzipResource"

    invoke-direct {p0, v4, v5, v0}, Lo/afq;->a(Ljava/util/ArrayList;Lo/aev;Ljava/lang/String;)V

    goto :goto_0

    .line 630
    :cond_1
    const-string v0, "firstUnzipResource"

    invoke-direct {p0, v4, v5, v0}, Lo/afq;->a(Ljava/util/ArrayList;Lo/aev;Ljava/lang/String;)V

    .line 632
    :goto_0
    return-void
.end method

.method public i()V
    .locals 7

    .line 247
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceCloudUtil toDownloadSingleXmlFile()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    const-string v4, ""

    .line 249
    const-string v5, ""

    .line 250
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "to download groups.xml"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    const-string v0, "devicekindgroups_new"

    invoke-static {v0}, Lo/aet;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/agx;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "groups.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 255
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "to download groups_abroad.xml"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    invoke-direct {p0}, Lo/afq;->m()Ljava/lang/String;

    move-result-object v6

    .line 257
    const-string v0, "true"

    invoke-static {v6, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 258
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toDownloadSingleXmlFile user disagree download resoure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    new-instance v0, Lo/ahi$a;

    const-string v1, "device_download_dialog"

    invoke-direct {v0, v1}, Lo/ahi$a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 260
    return-void

    .line 262
    :cond_1
    const-string v0, "devicekindgroupsabroad_new"

    invoke-static {v0}, Lo/aet;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/agx;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "groups_abroad.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 265
    :goto_0
    move-object v6, v5

    .line 266
    const-string v0, "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion"

    new-instance v1, Lo/afq$5;

    invoke-direct {v1, p0, v6}, Lo/afq$5;-><init>(Lo/afq;Ljava/lang/String;)V

    invoke-static {v0, v4, v1}, Lo/afq;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 276
    return-void
.end method

.method public k()Z
    .locals 4

    .line 228
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ResourceManager isFirstToDownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    invoke-virtual {v0}, Lo/afn;->d()Z

    move-result v0

    return v0
.end method

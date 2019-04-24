.class public Lo/due;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static volatile e:Lo/due;


# instance fields
.field private b:Lo/dwr;

.field private c:Ljava/util/concurrent/ExecutorService;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private k:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    const/4 v0, 0x0

    sput-object v0, Lo/due;->a:Landroid/content/Context;

    .line 64
    const/4 v0, 0x0

    sput-object v0, Lo/due;->e:Lo/due;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/due;->d:Ljava/util/Map;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    .line 70
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/due;->i:Ljava/util/Map;

    .line 100
    new-instance v0, Lo/due$4;

    sget-object v1, Lo/due;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/due$4;-><init>(Lo/due;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/due;->k:Landroid/os/Handler;

    .line 86
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    .line 87
    return-void
.end method

.method static synthetic a(Lo/due;)Ljava/util/Map;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 170
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "enter download"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    new-instance v3, Lo/dub;

    sget-object v0, Lo/due;->a:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/dub;-><init>(Landroid/content/Context;)V

    .line 172
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 173
    :cond_0
    invoke-direct {p0}, Lo/due;->i()V

    .line 174
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "exit download"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    return-void

    .line 177
    :cond_1
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 178
    iget-object v0, p0, Lo/due;->i:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 179
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureStatusDownloadDoing"

    const-string v2, "doing"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter download file length= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    add-int/lit8 v1, v4, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 182
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_2

    .line 183
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 184
    iget-object v0, p0, Lo/due;->i:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v7, v0, v5, v3}, Lo/due;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dub;)V

    .line 182
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 186
    :cond_2
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 188
    :cond_3
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 448
    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    invoke-direct {p0}, Lo/due;->f()V

    .line 450
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dub;)V
    .locals 7

    .line 244
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    .line 247
    :cond_0
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/due$2;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lo/due$2;-><init>(Lo/due;Ljava/lang/String;Ljava/lang/String;Lo/dub;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 274
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Lo/dub;)V
    .locals 2

    .line 284
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    .line 287
    :cond_0
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/due$5;

    invoke-direct {v1, p0, p3, p2, p1}, Lo/due$5;-><init>(Lo/due;Lo/dub;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 306
    return-void
.end method

.method static synthetic a(Lo/due;IJJ)V
    .locals 0

    .line 51
    invoke-direct/range {p0 .. p5}, Lo/due;->d(IJJ)V

    return-void
.end method

.method private b()V
    .locals 3

    .line 336
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "enter getMedalData"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v2

    .line 338
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 339
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 341
    :cond_0
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 342
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    .line 344
    :cond_1
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/due$8;

    invoke-direct {v1, p0, v2}, Lo/due$8;-><init>(Lo/due;Lo/dwr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 375
    return-void
.end method

.method private b(Lo/dvt;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dvt;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 421
    invoke-virtual {p1}, Lo/dvt;->c()Ljava/lang/String;

    move-result-object v2

    .line 422
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 423
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "medalID is Overtime,not download"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    return-void

    .line 426
    :cond_0
    invoke-virtual {p1}, Lo/dvt;->d()Ljava/lang/String;

    move-result-object v3

    .line 428
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 429
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 431
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    .line 432
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    :goto_0
    iget-object v0, p0, Lo/due;->i:Ljava/util/Map;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    return-void
.end method

.method static synthetic b(Lo/due;)Z
    .locals 1

    .line 51
    invoke-direct {p0}, Lo/due;->g()Z

    move-result v0

    return v0
.end method

.method static synthetic c()Landroid/content/Context;
    .locals 1

    .line 51
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    return-object v0
.end method

.method private c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvf;>;Ljava/util/List<Lo/dvf;>;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 384
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 385
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 386
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "medalLocation or medalConfigInfoList is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    return-object v2

    .line 389
    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 390
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dvf;

    .line 391
    instance-of v0, v4, Lo/dvy;

    if-eqz v0, :cond_2

    .line 392
    move-object v5, v4

    check-cast v5, Lo/dvy;

    .line 393
    invoke-virtual {v5}, Lo/dvy;->g()I

    move-result v0

    if-lez v0, :cond_2

    .line 394
    invoke-virtual {v5}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 398
    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 399
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dvf;

    .line 400
    instance-of v0, v4, Lo/dvu;

    if-eqz v0, :cond_7

    .line 401
    move-object v5, v4

    check-cast v5, Lo/dvu;

    .line 402
    invoke-virtual {v5}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v6

    .line 403
    invoke-virtual {v5}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v7

    .line 404
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 405
    goto :goto_2

    .line 407
    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_6

    .line 408
    invoke-virtual {v5}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v8

    .line 409
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lo/dzs;->b(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 410
    invoke-virtual {v5}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    :cond_5
    goto :goto_2

    .line 413
    :cond_6
    invoke-virtual {v5}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    :cond_7
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 417
    :cond_8
    return-object v2
.end method

.method public static c(Landroid/content/Context;)Lo/due;
    .locals 3

    .line 74
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/due;->a:Landroid/content/Context;

    .line 75
    sget-object v0, Lo/due;->e:Lo/due;

    if-nez v0, :cond_1

    .line 76
    const-class v1, Lo/due;

    monitor-enter v1

    .line 77
    :try_start_0
    sget-object v0, Lo/due;->e:Lo/due;

    if-nez v0, :cond_0

    .line 78
    new-instance v0, Lo/due;

    invoke-direct {v0}, Lo/due;-><init>()V

    sput-object v0, Lo/due;->e:Lo/due;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 82
    :cond_1
    :goto_0
    sget-object v0, Lo/due;->e:Lo/due;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 7

    .line 467
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "enter parseJsonData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 469
    return-void

    .line 471
    :cond_0
    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 472
    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    goto :goto_0

    .line 474
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/due;->d:Ljava/util/Map;

    .line 478
    :goto_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 479
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 480
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalIdList length is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 482
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v3}, Lo/dud;->e(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v6

    .line 483
    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    iget-object v1, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 481
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 487
    :cond_2
    goto :goto_2

    .line 485
    :catch_0
    move-exception v3

    .line 486
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "parseJsonData Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    :goto_2
    return-void
.end method

.method static synthetic c(Lo/due;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/due;->a()V

    return-void
.end method

.method static synthetic c(Lo/due;Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lo/due;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/due;Lo/dvt;Ljava/util/ArrayList;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lo/due;->b(Lo/dvt;Ljava/util/ArrayList;)V

    return-void
.end method

.method private d(IJJ)V
    .locals 6

    .line 315
    const/4 v2, 0x0

    .line 316
    if-nez p1, :cond_0

    .line 317
    const/4 v2, 0x0

    goto :goto_0

    .line 319
    :cond_0
    const/4 v2, 0x1

    .line 321
    :goto_0
    sub-long v3, p4, p2

    .line 322
    if-nez v2, :cond_1

    const-wide/16 v0, 0x1388

    cmp-long v0, v3, v0

    if-ltz v0, :cond_2

    .line 323
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 324
    const-string v0, "target"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    const-string v0, "target_source_type"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    const-string v0, "delay_ms"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    const-string v0, "flag"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 330
    :cond_2
    return-void
.end method

.method private d(ILjava/lang/Object;)V
    .locals 2

    .line 440
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 441
    iput p1, v1, Landroid/os/Message;->what:I

    .line 442
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 443
    iget-object v0, p0, Lo/due;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 444
    return-void
.end method

.method static synthetic d(Lo/due;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/due;->k()V

    return-void
.end method

.method static synthetic d(Lo/due;Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lo/due;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lo/due;Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 1

    .line 51
    invoke-direct {p0, p1, p2}, Lo/due;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/due;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/due;->i()V

    return-void
.end method

.method static synthetic e(Lo/due;ILjava/lang/Object;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lo/due;->d(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic e(Lo/due;Ljava/lang/String;Ljava/lang/String;Lo/dub;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/due;->a(Ljava/lang/String;Ljava/lang/String;Lo/dub;)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 493
    new-instance v2, Lorg/json/JSONObject;

    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 494
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    .line 495
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureDownload"

    invoke-static {v0, v1, v3}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    return-void
.end method

.method private g()Z
    .locals 6

    .line 500
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 501
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter allMedalTextureIsDownload  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 503
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 504
    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    .line 505
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 502
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 508
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private i()V
    .locals 3

    .line 513
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureStatusDownloadDoing"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    return-void
.end method

.method private k()V
    .locals 5

    .line 454
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "enter initTextureMap"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 456
    return-void

    .line 458
    :cond_0
    iget-object v0, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 459
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 460
    iget-object v0, p0, Lo/due;->d:Ljava/util/Map;

    iget-object v1, p0, Lo/due;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 462
    :cond_1
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 7

    .line 191
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "medalId is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    return-void

    .line 195
    :cond_0
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->o(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    .line 197
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "getNetEnvironment is not WIFI"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    return-void

    .line 201
    :cond_1
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "clearMedalResCache"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 202
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "clearCache is null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    return-void

    .line 206
    :cond_2
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureStatusDownloadDoing"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 207
    const-string v0, "doing"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 208
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "DOING_DOWNLOAD"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    return-void

    .line 212
    :cond_3
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureStatusDownloadDoing"

    const-string v2, "doing"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    new-instance v5, Lo/dub;

    sget-object v0, Lo/due;->a:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/dub;-><init>(Landroid/content/Context;)V

    .line 214
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v6

    .line 215
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 216
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    .line 218
    :cond_4
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/due$1;

    invoke-direct {v1, p0, p1, v6, v5}, Lo/due$1;-><init>(Lo/due;Ljava/lang/String;Lo/dwr;Lo/dub;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 232
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 233
    return-void
.end method

.method public d()V
    .locals 7

    .line 135
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "enter downTextureRes"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureDownload"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 137
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "medalZipDelete"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 138
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    new-instance v5, Lo/dub;

    sget-object v0, Lo/due;->a:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/dub;-><init>(Landroid/content/Context;)V

    .line 140
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    .line 143
    :cond_0
    iget-object v0, p0, Lo/due;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/due$3;

    invoke-direct {v1, p0, v5}, Lo/due$3;-><init>(Lo/due;Lo/dub;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 152
    :cond_1
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->o(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    .line 154
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "getNetEnvironment is not WIFI"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    return-void

    .line 157
    :cond_2
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "clearMedalResCache"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 158
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 159
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "clearCache is done!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    return-void

    .line 162
    :cond_3
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureStatusDownloadDoing"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 163
    const-string v0, "doing"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 164
    sget-object v0, Lo/due;->a:Landroid/content/Context;

    const-string v1, "_medalTextureStatusDownloadDoing"

    const-string v2, "doing"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    invoke-direct {p0}, Lo/due;->b()V

    .line 167
    :cond_4
    return-void
.end method

.method public d(Lo/dwr;)V
    .locals 0

    .line 95
    if-eqz p1, :cond_0

    .line 96
    iput-object p1, p0, Lo/due;->b:Lo/dwr;

    .line 98
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    .line 91
    iget-object v0, p0, Lo/due;->b:Lo/dwr;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

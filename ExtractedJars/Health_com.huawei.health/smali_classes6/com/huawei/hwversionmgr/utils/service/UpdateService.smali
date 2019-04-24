.class public Lcom/huawei/hwversionmgr/utils/service/UpdateService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lo/dpi;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:I

.field private k:I

.field private l:I

.field private m:Ljava/lang/String;

.field private n:I

.field private o:Ljava/util/concurrent/ExecutorService;

.field private p:Lo/dpb;

.field private q:Lo/dps;

.field private r:Lo/dps;

.field private final s:Landroid/content/BroadcastReceiver;

.field private t:Lo/dpq;

.field private u:Lo/dpq;

.field private v:Lo/dpp;

.field private x:Lo/dpp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c:Ljava/lang/String;

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e:I

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k:I

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->h:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g:Ljava/lang/String;

    .line 60
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f:I

    .line 63
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    .line 65
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n:I

    .line 67
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    .line 240
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$3;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s:Landroid/content/BroadcastReceiver;

    .line 320
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$1;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->r:Lo/dps;

    .line 404
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$2;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->q:Lo/dps;

    .line 495
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$5;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$5;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->t:Lo/dpq;

    .line 537
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$10;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$10;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->u:Lo/dpq;

    .line 674
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$9;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$9;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->v:Lo/dpp;

    .line 702
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$6;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->x:Lo/dpp;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpi;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 591
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchChangeLogForBand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    const/16 v0, 0x1e

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 593
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->u:Lo/dpq;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->c(Lo/dpq;Ljava/lang/Boolean;)V

    .line 594
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 271
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoAppCheckNewVersion = telephIMEI"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 273
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoAppCheckNewVersion = strLastTime"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    const/4 v0, -0x1

    invoke-static {v4, v0}, Lo/dpk;->e(Ljava/lang/String;I)Z

    move-result v5

    .line 275
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoAppCheckNewVersion = alreadyCheck"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    if-nez v5, :cond_0

    .line 277
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->r:Lo/dps;

    invoke-virtual {v0, p1, v1}, Lo/dpi;->b(Ljava/lang/String;Lo/dps;)V

    .line 278
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    goto :goto_0

    .line 280
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->stopSelf()V

    .line 282
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpp;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->x:Lo/dpp;

    return-object v0
.end method

.method private b(Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 6

    .line 202
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportStatus isApp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isSuccess: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o:Ljava/util/concurrent/ExecutorService;

    .line 206
    :cond_1
    new-instance v4, Lo/doz;

    invoke-direct {v4}, Lo/doz;-><init>()V

    .line 207
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 208
    const/4 v0, 0x3

    iput v0, v4, Lo/doz;->e:I

    goto :goto_0

    .line 210
    :cond_2
    const/4 v0, 0x4

    iput v0, v4, Lo/doz;->e:I

    .line 212
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpm;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/doz;->b:Ljava/lang/String;

    .line 213
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 214
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->c:Ljava/lang/String;

    iput-object v0, v4, Lo/doz;->a:Ljava/lang/String;

    goto :goto_1

    .line 215
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 216
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->c:Ljava/lang/String;

    iput-object v0, v4, Lo/doz;->a:Ljava/lang/String;

    .line 218
    :cond_4
    :goto_1
    invoke-static {}, Lo/dpm;->h()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/doz;->c:Ljava/lang/String;

    .line 220
    const-string v0, ""

    iput-object v0, v4, Lo/doz;->d:Ljava/lang/String;

    .line 221
    new-instance v5, Lo/dpw;

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-direct {v5, v0, v4, v1}, Lo/dpw;-><init>(Landroid/content/Context;Lo/doz;Z)V

    .line 222
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v5}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 223
    return-void
.end method

.method private b()Z
    .locals 9

    .line 617
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter checkMd5 mReportSuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    const-string v5, ""

    .line 619
    const-string v6, ""

    .line 620
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    if-nez v0, :cond_1

    .line 621
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    invoke-virtual {v0}, Lo/dpb;->k()Ljava/lang/String;

    move-result-object v6

    .line 622
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget-object v5, v0, Lo/doy;->u:Ljava/lang/String;

    goto :goto_0

    .line 624
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    invoke-virtual {v0}, Lo/dpb;->h()Ljava/lang/String;

    move-result-object v6

    .line 625
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget-object v5, v0, Lo/doy;->u:Ljava/lang/String;

    .line 627
    :goto_0
    invoke-static {v6}, Lo/dpn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 628
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 629
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "srcMd5="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,path="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " file exists:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " file size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    const/4 v0, 0x0

    if-ne v0, v5, :cond_6

    .line 631
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verify md5 srcMd5 is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 633
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    invoke-static {v0}, Lo/dpr;->d(Lo/dpb;)V

    .line 635
    :cond_3
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 636
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    invoke-static {v0}, Lo/dpr;->c(Lo/dpb;)V

    .line 638
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 640
    :cond_6
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 641
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "verify md5 success  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 642
    const/4 v0, 0x1

    return v0

    .line 644
    :cond_7
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "verify md5 failed  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    if-eqz v0, :cond_8

    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    .line 646
    :cond_8
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    invoke-static {v0}, Lo/dpr;->d(Lo/dpb;)V

    .line 648
    :cond_9
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_b

    .line 649
    :cond_a
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    invoke-static {v0}, Lo/dpr;->c(Lo/dpb;)V

    .line 651
    :cond_b
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/BroadcastReceiver;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s:Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 5

    .line 226
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerReceiver mGetPhoneBatteryReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f:I

    .line 229
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 231
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    goto :goto_0

    .line 232
    :catch_0
    move-exception v4

    .line 233
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    :cond_0
    :goto_0
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 238
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->f:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;I)I
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 4

    .line 584
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchChangeLog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    const/16 v0, 0x1e

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 586
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->t:Lo/dpq;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->c(Lo/dpq;Ljava/lang/Boolean;)V

    .line 587
    return-void
.end method

.method private d(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 299
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    new-instance v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;

    invoke-direct {v1, p0, p3}, Lcom/huawei/hwversionmgr/utils/service/UpdateService$4;-><init>(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/dpi;->a(ILjava/lang/String;Ljava/lang/String;Lo/dps;)V

    .line 315
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;Z)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Ljava/lang/String;Z)V

    return-void
.end method

.method private d(Ljava/lang/Boolean;)V
    .locals 5

    .line 597
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 598
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    goto :goto_0

    .line 600
    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    .line 603
    :goto_0
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    invoke-static {v0, v1}, Lo/dpr;->d(ILo/dpb;)Z

    move-result v4

    .line 604
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadFile: newVersionExist = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isAPP:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    if-eqz v4, :cond_2

    .line 606
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 607
    const/16 v0, 0x17

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    goto :goto_1

    .line 609
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e()V

    goto :goto_1

    .line 611
    :cond_2
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e()V

    .line 613
    :goto_1
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 657
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 658
    :cond_0
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoDownload download url is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->n()Lo/doy;

    move-result-object v4

    .line 661
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoDownload  new version"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v3

    invoke-virtual {v3}, Lo/dpb;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    .line 664
    invoke-static {v0}, Lo/dpk;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 665
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v4, Lo/doy;->s:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 666
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoDownload check success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    invoke-static {v4}, Lo/dpm;->d(Lo/doy;)V

    .line 671
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->v:Lo/dpp;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->d(Lo/dpp;Ljava/lang/Boolean;)V

    .line 672
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->l:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/hwversionmgr/utils/service/UpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->h:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 2

    .line 697
    const/16 v0, 0x14

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 699
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c()V

    .line 700
    return-void
.end method

.method private e(ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 285
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoBandCheckNewVersion = type"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+macAddress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 287
    invoke-static {v4, p1}, Lo/dpk;->e(Ljava/lang/String;I)Z

    move-result v5

    .line 288
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " alreadyCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    if-nez v5, :cond_0

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpr;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 290
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->q:Lo/dps;

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/dpi;->a(ILjava/lang/String;Ljava/lang/String;Lo/dps;)V

    .line 291
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n:I

    goto :goto_0

    .line 293
    :cond_0
    const/16 v0, 0xb

    invoke-static {v0}, Lo/dpr;->e(I)V

    .line 296
    :goto_0
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 8

    .line 113
    if-nez p1, :cond_0

    .line 114
    return-void

    .line 116
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 117
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleIntent: action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, "action_app_auto_check_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 119
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 120
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion telephIMEI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const-string v0, ""

    invoke-static {v5, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can not get phone imei ,cancel autocheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void

    .line 125
    :cond_1
    invoke-direct {p0, v5}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a(Ljava/lang/String;)V

    .line 126
    goto/16 :goto_0

    :cond_2
    const-string v0, "action_band_auto_check_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 127
    const-string v0, "extra_band_type"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 128
    const-string v0, "extra_band_version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 129
    const-string v0, "extra_band_imei"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->m:Ljava/lang/String;

    .line 130
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion bandVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion bandIMEI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v0, -0x1

    if-eq v5, v0, :cond_3

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 134
    :cond_3
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bandVersion or bandIMEI is invalid!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 137
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->m:Ljava/lang/String;

    invoke-direct {p0, v5, v6, v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(ILjava/lang/String;Ljava/lang/String;)V

    .line 138
    goto/16 :goto_0

    :cond_5
    const-string v0, "action_app_manual_update_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 139
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    .line 140
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 141
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion telephIMEI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->r:Lo/dps;

    invoke-static {v5, v0, v1}, Lo/dpr;->d(Ljava/lang/String;Lo/dpi;Lo/dps;)V

    .line 143
    goto/16 :goto_0

    :cond_6
    const-string v0, "action_band_manual_update_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 144
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n:I

    .line 145
    const-string v0, "extra_band_type"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 146
    const-string v0, "extra_band_version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 147
    const-string v0, "extra_band_imei"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 148
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion bandVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion bandIMEI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->q:Lo/dps;

    invoke-static {v5, v6, v7, v0, v1}, Lo/dpr;->d(ILjava/lang/String;Ljava/lang/String;Lo/dpi;Lo/dps;)V

    .line 152
    goto/16 :goto_0

    :cond_7
    const-string v0, "action_band_check_new_version_to_activate"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 154
    const-string v0, "extra_band_type"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 155
    const-string v0, "extra_band_version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 156
    const-string v0, "extra_band_imei"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 157
    const/4 v0, -0x1

    if-eq v5, v0, :cond_8

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 158
    :cond_8
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bandVersion or bandIMEI is invalid!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-void

    .line 161
    :cond_9
    invoke-direct {p0, v5, v6, v7}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(ILjava/lang/String;Ljava/lang/String;)V

    .line 162
    goto :goto_0

    :cond_a
    const-string v0, "action_app_download_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 163
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 164
    :cond_b
    const-string v0, "action_app_auto_download"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 165
    const-string v0, "action_band_auto_download_identify"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 166
    const-string v0, "action_band_auto_download_mac"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 167
    invoke-direct {p0, v5, v6}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    goto :goto_0

    .line 169
    :cond_c
    invoke-direct {p0, v4}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Ljava/lang/String;)V

    .line 171
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 175
    const-string v0, "action_band_download_new_version"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d(Ljava/lang/Boolean;)V

    goto/16 :goto_0

    .line 181
    :cond_0
    const-string v0, "action_app_install_new_version"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    invoke-static {v0, v1, v2}, Lo/dpr;->e(Landroid/content/Context;Lo/dpb;Lo/dpi;)V

    goto/16 :goto_0

    .line 183
    :cond_1
    const-string v0, "action_cancel_download_app"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 184
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel download app!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    invoke-virtual {v0}, Lo/dpi;->e()V

    goto :goto_0

    .line 186
    :cond_2
    const-string v0, "action_app_update_success"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 188
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 189
    :cond_3
    const-string v0, "action_app_update_failed"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 191
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 192
    :cond_4
    const-string v0, "action_band_update_success"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 194
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 195
    :cond_5
    const-string v0, "action_band_update_failed"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 197
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 199
    :cond_6
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;Z)V
    .locals 5

    .line 486
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "broadcastActivateResult: activated = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action_band_psi_activated"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 488
    const/high16 v0, 0x60000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 489
    const-string v0, "macAddress"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 490
    const-string v0, "activated"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 491
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 492
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 493
    return-void
.end method

.method static synthetic f(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Landroid/content/Context;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->i:I

    return v0
.end method

.method static synthetic h(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->k:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->n:I

    return v0
.end method

.method static synthetic p(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e:I

    return v0
.end method

.method static synthetic s(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)Lo/dpb;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/hwversionmgr/utils/service/UpdateService;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->a()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 76
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 81
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 82
    invoke-virtual {p0}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    .line 83
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v0, Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dpi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->b:Lo/dpi;

    .line 85
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->p:Lo/dpb;

    .line 86
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .line 90
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 91
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 94
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_0

    .line 95
    :catch_0
    move-exception v4

    .line 96
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->o:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 102
    :cond_1
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 106
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 107
    const-string v0, "UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStartCommand: intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-direct {p0, p1}, Lcom/huawei/hwversionmgr/utils/service/UpdateService;->e(Landroid/content/Intent;)V

    .line 109
    const/4 v0, 0x2

    return v0
.end method

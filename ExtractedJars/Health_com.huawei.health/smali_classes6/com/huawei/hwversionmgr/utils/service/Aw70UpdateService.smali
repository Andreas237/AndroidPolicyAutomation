.class public Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private a:Lo/dpi;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private m:Lo/dps;

.field private o:Lo/dpq;

.field private p:Lo/dpp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b:Landroid/content/Context;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a:Lo/dpi;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->e:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d:Ljava/lang/String;

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->h:I

    .line 50
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g:I

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->f:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->i:I

    .line 57
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->k:I

    .line 135
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;-><init>(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->m:Lo/dps;

    .line 269
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$4;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$4;-><init>(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->p:Lo/dpp;

    .line 301
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$2;-><init>(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->o:Lo/dpq;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->k:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;I)I
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->h:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 4

    .line 211
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchChangeLogForBand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const/16 v0, 0x1e

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 213
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->o:Lo/dpq;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->b(Lo/dpq;Ljava/lang/Boolean;)V

    .line 214
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;I)I
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d:Ljava/lang/String;

    return-object v0
.end method

.method private b()Z
    .locals 9

    .line 233
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter checkMd5 mReportSuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const-string v5, ""

    .line 235
    const-string v6, ""

    .line 236
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->a()Ljava/lang/String;

    move-result-object v6

    .line 237
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    iget-object v5, v0, Lo/doy;->u:Ljava/lang/String;

    .line 238
    invoke-static {v6}, Lo/dpn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 239
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 240
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 241
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 240
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 243
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verify md5 srcMd5 is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->e()V

    .line 249
    const/4 v0, 0x0

    return v0

    .line 251
    :cond_0
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 253
    const/4 v0, 0x1

    return v0

    .line 255
    :cond_1
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 260
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->e()V

    .line 261
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->e:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 3

    .line 266
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->p:Lo/dpp;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->c(Lo/dpp;Ljava/lang/Boolean;)V

    .line 267
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->f:Ljava/lang/String;

    return-object p1
.end method

.method private d(ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 122
    const-string v0, "AW70_Aw70UpdateService"

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

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 124
    invoke-static {v4, p1}, Lo/dpk;->e(Ljava/lang/String;I)Z

    move-result v5

    .line 125
    if-nez v5, :cond_0

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpr;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->m:Lo/dps;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dps;->d(Z)V

    .line 127
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->m:Lo/dps;

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/dpi;->a(ILjava/lang/String;Ljava/lang/String;Lo/dps;)V

    .line 128
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->k:I

    .line 132
    :cond_0
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 8

    .line 87
    if-nez p1, :cond_0

    .line 88
    return-void

    .line 90
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 91
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 93
    const-string v0, "action_AW70_band_manual_update_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->k:I

    .line 95
    const-string v0, "extra_band_type"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 96
    const-string v0, "extra_band_version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 97
    const-string v0, "extra_band_imei"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 98
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 99
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 100
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 102
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->m:Lo/dps;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dps;->d(Z)V

    .line 103
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->m:Lo/dps;

    invoke-virtual {v0, v5, v6, v7, v1}, Lo/dpi;->a(ILjava/lang/String;Ljava/lang/String;Lo/dps;)V

    .line 104
    goto/16 :goto_0

    :cond_1
    const-string v0, "action_AW70_band_auto_check_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 105
    const-string v0, "extra_band_type"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 106
    const-string v0, "extra_band_version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 107
    const-string v0, "extra_band_imei"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c:Ljava/lang/String;

    .line 108
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 109
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 110
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion bandIMEI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const/4 v0, -0x1

    if-eq v5, v0, :cond_2

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 112
    :cond_2
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bandVersion or bandIMEI is invalid!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-void

    .line 115
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c:Ljava/lang/String;

    invoke-direct {p0, v5, v6, v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(ILjava/lang/String;Ljava/lang/String;)V

    .line 116
    goto :goto_0

    :cond_4
    const-string v0, "action_band_download_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 117
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->e()V

    .line 119
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->e:Ljava/lang/String;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 217
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g:I

    .line 219
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g:I

    invoke-static {v0}, Lo/dpr;->a(I)Z

    move-result v4

    .line 220
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadFile: newVersionExist = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    if-eqz v4, :cond_1

    .line 222
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    const/16 v0, 0x17

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    goto :goto_0

    .line 225
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c()V

    goto :goto_0

    .line 228
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c()V

    .line 230
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->h:I

    return v0
.end method

.method static synthetic g(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->i:I

    return v0
.end method

.method static synthetic h(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 61
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 66
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 67
    invoke-virtual {p0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b:Landroid/content/Context;

    .line 68
    new-instance v0, Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dpi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a:Lo/dpi;

    .line 69
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 82
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 83
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 74
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 75
    const-string v0, "AW70_Aw70UpdateService"

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

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Landroid/content/Intent;)V

    .line 77
    const/4 v0, 0x2

    return v0
.end method

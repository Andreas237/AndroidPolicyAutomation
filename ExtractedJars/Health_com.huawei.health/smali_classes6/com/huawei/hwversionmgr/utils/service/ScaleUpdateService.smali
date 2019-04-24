.class public Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Lo/dpi;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:Lo/dpq;

.field private o:Lo/dps;

.field private p:Lo/dpp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d:Landroid/content/Context;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e:Lo/dpi;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b:Ljava/lang/String;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c:Ljava/lang/String;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a:I

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->h:I

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->k:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->f:Ljava/lang/String;

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->i:I

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->g:I

    .line 48
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->m:I

    .line 123
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$1;-><init>(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->p:Lo/dpp;

    .line 189
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;-><init>(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->o:Lo/dps;

    .line 272
    new-instance v0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$4;

    invoke-direct {v0, p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$4;-><init>(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->n:Lo/dpq;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->m:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;I)I
    .locals 0

    .line 32
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->k:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 5

    .line 104
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->g:I

    .line 106
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->g:I

    invoke-static {v0}, Lo/dpr;->b(I)Z

    move-result v4

    .line 107
    const-string v0, "Scale_ScaleUpdateService"

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

    .line 108
    if-eqz v4, :cond_1

    .line 109
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    const/16 v0, 0x17

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    goto :goto_0

    .line 112
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e()V

    goto :goto_0

    .line 115
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e()V

    .line 117
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 7

    .line 73
    if-nez p1, :cond_0

    .line 74
    return-void

    .line 76
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 77
    const-string v0, "Scale_ScaleUpdateService"

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

    .line 79
    const-string v0, "action_scale_check_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->m:I

    .line 81
    const-string v0, "extra_band_version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 82
    const-string v0, "scale_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->l:Ljava/lang/String;

    .line 83
    const-string v0, "scale_mac_address"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 84
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion bandVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion deviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->l:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e:Lo/dpi;

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->o:Lo/dps;

    invoke-static {v0, v5, v1, v2, v6}, Lo/dpr;->a(Ljava/lang/String;Ljava/lang/String;Lo/dpi;Lo/dps;Ljava/lang/String;)V

    .line 87
    goto/16 :goto_0

    :cond_1
    const-string v0, "action_scale_auto_check_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->m:I

    .line 89
    const-string v0, "extra_band_version"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 90
    const-string v0, "scale_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->l:Ljava/lang/String;

    .line 91
    const-string v0, "scale_mac_address"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 92
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion bandVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkNewVersion deviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->l:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e:Lo/dpi;

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->o:Lo/dps;

    invoke-static {v0, v5, v1, v2, v6}, Lo/dpr;->a(Ljava/lang/String;Ljava/lang/String;Lo/dpi;Lo/dps;Ljava/lang/String;)V

    .line 95
    goto :goto_0

    :cond_2
    const-string v0, "action_scale_download_new_version"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 96
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a()V

    goto :goto_0

    .line 97
    :cond_3
    const-string v0, "action_cancel_download_app"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 98
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel download app!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e:Lo/dpi;

    invoke-virtual {v0}, Lo/dpi;->e()V

    .line 101
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;I)I
    .locals 0

    .line 32
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->g:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b:Ljava/lang/String;

    return-object p1
.end method

.method private b()Z
    .locals 9

    .line 157
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter checkMd5 mReportSuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const-string v5, ""

    .line 159
    const-string v6, ""

    .line 160
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->e()Ljava/lang/String;

    move-result-object v6

    .line 161
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    iget-object v5, v0, Lo/doy;->u:Ljava/lang/String;

    .line 162
    invoke-static {v6}, Lo/dpn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 163
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 164
    const-string v0, "Scale_ScaleUpdateService"

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

    .line 165
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 166
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verify md5 srcMd5 is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->a()V

    .line 171
    const/4 v0, 0x0

    return v0

    .line 173
    :cond_0
    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    const-string v0, "Scale_ScaleUpdateService"

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

    .line 175
    const/4 v0, 0x1

    return v0

    .line 177
    :cond_1
    const-string v0, "Scale_ScaleUpdateService"

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

    .line 181
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->a()V

    .line 182
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->g:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 4

    .line 265
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchChangeLogForBand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    const/16 v0, 0x33

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dpr;->c(II)V

    .line 267
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->n:Lo/dpq;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->a(Lo/dpq;Ljava/lang/Boolean;)V

    .line 268
    return-void
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->f:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;I)I
    .locals 0

    .line 32
    iput p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->h:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 120
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e:Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->p:Lo/dpp;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpi;->b(Lo/dpp;Ljava/lang/Boolean;)V

    .line 121
    return-void
.end method

.method static synthetic f(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->h:I

    return v0
.end method

.method static synthetic g(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->l:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 53
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 58
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 59
    invoke-virtual {p0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d:Landroid/content/Context;

    .line 60
    new-instance v0, Lo/dpi;

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dpi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e:Lo/dpi;

    .line 61
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 66
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 67
    const-string v0, "Scale_ScaleUpdateService"

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

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Landroid/content/Intent;)V

    .line 69
    const/4 v0, 0x2

    return v0
.end method

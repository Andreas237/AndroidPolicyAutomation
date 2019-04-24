.class public Lo/dpb;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static a:Lo/dpb;


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const/4 v0, 0x0

    sput-object v0, Lo/dpb;->a:Lo/dpb;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 29
    iput-object p1, p0, Lo/dpb;->d:Landroid/content/Context;

    .line 30
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/dpb;
    .locals 2

    .line 34
    sget-object v0, Lo/dpb;->a:Lo/dpb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 35
    new-instance v0, Lo/dpb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dpb;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dpb;->a:Lo/dpb;

    .line 37
    :cond_0
    sget-object v0, Lo/dpb;->a:Lo/dpb;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 103
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadPackage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dpb;->c(Ljava/lang/Boolean;)V

    .line 109
    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 82
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkBandNewVersionToActivate.macAddress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    const-string v0, "action_band_check_new_version_to_activate"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    const-string v0, "extra_band_type"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 86
    const-string v0, "extra_band_version"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    const-string v0, "extra_band_imei"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 89
    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 5

    .line 64
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkBandNewVersionService isAuto"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 66
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    const-string v0, "action_band_auto_check_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 69
    :cond_0
    const-string v0, "action_band_manual_update_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 71
    :goto_0
    const-string v0, "extra_band_type"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 72
    const-string v0, "extra_band_version"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    const-string v0, "extra_band_imei"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 75
    return-void
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 5

    .line 50
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkAppNewVersionService"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    const-string v0, "action_app_auto_check_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 55
    :cond_0
    const-string v0, "action_app_manual_update_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    :goto_0
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 58
    return-void
.end method

.method public a(Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 5

    .line 324
    const-string v0, "HWVersionManager"

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

    .line 325
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 326
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 327
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    const-string v0, "action_app_update_success"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 330
    :cond_0
    const-string v0, "action_app_update_failed"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 333
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 334
    const-string v0, "action_band_update_success"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 336
    :cond_2
    const-string v0, "action_band_update_failed"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 339
    :goto_0
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 340
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 251
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpk;->g(Ljava/lang/String;Landroid/content/Context;)V

    .line 252
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 136
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoDownloadPackage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 138
    const-string v0, "action_app_auto_download"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 139
    const-string v0, "action_band_auto_download_identify"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 140
    const-string v0, "action_band_auto_download_mac"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 142
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 150
    invoke-static {p1}, Lo/dpk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 5

    .line 127
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelDownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 129
    const-string v0, "action_cancel_download_app"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 131
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 389
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpk;->m(Ljava/lang/String;Landroid/content/Context;)V

    .line 390
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p2, v0}, Lo/dpk;->n(Ljava/lang/String;Landroid/content/Context;)V

    .line 391
    return-void
.end method

.method public b(Lo/doy;Ljava/lang/String;)V
    .locals 1

    .line 421
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lo/dpk;->e(Landroid/content/Context;Lo/doy;Ljava/lang/String;)V

    .line 422
    return-void
.end method

.method public c(Ljava/lang/Boolean;)V
    .locals 5

    .line 114
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadPackage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 116
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    const-string v0, "action_app_download_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 119
    :cond_0
    const-string v0, "action_band_download_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    :goto_0
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 122
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 259
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpk;->h(Ljava/lang/String;Landroid/content/Context;)V

    .line 260
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 353
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpk;->o(Ljava/lang/String;Landroid/content/Context;)V

    .line 354
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p2, v0}, Lo/dpk;->p(Ljava/lang/String;Landroid/content/Context;)V

    .line 355
    return-void
.end method

.method public c()Z
    .locals 7

    .line 192
    const/4 v4, 0x0

    .line 193
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 194
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "haveNewBandVersion: newVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    return v4

    .line 198
    :cond_0
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 199
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "haveNewBandVersion: version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 201
    const/4 v4, 0x1

    .line 203
    :cond_1
    return v4
.end method

.method public d(Ljava/lang/Boolean;)V
    .locals 2

    .line 398
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lo/dpk;->a(Landroid/content/Context;Z)V

    .line 399
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 283
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpk;->f(Ljava/lang/String;Landroid/content/Context;)V

    .line 284
    return-void
.end method

.method public d()Z
    .locals 9

    .line 158
    const/4 v4, 0x0

    .line 159
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 160
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "haveNewAppVersion: newVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    return v4

    .line 164
    :cond_0
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->e(Landroid/content/Context;)I

    move-result v6

    .line 165
    invoke-static {v5}, Lo/dbf;->b(Ljava/lang/String;)I

    move-result v7

    .line 167
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 168
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "haveNewAppVersion: newVersionName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const-string v0, "Beta"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 171
    return v4

    .line 174
    :cond_1
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 175
    return v4

    .line 178
    :cond_2
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "haveNewAppVersion: newCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    if-lt v6, v7, :cond_3

    .line 180
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpk;->a(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 182
    :cond_3
    const/4 v4, 0x1

    .line 184
    :goto_0
    return v4
.end method

.method public e(Ljava/lang/Boolean;)V
    .locals 2

    .line 347
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lo/dpk;->e(Landroid/content/Context;Z)V

    .line 348
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 271
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpk;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 272
    return-void
.end method

.method public e()Z
    .locals 7

    .line 210
    const-string v4, ""

    .line 211
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 212
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewVersionFileExist() error, file path is empty..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/4 v0, 0x0

    return v0

    .line 216
    :cond_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    .line 218
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNewVersionFileExist: bExist = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    return v6
.end method

.method public f(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 375
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->p(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 376
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 377
    :cond_0
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 378
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 380
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 4

    .line 238
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getCheckNewBandVersion "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 362
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->p(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 363
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 364
    :cond_0
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 365
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 367
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public g()V
    .locals 1

    .line 232
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->l(Landroid/content/Context;)V

    .line 233
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 42
    const/16 v0, 0x3eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 265
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    .line 295
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpk;->i(Ljava/lang/String;Landroid/content/Context;)V

    .line 296
    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/String;)Z
    .locals 3

    .line 406
    const/4 v1, 0x0

    .line 407
    invoke-virtual {p0}, Lo/dpb;->i()Ljava/lang/String;

    move-result-object v2

    .line 409
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->u(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 410
    const/4 v0, 0x1

    return v0

    .line 412
    :cond_0
    return v1
.end method

.method public l()V
    .locals 4

    .line 310
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetBandUpdateForEnd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    invoke-virtual {p0}, Lo/dpb;->g()V

    .line 312
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dpk;->c(Landroid/content/Context;Z)V

    .line 313
    const-string v0, ""

    iget-object v1, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpk;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 314
    const-string v0, ""

    iget-object v1, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpk;->k(Ljava/lang/String;Landroid/content/Context;)V

    .line 315
    const-string v0, ""

    iget-object v1, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpk;->f(Ljava/lang/String;Landroid/content/Context;)V

    .line 316
    return-void
.end method

.method public m()V
    .locals 4

    .line 305
    const-string v0, "HWVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetBandUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-virtual {p0}, Lo/dpb;->g()V

    .line 307
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->x(Landroid/content/Context;)V

    .line 308
    return-void
.end method

.method public n()Lo/doy;
    .locals 1

    .line 429
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->t(Landroid/content/Context;)Lo/doy;

    move-result-object v0

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 289
    iget-object v0, p0, Lo/dpb;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

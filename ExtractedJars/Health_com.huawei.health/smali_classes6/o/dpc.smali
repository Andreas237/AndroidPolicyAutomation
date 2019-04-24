.class public Lo/dpc;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dpc$c;
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 28
    iput-object p1, p0, Lo/dpc;->c:Landroid/content/Context;

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lo/dpc$2;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lo/dpc;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static d()Lo/dpc;
    .locals 1

    .line 36
    invoke-static {}, Lo/dpc$c;->a()Lo/dpc;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 84
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->e(Landroid/content/Context;)V

    .line 85
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 5

    .line 48
    const-string v0, "Scale_HWScaleVersionManager"

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

    .line 49
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 50
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    const-string v0, "action_scale_auto_check_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 53
    :cond_0
    const-string v0, "action_scale_check_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    :goto_0
    const-string v0, "scale_name"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    const-string v0, "scale_mac_address"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    const-string v0, "extra_band_version"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 59
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpl;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 104
    return-void
.end method

.method public b()Z
    .locals 7

    .line 66
    const/4 v4, 0x0

    .line 67
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 68
    const-string v0, "Scale_HWScaleVersionManager"

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

    .line 69
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    return v4

    .line 72
    :cond_0
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 73
    const-string v0, "Scale_HWScaleVersionManager"

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

    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 75
    const/4 v4, 0x1

    .line 77
    :cond_1
    return v4
.end method

.method public c()Ljava/lang/String;
    .locals 4

    .line 90
    const-string v0, "Scale_HWScaleVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getCheckNewBandVersion "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Boolean;)V
    .locals 5

    .line 144
    const-string v0, "Scale_HWScaleVersionManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reportStatus isApp isSuccess =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 146
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    const-string v0, "action_band_update_success"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 149
    :cond_0
    const-string v0, "action_band_update_failed"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 151
    :goto_0
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 152
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 124
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpl;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 125
    return-void
.end method

.method public f()V
    .locals 4

    .line 180
    const-string v0, "Scale_HWScaleVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetBandUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-virtual {p0}, Lo/dpc;->a()V

    .line 182
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->i(Landroid/content/Context;)V

    .line 183
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 41
    const/16 v0, 0x3eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 5

    .line 189
    const-string v0, "Scale_HWScaleVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadPackage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 191
    const-string v0, "action_scale_download_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 192
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 193
    return-void
.end method

.method public i()V
    .locals 1

    .line 208
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->e(Landroid/content/Context;)V

    .line 209
    return-void
.end method

.method public k()V
    .locals 5

    .line 198
    const-string v0, "Scale_HWScaleVersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelDownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 200
    const-string v0, "action_cancel_download_app"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 201
    iget-object v0, p0, Lo/dpc;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 202
    return-void
.end method

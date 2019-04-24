.class public Lo/dpa;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dpa$c;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 306
    const-string v0, ""

    iput-object v0, p0, Lo/dpa;->d:Ljava/lang/String;

    .line 29
    iput-object p1, p0, Lo/dpa;->b:Landroid/content/Context;

    .line 30
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lo/dpa$2;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lo/dpa;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static c()Lo/dpa;
    .locals 1

    .line 37
    invoke-static {}, Lo/dpa$c;->c()Lo/dpa;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 138
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpg;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 139
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 4

    .line 104
    const-string v0, "AW70_HWAW70VersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getCheckNewBandVersion "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 5

    .line 158
    const-string v0, "AW70_HWAW70VersionManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reportStatus isApp isSuccess =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 160
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const-string v0, "action_band_update_success"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 163
    :cond_0
    const-string v0, "action_band_update_failed"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 165
    :goto_0
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 166
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpg;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 126
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 281
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpg;->f(Ljava/lang/String;Landroid/content/Context;)V

    .line 282
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {p2, v0}, Lo/dpg;->k(Ljava/lang/String;Landroid/content/Context;)V

    .line 283
    return-void
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 267
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 269
    :cond_0
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 270
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 272
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 245
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpg;->i(Ljava/lang/String;Landroid/content/Context;)V

    .line 246
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {p2, v0}, Lo/dpg;->g(Ljava/lang/String;Landroid/content/Context;)V

    .line 247
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 254
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 255
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 256
    :cond_0
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 257
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 259
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 5

    .line 49
    const-string v0, "AW70_HWAW70VersionManager"

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

    .line 50
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 51
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    const-string v0, "action_AW70_band_auto_check_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 54
    :cond_0
    const-string v0, "action_AW70_band_manual_update_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    :goto_0
    const-string v0, "extra_band_type"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 57
    const-string v0, "extra_band_version"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    const-string v0, "extra_band_imei"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 60
    return-void
.end method

.method public d(Ljava/lang/Boolean;)V
    .locals 2

    .line 239
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lo/dpg;->a(Landroid/content/Context;Z)V

    .line 240
    return-void
.end method

.method public d()Z
    .locals 7

    .line 80
    const/4 v4, 0x0

    .line 81
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 82
    const-string v0, "AW70_HWAW70VersionManager"

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

    .line 83
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    return v4

    .line 86
    :cond_0
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 87
    const-string v0, "AW70_HWAW70VersionManager"

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

    .line 88
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 89
    const/4 v4, 0x1

    .line 91
    :cond_1
    return v4
.end method

.method public e()V
    .locals 1

    .line 98
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->a(Landroid/content/Context;)V

    .line 99
    return-void
.end method

.method public e(Ljava/lang/Boolean;)V
    .locals 2

    .line 290
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lo/dpg;->d(Landroid/content/Context;Z)V

    .line 291
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lo/dpg;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 118
    return-void
.end method

.method public g()V
    .locals 5

    .line 212
    const-string v0, "AW70_HWAW70VersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadPackage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 214
    const-string v0, "action_band_download_new_version"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 215
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 216
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

.method public h()V
    .locals 4

    .line 199
    const-string v0, "AW70_HWAW70VersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetBandUpdateForEnd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-virtual {p0}, Lo/dpa;->e()V

    .line 201
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dpg;->e(Landroid/content/Context;Z)V

    .line 202
    const-string v0, ""

    iget-object v1, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpg;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 203
    const-string v0, ""

    iget-object v1, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpg;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 204
    const-string v0, ""

    iget-object v1, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpg;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 205
    const-string v0, ""

    iget-object v1, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dpg;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 206
    return-void
.end method

.method public h(Ljava/lang/String;)Z
    .locals 3

    .line 298
    const/4 v1, 0x0

    .line 299
    invoke-virtual {p0}, Lo/dpa;->k()Ljava/lang/String;

    move-result-object v2

    .line 301
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 302
    const/4 v0, 0x1

    return v0

    .line 304
    :cond_0
    return v1
.end method

.method public i()V
    .locals 4

    .line 194
    const-string v0, "AW70_HWAW70VersionManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetBandUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    invoke-virtual {p0}, Lo/dpa;->e()V

    .line 196
    iget-object v0, p0, Lo/dpa;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->i(Landroid/content/Context;)V

    .line 197
    return-void
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 317
    iget-object v0, p0, Lo/dpa;->d:Ljava/lang/String;

    return-object v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lo/dpa;->d:Ljava/lang/String;

    .line 312
    return-void
.end method

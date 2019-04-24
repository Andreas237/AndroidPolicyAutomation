.class public Lo/ffx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lo/ffx;->d:Landroid/content/Context;

    .line 49
    return-void
.end method

.method static synthetic c(Lo/ffx;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lo/ffx;->e()V

    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 51
    new-instance v2, Lo/cbz;

    invoke-direct {v2}, Lo/cbz;-><init>()V

    .line 52
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.health.track.config"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 53
    const-string v0, "com.huawei.health"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    const-string v0, "autotrack_enable"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 56
    const-string v0, "stop_delay"

    invoke-virtual {v2}, Lo/cbz;->e()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 57
    const-string v0, "start_delay"

    invoke-virtual {v2}, Lo/cbz;->d()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 58
    iget-object v0, p0, Lo/ffx;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/ffx;->d:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 61
    :cond_0
    return-void
.end method

.method private e()V
    .locals 3

    .line 91
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 92
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 93
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 94
    const/16 v0, 0x4e20

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 95
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 96
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 97
    iget-object v0, p0, Lo/ffx;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 98
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 101
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 102
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 104
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/ffx;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 107
    return-void
.end method

.method public b(Lo/cmj;Lo/cfz;Ljava/lang/String;)V
    .locals 4

    .line 64
    if-nez p1, :cond_0

    .line 65
    const-string v0, "AppSetting"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDK is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    return-void

    .line 68
    :cond_0
    iget-object v0, p0, Lo/ffx;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 69
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->m()V

    .line 71
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/cfz;->b(I)V

    .line 72
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/cfz;->setVisibility(I)V

    .line 74
    new-instance v0, Lo/ffx$1;

    invoke-direct {v0, p0}, Lo/ffx$1;-><init>(Lo/ffx;)V

    invoke-virtual {p1, v0}, Lo/cmj;->b(Lo/cms;)V

    .line 88
    return-void
.end method

.method public b(ZLo/cbz;)V
    .locals 2

    .line 118
    if-eqz p2, :cond_1

    .line 120
    iget-object v0, p0, Lo/ffx;->d:Landroid/content/Context;

    invoke-virtual {p2, v0}, Lo/cbz;->c(Landroid/content/Context;)V

    .line 121
    if-eqz p1, :cond_0

    .line 122
    sget-object v0, Lo/dae;->dY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {p0, v0, v1}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/cbz;->c(Z)V

    goto :goto_0

    .line 125
    :cond_0
    sget-object v0, Lo/dae;->dY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-virtual {p0, v0, v1}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/cbz;->c(Z)V

    .line 128
    :goto_0
    iget-object v0, p0, Lo/ffx;->d:Landroid/content/Context;

    invoke-virtual {p2, v0}, Lo/cbz;->e(Landroid/content/Context;)V

    .line 129
    invoke-direct {p0, p1}, Lo/ffx;->c(Z)V

    .line 131
    :cond_1
    return-void
.end method

.method public e(Ljava/lang/String;)Z
    .locals 1

    .line 110
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 113
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

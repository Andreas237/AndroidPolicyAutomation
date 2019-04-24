.class Lo/dqi$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dqi;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Lo/dqi;


# direct methods
.method constructor <init>(Lo/dqi;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 514
    iput-object p1, p0, Lo/dqi$6;->e:Lo/dqi;

    iput-object p2, p0, Lo/dqi$6;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/dqi$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 521
    iget-object v0, p0, Lo/dqi$6;->e:Lo/dqi;

    const-string v1, "custom.wear_common_setting"

    invoke-virtual {v0, v1}, Lo/dqi;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 522
    iget-object v0, p0, Lo/dqi$6;->e:Lo/dqi;

    invoke-static {v0, v4}, Lo/dqi;->b(Lo/dqi;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v5

    .line 523
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 524
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 526
    :cond_0
    const-string v0, "heart_rate_button"

    iget-object v1, p0, Lo/dqi$6;->a:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    new-instance v6, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.wear_common_setting"

    .line 528
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 531
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.wear_common_setting"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 532
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 533
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "migrateHeartRateButton value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    iget-object v0, p0, Lo/dqi$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 536
    :cond_1
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateHeartRateButton null = userPreference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    iget-object v0, p0, Lo/dqi$6;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 539
    :goto_0
    return-void
.end method

.class Lo/dqi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dqi;->g(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lo/dqi;


# direct methods
.method constructor <init>(Lo/dqi;Ljava/lang/String;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lo/dqi$2;->d:Lo/dqi;

    iput-object p2, p0, Lo/dqi$2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 435
    iget-object v0, p0, Lo/dqi$2;->d:Lo/dqi;

    const-string v1, "custom.wear_common_setting"

    invoke-virtual {v0, v1}, Lo/dqi;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 436
    iget-object v0, p0, Lo/dqi$2;->d:Lo/dqi;

    invoke-static {v0, v4}, Lo/dqi;->b(Lo/dqi;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v5

    .line 437
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 438
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 440
    :cond_0
    const-string v0, "gps_files_switch_screen"

    iget-object v1, p0, Lo/dqi$2;->b:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    new-instance v6, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.wear_common_setting"

    .line 442
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GPSFile enter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 445
    return-void
.end method

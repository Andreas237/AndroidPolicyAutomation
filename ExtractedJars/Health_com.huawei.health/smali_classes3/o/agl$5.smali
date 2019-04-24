.class Lo/agl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agl;->b(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/agl;

.field final synthetic e:Lo/agk;


# direct methods
.method constructor <init>(Lo/agl;Lo/agk;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lo/agl$5;->b:Lo/agl;

    iput-object p2, p0, Lo/agl$5;->e:Lo/agk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 7

    .line 276
    move-object v4, p2

    .line 277
    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aga;

    .line 278
    if-eqz v5, :cond_0

    .line 279
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----heartRateData---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/aga;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    new-instance v6, Lo/agl$5$5;

    invoke-direct {v6, p0, p1}, Lo/agl$5$5;-><init>(Lo/agl$5;Lcom/huawei/hihealth/device/open/HealthDevice;)V

    .line 298
    invoke-virtual {v5}, Lo/aga;->c()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 299
    iget-object v0, p0, Lo/agl$5;->e:Lo/agk;

    invoke-virtual {v0, v6, v5}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 302
    :cond_0
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 317
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 307
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 4

    .line 311
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----heartRateData_onStatusChanged---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    return-void
.end method

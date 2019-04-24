.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IDeviceEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Lcom/huawei/hihealth/device/open/HealthDevice;)V
    .locals 0

    .line 342
    return-void
.end method

.method public onScanFailed(I)V
    .locals 0

    .line 347
    return-void
.end method

.method public onStateChanged(I)V
    .locals 10

    .line 351
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindWaitingUniversalFragment pair code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 353
    return-void

    .line 356
    :cond_0
    const/4 v0, 0x7

    if-ne v0, p1, :cond_8

    .line 357
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingUniversalFragment PAIRING_PASSED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 360
    const-string v0, "macAddress"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    const-string v0, "device_name"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    const-string v0, "device_type"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    sget-object v0, Lo/dae;->fI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 364
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 367
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lo/acl$a;)V

    .line 369
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->f()Z

    .line 371
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v6

    .line 375
    const-string v0, "01"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    .line 377
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    if-eqz v7, :cond_1

    .line 378
    new-instance v8, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;-><init>()V

    .line 379
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 380
    const-string v0, "view"

    const-string v1, "bond"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    invoke-virtual {v8, v9}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 385
    goto/16 :goto_1

    :cond_1
    if-eqz v6, :cond_3

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 386
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 387
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v2

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/acb;->e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;)Z

    .line 388
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V

    goto/16 :goto_1

    .line 390
    :cond_2
    new-instance v8, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;

    invoke-direct {v8}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;-><init>()V

    .line 391
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 392
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    invoke-virtual {v8, v9}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 395
    goto/16 :goto_1

    .line 400
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingUniversalFragment startActivity:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 403
    invoke-static {}, Lo/acb;->e()Lo/acb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v2

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/acb;->e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;)Z

    .line 404
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V

    goto/16 :goto_1

    .line 406
    :cond_4
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 407
    const-string v0, "com.huawei.health"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 408
    const-string v0, "healthdata"

    const-string v1, "MyHealthData_jump_mainActivity"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 410
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->a:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 411
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.BloodpresureActivity"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 412
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 413
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 414
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.BaseHealthDataActivity"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 415
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->d:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 416
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.BloodsugarActivity"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 419
    :cond_7
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 420
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 423
    :goto_1
    goto/16 :goto_2

    :cond_8
    const/16 v0, 0x8

    if-ne v0, p1, :cond_a

    .line 424
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment PAIRING_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acd;->c(Ljava/lang/String;)Z

    .line 426
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 427
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;I)V

    goto/16 :goto_2

    .line 429
    :cond_9
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 430
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Fail to bind device."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8dc

    const/4 v3, 0x0

    invoke-static {v2, v0, v4, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 433
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;-><init>()V

    .line 435
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acd;->c(Ljava/lang/String;)Z

    .line 436
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 437
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 438
    goto :goto_2

    .line 439
    :cond_a
    const/16 v0, 0xa

    if-ne v0, p1, :cond_b

    .line 440
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v2

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p0}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    .line 442
    :cond_b
    :goto_2
    return-void
.end method

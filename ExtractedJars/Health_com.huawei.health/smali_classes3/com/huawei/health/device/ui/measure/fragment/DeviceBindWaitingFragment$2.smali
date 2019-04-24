.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aby;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Lo/acl;)V
    .locals 0

    .line 288
    return-void
.end method

.method public onScanFailed(I)V
    .locals 0

    .line 293
    return-void
.end method

.method public onStateChanged(I)V
    .locals 8

    .line 297
    const/4 v0, 0x7

    if-ne v0, p1, :cond_5

    .line 298
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment PAIRING_PASSED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 301
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 302
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/acl;

    move-result-object v0

    invoke-virtual {v0}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 304
    if-eqz v5, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    if-le v0, v1, :cond_0

    .line 305
    const-string v0, "macAddress"

    const/4 v1, 0x0

    const/16 v2, 0x18

    invoke-virtual {v5, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    :cond_0
    goto :goto_0

    .line 308
    :cond_1
    const-string v0, "macAddress"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/acl;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    :goto_0
    const-string v0, "device_name"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    const-string v0, "device_type"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 313
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 314
    const-string v0, "deviceId"

    iget-object v1, v5, Lo/afj;->g:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    :cond_2
    sget-object v0, Lo/dae;->fI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 317
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 319
    const/16 v0, 0x5dc

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    .line 320
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v7, v4}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 322
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 323
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 324
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    .line 325
    return-void

    .line 328
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    .line 329
    goto/16 :goto_1

    :cond_5
    const/16 v0, 0x8

    if-ne v0, p1, :cond_6

    .line 330
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceBindWaitingFragment PAIRING_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 332
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
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

    .line 335
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindFailedFragment;-><init>()V

    .line 337
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acd;->b(Ljava/lang/String;)Z

    .line 338
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 340
    goto :goto_1

    :cond_6
    const/16 v0, 0xa

    if-ne v0, p1, :cond_7

    .line 341
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/afj;

    move-result-object v2

    invoke-virtual {v2}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/acl;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p0}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z

    .line 343
    :cond_7
    :goto_1
    return-void
.end method

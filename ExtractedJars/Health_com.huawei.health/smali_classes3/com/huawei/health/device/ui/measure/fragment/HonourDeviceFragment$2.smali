.class Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->unbindDevice(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

.field final synthetic val$map:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;Ljava/util/Map;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->val$map:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 351
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 354
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->l(Ljava/lang/String;)V

    .line 355
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->m(Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/ahd;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->f()V

    .line 360
    :cond_0
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->f()V

    .line 361
    sget-object v0, Lo/dae;->fM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 362
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->val$map:Ljava/util/Map;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 365
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 366
    goto/16 :goto_0

    .line 369
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 370
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v4

    .line 371
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v5

    .line 372
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afd;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v6

    .line 373
    invoke-virtual {v6}, Lo/afx;->e()Lo/afv;

    move-result-object v7

    .line 374
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 375
    const-string v0, "type"

    const/4 v1, -0x5

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 376
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 378
    const/4 v0, 0x0

    invoke-virtual {v7, v4, v0, v8}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 382
    :cond_2
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 384
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x5

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 385
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 386
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/ahd;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->f()V

    .line 389
    :cond_3
    sget-object v0, Lo/dae;->fM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 390
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->val$map:Ljava/util/Map;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 393
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 396
    :cond_4
    :goto_0
    return-void
.end method

.class Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 308
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 309
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    sget-object v0, Lo/dae;->fC:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 311
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 312
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lo/agt;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/agt;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afj;

    .line 313
    invoke-virtual {v5}, Lo/afj;->n()Lo/afj$a;

    move-result-object v6

    .line 314
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 315
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 316
    invoke-static {v5}, Lo/ake;->d(Lo/afj;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    .line 319
    :cond_0
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 320
    const-string v0, "productId"

    invoke-virtual {v5}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    invoke-virtual {v7, v8}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0, v7}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 324
    :cond_1
    return-void
.end method

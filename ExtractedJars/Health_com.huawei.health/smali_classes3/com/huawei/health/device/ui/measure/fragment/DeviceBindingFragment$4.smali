.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V
    .locals 0

    .line 577
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 580
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/afj;

    if-eqz v0, :cond_0

    .line 581
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0, p3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V

    goto :goto_0

    .line 582
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/afk;

    if-eqz v0, :cond_1

    .line 583
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0, p3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V

    goto :goto_0

    .line 584
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/aez;

    if-eqz v0, :cond_2

    .line 585
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0, p3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V

    goto :goto_0

    .line 586
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ahh;

    if-eqz v0, :cond_3

    .line 587
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0, p3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)V

    goto :goto_0

    .line 589
    :cond_3
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onItemClick postion is other item view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    :goto_0
    return-void
.end method

.class Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Landroid/os/Looper;)V
    .locals 0

    .line 747
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 750
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 751
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 752
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage message what = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 755
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/afj;

    .line 756
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v4, Lo/afj;->e:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 757
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/afj;)V

    goto/16 :goto_0

    .line 761
    :sswitch_1
    goto :goto_0

    .line 763
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2600(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 764
    goto :goto_0

    .line 766
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 767
    goto :goto_0

    .line 769
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 770
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 772
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2800(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Ljava/util/List;)V

    goto :goto_0

    .line 776
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2900(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;I)V

    .line 777
    goto :goto_0

    .line 779
    :sswitch_6
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$3000(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 780
    goto :goto_0

    .line 782
    :sswitch_7
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$3100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 783
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 784
    goto :goto_0

    .line 786
    :sswitch_8
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$3100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 787
    .line 792
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x64 -> :sswitch_6
        0x65 -> :sswitch_3
        0x66 -> :sswitch_2
        0x67 -> :sswitch_5
        0x68 -> :sswitch_8
        0x69 -> :sswitch_7
        0x6a -> :sswitch_4
    .end sparse-switch
.end method

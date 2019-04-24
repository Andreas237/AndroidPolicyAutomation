.class Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Landroid/os/Looper;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 81
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 82
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment mHandler handleMessage:null == msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 84
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 85
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 87
    :sswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment REFRESH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/afj;

    .line 89
    if-eqz v4, :cond_5

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lo/acl$a;

    move-result-object v0

    iget-object v1, v4, Lo/afj;->e:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/acl$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 90
    const-string v0, "9323f6b7-b459-44f4-a698-988d1769832a"

    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    .line 91
    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 92
    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    .line 94
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    if-ne v0, v1, :cond_3

    .line 95
    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v5, v0, Lo/afj$a;->a:Ljava/lang/String;

    .line 96
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment company = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->productInfos:Ljava/util/ArrayList;

    invoke-static {v0, v1, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Ljava/util/ArrayList;Lo/afj;Ljava/lang/String;)V

    .line 99
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lo/agt;

    move-result-object v0

    invoke-virtual {v0}, Lo/agt;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    goto :goto_1

    .line 100
    :catch_0
    move-exception v6

    .line 101
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    .line 102
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSelectBindFragment mHandler TO_REFRESH HDK_WEIGHT isMain = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSelectBindFragment mHandler TO_REFRESH HDK_WEIGHT e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :goto_1
    goto/16 :goto_3

    .line 106
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;->addProductList(Lo/afj;)V

    .line 108
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;->notifyDataSetChanged()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 113
    goto :goto_3

    .line 109
    :catch_1
    move-exception v5

    .line 110
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    .line 111
    :goto_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSelectBindFragment mHandler TO_REFRESH isMain = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceSelectBindFragment mHandler TO_REFRESH e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    goto :goto_3

    .line 119
    :sswitch_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceSelectBindFragment FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 125
    :cond_5
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

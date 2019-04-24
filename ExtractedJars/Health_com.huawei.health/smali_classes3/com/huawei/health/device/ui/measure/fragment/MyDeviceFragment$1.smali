.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 127
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 128
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment bindHandler handleMessage:null == msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 130
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 131
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 133
    :sswitch_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 134
    if-eqz v4, :cond_1

    .line 135
    new-instance v5, Lo/afa;

    invoke-direct {v5}, Lo/afa;-><init>()V

    .line 136
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/afa;->e(I)V

    .line 137
    invoke-virtual {v5, v4}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 140
    .line 146
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

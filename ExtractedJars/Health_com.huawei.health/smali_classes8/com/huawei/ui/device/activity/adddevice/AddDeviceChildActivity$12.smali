.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)V
    .locals 0

    .line 1097
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iput p2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 6

    .line 1099
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1100
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8d44\u6e90\u6587\u4ef6(\u5355\u4e2a)\u4e0b\u8f7d\u6210\u529f "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ear;

    invoke-virtual {v1}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v4

    .line 1103
    invoke-static {v4}, Lo/dda;->c(Lo/eav;)V

    .line 1105
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ear;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/ear;)V

    .line 1107
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1109
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)I

    move-result v1

    invoke-virtual {p2}, Lo/eba;->d()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)I

    .line 1110
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->e:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1111
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->e:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)V

    goto :goto_0

    .line 1113
    :cond_0
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8d44\u6e90\u6587\u4ef6\uff08\u5168\u90e8\uff09\u4e0b\u8f7d\u6210\u529f "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1114
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 1115
    const/16 v0, 0x28

    iput v0, v5, Landroid/os/Message;->what:I

    .line 1116
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1117
    return-void

    .line 1119
    :goto_0
    goto :goto_1

    :cond_1
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1121
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1122
    const/16 v0, 0x1e

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1123
    invoke-virtual {p2}, Lo/eba;->b()I

    move-result v0

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 1124
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1125
    goto :goto_1

    .line 1127
    :cond_2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1128
    const/16 v0, 0x32

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1129
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1131
    :goto_1
    return-void
.end method

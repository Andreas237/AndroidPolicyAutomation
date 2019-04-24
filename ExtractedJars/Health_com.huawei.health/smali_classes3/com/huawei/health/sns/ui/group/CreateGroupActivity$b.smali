.class Lcom/huawei/health/sns/ui/group/CreateGroupActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/CreateGroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/CreateGroupActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V
    .locals 1

    .line 102
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 103
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$b;->c:Ljava/lang/ref/WeakReference;

    .line 104
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 109
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;

    .line 111
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    :cond_0
    return-void

    .line 115
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 119
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 120
    if-eqz v4, :cond_3

    .line 122
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 123
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 125
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v3, v0, v1}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->c(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;J)V

    .line 127
    :cond_2
    goto :goto_0

    .line 133
    :sswitch_1
    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->a(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V

    .line 134
    iget v0, p1, Landroid/os/Message;->what:I

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-static {v3, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->b(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;III)V

    .line 135
    .line 140
    :cond_3
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xa1 -> :sswitch_0
        0xa2 -> :sswitch_1
        0xaaa -> :sswitch_1
    .end sparse-switch
.end method

.class Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)V
    .locals 1

    .line 131
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 132
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$e;->a:Ljava/lang/ref/WeakReference;

    .line 133
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 138
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;

    .line 140
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    :cond_0
    return-void

    .line 145
    :cond_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->a(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;)V

    .line 147
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 151
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 152
    if-eqz v3, :cond_2

    .line 154
    const-string v0, "bundleKeyGroupName"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 155
    const-string v0, "bundleKeyGrpMbNumber"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 156
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    .line 157
    invoke-static {v2, v4, v5, v6}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->d(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 158
    goto :goto_0

    .line 163
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->a(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;II)V

    .line 164
    goto :goto_0

    .line 169
    :sswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->b(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;II)V

    .line 170
    goto :goto_0

    .line 174
    :sswitch_3
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;->e(Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;I)V

    .line 175
    .line 181
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xc0 -> :sswitch_1
        0xaaa -> :sswitch_2
        0x12f1 -> :sswitch_3
        0x12f2 -> :sswitch_2
        0x2320 -> :sswitch_0
    .end sparse-switch
.end method

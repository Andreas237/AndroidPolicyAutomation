.class Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V
    .locals 1

    .line 136
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 137
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 138
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 143
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    .line 146
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 148
    :cond_0
    return-void

    .line 150
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 154
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 155
    const/4 v3, 0x0

    .line 156
    if-eqz v2, :cond_2

    .line 158
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 159
    invoke-virtual {v1, v3}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->b(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 166
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->a(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V

    .line 167
    goto :goto_0

    .line 171
    :sswitch_2
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->d(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;I)V

    .line 172
    goto :goto_0

    .line 175
    :sswitch_3
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 176
    if-eqz v2, :cond_2

    .line 178
    move-object v0, v2

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 179
    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->b(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;)V

    goto :goto_0

    .line 184
    :sswitch_4
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;->e(Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;Landroid/os/Message;)V

    .line 185
    .line 190
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_4
        0x91 -> :sswitch_1
        0xe2 -> :sswitch_2
        0x143 -> :sswitch_0
        0x148 -> :sswitch_3
    .end sparse-switch
.end method

.class Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V
    .locals 1

    .line 165
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 166
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$b;->a:Ljava/lang/ref/WeakReference;

    .line 167
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 172
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;

    .line 175
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    :cond_0
    return-void

    .line 179
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 183
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Ljava/lang/Object;)V

    .line 184
    goto :goto_0

    .line 188
    :sswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 189
    const/4 v4, 0x0

    .line 190
    if-eqz v3, :cond_2

    .line 192
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 193
    invoke-virtual {v2, v4}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->d(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 200
    :sswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->e(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    .line 201
    goto :goto_0

    .line 205
    :sswitch_3
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->b(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Landroid/os/Message;)V

    .line 206
    goto :goto_0

    .line 210
    :sswitch_4
    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V

    .line 211
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {v2, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 212
    goto :goto_0

    .line 216
    :sswitch_5
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->c(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;Landroid/os/Message;)V

    .line 217
    .line 222
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_3
        0x91 -> :sswitch_2
        0x142 -> :sswitch_0
        0x143 -> :sswitch_1
        0x145 -> :sswitch_5
        0xaaa -> :sswitch_4
    .end sparse-switch
.end method

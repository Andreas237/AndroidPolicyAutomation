.class Lcom/huawei/health/sns/ui/user/FriendListFragment$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/FriendListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/FriendListFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V
    .locals 1

    .line 137
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 138
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$e;->b:Ljava/lang/ref/WeakReference;

    .line 139
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 144
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendListFragment$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/user/FriendListFragment;

    .line 146
    if-nez v2, :cond_0

    .line 148
    return-void

    .line 152
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 154
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 156
    :cond_1
    return-void

    .line 159
    :cond_2
    const-string v0, "msgFriendListQuery"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_3

    .line 161
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Lcom/huawei/health/sns/ui/user/FriendListFragment;Landroid/os/Message;)V

    goto/16 :goto_0

    .line 163
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1011

    if-ne v1, v0, :cond_4

    .line 165
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b()V

    goto/16 :goto_0

    .line 167
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_5

    .line 169
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->e(Lcom/huawei/health/sns/ui/user/FriendListFragment;I)V

    goto/16 :goto_0

    .line 171
    :cond_5
    const-string v0, "msgGroupNotifyUpdate"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_6

    .line 173
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 174
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->b(Lcom/huawei/health/sns/ui/user/FriendListFragment;I)V

    .line 175
    goto/16 :goto_0

    .line 176
    :cond_6
    const-string v0, "msgFriendUnreadUpdate"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_7

    .line 178
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 179
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->c(Lcom/huawei/health/sns/ui/user/FriendListFragment;I)V

    .line 180
    goto :goto_0

    .line 181
    :cond_7
    const-string v0, "msgFriendRecommendUpdate"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v0, v1, :cond_8

    .line 183
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->c(Lcom/huawei/health/sns/ui/user/FriendListFragment;Landroid/os/Message;)V

    goto :goto_0

    .line 185
    :cond_8
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x21

    if-ne v1, v0, :cond_a

    .line 187
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 188
    if-eqz v4, :cond_9

    .line 190
    const-string v0, "keyBundleUserID"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 191
    const-string v0, "keyBundleremarkName"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 192
    invoke-static {v2, v5, v6, v7}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a(Lcom/huawei/health/sns/ui/user/FriendListFragment;JLjava/lang/String;)V

    .line 194
    :cond_9
    goto :goto_0

    .line 195
    :cond_a
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1021

    if-ne v1, v0, :cond_b

    .line 197
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->d(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V

    goto :goto_0

    .line 199
    :cond_b
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x100

    if-ne v1, v0, :cond_c

    .line 201
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/FriendListFragment;->a(Lcom/huawei/health/sns/ui/user/FriendListFragment;)V

    .line 203
    :cond_c
    :goto_0
    return-void
.end method

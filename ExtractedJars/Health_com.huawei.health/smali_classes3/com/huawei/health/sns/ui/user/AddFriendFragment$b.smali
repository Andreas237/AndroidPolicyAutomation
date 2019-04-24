.class Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/AddFriendFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/user/AddFriendFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 83
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;->c:Ljava/lang/ref/WeakReference;

    .line 84
    return-void
.end method

.method private a(Landroid/os/Message;Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V
    .locals 4

    .line 152
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 153
    const/4 v3, 0x0

    .line 154
    if-eqz v2, :cond_0

    .line 156
    const-string v0, "keyIsGetSettingSucc"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 158
    :cond_0
    if-eqz v3, :cond_1

    .line 160
    invoke-static {p2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->d(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    .line 162
    :cond_1
    return-void
.end method

.method private c(Landroid/os/Message;Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V
    .locals 3

    .line 166
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 167
    const/4 v2, 0x0

    .line 168
    if-eqz v1, :cond_0

    .line 170
    const-string v0, "keyFindUser"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 172
    :cond_0
    if-eqz v2, :cond_1

    .line 174
    invoke-static {p2, v2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->e(Lcom/huawei/health/sns/ui/user/AddFriendFragment;Lcom/huawei/health/sns/model/user/User;)V

    .line 176
    :cond_1
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 89
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/user/AddFriendFragment;

    .line 91
    if-nez v2, :cond_0

    .line 93
    return-void

    .line 96
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 97
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    :cond_1
    return-void

    .line 102
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 106
    :sswitch_0
    invoke-direct {p0, p1, v2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;->c(Landroid/os/Message;Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    .line 107
    goto :goto_0

    .line 111
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->d(Lcom/huawei/health/sns/ui/user/AddFriendFragment;I)V

    .line 112
    goto :goto_0

    .line 117
    :sswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {v3, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 118
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    .line 119
    goto :goto_0

    .line 123
    :sswitch_3
    invoke-direct {p0, p1, v2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment$b;->a(Landroid/os/Message;Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    .line 124
    goto :goto_0

    .line 128
    :sswitch_4
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    if-eqz v4, :cond_3

    .line 133
    const-string v0, "keySearchContact"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 134
    const-string v0, "keySearchContent"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 136
    :cond_3
    invoke-static {v2, v5, v6}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a(Lcom/huawei/health/sns/ui/user/AddFriendFragment;Ljava/util/List;Ljava/lang/String;)V

    .line 137
    goto :goto_0

    .line 141
    :sswitch_5
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    invoke-static {v3, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 142
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/AddFriendFragment;->a(Lcom/huawei/health/sns/ui/user/AddFriendFragment;)V

    .line 143
    .line 148
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x301 -> :sswitch_0
        0x302 -> :sswitch_1
        0x303 -> :sswitch_2
        0x304 -> :sswitch_2
        0x305 -> :sswitch_4
        0x306 -> :sswitch_5
        0x512 -> :sswitch_3
    .end sparse-switch
.end method

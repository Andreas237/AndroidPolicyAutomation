.class Lcom/huawei/health/sns/ui/group/GroupListFragment$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/GroupListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/GroupListFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V
    .locals 1

    .line 163
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 164
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment$d;->e:Ljava/lang/ref/WeakReference;

    .line 165
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 170
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/group/GroupListFragment;

    .line 173
    if-nez v2, :cond_0

    .line 175
    return-void

    .line 179
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 180
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 182
    :cond_1
    return-void

    .line 185
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 190
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 191
    if-eqz v4, :cond_4

    .line 193
    const-string v0, "bundleKeyGroupListData"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupListData;

    .line 194
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v2, v5, v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e(Lcom/huawei/health/sns/ui/group/GroupListFragment;Lcom/huawei/health/sns/model/group/GroupListData;I)V

    .line 195
    goto :goto_0

    .line 203
    :sswitch_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->b(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 205
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->d(Lcom/huawei/health/sns/ui/group/GroupListFragment;Z)V

    goto :goto_0

    .line 211
    :sswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->c(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V

    .line 212
    goto :goto_0

    .line 216
    :sswitch_3
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->a(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V

    .line 217
    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->d(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V

    .line 218
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 219
    if-eqz v4, :cond_4

    .line 221
    const-string v0, "bundleKeyGroupCount"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 222
    const-string v0, "bundleKeyGroupNotifyCount"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 223
    const-string v0, "bundleKeyResponseCode"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 224
    const-string v0, "bundleKeyResultCode"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 225
    add-int v0, v5, v6

    invoke-static {v2, v7, v8, v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e(Lcom/huawei/health/sns/ui/group/GroupListFragment;III)V

    .line 227
    add-int v0, v5, v6

    if-lez v0, :cond_3

    .line 229
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->d(Lcom/huawei/health/sns/ui/group/GroupListFragment;Z)V

    .line 231
    :cond_3
    goto :goto_0

    .line 236
    :sswitch_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {v3, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 237
    .line 242
    :cond_4
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x31 -> :sswitch_0
        0x32 -> :sswitch_0
        0x81 -> :sswitch_1
        0x91 -> :sswitch_1
        0xd1 -> :sswitch_3
        0xd3 -> :sswitch_4
        0x100 -> :sswitch_1
        0x1011 -> :sswitch_2
    .end sparse-switch
.end method

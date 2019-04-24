.class Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V
    .locals 1

    .line 164
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 165
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$e;->c:Ljava/lang/ref/WeakReference;

    .line 166
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 170
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    .line 173
    if-nez v4, :cond_0

    .line 174
    return-void

    .line 178
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    .line 179
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    :cond_1
    return-void

    .line 183
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 186
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 187
    if-eqz v6, :cond_6

    .line 188
    const-string v0, "bundleKeyGroupListData"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupListData;

    .line 189
    if-nez v7, :cond_3

    .line 190
    goto/16 :goto_3

    .line 192
    :cond_3
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)Z

    .line 195
    invoke-static {}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 196
    :try_start_0
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 197
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupListData;->getGroupList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v8

    throw v9

    .line 199
    :goto_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)Z

    .line 200
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 201
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 202
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 203
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V

    goto :goto_1

    .line 205
    :cond_4
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 206
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 209
    :goto_1
    goto/16 :goto_3

    .line 215
    :sswitch_1
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 216
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)V

    goto/16 :goto_3

    .line 222
    :sswitch_2
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->h(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V

    .line 223
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 224
    if-eqz v6, :cond_6

    .line 225
    const-string v0, "bundleKeyGroupCount"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 226
    const-string v0, "bundleKeyGroupNotifyCount"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 227
    const-string v0, "bundleKeyResponseCode"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 228
    const-string v0, "bundleKeyResultCode"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 230
    const-string v0, "Group_HealthGroupListFragment"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CODE_REQUEST_GROUP_LIST_COMPLETE groupCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "groupNotifyCount = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 231
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "responseCode = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " resultCode = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 230
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    add-int v0, v7, v8

    if-lez v0, :cond_5

    .line 235
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->a(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)V

    .line 236
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b()V

    .line 237
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 238
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 240
    :cond_5
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b()V

    .line 241
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->b(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 242
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 244
    :goto_2
    goto :goto_3

    .line 249
    :sswitch_3
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {v5, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 250
    goto :goto_3

    .line 253
    :sswitch_4
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->k(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V

    .line 254
    goto :goto_3

    .line 257
    :sswitch_5
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->f(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Lo/bhl;

    move-result-object v0

    invoke-virtual {v0}, Lo/bhl;->notifyDataSetChanged()V

    .line 258
    .line 263
    :cond_6
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x32 -> :sswitch_0
        0x80 -> :sswitch_5
        0x81 -> :sswitch_1
        0xd1 -> :sswitch_2
        0xd3 -> :sswitch_3
        0x1001 -> :sswitch_4
    .end sparse-switch
.end method

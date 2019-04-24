.class Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V
    .locals 1

    .line 181
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 182
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$d;->e:Ljava/lang/ref/WeakReference;

    .line 183
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 188
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    .line 190
    if-nez v1, :cond_0

    .line 192
    return-void

    .line 194
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 199
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 200
    if-eqz v2, :cond_1

    .line 202
    const-string v0, "bundleKeyGroupListData"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/GroupListData;

    .line 203
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {v1, v3, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/GroupListData;I)V

    .line 204
    goto :goto_0

    .line 210
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Z)V

    goto :goto_0

    .line 218
    :sswitch_2
    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V

    .line 219
    invoke-static {v1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V

    .line 220
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 221
    if-eqz v2, :cond_1

    .line 223
    const-string v0, "bundleKeyGroupCount"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 224
    const-string v0, "bundleKeyResponseCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 225
    const-string v0, "bundleKeyResultCode"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 226
    invoke-static {v1, v4, v5, v3}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;III)V

    .line 228
    if-lez v3, :cond_1

    .line 230
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->b(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Z)V

    .line 232
    .line 238
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x71 -> :sswitch_0
        0x72 -> :sswitch_0
        0x81 -> :sswitch_1
        0x91 -> :sswitch_1
        0xd1 -> :sswitch_2
    .end sparse-switch
.end method

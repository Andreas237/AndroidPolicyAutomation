.class Lcom/huawei/health/sns/ui/group/NormalGroupFragment$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/NormalGroupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/NormalGroupFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 1

    .line 249
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 250
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$e;->d:Ljava/lang/ref/WeakReference;

    .line 251
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 256
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    .line 258
    if-nez v1, :cond_0

    .line 260
    return-void

    .line 263
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 264
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 266
    :cond_1
    return-void

    .line 269
    :cond_2
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 272
    return-void

    .line 275
    :cond_3
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;Landroid/os/Message;Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 278
    return-void

    .line 281
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 287
    :sswitch_0
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->b(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    .line 288
    goto :goto_0

    .line 293
    :sswitch_1
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->e(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    .line 294
    goto :goto_0

    .line 298
    :sswitch_2
    goto :goto_0

    .line 302
    :sswitch_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    .line 303
    goto :goto_0

    .line 308
    :sswitch_4
    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    .line 309
    goto :goto_0

    .line 313
    :sswitch_5
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 314
    if-eqz v3, :cond_5

    .line 316
    const-string v0, "groupMemberSize"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 317
    invoke-static {v1, v4}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->c(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;I)V

    .line 318
    .line 324
    :cond_5
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x91 -> :sswitch_0
        0xb1 -> :sswitch_1
        0x153 -> :sswitch_2
        0x154 -> :sswitch_3
        0x156 -> :sswitch_5
        0x1e1 -> :sswitch_4
        0x1011 -> :sswitch_0
    .end sparse-switch
.end method

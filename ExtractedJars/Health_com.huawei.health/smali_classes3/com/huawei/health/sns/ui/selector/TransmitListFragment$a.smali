.class Lcom/huawei/health/sns/ui/selector/TransmitListFragment$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/TransmitListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/selector/TransmitListFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;)V
    .locals 1

    .line 258
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 259
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$a;->c:Ljava/lang/ref/WeakReference;

    .line 260
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 265
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    .line 268
    if-nez v2, :cond_0

    .line 270
    return-void

    .line 273
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 274
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 276
    :cond_1
    return-void

    .line 279
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x81

    if-ne v0, v1, :cond_3

    .line 281
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e()V

    .line 283
    :cond_3
    return-void
.end method

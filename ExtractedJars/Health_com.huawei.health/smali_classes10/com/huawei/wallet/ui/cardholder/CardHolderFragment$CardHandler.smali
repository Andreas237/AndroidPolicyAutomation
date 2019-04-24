.class Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CardHandler"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V
    .locals 1

    .line 901
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 902
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;->c:Ljava/lang/ref/WeakReference;

    .line 903
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 907
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 908
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;->c:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    .line 909
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 910
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 912
    :cond_0
    return-void

    .line 914
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    .line 915
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->isDetached()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 916
    :cond_2
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 917
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 919
    :cond_3
    return-void

    .line 922
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_5

    .line 923
    invoke-static {v2}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->o(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    .line 925
    :cond_5
    return-void
.end method

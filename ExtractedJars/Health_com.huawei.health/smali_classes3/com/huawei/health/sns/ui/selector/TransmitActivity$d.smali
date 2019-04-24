.class Lcom/huawei/health/sns/ui/selector/TransmitActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/TransmitActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/selector/TransmitActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V
    .locals 1

    .line 134
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 135
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$d;->a:Ljava/lang/ref/WeakReference;

    .line 136
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 141
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    .line 143
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    :cond_0
    return-void

    .line 148
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xc29

    if-ne v0, v1, :cond_2

    .line 150
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->c(Lcom/huawei/health/sns/ui/selector/TransmitActivity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 152
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xc30

    if-ne v0, v1, :cond_3

    .line 154
    invoke-static {v2}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->e(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V

    .line 156
    :cond_3
    :goto_0
    return-void
.end method

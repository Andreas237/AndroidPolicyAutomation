.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/browser/WebViewActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 1

    .line 1617
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1618
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->e:Ljava/lang/ref/WeakReference;

    .line 1619
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1624
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1626
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    .line 1627
    if-nez v2, :cond_0

    .line 1629
    return-void

    .line 1633
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1637
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1639
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 1640
    invoke-static {v2, v3}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)V

    .line 1641
    goto :goto_0

    .line 1645
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/Object;)V

    .line 1646
    goto :goto_0

    .line 1648
    :sswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;ILjava/lang/String;)V

    .line 1649
    goto :goto_0

    .line 1652
    :sswitch_3
    invoke-static {v2, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Landroid/os/Message;)V

    .line 1653
    .line 1658
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x200 -> :sswitch_3
    .end sparse-switch
.end method

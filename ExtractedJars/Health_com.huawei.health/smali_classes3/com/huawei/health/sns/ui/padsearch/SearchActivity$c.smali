.class Lcom/huawei/health/sns/ui/padsearch/SearchActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/padsearch/SearchActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/padsearch/SearchActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;)V
    .locals 1

    .line 118
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 119
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 120
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 125
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/ui/padsearch/SearchActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;

    .line 127
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    :cond_0
    return-void

    .line 132
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xd30

    if-ne v0, v1, :cond_2

    .line 134
    invoke-static {v2}, Lcom/huawei/health/sns/ui/padsearch/SearchActivity;->b(Lcom/huawei/health/sns/ui/padsearch/SearchActivity;)V

    .line 136
    :cond_2
    return-void
.end method

.class Lcom/huawei/health/sns/ui/search/SearchFragment$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/search/SearchFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/search/SearchFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/search/SearchFragment;)V
    .locals 1

    .line 85
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 86
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment$b;->b:Ljava/lang/ref/WeakReference;

    .line 87
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 92
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment$b;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/search/SearchFragment;

    .line 94
    if-nez v2, :cond_0

    .line 96
    return-void

    .line 99
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 100
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    :cond_1
    return-void

    .line 104
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const-string v1, "search_result_list"

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 106
    invoke-static {v2}, Lcom/huawei/health/sns/ui/search/SearchFragment;->a(Lcom/huawei/health/sns/ui/search/SearchFragment;)V

    goto :goto_0

    .line 108
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const-string v1, "search_no_result"

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 110
    invoke-static {v2}, Lcom/huawei/health/sns/ui/search/SearchFragment;->e(Lcom/huawei/health/sns/ui/search/SearchFragment;)V

    .line 112
    :cond_4
    :goto_0
    return-void
.end method

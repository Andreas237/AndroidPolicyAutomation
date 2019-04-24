.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 1

    .line 1605
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1606
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;->e:Ljava/lang/ref/WeakReference;

    .line 1607
    return-void
.end method


# virtual methods
.method public d([I[Ljava/lang/Object;)V
    .locals 6

    .line 1612
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Month cb errorCode : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1613
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Month cb datas : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, p2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1627
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    .line 1628
    if-nez v4, :cond_0

    .line 1629
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ReadMonthDataCallbackEx sportHistory weakReference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1630
    return-void

    .line 1633
    :cond_0
    array-length v0, p2

    if-nez v0, :cond_1

    .line 1634
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas.length==0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1635
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 1636
    return-void

    .line 1638
    :cond_1
    const/4 v0, 0x0

    aget-object v0, p2, v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    aget-object v0, p2, v0

    if-nez v0, :cond_2

    .line 1639
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas[0] ==null && datas[1]==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1640
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 1641
    return-void

    .line 1644
    :cond_2
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_3

    .line 1645
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWorkerHandler == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1646
    return-void

    .line 1648
    :cond_3
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 1649
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1650
    iput-object p2, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1651
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1652
    return-void
.end method

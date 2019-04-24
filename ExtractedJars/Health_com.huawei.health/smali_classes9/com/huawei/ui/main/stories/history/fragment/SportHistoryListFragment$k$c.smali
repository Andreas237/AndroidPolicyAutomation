.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;
    }
.end annotation


# instance fields
.field private a:[Ljava/lang/Object;

.field private b:I

.field private c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;

.field private d:[I

.field private e:Ljava/lang/Object;


# direct methods
.method public constructor <init>([IILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;)V
    .locals 4

    .line 1796
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1794
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->e:Ljava/lang/Object;

    .line 1798
    if-eqz p1, :cond_1

    .line 1801
    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 1802
    :try_start_0
    iput p2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1803
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 1806
    :goto_0
    array-length v0, p1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->d:[I

    .line 1807
    const/4 v2, 0x0

    :goto_1
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->b:I

    if-ge v2, v0, :cond_0

    .line 1808
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->d:[I

    const/16 v1, -0x7e2

    aput v1, v0, v2

    .line 1807
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1810
    :cond_0
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->a:[Ljava/lang/Object;

    .line 1813
    iput-object p3, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;

    .line 1815
    :cond_1
    return-void
.end method


# virtual methods
.method public a(IILjava/lang/Object;)V
    .locals 7

    .line 1819
    const/4 v4, 0x0

    .line 1821
    iget-object v5, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->e:Ljava/lang/Object;

    monitor-enter v5

    .line 1822
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->d:[I

    aput p2, v0, p1

    .line 1823
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->a:[Ljava/lang/Object;

    aput-object p3, v0, p1

    .line 1824
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->b:I

    .line 1826
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v0, :cond_0

    .line 1827
    const/4 v4, 0x1

    .line 1829
    :cond_0
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1831
    :goto_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryToNotifyData reqtype: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " request count "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1833
    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;

    if-eqz v0, :cond_1

    .line 1834
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->d:[I

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->a:[Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$e;->d([I[Ljava/lang/Object;)V

    .line 1837
    :cond_1
    return-void
.end method

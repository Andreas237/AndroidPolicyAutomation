.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

.field private d:I


# direct methods
.method public constructor <init>(ILcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;)V
    .locals 0

    .line 1850
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1851
    iput p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;->d:I

    .line 1852
    iput-object p2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    .line 1853
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 1858
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SimpleCallback onResponse "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1860
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    if-eqz v0, :cond_0

    .line 1861
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c$b;->d:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$k$c;->a(IILjava/lang/Object;)V

    .line 1863
    :cond_0
    return-void
.end method

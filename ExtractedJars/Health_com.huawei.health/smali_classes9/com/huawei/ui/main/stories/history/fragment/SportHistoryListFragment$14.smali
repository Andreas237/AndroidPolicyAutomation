.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(IJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

.field final synthetic d:I

.field final synthetic e:J


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;JI)V
    .locals 0

    .line 1104
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    iput-wide p2, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->e:J

    iput p4, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 1108
    if-nez p1, :cond_0

    .line 1109
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSportHistoryData delete successful"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->x(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;->onResponse(ILjava/lang/Object;)V

    .line 1112
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1113
    const-string v0, "startTime"

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1114
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 1116
    goto :goto_0

    .line 1117
    :cond_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSportHistoryData delete failed ,type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "    "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$14;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->x(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;

    move-result-object v0

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$a;->onResponse(ILjava/lang/Object;)V

    .line 1120
    :goto_0
    return-void
.end method

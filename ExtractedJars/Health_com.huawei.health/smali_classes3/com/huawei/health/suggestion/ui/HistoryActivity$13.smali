.class Lcom/huawei/health/suggestion/ui/HistoryActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/HistoryActivity;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$13;->d:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 369
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanRecord;

    move-object v1, p2

    check-cast v1, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity$13;->d(Lcom/huawei/health/suggestion/model/PlanRecord;Lcom/huawei/health/suggestion/model/PlanRecord;)I

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/health/suggestion/model/PlanRecord;Lcom/huawei/health/suggestion/model/PlanRecord;)I
    .locals 6

    .line 372
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishDate()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishDate()J

    move-result-wide v2

    sub-long v4, v0, v2

    .line 373
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishDate()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 374
    const/4 v0, 0x1

    return v0

    .line 375
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishDate()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 376
    const/4 v0, -0x1

    return v0

    .line 378
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

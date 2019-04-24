.class Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/Map;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$5;->a:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 268
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPlanStatistics errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 265
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$5;->d(Ljava/util/Map;)V

    return-void
.end method

.method public d(Ljava/util/Map;)V
    .locals 5

    .line 273
    const-string v0, "Suggestion_PlanFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPlanStatistics Success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    const-string v0, "planStatistics_need_refresh"

    const-string v1, "false"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$5;->a:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->b(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 276
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 277
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$5;->a:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->b(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 278
    return-void
.end method

.class Lo/bry$4$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/PlanStatistics;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/bry$4;


# direct methods
.method constructor <init>(Lo/bry$4;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lo/bry$4$5;->c:Lo/bry$4;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 320
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFailure errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/model/PlanStatistics;)V
    .locals 5

    .line 325
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 327
    const-string v0, "calorie"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireCalorie()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    const-string v0, "duration"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireDuration()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    const-string v0, "totalPlan"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStatistics;->acquireTotalPlan()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    iget-object v0, p0, Lo/bry$4$5;->c:Lo/bry$4;

    iget-object v0, v0, Lo/bry$4;->b:Lo/bui;

    invoke-virtual {v0, v4}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 331
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 317
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanStatistics;

    invoke-virtual {p0, v0}, Lo/bry$4$5;->c(Lcom/huawei/health/suggestion/model/PlanStatistics;)V

    return-void
.end method

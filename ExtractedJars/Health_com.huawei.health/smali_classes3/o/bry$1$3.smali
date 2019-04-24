.class Lo/bry$1$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/TrainStatistics;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/bry$1;


# direct methods
.method constructor <init>(Lo/bry$1;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lo/bry$1$3;->d:Lo/bry$1;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/TrainStatistics;)V
    .locals 5

    .line 349
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 351
    const-string v0, "calorie"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireCalorie()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    const-string v0, "duration"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireDuration()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    const-string v0, "totalTimes"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireTotalTimes()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    iget-object v0, p0, Lo/bry$1$3;->d:Lo/bry$1;

    iget-object v0, v0, Lo/bry$1;->d:Lo/bui;

    invoke-virtual {v0, v4}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 355
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 344
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 341
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/TrainStatistics;

    invoke-virtual {p0, v0}, Lo/bry$1$3;->a(Lcom/huawei/health/suggestion/model/TrainStatistics;)V

    return-void
.end method

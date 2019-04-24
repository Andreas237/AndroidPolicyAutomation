.class Lo/bxf$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxf;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/bxf;


# direct methods
.method constructor <init>(Lo/bxf;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 191
    const-string v0, "Suggestion_ShowPlanAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecords onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 196
    const-string v0, "Suggestion_ShowPlanAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecords onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-static {v0, p1}, Lo/bxf;->a(Lo/bxf;Ljava/util/List;)Ljava/util/List;

    .line 198
    iget-object v0, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v1

    iget-object v2, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-static {v2}, Lo/bxf;->c(Lo/bxf;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lo/bsp;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bxf;->b(Lo/bxf;Ljava/util/Map;)Ljava/util/Map;

    .line 199
    iget-object v0, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-static {v0}, Lo/bxf;->b(Lo/bxf;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-static {v1}, Lo/bxf;->d(Lo/bxf;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-static {v2}, Lo/bxf;->f(Lo/bxf;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/bxn;->d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 200
    iget-object v0, p0, Lo/bxf$2;->a:Lo/bxf;

    invoke-virtual {v0}, Lo/bxf;->notifyDataSetChanged()V

    .line 201
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 188
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bxf$2;->c(Ljava/util/List;)V

    return-void
.end method

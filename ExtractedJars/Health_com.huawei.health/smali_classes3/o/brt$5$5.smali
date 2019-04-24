.class Lo/brt$5$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/brt$5;


# direct methods
.method constructor <init>(Lo/brt$5;)V
    .locals 0

    .line 607
    iput-object p1, p0, Lo/brt$5$5;->d:Lo/brt$5;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 609
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRecommendWorkouts errorInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, "== errorcode:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    iget-object v0, p0, Lo/brt$5$5;->d:Lo/brt$5;

    iget-object v0, v0, Lo/brt$5;->g:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 611
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 614
    iget-object v0, p0, Lo/brt$5$5;->d:Lo/brt$5;

    iget-object v0, v0, Lo/brt$5;->g:Lo/bui;

    invoke-virtual {v0, p1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 615
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 607
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/brt$5$5;->c(Ljava/util/List;)V

    return-void
.end method

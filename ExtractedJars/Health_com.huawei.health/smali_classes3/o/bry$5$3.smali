.class Lo/bry$5$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bry$5;->run()V
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
.field final synthetic c:Lo/bry$5;


# direct methods
.method constructor <init>(Lo/bry$5;)V
    .locals 0

    .line 499
    iput-object p1, p0, Lo/bry$5$3;->c:Lo/bry$5;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 503
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getJoinedWorkouts  onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 499
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bry$5$3;->e(Ljava/util/List;)V

    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 508
    const-string v0, "PluginSuggestionHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getJoinedWorkouts  onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    return-void
.end method

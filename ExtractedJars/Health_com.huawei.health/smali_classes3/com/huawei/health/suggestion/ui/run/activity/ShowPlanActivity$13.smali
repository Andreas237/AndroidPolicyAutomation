.class Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$13;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->g()V
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
.field final synthetic a:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$13;->a:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 239
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPlanFinishDialog errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ".errorInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 236
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$13;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 245
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$13;->a:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->e(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;Ljava/util/List;)V

    .line 246
    return-void
.end method

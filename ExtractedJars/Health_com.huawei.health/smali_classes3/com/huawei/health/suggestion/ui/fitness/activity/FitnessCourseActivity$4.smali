.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 133
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Z)Z

    .line 134
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)Lo/bur;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bur;->b(Z)V

    .line 136
    const-string v0, "FitnessCourseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getOperationPage() onFailed errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorInfo"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;)V"
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Z)Z

    .line 142
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Ljava/util/List;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)Lo/bur;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bur;->c(Ljava/util/List;)V

    .line 145
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 130
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$4;->c(Ljava/util/List;)V

    return-void
.end method

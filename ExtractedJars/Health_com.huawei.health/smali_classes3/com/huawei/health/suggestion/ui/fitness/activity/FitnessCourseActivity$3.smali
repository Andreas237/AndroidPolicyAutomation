.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 195
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Z)Z

    .line 196
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)Lo/bur;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bur;->b(Z)V

    .line 198
    const-string v0, "FitnessCourseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessCourseTopicList() onfalure errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorinfo"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;)V"
        }
    .end annotation

    .line 203
    if-eqz p1, :cond_0

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Z)Z

    .line 205
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)I

    .line 207
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)Lo/bur;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bur;->a(Ljava/util/List;)V

    goto :goto_0

    .line 209
    :cond_0
    const-string v0, "FitnessCourseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDataAndRefreshTopic() onSuccess topic is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 192
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$3;->b(Ljava/util/List;)V

    return-void
.end method

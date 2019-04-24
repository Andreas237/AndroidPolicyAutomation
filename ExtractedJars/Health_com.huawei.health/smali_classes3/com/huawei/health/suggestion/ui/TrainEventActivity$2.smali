.class Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/TrainEventActivity;->i()V
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
.field final synthetic e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 3

    .line 168
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->e:Lo/emr;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->e:Lo/emr;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->b(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->e(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->e()V

    .line 173
    const-string v0, "TrainEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 165
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->e:Lo/emr;

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->e:Lo/emr;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->b(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->e(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;->e:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->b()V

    .line 183
    return-void
.end method

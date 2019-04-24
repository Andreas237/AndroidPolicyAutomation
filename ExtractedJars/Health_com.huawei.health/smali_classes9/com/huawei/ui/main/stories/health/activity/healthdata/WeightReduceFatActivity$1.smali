.class Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 127
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFailure errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 130
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 124
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;->d(Ljava/util/List;)V

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;)V"
        }
    .end annotation

    .line 134
    const-string v0, "WeightReduceFatActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess invoke"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity$1;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightReduceFatActivity;Ljava/util/List;)V

    .line 136
    return-void
.end method

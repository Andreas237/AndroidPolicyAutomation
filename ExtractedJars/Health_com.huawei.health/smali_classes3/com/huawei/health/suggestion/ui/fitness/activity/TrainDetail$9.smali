.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(ZLjava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;ZLjava/util/ArrayList;)V
    .locals 0

    .line 1890
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iput-boolean p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->e:Z

    iput-object p3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1893
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->e:Z

    if-eqz v0, :cond_0

    .line 1894
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rl_download_:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1895
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b()V

    .line 1896
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->o()V

    .line 1897
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->z(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/buv;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/buv;->e(Ljava/util/List;)V

    goto :goto_0

    .line 1899
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rl_download_:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1900
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->X(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 1901
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$9;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->U(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 1904
    :goto_0
    return-void
.end method

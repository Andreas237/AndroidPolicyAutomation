.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 1263
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1266
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->H(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 1268
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g:Lo/byf;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->I(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->t(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->r(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1270
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g:Lo/byf;

    if-eqz v0, :cond_0

    .line 1271
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->g:Lo/byf;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Lo/byf;->d(Landroid/graphics/drawable/Drawable;)V

    .line 1273
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->N(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1274
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->I(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_string_default:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1275
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->K(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_string_default:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1276
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->M(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/efy;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_string_default:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 1277
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->t(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1278
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->r(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1279
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_rl_download_:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1282
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1284
    :cond_2
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1286
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 1287
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1288
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->J(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1289
    return-void
.end method

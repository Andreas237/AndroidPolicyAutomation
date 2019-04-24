.class Lo/bxu$d;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bxu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field public b:Landroid/widget/ImageView;

.field final synthetic d:Lo/bxu;

.field public e:Lo/efy;


# direct methods
.method public constructor <init>(Lo/bxu;Landroid/view/View;)V
    .locals 1

    .line 936
    iput-object p1, p0, Lo/bxu$d;->d:Lo/bxu;

    .line 937
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 938
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_complete:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bxu$d;->b:Landroid/widget/ImageView;

    .line 939
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_workout_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu$d;->e:Lo/efy;

    .line 940
    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 6

    .line 959
    iget-object v0, p0, Lo/bxu$d;->d:Lo/bxu;

    iget-object v1, p0, Lo/bxu$d;->d:Lo/bxu;

    invoke-static {v1}, Lo/bxu;->c(Lo/bxu;)Lo/bxv;

    move-result-object v1

    invoke-virtual {v1}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/bxu;->c(Lo/bxu;Ljava/util/List;I)Lcom/huawei/health/suggestion/model/PlanWorkout;

    move-result-object v5

    .line 960
    if-eqz v5, :cond_0

    .line 961
    iget-object v0, p0, Lo/bxu$d;->d:Lo/bxu;

    invoke-static {v0}, Lo/bxu;->b(Lo/bxu;)Lo/byr;

    move-result-object v0

    invoke-virtual {v0}, Lo/byr;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_muti_workouts_name:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 963
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private e(I)I
    .locals 1

    .line 951
    iget-object v0, p0, Lo/bxu$d;->d:Lo/bxu;

    invoke-static {v0, p1}, Lo/bxu;->d(Lo/bxu;I)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 952
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->sug_day_workout_completed:I

    return v0

    .line 954
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->sug_day_workout_uncompleted:I

    return v0
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 943
    add-int/lit8 v2, p1, 0x1

    .line 944
    iget-object v0, p0, Lo/bxu$d;->b:Landroid/widget/ImageView;

    invoke-direct {p0, v2}, Lo/bxu$d;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 945
    iget-object v0, p0, Lo/bxu$d;->e:Lo/efy;

    invoke-direct {p0, v2}, Lo/bxu$d;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 946
    iget-object v0, p0, Lo/bxu$d;->e:Lo/efy;

    iget-object v1, p0, Lo/bxu$d;->d:Lo/bxu;

    invoke-static {v1}, Lo/bxu;->a(Lo/bxu;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 948
    return-void
.end method

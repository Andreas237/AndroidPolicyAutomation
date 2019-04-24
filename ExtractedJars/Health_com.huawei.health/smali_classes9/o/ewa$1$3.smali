.class Lo/ewa$1$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewa$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/ewa$1;


# direct methods
.method constructor <init>(Lo/ewa$1;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/ewa$1$3;->d:Lo/ewa$1;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 146
    const-string v0, "SleepServiceCardViewHolder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "i :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "s :"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void
.end method

.method public d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 1

    .line 152
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/brt;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 154
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 143
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, v0}, Lo/ewa$1$3;->d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method

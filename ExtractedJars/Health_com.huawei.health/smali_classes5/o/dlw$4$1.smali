.class Lo/dlw$4$1;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlw$4;->onFinish(Landroid/os/Bundle;)V
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
.field final synthetic b:Lo/dlw$4;


# direct methods
.method constructor <init>(Lo/dlw$4;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lo/dlw$4$1;->b:Lo/dlw$4;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 306
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitWorkout onFailure "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 303
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, v0}, Lo/dlw$4$1;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method

.method public e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 5

    .line 311
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 312
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitWorkout, onSuccess data is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/dlw$4$1;->b:Lo/dlw$4;

    iget-object v0, v0, Lo/dlw$4;->d:Lo/dlw;

    iget-object v0, v0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2712

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 315
    return-void

    .line 317
    :cond_0
    new-instance v4, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-direct {v4, p1}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;-><init>(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 318
    iget-object v0, p0, Lo/dlw$4$1;->b:Lo/dlw$4;

    iget-object v0, v0, Lo/dlw$4;->d:Lo/dlw;

    invoke-static {v0}, Lo/dlw;->a(Lo/dlw;)Lo/dlo;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dlo;->b(Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;)V

    .line 319
    return-void
.end method

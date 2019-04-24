.class Lo/bvf$c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bvf$c;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bvf$c;

.field final synthetic d:Lcom/huawei/health/suggestion/model/WorkoutRecord;


# direct methods
.method constructor <init>(Lo/bvf$c;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lo/bvf$c$2;->b:Lo/bvf$c;

    iput-object p2, p0, Lo/bvf$c$2;->d:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 345
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/bvf$c$2;->b:Lo/bvf$c;

    invoke-static {v0}, Lo/bvf$c;->e(Lo/bvf$c;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0}, Lo/efy;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 346
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 347
    const-string v0, "workout_record"

    iget-object v1, p0, Lo/bvf$c$2;->d:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 348
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 349
    const-string v0, "entrance"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 350
    iget-object v0, p0, Lo/bvf$c$2;->b:Lo/bvf$c;

    invoke-static {v0}, Lo/bvf$c;->e(Lo/bvf$c;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0}, Lo/efy;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 351
    return-void
.end method

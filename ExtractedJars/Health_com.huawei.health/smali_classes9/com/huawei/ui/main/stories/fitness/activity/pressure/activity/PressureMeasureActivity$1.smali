.class Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 67
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TO PressureMeasureResultActivity time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->c(Z)V

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureActivity;Ljava/lang/Class;)V

    .line 71
    return-void
.end method

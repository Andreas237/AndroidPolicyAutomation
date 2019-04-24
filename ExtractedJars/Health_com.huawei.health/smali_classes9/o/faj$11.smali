.class Lo/faj$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/faj;->setCoreSleepData(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/faj;


# direct methods
.method constructor <init>(Lo/faj;)V
    .locals 0

    .line 875
    iput-object p1, p0, Lo/faj$11;->e:Lo/faj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 878
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/faj$11;->e:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SleepTimeActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 879
    iget-object v0, p0, Lo/faj$11;->e:Lo/faj;

    invoke-static {v0}, Lo/faj;->f(Lo/faj;)Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDailyFallScore()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Lo/fiy;->e(I)I

    move-result v3

    .line 880
    const-string v0, "type"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 881
    const-string v0, "sleepTime"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 882
    const-string v0, "sleepTimeStatus"

    iget-object v1, p0, Lo/faj$11;->e:Lo/faj;

    invoke-static {v1}, Lo/faj;->g(Lo/faj;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 883
    iget-object v0, p0, Lo/faj$11;->e:Lo/faj;

    invoke-static {v0}, Lo/faj;->b(Lo/faj;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 884
    return-void
.end method

.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V
    .locals 0

    .line 551
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const-string v1, "measureEnd"

    const/high16 v2, 0x42c80000    # 100.0f

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;F)V

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "titleBar \u5173\u95ed\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 566
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " titleBar stopTimer()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    goto :goto_0

    .line 572
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u91cd\u542f\u540estressGameMainActivity.stressGameBindService \u4e3a\u7a7a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Z)Z

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)V

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->finish()V

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$9;->e:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->overridePendingTransition(II)V

    .line 578
    return-void
.end method

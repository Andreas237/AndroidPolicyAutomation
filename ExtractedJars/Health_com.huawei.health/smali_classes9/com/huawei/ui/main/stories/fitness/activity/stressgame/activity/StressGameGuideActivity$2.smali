.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f00\u59cb\u4f53\u9a8c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)V

    .line 101
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 102
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 103
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPressAutoMonitor()Z

    move-result v5

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adjust isSupportPressAutoMonitor() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Lo/exh;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    new-instance v1, Lo/exh;

    invoke-direct {v1}, Lo/exh;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;Lo/exh;)Lo/exh;

    .line 108
    :cond_0
    if-eqz v5, :cond_1

    .line 111
    invoke-static {}, Lo/fiz;->b()Lo/fiz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fiz;->b(Z)V

    .line 112
    invoke-static {}, Lo/fiz;->b()Lo/fiz;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/fiz;->c(Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->startActivity(Landroid/content/Intent;)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->finish()V

    goto :goto_0

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Lo/exh;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/exh;->a(Landroid/content/Context;)V

    .line 119
    :goto_0
    return-void

    .line 121
    :cond_2
    if-nez v4, :cond_3

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->Stress_game_guide_info_unbind_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 124
    :cond_3
    return-void
.end method

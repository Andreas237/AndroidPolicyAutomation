.class public Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$MessageReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MessageReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 263
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 266
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->l()Z

    move-result v0

    if-nez v0, :cond_2

    .line 267
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->l(Z)V

    .line 268
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 269
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 270
    const-string v0, "com.huawei.ui.pressure.measure"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measure MessageReceiver is end !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->c()Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 273
    :cond_0
    const-string v0, "com.huawei.ui.pressure.measure.suddenness"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 274
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MEASURE MessageReceiver is suddenness stop !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->c()Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;->sendEmptyMessage(I)Z

    .line 276
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->q()V

    .line 277
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/ewd;->g(I)V

    goto :goto_0

    .line 279
    :cond_1
    const-string v0, "com.huawei.ui.pressure.measure.err"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 280
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const-string v1, "isFromNoData"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lo/ewd;->c:Z

    .line 281
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->c()Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;->sendEmptyMessage(I)Z

    .line 282
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MEASURE MessageReceiver is err !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    :cond_2
    :goto_0
    return-void
.end method

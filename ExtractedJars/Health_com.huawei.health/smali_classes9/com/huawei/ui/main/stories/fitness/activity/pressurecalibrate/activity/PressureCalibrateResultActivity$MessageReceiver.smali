.class public Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$MessageReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MessageReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 319
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 322
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->l()Z

    move-result v0

    if-nez v0, :cond_2

    .line 323
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->l(Z)V

    .line 324
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 325
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 326
    const-string v0, "com.huawei.ui.pressure.calibrate"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrate MessageReceiver is end !!!action =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->d()Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$b;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$b;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 330
    :cond_0
    const-string v0, "com.huawei.ui.pressure.measure.calibrate.stop"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 332
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->d()Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$b;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$b;->sendEmptyMessage(I)Z

    .line 333
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrate MessageReceiver is suddenness stop !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->q()V

    .line 335
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/ewd;->g(I)V

    goto :goto_0

    .line 337
    :cond_1
    const-string v0, "com.huawei.ui.pressure.calibrate.err"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 339
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const-string v1, "isFromNoData"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/ewd;->a(Z)V

    .line 340
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity;->d()Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$b;

    move-result-object v0

    const/16 v1, 0x266

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateResultActivity$b;->sendEmptyMessage(I)Z

    .line 341
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrate MessageReceiver is err!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :cond_2
    :goto_0
    return-void
.end method

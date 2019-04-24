.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;)V
    .locals 0

    .line 628
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 629
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;Landroid/os/Message;)V
    .locals 7

    .line 633
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 635
    :pswitch_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 636
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_DAY_UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 638
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->a(Z)V

    .line 639
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 640
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timeStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v5

    .line 643
    :try_start_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 644
    invoke-virtual {v6, v4}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    move-object v5, v0

    .line 645
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "date = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 648
    goto :goto_0

    .line 646
    :catch_0
    move-exception v6

    .line 647
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    :goto_0
    iget-object v0, p1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->b(Ljava/util/Date;)V

    .line 650
    goto :goto_1

    .line 651
    :cond_0
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == msg.obj"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    iget-object v0, p1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->d:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c()V

    goto :goto_1

    .line 657
    :pswitch_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 658
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_WEEK_UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    iget-object v0, p1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepWeekDetailFragment;->c()V

    goto :goto_1

    .line 664
    :pswitch_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 665
    iget-object v0, p1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepMonthDetailFragment;->e()V

    goto :goto_1

    .line 667
    :cond_1
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == msg.obj"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    goto :goto_1

    .line 671
    :pswitch_3
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 672
    const-string v0, "UIHLH_FitnessSleepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_YEAR_UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    iget-object v0, p1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->d()V

    .line 680
    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x56ce
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 625
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity$c;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;Landroid/os/Message;)V

    return-void
.end method

.class Lo/ewh$5;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewh;-><init>(IILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ewh;


# direct methods
.method constructor <init>(Lo/ewh;JJ)V
    .locals 0

    .line 27
    iput-object p1, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 74
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->e(Lo/ewh;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->e(Lo/ewh;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 76
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ewh;->d(Lo/ewh;Ljava/util/List;)Ljava/util/List;

    .line 78
    :cond_0
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->a(Lo/ewh;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 79
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ewh;->e(Lo/ewh;Landroid/content/Intent;)Landroid/content/Intent;

    .line 81
    :cond_1
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->d(Lo/ewh;)Lo/ewh$a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 82
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->d(Lo/ewh;)Lo/ewh$a;

    move-result-object v0

    invoke-interface {v0}, Lo/ewh$a;->e()V

    .line 84
    :cond_2
    return-void
.end method

.method public onTick(J)V
    .locals 7

    .line 30
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CustTimerHelper current = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->e(Lo/ewh;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 32
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lo/ewh;->d(Lo/ewh;Ljava/util/List;)Ljava/util/List;

    .line 33
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTimeFlagList instance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    :cond_0
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->e(Lo/ewh;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->h()I

    move-result v0

    if-lez v0, :cond_1

    .line 37
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "first time !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewd;->d(I)V

    goto/16 :goto_1

    .line 40
    :cond_1
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    iget-object v1, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v1}, Lo/ewh;->e(Lo/ewh;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ewh;->e(Lo/ewh;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 41
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    iget-object v0, v0, Lo/ewd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 42
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PressureUtil.getInstance().mListBack.size() == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->f()I

    move-result v6

    .line 44
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PressureUtil.getInstance().mListBack.size() sum == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    if-gt v5, v6, :cond_4

    .line 46
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->i()I

    move-result v0

    if-lez v0, :cond_5

    .line 47
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewd;->a(I)V

    .line 48
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.huawei.ui.pressure.measure.suddenness"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lo/ewh;->e(Lo/ewh;Landroid/content/Intent;)Landroid/content/Intent;

    .line 50
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->b(Lo/ewh;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v1}, Lo/ewh;->a(Lo/ewh;)Landroid/content/Intent;

    move-result-object v1

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 51
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measure data is lose ,Timer is STOP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    :cond_2
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 54
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.huawei.ui.pressure.measure.calibrate.stop"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lo/ewh;->e(Lo/ewh;Landroid/content/Intent;)Landroid/content/Intent;

    .line 55
    iget-object v0, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v0}, Lo/ewh;->b(Lo/ewh;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ewh$5;->d:Lo/ewh;

    invoke-static {v1}, Lo/ewh;->a(Lo/ewh;)Landroid/content/Intent;

    move-result-object v1

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 56
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrate data is lose ,Timer is STOP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    :cond_3
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is lose ,Timer is STOP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->b(Z)V

    .line 60
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewd;->h(Z)V

    .line 61
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ewd;->i(Z)V

    .line 62
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->k(Z)V

    goto :goto_0

    .line 65
    :cond_4
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/ewd;->c(I)V

    .line 67
    :cond_5
    :goto_0
    goto :goto_1

    .line 68
    :cond_6
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "this is last time ,time = "

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

    .line 71
    :goto_1
    return-void
.end method

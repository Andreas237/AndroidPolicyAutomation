.class Lo/dez$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lo/dez;


# direct methods
.method public constructor <init>(Lo/dez;Landroid/os/Looper;)V
    .locals 0

    .line 2749
    iput-object p1, p0, Lo/dez$a;->b:Lo/dez;

    .line 2750
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2751
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 2755
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2756
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 2758
    :sswitch_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage() FitnessCommandID.COMMAND_FITNESS_SET_MOTION_GOAL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2759
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 2761
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-virtual {v0}, Lo/dez;->c()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 2764
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v6

    .line 2765
    const/4 v0, 0x1

    invoke-static {v0, v5, v6}, Lo/dfj;->d(ILcom/huawei/up/model/UserInfomation;I)V

    .line 2766
    goto/16 :goto_0

    .line 2769
    :sswitch_1
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage() FitnessCommandID.GET_FITNESS_GET_ACTIVITY_REMINDER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2770
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2771
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;

    .line 2772
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send other device configuration."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2776
    invoke-static {v4}, Lo/dfj;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V

    .line 2780
    :cond_0
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    iget-object v0, v0, Lo/dez;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dez$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/dez$c;-><init>(Lo/dez$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 2781
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->h(Lo/dez;)V

    .line 2782
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->g(Lo/dez;)V

    .line 2784
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->i(Lo/dez;)V

    .line 2786
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-virtual {v0}, Lo/dez;->k()V

    .line 2787
    goto/16 :goto_0

    .line 2789
    :sswitch_2
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage() FitnessCommandID.INTELLIGENT_HOME_SLEEP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2790
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2791
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x271a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2793
    :cond_1
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dez;->e(Lo/dez;I)I

    .line 2794
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->f(Lo/dez;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    .line 2795
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->m(Lo/dez;)V

    goto/16 :goto_0

    .line 2797
    :cond_2
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dez;->b(Lo/dez;I)I

    .line 2799
    goto/16 :goto_0

    .line 2801
    :sswitch_3
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage() FitnessCommandID.INTELLIGENT_HOME_SLEEP_THREE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2802
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2803
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x271b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2805
    :cond_3
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->n(Lo/dez;)I

    .line 2806
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connected_three "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v3}, Lo/dez;->l(Lo/dez;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2807
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->l(Lo/dez;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 2808
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->o(Lo/dez;)I

    .line 2809
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v3}, Lo/dez;->f(Lo/dez;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2810
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 2811
    const/16 v0, 0x271a

    iput v0, v4, Landroid/os/Message;->what:I

    .line 2812
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->a(Lo/dez;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 2815
    :cond_4
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->l(Lo/dez;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_5

    .line 2816
    iget-object v0, p0, Lo/dez$a;->b:Lo/dez;

    invoke-static {v0}, Lo/dez;->m(Lo/dez;)V

    .line 2823
    :cond_5
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2711 -> :sswitch_1
        0x271a -> :sswitch_2
        0x271b -> :sswitch_3
    .end sparse-switch
.end method

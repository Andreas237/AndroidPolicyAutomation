.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 1

    .line 1051
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1052
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$e;->a:Ljava/lang/ref/WeakReference;

    .line 1053
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$2;)V
    .locals 0

    .line 1048
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 1057
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1058
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 1059
    if-nez v7, :cond_0

    .line 1060
    return-void

    .line 1062
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1064
    :sswitch_0
    move-object v0, v7

    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->u(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)J

    move-result-wide v2

    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->q(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)J

    move-result-wide v4

    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->t(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Landroid/content/Context;JJI)V

    .line 1065
    goto :goto_0

    .line 1068
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Ljava/lang/Object;)V

    .line 1069
    .line 1074
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
    .end sparse-switch
.end method

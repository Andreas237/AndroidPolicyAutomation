.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 286
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 288
    :sswitch_0
    iget v3, p1, Landroid/os/Message;->arg1:I

    .line 289
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 290
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/emr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    goto :goto_0

    .line 292
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/emr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 294
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    goto :goto_0

    .line 296
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/emr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 299
    goto :goto_0

    .line 301
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 302
    goto :goto_0

    .line 304
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 305
    goto :goto_0

    .line 307
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_push_course_to_watch_success:I

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 308
    goto :goto_0

    .line 310
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$4;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->u()V

    .line 311
    .line 315
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_3
        0x2 -> :sswitch_4
        0x66 -> :sswitch_2
        0x67 -> :sswitch_1
    .end sparse-switch
.end method

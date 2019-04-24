.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 0

    .line 333
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 334
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Landroid/os/Message;)V
    .locals 2

    .line 338
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 340
    :pswitch_0
    iget v0, p2, Landroid/os/Message;->arg1:I

    if-nez v0, :cond_1

    .line 341
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 342
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->setResult(I)V

    .line 343
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->finish()V

    goto :goto_0

    .line 347
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 348
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    goto :goto_0

    .line 350
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    .line 352
    goto :goto_0

    .line 354
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->u(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    .line 355
    .line 359
    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 331
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$e;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Landroid/os/Message;)V

    return-void
.end method

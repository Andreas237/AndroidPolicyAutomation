.class Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)V
    .locals 0

    .line 438
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 439
    return-void
.end method

.method private c(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;Landroid/os/Message;)V
    .locals 4

    .line 442
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity for sleepLayout end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    iget v0, p2, Landroid/os/Message;->arg1:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 445
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b(Z)Z

    goto :goto_0

    .line 447
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b(Z)Z

    .line 449
    :goto_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 450
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d(Z)Z

    goto :goto_1

    .line 452
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d(Z)Z

    .line 455
    :goto_1
    invoke-static {}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 457
    invoke-static {p1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->a(Landroid/content/Context;)V

    goto :goto_2

    .line 460
    :cond_2
    invoke-static {p1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a()Z

    move-result v1

    invoke-static {}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b(Landroid/content/Context;ZZ)V

    .line 462
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->finish()V

    .line 463
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;Landroid/os/Message;)V
    .locals 4

    .line 468
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 470
    :sswitch_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->c(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;Landroid/os/Message;)V

    .line 471
    goto :goto_1

    .line 473
    :goto_0
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull msg is not sleep"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 435
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->b(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;Landroid/os/Message;)V

    return-void
.end method

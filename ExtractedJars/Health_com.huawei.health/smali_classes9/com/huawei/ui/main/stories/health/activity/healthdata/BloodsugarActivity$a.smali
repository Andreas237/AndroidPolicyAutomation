.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$a;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V
    .locals 0

    .line 425
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 426
    return-void
.end method


# virtual methods
.method protected e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;Landroid/os/Message;)V
    .locals 5

    .line 430
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 432
    :sswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 433
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull, data is null ,return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    return-void

    .line 436
    :cond_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 437
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 438
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 439
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    .line 440
    goto :goto_0

    .line 444
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lo/fhv;->d(Landroid/content/Context;Landroid/os/Message;)V

    .line 445
    .line 449
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x6e -> :sswitch_1
        0x6f -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 423
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$a;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;Landroid/os/Message;)V

    return-void
.end method

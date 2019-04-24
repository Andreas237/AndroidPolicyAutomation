.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V
    .locals 0

    .line 443
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 444
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;Landroid/os/Message;)V
    .locals 1

    .line 448
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 451
    :sswitch_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;Z)V

    .line 452
    goto :goto_0

    .line 455
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V

    .line 456
    .line 460
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 440
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$e;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;Landroid/os/Message;)V

    return-void
.end method

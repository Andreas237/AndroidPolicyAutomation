.class public Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 74
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;Landroid/os/Message;)V
    .locals 1

    .line 78
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 80
    :sswitch_0
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->c()V

    .line 81
    goto :goto_0

    .line 83
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;)V

    .line 84
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->a()V

    .line 85
    .line 90
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
        0x6 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 70
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;->d(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;Landroid/os/Message;)V

    return-void
.end method

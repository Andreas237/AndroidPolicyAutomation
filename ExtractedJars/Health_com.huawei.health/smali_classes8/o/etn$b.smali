.class Lo/etn$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/etn;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/etn;)V
    .locals 0

    .line 379
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 380
    return-void
.end method


# virtual methods
.method protected c(Lo/etn;Landroid/os/Message;)V
    .locals 4

    .line 384
    if-nez p1, :cond_0

    .line 385
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepTrendCardData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    return-void

    .line 388
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 390
    :sswitch_0
    invoke-static {p1}, Lo/etn;->c(Lo/etn;)V

    .line 391
    goto :goto_0

    .line 393
    :sswitch_1
    invoke-static {p1}, Lo/etn;->f(Lo/etn;)V

    .line 394
    .line 398
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 376
    move-object v0, p1

    check-cast v0, Lo/etn;

    invoke-virtual {p0, v0, p2}, Lo/etn$b;->c(Lo/etn;Landroid/os/Message;)V

    return-void
.end method

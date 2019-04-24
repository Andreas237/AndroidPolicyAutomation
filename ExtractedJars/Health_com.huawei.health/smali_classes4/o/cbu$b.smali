.class Lo/cbu$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cbu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cbu;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lo/cbu;)V
    .locals 1

    .line 3366
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3367
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cbu$b;->c:Ljava/lang/ref/WeakReference;

    .line 3368
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 3372
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UIHandler()  handleMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3373
    iget-object v0, p0, Lo/cbu$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cbu;

    .line 3374
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 3375
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UIHandler()  manager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3376
    return-void

    .line 3378
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 3380
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "PointProcessed"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cgn;

    .line 3381
    invoke-static {v4, v5}, Lo/cbu;->e(Lo/cbu;Lo/cgn;)V

    .line 3382
    goto :goto_0

    .line 3384
    :sswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "savesport"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    .line 3385
    invoke-static {v4, v6}, Lo/cbu;->c(Lo/cbu;Z)V

    .line 3386
    goto :goto_0

    .line 3389
    :sswitch_2
    const/4 v0, 0x2

    invoke-static {v4, v0}, Lo/cbu;->b(Lo/cbu;I)V

    .line 3390
    goto :goto_0

    .line 3392
    :sswitch_3
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lo/cbu;->b(Lo/cbu;I)V

    .line 3393
    goto :goto_0

    .line 3395
    :sswitch_4
    const/4 v0, 0x3

    invoke-static {v4, v0}, Lo/cbu;->b(Lo/cbu;I)V

    .line 3396
    goto :goto_0

    .line 3398
    :sswitch_5
    invoke-static {v4}, Lo/cbu;->m(Lo/cbu;)V

    .line 3399
    .line 3403
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 3404
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_2
        0x5 -> :sswitch_3
        0x6 -> :sswitch_4
        0xca -> :sswitch_0
        0x12d -> :sswitch_5
        0x44d -> :sswitch_1
    .end sparse-switch
.end method

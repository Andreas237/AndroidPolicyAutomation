.class Lo/cec$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cec;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/cec;)V
    .locals 1

    .line 568
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 566
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cec$d;->c:Ljava/lang/ref/WeakReference;

    .line 569
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cec$d;->c:Ljava/lang/ref/WeakReference;

    .line 570
    return-void
.end method

.method synthetic constructor <init>(Lo/cec;Lo/cec$4;)V
    .locals 0

    .line 565
    invoke-direct {p0, p1}, Lo/cec$d;-><init>(Lo/cec;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 574
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 575
    iget-object v0, p0, Lo/cec$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cec;

    .line 576
    if-nez v4, :cond_0

    .line 577
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mediaPlayerVoiceEng weakReference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    return-void

    .line 580
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 582
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 583
    invoke-static {v4, v5}, Lo/cec;->e(Lo/cec;Ljava/lang/String;)V

    .line 584
    goto :goto_0

    .line 586
    :sswitch_1
    invoke-virtual {v4}, Lo/cec;->e()V

    .line 587
    .line 591
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
    .end sparse-switch
.end method

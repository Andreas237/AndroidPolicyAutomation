.class Lo/ffi$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ffi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ffi;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/ffi;)V
    .locals 1

    .line 523
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 524
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ffi$c;->d:Ljava/lang/ref/WeakReference;

    .line 525
    return-void
.end method

.method synthetic constructor <init>(Lo/ffi;Lo/ffi$5;)V
    .locals 0

    .line 520
    invoke-direct {p0, p1}, Lo/ffi$c;-><init>(Lo/ffi;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 529
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 530
    iget-object v0, p0, Lo/ffi$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ffi;

    .line 531
    if-nez v1, :cond_0

    .line 532
    return-void

    .line 534
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 536
    :sswitch_0
    invoke-static {v1}, Lo/ffi;->a(Lo/ffi;)V

    .line 537
    goto :goto_0

    .line 540
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1, v0}, Lo/ffi;->e(Lo/ffi;Ljava/lang/Object;)V

    .line 541
    .line 546
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
    .end sparse-switch
.end method

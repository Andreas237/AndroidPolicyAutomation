.class Lo/ewu$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ewu;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/ewu;)V
    .locals 1

    .line 340
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 341
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ewu$b;->e:Ljava/lang/ref/WeakReference;

    .line 342
    return-void
.end method

.method synthetic constructor <init>(Lo/ewu;Lo/ewu$5;)V
    .locals 0

    .line 338
    invoke-direct {p0, p1}, Lo/ewu$b;-><init>(Lo/ewu;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 345
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 346
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 348
    :sswitch_0
    iget-object v0, p0, Lo/ewu$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ewu;

    .line 349
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 350
    invoke-static {v2}, Lo/ewu;->b(Lo/ewu;)I

    move-result v0

    const/16 v1, 0x3c

    if-gt v0, v1, :cond_0

    invoke-static {v2}, Lo/ewu;->b(Lo/ewu;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 351
    invoke-static {v2}, Lo/ewu;->e(Lo/ewu;)V

    .line 358
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

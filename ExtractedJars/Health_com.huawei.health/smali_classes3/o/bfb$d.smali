.class Lo/bfb$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bfb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/bfb;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/bfb;)V
    .locals 1

    .line 286
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 283
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfb$d;->c:Ljava/lang/ref/WeakReference;

    .line 287
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bfb$d;->c:Ljava/lang/ref/WeakReference;

    .line 288
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 293
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 294
    iget-object v0, p0, Lo/bfb$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bfb;

    .line 295
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 297
    return-void

    .line 299
    :cond_0
    iget v5, p1, Landroid/os/Message;->what:I

    .line 300
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    .line 304
    :sswitch_0
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/bfb;->a(Z)V

    .line 305
    const/16 v0, 0xa

    const/16 v1, 0x7eb

    const-wide/16 v2, 0x1f4

    invoke-static {v0, v1, v2, v3}, Lo/apf;->d(IIJ)V

    .line 307
    goto :goto_0

    .line 311
    :sswitch_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/bfb;->a(Z)V

    .line 312
    goto :goto_0

    .line 316
    :sswitch_2
    iget-object v6, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 317
    if-eqz v6, :cond_1

    .line 319
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/bfb;->e(Lo/bfb;Ljava/lang/String;)V

    goto :goto_0

    .line 325
    :sswitch_3
    invoke-static {v4}, Lo/bfb;->a(Lo/bfb;)V

    .line 326
    .line 331
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_2
        0x15 -> :sswitch_3
        0x7ea -> :sswitch_0
        0x7eb -> :sswitch_1
    .end sparse-switch
.end method

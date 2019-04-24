.class Lo/cur$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cur;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cur;


# direct methods
.method constructor <init>(Lo/cur;Landroid/os/Looper;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/cur$1;->d:Lo/cur;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 45
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 47
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/HashMap;

    .line 48
    iget-object v0, p0, Lo/cur$1;->d:Lo/cur;

    invoke-static {v0}, Lo/cur;->b(Lo/cur;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/cur$1$4;

    invoke-direct {v1, p0, v2}, Lo/cur$1$4;-><init>(Lo/cur$1;Ljava/util/HashMap;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 55
    goto :goto_0

    .line 58
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 59
    iget-object v0, p0, Lo/cur$1;->d:Lo/cur;

    invoke-static {v0}, Lo/cur;->b(Lo/cur;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/cur$1$3;

    invoke-direct {v1, p0, v2}, Lo/cur$1$3;-><init>(Lo/cur$1;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 66
    .line 72
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 73
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

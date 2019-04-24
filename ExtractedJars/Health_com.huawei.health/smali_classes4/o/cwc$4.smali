.class Lo/cwc$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;Landroid/os/Looper;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lo/cwc$4;->a:Lo/cwc;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 379
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 380
    iget v1, p1, Landroid/os/Message;->what:I

    .line 381
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    .line 383
    :sswitch_0
    iget-object v0, p0, Lo/cwc$4;->a:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->k(Lo/cwc;)V

    .line 384
    .line 389
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

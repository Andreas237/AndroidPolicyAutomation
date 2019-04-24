.class Lo/cmt$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/cmt;


# direct methods
.method public constructor <init>(Lo/cmt;Landroid/os/Looper;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/cmt$a;->d:Lo/cmt;

    .line 63
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 64
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 68
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 69
    if-eqz p1, :cond_0

    .line 70
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 72
    :sswitch_0
    iget-object v0, p0, Lo/cmt$a;->d:Lo/cmt;

    iget-object v1, p0, Lo/cmt$a;->d:Lo/cmt;

    invoke-static {v1}, Lo/cmt;->d(Lo/cmt;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cmt;->b(Ljava/lang/String;)V

    .line 73
    .line 78
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

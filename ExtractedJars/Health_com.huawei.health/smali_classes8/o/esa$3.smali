.class Lo/esa$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/esa;


# direct methods
.method constructor <init>(Lo/esa;Landroid/os/Looper;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/esa$3;->b:Lo/esa;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 63
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 64
    if-eqz p1, :cond_0

    .line 65
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 67
    :sswitch_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 69
    iget-object v0, p0, Lo/esa$3;->b:Lo/esa;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/esa;->d(Lo/esa;I)V

    .line 77
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x107e97 -> :sswitch_0
    .end sparse-switch
.end method

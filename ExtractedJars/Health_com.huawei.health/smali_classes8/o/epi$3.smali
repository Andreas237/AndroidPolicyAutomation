.class Lo/epi$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/epi;


# direct methods
.method constructor <init>(Lo/epi;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lo/epi$3;->d:Lo/epi;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 255
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 256
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 259
    :sswitch_0
    iget-object v0, p0, Lo/epi$3;->d:Lo/epi;

    invoke-static {v0}, Lo/epi;->b(Lo/epi;)V

    .line 260
    goto :goto_0

    .line 262
    :sswitch_1
    iget-object v0, p0, Lo/epi$3;->d:Lo/epi;

    invoke-static {v0}, Lo/epi;->d(Lo/epi;)V

    .line 263
    .line 266
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
        0x7 -> :sswitch_1
    .end sparse-switch
.end method

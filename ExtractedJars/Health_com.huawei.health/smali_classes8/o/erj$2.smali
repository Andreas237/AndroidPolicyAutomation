.class Lo/erj$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/erj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/erj;


# direct methods
.method constructor <init>(Lo/erj;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/erj$2;->a:Lo/erj;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 139
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 140
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 142
    :sswitch_0
    iget-object v0, p0, Lo/erj$2;->a:Lo/erj;

    invoke-static {v0, p1}, Lo/erj;->a(Lo/erj;Landroid/os/Message;)V

    .line 143
    goto :goto_0

    .line 145
    :sswitch_1
    iget-object v0, p0, Lo/erj$2;->a:Lo/erj;

    invoke-static {v0, p1}, Lo/erj;->e(Lo/erj;Landroid/os/Message;)V

    .line 146
    .line 150
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3ea -> :sswitch_1
    .end sparse-switch
.end method

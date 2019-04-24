.class Lo/dko$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dko;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dko;


# direct methods
.method constructor <init>(Lo/dko;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/dko$3;->b:Lo/dko;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 70
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 71
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 73
    :sswitch_0
    iget-object v0, p0, Lo/dko$3;->b:Lo/dko;

    invoke-static {v0}, Lo/dko;->d(Lo/dko;)V

    .line 75
    iget-object v0, p0, Lo/dko$3;->b:Lo/dko;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dko;->c(I)V

    .line 76
    .line 80
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

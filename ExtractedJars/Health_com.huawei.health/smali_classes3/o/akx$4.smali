.class Lo/akx$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akx;


# direct methods
.method constructor <init>(Lo/akx;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/akx$4;->a:Lo/akx;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 115
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 117
    :sswitch_0
    iget-object v0, p0, Lo/akx$4;->a:Lo/akx;

    invoke-static {v0}, Lo/akx;->e(Lo/akx;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget v0, p1, Landroid/os/Message;->arg1:I

    if-lez v0, :cond_0

    .line 118
    const/16 v0, 0x3e8

    invoke-virtual {p0, v0}, Lo/akx$4;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 119
    iget v0, p1, Landroid/os/Message;->arg1:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 120
    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, v2, v0, v1}, Lo/akx$4;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 121
    goto :goto_0

    .line 122
    :cond_0
    iget-object v0, p0, Lo/akx$4;->a:Lo/akx;

    invoke-static {v0}, Lo/akx;->c(Lo/akx;)V

    .line 124
    goto :goto_0

    .line 127
    :sswitch_1
    iget-object v0, p0, Lo/akx$4;->a:Lo/akx;

    invoke-virtual {v0}, Lo/akx;->c()V

    .line 128
    goto :goto_0

    .line 132
    :sswitch_2
    goto :goto_0

    .line 135
    :sswitch_3
    iget-object v0, p0, Lo/akx$4;->a:Lo/akx;

    invoke-static {v0}, Lo/akx;->d(Lo/akx;)V

    .line 138
    .line 142
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
        0x3e9 -> :sswitch_1
        0x3ea -> :sswitch_2
        0x7d0 -> :sswitch_3
    .end sparse-switch
.end method

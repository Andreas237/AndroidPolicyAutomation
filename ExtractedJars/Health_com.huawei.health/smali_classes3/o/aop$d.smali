.class Lo/aop$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lo/aop;


# direct methods
.method public constructor <init>(Lo/aop;Landroid/os/Looper;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lo/aop$d;->d:Lo/aop;

    .line 217
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 218
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 223
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 225
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 229
    :pswitch_0
    iget-object v0, p0, Lo/aop$d;->d:Lo/aop;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/aop;->b(Lo/aop;I)V

    .line 230
    goto :goto_0

    .line 232
    :pswitch_1
    iget-object v0, p0, Lo/aop$d;->d:Lo/aop;

    invoke-static {v0}, Lo/aop;->c(Lo/aop;)V

    .line 233
    goto :goto_0

    .line 235
    :pswitch_2
    iget-object v0, p0, Lo/aop$d;->d:Lo/aop;

    invoke-static {v0}, Lo/aop;->a(Lo/aop;)V

    .line 236
    .line 240
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

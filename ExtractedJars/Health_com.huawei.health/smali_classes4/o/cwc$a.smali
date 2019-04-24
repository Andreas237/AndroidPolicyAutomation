.class Lo/cwc$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lo/cwc;


# direct methods
.method public constructor <init>(Lo/cwc;Landroid/os/Looper;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/cwc$a;->b:Lo/cwc;

    .line 142
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 143
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 146
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 147
    iget v4, p1, Landroid/os/Message;->what:I

    .line 148
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 150
    :pswitch_0
    iget-object v0, p0, Lo/cwc$a;->b:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->d(Lo/cwc;)Lo/cwc$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lo/cwc$a;->b:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->d(Lo/cwc;)Lo/cwc$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/cwc$c;->d()V

    .line 152
    iget-object v0, p0, Lo/cwc$a;->b:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->e(Lo/cwc;)Lo/cwc$a;

    move-result-object v0

    const/16 v1, 0x7d1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/cwc$a;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 157
    :pswitch_1
    iget-object v0, p0, Lo/cwc$a;->b:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->d(Lo/cwc;)Lo/cwc$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/cwc$a;->b:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->d(Lo/cwc;)Lo/cwc$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/cwc$c;->e()V

    goto :goto_0

    .line 163
    :pswitch_2
    iget-object v0, p0, Lo/cwc$a;->b:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->d(Lo/cwc;)Lo/cwc$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lo/cwc$a;->b:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->d(Lo/cwc;)Lo/cwc$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/cwc$c;->b()V

    .line 173
    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x7d1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

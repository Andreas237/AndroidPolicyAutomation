.class Lo/ety$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ety;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ety;


# direct methods
.method constructor <init>(Lo/ety;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/ety$2;->a:Lo/ety;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 102
    iget v4, p1, Landroid/os/Message;->what:I

    .line 103
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 105
    :pswitch_0
    iget-object v0, p0, Lo/ety$2;->a:Lo/ety;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/ety;->e(Lo/ety;I)V

    .line 106
    goto :goto_1

    .line 108
    :pswitch_1
    iget-object v0, p0, Lo/ety$2;->a:Lo/ety;

    invoke-static {v0}, Lo/ety;->a(Lo/ety;)V

    .line 109
    goto :goto_1

    .line 111
    :pswitch_2
    iget-object v0, p0, Lo/ety$2;->a:Lo/ety;

    invoke-static {v0}, Lo/ety;->d(Lo/ety;)V

    .line 112
    goto :goto_1

    .line 114
    :pswitch_3
    iget-object v0, p0, Lo/ety$2;->a:Lo/ety;

    invoke-static {v0}, Lo/ety;->c(Lo/ety;)V

    .line 115
    goto :goto_1

    .line 117
    :pswitch_4
    iget-object v0, p0, Lo/ety$2;->a:Lo/ety;

    invoke-static {v0}, Lo/ety;->e(Lo/ety;)V

    .line 118
    goto :goto_1

    .line 120
    :pswitch_5
    iget-object v0, p0, Lo/ety$2;->a:Lo/ety;

    invoke-static {v0}, Lo/ety;->i(Lo/ety;)V

    .line 121
    goto :goto_1

    .line 123
    :goto_0
    :pswitch_6
    const-string v0, "HeartRateStatusInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :goto_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 128
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

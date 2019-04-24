.class Lo/arn$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arn;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/arn;


# direct methods
.method constructor <init>(Lo/arn;Landroid/os/Looper;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lo/arn$1;->b:Lo/arn;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 186
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 188
    return-void

    .line 190
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 195
    :pswitch_0
    iget-object v0, p0, Lo/arn$1;->b:Lo/arn;

    invoke-static {v0}, Lo/arn;->d(Lo/arn;)V

    .line 196
    goto :goto_0

    .line 201
    :pswitch_1
    iget-object v0, p0, Lo/arn$1;->b:Lo/arn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/arn;->d(Lo/arn;Z)V

    .line 202
    goto :goto_0

    .line 206
    :pswitch_2
    iget-object v0, p0, Lo/arn$1;->b:Lo/arn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/arn;->d(Lo/arn;Z)V

    .line 207
    goto :goto_0

    .line 211
    :pswitch_3
    iget-object v0, p0, Lo/arn$1;->b:Lo/arn;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/arn;->a(Lo/arn;Ljava/lang/Object;)V

    .line 212
    .line 217
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 218
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.class Lo/aib$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aib;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aib;


# direct methods
.method constructor <init>(Lo/aib;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/aib$2;->c:Lo/aib;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 112
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDevSoftApTaskHandler msg.what:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 114
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 116
    :pswitch_0
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->b(Lo/aib;)Lo/aib$e;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 117
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    new-instance v1, Lo/aib$e;

    iget-object v2, p0, Lo/aib$2;->c:Lo/aib;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/aib$e;-><init>(Lo/aib;Lo/aib$2;)V

    invoke-static {v0, v1}, Lo/aib;->e(Lo/aib;Lo/aib$e;)Lo/aib$e;

    .line 119
    :cond_0
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->e(Lo/aib;)Lo/aib$d;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 120
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    new-instance v1, Lo/aib$d;

    iget-object v2, p0, Lo/aib$2;->c:Lo/aib;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/aib$d;-><init>(Lo/aib;Lo/aib$2;)V

    invoke-static {v0, v1}, Lo/aib;->d(Lo/aib;Lo/aib$d;)Lo/aib$d;

    .line 122
    :cond_1
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->e(Lo/aib;)Lo/aib$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/aib$d;->b()V

    .line 123
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->b(Lo/aib;)Lo/aib$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/aib$e;->d()V

    .line 125
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->c(Lo/aib;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/32 v2, 0xd6d8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 126
    goto :goto_1

    .line 128
    :pswitch_1
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->d(Lo/aib;)V

    .line 129
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->a(Lo/aib;)Lo/ajm;

    move-result-object v0

    const-string v1, "send data success"

    invoke-interface {v0, v1}, Lo/ajm;->onSuccess(Ljava/lang/Object;)V

    .line 130
    goto :goto_1

    .line 133
    :pswitch_2
    iget-object v0, p0, Lo/aib$2;->c:Lo/aib;

    invoke-static {v0}, Lo/aib;->d(Lo/aib;)V

    .line 134
    goto :goto_1

    .line 136
    :goto_0
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDevSoftApTaskHandler default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 139
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

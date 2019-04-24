.class Lo/ahr$e;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lo/ahr;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/ahr;Landroid/os/Looper;)V
    .locals 0

    .line 85
    invoke-direct {p0, p1, p2}, Lo/aju;-><init>(Ljava/lang/Object;Landroid/os/Looper;)V

    .line 86
    return-void
.end method


# virtual methods
.method public a(Lo/ahr;Landroid/os/Message;)V
    .locals 4

    .line 90
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 92
    :pswitch_0
    invoke-static {p1}, Lo/ahr;->d(Lo/ahr;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    invoke-static {p1}, Lo/ahr;->a(Lo/ahr;)V

    goto :goto_1

    .line 97
    :pswitch_1
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1, v0}, Lo/ahr;->b(Lo/ahr;Ljava/util/List;)Ljava/util/List;

    .line 98
    invoke-static {p1}, Lo/ahr;->c(Lo/ahr;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p1}, Lo/ahr;->c(Lo/ahr;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 99
    invoke-static {p1}, Lo/ahr;->e(Lo/ahr;)V

    goto :goto_1

    .line 101
    :cond_0
    invoke-static {p1}, Lo/ahr;->b(Lo/ahr;)V

    .line 103
    goto :goto_1

    .line 105
    :pswitch_2
    invoke-static {p1}, Lo/ahr;->g(Lo/ahr;)V

    .line 106
    goto :goto_1

    .line 108
    :pswitch_3
    invoke-static {p1}, Lo/ahr;->k(Lo/ahr;)V

    .line 109
    goto :goto_1

    .line 111
    :goto_0
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unknown Message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 114
    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 82
    move-object v0, p1

    check-cast v0, Lo/ahr;

    invoke-virtual {p0, v0, p2}, Lo/ahr$e;->a(Lo/ahr;Landroid/os/Message;)V

    return-void
.end method

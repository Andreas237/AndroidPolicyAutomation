.class Lo/ajy$e;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ajy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lo/ajy;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/ajy;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 59
    return-void
.end method


# virtual methods
.method public c(Lo/ajy;Landroid/os/Message;)V
    .locals 4

    .line 63
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 64
    :cond_0
    return-void

    .line 66
    :cond_1
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 68
    :pswitch_0
    invoke-static {p1}, Lo/ajy;->e(Lo/ajy;)V

    .line 69
    goto :goto_1

    .line 73
    :pswitch_1
    iget v0, p2, Landroid/os/Message;->what:I

    invoke-static {p1, v0}, Lo/ajy;->c(Lo/ajy;I)V

    .line 74
    goto :goto_1

    .line 76
    :goto_0
    const-string v0, "TimerHandler what:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 56
    move-object v0, p1

    check-cast v0, Lo/ajy;

    invoke-virtual {p0, v0, p2}, Lo/ajy$e;->c(Lo/ajy;Landroid/os/Message;)V

    return-void
.end method

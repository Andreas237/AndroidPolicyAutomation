.class Lo/ahw$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lo/ahw;


# direct methods
.method public constructor <init>(Lo/ahw;Landroid/os/Looper;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/ahw$b;->c:Lo/ahw;

    .line 189
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 190
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 194
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 195
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 197
    :pswitch_0
    iget-object v0, p0, Lo/ahw$b;->c:Lo/ahw;

    invoke-static {v0}, Lo/ahw;->c(Lo/ahw;)V

    .line 198
    goto :goto_1

    .line 200
    :pswitch_1
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/ahw$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 201
    goto :goto_1

    .line 203
    :pswitch_2
    iget-object v0, p0, Lo/ahw$b;->c:Lo/ahw;

    invoke-static {v0}, Lo/ahw;->b(Lo/ahw;)V

    .line 204
    goto :goto_1

    .line 206
    :pswitch_3
    iget-object v0, p0, Lo/ahw$b;->c:Lo/ahw;

    invoke-static {v0}, Lo/ahw;->d(Lo/ahw;)V

    .line 207
    goto :goto_1

    .line 209
    :goto_0
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClaimHandler what is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

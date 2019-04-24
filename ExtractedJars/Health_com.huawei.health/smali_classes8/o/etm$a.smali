.class Lo/etm$a;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/etm;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/etm;)V
    .locals 0

    .line 241
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 242
    return-void
.end method


# virtual methods
.method protected c(Lo/etm;Landroid/os/Message;)V
    .locals 1

    .line 246
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 248
    :pswitch_0
    invoke-virtual {p1}, Lo/etm;->f()V

    .line 249
    goto :goto_0

    .line 251
    :pswitch_1
    invoke-static {p1}, Lo/etm;->c(Lo/etm;)V

    .line 252
    goto :goto_0

    .line 254
    :pswitch_2
    invoke-virtual {p1}, Lo/etm;->h()V

    .line 255
    .line 259
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 238
    move-object v0, p1

    check-cast v0, Lo/etm;

    invoke-virtual {p0, v0, p2}, Lo/etm$a;->c(Lo/etm;Landroid/os/Message;)V

    return-void
.end method

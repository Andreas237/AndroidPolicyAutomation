.class public Lo/fhz$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fhz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/fhz;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/fhz;


# direct methods
.method public constructor <init>(Lo/fhz;Landroid/os/Looper;Lo/fhz;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lo/fhz$e;->c:Lo/fhz;

    .line 204
    invoke-direct {p0, p2, p3}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 205
    return-void
.end method


# virtual methods
.method protected d(Lo/fhz;Landroid/os/Message;)V
    .locals 4

    .line 214
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 216
    :sswitch_0
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 217
    const-string v0, "token"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 218
    const-string v0, "agrUrl"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 219
    iget-object v0, p0, Lo/fhz$e;->c:Lo/fhz;

    invoke-static {v0, v2, v3}, Lo/fhz;->c(Lo/fhz;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 224
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2712 -> :sswitch_0
    .end sparse-switch
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 209
    invoke-super {p0, p1}, Lo/dbb;->handleMessage(Landroid/os/Message;)V

    .line 210
    return-void
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 202
    move-object v0, p1

    check-cast v0, Lo/fhz;

    invoke-virtual {p0, v0, p2}, Lo/fhz$e;->d(Lo/fhz;Landroid/os/Message;)V

    return-void
.end method

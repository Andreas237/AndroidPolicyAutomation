.class public Lo/fhl$a;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fhl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/fhl;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/fhl;


# direct methods
.method public constructor <init>(Lo/fhl;Landroid/os/Looper;Lo/fhl;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/fhl$a;->e:Lo/fhl;

    .line 86
    invoke-direct {p0, p2, p3}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 87
    return-void
.end method


# virtual methods
.method protected d(Lo/fhl;Landroid/os/Message;)V
    .locals 4

    .line 96
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 98
    :sswitch_0
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 99
    const-string v0, "token"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 100
    const-string v0, "agrUrl"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 101
    iget-object v0, p0, Lo/fhl$a;->e:Lo/fhl;

    invoke-static {v0, v2, v3}, Lo/fhl;->c(Lo/fhl;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 106
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2712 -> :sswitch_0
    .end sparse-switch
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 91
    invoke-super {p0, p1}, Lo/dbb;->handleMessage(Landroid/os/Message;)V

    .line 92
    return-void
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 84
    move-object v0, p1

    check-cast v0, Lo/fhl;

    invoke-virtual {p0, v0, p2}, Lo/fhl$a;->d(Lo/fhl;Landroid/os/Message;)V

    return-void
.end method

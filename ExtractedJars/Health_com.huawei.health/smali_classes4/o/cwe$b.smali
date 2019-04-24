.class public Lo/cwe$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/cwe;>;"
    }
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field final synthetic e:Lo/cwe;


# direct methods
.method public constructor <init>(Lo/cwe;Landroid/os/Looper;Lo/cwe;)V
    .locals 1

    .line 2195
    iput-object p1, p0, Lo/cwe$b;->e:Lo/cwe;

    .line 2196
    invoke-direct {p0, p2, p3}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 2199
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwe$b;->c:Ljava/lang/String;

    .line 2197
    return-void
.end method


# virtual methods
.method protected b(Lo/cwe;Landroid/os/Message;)V
    .locals 4

    .line 2210
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 2212
    :sswitch_0
    invoke-virtual {p2}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 2213
    const-string v0, "token"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2214
    const-string v0, "agrUrl"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2215
    iget-object v0, p0, Lo/cwe$b;->e:Lo/cwe;

    iget-object v0, v0, Lo/cwe;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    .line 2216
    iget-object v0, p0, Lo/cwe$b;->e:Lo/cwe;

    invoke-static {v0, v2, v3}, Lo/cwe;->c(Lo/cwe;Ljava/lang/String;Ljava/lang/String;)V

    .line 2218
    :cond_0
    iget-object v0, p0, Lo/cwe$b;->e:Lo/cwe;

    iget-object v0, v0, Lo/cwe;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    .line 2219
    iget-object v0, p0, Lo/cwe$b;->e:Lo/cwe;

    invoke-static {v0, v2, v3}, Lo/cwe;->b(Lo/cwe;Ljava/lang/String;Ljava/lang/String;)V

    .line 2225
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2712 -> :sswitch_0
    .end sparse-switch
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 0

    .line 2203
    invoke-super {p0, p1}, Lo/dbb;->handleMessage(Landroid/os/Message;)V

    .line 2204
    return-void
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 2194
    move-object v0, p1

    check-cast v0, Lo/cwe;

    invoke-virtual {p0, v0, p2}, Lo/cwe$b;->b(Lo/cwe;Landroid/os/Message;)V

    return-void
.end method

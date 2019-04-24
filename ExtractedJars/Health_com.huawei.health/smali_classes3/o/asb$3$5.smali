.class Lo/asb$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asb$3;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/asb$3;


# direct methods
.method constructor <init>(Lo/asb$3;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lo/asb$3$5;->b:Lo/asb$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 186
    invoke-virtual {p0, p1}, Lo/asb$3$5;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 190
    iget-object v0, p0, Lo/asb$3$5;->b:Lo/asb$3;

    iget-object v0, v0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v0, p1}, Lo/asb;->c(Lo/asb;Lo/bra;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 192
    iget-object v0, p0, Lo/asb$3$5;->b:Lo/asb$3;

    iget-object v0, v0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v0}, Lo/asb;->c(Lo/asb;)V

    .line 194
    iget-object v0, p0, Lo/asb$3$5;->b:Lo/asb$3;

    iget-object v0, v0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v0}, Lo/asb;->d(Lo/asb;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lo/asb$3$5;->b:Lo/asb$3;

    iget-object v0, v0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v0}, Lo/asb;->d(Lo/asb;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 197
    const/4 v0, 0x2

    iput v0, v2, Landroid/os/Message;->what:I

    .line 198
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 199
    const-string v0, "keyContactMatchResult"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 200
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 201
    iget-object v0, p0, Lo/asb$3$5;->b:Lo/asb$3;

    iget-object v0, v0, Lo/asb$3;->a:Lo/asb;

    invoke-static {v0}, Lo/asb;->d(Lo/asb;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 203
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

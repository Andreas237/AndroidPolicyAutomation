.class Lo/fke$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eey;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fke;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fke;


# direct methods
.method constructor <init>(Lo/fke;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/fke$1;->b:Lo/fke;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(II)V
    .locals 4

    .line 93
    iget-object v0, p0, Lo/fke$1;->b:Lo/fke;

    invoke-static {v0}, Lo/fke;->b(Lo/fke;)Lo/fkg;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lo/fke$1;->b:Lo/fke;

    invoke-static {v0}, Lo/fke;->b(Lo/fke;)Lo/fkg;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lo/fkg;->a(JI)V

    .line 96
    :cond_0
    iget-object v0, p0, Lo/fke$1;->b:Lo/fke;

    invoke-static {v0, p2}, Lo/fke;->e(Lo/fke;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, p0, Lo/fke$1;->b:Lo/fke;

    invoke-static {v0}, Lo/fke;->e(Lo/fke;)Lo/fke$d;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 98
    iget-object v0, p0, Lo/fke$1;->b:Lo/fke;

    invoke-static {v0}, Lo/fke;->e(Lo/fke;)Lo/fke$d;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lo/fke$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 99
    iput p2, v3, Landroid/os/Message;->arg1:I

    .line 100
    iget-object v0, p0, Lo/fke$1;->b:Lo/fke;

    invoke-static {v0}, Lo/fke;->e(Lo/fke;)Lo/fke$d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/fke$d;->sendMessage(Landroid/os/Message;)Z

    .line 104
    :cond_1
    return-void
.end method

.class Lo/fha$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fha;


# direct methods
.method constructor <init>(Lo/fha;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/fha$5;->a:Lo/fha;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 83
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 84
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x100

    if-ne v0, v1, :cond_2

    .line 85
    iget-object v0, p0, Lo/fha$5;->a:Lo/fha;

    invoke-static {v0}, Lo/fha;->c(Lo/fha;)Lo/fha$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/fha$5;->a:Lo/fha;

    invoke-static {v0}, Lo/fha;->c(Lo/fha;)Lo/fha$a;

    move-result-object v0

    iget-object v1, p0, Lo/fha$5;->a:Lo/fha;

    .line 87
    invoke-virtual {v1}, Lo/fha;->getCurrentPosition()I

    move-result v1

    iget-object v2, p0, Lo/fha$5;->a:Lo/fha;

    invoke-virtual {v2}, Lo/fha;->getSelectionItem()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fha$a;->e(ILjava/lang/Object;)V

    .line 89
    :cond_0
    iget-object v0, p0, Lo/fha$5;->a:Lo/fha;

    invoke-static {v0}, Lo/fha;->e(Lo/fha;)Lo/fha;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 90
    iget-object v0, p0, Lo/fha$5;->a:Lo/fha;

    invoke-static {v0}, Lo/fha;->d(Lo/fha;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 91
    iget-object v0, p0, Lo/fha$5;->a:Lo/fha;

    invoke-static {v0}, Lo/fha;->e(Lo/fha;)Lo/fha;

    move-result-object v0

    iget-object v1, p0, Lo/fha$5;->a:Lo/fha;

    invoke-static {v1}, Lo/fha;->d(Lo/fha;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lo/fha$5;->a:Lo/fha;

    invoke-static {v2}, Lo/fha;->a(Lo/fha;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lo/fha$5;->a:Lo/fha;

    .line 92
    invoke-virtual {v3}, Lo/fha;->getCurrentPosition()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 91
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fha;->a(Ljava/util/List;)V

    goto :goto_0

    .line 95
    :cond_1
    new-instance v0, Lo/fhf;

    const-string v1, "JoinList is error."

    invoke-direct {v0, v1}, Lo/fhf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_2
    :goto_0
    return-void
.end method

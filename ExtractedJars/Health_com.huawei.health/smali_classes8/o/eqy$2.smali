.class Lo/eqy$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eqy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eqy;


# direct methods
.method constructor <init>(Lo/eqy;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/eqy$2;->b:Lo/eqy;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 95
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 96
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 98
    :sswitch_0
    iget-object v0, p0, Lo/eqy$2;->b:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->b(Lo/eqy;)Lo/eqz;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqz;->b()V

    .line 99
    iget-object v0, p0, Lo/eqy$2;->b:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->d(Lo/eqy;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 100
    iget-object v0, p0, Lo/eqy$2;->b:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->b(Lo/eqy;)Lo/eqz;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/eqz;->a(I)V

    goto :goto_0

    .line 102
    :cond_0
    iget-object v0, p0, Lo/eqy$2;->b:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->b(Lo/eqy;)Lo/eqz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eqz;->a(I)V

    .line 104
    .line 108
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

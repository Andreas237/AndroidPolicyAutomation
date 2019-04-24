.class Lo/exh$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/exf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exh;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/exh;


# direct methods
.method constructor <init>(Lo/exh;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lo/exh$4;->c:Lo/exh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 441
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 442
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 443
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 444
    iget-object v0, p0, Lo/exh$4;->c:Lo/exh;

    invoke-static {v0}, Lo/exh;->f(Lo/exh;)Lo/exh$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/exh$a;->sendMessage(Landroid/os/Message;)Z

    .line 445
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    .line 449
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 450
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 451
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 452
    iget-object v0, p0, Lo/exh$4;->c:Lo/exh;

    invoke-static {v0}, Lo/exh;->f(Lo/exh;)Lo/exh$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/exh$a;->sendMessage(Landroid/os/Message;)Z

    .line 453
    return-void
.end method

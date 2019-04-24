.class Lo/exh$7$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/exf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exh$7;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/exh$7;


# direct methods
.method constructor <init>(Lo/exh$7;)V
    .locals 0

    .line 308
    iput-object p1, p0, Lo/exh$7$4;->e:Lo/exh$7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 311
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 312
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 313
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 314
    iget-object v0, p0, Lo/exh$7$4;->e:Lo/exh$7;

    iget-object v0, v0, Lo/exh$7;->d:Lo/exh;

    invoke-static {v0}, Lo/exh;->f(Lo/exh;)Lo/exh$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/exh$a;->sendMessage(Landroid/os/Message;)Z

    .line 315
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    .line 319
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 320
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 321
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 322
    iget-object v0, p0, Lo/exh$7$4;->e:Lo/exh$7;

    iget-object v0, v0, Lo/exh$7;->d:Lo/exh;

    invoke-static {v0}, Lo/exh;->f(Lo/exh;)Lo/exh$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/exh$a;->sendMessage(Landroid/os/Message;)Z

    .line 323
    return-void
.end method

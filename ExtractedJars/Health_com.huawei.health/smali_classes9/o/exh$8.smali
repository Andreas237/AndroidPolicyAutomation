.class Lo/exh$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/exf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exh;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exh;


# direct methods
.method constructor <init>(Lo/exh;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lo/exh$8;->a:Lo/exh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 256
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 257
    const/4 v0, 0x2

    iput v0, v1, Landroid/os/Message;->what:I

    .line 258
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 259
    iget-object v0, p0, Lo/exh$8;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->f(Lo/exh;)Lo/exh$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/exh$a;->sendMessage(Landroid/os/Message;)Z

    .line 260
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    .line 264
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 265
    const/4 v0, 0x2

    iput v0, v1, Landroid/os/Message;->what:I

    .line 266
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 267
    iget-object v0, p0, Lo/exh$8;->a:Lo/exh;

    invoke-static {v0}, Lo/exh;->f(Lo/exh;)Lo/exh$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/exh$a;->sendMessage(Landroid/os/Message;)Z

    .line 268
    return-void
.end method

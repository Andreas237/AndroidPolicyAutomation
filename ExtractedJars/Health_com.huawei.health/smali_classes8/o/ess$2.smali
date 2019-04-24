.class Lo/ess$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ess;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ess;


# direct methods
.method constructor <init>(Lo/ess;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/ess$2;->a:Lo/ess;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 62
    iget-object v0, p0, Lo/ess$2;->a:Lo/ess;

    invoke-static {v0}, Lo/ess;->d(Lo/ess;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 63
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 64
    iget-object v0, p0, Lo/ess$2;->a:Lo/ess;

    invoke-static {v0}, Lo/ess;->d(Lo/ess;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 65
    return-void
.end method

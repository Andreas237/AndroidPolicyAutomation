.class Lo/eiz$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eiz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eiz;


# direct methods
.method constructor <init>(Lo/eiz;Landroid/os/Looper;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lo/eiz$3;->c:Lo/eiz;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 23
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 24
    iget-object v0, p0, Lo/eiz$3;->c:Lo/eiz;

    invoke-static {v0}, Lo/eiz;->a(Lo/eiz;)V

    .line 25
    return-void

    .line 28
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 30
    return-void
.end method

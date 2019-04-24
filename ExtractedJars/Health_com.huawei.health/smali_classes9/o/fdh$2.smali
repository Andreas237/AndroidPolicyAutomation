.class Lo/fdh$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fdh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fdh;


# direct methods
.method constructor <init>(Lo/fdh;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lo/fdh$2;->a:Lo/fdh;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 55
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 56
    iget-object v0, p0, Lo/fdh$2;->a:Lo/fdh;

    invoke-static {v0}, Lo/fdh;->a(Lo/fdh;)I

    move-result v0

    iget-object v1, p0, Lo/fdh$2;->a:Lo/fdh;

    invoke-static {v1}, Lo/fdh;->b(Lo/fdh;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 57
    iget-object v0, p0, Lo/fdh$2;->a:Lo/fdh;

    invoke-static {v0}, Lo/fdh;->c(Lo/fdh;)V

    .line 58
    iget-object v0, p0, Lo/fdh$2;->a:Lo/fdh;

    invoke-static {v0}, Lo/fdh;->e(Lo/fdh;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 60
    :cond_0
    iget-object v0, p0, Lo/fdh$2;->a:Lo/fdh;

    invoke-static {v0}, Lo/fdh;->d(Lo/fdh;)V

    .line 62
    :goto_0
    return-void
.end method

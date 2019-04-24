.class Lo/fle$4$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fle$4;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fle$4;


# direct methods
.method constructor <init>(Lo/fle$4;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/fle$4$4;->e:Lo/fle$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 62
    iget-object v0, p0, Lo/fle$4$4;->e:Lo/fle$4;

    iget-object v0, v0, Lo/fle$4;->b:Lo/fle;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fle;->smoothScrollToPosition(I)V

    .line 64
    iget-object v0, p0, Lo/fle$4$4;->e:Lo/fle$4;

    iget-object v0, v0, Lo/fle$4;->b:Lo/fle;

    invoke-static {v0}, Lo/fle;->a(Lo/fle;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    iget-object v0, p0, Lo/fle$4$4;->e:Lo/fle$4;

    iget-object v0, v0, Lo/fle$4;->b:Lo/fle;

    invoke-static {v0}, Lo/fle;->d(Lo/fle;)Lo/fld;

    move-result-object v0

    invoke-virtual {v0}, Lo/fld;->c()V

    .line 66
    iget-object v0, p0, Lo/fle$4$4;->e:Lo/fle$4;

    iget-object v0, v0, Lo/fle$4;->b:Lo/fle;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fle;->e(Lo/fle;Z)Z

    .line 69
    :cond_0
    return-void
.end method

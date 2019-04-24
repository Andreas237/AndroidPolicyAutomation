.class Lo/ale$58;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 597
    iput-object p1, p0, Lo/ale$58;->a:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 600
    iget-object v0, p0, Lo/ale$58;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->a()V

    .line 601
    iget-object v0, p0, Lo/ale$58;->a:Lo/ale;

    iget-object v1, p0, Lo/ale$58;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/etv;->b(Landroid/content/Context;)Lo/etv;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;Lo/etv;)Lo/etv;

    .line 604
    iget-object v0, p0, Lo/ale$58;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->c(Lo/ale;)V

    .line 605
    iget-object v0, p0, Lo/ale$58;->a:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->u()V

    .line 607
    invoke-static {}, Lo/cbj;->d()Lo/cbj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbj;->a()V

    .line 608
    return-void
.end method

.class Lo/acd$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private a:Lo/aby;

.field private b:Lo/ace;

.field private c:Lo/acf;

.field final synthetic d:Lo/acd;


# direct methods
.method public constructor <init>(Lo/acd;Lo/acf;Lo/ace;Lo/aby;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lo/acd$c;->d:Lo/acd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 452
    iput-object p2, p0, Lo/acd$c;->c:Lo/acf;

    .line 453
    iput-object p3, p0, Lo/acd$c;->b:Lo/ace;

    .line 454
    iput-object p4, p0, Lo/acd$c;->a:Lo/aby;

    .line 455
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 460
    iget-object v0, p0, Lo/acd$c;->c:Lo/acf;

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v4

    .line 462
    const/4 v0, 0x1

    if-eq v4, v0, :cond_0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 463
    :cond_0
    iget-object v0, p0, Lo/acd$c;->d:Lo/acd;

    invoke-virtual {v0}, Lo/acd;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 464
    return-void

    .line 467
    :cond_1
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v5

    .line 468
    if-eqz v5, :cond_2

    .line 469
    iget-object v0, p0, Lo/acd$c;->a:Lo/aby;

    const/16 v1, 0x3e9

    invoke-interface {v0, v1}, Lo/aby;->onStateChanged(I)V

    goto :goto_0

    .line 471
    :cond_2
    iget-object v0, p0, Lo/acd$c;->d:Lo/acd;

    invoke-static {v0}, Lo/acd;->a(Lo/acd;)Lo/acc;

    move-result-object v0

    iget-object v1, p0, Lo/acd$c;->c:Lo/acf;

    iget-object v2, p0, Lo/acd$c;->b:Lo/ace;

    iget-object v3, p0, Lo/acd$c;->a:Lo/aby;

    invoke-virtual {v0, v1, v2, v3}, Lo/acc;->c(Lo/acf;Lo/ace;Lo/aby;)Ljava/lang/Boolean;

    .line 473
    :goto_0
    return-void
.end method

.class Lo/awj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/awj;

.field final synthetic c:Lo/awj$a;


# direct methods
.method constructor <init>(Lo/awj;Lo/awj$a;)V
    .locals 0

    .line 453
    iput-object p1, p0, Lo/awj$5;->b:Lo/awj;

    iput-object p2, p0, Lo/awj$5;->c:Lo/awj$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 458
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/awj$5;->b:Lo/awj;

    iget-object v2, p0, Lo/awj$5;->c:Lo/awj$a;

    invoke-static {v1, v2}, Lo/awj;->d(Lo/awj;Lo/awj$a;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 459
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 464
    iget-object v0, p0, Lo/awj$5;->c:Lo/awj$a;

    if-eqz v0, :cond_1

    .line 466
    move v1, p1

    .line 467
    if-nez v1, :cond_0

    .line 469
    move v1, p2

    .line 471
    :cond_0
    iget-object v0, p0, Lo/awj$5;->c:Lo/awj$a;

    invoke-interface {v0, v1}, Lo/awj$a;->c(I)V

    .line 473
    :cond_1
    return-void
.end method

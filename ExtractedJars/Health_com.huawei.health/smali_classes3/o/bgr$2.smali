.class Lo/bgr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgr;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/bgr;


# direct methods
.method constructor <init>(Lo/bgr;)V
    .locals 0

    .line 433
    iput-object p1, p0, Lo/bgr$2;->c:Lo/bgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 433
    invoke-virtual {p0, p1}, Lo/bgr$2;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 439
    iget-object v0, p0, Lo/bgr$2;->c:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->k(Lo/bgr;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqx;->d(Ljava/lang/String;)V

    .line 440
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-object v1, p0, Lo/bgr$2;->c:Lo/bgr;

    invoke-static {v1}, Lo/bgr;->k(Lo/bgr;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/ast;->a(J)Lo/axv;

    move-result-object v4

    .line 441
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/bgr$2;->c:Lo/bgr;

    invoke-static {v1}, Lo/bgr;->k(Lo/bgr;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->e(J)Z

    move-result v5

    .line 443
    if-eqz v4, :cond_0

    .line 445
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-object v1, p0, Lo/bgr$2;->c:Lo/bgr;

    invoke-static {v1}, Lo/bgr;->k(Lo/bgr;)J

    move-result-wide v1

    invoke-virtual {v4}, Lo/axv;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/ast;->b(JLjava/lang/String;)Z

    .line 447
    :cond_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

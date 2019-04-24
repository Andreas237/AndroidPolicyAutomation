.class final Lo/bfz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfz;->a(J)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 301
    iput-wide p1, p0, Lo/bfz$4;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 301
    invoke-virtual {p0, p1}, Lo/bfz$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 307
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bfz$4;->c:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->c(JI)Z

    move-result v4

    .line 308
    if-eqz v4, :cond_0

    .line 311
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bfz$4;->c:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->b(JI)V

    .line 313
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bfz$4;->c:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->e(J)V

    .line 316
    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

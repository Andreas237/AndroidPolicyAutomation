.class final Lo/bde$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bde;->d(J)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic b:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 440
    iput-wide p1, p0, Lo/bde$2;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 440
    invoke-virtual {p0, p1}, Lo/bde$2;->b(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Void;
    .locals 4

    .line 446
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bde$2;->b:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->c(JI)Z

    .line 448
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bde$2;->b:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->b(JI)V

    .line 450
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/bde$2;->b:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->e(J)V

    .line 451
    const/4 v0, 0x0

    return-object v0
.end method

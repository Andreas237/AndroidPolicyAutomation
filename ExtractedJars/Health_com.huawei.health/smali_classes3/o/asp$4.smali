.class final Lo/asp$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asp;->c(Lo/asp;J)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/asp;

.field final synthetic c:J


# direct methods
.method constructor <init>(Lo/asp;J)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/asp$4;->b:Lo/asp;

    iput-wide p2, p0, Lo/asp$4;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 80
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/asp$4;->b:Lo/asp;

    iget-wide v2, p0, Lo/asp$4;->c:J

    invoke-static {v1, v2, v3}, Lo/asp;->b(Lo/asp;J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 81
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 86
    iget-object v0, p0, Lo/asp$4;->b:Lo/asp;

    const/16 v1, 0x12f2

    invoke-static {v0, v1, p1, p2}, Lo/asp;->c(Lo/asp;III)V

    .line 87
    return-void
.end method

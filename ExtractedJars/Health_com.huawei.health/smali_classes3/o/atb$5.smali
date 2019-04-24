.class final Lo/atb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atb;->a(J)Lo/brd;
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
.field final synthetic d:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 177
    iput-wide p1, p0, Lo/atb$5;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 177
    invoke-virtual {p0, p1}, Lo/atb$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 181
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/atb$5;->d:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/atc;->e(JZ)Z

    .line 182
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

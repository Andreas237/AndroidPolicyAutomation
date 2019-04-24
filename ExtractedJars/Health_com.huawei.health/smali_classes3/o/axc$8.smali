.class final Lo/axc$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axc;->c(Lo/axc;J)Lo/brd;
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

.field final synthetic e:Lo/axc;


# direct methods
.method constructor <init>(JLo/axc;)V
    .locals 0

    .line 424
    iput-wide p1, p0, Lo/axc$8;->c:J

    iput-object p3, p0, Lo/axc$8;->e:Lo/axc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 424
    invoke-virtual {p0, p1}, Lo/axc$8;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 428
    iget-wide v0, p0, Lo/axc$8;->c:J

    iget-object v2, p0, Lo/axc$8;->e:Lo/axc;

    invoke-static {v0, v1, v2}, Lo/axc;->e(JLo/axc;)V

    .line 429
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

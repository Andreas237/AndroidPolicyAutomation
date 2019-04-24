.class public Lo/fny;
.super Lo/fnt;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo/fmw;Lo/fmt;)V
    .locals 3

    .line 83
    invoke-direct {p0, p2}, Lo/fnt;-><init>(Lo/fmt;)V

    .line 85
    const/4 v0, 0x4

    new-array v2, v0, [Lo/fod;

    new-instance v0, Lo/fnx;

    invoke-direct {v0}, Lo/fnx;-><init>()V

    const/4 v1, 0x0

    aput-object v0, v2, v1

    new-instance v0, Lo/fof;

    invoke-direct {v0, p1}, Lo/fof;-><init>(Lo/fmw;)V

    const/4 v1, 0x1

    aput-object v0, v2, v1

    new-instance v0, Lo/fnq;

    invoke-direct {v0, p1}, Lo/fnq;-><init>(Lo/fmw;)V

    const/4 v1, 0x2

    aput-object v0, v2, v1

    new-instance v0, Lo/fnz;

    invoke-direct {v0}, Lo/fnz;-><init>()V

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 91
    invoke-virtual {p0, v2}, Lo/fny;->e([Lo/fod;)V

    .line 94
    return-void
.end method

.class public Lo/ers;
.super Lo/erq;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 10
    invoke-direct {p0}, Lo/erq;-><init>()V

    .line 11
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 13
    const/16 v0, 0x15

    iput v0, p0, Lo/ers;->d:I

    .line 16
    const/16 v0, 0x19

    iput v0, p0, Lo/ers;->c:I

    .line 19
    const/16 v0, 0x1d

    iput v0, p0, Lo/ers;->b:I

    .line 22
    const/16 v0, 0x21

    iput v0, p0, Lo/ers;->e:I

    .line 25
    const/16 v0, 0x25

    iput v0, p0, Lo/ers;->a:I

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ers;->i:Z

    goto :goto_0

    .line 34
    :cond_0
    if-nez p1, :cond_1

    .line 36
    const/16 v0, 0x19

    iput v0, p0, Lo/ers;->d:I

    .line 39
    const/16 v0, 0x1f

    iput v0, p0, Lo/ers;->c:I

    .line 42
    const/16 v0, 0x23

    iput v0, p0, Lo/ers;->b:I

    .line 45
    const/16 v0, 0x29

    iput v0, p0, Lo/ers;->e:I

    .line 48
    const/16 v0, 0x2e

    iput v0, p0, Lo/ers;->a:I

    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ers;->i:Z

    goto :goto_0

    .line 59
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ers;->i:Z

    .line 62
    :goto_0
    return-void
.end method

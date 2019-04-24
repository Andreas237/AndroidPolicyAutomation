.class public Lo/ero;
.super Lo/erq;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 11
    invoke-direct {p0}, Lo/erq;-><init>()V

    .line 12
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 14
    const/16 v0, 0x1a

    iput v0, p0, Lo/ero;->d:I

    .line 17
    const/16 v0, 0x1f

    iput v0, p0, Lo/ero;->c:I

    .line 20
    const/16 v0, 0x24

    iput v0, p0, Lo/ero;->b:I

    .line 23
    const/16 v0, 0x29

    iput v0, p0, Lo/ero;->e:I

    .line 26
    const/16 v0, 0x2e

    iput v0, p0, Lo/ero;->a:I

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ero;->i:Z

    goto :goto_0

    .line 35
    :cond_0
    if-nez p1, :cond_1

    .line 37
    const/16 v0, 0x1f

    iput v0, p0, Lo/ero;->d:I

    .line 40
    const/16 v0, 0x25

    iput v0, p0, Lo/ero;->c:I

    .line 43
    const/16 v0, 0x2b

    iput v0, p0, Lo/ero;->b:I

    .line 46
    const/16 v0, 0x32

    iput v0, p0, Lo/ero;->e:I

    .line 49
    const/16 v0, 0x38

    iput v0, p0, Lo/ero;->a:I

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ero;->i:Z

    goto :goto_0

    .line 60
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ero;->i:Z

    .line 64
    :goto_0
    return-void
.end method

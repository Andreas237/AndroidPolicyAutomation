.class public Lo/erp;
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
    const/16 v0, 0x18

    iput v0, p0, Lo/erp;->d:I

    .line 16
    const/16 v0, 0x1d

    iput v0, p0, Lo/erp;->c:I

    .line 19
    const/16 v0, 0x21

    iput v0, p0, Lo/erp;->b:I

    .line 22
    const/16 v0, 0x25

    iput v0, p0, Lo/erp;->e:I

    .line 25
    const/16 v0, 0x2a

    iput v0, p0, Lo/erp;->a:I

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/erp;->i:Z

    goto :goto_0

    .line 34
    :cond_0
    if-nez p1, :cond_1

    .line 36
    const/16 v0, 0x1c

    iput v0, p0, Lo/erp;->d:I

    .line 39
    const/16 v0, 0x22

    iput v0, p0, Lo/erp;->c:I

    .line 42
    const/16 v0, 0x28

    iput v0, p0, Lo/erp;->b:I

    .line 45
    const/16 v0, 0x2d

    iput v0, p0, Lo/erp;->e:I

    .line 48
    const/16 v0, 0x33

    iput v0, p0, Lo/erp;->a:I

    .line 55
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/erp;->i:Z

    goto :goto_0

    .line 59
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/erp;->i:Z

    .line 62
    :goto_0
    return-void
.end method

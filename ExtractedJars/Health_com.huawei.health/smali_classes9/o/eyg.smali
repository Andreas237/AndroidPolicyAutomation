.class public Lo/eyg;
.super Lo/ehz;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:I


# direct methods
.method public constructor <init>(FFI)V
    .locals 1

    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ehz;-><init>(FF)V

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lo/eyg;->a:F

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lo/eyg;->b:I

    .line 24
    iput p2, p0, Lo/eyg;->a:F

    .line 25
    iput p3, p0, Lo/eyg;->b:I

    .line 26
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 33
    iget v0, p0, Lo/eyg;->b:I

    return v0
.end method

.method public e()F
    .locals 1

    .line 29
    iget v0, p0, Lo/eyg;->a:F

    return v0
.end method

.class public final Lo/ol;
.super Lo/om;
.source "SourceFile"


# instance fields
.field private final a:Lo/om;


# direct methods
.method public constructor <init>(Lo/om;)V
    .locals 2

    .line 30
    invoke-virtual {p1}, Lo/om;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Lo/om;->getHeight()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/om;-><init>(II)V

    .line 31
    iput-object p1, p0, Lo/ol;->a:Lo/om;

    .line 32
    return-void
.end method


# virtual methods
.method public crop(IIII)Lo/om;
    .locals 2

    .line 62
    new-instance v0, Lo/ol;

    iget-object v1, p0, Lo/ol;->a:Lo/om;

    invoke-virtual {v1, p1, p2, p3, p4}, Lo/om;->crop(IIII)Lo/om;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ol;-><init>(Lo/om;)V

    return-object v0
.end method

.method public getMatrix()[B
    .locals 6

    .line 46
    iget-object v0, p0, Lo/ol;->a:Lo/om;

    invoke-virtual {v0}, Lo/om;->getMatrix()[B

    move-result-object v2

    .line 47
    invoke-virtual {p0}, Lo/ol;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/ol;->getHeight()I

    move-result v1

    mul-int v3, v0, v1

    .line 48
    new-array v4, v3, [B

    .line 49
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 50
    aget-byte v0, v2, v5

    and-int/lit16 v0, v0, 0xff

    rsub-int v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 49
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 52
    :cond_0
    return-object v4
.end method

.method public getRow(I[B)[B
    .locals 4

    .line 36
    iget-object v0, p0, Lo/ol;->a:Lo/om;

    invoke-virtual {v0, p1, p2}, Lo/om;->getRow(I[B)[B

    move-result-object p2

    .line 37
    invoke-virtual {p0}, Lo/ol;->getWidth()I

    move-result v2

    .line 38
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 39
    aget-byte v0, p2, v3

    and-int/lit16 v0, v0, 0xff

    rsub-int v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, p2, v3

    .line 38
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 41
    :cond_0
    return-object p2
.end method

.method public invert()Lo/om;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/ol;->a:Lo/om;

    return-object v0
.end method

.method public isCropSupported()Z
    .locals 1

    .line 57
    iget-object v0, p0, Lo/ol;->a:Lo/om;

    invoke-virtual {v0}, Lo/om;->isCropSupported()Z

    move-result v0

    return v0
.end method

.method public isRotateSupported()Z
    .locals 1

    .line 67
    iget-object v0, p0, Lo/ol;->a:Lo/om;

    invoke-virtual {v0}, Lo/om;->isRotateSupported()Z

    move-result v0

    return v0
.end method

.method public rotateCounterClockwise()Lo/om;
    .locals 2

    .line 80
    new-instance v0, Lo/ol;

    iget-object v1, p0, Lo/ol;->a:Lo/om;

    invoke-virtual {v1}, Lo/om;->rotateCounterClockwise()Lo/om;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ol;-><init>(Lo/om;)V

    return-object v0
.end method

.method public rotateCounterClockwise45()Lo/om;
    .locals 2

    .line 85
    new-instance v0, Lo/ol;

    iget-object v1, p0, Lo/ol;->a:Lo/om;

    invoke-virtual {v1}, Lo/om;->rotateCounterClockwise45()Lo/om;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ol;-><init>(Lo/om;)V

    return-object v0
.end method

.class public abstract Lo/om;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final height:I

.field private final width:I


# direct methods
.method protected constructor <init>(II)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p1, p0, Lo/om;->width:I

    .line 35
    iput p2, p0, Lo/om;->height:I

    .line 36
    return-void
.end method


# virtual methods
.method public crop(IIII)Lo/om;
    .locals 2

    .line 94
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This luminance source does not support cropping."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getHeight()I
    .locals 1

    .line 73
    iget v0, p0, Lo/om;->height:I

    return v0
.end method

.method public abstract getMatrix()[B
.end method

.method public abstract getRow(I[B)[B
.end method

.method public final getWidth()I
    .locals 1

    .line 66
    iget v0, p0, Lo/om;->width:I

    return v0
.end method

.method public invert()Lo/om;
    .locals 1

    .line 109
    new-instance v0, Lo/ol;

    invoke-direct {v0, p0}, Lo/ol;-><init>(Lo/om;)V

    return-object v0
.end method

.method public isCropSupported()Z
    .locals 1

    .line 80
    const/4 v0, 0x0

    return v0
.end method

.method public isRotateSupported()Z
    .locals 1

    .line 101
    const/4 v0, 0x0

    return v0
.end method

.method public rotateCounterClockwise()Lo/om;
    .locals 2

    .line 119
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This luminance source does not support rotation by 90 degrees."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public rotateCounterClockwise45()Lo/om;
    .locals 2

    .line 129
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This luminance source does not support rotation by 45 degrees."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 134
    iget v0, p0, Lo/om;->width:I

    new-array v3, v0, [B

    .line 135
    new-instance v4, Ljava/lang/StringBuilder;

    iget v0, p0, Lo/om;->height:I

    iget v1, p0, Lo/om;->width:I

    add-int/lit8 v1, v1, 0x1

    mul-int/2addr v0, v1

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 136
    const/4 v5, 0x0

    :goto_0
    iget v0, p0, Lo/om;->height:I

    if-ge v5, v0, :cond_4

    .line 137
    invoke-virtual {p0, v5, v3}, Lo/om;->getRow(I[B)[B

    move-result-object v3

    .line 138
    const/4 v6, 0x0

    :goto_1
    iget v0, p0, Lo/om;->width:I

    if-ge v6, v0, :cond_3

    .line 139
    aget-byte v0, v3, v6

    and-int/lit16 v7, v0, 0xff

    .line 141
    const/16 v0, 0x40

    if-ge v7, v0, :cond_0

    .line 142
    const/16 v8, 0x23

    goto :goto_2

    .line 143
    :cond_0
    const/16 v0, 0x80

    if-ge v7, v0, :cond_1

    .line 144
    const/16 v8, 0x2b

    goto :goto_2

    .line 145
    :cond_1
    const/16 v0, 0xc0

    if-ge v7, v0, :cond_2

    .line 146
    const/16 v8, 0x2e

    goto :goto_2

    .line 148
    :cond_2
    const/16 v8, 0x20

    .line 150
    :goto_2
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 138
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 152
    :cond_3
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 154
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

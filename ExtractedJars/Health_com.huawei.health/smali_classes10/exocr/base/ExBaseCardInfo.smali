.class public abstract Lexocr/base/ExBaseCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field protected bitmap:Landroid/graphics/Bitmap;

.field protected charCount:I

.field protected numbers:[C

.field protected rects:[Landroid/graphics/Rect;

.field protected strNumbers:Ljava/lang/String;

.field protected timeend:J

.field protected timestart:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 83
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getCharCount()I
    .locals 1

    .line 51
    iget v0, p0, Lexocr/base/ExBaseCardInfo;->charCount:I

    return v0
.end method

.method public getNumbers()[C
    .locals 1

    .line 14
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->numbers:[C

    .line 15
    return-object v0
.end method

.method public getStrNumbers()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->strNumbers:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 7

    .line 137
    iget-wide v0, p0, Lexocr/base/ExBaseCardInfo;->timeend:J

    iget-wide v2, p0, Lexocr/base/ExBaseCardInfo;->timestart:J

    sub-long v4, v0, v2

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardNumber:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lexocr/base/ExBaseCardInfo;->strNumbers:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRecoTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 142
    return-object v6
.end method

.method public getTimeend()J
    .locals 2

    .line 126
    iget-wide v0, p0, Lexocr/base/ExBaseCardInfo;->timeend:J

    return-wide v0
.end method

.method public getTimestart()J
    .locals 2

    .line 116
    iget-wide v0, p0, Lexocr/base/ExBaseCardInfo;->timestart:J

    return-wide v0
.end method

.method public replaceBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 93
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 95
    return-void

    .line 97
    :cond_0
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 101
    :cond_1
    iput-object p1, p0, Lexocr/base/ExBaseCardInfo;->bitmap:Landroid/graphics/Bitmap;

    .line 103
    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lexocr/base/ExBaseCardInfo;->bitmap:Landroid/graphics/Bitmap;

    .line 89
    return-void
.end method

.method public setCharCount(I)V
    .locals 0

    .line 56
    iput p1, p0, Lexocr/base/ExBaseCardInfo;->charCount:I

    .line 57
    return-void
.end method

.method public setNumbers([C)V
    .locals 4

    .line 20
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 22
    array-length v2, p1

    .line 23
    new-array v3, v2, [C

    .line 24
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    iput-object v3, p0, Lexocr/base/ExBaseCardInfo;->numbers:[C

    .line 27
    :cond_0
    return-void
.end method

.method public setNumbersAtIndex(CI)V
    .locals 2

    .line 31
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->numbers:[C

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->numbers:[C

    array-length v0, v0

    if-ge p2, v0, :cond_0

    .line 33
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->numbers:[C

    aput-char p1, v0, p2

    .line 35
    :cond_0
    return-void
.end method

.method public setRectsAtIndex(Landroid/graphics/Rect;I)V
    .locals 2

    .line 41
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->rects:[Landroid/graphics/Rect;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->rects:[Landroid/graphics/Rect;

    array-length v0, v0

    if-ge p2, v0, :cond_0

    .line 43
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->rects:[Landroid/graphics/Rect;

    aput-object p1, v0, p2

    .line 45
    :cond_0
    return-void
.end method

.method public setStrNumbers()V
    .locals 4

    .line 68
    iget-object v0, p0, Lexocr/base/ExBaseCardInfo;->numbers:[C

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 70
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lexocr/base/ExBaseCardInfo;->numbers:[C

    iget v2, p0, Lexocr/base/ExBaseCardInfo;->charCount:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lexocr/base/ExBaseCardInfo;->strNumbers:Ljava/lang/String;

    .line 72
    :cond_0
    return-void
.end method

.method public setStrNumbers(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lexocr/base/ExBaseCardInfo;->strNumbers:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setTimeend(J)V
    .locals 0

    .line 131
    iput-wide p1, p0, Lexocr/base/ExBaseCardInfo;->timeend:J

    .line 132
    return-void
.end method

.method public setTimestart(J)V
    .locals 0

    .line 121
    iput-wide p1, p0, Lexocr/base/ExBaseCardInfo;->timestart:J

    .line 122
    return-void
.end method

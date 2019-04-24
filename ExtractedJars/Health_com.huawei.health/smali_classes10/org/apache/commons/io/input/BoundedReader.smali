.class public Lorg/apache/commons/io/input/BoundedReader;
.super Ljava/io/Reader;
.source "SourceFile"


# static fields
.field private static final INVALID:I = -0x1


# instance fields
.field private charsRead:I

.field private markedAt:I

.field private final maxCharsFromTargetReader:I

.field private readAheadLimit:I

.field private final target:Ljava/io/Reader;


# direct methods
.method public constructor <init>(Ljava/io/Reader;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Lorg/apache/commons/io/input/BoundedReader;->markedAt:I

    .line 61
    iput-object p1, p0, Lorg/apache/commons/io/input/BoundedReader;->target:Ljava/io/Reader;

    .line 62
    iput p2, p0, Lorg/apache/commons/io/input/BoundedReader;->maxCharsFromTargetReader:I

    .line 63
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lorg/apache/commons/io/input/BoundedReader;->target:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 73
    return-void
.end method

.method public mark(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 102
    iget v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    sub-int v0, p1, v0

    iput v0, p0, Lorg/apache/commons/io/input/BoundedReader;->readAheadLimit:I

    .line 104
    iget v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    iput v0, p0, Lorg/apache/commons/io/input/BoundedReader;->markedAt:I

    .line 106
    iget-object v0, p0, Lorg/apache/commons/io/input/BoundedReader;->target:Ljava/io/Reader;

    invoke-virtual {v0, p1}, Ljava/io/Reader;->mark(I)V

    .line 107
    return-void
.end method

.method public read()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 119
    iget v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    iget v1, p0, Lorg/apache/commons/io/input/BoundedReader;->maxCharsFromTargetReader:I

    if-lt v0, v1, :cond_0

    .line 120
    const/4 v0, -0x1

    return v0

    .line 123
    :cond_0
    iget v0, p0, Lorg/apache/commons/io/input/BoundedReader;->markedAt:I

    if-ltz v0, :cond_1

    iget v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    iget v1, p0, Lorg/apache/commons/io/input/BoundedReader;->markedAt:I

    sub-int/2addr v0, v1

    iget v1, p0, Lorg/apache/commons/io/input/BoundedReader;->readAheadLimit:I

    if-lt v0, v1, :cond_1

    .line 124
    const/4 v0, -0x1

    return v0

    .line 126
    :cond_1
    iget v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    .line 127
    iget-object v0, p0, Lorg/apache/commons/io/input/BoundedReader;->target:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    move-result v0

    return v0
.end method

.method public read([CII)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p3, :cond_2

    .line 144
    invoke-virtual {p0}, Lorg/apache/commons/io/input/BoundedReader;->read()I

    move-result v2

    .line 145
    const/4 v0, -0x1

    if-ne v2, v0, :cond_1

    .line 146
    if-nez v3, :cond_0

    const/4 v0, -0x1

    goto :goto_1

    :cond_0
    move v0, v3

    :goto_1
    return v0

    .line 148
    :cond_1
    add-int v0, p2, v3

    int-to-char v1, v2

    aput-char v1, p1, v0

    .line 143
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 150
    :cond_2
    return p3
.end method

.method public reset()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 83
    iget v0, p0, Lorg/apache/commons/io/input/BoundedReader;->markedAt:I

    iput v0, p0, Lorg/apache/commons/io/input/BoundedReader;->charsRead:I

    .line 84
    iget-object v0, p0, Lorg/apache/commons/io/input/BoundedReader;->target:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->reset()V

    .line 85
    return-void
.end method

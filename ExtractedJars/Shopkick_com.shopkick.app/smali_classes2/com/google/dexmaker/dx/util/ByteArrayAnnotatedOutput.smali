.class public final Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;
.super Ljava/lang/Object;
.source "ByteArrayAnnotatedOutput.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/AnnotatedOutput;
.implements Lcom/google/dexmaker/dx/util/ByteOutput;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;
    }
.end annotation


# static fields
.field private static final DEFAULT_SIZE:I = 0x3e8


# instance fields
.field private annotationWidth:I

.field private annotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private cursor:I

.field private data:[B

.field private hexCols:I

.field private final stretchy:Z

.field private verbose:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x3e8

    .line 84
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 93
    new-array p1, p1, [B

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 75
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;-><init>([BZ)V

    return-void
.end method

.method private constructor <init>([BZ)V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 107
    iput-boolean p2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 108
    iput-object p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    const/4 p1, 0x0

    .line 109
    iput p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 110
    iput-boolean p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->verbose:Z

    const/4 p2, 0x0

    .line 111
    iput-object p2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 112
    iput p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    .line 113
    iput p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    return-void

    .line 104
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "data == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ensureCapacity(I)V
    .locals 3

    .line 537
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit16 p1, p1, 0x3e8

    .line 538
    new-array p1, p1, [B

    .line 539
    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 540
    iput-object p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    :cond_0
    return-void
.end method

.method private static throwBounds()V
    .locals 2

    .line 527
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "attempt to write past the end"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public alignTo(I)V
    .locals 1

    add-int/lit8 v0, p1, -0x1

    if-ltz p1, :cond_2

    and-int/2addr p1, v0

    if-nez p1, :cond_2

    .line 332
    iget p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/2addr p1, v0

    not-int v0, v0

    and-int/2addr p1, v0

    .line 334
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v0, :cond_0

    .line 335
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v0, v0

    if-le p1, v0, :cond_1

    .line 337
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 346
    :cond_1
    :goto_0
    iput p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void

    .line 329
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus alignment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public annotate(ILjava/lang/String;)V
    .locals 3

    .line 371
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 375
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->endAnnotation()V

    .line 377
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 378
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->getEnd()I

    move-result v0

    .line 381
    :goto_0
    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    if-gt v0, v1, :cond_2

    move v0, v1

    .line 387
    :cond_2
    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    new-instance v2, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;

    add-int/2addr p1, v0

    invoke-direct {v2, v0, p1, p2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;-><init>(IILjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public annotate(Ljava/lang/String;)V
    .locals 3

    .line 361
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 365
    :cond_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->endAnnotation()V

    .line 366
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;

    iget v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    invoke-direct {v1, v2, p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public annotates()Z
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public assertCursor(I)V
    .locals 3

    .line 150
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    if-ne v0, p1, :cond_0

    return-void

    .line 151
    :cond_0
    new-instance v0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected cursor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; actual value: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public enableAnnotations(IZ)V
    .locals 3

    .line 419
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    if-nez v0, :cond_3

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    add-int/lit8 v0, p1, -0x7

    .line 427
    div-int/lit8 v0, v0, 0xf

    add-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, -0x2

    const/16 v1, 0xa

    const/4 v2, 0x6

    if-ge v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    if-le v0, v1, :cond_1

    move v0, v1

    .line 434
    :cond_1
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x3e8

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 435
    iput p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    .line 436
    iput v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    .line 437
    iput-boolean p2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->verbose:Z

    return-void

    .line 424
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "annotationWidth < 40"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 420
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "cannot enable annotations"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public endAnnotation()V
    .locals 2

    .line 392
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 396
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 399
    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;

    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->setEndIfUnset(I)V

    :cond_1
    return-void
.end method

.method public finishAnnotating()V
    .locals 5

    .line 447
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->endAnnotation()V

    .line 450
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 451
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_1

    .line 453
    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 454
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->getStart()I

    move-result v3

    iget v4, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    if-le v3, v4, :cond_0

    .line 455
    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 457
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->getEnd()I

    move-result v0

    iget v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    if-le v0, v2, :cond_1

    .line 458
    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->setEnd(I)V

    :cond_1
    return-void
.end method

.method public getAnnotationWidth()I
    .locals 2

    .line 405
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x8

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v1, v0

    .line 407
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getArray()[B
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    return-object v0
.end method

.method public getCursor()I
    .locals 1

    .line 145
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return v0
.end method

.method public isVerbose()Z
    .locals 1

    .line 356
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->verbose:Z

    return v0
.end method

.method public toByteArray()[B
    .locals 4

    .line 138
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    new-array v1, v0, [B

    .line 139
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public write(Lcom/google/dexmaker/dx/util/ByteArray;)V
    .locals 3

    .line 257
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/ByteArray;->size()I

    move-result v0

    .line 258
    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/2addr v0, v1

    .line 261
    iget-boolean v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v2, :cond_0

    .line 262
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 263
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v2, v2

    if-le v0, v2, :cond_1

    .line 264
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 268
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    invoke-virtual {p1, v2, v1}, Lcom/google/dexmaker/dx/util/ByteArray;->getBytes([BI)V

    .line 269
    iput v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void
.end method

.method public write([B)V
    .locals 2

    .line 298
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 4

    .line 274
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int v1, v0, p3

    add-int v2, p2, p3

    or-int v3, p2, p3

    or-int/2addr v3, v1

    if-ltz v3, :cond_2

    .line 279
    array-length v3, p1

    if-gt v2, v3, :cond_2

    .line 285
    iget-boolean v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v2, :cond_0

    .line 286
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 287
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v2, v2

    if-le v1, v2, :cond_1

    .line 288
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 292
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    invoke-static {p1, p2, v2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 293
    iput v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void

    .line 280
    :cond_2
    new-instance p3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes.length "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "..!"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public writeAnnotationsTo(Ljava/io/Writer;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 473
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->getAnnotationWidth()I

    move-result v0

    .line 474
    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    sub-int/2addr v1, v0

    add-int/lit8 v1, v1, -0x1

    .line 476
    new-instance v2, Lcom/google/dexmaker/dx/util/TwoColumnOutput;

    const-string/jumbo v3, "|"

    invoke-direct {v2, p1, v1, v0, v3}, Lcom/google/dexmaker/dx/util/TwoColumnOutput;-><init>(Ljava/io/Writer;IILjava/lang/String;)V

    .line 477
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/util/TwoColumnOutput;->getLeft()Ljava/io/Writer;

    move-result-object p1

    .line 478
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/util/TwoColumnOutput;->getRight()Ljava/io/Writer;

    move-result-object v0

    .line 481
    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    move v7, v3

    .line 483
    :goto_0
    iget v4, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    if-ge v7, v4, :cond_1

    if-ge v3, v1, :cond_1

    .line 484
    iget-object v4, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 485
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->getStart()I

    move-result v5

    if-ge v7, v5, :cond_0

    const-string v4, ""

    move v10, v7

    goto :goto_1

    .line 496
    :cond_0
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->getEnd()I

    move-result v6

    .line 497
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->getText()Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    move v10, v5

    move v5, v6

    .line 501
    :goto_1
    iget-object v7, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    sub-int v9, v5, v10

    iget v11, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    const/4 v12, 0x6

    move v8, v10

    invoke-static/range {v7 .. v12}, Lcom/google/dexmaker/dx/util/Hex;->dump([BIIIII)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 502
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 503
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/util/TwoColumnOutput;->flush()V

    move v7, v5

    goto :goto_0

    .line 507
    :cond_1
    iget v4, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    if-ge v7, v4, :cond_2

    .line 509
    iget-object v5, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    sub-int v6, v4, v7

    iget v8, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    const/4 v9, 0x6

    move-object v4, v5

    move v5, v7

    invoke-static/range {v4 .. v9}, Lcom/google/dexmaker/dx/util/Hex;->dump([BIIIII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_2
    :goto_2
    if-ge v3, v1, :cond_3

    .line 515
    iget-object p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput$Annotation;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 519
    :cond_3
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/util/TwoColumnOutput;->flush()V

    return-void
.end method

.method public writeByte(I)V
    .locals 3

    .line 158
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/lit8 v1, v0, 0x1

    .line 161
    iget-boolean v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v2, :cond_0

    .line 162
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 163
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v2, v2

    if-le v1, v2, :cond_1

    .line 164
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 168
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    int-to-byte p1, p1

    aput-byte p1, v2, v0

    .line 169
    iput v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void
.end method

.method public writeInt(I)V
    .locals 5

    .line 191
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/lit8 v1, v0, 0x4

    .line 194
    iget-boolean v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v2, :cond_0

    .line 195
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 196
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v2, v2

    if-le v1, v2, :cond_1

    .line 197
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 201
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    int-to-byte v3, p1

    aput-byte v3, v2, v0

    add-int/lit8 v3, v0, 0x1

    shr-int/lit8 v4, p1, 0x8

    int-to-byte v4, v4

    .line 202
    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x2

    shr-int/lit8 v4, p1, 0x10

    int-to-byte v4, v4

    .line 203
    aput-byte v4, v2, v3

    add-int/lit8 v0, v0, 0x3

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    .line 204
    aput-byte p1, v2, v0

    .line 205
    iput v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void
.end method

.method public writeLong(J)V
    .locals 6

    .line 210
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/lit8 v1, v0, 0x8

    .line 213
    iget-boolean v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v2, :cond_0

    .line 214
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 215
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v2, v2

    if-le v1, v2, :cond_1

    .line 216
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    :cond_1
    :goto_0
    long-to-int v2, p1

    .line 221
    iget-object v3, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    int-to-byte v4, v2

    aput-byte v4, v3, v0

    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v5, v2, 0x8

    int-to-byte v5, v5

    .line 222
    aput-byte v5, v3, v4

    add-int/lit8 v4, v0, 0x2

    shr-int/lit8 v5, v2, 0x10

    int-to-byte v5, v5

    .line 223
    aput-byte v5, v3, v4

    add-int/lit8 v4, v0, 0x3

    shr-int/lit8 v2, v2, 0x18

    int-to-byte v2, v2

    .line 224
    aput-byte v2, v3, v4

    const/16 v2, 0x20

    shr-long/2addr p1, v2

    long-to-int p1, p1

    add-int/lit8 p2, v0, 0x4

    int-to-byte v2, p1

    .line 227
    aput-byte v2, v3, p2

    add-int/lit8 p2, v0, 0x5

    shr-int/lit8 v2, p1, 0x8

    int-to-byte v2, v2

    .line 228
    aput-byte v2, v3, p2

    add-int/lit8 p2, v0, 0x6

    shr-int/lit8 v2, p1, 0x10

    int-to-byte v2, v2

    .line 229
    aput-byte v2, v3, p2

    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    .line 230
    aput-byte p1, v3, v0

    .line 232
    iput v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void
.end method

.method public writeShort(I)V
    .locals 4

    .line 174
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/lit8 v1, v0, 0x2

    .line 177
    iget-boolean v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v2, :cond_0

    .line 178
    invoke-direct {p0, v1}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 179
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v2, v2

    if-le v1, v2, :cond_1

    .line 180
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 184
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    int-to-byte v3, p1

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    shr-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    .line 185
    aput-byte p1, v2, v0

    .line 186
    iput v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void
.end method

.method public writeSleb128(I)I
    .locals 1

    .line 247
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v0, :cond_0

    .line 248
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 250
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 251
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->writeSignedLeb128(Lcom/google/dexmaker/dx/util/ByteOutput;I)V

    .line 252
    iget p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public writeUleb128(I)I
    .locals 1

    .line 237
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v0, :cond_0

    .line 238
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 240
    :cond_0
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 241
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/util/Leb128Utils;->writeUnsignedLeb128(Lcom/google/dexmaker/dx/util/ByteOutput;I)V

    .line 242
    iget p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public writeZeroes(I)V
    .locals 1

    if-ltz p1, :cond_2

    .line 307
    iget v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/2addr v0, p1

    .line 309
    iget-boolean p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz p1, :cond_0

    .line 310
    invoke-direct {p0, v0}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 311
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length p1, p1

    if-le v0, p1, :cond_1

    .line 312
    invoke-static {}, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 321
    :cond_1
    :goto_0
    iput v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void

    .line 304
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "count < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

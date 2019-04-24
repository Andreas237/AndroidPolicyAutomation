.class public Lnet/sqlcipher/MatrixCursor;
.super Lnet/sqlcipher/AbstractCursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sqlcipher/MatrixCursor$RowBuilder;
    }
.end annotation


# instance fields
.field private final columnCount:I

.field private final columnNames:[Ljava/lang/String;

.field private data:[Ljava/lang/Object;

.field private rowCount:I


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 1

    .line 61
    const/16 v0, 0x10

    invoke-direct {p0, p1, v0}, Lnet/sqlcipher/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 62
    return-void
.end method

.method public constructor <init>([Ljava/lang/String;I)V
    .locals 1

    .line 43
    invoke-direct {p0}, Lnet/sqlcipher/AbstractCursor;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    .line 44
    iput-object p1, p0, Lnet/sqlcipher/MatrixCursor;->columnNames:[Ljava/lang/String;

    .line 45
    array-length v0, p1

    iput v0, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    .line 47
    const/4 v0, 0x1

    if-ge p2, v0, :cond_0

    .line 48
    const/4 p2, 0x1

    .line 51
    :cond_0
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    mul-int/2addr v0, p2

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    .line 52
    return-void
.end method

.method static synthetic access$000(Lnet/sqlcipher/MatrixCursor;)[Ljava/lang/Object;
    .locals 1

    .line 29
    iget-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    return-object v0
.end method

.method private addRow(Ljava/util/ArrayList;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<*>;I)V"
        }
    .end annotation

    .line 159
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 160
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    if-eq v3, v0, :cond_0

    .line 161
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "columnNames.length = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", columnValues.size() = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 165
    :cond_0
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    .line 166
    iget-object v4, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    .line 167
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 168
    add-int v0, p2, v5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v4, v0

    .line 167
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 170
    :cond_1
    return-void
.end method

.method private ensureCapacity(I)V
    .locals 6

    .line 174
    iget-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    array-length v0, v0

    if-le p1, v0, :cond_1

    .line 175
    iget-object v4, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    .line 176
    iget-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    array-length v0, v0

    mul-int/lit8 v5, v0, 0x2

    .line 177
    if-ge v5, p1, :cond_0

    .line 178
    move v5, p1

    .line 180
    :cond_0
    new-array v0, v5, [Ljava/lang/Object;

    iput-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    .line 181
    iget-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    array-length v1, v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v4, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 183
    :cond_1
    return-void
.end method

.method private get(I)Ljava/lang/Object;
    .locals 3

    .line 68
    if-ltz p1, :cond_0

    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    if-lt p1, v0, :cond_1

    .line 69
    :cond_0
    new-instance v0, Lnet/sqlcipher/CursorIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested column: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", # of columns: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/sqlcipher/CursorIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_1
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->mPos:I

    if-gez v0, :cond_2

    .line 73
    new-instance v0, Lnet/sqlcipher/CursorIndexOutOfBoundsException;

    const-string v1, "Before first row."

    invoke-direct {v0, v1}, Lnet/sqlcipher/CursorIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_2
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->mPos:I

    iget v1, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    if-lt v0, v1, :cond_3

    .line 76
    new-instance v0, Lnet/sqlcipher/CursorIndexOutOfBoundsException;

    const-string v1, "After last row."

    invoke-direct {v0, v1}, Lnet/sqlcipher/CursorIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_3
    iget-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    iget v1, p0, Lnet/sqlcipher/MatrixCursor;->mPos:I

    iget v2, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    mul-int/2addr v1, v2

    add-int/2addr v1, p1

    aget-object v0, v0, v1

    return-object v0
.end method


# virtual methods
.method public addRow(Ljava/lang/Iterable;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<*>;)V"
        }
    .end annotation

    .line 127
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    iget v1, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    mul-int v2, v0, v1

    .line 128
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    add-int v3, v2, v0

    .line 129
    invoke-direct {p0, v3}, Lnet/sqlcipher/MatrixCursor;->ensureCapacity(I)V

    .line 131
    instance-of v0, p1, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 132
    move-object v0, p1

    check-cast v0, Ljava/util/ArrayList;

    invoke-direct {p0, v0, v2}, Lnet/sqlcipher/MatrixCursor;->addRow(Ljava/util/ArrayList;I)V

    .line 133
    return-void

    .line 136
    :cond_0
    move v4, v2

    .line 137
    iget-object v5, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    .line 138
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 139
    if-ne v4, v3, :cond_1

    .line 141
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "columnValues.size() > columnNames.length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_1
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    aput-object v7, v5, v0

    .line 145
    goto :goto_0

    .line 147
    :cond_2
    if-eq v4, v3, :cond_3

    .line 149
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "columnValues.size() < columnNames.length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_3
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    .line 155
    return-void
.end method

.method public addRow([Ljava/lang/Object;)V
    .locals 4

    .line 106
    array-length v0, p1

    iget v1, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    if-eq v0, v1, :cond_0

    .line 107
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "columnNames.length = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", columnValues.length = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 112
    :cond_0
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    iget v1, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    mul-int v3, v0, v1

    .line 113
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    add-int/2addr v0, v3

    invoke-direct {p0, v0}, Lnet/sqlcipher/MatrixCursor;->ensureCapacity(I)V

    .line 114
    iget-object v0, p0, Lnet/sqlcipher/MatrixCursor;->data:[Ljava/lang/Object;

    iget v1, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 115
    return-void
.end method

.method public getColumnNames()[Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lnet/sqlcipher/MatrixCursor;->columnNames:[Ljava/lang/String;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 222
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    return v0
.end method

.method public getDouble(I)D
    .locals 3

    .line 271
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 272
    if-nez v2, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 273
    :cond_0
    instance-of v0, v2, Ljava/lang/Number;

    if-eqz v0, :cond_1

    move-object v0, v2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 274
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public getFloat(I)F
    .locals 2

    .line 263
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 264
    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 265
    :cond_0
    instance-of v0, v1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0

    .line 266
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public getInt(I)I
    .locals 2

    .line 247
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 248
    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 249
    :cond_0
    instance-of v0, v1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    .line 250
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getLong(I)J
    .locals 3

    .line 255
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 256
    if-nez v2, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 257
    :cond_0
    instance-of v0, v2, Ljava/lang/Number;

    if-eqz v0, :cond_1

    move-object v0, v2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 258
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getShort(I)S
    .locals 2

    .line 239
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 240
    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 241
    :cond_0
    instance-of v0, v1, Ljava/lang/Number;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->shortValue()S

    move-result v0

    return v0

    .line 242
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v0

    return v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 2

    .line 232
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 233
    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 234
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType(I)I
    .locals 1

    .line 279
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lnet/sqlcipher/DatabaseUtils;->getTypeOfObject(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isNull(I)Z
    .locals 1

    .line 284
    invoke-direct {p0, p1}, Lnet/sqlcipher/MatrixCursor;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public newRow()Lnet/sqlcipher/MatrixCursor$RowBuilder;
    .locals 4

    .line 89
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    .line 90
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->rowCount:I

    iget v1, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    mul-int v2, v0, v1

    .line 91
    invoke-direct {p0, v2}, Lnet/sqlcipher/MatrixCursor;->ensureCapacity(I)V

    .line 92
    iget v0, p0, Lnet/sqlcipher/MatrixCursor;->columnCount:I

    sub-int v3, v2, v0

    .line 93
    new-instance v0, Lnet/sqlcipher/MatrixCursor$RowBuilder;

    invoke-direct {v0, p0, v3, v2}, Lnet/sqlcipher/MatrixCursor$RowBuilder;-><init>(Lnet/sqlcipher/MatrixCursor;II)V

    return-object v0
.end method

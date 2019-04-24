.class public final Lcom/google/protobuf/TextFormatParseLocation;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EMPTY:Lcom/google/protobuf/TextFormatParseLocation;


# instance fields
.field private final column:I

.field private final line:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 45
    new-instance v0, Lcom/google/protobuf/TextFormatParseLocation;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/TextFormatParseLocation;-><init>(II)V

    sput-object v0, Lcom/google/protobuf/TextFormatParseLocation;->EMPTY:Lcom/google/protobuf/TextFormatParseLocation;

    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput p1, p0, Lcom/google/protobuf/TextFormatParseLocation;->line:I

    .line 70
    iput p2, p0, Lcom/google/protobuf/TextFormatParseLocation;->column:I

    .line 71
    return-void
.end method

.method static create(II)Lcom/google/protobuf/TextFormatParseLocation;
    .locals 5

    .line 55
    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 56
    sget-object v0, Lcom/google/protobuf/TextFormatParseLocation;->EMPTY:Lcom/google/protobuf/TextFormatParseLocation;

    return-object v0

    .line 58
    :cond_0
    if-ltz p0, :cond_1

    if-gez p1, :cond_2

    .line 59
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "line and column values must be >= 0: line %d, column: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 60
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_2
    new-instance v0, Lcom/google/protobuf/TextFormatParseLocation;

    invoke-direct {v0, p0, p1}, Lcom/google/protobuf/TextFormatParseLocation;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 88
    if-ne p1, p0, :cond_0

    .line 89
    const/4 v0, 0x1

    return v0

    .line 91
    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/TextFormatParseLocation;

    if-nez v0, :cond_1

    .line 92
    const/4 v0, 0x0

    return v0

    .line 94
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/TextFormatParseLocation;

    .line 95
    iget v0, p0, Lcom/google/protobuf/TextFormatParseLocation;->line:I

    invoke-virtual {v2}, Lcom/google/protobuf/TextFormatParseLocation;->getLine()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/google/protobuf/TextFormatParseLocation;->column:I

    .line 96
    invoke-virtual {v2}, Lcom/google/protobuf/TextFormatParseLocation;->getColumn()I

    move-result v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 95
    :goto_0
    return v0
.end method

.method public getColumn()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/google/protobuf/TextFormatParseLocation;->column:I

    return v0
.end method

.method public getLine()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/google/protobuf/TextFormatParseLocation;->line:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 101
    const/4 v0, 0x2

    new-array v2, v0, [I

    iget v0, p0, Lcom/google/protobuf/TextFormatParseLocation;->line:I

    const/4 v1, 0x0

    aput v0, v2, v1

    iget v0, p0, Lcom/google/protobuf/TextFormatParseLocation;->column:I

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 102
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 83
    const-string v0, "ParseLocation{line=%d, column=%d}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/google/protobuf/TextFormatParseLocation;->line:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/google/protobuf/TextFormatParseLocation;->column:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

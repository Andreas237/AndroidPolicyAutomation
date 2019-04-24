.class final Lo/sd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:[I

.field private final c:Ljava/lang/StringBuilder;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lo/sd;->b:[I

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lo/sd;->c:Ljava/lang/StringBuilder;

    return-void
.end method

.method private static b(Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Lo/oq;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 104
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 105
    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_0
    new-instance v2, Ljava/util/EnumMap;

    const-class v0, Lo/oq;

    invoke-direct {v2, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 108
    sget-object v0, Lo/oq;->b:Lo/oq;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    return-object v2
.end method


# virtual methods
.method b(ILo/qm;[I)Lo/or;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 39
    iget-object v6, p0, Lo/sd;->c:Ljava/lang/StringBuilder;

    .line 40
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 41
    invoke-virtual {p0, p2, p3, v6}, Lo/sd;->c(Lo/qm;[ILjava/lang/StringBuilder;)I

    move-result v7

    .line 43
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 44
    invoke-static {v8}, Lo/sd;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    .line 46
    new-instance v0, Lo/or;

    move-object v1, v8

    const/4 v2, 0x2

    new-array v3, v2, [Lo/ou;

    new-instance v2, Lo/ou;

    const/4 v4, 0x0

    aget v4, p3, v4

    const/4 v5, 0x1

    aget v5, p3, v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    int-to-float v5, p1

    invoke-direct {v2, v4, v5}, Lo/ou;-><init>(FF)V

    const/4 v4, 0x0

    aput-object v2, v3, v4

    new-instance v2, Lo/ou;

    int-to-float v4, v7

    int-to-float v5, p1

    invoke-direct {v2, v4, v5}, Lo/ou;-><init>(FF)V

    const/4 v4, 0x1

    aput-object v2, v3, v4

    sget-object v4, Lo/od;->u:Lo/od;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    move-object v10, v0

    .line 54
    if-eqz v9, :cond_0

    .line 55
    invoke-virtual {v10, v9}, Lo/or;->a(Ljava/util/Map;)V

    .line 57
    :cond_0
    return-object v10
.end method

.method c(Lo/qm;[ILjava/lang/StringBuilder;)I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 61
    iget-object v2, p0, Lo/sd;->b:[I

    .line 62
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 63
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 64
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v2, v1

    .line 65
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 66
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v3

    .line 67
    const/4 v0, 0x1

    aget v4, p2, v0

    .line 69
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v6, v0, :cond_3

    if-ge v4, v3, :cond_3

    .line 72
    sget-object v0, Lo/sf;->b:[[I

    invoke-static {p1, v2, v4, v0}, Lo/sf;->e(Lo/qm;[II[[I)I

    move-result v7

    .line 73
    rem-int/lit8 v0, v7, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    move-object v8, v2

    array-length v9, v8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_0

    aget v11, v8, v10

    .line 75
    add-int/2addr v4, v11

    .line 74
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 77
    :cond_0
    const/16 v0, 0xa

    if-lt v7, v0, :cond_1

    .line 78
    rsub-int/lit8 v0, v6, 0x1

    const/4 v1, 0x1

    shl-int v0, v1, v0

    or-int/2addr v5, v0

    .line 80
    :cond_1
    const/4 v0, 0x1

    if-eq v6, v0, :cond_2

    .line 82
    invoke-virtual {p1, v4}, Lo/qm;->a(I)I

    move-result v4

    .line 83
    invoke-virtual {p1, v4}, Lo/qm;->b(I)I

    move-result v4

    .line 71
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 87
    :cond_3
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 88
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 91
    :cond_4
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    rem-int/lit8 v0, v0, 0x4

    if-eq v0, v5, :cond_5

    .line 92
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 95
    :cond_5
    return v4
.end method

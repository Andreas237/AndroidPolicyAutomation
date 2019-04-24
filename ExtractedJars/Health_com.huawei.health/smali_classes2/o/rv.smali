.class public final Lo/rv;
.super Lo/sf;
.source "SourceFile"


# static fields
.field static final c:[I


# instance fields
.field private final i:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/rv;->c:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0xb
        0xd
        0xe
        0x13
        0x19
        0x1c
        0x15
        0x16
        0x1a
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Lo/sf;-><init>()V

    .line 68
    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lo/rv;->i:[I

    .line 69
    return-void
.end method

.method private static d(Ljava/lang/StringBuilder;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 129
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge v2, v0, :cond_1

    .line 130
    sget-object v0, Lo/rv;->c:[I

    aget v0, v0, v2

    if-ne p1, v0, :cond_0

    .line 131
    add-int/lit8 v0, v2, 0x30

    int-to-char v0, v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 132
    return-void

    .line 129
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 135
    :cond_1
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method protected b(Lo/qm;[ILjava/lang/StringBuilder;)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 75
    iget-object v2, p0, Lo/rv;->i:[I

    .line 76
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 77
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 78
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v2, v1

    .line 79
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 80
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v3

    .line 81
    const/4 v0, 0x1

    aget v4, p2, v0

    .line 83
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v6, v0, :cond_2

    if-ge v4, v3, :cond_2

    .line 86
    sget-object v0, Lo/rv;->b:[[I

    invoke-static {p1, v2, v4, v0}, Lo/rv;->e(Lo/qm;[II[[I)I

    move-result v7

    .line 87
    rem-int/lit8 v0, v7, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    move-object v8, v2

    array-length v9, v8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_0

    aget v11, v8, v10

    .line 89
    add-int/2addr v4, v11

    .line 88
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 91
    :cond_0
    const/16 v0, 0xa

    if-lt v7, v0, :cond_1

    .line 92
    rsub-int/lit8 v0, v6, 0x5

    const/4 v1, 0x1

    shl-int v0, v1, v0

    or-int/2addr v5, v0

    .line 85
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 96
    :cond_2
    move-object/from16 v0, p3

    invoke-static {v0, v5}, Lo/rv;->d(Ljava/lang/StringBuilder;I)V

    .line 98
    sget-object v0, Lo/rv;->d:[I

    const/4 v1, 0x1

    invoke-static {p1, v4, v1, v0}, Lo/rv;->d(Lo/qm;IZ[I)[I

    move-result-object v6

    .line 99
    const/4 v0, 0x1

    aget v4, v6, v0

    .line 101
    const/4 v7, 0x0

    :goto_2
    const/4 v0, 0x6

    if-ge v7, v0, :cond_4

    if-ge v4, v3, :cond_4

    .line 102
    sget-object v0, Lo/rv;->e:[[I

    invoke-static {p1, v2, v4, v0}, Lo/rv;->e(Lo/qm;[II[[I)I

    move-result v8

    .line 103
    add-int/lit8 v0, v8, 0x30

    int-to-char v0, v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    move-object v9, v2

    array-length v10, v9

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_3

    aget v12, v9, v11

    .line 105
    add-int/2addr v4, v12

    .line 104
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 101
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 109
    :cond_4
    return v4
.end method

.method e()Lo/od;
    .locals 1

    .line 114
    sget-object v0, Lo/od;->k:Lo/od;

    return-object v0
.end method

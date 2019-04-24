.class public final Lo/sk;
.super Lo/sf;
.source "SourceFile"


# static fields
.field private static final c:[I

.field private static final g:[[I


# instance fields
.field private final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 37
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/sk;->c:[I

    .line 44
    const/4 v0, 0x2

    new-array v0, v0, [[I

    const/16 v1, 0xa

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0xa

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/sk;->g:[[I

    return-void

    :array_0
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x38
        0x34
        0x32
        0x31
        0x2c
        0x26
        0x23
        0x2a
        0x29
        0x25
    .end array-data

    :array_2
    .array-data 4
        0x7
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

    .line 51
    invoke-direct {p0}, Lo/sf;-><init>()V

    .line 52
    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lo/sk;->k:[I

    .line 53
    return-void
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 121
    const/4 v0, 0x6

    new-array v3, v0, [C

    .line 122
    const/4 v0, 0x1

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v3, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 123
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0xc

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 124
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    const/4 v0, 0x5

    aget-char v5, v3, v0

    .line 126
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 130
    :pswitch_0
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {v4, v3, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 131
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 132
    const-string v0, "0000"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-virtual {v4, v3, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 134
    goto :goto_1

    .line 136
    :pswitch_1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-virtual {v4, v3, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 137
    const-string v0, "00000"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    const/4 v0, 0x3

    const/4 v1, 0x2

    invoke-virtual {v4, v3, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 139
    goto :goto_1

    .line 141
    :pswitch_2
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v4, v3, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 142
    const-string v0, "00000"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    const/4 v0, 0x4

    aget-char v0, v3, v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    goto :goto_1

    .line 146
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {v4, v3, v0, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 147
    const-string v0, "0000"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    :goto_1
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static e(Ljava/lang/StringBuilder;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 97
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x1

    if-gt v2, v0, :cond_2

    .line 98
    const/4 v3, 0x0

    :goto_1
    const/16 v0, 0xa

    if-ge v3, v0, :cond_1

    .line 99
    sget-object v0, Lo/sk;->g:[[I

    aget-object v0, v0, v2

    aget v0, v0, v3

    if-ne p1, v0, :cond_0

    .line 100
    add-int/lit8 v0, v2, 0x30

    int-to-char v0, v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 101
    add-int/lit8 v0, v3, 0x30

    int-to-char v0, v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    return-void

    .line 98
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 97
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 106
    :cond_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 91
    invoke-static {p1}, Lo/sk;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lo/sf;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method protected b(Lo/qm;[ILjava/lang/StringBuilder;)I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 58
    iget-object v2, p0, Lo/sk;->k:[I

    .line 59
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 60
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 61
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v2, v1

    .line 62
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 63
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v3

    .line 64
    const/4 v0, 0x1

    aget v4, p2, v0

    .line 66
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v6, v0, :cond_2

    if-ge v4, v3, :cond_2

    .line 69
    sget-object v0, Lo/sk;->b:[[I

    invoke-static {p1, v2, v4, v0}, Lo/sk;->e(Lo/qm;[II[[I)I

    move-result v7

    .line 70
    rem-int/lit8 v0, v7, 0xa

    add-int/lit8 v0, v0, 0x30

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    move-object v8, v2

    array-length v9, v8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_0

    aget v11, v8, v10

    .line 72
    add-int/2addr v4, v11

    .line 71
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 74
    :cond_0
    const/16 v0, 0xa

    if-lt v7, v0, :cond_1

    .line 75
    rsub-int/lit8 v0, v6, 0x5

    const/4 v1, 0x1

    shl-int v0, v1, v0

    or-int/2addr v5, v0

    .line 68
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 79
    :cond_2
    invoke-static {p3, v5}, Lo/sk;->e(Ljava/lang/StringBuilder;I)V

    .line 81
    return v4
.end method

.method protected c(Lo/qm;I)[I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 86
    sget-object v0, Lo/sk;->c:[I

    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v0}, Lo/sk;->d(Lo/qm;IZ[I)[I

    move-result-object v0

    return-object v0
.end method

.method e()Lo/od;
    .locals 1

    .line 111
    sget-object v0, Lo/od;->q:Lo/od;

    return-object v0
.end method

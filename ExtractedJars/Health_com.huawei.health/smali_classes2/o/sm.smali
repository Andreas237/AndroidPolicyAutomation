.class public final Lo/sm;
.super Lo/sj;
.source "SourceFile"


# static fields
.field private static final a:[I

.field private static final b:[I

.field private static final c:[I

.field private static final d:[I

.field private static final e:[I

.field private static final h:[[I

.field private static final i:[I


# instance fields
.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/si;>;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/si;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 37
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/sm;->b:[I

    .line 38
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/sm;->c:[I

    .line 39
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lo/sm;->a:[I

    .line 40
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lo/sm;->d:[I

    .line 41
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, Lo/sm;->e:[I

    .line 42
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    sput-object v0, Lo/sm;->i:[I

    .line 44
    const/16 v0, 0x9

    new-array v0, v0, [[I

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_6

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_7

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_8

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_9

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_a

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_b

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_c

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_d

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_e

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lo/sm;->h:[[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0xa
        0x22
        0x46
        0x7e
    .end array-data

    :array_1
    .array-data 4
        0x4
        0x14
        0x30
        0x51
    .end array-data

    :array_2
    .array-data 4
        0x0
        0xa1
        0x3c1
        0x7df
        0xa9b
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x150
        0x40c
        0x5ec
    .end array-data

    :array_4
    .array-data 4
        0x8
        0x6
        0x4
        0x3
        0x1
    .end array-data

    :array_5
    .array-data 4
        0x2
        0x4
        0x6
        0x8
    .end array-data

    :array_6
    .array-data 4
        0x3
        0x8
        0x2
        0x1
    .end array-data

    :array_7
    .array-data 4
        0x3
        0x5
        0x5
        0x1
    .end array-data

    :array_8
    .array-data 4
        0x3
        0x3
        0x7
        0x1
    .end array-data

    :array_9
    .array-data 4
        0x3
        0x1
        0x9
        0x1
    .end array-data

    :array_a
    .array-data 4
        0x2
        0x7
        0x4
        0x1
    .end array-data

    :array_b
    .array-data 4
        0x2
        0x5
        0x6
        0x1
    .end array-data

    :array_c
    .array-data 4
        0x2
        0x3
        0x8
        0x1
    .end array-data

    :array_d
    .array-data 4
        0x1
        0x5
        0x7
        0x1
    .end array-data

    :array_e
    .array-data 4
        0x1
        0x3
        0x9
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lo/sj;-><init>()V

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/sm;->g:Ljava/util/List;

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/sm;->k:Ljava/util/List;

    .line 62
    return-void
.end method

.method private a(Lo/qm;ZILjava/util/Map;)Lo/si;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/qm;ZILjava/util/Map<Lo/og;*>;)Lo/si;"
        }
    .end annotation

    .line 165
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0, p2}, Lo/sm;->b(Lo/qm;IZ)[I

    move-result-object v5

    .line 166
    invoke-direct {p0, p1, p3, p2, v5}, Lo/sm;->e(Lo/qm;IZ[I)Lo/sg;

    move-result-object v6

    .line 168
    if-nez p4, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/og;->h:Lo/og;

    .line 169
    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/oy;

    .line 171
    :goto_0
    if-eqz v7, :cond_2

    .line 172
    const/4 v0, 0x0

    aget v0, v5, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v8, v0, v1

    .line 173
    if-eqz p2, :cond_1

    .line 175
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    sub-float v8, v0, v8

    .line 177
    :cond_1
    new-instance v0, Lo/ou;

    int-to-float v1, p3

    invoke-direct {v0, v8, v1}, Lo/ou;-><init>(FF)V

    invoke-interface {v7, v0}, Lo/oy;->foundPossibleResultPoint(Lo/ou;)V

    .line 180
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, p1, v6, v0}, Lo/sm;->e(Lo/qm;Lo/sg;Z)Lo/sh;

    move-result-object v8

    .line 181
    const/4 v0, 0x0

    invoke-direct {p0, p1, v6, v0}, Lo/sm;->e(Lo/qm;Lo/sg;Z)Lo/sh;

    move-result-object v9

    .line 182
    new-instance v0, Lo/si;

    invoke-virtual {v8}, Lo/sh;->b()I

    move-result v1

    mul-int/lit16 v1, v1, 0x63d

    invoke-virtual {v9}, Lo/sh;->b()I

    move-result v2

    add-int/2addr v1, v2

    .line 183
    invoke-virtual {v8}, Lo/sh;->d()I

    move-result v2

    invoke-virtual {v9}, Lo/sh;->d()I

    move-result v3

    mul-int/lit8 v3, v3, 0x4

    add-int/2addr v2, v3

    invoke-direct {v0, v1, v2, v6}, Lo/si;-><init>(IILo/sg;)V
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 185
    :catch_0
    move-exception v5

    .line 186
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(Lo/si;Lo/si;)Z
    .locals 5

    .line 151
    invoke-virtual {p0}, Lo/si;->d()I

    move-result v0

    invoke-virtual {p1}, Lo/si;->d()I

    move-result v1

    mul-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    rem-int/lit8 v3, v0, 0x4f

    .line 152
    .line 153
    invoke-virtual {p0}, Lo/si;->e()Lo/sg;

    move-result-object v0

    invoke-virtual {v0}, Lo/sg;->e()I

    move-result v0

    mul-int/lit8 v0, v0, 0x9

    invoke-virtual {p1}, Lo/si;->e()Lo/sg;

    move-result-object v1

    invoke-virtual {v1}, Lo/sg;->e()I

    move-result v1

    add-int v4, v0, v1

    .line 154
    const/16 v0, 0x48

    if-le v4, v0, :cond_0

    .line 155
    add-int/lit8 v4, v4, -0x1

    .line 157
    :cond_0
    const/16 v0, 0x8

    if-le v4, v0, :cond_1

    .line 158
    add-int/lit8 v4, v4, -0x1

    .line 160
    :cond_1
    if-ne v3, v4, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static b(Ljava/util/Collection;Lo/si;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Lo/si;>;Lo/si;)V"
        }
    .end annotation

    .line 93
    if-nez p1, :cond_0

    .line 94
    return-void

    .line 96
    :cond_0
    const/4 v2, 0x0

    .line 97
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/si;

    .line 98
    invoke-virtual {v4}, Lo/si;->b()I

    move-result v0

    invoke-virtual {p1}, Lo/si;->b()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 99
    invoke-virtual {v4}, Lo/si;->c()V

    .line 100
    const/4 v2, 0x1

    .line 101
    goto :goto_1

    .line 103
    :cond_1
    goto :goto_0

    .line 104
    :cond_2
    :goto_1
    if-nez v2, :cond_3

    .line 105
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    :cond_3
    return-void
.end method

.method private b(Lo/qm;IZ)[I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 290
    invoke-virtual {p0}, Lo/sm;->b()[I

    move-result-object v2

    .line 291
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 292
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 293
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v2, v1

    .line 294
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 296
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v3

    .line 297
    const/4 v4, 0x0

    .line 298
    :goto_0
    if-ge p2, v3, :cond_2

    .line 299
    invoke-virtual {p1, p2}, Lo/qm;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 300
    :goto_1
    if-ne p3, v4, :cond_1

    .line 302
    goto :goto_2

    .line 304
    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 307
    :cond_2
    :goto_2
    const/4 v5, 0x0

    .line 308
    move v6, p2

    .line 309
    move v7, p2

    :goto_3
    if-ge v7, v3, :cond_7

    .line 310
    invoke-virtual {p1, v7}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v4

    if-eqz v0, :cond_3

    .line 311
    aget v0, v2, v5

    add-int/lit8 v0, v0, 0x1

    aput v0, v2, v5

    goto :goto_5

    .line 313
    :cond_3
    const/4 v0, 0x3

    if-ne v5, v0, :cond_5

    .line 314
    invoke-static {v2}, Lo/sm;->c([I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 315
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v6, v0, v1

    const/4 v1, 0x1

    aput v7, v0, v1

    return-object v0

    .line 317
    :cond_4
    const/4 v0, 0x0

    aget v0, v2, v0

    const/4 v1, 0x1

    aget v1, v2, v1

    add-int/2addr v0, v1

    add-int/2addr v6, v0

    .line 318
    const/4 v0, 0x2

    aget v0, v2, v0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 319
    const/4 v0, 0x3

    aget v0, v2, v0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 320
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v2, v1

    .line 321
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 322
    add-int/lit8 v5, v5, -0x1

    goto :goto_4

    .line 324
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 326
    :goto_4
    const/4 v0, 0x1

    aput v0, v2, v5

    .line 327
    if-nez v4, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    .line 309
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_3

    .line 330
    :cond_7
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method private static e(Lo/si;Lo/si;)Lo/or;
    .locals 12

    .line 116
    invoke-virtual {p0}, Lo/si;->b()I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v2, 0x453af5

    mul-long/2addr v0, v2

    invoke-virtual {p1}, Lo/si;->b()I

    move-result v2

    int-to-long v2, v2

    add-long v5, v0, v2

    .line 117
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    .line 119
    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v0, 0xe

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 120
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    rsub-int/lit8 v9, v0, 0xd

    :goto_0
    if-lez v9, :cond_0

    .line 121
    const/16 v0, 0x30

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    add-int/lit8 v9, v9, -0x1

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    const/4 v9, 0x0

    .line 126
    const/4 v10, 0x0

    :goto_1
    const/16 v0, 0xd

    if-ge v10, v0, :cond_2

    .line 127
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    add-int/lit8 v11, v0, -0x30

    .line 128
    and-int/lit8 v0, v10, 0x1

    if-nez v0, :cond_1

    mul-int/lit8 v0, v11, 0x3

    goto :goto_2

    :cond_1
    move v0, v11

    :goto_2
    add-int/2addr v9, v0

    .line 126
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 130
    :cond_2
    rem-int/lit8 v0, v9, 0xa

    rsub-int/lit8 v9, v0, 0xa

    .line 131
    const/16 v0, 0xa

    if-ne v9, v0, :cond_3

    .line 132
    const/4 v9, 0x0

    .line 134
    :cond_3
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    invoke-virtual {p0}, Lo/si;->e()Lo/sg;

    move-result-object v0

    invoke-virtual {v0}, Lo/sg;->c()[Lo/ou;

    move-result-object v10

    .line 137
    invoke-virtual {p1}, Lo/si;->e()Lo/sg;

    move-result-object v0

    invoke-virtual {v0}, Lo/sg;->c()[Lo/ou;

    move-result-object v11

    .line 138
    new-instance v0, Lo/or;

    .line 139
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Lo/ou;

    const/4 v3, 0x0

    aget-object v3, v10, v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aget-object v3, v10, v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    aget-object v3, v11, v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aget-object v3, v11, v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    sget-object v3, Lo/od;->o:Lo/od;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    return-object v0
.end method

.method private e(Lo/qm;IZ[I)Lo/sg;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 337
    const/4 v0, 0x0

    aget v0, p4, v0

    invoke-virtual {p1, v0}, Lo/qm;->d(I)Z

    move-result v6

    .line 338
    const/4 v0, 0x0

    aget v0, p4, v0

    add-int/lit8 v7, v0, -0x1

    .line 340
    :goto_0
    if-ltz v7, :cond_0

    invoke-virtual {p1, v7}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v6

    if-eqz v0, :cond_0

    .line 341
    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    .line 343
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 344
    const/4 v0, 0x0

    aget v0, p4, v0

    sub-int v8, v0, v7

    .line 346
    invoke-virtual {p0}, Lo/sm;->b()[I

    move-result-object v9

    .line 347
    array-length v0, v9

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v9, v1, v9, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 348
    const/4 v0, 0x0

    aput v8, v9, v0

    .line 349
    sget-object v0, Lo/sm;->h:[[I

    invoke-static {v9, v0}, Lo/sm;->e([I[[I)I

    move-result v10

    .line 350
    move v11, v7

    .line 351
    const/4 v0, 0x1

    aget v12, p4, v0

    .line 352
    if-eqz p3, :cond_1

    .line 354
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int v11, v0, v11

    .line 355
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int v12, v0, v12

    .line 357
    :cond_1
    new-instance v0, Lo/sg;

    const/4 v1, 0x2

    new-array v2, v1, [I

    const/4 v1, 0x0

    aput v7, v2, v1

    const/4 v1, 0x1

    aget v1, p4, v1

    const/4 v3, 0x1

    aput v1, v2, v3

    move v1, v10

    move v3, v11

    move v4, v12

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lo/sg;-><init>(I[IIII)V

    return-object v0
.end method

.method private e(Lo/qm;Lo/sg;Z)Lo/sh;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 193
    invoke-virtual/range {p0 .. p0}, Lo/sm;->a()[I

    move-result-object v2

    .line 194
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 195
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 196
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v2, v1

    .line 197
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 198
    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v2, v1

    .line 199
    const/4 v0, 0x0

    const/4 v1, 0x5

    aput v0, v2, v1

    .line 200
    const/4 v0, 0x0

    const/4 v1, 0x6

    aput v0, v2, v1

    .line 201
    const/4 v0, 0x0

    const/4 v1, 0x7

    aput v0, v2, v1

    .line 203
    if-eqz p3, :cond_0

    .line 204
    invoke-virtual/range {p2 .. p2}, Lo/sg;->a()[I

    move-result-object v0

    const/4 v1, 0x0

    aget v0, v0, v1

    move-object/from16 v1, p1

    invoke-static {v1, v0, v2}, Lo/sm;->d(Lo/qm;I[I)V

    goto :goto_1

    .line 206
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lo/sg;->a()[I

    move-result-object v0

    const/4 v1, 0x1

    aget v0, v0, v1

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p1

    invoke-static {v1, v0, v2}, Lo/sm;->c(Lo/qm;I[I)V

    .line 208
    const/4 v3, 0x0

    array-length v0, v2

    add-int/lit8 v4, v0, -0x1

    :goto_0
    if-ge v3, v4, :cond_1

    .line 209
    aget v5, v2, v3

    .line 210
    aget v0, v2, v4

    aput v0, v2, v3

    .line 211
    aput v5, v2, v4

    .line 208
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 215
    :cond_1
    :goto_1
    if-eqz p3, :cond_2

    const/16 v3, 0x10

    goto :goto_2

    :cond_2
    const/16 v3, 0xf

    .line 216
    :goto_2
    invoke-static {v2}, Lo/sm;->b([I)I

    move-result v0

    int-to-float v0, v0

    int-to-float v1, v3

    div-float v4, v0, v1

    .line 218
    invoke-virtual/range {p0 .. p0}, Lo/sm;->k()[I

    move-result-object v5

    .line 219
    invoke-virtual/range {p0 .. p0}, Lo/sm;->i()[I

    move-result-object v6

    .line 220
    invoke-virtual/range {p0 .. p0}, Lo/sm;->e()[F

    move-result-object v7

    .line 221
    invoke-virtual/range {p0 .. p0}, Lo/sm;->d()[F

    move-result-object v8

    .line 223
    const/4 v9, 0x0

    :goto_3
    array-length v0, v2

    if-ge v9, v0, :cond_6

    .line 224
    aget v0, v2, v9

    int-to-float v0, v0

    div-float v10, v0, v4

    .line 225
    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v0, v10

    float-to-int v11, v0

    .line 226
    const/4 v0, 0x1

    if-ge v11, v0, :cond_3

    .line 227
    const/4 v11, 0x1

    goto :goto_4

    .line 228
    :cond_3
    const/16 v0, 0x8

    if-le v11, v0, :cond_4

    .line 229
    const/16 v11, 0x8

    .line 231
    :cond_4
    :goto_4
    div-int/lit8 v12, v9, 0x2

    .line 232
    and-int/lit8 v0, v9, 0x1

    if-nez v0, :cond_5

    .line 233
    aput v11, v5, v12

    .line 234
    int-to-float v0, v11

    sub-float v0, v10, v0

    aput v0, v7, v12

    goto :goto_5

    .line 236
    :cond_5
    aput v11, v6, v12

    .line 237
    int-to-float v0, v11

    sub-float v0, v10, v0

    aput v0, v8, v12

    .line 223
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 241
    :cond_6
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-direct {v0, v1, v3}, Lo/sm;->e(ZI)V

    .line 243
    const/4 v9, 0x0

    .line 244
    const/4 v10, 0x0

    .line 245
    array-length v0, v5

    add-int/lit8 v11, v0, -0x1

    :goto_6
    if-ltz v11, :cond_7

    .line 246
    mul-int/lit8 v10, v10, 0x9

    .line 247
    aget v0, v5, v11

    add-int/2addr v10, v0

    .line 248
    aget v0, v5, v11

    add-int/2addr v9, v0

    .line 245
    add-int/lit8 v11, v11, -0x1

    goto :goto_6

    .line 250
    :cond_7
    const/4 v11, 0x0

    .line 251
    const/4 v12, 0x0

    .line 252
    array-length v0, v6

    add-int/lit8 v13, v0, -0x1

    :goto_7
    if-ltz v13, :cond_8

    .line 253
    mul-int/lit8 v11, v11, 0x9

    .line 254
    aget v0, v6, v13

    add-int/2addr v11, v0

    .line 255
    aget v0, v6, v13

    add-int/2addr v12, v0

    .line 252
    add-int/lit8 v13, v13, -0x1

    goto :goto_7

    .line 257
    :cond_8
    mul-int/lit8 v0, v11, 0x3

    add-int v13, v10, v0

    .line 259
    if-eqz p3, :cond_b

    .line 260
    and-int/lit8 v0, v9, 0x1

    if-nez v0, :cond_9

    const/16 v0, 0xc

    if-gt v9, v0, :cond_9

    const/4 v0, 0x4

    if-ge v9, v0, :cond_a

    .line 261
    :cond_9
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 263
    :cond_a
    rsub-int/lit8 v0, v9, 0xc

    div-int/lit8 v14, v0, 0x2

    .line 264
    sget-object v0, Lo/sm;->e:[I

    aget v15, v0, v14

    .line 265
    rsub-int/lit8 v16, v15, 0x9

    .line 266
    const/4 v0, 0x0

    invoke-static {v5, v15, v0}, Lo/sp;->a([IIZ)I

    move-result v17

    .line 267
    move/from16 v0, v16

    const/4 v1, 0x1

    invoke-static {v6, v0, v1}, Lo/sp;->a([IIZ)I

    move-result v18

    .line 268
    sget-object v0, Lo/sm;->b:[I

    aget v19, v0, v14

    .line 269
    sget-object v0, Lo/sm;->a:[I

    aget v20, v0, v14

    .line 270
    new-instance v0, Lo/sh;

    mul-int v1, v17, v19

    add-int v1, v1, v18

    add-int v1, v1, v20

    invoke-direct {v0, v1, v13}, Lo/sh;-><init>(II)V

    return-object v0

    .line 272
    :cond_b
    and-int/lit8 v0, v12, 0x1

    if-nez v0, :cond_c

    const/16 v0, 0xa

    if-gt v12, v0, :cond_c

    const/4 v0, 0x4

    if-ge v12, v0, :cond_d

    .line 273
    :cond_c
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 275
    :cond_d
    rsub-int/lit8 v0, v12, 0xa

    div-int/lit8 v14, v0, 0x2

    .line 276
    sget-object v0, Lo/sm;->i:[I

    aget v15, v0, v14

    .line 277
    rsub-int/lit8 v16, v15, 0x9

    .line 278
    const/4 v0, 0x1

    invoke-static {v5, v15, v0}, Lo/sp;->a([IIZ)I

    move-result v17

    .line 279
    move/from16 v0, v16

    const/4 v1, 0x0

    invoke-static {v6, v0, v1}, Lo/sp;->a([IIZ)I

    move-result v18

    .line 280
    sget-object v0, Lo/sm;->c:[I

    aget v19, v0, v14

    .line 281
    sget-object v0, Lo/sm;->d:[I

    aget v20, v0, v14

    .line 282
    new-instance v0, Lo/sh;

    mul-int v1, v18, v19

    add-int v1, v1, v17

    add-int v1, v1, v20

    invoke-direct {v0, v1, v13}, Lo/sh;-><init>(II)V

    return-object v0
.end method

.method private e(ZI)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 362
    invoke-virtual {p0}, Lo/sm;->k()[I

    move-result-object v0

    invoke-static {v0}, Lo/sm;->b([I)I

    move-result v2

    .line 363
    invoke-virtual {p0}, Lo/sm;->i()[I

    move-result-object v0

    invoke-static {v0}, Lo/sm;->b([I)I

    move-result v3

    .line 364
    add-int v0, v2, v3

    sub-int v4, v0, p2

    .line 365
    and-int/lit8 v0, v2, 0x1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ne v0, v1, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 366
    :goto_1
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    .line 368
    :goto_2
    const/4 v7, 0x0

    .line 369
    const/4 v8, 0x0

    .line 370
    const/4 v9, 0x0

    .line 371
    const/4 v10, 0x0

    .line 373
    if-eqz p1, :cond_6

    .line 374
    const/16 v0, 0xc

    if-le v2, v0, :cond_3

    .line 375
    const/4 v8, 0x1

    goto :goto_3

    .line 376
    :cond_3
    const/4 v0, 0x4

    if-ge v2, v0, :cond_4

    .line 377
    const/4 v7, 0x1

    .line 379
    :cond_4
    :goto_3
    const/16 v0, 0xc

    if-le v3, v0, :cond_5

    .line 380
    const/4 v10, 0x1

    goto :goto_5

    .line 381
    :cond_5
    const/4 v0, 0x4

    if-ge v3, v0, :cond_a

    .line 382
    const/4 v9, 0x1

    goto :goto_5

    .line 385
    :cond_6
    const/16 v0, 0xb

    if-le v2, v0, :cond_7

    .line 386
    const/4 v8, 0x1

    goto :goto_4

    .line 387
    :cond_7
    const/4 v0, 0x5

    if-ge v2, v0, :cond_8

    .line 388
    const/4 v7, 0x1

    .line 390
    :cond_8
    :goto_4
    const/16 v0, 0xa

    if-le v3, v0, :cond_9

    .line 391
    const/4 v10, 0x1

    goto :goto_5

    .line 392
    :cond_9
    const/4 v0, 0x4

    if-ge v3, v0, :cond_a

    .line 393
    const/4 v9, 0x1

    .line 409
    :cond_a
    :goto_5
    const/4 v0, 0x1

    if-ne v4, v0, :cond_e

    .line 410
    if-eqz v5, :cond_c

    .line 411
    if-eqz v6, :cond_b

    .line 412
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 414
    :cond_b
    const/4 v8, 0x1

    goto :goto_6

    .line 416
    :cond_c
    if-nez v6, :cond_d

    .line 417
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 419
    :cond_d
    const/4 v10, 0x1

    goto :goto_6

    .line 421
    :cond_e
    const/4 v0, -0x1

    if-ne v4, v0, :cond_12

    .line 422
    if-eqz v5, :cond_10

    .line 423
    if-eqz v6, :cond_f

    .line 424
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 426
    :cond_f
    const/4 v7, 0x1

    goto :goto_6

    .line 428
    :cond_10
    if-nez v6, :cond_11

    .line 429
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 431
    :cond_11
    const/4 v9, 0x1

    goto :goto_6

    .line 433
    :cond_12
    if-nez v4, :cond_16

    .line 434
    if-eqz v5, :cond_15

    .line 435
    if-nez v6, :cond_13

    .line 436
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 439
    :cond_13
    if-ge v2, v3, :cond_14

    .line 440
    const/4 v7, 0x1

    .line 441
    const/4 v10, 0x1

    goto :goto_6

    .line 443
    :cond_14
    const/4 v8, 0x1

    .line 444
    const/4 v9, 0x1

    goto :goto_6

    .line 447
    :cond_15
    if-eqz v6, :cond_17

    .line 448
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 453
    :cond_16
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 456
    :cond_17
    :goto_6
    if-eqz v7, :cond_19

    .line 457
    if-eqz v8, :cond_18

    .line 458
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 460
    :cond_18
    invoke-virtual {p0}, Lo/sm;->k()[I

    move-result-object v0

    invoke-virtual {p0}, Lo/sm;->e()[F

    move-result-object v1

    invoke-static {v0, v1}, Lo/sm;->d([I[F)V

    .line 462
    :cond_19
    if-eqz v8, :cond_1a

    .line 463
    invoke-virtual {p0}, Lo/sm;->k()[I

    move-result-object v0

    invoke-virtual {p0}, Lo/sm;->e()[F

    move-result-object v1

    invoke-static {v0, v1}, Lo/sm;->c([I[F)V

    .line 465
    :cond_1a
    if-eqz v9, :cond_1c

    .line 466
    if-eqz v10, :cond_1b

    .line 467
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 469
    :cond_1b
    invoke-virtual {p0}, Lo/sm;->i()[I

    move-result-object v0

    invoke-virtual {p0}, Lo/sm;->e()[F

    move-result-object v1

    invoke-static {v0, v1}, Lo/sm;->d([I[F)V

    .line 471
    :cond_1c
    if-eqz v10, :cond_1d

    .line 472
    invoke-virtual {p0}, Lo/sm;->i()[I

    move-result-object v0

    invoke-virtual {p0}, Lo/sm;->d()[F

    move-result-object v1

    invoke-static {v0, v1}, Lo/sm;->c([I[F)V

    .line 475
    :cond_1d
    return-void
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 68
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1, p3}, Lo/sm;->a(Lo/qm;ZILjava/util/Map;)Lo/si;

    move-result-object v2

    .line 69
    iget-object v0, p0, Lo/sm;->g:Ljava/util/List;

    invoke-static {v0, v2}, Lo/sm;->b(Ljava/util/Collection;Lo/si;)V

    .line 70
    invoke-virtual {p2}, Lo/qm;->a()V

    .line 71
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0, p1, p3}, Lo/sm;->a(Lo/qm;ZILjava/util/Map;)Lo/si;

    move-result-object v3

    .line 72
    iget-object v0, p0, Lo/sm;->k:Ljava/util/List;

    invoke-static {v0, v3}, Lo/sm;->b(Ljava/util/Collection;Lo/si;)V

    .line 73
    invoke-virtual {p2}, Lo/qm;->a()V

    .line 74
    iget-object v0, p0, Lo/sm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 75
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    .line 76
    iget-object v0, p0, Lo/sm;->g:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/si;

    .line 77
    invoke-virtual {v6}, Lo/si;->a()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 78
    iget-object v0, p0, Lo/sm;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    .line 79
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    .line 80
    iget-object v0, p0, Lo/sm;->k:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/si;

    .line 81
    invoke-virtual {v9}, Lo/si;->a()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 82
    invoke-static {v6, v9}, Lo/sm;->a(Lo/si;Lo/si;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    invoke-static {v6, v9}, Lo/sm;->e(Lo/si;Lo/si;)Lo/or;

    move-result-object v0

    return-object v0

    .line 79
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 75
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 89
    :cond_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method public c()V
    .locals 1

    .line 111
    iget-object v0, p0, Lo/sm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 112
    iget-object v0, p0, Lo/sm;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 113
    return-void
.end method

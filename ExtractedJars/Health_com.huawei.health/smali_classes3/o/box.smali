.class public Lo/box;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[[F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 29
    const/4 v0, 0x4

    new-array v0, v0, [[F

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_3

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/box;->b:[[F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(IF[F)[F
    .locals 10

    .line 189
    const/4 v0, 0x0

    aget v0, p2, v0

    mul-float v3, p1, v0

    .line 191
    const/4 v0, 0x1

    aget v0, p2, v0

    mul-float v4, v3, v0

    .line 193
    const/4 v5, 0x0

    .line 194
    const/4 v6, 0x0

    .line 196
    move v7, v4

    .line 197
    const/4 v8, 0x0

    .line 200
    sub-float v0, p1, v3

    const/high16 v1, 0x40000000    # 2.0f

    div-float v9, v0, v1

    .line 201
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 204
    :sswitch_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput v5, v0, v1

    add-float v1, v6, v9

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 207
    :sswitch_1
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput v7, v0, v1

    add-float v1, v8, v9

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 212
    :goto_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private static c(IF[F)[F
    .locals 10

    .line 146
    const/4 v0, 0x0

    aget v0, p2, v0

    mul-float v3, p1, v0

    .line 148
    const/4 v0, 0x1

    aget v0, p2, v0

    mul-float v4, v3, v0

    .line 151
    const/high16 v0, 0x3f800000    # 1.0f

    mul-float v5, v4, v0

    .line 153
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v5, v0

    sub-float v6, v4, v0

    .line 155
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v4

    sub-float v7, v0, v6

    .line 157
    sub-float v0, p1, v3

    sub-float/2addr v0, v5

    const/high16 v1, 0x40000000    # 2.0f

    div-float v8, v0, v1

    .line 159
    sub-float v0, p1, v3

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float v9, v0, v4

    .line 160
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 163
    :pswitch_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    add-float v1, v4, v9

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    aput v8, v0, v1

    return-object v0

    .line 166
    :pswitch_1
    const/4 v0, 0x2

    new-array v0, v0, [F

    add-float v1, v6, v9

    const/4 v2, 0x0

    aput v1, v0, v2

    add-float v1, v5, v8

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 169
    :pswitch_2
    const/4 v0, 0x2

    new-array v0, v0, [F

    add-float v1, v7, v9

    const/4 v2, 0x0

    aput v1, v0, v2

    add-float v1, v5, v8

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 174
    :goto_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public static d()I
    .locals 1

    .line 23
    const/4 v0, 0x4

    return v0
.end method

.method private static d(F[F)[F
    .locals 4

    .line 226
    const/4 v0, 0x0

    aget v0, p1, v0

    mul-float v2, p0, v0

    .line 227
    sub-float v0, p0, v2

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    .line 228
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput v3, v0, v1

    const/4 v1, 0x1

    aput v3, v0, v1

    return-object v0
.end method

.method private static d(IF[F)[F
    .locals 14

    .line 96
    const/4 v0, 0x0

    aget v0, p2, v0

    mul-float v3, p1, v0

    .line 98
    const/4 v0, 0x1

    aget v0, p2, v0

    mul-float v4, v3, v0

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 103
    move v7, v4

    .line 104
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    move v10, v4

    .line 109
    move v11, v4

    .line 110
    move v12, v10

    .line 113
    sub-float v0, p1, v3

    sub-float/2addr v0, v4

    const/high16 v1, 0x40000000    # 2.0f

    div-float v13, v0, v1

    .line 114
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 117
    :pswitch_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    add-float v1, v5, v13

    const/4 v2, 0x0

    aput v1, v0, v2

    add-float v1, v6, v13

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 120
    :pswitch_1
    const/4 v0, 0x2

    new-array v0, v0, [F

    add-float v1, v7, v13

    const/4 v2, 0x0

    aput v1, v0, v2

    add-float v1, v8, v13

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 123
    :pswitch_2
    const/4 v0, 0x2

    new-array v0, v0, [F

    add-float v1, v9, v13

    const/4 v2, 0x0

    aput v1, v0, v2

    add-float v1, v10, v13

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 126
    :pswitch_3
    const/4 v0, 0x2

    new-array v0, v0, [F

    add-float v1, v11, v13

    const/4 v2, 0x0

    aput v1, v0, v2

    add-float v1, v12, v13

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 131
    :goto_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public static d(IIF[F)[F
    .locals 1

    .line 58
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 62
    :pswitch_0
    invoke-static {p2, p3}, Lo/box;->d(F[F)[F

    move-result-object v0

    return-object v0

    .line 66
    :pswitch_1
    invoke-static {p1, p2, p3}, Lo/box;->b(IF[F)[F

    move-result-object v0

    return-object v0

    .line 70
    :pswitch_2
    invoke-static {p1, p2, p3}, Lo/box;->c(IF[F)[F

    move-result-object v0

    return-object v0

    .line 74
    :pswitch_3
    invoke-static {p1, p2, p3}, Lo/box;->d(IF[F)[F

    move-result-object v0

    return-object v0

    .line 81
    :goto_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public static e(I)[F
    .locals 2

    .line 44
    if-lez p0, :cond_0

    sget-object v0, Lo/box;->b:[[F

    array-length v0, v0

    if-gt p0, v0, :cond_0

    sget-object v0, Lo/box;->b:[[F

    add-int/lit8 v1, p0, -0x1

    aget-object v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [F

    :goto_0
    return-object v0
.end method

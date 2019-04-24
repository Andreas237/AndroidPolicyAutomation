.class public final Lcom/ibotta/android/views/images/transformation/FastBlur;
.super Ljava/lang/Object;
.source "FastBlur.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFastBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBlur.kt\ncom/ibotta/android/views/images/transformation/FastBlur\n+ 2 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n*L\n1#1,308:1\n42#2,5:309\n*E\n*S KotlinDebug\n*F\n+ 1 FastBlur.kt\ncom/ibotta/android/views/images/transformation/FastBlur\n*L\n102#1,5:309\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/views/images/transformation/FastBlur;",
        "",
        "()V",
        "blur",
        "Landroid/graphics/Bitmap;",
        "sentBitmap",
        "radius",
        "",
        "canReuseInBitmap",
        "",
        "ibotta-images_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/ibotta/android/views/images/transformation/FastBlur;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lcom/ibotta/android/views/images/transformation/FastBlur;

    invoke-direct {v0}, Lcom/ibotta/android/views/images/transformation/FastBlur;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/images/transformation/FastBlur;->INSTANCE:Lcom/ibotta/android/views/images/transformation/FastBlur;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final blur(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
    .locals 36
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    const-string v2, "sentBitmap"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    if-eqz p3, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    const-string v3, "bitmap"

    .line 63
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    .line 64
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    mul-int v13, v11, v12

    .line 66
    new-array v14, v13, [I

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v0

    move-object v4, v14

    move v6, v11

    move v9, v11

    move v10, v12

    .line 67
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    add-int/lit8 v3, v11, -0x1

    add-int/lit8 v4, v12, -0x1

    add-int v5, v1, v1

    add-int/2addr v5, v2

    .line 74
    new-array v6, v13, [I

    .line 75
    new-array v7, v13, [I

    .line 76
    new-array v8, v13, [I

    .line 87
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    new-array v9, v9, [I

    add-int/lit8 v10, v5, 0x1

    shr-int/2addr v10, v2

    mul-int v10, v10, v10

    mul-int/lit16 v13, v10, 0x100

    .line 91
    new-array v15, v13, [I

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v13, :cond_1

    .line 95
    div-int v17, v2, v10

    aput v17, v15, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 309
    :cond_1
    new-array v2, v5, [[I

    .line 310
    array-length v10, v2

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v10, :cond_2

    move/from16 v17, v10

    const/4 v10, 0x3

    .line 102
    new-array v10, v10, [I

    aput-object v10, v2, v13

    add-int/lit8 v13, v13, 0x1

    move/from16 v10, v17

    goto :goto_2

    :cond_2
    check-cast v2, [[I

    add-int/lit8 v10, v1, 0x1

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    :goto_3
    const/16 v19, 0x2

    if-ge v13, v12, :cond_7

    move-object/from16 p3, v0

    neg-int v0, v1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    :goto_4
    const v29, 0xff00

    const/high16 v30, 0xff0000

    if-gt v0, v1, :cond_4

    move/from16 v32, v4

    move/from16 v31, v12

    const/4 v12, 0x0

    .line 129
    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int v4, v17, v4

    aget v4, v14, v4

    add-int v33, v0, v1

    .line 130
    aget-object v33, v2, v33

    and-int v30, v4, v30

    shr-int/lit8 v30, v30, 0x10

    .line 131
    aput v30, v33, v12

    and-int v29, v4, v29

    shr-int/lit8 v29, v29, 0x8

    const/16 v16, 0x1

    .line 132
    aput v29, v33, v16

    and-int/lit16 v4, v4, 0xff

    .line 133
    aput v4, v33, v19

    .line 135
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    sub-int v4, v10, v4

    .line 137
    aget v29, v33, v12

    mul-int v29, v29, v4

    add-int v20, v20, v29

    .line 138
    aget v29, v33, v16

    mul-int v29, v29, v4

    add-int v21, v21, v29

    .line 139
    aget v29, v33, v19

    mul-int v29, v29, v4

    add-int v22, v22, v29

    if-lez v0, :cond_3

    .line 142
    aget v4, v33, v12

    add-int v26, v26, v4

    .line 143
    aget v4, v33, v16

    add-int v27, v27, v4

    .line 144
    aget v4, v33, v19

    add-int v28, v28, v4

    goto :goto_5

    .line 146
    :cond_3
    aget v4, v33, v12

    add-int v23, v23, v4

    .line 147
    aget v4, v33, v16

    add-int v24, v24, v4

    .line 148
    aget v4, v33, v19

    add-int v25, v25, v4

    :goto_5
    add-int/lit8 v0, v0, 0x1

    move/from16 v12, v31

    move/from16 v4, v32

    goto :goto_4

    :cond_4
    move/from16 v32, v4

    move/from16 v31, v12

    move v4, v1

    const/4 v0, 0x0

    :goto_6
    if-ge v0, v11, :cond_6

    .line 156
    aget v12, v15, v20

    aput v12, v6, v17

    .line 157
    aget v12, v15, v21

    aput v12, v7, v17

    .line 158
    aget v12, v15, v22

    aput v12, v8, v17

    sub-int v20, v20, v23

    sub-int v21, v21, v24

    sub-int v22, v22, v25

    sub-int v12, v4, v1

    add-int/2addr v12, v5

    .line 165
    rem-int/2addr v12, v5

    aget-object v12, v2, v12

    const/16 v33, 0x0

    .line 167
    aget v34, v12, v33

    sub-int v23, v23, v34

    const/16 v16, 0x1

    .line 168
    aget v33, v12, v16

    sub-int v24, v24, v33

    .line 169
    aget v33, v12, v19

    sub-int v25, v25, v33

    if-nez v13, :cond_5

    add-int v33, v0, v1

    move-object/from16 v34, v15

    add-int/lit8 v15, v33, 0x1

    .line 172
    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    move-result v15

    aput v15, v9, v0

    goto :goto_7

    :cond_5
    move-object/from16 v34, v15

    .line 175
    :goto_7
    aget v15, v9, v0

    add-int v15, v18, v15

    aget v15, v14, v15

    and-int v33, v15, v30

    shr-int/lit8 v33, v33, 0x10

    const/16 v35, 0x0

    .line 177
    aput v33, v12, v35

    and-int v33, v15, v29

    shr-int/lit8 v33, v33, 0x8

    const/16 v16, 0x1

    .line 178
    aput v33, v12, v16

    and-int/lit16 v15, v15, 0xff

    .line 179
    aput v15, v12, v19

    .line 181
    aget v15, v12, v35

    add-int v26, v26, v15

    .line 182
    aget v15, v12, v16

    add-int v27, v27, v15

    .line 183
    aget v12, v12, v19

    add-int v28, v28, v12

    add-int v20, v20, v26

    add-int v21, v21, v27

    add-int v22, v22, v28

    add-int/lit8 v4, v4, 0x1

    .line 189
    rem-int/2addr v4, v5

    .line 190
    rem-int v12, v4, v5

    aget-object v12, v2, v12

    const/4 v15, 0x0

    .line 192
    aget v33, v12, v15

    add-int v23, v23, v33

    const/16 v16, 0x1

    .line 193
    aget v33, v12, v16

    add-int v24, v24, v33

    .line 194
    aget v33, v12, v19

    add-int v25, v25, v33

    .line 196
    aget v33, v12, v15

    sub-int v26, v26, v33

    .line 197
    aget v15, v12, v16

    sub-int v27, v27, v15

    .line 198
    aget v12, v12, v19

    sub-int v28, v28, v12

    add-int/lit8 v17, v17, 0x1

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v15, v34

    goto/16 :goto_6

    :cond_6
    move-object/from16 v34, v15

    add-int v18, v18, v11

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p3

    move/from16 v12, v31

    move/from16 v4, v32

    goto/16 :goto_3

    :cond_7
    move-object/from16 p3, v0

    move/from16 v32, v4

    move/from16 v31, v12

    move-object/from16 v34, v15

    const/4 v0, 0x0

    :goto_8
    if-ge v0, v11, :cond_d

    neg-int v3, v1

    mul-int v4, v3, v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_9
    if-gt v3, v1, :cond_a

    move-object/from16 v24, v9

    const/4 v9, 0x0

    .line 222
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v25

    add-int v25, v25, v0

    add-int v26, v3, v1

    .line 224
    aget-object v26, v2, v26

    .line 225
    aget v27, v6, v25

    aput v27, v26, v9

    .line 226
    aget v9, v7, v25

    const/16 v16, 0x1

    aput v9, v26, v16

    .line 227
    aget v9, v8, v25

    aput v9, v26, v19

    .line 229
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v9

    sub-int v9, v10, v9

    .line 231
    aget v27, v6, v25

    mul-int v27, v27, v9

    add-int v12, v12, v27

    .line 232
    aget v27, v7, v25

    mul-int v27, v27, v9

    add-int v13, v13, v27

    .line 233
    aget v25, v8, v25

    mul-int v25, v25, v9

    add-int v15, v15, v25

    if-lez v3, :cond_8

    const/4 v9, 0x0

    .line 236
    aget v25, v26, v9

    add-int v21, v21, v25

    const/16 v16, 0x1

    .line 237
    aget v25, v26, v16

    add-int v22, v22, v25

    .line 238
    aget v25, v26, v19

    add-int v23, v23, v25

    move/from16 v9, v32

    goto :goto_a

    :cond_8
    const/4 v9, 0x0

    const/16 v16, 0x1

    .line 240
    aget v25, v26, v9

    add-int v17, v17, v25

    .line 241
    aget v9, v26, v16

    add-int v18, v18, v9

    .line 242
    aget v9, v26, v19

    add-int v20, v20, v9

    move/from16 v9, v32

    :goto_a
    if-ge v3, v9, :cond_9

    add-int/2addr v4, v11

    :cond_9
    add-int/lit8 v3, v3, 0x1

    move/from16 v32, v9

    move-object/from16 v9, v24

    goto :goto_9

    :cond_a
    move-object/from16 v24, v9

    move/from16 v9, v32

    move v4, v0

    move/from16 v25, v22

    move/from16 v26, v23

    const/4 v3, 0x0

    move/from16 v22, v1

    move/from16 v23, v21

    move/from16 v21, v20

    move/from16 v20, v18

    move/from16 v18, v17

    move/from16 v17, v15

    move v15, v13

    move v13, v12

    move/from16 v12, v31

    :goto_b
    if-ge v3, v12, :cond_c

    const/high16 v27, -0x1000000

    .line 257
    aget v28, v14, v4

    and-int v27, v28, v27

    aget v28, v34, v13

    shl-int/lit8 v28, v28, 0x10

    or-int v27, v27, v28

    aget v28, v34, v15

    shl-int/lit8 v28, v28, 0x8

    or-int v27, v27, v28

    aget v28, v34, v17

    or-int v27, v27, v28

    aput v27, v14, v4

    sub-int v13, v13, v18

    sub-int v15, v15, v20

    sub-int v17, v17, v21

    sub-int v27, v22, v1

    add-int v27, v27, v5

    .line 264
    rem-int v27, v27, v5

    aget-object v27, v2, v27

    const/16 v28, 0x0

    .line 266
    aget v29, v27, v28

    sub-int v18, v18, v29

    const/16 v16, 0x1

    .line 267
    aget v28, v27, v16

    sub-int v20, v20, v28

    .line 268
    aget v28, v27, v19

    sub-int v21, v21, v28

    if-nez v0, :cond_b

    add-int v1, v3, v10

    .line 271
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    mul-int v1, v1, v11

    aput v1, v24, v3

    .line 273
    :cond_b
    aget v1, v24, v3

    add-int/2addr v1, v0

    .line 275
    aget v28, v6, v1

    const/16 v29, 0x0

    aput v28, v27, v29

    .line 276
    aget v28, v7, v1

    const/16 v16, 0x1

    aput v28, v27, v16

    .line 277
    aget v1, v8, v1

    aput v1, v27, v19

    .line 279
    aget v1, v27, v29

    add-int v23, v23, v1

    .line 280
    aget v1, v27, v16

    add-int v25, v25, v1

    .line 281
    aget v1, v27, v19

    add-int v26, v26, v1

    add-int v13, v13, v23

    add-int v15, v15, v25

    add-int v17, v17, v26

    add-int/lit8 v22, v22, 0x1

    .line 287
    rem-int v22, v22, v5

    .line 288
    aget-object v1, v2, v22

    const/16 v27, 0x0

    .line 290
    aget v28, v1, v27

    add-int v18, v18, v28

    const/16 v16, 0x1

    .line 291
    aget v28, v1, v16

    add-int v20, v20, v28

    .line 292
    aget v28, v1, v19

    add-int v21, v21, v28

    .line 294
    aget v28, v1, v27

    sub-int v23, v23, v28

    .line 295
    aget v28, v1, v16

    sub-int v25, v25, v28

    .line 296
    aget v1, v1, v19

    sub-int v26, v26, v1

    add-int/2addr v4, v11

    add-int/lit8 v3, v3, 0x1

    move/from16 v1, p2

    goto/16 :goto_b

    :cond_c
    const/16 v16, 0x1

    const/16 v27, 0x0

    add-int/lit8 v0, v0, 0x1

    move/from16 v32, v9

    move/from16 v31, v12

    move-object/from16 v9, v24

    move/from16 v1, p2

    goto/16 :goto_8

    :cond_d
    move/from16 v12, v31

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, p3

    move-object v4, v14

    move v6, v11

    move v9, v11

    move v10, v12

    .line 304
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object p3
.end method

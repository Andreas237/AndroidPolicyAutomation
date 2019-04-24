.class final Ljava9/util/DualPivotQuicksort;
.super Ljava/lang/Object;
.source "DualPivotQuicksort.java"


# direct methods
.method private static doSort([DII[DII)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    sub-int v4, v2, v1

    const/4 v5, 0x1

    const/16 v6, 0x11e

    if-ge v4, v6, :cond_0

    .line 2730
    invoke-static {v0, v1, v2, v5}, Ljava9/util/DualPivotQuicksort;->sort([DIIZ)V

    return-void

    :cond_0
    const/16 v4, 0x44

    .line 2738
    new-array v4, v4, [I

    const/4 v6, 0x0

    aput v1, v4, v6

    move v7, v1

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v2, :cond_8

    :goto_1
    if-ge v7, v2, :cond_1

    .line 2744
    aget-wide v9, v0, v7

    add-int/lit8 v11, v7, 0x1

    aget-wide v12, v0, v11

    cmpl-double v14, v9, v12

    if-nez v14, :cond_1

    move v7, v11

    goto :goto_1

    :cond_1
    if-ne v7, v2, :cond_2

    goto :goto_5

    .line 2747
    :cond_2
    aget-wide v9, v0, v7

    add-int/lit8 v11, v7, 0x1

    aget-wide v12, v0, v11

    cmpg-double v14, v9, v12

    if-gez v14, :cond_3

    :goto_2
    add-int/2addr v7, v5

    if-gt v7, v2, :cond_5

    add-int/lit8 v9, v7, -0x1

    .line 2748
    aget-wide v9, v0, v9

    aget-wide v11, v0, v7

    cmpg-double v13, v9, v11

    if-gtz v13, :cond_5

    goto :goto_2

    .line 2749
    :cond_3
    aget-wide v9, v0, v7

    aget-wide v11, v0, v11

    cmpl-double v13, v9, v11

    if-lez v13, :cond_5

    :goto_3
    add-int/2addr v7, v5

    if-gt v7, v2, :cond_4

    add-int/lit8 v9, v7, -0x1

    .line 2750
    aget-wide v9, v0, v9

    aget-wide v11, v0, v7

    cmpl-double v13, v9, v11

    if-ltz v13, :cond_4

    goto :goto_3

    .line 2752
    :cond_4
    aget v9, v4, v8

    sub-int/2addr v9, v5

    move v10, v7

    :goto_4
    add-int/2addr v9, v5

    add-int/lit8 v10, v10, -0x1

    if-ge v9, v10, :cond_5

    .line 2753
    aget-wide v11, v0, v9

    aget-wide v13, v0, v10

    aput-wide v13, v0, v9

    aput-wide v11, v0, v10

    goto :goto_4

    .line 2759
    :cond_5
    aget v9, v4, v8

    if-le v9, v1, :cond_6

    aget v9, v4, v8

    aget-wide v9, v0, v9

    aget v11, v4, v8

    sub-int/2addr v11, v5

    aget-wide v11, v0, v11

    cmpl-double v13, v9, v11

    if-ltz v13, :cond_6

    add-int/lit8 v8, v8, -0x1

    :cond_6
    add-int/2addr v8, v5

    const/16 v9, 0x43

    if-ne v8, v9, :cond_7

    .line 2768
    invoke-static {v0, v1, v2, v5}, Ljava9/util/DualPivotQuicksort;->sort([DIIZ)V

    return-void

    .line 2742
    :cond_7
    aput v7, v4, v8

    goto :goto_0

    :cond_8
    :goto_5
    if-nez v8, :cond_9

    return-void

    :cond_9
    if-ne v8, v5, :cond_a

    .line 2780
    aget v7, v4, v8

    if-le v7, v2, :cond_a

    return-void

    :cond_a
    add-int/2addr v2, v5

    .line 2787
    aget v7, v4, v8

    if-ge v7, v2, :cond_b

    add-int/lit8 v8, v8, 0x1

    .line 2792
    aput v2, v4, v8

    :cond_b
    const/4 v7, 0x1

    const/4 v9, 0x0

    :goto_6
    shl-int/2addr v7, v5

    if-ge v7, v8, :cond_c

    xor-int/lit8 v9, v9, 0x1

    int-to-byte v9, v9

    goto :goto_6

    :cond_c
    sub-int v7, v2, v1

    if-eqz v3, :cond_e

    move/from16 v10, p5

    if-lt v10, v7, :cond_e

    add-int v10, p4, v7

    .line 2803
    array-length v11, v3

    if-le v10, v11, :cond_d

    goto :goto_7

    :cond_d
    move/from16 v10, p4

    goto :goto_8

    .line 2804
    :cond_e
    :goto_7
    new-array v3, v7, [D

    const/4 v10, 0x0

    :goto_8
    if-nez v9, :cond_f

    .line 2808
    invoke-static {v0, v1, v3, v10, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v1, v10, v1

    const/4 v10, 0x0

    move-object/from16 v21, v3

    move-object v3, v0

    move-object/from16 v0, v21

    goto :goto_9

    :cond_f
    sub-int/2addr v10, v1

    const/4 v1, 0x0

    :goto_9
    if-le v8, v5, :cond_16

    const/4 v7, 0x2

    const/4 v9, 0x0

    :goto_a
    if-gt v7, v8, :cond_13

    .line 2822
    aget v11, v4, v7

    add-int/lit8 v12, v7, -0x1

    aget v12, v4, v12

    add-int/lit8 v13, v7, -0x2

    .line 2823
    aget v13, v4, v13

    move v14, v12

    move v15, v13

    :goto_b
    if-ge v13, v11, :cond_12

    if-ge v14, v11, :cond_11

    if-ge v15, v12, :cond_10

    add-int v16, v15, v1

    .line 2824
    aget-wide v16, v0, v16

    add-int v18, v14, v1

    aget-wide v18, v0, v18

    cmpg-double v20, v16, v18

    if-gtz v20, :cond_10

    goto :goto_c

    :cond_10
    add-int v16, v13, v10

    add-int/lit8 v17, v14, 0x1

    add-int/2addr v14, v1

    .line 2827
    aget-wide v18, v0, v14

    aput-wide v18, v3, v16

    move/from16 v14, v17

    goto :goto_d

    :cond_11
    :goto_c
    add-int v16, v13, v10

    add-int/lit8 v17, v15, 0x1

    add-int/2addr v15, v1

    .line 2825
    aget-wide v18, v0, v15

    aput-wide v18, v3, v16

    move/from16 v15, v17

    :goto_d
    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_12
    add-int/lit8 v9, v9, 0x1

    .line 2830
    aput v11, v4, v9

    add-int/lit8 v7, v7, 0x2

    goto :goto_a

    :cond_13
    and-int/lit8 v7, v8, 0x1

    if-eqz v7, :cond_15

    add-int/lit8 v8, v8, -0x1

    .line 2833
    aget v7, v4, v8

    move v8, v2

    :goto_e
    add-int/lit8 v8, v8, -0x1

    if-lt v8, v7, :cond_14

    add-int v11, v8, v10

    add-int v12, v8, v1

    .line 2834
    aget-wide v12, v0, v12

    aput-wide v12, v3, v11

    goto :goto_e

    :cond_14
    add-int/lit8 v9, v9, 0x1

    .line 2836
    aput v2, v4, v9

    move v8, v9

    goto :goto_f

    :cond_15
    move v8, v9

    :goto_f
    move-object/from16 v21, v3

    move-object v3, v0

    move-object/from16 v0, v21

    move/from16 v22, v10

    move v10, v1

    move/from16 v1, v22

    goto :goto_9

    :cond_16
    return-void
.end method

.method private static sort([DIIZ)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    sub-int v4, v2, v1

    add-int/lit8 v4, v4, 0x1

    const/16 v5, 0x2f

    if-ge v4, v5, :cond_a

    if-eqz v3, :cond_2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_9

    add-int/lit8 v4, v3, 0x1

    .line 2863
    aget-wide v5, v0, v4

    .line 2864
    :goto_1
    aget-wide v7, v0, v3

    cmpg-double v9, v5, v7

    if-gez v9, :cond_1

    add-int/lit8 v7, v3, 0x1

    .line 2865
    aget-wide v8, v0, v3

    aput-wide v8, v0, v7

    add-int/lit8 v7, v3, -0x1

    if-ne v3, v1, :cond_0

    move v3, v7

    goto :goto_2

    :cond_0
    move v3, v7

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 2870
    aput-wide v5, v0, v3

    move v3, v4

    goto :goto_0

    :cond_2
    if-lt v1, v2, :cond_3

    return-void

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 2880
    aget-wide v3, v0, v1

    add-int/lit8 v5, v1, -0x1

    aget-wide v5, v0, v5

    cmpl-double v7, v3, v5

    if-gez v7, :cond_2

    :goto_3
    add-int/lit8 v3, v1, 0x1

    if-gt v3, v2, :cond_7

    .line 2891
    aget-wide v4, v0, v1

    aget-wide v6, v0, v3

    cmpg-double v8, v4, v6

    if-gez v8, :cond_4

    .line 2894
    aget-wide v6, v0, v3

    move-wide/from16 v19, v4

    move-wide v4, v6

    move-wide/from16 v6, v19

    :cond_4
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 2896
    aget-wide v8, v0, v1

    cmpg-double v10, v4, v8

    if-gez v10, :cond_5

    add-int/lit8 v8, v1, 0x2

    .line 2897
    aget-wide v9, v0, v1

    aput-wide v9, v0, v8

    goto :goto_4

    :cond_5
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v8, v1, 0x1

    .line 2899
    aput-wide v4, v0, v8

    :goto_5
    add-int/lit8 v1, v1, -0x1

    .line 2901
    aget-wide v4, v0, v1

    cmpg-double v8, v6, v4

    if-gez v8, :cond_6

    add-int/lit8 v4, v1, 0x1

    .line 2902
    aget-wide v8, v0, v1

    aput-wide v8, v0, v4

    goto :goto_5

    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 2904
    aput-wide v6, v0, v1

    add-int/lit8 v1, v3, 0x1

    goto :goto_3

    .line 2906
    :cond_7
    aget-wide v3, v0, v2

    :goto_6
    add-int/lit8 v2, v2, -0x1

    .line 2908
    aget-wide v5, v0, v2

    cmpg-double v1, v3, v5

    if-gez v1, :cond_8

    add-int/lit8 v1, v2, 0x1

    .line 2909
    aget-wide v5, v0, v2

    aput-wide v5, v0, v1

    goto :goto_6

    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 2911
    aput-wide v3, v0, v2

    :cond_9
    return-void

    :cond_a
    shr-int/lit8 v5, v4, 0x3

    shr-int/lit8 v4, v4, 0x6

    add-int/2addr v5, v4

    add-int/lit8 v5, v5, 0x1

    add-int v4, v1, v2

    ushr-int/lit8 v4, v4, 0x1

    sub-int v6, v4, v5

    sub-int v7, v6, v5

    add-int v8, v4, v5

    add-int/2addr v5, v8

    .line 2933
    aget-wide v9, v0, v6

    aget-wide v11, v0, v7

    cmpg-double v13, v9, v11

    if-gez v13, :cond_b

    aget-wide v9, v0, v6

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 2935
    :cond_b
    aget-wide v9, v0, v4

    aget-wide v11, v0, v6

    cmpg-double v13, v9, v11

    if-gez v13, :cond_c

    aget-wide v9, v0, v4

    aget-wide v11, v0, v6

    aput-wide v11, v0, v4

    aput-wide v9, v0, v6

    .line 2936
    aget-wide v11, v0, v7

    cmpg-double v13, v9, v11

    if-gez v13, :cond_c

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 2938
    :cond_c
    aget-wide v9, v0, v8

    aget-wide v11, v0, v4

    cmpg-double v13, v9, v11

    if-gez v13, :cond_d

    aget-wide v9, v0, v8

    aget-wide v11, v0, v4

    aput-wide v11, v0, v8

    aput-wide v9, v0, v4

    .line 2939
    aget-wide v11, v0, v6

    cmpg-double v13, v9, v11

    if-gez v13, :cond_d

    aget-wide v11, v0, v6

    aput-wide v11, v0, v4

    aput-wide v9, v0, v6

    .line 2940
    aget-wide v11, v0, v7

    cmpg-double v13, v9, v11

    if-gez v13, :cond_d

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 2943
    :cond_d
    aget-wide v9, v0, v5

    aget-wide v11, v0, v8

    cmpg-double v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v9, v0, v5

    aget-wide v11, v0, v8

    aput-wide v11, v0, v5

    aput-wide v9, v0, v8

    .line 2944
    aget-wide v11, v0, v4

    cmpg-double v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v11, v0, v4

    aput-wide v11, v0, v8

    aput-wide v9, v0, v4

    .line 2945
    aget-wide v11, v0, v6

    cmpg-double v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v11, v0, v6

    aput-wide v11, v0, v4

    aput-wide v9, v0, v6

    .line 2946
    aget-wide v11, v0, v7

    cmpg-double v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 2955
    :cond_e
    aget-wide v9, v0, v7

    aget-wide v11, v0, v6

    const/4 v13, 0x0

    cmpl-double v14, v9, v11

    if-eqz v14, :cond_1f

    aget-wide v9, v0, v6

    aget-wide v11, v0, v4

    cmpl-double v14, v9, v11

    if-eqz v14, :cond_1f

    aget-wide v9, v0, v4

    aget-wide v11, v0, v8

    cmpl-double v14, v9, v11

    if-eqz v14, :cond_1f

    aget-wide v9, v0, v8

    aget-wide v11, v0, v5

    cmpl-double v14, v9, v11

    if-eqz v14, :cond_1f

    .line 2961
    aget-wide v9, v0, v6

    .line 2962
    aget-wide v11, v0, v8

    .line 2970
    aget-wide v14, v0, v1

    aput-wide v14, v0, v6

    .line 2971
    aget-wide v14, v0, v2

    aput-wide v14, v0, v8

    move v4, v1

    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 2976
    aget-wide v14, v0, v4

    cmpg-double v6, v14, v9

    if-gez v6, :cond_f

    goto :goto_7

    :cond_f
    move v6, v2

    :goto_8
    add-int/lit8 v6, v6, -0x1

    .line 2977
    aget-wide v14, v0, v6

    cmpl-double v8, v14, v11

    if-lez v8, :cond_10

    goto :goto_8

    :cond_10
    add-int/lit8 v8, v4, -0x1

    :cond_11
    :goto_9
    add-int/lit8 v8, v8, 0x1

    if-gt v8, v6, :cond_16

    .line 3000
    aget-wide v14, v0, v8

    cmpg-double v16, v14, v9

    if-gez v16, :cond_12

    .line 3002
    aget-wide v16, v0, v4

    aput-wide v16, v0, v8

    .line 3007
    aput-wide v14, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_12
    cmpl-double v16, v14, v11

    if-lez v16, :cond_11

    .line 3010
    :goto_a
    aget-wide v16, v0, v6

    cmpl-double v18, v16, v11

    if-lez v18, :cond_14

    add-int/lit8 v16, v6, -0x1

    if-ne v6, v8, :cond_13

    move/from16 v6, v16

    goto :goto_c

    :cond_13
    move/from16 v6, v16

    goto :goto_a

    .line 3015
    :cond_14
    aget-wide v16, v0, v6

    cmpg-double v18, v16, v9

    if-gez v18, :cond_15

    .line 3016
    aget-wide v16, v0, v4

    aput-wide v16, v0, v8

    .line 3017
    aget-wide v16, v0, v6

    aput-wide v16, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    .line 3020
    :cond_15
    aget-wide v16, v0, v6

    aput-wide v16, v0, v8

    .line 3026
    :goto_b
    aput-wide v14, v0, v6

    add-int/lit8 v6, v6, -0x1

    goto :goto_9

    :cond_16
    :goto_c
    add-int/lit8 v8, v4, -0x1

    .line 3032
    aget-wide v14, v0, v8

    aput-wide v14, v0, v1

    aput-wide v9, v0, v8

    add-int/lit8 v8, v6, 0x1

    .line 3033
    aget-wide v14, v0, v8

    aput-wide v14, v0, v2

    aput-wide v11, v0, v8

    add-int/lit8 v8, v4, -0x2

    .line 3036
    invoke-static {v0, v1, v8, v3}, Ljava9/util/DualPivotQuicksort;->sort([DIIZ)V

    add-int/lit8 v1, v6, 0x2

    .line 3037
    invoke-static {v0, v1, v2, v13}, Ljava9/util/DualPivotQuicksort;->sort([DIIZ)V

    if-ge v4, v7, :cond_1e

    if-ge v5, v6, :cond_1e

    .line 3047
    :goto_d
    aget-wide v1, v0, v4

    cmpl-double v3, v1, v9

    if-nez v3, :cond_17

    add-int/lit8 v4, v4, 0x1

    goto :goto_d

    .line 3051
    :cond_17
    :goto_e
    aget-wide v1, v0, v6

    cmpl-double v3, v1, v11

    if-nez v3, :cond_18

    add-int/lit8 v6, v6, -0x1

    goto :goto_e

    :cond_18
    add-int/lit8 v1, v4, -0x1

    :cond_19
    :goto_f
    add-int/lit8 v1, v1, 0x1

    if-gt v1, v6, :cond_1e

    .line 3076
    aget-wide v2, v0, v1

    cmpl-double v5, v2, v9

    if-nez v5, :cond_1a

    .line 3078
    aget-wide v7, v0, v4

    aput-wide v7, v0, v1

    .line 3079
    aput-wide v2, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_1a
    cmpl-double v5, v2, v11

    if-nez v5, :cond_19

    .line 3082
    :goto_10
    aget-wide v7, v0, v6

    cmpl-double v5, v7, v11

    if-nez v5, :cond_1c

    add-int/lit8 v5, v6, -0x1

    if-ne v6, v1, :cond_1b

    move v6, v5

    goto :goto_12

    :cond_1b
    move v6, v5

    goto :goto_10

    .line 3087
    :cond_1c
    aget-wide v7, v0, v6

    cmpl-double v5, v7, v9

    if-nez v5, :cond_1d

    .line 3088
    aget-wide v7, v0, v4

    aput-wide v7, v0, v1

    .line 3097
    aget-wide v7, v0, v6

    aput-wide v7, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    .line 3100
    :cond_1d
    aget-wide v7, v0, v6

    aput-wide v7, v0, v1

    .line 3102
    :goto_11
    aput-wide v2, v0, v6

    add-int/lit8 v6, v6, -0x1

    goto :goto_f

    .line 3109
    :cond_1e
    :goto_12
    invoke-static {v0, v4, v6, v13}, Ljava9/util/DualPivotQuicksort;->sort([DIIZ)V

    goto :goto_17

    .line 3116
    :cond_1f
    aget-wide v4, v0, v4

    move v6, v1

    move v8, v6

    move v7, v2

    :goto_13
    if-gt v6, v7, :cond_24

    .line 3139
    aget-wide v9, v0, v6

    cmpl-double v11, v9, v4

    if-nez v11, :cond_20

    goto :goto_16

    .line 3142
    :cond_20
    aget-wide v9, v0, v6

    cmpg-double v11, v9, v4

    if-gez v11, :cond_21

    .line 3144
    aget-wide v11, v0, v8

    aput-wide v11, v0, v6

    .line 3145
    aput-wide v9, v0, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_16

    .line 3148
    :cond_21
    :goto_14
    aget-wide v11, v0, v7

    cmpl-double v14, v11, v4

    if-lez v14, :cond_22

    add-int/lit8 v7, v7, -0x1

    goto :goto_14

    .line 3151
    :cond_22
    aget-wide v11, v0, v7

    cmpg-double v14, v11, v4

    if-gez v14, :cond_23

    .line 3152
    aget-wide v11, v0, v8

    aput-wide v11, v0, v6

    .line 3153
    aget-wide v11, v0, v7

    aput-wide v11, v0, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_15

    .line 3164
    :cond_23
    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    .line 3166
    :goto_15
    aput-wide v9, v0, v7

    add-int/lit8 v7, v7, -0x1

    :goto_16
    add-int/lit8 v6, v6, 0x1

    goto :goto_13

    :cond_24
    add-int/lit8 v8, v8, -0x1

    .line 3176
    invoke-static {v0, v1, v8, v3}, Ljava9/util/DualPivotQuicksort;->sort([DIIZ)V

    add-int/lit8 v7, v7, 0x1

    .line 3177
    :try_start_0
    invoke-static {v0, v7, v2, v13}, Ljava9/util/DualPivotQuicksort;->sort([DIIZ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_17
    return-void

    :catch_0
    move-exception v0

    move-object v1, v0

    throw v1
.end method

.method static sort([DII[DII)V
    .locals 7

    :goto_0
    if-gt p1, p2, :cond_0

    .line 2640
    aget-wide v0, p0, p2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    move v6, p2

    :cond_1
    :goto_1
    add-int/lit8 p2, p2, -0x1

    if-lt p2, p1, :cond_2

    .line 2644
    aget-wide v0, p0, p2

    cmpl-double v2, v0, v0

    if-eqz v2, :cond_1

    .line 2646
    aget-wide v2, p0, v6

    aput-wide v2, p0, p2

    .line 2647
    aput-wide v0, p0, v6

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_2
    move-object v0, p0

    move v1, p1

    move v2, v6

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 2655
    invoke-static/range {v0 .. v5}, Ljava9/util/DualPivotQuicksort;->doSort([DII[DII)V

    move p2, v6

    :goto_2
    const-wide/16 p3, 0x0

    if-ge p1, p2, :cond_4

    add-int p5, p1, p2

    ushr-int/lit8 p5, p5, 0x1

    .line 2667
    aget-wide v0, p0, p5

    cmpg-double v2, v0, p3

    if-gez v2, :cond_3

    add-int/lit8 p5, p5, 0x1

    move p1, p5

    goto :goto_2

    :cond_3
    move p2, p5

    goto :goto_2

    :cond_4
    :goto_3
    const-wide/16 v0, 0x0

    if-gt p1, v6, :cond_5

    .line 2679
    aget-wide v2, p0, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-gez p2, :cond_5

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    add-int/lit8 p2, p1, -0x1

    :cond_6
    :goto_4
    add-int/lit8 p1, p1, 0x1

    if-gt p1, v6, :cond_8

    .line 2705
    aget-wide v2, p0, p1

    cmpl-double p5, v2, p3

    if-eqz p5, :cond_7

    goto :goto_5

    .line 2709
    :cond_7
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v2

    cmp-long p5, v2, v0

    if-gez p5, :cond_6

    .line 2710
    aput-wide p3, p0, p1

    add-int/lit8 p2, p2, 0x1

    const-wide/high16 v2, -0x8000000000000000L

    .line 2711
    aput-wide v2, p0, p2

    goto :goto_4

    :cond_8
    :goto_5
    return-void
.end method

.method private static sort([IIIZ)V
    .locals 11

    sub-int v0, p2, p1

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x2f

    if-ge v0, v1, :cond_a

    if-eqz p3, :cond_2

    move p3, p1

    :goto_0
    if-ge p3, p2, :cond_9

    add-int/lit8 v0, p3, 0x1

    .line 238
    aget v1, p0, v0

    .line 239
    :goto_1
    aget v2, p0, p3

    if-ge v1, v2, :cond_1

    add-int/lit8 v2, p3, 0x1

    .line 240
    aget v3, p0, p3

    aput v3, p0, v2

    add-int/lit8 v2, p3, -0x1

    if-ne p3, p1, :cond_0

    move p3, v2

    goto :goto_2

    :cond_0
    move p3, v2

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 p3, p3, 0x1

    .line 245
    aput v1, p0, p3

    move p3, v0

    goto :goto_0

    :cond_2
    if-lt p1, p2, :cond_3

    return-void

    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 255
    aget p3, p0, p1

    add-int/lit8 v0, p1, -0x1

    aget v0, p0, v0

    if-ge p3, v0, :cond_2

    :goto_3
    add-int/lit8 p3, p1, 0x1

    if-gt p3, p2, :cond_7

    .line 266
    aget v0, p0, p1

    aget v1, p0, p3

    if-ge v0, v1, :cond_4

    .line 269
    aget v1, p0, p3

    move v10, v1

    move v1, v0

    move v0, v10

    :cond_4
    :goto_4
    add-int/lit8 p1, p1, -0x1

    .line 271
    aget v2, p0, p1

    if-ge v0, v2, :cond_5

    add-int/lit8 v2, p1, 0x2

    .line 272
    aget v3, p0, p1

    aput v3, p0, v2

    goto :goto_4

    :cond_5
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v2, p1, 0x1

    .line 274
    aput v0, p0, v2

    :goto_5
    add-int/lit8 p1, p1, -0x1

    .line 276
    aget v0, p0, p1

    if-ge v1, v0, :cond_6

    add-int/lit8 v0, p1, 0x1

    .line 277
    aget v2, p0, p1

    aput v2, p0, v0

    goto :goto_5

    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 279
    aput v1, p0, p1

    add-int/lit8 p1, p3, 0x1

    goto :goto_3

    .line 281
    :cond_7
    aget p1, p0, p2

    :goto_6
    add-int/lit8 p2, p2, -0x1

    .line 283
    aget p3, p0, p2

    if-ge p1, p3, :cond_8

    add-int/lit8 p3, p2, 0x1

    .line 284
    aget v0, p0, p2

    aput v0, p0, p3

    goto :goto_6

    :cond_8
    add-int/lit8 p2, p2, 0x1

    .line 286
    aput p1, p0, p2

    :cond_9
    return-void

    :cond_a
    shr-int/lit8 v1, v0, 0x3

    shr-int/lit8 v0, v0, 0x6

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    add-int v0, p1, p2

    ushr-int/lit8 v0, v0, 0x1

    sub-int v2, v0, v1

    sub-int v3, v2, v1

    add-int v4, v0, v1

    add-int/2addr v1, v4

    .line 308
    aget v5, p0, v2

    aget v6, p0, v3

    if-ge v5, v6, :cond_b

    aget v5, p0, v2

    aget v6, p0, v3

    aput v6, p0, v2

    aput v5, p0, v3

    .line 310
    :cond_b
    aget v5, p0, v0

    aget v6, p0, v2

    if-ge v5, v6, :cond_c

    aget v5, p0, v0

    aget v6, p0, v2

    aput v6, p0, v0

    aput v5, p0, v2

    .line 311
    aget v6, p0, v3

    if-ge v5, v6, :cond_c

    aget v6, p0, v3

    aput v6, p0, v2

    aput v5, p0, v3

    .line 313
    :cond_c
    aget v5, p0, v4

    aget v6, p0, v0

    if-ge v5, v6, :cond_d

    aget v5, p0, v4

    aget v6, p0, v0

    aput v6, p0, v4

    aput v5, p0, v0

    .line 314
    aget v6, p0, v2

    if-ge v5, v6, :cond_d

    aget v6, p0, v2

    aput v6, p0, v0

    aput v5, p0, v2

    .line 315
    aget v6, p0, v3

    if-ge v5, v6, :cond_d

    aget v6, p0, v3

    aput v6, p0, v2

    aput v5, p0, v3

    .line 318
    :cond_d
    aget v5, p0, v1

    aget v6, p0, v4

    if-ge v5, v6, :cond_e

    aget v5, p0, v1

    aget v6, p0, v4

    aput v6, p0, v1

    aput v5, p0, v4

    .line 319
    aget v6, p0, v0

    if-ge v5, v6, :cond_e

    aget v6, p0, v0

    aput v6, p0, v4

    aput v5, p0, v0

    .line 320
    aget v6, p0, v2

    if-ge v5, v6, :cond_e

    aget v6, p0, v2

    aput v6, p0, v0

    aput v5, p0, v2

    .line 321
    aget v6, p0, v3

    if-ge v5, v6, :cond_e

    aget v6, p0, v3

    aput v6, p0, v2

    aput v5, p0, v3

    .line 330
    :cond_e
    aget v5, p0, v3

    aget v6, p0, v2

    const/4 v7, 0x0

    if-eq v5, v6, :cond_1f

    aget v5, p0, v2

    aget v6, p0, v0

    if-eq v5, v6, :cond_1f

    aget v5, p0, v0

    aget v6, p0, v4

    if-eq v5, v6, :cond_1f

    aget v5, p0, v4

    aget v6, p0, v1

    if-eq v5, v6, :cond_1f

    .line 336
    aget v0, p0, v2

    .line 337
    aget v5, p0, v4

    .line 345
    aget v6, p0, p1

    aput v6, p0, v2

    .line 346
    aget v2, p0, p2

    aput v2, p0, v4

    move v2, p1

    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 351
    aget v4, p0, v2

    if-ge v4, v0, :cond_f

    goto :goto_7

    :cond_f
    move v4, p2

    :goto_8
    add-int/lit8 v4, v4, -0x1

    .line 352
    aget v6, p0, v4

    if-le v6, v5, :cond_10

    goto :goto_8

    :cond_10
    add-int/lit8 v6, v2, -0x1

    :cond_11
    :goto_9
    add-int/lit8 v6, v6, 0x1

    if-gt v6, v4, :cond_16

    .line 375
    aget v8, p0, v6

    if-ge v8, v0, :cond_12

    .line 377
    aget v9, p0, v2

    aput v9, p0, v6

    .line 382
    aput v8, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_12
    if-le v8, v5, :cond_11

    .line 385
    :goto_a
    aget v9, p0, v4

    if-le v9, v5, :cond_14

    add-int/lit8 v9, v4, -0x1

    if-ne v4, v6, :cond_13

    move v4, v9

    goto :goto_c

    :cond_13
    move v4, v9

    goto :goto_a

    .line 390
    :cond_14
    aget v9, p0, v4

    if-ge v9, v0, :cond_15

    .line 391
    aget v9, p0, v2

    aput v9, p0, v6

    .line 392
    aget v9, p0, v4

    aput v9, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    .line 395
    :cond_15
    aget v9, p0, v4

    aput v9, p0, v6

    .line 401
    :goto_b
    aput v8, p0, v4

    add-int/lit8 v4, v4, -0x1

    goto :goto_9

    :cond_16
    :goto_c
    add-int/lit8 v6, v2, -0x1

    .line 407
    aget v8, p0, v6

    aput v8, p0, p1

    aput v0, p0, v6

    add-int/lit8 v6, v4, 0x1

    .line 408
    aget v8, p0, v6

    aput v8, p0, p2

    aput v5, p0, v6

    add-int/lit8 v6, v2, -0x2

    .line 411
    invoke-static {p0, p1, v6, p3}, Ljava9/util/DualPivotQuicksort;->sort([IIIZ)V

    add-int/lit8 p1, v4, 0x2

    .line 412
    invoke-static {p0, p1, p2, v7}, Ljava9/util/DualPivotQuicksort;->sort([IIIZ)V

    if-ge v2, v3, :cond_1e

    if-ge v1, v4, :cond_1e

    .line 422
    :goto_d
    aget p1, p0, v2

    if-ne p1, v0, :cond_17

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    .line 426
    :cond_17
    :goto_e
    aget p1, p0, v4

    if-ne p1, v5, :cond_18

    add-int/lit8 v4, v4, -0x1

    goto :goto_e

    :cond_18
    add-int/lit8 p1, v2, -0x1

    :cond_19
    :goto_f
    add-int/lit8 p1, p1, 0x1

    if-gt p1, v4, :cond_1e

    .line 451
    aget p2, p0, p1

    if-ne p2, v0, :cond_1a

    .line 453
    aget p3, p0, v2

    aput p3, p0, p1

    .line 454
    aput p2, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_1a
    if-ne p2, v5, :cond_19

    .line 457
    :goto_10
    aget p3, p0, v4

    if-ne p3, v5, :cond_1c

    add-int/lit8 p3, v4, -0x1

    if-ne v4, p1, :cond_1b

    move v4, p3

    goto :goto_12

    :cond_1b
    move v4, p3

    goto :goto_10

    .line 462
    :cond_1c
    aget p3, p0, v4

    if-ne p3, v0, :cond_1d

    .line 463
    aget p3, p0, v2

    aput p3, p0, p1

    .line 472
    aput v0, p0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    .line 475
    :cond_1d
    aget p3, p0, v4

    aput p3, p0, p1

    .line 477
    :goto_11
    aput p2, p0, v4

    add-int/lit8 v4, v4, -0x1

    goto :goto_f

    .line 484
    :cond_1e
    :goto_12
    invoke-static {p0, v2, v4, v7}, Ljava9/util/DualPivotQuicksort;->sort([IIIZ)V

    goto :goto_17

    .line 491
    :cond_1f
    aget v0, p0, v0

    move v1, p1

    move v3, v1

    move v2, p2

    :goto_13
    if-gt v1, v2, :cond_24

    .line 514
    aget v4, p0, v1

    if-ne v4, v0, :cond_20

    goto :goto_16

    .line 517
    :cond_20
    aget v4, p0, v1

    if-ge v4, v0, :cond_21

    .line 519
    aget v5, p0, v3

    aput v5, p0, v1

    .line 520
    aput v4, p0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_16

    .line 523
    :cond_21
    :goto_14
    aget v5, p0, v2

    if-le v5, v0, :cond_22

    add-int/lit8 v2, v2, -0x1

    goto :goto_14

    .line 526
    :cond_22
    aget v5, p0, v2

    if-ge v5, v0, :cond_23

    .line 527
    aget v5, p0, v3

    aput v5, p0, v1

    .line 528
    aget v5, p0, v2

    aput v5, p0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    .line 539
    :cond_23
    aput v0, p0, v1

    .line 541
    :goto_15
    aput v4, p0, v2

    add-int/lit8 v2, v2, -0x1

    :goto_16
    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    :cond_24
    add-int/lit8 v3, v3, -0x1

    .line 551
    invoke-static {p0, p1, v3, p3}, Ljava9/util/DualPivotQuicksort;->sort([IIIZ)V

    add-int/lit8 v2, v2, 0x1

    .line 552
    :try_start_0
    invoke-static {p0, v2, p2, v7}, Ljava9/util/DualPivotQuicksort;->sort([IIIZ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_17
    return-void

    :catch_0
    move-exception p0

    throw p0
.end method

.method static sort([III[III)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    sub-int v4, v2, v1

    const/4 v5, 0x1

    const/16 v6, 0x11e

    if-ge v4, v6, :cond_0

    .line 105
    invoke-static {v0, v1, v2, v5}, Ljava9/util/DualPivotQuicksort;->sort([IIIZ)V

    return-void

    :cond_0
    const/16 v4, 0x44

    .line 113
    new-array v4, v4, [I

    const/4 v6, 0x0

    aput v1, v4, v6

    move v7, v1

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v2, :cond_8

    :goto_1
    if-ge v7, v2, :cond_1

    .line 119
    aget v9, v0, v7

    add-int/lit8 v10, v7, 0x1

    aget v11, v0, v10

    if-ne v9, v11, :cond_1

    move v7, v10

    goto :goto_1

    :cond_1
    if-ne v7, v2, :cond_2

    goto :goto_5

    .line 122
    :cond_2
    aget v9, v0, v7

    add-int/lit8 v10, v7, 0x1

    aget v11, v0, v10

    if-ge v9, v11, :cond_3

    :goto_2
    add-int/2addr v7, v5

    if-gt v7, v2, :cond_5

    add-int/lit8 v9, v7, -0x1

    .line 123
    aget v9, v0, v9

    aget v10, v0, v7

    if-gt v9, v10, :cond_5

    goto :goto_2

    .line 124
    :cond_3
    aget v9, v0, v7

    aget v10, v0, v10

    if-le v9, v10, :cond_5

    :goto_3
    add-int/2addr v7, v5

    if-gt v7, v2, :cond_4

    add-int/lit8 v9, v7, -0x1

    .line 125
    aget v9, v0, v9

    aget v10, v0, v7

    if-lt v9, v10, :cond_4

    goto :goto_3

    .line 127
    :cond_4
    aget v9, v4, v8

    sub-int/2addr v9, v5

    move v10, v7

    :goto_4
    add-int/2addr v9, v5

    add-int/lit8 v10, v10, -0x1

    if-ge v9, v10, :cond_5

    .line 128
    aget v11, v0, v9

    aget v12, v0, v10

    aput v12, v0, v9

    aput v11, v0, v10

    goto :goto_4

    .line 134
    :cond_5
    aget v9, v4, v8

    if-le v9, v1, :cond_6

    aget v9, v4, v8

    aget v9, v0, v9

    aget v10, v4, v8

    sub-int/2addr v10, v5

    aget v10, v0, v10

    if-lt v9, v10, :cond_6

    add-int/lit8 v8, v8, -0x1

    :cond_6
    add-int/2addr v8, v5

    const/16 v9, 0x43

    if-ne v8, v9, :cond_7

    .line 143
    invoke-static {v0, v1, v2, v5}, Ljava9/util/DualPivotQuicksort;->sort([IIIZ)V

    return-void

    .line 117
    :cond_7
    aput v7, v4, v8

    goto :goto_0

    :cond_8
    :goto_5
    if-nez v8, :cond_9

    return-void

    :cond_9
    if-ne v8, v5, :cond_a

    .line 155
    aget v7, v4, v8

    if-le v7, v2, :cond_a

    return-void

    :cond_a
    add-int/2addr v2, v5

    .line 162
    aget v7, v4, v8

    if-ge v7, v2, :cond_b

    add-int/lit8 v8, v8, 0x1

    .line 167
    aput v2, v4, v8

    :cond_b
    const/4 v7, 0x1

    const/4 v9, 0x0

    :goto_6
    shl-int/2addr v7, v5

    if-ge v7, v8, :cond_c

    xor-int/lit8 v9, v9, 0x1

    int-to-byte v9, v9

    goto :goto_6

    :cond_c
    sub-int v7, v2, v1

    if-eqz v3, :cond_e

    move/from16 v10, p5

    if-lt v10, v7, :cond_e

    add-int v10, p4, v7

    .line 178
    array-length v11, v3

    if-le v10, v11, :cond_d

    goto :goto_7

    :cond_d
    move/from16 v10, p4

    goto :goto_8

    .line 179
    :cond_e
    :goto_7
    new-array v3, v7, [I

    const/4 v10, 0x0

    :goto_8
    if-nez v9, :cond_f

    .line 183
    invoke-static {v0, v1, v3, v10, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v1, v10, v1

    const/4 v10, 0x0

    move-object/from16 v17, v3

    move-object v3, v0

    move-object/from16 v0, v17

    goto :goto_9

    :cond_f
    sub-int/2addr v10, v1

    const/4 v1, 0x0

    :goto_9
    if-le v8, v5, :cond_16

    const/4 v7, 0x2

    const/4 v9, 0x0

    :goto_a
    if-gt v7, v8, :cond_13

    .line 197
    aget v11, v4, v7

    add-int/lit8 v12, v7, -0x1

    aget v12, v4, v12

    add-int/lit8 v13, v7, -0x2

    .line 198
    aget v13, v4, v13

    move v14, v12

    move v15, v13

    :goto_b
    if-ge v13, v11, :cond_12

    if-ge v14, v11, :cond_11

    if-ge v15, v12, :cond_10

    add-int v16, v15, v1

    .line 199
    aget v5, v0, v16

    add-int v16, v14, v1

    aget v6, v0, v16

    if-gt v5, v6, :cond_10

    goto :goto_c

    :cond_10
    add-int v5, v13, v10

    add-int/lit8 v6, v14, 0x1

    add-int/2addr v14, v1

    .line 202
    aget v14, v0, v14

    aput v14, v3, v5

    move v14, v6

    goto :goto_d

    :cond_11
    :goto_c
    add-int v5, v13, v10

    add-int/lit8 v6, v15, 0x1

    add-int/2addr v15, v1

    .line 200
    aget v15, v0, v15

    aput v15, v3, v5

    move v15, v6

    :goto_d
    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    goto :goto_b

    :cond_12
    add-int/lit8 v9, v9, 0x1

    .line 205
    aput v11, v4, v9

    add-int/lit8 v7, v7, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    goto :goto_a

    :cond_13
    and-int/lit8 v5, v8, 0x1

    if-eqz v5, :cond_15

    add-int/lit8 v8, v8, -0x1

    .line 208
    aget v5, v4, v8

    move v6, v2

    :goto_e
    add-int/lit8 v6, v6, -0x1

    if-lt v6, v5, :cond_14

    add-int v7, v6, v10

    add-int v8, v6, v1

    .line 209
    aget v8, v0, v8

    aput v8, v3, v7

    goto :goto_e

    :cond_14
    add-int/lit8 v9, v9, 0x1

    .line 211
    aput v2, v4, v9

    move v8, v9

    goto :goto_f

    :cond_15
    move v8, v9

    :goto_f
    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object/from16 v17, v3

    move-object v3, v0

    move-object/from16 v0, v17

    move/from16 v18, v10

    move v10, v1

    move/from16 v1, v18

    goto :goto_9

    :cond_16
    return-void
.end method

.method private static sort([JIIZ)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    sub-int v4, v2, v1

    add-int/lit8 v4, v4, 0x1

    const/16 v5, 0x2f

    if-ge v4, v5, :cond_a

    if-eqz v3, :cond_2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_9

    add-int/lit8 v4, v3, 0x1

    .line 704
    aget-wide v5, v0, v4

    .line 705
    :goto_1
    aget-wide v7, v0, v3

    cmp-long v9, v5, v7

    if-gez v9, :cond_1

    add-int/lit8 v7, v3, 0x1

    .line 706
    aget-wide v8, v0, v3

    aput-wide v8, v0, v7

    add-int/lit8 v7, v3, -0x1

    if-ne v3, v1, :cond_0

    move v3, v7

    goto :goto_2

    :cond_0
    move v3, v7

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 711
    aput-wide v5, v0, v3

    move v3, v4

    goto :goto_0

    :cond_2
    if-lt v1, v2, :cond_3

    return-void

    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 721
    aget-wide v3, v0, v1

    add-int/lit8 v5, v1, -0x1

    aget-wide v5, v0, v5

    cmp-long v7, v3, v5

    if-gez v7, :cond_2

    :goto_3
    add-int/lit8 v3, v1, 0x1

    if-gt v3, v2, :cond_7

    .line 732
    aget-wide v4, v0, v1

    aget-wide v6, v0, v3

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    .line 735
    aget-wide v6, v0, v3

    move-wide/from16 v19, v4

    move-wide v4, v6

    move-wide/from16 v6, v19

    :cond_4
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 737
    aget-wide v8, v0, v1

    cmp-long v10, v4, v8

    if-gez v10, :cond_5

    add-int/lit8 v8, v1, 0x2

    .line 738
    aget-wide v9, v0, v1

    aput-wide v9, v0, v8

    goto :goto_4

    :cond_5
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v8, v1, 0x1

    .line 740
    aput-wide v4, v0, v8

    :goto_5
    add-int/lit8 v1, v1, -0x1

    .line 742
    aget-wide v4, v0, v1

    cmp-long v8, v6, v4

    if-gez v8, :cond_6

    add-int/lit8 v4, v1, 0x1

    .line 743
    aget-wide v8, v0, v1

    aput-wide v8, v0, v4

    goto :goto_5

    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 745
    aput-wide v6, v0, v1

    add-int/lit8 v1, v3, 0x1

    goto :goto_3

    .line 747
    :cond_7
    aget-wide v3, v0, v2

    :goto_6
    add-int/lit8 v2, v2, -0x1

    .line 749
    aget-wide v5, v0, v2

    cmp-long v1, v3, v5

    if-gez v1, :cond_8

    add-int/lit8 v1, v2, 0x1

    .line 750
    aget-wide v5, v0, v2

    aput-wide v5, v0, v1

    goto :goto_6

    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 752
    aput-wide v3, v0, v2

    :cond_9
    return-void

    :cond_a
    shr-int/lit8 v5, v4, 0x3

    shr-int/lit8 v4, v4, 0x6

    add-int/2addr v5, v4

    add-int/lit8 v5, v5, 0x1

    add-int v4, v1, v2

    ushr-int/lit8 v4, v4, 0x1

    sub-int v6, v4, v5

    sub-int v7, v6, v5

    add-int v8, v4, v5

    add-int/2addr v5, v8

    .line 774
    aget-wide v9, v0, v6

    aget-wide v11, v0, v7

    cmp-long v13, v9, v11

    if-gez v13, :cond_b

    aget-wide v9, v0, v6

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 776
    :cond_b
    aget-wide v9, v0, v4

    aget-wide v11, v0, v6

    cmp-long v13, v9, v11

    if-gez v13, :cond_c

    aget-wide v9, v0, v4

    aget-wide v11, v0, v6

    aput-wide v11, v0, v4

    aput-wide v9, v0, v6

    .line 777
    aget-wide v11, v0, v7

    cmp-long v13, v9, v11

    if-gez v13, :cond_c

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 779
    :cond_c
    aget-wide v9, v0, v8

    aget-wide v11, v0, v4

    cmp-long v13, v9, v11

    if-gez v13, :cond_d

    aget-wide v9, v0, v8

    aget-wide v11, v0, v4

    aput-wide v11, v0, v8

    aput-wide v9, v0, v4

    .line 780
    aget-wide v11, v0, v6

    cmp-long v13, v9, v11

    if-gez v13, :cond_d

    aget-wide v11, v0, v6

    aput-wide v11, v0, v4

    aput-wide v9, v0, v6

    .line 781
    aget-wide v11, v0, v7

    cmp-long v13, v9, v11

    if-gez v13, :cond_d

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 784
    :cond_d
    aget-wide v9, v0, v5

    aget-wide v11, v0, v8

    cmp-long v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v9, v0, v5

    aget-wide v11, v0, v8

    aput-wide v11, v0, v5

    aput-wide v9, v0, v8

    .line 785
    aget-wide v11, v0, v4

    cmp-long v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v11, v0, v4

    aput-wide v11, v0, v8

    aput-wide v9, v0, v4

    .line 786
    aget-wide v11, v0, v6

    cmp-long v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v11, v0, v6

    aput-wide v11, v0, v4

    aput-wide v9, v0, v6

    .line 787
    aget-wide v11, v0, v7

    cmp-long v13, v9, v11

    if-gez v13, :cond_e

    aget-wide v11, v0, v7

    aput-wide v11, v0, v6

    aput-wide v9, v0, v7

    .line 796
    :cond_e
    aget-wide v9, v0, v7

    aget-wide v11, v0, v6

    const/4 v13, 0x0

    cmp-long v14, v9, v11

    if-eqz v14, :cond_1f

    aget-wide v9, v0, v6

    aget-wide v11, v0, v4

    cmp-long v14, v9, v11

    if-eqz v14, :cond_1f

    aget-wide v9, v0, v4

    aget-wide v11, v0, v8

    cmp-long v14, v9, v11

    if-eqz v14, :cond_1f

    aget-wide v9, v0, v8

    aget-wide v11, v0, v5

    cmp-long v14, v9, v11

    if-eqz v14, :cond_1f

    .line 802
    aget-wide v9, v0, v6

    .line 803
    aget-wide v11, v0, v8

    .line 811
    aget-wide v14, v0, v1

    aput-wide v14, v0, v6

    .line 812
    aget-wide v14, v0, v2

    aput-wide v14, v0, v8

    move v4, v1

    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 817
    aget-wide v14, v0, v4

    cmp-long v6, v14, v9

    if-gez v6, :cond_f

    goto :goto_7

    :cond_f
    move v6, v2

    :goto_8
    add-int/lit8 v6, v6, -0x1

    .line 818
    aget-wide v14, v0, v6

    cmp-long v8, v14, v11

    if-lez v8, :cond_10

    goto :goto_8

    :cond_10
    add-int/lit8 v8, v4, -0x1

    :cond_11
    :goto_9
    add-int/lit8 v8, v8, 0x1

    if-gt v8, v6, :cond_16

    .line 841
    aget-wide v14, v0, v8

    cmp-long v16, v14, v9

    if-gez v16, :cond_12

    .line 843
    aget-wide v16, v0, v4

    aput-wide v16, v0, v8

    .line 848
    aput-wide v14, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_12
    cmp-long v16, v14, v11

    if-lez v16, :cond_11

    .line 851
    :goto_a
    aget-wide v16, v0, v6

    cmp-long v18, v16, v11

    if-lez v18, :cond_14

    add-int/lit8 v16, v6, -0x1

    if-ne v6, v8, :cond_13

    move/from16 v6, v16

    goto :goto_c

    :cond_13
    move/from16 v6, v16

    goto :goto_a

    .line 856
    :cond_14
    aget-wide v16, v0, v6

    cmp-long v18, v16, v9

    if-gez v18, :cond_15

    .line 857
    aget-wide v16, v0, v4

    aput-wide v16, v0, v8

    .line 858
    aget-wide v16, v0, v6

    aput-wide v16, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    .line 861
    :cond_15
    aget-wide v16, v0, v6

    aput-wide v16, v0, v8

    .line 867
    :goto_b
    aput-wide v14, v0, v6

    add-int/lit8 v6, v6, -0x1

    goto :goto_9

    :cond_16
    :goto_c
    add-int/lit8 v8, v4, -0x1

    .line 873
    aget-wide v14, v0, v8

    aput-wide v14, v0, v1

    aput-wide v9, v0, v8

    add-int/lit8 v8, v6, 0x1

    .line 874
    aget-wide v14, v0, v8

    aput-wide v14, v0, v2

    aput-wide v11, v0, v8

    add-int/lit8 v8, v4, -0x2

    .line 877
    invoke-static {v0, v1, v8, v3}, Ljava9/util/DualPivotQuicksort;->sort([JIIZ)V

    add-int/lit8 v1, v6, 0x2

    .line 878
    invoke-static {v0, v1, v2, v13}, Ljava9/util/DualPivotQuicksort;->sort([JIIZ)V

    if-ge v4, v7, :cond_1e

    if-ge v5, v6, :cond_1e

    .line 888
    :goto_d
    aget-wide v1, v0, v4

    cmp-long v3, v1, v9

    if-nez v3, :cond_17

    add-int/lit8 v4, v4, 0x1

    goto :goto_d

    .line 892
    :cond_17
    :goto_e
    aget-wide v1, v0, v6

    cmp-long v3, v1, v11

    if-nez v3, :cond_18

    add-int/lit8 v6, v6, -0x1

    goto :goto_e

    :cond_18
    add-int/lit8 v1, v4, -0x1

    :cond_19
    :goto_f
    add-int/lit8 v1, v1, 0x1

    if-gt v1, v6, :cond_1e

    .line 917
    aget-wide v2, v0, v1

    cmp-long v5, v2, v9

    if-nez v5, :cond_1a

    .line 919
    aget-wide v7, v0, v4

    aput-wide v7, v0, v1

    .line 920
    aput-wide v2, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_1a
    cmp-long v5, v2, v11

    if-nez v5, :cond_19

    .line 923
    :goto_10
    aget-wide v7, v0, v6

    cmp-long v5, v7, v11

    if-nez v5, :cond_1c

    add-int/lit8 v5, v6, -0x1

    if-ne v6, v1, :cond_1b

    move v6, v5

    goto :goto_12

    :cond_1b
    move v6, v5

    goto :goto_10

    .line 928
    :cond_1c
    aget-wide v7, v0, v6

    cmp-long v5, v7, v9

    if-nez v5, :cond_1d

    .line 929
    aget-wide v7, v0, v4

    aput-wide v7, v0, v1

    .line 938
    aput-wide v9, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    .line 941
    :cond_1d
    aget-wide v7, v0, v6

    aput-wide v7, v0, v1

    .line 943
    :goto_11
    aput-wide v2, v0, v6

    add-int/lit8 v6, v6, -0x1

    goto :goto_f

    .line 950
    :cond_1e
    :goto_12
    invoke-static {v0, v4, v6, v13}, Ljava9/util/DualPivotQuicksort;->sort([JIIZ)V

    goto :goto_17

    .line 957
    :cond_1f
    aget-wide v4, v0, v4

    move v6, v1

    move v8, v6

    move v7, v2

    :goto_13
    if-gt v6, v7, :cond_24

    .line 980
    aget-wide v9, v0, v6

    cmp-long v11, v9, v4

    if-nez v11, :cond_20

    goto :goto_16

    .line 983
    :cond_20
    aget-wide v9, v0, v6

    cmp-long v11, v9, v4

    if-gez v11, :cond_21

    .line 985
    aget-wide v11, v0, v8

    aput-wide v11, v0, v6

    .line 986
    aput-wide v9, v0, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_16

    .line 989
    :cond_21
    :goto_14
    aget-wide v11, v0, v7

    cmp-long v14, v11, v4

    if-lez v14, :cond_22

    add-int/lit8 v7, v7, -0x1

    goto :goto_14

    .line 992
    :cond_22
    aget-wide v11, v0, v7

    cmp-long v14, v11, v4

    if-gez v14, :cond_23

    .line 993
    aget-wide v11, v0, v8

    aput-wide v11, v0, v6

    .line 994
    aget-wide v11, v0, v7

    aput-wide v11, v0, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_15

    .line 1005
    :cond_23
    aput-wide v4, v0, v6

    .line 1007
    :goto_15
    aput-wide v9, v0, v7

    add-int/lit8 v7, v7, -0x1

    :goto_16
    add-int/lit8 v6, v6, 0x1

    goto :goto_13

    :cond_24
    add-int/lit8 v8, v8, -0x1

    .line 1017
    invoke-static {v0, v1, v8, v3}, Ljava9/util/DualPivotQuicksort;->sort([JIIZ)V

    add-int/lit8 v7, v7, 0x1

    .line 1018
    :try_start_0
    invoke-static {v0, v7, v2, v13}, Ljava9/util/DualPivotQuicksort;->sort([JIIZ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_17
    return-void

    :catch_0
    move-exception v0

    move-object v1, v0

    throw v1
.end method

.method static sort([JII[JII)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    sub-int v4, v2, v1

    const/4 v5, 0x1

    const/16 v6, 0x11e

    if-ge v4, v6, :cond_0

    .line 571
    invoke-static {v0, v1, v2, v5}, Ljava9/util/DualPivotQuicksort;->sort([JIIZ)V

    return-void

    :cond_0
    const/16 v4, 0x44

    .line 579
    new-array v4, v4, [I

    const/4 v6, 0x0

    aput v1, v4, v6

    move v7, v1

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v2, :cond_8

    :goto_1
    if-ge v7, v2, :cond_1

    .line 585
    aget-wide v9, v0, v7

    add-int/lit8 v11, v7, 0x1

    aget-wide v12, v0, v11

    cmp-long v14, v9, v12

    if-nez v14, :cond_1

    move v7, v11

    goto :goto_1

    :cond_1
    if-ne v7, v2, :cond_2

    goto :goto_5

    .line 588
    :cond_2
    aget-wide v9, v0, v7

    add-int/lit8 v11, v7, 0x1

    aget-wide v12, v0, v11

    cmp-long v14, v9, v12

    if-gez v14, :cond_3

    :goto_2
    add-int/2addr v7, v5

    if-gt v7, v2, :cond_5

    add-int/lit8 v9, v7, -0x1

    .line 589
    aget-wide v9, v0, v9

    aget-wide v11, v0, v7

    cmp-long v13, v9, v11

    if-gtz v13, :cond_5

    goto :goto_2

    .line 590
    :cond_3
    aget-wide v9, v0, v7

    aget-wide v11, v0, v11

    cmp-long v13, v9, v11

    if-lez v13, :cond_5

    :goto_3
    add-int/2addr v7, v5

    if-gt v7, v2, :cond_4

    add-int/lit8 v9, v7, -0x1

    .line 591
    aget-wide v9, v0, v9

    aget-wide v11, v0, v7

    cmp-long v13, v9, v11

    if-ltz v13, :cond_4

    goto :goto_3

    .line 593
    :cond_4
    aget v9, v4, v8

    sub-int/2addr v9, v5

    move v10, v7

    :goto_4
    add-int/2addr v9, v5

    add-int/lit8 v10, v10, -0x1

    if-ge v9, v10, :cond_5

    .line 594
    aget-wide v11, v0, v9

    aget-wide v13, v0, v10

    aput-wide v13, v0, v9

    aput-wide v11, v0, v10

    goto :goto_4

    .line 600
    :cond_5
    aget v9, v4, v8

    if-le v9, v1, :cond_6

    aget v9, v4, v8

    aget-wide v9, v0, v9

    aget v11, v4, v8

    sub-int/2addr v11, v5

    aget-wide v11, v0, v11

    cmp-long v13, v9, v11

    if-ltz v13, :cond_6

    add-int/lit8 v8, v8, -0x1

    :cond_6
    add-int/2addr v8, v5

    const/16 v9, 0x43

    if-ne v8, v9, :cond_7

    .line 609
    invoke-static {v0, v1, v2, v5}, Ljava9/util/DualPivotQuicksort;->sort([JIIZ)V

    return-void

    .line 583
    :cond_7
    aput v7, v4, v8

    goto :goto_0

    :cond_8
    :goto_5
    if-nez v8, :cond_9

    return-void

    :cond_9
    if-ne v8, v5, :cond_a

    .line 621
    aget v7, v4, v8

    if-le v7, v2, :cond_a

    return-void

    :cond_a
    add-int/2addr v2, v5

    .line 628
    aget v7, v4, v8

    if-ge v7, v2, :cond_b

    add-int/lit8 v8, v8, 0x1

    .line 633
    aput v2, v4, v8

    :cond_b
    const/4 v7, 0x1

    const/4 v9, 0x0

    :goto_6
    shl-int/2addr v7, v5

    if-ge v7, v8, :cond_c

    xor-int/lit8 v9, v9, 0x1

    int-to-byte v9, v9

    goto :goto_6

    :cond_c
    sub-int v7, v2, v1

    if-eqz v3, :cond_e

    move/from16 v10, p5

    if-lt v10, v7, :cond_e

    add-int v10, p4, v7

    .line 644
    array-length v11, v3

    if-le v10, v11, :cond_d

    goto :goto_7

    :cond_d
    move/from16 v10, p4

    goto :goto_8

    .line 645
    :cond_e
    :goto_7
    new-array v3, v7, [J

    const/4 v10, 0x0

    :goto_8
    if-nez v9, :cond_f

    .line 649
    invoke-static {v0, v1, v3, v10, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v1, v10, v1

    const/4 v10, 0x0

    move-object/from16 v21, v3

    move-object v3, v0

    move-object/from16 v0, v21

    goto :goto_9

    :cond_f
    sub-int/2addr v10, v1

    const/4 v1, 0x0

    :goto_9
    if-le v8, v5, :cond_16

    const/4 v7, 0x2

    const/4 v9, 0x0

    :goto_a
    if-gt v7, v8, :cond_13

    .line 663
    aget v11, v4, v7

    add-int/lit8 v12, v7, -0x1

    aget v12, v4, v12

    add-int/lit8 v13, v7, -0x2

    .line 664
    aget v13, v4, v13

    move v14, v12

    move v15, v13

    :goto_b
    if-ge v13, v11, :cond_12

    if-ge v14, v11, :cond_11

    if-ge v15, v12, :cond_10

    add-int v16, v15, v1

    .line 665
    aget-wide v16, v0, v16

    add-int v18, v14, v1

    aget-wide v18, v0, v18

    cmp-long v20, v16, v18

    if-gtz v20, :cond_10

    goto :goto_c

    :cond_10
    add-int v16, v13, v10

    add-int/lit8 v17, v14, 0x1

    add-int/2addr v14, v1

    .line 668
    aget-wide v18, v0, v14

    aput-wide v18, v3, v16

    move/from16 v14, v17

    goto :goto_d

    :cond_11
    :goto_c
    add-int v16, v13, v10

    add-int/lit8 v17, v15, 0x1

    add-int/2addr v15, v1

    .line 666
    aget-wide v18, v0, v15

    aput-wide v18, v3, v16

    move/from16 v15, v17

    :goto_d
    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_12
    add-int/lit8 v9, v9, 0x1

    .line 671
    aput v11, v4, v9

    add-int/lit8 v7, v7, 0x2

    goto :goto_a

    :cond_13
    and-int/lit8 v7, v8, 0x1

    if-eqz v7, :cond_15

    add-int/lit8 v8, v8, -0x1

    .line 674
    aget v7, v4, v8

    move v8, v2

    :goto_e
    add-int/lit8 v8, v8, -0x1

    if-lt v8, v7, :cond_14

    add-int v11, v8, v10

    add-int v12, v8, v1

    .line 675
    aget-wide v12, v0, v12

    aput-wide v12, v3, v11

    goto :goto_e

    :cond_14
    add-int/lit8 v9, v9, 0x1

    .line 677
    aput v2, v4, v9

    move v8, v9

    goto :goto_f

    :cond_15
    move v8, v9

    :goto_f
    move-object/from16 v21, v3

    move-object v3, v0

    move-object/from16 v0, v21

    move/from16 v22, v10

    move v10, v1

    move/from16 v1, v22

    goto :goto_9

    :cond_16
    return-void
.end method

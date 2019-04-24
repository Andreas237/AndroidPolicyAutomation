.class public Lo/emw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([F[FLjava/lang/Boolean;Ljava/lang/Boolean;)I
    .locals 11

    .line 11
    const/4 v0, 0x3

    new-array v6, v0, [F

    .line 12
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 13
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    const/4 v0, 0x2

    aget v0, p0, v0

    const v1, 0x3f733333    # 0.95f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const v0, 0x3f733333    # 0.95f

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    aget v0, p0, v0

    :goto_0
    const/4 v1, 0x2

    aput v0, v6, v1

    .line 15
    const/4 v0, 0x0

    aget v0, p0, v0

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 16
    const/4 v0, 0x1

    aget v0, p0, v0

    const/4 v1, 0x1

    aput v0, v6, v1

    goto/16 :goto_4

    .line 18
    :cond_1
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 20
    const/4 v0, 0x0

    aget v0, p0, v0

    const/high16 v1, 0x433e0000    # 190.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    const/4 v0, 0x0

    aget v0, p0, v0

    const v1, 0x43868000    # 269.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    .line 21
    const v7, 0x3f333333    # 0.7f

    const v8, 0x3f333333    # 0.7f

    goto :goto_1

    .line 22
    :cond_2
    const/4 v0, 0x0

    aget v0, p0, v0

    const/high16 v1, 0x428c0000    # 70.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    const/4 v0, 0x0

    aget v0, p0, v0

    const/high16 v1, 0x433e0000    # 190.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_3

    .line 23
    const/high16 v7, 0x3f000000    # 0.5f

    const/high16 v8, 0x3f000000    # 0.5f

    goto :goto_1

    .line 24
    :cond_3
    const/4 v0, 0x0

    aget v0, p0, v0

    const/high16 v1, 0x41900000    # 18.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_4

    const/4 v0, 0x0

    aget v0, p0, v0

    const/high16 v1, 0x428a0000    # 69.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_4

    .line 25
    const v7, 0x3f333333    # 0.7f

    const v8, 0x3f19999a    # 0.6f

    goto :goto_1

    .line 27
    :cond_4
    const v7, 0x3f19999a    # 0.6f

    const v8, 0x3f19999a    # 0.6f

    .line 30
    :goto_1
    const/4 v0, 0x1

    aget v0, p0, v0

    const/4 v1, 0x2

    aget v1, p0, v1

    add-float/2addr v0, v1

    add-float v1, v7, v8

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    .line 31
    const/4 v0, 0x0

    aget v0, p0, v0

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 32
    const/4 v0, 0x1

    aget v0, p0, v0

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 33
    const/4 v0, 0x2

    aget v0, p0, v0

    const/4 v1, 0x2

    aput v0, v6, v1

    goto :goto_2

    .line 35
    :cond_5
    const/4 v0, 0x1

    aget v0, p0, v0

    const/4 v1, 0x2

    aget v1, p0, v1

    add-float/2addr v0, v1

    add-float v1, v7, v8

    sub-float v9, v0, v1

    .line 36
    const/4 v0, 0x1

    aget v0, p0, v0

    const/4 v1, 0x2

    aget v1, p0, v1

    add-float/2addr v0, v1

    div-float v10, v9, v0

    .line 37
    const/4 v0, 0x0

    aget v0, p0, v0

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 38
    const/4 v0, 0x1

    aget v0, p0, v0

    float-to-double v0, v0

    float-to-double v2, v10

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    sub-double v2, v4, v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 39
    const/4 v0, 0x2

    aget v0, p0, v0

    float-to-double v0, v0

    float-to-double v2, v10

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    sub-double v2, v4, v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    const/4 v1, 0x2

    aput v0, v6, v1

    .line 41
    :goto_2
    goto :goto_4

    .line 43
    :cond_6
    const/4 v0, 0x1

    aget v0, p0, v0

    const/4 v1, 0x1

    aget v1, p1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_7

    const/4 v0, 0x0

    aget v0, p1, v0

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    aget v0, p0, v0

    :goto_3
    const/4 v1, 0x0

    aput v0, v6, v1

    .line 44
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 45
    const v0, 0x3d4ccccd    # 0.05f

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 46
    const v0, 0x3f666666    # 0.9f

    const/4 v1, 0x2

    aput v0, v6, v1

    goto :goto_4

    .line 48
    :cond_8
    const v0, 0x3e99999a    # 0.3f

    const/4 v1, 0x1

    aput v0, v6, v1

    .line 49
    const v0, 0x3ecccccd    # 0.4f

    const/4 v1, 0x2

    aput v0, v6, v1

    .line 52
    :goto_4
    invoke-static {v6}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v0

    return v0
.end method

.method public static e([F)Ljava/lang/Boolean;
    .locals 7

    .line 75
    const/4 v0, 0x0

    aget v4, p0, v0

    const/4 v0, 0x1

    aget v5, p0, v0

    const/4 v0, 0x2

    aget v6, p0, v0

    .line 76
    float-to-double v0, v6

    const-wide v2, 0x3fe999999999999aL    # 0.8

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 77
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 79
    :cond_0
    const/high16 v0, 0x41a00000    # 20.0f

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_2

    const/high16 v0, 0x42480000    # 50.0f

    cmpg-float v0, v4, v0

    if-gez v0, :cond_2

    .line 80
    const v0, 0x3f19999a    # 0.6f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 81
    :cond_2
    const/high16 v0, 0x42480000    # 50.0f

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_4

    const/high16 v0, 0x433e0000    # 190.0f

    cmpg-float v0, v4, v0

    if-gez v0, :cond_4

    .line 82
    const v0, 0x3ecccccd    # 0.4f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 83
    :cond_4
    const/high16 v0, 0x433e0000    # 190.0f

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_6

    const v0, 0x43868000    # 269.0f

    cmpg-float v0, v4, v0

    if-gez v0, :cond_6

    .line 84
    const v0, 0x3ecccccd    # 0.4f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 86
    :cond_6
    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

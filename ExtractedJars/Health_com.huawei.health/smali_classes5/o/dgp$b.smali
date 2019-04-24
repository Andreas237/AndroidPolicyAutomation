.class public final Lo/dgp$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dgp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final c:[F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    const/16 v0, 0x19

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lo/dgp$b;->c:[F

    return-void

    :array_0
    .array-data 4
        0x0
        0x40000000    # 2.0f
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40d00000    # 6.5f
        0x41033333    # 8.2f
        0x4111999a    # 9.1f
        0x41180000    # 9.5f
        0x412ccccd    # 10.8f
        0x41380000    # 11.5f
        0x41400000    # 12.0f
        0x41480000    # 12.5f
        0x41500000    # 13.0f
        0x41680000    # 14.5f
        0x41780000    # 15.5f
        0x4181999a    # 16.2f
        0x41966666    # 18.8f
        0x41980000    # 19.0f
        0x41a00000    # 20.0f
        0x41b40000    # 22.5f
        0x41b80000    # 23.0f
        0x41b80000    # 23.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(F)F
    .locals 6

    .line 67
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    .line 68
    const/4 v0, 0x0

    return v0

    .line 70
    :cond_0
    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v4, v0

    .line 72
    sget-object v0, Lo/dgp$b;->c:[F

    const/16 v1, 0x17

    aget v5, v0, v1

    .line 73
    const/16 v0, 0x17

    if-ne v4, v0, :cond_1

    .line 74
    sget-object v0, Lo/dgp$b;->c:[F

    add-int/lit8 v1, v4, 0x1

    aget v5, v0, v1

    goto :goto_0

    .line 75
    :cond_1
    if-ltz v4, :cond_2

    const/16 v0, 0x17

    if-le v4, v0, :cond_3

    .line 76
    :cond_2
    return v5

    .line 78
    :cond_3
    :goto_0
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 81
    :pswitch_0
    sget-object v0, Lo/dgp$b;->c:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    sget-object v1, Lo/dgp$b;->c:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    sget-object v2, Lo/dgp$b;->c:[F

    const/4 v3, 0x0

    aget v2, v2, v3

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p0, v2

    mul-float/2addr v1, v2

    add-float v5, v0, v1

    .line 82
    goto :goto_2

    .line 85
    :pswitch_1
    sget-object v0, Lo/dgp$b;->c:[F

    const/4 v1, 0x4

    aget v0, v0, v1

    sget-object v1, Lo/dgp$b;->c:[F

    const/4 v2, 0x6

    aget v1, v1, v2

    sget-object v2, Lo/dgp$b;->c:[F

    const/4 v3, 0x4

    aget v2, v2, v3

    sub-float/2addr v1, v2

    int-to-float v2, v4

    sub-float v2, p0, v2

    mul-float/2addr v1, v2

    add-float v5, v0, v1

    .line 86
    goto :goto_2

    .line 88
    :goto_1
    :pswitch_2
    invoke-static {v5, v4, p0}, Lo/dgp$b;->d(FIF)F

    move-result v5

    .line 91
    :goto_2
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static b(F)F
    .locals 3

    .line 101
    const/high16 v2, 0x41300000    # 11.0f

    .line 102
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    .line 104
    const/4 v0, 0x0

    return v0

    .line 106
    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_1

    .line 108
    const/4 v0, 0x0

    sub-float v0, p0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    add-float v2, v1, v0

    goto :goto_0

    .line 110
    :cond_1
    const/high16 v0, 0x41400000    # 12.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_2

    .line 112
    const/high16 v0, 0x41200000    # 10.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 114
    :cond_2
    const/high16 v0, 0x41600000    # 14.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_3

    .line 116
    const/high16 v0, 0x41400000    # 12.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 118
    :cond_3
    const/high16 v0, 0x41800000    # 16.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_4

    .line 120
    const/high16 v0, 0x41600000    # 14.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 122
    :cond_4
    const/high16 v0, 0x41980000    # 19.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_5

    .line 124
    const/high16 v0, 0x41800000    # 16.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40e00000    # 7.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 126
    :cond_5
    const/high16 v0, 0x41a00000    # 20.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_6

    .line 128
    const/high16 v0, 0x41980000    # 19.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41100000    # 9.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 130
    :cond_6
    const/high16 v0, 0x41a00000    # 20.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_7

    .line 132
    const/high16 v2, 0x41300000    # 11.0f

    .line 134
    :cond_7
    :goto_0
    return v2
.end method

.method private static d(FIF)F
    .locals 3

    .line 95
    sget-object v0, Lo/dgp$b;->c:[F

    aget v0, v0, p1

    sget-object v1, Lo/dgp$b;->c:[F

    add-int/lit8 v2, p1, 0x1

    aget v1, v1, v2

    sget-object v2, Lo/dgp$b;->c:[F

    aget v2, v2, p1

    sub-float/2addr v1, v2

    int-to-float v2, p1

    sub-float v2, p2, v2

    mul-float/2addr v1, v2

    add-float p0, v0, v1

    .line 96
    return p0
.end method

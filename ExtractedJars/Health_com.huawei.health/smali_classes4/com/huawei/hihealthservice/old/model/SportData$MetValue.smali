.class public final Lcom/huawei/hihealthservice/old/model/SportData$MetValue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/model/SportData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MetValue"
.end annotation


# static fields
.field public static final MET_VALUE_CYCLE_0KM:F = 0.0f

.field public static final MET_VALUE_CYCLE_10KM:F = 3.0f

.field public static final MET_VALUE_CYCLE_12KM:F = 4.0f

.field public static final MET_VALUE_CYCLE_14KM:F = 6.0f

.field public static final MET_VALUE_CYCLE_16KM:F = 7.0f

.field public static final MET_VALUE_CYCLE_19KM:F = 9.0f

.field public static final MET_VALUE_CYCLE_20KM:F = 11.0f

.field public static final MET_VALUE_CYCLE_FASTER_THAN_20KM:F = 11.0f

.field public static final MET_VALUE_WALK_0KM_PER_HOUR:F = 0.0f

.field public static final MET_VALUE_WALK_10KM_PER_HOUR:F = 9.5f

.field public static final MET_VALUE_WALK_11KM_PER_HOUR:F = 10.8f

.field public static final MET_VALUE_WALK_12KM_PER_HOUR:F = 11.5f

.field public static final MET_VALUE_WALK_13KM_PER_HOUR:F = 12.0f

.field public static final MET_VALUE_WALK_14KM_PER_HOUR:F = 12.5f

.field public static final MET_VALUE_WALK_15KM_PER_HOUR:F = 13.0f

.field public static final MET_VALUE_WALK_16KM_PER_HOUR:F = 14.5f

.field public static final MET_VALUE_WALK_17KM_PER_HOUR:F = 15.5f

.field public static final MET_VALUE_WALK_18KM_PER_HOUR:F = 16.2f

.field public static final MET_VALUE_WALK_19KM_PER_HOUR:F = 18.8f

.field public static final MET_VALUE_WALK_1KM_PER_HOUR:F = 2.0f

.field public static final MET_VALUE_WALK_20KM_PER_HOUR:F = 19.0f

.field public static final MET_VALUE_WALK_21KM_PER_HOUR:F = 20.0f

.field public static final MET_VALUE_WALK_22KM_PER_HOUR:F = 22.5f

.field public static final MET_VALUE_WALK_23KM_PER_HOUR:F = 23.0f

.field public static final MET_VALUE_WALK_2KM_PER_HOUR:F = 2.0f

.field public static final MET_VALUE_WALK_3KM_PER_HOUR:F = 3.0f

.field public static final MET_VALUE_WALK_4KM_PER_HOUR:F = 4.0f

.field public static final MET_VALUE_WALK_5KM_PER_HOUR:F = 5.0f

.field public static final MET_VALUE_WALK_6KM_PER_HOUR:F = 5.0f

.field public static final MET_VALUE_WALK_7KM_PER_HOUR:F = 6.5f

.field public static final MET_VALUE_WALK_8KM_PER_HOUR:F = 8.2f

.field public static final MET_VALUE_WALK_9KM_PER_HOUR:F = 9.1f

.field public static final MET_VALUE_WALK_FASTER_THAN_23KM_PER_HOUR:F = 23.0f


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getMetByCycleSpeed(F)F
    .locals 3

    .line 193
    const/high16 v2, 0x41300000    # 11.0f

    .line 194
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    .line 196
    const/4 v0, 0x0

    return v0

    .line 198
    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_1

    .line 200
    const/4 v0, 0x0

    sub-float v0, p0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    add-float v2, v1, v0

    goto :goto_0

    .line 202
    :cond_1
    const/high16 v0, 0x41400000    # 12.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_2

    .line 204
    const/high16 v0, 0x41200000    # 10.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 206
    :cond_2
    const/high16 v0, 0x41600000    # 14.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_3

    .line 208
    const/high16 v0, 0x41400000    # 12.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 210
    :cond_3
    const/high16 v0, 0x41800000    # 16.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_4

    .line 212
    const/high16 v0, 0x41600000    # 14.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40c00000    # 6.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 214
    :cond_4
    const/high16 v0, 0x41980000    # 19.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_5

    .line 216
    const/high16 v0, 0x41800000    # 16.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40e00000    # 7.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 218
    :cond_5
    const/high16 v0, 0x41a00000    # 20.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_6

    .line 220
    const/high16 v0, 0x41980000    # 19.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41100000    # 9.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 222
    :cond_6
    const/high16 v0, 0x41a00000    # 20.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_7

    .line 224
    const/high16 v2, 0x41300000    # 11.0f

    .line 226
    :cond_7
    :goto_0
    return v2
.end method

.method public static getMetByWalkSpeed(F)F
    .locals 4

    .line 76
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    .line 78
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_0
    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v2, v0

    .line 82
    const/high16 v3, 0x41b80000    # 23.0f

    .line 83
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 86
    :pswitch_0
    const/4 v0, 0x0

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    add-float v3, v1, v0

    .line 87
    goto :goto_1

    .line 89
    :pswitch_1
    int-to-float v0, v2

    sub-float v0, p0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    add-float v3, v1, v0

    .line 90
    goto :goto_1

    .line 92
    :pswitch_2
    int-to-float v0, v2

    sub-float v0, p0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    add-float v3, v1, v0

    .line 93
    goto :goto_1

    .line 97
    :pswitch_3
    const/high16 v0, 0x40800000    # 4.0f

    sub-float v0, p0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    add-float v3, v1, v0

    .line 98
    goto :goto_1

    .line 100
    :pswitch_4
    int-to-float v0, v2

    sub-float v0, p0, v0

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40a00000    # 5.0f

    add-float v3, v1, v0

    .line 101
    goto :goto_1

    .line 103
    :pswitch_5
    int-to-float v0, v2

    sub-float v0, p0, v0

    const v1, 0x3fd99998    # 1.6999998f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40d00000    # 6.5f

    add-float v3, v1, v0

    .line 104
    goto :goto_1

    .line 106
    :goto_0
    invoke-static {p0, v2, v3}, Lcom/huawei/hihealthservice/old/model/SportData$MetValue;->getMetByWalkSpeedPart2(FIF)F

    move-result v3

    .line 109
    :goto_1
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static getMetByWalkSpeedPart2(FIF)F
    .locals 2

    .line 113
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 115
    :pswitch_0
    int-to-float v0, p1

    sub-float v0, p0, v0

    const v1, 0x3f666670    # 0.9000006f

    mul-float/2addr v0, v1

    const v1, 0x41033333    # 8.2f

    add-float p2, v1, v0

    .line 116
    goto :goto_1

    .line 118
    :pswitch_1
    int-to-float v0, p1

    sub-float v0, p0, v0

    const v1, 0x3eccccc0    # 0.39999962f

    mul-float/2addr v0, v1

    const v1, 0x4111999a    # 9.1f

    add-float p2, v1, v0

    .line 120
    goto :goto_1

    .line 122
    :pswitch_2
    int-to-float v0, p1

    sub-float v0, p0, v0

    const v1, 0x3fa66668    # 1.3000002f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41180000    # 9.5f

    add-float p2, v1, v0

    .line 124
    goto :goto_1

    .line 126
    :pswitch_3
    int-to-float v0, p1

    sub-float v0, p0, v0

    const v1, 0x3f333330    # 0.6999998f

    mul-float/2addr v0, v1

    const v1, 0x412ccccd    # 10.8f

    add-float p2, v1, v0

    .line 128
    goto :goto_1

    .line 130
    :pswitch_4
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41380000    # 11.5f

    add-float p2, v1, v0

    .line 132
    goto :goto_1

    .line 134
    :pswitch_5
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41400000    # 12.0f

    add-float p2, v1, v0

    .line 136
    goto :goto_1

    .line 138
    :pswitch_6
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41480000    # 12.5f

    add-float p2, v1, v0

    .line 140
    goto :goto_1

    .line 142
    :pswitch_7
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41500000    # 13.0f

    add-float p2, v1, v0

    .line 144
    goto :goto_1

    .line 146
    :goto_0
    invoke-static {p0, p1, p2}, Lcom/huawei/hihealthservice/old/model/SportData$MetValue;->getMetByWalkSpeedPart3(FIF)F

    move-result p2

    .line 149
    :goto_1
    return p2

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private static getMetByWalkSpeedPart3(FIF)F
    .locals 2

    .line 153
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 155
    :pswitch_0
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41680000    # 14.5f

    add-float p2, v1, v0

    .line 157
    goto :goto_0

    .line 159
    :pswitch_1
    int-to-float v0, p1

    sub-float v0, p0, v0

    const v1, 0x3f333340    # 0.70000076f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41780000    # 15.5f

    add-float p2, v1, v0

    .line 161
    goto :goto_0

    .line 163
    :pswitch_2
    int-to-float v0, p1

    sub-float v0, p0, v0

    const v1, 0x40266660    # 2.5999985f

    mul-float/2addr v0, v1

    const v1, 0x4181999a    # 16.2f

    add-float p2, v1, v0

    .line 165
    goto :goto_0

    .line 167
    :pswitch_3
    int-to-float v0, p1

    sub-float v0, p0, v0

    const v1, 0x3e4ccd00    # 0.20000076f

    mul-float/2addr v0, v1

    const v1, 0x41966666    # 18.8f

    add-float p2, v1, v0

    .line 169
    goto :goto_0

    .line 171
    :pswitch_4
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41980000    # 19.0f

    add-float p2, v1, v0

    .line 173
    goto :goto_0

    .line 175
    :pswitch_5
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x40200000    # 2.5f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    add-float p2, v1, v0

    .line 177
    goto :goto_0

    .line 179
    :pswitch_6
    int-to-float v0, p1

    sub-float v0, p0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41b40000    # 22.5f

    add-float p2, v1, v0

    .line 181
    goto :goto_0

    .line 183
    :pswitch_7
    const/high16 p2, 0x41b80000    # 23.0f

    .line 184
    .line 188
    :goto_0
    return p2

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

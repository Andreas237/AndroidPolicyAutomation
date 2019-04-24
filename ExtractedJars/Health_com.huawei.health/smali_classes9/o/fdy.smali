.class public Lo/fdy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(SS)I
    .locals 6

    .line 116
    const/4 v4, 0x0

    .line 117
    invoke-static {p0, p1}, Lo/fdy;->c(SS)F

    move-result v0

    float-to-int v5, v0

    .line 118
    const/16 v0, 0x14

    if-gt v5, v0, :cond_0

    .line 119
    mul-int/lit8 v0, v5, 0x64

    div-int/lit8 v4, v0, 0x1e

    goto :goto_0

    .line 121
    :cond_0
    add-int/lit8 v0, v5, -0x14

    int-to-double v0, v0

    const-wide v2, 0x4040aa3d70a3d70aL    # 33.33

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4044000000000000L    # 40.0

    div-double/2addr v0, v2

    const-wide v2, 0x4050aae147ae147bL    # 66.67

    add-double/2addr v0, v2

    double-to-int v4, v0

    .line 123
    :goto_0
    return v4
.end method

.method public static a(Landroid/content/Context;II)Ljava/lang/String;
    .locals 4

    .line 30
    const-string v2, ""

    .line 31
    int-to-short v0, p1

    int-to-short v1, p2

    invoke-static {v0, v1}, Lo/fdy;->b(SS)I

    move-result v3

    .line 32
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 37
    :pswitch_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_bloodpressure_status_low:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 38
    goto :goto_0

    .line 42
    :pswitch_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_desc_normal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 43
    goto :goto_0

    .line 47
    :pswitch_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_bloodpressure_status_high:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 48
    goto :goto_0

    .line 52
    :pswitch_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_bloodpressure_status_mild:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 53
    goto :goto_0

    .line 57
    :pswitch_4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_bloodpressure_status_moderate:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 58
    goto :goto_0

    .line 62
    :pswitch_5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_bloodpressure_status_severe:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 63
    .line 71
    :goto_0
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static a(S)Z
    .locals 1

    .line 251
    const/16 v0, 0x5a

    if-gt v0, p0, :cond_0

    const/16 v0, 0x78

    if-le v0, p0, :cond_0

    .line 252
    const/4 v0, 0x1

    return v0

    .line 254
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(I)F
    .locals 4

    .line 168
    add-int/lit8 v0, p0, 0x1

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v2, v1, v0

    .line 169
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, v2

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 170
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 171
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method

.method private static b(S)F
    .locals 3

    .line 211
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    .line 212
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 213
    :cond_0
    const/16 v0, 0x5a

    if-le v0, p0, :cond_1

    .line 214
    int-to-float v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42b40000    # 90.0f

    div-float v2, v0, v1

    goto/16 :goto_0

    .line 216
    :cond_1
    const/16 v0, 0x78

    if-le v0, p0, :cond_2

    .line 217
    add-int/lit8 v0, p0, -0x5a

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41f00000    # 30.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 219
    :cond_2
    const/16 v0, 0x8c

    if-le v0, p0, :cond_3

    .line 220
    add-int/lit8 v0, p0, -0x78

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 224
    :cond_3
    const/16 v0, 0xa0

    if-le v0, p0, :cond_4

    .line 225
    add-int/lit16 v0, p0, -0x8c

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 228
    :cond_4
    const/16 v0, 0xb4

    if-le v0, p0, :cond_5

    .line 230
    add-int/lit16 v0, p0, -0xa0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 233
    :cond_5
    const/16 v0, 0xc8

    if-le v0, p0, :cond_6

    .line 234
    add-int/lit16 v0, p0, -0xb4

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 238
    :cond_6
    const/high16 v2, 0x42700000    # 60.0f

    .line 240
    :goto_0
    return v2
.end method

.method public static b(SS)I
    .locals 1

    .line 84
    invoke-static {p0, p1}, Lo/fdy;->c(SS)F

    move-result v0

    invoke-static {v0}, Lo/fdy;->e(F)I

    move-result v0

    return v0
.end method

.method public static c(SS)F
    .locals 4

    .line 137
    const/4 v2, 0x1

    .line 138
    const/16 v0, -0x8000

    if-eq p0, v0, :cond_0

    const/16 v0, -0x8000

    if-ne p1, v0, :cond_1

    .line 140
    :cond_0
    return v2

    .line 142
    :cond_1
    invoke-static {p1}, Lo/fdy;->c(S)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 143
    invoke-static {p0}, Lo/fdy;->b(S)F

    move-result v2

    goto :goto_2

    .line 144
    :cond_2
    invoke-static {p0}, Lo/fdy;->a(S)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 145
    invoke-static {p1}, Lo/fdy;->d(S)F

    move-result v2

    goto :goto_2

    .line 146
    :cond_3
    const/16 v0, 0x50

    if-gt v0, p1, :cond_5

    const/16 v0, 0x78

    if-gt v0, p0, :cond_5

    .line 147
    invoke-static {p0}, Lo/fdy;->b(S)F

    move-result v0

    invoke-static {p1}, Lo/fdy;->d(S)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    invoke-static {p0}, Lo/fdy;->b(S)F

    move-result v2

    goto :goto_0

    .line 148
    :cond_4
    invoke-static {p1}, Lo/fdy;->d(S)F

    move-result v2

    :goto_0
    goto :goto_2

    .line 149
    :cond_5
    const/16 v0, 0x3c

    if-le v0, p1, :cond_7

    const/16 v0, 0x5a

    if-le v0, p0, :cond_7

    .line 150
    invoke-static {p0}, Lo/fdy;->b(S)F

    move-result v0

    invoke-static {p1}, Lo/fdy;->d(S)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    invoke-static {p0}, Lo/fdy;->b(S)F

    move-result v2

    goto :goto_1

    .line 151
    :cond_6
    invoke-static {p1}, Lo/fdy;->d(S)F

    move-result v2

    :goto_1
    goto :goto_2

    .line 153
    :cond_7
    invoke-static {p1}, Lo/fdy;->d(S)F

    move-result v2

    .line 155
    :goto_2
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, v2

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 156
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 157
    return v2
.end method

.method private static c(S)Z
    .locals 1

    .line 244
    const/16 v0, 0x3c

    if-gt v0, p0, :cond_0

    const/16 v0, 0x50

    if-le v0, p0, :cond_0

    .line 245
    const/4 v0, 0x1

    return v0

    .line 247
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static d(S)F
    .locals 3

    .line 178
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    .line 179
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 180
    :cond_0
    const/16 v0, 0x3c

    if-le v0, p0, :cond_1

    .line 181
    int-to-float v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v2, v0, v1

    goto :goto_0

    .line 182
    :cond_1
    const/16 v0, 0x50

    if-le v0, p0, :cond_2

    .line 183
    add-int/lit8 v0, p0, -0x3c

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 185
    :cond_2
    const/16 v0, 0x5a

    if-le v0, p0, :cond_3

    .line 186
    add-int/lit8 v0, p0, -0x50

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 189
    :cond_3
    const/16 v0, 0x64

    if-le v0, p0, :cond_4

    .line 190
    add-int/lit8 v0, p0, -0x5a

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 193
    :cond_4
    const/16 v0, 0x6e

    if-le v0, p0, :cond_5

    .line 194
    add-int/lit8 v0, p0, -0x64

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 197
    :cond_5
    const/16 v0, 0x78

    if-le v0, p0, :cond_6

    .line 198
    add-int/lit8 v0, p0, -0x6e

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 203
    :cond_6
    const/high16 v2, 0x42700000    # 60.0f

    .line 205
    :goto_0
    return v2
.end method

.method public static e(F)I
    .locals 5

    .line 97
    const/4 v0, 0x1

    sub-float v0, p0, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 98
    const/16 v4, -0x8000

    goto :goto_0

    .line 99
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/fdy;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_1

    .line 100
    const/4 v4, 0x0

    goto :goto_0

    .line 101
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Lo/fdy;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_2

    .line 102
    const/4 v4, 0x1

    goto :goto_0

    .line 103
    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lo/fdy;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_3

    .line 104
    const/4 v4, 0x2

    goto :goto_0

    .line 105
    :cond_3
    const/4 v0, 0x3

    invoke-static {v0}, Lo/fdy;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_4

    .line 106
    const/4 v4, 0x3

    goto :goto_0

    .line 107
    :cond_4
    const/4 v0, 0x4

    invoke-static {v0}, Lo/fdy;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_5

    .line 108
    const/4 v4, 0x4

    goto :goto_0

    .line 110
    :cond_5
    const/4 v4, 0x5

    .line 112
    :goto_0
    return v4
.end method

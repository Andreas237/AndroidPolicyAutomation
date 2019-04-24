.class public Lo/agb;
.super Lo/afz;
.source "SourceFile"


# instance fields
.field private c:S

.field private d:S

.field private e:S


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/afz;-><init>()V

    return-void
.end method

.method private static a(S)F
    .locals 3

    .line 224
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    .line 225
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 226
    :cond_0
    const/16 v0, 0x5a

    if-le v0, p0, :cond_1

    .line 227
    int-to-float v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42b40000    # 90.0f

    div-float v2, v0, v1

    goto/16 :goto_0

    .line 228
    :cond_1
    const/16 v0, 0x82

    if-le v0, p0, :cond_2

    .line 229
    add-int/lit8 v0, p0, -0x5a

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 231
    :cond_2
    const/16 v0, 0x8c

    if-le v0, p0, :cond_3

    .line 232
    add-int/lit16 v0, p0, -0x82

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 235
    :cond_3
    const/16 v0, 0xa0

    if-le v0, p0, :cond_4

    .line 236
    add-int/lit16 v0, p0, -0x8c

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 239
    :cond_4
    const/16 v0, 0xb4

    if-le v0, p0, :cond_5

    .line 240
    add-int/lit16 v0, p0, -0xa0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 243
    :cond_5
    const/16 v0, 0xc8

    if-le v0, p0, :cond_6

    .line 244
    add-int/lit16 v0, p0, -0xb4

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 249
    :cond_6
    const/high16 v2, 0x42700000    # 60.0f

    .line 252
    :goto_0
    return v2
.end method

.method public static b(I)F
    .locals 4

    .line 187
    add-int/lit8 v0, p0, 0x1

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v2, v1, v0

    .line 188
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, v2

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 189
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 190
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method

.method public static b(F)I
    .locals 5

    .line 160
    const/4 v0, 0x1

    sub-float v0, p0, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 161
    const/16 v4, -0x8000

    goto :goto_0

    .line 162
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/agb;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_1

    .line 163
    const/4 v4, 0x0

    goto :goto_0

    .line 164
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Lo/agb;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_2

    .line 165
    const/4 v4, 0x1

    goto :goto_0

    .line 166
    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lo/agb;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_3

    .line 167
    const/4 v4, 0x2

    goto :goto_0

    .line 168
    :cond_3
    const/4 v0, 0x3

    invoke-static {v0}, Lo/agb;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_4

    .line 169
    const/4 v4, 0x3

    goto :goto_0

    .line 170
    :cond_4
    const/4 v0, 0x4

    invoke-static {v0}, Lo/agb;->b(I)F

    move-result v0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_5

    .line 171
    const/4 v4, 0x4

    goto :goto_0

    .line 173
    :cond_5
    const/4 v4, 0x5

    .line 176
    :goto_0
    return v4
.end method

.method private static d(S)F
    .locals 3

    .line 258
    const/16 v0, -0x8000

    if-ne p0, v0, :cond_0

    .line 259
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 260
    :cond_0
    const/16 v0, 0x3c

    if-le v0, p0, :cond_1

    .line 261
    int-to-float v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v2, v0, v1

    goto :goto_0

    .line 262
    :cond_1
    const/16 v0, 0x50

    if-le v0, p0, :cond_2

    .line 263
    add-int/lit8 v0, p0, -0x3c

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 265
    :cond_2
    const/16 v0, 0x5a

    if-le v0, p0, :cond_3

    .line 266
    add-int/lit8 v0, p0, -0x50

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41a00000    # 20.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 269
    :cond_3
    const/16 v0, 0x64

    if-le v0, p0, :cond_4

    .line 270
    add-int/lit8 v0, p0, -0x5a

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x41f00000    # 30.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 273
    :cond_4
    const/16 v0, 0x6e

    if-le v0, p0, :cond_5

    .line 274
    add-int/lit8 v0, p0, -0x64

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42200000    # 40.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 277
    :cond_5
    const/16 v0, 0x78

    if-le v0, p0, :cond_6

    .line 278
    add-int/lit8 v0, p0, -0x6e

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    add-float v2, v1, v0

    goto :goto_0

    .line 283
    :cond_6
    const/high16 v2, 0x42700000    # 60.0f

    .line 285
    :goto_0
    return v2
.end method

.method public static d(SS)I
    .locals 1

    .line 147
    invoke-static {p0, p1}, Lo/agb;->e(SS)F

    move-result v0

    invoke-static {v0}, Lo/agb;->b(F)I

    move-result v0

    return v0
.end method

.method public static e(SS)F
    .locals 4

    .line 113
    const/4 v2, 0x1

    .line 114
    const/16 v0, -0x8000

    if-eq p0, v0, :cond_0

    const/16 v0, -0x8000

    if-ne p1, v0, :cond_1

    .line 116
    :cond_0
    return v2

    .line 118
    :cond_1
    invoke-static {p1}, Lo/agb;->g(S)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 119
    invoke-static {p0}, Lo/agb;->a(S)F

    move-result v2

    goto :goto_2

    .line 120
    :cond_2
    invoke-static {p0}, Lo/agb;->h(S)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 121
    invoke-static {p1}, Lo/agb;->d(S)F

    move-result v2

    goto :goto_2

    .line 122
    :cond_3
    const/16 v0, 0x50

    if-gt v0, p1, :cond_5

    const/16 v0, 0x82

    if-gt v0, p0, :cond_5

    .line 123
    invoke-static {p0}, Lo/agb;->a(S)F

    move-result v0

    invoke-static {p1}, Lo/agb;->d(S)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    invoke-static {p0}, Lo/agb;->a(S)F

    move-result v2

    goto :goto_0

    .line 124
    :cond_4
    invoke-static {p1}, Lo/agb;->d(S)F

    move-result v2

    :goto_0
    goto :goto_2

    .line 125
    :cond_5
    const/16 v0, 0x3c

    if-le v0, p1, :cond_7

    const/16 v0, 0x5a

    if-le v0, p0, :cond_7

    .line 126
    invoke-static {p0}, Lo/agb;->a(S)F

    move-result v0

    invoke-static {p1}, Lo/agb;->d(S)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    invoke-static {p0}, Lo/agb;->a(S)F

    move-result v2

    goto :goto_1

    .line 127
    :cond_6
    invoke-static {p1}, Lo/agb;->d(S)F

    move-result v2

    :goto_1
    goto :goto_2

    .line 128
    :cond_7
    const/16 v0, 0x3c

    if-le v0, p1, :cond_8

    const/16 v0, 0x82

    if-gt v0, p0, :cond_8

    .line 129
    invoke-static {p1}, Lo/agb;->d(S)F

    move-result v2

    goto :goto_2

    .line 131
    :cond_8
    const/high16 v2, 0x42700000    # 60.0f

    .line 133
    :goto_2
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, v2

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 134
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 135
    return v2
.end method

.method private static g(S)Z
    .locals 1

    .line 296
    const/16 v0, 0x3c

    if-gt v0, p0, :cond_0

    const/16 v0, 0x50

    if-le v0, p0, :cond_0

    .line 297
    const/4 v0, 0x1

    return v0

    .line 299
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static h(S)Z
    .locals 1

    .line 289
    const/16 v0, 0x5a

    if-gt v0, p0, :cond_0

    const/16 v0, 0x82

    if-le v0, p0, :cond_0

    .line 290
    const/4 v0, 0x1

    return v0

    .line 292
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()S
    .locals 1

    .line 66
    iget-short v0, p0, Lo/agb;->d:S

    return v0
.end method

.method public b(S)V
    .locals 0

    .line 73
    iput-short p1, p0, Lo/agb;->d:S

    .line 74
    return-void
.end method

.method public c()S
    .locals 1

    .line 80
    iget-short v0, p0, Lo/agb;->e:S

    return v0
.end method

.method public c(S)V
    .locals 0

    .line 95
    iput-short p1, p0, Lo/agb;->c:S

    .line 96
    return-void
.end method

.method public e(S)V
    .locals 0

    .line 87
    iput-short p1, p0, Lo/agb;->e:S

    .line 88
    return-void
.end method

.method public e(SSSJ)V
    .locals 5

    .line 304
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPresure getBloodPressureData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    invoke-virtual {p0, p4, p5}, Lo/agb;->e(J)V

    .line 306
    invoke-virtual {p0, p4, p5}, Lo/agb;->d(J)V

    .line 307
    invoke-virtual {p0, p1}, Lo/agb;->b(S)V

    .line 308
    invoke-virtual {p0, p2}, Lo/agb;->e(S)V

    .line 309
    invoke-static {p3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/agb;->c(Ljava/lang/Object;)V

    .line 310
    const/16 v0, 0x600

    invoke-virtual {p0, v0}, Lo/agb;->d(I)V

    .line 311
    const/16 v0, 0x600

    invoke-virtual {p0, v0}, Lo/agb;->e(I)V

    .line 312
    invoke-virtual {p0}, Lo/agb;->a()S

    move-result v0

    invoke-virtual {p0}, Lo/agb;->c()S

    move-result v1

    invoke-static {v0, v1}, Lo/agb;->d(SS)I

    move-result v0

    int-to-short v4, v0

    .line 313
    invoke-virtual {p0, v4}, Lo/agb;->c(S)V

    .line 314
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BloodPressure [state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lo/agb;->c:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", systolic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lo/agb;->d:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", diastolic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lo/agb;->e:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 101
    invoke-super {p0}, Lo/afz;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 100
    return-object v0
.end method

.class public Lo/acm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 47
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lo/acm;->c:Ljava/util/Set;

    .line 50
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "zh_CN_#Hans"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 51
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "zh_MO_#Hans"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "zh_HK_#Hans"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "zh_SG_#Hans"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 54
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "zh_CN"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "es_ES"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 56
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "de_DE"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 57
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "de_LU"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 58
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "de_BE"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "de_CH"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 60
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "de_AT"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 61
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "de_LI"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 62
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "fr_BE"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 63
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "fr_FR"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "fr_CH"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 65
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "pt_PT"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "en_US"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 67
    sget-object v0, Lo/acm;->c:Ljava/util/Set;

    const-string v1, "en_GB"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 69
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(BDI)I
    .locals 3

    .line 107
    const/4 v0, 0x1

    if-ne p0, v0, :cond_b

    .line 108
    const/16 v0, 0x27

    if-gt p3, v0, :cond_3

    .line 109
    const-wide/high16 v0, 0x403a000000000000L    # 26.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    .line 110
    const/4 v2, 0x3

    goto/16 :goto_0

    .line 111
    :cond_0
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_1

    .line 112
    const/4 v2, 0x2

    goto/16 :goto_0

    .line 113
    :cond_1
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_2

    .line 114
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 116
    :cond_2
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 118
    :cond_3
    const/16 v0, 0x3b

    if-gt p3, v0, :cond_7

    .line 119
    const-wide/high16 v0, 0x403b000000000000L    # 27.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_4

    .line 120
    const/4 v2, 0x3

    goto/16 :goto_0

    .line 121
    :cond_4
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_5

    .line 122
    const/4 v2, 0x2

    goto/16 :goto_0

    .line 123
    :cond_5
    const-wide/high16 v0, 0x4026000000000000L    # 11.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_6

    .line 124
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 126
    :cond_6
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 129
    :cond_7
    const-wide/high16 v0, 0x403d000000000000L    # 29.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_8

    .line 130
    const/4 v2, 0x3

    goto/16 :goto_0

    .line 131
    :cond_8
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_9

    .line 132
    const/4 v2, 0x2

    goto/16 :goto_0

    .line 133
    :cond_9
    const-wide/high16 v0, 0x402a000000000000L    # 13.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_a

    .line 134
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 136
    :cond_a
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 141
    :cond_b
    const/16 v0, 0x27

    if-gt p3, v0, :cond_f

    .line 142
    const-wide v0, 0x4043800000000000L    # 39.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_c

    .line 143
    const/4 v2, 0x3

    goto/16 :goto_0

    .line 144
    :cond_c
    const-wide/high16 v0, 0x4041000000000000L    # 34.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_d

    .line 145
    const/4 v2, 0x2

    goto :goto_0

    .line 146
    :cond_d
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_e

    .line 147
    const/4 v2, 0x1

    goto :goto_0

    .line 149
    :cond_e
    const/4 v2, 0x0

    goto :goto_0

    .line 151
    :cond_f
    const/16 v0, 0x3b

    if-gt p3, v0, :cond_13

    .line 152
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_10

    .line 153
    const/4 v2, 0x3

    goto :goto_0

    .line 154
    :cond_10
    const-wide v0, 0x4041800000000000L    # 35.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_11

    .line 155
    const/4 v2, 0x2

    goto :goto_0

    .line 156
    :cond_11
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_12

    .line 157
    const/4 v2, 0x1

    goto :goto_0

    .line 159
    :cond_12
    const/4 v2, 0x0

    goto :goto_0

    .line 162
    :cond_13
    const-wide v0, 0x4044800000000000L    # 41.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_14

    .line 163
    const/4 v2, 0x3

    goto :goto_0

    .line 164
    :cond_14
    const-wide/high16 v0, 0x4042000000000000L    # 36.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_15

    .line 165
    const/4 v2, 0x2

    goto :goto_0

    .line 166
    :cond_15
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_16

    .line 167
    const/4 v2, 0x1

    goto :goto_0

    .line 169
    :cond_16
    const/4 v2, 0x0

    .line 173
    :goto_0
    return v2
.end method

.method public static b(FF)F
    .locals 3

    .line 237
    div-float v0, p0, p1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v2, v0, v1

    .line 238
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v2, v0, v1

    .line 239
    const/high16 v0, 0x42c80000    # 100.0f

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 240
    return v2
.end method

.method public static b(D)I
    .locals 3

    .line 74
    const/4 v2, 0x0

    .line 75
    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 76
    const/4 v2, 0x3

    goto :goto_0

    .line 77
    :cond_0
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    .line 78
    const/4 v2, 0x2

    goto :goto_0

    .line 79
    :cond_1
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_2

    .line 80
    const/4 v2, 0x1

    goto :goto_0

    .line 81
    :cond_2
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_3

    .line 82
    const/4 v2, 0x0

    .line 84
    :cond_3
    :goto_0
    return v2
.end method

.method public static c(BI)D
    .locals 4

    .line 283
    const-string v0, "WeightDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStandFat sex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; age=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 285
    invoke-static {p1}, Lo/acm;->d(I)D

    move-result-wide v0

    return-wide v0

    .line 287
    :cond_0
    invoke-static {p1}, Lo/acm;->e(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public static c(BDD)I
    .locals 3

    .line 179
    const/4 v0, 0x1

    if-ne p0, v0, :cond_8

    .line 180
    const-wide/high16 v0, 0x4064000000000000L    # 160.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_2

    .line 181
    const-wide v0, 0x4043400000000000L    # 38.5

    cmpg-double v0, p3, v0

    if-gez v0, :cond_0

    .line 182
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 183
    :cond_0
    const-wide v0, 0x4047400000000000L    # 46.5

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_1

    .line 184
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 186
    :cond_1
    const/4 v2, 0x2

    goto/16 :goto_0

    .line 188
    :cond_2
    const-wide v0, 0x4065400000000000L    # 170.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_5

    .line 189
    const-wide/high16 v0, 0x4046000000000000L    # 44.0

    cmpg-double v0, p3, v0

    if-gez v0, :cond_3

    .line 190
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 191
    :cond_3
    const-wide v0, 0x404a333333333333L    # 52.4

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_4

    .line 192
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 194
    :cond_4
    const/4 v2, 0x2

    goto/16 :goto_0

    .line 197
    :cond_5
    const-wide v0, 0x4048b33333333333L    # 49.4

    cmpg-double v0, p3, v0

    if-gez v0, :cond_6

    .line 198
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 199
    :cond_6
    const-wide v0, 0x404db33333333333L    # 59.4

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_7

    .line 200
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 202
    :cond_7
    const/4 v2, 0x2

    goto :goto_0

    .line 206
    :cond_8
    const-wide v0, 0x4062c00000000000L    # 150.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_b

    .line 207
    const-wide v0, 0x4035e66666666666L    # 21.9

    cmpg-double v0, p3, v0

    if-gez v0, :cond_9

    .line 208
    const/4 v2, 0x0

    goto :goto_0

    .line 209
    :cond_9
    const-wide v0, 0x4035e66666666666L    # 21.9

    cmpl-double v0, p3, v0

    if-ltz v0, :cond_a

    const-wide v0, 0x404159999999999aL    # 34.7

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_a

    .line 210
    const/4 v2, 0x1

    goto :goto_0

    .line 212
    :cond_a
    const/4 v2, 0x2

    goto :goto_0

    .line 214
    :cond_b
    const-wide/high16 v0, 0x4064000000000000L    # 160.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_e

    .line 215
    const-wide v0, 0x4040733333333333L    # 32.9

    cmpg-double v0, p3, v0

    if-gez v0, :cond_c

    .line 216
    const/4 v2, 0x0

    goto :goto_0

    .line 217
    :cond_c
    const-wide v0, 0x4042c00000000000L    # 37.5

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_d

    .line 218
    const/4 v2, 0x1

    goto :goto_0

    .line 220
    :cond_d
    const/4 v2, 0x2

    goto :goto_0

    .line 223
    :cond_e
    const-wide v0, 0x4042400000000000L    # 36.5

    cmpg-double v0, p3, v0

    if-gez v0, :cond_f

    .line 224
    const/4 v2, 0x0

    goto :goto_0

    .line 225
    :cond_f
    const-wide v0, 0x4045400000000000L    # 42.5

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_10

    .line 226
    const/4 v2, 0x1

    goto :goto_0

    .line 228
    :cond_10
    const/4 v2, 0x2

    .line 232
    :goto_0
    return v2
.end method

.method public static d(I)D
    .locals 2

    .line 295
    const/16 v0, 0x12

    if-lt p0, v0, :cond_0

    const/16 v0, 0x63

    if-lt p0, v0, :cond_1

    .line 296
    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0

    .line 297
    :cond_1
    const/16 v0, 0x27

    if-ge p0, v0, :cond_2

    .line 298
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    return-wide v0

    .line 299
    :cond_2
    const/16 v0, 0x3b

    if-ge p0, v0, :cond_3

    .line 300
    const-wide/high16 v0, 0x4031000000000000L    # 17.0

    return-wide v0

    .line 302
    :cond_3
    const-wide/high16 v0, 0x4033000000000000L    # 19.0

    return-wide v0
.end method

.method public static d(BDDII)I
    .locals 7

    .line 326
    const-string v0, "WeightDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBodyType userSex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; fats="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; muscle="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; age="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; height= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    const/4 v4, -0x1

    .line 328
    invoke-static {p0, p1, p2, p5}, Lo/acm;->a(BDI)I

    move-result v5

    .line 329
    int-to-double v0, p6

    invoke-static {p0, v0, v1, p3, p4}, Lo/acm;->c(BDD)I

    move-result v6

    .line 330
    if-nez v5, :cond_2

    .line 331
    if-nez v6, :cond_0

    .line 332
    const/4 v4, 0x1

    goto :goto_0

    .line 333
    :cond_0
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    .line 334
    const/4 v4, 0x2

    goto :goto_0

    .line 335
    :cond_1
    const/4 v0, 0x2

    if-ne v6, v0, :cond_9

    .line 336
    const/4 v4, 0x3

    goto :goto_0

    .line 338
    :cond_2
    const/4 v0, 0x1

    if-ne v5, v0, :cond_5

    .line 339
    if-nez v6, :cond_3

    .line 340
    const/4 v4, 0x4

    goto :goto_0

    .line 341
    :cond_3
    const/4 v0, 0x1

    if-ne v6, v0, :cond_4

    .line 342
    const/4 v4, 0x5

    goto :goto_0

    .line 343
    :cond_4
    const/4 v0, 0x2

    if-ne v6, v0, :cond_9

    .line 344
    const/4 v4, 0x6

    goto :goto_0

    .line 346
    :cond_5
    const/4 v0, 0x2

    if-eq v5, v0, :cond_6

    const/4 v0, 0x3

    if-ne v5, v0, :cond_9

    .line 347
    :cond_6
    if-nez v6, :cond_7

    .line 348
    const/4 v4, 0x7

    goto :goto_0

    .line 349
    :cond_7
    const/4 v0, 0x1

    if-ne v6, v0, :cond_8

    .line 350
    const/16 v4, 0x8

    goto :goto_0

    .line 351
    :cond_8
    const/4 v0, 0x2

    if-ne v6, v0, :cond_9

    .line 352
    const/16 v4, 0x9

    .line 355
    :cond_9
    :goto_0
    return v4
.end method

.method public static e(BI)D
    .locals 6

    .line 262
    const-string v0, "WeightDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStandweight sex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; userHight=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    if-gtz p1, :cond_0

    .line 265
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0

    .line 267
    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 268
    int-to-double v0, p1

    const-wide v2, 0x403590624dd2f1aaL    # 21.564

    mul-double/2addr v0, v2

    int-to-double v2, p1

    mul-double/2addr v0, v2

    const-wide v2, 0x40c3880000000000L    # 10000.0

    div-double v4, v0, v2

    goto :goto_0

    .line 270
    :cond_1
    int-to-double v0, p1

    const-wide v2, 0x4034eac083126e98L    # 20.917

    mul-double/2addr v0, v2

    int-to-double v2, p1

    mul-double/2addr v0, v2

    const-wide v2, 0x40c3880000000000L    # 10000.0

    div-double v4, v0, v2

    .line 272
    :goto_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public static e(I)D
    .locals 2

    .line 310
    const/16 v0, 0x12

    if-lt p0, v0, :cond_0

    const/16 v0, 0x63

    if-lt p0, v0, :cond_1

    .line 311
    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0

    .line 312
    :cond_1
    const/16 v0, 0x27

    if-ge p0, v0, :cond_2

    .line 313
    const-wide/high16 v0, 0x403b000000000000L    # 27.0

    return-wide v0

    .line 314
    :cond_2
    const/16 v0, 0x3b

    if-ge p0, v0, :cond_3

    .line 315
    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    return-wide v0

    .line 317
    :cond_3
    const-wide/high16 v0, 0x403d000000000000L    # 29.0

    return-wide v0
.end method

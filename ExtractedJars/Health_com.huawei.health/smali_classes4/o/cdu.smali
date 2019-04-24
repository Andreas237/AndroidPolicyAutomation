.class public Lo/cdu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:F

.field private static b:I

.field private static c:I

.field private static d:I

.field private static e:I

.field private static k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput v0, Lo/cdu;->c:I

    .line 37
    const/16 v0, 0x3e8

    sput v0, Lo/cdu;->b:I

    .line 38
    const/16 v0, 0x7d0

    sput v0, Lo/cdu;->d:I

    .line 39
    const/16 v0, 0x2710

    sput v0, Lo/cdu;->e:I

    .line 40
    const/high16 v0, 0x447a0000    # 1000.0f

    sput v0, Lo/cdu;->a:F

    .line 42
    const v0, 0x186a0

    sput v0, Lo/cdu;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)F
    .locals 4

    .line 52
    if-nez p0, :cond_0

    .line 53
    const/16 p0, 0xaa

    .line 55
    :cond_0
    const/16 v0, 0x95

    if-ge p0, v0, :cond_1

    .line 56
    int-to-float v0, p0

    const v1, 0x3ef5c28f    # 0.48f

    mul-float v3, v0, v1

    goto :goto_0

    .line 57
    :cond_1
    const/16 v0, 0xa6

    if-ge p0, v0, :cond_2

    .line 58
    int-to-float v0, p0

    int-to-float v1, p0

    const v2, 0x3b23d70a    # 0.0025f

    mul-float/2addr v1, v2

    const v2, 0x3e147ae1    # 0.145f

    add-float/2addr v1, v2

    mul-float v3, v0, v1

    goto :goto_0

    .line 59
    :cond_2
    const/16 v0, 0xb9

    if-ge p0, v0, :cond_3

    .line 60
    int-to-float v0, p0

    const v1, 0x3f0f5c29    # 0.56f

    mul-float v3, v0, v1

    goto :goto_0

    .line 62
    :cond_3
    const/high16 v3, 0x42dc0000    # 110.0f

    .line 64
    :goto_0
    const/high16 v0, 0x42c80000    # 100.0f

    div-float v0, v3, v0

    return v0
.end method

.method public static a(D)Ljava/lang/String;
    .locals 2

    .line 124
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v1

    .line 125
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 126
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 127
    invoke-virtual {v1, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(I)F
    .locals 1

    .line 136
    if-gtz p0, :cond_0

    .line 137
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 138
    :cond_0
    const/16 v0, 0x1e

    if-lt p0, v0, :cond_1

    .line 139
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 140
    :cond_1
    const/16 v0, 0x8

    if-gt p0, v0, :cond_2

    .line 141
    const/high16 v0, 0x3f400000    # 0.75f

    return v0

    .line 142
    :cond_2
    const/16 v0, 0xb

    if-gt p0, v0, :cond_3

    .line 143
    const v0, 0x3f59999a    # 0.85f

    return v0

    .line 144
    :cond_3
    const/16 v0, 0xf

    if-lt p0, v0, :cond_4

    .line 145
    const v0, 0x3f8ccccd    # 1.1f

    return v0

    .line 147
    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public static b(Ljava/lang/String;D)Ljava/lang/String;
    .locals 3

    .line 174
    const/4 v1, 0x0

    .line 175
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 176
    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 177
    new-instance v0, Lo/cdu$5;

    invoke-direct {v0}, Lo/cdu$5;-><init>()V

    invoke-static {p0, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 178
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    .line 180
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    invoke-static {v2}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 184
    :goto_0
    const/16 v0, 0xc

    if-lt v1, v0, :cond_1

    .line 185
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 186
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    invoke-static {v2}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 189
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    invoke-static {v2}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 153
    const/4 v1, 0x0

    .line 154
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 155
    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 156
    new-instance v0, Lo/cdu$4;

    invoke-direct {v0}, Lo/cdu$4;-><init>()V

    invoke-static {p0, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 157
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    .line 159
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    invoke-static {v2}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 163
    :goto_0
    const/16 v0, 0xc

    if-lt v1, v0, :cond_1

    .line 164
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 165
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    invoke-static {v2}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 168
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    invoke-static {v2}, Lo/cdl;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(F)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)Ljava/util/ArrayList<Ljava/lang/Double;>;"
        }
    .end annotation

    .line 84
    const/4 v4, 0x1

    .line 85
    const-wide/16 v5, 0x0

    .line 87
    float-to-double v0, p0

    invoke-static {v0, v1}, Lo/cdu;->a(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 88
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    .line 89
    const-wide v5, 0x3f847ae147ae147bL    # 0.01

    .line 90
    float-to-double v0, p0

    const-wide v2, 0x3fa999999999999aL    # 0.05

    div-double/2addr v0, v2

    double-to-int v4, v0

    goto :goto_0

    .line 91
    :cond_0
    const/high16 v0, 0x40a00000    # 5.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_1

    .line 92
    const-wide v5, 0x3fa999999999999aL    # 0.05

    .line 93
    float-to-int v0, p0

    mul-int/lit8 v4, v0, 0x4

    goto :goto_0

    .line 95
    :cond_1
    const-wide v5, 0x3fb999999999999aL    # 0.1

    .line 96
    float-to-int v0, p0

    mul-int/lit8 v4, v0, 0x2

    .line 98
    :goto_0
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 100
    move v10, v4

    :goto_1
    if-lez v10, :cond_3

    .line 101
    float-to-double v0, p0

    int-to-double v2, v10

    mul-double/2addr v2, v5

    sub-double/2addr v0, v2

    const-wide v2, 0x3fb999999999999aL    # 0.1

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 102
    goto :goto_2

    .line 104
    :cond_2
    int-to-double v0, v10

    mul-double/2addr v0, v5

    sub-double v0, v7, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    :goto_2
    add-int/lit8 v10, v10, -0x1

    goto :goto_1

    .line 107
    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    .line 109
    const/4 v11, 0x0

    :goto_3
    if-gt v11, v4, :cond_4

    .line 110
    int-to-double v0, v11

    mul-double/2addr v0, v5

    add-double/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 113
    :cond_4
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "acquireCalibrationDistance(), mPosition :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " , arraySize :"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " calibrationDistance:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-object v9
.end method

.method public static b(Ljava/util/Map;FF)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;FF)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 236
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 237
    :cond_0
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changePaceMap paceMap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    return-object p0

    .line 240
    :cond_1
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 242
    div-float v5, p2, p1

    .line 244
    const/4 v6, 0x0

    .line 246
    const/4 v7, 0x0

    .line 248
    const/4 v8, 0x0

    .line 250
    const/4 v9, 0x0

    .line 253
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map$Entry;

    .line 254
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cdu;->d(I)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    mul-float/2addr v0, v5

    add-float/2addr v6, v0

    .line 255
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Lo/cdu;->d(IF)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v7, v0

    .line 256
    sget v0, Lo/cdu;->b:I

    int-to-float v0, v0

    div-float v0, v6, v0

    div-float v8, v7, v0

    .line 257
    sget v0, Lo/cdu;->b:I

    int-to-float v0, v0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_3

    .line 258
    sget v0, Lo/cdu;->d:I

    int-to-float v0, v0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_2

    .line 259
    add-int/lit8 v9, v9, 0x1

    .line 260
    mul-int/lit8 v0, v9, 0x64

    sget v1, Lo/cdu;->k:I

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    sget v0, Lo/cdu;->b:I

    int-to-float v0, v0

    sub-float/2addr v6, v0

    .line 262
    sub-float/2addr v7, v8

    .line 264
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 265
    mul-int/lit8 v0, v9, 0x64

    sget v1, Lo/cdu;->k:I

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    sget v0, Lo/cdu;->b:I

    int-to-float v0, v0

    sub-float/2addr v6, v0

    .line 267
    sub-float/2addr v7, v8

    .line 269
    :cond_3
    goto/16 :goto_0

    .line 271
    :cond_4
    float-to-double v0, v6

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v0, v0, v2

    if-lez v0, :cond_5

    .line 272
    float-to-int v0, p2

    int-to-float v0, v0

    sget v1, Lo/cdu;->a:F

    div-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    sget v1, Lo/cdu;->k:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    :cond_5
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changePaceMap newPaceMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    return-object v4
.end method

.method public static b(Lo/dao;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 200
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    :cond_0
    return-void

    .line 203
    :cond_1
    new-instance v0, Lo/cdu$2;

    invoke-direct {v0}, Lo/cdu$2;-><init>()V

    invoke-static {p1, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 204
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v5, v0, [I

    .line 205
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 206
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v5, v6

    .line 205
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 208
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    sput v0, Lo/cdu;->c:I

    .line 209
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "acquireCalibrationData(), durationDatas :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v5}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    new-instance v0, Lo/cdu$3;

    invoke-direct {v0}, Lo/cdu$3;-><init>()V

    invoke-static {p2, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/ArrayList;

    .line 211
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v7, v0, [I

    .line 212
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 213
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v7, v8

    .line 212
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 215
    :cond_3
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "acquireCalibrationData(), stepDatasList :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    new-instance v0, Lo/cdu$1;

    invoke-direct {v0}, Lo/cdu$1;-><init>()V

    invoke-static {p3, v0}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/ArrayList;

    .line 217
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v9, v0, [F

    .line 218
    const/4 v10, 0x0

    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v10, v0, :cond_4

    .line 219
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v9, v10

    .line 218
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 221
    :cond_4
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "acquireCalibrationData(), distanceDatas :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v9}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    const/4 v0, 0x0

    invoke-static {p0, v5, v7, v9, v0}, Lo/cch;->c(Lo/dao;[I[I[FI)I

    .line 224
    return-void
.end method

.method public static c(I)I
    .locals 1

    .line 71
    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 72
    const/4 v0, 0x0

    return v0

    .line 73
    :cond_0
    const/4 v0, 0x4

    if-ne p0, v0, :cond_1

    .line 74
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_1
    div-int/lit8 v0, p0, 0x2

    return v0
.end method

.method private static d(I)Ljava/lang/Float;
    .locals 3

    .line 280
    const/4 v2, 0x0

    .line 281
    sget v0, Lo/cdu;->k:I

    mul-int/lit8 v0, v0, 0x64

    rem-int v0, p0, v0

    if-nez v0, :cond_0

    .line 282
    sget v0, Lo/cdu;->b:I

    int-to-float v2, v0

    goto :goto_0

    .line 284
    :cond_0
    sget v0, Lo/cdu;->e:I

    div-int v0, p0, v0

    sget v1, Lo/cdu;->b:I

    rem-int/2addr v0, v1

    int-to-float v2, v0

    .line 286
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method private static d(IF)Ljava/lang/Float;
    .locals 3

    .line 291
    const/4 v2, 0x0

    .line 292
    sget v0, Lo/cdu;->k:I

    mul-int/lit8 v0, v0, 0x64

    rem-int v0, p0, v0

    if-nez v0, :cond_0

    .line 293
    move v2, p1

    goto :goto_0

    .line 295
    :cond_0
    sget v0, Lo/cdu;->e:I

    div-int v0, p0, v0

    sget v1, Lo/cdu;->b:I

    rem-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, p1

    sget v1, Lo/cdu;->a:F

    div-float v2, v0, v1

    .line 297
    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public static e()I
    .locals 1

    .line 229
    sget v0, Lo/cdu;->c:I

    return v0
.end method

.method public static e(Ljava/util/Map;Z)Ljava/util/Map;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;Z)Ljava/util/Map<Ljava/lang/Double;Ljava/lang/Double;>;"
        }
    .end annotation

    .line 304
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 305
    if-eqz p0, :cond_0

    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 306
    :cond_0
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changePartTimeMap paceMap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    return-object v4

    .line 310
    :cond_1
    const/4 v5, 0x0

    .line 312
    const/4 v6, 0x0

    .line 314
    const-wide/16 v7, 0x0

    .line 316
    const-wide/16 v9, 0x0

    .line 320
    if-eqz p1, :cond_2

    .line 321
    const-wide v11, 0x402a3850268900c5L    # 13.1099865

    .line 322
    const-wide v13, 0x403a3850268900c5L    # 26.219973

    goto :goto_0

    .line 324
    :cond_2
    const-wide v11, 0x403518f5c28f5c29L    # 21.0975

    .line 325
    const-wide v13, 0x404518f5c28f5c29L    # 42.195

    .line 327
    :goto_0
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/Map$Entry;

    .line 329
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cdu;->d(I)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v1, v0

    move-wide/from16 v17, v1

    .line 330
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Lo/cdu;->d(IF)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v1, v0

    move-wide/from16 v19, v1

    .line 332
    if-nez v5, :cond_3

    sget v0, Lo/cdu;->b:I

    int-to-double v0, v0

    mul-double/2addr v0, v7

    add-double v0, v0, v17

    sget v2, Lo/cdu;->b:I

    int-to-double v2, v2

    mul-double/2addr v2, v11

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 333
    sub-double v0, v11, v7

    mul-double v0, v0, v19

    add-double v21, v0, v9

    .line 334
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    const/4 v5, 0x1

    .line 337
    :cond_3
    if-nez v6, :cond_4

    sget v0, Lo/cdu;->b:I

    int-to-double v0, v0

    mul-double/2addr v0, v7

    add-double v0, v0, v17

    sget v2, Lo/cdu;->b:I

    int-to-double v2, v2

    mul-double/2addr v2, v13

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 338
    sub-double v0, v13, v7

    mul-double v0, v0, v19

    add-double v21, v0, v9

    .line 339
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    const/4 v6, 0x1

    .line 343
    :cond_4
    sget v0, Lo/cdu;->b:I

    int-to-double v0, v0

    cmpl-double v0, v17, v0

    if-ltz v0, :cond_5

    .line 344
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    add-double/2addr v9, v0

    .line 345
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v7, v0

    .line 347
    :cond_5
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    goto/16 :goto_1

    .line 350
    :cond_6
    const-string v0, "Track_IndoorRunUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changePartTimeMap newPaceMap is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    return-object v4
.end method

.class public Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static TAG:Ljava/lang/String;

.field private static instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-string v0, "DetailGPSWorkoutUtil"

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DetailGPSWorkoutUtil"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    return-void
.end method

.method private getFileGPSMap(Ljava/lang/String;I)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/Map<Ljava/lang/Long;[D>;"
        }
    .end annotation

    .line 99
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 100
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 101
    const/4 v0, 0x0

    const/16 v1, 0x40

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 102
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFileGPSMap info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-direct {p0, v5}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSFrameHeader(Ljava/lang/String;)Lo/dki;

    move-result-object v6

    .line 104
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 105
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFileGPSMap sb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, -0x1

    if-eq v0, p2, :cond_0

    .line 107
    invoke-virtual {v6}, Lo/dki;->d()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 109
    :cond_0
    invoke-virtual {v6}, Lo/dki;->d()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1a

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 111
    :goto_1
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFileGPSMap info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {v6}, Lo/dki;->a()I

    move-result v0

    invoke-direct {p0, v5, v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSOffsetData(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v7

    .line 113
    const/4 v8, 0x0

    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 114
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dka;

    invoke-virtual {v0}, Lo/dka;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dka;

    invoke-virtual {v1}, Lo/dka;->d()[D

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 116
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 117
    goto/16 :goto_0

    .line 118
    :cond_2
    return-object v4
.end method

.method private getGPSFrameHeader(Ljava/lang/String;)Lo/dki;
    .locals 4

    .line 122
    new-instance v2, Lo/dki;

    invoke-direct {v2}, Lo/dki;-><init>()V

    .line 124
    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dki;->e(I)V

    .line 125
    const/16 v0, 0x10

    const/16 v1, 0x14

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dki;->d(I)V

    .line 126
    const/16 v0, 0x14

    const/16 v1, 0x18

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dki;->a(I)V

    .line 127
    const/16 v0, 0x18

    const/16 v1, 0x1c

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 128
    invoke-virtual {v2, v3}, Lo/dki;->c(I)V

    .line 129
    const/4 v0, 0x1

    if-le v3, v0, :cond_0

    .line 130
    const/16 v0, 0x1c

    const/16 v1, 0x1e

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dki;->b(I)V

    goto :goto_0

    .line 132
    :cond_0
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lo/dki;->b(I)V

    .line 134
    :goto_0
    return-object v2
.end method

.method private getGPSOffsetData(Ljava/lang/String;I)Ljava/util/List;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lo/dka;>;"
        }
    .end annotation

    .line 138
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 141
    const/4 v8, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x1a

    if-ge v8, v0, :cond_4

    .line 142
    const/4 v6, 0x1

    .line 143
    const/4 v7, 0x1

    .line 144
    const/4 v0, 0x4

    new-array v9, v0, [D

    .line 145
    new-instance v10, Lo/dka;

    invoke-direct {v10}, Lo/dka;-><init>()V

    .line 146
    mul-int/lit8 v0, v8, 0x1a

    add-int/lit8 v1, v8, 0x1

    mul-int/lit8 v1, v1, 0x1a

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 147
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGPSOffsetData() offsetData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const/4 v0, 0x0

    const/16 v1, 0xa

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    long-to-double v12, v0

    .line 150
    const-wide/high16 v0, 0x4170000000000000L    # 1.6777216E7

    div-double v14, v12, v0

    .line 151
    const/16 v0, 0xa

    const/16 v1, 0x12

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v16, v2

    .line 152
    const-wide/high16 v0, 0x4170000000000000L    # 1.6777216E7

    div-double v18, v16, v0

    .line 154
    const/4 v0, 0x0

    move/from16 v1, p2

    if-eq v0, v1, :cond_2

    .line 155
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, v14

    if-gtz v0, :cond_0

    const-wide v0, 0x4076800000000000L    # 360.0

    cmpl-double v0, v0, v14

    if-ltz v0, :cond_0

    .line 156
    const-wide v0, 0x4066800000000000L    # 180.0

    sub-double/2addr v14, v0

    goto :goto_1

    .line 159
    :cond_0
    const/4 v6, 0x0

    .line 162
    :goto_1
    const-wide/16 v0, 0x0

    cmpg-double v0, v0, v18

    if-gtz v0, :cond_1

    const-wide v0, 0x4066800000000000L    # 180.0

    cmpl-double v0, v0, v18

    if-ltz v0, :cond_1

    .line 163
    const-wide v0, 0x4056800000000000L    # 90.0

    sub-double v18, v18, v0

    goto :goto_2

    .line 166
    :cond_1
    const/4 v7, 0x0

    .line 170
    :cond_2
    :goto_2
    new-instance v0, Ljava/math/BigDecimal;

    move-wide/from16 v1, v18

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    move-object/from16 v20, v0

    .line 171
    move-object/from16 v0, v20

    const/4 v1, 0x7

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v18

    .line 173
    new-instance v0, Ljava/math/BigDecimal;

    move-wide v1, v14

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    move-object/from16 v21, v0

    .line 174
    move-object/from16 v0, v21

    const/4 v1, 0x7

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v14

    .line 176
    const/4 v0, 0x0

    aput-wide v18, v9, v0

    .line 177
    const/4 v0, 0x1

    aput-wide v14, v9, v0

    .line 178
    const-wide/16 v0, 0x0

    const/4 v2, 0x2

    aput-wide v0, v9, v2

    .line 180
    const/16 v0, 0x12

    const/16 v1, 0x1a

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v22, v0, v2

    .line 181
    move-wide/from16 v0, v22

    long-to-double v0, v0

    const/4 v2, 0x3

    aput-wide v0, v9, v2

    .line 183
    int-to-long v0, v8

    invoke-virtual {v10, v0, v1}, Lo/dka;->e(J)V

    .line 184
    invoke-virtual {v10, v9}, Lo/dka;->c([D)V

    .line 186
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGPSOffsetData() lon = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " lat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v18

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v22

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    if-eqz v7, :cond_3

    if-eqz v6, :cond_3

    .line 189
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 192
    :cond_4
    return-object v5
.end method

.method public static getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;
    .locals 2

    .line 41
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 42
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    invoke-direct {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;-><init>()V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    .line 44
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;

    return-object v0
.end method


# virtual methods
.method public getGPSFrameHeader([B)Lo/dki;
    .locals 7

    .line 74
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    goto :goto_0

    .line 77
    :catch_0
    move-exception v5

    .line 78
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportAltitude e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :goto_0
    const/4 v0, 0x0

    const/16 v1, 0x40

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 81
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportAltitude info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-direct {p0, v5}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getGPSFrameHeader(Ljava/lang/String;)Lo/dki;

    move-result-object v6

    .line 83
    return-object v6
.end method

.method public getGPSMap([BI)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI)Ljava/util/Map<Ljava/lang/Long;[D>;"
        }
    .end annotation

    .line 88
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_0

    .line 91
    :catch_0
    move-exception v5

    .line 92
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGPSMap e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :goto_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGPSMap sb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->getFileGPSMap(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getGPSMapType(Lo/dki;)I
    .locals 1

    .line 51
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 52
    invoke-virtual {p1}, Lo/dki;->e()I

    move-result v0

    return v0

    .line 54
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public isSupportAltitude(Lo/dki;)Z
    .locals 5

    .line 64
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 65
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailGPSWorkoutUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "gpsHeaderBitmap="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/dki;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",isSupportAltitude="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/dki;->b()I

    move-result v3

    and-int/lit16 v3, v3, 0x80

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-virtual {p1}, Lo/dki;->b()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    .line 67
    const/4 v0, 0x1

    return v0

    .line 70
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.class Lo/adb$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:[B

.field private c:I

.field private e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lo/adb$b;->a:[B

    .line 55
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lo/adb$b;->e:[B

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/adb$b;->c:I

    .line 59
    return-void
.end method

.method private c(I)Ljava/lang/String;
    .locals 2

    .line 88
    const/16 v0, 0xa

    if-ge p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private d([B)I
    .locals 2

    .line 82
    const/4 v0, 0x4

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 83
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/IntBuffer;->get()I

    move-result v0

    return v0
.end method


# virtual methods
.method public a([B)Ljava/lang/String;
    .locals 5

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    if-eqz p1, :cond_2

    array-length v0, p1

    if-lez v0, :cond_2

    .line 65
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_1

    .line 67
    aget-byte v0, p1, v3

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 68
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 75
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b([B)Ljava/lang/String;
    .locals 9

    .line 211
    new-instance v4, Ljava/lang/StringBuilder;

    array-length v0, p1

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 212
    move-object v5, p1

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-byte v8, v5, v7

    .line 213
    const-string v0, "%02x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    and-int/lit16 v2, v8, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 216
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e([B)[Ljava/lang/Object;
    .locals 28

    .line 98
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseDataParser return data:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Lo/adb$b;->b([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-static/range {p1 .. p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 102
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lo/adb$b;->a([B)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 110
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseDataParser getSugarData Flag:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 112
    and-int/lit8 v9, v8, 0x1

    .line 113
    and-int/lit8 v0, v8, 0x2

    shr-int/lit8 v10, v0, 0x1

    .line 114
    and-int/lit8 v0, v8, 0x4

    shr-int/lit8 v11, v0, 0x2

    .line 117
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->a:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/adb$b;->c:I

    .line 120
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseDataParser getSugarData sequenceNumber:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/adb$b;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->a:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->c(I)Ljava/lang/String;

    move-result-object v12

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->c(I)Ljava/lang/String;

    move-result-object v13

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->c(I)Ljava/lang/String;

    move-result-object v14

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 132
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->c(I)Ljava/lang/String;

    move-result-object v15

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->c(I)Ljava/lang/String;

    move-result-object v16

    .line 135
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 136
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->c(I)Ljava/lang/String;

    move-result-object v17

    .line 137
    const-string v0, "%s-%s-%s %s:%s:%s"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v12, v1, v2

    const/4 v2, 0x1

    aput-object v13, v1, v2

    const/4 v2, 0x2

    aput-object v14, v1, v2

    const/4 v2, 0x3

    aput-object v15, v1, v2

    const/4 v2, 0x4

    aput-object v16, v1, v2

    const/4 v2, 0x5

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 138
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseDataParser getSugarData strDataInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/4 v0, 0x1

    if-ne v0, v9, :cond_0

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 145
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 146
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->a:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v19

    .line 150
    move-object/from16 v0, v19

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move/from16 v20, v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_1

    .line 151
    add-int/lit8 v20, v20, -0x10

    goto :goto_0

    .line 153
    :cond_1
    move/from16 v0, v20

    neg-int v0, v0

    move/from16 v20, v0

    .line 155
    :goto_0
    move-object/from16 v0, v19

    const/4 v1, 0x4

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v21

    .line 157
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseDataParser getSugarData --bit2:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---rawGlucose:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--mExponent:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "----mMantissaand:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v21

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x1

    if-ne v0, v11, :cond_2

    .line 163
    move/from16 v0, v21

    int-to-double v0, v0

    move/from16 v2, v20

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double v24, v0, v2

    .line 165
    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double v22, v24, v0

    .line 166
    goto :goto_1

    .line 168
    :cond_2
    move/from16 v0, v21

    int-to-double v0, v0

    move/from16 v2, v20

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double v24, v0, v2

    .line 171
    const-wide v0, 0x40163334a7a791bfL    # 5.55000555000555

    mul-double v26, v24, v0

    .line 173
    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double v22, v26, v0

    .line 175
    :goto_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseDataParser getSugarData glpValueD:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v22

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const/4 v0, 0x1

    if-ne v0, v10, :cond_3

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v6, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/adb$b;->e:[B

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/adb$b;->d([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v24

    .line 180
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v0

    rsub-int/lit8 v25, v0, 0x8

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "00000000"

    const/4 v2, 0x0

    move/from16 v3, v25

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 183
    const/4 v0, 0x0

    return-object v0

    .line 188
    :cond_3
    new-instance v0, Ljava/math/BigDecimal;

    move-wide/from16 v1, v22

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v24

    .line 189
    const/16 v25, 0x0

    .line 193
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    move-object/from16 v26, v0

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    move-object/from16 v2, v18

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/adb$b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    .line 196
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GlucoseDataParser getSugarData result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v27

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    move-object/from16 v1, v26

    move-object/from16 v2, v18

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    move-object/from16 v1, p0

    iget v1, v1, Lo/adb$b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v25, v0

    .line 201
    goto :goto_2

    .line 199
    :catch_0
    move-exception v26

    .line 200
    invoke-virtual/range {v26 .. v26}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :goto_2
    return-object v25
.end method

.class final Lo/edc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private d:Landroid/graphics/Point;

.field private e:Landroid/graphics/Point;

.field private f:Ljava/lang/String;

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const-class v0, Lo/edc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/edc;->c:Ljava/lang/String;

    .line 29
    const-string v0, ","

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/edc;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lo/edc;->b:Landroid/content/Context;

    .line 37
    return-void
.end method

.method private a(Landroid/hardware/Camera$Parameters;)V
    .locals 14

    .line 209
    const-string v0, "zoom-supported"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 210
    if-eqz v5, :cond_0

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    return-void

    .line 214
    :cond_0
    const/16 v6, 0x1b

    .line 216
    const-string v0, "max-zoom"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 217
    if-eqz v7, :cond_2

    .line 219
    :try_start_0
    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v8, v0

    .line 220
    if-le v6, v8, :cond_1

    .line 221
    move v6, v8

    .line 226
    :cond_1
    goto :goto_0

    .line 224
    :catch_0
    move-exception v8

    .line 225
    sget-object v0, Lo/edc;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception nfe = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :cond_2
    :goto_0
    const-string v0, "taking-picture-zoom-max"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 230
    if-eqz v8, :cond_4

    .line 232
    :try_start_1
    invoke-static {v8}, Lo/ecw;->b(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v9

    .line 233
    if-le v6, v9, :cond_3

    .line 234
    move v6, v9

    .line 239
    :cond_3
    goto :goto_1

    .line 237
    :catch_1
    move-exception v9

    .line 238
    sget-object v0, Lo/edc;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception nfe = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    :cond_4
    :goto_1
    const-string v0, "mot-zoom-values"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 243
    if-eqz v9, :cond_5

    .line 244
    invoke-static {v9, v6}, Lo/edc;->b(Ljava/lang/CharSequence;I)I

    move-result v6

    .line 247
    :cond_5
    const-string v0, "mot-zoom-step"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 248
    if-eqz v10, :cond_7

    .line 250
    :try_start_2
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 251
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v11

    double-to-int v13, v0

    .line 252
    const/4 v0, 0x1

    if-le v13, v0, :cond_6

    .line 253
    rem-int v0, v6, v13
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    sub-int v0, v6, v0

    move v6, v0

    .line 258
    :cond_6
    goto :goto_2

    .line 256
    :catch_2
    move-exception v11

    .line 257
    sget-object v0, Lo/edc;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception nfe = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    :cond_7
    :goto_2
    if-nez v7, :cond_8

    if-eqz v9, :cond_9

    .line 262
    :cond_8
    const-string v0, "zoom"

    int-to-double v1, v6

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    :cond_9
    if-eqz v8, :cond_a

    .line 266
    const-string v0, "taking-picture-zoom"

    invoke-virtual {p1, v0, v6}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    .line 268
    :cond_a
    return-void
.end method

.method private static b(Ljava/lang/CharSequence;I)I
    .locals 12

    .line 159
    const/4 v4, 0x0

    .line 160
    sget-object v0, Lo/edc;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    .line 161
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 164
    :try_start_0
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v9

    .line 168
    goto :goto_1

    .line 166
    :catch_0
    move-exception v11

    .line 167
    return v4

    .line 169
    :goto_1
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v9

    double-to-int v11, v0

    .line 170
    int-to-double v0, p1

    sub-double/2addr v0, v9

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    sub-int v2, p1, v4

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 171
    move v4, v11

    .line 160
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 174
    :cond_1
    return v4
.end method

.method private static c(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 5

    .line 91
    const-string v0, "preview-size-values"

    invoke-virtual {p0, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 93
    if-nez v3, :cond_0

    .line 94
    const-string v0, "preview-size-value"

    invoke-virtual {p0, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 97
    :cond_0
    const/4 v4, 0x0

    .line 99
    if-eqz v3, :cond_1

    .line 100
    invoke-static {v3, p1}, Lo/edc;->c(Ljava/lang/CharSequence;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v4

    .line 103
    :cond_1
    if-nez v4, :cond_2

    .line 105
    new-instance v4, Landroid/graphics/Point;

    iget v0, p1, Landroid/graphics/Point;->x:I

    shr-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x3

    iget v1, p1, Landroid/graphics/Point;->y:I

    shr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    invoke-direct {v4, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    .line 108
    :cond_2
    return-object v4
.end method

.method private static c(Ljava/lang/CharSequence;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 15

    .line 113
    const/4 v3, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    move-object/from16 v0, p1

    iget v0, v0, Landroid/graphics/Point;->x:I

    if-eqz v0, :cond_0

    move-object/from16 v0, p1

    iget v0, v0, Landroid/graphics/Point;->y:I

    if-eqz v0, :cond_0

    .line 118
    move-object/from16 v0, p1

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    move-object/from16 v1, p1

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    move-object/from16 v1, p1

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    move-object/from16 v2, p1

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    .line 119
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float v4, v0, v1

    .line 121
    :cond_0
    sget-object v0, Lo/edc;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_4

    aget-object v10, v7, v9

    .line 123
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 124
    const/16 v0, 0x78

    invoke-virtual {v10, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v11

    .line 125
    if-gez v11, :cond_1

    .line 126
    goto :goto_2

    .line 132
    :cond_1
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v10, v0, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v13

    .line 133
    add-int/lit8 v0, v11, 0x1

    invoke-virtual {v10, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v12

    .line 137
    goto :goto_1

    .line 135
    :catch_0
    move-exception v14

    .line 136
    goto :goto_2

    .line 139
    :goto_1
    invoke-static {v13, v12}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v13, v12}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float v14, v0, v1

    .line 140
    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-nez v0, :cond_2

    .line 141
    move v3, v14

    .line 142
    move v6, v12

    .line 143
    move v5, v13

    goto :goto_2

    .line 144
    :cond_2
    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-eqz v0, :cond_3

    sub-float v0, v14, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float v1, v3, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 145
    move v3, v14

    .line 146
    move v6, v12

    .line 147
    move v5, v13

    .line 121
    :cond_3
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 152
    :cond_4
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_5

    .line 153
    new-instance v0, Landroid/graphics/Point;

    float-to-int v1, v5

    float-to-int v2, v6

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    return-object v0

    .line 155
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method private e(Landroid/hardware/Camera$Parameters;)V
    .locals 2

    .line 183
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Behold II"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lo/edg;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 184
    const-string v0, "flash-value"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    goto :goto_0

    .line 187
    :cond_0
    const-string v0, "flash-value"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;I)V

    .line 190
    :goto_0
    const-string v0, "flash-mode"

    const-string v1, "off"

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lo/edc;->f:Ljava/lang/String;

    return-object v0
.end method

.method a(Landroid/hardware/Camera;)V
    .locals 3

    .line 72
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 73
    iget-object v0, p0, Lo/edc;->d:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lo/edc;->d:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 74
    invoke-direct {p0, v2}, Lo/edc;->e(Landroid/hardware/Camera$Parameters;)V

    .line 75
    invoke-direct {p0, v2}, Lo/edc;->a(Landroid/hardware/Camera$Parameters;)V

    .line 76
    const/16 v0, 0x5a

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 77
    invoke-virtual {p1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 78
    return-void
.end method

.method b()Landroid/graphics/Point;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/edc;->d:Landroid/graphics/Point;

    return-object v0
.end method

.method d()Landroid/graphics/Point;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/edc;->e:Landroid/graphics/Point;

    return-object v0
.end method

.method d(Landroid/hardware/Camera;Z)V
    .locals 6

    .line 195
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v4

    .line 196
    if-eqz p2, :cond_0

    .line 197
    const-string v0, "torch"

    invoke-virtual {v4, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    goto :goto_0

    .line 199
    :cond_0
    const-string v0, "off"

    invoke-virtual {v4, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 201
    :goto_0
    :try_start_0
    invoke-virtual {p1, v4}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    goto :goto_1

    .line 202
    :catch_0
    move-exception v5

    .line 203
    sget-object v0, Lo/edc;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    :goto_1
    return-void
.end method

.method e()I
    .locals 1

    .line 85
    iget v0, p0, Lo/edc;->h:I

    return v0
.end method

.method e(Landroid/hardware/Camera;)V
    .locals 7

    .line 43
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v3

    .line 44
    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v0

    iput v0, p0, Lo/edc;->h:I

    .line 45
    const-string v0, "preview-format"

    invoke-virtual {v3, v0}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/edc;->f:Ljava/lang/String;

    .line 46
    iget-object v0, p0, Lo/edc;->b:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 47
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v5

    .line 48
    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {v5}, Landroid/view/Display;->getWidth()I

    move-result v1

    invoke-virtual {v5}, Landroid/view/Display;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lo/edc;->e:Landroid/graphics/Point;

    .line 50
    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6}, Landroid/graphics/Point;-><init>()V

    .line 51
    iget-object v0, p0, Lo/edc;->e:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    iput v0, v6, Landroid/graphics/Point;->y:I

    .line 52
    iget-object v0, p0, Lo/edc;->e:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iput v0, v6, Landroid/graphics/Point;->x:I

    .line 55
    iget-object v0, p0, Lo/edc;->e:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lo/edc;->e:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    if-ge v0, v1, :cond_0

    .line 56
    iget-object v0, p0, Lo/edc;->e:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    iput v0, v6, Landroid/graphics/Point;->x:I

    .line 57
    iget-object v0, p0, Lo/edc;->e:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iput v0, v6, Landroid/graphics/Point;->y:I

    .line 60
    :cond_0
    invoke-static {v3, v6}, Lo/edc;->c(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lo/edc;->d:Landroid/graphics/Point;

    .line 61
    return-void
.end method

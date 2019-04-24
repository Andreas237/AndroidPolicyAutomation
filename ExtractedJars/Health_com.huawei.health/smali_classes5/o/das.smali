.class public Lo/das;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(Ljava/util/ArrayList;Landroid/graphics/Bitmap;)Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;Landroid/graphics/Bitmap;)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 29
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 30
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 33
    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 34
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v4, :cond_4

    .line 39
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    const/4 v10, 0x0

    :goto_1
    if-ge v10, v3, :cond_3

    .line 41
    move-object/from16 v0, p2

    invoke-virtual {v0, v10, v8}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    .line 42
    and-int/lit16 v0, v5, 0xff

    int-to-short v6, v0

    .line 43
    const/16 v0, 0x7f

    if-gt v6, v0, :cond_2

    .line 44
    const-string v0, "0"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 46
    :cond_2
    const-string v0, "1"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 49
    :cond_3
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 50
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 53
    :cond_4
    const/4 v8, 0x0

    :goto_3
    if-ge v8, v3, :cond_9

    .line 54
    const-string v9, ""

    .line 55
    div-int/lit8 v10, v4, 0x8

    .line 56
    rem-int/lit8 v11, v4, 0x8

    .line 58
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    const/4 v13, 0x0

    :goto_4
    if-ge v13, v4, :cond_5

    .line 60
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 62
    :cond_5
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 65
    if-nez v10, :cond_6

    .line 66
    const/4 v0, 0x2

    invoke-static {v9, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 67
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    goto/16 :goto_6

    .line 69
    :cond_6
    const/4 v13, 0x0

    .line 70
    const/4 v14, 0x0

    :goto_5
    if-ge v14, v10, :cond_7

    .line 71
    mul-int/lit8 v0, v14, 0x8

    add-int/lit8 v1, v14, 0x1

    mul-int/lit8 v1, v1, 0x8

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    .line 73
    const/4 v0, 0x2

    invoke-static {v13, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v15

    .line 75
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    .line 77
    :cond_7
    if-eqz v11, :cond_8

    .line 78
    const/4 v14, 0x0

    .line 79
    mul-int/lit8 v0, v10, 0x8

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "00000000"

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 84
    const/4 v0, 0x2

    invoke-static {v14, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v15

    .line 86
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_3

    .line 90
    :cond_9
    return-object p1
.end method


# virtual methods
.method public b(Landroid/graphics/Bitmap;)[B
    .locals 6

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-direct {p0, v1, p1}, Lo/das;->e(Ljava/util/ArrayList;Landroid/graphics/Bitmap;)Ljava/util/ArrayList;

    move-result-object v2

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 18
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v3, v0, [B

    .line 19
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 20
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 21
    int-to-byte v0, v5

    aput-byte v0, v3, v4

    .line 19
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 24
    :cond_0
    return-object v3
.end method

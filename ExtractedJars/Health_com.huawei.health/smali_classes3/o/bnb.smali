.class public Lo/bnb;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bnb$b;
    }
.end annotation


# static fields
.field private static final f:[Ljava/lang/String;

.field private static final h:[Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Z

.field private c:Landroid/widget/ListView;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bnb$b;>;"
        }
    .end annotation
.end field

.field private e:I

.field private g:Ljava/lang/String;

.field private i:[Ljava/lang/String;

.field private k:I

.field private l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private m:Landroid/graphics/Paint;

.field private n:I

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 69
    const/16 v0, 0x1b

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "#"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "A"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "B"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "C"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "D"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "E"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "F"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "G"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "H"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "I"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "J"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "K"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "L"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "M"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "N"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "O"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "P"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "Q"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "R"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "S"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "T"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "U"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "V"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "W"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "X"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "Y"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "Z"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sput-object v0, Lo/bnb;->f:[Ljava/lang/String;

    .line 76
    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "#"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "A"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "BCD"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "E"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "FGH"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "I"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "JK"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "L"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "MN"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "O"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "PQ"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "R"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "STU"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "V"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "WXY"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "Z"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lo/bnb;->h:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 114
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bnb;->d:Ljava/util/ArrayList;

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bnb;->b:Z

    .line 64
    const-string v0, "#"

    iput-object v0, p0, Lo/bnb;->g:Ljava/lang/String;

    .line 82
    sget-object v0, Lo/bnb;->f:[Ljava/lang/String;

    iput-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lo/bnb;->k:I

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lo/bnb;->n:I

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    .line 100
    const/16 v0, 0x14

    iput v0, p0, Lo/bnb;->o:I

    .line 105
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bnb;->l:Ljava/util/HashMap;

    .line 110
    const/4 v0, 0x0

    iput v0, p0, Lo/bnb;->p:I

    .line 115
    invoke-direct {p0, p1}, Lo/bnb;->e(Landroid/content/Context;)V

    .line 116
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 120
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bnb;->d:Ljava/util/ArrayList;

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bnb;->b:Z

    .line 64
    const-string v0, "#"

    iput-object v0, p0, Lo/bnb;->g:Ljava/lang/String;

    .line 82
    sget-object v0, Lo/bnb;->f:[Ljava/lang/String;

    iput-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lo/bnb;->k:I

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lo/bnb;->n:I

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    .line 100
    const/16 v0, 0x14

    iput v0, p0, Lo/bnb;->o:I

    .line 105
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bnb;->l:Ljava/util/HashMap;

    .line 110
    const/4 v0, 0x0

    iput v0, p0, Lo/bnb;->p:I

    .line 121
    invoke-direct {p0, p1}, Lo/bnb;->e(Landroid/content/Context;)V

    .line 122
    return-void
.end method

.method private a(ZLcom/huawei/health/sns/model/user/User;)Ljava/lang/String;
    .locals 1

    .line 631
    if-eqz p1, :cond_0

    .line 633
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getContactSortPinYin()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 637
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getSortPinYin()Ljava/lang/String;

    move-result-object v0

    .line 639
    :goto_0
    return-object v0
.end method

.method private a()V
    .locals 9

    .line 149
    invoke-virtual {p0}, Lo/bnb;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    .line 152
    invoke-virtual {p0}, Lo/bnb;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 154
    iget v0, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 157
    sget-object v0, Lo/bnb;->h:[Ljava/lang/String;

    iput-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    goto :goto_0

    .line 159
    :cond_0
    iget v0, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 162
    sget-object v0, Lo/bnb;->f:[Ljava/lang/String;

    iput-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    .line 167
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v5

    .line 168
    iget v0, v5, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v1, v5, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/bnb;->o:I

    .line 170
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v6, v0

    .line 172
    invoke-virtual {p0}, Lo/bnb;->getHeight()I

    move-result v0

    iget v1, p0, Lo/bnb;->k:I

    iget v2, p0, Lo/bnb;->n:I

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    iget v1, p0, Lo/bnb;->o:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    add-int/lit8 v1, v6, -0x1

    div-int/2addr v0, v1

    iput v0, p0, Lo/bnb;->e:I

    .line 175
    iget v0, p0, Lo/bnb;->o:I

    int-to-double v0, v0

    const-wide v2, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v0, v2

    double-to-int v7, v0

    .line 176
    iget v0, p0, Lo/bnb;->o:I

    add-int v8, v7, v0

    .line 179
    iget v0, p0, Lo/bnb;->e:I

    if-lt v8, v0, :cond_2

    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    sget-object v1, Lo/bnb;->h:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 182
    sget-object v0, Lo/bnb;->h:[Ljava/lang/String;

    iput-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    .line 183
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v6, v0

    .line 185
    invoke-virtual {p0}, Lo/bnb;->getHeight()I

    move-result v0

    iget v1, p0, Lo/bnb;->k:I

    iget v2, p0, Lo/bnb;->n:I

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    iget v1, p0, Lo/bnb;->o:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    add-int/lit8 v1, v6, -0x1

    div-int/2addr v0, v1

    iput v0, p0, Lo/bnb;->e:I

    .line 187
    iget v0, p0, Lo/bnb;->o:I

    iget v1, p0, Lo/bnb;->e:I

    if-lt v0, v1, :cond_2

    .line 189
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    .line 190
    const/4 v0, 0x0

    iput v0, p0, Lo/bnb;->e:I

    .line 193
    :cond_2
    return-void
.end method

.method private a(Ljava/util/List;Z)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    .line 507
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 509
    return-void

    .line 511
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 512
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 514
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v5

    .line 515
    const/4 v6, 0x0

    .line 516
    const/4 v7, 0x0

    .line 518
    const/4 v8, 0x0

    .line 520
    const/4 v9, 0x0

    .line 522
    const/4 v10, 0x0

    .line 524
    const/4 v11, 0x0

    .line 526
    const/4 v12, 0x0

    .line 528
    const/4 v13, 0x0

    .line 529
    const/4 v14, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    const/16 v16, 0x0

    .line 533
    :goto_0
    if-ge v7, v5, :cond_a

    .line 536
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 537
    const/4 v13, 0x0

    .line 539
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v1, v6}, Lo/bnb;->a(ZLcom/huawei/health/sns/model/user/User;)Ljava/lang/String;

    move-result-object v16

    .line 540
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 542
    move-object/from16 v0, v16

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    .line 544
    invoke-static {v8}, Lo/bnn;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 545
    invoke-static {v8}, Lo/bnn;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    .line 546
    :goto_1
    invoke-static {v8}, Lo/bnn;->c(Ljava/lang/String;)Z

    move-result v12

    .line 551
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 554
    const/4 v13, 0x0

    goto :goto_2

    .line 559
    :cond_4
    if-nez v11, :cond_5

    if-eqz v10, :cond_5

    .line 563
    const/4 v13, 0x1

    goto :goto_2

    .line 567
    :cond_5
    if-eqz v12, :cond_6

    .line 570
    const/4 v13, 0x1

    .line 575
    :cond_6
    :goto_2
    if-eqz v13, :cond_9

    .line 578
    move-object/from16 v0, p0

    iget v0, v0, Lo/bnb;->p:I

    add-int v17, v7, v0

    .line 579
    if-eqz v10, :cond_7

    .line 581
    const-string v15, "#"

    .line 582
    const/16 v17, 0x0

    goto :goto_3

    .line 584
    :cond_7
    if-eqz v12, :cond_8

    .line 586
    move-object v15, v8

    .line 594
    :cond_8
    :goto_3
    new-instance v14, Lo/bnb$b;

    move/from16 v0, v17

    invoke-direct {v14, v15, v0}, Lo/bnb$b;-><init>(Ljava/lang/String;I)V

    .line 595
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 596
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    :cond_9
    move-object v9, v8

    .line 601
    move v11, v10

    .line 533
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 606
    :cond_a
    move-object/from16 v0, p0

    iget v0, v0, Lo/bnb;->p:I

    if-lez v0, :cond_b

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_b

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bnb;->i:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 607
    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/bnb$b;

    iget-object v1, v1, Lo/bnb$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 609
    new-instance v14, Lo/bnb$b;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bnb;->i:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-direct {v14, v0, v1}, Lo/bnb$b;-><init>(Ljava/lang/String;I)V

    .line 610
    const/4 v0, 0x0

    invoke-virtual {v3, v0, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 611
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bnb;->i:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bnb;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 615
    move-object/from16 v0, p0

    iput-object v3, v0, Lo/bnb;->d:Ljava/util/ArrayList;

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bnb;->l:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 618
    move-object/from16 v0, p0

    iput-object v4, v0, Lo/bnb;->l:Ljava/util/HashMap;

    .line 619
    return-void
.end method

.method private b(I)I
    .locals 4

    .line 380
    iget v0, p0, Lo/bnb;->k:I

    sub-int v0, p1, v0

    iget v1, p0, Lo/bnb;->e:I

    iget v2, p0, Lo/bnb;->o:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lo/bnb;->e:I

    div-int v3, v0, v1

    .line 381
    if-gez v3, :cond_0

    .line 383
    const/4 v3, 0x0

    .line 385
    :cond_0
    return v3
.end method

.method private c()V
    .locals 3

    .line 139
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    .line 140
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 141
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 142
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 144
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/bnb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$dimen;->sns_fastsearch_zimu_size:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 145
    return-void
.end method

.method private e(F)I
    .locals 11

    .line 313
    iget v0, p0, Lo/bnb;->e:I

    if-nez v0, :cond_0

    .line 315
    const/4 v0, 0x0

    return v0

    .line 317
    :cond_0
    float-to-int v0, p1

    invoke-direct {p0, v0}, Lo/bnb;->b(I)I

    move-result v2

    .line 318
    const/16 v3, -0x64

    .line 319
    iget-object v0, p0, Lo/bnb;->c:Landroid/widget/ListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_7

    .line 321
    iget-object v0, p0, Lo/bnb;->d:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 323
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v0, v0

    if-lt v2, v0, :cond_1

    .line 325
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v2, v0, -0x1

    .line 327
    :cond_1
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lo/bnb;->a(Ljava/lang/String;)V

    .line 328
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v2

    iput-object v0, p0, Lo/bnb;->g:Ljava/lang/String;

    .line 330
    iget-object v0, p0, Lo/bnb;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestFocus()Z

    .line 331
    iget-object v0, p0, Lo/bnb;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 332
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_6

    .line 334
    iget-object v0, p0, Lo/bnb;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bnb$b;

    iget-object v0, v0, Lo/bnb$b;->b:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 336
    iget-object v0, p0, Lo/bnb;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bnb$b;

    iget v3, v0, Lo/bnb$b;->d:I

    .line 337
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 339
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 341
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 342
    invoke-static {v8}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-nez v0, :cond_2

    .line 345
    goto :goto_3

    .line 347
    :cond_2
    invoke-static {v7}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 349
    const/4 v9, 0x0

    .line 352
    const/4 v10, 0x0

    :goto_1
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v10, v0, :cond_4

    .line 354
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 355
    if-gt v8, v7, :cond_3

    .line 357
    const/4 v9, 0x1

    .line 358
    goto :goto_2

    .line 352
    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 361
    :cond_4
    :goto_2
    if-eqz v9, :cond_5

    .line 363
    goto :goto_3

    .line 332
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 370
    :cond_6
    :goto_3
    if-lez v3, :cond_7

    .line 372
    iget-object v0, p0, Lo/bnb;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v0

    add-int/2addr v3, v0

    .line 375
    :cond_7
    return v3
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 650
    invoke-static {p1}, Lo/bnn;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 652
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 656
    :cond_0
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 659
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object p1, v0, v1

    .line 663
    :cond_1
    :goto_0
    return-object p1
.end method

.method private e(Landroid/content/Context;)V
    .locals 1

    .line 127
    invoke-virtual {p0}, Lo/bnb;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lo/bnb;->k:I

    .line 128
    invoke-virtual {p0}, Lo/bnb;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lo/bnb;->n:I

    .line 130
    invoke-direct {p0}, Lo/bnb;->c()V

    .line 131
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 396
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 398
    return-void

    .line 400
    :cond_0
    invoke-direct {p0, p1}, Lo/bnb;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 403
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 405
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 408
    :cond_1
    iget-object v0, p0, Lo/bnb;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 409
    iget-object v0, p0, Lo/bnb;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 410
    return-void
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 7

    .line 202
    invoke-direct {p0}, Lo/bnb;->a()V

    .line 204
    invoke-virtual {p0}, Lo/bnb;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v2, v0, v1

    .line 205
    iget v0, p0, Lo/bnb;->k:I

    iget v1, p0, Lo/bnb;->o:I

    add-int/2addr v0, v1

    int-to-float v3, v0

    .line 207
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_3

    .line 209
    invoke-virtual {p0}, Lo/bnb;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 210
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v4

    iget-object v1, p0, Lo/bnb;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/bnb;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/bmo;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    .line 218
    :cond_0
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_ya_lan:I

    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 222
    :goto_1
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    goto :goto_2

    .line 226
    :cond_1
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 227
    iget-object v0, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    sget v1, Lcom/huawei/android/sns/R$color;->sns_black_60_percent:I

    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 231
    :goto_2
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 233
    iget-object v0, p0, Lo/bnb;->i:[Ljava/lang/String;

    aget-object v0, v0, v4

    iget-object v1, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 238
    :cond_2
    iget v0, p0, Lo/bnb;->o:I

    int-to-float v0, v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float v6, v0, v1

    .line 239
    sub-float v0, v3, v6

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v6, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lo/bnb;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0, v6, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 242
    :goto_3
    iget v0, p0, Lo/bnb;->e:I

    int-to-float v0, v0

    add-float/2addr v3, v0

    .line 207
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 244
    :cond_3
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 479
    invoke-direct {p0, p1}, Lo/bnb;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 481
    iget-object v0, p0, Lo/bnb;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bnb;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 483
    iput-object p1, p0, Lo/bnb;->g:Ljava/lang/String;

    .line 484
    invoke-virtual {p0}, Lo/bnb;->invalidate()V

    .line 486
    :cond_0
    return-void
.end method

.method public c(I)Z
    .locals 2

    .line 674
    iget-object v0, p0, Lo/bnb;->l:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public d()V
    .locals 2

    .line 418
    iget-object v0, p0, Lo/bnb;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bnb;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 420
    iget-object v0, p0, Lo/bnb;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 422
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 254
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 256
    invoke-virtual {p0, p1}, Lo/bnb;->b(Landroid/graphics/Canvas;)V

    .line 257
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 262
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 264
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lo/bnb;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_0

    .line 266
    iget-boolean v0, p0, Lo/bnb;->b:Z

    if-nez v0, :cond_1

    .line 268
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bnb;->b:Z

    .line 269
    invoke-virtual {p0}, Lo/bnb;->invalidate()V

    goto :goto_0

    .line 274
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bnb;->b:Z

    .line 275
    invoke-virtual {p0}, Lo/bnb;->invalidate()V

    .line 276
    invoke-virtual {p0}, Lo/bnb;->d()V

    .line 277
    const/4 v0, 0x1

    return v0

    .line 279
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 283
    :pswitch_0
    invoke-direct {p0, v2}, Lo/bnb;->e(F)I

    move-result v3

    .line 284
    if-ltz v3, :cond_2

    iget-object v0, p0, Lo/bnb;->c:Landroid/widget/ListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 287
    iget-object v0, p0, Lo/bnb;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setSelection(I)V

    .line 289
    :cond_2
    invoke-virtual {p0}, Lo/bnb;->invalidate()V

    .line 290
    goto :goto_1

    .line 293
    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bnb;->b:Z

    .line 294
    invoke-virtual {p0}, Lo/bnb;->invalidate()V

    .line 295
    invoke-virtual {p0}, Lo/bnb;->d()V

    .line 296
    .line 300
    :goto_1
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public setData(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    .line 496
    invoke-direct {p0, p1, p2}, Lo/bnb;->a(Ljava/util/List;Z)V

    .line 497
    return-void
.end method

.method public setOverlay(Landroid/widget/TextView;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lo/bnb;->a:Landroid/widget/TextView;

    .line 433
    return-void
.end method

.method public setSpecialItemCount(I)V
    .locals 0

    .line 684
    iput p1, p0, Lo/bnb;->p:I

    .line 685
    return-void
.end method

.method public setView(Landroid/widget/ListView;)V
    .locals 0

    .line 443
    iput-object p1, p0, Lo/bnb;->c:Landroid/widget/ListView;

    .line 444
    return-void
.end method

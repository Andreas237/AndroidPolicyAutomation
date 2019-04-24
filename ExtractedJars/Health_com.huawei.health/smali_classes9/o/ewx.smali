.class public Lo/ewx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ewx$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c(I)I
    .locals 2

    .line 78
    const/16 v0, 0x19

    if-ge p0, v0, :cond_0

    .line 79
    const/4 v0, -0x1

    return v0

    .line 80
    :cond_0
    rem-int/lit16 v0, p0, 0x12c

    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    rem-int/lit16 v0, p0, 0x12c

    const/16 v1, 0x113

    if-lt v0, v1, :cond_2

    .line 81
    :cond_1
    const/4 v0, 0x3

    return v0

    .line 82
    :cond_2
    rem-int/lit16 v0, p0, 0xfa

    const/16 v1, 0x19

    if-lt v0, v1, :cond_3

    rem-int/lit16 v0, p0, 0xfa

    const/16 v1, 0xe1

    if-lt v0, v1, :cond_4

    .line 83
    :cond_3
    const/4 v0, 0x2

    return v0

    .line 84
    :cond_4
    rem-int/lit16 v0, p0, 0x96

    const/16 v1, 0x19

    if-lt v0, v1, :cond_5

    rem-int/lit16 v0, p0, 0x96

    const/16 v1, 0x7d

    if-lt v0, v1, :cond_6

    .line 85
    :cond_5
    const/4 v0, 0x1

    return v0

    .line 87
    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;ILo/ewz;)Ljava/lang/CharSequence;
    .locals 21

    .line 36
    move/from16 v0, p1

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 37
    int-to-float v0, v8

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 38
    int-to-float v0, v8

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v10

    .line 39
    int-to-float v0, v8

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x437a0000    # 250.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v11

    .line 40
    int-to-float v0, v8

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43960000    # 300.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v12

    .line 41
    invoke-static {v8}, Lo/ewx;->c(I)I

    move-result v13

    .line 43
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    .line 44
    const/4 v0, -0x1

    if-ne v13, v0, :cond_1

    .line 45
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_0

    invoke-virtual/range {p2 .. p2}, Lo/ewz;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Lo/ewz;->a(I)V

    .line 48
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_have_step_less:I

    invoke-virtual {v14, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 50
    :cond_1
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_2

    invoke-virtual/range {p2 .. p2}, Lo/ewz;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    move-object/from16 v0, p2

    invoke-virtual {v0, v13}, Lo/ewz;->a(I)V

    .line 55
    :cond_2
    int-to-double v0, v8

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v15

    .line 56
    new-instance v0, Lo/ewx$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ewx$e;-><init>(Lo/ewx$2;)V

    move-object/from16 v16, v0

    .line 57
    move v0, v13

    move v1, v9

    move v2, v10

    move v3, v11

    move v4, v12

    move-object v5, v14

    move-object/from16 v6, v16

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v7}, Lo/ewx;->e(IIIIILandroid/content/res/Resources;Lo/ewx$e;Lo/ewz;)V

    .line 58
    move-object/from16 v0, v16

    iget-object v0, v0, Lo/ewx$e;->a:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 59
    if-eqz p2, :cond_3

    .line 60
    move-object/from16 v0, p2

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/ewz;->a(I)V

    .line 62
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_have_step_less:I

    invoke-virtual {v14, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 65
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_have_consumed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v15, v1, v2

    move-object/from16 v2, v16

    iget-object v2, v2, Lo/ewx$e;->d:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 66
    move-object/from16 v0, v16

    iget-object v0, v0, Lo/ewx$e;->d:Ljava/lang/String;

    move-object/from16 v1, v16

    iget-object v1, v1, Lo/ewx$e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    .line 67
    move/from16 v0, v18

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    .line 68
    return-object v17

    .line 70
    :cond_5
    new-instance v0, Landroid/text/SpannableString;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v19, v0

    .line 71
    move-object/from16 v0, v16

    iget-object v0, v0, Lo/ewx$e;->d:Ljava/lang/String;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int v20, v0, v18

    .line 72
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const-string v1, "#FB6522"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    move-object/from16 v1, v16

    iget-object v1, v1, Lo/ewx$e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int v1, v1, v20

    move-object/from16 v2, v19

    move/from16 v3, v20

    const/16 v4, 0x21

    invoke-virtual {v2, v0, v3, v1, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 73
    return-object v19
.end method

.method private static e(IIIIILandroid/content/res/Resources;Lo/ewx$e;Lo/ewz;)V
    .locals 5

    .line 93
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 95
    :pswitch_0
    move v4, p1

    .line 96
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->a:Ljava/lang/String;

    .line 97
    sget v0, Lcom/huawei/ui/main/R$plurals;->IDS_hw_common_ui_egg_string:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p6, Lo/ewx$e;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p5, v0, v4, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->d:Ljava/lang/String;

    .line 98
    goto/16 :goto_1

    .line 100
    :pswitch_1
    move v4, p2

    .line 101
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->a:Ljava/lang/String;

    .line 102
    sget v0, Lcom/huawei/ui/main/R$plurals;->IDS_hw_common_ui_icecream_string:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p6, Lo/ewx$e;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p5, v0, v4, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->d:Ljava/lang/String;

    .line 103
    goto :goto_1

    .line 105
    :pswitch_2
    move v4, p3

    .line 106
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->a:Ljava/lang/String;

    .line 107
    sget v0, Lcom/huawei/ui/main/R$plurals;->IDS_hw_common_ui_hamburger_string:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p6, Lo/ewx$e;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p5, v0, v4, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->d:Ljava/lang/String;

    .line 108
    goto :goto_1

    .line 110
    :pswitch_3
    move v4, p4

    .line 111
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->a:Ljava/lang/String;

    .line 112
    sget v0, Lcom/huawei/ui/main/R$plurals;->IDS_hw_common_ui_chicken_leg_string:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p6, Lo/ewx$e;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p5, v0, v4, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p6, Lo/ewx$e;->d:Ljava/lang/String;

    .line 113
    goto :goto_1

    .line 115
    :goto_0
    const-string v0, "SCUI_StepUnitUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong indexOfArray"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const/4 v4, 0x0

    .line 119
    :goto_1
    if-eqz p7, :cond_0

    .line 120
    invoke-virtual {p7, v4}, Lo/ewz;->e(I)V

    .line 123
    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

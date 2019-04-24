.class public Lo/ewr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ewr$c;,
        Lo/ewr$e;
    }
.end annotation


# instance fields
.field private a:Lo/eyi;

.field private b:Landroid/widget/TextView;

.field protected c:Landroid/os/Handler;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Lo/ewr$c;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lo/ewr$e;

    invoke-direct {v0, p0}, Lo/ewr$e;-><init>(Lo/ewr;)V

    iput-object v0, p0, Lo/ewr;->c:Landroid/os/Handler;

    .line 48
    iput-object p1, p0, Lo/ewr;->d:Landroid/content/Context;

    .line 50
    return-void
.end method

.method static synthetic b(Lo/ewr;Ljava/util/List;)Lo/ews;
    .locals 1

    .line 27
    invoke-direct {p0, p1}, Lo/ewr;->e(Ljava/util/List;)Lo/ews;

    move-result-object v0

    return-object v0
.end method

.method private b(Lo/ews;)V
    .locals 25

    .line 82
    const-wide/16 v7, 0x0

    .line 83
    const-wide/16 v9, 0x0

    .line 84
    const-wide/16 v11, 0x0

    .line 86
    const-wide/16 v13, 0x0

    .line 87
    const-wide/16 v15, 0x0

    .line 88
    const-wide/16 v17, 0x0

    .line 89
    const-wide/16 v19, 0x0

    .line 90
    const-wide/16 v21, 0x0

    .line 91
    if-nez p1, :cond_0

    .line 92
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->e:Landroid/widget/TextView;

    move-object/from16 v1, p0

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->b:Landroid/widget/TextView;

    move-object/from16 v1, p0

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->h:Landroid/widget/TextView;

    move-object/from16 v1, p0

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->k:Landroid/widget/TextView;

    move-object/from16 v1, p0

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->f:Landroid/widget/TextView;

    move-object/from16 v1, p0

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 99
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lo/ews;->g()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lo/ews;->f()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lo/ews;->k()I

    move-result v1

    add-int/2addr v0, v1

    int-to-double v11, v0

    .line 100
    invoke-virtual/range {p1 .. p1}, Lo/ews;->d()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lo/ews;->e()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lo/ews;->a()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual/range {p1 .. p1}, Lo/ews;->c()I

    move-result v1

    add-int/2addr v0, v1

    int-to-double v0, v0

    add-double v7, v0, v11

    .line 101
    const-string v0, "MiddleAndHighStrengthDa"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, sumData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo/ews;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  sumData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-virtual/range {p1 .. p1}, Lo/ews;->b()I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v0, v7

    if-lez v0, :cond_1

    .line 107
    invoke-virtual/range {p1 .. p1}, Lo/ews;->b()I

    move-result v0

    int-to-double v0, v0

    sub-double v9, v0, v7

    .line 108
    invoke-virtual/range {p1 .. p1}, Lo/ews;->b()I

    move-result v0

    int-to-double v7, v0

    .line 110
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lo/ews;->e()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v13, v0

    .line 112
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v13, v0

    if-gez v0, :cond_2

    invoke-virtual/range {p1 .. p1}, Lo/ews;->e()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 113
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 116
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lo/ews;->d()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v15, v0

    .line 117
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v15, v0

    if-gez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lo/ews;->d()I

    move-result v0

    if-lez v0, :cond_3

    .line 118
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 121
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lo/ews;->c()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v17, v2

    .line 122
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v17, v0

    if-gez v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lo/ews;->c()I

    move-result v0

    if-lez v0, :cond_4

    .line 123
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 126
    :cond_4
    add-double v0, v11, v9

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v21, v2

    .line 127
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v21, v0

    if-gez v0, :cond_5

    add-double v0, v11, v9

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_5

    .line 128
    const-wide/high16 v21, 0x3ff0000000000000L    # 1.0

    .line 131
    :cond_5
    const-string v0, "MiddleAndHighStrengthDa"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, per_cent run = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ride = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " fitness = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "convergenceData ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " other = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v21

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    add-double v0, v13, v15

    add-double v0, v0, v17

    add-double v0, v0, v21

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_9

    .line 136
    add-double v0, v13, v15

    add-double v0, v0, v17

    add-double v0, v0, v21

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    sub-double v23, v0, v2

    .line 137
    cmpl-double v0, v13, v15

    if-ltz v0, :cond_6

    cmpl-double v0, v13, v17

    if-ltz v0, :cond_6

    cmpl-double v0, v13, v21

    if-ltz v0, :cond_6

    .line 138
    sub-double v13, v13, v23

    goto :goto_0

    .line 139
    :cond_6
    cmpl-double v0, v17, v13

    if-ltz v0, :cond_7

    cmpl-double v0, v17, v15

    if-ltz v0, :cond_7

    cmpl-double v0, v17, v21

    if-ltz v0, :cond_7

    .line 140
    sub-double v17, v17, v23

    goto :goto_0

    .line 141
    :cond_7
    cmpl-double v0, v15, v13

    if-ltz v0, :cond_8

    cmpl-double v0, v15, v17

    if-ltz v0, :cond_8

    cmpl-double v0, v15, v21

    if-ltz v0, :cond_8

    .line 142
    sub-double v15, v15, v23

    goto :goto_0

    .line 143
    :cond_8
    cmpl-double v0, v21, v13

    if-ltz v0, :cond_9

    cmpl-double v0, v21, v15

    if-ltz v0, :cond_9

    cmpl-double v0, v21, v17

    if-ltz v0, :cond_9

    .line 144
    sub-double v21, v21, v23

    .line 148
    :cond_9
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lo/ews;->a()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v7

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v2, v0

    move-wide/from16 v19, v2

    .line 149
    invoke-virtual/range {p1 .. p1}, Lo/ews;->a()I

    move-result v0

    if-lez v0, :cond_a

    invoke-virtual/range {p1 .. p1}, Lo/ews;->b()I

    move-result v0

    if-lez v0, :cond_a

    .line 150
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    sub-double/2addr v0, v13

    sub-double/2addr v0, v15

    sub-double v0, v0, v17

    sub-double v19, v0, v21

    .line 152
    :cond_a
    const-wide/16 v0, 0x0

    cmpg-double v0, v19, v0

    if-gez v0, :cond_b

    .line 153
    const-wide/16 v19, 0x0

    .line 155
    :cond_b
    const-string v0, "MiddleAndHighStrengthDa"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBottomTVs, per_cent walk ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v19

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  run = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ride = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " fitness = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " other = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, v21

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->e:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v19

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->b:Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v1, v13, v14}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->h:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide v2, v15

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->k:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v17

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->f:Landroid/widget/TextView;

    move-object/from16 v1, p0

    move-wide/from16 v2, v21

    invoke-direct {v1, v2, v3}, Lo/ewr;->e(D)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->a:Lo/eyi;

    mul-double v1, v7, v13

    double-to-float v1, v1

    mul-double v2, v7, v19

    double-to-float v2, v2

    mul-double v3, v7, v15

    double-to-float v3, v3

    mul-double v4, v7, v17

    double-to-float v4, v4

    mul-double v5, v7, v21

    double-to-float v5, v5

    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setViewData(FFFFF)V

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ewr;->a:Lo/eyi;

    invoke-virtual {v0}, Lo/eyi;->invalidate()V

    .line 173
    return-void
.end method

.method private d(IIIII)V
    .locals 1

    .line 201
    iget-object v0, p0, Lo/ewr;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 202
    iget-object v0, p0, Lo/ewr;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 203
    iget-object v0, p0, Lo/ewr;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 204
    iget-object v0, p0, Lo/ewr;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 205
    iget-object v0, p0, Lo/ewr;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 207
    return-void
.end method

.method static synthetic d(Lo/ewr;Lo/ews;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/ewr;->b(Lo/ews;)V

    return-void
.end method

.method private e(D)Landroid/text/SpannableString;
    .locals 6

    .line 258
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 259
    iget-object v0, p0, Lo/ewr;->d:Landroid/content/Context;

    const-string v1, "[\\d]"

    sget v2, Lcom/huawei/ui/main/R$style;->fitness_detail_data_percent_number_style_num:I

    sget v3, Lcom/huawei/ui/main/R$style;->fitness_detail_data_percent_number_style_sign:I

    invoke-static {v0, v1, v4, v2, v3}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v5

    .line 261
    return-object v5
.end method

.method private e(Ljava/util/List;)Lo/ews;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ews;>;)Lo/ews;"
        }
    .end annotation

    .line 265
    const-string v0, "MiddleAndHighStrengthDa"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ews;

    .line 269
    const-string v0, "MiddleAndHighStrengthDa"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "intensity"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/ews;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-object v4

    .line 272
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 7

    .line 177
    sget v0, Lcom/huawei/ui/main/R$id;->total_data_tv_bg:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyi;

    iput-object v0, p0, Lo/ewr;->a:Lo/eyi;

    .line 178
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_run_time_data:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ewr;->b:Landroid/widget/TextView;

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_walk_time_data:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ewr;->e:Landroid/widget/TextView;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_ride_time_data:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ewr;->h:Landroid/widget/TextView;

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_train_time_data:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ewr;->k:Landroid/widget/TextView;

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_total_other_time_data:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ewr;->f:Landroid/widget/TextView;

    .line 185
    move-object v0, p0

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 186
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 187
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 188
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 189
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 185
    invoke-direct/range {v0 .. v5}, Lo/ewr;->d(IIIII)V

    .line 191
    iget-object v0, p0, Lo/ewr;->a:Lo/eyi;

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 192
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 193
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 194
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 195
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_time_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 191
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 196
    return-void
.end method

.method public c(JJI)V
    .locals 7

    .line 211
    const-string v0, "MiddleAndHighStrengthDa"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTotalDatasByType , startTime   "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,endTime  "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,type  "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lo/ewr;->i:Lo/ewr$c;

    if-nez v0, :cond_0

    .line 215
    new-instance v0, Lo/ewr$c;

    invoke-direct {v0, p0}, Lo/ewr$c;-><init>(Lo/ewr;)V

    iput-object v0, p0, Lo/ewr;->i:Lo/ewr$c;

    .line 217
    :cond_0
    invoke-static {}, Lo/ewt;->c()Lo/ewt;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    iget-object v6, p0, Lo/ewr;->i:Lo/ewr$c;

    invoke-virtual/range {v0 .. v6}, Lo/ewt;->b(JJILo/ewr$c;)V

    .line 218
    return-void
.end method

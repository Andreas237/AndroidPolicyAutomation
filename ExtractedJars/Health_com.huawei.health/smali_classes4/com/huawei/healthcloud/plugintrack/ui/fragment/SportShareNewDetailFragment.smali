.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# static fields
.field private static final b:[Ljava/lang/String;


# instance fields
.field private a:Landroid/view/View;

.field private c:Landroid/widget/ImageView;

.field private d:Lo/cht;

.field private e:Landroid/content/Context;

.field private f:Lo/cgt;

.field private g:Lo/egb;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation
.end field

.field private i:Landroid/widget/FrameLayout;

.field private k:Lo/egb;

.field private l:F

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dam;>;"
        }
    .end annotation
.end field

.field private u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 69
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "share/track_share_0.jpg"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "share/track_share_1.jpg"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "share/track_share_2.jpg"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "share/track_share_3.jpg"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "share/track_share_4.jpg"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->n:Z

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->m:Ljava/util/ArrayList;

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 10

    .line 422
    if-nez p1, :cond_0

    .line 423
    const/4 v0, 0x0

    return-object v0

    .line 426
    :cond_0
    const/4 v4, 0x0

    .line 427
    const/4 v5, 0x0

    .line 428
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    .line 430
    :try_start_0
    invoke-virtual {v6, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 431
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 436
    if-eqz v5, :cond_1

    .line 437
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 441
    :cond_1
    goto :goto_1

    .line 439
    :catch_0
    move-exception v7

    .line 440
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    goto :goto_1

    .line 432
    :catch_1
    move-exception v7

    .line 433
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 436
    if-eqz v5, :cond_2

    .line 437
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 441
    :cond_2
    goto :goto_1

    .line 439
    :catch_2
    move-exception v7

    .line 440
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    goto :goto_1

    .line 435
    :catchall_0
    move-exception v8

    .line 436
    if-eqz v5, :cond_3

    .line 437
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 441
    :cond_3
    goto :goto_0

    .line 439
    :catch_3
    move-exception v9

    .line 440
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    :goto_0
    throw v8

    .line 443
    :goto_1
    return-object v4
.end method

.method private a()V
    .locals 26

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->f:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-nez v0, :cond_0

    .line 110
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simplify is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-void

    .line 113
    :cond_0
    new-instance v0, Ljava/util/Date;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x15

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->u:Ljava/lang/String;

    .line 114
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->g:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 116
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v8

    .line 118
    if-lez v8, :cond_1

    .line 119
    invoke-static {v8}, Lo/cgl;->b(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 121
    :cond_1
    const-string v9, "--"

    .line 123
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    long-to-int v0, v0

    div-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 124
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalSteps()I

    move-result v11

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v12, v0, v2

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v14

    .line 127
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 128
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 129
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e(F)F

    move-result v14

    .line 131
    const/4 v0, 0x3

    invoke-static {v12, v13, v0}, Lo/cxh;->a(DI)D

    move-result-wide v12

    .line 132
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 133
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 137
    :cond_2
    const/16 v18, 0x0

    .line 138
    const/4 v0, 0x0

    cmpl-float v0, v14, v0

    if-lez v0, :cond_9

    .line 139
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 140
    invoke-static {v14}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v17

    .line 141
    const/16 v18, 0x1

    goto/16 :goto_3

    .line 142
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 143
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_8

    .line 144
    :cond_4
    const/high16 v0, 0x41200000    # 10.0f

    div-float v19, v14, v0

    .line 145
    move/from16 v0, v19

    float-to-double v0, v0

    const-wide v2, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_5

    move/from16 v0, v19

    float-to-double v0, v0

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_6

    .line 146
    :cond_5
    const-string v17, "--"

    goto :goto_2

    .line 149
    :cond_6
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 150
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    goto :goto_1

    .line 152
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    .line 154
    :goto_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-static/range {v19 .. v19}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    move-object/from16 v21, v0

    .line 155
    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 156
    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v17

    .line 158
    :goto_2
    const/16 v18, 0x0

    .line 159
    goto :goto_3

    .line 160
    :cond_8
    invoke-static {v14}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v17

    .line 161
    const/16 v18, 0x0

    goto :goto_3

    .line 165
    :cond_9
    const-string v17, "--"

    .line 169
    :goto_3
    const-wide/16 v0, 0x0

    cmpl-double v0, v12, v0

    if-lez v0, :cond_a

    .line 170
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v12, v13, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v19

    goto :goto_4

    .line 172
    :cond_a
    const-string v19, "--"

    .line 176
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_b

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 177
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_d

    .line 178
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v12, v0

    .line 179
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 180
    const/4 v0, 0x2

    invoke-static {v12, v13, v0}, Lo/cxh;->a(DI)D

    move-result-wide v12

    .line 181
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v15

    goto :goto_5

    .line 183
    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 185
    :goto_5
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v12, v13, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v19

    .line 186
    const-wide/16 v0, 0x0

    cmpg-double v0, v12, v0

    if-gtz v0, :cond_d

    .line 187
    const-string v19, "--"

    .line 193
    :cond_d
    move-object/from16 v20, v15

    .line 194
    move-object/from16 v21, v16

    .line 196
    const-wide/16 v0, 0x0

    cmpl-double v0, v12, v0

    if-lez v0, :cond_f

    .line 197
    new-instance v0, Lo/cia;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cia;-><init>(Landroid/content/Context;)V

    move-object/from16 v22, v0

    .line 198
    new-instance v0, Lo/cia;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cia;-><init>(Landroid/content/Context;)V

    move-object/from16 v23, v0

    .line 199
    move-object/from16 v0, v22

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v17

    move-object/from16 v6, v21

    move/from16 v7, v18

    invoke-virtual/range {v0 .. v7}, Lo/cia;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 200
    move-object/from16 v0, v23

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v17

    move-object/from16 v6, v21

    move/from16 v7, v18

    invoke-virtual/range {v0 .. v7}, Lo/cia;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 201
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->n:Z

    if-eqz v0, :cond_e

    .line 202
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->l:F

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lo/cia;->c(F)V

    .line 203
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->l:F

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lo/cia;->c(F)V

    .line 205
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->i:Landroid/widget/FrameLayout;

    invoke-virtual/range {v22 .. v22}, Lo/cia;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 207
    goto :goto_6

    .line 208
    :cond_f
    new-instance v0, Lo/cic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cic;-><init>(Landroid/content/Context;)V

    move-object/from16 v22, v0

    .line 209
    move-object/from16 v0, v22

    invoke-virtual {v0, v9, v10}, Lo/cic;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->i:Landroid/widget/FrameLayout;

    invoke-virtual/range {v22 .. v22}, Lo/cic;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 212
    :goto_6
    new-instance v0, Lo/cic;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cic;-><init>(Landroid/content/Context;)V

    move-object/from16 v22, v0

    .line 213
    move-object/from16 v0, v22

    invoke-virtual {v0, v9, v10}, Lo/cic;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    if-lez v11, :cond_11

    .line 216
    new-instance v0, Lo/chy;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/chy;-><init>(Landroid/content/Context;)V

    move-object/from16 v23, v0

    .line 217
    new-instance v0, Lo/cif;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cif;-><init>(Landroid/content/Context;)V

    move-object/from16 v24, v0

    .line 218
    int-to-double v0, v11

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v25

    .line 219
    move-object/from16 v0, v23

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v25

    invoke-virtual/range {v0 .. v5}, Lo/chy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    move-object/from16 v0, v24

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v25

    invoke-virtual/range {v0 .. v5}, Lo/cif;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->n:Z

    if-eqz v0, :cond_10

    .line 222
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->l:F

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lo/chy;->a(F)V

    .line 223
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->l:F

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cif;->b(F)V

    .line 225
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    :cond_11
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->h:Ljava/util/List;

    if-eqz v0, :cond_12

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    const-wide/16 v0, 0x0

    cmpl-double v0, v12, v0

    if-lez v0, :cond_12

    .line 230
    new-instance v0, Lo/cib;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cib;-><init>(Landroid/content/Context;)V

    move-object/from16 v23, v0

    .line 231
    new-instance v0, Lo/cih;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cih;-><init>(Landroid/content/Context;)V

    move-object/from16 v24, v0

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->h:Ljava/util/List;

    move-object/from16 v1, v23

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    invoke-virtual {v1, v2, v3, v0}, Lo/cib;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->h:Ljava/util/List;

    move-object/from16 v1, v24

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    invoke-virtual {v1, v2, v3, v0}, Lo/cih;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    :cond_12
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v23, v0, v1

    .line 239
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->m:Ljava/util/ArrayList;

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 240
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->c:Landroid/widget/ImageView;

    move-object/from16 v1, p0

    move-object/from16 v2, v23

    invoke-direct {v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 241
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->i()V

    return-void
.end method

.method private c()V
    .locals 7

    .line 298
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->f:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v2

    .line 299
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->f:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v3

    .line 301
    const/16 v0, 0x2e

    if-ne v2, v0, :cond_0

    .line 302
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_huaweiwatch_1:I

    goto :goto_1

    .line 303
    :cond_0
    const/16 v0, 0x29

    if-ne v2, v0, :cond_1

    .line 304
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_ertongwatch:I

    goto :goto_1

    .line 306
    :cond_1
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 309
    :pswitch_0
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_hshouhuan:I

    .line 310
    goto :goto_1

    .line 312
    :pswitch_1
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_ertongwatch:I

    .line 313
    goto :goto_1

    .line 315
    :pswitch_2
    sget v4, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_short_ic_erji:I

    .line 316
    goto :goto_1

    .line 318
    :goto_0
    const/4 v4, 0x0

    .line 323
    :goto_1
    if-nez v4, :cond_2

    .line 324
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_short_device_info:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 326
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_share_appname:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/egb;

    .line 327
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_short_logo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 328
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lo/cdo;->c(ILandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 329
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 331
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d()V
    .locals 10

    .line 254
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 255
    invoke-virtual {v4}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 256
    const/4 v6, 0x0

    .line 257
    if-eqz v5, :cond_0

    .line 258
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v6

    .line 260
    :cond_0
    if-eqz v6, :cond_1

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 261
    :cond_1
    new-instance v7, Lcom/huawei/up/api/UpApi;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 262
    invoke-virtual {v7}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v8

    .line 263
    move-object v6, v8

    .line 264
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 265
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->k:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    goto :goto_0

    .line 267
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->k:Lo/egb;

    invoke-virtual {v0, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 269
    :goto_0
    goto :goto_1

    .line 270
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->k:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 273
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_short_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 274
    const/4 v8, 0x0

    .line 275
    if-eqz v5, :cond_4

    .line 276
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v8

    .line 278
    :cond_4
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 279
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 280
    if-eqz v9, :cond_5

    .line 281
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 283
    :cond_5
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()bmp != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    :goto_2
    goto :goto_3

    .line 286
    :cond_6
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    :goto_3
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 290
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 291
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 293
    :cond_7
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_short_qrcode:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 295
    :cond_8
    return-void
.end method

.method private e(F)F
    .locals 3

    .line 244
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 245
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_1

    .line 246
    :cond_0
    float-to-double v0, p1

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float p1, v0

    goto :goto_0

    .line 248
    :cond_1
    float-to-double v0, p1

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float p1, v0

    .line 250
    :goto_0
    return p1
.end method

.method private e()V
    .locals 24

    .line 338
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 339
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_new_detail:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/cht;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_new_background:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->c:Landroid/widget/ImageView;

    .line 341
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_usrname:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->k:Lo/egb;

    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_formal_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->g:Lo/egb;

    .line 343
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_new_bottom:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->i:Landroid/widget/FrameLayout;

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 345
    new-instance v6, Landroid/util/DisplayMetrics;

    invoke-direct {v6}, Landroid/util/DisplayMetrics;-><init>()V

    .line 346
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 347
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 348
    int-to-float v0, v7

    iget v1, v6, Landroid/util/DisplayMetrics;->density:F

    div-float v8, v0, v1

    .line 349
    const v0, 0x43b18000    # 355.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_0

    .line 350
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->n:Z

    .line 351
    const/high16 v0, 0x43b40000    # 360.0f

    div-float v0, v8, v0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->l:F

    .line 354
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    const/high16 v1, 0x437a0000    # 250.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v12

    .line 355
    if-eqz v4, :cond_1

    .line 356
    const-string v0, "allDataWidth"

    invoke-virtual {v4, v0, v12}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    .line 357
    const-string v0, "allDataHeight"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    goto :goto_0

    .line 359
    :cond_1
    move v9, v12

    .line 360
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v11

    .line 363
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 364
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    int-to-float v1, v7

    invoke-virtual {v0, v1}, Lo/cht;->setPivotX(F)V

    .line 365
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cht;->setPivotY(F)V

    .line 366
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_new_arrow:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 368
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cht;->setPivotX(F)V

    .line 369
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cht;->setPivotY(F)V

    .line 371
    :goto_1
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker;->isEnable()Z

    move-result v13

    .line 372
    invoke-static {}, Lo/dbf;->d()Z

    move-result v14

    .line 373
    if-eqz v13, :cond_3

    if-eqz v14, :cond_3

    const/4 v15, 0x1

    goto :goto_2

    :cond_3
    const/4 v15, 0x0

    .line 374
    :goto_2
    const-string v0, "Track_SportShareNewDetailFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwColorPicker isEnable "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , isEmui "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    int-to-float v0, v9

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v7

    div-float v16, v0, v1

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    add-int v17, v7, v0

    .line 377
    move/from16 v0, v17

    int-to-float v0, v0

    mul-float v0, v0, v16

    float-to-int v10, v0

    .line 378
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_all_white:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v18

    .line 379
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v19

    .line 380
    sub-int v0, v11, v10

    if-eqz v15, :cond_4

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    const/high16 v2, 0x42080000    # 34.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    sub-int v20, v0, v1

    .line 381
    move/from16 v0, v20

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, v19

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 382
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 383
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_new_detail_position:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v21

    .line 384
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v22

    .line 385
    move-object/from16 v0, v22

    iput v10, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 386
    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 387
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/cht;->setScaleX(F)V

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/cht;->setScaleY(F)V

    .line 389
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_new_edit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    .line 390
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;)V

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    if-nez v15, :cond_5

    .line 397
    move-object/from16 v0, v23

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 399
    :cond_5
    return-void
.end method

.method private i()V
    .locals 6

    .line 402
    new-instance v4, Lo/dau;

    invoke-direct {v4}, Lo/dau;-><init>()V

    .line 403
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->m:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Lo/dau;->d(Ljava/util/List;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->p:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Lo/dau;->a(Ljava/util/ArrayList;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-eqz v0, :cond_1

    .line 406
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/dau;->e(I)V

    .line 407
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/dau;->d(I)V

    .line 408
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->o:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v5

    .line 409
    const/16 v0, 0x108

    if-eq v5, v0, :cond_0

    const/16 v0, 0x102

    if-ne v5, v0, :cond_1

    .line 410
    :cond_0
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Lo/dau;->b(I)V

    .line 413
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->u:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/dau;->e(Ljava/lang/String;)V

    .line 414
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/djl;->e(Landroid/content/Context;Lo/dau;)V

    .line 416
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 417
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    sget-object v2, Lo/dae;->hW:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 419
    return-void
.end method


# virtual methods
.method public b()Landroid/view/View;
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d:Lo/cht;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 86
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    .line 87
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_new:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    .line 89
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v2

    .line 90
    invoke-virtual {v2}, Lo/cfa;->c()Lo/cgt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->f:Lo/cgt;

    .line 91
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->f:Lo/cgt;

    if-nez v0, :cond_0

    .line 92
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 94
    :cond_0
    invoke-virtual {v2}, Lo/cfa;->g()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->h:Ljava/util/List;

    .line 95
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->e()V

    .line 96
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->c()V

    .line 97
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->d()V

    .line 98
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a()V

    .line 99
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->a:Landroid/view/View;

    return-object v0
.end method

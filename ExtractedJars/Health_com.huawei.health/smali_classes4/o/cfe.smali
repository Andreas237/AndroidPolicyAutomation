.class public abstract Lo/cfe;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cfe$c;,
        Lo/cfe$e;,
        Lo/cfe$a;
    }
.end annotation


# static fields
.field private static b:Lo/cfe;


# instance fields
.field private a:Landroid/content/Context;

.field private c:Lo/cfe$a;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfe$e;>;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const/4 v0, 0x0

    sput-object v0, Lo/cfe;->b:Lo/cfe;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const/4 v0, 0x0

    iput v0, p0, Lo/cfe;->e:I

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 397
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    .line 406
    new-instance v0, Lo/cfe$a;

    invoke-direct {v0}, Lo/cfe$a;-><init>()V

    iput-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    .line 83
    iput-object p1, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 84
    invoke-direct {p0}, Lo/cfe;->G()V

    .line 85
    return-void
.end method

.method private G()V
    .locals 2

    .line 88
    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 90
    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    sget-object v1, Lo/cfe$e;->c:Lo/cfe$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    sget-object v1, Lo/cfe$e;->d:Lo/cfe$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    sget-object v1, Lo/cfe$e;->a:Lo/cfe$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    sget-object v1, Lo/cfe$e;->b:Lo/cfe$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    return-void
.end method

.method private a(IIZ)Lo/cfe$c;
    .locals 4

    .line 916
    const/4 v0, 0x3

    invoke-direct {p0, p1, p2, v0}, Lo/cfe;->d(III)I

    move-result v2

    .line 917
    const/4 v0, 0x5

    invoke-direct {p0, p1, p2, v0}, Lo/cfe;->d(III)I

    move-result v3

    .line 918
    if-eqz p3, :cond_0

    .line 920
    new-instance v0, Lo/cfe$c;

    const/4 v1, 0x3

    invoke-direct {v0, v3, v1}, Lo/cfe$c;-><init>(II)V

    return-object v0

    .line 923
    :cond_0
    sub-int v0, p1, p2

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 925
    new-instance v0, Lo/cfe$c;

    const/4 v1, 0x5

    invoke-direct {v0, v3, v1}, Lo/cfe$c;-><init>(II)V

    return-object v0

    .line 928
    :cond_1
    if-gt v3, v2, :cond_2

    .line 929
    new-instance v0, Lo/cfe$c;

    const/4 v1, 0x5

    invoke-direct {v0, v3, v1}, Lo/cfe$c;-><init>(II)V

    return-object v0

    .line 931
    :cond_2
    new-instance v0, Lo/cfe$c;

    const/4 v1, 0x3

    invoke-direct {v0, v3, v1}, Lo/cfe$c;-><init>(II)V

    return-object v0
.end method

.method private a(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;
    .locals 15

    .line 162
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHeartRateDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 164
    invoke-virtual {p0}, Lo/cfe;->b()Ljava/util/ArrayList;

    move-result-object v9

    .line 165
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 166
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHeartRate heartRateList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x0

    return-object v0

    .line 170
    :cond_1
    const/high16 v10, -0x80000000

    .line 171
    const v11, 0x7fffffff

    .line 173
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cev;

    .line 176
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cev;->e()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {v13}, Lo/cev;->c()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 178
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    invoke-virtual {v13}, Lo/cev;->c()I

    move-result v0

    if-le v0, v10, :cond_2

    .line 180
    invoke-virtual {v13}, Lo/cev;->c()I

    move-result v10

    .line 182
    :cond_2
    invoke-virtual {v13}, Lo/cev;->c()I

    move-result v0

    if-ge v0, v11, :cond_3

    .line 183
    invoke-virtual {v13}, Lo/cev;->c()I

    move-result v11

    .line 185
    :cond_3
    goto :goto_0

    .line 187
    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_5

    .line 190
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 197
    :cond_5
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    iget-object v3, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 198
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 199
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_heartrate_with_uint:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 200
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 201
    invoke-virtual {p0}, Lo/cfe;->d()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 203
    invoke-virtual {p0}, Lo/cfe;->a()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 204
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireHeartRateDataSumTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/cfe;->a()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    invoke-virtual {p0}, Lo/cfe;->a()F

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->h(F)V

    goto :goto_1

    .line 208
    :cond_6
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifySumTimeAutoByData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    invoke-virtual {v12}, Lo/elb;->aq()V

    .line 212
    :goto_1
    const/16 v0, 0xff

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 213
    const/16 v0, 0xe5

    const/16 v1, 0xd5

    const/16 v2, 0x46

    const/16 v3, 0x5e

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->h(I)V

    .line 219
    const/16 v0, 0x7f

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xfc

    const/16 v3, 0x31

    const/16 v4, 0x59

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 222
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHeartRateDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_7

    .line 224
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    int-to-float v4, v10

    int-to-float v5, v11

    move-object/from16 v6, p3

    iget-boolean v6, v6, Lo/cfe$a;->b:Z

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 236
    :cond_7
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_8

    .line 237
    const/16 v0, 0x7f

    const/16 v1, 0xfc

    const/16 v2, 0x31

    const/16 v3, 0x59

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xfc

    const/16 v3, 0x31

    const/16 v4, 0x59

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 241
    :cond_8
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_9

    .line 242
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 243
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_2

    .line 245
    :cond_9
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 246
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 248
    :goto_2
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_a

    .line 249
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 250
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 251
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 252
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 253
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_3

    .line 255
    :cond_a
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 256
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 257
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 258
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 260
    :goto_3
    invoke-direct {p0, v12}, Lo/cfe;->d(Lo/elb;)V

    .line 262
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/emi;

    if-nez v0, :cond_b

    .line 263
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "plugin track module use chart not instance of track line chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 265
    :cond_b
    new-instance v0, Lo/emh;

    invoke-direct {v0}, Lo/emh;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Lo/emi;

    invoke-virtual {v0, v1, v12}, Lo/emh;->a(Lo/emi;Lo/elb;)V

    .line 267
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 268
    return-object v12
.end method

.method private a(Lo/ekw;Lo/elb;Lo/cfe$e;FF)V
    .locals 5

    .line 301
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "customAxis mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    sget-object v0, Lo/cfe$e;->c:Lo/cfe$e;

    if-ne p3, v0, :cond_0

    .line 304
    invoke-virtual {p1}, Lo/ekw;->getAxisFirstParty()Lo/eit;

    move-result-object v4

    .line 305
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p2, v0}, Lo/elb;->c(Lo/eit$b;)V

    goto :goto_0

    .line 306
    :cond_0
    sget-object v0, Lo/cfe$e;->d:Lo/cfe$e;

    if-ne p3, v0, :cond_1

    .line 307
    invoke-virtual {p1}, Lo/ekw;->getAxisSecondParty()Lo/eit;

    move-result-object v4

    .line 308
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    invoke-virtual {p2, v0}, Lo/elb;->c(Lo/eit$b;)V

    goto :goto_0

    .line 310
    :cond_1
    invoke-virtual {p1}, Lo/ekw;->getAxisThirdParty()Lo/eit;

    move-result-object v4

    .line 311
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    invoke-virtual {p2, v0}, Lo/elb;->c(Lo/eit$b;)V

    .line 314
    :goto_0
    invoke-virtual {v4, p5}, Lo/lp;->b(F)V

    .line 315
    invoke-virtual {v4, p4}, Lo/lp;->a(F)V

    .line 316
    return-void
.end method

.method private b(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;
    .locals 15

    .line 704
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackSpeedDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 707
    invoke-virtual {p0}, Lo/cfe;->m()Ljava/util/ArrayList;

    move-result-object v9

    .line 708
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 709
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTrackSpeed trackSpeedList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    const/4 v0, 0x0

    return-object v0

    .line 715
    :cond_1
    const/4 v10, 0x1

    .line 716
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    .line 718
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cfp;

    .line 721
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cfp;->e()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {v13}, Lo/cfp;->d()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 722
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    invoke-virtual {v13}, Lo/cfp;->d()D

    move-result-wide v0

    float-to-double v2, v10

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 724
    invoke-virtual {v13}, Lo/cfp;->d()D

    move-result-wide v0

    double-to-float v10, v0

    .line 726
    :cond_2
    invoke-virtual {v13}, Lo/cfp;->d()D

    move-result-wide v0

    float-to-double v2, v11

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    .line 727
    invoke-virtual {v13}, Lo/cfp;->d()D

    move-result-wide v0

    double-to-float v11, v0

    .line 729
    :cond_3
    goto :goto_0

    .line 731
    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_5

    .line 734
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 739
    :cond_5
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_6

    .line 743
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    iget-object v3, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 744
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 745
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_speed_km_hour:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 746
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 747
    invoke-virtual {p0}, Lo/cfe;->p()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    goto :goto_1

    .line 751
    :cond_6
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    iget-object v3, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 752
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 753
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_speed_mi_hour:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 754
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 755
    invoke-virtual {p0}, Lo/cfe;->p()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 757
    :goto_1
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/elb;->k(I)V

    .line 762
    const/16 v0, 0xff

    const/4 v1, 0x0

    const/16 v2, 0xd1

    const/16 v3, 0x26

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 765
    const/16 v0, 0x80

    const/4 v1, 0x0

    const/16 v2, 0xd1

    const/16 v3, 0x26

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0xd1

    const/16 v4, 0x26

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 768
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_7

    .line 769
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackSpeedDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    move v4, v10

    move-object/from16 v5, p3

    iget-boolean v6, v5, Lo/cfe$a;->b:Z

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 773
    :cond_7
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_8

    .line 774
    const/16 v0, 0x80

    const/4 v1, 0x0

    const/16 v2, 0xd1

    const/16 v3, 0x26

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0xd1

    const/16 v4, 0x26

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 777
    :cond_8
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_9

    .line 778
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 779
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_2

    .line 781
    :cond_9
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 782
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 784
    :goto_2
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_a

    .line 785
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 786
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 787
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 788
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 789
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_3

    .line 791
    :cond_a
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 792
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 793
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 794
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 796
    :goto_3
    invoke-direct {p0, v12}, Lo/cfe;->d(Lo/elb;)V

    .line 798
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/emi;

    if-nez v0, :cond_b

    .line 799
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "plugin track module use chart not instance of track line chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 801
    :cond_b
    new-instance v0, Lo/emh;

    invoke-direct {v0}, Lo/emh;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Lo/emi;

    invoke-virtual {v0, v1, v12}, Lo/emh;->a(Lo/emi;Lo/elb;)V

    .line 803
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 804
    return-object v12
.end method

.method private c(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cfb;>;)Ljava/util/ArrayList<Lo/cfb;>;"
        }
    .end annotation

    .line 809
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 811
    const v8, 0x7f7fffff    # Float.MAX_VALUE

    .line 813
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/cfb;

    .line 814
    invoke-virtual {v10}, Lo/cfb;->a()D

    move-result-wide v0

    float-to-double v2, v8

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 815
    invoke-virtual {v10}, Lo/cfb;->a()D

    move-result-wide v0

    double-to-float v8, v0

    .line 817
    :cond_0
    goto :goto_0

    .line 819
    :cond_1
    float-to-double v0, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v9, v0

    .line 820
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baseLine:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " min:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 822
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cfb;

    .line 823
    new-instance v0, Lo/cfb;

    invoke-virtual {v11}, Lo/cfb;->e()J

    move-result-wide v1

    invoke-virtual {v11}, Lo/cfb;->a()D

    move-result-wide v3

    int-to-double v5, v9

    sub-double/2addr v3, v5

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cfb;-><init>(JD)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 824
    goto :goto_1

    .line 825
    :cond_2
    return-object v7
.end method

.method private c(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;
    .locals 15

    .line 420
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStepRateDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 422
    invoke-virtual {p0}, Lo/cfe;->c()Ljava/util/ArrayList;

    move-result-object v9

    .line 423
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 424
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStepRate stepRateList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    const/4 v0, 0x0

    return-object v0

    .line 428
    :cond_1
    const/high16 v10, -0x80000000

    .line 429
    const v11, 0x7fffffff

    .line 431
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cfd;

    .line 434
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cfd;->e()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {v13}, Lo/cfd;->c()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 435
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    invoke-virtual {v13}, Lo/cfd;->c()I

    move-result v0

    if-le v0, v10, :cond_2

    .line 437
    invoke-virtual {v13}, Lo/cfd;->c()I

    move-result v10

    .line 439
    :cond_2
    invoke-virtual {v13}, Lo/cfd;->c()I

    move-result v0

    if-ge v0, v11, :cond_3

    .line 440
    invoke-virtual {v13}, Lo/cfd;->c()I

    move-result v11

    .line 442
    :cond_3
    goto :goto_0

    .line 444
    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_5

    .line 447
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 453
    :cond_5
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    iget-object v3, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 454
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupin:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 455
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupin_with_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/cfe;->a:Landroid/content/Context;

    .line 456
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_stempsmin:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 457
    invoke-virtual {p0}, Lo/cfe;->f()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 467
    const/16 v0, 0xff

    const/16 v1, 0xfd

    const/16 v2, 0xbf

    const/16 v3, 0x36

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 469
    const/16 v0, 0x7f

    const/16 v1, 0xff

    const/16 v2, 0xb0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xff

    const/16 v3, 0xb0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 472
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_6

    .line 473
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStepRateDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    int-to-float v4, v10

    int-to-float v5, v11

    move-object/from16 v6, p3

    iget-boolean v6, v6, Lo/cfe$a;->b:Z

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 477
    :cond_6
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_7

    .line 478
    const/16 v0, 0x7f

    const/16 v1, 0xff

    const/16 v2, 0xb0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xff

    const/16 v3, 0xb0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 481
    :cond_7
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_8

    .line 482
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 483
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_1

    .line 485
    :cond_8
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 486
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 488
    :goto_1
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_9

    .line 489
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 490
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 491
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 492
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 493
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_2

    .line 495
    :cond_9
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 496
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 497
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 498
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 500
    :goto_2
    invoke-direct {p0, v12}, Lo/cfe;->d(Lo/elb;)V

    .line 502
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/emi;

    if-nez v0, :cond_a

    .line 503
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "plugin track module use chart not instance of track line chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 505
    :cond_a
    new-instance v0, Lo/emh;

    invoke-direct {v0}, Lo/emh;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Lo/emi;

    invoke-virtual {v0, v1, v12}, Lo/emh;->a(Lo/emi;Lo/elb;)V

    .line 507
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 508
    return-object v12
.end method

.method public static c(Lo/cfe;)V
    .locals 0

    .line 106
    sput-object p0, Lo/cfe;->b:Lo/cfe;

    .line 107
    return-void
.end method

.method private c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V
    .locals 12

    .line 272
    sub-float v0, p4, p5

    const/high16 v1, 0x41a00000    # 20.0f

    div-float v6, v0, v1

    .line 274
    sub-float v0, p4, p5

    const v1, 0x33d6bf95    # 1.0E-7f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 277
    const v6, 0x3c23d70a    # 0.01f

    .line 279
    :cond_0
    add-float v7, p4, v6

    .line 284
    sub-float v0, p5, v6

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    const/4 v0, 0x0

    cmpl-float v0, p5, v0

    if-ltz v0, :cond_1

    if-nez p7, :cond_1

    .line 285
    const/4 v8, 0x0

    goto :goto_0

    .line 287
    :cond_1
    sub-float v8, p5, v6

    .line 289
    :goto_0
    float-to-double v0, v7

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v9, v0

    .line 290
    float-to-double v0, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v10, v0

    .line 291
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const-string v2, " maxAxisInteger="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " minAxisInteger="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    move/from16 v0, p6

    invoke-direct {p0, v9, v10, v0}, Lo/cfe;->a(IIZ)Lo/cfe$c;

    move-result-object v11

    .line 293
    iget v9, v11, Lo/cfe$c;->e:I

    .line 295
    iget v0, v11, Lo/cfe$c;->a:I

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Lo/elb;->a(IZ)V

    .line 296
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "customAxisByDataBoard(after correct) mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const-string v2, " maxAxisInteger="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " minAxisInteger="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    int-to-float v4, v9

    int-to-float v5, v10

    invoke-direct/range {v0 .. v5}, Lo/cfe;->a(Lo/ekw;Lo/elb;Lo/cfe$e;FF)V

    .line 298
    return-void
.end method

.method private d(III)I
    .locals 4

    .line 935
    const/4 v0, 0x1

    if-gt p3, v0, :cond_0

    .line 936
    return p1

    .line 938
    :cond_0
    add-int/lit8 v1, p3, -0x1

    .line 939
    sub-int v2, p1, p2

    .line 941
    rem-int v3, v2, v1

    .line 942
    if-eqz v3, :cond_1

    .line 944
    sub-int v0, v1, v3

    add-int/2addr p1, v0

    .line 946
    :cond_1
    return p1
.end method

.method private d(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;
    .locals 17

    .line 585
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackAltitudeDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 588
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->n()Ljava/util/ArrayList;

    move-result-object v9

    .line 589
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 590
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTrackAltitude trackAltitudeList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    const/4 v0, 0x0

    return-object v0

    .line 594
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->g()I

    move-result v0

    if-nez v0, :cond_2

    .line 595
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lo/cfe;->c(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v9

    .line 598
    :cond_2
    const/4 v10, 0x1

    .line 599
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    .line 601
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cfb;

    .line 604
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cfb;->e()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {v13}, Lo/cfb;->a()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 605
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    invoke-virtual {v13}, Lo/cfb;->a()D

    move-result-wide v0

    float-to-double v2, v10

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 607
    invoke-virtual {v13}, Lo/cfb;->a()D

    move-result-wide v0

    double-to-float v10, v0

    .line 609
    :cond_3
    invoke-virtual {v13}, Lo/cfb;->a()D

    move-result-wide v0

    float-to-double v2, v11

    cmpg-double v0, v0, v2

    if-gez v0, :cond_4

    .line 610
    invoke-virtual {v13}, Lo/cfb;->a()D

    move-result-wide v0

    double-to-float v11, v0

    .line 612
    :cond_4
    goto :goto_0

    .line 614
    :cond_5
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_6

    .line 617
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 625
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->g()I

    move-result v0

    if-nez v0, :cond_8

    .line 626
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_climbed_withot_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 627
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_7

    .line 628
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_climbed_with_unit_m:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 629
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    .line 631
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_climbed_with_unit_foot:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 632
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    .line 635
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_alti:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 636
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_9

    .line 637
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_alti_with_unit_m:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 638
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    .line 640
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_alti_with_unit_foot:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 641
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 646
    :goto_1
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    move-object v3, v13

    move-object v4, v14

    move-object v5, v15

    .line 647
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->k()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 649
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/elb;->k(I)V

    .line 654
    const/16 v0, 0xff

    const/16 v1, 0x1d

    const/16 v2, 0xcc

    const/16 v3, 0xcd

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 657
    const/16 v0, 0x7f

    const/16 v1, 0x1d

    const/16 v2, 0xcc

    const/16 v3, 0xcd

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x1d

    const/16 v3, 0xcc

    const/16 v4, 0xcd

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 659
    const/16 v16, 0x0

    .line 660
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    .line 661
    const/16 v16, 0x1

    .line 664
    :cond_a
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_b

    .line 665
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackAltitudeDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    move v4, v10

    move v5, v11

    move-object/from16 v6, p3

    iget-boolean v6, v6, Lo/cfe$a;->b:Z

    move/from16 v7, v16

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 669
    :cond_b
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_c

    .line 670
    const/16 v0, 0x7f

    const/16 v1, 0x1d

    const/16 v2, 0xcc

    const/16 v3, 0xcd

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x1d

    const/16 v3, 0xcc

    const/16 v4, 0xcd

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 673
    :cond_c
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_d

    .line 674
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 675
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_2

    .line 677
    :cond_d
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 678
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 680
    :goto_2
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_e

    .line 681
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 682
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 683
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 684
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 685
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_3

    .line 687
    :cond_e
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 688
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 689
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 690
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 692
    :goto_3
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lo/cfe;->d(Lo/elb;)V

    .line 694
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/emi;

    if-nez v0, :cond_f

    .line 695
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "plugin track module use chart not instance of track line chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 697
    :cond_f
    new-instance v0, Lo/emh;

    invoke-direct {v0}, Lo/emh;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Lo/emi;

    invoke-virtual {v0, v1, v12}, Lo/emh;->a(Lo/emi;Lo/elb;)V

    .line 699
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 700
    return-object v12
.end method

.method private d(Lo/ekw;Lo/cfe$e;Lo/cfe$a;I)Lo/elb;
    .locals 18

    .line 1360
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRunningPostureDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1363
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->D()Ljava/util/List;

    move-result-object v9

    .line 1364
    if-eqz v9, :cond_0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1365
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRunningPostureDataLayer runningPostureList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1366
    const/4 v0, 0x0

    return-object v0

    .line 1369
    :cond_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1370
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 1374
    :cond_2
    const/4 v10, 0x1

    .line 1375
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    .line 1377
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cvv;

    .line 1381
    move/from16 v0, p4

    const/4 v1, 0x7

    if-ne v0, v1, :cond_3

    .line 1382
    invoke-virtual {v13}, Lo/cvv;->e()I

    move-result v0

    int-to-float v14, v0

    goto :goto_1

    .line 1384
    :cond_3
    invoke-virtual {v13}, Lo/cvv;->c()I

    move-result v0

    int-to-float v14, v0

    .line 1386
    :goto_1
    new-instance v15, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cvv;->b()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-direct {v15, v0, v14}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 1387
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1388
    cmpl-float v0, v14, v10

    if-lez v0, :cond_4

    .line 1389
    move v10, v14

    .line 1391
    :cond_4
    cmpg-float v0, v14, v11

    if-gez v0, :cond_5

    .line 1392
    move v11, v14

    .line 1394
    :cond_5
    goto :goto_0

    .line 1405
    :cond_6
    move/from16 v0, p4

    const/4 v1, 0x7

    if-ne v0, v1, :cond_7

    .line 1406
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cfe;->a:Landroid/content/Context;

    .line 1407
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_ground_contact_time:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cfe;->a:Landroid/content/Context;

    .line 1408
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_ground_contact_time_with_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/cfe;->a:Landroid/content/Context;

    .line 1409
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_msec_unit:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1410
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->C()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 1411
    const/16 v13, 0xff

    .line 1412
    const/4 v14, 0x0

    .line 1413
    const/16 v15, 0xd0

    .line 1414
    const/16 v16, 0x94

    goto :goto_2

    .line 1416
    :cond_7
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cfe;->a:Landroid/content/Context;

    .line 1417
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_ground_impact_acceleration:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cfe;->a:Landroid/content/Context;

    .line 1418
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_ground_impact_acceleration_with_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/cfe;->a:Landroid/content/Context;

    .line 1419
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_gravity_unit:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1420
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->C()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 1421
    const/16 v13, 0xff

    .line 1422
    const/4 v14, 0x0

    .line 1423
    const/16 v15, 0x7c

    .line 1424
    const/16 v16, 0xff

    .line 1427
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->j()F

    move-result v17

    .line 1428
    const/4 v0, 0x0

    cmpl-float v0, v17, v0

    if-lez v0, :cond_8

    .line 1429
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRunningPostureDataLayer acquireRunningPostureDataSumTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1430
    move/from16 v0, v17

    invoke-virtual {v12, v0}, Lo/elb;->h(F)V

    goto :goto_3

    .line 1433
    :cond_8
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRunningPostureDataLayer modifySumTimeAutoByData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1434
    invoke-virtual {v12}, Lo/elb;->aq()V

    .line 1436
    :goto_3
    move/from16 v0, v16

    invoke-static {v13, v14, v15, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 1437
    const/16 v0, 0x7f

    move/from16 v1, v16

    invoke-static {v0, v14, v15, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    move/from16 v2, v16

    invoke-static {v1, v14, v15, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1439
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/elb;->k(I)V

    .line 1442
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_9

    .line 1443
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addRunningPostureDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1444
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    move v4, v10

    move-object/from16 v5, p3

    iget-boolean v6, v5, Lo/cfe$a;->b:Z

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 1447
    :cond_9
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_a

    .line 1448
    const/16 v0, 0x7f

    move/from16 v1, v16

    invoke-static {v0, v14, v15, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x26

    move/from16 v2, v16

    invoke-static {v1, v14, v15, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1451
    :cond_a
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_b

    .line 1452
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1453
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_4

    .line 1455
    :cond_b
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1456
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 1458
    :goto_4
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_c

    .line 1459
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1460
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 1461
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1462
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 1463
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_5

    .line 1465
    :cond_c
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1466
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 1467
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 1468
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1470
    :goto_5
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lo/cfe;->d(Lo/elb;)V

    .line 1472
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 1473
    return-object v12
.end method

.method private d(Lo/ekw;Lo/elb;)V
    .locals 3

    .line 319
    if-nez p1, :cond_0

    .line 320
    return-void

    .line 323
    :cond_0
    new-instance v0, Lo/cfe$3;

    invoke-direct {v0, p0}, Lo/cfe$3;-><init>(Lo/cfe;)V

    invoke-virtual {p2, v0}, Lo/elb;->c(Lo/elb$b;)V

    .line 336
    invoke-virtual {p1}, Lo/ekw;->getData()Lo/ma;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ela;

    .line 338
    if-nez v1, :cond_1

    .line 339
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 340
    new-instance v1, Lo/ela;

    invoke-direct {v1, v2}, Lo/ela;-><init>(Ljava/util/List;)V

    .line 341
    invoke-virtual {p1, v1}, Lo/ekw;->setData(Lo/ma;)V

    goto :goto_0

    .line 343
    :cond_1
    invoke-virtual {v1}, Lo/ela;->h()Ljava/util/List;

    move-result-object v2

    .line 345
    :goto_0
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    return-void
.end method

.method private d(Lo/ekw;Lo/elb;Lo/cfe$e;Lo/eid;)V
    .locals 4

    .line 386
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "customAxisRenderArg mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    sget-object v0, Lo/cfe$e;->c:Lo/cfe$e;

    if-ne p3, v0, :cond_0

    .line 388
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p1, v0, p4}, Lo/ekw;->setAxisDataRenderArg(Lo/eit$b;Lo/eid;)V

    goto :goto_0

    .line 389
    :cond_0
    sget-object v0, Lo/cfe$e;->d:Lo/cfe$e;

    if-ne p3, v0, :cond_1

    .line 390
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    invoke-virtual {p1, v0, p4}, Lo/ekw;->setAxisDataRenderArg(Lo/eit$b;Lo/eid;)V

    goto :goto_0

    .line 392
    :cond_1
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    invoke-virtual {p1, v0, p4}, Lo/ekw;->setAxisDataRenderArg(Lo/eit$b;Lo/eid;)V

    .line 394
    :goto_0
    invoke-virtual {p4}, Lo/eid;->e()Lo/ejn;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lo/emi;

    invoke-interface {v0, v1, p2}, Lo/ejn;->a(Lo/emi;Lo/elb;)V

    .line 395
    return-void
.end method

.method private d(Lo/elb;)V
    .locals 1

    .line 950
    new-instance v0, Lo/cfe$4;

    invoke-direct {v0, p0, p1}, Lo/cfe$4;-><init>(Lo/cfe;Lo/elb;)V

    invoke-virtual {p1, v0}, Lo/elb;->b(Lo/elb$c;)V

    .line 969
    return-void
.end method

.method public static e()Lo/cfe;
    .locals 1

    .line 102
    sget-object v0, Lo/cfe;->b:Lo/cfe;

    return-object v0
.end method

.method private e(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;
    .locals 16

    .line 990
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackSwolfDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 991
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 993
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->v()Ljava/util/List;

    move-result-object v9

    .line 994
    if-eqz v9, :cond_0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 995
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "inittrackSwolfList trackSwolfList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    const/4 v0, 0x0

    return-object v0

    .line 999
    :cond_1
    const/4 v10, 0x1

    .line 1000
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    .line 1002
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cfl;

    .line 1005
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cfl;->e()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {v13}, Lo/cfl;->d()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 1006
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1007
    invoke-virtual {v13}, Lo/cfl;->d()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_2

    .line 1008
    invoke-virtual {v13}, Lo/cfl;->d()I

    move-result v0

    int-to-float v10, v0

    .line 1010
    :cond_2
    invoke-virtual {v13}, Lo/cfl;->d()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v0, v11

    if-gez v0, :cond_3

    .line 1011
    invoke-virtual {v13}, Lo/cfl;->d()I

    move-result v0

    int-to-float v11, v0

    .line 1013
    :cond_3
    goto :goto_0

    .line 1015
    :cond_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1018
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 1022
    :cond_5
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cfe;->a:Landroid/content/Context;

    .line 1023
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_swim_SWOLF:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cfe;->a:Landroid/content/Context;

    .line 1024
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_swim_SWOLF:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    .line 1025
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->z()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 1027
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/elb;->k(I)V

    .line 1032
    const/16 v13, 0x45

    .line 1033
    const/16 v14, 0x9a

    .line 1034
    const/16 v15, 0xff

    .line 1036
    const/16 v0, 0xff

    invoke-static {v0, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 1039
    const/16 v0, 0x80

    invoke-static {v0, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1042
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_6

    .line 1043
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackSwolfDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1044
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    move v4, v10

    move v5, v11

    move-object/from16 v6, p3

    iget-boolean v6, v6, Lo/cfe$a;->b:Z

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 1047
    :cond_6
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_7

    .line 1048
    const/16 v0, 0xd8

    invoke-static {v0, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x26

    invoke-static {v1, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1051
    :cond_7
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_8

    .line 1052
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1053
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_1

    .line 1055
    :cond_8
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1056
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 1058
    :goto_1
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_9

    .line 1059
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1060
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 1061
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1062
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 1063
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_2

    .line 1065
    :cond_9
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1066
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 1067
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 1068
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1071
    :goto_2
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/emi;

    if-nez v0, :cond_a

    .line 1072
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "plugin track module use chart not instance of track line chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1074
    :cond_a
    new-instance v0, Lo/emj;

    invoke-direct {v0}, Lo/emj;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Lo/emi;

    invoke-virtual {v0, v1, v12}, Lo/emj;->a(Lo/emi;Lo/elb;)V

    .line 1076
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 1077
    return-object v12
.end method

.method private f(Lo/ekw;)Lo/cfe$e;
    .locals 4

    .line 143
    invoke-virtual {p1}, Lo/ekw;->getData()Lo/ma;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ela;

    .line 144
    if-nez v2, :cond_0

    .line 145
    sget-object v0, Lo/cfe$e;->c:Lo/cfe$e;

    return-object v0

    .line 148
    :cond_0
    invoke-virtual {v2}, Lo/ela;->h()Ljava/util/List;

    move-result-object v3

    .line 149
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 150
    :cond_1
    sget-object v0, Lo/cfe$e;->c:Lo/cfe$e;

    return-object v0

    .line 152
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 153
    sget-object v0, Lo/cfe$e;->d:Lo/cfe$e;

    return-object v0

    .line 154
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 155
    sget-object v0, Lo/cfe$e;->a:Lo/cfe$e;

    return-object v0

    .line 157
    :cond_4
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    return-object v0
.end method

.method private h(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;
    .locals 16

    .line 1100
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackPullFreqDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1101
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1103
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->w()Ljava/util/List;

    move-result-object v9

    .line 1104
    if-eqz v9, :cond_0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1105
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackPullFreqDataList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1106
    const/4 v0, 0x0

    return-object v0

    .line 1109
    :cond_1
    const/4 v10, 0x1

    .line 1110
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    .line 1112
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cfj;

    .line 1115
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cfj;->e()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {v13}, Lo/cfj;->a()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 1116
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1117
    invoke-virtual {v13}, Lo/cfj;->a()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_2

    .line 1118
    invoke-virtual {v13}, Lo/cfj;->a()I

    move-result v0

    int-to-float v10, v0

    .line 1120
    :cond_2
    invoke-virtual {v13}, Lo/cfj;->a()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v0, v11

    if-gez v0, :cond_3

    .line 1121
    invoke-virtual {v13}, Lo/cfj;->a()I

    move-result v0

    int-to-float v11, v0

    .line 1123
    :cond_3
    goto :goto_0

    .line 1125
    :cond_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1128
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 1132
    :cond_5
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cfe;->a:Landroid/content/Context;

    .line 1133
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_pull_frequence:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cfe;->a:Landroid/content/Context;

    .line 1134
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_pull_frequence_with_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/cfe;->a:Landroid/content/Context;

    .line 1135
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_stroke_rate_unit:I

    const/16 v7, 0xa

    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v5

    .line 1136
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->y()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v12, v0

    .line 1138
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/elb;->k(I)V

    .line 1141
    const/16 v13, 0xff

    .line 1142
    const/16 v14, 0xb0

    .line 1143
    const/4 v15, 0x0

    .line 1145
    const/16 v0, 0xff

    invoke-static {v0, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 1148
    const/16 v0, 0xd9

    invoke-static {v0, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x26

    invoke-static {v1, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1151
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_6

    .line 1152
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackPullFreqDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    move v4, v10

    move v5, v11

    move-object/from16 v6, p3

    iget-boolean v6, v6, Lo/cfe$a;->b:Z

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 1156
    :cond_6
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_7

    .line 1157
    const/16 v0, 0xd8

    invoke-static {v0, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x26

    invoke-static {v1, v13, v14, v15}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1160
    :cond_7
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_8

    .line 1161
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1162
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_1

    .line 1164
    :cond_8
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1165
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 1167
    :goto_1
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_9

    .line 1168
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1169
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 1170
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1171
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 1172
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_2

    .line 1174
    :cond_9
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1175
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 1176
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 1177
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1180
    :goto_2
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/emi;

    if-nez v0, :cond_a

    .line 1181
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "plugin track module use chart not instance of track line chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1183
    :cond_a
    new-instance v0, Lo/emh;

    invoke-direct {v0}, Lo/emh;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Lo/emi;

    invoke-virtual {v0, v1, v12}, Lo/emh;->a(Lo/emi;Lo/elb;)V

    .line 1185
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 1186
    return-object v12
.end method

.method private i(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;
    .locals 19

    .line 1210
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackRealTimePaceDataLayer mode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1211
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1213
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->A()Ljava/util/List;

    move-result-object v9

    .line 1214
    if-eqz v9, :cond_0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1215
    :cond_0
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackRealTimePaceDataLayer trackSwolfList empty,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1216
    const/4 v0, 0x0

    return-object v0

    .line 1219
    :cond_1
    const/4 v10, 0x1

    .line 1220
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    .line 1222
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cfk;

    .line 1225
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v13}, Lo/cfk;->e()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {v13}, Lo/cfk;->b()I

    move-result v1

    int-to-float v1, v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 1226
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1227
    invoke-virtual {v13}, Lo/cfk;->b()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_2

    .line 1228
    invoke-virtual {v13}, Lo/cfk;->b()I

    move-result v0

    int-to-float v10, v0

    .line 1230
    :cond_2
    invoke-virtual {v13}, Lo/cfk;->b()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v0, v11

    if-gez v0, :cond_3

    .line 1231
    invoke-virtual {v13}, Lo/cfk;->b()I

    move-result v0

    int-to-float v11, v0

    .line 1233
    :cond_3
    goto :goto_0

    .line 1235
    :cond_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual/range {p1 .. p1}, Lo/ekw;->K()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1238
    move-object/from16 v0, p1

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/ekw;->b(IZ)V

    .line 1242
    :cond_5
    const-string v13, ""

    .line 1243
    const-string v14, ""

    .line 1244
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    .line 1245
    if-eqz v15, :cond_a

    .line 1246
    move-object/from16 v0, p0

    iget v0, v0, Lo/cfe;->e:I

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_6

    move-object/from16 v0, p0

    iget v0, v0, Lo/cfe;->e:I

    const/16 v1, 0x106

    if-ne v0, v1, :cond_8

    .line 1247
    :cond_6
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1249
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_swim_pace_with_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 1250
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

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

    move-result-object v14

    goto/16 :goto_1

    .line 1253
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_swim_pace_with_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 1254
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

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

    move-result-object v14

    goto :goto_1

    .line 1257
    :cond_8
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1259
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_pace_mi_hour:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 1260
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v15, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    goto :goto_1

    .line 1263
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cfe;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_pace_km_hour:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 1264
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v15, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 1268
    :cond_a
    :goto_1
    new-instance v0, Lo/elb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cfe;->a:Landroid/content/Context;

    .line 1269
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_peisu_1:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object v4, v13

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v0

    .line 1273
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->B()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_b

    .line 1274
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRTPaceDataSumTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p0 .. p0}, Lo/cfe;->B()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1275
    invoke-virtual/range {p0 .. p0}, Lo/cfe;->B()F

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->h(F)V

    goto :goto_2

    .line 1278
    :cond_b
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifySumTimeAutoByData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1279
    invoke-virtual {v12}, Lo/elb;->aq()V

    .line 1282
    :goto_2
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lo/elb;->k(I)V

    .line 1287
    const/16 v16, 0x0

    .line 1288
    const/16 v17, 0xd1

    .line 1289
    const/16 v18, 0x26

    .line 1291
    const/16 v0, 0xff

    move/from16 v1, v16

    move/from16 v2, v17

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/elb;->c(I)V

    .line 1294
    const/16 v0, 0x80

    move/from16 v1, v16

    move/from16 v2, v17

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    move/from16 v2, v16

    move/from16 v3, v17

    move/from16 v4, v18

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1297
    sget-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    move-object/from16 v1, p2

    if-eq v1, v0, :cond_c

    .line 1298
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrackRealTimePaceDataLayer customAxisByDataBoard mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1299
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, p2

    move v4, v10

    move v5, v11

    move-object/from16 v6, p3

    iget-boolean v6, v6, Lo/cfe$a;->b:Z

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/cfe;->c(Lo/ekw;Lo/elb;Lo/cfe$e;FFZZ)V

    .line 1302
    :cond_c
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->b:Z

    if-eqz v0, :cond_d

    .line 1303
    const/16 v0, 0x80

    move/from16 v1, v16

    move/from16 v2, v17

    move/from16 v3, v18

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    move/from16 v2, v16

    move/from16 v3, v17

    move/from16 v4, v18

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v12, v0, v1, v2}, Lo/elb;->d(IIZ)V

    .line 1306
    :cond_d
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->a:Z

    if-eqz v0, :cond_e

    .line 1307
    const/16 v0, 0xc

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1308
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    goto :goto_3

    .line 1310
    :cond_e
    const/16 v0, 0x33

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x33

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/ekw;->setGridColor(II)V

    .line 1311
    const/16 v0, 0xff

    const/16 v1, 0xff

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->setLabelColor(I)V

    .line 1313
    :goto_3
    move-object/from16 v0, p3

    iget-boolean v0, v0, Lo/cfe$a;->c:Z

    if-eqz v0, :cond_f

    .line 1314
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1315
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->e(Z)V

    .line 1316
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1317
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->d(Z)V

    .line 1318
    move-object/from16 v0, p1

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/ekw;->setExtraTopOffset(F)V

    goto :goto_4

    .line 1320
    :cond_f
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->setAvoidFirstLastClipping(Z)V

    .line 1321
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->c(Z)V

    .line 1322
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ekw;->a(Z)V

    .line 1323
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v0}, Lo/elb;->c(F)V

    .line 1325
    :goto_4
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lo/cfe;->d(Lo/elb;)V

    .line 1327
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/emi;

    if-nez v0, :cond_10

    .line 1328
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "plugin track module use chart not instance of track line chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1330
    :cond_10
    new-instance v0, Lo/emk;

    invoke-direct {v0}, Lo/emk;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Lo/emi;

    invoke-virtual {v0, v1, v12}, Lo/emk;->a(Lo/emi;Lo/elb;)V

    .line 1332
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v12}, Lo/cfe;->d(Lo/ekw;Lo/elb;)V

    .line 1333
    return-object v12
.end method


# virtual methods
.method protected abstract A()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cfk;>;"
        }
    .end annotation
.end method

.method protected abstract B()F
.end method

.method protected abstract C()I
.end method

.method protected abstract D()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cvv;>;"
        }
    .end annotation
.end method

.method protected abstract a()F
.end method

.method public a(Lo/ekw;)Lo/elb;
    .locals 1

    .line 975
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0}, Lo/cfe;->b(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public a(Lo/ekw;Lo/cfe$a;)Lo/elb;
    .locals 2

    .line 129
    if-nez p1, :cond_0

    .line 130
    const/4 v0, 0x0

    return-object v0

    .line 133
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 135
    invoke-direct {p0, p1, v1, p2}, Lo/cfe;->a(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method protected abstract b()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cev;>;"
        }
    .end annotation
.end method

.method public b(Lo/ekw;)Lo/elb;
    .locals 1

    .line 556
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/ekw;Lo/cfe$a;)Lo/elb;
    .locals 2

    .line 979
    if-nez p1, :cond_0

    .line 980
    const/4 v0, 0x0

    return-object v0

    .line 983
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 985
    invoke-direct {p0, p1, v1, p2}, Lo/cfe;->e(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/ekw;Lo/elb;)V
    .locals 15

    .line 350
    invoke-virtual/range {p1 .. p1}, Lo/ekw;->getData()Lo/ma;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ela;

    .line 352
    if-nez v6, :cond_0

    .line 353
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 354
    new-instance v6, Lo/ela;

    invoke-direct {v6, v7}, Lo/ela;-><init>(Ljava/util/List;)V

    .line 355
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Lo/ekw;->setData(Lo/ma;)V

    goto :goto_0

    .line 357
    :cond_0
    invoke-virtual {v6}, Lo/ela;->h()Ljava/util/List;

    move-result-object v7

    .line 359
    :goto_0
    move-object/from16 v0, p2

    invoke-interface {v7, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 361
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 362
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 363
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 365
    const/4 v11, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_1

    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_1

    .line 366
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/elb;

    .line 367
    invoke-virtual {v12}, Lo/elb;->e()Lo/eit$b;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->a(Lo/eit$b;)Lo/eit;

    move-result-object v13

    .line 368
    invoke-virtual {v12}, Lo/elb;->e()Lo/eit$b;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lo/ekw;->e(Lo/eit$b;)Lo/eid;

    move-result-object v14

    .line 369
    invoke-virtual {v13}, Lo/eit;->s()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v8, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    invoke-virtual {v13}, Lo/eit;->q()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v9, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    invoke-interface {v10, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 374
    :cond_1
    const/4 v11, 0x0

    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_2

    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_2

    .line 375
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/elb;

    .line 376
    const-string v0, "Track_TrackLineChartHolder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rmDataSet customAxis mode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cfe;->d:Ljava/util/List;

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " max="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v9, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " min="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-interface {v8, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    move-object v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    iget-object v3, p0, Lo/cfe;->d:Ljava/util/List;

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/cfe$e;

    invoke-interface {v9, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-interface {v8, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-direct/range {v0 .. v5}, Lo/cfe;->a(Lo/ekw;Lo/elb;Lo/cfe$e;FF)V

    .line 379
    iget-object v0, p0, Lo/cfe;->d:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfe$e;

    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eid;

    move-object/from16 v2, p1

    invoke-direct {p0, v2, v12, v0, v1}, Lo/cfe;->d(Lo/ekw;Lo/elb;Lo/cfe$e;Lo/eid;)V

    .line 374
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_2

    .line 382
    :cond_2
    invoke-virtual {v6}, Lo/ela;->b()V

    .line 383
    return-void
.end method

.method protected abstract c()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfd;>;"
        }
    .end annotation
.end method

.method public c(Lo/ekw;)Lo/elb;
    .locals 1

    .line 403
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0}, Lo/cfe;->e(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/ekw;Lo/cfe$a;)Lo/elb;
    .locals 2

    .line 574
    if-nez p1, :cond_0

    .line 575
    const/4 v0, 0x0

    return-object v0

    .line 578
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 580
    invoke-direct {p0, p1, v1, p2}, Lo/cfe;->b(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method protected abstract d()I
.end method

.method public d(Lo/ekw;)Lo/elb;
    .locals 1

    .line 559
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0}, Lo/cfe;->c(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/ekw;I)Lo/elb;
    .locals 1

    .line 1343
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0, p2}, Lo/cfe;->d(Lo/ekw;Lo/cfe$a;I)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/ekw;Lo/cfe$a;)Lo/elb;
    .locals 2

    .line 563
    if-nez p1, :cond_0

    .line 564
    const/4 v0, 0x0

    return-object v0

    .line 567
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 569
    invoke-direct {p0, p1, v1, p2}, Lo/cfe;->d(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/ekw;Lo/cfe$a;I)Lo/elb;
    .locals 2

    .line 1347
    if-nez p1, :cond_0

    .line 1348
    const/4 v0, 0x0

    return-object v0

    .line 1351
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 1353
    invoke-direct {p0, p1, v1, p2, p3}, Lo/cfe;->d(Lo/ekw;Lo/cfe$e;Lo/cfe$a;I)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/ekw;)Lo/elb;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0}, Lo/cfe;->a(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/ekw;Lo/cfe$a;)Lo/elb;
    .locals 2

    .line 409
    if-nez p1, :cond_0

    .line 410
    const/4 v0, 0x0

    return-object v0

    .line 413
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 415
    invoke-direct {p0, p1, v1, p2}, Lo/cfe;->c(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 98
    iput p1, p0, Lo/cfe;->e:I

    .line 99
    return-void
.end method

.method protected abstract f()I
.end method

.method protected abstract g()I
.end method

.method public g(Lo/ekw;)Lo/elb;
    .locals 1

    .line 1085
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0}, Lo/cfe;->h(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method protected abstract h()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfb;>;"
        }
    .end annotation
.end method

.method public h(Lo/ekw;Lo/cfe$a;)Lo/elb;
    .locals 2

    .line 1089
    if-nez p1, :cond_0

    .line 1090
    const/4 v0, 0x0

    return-object v0

    .line 1093
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 1095
    invoke-direct {p0, p1, v1, p2}, Lo/cfe;->h(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method protected abstract i()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfp;>;"
        }
    .end annotation
.end method

.method public i(Lo/ekw;)Lo/elb;
    .locals 1

    .line 1193
    iget-object v0, p0, Lo/cfe;->c:Lo/cfe$a;

    invoke-virtual {p0, p1, v0}, Lo/cfe;->k(Lo/ekw;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method protected abstract j()F
.end method

.method protected abstract k()I
.end method

.method public k(Lo/ekw;Lo/cfe$a;)Lo/elb;
    .locals 2

    .line 1197
    if-nez p1, :cond_0

    .line 1198
    const/4 v0, 0x0

    return-object v0

    .line 1201
    :cond_0
    invoke-direct {p0, p1}, Lo/cfe;->f(Lo/ekw;)Lo/cfe$e;

    move-result-object v1

    .line 1203
    invoke-direct {p0, p1, v1, p2}, Lo/cfe;->i(Lo/ekw;Lo/cfe$e;Lo/cfe$a;)Lo/elb;

    move-result-object v0

    return-object v0
.end method

.method public l()Z
    .locals 2

    .line 851
    invoke-virtual {p0}, Lo/cfe;->c()Ljava/util/ArrayList;

    move-result-object v1

    .line 852
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 853
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 855
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method protected m()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfp;>;"
        }
    .end annotation

    .line 537
    invoke-virtual {p0}, Lo/cfe;->i()Ljava/util/ArrayList;

    move-result-object v6

    .line 538
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 539
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 542
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 544
    return-object v6

    .line 547
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 548
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/cfp;

    .line 549
    new-instance v0, Lo/cfp;

    invoke-virtual {v9}, Lo/cfp;->e()J

    move-result-wide v1

    invoke-virtual {v9}, Lo/cfp;->d()D

    move-result-wide v3

    const/4 v5, 0x3

    invoke-static {v3, v4, v5}, Lo/cxh;->a(DI)D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cfp;-><init>(JD)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    goto :goto_0

    .line 551
    :cond_3
    return-object v7
.end method

.method protected n()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/cfb;>;"
        }
    .end annotation

    .line 519
    invoke-virtual {p0}, Lo/cfe;->h()Ljava/util/ArrayList;

    move-result-object v6

    .line 520
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 521
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 524
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 526
    return-object v6

    .line 529
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 530
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/cfb;

    .line 531
    new-instance v0, Lo/cfb;

    invoke-virtual {v9}, Lo/cfb;->e()J

    move-result-wide v1

    invoke-virtual {v9}, Lo/cfb;->a()D

    move-result-wide v3

    const/4 v5, 0x1

    invoke-static {v3, v4, v5}, Lo/cxh;->a(DI)D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cfb;-><init>(JD)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    goto :goto_0

    .line 533
    :cond_3
    return-object v7
.end method

.method public o()Z
    .locals 2

    .line 843
    invoke-virtual {p0}, Lo/cfe;->b()Ljava/util/ArrayList;

    move-result-object v1

    .line 844
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 845
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 847
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method protected abstract p()I
.end method

.method public q()Z
    .locals 2

    .line 883
    invoke-virtual {p0}, Lo/cfe;->w()Ljava/util/List;

    move-result-object v1

    .line 884
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 885
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 887
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public r()Z
    .locals 2

    .line 859
    invoke-virtual {p0}, Lo/cfe;->h()Ljava/util/ArrayList;

    move-result-object v1

    .line 860
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 861
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 863
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public s()Z
    .locals 2

    .line 875
    invoke-virtual {p0}, Lo/cfe;->v()Ljava/util/List;

    move-result-object v1

    .line 876
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 877
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 879
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public t()Z
    .locals 2

    .line 891
    invoke-virtual {p0}, Lo/cfe;->A()Ljava/util/List;

    move-result-object v1

    .line 892
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 893
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 895
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public u()Z
    .locals 2

    .line 867
    invoke-virtual {p0}, Lo/cfe;->i()Ljava/util/ArrayList;

    move-result-object v1

    .line 868
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 869
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 871
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method protected abstract v()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cfl;>;"
        }
    .end annotation
.end method

.method protected abstract w()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cfj;>;"
        }
    .end annotation
.end method

.method public x()Z
    .locals 2

    .line 899
    invoke-virtual {p0}, Lo/cfe;->D()Ljava/util/List;

    move-result-object v1

    .line 900
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 901
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 903
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method protected abstract y()I
.end method

.method protected abstract z()I
.end method

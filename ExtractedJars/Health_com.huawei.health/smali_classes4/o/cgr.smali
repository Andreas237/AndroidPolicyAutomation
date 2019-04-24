.class public Lo/cgr;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgr$e;,
        Lo/cgr$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/cgr$b;>;"
    }
.end annotation


# static fields
.field private static final l:I

.field private static final m:I


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:F

.field private e:Ljava/lang/String;

.field private f:F

.field private g:Landroid/content/res/Resources;

.field private h:F

.field private i:F

.field private k:F

.field private n:F

.field private o:Z

.field private p:F

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:D

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cgr$e;>;"
        }
    .end annotation
.end field

.field private x:D

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const-string v0, "#FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cgr;->m:I

    .line 59
    const-string v0, "#7FFFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cgr;->l:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;FFFFFZDDZZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;>;Ljava/lang/String;Ljava/lang/String;FFFFFZDDZZ)V"
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgr;->g:Landroid/content/res/Resources;

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/cgr;->k:F

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/cgr;->f:F

    .line 71
    iput-object p1, p0, Lo/cgr;->c:Landroid/content/Context;

    .line 72
    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/cgr;->g:Landroid/content/res/Resources;

    .line 73
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/cgr;->s:Z

    .line 74
    iput-object p2, p0, Lo/cgr;->b:Ljava/util/List;

    .line 75
    iput-object p3, p0, Lo/cgr;->a:Ljava/lang/String;

    .line 76
    iput-object p4, p0, Lo/cgr;->e:Ljava/lang/String;

    .line 77
    iput p5, p0, Lo/cgr;->d:F

    .line 78
    iput p6, p0, Lo/cgr;->i:F

    .line 79
    iput p9, p0, Lo/cgr;->n:F

    .line 80
    iput p7, p0, Lo/cgr;->k:F

    .line 81
    iput p8, p0, Lo/cgr;->f:F

    .line 82
    iput-boolean p10, p0, Lo/cgr;->o:Z

    .line 83
    move/from16 v0, p15

    iput-boolean v0, p0, Lo/cgr;->u:Z

    .line 84
    iput-wide p11, p0, Lo/cgr;->v:D

    .line 85
    move-wide/from16 v0, p13

    iput-wide v0, p0, Lo/cgr;->x:D

    .line 86
    move/from16 v0, p16

    iput-boolean v0, p0, Lo/cgr;->z:Z

    .line 87
    cmpl-float v0, p6, p5

    if-eqz v0, :cond_0

    .line 88
    div-float v0, p5, p6

    iget v1, p0, Lo/cgr;->f:F

    iget v2, p0, Lo/cgr;->k:F

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lo/cgr;->p:F

    .line 89
    iget v0, p0, Lo/cgr;->k:F

    iget v1, p0, Lo/cgr;->f:F

    sub-float/2addr v0, v1

    sub-float v1, p6, p5

    div-float/2addr v0, v1

    iput v0, p0, Lo/cgr;->h:F

    .line 91
    :cond_0
    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cgr;->t:Z

    .line 92
    invoke-direct {p0}, Lo/cgr;->c()V

    .line 93
    return-void
.end method

.method private a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 255
    iget-boolean v0, p0, Lo/cgr;->q:Z

    if-eqz v0, :cond_2

    .line 256
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_pace_top_share_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 257
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 258
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 259
    const-string v6, "/"

    .line 260
    iget-boolean v0, p0, Lo/cgr;->s:Z

    if-eqz v0, :cond_0

    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 263
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 265
    :goto_0
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    iget-boolean v0, p0, Lo/cgr;->o:Z

    if-eqz v0, :cond_1

    .line 268
    sget v0, Lo/cgr;->m:I

    invoke-direct {p0, v4, v0}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 269
    sget v0, Lo/cgr;->m:I

    invoke-direct {p0, v5, v0}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 271
    :cond_1
    goto/16 :goto_2

    .line 272
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_pace_top_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 274
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 275
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 276
    const-string v6, "/"

    .line 277
    iget-boolean v0, p0, Lo/cgr;->s:Z

    if-eqz v0, :cond_3

    .line 278
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 280
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 282
    :goto_1
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    iget-boolean v0, p0, Lo/cgr;->z:Z

    if-eqz v0, :cond_4

    .line 285
    invoke-direct {p0, v3}, Lo/cgr;->d(Landroid/view/View;)V

    .line 289
    :cond_4
    :goto_2
    iget-boolean v0, p0, Lo/cgr;->o:Z

    if-eqz v0, :cond_5

    .line 290
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 291
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->m:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 292
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 293
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->m:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 294
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 295
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_marathon_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 296
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half_title2:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 297
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_marathon:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->m:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 298
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->m:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 299
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_half2:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->m:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 301
    :cond_5
    return-object v3
.end method

.method private a(F)Ljava/lang/String;
    .locals 1

    .line 533
    invoke-static {p1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/widget/TextView;I)V
    .locals 0

    .line 143
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 144
    return-void
.end method

.method private b(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 231
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_pace_mid_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 232
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_layout_distance_des:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 234
    iget-boolean v0, p0, Lo/cgr;->s:Z

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_pace_mi_hour:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 237
    :cond_0
    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_pace_km_hour:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    :goto_0
    iget-boolean v0, p0, Lo/cgr;->q:Z

    if-eqz v0, :cond_1

    .line 240
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_pacemap_title_line:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 241
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_item_linear:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 242
    invoke-virtual {v6}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 243
    const/high16 v0, 0x41800000    # 16.0f

    invoke-direct {p0, v0}, Lo/cgr;->c(F)I

    move-result v0

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v1}, Lo/cgr;->c(F)I

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-direct {p0, v2}, Lo/cgr;->c(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v3, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 244
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    :cond_1
    iget-boolean v0, p0, Lo/cgr;->o:Z

    if-eqz v0, :cond_2

    .line 247
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_layout_distance_unit:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 248
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_layout_distance_des:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 250
    :cond_2
    return-object v4
.end method

.method private c(F)I
    .locals 3

    .line 399
    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 400
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private c()V
    .locals 17

    .line 96
    invoke-direct/range {p0 .. p0}, Lo/cgr;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/cgr;->r:Z

    .line 98
    const-string v0, "Track_PaceMapRecyclerViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show old pace view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void

    .line 101
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgr;->w:Ljava/util/List;

    .line 102
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgr;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    .line 103
    const/4 v9, 0x0

    .line 104
    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 105
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgr;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/Map$Entry;

    .line 106
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgr;->w:Ljava/util/List;

    new-instance v1, Lo/cgr$e;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v13}, Lo/cgr$e;-><init>(ILjava/util/Map$Entry;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    add-int/lit8 v9, v9, 0x1

    .line 109
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v14

    .line 110
    add-int/2addr v10, v14

    .line 111
    add-int/2addr v11, v14

    .line 112
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/cgr;->s:Z

    if-eqz v0, :cond_1

    .line 113
    rem-int/lit8 v0, v9, 0x5

    if-nez v0, :cond_2

    .line 114
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_use_time:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_show_use_time_mi:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    int-to-double v4, v9

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v8, v2, v9, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v8, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 115
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_segment_time:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v11}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 116
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgr;->w:Ljava/util/List;

    new-instance v1, Lo/cgr$e;

    const/4 v2, 0x5

    move-object/from16 v3, v16

    invoke-direct {v1, v2, v15, v3}, Lo/cgr$e;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    const/4 v11, 0x0

    .line 118
    goto :goto_1

    .line 120
    :cond_1
    rem-int/lit8 v0, v9, 0x5

    if-nez v0, :cond_2

    .line 121
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_use_time:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_show_use_time_km:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    int-to-double v4, v9

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v8, v2, v9, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v8, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 122
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_segment_time:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v11}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgr;->w:Ljava/util/List;

    new-instance v1, Lo/cgr$e;

    const/4 v2, 0x5

    move-object/from16 v3, v16

    invoke-direct {v1, v2, v15, v3}, Lo/cgr$e;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    const/4 v11, 0x0

    .line 128
    :cond_2
    :goto_1
    goto/16 :goto_0

    .line 129
    :cond_3
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/cgr;->r:Z

    .line 131
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 5

    .line 319
    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 320
    :cond_0
    const-string v0, "Track_PaceMapRecyclerViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPaceDialog, mContext or view is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-void

    .line 324
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 325
    if-eqz v4, :cond_2

    .line 326
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 328
    :cond_2
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lo/cgr;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_service_area_notice_title:I

    .line 329
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_common_notification_know_tips:I

    .line 330
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/cgr$4;

    invoke-direct {v2, p0}, Lo/cgr$4;-><init>(Lo/cgr;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 335
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 336
    return-void
.end method

.method static synthetic c(Lo/cgr;Landroid/view/View;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/cgr;->c(Landroid/view/View;)V

    return-void
.end method

.method private d(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 210
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_show_pace_item_foot:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 211
    iget-boolean v0, p0, Lo/cgr;->q:Z

    if-eqz v0, :cond_0

    .line 212
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_show_pace_item_foot_layout:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 213
    invoke-virtual {v5}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 214
    const/high16 v0, 0x41800000    # 16.0f

    invoke-direct {p0, v0}, Lo/cgr;->c(F)I

    move-result v0

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v1}, Lo/cgr;->c(F)I

    move-result v1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-direct {p0, v2}, Lo/cgr;->c(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v3, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 215
    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 217
    :cond_0
    iget-boolean v0, p0, Lo/cgr;->o:Z

    if-eqz v0, :cond_2

    .line 218
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 219
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_use_time:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 220
    iget-boolean v0, p0, Lo/cgr;->t:Z

    if-eqz v0, :cond_1

    .line 221
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_rtl_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 223
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 226
    :cond_2
    :goto_0
    return-object v4
.end method

.method private d(Landroid/view/View;)V
    .locals 5

    .line 305
    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_pace_top_item_layout_tips:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 307
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_title_tips:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 308
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 309
    new-instance v0, Lo/cgr$2;

    invoke-direct {v0, p0, v3}, Lo/cgr$2;-><init>(Lo/cgr;Landroid/view/View;)V

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    return-void
.end method

.method private e(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 200
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_show_pace_item_5n:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 201
    iget-boolean v0, p0, Lo/cgr;->o:Z

    if-eqz v0, :cond_0

    .line 202
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_use_time:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 203
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 205
    :cond_0
    return-object v3
.end method

.method private e()Z
    .locals 3

    .line 134
    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    if-nez v0, :cond_0

    .line 135
    const/4 v0, 0x1

    return v0

    .line 138
    :cond_0
    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 139
    if-eqz v2, :cond_1

    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    add-int/lit8 v1, v2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x989680

    div-int/2addr v0, v1

    if-eq v0, v2, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/cgr$b;
    .locals 5

    .line 170
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 171
    invoke-direct {p0, p1}, Lo/cgr;->a(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 172
    new-instance v4, Lo/cgr$b;

    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgr$b;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgr$2;)V

    goto/16 :goto_1

    .line 173
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 174
    invoke-direct {p0, p1}, Lo/cgr;->b(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 175
    new-instance v4, Lo/cgr$b;

    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgr$b;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgr$2;)V

    goto/16 :goto_1

    .line 176
    :cond_1
    const/4 v0, 0x4

    if-ne v0, p2, :cond_2

    .line 177
    invoke-direct {p0, p1}, Lo/cgr;->d(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 178
    new-instance v4, Lo/cgr$b;

    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgr$b;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgr$2;)V

    .line 179
    iget-boolean v0, p0, Lo/cgr;->o:Z

    invoke-static {v4, v0}, Lo/cgr$b;->d(Lo/cgr$b;Z)V

    goto/16 :goto_1

    .line 180
    :cond_2
    const/4 v0, 0x5

    if-ne v0, p2, :cond_3

    .line 181
    invoke-direct {p0, p1}, Lo/cgr;->e(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 182
    new-instance v4, Lo/cgr$b;

    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgr$b;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgr$2;)V

    goto :goto_1

    .line 184
    :cond_3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_show_pace_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 185
    iget-boolean v0, p0, Lo/cgr;->o:Z

    if-eqz v0, :cond_5

    .line 186
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgr;->l:I

    invoke-direct {p0, v0, v1}, Lo/cgr;->a(Landroid/widget/TextView;I)V

    .line 187
    iget-boolean v0, p0, Lo/cgr;->t:Z

    if-eqz v0, :cond_4

    .line 188
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_rtl_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 190
    :cond_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 193
    :cond_5
    :goto_0
    new-instance v4, Lo/cgr$b;

    iget-object v0, p0, Lo/cgr;->c:Landroid/content/Context;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgr$b;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgr$2;)V

    .line 194
    iget-boolean v0, p0, Lo/cgr;->o:Z

    invoke-static {v4, v0}, Lo/cgr$b;->d(Lo/cgr$b;Z)V

    .line 196
    :goto_1
    return-object v4
.end method

.method public b(Lo/cgr$b;I)V
    .locals 11

    .line 340
    invoke-static {p1}, Lo/cgr$b;->c(Lo/cgr$b;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 341
    move-object v0, p1

    iget-object v1, p0, Lo/cgr;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/cgr;->e:Ljava/lang/String;

    iget-boolean v3, p0, Lo/cgr;->u:Z

    iget-wide v4, p0, Lo/cgr;->v:D

    iget-wide v6, p0, Lo/cgr;->x:D

    invoke-static/range {v0 .. v7}, Lo/cgr$b;->e(Lo/cgr$b;Ljava/lang/String;Ljava/lang/String;ZDD)V

    goto/16 :goto_4

    .line 342
    :cond_0
    invoke-static {p1}, Lo/cgr$b;->c(Lo/cgr$b;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto/16 :goto_4

    .line 343
    :cond_1
    invoke-static {p1}, Lo/cgr$b;->c(Lo/cgr$b;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 344
    iget-object v0, p0, Lo/cgr;->g:Landroid/content/res/Resources;

    invoke-static {p1, v0}, Lo/cgr$b;->e(Lo/cgr$b;Landroid/content/res/Resources;)V

    .line 345
    iget-boolean v0, p0, Lo/cgr;->r:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    add-int/lit8 v1, p2, -0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x989680

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    :goto_0
    iget v1, p0, Lo/cgr;->n:F

    iget-boolean v2, p0, Lo/cgr;->s:Z

    invoke-static {p1, v0, v1, v2}, Lo/cgr$b;->a(Lo/cgr$b;IFZ)V

    goto/16 :goto_4

    .line 346
    :cond_3
    invoke-static {p1}, Lo/cgr$b;->c(Lo/cgr$b;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    .line 347
    iget-object v0, p0, Lo/cgr;->w:Ljava/util/List;

    add-int/lit8 v1, p2, -0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cgr$e;

    .line 348
    iget-object v0, v8, Lo/cgr$e;->b:Ljava/lang/String;

    iget-object v1, v8, Lo/cgr$e;->c:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lo/cgr$b;->a(Lo/cgr$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    goto/16 :goto_4

    .line 350
    :cond_4
    add-int/lit8 p2, p2, -0x2

    .line 351
    iget-boolean v0, p0, Lo/cgr;->r:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/cgr;->w:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgr$e;

    iget-object v8, v0, Lo/cgr$e;->d:Ljava/util/Map$Entry;

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 352
    :goto_1
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x989680

    div-int v9, v0, v1

    .line 353
    iget-object v0, p0, Lo/cgr;->g:Landroid/content/res/Resources;

    invoke-static {p1, v0}, Lo/cgr$b;->e(Lo/cgr$b;Landroid/content/res/Resources;)V

    .line 355
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lo/cgr;->i:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_6

    .line 356
    int-to-double v0, v9

    .line 357
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    .line 358
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {p0, v1}, Lo/cgr;->a(F)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/cgr;->k:F

    .line 356
    const/4 v3, 0x3

    invoke-static {p1, v3, v0, v1, v2}, Lo/cgr$b;->a(Lo/cgr$b;ILjava/lang/String;Ljava/lang/String;F)V

    goto/16 :goto_4

    .line 361
    :cond_6
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lo/cgr;->d:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_8

    .line 363
    iget v0, p0, Lo/cgr;->p:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_7

    .line 364
    iget v10, p0, Lo/cgr;->f:F

    goto :goto_2

    .line 366
    :cond_7
    iget v0, p0, Lo/cgr;->d:F

    iget v1, p0, Lo/cgr;->i:F

    div-float/2addr v0, v1

    iget v1, p0, Lo/cgr;->k:F

    mul-float v10, v0, v1

    .line 368
    :goto_2
    int-to-double v0, v9

    .line 369
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    .line 370
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {p0, v1}, Lo/cgr;->a(F)Ljava/lang/String;

    move-result-object v1

    .line 368
    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1, v10}, Lo/cgr$b;->a(Lo/cgr$b;ILjava/lang/String;Ljava/lang/String;F)V

    .line 372
    goto :goto_4

    .line 374
    :cond_8
    iget v0, p0, Lo/cgr;->p:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_9

    .line 375
    iget v0, p0, Lo/cgr;->h:F

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget v2, p0, Lo/cgr;->d:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    iget v1, p0, Lo/cgr;->f:F

    add-float v10, v0, v1

    goto :goto_3

    .line 377
    :cond_9
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lo/cgr;->i:F

    div-float/2addr v0, v1

    iget v1, p0, Lo/cgr;->k:F

    mul-float v10, v0, v1

    .line 379
    :goto_3
    int-to-double v0, v9

    .line 380
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    .line 381
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {p0, v1}, Lo/cgr;->a(F)Ljava/lang/String;

    move-result-object v1

    .line 379
    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1, v10}, Lo/cgr$b;->a(Lo/cgr$b;ILjava/lang/String;Ljava/lang/String;F)V

    .line 387
    :goto_4
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 395
    iput-boolean p1, p0, Lo/cgr;->q:Z

    .line 396
    return-void
.end method

.method public getItemCount()I
    .locals 3

    .line 391
    iget-boolean v0, p0, Lo/cgr;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgr;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/cgr;->n:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public getItemViewType(I)I
    .locals 3

    .line 149
    if-nez p1, :cond_0

    .line 150
    const/4 v2, 0x1

    goto :goto_1

    .line 151
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 152
    const/4 v2, 0x2

    goto :goto_1

    .line 154
    :cond_1
    iget-boolean v0, p0, Lo/cgr;->r:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cgr;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/cgr;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    :goto_0
    if-ne p1, v0, :cond_3

    .line 155
    const/4 v2, 0x4

    goto :goto_1

    .line 157
    :cond_3
    iget-boolean v0, p0, Lo/cgr;->r:Z

    if-eqz v0, :cond_4

    .line 158
    iget-object v0, p0, Lo/cgr;->w:Ljava/util/List;

    add-int/lit8 v1, p1, -0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgr$e;

    iget v2, v0, Lo/cgr$e;->e:I

    goto :goto_1

    .line 160
    :cond_4
    const/4 v2, 0x3

    .line 163
    :goto_1
    return v2
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 30
    move-object v0, p1

    check-cast v0, Lo/cgr$b;

    invoke-virtual {p0, v0, p2}, Lo/cgr;->b(Lo/cgr$b;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 30
    invoke-virtual {p0, p1, p2}, Lo/cgr;->a(Landroid/view/ViewGroup;I)Lo/cgr$b;

    move-result-object v0

    return-object v0
.end method

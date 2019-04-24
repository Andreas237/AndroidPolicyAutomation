.class public Lo/cgs;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgs$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/cgs$a;>;"
    }
.end annotation


# static fields
.field private static final n:I

.field private static final s:I


# instance fields
.field private a:Landroid/content/Context;

.field private b:F

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:F

.field private f:F

.field private g:F

.field private h:Landroid/content/res/Resources;

.field private i:F

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;>;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:F

.field private o:D

.field private p:F

.field private q:Z

.field private r:I

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const-string v0, "#7FFFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cgs;->n:I

    .line 58
    const-string v0, "#FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/cgs;->s:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;FFFFFZDZI)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;>;Ljava/lang/String;Ljava/lang/String;FFFFFZDZI)V"
        }
    .end annotation

    .line 68
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgs;->k:Ljava/util/List;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgs;->h:Landroid/content/res/Resources;

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/cgs;->p:F

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/cgs;->m:F

    .line 69
    iput-object p1, p0, Lo/cgs;->a:Landroid/content/Context;

    .line 70
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/cgs;->h:Landroid/content/res/Resources;

    .line 71
    iput-object p2, p0, Lo/cgs;->k:Ljava/util/List;

    .line 72
    iput-object p3, p0, Lo/cgs;->c:Ljava/lang/String;

    .line 73
    iput-object p4, p0, Lo/cgs;->d:Ljava/lang/String;

    .line 74
    const/high16 v0, 0x45610000    # 3600.0f

    div-float/2addr v0, p5

    iput v0, p0, Lo/cgs;->b:F

    .line 75
    const/high16 v0, 0x45610000    # 3600.0f

    div-float/2addr v0, p6

    iput v0, p0, Lo/cgs;->e:F

    .line 76
    iput p9, p0, Lo/cgs;->i:F

    .line 77
    iput-wide p11, p0, Lo/cgs;->o:D

    .line 78
    iput p7, p0, Lo/cgs;->p:F

    .line 79
    iput p8, p0, Lo/cgs;->m:F

    .line 80
    iput-boolean p10, p0, Lo/cgs;->l:Z

    .line 82
    move/from16 v0, p14

    iput v0, p0, Lo/cgs;->r:I

    .line 83
    cmpl-float v0, p6, p5

    if-eqz v0, :cond_0

    .line 84
    iget v0, p0, Lo/cgs;->e:F

    iget v1, p0, Lo/cgs;->b:F

    div-float/2addr v0, v1

    iget v1, p0, Lo/cgs;->m:F

    iget v2, p0, Lo/cgs;->p:F

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lo/cgs;->f:F

    .line 85
    iget v0, p0, Lo/cgs;->p:F

    iget v1, p0, Lo/cgs;->m:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/cgs;->b:F

    iget v2, p0, Lo/cgs;->e:F

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iput v0, p0, Lo/cgs;->g:F

    .line 87
    :cond_0
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cgs;->u:Z

    .line 88
    return-void
.end method

.method private a(Landroid/widget/TextView;I)V
    .locals 0

    .line 107
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    return-void
.end method

.method private b(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 163
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_pace_mid_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 164
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_layout_distance_des:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 166
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_speed_mi_hour:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 169
    :cond_0
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_speed_km_hour:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    :goto_0
    iget-boolean v0, p0, Lo/cgs;->q:Z

    if-eqz v0, :cond_1

    .line 172
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_pacemap_title_line:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_item_linear:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 174
    invoke-virtual {v6}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 175
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lo/cgs;->a:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lo/cgs;->a:Landroid/content/Context;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v3, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 176
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    :cond_1
    iget-boolean v0, p0, Lo/cgs;->l:Z

    if-eqz v0, :cond_2

    .line 179
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_pace_mid_layout_distance_unit:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->n:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 180
    sget v0, Lo/cgs;->n:I

    invoke-direct {p0, v5, v0}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 182
    :cond_2
    return-object v4
.end method

.method private b(Landroid/view/View;)V
    .locals 5

    .line 243
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 244
    :cond_0
    const-string v0, "Track_SpeedMapRecyclerViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPaceDialog, mContext or view is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    return-void

    .line 247
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 248
    if-eqz v4, :cond_2

    .line 249
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 251
    :cond_2
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lo/cgs;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/cgs;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_service_area_notice_title:I

    .line 252
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/cgs;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_common_notification_know_tips:I

    .line 253
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/cgs$1;

    invoke-direct {v2, p0}, Lo/cgs$1;-><init>(Lo/cgs;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 259
    return-void
.end method

.method private c(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 142
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_show_pace_item_foot:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 143
    iget-boolean v0, p0, Lo/cgs;->q:Z

    if-eqz v0, :cond_0

    .line 144
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_show_pace_item_foot_layout:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 145
    invoke-virtual {v5}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 146
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lo/cgs;->a:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lo/cgs;->a:Landroid/content/Context;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v3, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 147
    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    :cond_0
    iget-boolean v0, p0, Lo/cgs;->l:Z

    if-eqz v0, :cond_2

    .line 150
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->n:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 151
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_use_time:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->n:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 152
    iget-boolean v0, p0, Lo/cgs;->u:Z

    if-eqz v0, :cond_1

    .line 153
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_rtl_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 155
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 158
    :cond_2
    :goto_0
    return-object v4
.end method

.method private c(F)Ljava/lang/String;
    .locals 4

    .line 429
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 187
    iget-boolean v0, p0, Lo/cgs;->q:Z

    if-eqz v0, :cond_0

    .line 188
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_pace_top_share_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 189
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 190
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_fast_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 191
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_linear2:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 192
    iget v0, p0, Lo/cgs;->r:I

    const/16 v1, 0x104

    if-ne v0, v1, :cond_1

    .line 193
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_linear1:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 197
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_detail_speed_top_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 198
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_linear2:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 201
    :cond_1
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 202
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 204
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 205
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 207
    :cond_2
    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 209
    :goto_1
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget-boolean v0, p0, Lo/cgs;->l:Z

    if-eqz v0, :cond_3

    .line 212
    sget v0, Lo/cgs;->s:I

    invoke-direct {p0, v4, v0}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 213
    sget v0, Lo/cgs;->s:I

    invoke-direct {p0, v5, v0}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 214
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->n:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 215
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_averagepace:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->s:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 216
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->n:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 217
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->hw_show_pace_fastpace:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->s:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 219
    :cond_3
    return-object v3
.end method

.method static synthetic e(Lo/cgs;Landroid/view/View;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/cgs;->b(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;I)Lo/cgs$a;
    .locals 5

    .line 114
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 115
    invoke-direct {p0, p1}, Lo/cgs;->d(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 116
    new-instance v4, Lo/cgs$a;

    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgs$a;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgs$4;)V

    goto/16 :goto_1

    .line 117
    :cond_0
    const/4 v0, 0x4

    if-ne v0, p2, :cond_1

    .line 118
    invoke-direct {p0, p1}, Lo/cgs;->c(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 119
    new-instance v4, Lo/cgs$a;

    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgs$a;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgs$4;)V

    .line 120
    iget-boolean v0, p0, Lo/cgs;->l:Z

    invoke-static {v4, v0}, Lo/cgs$a;->d(Lo/cgs$a;Z)V

    goto/16 :goto_1

    .line 121
    :cond_1
    const/4 v0, 0x2

    if-ne v0, p2, :cond_2

    .line 122
    invoke-direct {p0, p1}, Lo/cgs;->b(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 123
    new-instance v4, Lo/cgs$a;

    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgs$a;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgs$4;)V

    goto :goto_1

    .line 125
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_show_pace_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 126
    iget-boolean v0, p0, Lo/cgs;->l:Z

    if-eqz v0, :cond_4

    .line 127
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->listview_id:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cgs;->n:I

    invoke-direct {p0, v0, v1}, Lo/cgs;->a(Landroid/widget/TextView;I)V

    .line 128
    iget-boolean v0, p0, Lo/cgs;->u:Z

    if-eqz v0, :cond_3

    .line 129
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_rtl_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 131
    :cond_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_show_pace_progressbackground_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 134
    :cond_4
    :goto_0
    new-instance v4, Lo/cgs$a;

    iget-object v0, p0, Lo/cgs;->a:Landroid/content/Context;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v1, v2}, Lo/cgs$a;-><init>(Landroid/content/Context;Landroid/view/View;ILo/cgs$4;)V

    .line 135
    iget-boolean v0, p0, Lo/cgs;->l:Z

    invoke-static {v4, v0}, Lo/cgs$a;->d(Lo/cgs$a;Z)V

    .line 137
    :goto_1
    return-object v4
.end method

.method public c(Lo/cgs$a;I)V
    .locals 7

    .line 263
    invoke-static {p1}, Lo/cgs$a;->e(Lo/cgs$a;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 264
    iget-object v0, p0, Lo/cgs;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/cgs;->d:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lo/cgs$a;->d(Lo/cgs$a;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 265
    :cond_0
    invoke-static {p1}, Lo/cgs$a;->e(Lo/cgs$a;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 266
    iget-object v0, p0, Lo/cgs;->h:Landroid/content/res/Resources;

    invoke-static {p1, v0}, Lo/cgs$a;->d(Lo/cgs$a;Landroid/content/res/Resources;)V

    .line 267
    iget-object v0, p0, Lo/cgs;->k:Ljava/util/List;

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

    iget v1, p0, Lo/cgs;->i:F

    iget-wide v2, p0, Lo/cgs;->o:D

    invoke-static {p1, v0, v1, v2, v3}, Lo/cgs$a;->e(Lo/cgs$a;IFD)V

    goto/16 :goto_2

    .line 268
    :cond_1
    invoke-static {p1}, Lo/cgs$a;->e(Lo/cgs$a;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    goto/16 :goto_2

    .line 270
    :cond_2
    add-int/lit8 p2, p2, -0x2

    .line 271
    iget-object v0, p0, Lo/cgs;->k:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x989680

    div-int v4, v0, v1

    .line 272
    iget-object v0, p0, Lo/cgs;->h:Landroid/content/res/Resources;

    invoke-static {p1, v0}, Lo/cgs$a;->d(Lo/cgs$a;Landroid/content/res/Resources;)V

    .line 273
    iget-object v0, p0, Lo/cgs;->k:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x45610000    # 3600.0f

    div-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 274
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lo/cgs;->e:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_4

    .line 276
    iget v0, p0, Lo/cgs;->f:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 277
    iget v6, p0, Lo/cgs;->m:F

    goto :goto_0

    .line 279
    :cond_3
    iget v0, p0, Lo/cgs;->e:F

    iget v1, p0, Lo/cgs;->b:F

    div-float/2addr v0, v1

    iget v1, p0, Lo/cgs;->p:F

    mul-float v6, v0, v1

    .line 281
    :goto_0
    int-to-double v0, v4

    .line 282
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    .line 283
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {p0, v1}, Lo/cgs;->c(F)Ljava/lang/String;

    move-result-object v1

    .line 281
    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1, v6}, Lo/cgs$a;->d(Lo/cgs$a;ILjava/lang/String;Ljava/lang/String;F)V

    .line 285
    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lo/cgs;->b:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_5

    .line 286
    int-to-double v0, v4

    .line 287
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    .line 288
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {p0, v1}, Lo/cgs;->c(F)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/cgs;->p:F

    .line 286
    const/4 v3, 0x1

    invoke-static {p1, v3, v0, v1, v2}, Lo/cgs$a;->d(Lo/cgs$a;ILjava/lang/String;Ljava/lang/String;F)V

    goto :goto_2

    .line 293
    :cond_5
    iget v0, p0, Lo/cgs;->f:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 294
    iget v0, p0, Lo/cgs;->g:F

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget v2, p0, Lo/cgs;->e:F

    sub-float/2addr v1, v2

    mul-float/2addr v0, v1

    iget v1, p0, Lo/cgs;->m:F

    add-float v6, v0, v1

    goto :goto_1

    .line 296
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lo/cgs;->b:F

    div-float/2addr v0, v1

    iget v1, p0, Lo/cgs;->p:F

    mul-float v6, v0, v1

    .line 298
    :goto_1
    int-to-double v0, v4

    .line 299
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    .line 300
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-direct {p0, v1}, Lo/cgs;->c(F)Ljava/lang/String;

    move-result-object v1

    .line 298
    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1, v6}, Lo/cgs$a;->d(Lo/cgs$a;ILjava/lang/String;Ljava/lang/String;F)V

    .line 306
    :goto_2
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 314
    iput-boolean p1, p0, Lo/cgs;->q:Z

    .line 315
    return-void
.end method

.method public getItemCount()I
    .locals 3

    .line 310
    iget-object v0, p0, Lo/cgs;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/cgs;->i:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public getItemViewType(I)I
    .locals 3

    .line 93
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 94
    const/4 v2, 0x2

    goto :goto_0

    .line 95
    :cond_0
    if-nez p1, :cond_1

    .line 96
    const/4 v2, 0x1

    goto :goto_0

    .line 98
    :cond_1
    iget-object v0, p0, Lo/cgs;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    if-ne p1, v0, :cond_2

    .line 99
    const/4 v2, 0x4

    goto :goto_0

    .line 101
    :cond_2
    const/4 v2, 0x3

    .line 103
    :goto_0
    return v2
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lo/cgs$a;

    invoke-virtual {p0, v0, p2}, Lo/cgs;->c(Lo/cgs$a;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2}, Lo/cgs;->b(Landroid/view/ViewGroup;I)Lo/cgs$a;

    move-result-object v0

    return-object v0
.end method

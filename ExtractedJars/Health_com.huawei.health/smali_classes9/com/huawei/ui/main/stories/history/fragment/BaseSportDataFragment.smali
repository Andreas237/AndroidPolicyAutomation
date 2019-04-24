.class public abstract Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;,
        Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;,
        Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$b;
    }
.end annotation


# static fields
.field private static final Y:I

.field protected static final b:I

.field protected static final d:I


# instance fields
.field protected A:Z

.field protected B:Landroid/content/res/Resources;

.field protected C:Z

.field protected D:Z

.field protected E:I

.field protected F:Ljava/util/Date;

.field protected G:Ljava/util/Date;

.field protected H:I

.field protected I:I

.field protected J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

.field protected K:J

.field protected L:I

.field protected M:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;>;"
        }
    .end annotation
.end field

.field protected N:Landroid/os/Handler;

.field protected O:I

.field protected P:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;

.field protected Q:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;

.field protected R:J

.field protected S:Ljava/lang/String;

.field protected T:Ljava/lang/String;

.field protected U:Ljava/lang/String;

.field protected V:Ljava/lang/String;

.field protected W:Ljava/lang/String;

.field protected X:Ljava/lang/String;

.field protected Z:Lcom/huawei/hihealth/HiHealthData;

.field protected a:Landroid/content/Context;

.field protected aa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/chj;>;"
        }
    .end annotation
.end field

.field protected ab:Ljava/lang/String;

.field protected ac:I

.field private af:Z

.field private ag:Z

.field protected c:Landroid/view/View;

.field protected e:Landroid/view/View;

.field protected f:Landroid/widget/ImageView;

.field protected g:Landroid/view/View;

.field protected h:Landroid/widget/ImageView;

.field protected i:Landroid/view/View;

.field protected j:Lo/chj;

.field protected k:Landroid/widget/ImageView;

.field protected l:Landroid/graphics/drawable/AnimationDrawable;

.field protected m:Z

.field protected n:Ljava/lang/String;

.field protected o:Z

.field protected p:Z

.field protected q:Landroid/widget/TextView;

.field protected r:Landroid/widget/TextView;

.field protected s:Lo/che;

.field protected t:Landroid/widget/TextView;

.field protected u:Landroid/widget/TextView;

.field protected v:Lo/chj;

.field protected w:Lo/chj;

.field protected x:Lo/chj;

.field protected y:Lo/chj;

.field protected z:Lo/chj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Y:I

    .line 61
    const-string v0, "#0ac700"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->d:I

    .line 62
    const-string v0, "#06b300"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 55
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->p:Z

    .line 87
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->m:Z

    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->o:Z

    .line 89
    const-string v0, "--"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    .line 97
    new-instance v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$b;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->N:Landroid/os/Handler;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->M:Ljava/util/ArrayList;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->af:Z

    .line 105
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->O:I

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    .line 112
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->ac:I

    return-void
.end method

.method private a(D)V
    .locals 5

    .line 241
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->t:Landroid/widget/TextView;

    const-wide v1, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->t:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Z)Z
    .locals 0

    .line 55
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->af:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->l()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Z)Z
    .locals 0

    .line 55
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->ag:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->ag:Z

    return v0
.end method

.method private d(D)V
    .locals 14

    .line 249
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    div-double v8, p1, v0

    .line 250
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->C:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpl-double v0, v8, v0

    if-lez v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    div-double v1, v8, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v8, v9, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 257
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v10, v0, v2

    .line 258
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->C:Z

    if-eqz v0, :cond_1

    const-wide v0, 0x40f86a0000000000L    # 100000.0

    cmpl-double v0, v10, v0

    if-ltz v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->z:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-wide v4, 0x40c3880000000000L    # 10000.0

    div-double v4, v10, v4

    const/4 v6, 0x1

    const/4 v7, 0x2

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 261
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->z:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v10, v11, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 264
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->U:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 265
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->C:Z

    if-eqz v0, :cond_2

    const-wide v0, 0x40f86a0000000000L    # 100000.0

    cmpl-double v0, v12, v0

    if-ltz v0, :cond_2

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->v:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-wide v4, 0x40c3880000000000L    # 10000.0

    div-double v4, v12, v4

    const/4 v6, 0x1

    const/4 v7, 0x2

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 268
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->v:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v12, v13, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 270
    :goto_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->af:Z

    return v0
.end method

.method private e(Lo/chj$b;)Lo/chj;
    .locals 3

    .line 422
    new-instance v2, Lo/chj;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/chj;-><init>(Landroid/content/Context;)V

    .line 423
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->I:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->E:I

    invoke-virtual {v2, v0, v1}, Lo/chj;->setGroupSize(II)V

    .line 424
    invoke-virtual {v2, p1}, Lo/chj;->setItemView(Lo/chj$b;)V

    .line 425
    sget v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Y:I

    invoke-virtual {v2, v0}, Lo/chj;->setTextColor(I)V

    .line 426
    invoke-virtual {v2}, Lo/chj;->d()V

    .line 427
    return-object v2
.end method

.method private l()V
    .locals 0

    .line 193
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->q()V

    .line 194
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->v()V

    .line 195
    return-void
.end method

.method private q()V
    .locals 4

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    if-nez v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->z:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->j:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->j:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->w:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->x:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->v:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 207
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->o:Z

    goto :goto_0

    .line 209
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->r()V

    .line 211
    :goto_0
    return-void
.end method

.method private r()V
    .locals 11

    .line 214
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->o:Z

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->V:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->ab:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    sub-double v4, v0, v2

    .line 216
    const-wide/16 v0, 0x0

    cmpg-double v0, v4, v0

    if-gtz v0, :cond_0

    .line 217
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->o:Z

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->j:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->j:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    double-to-int v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v2

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->W:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v8, v0, v2

    .line 223
    const-wide/16 v0, 0x0

    cmpg-double v0, v6, v0

    if-lez v0, :cond_1

    const-wide/16 v0, 0x0

    cmpg-double v0, v8, v0

    if-gtz v0, :cond_2

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->w:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->x:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 228
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    if-eqz v0, :cond_3

    .line 229
    const-wide v0, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v0, v8

    div-double v0, v6, v0

    double-to-float v10, v0

    goto :goto_0

    .line 231
    :cond_3
    div-double v0, v6, v8

    double-to-float v10, v0

    .line 233
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->w:Lo/chj;

    invoke-static {v10}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->x:Lo/chj;

    invoke-static {v10}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 236
    :goto_1
    invoke-direct {p0, v6, v7}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->d(D)V

    .line 237
    invoke-direct {p0, v8, v9}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a(D)V

    .line 238
    return-void
.end method

.method private s()V
    .locals 8

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/che;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->s:Lo/che;

    .line 347
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    .line 348
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    .line 349
    const-string v7, "/"

    .line 350
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    if-eqz v0, :cond_0

    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 353
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 355
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_avragepace:I

    .line 356
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v7}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->w:Lo/chj;

    .line 357
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    .line 358
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    .line 359
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->x:Lo/chj;

    .line 360
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->track_ic_health_img_detail_record_steps:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_steps:I

    .line 361
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->v:Lo/chj;

    .line 362
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_times:I

    .line 363
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->j:Lo/chj;

    .line 364
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_calories:I

    .line 365
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->z:Lo/chj;

    .line 366
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->v()V

    .line 367
    return-void
.end method

.method private t()V
    .locals 6

    .line 285
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->C:Z

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->A:Z

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n:Ljava/lang/String;

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_data:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->g:Landroid/view/View;

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->E:I

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v4

    .line 294
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v4, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->I:I

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->t:Landroid/widget/TextView;

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->u:Landroid/widget/TextView;

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_scrollbarchart:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->u:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 300
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 301
    const/16 v0, 0xf

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 304
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->s()V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_time_date_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->q:Landroid/widget/TextView;

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_up_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->f:Landroid/widget/ImageView;

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_up_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->k:Landroid/widget/ImageView;

    .line 309
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->A:Z

    if-eqz v0, :cond_1

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 313
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 316
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->c:Landroid/view/View;

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->i:Landroid/view/View;

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->c:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$5;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->i:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$2;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->sport_data_bar_y:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->r:Landroid/widget/TextView;

    .line 338
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    if-eqz v0, :cond_2

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->q()V

    .line 343
    return-void
.end method

.method private u()V
    .locals 2

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->h:Landroid/widget/ImageView;

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->sleep_loading_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->h:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->l:Landroid/graphics/drawable/AnimationDrawable;

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 282
    return-void
.end method

.method private v()V
    .locals 5

    .line 384
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->o:Z

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 387
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 389
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->x()V

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->s:Lo/che;

    invoke-virtual {v0}, Lo/che;->removeAllViews()V

    .line 391
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/chj;

    .line 393
    invoke-virtual {v3}, Lo/chj;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 394
    if-eqz v4, :cond_1

    .line 395
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 397
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->s:Lo/che;

    invoke-virtual {v0, v3}, Lo/che;->addView(Landroid/view/View;)V

    .line 398
    and-int/lit8 v0, v2, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq v2, v0, :cond_2

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->s:Lo/che;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->w()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/che;->addView(Landroid/view/View;)V

    .line 391
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 403
    :cond_3
    :goto_1
    return-void
.end method

.method private w()Landroid/view/View;
    .locals 5

    .line 437
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 438
    sget v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Y:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 439
    const v0, 0x3dcccccd    # 0.1f

    invoke-virtual {v4, v0}, Landroid/view/View;->setAlpha(F)V

    .line 440
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    iget v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->I:I

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$dimen;->sport_data_cut_line_height:I

    .line 441
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 440
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 442
    return-object v4
.end method

.method private x()V
    .locals 2

    .line 406
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->j:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->z:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->x:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->w:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->j:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->y:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->z:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->w:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->aa:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->v:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 419
    :goto_0
    return-void
.end method

.method private y()I
    .locals 1

    .line 370
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->m()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 372
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_ride:I

    return v0

    .line 374
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_walk:I

    return v0

    .line 377
    :goto_0
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_run:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected a(II)V
    .locals 2

    .line 446
    if-lez p1, :cond_0

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->i:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 453
    :goto_0
    if-lt p1, p2, :cond_1

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->c:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 457
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 459
    :goto_1
    return-void
.end method

.method protected abstract a(Z)V
.end method

.method protected abstract b()V
.end method

.method public abstract c()V
.end method

.method protected abstract c(I)V
.end method

.method public d()V
    .locals 0

    .line 922
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->k()V

    .line 923
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 116
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->c(I)V

    .line 117
    return-void
.end method

.method protected abstract e()V
.end method

.method protected f()Z
    .locals 1

    .line 882
    const/4 v0, 0x0

    return v0
.end method

.method public abstract g()V
.end method

.method protected abstract h()I
.end method

.method protected abstract i()D
.end method

.method protected abstract k()V
.end method

.method protected abstract m()I
.end method

.method public abstract n()Z
.end method

.method protected abstract o()V
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
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

    .line 172
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    .line 173
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_sport_data:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    .line 174
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->R:J

    .line 175
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->o()V

    .line 176
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->t()V

    .line 177
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->g()V

    .line 178
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->u()V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->N:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 463
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->l:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 467
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->N:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->N:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 470
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b()V

    .line 471
    return-void
.end method

.method protected p()V
    .locals 10

    .line 886
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    const/high16 v1, 0x40800000    # 4.0f

    goto :goto_0

    :cond_0
    const/high16 v1, 0x41000000    # 8.0f

    :goto_0
    const/4 v2, 0x1

    invoke-static {v2, v1}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(F)V

    .line 887
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->b:I

    sget v2, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->d:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(II)V

    .line 888
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->d:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(I)V

    .line 889
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_nodata:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Ljava/lang/String;)V

    .line 898
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->A:Z

    if-eqz v0, :cond_1

    .line 899
    const/4 v0, 0x1

    const/high16 v1, 0x41980000    # 19.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v8

    .line 900
    const/4 v0, 0x1

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v9

    goto :goto_1

    .line 902
    :cond_1
    const/4 v0, 0x1

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v8

    .line 903
    const/4 v0, 0x1

    const/high16 v1, 0x41980000    # 19.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v9

    .line 905
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0, v8, v9}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->setPadding(FF)V

    .line 906
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->B:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->setDataUnit(Ljava/lang/String;)V

    .line 907
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(I)V

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {v0, p0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;)V

    .line 909
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->i()D

    move-result-wide v2

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(IDDD)V

    .line 910
    return-void
.end method

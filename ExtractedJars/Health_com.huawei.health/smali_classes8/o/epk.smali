.class public Lo/epk;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field private static f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Ljava/lang/String;

.field private B:Z

.field private C:Z

.field private final D:Ljava/lang/String;

.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/ImageView;

.field d:Landroid/widget/RelativeLayout;

.field e:Landroid/widget/ImageView;

.field private g:Lo/fgh;

.field private h:Lo/fgh;

.field private i:I

.field private k:Landroid/content/res/Resources;

.field private l:[D

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private n:I

.field private o:[I

.field private p:[I

.field private q:[I

.field private r:[D

.field private s:[D

.field private t:[D

.field private u:[I

.field private v:[I

.field private w:I

.field private x:I

.field private y:[I

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/epk;->f:Ljava/util/List;

    .line 33
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "jv"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "in"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "ka"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "km"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "ms"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "my"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "nb"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    const-string v1, "sl"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 94
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/epk;->i:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/epk;->n:I

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epk;->m:Ljava/util/ArrayList;

    .line 63
    const/4 v0, 0x6

    new-array v0, v0, [D

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/epk;->t:[D

    .line 64
    const/4 v0, 0x6

    new-array v0, v0, [D

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/epk;->s:[D

    .line 65
    const/4 v0, 0x6

    new-array v0, v0, [D

    fill-array-data v0, :array_2

    iput-object v0, p0, Lo/epk;->r:[D

    .line 66
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    iput-object v0, p0, Lo/epk;->u:[I

    .line 67
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    iput-object v0, p0, Lo/epk;->q:[I

    .line 68
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    iput-object v0, p0, Lo/epk;->y:[I

    .line 69
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_6

    iput-object v0, p0, Lo/epk;->v:[I

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lo/epk;->x:I

    .line 73
    const/4 v0, -0x1

    iput v0, p0, Lo/epk;->w:I

    .line 74
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/epk;->z:F

    .line 76
    invoke-virtual {p0}, Lo/epk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epk;->A:Ljava/lang/String;

    .line 77
    invoke-virtual {p0}, Lo/epk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epk;->D:Ljava/lang/String;

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epk;->B:Z

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epk;->C:Z

    .line 95
    invoke-virtual {p0}, Lo/epk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/epk;->k:Landroid/content/res/Resources;

    .line 96
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/epk;->B:Z

    .line 98
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->health_sport_target_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 99
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout:I

    invoke-virtual {p0, v0}, Lo/epk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/epk;->d:Landroid/widget/RelativeLayout;

    .line 100
    sget v0, Lcom/huawei/ui/homehealth/R$id;->two_picker_layout:I

    invoke-virtual {p0, v0}, Lo/epk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/epk;->b:Landroid/widget/LinearLayout;

    .line 103
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_target_type_picker:I

    invoke-virtual {p0, v0}, Lo/epk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/epk;->h:Lo/fgh;

    .line 104
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_target_value_picker:I

    invoke-virtual {p0, v0}, Lo/epk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/epk;->g:Lo/fgh;

    .line 105
    invoke-virtual {p0}, Lo/epk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 106
    const-string v0, "kk"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    iget-object v1, p0, Lo/epk;->g:Lo/fgh;

    const/high16 v2, 0x41600000    # 14.0f

    invoke-virtual {v1, v2}, Lo/fgh;->c(F)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fgh;->setMaxTestSize(I)V

    .line 108
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    iget-object v1, p0, Lo/epk;->g:Lo/fgh;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v1, v2}, Lo/fgh;->c(F)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fgh;->setMinTestSize(I)V

    goto :goto_0

    .line 109
    :cond_0
    sget-object v0, Lo/epk;->f:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    iget-object v1, p0, Lo/epk;->g:Lo/fgh;

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v1, v2}, Lo/fgh;->c(F)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fgh;->setMaxTestSize(I)V

    .line 111
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    iget-object v1, p0, Lo/epk;->g:Lo/fgh;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v1, v2}, Lo/fgh;->c(F)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fgh;->setMinTestSize(I)V

    .line 113
    :cond_1
    :goto_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_target_picker_img_top:I

    invoke-virtual {p0, v0}, Lo/epk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epk;->c:Landroid/widget/ImageView;

    .line 114
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_target_picker_img_bottom:I

    invoke-virtual {p0, v0}, Lo/epk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epk;->e:Landroid/widget/ImageView;

    .line 118
    invoke-direct {p0}, Lo/epk;->c()V

    .line 120
    invoke-direct {p0}, Lo/epk;->a()V

    .line 122
    iget-object v0, p0, Lo/epk;->h:Lo/fgh;

    new-instance v1, Lo/epk$3;

    invoke-direct {v1, p0}, Lo/epk$3;-><init>(Lo/epk;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 128
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    new-instance v1, Lo/epk$2;

    invoke-direct {v1, p0}, Lo/epk$2;-><init>(Lo/epk;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 134
    return-void

    :array_0
    .array-data 8
        0x3ff0000000000000L    # 1.0
        0x4008000000000000L    # 3.0
        0x4014000000000000L    # 5.0
        0x4024000000000000L    # 10.0
        0x403518f5c28f5c29L    # 21.0975
        0x404518f5c28f5c29L    # 42.195
    .end array-data

    :array_1
    .array-data 8
        0x4014000000000000L    # 5.0
        0x4034000000000000L    # 20.0
        0x403e000000000000L    # 30.0
        0x4044000000000000L    # 40.0
        0x405e000000000000L    # 120.0
        0x4066800000000000L    # 180.0
    .end array-data

    :array_2
    .array-data 8
        0x3ff0000000000000L    # 1.0
        0x4008000000000000L    # 3.0
        0x4014000000000000L    # 5.0
        0x4024000000000000L    # 10.0
        0x4034000000000000L    # 20.0
        0x4044000000000000L    # 40.0
    .end array-data

    :array_3
    .array-data 4
        0xa
        0x14
        0x1e
        0x3c
        0x78
        0xb4
    .end array-data

    :array_4
    .array-data 4
        0x1e
        0x3c
        0x5a
        0x78
        0x96
        0xb4
    .end array-data

    :array_5
    .array-data 4
        0x64
        0xc8
        0x12c
        0x1f4
        0x258
        0x320
    .end array-data

    :array_6
    .array-data 4
        0x32
        0x64
        0xc8
        0x12c
        0x1f4
        0x258
    .end array-data
.end method

.method private a(I)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 316
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 317
    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    return-object v1
.end method

.method private a()V
    .locals 3

    .line 176
    iget-object v0, p0, Lo/epk;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 177
    iget-object v0, p0, Lo/epk;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/epk;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 178
    iget-object v0, p0, Lo/epk;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/epk;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 179
    iget-object v0, p0, Lo/epk;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/epk;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 181
    iget-object v0, p0, Lo/epk;->h:Lo/fgh;

    iget-object v1, p0, Lo/epk;->m:Ljava/util/ArrayList;

    iget v2, p0, Lo/epk;->i:I

    invoke-virtual {v0, v1, v2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 182
    iget v0, p0, Lo/epk;->i:I

    iget v1, p0, Lo/epk;->n:I

    invoke-direct {p0, v0, v1}, Lo/epk;->d(II)V

    .line 184
    return-void
.end method

.method static synthetic a(Lo/epk;II)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lo/epk;->d(II)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 224
    iget v0, p0, Lo/epk;->x:I

    const/16 v1, 0x101

    if-ne v0, v1, :cond_0

    .line 225
    iget-object v0, p0, Lo/epk;->r:[D

    iput-object v0, p0, Lo/epk;->l:[D

    .line 226
    iget-object v0, p0, Lo/epk;->v:[I

    iput-object v0, p0, Lo/epk;->p:[I

    .line 227
    iget-object v0, p0, Lo/epk;->u:[I

    iput-object v0, p0, Lo/epk;->o:[I

    goto :goto_0

    .line 228
    :cond_0
    iget v0, p0, Lo/epk;->x:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_1

    .line 229
    iget-object v0, p0, Lo/epk;->s:[D

    iput-object v0, p0, Lo/epk;->l:[D

    .line 230
    iget-object v0, p0, Lo/epk;->y:[I

    iput-object v0, p0, Lo/epk;->p:[I

    .line 231
    iget-object v0, p0, Lo/epk;->q:[I

    iput-object v0, p0, Lo/epk;->o:[I

    goto :goto_0

    .line 233
    :cond_1
    iget-object v0, p0, Lo/epk;->t:[D

    iput-object v0, p0, Lo/epk;->l:[D

    .line 234
    iget-object v0, p0, Lo/epk;->y:[I

    iput-object v0, p0, Lo/epk;->p:[I

    .line 235
    iget-object v0, p0, Lo/epk;->u:[I

    iput-object v0, p0, Lo/epk;->o:[I

    .line 237
    :goto_0
    return-void
.end method

.method private c()V
    .locals 3

    .line 138
    invoke-virtual {p0}, Lo/epk;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->d(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lo/epk;->x:I

    .line 139
    invoke-virtual {p0}, Lo/epk;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/epk;->x:I

    invoke-static {v0, v1}, Lo/ets;->e(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lo/epk;->w:I

    .line 140
    invoke-virtual {p0}, Lo/epk;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lo/epk;->x:I

    invoke-static {v0, v1}, Lo/ets;->a(Landroid/content/Context;I)F

    move-result v0

    iput v0, p0, Lo/epk;->z:F

    .line 142
    iget-object v0, p0, Lo/epk;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_none_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    iget-object v0, p0, Lo/epk;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_distance_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    iget-object v0, p0, Lo/epk;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_time_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    iget-object v0, p0, Lo/epk;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_calorie_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    invoke-direct {p0}, Lo/epk;->b()V

    .line 150
    iget v0, p0, Lo/epk;->w:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 152
    :pswitch_0
    const/4 v0, 0x1

    iput v0, p0, Lo/epk;->i:I

    .line 153
    goto :goto_1

    .line 155
    :pswitch_1
    const/4 v0, 0x2

    iput v0, p0, Lo/epk;->i:I

    .line 156
    goto :goto_1

    .line 158
    :pswitch_2
    const/4 v0, 0x3

    iput v0, p0, Lo/epk;->i:I

    .line 159
    goto :goto_1

    .line 162
    :goto_0
    :pswitch_3
    const/4 v0, 0x0

    iput v0, p0, Lo/epk;->i:I

    .line 166
    :goto_1
    invoke-direct {p0}, Lo/epk;->getTargetValueLocationByTargetValue()I

    move-result v0

    iput v0, p0, Lo/epk;->n:I

    .line 170
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic c(Lo/epk;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/epk;->setOnTargetValueSelect(I)V

    return-void
.end method

.method private d(II)V
    .locals 4

    .line 286
    iput p1, p0, Lo/epk;->i:I

    .line 288
    const-string v0, "Track_HealthSportTargetChoiceWheelPickerView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "targetTypePosition "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "targetValuePosition "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 292
    :pswitch_0
    const/4 v0, 0x1

    iput v0, p0, Lo/epk;->w:I

    .line 293
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lo/epk;->e(I)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 294
    invoke-direct {p0, p2}, Lo/epk;->setOnTargetValueSelect(I)V

    .line 295
    goto :goto_1

    .line 297
    :pswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lo/epk;->w:I

    .line 298
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lo/epk;->e(I)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 299
    invoke-direct {p0, p2}, Lo/epk;->setOnTargetValueSelect(I)V

    .line 300
    goto :goto_1

    .line 302
    :pswitch_2
    const/4 v0, 0x2

    iput v0, p0, Lo/epk;->w:I

    .line 303
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lo/epk;->e(I)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 304
    invoke-direct {p0, p2}, Lo/epk;->setOnTargetValueSelect(I)V

    .line 305
    goto :goto_1

    .line 308
    :goto_0
    :pswitch_3
    const/4 v0, -0x1

    iput v0, p0, Lo/epk;->w:I

    .line 309
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    iget v1, p0, Lo/epk;->x:I

    invoke-direct {p0, v1}, Lo/epk;->a(I)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 310
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/epk;->setOnTargetValueSelect(I)V

    .line 313
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private getTargetValueLocationByTargetValue()I
    .locals 5

    .line 191
    iget v0, p0, Lo/epk;->w:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 193
    :pswitch_0
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/epk;->l:[D

    array-length v0, v0

    if-ge v4, v0, :cond_1

    .line 194
    iget v0, p0, Lo/epk;->z:F

    float-to-double v0, v0

    iget-object v2, p0, Lo/epk;->l:[D

    aget-wide v2, v2, v4

    sub-double/2addr v0, v2

    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 195
    add-int/lit8 v0, v4, 0x1

    return v0

    .line 193
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 199
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 202
    :pswitch_1
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lo/epk;->o:[I

    array-length v0, v0

    if-ge v4, v0, :cond_3

    .line 203
    iget v0, p0, Lo/epk;->z:F

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x3c

    iget-object v1, p0, Lo/epk;->o:[I

    aget v1, v1, v4

    if-ne v0, v1, :cond_2

    .line 204
    add-int/lit8 v0, v4, 0x1

    return v0

    .line 202
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 208
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 210
    :pswitch_2
    const/4 v4, 0x0

    :goto_2
    iget-object v0, p0, Lo/epk;->p:[I

    array-length v0, v0

    if-ge v4, v0, :cond_5

    .line 211
    iget v0, p0, Lo/epk;->z:F

    float-to-int v0, v0

    div-int/lit16 v0, v0, 0x3e8

    iget-object v1, p0, Lo/epk;->p:[I

    aget v1, v1, v4

    if-ne v0, v1, :cond_4

    .line 212
    add-int/lit8 v0, v4, 0x1

    return v0

    .line 210
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 216
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 219
    :goto_3
    :pswitch_3
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private setOnTargetValueSelect(I)V
    .locals 5

    .line 244
    iput p1, p0, Lo/epk;->n:I

    .line 245
    iget v0, p0, Lo/epk;->w:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 246
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epk;->C:Z

    .line 247
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/epk;->z:F

    .line 248
    return-void

    .line 250
    :cond_0
    if-nez p1, :cond_1

    .line 252
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/epk;->z:F

    .line 253
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epk;->C:Z

    .line 254
    return-void

    .line 257
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epk;->C:Z

    .line 260
    :try_start_0
    iget v0, p0, Lo/epk;->w:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 262
    :pswitch_0
    iget-object v0, p0, Lo/epk;->l:[D

    add-int/lit8 v1, p1, -0x1

    aget-wide v0, v0, v1

    double-to-float v0, v0

    iput v0, p0, Lo/epk;->z:F

    .line 263
    goto :goto_1

    .line 265
    :pswitch_1
    iget-object v0, p0, Lo/epk;->o:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/epk;->z:F

    .line 266
    goto :goto_1

    .line 268
    :pswitch_2
    iget-object v0, p0, Lo/epk;->p:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/epk;->z:F

    .line 269
    goto :goto_1

    .line 272
    :goto_0
    :pswitch_3
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/epk;->z:F
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    :goto_1
    goto :goto_2

    .line 275
    :catch_0
    move-exception v4

    .line 276
    const-string v0, "Track_HealthSportTargetChoiceWheelPickerView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "index out of bounds : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " targetType : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/epk;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const-string v0, "Track_HealthSportTargetChoiceWheelPickerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public d()Z
    .locals 1

    .line 332
    iget-boolean v0, p0, Lo/epk;->C:Z

    return v0
.end method

.method public e(I)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 350
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 352
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_target_custom:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 355
    :pswitch_0
    iget-object v7, p0, Lo/epk;->o:[I

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_0

    aget v10, v7, v9

    .line 356
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_motiontrack_start_track_sport_min_number:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v10, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 358
    :cond_0
    goto/16 :goto_6

    .line 360
    :pswitch_1
    iget-object v0, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 361
    iget-object v7, p0, Lo/epk;->p:[I

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_1

    aget v10, v7, v9

    .line 362
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v2, v10

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 365
    :cond_1
    goto/16 :goto_6

    .line 368
    :goto_2
    :pswitch_2
    iget-boolean v0, p0, Lo/epk;->B:Z

    if-eqz v0, :cond_3

    .line 369
    iget-object v0, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 370
    iget-object v7, p0, Lo/epk;->l:[D

    array-length v8, v7

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v8, :cond_2

    aget-wide v10, v7, v9

    .line 371
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x3

    invoke-static {v10, v11, v2}, Lo/cxh;->a(DI)D

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_2
    goto/16 :goto_6

    .line 375
    :cond_3
    iget-object v0, p0, Lo/epk;->k:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 376
    iget-object v7, p0, Lo/epk;->l:[D

    array-length v8, v7

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_6

    aget-wide v10, v7, v9

    .line 377
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    sub-double v0, v10, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_4

    .line 378
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 379
    :cond_4
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    sub-double v0, v10, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_5

    .line 380
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epk;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 382
    :cond_5
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v10, v11, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 391
    :cond_6
    :goto_6
    iget-object v0, p0, Lo/epk;->a:Ljava/util/ArrayList;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public getSelectedTargetType()I
    .locals 1

    .line 325
    iget v0, p0, Lo/epk;->w:I

    return v0
.end method

.method public getSelectedTargetValue()F
    .locals 1

    .line 328
    iget v0, p0, Lo/epk;->z:F

    return v0
.end method

.method public setSelectedFirst(I)V
    .locals 2

    .line 338
    iput p1, p0, Lo/epk;->i:I

    .line 339
    iget-object v0, p0, Lo/epk;->h:Lo/fgh;

    iget v1, p0, Lo/epk;->i:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 340
    return-void
.end method

.method public setSelectedSecond(I)V
    .locals 2

    .line 342
    iput p1, p0, Lo/epk;->n:I

    .line 343
    iget-object v0, p0, Lo/epk;->g:Lo/fgh;

    iget v1, p0, Lo/epk;->n:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 344
    return-void
.end method

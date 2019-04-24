.class public Lo/fcq;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcq$b;
    }
.end annotation


# static fields
.field private static final f:[I

.field private static final l:[I

.field private static final m:[I

.field private static final p:[I


# instance fields
.field private final a:Lo/acu;

.field private b:Landroid/content/Context;

.field private final c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fcy;>;"
        }
    .end annotation
.end field

.field private e:Lo/acn;

.field private g:I

.field private h:B

.field private i:Z

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 91
    const/16 v0, 0xf

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_BMI:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_water:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_metabolism:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_haslet:I

    const/4 v2, 0x4

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_muscle:I

    const/4 v2, 0x5

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_bone:I

    const/4 v2, 0x6

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_protein:I

    const/4 v2, 0x7

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_bodyage:I

    const/16 v2, 0x8

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_string:I

    const/16 v2, 0x9

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_pressure_index:I

    const/16 v2, 0xa

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_skeletal_muscle_mass:I

    const/16 v2, 0xb

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type:I

    const/16 v2, 0xc

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_weight:I

    const/16 v2, 0xd

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_ideal_body_fat:I

    const/16 v2, 0xe

    aput v1, v0, v2

    sput-object v0, Lo/fcq;->f:[I

    .line 106
    const/16 v0, 0xf

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_sport_cal_unit_new:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_haslet_unit:I

    const/4 v2, 0x4

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    const/4 v2, 0x5

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    const/4 v2, 0x6

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    const/4 v2, 0x7

    aput v1, v0, v2

    const/4 v1, 0x0

    const/16 v2, 0x8

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_measure_pressure_result_heart_rate_unit:I

    const/16 v2, 0x9

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    const/16 v2, 0xa

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    const/16 v2, 0xb

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    const/16 v2, 0xc

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    const/16 v2, 0xd

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    const/16 v2, 0xe

    aput v1, v0, v2

    sput-object v0, Lo/fcq;->m:[I

    .line 122
    const/16 v0, 0xf

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_fatrate:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_bmi:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->icon_waterrate:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_metabolize:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_visceral:I

    const/4 v2, 0x4

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_muscle:I

    const/4 v2, 0x5

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_bonesalt:I

    const/4 v2, 0x6

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_protein:I

    const/4 v2, 0x7

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_physicalage:I

    const/16 v2, 0x8

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_heartrate:I

    const/16 v2, 0x9

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_stress_index:I

    const/16 v2, 0xa

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_skeletalmuscle:I

    const/16 v2, 0xb

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_bodytype:I

    const/16 v2, 0xc

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_weight_share:I

    const/16 v2, 0xd

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_fatrate:I

    const/16 v2, 0xe

    aput v1, v0, v2

    sput-object v0, Lo/fcq;->p:[I

    .line 129
    const/16 v0, 0xf

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_fatrate_mirror:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_bmi_mirror:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->icon_waterrate:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_metabolize:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_visceral:I

    const/4 v2, 0x4

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_muscle_mirror:I

    const/4 v2, 0x5

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_bonesalt_mirror:I

    const/4 v2, 0x6

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_protein_mirror:I

    const/4 v2, 0x7

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_physicalage:I

    const/16 v2, 0x8

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_heartrate_mirror:I

    const/16 v2, 0x9

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_stress_index_mirror:I

    const/16 v2, 0xa

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_skeletalmuscle_mirror:I

    const/16 v2, 0xb

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_bodytype:I

    const/16 v2, 0xc

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_weight_share:I

    const/16 v2, 0xd

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_fatrate_mirror:I

    const/16 v2, 0xe

    aput v1, v0, v2

    sput-object v0, Lo/fcq;->l:[I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lo/acn;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fcy;>;Landroid/content/Context;Lo/acn;)V"
        }
    .end annotation

    .line 65
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 66
    iput-object p1, p0, Lo/fcq;->d:Ljava/util/List;

    .line 67
    iput-object p2, p0, Lo/fcq;->b:Landroid/content/Context;

    .line 68
    iput-object p3, p0, Lo/fcq;->e:Lo/acn;

    .line 69
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lo/fcq;->a:Lo/acu;

    .line 70
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/xy;->c(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/fcq;->c:I

    .line 71
    iget-object v0, p0, Lo/fcq;->e:Lo/acn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 72
    const-string v0, "WeightShareBodyIndexAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightShareBodyIndexAdapter mBean is null.."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void

    .line 75
    :cond_0
    iget-object v0, p0, Lo/fcq;->e:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/fcq;->e:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_1

    .line 76
    iget-object v0, p0, Lo/fcq;->e:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    iput v0, p0, Lo/fcq;->g:I

    .line 77
    iget-object v0, p0, Lo/fcq;->e:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iput-byte v0, p0, Lo/fcq;->h:B

    .line 78
    iget-object v0, p0, Lo/fcq;->e:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    iput v0, p0, Lo/fcq;->k:I

    goto :goto_0

    .line 80
    :cond_1
    iget-object v0, p0, Lo/fcq;->a:Lo/acu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 81
    const-string v0, "WeightShareBodyIndexAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightShareBodyIndexAdapter mUser is null.."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void

    .line 84
    :cond_2
    iget-object v0, p0, Lo/fcq;->a:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->b()I

    move-result v0

    iput v0, p0, Lo/fcq;->g:I

    .line 85
    iget-object v0, p0, Lo/fcq;->a:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v0

    iput-byte v0, p0, Lo/fcq;->h:B

    .line 86
    iget-object v0, p0, Lo/fcq;->a:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    iput v0, p0, Lo/fcq;->k:I

    .line 88
    :goto_0
    return-void
.end method

.method private a(Landroid/widget/TextView;)V
    .locals 2

    .line 302
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 305
    :cond_0
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_kg:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    :goto_0
    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .line 163
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 1

    .line 283
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcq;->i:Z

    .line 284
    invoke-virtual {p0}, Lo/fcq;->notifyDataSetChanged()V

    .line 285
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 138
    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 4

    .line 143
    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 144
    const-string v0, "WeightShareBodyIndexAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "listData is null... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 148
    :cond_1
    const-string v0, "WeightShareBodyIndexAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position Out of bounds exception... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_2
    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 157
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 13

    .line 175
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 176
    new-instance v8, Lo/fcq$b;

    invoke-direct {v8}, Lo/fcq$b;-><init>()V

    .line 177
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_weight_share_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->item_weight_bottom_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v8, v0}, Lo/fcq$b;->c(Lo/fcq$b;Landroid/view/View;)Landroid/view/View;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_share_grade:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v8, v0}, Lo/fcq$b;->c(Lo/fcq$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_share_grade_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v8, v0}, Lo/fcq$b;->a(Lo/fcq$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_share_grade_score:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v8, v0}, Lo/fcq$b;->d(Lo/fcq$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->item_weight_current_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v8, v0}, Lo/fcq$b;->e(Lo/fcq$b;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->tv_weight_share_grade_unit:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v8, v0}, Lo/fcq$b;->e(Lo/fcq$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 185
    invoke-virtual {p2, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 187
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/fcq$b;

    .line 190
    :goto_0
    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/fcy;

    .line 193
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    if-nez v0, :cond_1

    .line 194
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fcq;->h:B

    iget v3, p0, Lo/fcq;->g:I

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->b(DBILandroid/widget/TextView;)V

    goto/16 :goto_1

    .line 195
    :cond_1
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 196
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fek;->a(DLandroid/widget/TextView;)V

    goto/16 :goto_1

    .line 197
    :cond_2
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 198
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fcq;->h:B

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/fek;->e(DBLandroid/widget/TextView;)V

    goto/16 :goto_1

    .line 199
    :cond_3
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 200
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    iget v2, p0, Lo/fcq;->g:I

    iget-byte v3, p0, Lo/fcq;->h:B

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->e(DIBLandroid/widget/TextView;)V

    goto/16 :goto_1

    .line 201
    :cond_4
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 202
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fek;->c(DLandroid/widget/TextView;)V

    goto/16 :goto_1

    .line 203
    :cond_5
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_6

    .line 204
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fcq;->h:B

    iget v3, p0, Lo/fcq;->k:I

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->d(DBILandroid/widget/TextView;)V

    goto :goto_1

    .line 205
    :cond_6
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_7

    .line 206
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fcq;->h:B

    iget-object v3, p0, Lo/fcq;->e:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->d()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->b(DBFLandroid/widget/TextView;)V

    goto :goto_1

    .line 207
    :cond_7
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_8

    .line 208
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fek;->d(DLandroid/widget/TextView;)V

    goto :goto_1

    .line 209
    :cond_8
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_9

    .line 210
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fek;->e(DLandroid/widget/TextView;)V

    goto :goto_1

    .line 211
    :cond_9
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_a

    .line 212
    invoke-virtual {v9}, Lo/fcy;->b()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fcq;->h:B

    iget v3, p0, Lo/fcq;->k:I

    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->a(DBILandroid/widget/TextView;)V

    .line 215
    :cond_a
    :goto_1
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_b

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_b

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_b

    .line 216
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_b

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_c

    .line 217
    :cond_b
    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 219
    :cond_c
    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 221
    :goto_2
    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_d

    .line 222
    invoke-static {v8}, Lo/fcq$b;->a(Lo/fcq$b;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 230
    :cond_d
    invoke-static {v8}, Lo/fcq$b;->a(Lo/fcq$b;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 236
    :goto_3
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x5

    if-eq v1, v0, :cond_e

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x6

    if-eq v1, v0, :cond_e

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0xb

    if-eq v1, v0, :cond_e

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0xd

    if-ne v1, v0, :cond_f

    .line 237
    :cond_e
    invoke-static {v8}, Lo/fcq$b;->b(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fcq;->a(Landroid/widget/TextView;)V

    goto :goto_4

    .line 238
    :cond_f
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0x8

    if-eq v1, v0, :cond_10

    .line 239
    invoke-static {v8}, Lo/fcq$b;->b(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/fcq;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget-object v2, Lo/fcq;->m:[I

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v3

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    :cond_10
    :goto_4
    invoke-static {v8}, Lo/fcq$b;->d(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/fcq;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget-object v2, Lo/fcq;->f:[I

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v3

    aget v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 248
    invoke-static {v8}, Lo/fcq$b;->e(Lo/fcq$b;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Lo/fcq;->l:[I

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_5

    .line 250
    :cond_11
    invoke-static {v8}, Lo/fcq$b;->e(Lo/fcq$b;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Lo/fcq;->p:[I

    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 253
    :goto_5
    invoke-static {v8}, Lo/fcq$b;->h(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fcy;

    invoke-virtual {v1}, Lo/fcy;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    invoke-virtual {v9}, Lo/fcy;->a()I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_13

    .line 257
    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fcy;

    invoke-virtual {v0}, Lo/fcy;->e()Ljava/lang/String;

    move-result-object v10

    .line 258
    const-string v11, ""

    .line 259
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 260
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_show_bodyage_unit_years_old:I

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    int-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    goto :goto_6

    .line 262
    :cond_12
    iget-object v0, p0, Lo/fcq;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_show_bodyage_unit_years_old:I

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 264
    :goto_6
    new-instance v12, Landroid/text/SpannableString;

    invoke-direct {v12, v11}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 265
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0xf

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v12, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 266
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0xf

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v12, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 267
    invoke-static {v8}, Lo/fcq$b;->h(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    invoke-static {v8}, Lo/fcq$b;->b(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 271
    :cond_13
    iget-boolean v0, p0, Lo/fcq;->i:Z

    if-eqz v0, :cond_14

    .line 272
    invoke-static {v8}, Lo/fcq$b;->a(Lo/fcq$b;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    .line 273
    iget v0, p0, Lo/fcq;->c:I

    iput v0, v10, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 274
    invoke-static {v8}, Lo/fcq$b;->a(Lo/fcq$b;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 276
    :cond_14
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p0, Lo/fcq;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fcy;

    invoke-virtual {v0}, Lo/fcy;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_15

    .line 277
    invoke-static {v8}, Lo/fcq$b;->c(Lo/fcq$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 279
    :cond_15
    return-object p2
.end method

.method public isEnabled(I)Z
    .locals 1

    .line 168
    const/4 v0, 0x0

    return v0
.end method

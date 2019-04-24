.class public Lo/elo;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final b:Ljava/lang/String;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field c:I

.field d:I

.field e:I

.field private f:Landroid/content/Context;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/elo;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/elo;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 42
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/elo;->g:Ljava/lang/String;

    .line 29
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/elo;->h:Ljava/lang/String;

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lo/elo;->e:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/elo;->c:I

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elo;->k:Ljava/util/List;

    .line 43
    invoke-direct {p0, p1}, Lo/elo;->e(Landroid/content/Context;)V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 47
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/elo;->g:Ljava/lang/String;

    .line 29
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/elo;->h:Ljava/lang/String;

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lo/elo;->e:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/elo;->c:I

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elo;->k:Ljava/util/List;

    .line 48
    invoke-direct {p0, p1}, Lo/elo;->e(Landroid/content/Context;)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/elo;->g:Ljava/lang/String;

    .line 29
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/elo;->h:Ljava/lang/String;

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lo/elo;->e:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/elo;->c:I

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elo;->k:Ljava/util/List;

    .line 53
    invoke-direct {p0, p1}, Lo/elo;->e(Landroid/content/Context;)V

    .line 54
    return-void
.end method

.method private b(Landroid/view/View;)I
    .locals 4

    .line 155
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 156
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 157
    invoke-virtual {p1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 158
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method private b(I)Landroid/view/View;
    .locals 7

    .line 117
    iget-object v0, p0, Lo/elo;->f:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 118
    sget v0, Lcom/huawei/ui/commonui/R$layout;->track_dialog_radio_button_item:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 119
    sget v0, Lcom/huawei/ui/commonui/R$id;->target_dialog_radio_btn_select:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 120
    invoke-virtual {v5, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 122
    sget v0, Lcom/huawei/ui/commonui/R$id;->target_value_text:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 123
    iget-object v0, p0, Lo/elo;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    iget v0, p0, Lo/elo;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 125
    invoke-direct {p0, v4}, Lo/elo;->b(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lo/elo;->c:I

    .line 126
    sget-object v0, Lo/elo;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "itemHeight: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/elo;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lo/elo;->c:I

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    return-object v4
.end method

.method public static b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 188
    invoke-static {}, Lo/cxh;->a()Z

    move-result v4

    .line 189
    const/4 v5, 0x0

    .line 190
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 192
    :sswitch_0
    const-string v0, "21.0975"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    move-object v5, p2

    .line 194
    return-object v5

    .line 195
    :cond_0
    const-string v0, "42.195"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    move-object v5, p3

    .line 197
    return-object v5

    .line 199
    :cond_1
    if-eqz v4, :cond_2

    .line 200
    .line 201
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    .line 200
    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 202
    return-object v5

    .line 204
    :cond_2
    move-object v5, p1

    .line 208
    goto :goto_1

    .line 210
    :goto_0
    move-object v5, p1

    .line 212
    :goto_1
    const/4 v0, -0x1

    if-eq p0, v0, :cond_3

    .line 213
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 215
    :cond_3
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private b()V
    .locals 5

    .line 107
    iget-object v0, p0, Lo/elo;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/elo;->d:I

    .line 108
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lo/elo;->d:I

    if-ge v4, v0, :cond_0

    .line 109
    invoke-direct {p0, v4}, Lo/elo;->b(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/elo;->addView(Landroid/view/View;)V

    .line 108
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {p0}, Lo/elo;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 112
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v2, p0, Lo/elo;->c:I

    iget v3, p0, Lo/elo;->d:I

    mul-int/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lo/elo;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    iget v0, p0, Lo/elo;->e:I

    invoke-direct {p0, v0}, Lo/elo;->e(I)V

    .line 114
    return-void
.end method

.method private e(I)V
    .locals 4

    .line 133
    invoke-virtual {p0}, Lo/elo;->getChildCount()I

    move-result v2

    .line 134
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 135
    if-ne p1, v3, :cond_0

    .line 136
    invoke-virtual {p0, v3}, Lo/elo;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/elo;->e(Landroid/view/View;I)V

    goto :goto_1

    .line 138
    :cond_0
    invoke-virtual {p0, v3}, Lo/elo;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/elo;->e(Landroid/view/View;I)V

    .line 134
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 141
    :cond_1
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 3

    .line 100
    iput-object p1, p0, Lo/elo;->f:Landroid/content/Context;

    .line 101
    sget-object v0, Lo/elo;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "init: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lo/elo;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/elo;->setOrientation(I)V

    .line 103
    return-void
.end method

.method private e(Landroid/view/View;I)V
    .locals 5

    .line 162
    move-object v2, p1

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 163
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 164
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 165
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 167
    :sswitch_0
    const-string v0, "regular"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 168
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 169
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 170
    goto :goto_0

    .line 172
    :sswitch_1
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 173
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->home_track_starget_value_color_whole_alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 174
    sget v0, Lcom/huawei/ui/commonui/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 175
    .line 179
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public getSeletedTargetValue()F
    .locals 3

    .line 144
    iget-object v0, p0, Lo/elo;->k:Ljava/util/List;

    iget v1, p0, Lo/elo;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 145
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 183
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/elo;->e:I

    .line 184
    iget v0, p0, Lo/elo;->e:I

    invoke-direct {p0, v0}, Lo/elo;->e(I)V

    .line 185
    return-void
.end method

.method public setItems(Ljava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 58
    iput-object p1, p0, Lo/elo;->k:Ljava/util/List;

    .line 59
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    iput v0, p0, Lo/elo;->e:I

    .line 60
    iget-object v0, p0, Lo/elo;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/elo;->a:Ljava/util/List;

    .line 63
    :cond_0
    iget-object v0, p0, Lo/elo;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 65
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 67
    :pswitch_0
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_min:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 68
    goto :goto_1

    .line 70
    :pswitch_1
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 71
    goto :goto_1

    .line 73
    :pswitch_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {p0}, Lo/elo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 78
    goto :goto_1

    .line 80
    :goto_0
    const-string v4, ""

    .line 84
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 85
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 86
    iget-object v0, p0, Lo/elo;->g:Ljava/lang/String;

    iget-object v1, p0, Lo/elo;->h:Ljava/lang/String;

    invoke-static {p2, v7, v0, v1}, Lo/elo;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 87
    sget-object v0, Lo/elo;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the tmpItem is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lo/elo;->g:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/elo;->h:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 89
    :cond_2
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 91
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    :goto_3
    goto/16 :goto_2

    .line 94
    :cond_4
    iget-object v0, p0, Lo/elo;->a:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 95
    invoke-direct {p0}, Lo/elo;->b()V

    .line 97
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

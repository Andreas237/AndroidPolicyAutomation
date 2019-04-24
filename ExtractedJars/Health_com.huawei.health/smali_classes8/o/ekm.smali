.class public Lo/ekm;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ekm$e;,
        Lo/ekm$c;,
        Lo/ekm$d;
    }
.end annotation


# static fields
.field private static g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ekm$c;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/LinearLayout;

.field private h:Lo/ekm$e;

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/ekm$c;Lo/ekm$d;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/ekm;->g:Ljava/util/List;

    .line 164
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->a:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->b:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->d:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->c:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->e:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->k:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->i:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->f:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    sget-object v1, Lo/ekm$c;->g:Lo/ekm$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 54
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 159
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    .line 56
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->a:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_exerciserecords_heartrate_frequency:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_exerciserecords_heartrate_crush:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_exerciserecords_heartrate_crush:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->b:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_health_exerciserecords_stride_frequency:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_health_exerciserecords_stride_crush:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_health_exerciserecords_stride_crush:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->d:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_exerciserecords_altitudw_frequency:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_exerciserecords_altitudw_crush:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_exerciserecords_altitudw_crush:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->c:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_speed_pace:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_speed_pace_unsel:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_speed_pace_unsel:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->e:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_speed_pace:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_speed_pace_unsel:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_speed_pace_unsel:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->k:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_swimming:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_swimming_unsel:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_swimming_unsel:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->i:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_swolf:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_swolf_unsel:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_health_track_swolf_unsel:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->f:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_health_touch_the_ground_time:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_health_touch_the_ground_time_did_not_click:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_health_touch_the_ground_time_did_not_click:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    sget-object v1, Lo/ekm$c;->g:Lo/ekm$c;

    new-instance v2, Lo/ekm$d;

    sget v3, Lcom/huawei/ui/commonui/R$drawable;->ic_health_on_the_impact:I

    sget v4, Lcom/huawei/ui/commonui/R$drawable;->ic_health_on_the_impact_did_not_click:I

    sget v5, Lcom/huawei/ui/commonui/R$drawable;->ic_health_on_the_impact_did_not_click:I

    invoke-direct {v2, v3, v4, v5}, Lo/ekm$d;-><init>(III)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iput-object p1, p0, Lo/ekm;->a:Landroid/content/Context;

    .line 66
    invoke-direct {p0}, Lo/ekm;->d()V

    .line 67
    return-void
.end method

.method private a()I
    .locals 7

    .line 235
    const/4 v1, 0x1

    .line 236
    invoke-static {}, Lo/ekm$c;->values()[Lo/ekm$c;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 237
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ekm$d;

    .line 238
    iget-boolean v0, v6, Lo/ekm$d;->b:Z

    if-eqz v0, :cond_0

    .line 239
    add-int/lit8 v1, v1, 0x1

    .line 236
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 242
    :cond_1
    return v1
.end method

.method public static a(Landroid/content/Context;)I
    .locals 10

    .line 255
    const/4 v4, 0x0

    .line 256
    const/4 v5, 0x0

    .line 257
    const/4 v6, 0x0

    .line 258
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 260
    const-string v0, "com.android.internal.R$dimen"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 261
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    .line 262
    const-string v0, "status_bar_height"

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    .line 263
    invoke-virtual {v6, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 264
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v8, v0

    .line 267
    goto :goto_0

    .line 265
    :catch_0
    move-exception v9

    .line 266
    const-string v0, "CustomChartTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStatusBarHeight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    :goto_0
    return v8
.end method

.method private c()V
    .locals 7

    .line 227
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$plurals;->IDS_pluginmotiontrack_show_three_chart:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 228
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v6

    .line 229
    invoke-virtual {v6, v5}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 230
    invoke-virtual {v6}, Landroid/widget/Toast;->show()V

    .line 231
    return-void
.end method

.method private d()V
    .locals 8

    .line 70
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/LayoutInflater;

    .line 71
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_titlebar_linechart:I

    invoke-virtual {v5, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 72
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_left:I

    invoke-virtual {p0, v0}, Lo/ekm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ekm;->d:Landroid/widget/ImageView;

    .line 75
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    const-string v0, "CustomChartTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadBackBtn() language rtl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lo/ekm;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$drawable;->health_navbar_rtl_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 79
    :cond_0
    const-string v0, "CustomChartTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadBackBtn() language ltr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/ekm;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    :goto_0
    sget v0, Lcom/huawei/ui/commonui/R$id;->detail_title_text:I

    invoke-virtual {p0, v0}, Lo/ekm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ekm;->c:Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/huawei/ui/commonui/R$id;->titlebar_divider_line_height:I

    invoke-virtual {p0, v0}, Lo/ekm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/ekm;->b:Landroid/view/View;

    .line 84
    iget-object v0, p0, Lo/ekm;->b:Landroid/view/View;

    const/16 v1, 0x19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 85
    sget v0, Lcom/huawei/ui/commonui/R$id;->view_right:I

    invoke-virtual {p0, v0}, Lo/ekm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ekm;->e:Landroid/widget/LinearLayout;

    .line 86
    sget v0, Lcom/huawei/ui/commonui/R$id;->status_bar_place_holder:I

    invoke-virtual {p0, v0}, Lo/ekm;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 87
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 89
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ekm;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 90
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    invoke-direct {p0}, Lo/ekm;->e()V

    .line 92
    return-void
.end method

.method private e()V
    .locals 10

    .line 95
    iget-object v0, p0, Lo/ekm;->e:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 96
    return-void

    .line 98
    :cond_0
    iget-object v0, p0, Lo/ekm;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 99
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 100
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 101
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ekm$c;

    .line 102
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ekm$d;

    .line 103
    iget-boolean v0, v5, Lo/ekm$d;->e:Z

    if-eqz v0, :cond_1

    .line 104
    goto :goto_0

    .line 106
    :cond_1
    iget-boolean v0, v5, Lo/ekm$d;->a:Z

    if-nez v0, :cond_2

    .line 107
    goto :goto_0

    .line 109
    :cond_2
    new-instance v6, Landroid/widget/ImageView;

    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 110
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v7, v0

    .line 111
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 114
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v9, v0

    goto :goto_1

    .line 117
    :cond_3
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v9, v0

    .line 120
    :goto_1
    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 122
    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    iget-boolean v0, v5, Lo/ekm$d;->a:Z

    if-eqz v0, :cond_4

    iget-boolean v0, v5, Lo/ekm$d;->b:Z

    if-eqz v0, :cond_4

    .line 125
    iget v0, v5, Lo/ekm$d;->c:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 126
    :cond_4
    iget-boolean v0, v5, Lo/ekm$d;->a:Z

    if-eqz v0, :cond_5

    iget-boolean v0, v5, Lo/ekm$d;->b:Z

    if-nez v0, :cond_5

    .line 127
    iget v0, v5, Lo/ekm$d;->d:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 129
    :cond_5
    :goto_2
    iget-boolean v0, v5, Lo/ekm$d;->a:Z

    if-eqz v0, :cond_6

    .line 130
    new-instance v0, Lo/ekm$5;

    invoke-direct {v0, p0, v4}, Lo/ekm$5;-><init>(Lo/ekm;Lo/ekm$c;)V

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    :cond_6
    iget-object v0, p0, Lo/ekm;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 138
    goto/16 :goto_0

    .line 139
    :cond_7
    iget-object v0, p0, Lo/ekm;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_a

    .line 140
    iget-object v0, p0, Lo/ekm;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ekm;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 141
    const/4 v0, 0x0

    if-eq v0, v4, :cond_8

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_9

    .line 142
    :cond_8
    return-void

    .line 143
    :cond_9
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 144
    iget-object v0, p0, Lo/ekm;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v6, v0

    .line 145
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 147
    :cond_a
    return-void
.end method

.method private e(Lo/ekm$c;)V
    .locals 4

    .line 209
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ekm$d;

    .line 210
    iget-boolean v3, v2, Lo/ekm$d;->b:Z

    .line 213
    if-nez v3, :cond_0

    invoke-direct {p0}, Lo/ekm;->a()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 214
    invoke-direct {p0}, Lo/ekm;->c()V

    .line 215
    return-void

    .line 218
    :cond_0
    if-nez v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v2, Lo/ekm$d;->b:Z

    .line 219
    iget-object v0, p0, Lo/ekm;->h:Lo/ekm$e;

    if-eqz v0, :cond_2

    .line 220
    iget-object v0, p0, Lo/ekm;->h:Lo/ekm$e;

    iget-boolean v1, v2, Lo/ekm$d;->b:Z

    invoke-interface {v0, p1, v1}, Lo/ekm$e;->c(Lo/ekm$c;Z)V

    .line 222
    :cond_2
    invoke-direct {p0}, Lo/ekm;->e()V

    .line 223
    return-void
.end method

.method static synthetic e(Lo/ekm;Lo/ekm$c;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/ekm;->e(Lo/ekm$c;)V

    return-void
.end method


# virtual methods
.method public setBaseLine(Lo/ekm$c;)V
    .locals 4

    .line 194
    sget-object v0, Lo/ekm;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ekm$c;

    .line 195
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ekm$d;

    .line 196
    const/4 v0, 0x0

    iput-boolean v0, v3, Lo/ekm$d;->e:Z

    .line 197
    goto :goto_0

    .line 198
    :cond_0
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ekm$d;

    .line 199
    const/4 v0, 0x1

    iput-boolean v0, v1, Lo/ekm$d;->e:Z

    .line 200
    invoke-direct {p0}, Lo/ekm;->e()V

    .line 201
    return-void
.end method

.method public setHwHealthLineChart(Lo/ekw;)V
    .locals 0

    .line 247
    invoke-virtual {p1, p0}, Lo/ekw;->setTitleBar(Lo/ekm;)V

    .line 248
    return-void
.end method

.method public setIconClickable(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ekm$c;>;)V"
        }
    .end annotation

    .line 276
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ekm$c;

    .line 277
    iget-object v0, p0, Lo/ekm;->k:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ekm$d;

    .line 278
    const/4 v0, 0x1

    iput-boolean v0, v3, Lo/ekm$d;->a:Z

    .line 279
    goto :goto_0

    .line 280
    :cond_0
    invoke-direct {p0}, Lo/ekm;->e()V

    .line 281
    return-void
.end method

.method public setOnBackListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 272
    iget-object v0, p0, Lo/ekm;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 273
    return-void
.end method

.method public setOnLineStatusChangedListener(Lo/ekm$e;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lo/ekm;->h:Lo/ekm$e;

    .line 157
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 150
    iget-object v0, p0, Lo/ekm;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    return-void
.end method

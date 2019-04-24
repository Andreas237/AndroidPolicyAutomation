.class public Lo/chs;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/content/Context;

.field private e:I

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->d:Landroid/content/Context;

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/chs;->e:I

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->i:Landroid/widget/ImageView;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->g:Landroid/widget/ImageView;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->k:Landroid/widget/LinearLayout;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->f:Landroid/widget/LinearLayout;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->h:Landroid/widget/LinearLayout;

    .line 37
    invoke-direct {p0, p1, p2}, Lo/chs;->b(Landroid/content/Context;I)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 41
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->d:Landroid/content/Context;

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/chs;->e:I

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->i:Landroid/widget/ImageView;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->g:Landroid/widget/ImageView;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->k:Landroid/widget/LinearLayout;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->f:Landroid/widget/LinearLayout;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chs;->h:Landroid/widget/LinearLayout;

    .line 42
    iget v0, p0, Lo/chs;->e:I

    invoke-direct {p0, p1, v0}, Lo/chs;->b(Landroid/content/Context;I)V

    .line 43
    return-void
.end method

.method private b(Landroid/content/Context;I)V
    .locals 2

    .line 46
    iput-object p1, p0, Lo/chs;->d:Landroid/content/Context;

    .line 47
    iput p2, p0, Lo/chs;->e:I

    .line 48
    iget-object v0, p0, Lo/chs;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_link_layout:I

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 50
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_link_product_name:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    .line 51
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_link_tip:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    .line 52
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->img_track_link_tdcode:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    .line 53
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_link_product_img:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/chs;->i:Landroid/widget/ImageView;

    .line 54
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_link_shape:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/chs;->g:Landroid/widget/ImageView;

    .line 56
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_track_device_info:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/chs;->k:Landroid/widget/LinearLayout;

    .line 57
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_track_share_link_product_link:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/chs;->f:Landroid/widget/LinearLayout;

    .line 58
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_track_share_link_tip:I

    invoke-virtual {p0, v0}, Lo/chs;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/chs;->h:Landroid/widget/LinearLayout;

    .line 60
    invoke-direct {p0}, Lo/chs;->c()V

    .line 61
    return-void
.end method

.method private c()V
    .locals 2

    .line 64
    iget v0, p0, Lo/chs;->e:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 65
    invoke-virtual {p0}, Lo/chs;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$color;->color_normal_titlebar_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {p0, v0}, Lo/chs;->setTextColor(I)V

    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p0}, Lo/chs;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {p0, v0}, Lo/chs;->setTextColor(I)V

    .line 69
    :goto_0
    return-void
.end method

.method private setTextColor(I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 73
    iget-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    iget-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 76
    iget-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 77
    iget-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 78
    return-void
.end method


# virtual methods
.method public setLayoutStyle(I)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 86
    iget-object v0, p0, Lo/chs;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 87
    iget-object v0, p0, Lo/chs;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 88
    const/16 v0, 0x65

    if-ne p1, v0, :cond_0

    .line 89
    const/16 v0, 0x15

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 90
    const/16 v0, 0xe

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 91
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_device_setting_main_list_item_img_height:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 92
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_health_size_35dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 94
    iget-object v0, p0, Lo/chs;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 95
    iget-object v0, p0, Lo/chs;->h:Landroid/widget/LinearLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 96
    iget-object v0, p0, Lo/chs;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 97
    iget-object v0, p0, Lo/chs;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_watch_bg_below_mask:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 99
    iget-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 100
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_6:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 101
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 102
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 103
    iget-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    goto/16 :goto_0

    .line 106
    :cond_0
    const/16 v0, 0xe

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 107
    const/16 v0, 0x15

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 108
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->custom_normal_titlebar_title_textsize:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 109
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->list_item_text_padding_left:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 110
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->time_line_right_part_content_margin_top:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 112
    iget-object v0, p0, Lo/chs;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 113
    iget-object v0, p0, Lo/chs;->h:Landroid/widget/LinearLayout;

    const v1, 0x800005

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 114
    iget-object v0, p0, Lo/chs;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 117
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 118
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 119
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_home_healthshop_dimen_8dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 120
    iget-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    const/16 v0, 0x66

    if-ne p1, v0, :cond_1

    .line 123
    iget-object v0, p0, Lo/chs;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_bracelet_bg_below_mask:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 127
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/chs;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    iget v0, p0, Lo/chs;->e:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_2

    .line 130
    iget-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_scan_qr_code_to_learn_about:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 132
    :cond_2
    iget-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_scan_qr_code_to_download:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 134
    :goto_1
    return-void
.end method

.method public setLeomTextDeviceName(Ljava/lang/String;)V
    .locals 2

    .line 166
    iget-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_scan_qr_code_to_learn_about:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 167
    iget-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    return-void
.end method

.method public setLinkInfoVisibility(I)V
    .locals 3

    .line 175
    iget-object v0, p0, Lo/chs;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 176
    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    iget v0, p0, Lo/chs;->e:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    .line 177
    iget-object v0, p0, Lo/chs;->g:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 178
    iget-object v0, p0, Lo/chs;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->time_line_right_part_content_margin_top:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 179
    iget-object v0, p0, Lo/chs;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    :cond_0
    return-void
.end method

.method public setmImgDeviceLink(I)V
    .locals 5

    .line 141
    iget-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 143
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_janus:I

    if-eq p1, v0, :cond_0

    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_honor_aw70_qr_code:I

    if-eq p1, v0, :cond_0

    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_fortuna:I

    if-eq p1, v0, :cond_0

    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_qrcode_talos:I

    if-ne p1, v0, :cond_1

    .line 145
    :cond_0
    invoke-virtual {p0}, Lo/chs;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 146
    iget-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 147
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_font_size_61dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 148
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_font_size_61dp:I

    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 149
    iget-object v0, p0, Lo/chs;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    iget-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_13_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 151
    iget-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_13_sp:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 155
    :cond_1
    return-void
.end method

.method public setmImgDevicePic(I)V
    .locals 1

    .line 137
    iget-object v0, p0, Lo/chs;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 138
    return-void
.end method

.method public setmTextDeviceName(I)V
    .locals 1

    .line 158
    iget-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 159
    return-void
.end method

.method public setmTextDeviceName(Ljava/lang/String;)V
    .locals 1

    .line 162
    iget-object v0, p0, Lo/chs;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    return-void
.end method

.method public setmTextLinkTip(I)V
    .locals 1

    .line 171
    iget-object v0, p0, Lo/chs;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 172
    return-void
.end method

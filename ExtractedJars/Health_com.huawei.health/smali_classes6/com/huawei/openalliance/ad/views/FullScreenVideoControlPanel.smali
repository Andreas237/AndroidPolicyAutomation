.class public Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;
.super Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/SeekBar;

.field private c:Landroid/widget/CheckBox;

.field private d:Landroid/view/View;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:Landroid/view/View;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/view/View;

.field private m:Landroid/view/View;

.field private n:Landroid/view/View;

.field private o:Landroid/widget/TextView;

.field private p:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

.field private q:Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;)Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->p:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

    return-object v0
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->m:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->m:Landroid/view/View;

    new-instance v1, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$1;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$1;-><init>(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->n:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->n:Landroid/view/View;

    new-instance v1, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$2;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$2;-><init>(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 5

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_fullscreen_video_control_panel:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_native_video_control_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->h:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_pb_video:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->b:Landroid/widget/SeekBar;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_cb_sound:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->c:Landroid/widget/CheckBox;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_pb_buffering:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->d:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_btn_play_or_pause:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a:Landroid/widget/ImageView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_iv_preview_video:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->g:Landroid/widget/ImageView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_rl_non_wifi_alert:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->i:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_btn_non_wifi_play:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->j:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_non_wifi_alert_msg:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->k:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_tv_play_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->f:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_tv_total_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->e:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_video_panel_bottom_shade:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->l:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_btn_shrink:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->m:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_back_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->n:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_text_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->o:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_rl_preview_video:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->q:Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->b:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/SeekBar;->setPadding(IIII)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->m:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public getBufferingView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->d:Landroid/view/View;

    return-object v0
.end method

.method public getControlPanelView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->h:Landroid/view/View;

    return-object v0
.end method

.method public getFullScreenSwitchButton()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getNonWifiAlertView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->i:Landroid/view/View;

    return-object v0
.end method

.method public getPauseIconResouceId()I
    .locals 1

    sget v0, Lcom/huawei/openalliance/ad/R$drawable;->hiad_pause:I

    return v0
.end method

.method public getPlayButtonInNonWifiAlertView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->j:Landroid/view/View;

    return-object v0
.end method

.method public getPlayIconResourceId()I
    .locals 1

    sget v0, Lcom/huawei/openalliance/ad/R$drawable;->hiad_play:I

    return v0
.end method

.method public getPlayOrPauseView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getPlayTimeView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method public getPreviewView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->g:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getSeekBar()Landroid/widget/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->b:Landroid/widget/SeekBar;

    return-object v0
.end method

.method public getSoundToggleView()Landroid/widget/CompoundButton;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->c:Landroid/widget/CheckBox;

    return-object v0
.end method

.method public getTotalTimeView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method public setListener(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->p:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

    return-void
.end method

.method public setNonWifiAlertMsg(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPreviewImageRatio(F)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->q:Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->q:Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->setRatio(Ljava/lang/Float;)V

    :cond_0
    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->o:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->o:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

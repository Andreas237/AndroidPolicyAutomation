.class public Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;
.super Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/g;


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

.field private n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->n:Z

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->n:Z

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->n:Z

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->a(Landroid/content/Context;)V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 5

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_native_video_control_panel:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_native_video_control_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->h:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_pb_video:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->b:Landroid/widget/SeekBar;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_cb_sound:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->c:Landroid/widget/CheckBox;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_pb_buffering:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->d:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_btn_play_or_pause:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->a:Landroid/widget/ImageView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_iv_preview_video:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->g:Landroid/widget/ImageView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_rl_non_wifi_alert:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->i:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_btn_non_wifi_play:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->j:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_non_wifi_alert_msg:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->k:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_tv_play_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->f:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_tv_total_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->e:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_video_panel_bottom_shade:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->l:Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_btn_fullscreen:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->m:Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->b:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/SeekBar;->setPadding(IIII)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->l:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->n:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->m:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->n:Z

    return-void
.end method

.method public getBufferingView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->d:Landroid/view/View;

    return-object v0
.end method

.method public getControlPanelView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->h:Landroid/view/View;

    return-object v0
.end method

.method public getFullScreenSwitchButton()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->m:Landroid/view/View;

    return-object v0
.end method

.method public getNonWifiAlertView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->i:Landroid/view/View;

    return-object v0
.end method

.method public getPauseIconResouceId()I
    .locals 1

    sget v0, Lcom/huawei/openalliance/ad/R$drawable;->hiad_pause:I

    return v0
.end method

.method public getPlayButtonInNonWifiAlertView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->j:Landroid/view/View;

    return-object v0
.end method

.method public getPlayIconResourceId()I
    .locals 1

    sget v0, Lcom/huawei/openalliance/ad/R$drawable;->hiad_play:I

    return v0
.end method

.method public getPlayOrPauseView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getPlayTimeView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method public getPreviewView()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->g:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getSeekBar()Landroid/widget/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->b:Landroid/widget/SeekBar;

    return-object v0
.end method

.method public getSoundToggleView()Landroid/widget/CompoundButton;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->c:Landroid/widget/CheckBox;

    return-object v0
.end method

.method public getTotalTimeView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method public setNonWifiAlertMsg(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

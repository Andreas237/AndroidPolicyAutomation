.class public abstract Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;
    }
.end annotation


# instance fields
.field protected a:Landroid/view/View;

.field protected b:Landroid/support/v4/app/FragmentActivity;

.field protected c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

.field protected d:I

.field protected e:I

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private k:Landroid/view/View;

.field private m:Lhuawei/widget/HwProgressBar;

.field private p:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 3

    .line 117
    sget v0, Lcom/huawei/ui/main/R$id;->hw_before_one_loading:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->i:Landroid/view/View;

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_before_one_empty_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->k:Landroid/view/View;

    .line 119
    sget v0, Lcom/huawei/ui/main/R$id;->common_weight_no_data_isversea:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->h:Landroid/view/View;

    .line 120
    sget v0, Lcom/huawei/ui/main/R$id;->net_work_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->a:Landroid/view/View;

    .line 121
    sget v0, Lcom/huawei/ui/main/R$id;->hw_device_before_one_loading_img:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->m:Lhuawei/widget/HwProgressBar;

    .line 122
    sget v0, Lcom/huawei/ui/main/R$id;->btn_no_net_work:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->p:Landroid/widget/Button;

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->p:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$1;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->m:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 130
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 5

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_before_one_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 106
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->e()I

    move-result v3

    .line 107
    if-eqz v3, :cond_0

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->g:Landroid/view/View;

    .line 109
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 110
    invoke-virtual {v2}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->g:Landroid/view/View;

    invoke-virtual {v2, v0, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->g()V

    return-void
.end method

.method private g()V
    .locals 2

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->h:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 190
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract a(Landroid/view/View;)V
.end method

.method public b()V
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->d:I

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->e:I

    .line 57
    return-void
.end method

.method protected c()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->k:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->a(Landroid/view/View;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 161
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->h:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->k:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->h:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 168
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->h:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 178
    :cond_2
    :goto_1
    return-void
.end method

.method public abstract c(I)V
.end method

.method protected abstract c(Landroid/view/View;)V
.end method

.method public abstract c(Z)V
.end method

.method protected abstract d(Landroid/view/View;)Landroid/view/View;
.end method

.method protected d()V
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->h:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 150
    return-void
.end method

.method protected abstract e()I
.end method

.method protected abstract i()V
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
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

    .line 46
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b:Landroid/support/v4/app/FragmentActivity;

    .line 47
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;-><init>(Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    .line 48
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b()V

    .line 49
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_base_health_base_view:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 50
    invoke-direct {p0, v2}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->e(Landroid/view/View;)V

    .line 51
    return-object v2
.end method

.method public onDestroy()V
    .locals 1

    .line 96
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment$e;

    .line 98
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 134
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 135
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->c(Z)V

    .line 136
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 61
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 62
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->i()V

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->b(Landroid/view/View;)V

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->g:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->c(Landroid/view/View;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->g:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->d(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->f:Landroid/view/View;

    .line 66
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/fragment/BaseHealthFragment;->d()V

    .line 67
    return-void
.end method

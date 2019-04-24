.class public Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;,
        Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$c;,
        Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field public b:Landroid/content/Context;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:I

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/content/Context;

.field private h:Landroid/widget/TextView;

.field private i:Lo/enz;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/ImageView;

.field private o:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Ljava/lang/String;

.field private t:Lo/egw;

.field private u:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 76
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e:I

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Landroid/content/Context;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->g:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 156
    iput-object p0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b:Landroid/content/Context;

    .line 157
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_handring_mode_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d:Landroid/widget/TextView;

    .line 158
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_running_mode_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a:Landroid/widget/TextView;

    .line 159
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_change_mode_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c:Landroid/widget/TextView;

    .line 160
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_run_mode_position_describe_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->k:Landroid/widget/TextView;

    .line 161
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_auto_change_mode_describe_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->h:Landroid/widget/TextView;

    .line 162
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_auto_change_mode_rly:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->f:Landroid/widget/RelativeLayout;

    .line 163
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_change_mode_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 164
    sget v0, Lcom/huawei/ui/homewear21/R$id;->aw70_running_mode_select_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 165
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/graphics/drawable/BitmapDrawable;

    .line 167
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    sget v0, Lcom/huawei/ui/homewear21/R$drawable;->ic_health_list_arrow_gray:I

    invoke-static {p0, v0}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v7

    .line 170
    :cond_0
    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 171
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 172
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->g:Landroid/content/Context;

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->i:Lo/enz;

    .line 174
    new-instance v0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->o:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_auto_change_mode_close:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_auto_mode:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_run_mode_position_describe:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_running_mode:I

    invoke-virtual {p0, v3}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_AW70_WARE_MODE"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->q:Ljava/lang/String;

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->q:Ljava/lang/String;

    const-string v1, "HANDRING_MODE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_enable:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_handring_mode:I

    invoke-virtual {p0, v3}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_running_mode:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 186
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->q:Ljava/lang/String;

    const-string v1, "RUNNING_MODE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_handring_mode:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_enable:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_running_mode:I

    invoke-virtual {p0, v3}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 191
    :cond_2
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get wareMode failed in onResume. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :goto_0
    new-instance v0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 213
    return-void
.end method

.method private a(Landroid/view/View;)Z
    .locals 4

    .line 334
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeSettingModeDialogLayout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 336
    const/4 v0, 0x0

    return v0

    .line 339
    :cond_0
    sget v0, Lcom/huawei/ui/homewear21/R$id;->settings_mode_imgview1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->n:Landroid/widget/ImageView;

    .line 340
    sget v0, Lcom/huawei/ui/homewear21/R$id;->settings_mode_imgview2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->m:Landroid/widget/ImageView;

    .line 341
    sget v0, Lcom/huawei/ui/homewear21/R$id;->settings_mode_view_layout1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->l:Landroid/widget/RelativeLayout;

    .line 342
    sget v0, Lcom/huawei/ui/homewear21/R$id;->settings_mode_view_layout2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->p:Landroid/widget/RelativeLayout;

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->l:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$c;

    invoke-direct {v1, p0, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$c;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->p:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;

    invoke-direct {v1, p0, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 346
    iget v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 349
    :cond_1
    iget v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e:I

    if-nez v0, :cond_2

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 353
    :cond_2
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeSettingModeDialogLayout() fail! data uninitialize"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Lo/egw;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->t:Lo/egw;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Lo/egw;)Lo/egw;
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->t:Lo/egw;

    return-object p1
.end method

.method private b()V
    .locals 2

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->f:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    return-void
.end method

.method private b(I)V
    .locals 2

    .line 313
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 315
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_auto_change_mode_open:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_auto_mode:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 317
    goto :goto_0

    .line 319
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_auto_change_mode_close:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_manual_mode:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 321
    .line 325
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->i:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lo/enz;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 281
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)I
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->m:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->n:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e()V
    .locals 6

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->i:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->u:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e:I

    new-instance v3, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$5;

    invoke-direct {v3, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$5;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->a(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 264
    iget v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 265
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e(I)V

    goto :goto_0

    .line 268
    :cond_0
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e(I)V

    .line 272
    :goto_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 273
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    sget-object v0, Lo/dae;->gd:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 275
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 276
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI save notification click event finish, value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    return-void
.end method

.method private e(I)V
    .locals 2

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->o:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 329
    iput p1, v1, Landroid/os/Message;->what:I

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->o:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 331
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Landroid/view/View;)Z
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a(Landroid/view/View;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 99
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 100
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AW70onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    sget v0, Lcom/huawei/ui/homewear21/R$layout;->fragment_aw70_select_mode:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->setContentView(I)V

    .line 102
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 103
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 104
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate null == intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->finish()V

    .line 106
    return-void

    .line 109
    :cond_0
    const-string v0, "device_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->u:Ljava/lang/String;

    .line 110
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate macAddress "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->u:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a()V

    .line 112
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b()V

    .line 113
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 117
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 119
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Inside onResume!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    new-instance v0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$4;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_AW70_WARE_MODE"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->q:Ljava/lang/String;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->q:Ljava/lang/String;

    const-string v1, "HANDRING_MODE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_enable:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_handring_mode:I

    invoke-virtual {p0, v3}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_running_mode:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->q:Ljava/lang/String;

    const-string v1, "RUNNING_MODE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_handring_mode:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_enable:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_running_mode:I

    invoke-virtual {p0, v3}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 150
    :cond_1
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get wareMode failed in onResume. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    :goto_0
    return-void
.end method

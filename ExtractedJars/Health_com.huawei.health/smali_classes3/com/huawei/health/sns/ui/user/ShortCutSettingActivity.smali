.class public Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;
    }
.end annotation


# instance fields
.field private f:Lo/emu;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private k:Lo/emu;

.field private l:Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;

.field private m:Lo/egd;

.field private o:Z

.field private p:Lo/egd;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->h:Landroid/view/View;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->g:Landroid/view/View;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->p:Lo/egd;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->m:Lo/egd;

    .line 73
    new-instance v0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->l:Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->o:Z

    return-void
.end method

.method private a()V
    .locals 2

    .line 198
    sget v0, Lcom/huawei/android/sns/R$id;->layout_hwaccount:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->h:Landroid/view/View;

    .line 199
    sget v0, Lcom/huawei/android/sns/R$id;->switch_hwaccount:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    .line 200
    sget v0, Lcom/huawei/android/sns/R$id;->layout_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->g:Landroid/view/View;

    .line 201
    sget v0, Lcom/huawei/android/sns/R$id;->switch_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    .line 202
    sget v0, Lcom/huawei/android/sns/R$id;->button_hwaccount:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->p:Lo/egd;

    .line 203
    sget v0, Lcom/huawei/android/sns/R$id;->button_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->m:Lo/egd;

    .line 205
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 208
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 211
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->b()V

    .line 212
    return-void
.end method

.method private static a(Lo/bml$b;)V
    .locals 2

    .line 364
    new-instance v1, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$3;-><init>(Lo/bml$b;)V

    .line 374
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 375
    return-void
.end method

.method private a(Lo/bml$b;Z)V
    .locals 0

    .line 327
    if-eqz p2, :cond_0

    .line 329
    invoke-static {p1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->e(Lo/bml$b;)V

    goto :goto_0

    .line 333
    :cond_0
    invoke-static {p1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(Lo/bml$b;)V

    .line 335
    :goto_0
    return-void
.end method

.method private b()V
    .locals 2

    .line 219
    invoke-static {}, Lo/bml;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emu;->setVisibility(I)V

    .line 222
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emu;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 224
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->m:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setVisibility(I)V

    .line 229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setVisibility(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->p:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->m:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 233
    :goto_0
    return-void
.end method

.method private static b(Landroid/os/Handler;)V
    .locals 2

    .line 148
    new-instance v1, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;-><init>(Landroid/os/Handler;)V

    .line 168
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 169
    return-void
.end method

.method private c()V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->l:Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$a;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->b(Landroid/os/Handler;)V

    .line 191
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;ZZ)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->c(ZZ)V

    return-void
.end method

.method private c(ZZ)V
    .locals 3

    .line 244
    invoke-static {}, Lo/bml;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->p:Lo/egd;

    if-nez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->m:Lo/egd;

    if-nez p2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 249
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->p:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->m:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->p:Lo/egd;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_contact_btn_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->m:Lo/egd;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_contact_btn_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 263
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    invoke-virtual {v0, p1}, Lo/emu;->setChecked(Z)V

    .line 264
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    invoke-virtual {v0, p2}, Lo/emu;->setChecked(Z)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->h:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->g:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 271
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->h:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 272
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->o:Z

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->d(Z)V

    .line 273
    return-void
.end method

.method private static e(Lo/bml$b;)V
    .locals 2

    .line 344
    new-instance v1, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$4;-><init>(Lo/bml$b;)V

    .line 354
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 355
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->g:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 139
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 182
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->d:Landroid/view/View;

    .line 183
    return-void
.end method

.method public d(Z)V
    .locals 1

    .line 117
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->o:Z

    .line 118
    if-nez p1, :cond_0

    .line 120
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(I)V

    goto :goto_0

    .line 124
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(I)V

    .line 126
    :goto_0
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 307
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v1

    .line 309
    sget v0, Lcom/huawei/android/sns/R$id;->switch_hwaccount:I

    if-ne v1, v0, :cond_0

    .line 311
    sget-object v0, Lo/bml$b;->e:Lo/bml$b;

    invoke-direct {p0, v0, p2}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(Lo/bml$b;Z)V

    goto :goto_0

    .line 313
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->switch_message:I

    if-ne v1, v0, :cond_1

    .line 315
    sget-object v0, Lo/bml$b;->c:Lo/bml$b;

    invoke-direct {p0, v0, p2}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(Lo/bml$b;Z)V

    .line 317
    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 285
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 286
    sget v0, Lcom/huawei/android/sns/R$id;->layout_hwaccount:I

    if-ne v2, v0, :cond_1

    .line 288
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->f:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_2

    .line 290
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->layout_message:I

    if-ne v2, v0, :cond_3

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->k:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_2

    .line 294
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$id;->button_hwaccount:I

    if-ne v2, v0, :cond_4

    .line 296
    sget-object v0, Lo/bml$b;->e:Lo/bml$b;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(Lo/bml$b;Z)V

    goto :goto_2

    .line 298
    :cond_4
    sget v0, Lcom/huawei/android/sns/R$id;->button_message:I

    if-ne v2, v0, :cond_5

    .line 300
    sget-object v0, Lo/bml$b;->c:Lo/bml$b;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a(Lo/bml$b;Z)V

    .line 302
    :cond_5
    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 174
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 175
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_shortcut_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->setContentView(I)V

    .line 176
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->a()V

    .line 177
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 278
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 279
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->c()V

    .line 280
    return-void
.end method

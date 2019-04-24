.class public Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field private d:Lo/egd;

.field private e:Landroid/widget/ImageView;

.field private f:Ljava/lang/String;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/ImageView;

.field private i:Ljava/lang/String;

.field private k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private l:I

.field private m:Landroid/widget/TextView;

.field private n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/ImageView;

.field private u:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 62
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->f:Ljava/lang/String;

    .line 63
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->i:Ljava/lang/String;

    .line 64
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->k:Ljava/util/HashMap;

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->n:Ljava/util/HashMap;

    .line 67
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 213
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    const/4 v0, 0x0

    return-object v0

    .line 217
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 218
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 219
    const/16 v0, 0x14

    invoke-static {v4, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 220
    return-object v5

    .line 221
    :catch_0
    move-exception v2

    .line 222
    const-string v0, "PLGACHIEVE_AchieveLevelMessageDialog"

    const-string v1, "setGainTime NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    const/4 v0, 0x0

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->e:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 163
    const/16 v0, 0x1f4

    const/16 v1, 0x12c

    invoke-static {v0, v1}, Lo/dyc;->b(II)Landroid/view/animation/AnimationSet;

    move-result-object v2

    .line 164
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 165
    new-instance v0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog$1;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog$1;-><init>(Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;)V

    invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 181
    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a()V

    return-void
.end method

.method private b()V
    .locals 8

    .line 88
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 89
    if-eqz v4, :cond_3

    .line 90
    const-string v0, "tag"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    const-string v0, "level"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    .line 93
    iget v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    const/16 v1, 0x14

    if-le v0, v1, :cond_2

    .line 94
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->finish()V

    .line 95
    return-void

    .line 98
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->finish()V

    .line 99
    return-void

    .line 101
    :cond_2
    goto :goto_0

    .line 102
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->finish()V

    .line 103
    return-void

    .line 105
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->k:Ljava/util/HashMap;

    invoke-static {v0}, Lo/dzt;->a(Ljava/util/Map;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->n:Ljava/util/HashMap;

    invoke-static {v0}, Lo/dzt;->c(Ljava/util/Map;)V

    .line 108
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_animation_up_before:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->e:Landroid/widget/ImageView;

    .line 109
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_animation_up_after:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->c:Landroid/widget/ImageView;

    .line 110
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->k:Ljava/util/HashMap;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 111
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->k:Ljava/util/HashMap;

    iget v2, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->k:Ljava/util/HashMap;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 114
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->k:Ljava/util/HashMap;

    iget v2, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 116
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->c:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 118
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_dialog_date:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->g:Landroid/widget/TextView;

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->f:Ljava/lang/String;

    .line 120
    const-string v0, "PLGACHIEVE_AchieveLevelMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "level up time ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->i:Ljava/lang/String;

    .line 122
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_dialog_share_button:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->d:Lo/egd;

    .line 125
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->d:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    sget v0, Lcom/huawei/pluginachievement/R$id;->level_mgs:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->b:Landroid/widget/TextView;

    .line 127
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_msg_desc:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 128
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->n:Ljava/util/HashMap;

    iget v2, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 129
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 130
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->g()V

    .line 131
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_dialog_title_ImageView:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->h:Landroid/widget/ImageView;

    .line 133
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->e()V

    .line 135
    return-void
.end method

.method private c()V
    .locals 5

    .line 195
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 196
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 197
    const-string v0, "level"

    iget v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    :cond_0
    sget-object v0, Lo/dae;->ag:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 200
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 201
    return-void
.end method

.method private d()V
    .locals 3

    .line 184
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->d:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 188
    const/16 v0, 0x3e8

    invoke-static {v0}, Lo/dyc;->d(I)Landroid/view/animation/AnimationSet;

    move-result-object v2

    .line 189
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->d:Lo/egd;

    invoke-virtual {v0, v2}, Lo/egd;->startAnimation(Landroid/view/animation/Animation;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 192
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->d()V

    return-void
.end method

.method private e()V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->b:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 141
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->d:Lo/egd;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 142
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->g:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 144
    const/16 v0, 0xc8

    invoke-static {v0}, Lo/dyc;->a(I)Landroid/view/animation/AnimationSet;

    move-result-object v2

    .line 145
    const-wide/16 v0, 0x1f4

    invoke-virtual {v2, v0, v1}, Landroid/view/animation/AnimationSet;->setStartOffset(J)V

    .line 146
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 147
    new-instance v0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog$2;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog$2;-><init>(Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;)V

    invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 158
    return-void
.end method

.method private f()V
    .locals 15

    .line 250
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 252
    return-void

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v11

    .line 255
    invoke-virtual {v11}, Lo/dth;->d()Lo/dti;

    move-result-object v12

    .line 256
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2

    .line 257
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 258
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 260
    const-string v0, "level"

    iget v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->o:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lo/dxh;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 263
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    .line 264
    move-object v0, v12

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a:Landroid/content/Context;

    move-object v5, v14

    sget-object v2, Lo/dae;->ah:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    move-object v10, v13

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v0 .. v10}, Lo/dti;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    .line 267
    :cond_2
    return-void
.end method

.method private g()V
    .locals 6

    .line 233
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_share_ll:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->o:Landroid/widget/LinearLayout;

    .line 234
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_level_share_date:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->m:Landroid/widget/TextView;

    .line 235
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_level_share_image:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->p:Landroid/widget/ImageView;

    .line 237
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->k:Ljava/util/HashMap;

    iget v2, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 238
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->o:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/pluginachievement/R$id;->achieve_level_share_text_level:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->u:Landroid/widget/TextView;

    .line 239
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_msg_desc:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 240
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->n:Ljava/util/HashMap;

    iget v2, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->l:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 241
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 205
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_dialog_title_ImageView:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 206
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->finish()V

    goto :goto_0

    .line 207
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_dialog_share_button:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 208
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->f()V

    .line 210
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 76
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 80
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_level_message_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->setContentView(I)V

    .line 81
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a:Landroid/content/Context;

    .line 82
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->b()V

    .line 83
    sget v0, Lcom/huawei/pluginachievement/R$anim;->fade_in:I

    sget v1, Lcom/huawei/pluginachievement/R$anim;->fade_out:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->overridePendingTransition(II)V

    .line 84
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->c()V

    .line 85
    return-void
.end method

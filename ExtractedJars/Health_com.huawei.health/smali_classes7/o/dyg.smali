.class public Lo/dyg;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/TextView;

.field private f:Lo/egd;

.field private g:Landroid/view/View;

.field private h:Lo/egd;

.field private i:Landroid/widget/ImageView;

.field private k:Lo/dyk;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:I


# direct methods
.method public constructor <init>(Landroid/view/View;Lo/dyk;)V
    .locals 3

    .line 50
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 45
    const-string v0, ""

    iput-object v0, p0, Lo/dyg;->n:Ljava/lang/String;

    .line 46
    const-string v0, "0"

    iput-object v0, p0, Lo/dyg;->o:Ljava/lang/String;

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/dyg;->p:I

    .line 52
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_task_ll:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/dyg;->d:Landroid/widget/LinearLayout;

    .line 53
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_task_text:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/dyg;->a:Landroid/widget/TextView;

    .line 54
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_task_tips_icon:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/dyg;->c:Landroid/widget/ImageView;

    .line 55
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_task_kaka_desc:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/dyg;->b:Landroid/widget/LinearLayout;

    .line 56
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_task_kaka_value:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/dyg;->e:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_finished_iv:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/dyg;->i:Landroid/widget/ImageView;

    .line 58
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_line:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/dyg;->g:Landroid/view/View;

    .line 61
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_tag_button:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/dyg;->f:Lo/egd;

    .line 62
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_complete:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 63
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_content_tag_emphasize_button:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/dyg;->h:Lo/egd;

    .line 67
    iget-object v0, p0, Lo/dyg;->h:Lo/egd;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_pick:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object v0, p0, Lo/dyg;->h:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    iput-object p2, p0, Lo/dyg;->k:Lo/dyk;

    .line 71
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 154
    iget-object v0, p0, Lo/dyg;->k:Lo/dyk;

    invoke-interface {v0, p1, p2, p3}, Lo/dyk;->d(Ljava/lang/String;Ljava/lang/String;I)V

    .line 155
    return-void
.end method


# virtual methods
.method public b(Lo/dyw;I)V
    .locals 7

    .line 74
    if-eqz p1, :cond_6

    .line 75
    invoke-virtual {p1}, Lo/dyw;->d()Lo/dzb;

    move-result-object v3

    .line 76
    if-eqz v3, :cond_4

    .line 77
    iput p2, p0, Lo/dyg;->p:I

    .line 78
    invoke-virtual {v3}, Lo/dzb;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dyg;->n:Ljava/lang/String;

    .line 79
    invoke-virtual {v3}, Lo/dzb;->a()Ljava/lang/String;

    move-result-object v4

    .line 80
    invoke-virtual {v3}, Lo/dzb;->d()Ljava/lang/String;

    move-result-object v5

    .line 81
    invoke-virtual {v3}, Lo/dzb;->e()I

    move-result v6

    .line 82
    invoke-virtual {v3}, Lo/dzb;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dyg;->o:Ljava/lang/String;

    .line 83
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lo/dyg;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lo/dyg;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 87
    iget-object v0, p0, Lo/dyg;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    iget-object v0, p0, Lo/dyg;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    :goto_0
    iget-object v0, p0, Lo/dyg;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 91
    iget-object v0, p0, Lo/dyg;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Lo/dyg;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    iget-object v0, p0, Lo/dyg;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    const-string v0, "0"

    iget-object v1, p0, Lo/dyg;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, p0, Lo/dyg;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 98
    iget-object v0, p0, Lo/dyg;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lo/dyg;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "+"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    const v0, 0x33464

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/dyg;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 102
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 103
    iget-object v0, p0, Lo/dyg;->h:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto/16 :goto_1

    .line 105
    :cond_1
    const-string v0, "1"

    iget-object v1, p0, Lo/dyg;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 107
    iget-object v0, p0, Lo/dyg;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 108
    iget-object v0, p0, Lo/dyg;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 109
    iget-object v0, p0, Lo/dyg;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "+"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object v0, p0, Lo/dyg;->h:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_1

    .line 113
    :cond_2
    const-string v0, "2"

    iget-object v1, p0, Lo/dyg;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    iget-object v0, p0, Lo/dyg;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lo/dyg;->a:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->achieve_report_color_item_line:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    iget-object v0, p0, Lo/dyg;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 118
    iget-object v0, p0, Lo/dyg;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 119
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 120
    iget-object v0, p0, Lo/dyg;->h:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 122
    :cond_3
    :goto_1
    goto :goto_2

    .line 124
    :cond_4
    iget-object v0, p0, Lo/dyg;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lo/dyg;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 126
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 127
    iget-object v0, p0, Lo/dyg;->h:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 128
    iget-object v0, p0, Lo/dyg;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    :goto_2
    invoke-virtual {p1}, Lo/dyw;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 132
    iget-object v0, p0, Lo/dyg;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    :cond_5
    iget-object v0, p0, Lo/dyg;->n:Ljava/lang/String;

    invoke-static {v0}, Lo/dzo;->p(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 136
    iget-object v0, p0, Lo/dyg;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_see:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 140
    :cond_6
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 144
    iget-object v0, p0, Lo/dyg;->f:Lo/egd;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lo/dyg;->h:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 145
    :cond_0
    iget-object v0, p0, Lo/dyg;->o:Ljava/lang/String;

    iget-object v1, p0, Lo/dyg;->n:Ljava/lang/String;

    iget v2, p0, Lo/dyg;->p:I

    invoke-direct {p0, v0, v1, v2}, Lo/dyg;->c(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 146
    :cond_1
    iget-object v0, p0, Lo/dyg;->d:Landroid/widget/LinearLayout;

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lo/dyg;->c:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_3

    .line 148
    :cond_2
    const-string v0, "3"

    iget-object v1, p0, Lo/dyg;->n:Ljava/lang/String;

    iget v2, p0, Lo/dyg;->p:I

    invoke-direct {p0, v0, v1, v2}, Lo/dyg;->c(Ljava/lang/String;Ljava/lang/String;I)V

    .line 151
    :cond_3
    :goto_0
    return-void
.end method

.class public Lo/fij;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fij$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Landroid/support/v7/widget/RecyclerView$ViewHolder;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private b:Landroid/view/LayoutInflater;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/fil;>;)V"
        }
    .end annotation

    .line 59
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 60
    iput-object p1, p0, Lo/fij;->d:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lo/fij;->a:Ljava/util/List;

    .line 62
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/fij;->b:Landroid/view/LayoutInflater;

    .line 63
    return-void
.end method

.method static synthetic a(Lo/fij;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/fij;->e()V

    return-void
.end method

.method static synthetic c(Lo/fij;)Landroid/content/Context;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 6

    .line 209
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    .line 210
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_update_app_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_permission_know:I

    sget v2, Lcom/huawei/ui/main/R$color;->common_text_red_color:I

    new-instance v3, Lo/fij$1;

    invoke-direct {v3, p0}, Lo/fij$1;-><init>(Lo/fij;)V

    .line 211
    invoke-virtual {v0, v1, v2, v3}, Lo/egy$b;->c(IILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 216
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 217
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 218
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Lo/fil;)V
    .locals 4

    .line 194
    invoke-static {p1, p2}, Lo/fic;->c(Ljava/lang/String;Lo/fil;)Ljava/lang/String;

    move-result-object v2

    .line 195
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 196
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 197
    const-string v0, "url"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 198
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p2}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 199
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p2}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 200
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "ACT"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 201
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 202
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 203
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 167
    iget-object v0, p0, Lo/fij;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 10

    .line 72
    instance-of v0, p1, Lo/fij$a;

    if-eqz v0, :cond_7

    .line 73
    iget-object v0, p0, Lo/fij;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fil;

    .line 74
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 75
    const-string v0, "SocialActRecyclerAdapte"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == operationObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void

    .line 78
    :cond_0
    move-object v7, p1

    check-cast v7, Lo/fij$a;

    .line 80
    iget-object v0, v7, Lo/fij$a;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lo/fij$2;

    invoke-direct {v1, p0, v6}, Lo/fij$2;-><init>(Lo/fij;Lo/fil;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    if-nez p2, :cond_1

    .line 111
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    .line 112
    const/high16 v1, 0x42da0000    # 109.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, -0x1

    invoke-direct {v8, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 113
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 114
    iget-object v0, v7, Lo/fij$a;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    :cond_1
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 118
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 119
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    .line 120
    const/high16 v1, 0x42da0000    # 109.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, -0x1

    invoke-direct {v8, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 121
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 122
    iget-object v0, v7, Lo/fij$a;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    :cond_2
    iget-object v0, p0, Lo/fij;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_3

    .line 127
    iget-object v0, v7, Lo/fij$a;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 129
    :cond_3
    iget-object v0, v7, Lo/fij$a;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    :goto_0
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v6}, Lo/fil;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v7, Lo/fij$a;->e:Landroid/widget/ImageView;

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 133
    iget-object v0, v7, Lo/fij$a;->d:Landroid/widget/TextView;

    invoke-virtual {v6}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    invoke-static {v6}, Lo/fic;->a(Lo/fil;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 139
    iget-object v0, v7, Lo/fij$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 141
    :cond_4
    iget-object v0, v7, Lo/fij$a;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 142
    iget-object v0, v7, Lo/fij$a;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_people_attended:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/fil;->g()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    :goto_1
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/fic;->e(Landroid/content/Context;)Lo/fic;

    move-result-object v8

    .line 147
    iget-object v0, v7, Lo/fij$a;->h:Landroid/widget/TextView;

    invoke-virtual {v6}, Lo/fil;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fic;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, v7, Lo/fij$a;->g:Landroid/widget/TextView;

    invoke-virtual {v6}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fic;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    iget-object v0, p0, Lo/fij;->d:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_CURRENT_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 152
    invoke-virtual {v6}, Lo/fil;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v0, v1}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 153
    iget-object v0, v7, Lo/fij$a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_coming_soon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v0, v7, Lo/fij$a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_colorAccent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_2

    .line 155
    :cond_5
    invoke-virtual {v6}, Lo/fil;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v0, v1}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 156
    iget-object v0, v7, Lo/fij$a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_in_progress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    iget-object v0, v7, Lo/fij$a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_colorAccent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 158
    :cond_6
    invoke-virtual {v6}, Lo/fil;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v0, v1}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_7

    .line 159
    iget-object v0, v7, Lo/fij$a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_is_over:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v0, v7, Lo/fij$a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fij;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 163
    :cond_7
    :goto_2
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 67
    new-instance v0, Lo/fij$a;

    iget-object v1, p0, Lo/fij;->b:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/ui/main/R$layout;->item_social_act_recycler_view:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fij$a;-><init>(Landroid/view/View;)V

    return-object v0
.end method

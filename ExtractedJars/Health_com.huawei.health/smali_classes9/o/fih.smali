.class public Lo/fih;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fih$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Landroid/support/v7/widget/RecyclerView$ViewHolder;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private d:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/fil;>;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 49
    iput-object p1, p0, Lo/fih;->d:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lo/fih;->e:Ljava/util/List;

    .line 51
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/fih;->a:Landroid/view/LayoutInflater;

    .line 52
    return-void
.end method

.method static synthetic b(Lo/fih;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lo/fih;->e()V

    return-void
.end method

.method static synthetic d(Lo/fih;)Landroid/content/Context;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/fih;->d:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 6

    .line 227
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lo/fih;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lo/fih;->d:Landroid/content/Context;

    .line 228
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_update_app_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_permission_know:I

    sget v2, Lcom/huawei/ui/main/R$color;->common_text_red_color:I

    new-instance v3, Lo/fih$2;

    invoke-direct {v3, p0}, Lo/fih$2;-><init>(Lo/fih;)V

    .line 229
    invoke-virtual {v0, v1, v2, v3}, Lo/egy$b;->c(IILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 234
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 235
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 236
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;Lo/fil;)V
    .locals 4

    .line 212
    invoke-static {p1, p2}, Lo/fic;->c(Ljava/lang/String;Lo/fil;)Ljava/lang/String;

    move-result-object v2

    .line 213
    iget-object v0, p0, Lo/fih;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 214
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/fih;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 215
    const-string v0, "url"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 216
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p2}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 217
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p2}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "ACT"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 220
    iget-object v0, p0, Lo/fih;->d:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 221
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 185
    iget-object v0, p0, Lo/fih;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 17

    .line 61
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/fih$a;

    if-eqz v0, :cond_5

    .line 62
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->e:Ljava/util/List;

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fil;

    .line 63
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 64
    const-string v0, "SocialActRecyclerAdapte"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == operationObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    return-void

    .line 67
    :cond_0
    move-object/from16 v7, p1

    check-cast v7, Lo/fih$a;

    .line 69
    iget-object v0, v7, Lo/fih$a;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lo/fih$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v6}, Lo/fih$1;-><init>(Lo/fih;Lo/fil;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    if-nez p2, :cond_1

    .line 131
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->d:Landroid/content/Context;

    .line 132
    const/high16 v1, 0x42da0000    # 109.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, -0x1

    invoke-direct {v8, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 134
    iget-object v0, v7, Lo/fih$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    move/from16 v0, p2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 139
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->d:Landroid/content/Context;

    .line 140
    const/high16 v1, 0x42da0000    # 109.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, -0x1

    invoke-direct {v8, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 141
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 142
    iget-object v0, v7, Lo/fih$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p2

    if-ne v1, v0, :cond_3

    .line 147
    iget-object v0, v7, Lo/fih$a;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 149
    :cond_3
    iget-object v0, v7, Lo/fih$a;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 151
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fih;->d:Landroid/content/Context;

    invoke-virtual {v6}, Lo/fil;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v7, Lo/fih$a;->c:Landroid/widget/ImageView;

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 153
    iget-object v0, v7, Lo/fih$a;->a:Landroid/widget/TextView;

    invoke-virtual {v6}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    invoke-static {v6}, Lo/fic;->a(Lo/fil;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 159
    iget-object v0, v7, Lo/fih$a;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 161
    :cond_4
    iget-object v0, v7, Lo/fih$a;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 162
    iget-object v0, v7, Lo/fih$a;->d:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fih;->d:Landroid/content/Context;

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

    .line 165
    :goto_1
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 166
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 167
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 168
    invoke-virtual {v8, v11}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    .line 170
    const-wide v0, 0x9a7ec800L

    add-long v13, v9, v0

    .line 171
    new-instance v0, Ljava/util/Date;

    move-wide v1, v13

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object v15, v0

    .line 172
    invoke-virtual {v8, v15}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v16

    .line 174
    iget-object v0, v7, Lo/fih$a;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    iget-object v0, v7, Lo/fih$a;->f:Landroid/widget/TextView;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    iget-object v0, v7, Lo/fih$a;->h:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fih;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_in_progress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, v7, Lo/fih$a;->h:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fih;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_colorAccent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 181
    :cond_5
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 56
    new-instance v0, Lo/fih$a;

    iget-object v1, p0, Lo/fih;->a:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/ui/main/R$layout;->item_social_act_recycler_view:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fih$a;-><init>(Landroid/view/View;)V

    return-object v0
.end method

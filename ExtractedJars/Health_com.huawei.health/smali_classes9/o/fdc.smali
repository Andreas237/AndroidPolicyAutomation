.class public Lo/fdc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroid/os/Handler;

.field c:Landroid/view/View$OnClickListener;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/view/View;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageView;

.field private h:[I

.field private i:Landroid/widget/TableLayout;

.field private k:Lo/elp;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private o:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;Landroid/os/Handler;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 236
    new-instance v0, Lo/fdc$1;

    invoke-direct {v0, p0}, Lo/fdc$1;-><init>(Lo/fdc;)V

    iput-object v0, p0, Lo/fdc;->c:Landroid/view/View$OnClickListener;

    .line 73
    iput-object p1, p0, Lo/fdc;->a:Landroid/app/Activity;

    .line 74
    iput-object p3, p0, Lo/fdc;->b:Landroid/os/Handler;

    .line 75
    iput-object p2, p0, Lo/fdc;->e:Landroid/view/View;

    .line 76
    invoke-direct {p0, p2}, Lo/fdc;->c(Landroid/view/View;)V

    .line 77
    invoke-direct {p0}, Lo/fdc;->b()V

    .line 78
    return-void
.end method

.method private b()V
    .locals 3

    .line 109
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->view_weight_photo_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fdc;->o:Landroid/view/View;

    .line 110
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lo/fdc;->a:Landroid/app/Activity;

    iget-object v2, p0, Lo/fdc;->o:Landroid/view/View;

    invoke-direct {v0, v1, v2}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lo/fdc;->k:Lo/elp;

    .line 111
    iget-object v0, p0, Lo/fdc;->o:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_user_list_parent:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TableLayout;

    iput-object v0, p0, Lo/fdc;->i:Landroid/widget/TableLayout;

    .line 112
    return-void
.end method

.method private b(ILjava/lang/String;Lo/acu;)V
    .locals 3

    .line 265
    invoke-virtual {p3}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v2

    .line 266
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 267
    if-nez p1, :cond_0

    .line 268
    sget-object v0, Lo/act;->a:Lo/act;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    goto :goto_0

    .line 270
    :cond_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, p3}, Lo/act;->c(Lo/acu;)V

    .line 273
    :goto_0
    iget-object v0, p0, Lo/fdc;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 275
    :cond_1
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 7

    .line 118
    iget-object v0, p0, Lo/fdc;->i:Landroid/widget/TableLayout;

    invoke-virtual {v0}, Landroid/widget/TableLayout;->removeAllViews()V

    .line 119
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v3

    .line 120
    invoke-direct {p0}, Lo/fdc;->e()V

    .line 121
    new-instance v4, Lo/acu;

    invoke-direct {v4}, Lo/acu;-><init>()V

    .line 122
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lo/acu;->a(I)V

    .line 123
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_user_list_manager_user:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/acu;->c(Ljava/lang/String;)V

    .line 124
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Lo/fdc;->h:[I

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fdc;->l:Ljava/util/ArrayList;

    .line 129
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_5

    .line 130
    new-instance v6, Landroid/widget/TableRow;

    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-direct {v6, v0}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    .line 131
    new-instance v0, Landroid/widget/TableRow$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/TableRow$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    invoke-direct {p0, v0, v5}, Lo/fdc;->d(Lo/acu;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->addView(Landroid/view/View;)V

    .line 134
    if-nez v5, :cond_1

    .line 135
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    invoke-virtual {v0}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector_cur1:I

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 138
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector1:I

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 140
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v5, v0, :cond_3

    .line 141
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    invoke-virtual {v0}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 142
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector_cur2:I

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 144
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector2:I

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 147
    :cond_3
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    invoke-virtual {v0}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 148
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector_cur:I

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    goto :goto_1

    .line 150
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$drawable;->popup_weight_user_listview_item_selector:I

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setBackgroundResource(I)V

    .line 154
    :goto_1
    iget-object v0, p0, Lo/fdc;->c:Landroid/view/View$OnClickListener;

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TableRow;->setTag(Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lo/fdc;->i:Landroid/widget/TableLayout;

    invoke-virtual {v0, v6}, Landroid/widget/TableLayout;->addView(Landroid/view/View;)V

    .line 129
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 159
    :cond_5
    return-void
.end method

.method static synthetic b(Lo/fdc;Ljava/lang/Integer;Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lo/fdc;->d(Ljava/lang/Integer;Ljava/util/List;)V

    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 1

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->weight_current_user_photo:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fdc;->d:Landroid/widget/ImageView;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->right_title_text:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fdc;->f:Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/huawei/ui/main/R$id;->right_title_spiner:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fdc;->g:Landroid/widget/ImageView;

    .line 84
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    return-void
.end method

.method private c(Landroid/widget/TextView;I)[I
    .locals 4

    .line 207
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 209
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 211
    invoke-virtual {p1, v2, v3}, Landroid/widget/TextView;->measure(II)V

    .line 212
    iget-object v0, p0, Lo/fdc;->h:[I

    invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v1

    aput v1, v0, p2

    .line 213
    iget-object v0, p0, Lo/fdc;->h:[I

    return-object v0
.end method

.method private d(Lo/acu;I)Landroid/view/View;
    .locals 9

    .line 168
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_weight_user_list_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 169
    sget v0, Lcom/huawei/ui/main/R$id;->item_weight_current_user_photo2:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fgc;

    .line 170
    sget v0, Lcom/huawei/ui/main/R$id;->item_weight_current_user_photo1:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 171
    sget v0, Lcom/huawei/ui/main/R$id;->item_right_title_text:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 172
    sget v0, Lcom/huawei/ui/main/R$id;->item_weight_show_underline:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    .line 173
    iget-object v0, p0, Lo/fdc;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    new-instance v8, Landroid/widget/TableRow$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v8, v0, v1}, Landroid/widget/TableRow$LayoutParams;-><init>(II)V

    .line 176
    invoke-virtual {v3, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fgc;->setBorderWidth(I)V

    .line 179
    invoke-virtual {p1}, Lo/acu;->i()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 180
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 181
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Lo/fgc;->setVisibility(I)V

    .line 182
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-static {v0, p1, v6, v5}, Lo/fdr;->a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 185
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 186
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fgc;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-static {v0, p1, v6, v4}, Lo/fdr;->a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 191
    :goto_0
    invoke-direct {p0, v6, p2}, Lo/fdc;->c(Landroid/widget/TextView;I)[I

    .line 192
    iget-object v0, p0, Lo/fdc;->h:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 193
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 196
    :cond_1
    return-object v3
.end method

.method private d()V
    .locals 5

    .line 220
    iget-object v0, p0, Lo/fdc;->h:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    .line 221
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/fdc;->h:[I

    array-length v0, v0

    if-ge v3, v0, :cond_1

    .line 222
    iget-object v0, p0, Lo/fdc;->h:[I

    aget v0, v0, v3

    if-ge v2, v0, :cond_0

    .line 223
    iget-object v0, p0, Lo/fdc;->h:[I

    aget v2, v0, v3

    .line 221
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 227
    :cond_1
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {v3, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 229
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lo/fdc;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 230
    iget-object v0, p0, Lo/fdc;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 229
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 233
    :cond_2
    return-void
.end method

.method private d(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Integer;Ljava/util/List<Lo/acu;>;)V"
        }
    .end annotation

    .line 252
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 253
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lo/fdc;->a:Landroid/app/Activity;

    const-class v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 255
    :cond_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v4

    .line 256
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/acu;

    .line 257
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v5}, Lo/act;->c(Lo/acu;)V

    .line 258
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    iget-object v1, p0, Lo/fdc;->f:Landroid/widget/TextView;

    iget-object v2, p0, Lo/fdc;->d:Landroid/widget/ImageView;

    invoke-static {v0, v5, v1, v2}, Lo/fdr;->a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 259
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, v4, v5}, Lo/fdc;->b(ILjava/lang/String;Lo/acu;)V

    .line 262
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/fdc;)Lo/elp;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/fdc;->k:Lo/elp;

    return-object v0
.end method

.method private e()V
    .locals 9

    .line 287
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v4

    .line 288
    invoke-virtual {v4}, Lo/acu;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 289
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 290
    if-nez v5, :cond_0

    .line 291
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 292
    return-void

    .line 294
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v6

    .line 296
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 297
    const-string v0, "BaseHealthToolbarInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userName is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    new-instance v7, Lcom/huawei/up/api/UpApi;

    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    invoke-direct {v7, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 299
    invoke-virtual {v7}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v8

    .line 300
    const-string v0, "BaseHealthToolbarInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountName is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 302
    move-object v6, v8

    .line 305
    :cond_1
    invoke-virtual {v4, v6}, Lo/acu;->c(Ljava/lang/String;)V

    .line 308
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/acu;->a(Ljava/lang/String;)V

    .line 313
    :cond_2
    iget-object v0, p0, Lo/fdc;->a:Landroid/app/Activity;

    iget-object v1, p0, Lo/fdc;->f:Landroid/widget/TextView;

    iget-object v2, p0, Lo/fdc;->d:Landroid/widget/ImageView;

    invoke-static {v0, v4, v1, v2}, Lo/fdr;->a(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 314
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 98
    iget-object v0, p0, Lo/fdc;->k:Lo/elp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fdc;->k:Lo/elp;

    invoke-virtual {v0}, Lo/elp;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    invoke-direct {p0, p1}, Lo/fdc;->b(Ljava/lang/String;)V

    .line 100
    invoke-direct {p0}, Lo/fdc;->d()V

    .line 101
    iget-object v0, p0, Lo/fdc;->k:Lo/elp;

    iget-object v1, p0, Lo/fdc;->o:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/elp;->e(Landroid/view/View;)V

    .line 102
    iget-object v0, p0, Lo/fdc;->k:Lo/elp;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/elp;->e(Z)V

    .line 103
    iget-object v0, p0, Lo/fdc;->k:Lo/elp;

    iget-object v1, p0, Lo/fdc;->g:Landroid/widget/ImageView;

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 105
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 279
    invoke-direct {p0}, Lo/fdc;->e()V

    .line 280
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 89
    iget-object v0, p0, Lo/fdc;->e:Landroid/view/View;

    if-ne p1, v0, :cond_0

    .line 90
    iget-object v0, p0, Lo/fdc;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fdc;->e(Ljava/lang/String;)V

    .line 92
    :cond_0
    return-void
.end method

.class public Lo/bhm$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 224
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 225
    sget v0, Lcom/huawei/android/sns/R$id;->img_activity:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhm$b;->a:Landroid/widget/ImageView;

    .line 226
    sget v0, Lcom/huawei/android/sns/R$id;->img_act_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhm$b;->d:Landroid/widget/ImageView;

    .line 227
    sget v0, Lcom/huawei/android/sns/R$id;->txt_act_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhm$b;->b:Landroid/widget/TextView;

    .line 228
    sget v0, Lcom/huawei/android/sns/R$id;->txt_act_data_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhm$b;->e:Landroid/widget/TextView;

    .line 230
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhm$b;->c:Landroid/view/View;

    .line 231
    sget v0, Lcom/huawei/android/sns/R$id;->group_activity_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bhm$b;->g:Landroid/widget/RelativeLayout;

    .line 232
    sget v0, Lcom/huawei/android/sns/R$id;->activity_state:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhm$b;->k:Landroid/widget/TextView;

    .line 233
    sget v0, Lcom/huawei/android/sns/R$id;->activity_rule_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhm$b;->f:Landroid/widget/TextView;

    .line 234
    sget v0, Lcom/huawei/android/sns/R$id;->sign_up_tag_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhm$b;->i:Landroid/widget/TextView;

    .line 235
    return-void
.end method

.method static synthetic a(Lo/bhm$b;)Landroid/widget/ImageView;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic b(Lo/bhm$b;)Landroid/widget/TextView;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/bhm$b;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic d(Lo/bhm$b;)Landroid/widget/TextView;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/bhm$b;)Landroid/widget/TextView;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lo/bhm$b;)Landroid/widget/TextView;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lo/bhm$b;)Landroid/view/View;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->c:Landroid/view/View;

    return-object v0
.end method

.method static synthetic i(Lo/bhm$b;)Landroid/widget/TextView;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lo/bhm$b;)Landroid/widget/ImageView;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bhm$b;->d:Landroid/widget/ImageView;

    return-object v0
.end method

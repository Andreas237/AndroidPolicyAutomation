.class public Lo/bim$d;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bim;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 215
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 216
    sget v0, Lcom/huawei/android/sns/R$id;->img_activity:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bim$d;->d:Landroid/widget/ImageView;

    .line 217
    sget v0, Lcom/huawei/android/sns/R$id;->img_act_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bim$d;->c:Landroid/widget/ImageView;

    .line 218
    sget v0, Lcom/huawei/android/sns/R$id;->txt_act_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bim$d;->a:Landroid/widget/TextView;

    .line 219
    sget v0, Lcom/huawei/android/sns/R$id;->txt_act_data_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bim$d;->e:Landroid/widget/TextView;

    .line 221
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bim$d;->b:Landroid/view/View;

    .line 222
    sget v0, Lcom/huawei/android/sns/R$id;->group_activity_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bim$d;->g:Landroid/widget/RelativeLayout;

    .line 223
    sget v0, Lcom/huawei/android/sns/R$id;->activity_state:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bim$d;->f:Landroid/widget/TextView;

    .line 224
    sget v0, Lcom/huawei/android/sns/R$id;->activity_rule_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bim$d;->k:Landroid/widget/TextView;

    .line 225
    sget v0, Lcom/huawei/android/sns/R$id;->sign_up_tag_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bim$d;->h:Landroid/widget/TextView;

    .line 226
    return-void
.end method

.method static synthetic a(Lo/bim$d;)Landroid/widget/TextView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/bim$d;)Landroid/widget/TextView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/bim$d;)Landroid/widget/ImageView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lo/bim$d;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic e(Lo/bim$d;)Landroid/widget/TextView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lo/bim$d;)Landroid/widget/TextView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic h(Lo/bim$d;)Landroid/view/View;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->b:Landroid/view/View;

    return-object v0
.end method

.method static synthetic i(Lo/bim$d;)Landroid/widget/ImageView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->c:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic k(Lo/bim$d;)Landroid/widget/TextView;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/bim$d;->h:Landroid/widget/TextView;

    return-object v0
.end method

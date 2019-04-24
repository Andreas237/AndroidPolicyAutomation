.class public Lo/bhl$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 196
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 197
    sget v0, Lcom/huawei/android/sns/R$id;->linear_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bhl$c;->e:Landroid/widget/RelativeLayout;

    .line 198
    sget v0, Lcom/huawei/android/sns/R$id;->group_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhl$c;->a:Landroid/widget/ImageView;

    .line 199
    sget v0, Lcom/huawei/android/sns/R$id;->group_name_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhl$c;->d:Landroid/widget/TextView;

    .line 200
    sget v0, Lcom/huawei/android/sns/R$id;->group_status_tip_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhl$c;->b:Landroid/widget/TextView;

    .line 201
    sget v0, Lcom/huawei/android/sns/R$id;->divide_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhl$c;->c:Landroid/view/View;

    .line 202
    sget v0, Lcom/huawei/android/sns/R$id;->ll_group_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bhl$c;->h:Landroid/widget/LinearLayout;

    .line 203
    sget v0, Lcom/huawei/android/sns/R$id;->group_type_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhl$c;->i:Landroid/widget/TextView;

    .line 204
    return-void
.end method

.method static synthetic a(Lo/bhl$c;)Landroid/widget/ImageView;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/bhl$c;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic b(Lo/bhl$c;)Landroid/widget/LinearLayout;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/bhl$c;->h:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic c(Lo/bhl$c;)Landroid/widget/TextView;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/bhl$c;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/bhl$c;)Landroid/widget/TextView;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/bhl$c;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/bhl$c;)Landroid/widget/TextView;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/bhl$c;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lo/bhl$c;)Landroid/view/View;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/bhl$c;->c:Landroid/view/View;

    return-object v0
.end method

.method static synthetic i(Lo/bhl$c;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/bhl$c;->e:Landroid/widget/RelativeLayout;

    return-object v0
.end method

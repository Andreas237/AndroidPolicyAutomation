.class public Lo/bhr$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhr;
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

.field private e:Landroid/widget/TextView;

.field private i:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 150
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 151
    sget v0, Lcom/huawei/android/sns/R$id;->rank_num_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhr$c;->b:Landroid/widget/TextView;

    .line 152
    sget v0, Lcom/huawei/android/sns/R$id;->user_nick_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhr$c;->e:Landroid/widget/TextView;

    .line 153
    sget v0, Lcom/huawei/android/sns/R$id;->user_sports_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhr$c;->d:Landroid/widget/TextView;

    .line 154
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhr$c;->a:Landroid/widget/ImageView;

    .line 155
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhr$c;->c:Landroid/view/View;

    .line 156
    sget v0, Lcom/huawei/android/sns/R$id;->division_big_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhr$c;->i:Landroid/view/View;

    .line 157
    return-void
.end method

.method static synthetic a(Lo/bhr$c;)Landroid/widget/TextView;
    .locals 1

    .line 144
    iget-object v0, p0, Lo/bhr$c;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/bhr$c;)Landroid/widget/TextView;
    .locals 1

    .line 144
    iget-object v0, p0, Lo/bhr$c;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/bhr$c;)Landroid/view/View;
    .locals 1

    .line 144
    iget-object v0, p0, Lo/bhr$c;->c:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lo/bhr$c;)Landroid/widget/TextView;
    .locals 1

    .line 144
    iget-object v0, p0, Lo/bhr$c;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/bhr$c;)Landroid/view/View;
    .locals 1

    .line 144
    iget-object v0, p0, Lo/bhr$c;->i:Landroid/view/View;

    return-object v0
.end method

.method static synthetic g(Lo/bhr$c;)Landroid/widget/ImageView;
    .locals 1

    .line 144
    iget-object v0, p0, Lo/bhr$c;->a:Landroid/widget/ImageView;

    return-object v0
.end method

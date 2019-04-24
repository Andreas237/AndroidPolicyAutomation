.class public Lo/bik$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bik;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 188
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 189
    sget v0, Lcom/huawei/android/sns/R$id;->linear_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bik$b;->c:Landroid/widget/RelativeLayout;

    .line 190
    sget v0, Lcom/huawei/android/sns/R$id;->group_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bik$b;->e:Landroid/widget/ImageView;

    .line 191
    sget v0, Lcom/huawei/android/sns/R$id;->group_name_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bik$b;->b:Landroid/widget/TextView;

    .line 192
    sget v0, Lcom/huawei/android/sns/R$id;->group_status_tip_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bik$b;->d:Landroid/widget/TextView;

    .line 193
    sget v0, Lcom/huawei/android/sns/R$id;->divide_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bik$b;->a:Landroid/view/View;

    .line 194
    sget v0, Lcom/huawei/android/sns/R$id;->ll_group_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bik$b;->f:Landroid/widget/LinearLayout;

    .line 195
    sget v0, Lcom/huawei/android/sns/R$id;->group_type_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bik$b;->k:Landroid/widget/TextView;

    .line 196
    return-void
.end method

.method static synthetic a(Lo/bik$b;)Landroid/widget/ImageView;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/bik$b;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic b(Lo/bik$b;)Landroid/widget/LinearLayout;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/bik$b;->f:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic c(Lo/bik$b;)Landroid/widget/TextView;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/bik$b;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/bik$b;)Landroid/widget/TextView;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/bik$b;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/bik$b;)Landroid/widget/TextView;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/bik$b;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lo/bik$b;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/bik$b;->c:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic i(Lo/bik$b;)Landroid/view/View;
    .locals 1

    .line 179
    iget-object v0, p0, Lo/bik$b;->a:Landroid/view/View;

    return-object v0
.end method

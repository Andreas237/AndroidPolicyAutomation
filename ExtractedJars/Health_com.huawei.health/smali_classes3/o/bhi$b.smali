.class public Lo/bhi$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 286
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 287
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhi$b;->e:Landroid/widget/ImageView;

    .line 288
    sget v0, Lcom/huawei/android/sns/R$id;->tv_rank:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhi$b;->c:Landroid/widget/TextView;

    .line 289
    sget v0, Lcom/huawei/android/sns/R$id;->tv_username:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhi$b;->b:Landroid/widget/TextView;

    .line 290
    sget v0, Lcom/huawei/android/sns/R$id;->tv_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhi$b;->a:Landroid/widget/TextView;

    .line 291
    sget v0, Lcom/huawei/android/sns/R$id;->tv_finish_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhi$b;->d:Landroid/widget/TextView;

    .line 292
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhi$b;->f:Landroid/view/View;

    .line 293
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhi$b;->g:Landroid/view/View;

    .line 294
    sget v0, Lcom/huawei/android/sns/R$id;->tv_member_finish_goal_flag:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhi$b;->h:Landroid/widget/TextView;

    .line 295
    return-void
.end method

.method static synthetic a(Lo/bhi$b;)Landroid/widget/TextView;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/bhi$b;)Landroid/widget/TextView;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/bhi$b;)Landroid/widget/TextView;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/bhi$b;)Landroid/widget/TextView;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/bhi$b;)Landroid/widget/ImageView;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic g(Lo/bhi$b;)Landroid/view/View;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->f:Landroid/view/View;

    return-object v0
.end method

.method static synthetic h(Lo/bhi$b;)Landroid/view/View;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->g:Landroid/view/View;

    return-object v0
.end method

.method static synthetic k(Lo/bhi$b;)Landroid/widget/TextView;
    .locals 1

    .line 275
    iget-object v0, p0, Lo/bhi$b;->h:Landroid/widget/TextView;

    return-object v0
.end method

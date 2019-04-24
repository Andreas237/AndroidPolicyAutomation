.class public Lo/bii$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bii;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/view/View;

.field private k:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 288
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 289
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bii$a;->b:Landroid/widget/ImageView;

    .line 290
    sget v0, Lcom/huawei/android/sns/R$id;->tv_rank:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bii$a;->d:Landroid/widget/TextView;

    .line 291
    sget v0, Lcom/huawei/android/sns/R$id;->tv_username:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bii$a;->a:Landroid/widget/TextView;

    .line 292
    sget v0, Lcom/huawei/android/sns/R$id;->tv_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bii$a;->e:Landroid/widget/TextView;

    .line 293
    sget v0, Lcom/huawei/android/sns/R$id;->tv_finish_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bii$a;->c:Landroid/widget/TextView;

    .line 294
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bii$a;->k:Landroid/view/View;

    .line 295
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bii$a;->h:Landroid/view/View;

    .line 296
    sget v0, Lcom/huawei/android/sns/R$id;->tv_member_finish_goal_flag:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bii$a;->g:Landroid/widget/TextView;

    .line 297
    return-void
.end method

.method static synthetic a(Lo/bii$a;)Landroid/widget/ImageView;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->b:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic b(Lo/bii$a;)Landroid/widget/TextView;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/bii$a;)Landroid/widget/TextView;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/bii$a;)Landroid/widget/TextView;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/bii$a;)Landroid/widget/TextView;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lo/bii$a;)Landroid/widget/TextView;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic h(Lo/bii$a;)Landroid/view/View;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->k:Landroid/view/View;

    return-object v0
.end method

.method static synthetic k(Lo/bii$a;)Landroid/view/View;
    .locals 1

    .line 277
    iget-object v0, p0, Lo/bii$a;->h:Landroid/view/View;

    return-object v0
.end method

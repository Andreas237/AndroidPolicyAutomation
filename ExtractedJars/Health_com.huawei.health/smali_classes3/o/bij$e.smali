.class public Lo/bij$e;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bij;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/view/View;

.field private e:Landroid/widget/ImageView;

.field private k:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 160
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 161
    sget v0, Lcom/huawei/android/sns/R$id;->rank_num_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bij$e;->a:Landroid/widget/TextView;

    .line 162
    sget v0, Lcom/huawei/android/sns/R$id;->user_nick_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bij$e;->c:Landroid/widget/TextView;

    .line 163
    sget v0, Lcom/huawei/android/sns/R$id;->user_sports_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bij$e;->b:Landroid/widget/TextView;

    .line 164
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bij$e;->e:Landroid/widget/ImageView;

    .line 165
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bij$e;->d:Landroid/view/View;

    .line 166
    sget v0, Lcom/huawei/android/sns/R$id;->division_big_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bij$e;->k:Landroid/view/View;

    .line 167
    return-void
.end method

.method static synthetic a(Lo/bij$e;)Landroid/widget/TextView;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/bij$e;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/bij$e;)Landroid/widget/TextView;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/bij$e;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/bij$e;)Landroid/view/View;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/bij$e;->k:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lo/bij$e;)Landroid/widget/ImageView;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/bij$e;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lo/bij$e;)Landroid/view/View;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/bij$e;->d:Landroid/view/View;

    return-object v0
.end method

.method static synthetic i(Lo/bij$e;)Landroid/widget/TextView;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/bij$e;->b:Landroid/widget/TextView;

    return-object v0
.end method

.class public Lo/ya$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ya;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/ImageView;

.field final synthetic d:Lo/ya;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lo/ya;Landroid/view/View;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/ya$a;->d:Lo/ya;

    .line 104
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 106
    invoke-direct {p0, p2}, Lo/ya$a;->b(Landroid/view/View;)V

    .line 107
    return-void
.end method

.method static synthetic b(Lo/ya$a;)Landroid/widget/ImageView;
    .locals 1

    .line 96
    iget-object v0, p0, Lo/ya$a;->b:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b(Landroid/view/View;)V
    .locals 2

    .line 110
    sget v0, Lcom/huawei/bone/social/R$id;->user_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ya$a;->b:Landroid/widget/ImageView;

    .line 111
    sget v0, Lcom/huawei/bone/social/R$id;->user_like_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ya$a;->e:Landroid/widget/TextView;

    .line 112
    sget v0, Lcom/huawei/bone/social/R$id;->time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ya$a;->a:Landroid/widget/TextView;

    .line 113
    sget v0, Lcom/huawei/bone/social/R$id;->like_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ya$a;->c:Landroid/widget/ImageView;

    .line 115
    iget-object v0, p0, Lo/ya$a;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ic_collect_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 116
    return-void
.end method

.method static synthetic c(Lo/ya$a;)Landroid/widget/TextView;
    .locals 1

    .line 96
    iget-object v0, p0, Lo/ya$a;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/ya$a;)Landroid/widget/TextView;
    .locals 1

    .line 96
    iget-object v0, p0, Lo/ya$a;->a:Landroid/widget/TextView;

    return-object v0
.end method

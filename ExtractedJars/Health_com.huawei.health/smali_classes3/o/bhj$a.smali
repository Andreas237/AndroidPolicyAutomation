.class public Lo/bhj$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lo/egb;

.field private b:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 62
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 63
    sget v0, Lcom/huawei/android/sns/R$id;->memb_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhj$a;->b:Landroid/widget/ImageView;

    .line 64
    sget v0, Lcom/huawei/android/sns/R$id;->user_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/bhj$a;->a:Lo/egb;

    .line 65
    return-void
.end method

.method static synthetic c(Lo/bhj$a;)Landroid/widget/ImageView;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/bhj$a;->b:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lo/bhj$a;)Lo/egb;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/bhj$a;->a:Lo/egb;

    return-object v0
.end method

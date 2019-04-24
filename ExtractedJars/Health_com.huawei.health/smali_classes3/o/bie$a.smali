.class public Lo/bie$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bie;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private b:Lo/egb;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 64
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 65
    sget v0, Lcom/huawei/android/sns/R$id;->memb_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bie$a;->e:Landroid/widget/ImageView;

    .line 66
    sget v0, Lcom/huawei/android/sns/R$id;->user_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/bie$a;->b:Lo/egb;

    .line 67
    return-void
.end method

.method static synthetic b(Lo/bie$a;)Landroid/widget/ImageView;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/bie$a;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lo/bie$a;)Lo/egb;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/bie$a;->b:Lo/egb;

    return-object v0
.end method

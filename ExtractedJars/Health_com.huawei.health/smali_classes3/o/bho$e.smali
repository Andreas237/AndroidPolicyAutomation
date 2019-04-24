.class public Lo/bho$e;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bho;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Lo/egb;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 157
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 158
    sget v0, Lcom/huawei/android/sns/R$id;->memb_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bho$e;->a:Landroid/widget/ImageView;

    .line 159
    sget v0, Lcom/huawei/android/sns/R$id;->user_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/bho$e;->b:Lo/egb;

    .line 160
    return-void
.end method

.method static synthetic d(Lo/bho$e;)Lo/egb;
    .locals 1

    .line 153
    iget-object v0, p0, Lo/bho$e;->b:Lo/egb;

    return-object v0
.end method

.method static synthetic e(Lo/bho$e;)Landroid/widget/ImageView;
    .locals 1

    .line 153
    iget-object v0, p0, Lo/bho$e;->a:Landroid/widget/ImageView;

    return-object v0
.end method

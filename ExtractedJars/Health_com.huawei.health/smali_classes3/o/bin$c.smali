.class public Lo/bin$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Lo/egb;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 80
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 81
    sget v0, Lcom/huawei/android/sns/R$id;->memb_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bin$c;->e:Landroid/widget/ImageView;

    .line 82
    sget v0, Lcom/huawei/android/sns/R$id;->user_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/bin$c;->a:Lo/egb;

    .line 83
    return-void
.end method

.method static synthetic a(Lo/bin$c;)Lo/egb;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/bin$c;->a:Lo/egb;

    return-object v0
.end method

.method static synthetic e(Lo/bin$c;)Landroid/widget/ImageView;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/bin$c;->e:Landroid/widget/ImageView;

    return-object v0
.end method

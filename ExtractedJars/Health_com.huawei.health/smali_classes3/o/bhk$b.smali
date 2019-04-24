.class public Lo/bhk$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/widget/CheckBox;

.field private b:Landroid/widget/TextView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 205
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 206
    sget v0, Lcom/huawei/android/sns/R$id;->memb_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhk$b;->d:Landroid/widget/ImageView;

    .line 207
    sget v0, Lcom/huawei/android/sns/R$id;->memb_name_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhk$b;->b:Landroid/widget/TextView;

    .line 208
    sget v0, Lcom/huawei/android/sns/R$id;->memb_select_check:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/bhk$b;->a:Landroid/widget/CheckBox;

    .line 209
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bhk$b;->e:Landroid/view/View;

    .line 210
    return-void
.end method

.method static synthetic b(Lo/bhk$b;)Landroid/view/View;
    .locals 1

    .line 199
    iget-object v0, p0, Lo/bhk$b;->e:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lo/bhk$b;)Landroid/widget/ImageView;
    .locals 1

    .line 199
    iget-object v0, p0, Lo/bhk$b;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lo/bhk$b;)Landroid/widget/CheckBox;
    .locals 1

    .line 199
    iget-object v0, p0, Lo/bhk$b;->a:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic e(Lo/bhk$b;)Landroid/widget/TextView;
    .locals 1

    .line 199
    iget-object v0, p0, Lo/bhk$b;->b:Landroid/widget/TextView;

    return-object v0
.end method

.class public Lo/bil$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/CheckBox;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 208
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 209
    sget v0, Lcom/huawei/android/sns/R$id;->memb_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bil$c;->a:Landroid/widget/ImageView;

    .line 210
    sget v0, Lcom/huawei/android/sns/R$id;->memb_name_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bil$c;->d:Landroid/widget/TextView;

    .line 211
    sget v0, Lcom/huawei/android/sns/R$id;->memb_select_check:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/bil$c;->b:Landroid/widget/CheckBox;

    .line 212
    sget v0, Lcom/huawei/android/sns/R$id;->divison_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bil$c;->c:Landroid/view/View;

    .line 213
    return-void
.end method

.method static synthetic a(Lo/bil$c;)Landroid/view/View;
    .locals 1

    .line 202
    iget-object v0, p0, Lo/bil$c;->c:Landroid/view/View;

    return-object v0
.end method

.method static synthetic b(Lo/bil$c;)Landroid/widget/TextView;
    .locals 1

    .line 202
    iget-object v0, p0, Lo/bil$c;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/bil$c;)Landroid/widget/ImageView;
    .locals 1

    .line 202
    iget-object v0, p0, Lo/bil$c;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lo/bil$c;)Landroid/widget/CheckBox;
    .locals 1

    .line 202
    iget-object v0, p0, Lo/bil$c;->b:Landroid/widget/CheckBox;

    return-object v0
.end method

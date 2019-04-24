.class public Lo/fij$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fij;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/view/View;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/ImageView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 177
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 178
    sget v0, Lcom/huawei/ui/main/R$id;->activity:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fij$a;->b:Landroid/widget/LinearLayout;

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->activity_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fij$a;->e:Landroid/widget/ImageView;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->activity_item_divide:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fij$a;->c:Landroid/view/View;

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->activity_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fij$a;->d:Landroid/widget/TextView;

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->activity_join_num:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fij$a;->a:Landroid/widget/TextView;

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->activity_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fij$a;->f:Landroid/widget/TextView;

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->activity_start_date:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fij$a;->h:Landroid/widget/TextView;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->activity_end_date:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fij$a;->g:Landroid/widget/TextView;

    .line 187
    return-void
.end method

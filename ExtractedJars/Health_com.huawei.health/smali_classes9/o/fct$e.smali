.class Lo/fct$e;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fct;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field public a:Landroid/widget/TextView;

.field public b:Landroid/view/View;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field final synthetic f:Lo/fct;

.field public g:Landroid/view/View;


# direct methods
.method constructor <init>(Lo/fct;Landroid/view/View;)V
    .locals 1

    .line 242
    iput-object p1, p0, Lo/fct$e;->f:Lo/fct;

    .line 243
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 244
    iput-object p2, p0, Lo/fct$e;->b:Landroid/view/View;

    .line 245
    sget v0, Lcom/huawei/ui/main/R$id;->body_index_recycle_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fct$e;->a:Landroid/widget/TextView;

    .line 246
    sget v0, Lcom/huawei/ui/main/R$id;->body_index_recycle_value:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fct$e;->d:Landroid/widget/TextView;

    .line 247
    sget v0, Lcom/huawei/ui/main/R$id;->body_index_recycle_unit:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fct$e;->c:Landroid/widget/TextView;

    .line 248
    sget v0, Lcom/huawei/ui/main/R$id;->body_index_recycle_level:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fct$e;->e:Landroid/widget/TextView;

    .line 249
    sget v0, Lcom/huawei/ui/main/R$id;->body_index_recycle_margin_view:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fct$e;->g:Landroid/view/View;

    .line 251
    return-void
.end method

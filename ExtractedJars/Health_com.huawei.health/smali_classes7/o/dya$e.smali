.class Lo/dya$e;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dya;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field a:Landroid/widget/GridView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/LinearLayout;

.field final synthetic d:Lo/dya;


# direct methods
.method public constructor <init>(Lo/dya;Landroid/view/View;)V
    .locals 1

    .line 181
    iput-object p1, p0, Lo/dya$e;->d:Lo/dya;

    .line 182
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 183
    sget v0, Lcom/huawei/pluginachievement/R$id;->second_item_ll:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/dya$e;->c:Landroid/widget/LinearLayout;

    .line 184
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_leibie:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/dya$e;->b:Landroid/widget/TextView;

    .line 185
    sget v0, Lcom/huawei/pluginachievement/R$id;->medal_gridview:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lo/dya$e;->a:Landroid/widget/GridView;

    .line 186
    return-void
.end method

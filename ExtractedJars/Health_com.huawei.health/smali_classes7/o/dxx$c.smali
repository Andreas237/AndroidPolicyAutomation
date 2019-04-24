.class Lo/dxx$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dxx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/TextView;

.field final synthetic d:Lo/dxx;

.field e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lo/dxx;Landroid/view/View;)V
    .locals 1

    .line 108
    iput-object p1, p0, Lo/dxx$c;->d:Lo/dxx;

    .line 109
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 110
    sget v0, Lcom/huawei/pluginachievement/R$id;->share_medal_list_item_ll:I

    invoke-static {p2, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/dxx$c;->b:Landroid/widget/LinearLayout;

    .line 111
    sget v0, Lcom/huawei/pluginachievement/R$id;->share_medal_list_item_iv:I

    invoke-static {p2, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/dxx$c;->e:Landroid/widget/ImageView;

    .line 112
    sget v0, Lcom/huawei/pluginachievement/R$id;->share_medal_list_item_tv:I

    invoke-static {p2, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/dxx$c;->c:Landroid/widget/TextView;

    .line 113
    return-void
.end method

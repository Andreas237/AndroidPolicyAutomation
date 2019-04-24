.class Lo/exa$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/exa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field a:Landroid/widget/ImageView;

.field b:Landroid/widget/ImageView;

.field c:Landroid/widget/TextView;

.field final synthetic e:Lo/exa;


# direct methods
.method public constructor <init>(Lo/exa;Landroid/view/View;)V
    .locals 1

    .line 116
    iput-object p1, p0, Lo/exa$c;->e:Lo/exa;

    .line 117
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->service_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/exa$c;->a:Landroid/widget/ImageView;

    .line 119
    sget v0, Lcom/huawei/ui/main/R$id;->service_icon_square:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/exa$c;->b:Landroid/widget/ImageView;

    .line 120
    sget v0, Lcom/huawei/ui/main/R$id;->service_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/exa$c;->c:Landroid/widget/TextView;

    .line 121
    return-void
.end method

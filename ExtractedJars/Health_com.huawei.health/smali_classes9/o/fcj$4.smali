.class Lo/fcj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcj;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fcj;

.field final synthetic e:Landroid/support/v7/widget/RecyclerView$ViewHolder;


# direct methods
.method constructor <init>(Lo/fcj;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/fcj$4;->b:Lo/fcj;

    iput-object p2, p0, Lo/fcj$4;->e:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 87
    iget-object v0, p0, Lo/fcj$4;->b:Lo/fcj;

    invoke-static {v0}, Lo/fcj;->e(Lo/fcj;)Lo/fdt;

    move-result-object v0

    invoke-interface {v0}, Lo/fdt;->a()V

    .line 88
    iget-object v0, p0, Lo/fcj$4;->b:Lo/fcj;

    invoke-static {v0}, Lo/fcj;->b(Lo/fcj;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lo/fcj$4;->b:Lo/fcj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fcj;->c(Lo/fcj;Z)Z

    .line 90
    iget-object v0, p0, Lo/fcj$4;->e:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_cancel_2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 92
    :cond_0
    iget-object v0, p0, Lo/fcj$4;->b:Lo/fcj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fcj;->c(Lo/fcj;Z)Z

    .line 93
    iget-object v0, p0, Lo/fcj$4;->e:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_add:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 95
    :goto_0
    return-void
.end method

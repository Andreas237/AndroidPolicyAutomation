.class public Lo/dyo;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private b:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 25
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 26
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_title_text:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/dyo;->e:Landroid/widget/TextView;

    .line 27
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_title_text_rl:I

    invoke-static {p1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/dyo;->b:Landroid/widget/RelativeLayout;

    .line 28
    return-void
.end method


# virtual methods
.method public e(Lo/dyw;)V
    .locals 3

    .line 31
    if-eqz p1, :cond_1

    .line 32
    iget-object v0, p0, Lo/dyo;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 33
    invoke-virtual {p1}, Lo/dyw;->b()Ljava/lang/String;

    move-result-object v2

    .line 34
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lo/dyo;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lo/dyo;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 38
    iget-object v0, p0, Lo/dyo;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/dyw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    :cond_1
    :goto_0
    return-void
.end method

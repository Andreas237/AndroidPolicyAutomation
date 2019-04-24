.class public abstract Lo/ezj;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ezj$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field protected f:Lo/ezh;

.field protected i:Lo/ezj$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    iput-object p2, p0, Lo/ezj;->f:Lo/ezh;

    .line 30
    invoke-virtual {p0, p3, p4}, Lo/ezj;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    return-void
.end method


# virtual methods
.method public abstract a(Lo/eih;II)V
.end method

.method public a(Z)V
    .locals 1

    .line 69
    iget-object v0, p0, Lo/ezj;->i:Lo/ezj$a;

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lo/ezj;->i:Lo/ezj$a;

    invoke-interface {v0, p1}, Lo/ezj$a;->c(Z)V

    .line 72
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .line 53
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lo/ezj;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    return-void
.end method

.method protected b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 34
    invoke-virtual {p0}, Lo/ezj;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->view_scrollchart_observer:I

    invoke-static {v0, v1, p0}, Lo/ezj;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 35
    sget v0, Lcom/huawei/ui/main/R$id;->data_title:I

    invoke-virtual {p0, v0}, Lo/ezj;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ezj;->a:Landroid/widget/TextView;

    .line 36
    sget v0, Lcom/huawei/ui/main/R$id;->data_content:I

    invoke-virtual {p0, v0}, Lo/ezj;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ezj;->d:Landroid/widget/TextView;

    .line 37
    sget v0, Lcom/huawei/ui/main/R$id;->data_unit:I

    invoke-virtual {p0, v0}, Lo/ezj;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ezj;->e:Landroid/widget/TextView;

    .line 39
    iget-object v0, p0, Lo/ezj;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v0, p0, Lo/ezj;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    return-void
.end method

.method public c()Lo/ezt;
    .locals 1

    .line 56
    const/4 v0, 0x0

    return-object v0
.end method

.method public setContentText(Ljava/lang/String;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/ezj;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    return-void
.end method

.method public setOnViewFocusListener(Lo/ezj$a;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lo/ezj;->i:Lo/ezj$a;

    .line 66
    return-void
.end method

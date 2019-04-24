.class public abstract Lo/ezg;
.super Lo/ezj;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ezj;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lo/ezg;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->view_heart_rate_scrollchart_observer:I

    invoke-static {v0, v1, p0}, Lo/ezg;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    sget v0, Lcom/huawei/ui/main/R$id;->data_title:I

    invoke-virtual {p0, v0}, Lo/ezg;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ezg;->c:Landroid/widget/TextView;

    .line 26
    sget v0, Lcom/huawei/ui/main/R$id;->data_content:I

    invoke-virtual {p0, v0}, Lo/ezg;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ezg;->b:Landroid/widget/TextView;

    .line 27
    sget v0, Lcom/huawei/ui/main/R$id;->data_unit:I

    invoke-virtual {p0, v0}, Lo/ezg;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ezg;->a:Landroid/widget/TextView;

    .line 28
    iget-object v0, p0, Lo/ezg;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    iget-object v0, p0, Lo/ezg;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    return-void
.end method

.method public setContentText(Ljava/lang/String;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lo/ezg;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    return-void
.end method

.class public Lo/bgw;
.super Lo/bfl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 30
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 2

    .line 35
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bgw;->a:Landroid/widget/ImageView;

    .line 36
    iget-object v0, p0, Lo/bgw;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_add_group_member:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 37
    invoke-virtual {p0, p1}, Lo/bgw;->a(Landroid/view/View;)V

    .line 38
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 0

    .line 44
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 45
    return-void
.end method

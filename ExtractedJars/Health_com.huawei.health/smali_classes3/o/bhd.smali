.class public Lo/bhd;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhd;->f:Landroid/widget/ImageView;

    .line 36
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 41
    sget v0, Lcom/huawei/android/sns/R$id;->divider_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhd;->f:Landroid/widget/ImageView;

    .line 42
    invoke-virtual {p0, p1}, Lo/bhd;->a(Landroid/view/View;)V

    .line 43
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 2

    .line 49
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 50
    instance-of v0, p1, Lo/axz;

    if-eqz v0, :cond_1

    .line 52
    invoke-virtual {p1}, Lo/bfh;->isNeedHideDivider()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lo/bhd;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, Lo/bhd;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 61
    :cond_1
    :goto_0
    return-void
.end method

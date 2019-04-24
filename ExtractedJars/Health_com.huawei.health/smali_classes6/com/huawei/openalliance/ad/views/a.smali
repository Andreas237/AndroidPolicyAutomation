.class public Lcom/huawei/openalliance/ad/views/a;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/a$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/ImageView;

.field private d:Lcom/huawei/openalliance/ad/views/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 5

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    const/16 v1, 0x97

    const/16 v2, 0xa8

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/a;->setBackgroundColor(I)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$dimen;->hiad_8_dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    move v4, v3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;)I

    move-result v0

    add-int v4, v3, v0

    :cond_0
    invoke-virtual {p0, v3, v4, v3, v3}, Lcom/huawei/openalliance/ad/views/a;->setPadding(IIII)V

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/a;->a(Landroid/content/Context;Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a;->a()V

    return-void
.end method

.method private a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method private a(Landroid/content/Context;Z)V
    .locals 2

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_custom_emui_action_bar:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_back_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->c:Landroid/widget/ImageView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_title_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->a:Landroid/widget/TextView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_menu_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->b:Landroid/widget/ImageView;

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->a:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->d:Lcom/huawei/openalliance/ad/views/a$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->c:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->d:Lcom/huawei/openalliance/ad/views/a$a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/a$a;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->b:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->d:Lcom/huawei/openalliance/ad/views/a$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a;->b:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/a$a;->onMenuBtnClick(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setCallBack(Lcom/huawei/openalliance/ad/views/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a;->d:Lcom/huawei/openalliance/ad/views/a$a;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

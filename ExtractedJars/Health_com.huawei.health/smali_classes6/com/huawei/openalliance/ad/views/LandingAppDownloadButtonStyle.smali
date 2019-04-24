.class public Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;
.super Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$drawable;->hiad_landing_app_down_btn_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$color;->hiad_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setTextColor(I)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$drawable;->hiad_landing_app_down_btn_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$color;->hiad_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setTextColor(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/LandingAppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    return-object v0
.end method

.class public Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
    }
.end annotation


# instance fields
.field protected installingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation
.end field

.field protected normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation
.end field

.field protected processingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->processingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->installingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_down_btn_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->background:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$color;->hiad_down_normal_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textColor:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->processingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    sget v1, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_down_btn_processing:I

    invoke-virtual {p0, p1, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->processingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$color;->hiad_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setTextColor(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->installingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_down_btn_installing:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->installingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$color;->hiad_app_down_installing_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->setTextColor(I)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    :cond_0
    return-object v2
.end method

.method protected a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$drawable;->hiad_app_down_btn_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->background:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/openalliance/ad/R$color;->hiad_down_normal_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textColor:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->normalStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    return-object v0
.end method

.method public getStyle(Landroid/content/Context;Lcom/huawei/openalliance/ad/download/app/AppStatus;)Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    sget-object v0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$1;->a:[I

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/download/app/AppStatus;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->processingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->installingStyle:Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    goto :goto_1

    :goto_0
    :pswitch_2
    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;

    move-result-object v2

    :goto_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

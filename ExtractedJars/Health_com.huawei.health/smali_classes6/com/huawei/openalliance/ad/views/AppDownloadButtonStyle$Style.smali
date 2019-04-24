.class public Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Style"
.end annotation


# instance fields
.field protected background:Landroid/graphics/drawable/Drawable;
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation
.end field

.field protected textColor:I
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation
.end field

.field protected textSize:I
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc

    iput v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textSize:I

    return-void
.end method


# virtual methods
.method public getBackground()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->background:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getTextColor()I
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textColor:I

    return v0
.end method

.method public getTextSize()I
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textSize:I

    return v0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->background:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setTextColor(I)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textColor:I

    return-void
.end method

.method public setTextSize(I)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle$Style;->textSize:I

    return-void
.end method

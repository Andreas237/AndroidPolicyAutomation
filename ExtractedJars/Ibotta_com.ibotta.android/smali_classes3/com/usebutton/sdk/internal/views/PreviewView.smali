.class public Lcom/usebutton/sdk/internal/views/PreviewView;
.super Landroid/widget/LinearLayout;
.source "PreviewView.java"


# instance fields
.field private mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

.field private mLabel:Landroid/widget/TextView;

.field private mLoading:Landroid/view/View;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mTextsContainer:Landroid/view/ViewGroup;

.field private mTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 61
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private bindTexts(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mTitle:Landroid/widget/TextView;

    invoke-static {v0, p1}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 99
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mLabel:Landroid/widget/TextView;

    invoke-static {p1, p2}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    return-void
.end method


# virtual methods
.method public bind(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/PreviewView;->bindTexts(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V

    if-eqz p3, :cond_0

    .line 105
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public bind(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Asset;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/PreviewView;->bindTexts(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V

    if-eqz p3, :cond_0

    .line 93
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setAsset(Lcom/usebutton/sdk/internal/models/Asset;)V

    :cond_0
    return-void
.end method

.method public getIcon()Lcom/usebutton/sdk/internal/views/AssetImageView;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    return-object v0
.end method

.method public getLabel()Landroid/widget/TextView;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mLabel:Landroid/widget/TextView;

    return-object v0
.end method

.method public getLoadingView()Landroid/view/View;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mLoading:Landroid/view/View;

    return-object v0
.end method

.method public getTextsContainer()Landroid/view/ViewGroup;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mTextsContainer:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public getTitle()Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 66
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 67
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview_title:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mTitle:Landroid/widget/TextView;

    .line 68
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview_label:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mLabel:Landroid/widget/TextView;

    .line 69
    sget v0, Lcom/usebutton/sdk/R$id;->btn_texts:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mTextsContainer:Landroid/view/ViewGroup;

    .line 70
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview_icon:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/AssetImageView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    .line 71
    sget v0, Lcom/usebutton/sdk/R$id;->btn_preview_loading:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mLoading:Landroid/view/View;

    return-void
.end method

.method public setIsLoading(Z)V
    .locals 4

    .line 110
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PreviewView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/usebutton/sdk/R$color;->btn_placeholder:I

    invoke-static {v2, v3}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->getColor(Landroid/content/Context;I)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setBackgroundColor(I)V

    .line 111
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mLoading:Landroid/view/View;

    const/16 v2, 0x8

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    const/16 v3, 0x8

    .line 112
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 114
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mTitle:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    const/16 v3, 0x8

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 115
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mLabel:Landroid/widget/TextView;

    if-eqz p1, :cond_4

    const/16 v1, 0x8

    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p1, :cond_5

    .line 118
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PreviewView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    return-void
.end method

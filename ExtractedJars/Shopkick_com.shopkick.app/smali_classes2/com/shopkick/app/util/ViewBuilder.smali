.class public Lcom/shopkick/app/util/ViewBuilder;
.super Ljava/lang/Object;
.source "ViewBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;
    }
.end annotation


# static fields
.field private static final NO_GRAVITY:I = -0x1


# instance fields
.field private textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/TextStyleConfigurator;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/util/ViewBuilder;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/View;)Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;
    .locals 2

    .line 29
    new-instance v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;

    invoke-direct {v0}, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;-><init>()V

    .line 30
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 31
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-virtual {p0, v1, p2}, Lcom/shopkick/app/util/ViewBuilder;->populateImageView(Landroid/widget/ImageView;Lcom/shopkick/app/fetchers/api/skapi/View;)Z

    move-result p1

    iput-boolean p1, v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->usesSpecialCoordinates:Z

    .line 33
    iput-object v1, v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 35
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x11

    .line 36
    invoke-virtual {p0, v1, p2, p1}, Lcom/shopkick/app/util/ViewBuilder;->populateTextView(Landroid/widget/TextView;Lcom/shopkick/app/fetchers/api/skapi/View;I)Z

    move-result p1

    iput-boolean p1, v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->usesSpecialCoordinates:Z

    .line 37
    iput-object v1, v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    goto :goto_0

    .line 39
    :cond_1
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    .line 40
    iget-object p1, v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->view:Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/ViewBuilder;->populateView(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/View;)Z

    move-result p1

    iput-boolean p1, v0, Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;->usesSpecialCoordinates:Z

    :goto_0
    return-object v0
.end method

.method public createViewGroup(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;",
            ">;"
        }
    .end annotation

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 103
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;->views:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/View;

    .line 104
    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/util/ViewBuilder;->createView(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/View;)Lcom/shopkick/app/util/ViewBuilder$ConfiguredView;

    move-result-object v1

    .line 105
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public populateImageView(Landroid/widget/ImageView;Lcom/shopkick/app/fetchers/api/skapi/View;)Z
    .locals 3

    .line 70
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->setFrameForView(Lcom/shopkick/app/fetchers/api/skapi/Rectangle;Landroid/view/View;)Z

    move-result v0

    .line 72
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 75
    :goto_0
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->imageUrl:Ljava/lang/String;

    .line 76
    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    const/4 v2, 0x1

    .line 77
    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    .line 78
    invoke-virtual {v1, p1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 80
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/ViewBuilder;->setViewBackgroundColor(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/View;)V

    return v0
.end method

.method public populateTextView(Landroid/widget/TextView;Lcom/shopkick/app/fetchers/api/skapi/View;)Z
    .locals 1

    const/4 v0, -0x1

    .line 47
    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/util/ViewBuilder;->populateTextView(Landroid/widget/TextView;Lcom/shopkick/app/fetchers/api/skapi/View;I)Z

    move-result p1

    return p1
.end method

.method public populateTextView(Landroid/widget/TextView;Lcom/shopkick/app/fetchers/api/skapi/View;I)Z
    .locals 4

    .line 52
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->setFrameForView(Lcom/shopkick/app/fetchers/api/skapi/Rectangle;Landroid/view/View;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 55
    :goto_0
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->androidStyle:Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;

    if-eqz v2, :cond_1

    .line 56
    iget-object v2, p0, Lcom/shopkick/app/util/ViewBuilder;->textStyleConfigurator:Lcom/shopkick/app/util/TextStyleConfigurator;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->androidStyle:Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;

    invoke-virtual {v2, v3, p1}, Lcom/shopkick/app/util/TextStyleConfigurator;->setStyleForTextView(Lcom/shopkick/app/fetchers/api/skapi/AndroidTextStyle;Landroid/widget/TextView;)V

    .line 58
    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const/4 v1, -0x1

    if-eq p3, v1, :cond_2

    .line 59
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setGravity(I)V

    .line 61
    :cond_2
    iget-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->text:Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/ViewBuilder;->setViewBackgroundColor(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/View;)V

    return v0
.end method

.method public populateView(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/View;)Z
    .locals 1

    .line 86
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->frame:Lcom/shopkick/app/fetchers/api/skapi/Rectangle;

    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->setFrameForView(Lcom/shopkick/app/fetchers/api/skapi/Rectangle;Landroid/view/View;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 90
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/ViewBuilder;->setViewBackgroundColor(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/View;)V

    return v0
.end method

.method public setViewBackgroundColor(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/View;)V
    .locals 1

    .line 95
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->bgColor:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 96
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/View;->bgColor:Ljava/lang/String;

    invoke-static {p2}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

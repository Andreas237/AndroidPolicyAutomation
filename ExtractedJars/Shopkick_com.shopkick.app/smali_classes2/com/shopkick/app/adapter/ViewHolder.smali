.class public Lcom/shopkick/app/adapter/ViewHolder;
.super Ljava/lang/Object;
.source "ViewHolder.java"


# instance fields
.field private idToViewMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/adapter/ViewId;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private view:Landroid/view/View;

.field private viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->idToViewMap:Ljava/util/HashMap;

    return-void
.end method

.method private mapIdsToViews(Landroid/view/View;)V
    .locals 3

    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 37
    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewHolder;->idToViewMap:Ljava/util/HashMap;

    new-instance v2, Lcom/shopkick/app/adapter/ViewId;

    invoke-direct {v2, v0}, Lcom/shopkick/app/adapter/ViewId;-><init>(I)V

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 41
    check-cast p1, Landroid/view/ViewGroup;

    .line 42
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 44
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 45
    invoke-direct {p0, v2}, Lcom/shopkick/app/adapter/ViewHolder;->mapIdsToViews(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->idToViewMap:Ljava/util/HashMap;

    new-instance v1, Lcom/shopkick/app/adapter/ViewId;

    invoke-direct {v1, p2}, Lcom/shopkick/app/adapter/ViewId;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getBitmapOnImageView(I)Landroid/graphics/Bitmap;
    .locals 1

    .line 75
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p1

    .line 76
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 77
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 78
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 79
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getBitmapOnImageView(Lcom/shopkick/app/adapter/ViewId;)Landroid/graphics/Bitmap;
    .locals 1

    .line 95
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getImageView(Lcom/shopkick/app/adapter/ViewId;)Landroid/widget/ImageView;

    move-result-object p1

    .line 96
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 97
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 98
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 99
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getBitmapOnImageView(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 85
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getImageView(Ljava/lang/String;)Landroid/widget/ImageView;

    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 87
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 88
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 89
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getButton(I)Landroid/widget/Button;
    .locals 0

    .line 105
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    return-object p1
.end method

.method public getButton(Lcom/shopkick/app/adapter/ViewId;)Landroid/widget/Button;
    .locals 0

    .line 113
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Lcom/shopkick/app/adapter/ViewId;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    return-object p1
.end method

.method public getButton(Ljava/lang/String;)Landroid/widget/Button;
    .locals 0

    .line 109
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    return-object p1
.end method

.method public getFrameLayout(I)Landroid/widget/FrameLayout;
    .locals 0

    .line 140
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public getFrameLayout(Lcom/shopkick/app/adapter/ViewId;)Landroid/widget/FrameLayout;
    .locals 0

    .line 144
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Lcom/shopkick/app/adapter/ViewId;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public getFrameLayout(Ljava/lang/String;)Landroid/widget/FrameLayout;
    .locals 0

    .line 142
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    return-object p1
.end method

.method public getImageView(I)Landroid/widget/ImageView;
    .locals 0

    .line 63
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    return-object p1
.end method

.method public getImageView(Lcom/shopkick/app/adapter/ViewId;)Landroid/widget/ImageView;
    .locals 0

    .line 71
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Lcom/shopkick/app/adapter/ViewId;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    return-object p1
.end method

.method public getImageView(Ljava/lang/String;)Landroid/widget/ImageView;
    .locals 0

    .line 67
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    return-object p1
.end method

.method public getRelativeLayout(I)Landroid/widget/RelativeLayout;
    .locals 0

    .line 129
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public getRelativeLayout(Lcom/shopkick/app/adapter/ViewId;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 137
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Lcom/shopkick/app/adapter/ViewId;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public getRelativeLayout(Ljava/lang/String;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 133
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public getTextView(I)Landroid/widget/TextView;
    .locals 0

    .line 117
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    return-object p1
.end method

.method public getTextView(Lcom/shopkick/app/adapter/ViewId;)Landroid/widget/TextView;
    .locals 0

    .line 125
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Lcom/shopkick/app/adapter/ViewId;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    return-object p1
.end method

.method public getTextView(Ljava/lang/String;)Landroid/widget/TextView;
    .locals 0

    .line 121
    invoke-virtual {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getView(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    return-object p1
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->view:Landroid/view/View;

    return-object v0
.end method

.method public getView(I)Landroid/view/View;
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->idToViewMap:Ljava/util/HashMap;

    new-instance v1, Lcom/shopkick/app/adapter/ViewId;

    invoke-direct {v1, p1}, Lcom/shopkick/app/adapter/ViewId;-><init>(I)V

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public getView(Lcom/shopkick/app/adapter/ViewId;)Landroid/view/View;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->idToViewMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public getView(Ljava/lang/String;)Landroid/view/View;
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->idToViewMap:Ljava/util/HashMap;

    new-instance v1, Lcom/shopkick/app/adapter/ViewId;

    invoke-direct {v1, p1}, Lcom/shopkick/app/adapter/ViewId;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public hasSavedDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)Z
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/adapter/ViewDefaults;->hasSavedDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public populate(Landroid/view/View;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewHolder;->view:Landroid/view/View;

    .line 27
    invoke-direct {p0, p1}, Lcom/shopkick/app/adapter/ViewHolder;->mapIdsToViews(Landroid/view/View;)V

    return-void
.end method

.method public resetViewDefaults()V
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;

    if-eqz v0, :cond_0

    .line 162
    invoke-virtual {v0}, Lcom/shopkick/app/adapter/ViewDefaults;->resetDefaults()V

    :cond_0
    return-void
.end method

.method public resetViewDefaults([I)V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;

    if-eqz v0, :cond_0

    .line 168
    invoke-virtual {v0, p1}, Lcom/shopkick/app/adapter/ViewDefaults;->resetDefaults([I)V

    :cond_0
    return-void
.end method

.method public setViewDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;

    if-nez v0, :cond_0

    .line 152
    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewHolder;->viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/adapter/ViewHolder;->viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;

    invoke-virtual {p1}, Lcom/shopkick/app/adapter/ViewDefaults;->saveDefaults()V

    goto :goto_0

    .line 155
    :cond_0
    invoke-virtual {v0, p1}, Lcom/shopkick/app/adapter/ViewDefaults;->addDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewHolder;->viewDefaults:Lcom/shopkick/app/adapter/ViewDefaults;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/adapter/ViewDefaults;->saveDefaults(Lcom/shopkick/app/adapter/ViewDefaults;)V

    :goto_0
    return-void
.end method

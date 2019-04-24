.class public Lcom/scandit/base/view/SbImageButton;
.super Landroid/widget/ImageButton;
.source "SbImageButton.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor",
        "AppCompatCustomView"
    }
.end annotation


# instance fields
.field public final STATE_UNKNOWN:Ljava/lang/String;

.field private mImages:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/scandit/base/view/SbImageButtonState;",
            ">;"
        }
    .end annotation
.end field

.field protected mRect:Lcom/scandit/base/geometry/SbRectangle;

.field private mState:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    const-string p1, "unknown"

    .line 26
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButton;->STATE_UNKNOWN:Ljava/lang/String;

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButton;->mRect:Lcom/scandit/base/geometry/SbRectangle;

    const-string p1, "unknown"

    .line 30
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButton;->mState:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/scandit/base/view/SbImageButton;->mRect:Lcom/scandit/base/geometry/SbRectangle;

    .line 35
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/scandit/base/view/SbImageButton;->mImages:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public getState()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/scandit/base/view/SbImageButton;->mState:Ljava/lang/String;

    return-object v0
.end method

.method public setBitmapForState(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/scandit/base/view/SbImageButton;->mImages:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/base/view/SbImageButtonState;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/scandit/base/view/SbImageButtonState;

    invoke-direct {v0, p2}, Lcom/scandit/base/view/SbImageButtonState;-><init>(Landroid/graphics/Bitmap;)V

    .line 71
    iget-object p2, p0, Lcom/scandit/base/view/SbImageButton;->mImages:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v0, p2}, Lcom/scandit/base/view/SbImageButtonState;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 75
    :goto_0
    iget-object p1, p0, Lcom/scandit/base/view/SbImageButton;->mState:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/base/view/SbImageButton;->setState(Ljava/lang/String;)V

    return-void
.end method

.method public setRect(Lcom/scandit/base/geometry/SbRectangle;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButton;->mRect:Lcom/scandit/base/geometry/SbRectangle;

    return-void
.end method

.method public setResourceIdForState(Ljava/lang/String;I)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/scandit/base/view/SbImageButton;->mImages:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/base/view/SbImageButtonState;

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lcom/scandit/base/view/SbImageButtonState;

    invoke-direct {v0, p2}, Lcom/scandit/base/view/SbImageButtonState;-><init>(I)V

    .line 53
    iget-object p2, p0, Lcom/scandit/base/view/SbImageButton;->mImages:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0, p2}, Lcom/scandit/base/view/SbImageButtonState;->setResourceId(I)V

    .line 57
    :goto_0
    iget-object p1, p0, Lcom/scandit/base/view/SbImageButton;->mState:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scandit/base/view/SbImageButton;->setState(Ljava/lang/String;)V

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/scandit/base/view/SbImageButton;->mImages:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/base/view/SbImageButtonState;

    if-eqz v0, :cond_0

    .line 90
    iput-object p1, p0, Lcom/scandit/base/view/SbImageButton;->mState:Ljava/lang/String;

    .line 91
    invoke-virtual {p0}, Lcom/scandit/base/view/SbImageButton;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/scandit/base/view/SbImageButtonState;->getBitmap(Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/scandit/base/view/SbImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

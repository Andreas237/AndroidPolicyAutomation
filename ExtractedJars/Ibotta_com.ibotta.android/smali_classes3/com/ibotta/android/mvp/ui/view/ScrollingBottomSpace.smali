.class public Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
.super Ljava/lang/Object;
.source "ScrollingBottomSpace.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;
    }
.end annotation


# instance fields
.field private final bottomNavDisappears:Z

.field private final isGalleryPage:Z


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->access$000(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->bottomNavDisappears:Z

    .line 21
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->access$100(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->isGalleryPage:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$1;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;-><init>(Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;)V

    return-void
.end method

.method private getBottomPaddingResId()I
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->isGalleryPage:Z

    if-eqz v0, :cond_0

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->getHeightOfBottomContent()I

    move-result v0

    return v0

    .line 27
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->bottomNavDisappears:Z

    if-eqz v0, :cond_1

    const v0, 0x7f07013c

    return v0

    .line 30
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->getHeightOfBottomContent()I

    move-result v0

    return v0
.end method

.method private getHeightOfBottomContent()I
    .locals 1

    const v0, 0x7f07013e

    return v0
.end method


# virtual methods
.method public setBottomPadding(Landroid/view/View;)V
    .locals 5

    const-string v0, "ScrollingBottomSpace: view: %s, bottomNavDisappears: %s, isGalleryPage: %s"

    const/4 v1, 0x3

    .line 39
    new-array v1, v1, [Ljava/lang/Object;

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->bottomNavDisappears:Z

    .line 41
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->isGalleryPage:Z

    .line 42
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 39
    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->getBottomPaddingResId()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 43
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public setIlvBottomPadding(Landroid/content/res/Resources;Lcom/ibotta/android/views/list/IbottaListViewState;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 1

    .line 51
    invoke-virtual {p2}, Lcom/ibotta/android/views/list/IbottaListViewState;->getPadding()Lcom/ibotta/android/views/list/Padding;

    move-result-object p1

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->getBottomPaddingResId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/Padding;->withBottomPadding(I)Lcom/ibotta/android/views/list/Padding;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/list/IbottaListViewState;->withPadding(Lcom/ibotta/android/views/list/Padding;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method

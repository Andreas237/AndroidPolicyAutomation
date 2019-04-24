.class public Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;
.source "OnePageFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;
    }
.end annotation


# instance fields
.field private final layoutId:I

.field private final listener:Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;

.field private pageData:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->listener:Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;

    .line 25
    iput p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->layoutId:I

    .line 27
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->pageData:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 28
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->pageData:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    const/4 p2, 0x0

    iput p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    .line 29
    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 30
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->pageData:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-void
.end method


# virtual methods
.method public getFlyUpData()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->pageData:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V
    .locals 1

    .line 53
    iget p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->layoutId:I

    const/4 v0, 0x1

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->listener:Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;

    if-eqz v0, :cond_0

    .line 44
    iget v1, p0, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->layoutId:I

    invoke-interface {v0, p1, p2, v1}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;->makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    move-result-object p1

    goto :goto_0

    .line 46
    :cond_0
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    :goto_0
    return-object p1
.end method

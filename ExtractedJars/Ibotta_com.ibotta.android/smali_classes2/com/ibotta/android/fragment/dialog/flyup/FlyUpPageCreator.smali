.class public interface abstract Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
.super Ljava/lang/Object;
.source "FlyUpPageCreator.java"


# virtual methods
.method public abstract getFlyUpData()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOffscreenPageLimit()I
.end method

.method public abstract getPageContentView()I
.end method

.method public abstract getPageLayout()I
.end method

.method public abstract isUsePageIndicator()Z
.end method

.method public abstract makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V
.end method

.method public abstract makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
.end method

.method public abstract onLeftControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;)Z
.end method

.method public abstract onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z
.end method

.class public interface abstract Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;
.super Ljava/lang/Object;
.source "HorizScrollingModuleView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "HorizScrollingModuleListener"
.end annotation


# virtual methods
.method public abstract onBottomButtonClicked()V
.end method

.method public abstract onItemsVisible(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

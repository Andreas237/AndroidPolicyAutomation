.class public interface abstract Lcom/shopkick/app/view/ISKListViewModule;
.super Ljava/lang/Object;
.source "ISKListViewModule.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# virtual methods
.method public abstract onAttach(Lcom/shopkick/app/logging/IUserEventListView;)V
.end method

.method public abstract onItemActive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V
.end method

.method public abstract onItemInactive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V
.end method

.method public abstract onMovedToScrapHeap(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;)V
.end method

.method public abstract onScroll(Lcom/shopkick/app/logging/IUserEventListView;III)V
.end method

.method public abstract onScrollStateChanged(Lcom/shopkick/app/logging/IUserEventListView;I)V
.end method

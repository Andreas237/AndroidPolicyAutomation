.class public interface abstract Lcom/usebutton/sdk/internal/Navigable;
.super Ljava/lang/Object;
.source "Navigable.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/Navigable$NavigationListener;
    }
.end annotation


# virtual methods
.method public abstract back()V
.end method

.method public abstract canNavigateBack()Z
.end method

.method public abstract canNavigateForward()Z
.end method

.method public abstract forward()V
.end method

.method public abstract getObservable()Lcom/usebutton/sdk/internal/functional/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/usebutton/sdk/internal/functional/Observable<",
            "Lcom/usebutton/sdk/internal/Navigable$NavigationListener;",
            ">;"
        }
    .end annotation
.end method

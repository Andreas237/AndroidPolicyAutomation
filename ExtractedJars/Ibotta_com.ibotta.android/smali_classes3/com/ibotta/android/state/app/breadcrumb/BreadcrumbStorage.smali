.class public interface abstract Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;
.super Ljava/lang/Object;
.source "BreadcrumbStorage.java"


# virtual methods
.method public abstract deleteBreadcrumb(Ljava/lang/String;)V
.end method

.method public abstract getBreadcrumb(Ljava/lang/String;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getBreadcrumb(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getBreadcrumbNames()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract saveBreadcrumb(Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;)V
.end method

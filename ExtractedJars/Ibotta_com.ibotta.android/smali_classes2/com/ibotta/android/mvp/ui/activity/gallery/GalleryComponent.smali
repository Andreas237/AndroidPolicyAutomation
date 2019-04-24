.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryComponent;
.super Ljava/lang/Object;
.source "GalleryComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpComponent;


# annotations
.annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
.end annotation

.annotation runtime Ldagger/Component;
    dependencies = {
        Lcom/ibotta/android/di/MainComponent;
    }
    modules = {
        Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;,
        Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V
.end method

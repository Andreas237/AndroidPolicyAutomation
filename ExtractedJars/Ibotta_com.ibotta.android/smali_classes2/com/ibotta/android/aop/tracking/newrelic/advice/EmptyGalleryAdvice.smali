.class public Lcom/ibotta/android/aop/tracking/newrelic/advice/EmptyGalleryAdvice;
.super Ljava/lang/Object;
.source "EmptyGalleryAdvice.java"

# interfaces
.implements Lcom/ibotta/android/aop/JoinPointAdvice;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    const-string v0, "Looking for an empty Gallery to track in NewRelic..."

    const/4 v1, 0x0

    .line 29
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getTarget()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    .line 34
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 36
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 37
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/EmptyGalleryAdvice;->trackEmptyGallery(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V

    :cond_1
    return-void
.end method

.method public onExecuteProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method protected trackEmptyGallery(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "Tracking a handled exception for a detected empty Gallery."

    const/4 v1, 0x0

    .line 49
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/aop/tracking/newrelic/advice/RetailerGalleryCategoriesEmptyException;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->getRetailerIdForTracking()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v1, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/RetailerGalleryCategoriesEmptyException;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method

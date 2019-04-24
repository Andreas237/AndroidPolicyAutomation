.class Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$com_ibotta_android_di_MainComponent_getAppboy;
.super Ljava/lang/Object;
.source "DaggerFeaturedComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getAppboy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/appboy/Appboy;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 1300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1301
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$com_ibotta_android_di_MainComponent_getAppboy;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/appboy/Appboy;
    .locals 2

    .line 1306
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$com_ibotta_android_di_MainComponent_getAppboy;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 1307
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppboy()Lcom/appboy/Appboy;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 1306
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appboy/Appboy;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1297
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/DaggerFeaturedComponent$com_ibotta_android_di_MainComponent_getAppboy;->get()Lcom/appboy/Appboy;

    move-result-object v0

    return-object v0
.end method

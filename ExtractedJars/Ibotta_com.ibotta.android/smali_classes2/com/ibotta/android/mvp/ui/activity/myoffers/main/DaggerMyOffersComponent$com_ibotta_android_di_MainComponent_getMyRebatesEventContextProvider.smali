.class Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;
.super Ljava/lang/Object;
.source "DaggerMyOffersComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/tracking/EventContextProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 450
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 2

    .line 455
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 456
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getMyRebatesEventContextProvider()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 455
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/EventContextProvider;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 444
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/DaggerMyOffersComponent$com_ibotta_android_di_MainComponent_getMyRebatesEventContextProvider;->get()Lcom/ibotta/android/tracking/EventContextProvider;

    move-result-object v0

    return-object v0
.end method

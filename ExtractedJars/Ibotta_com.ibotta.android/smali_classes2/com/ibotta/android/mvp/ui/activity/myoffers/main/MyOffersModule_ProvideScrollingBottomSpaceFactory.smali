.class public final Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;
.super Ljava/lang/Object;
.source "MyOffersModule_ProvideScrollingBottomSpaceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;->module:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 0

    .line 26
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;->proxyProvideScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideScrollingBottomSpace(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;->provideScrollingBottomSpace()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 34
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;->module:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule;)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersModule_ProvideScrollingBottomSpaceFactory;->get()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object v0

    return-object v0
.end method

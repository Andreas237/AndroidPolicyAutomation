.class Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;
.super Ljava/lang/Object;
.source "DaggerRedeemReqsComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getAppCache"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/appcache/AppCache;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 424
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/appcache/AppCache;
    .locals 2

    .line 429
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 430
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getAppCache()Lcom/ibotta/android/appcache/AppCache;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 429
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/AppCache;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 419
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/DaggerRedeemReqsComponent$com_ibotta_android_di_MainComponent_getAppCache;->get()Lcom/ibotta/android/appcache/AppCache;

    move-result-object v0

    return-object v0
.end method

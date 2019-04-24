.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;
.super Ljava/lang/Object;
.source "RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;
    .locals 0

    .line 25
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;->proxyProvideWindfallRecognizerCallback(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideWindfallRecognizerCallback(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;->provideWindfallRecognizerCallback()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;->module:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsModule_ProvideWindfallRecognizerCallbackFactory;->get()Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    move-result-object v0

    return-object v0
.end method

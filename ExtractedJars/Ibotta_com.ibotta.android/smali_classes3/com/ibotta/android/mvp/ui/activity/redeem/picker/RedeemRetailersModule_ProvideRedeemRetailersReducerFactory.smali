.class public final Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;
.super Ljava/lang/Object;
.source "RedeemRetailersModule_ProvideRedeemRetailersReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/redeem/RedeemRetailersReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/redeem/RedeemRetailersReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/redeem/RedeemRetailersReducer;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;->proxyProvideRedeemRetailersReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRedeemRetailersReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/RedeemRetailersReducer;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule;->provideRedeemRetailersReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/redeem/RedeemRetailersReducer;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersModule_ProvideRedeemRetailersReducerFactory;->get()Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    move-result-object v0

    return-object v0
.end method

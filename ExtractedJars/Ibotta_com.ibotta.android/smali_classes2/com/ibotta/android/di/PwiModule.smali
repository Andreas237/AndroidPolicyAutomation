.class public abstract Lcom/ibotta/android/di/PwiModule;
.super Ljava/lang/Object;
.source "PwiModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final KEY_PWI_SHARED_PREFERENCES:Ljava/lang/String; = "pwi_shared_preferences"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideContentListReducer(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Landroid/content/res/Resources;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/content/ContentListReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 104
    new-instance v0, Lcom/ibotta/android/content/ContentListReducer;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/content/ContentListReducer;-><init>(Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Landroid/content/res/Resources;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method

.method public static provideErrorDialogFactory(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 85
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogFactory;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideGooglePayManager(Lcom/ibotta/android/App;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManager;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 109
    new-instance v0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;-><init>()V

    .line 110
    invoke-interface {p1}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->getGooglePayEnvironmentType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->setEnvironment(I)Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;

    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->build()Lcom/google/android/gms/wallet/Wallet$WalletOptions;

    move-result-object v0

    .line 109
    invoke-static {p0, v0}, Lcom/google/android/gms/wallet/Wallet;->getPaymentsClient(Landroid/content/Context;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)Lcom/google/android/gms/wallet/PaymentsClient;

    move-result-object p0

    .line 113
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;

    invoke-direct {v0, p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/GooglePayManagerImpl;-><init>(Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/google/android/gms/wallet/PaymentsClient;)V

    return-object v0
.end method

.method public static providePwiApiManager(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;
    .locals 9
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 69
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManagerImpl;-><init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;)V

    return-object v8
.end method

.method public static providePwiBarcodeReducer(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiBarcodeReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 90
    new-instance v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/pwi/PwiBarcodeReducer;-><init>(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public static providePwiHomeReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/pwi/PwiHomeReducer;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 57
    new-instance v0, Lcom/ibotta/android/pwi/PwiHomeReducer;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/pwi/PwiHomeReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V

    return-object v0
.end method

.method public static providePwiRetailersHolder()Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 95
    new-instance v0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;-><init>()V

    return-object v0
.end method

.method public static providePwiUserState(Lcom/ibotta/android/App;)Lcom/ibotta/android/state/pwi/PwiUserState;
    .locals 4
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 46
    new-instance v0, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;

    const-string v1, "pwi_shared_preferences"

    const/4 v2, 0x0

    .line 47
    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    sget-object v1, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v3, 0x1

    .line 48
    invoke-virtual {v1, v3, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/state/pwi/PwiUserStateImpl;-><init>(Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;)V

    return-object v0
.end method

.method public static provideStripeClient(Lcom/ibotta/android/App;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)Lcom/stripe/android/Stripe;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 80
    new-instance v0, Lcom/stripe/android/Stripe;

    new-instance v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    invoke-interface {p1}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->getStripeSdkKeyType()Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static provideStripeManager(Lcom/stripe/android/Stripe;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerImpl;-><init>(Lcom/stripe/android/Stripe;)V

    return-object v0
.end method

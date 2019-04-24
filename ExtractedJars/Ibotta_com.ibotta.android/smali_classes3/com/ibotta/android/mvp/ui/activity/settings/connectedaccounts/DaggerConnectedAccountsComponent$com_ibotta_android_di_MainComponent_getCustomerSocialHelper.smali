.class Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;
.super Ljava/lang/Object;
.source "DaggerConnectedAccountsComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getCustomerSocialHelper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/api/helper/social/CustomerSocialHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 375
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/social/CustomerSocialHelper;
    .locals 2

    .line 380
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 381
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCustomerSocialHelper()Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 380
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 370
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/DaggerConnectedAccountsComponent$com_ibotta_android_di_MainComponent_getCustomerSocialHelper;->get()Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    move-result-object v0

    return-object v0
.end method

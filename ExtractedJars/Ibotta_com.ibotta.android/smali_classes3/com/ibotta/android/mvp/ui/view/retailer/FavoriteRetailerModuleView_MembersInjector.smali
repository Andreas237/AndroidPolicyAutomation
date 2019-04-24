.class public final Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;
.super Ljava/lang/Object;
.source "FavoriteRetailerModuleView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;",
        ">;"
    }
.end annotation


# instance fields
.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectBuildProfile(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method

.method public static injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->offerHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->injectOfferHelper(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Lcom/ibotta/android/profile/BuildProfile;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V

    return-void
.end method

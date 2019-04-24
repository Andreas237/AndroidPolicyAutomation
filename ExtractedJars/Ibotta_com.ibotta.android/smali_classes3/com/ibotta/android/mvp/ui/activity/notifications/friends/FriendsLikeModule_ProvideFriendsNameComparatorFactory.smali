.class public final Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;
.super Ljava/lang/Object;
.source "FriendsLikeModule_ProvideFriendsNameComparatorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/fragment/activity/FriendsNameComparator;",
        ">;"
    }
.end annotation


# instance fields
.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;->module:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/fragment/activity/FriendsNameComparator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/fragment/activity/FriendsNameComparator;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/Formatting;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;->proxyProvideFriendsNameComparator(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFriendsNameComparator(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/fragment/activity/FriendsNameComparator;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;->provideFriendsNameComparator(Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/fragment/activity/FriendsNameComparator;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;->module:Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule;Ljavax/inject/Provider;)Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/friends/FriendsLikeModule_ProvideFriendsNameComparatorFactory;->get()Lcom/ibotta/android/fragment/activity/FriendsNameComparator;

    move-result-object v0

    return-object v0
.end method

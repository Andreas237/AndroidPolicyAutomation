.class public final Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;
.super Ljava/lang/Object;
.source "CacheClearReceiver_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/receiver/cache/CacheClearReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field private final cacheClearHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/CacheClearHelper;",
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
            "Lcom/ibotta/android/appcache/CacheClearHelper;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;->cacheClearHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/CacheClearHelper;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/receiver/cache/CacheClearReceiver;",
            ">;"
        }
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectCacheClearHelper(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;Lcom/ibotta/android/appcache/CacheClearHelper;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/receiver/cache/CacheClearReceiver;->cacheClearHelper:Lcom/ibotta/android/appcache/CacheClearHelper;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;->cacheClearHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/appcache/CacheClearHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;->injectCacheClearHelper(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;Lcom/ibotta/android/appcache/CacheClearHelper;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/receiver/cache/CacheClearReceiver;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/receiver/cache/CacheClearReceiver_MembersInjector;->injectMembers(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;)V

    return-void
.end method

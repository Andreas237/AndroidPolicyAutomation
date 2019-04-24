.class public final Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;
.super Ljava/lang/Object;
.source "PasswordCacheAspect_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/aop/password/PasswordCacheAspect;",
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

.field private final passwordCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
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
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;->passwordCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/aop/password/PasswordCacheAspect;",
            ">;"
        }
    .end annotation

    .line 28
    new-instance v0, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectPasswordCache(Lcom/ibotta/android/aop/password/PasswordCacheAspect;Lcom/ibotta/android/security/PasswordCache;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/aop/password/PasswordCacheAspect;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/aop/password/PasswordCacheAspect;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;->passwordCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/security/PasswordCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;->injectPasswordCache(Lcom/ibotta/android/aop/password/PasswordCacheAspect;Lcom/ibotta/android/security/PasswordCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/aop/password/PasswordCacheAspect;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/aop/password/PasswordCacheAspect_MembersInjector;->injectMembers(Lcom/ibotta/android/aop/password/PasswordCacheAspect;)V

    return-void
.end method

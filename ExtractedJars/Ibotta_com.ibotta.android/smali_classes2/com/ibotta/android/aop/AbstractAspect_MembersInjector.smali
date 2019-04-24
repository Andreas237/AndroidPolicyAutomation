.class public final Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;
.super Ljava/lang/Object;
.source "AbstractAspect_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/aop/AbstractAspect;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/aop/AbstractAspect;",
            ">;"
        }
    .end annotation

    .line 21
    new-instance v0, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/aop/AbstractAspect;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/aop/AbstractAspect;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/aop/AbstractAspect;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectMembers(Lcom/ibotta/android/aop/AbstractAspect;)V

    return-void
.end method

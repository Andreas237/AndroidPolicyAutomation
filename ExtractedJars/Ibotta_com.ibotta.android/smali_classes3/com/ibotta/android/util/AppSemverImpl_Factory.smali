.class public final Lcom/ibotta/android/util/AppSemverImpl_Factory;
.super Ljava/lang/Object;
.source "AppSemverImpl_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/util/AppSemverImpl;",
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

.field private final semverFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/SemverFactory;",
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
            "Lcom/ibotta/android/util/SemverFactory;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/util/AppSemverImpl_Factory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/util/AppSemverImpl_Factory;->semverFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/AppSemverImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/SemverFactory;",
            ">;)",
            "Lcom/ibotta/android/util/AppSemverImpl_Factory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/util/AppSemverImpl_Factory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/util/AppSemverImpl_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newAppSemverImpl(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/SemverFactory;)Lcom/ibotta/android/util/AppSemverImpl;
    .locals 1

    .line 40
    new-instance v0, Lcom/ibotta/android/util/AppSemverImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/util/AppSemverImpl;-><init>(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/SemverFactory;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/AppSemverImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/SemverFactory;",
            ">;)",
            "Lcom/ibotta/android/util/AppSemverImpl;"
        }
    .end annotation

    .line 30
    new-instance v0, Lcom/ibotta/android/util/AppSemverImpl;

    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/SemverFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/util/AppSemverImpl;-><init>(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/SemverFactory;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/util/AppSemverImpl;
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/util/AppSemverImpl_Factory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/util/AppSemverImpl_Factory;->semverFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/util/AppSemverImpl_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/AppSemverImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/util/AppSemverImpl_Factory;->get()Lcom/ibotta/android/util/AppSemverImpl;

    move-result-object v0

    return-object v0
.end method

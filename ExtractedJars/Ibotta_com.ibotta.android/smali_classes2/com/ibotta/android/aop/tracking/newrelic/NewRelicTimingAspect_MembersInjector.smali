.class public final Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;
.super Ljava/lang/Object;
.source "NewRelicTimingAspect_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;",
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

.field private final factoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;",
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
            "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;->factoryProvider:Ljavax/inject/Provider;

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
            "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;",
            ">;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectFactory(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;->factory:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;->buildProfileProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/profile/BuildProfile;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/AbstractAspect_MembersInjector;->injectBuildProfile(Lcom/ibotta/android/aop/AbstractAspect;Lcom/ibotta/android/profile/BuildProfile;)V

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;->factoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;->injectFactory(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect_MembersInjector;->injectMembers(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAspect;)V

    return-void
.end method

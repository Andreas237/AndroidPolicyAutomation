.class public final Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;
.super Ljava/lang/Object;
.source "MonolithLoadRetailersVariant_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiJobFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
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
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;->apiJobFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;",
            ">;"
        }
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectInit(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 33
    invoke-virtual {p0, p1}, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;->init(Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;->apiJobFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;->injectInit(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant_MembersInjector;->injectMembers(Lcom/ibotta/android/features/variant/retailers/MonolithLoadRetailersVariant;)V

    return-void
.end method

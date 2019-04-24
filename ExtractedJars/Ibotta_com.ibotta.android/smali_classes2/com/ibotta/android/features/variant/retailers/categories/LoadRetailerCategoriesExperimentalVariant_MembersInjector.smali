.class public final Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;
.super Ljava/lang/Object;
.source "LoadRetailerCategoriesExperimentalVariant_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;",
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

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
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
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;->apiJobFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;",
            ">;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectInit(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 42
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;->init(Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;)V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v1, p0, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;->apiJobFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-static {p1, v0, v1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;->injectInit(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant_MembersInjector;->injectMembers(Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesExperimentalVariant;)V

    return-void
.end method

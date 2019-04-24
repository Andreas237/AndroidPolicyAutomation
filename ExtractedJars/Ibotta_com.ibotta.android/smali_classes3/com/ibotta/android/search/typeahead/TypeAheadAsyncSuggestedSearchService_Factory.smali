.class public final Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;
.super Ljava/lang/Object;
.source "TypeAheadAsyncSuggestedSearchService_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiWorkSubmitterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final asyncHandlerAndMainHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->asyncHandlerAndMainHandlerProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p4, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;"
        }
    .end annotation

    .line 63
    new-instance v0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newTypeAheadAsyncSuggestedSearchService(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;
    .locals 7

    .line 76
    new-instance v6, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;"
        }
    .end annotation

    .line 50
    new-instance v6, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    .line 51
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 52
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 53
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Landroid/os/Handler;

    .line 54
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/util/AppHelper;

    .line 55
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Landroid/os/Handler;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;-><init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/os/Handler;Lcom/ibotta/android/util/AppHelper;Landroid/os/Handler;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;
    .locals 4

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->asyncHandlerAndMainHandlerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService_Factory;->get()Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    move-result-object v0

    return-object v0
.end method

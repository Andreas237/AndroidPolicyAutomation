.class public final Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideContentWithInfoRowReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final contentListReducerUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
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
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)",
            "Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/content/ContentListReducerUtil;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->proxyProvideContentWithInfoRowReducer(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideContentWithInfoRowReducer(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;
    .locals 0

    .line 51
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule;->provideContentWithInfoRowReducer(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 50
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideContentWithInfoRowReducerFactory;->get()Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    move-result-object v0

    return-object v0
.end method

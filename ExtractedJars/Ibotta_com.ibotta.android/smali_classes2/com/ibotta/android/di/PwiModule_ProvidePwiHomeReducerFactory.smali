.class public final Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;
.super Ljava/lang/Object;
.source "PwiModule_ProvidePwiHomeReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/pwi/PwiHomeReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final iblvReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->formattingProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->iblvReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)",
            "Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/pwi/PwiHomeReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;)",
            "Lcom/ibotta/android/pwi/PwiHomeReducer;"
        }
    .end annotation

    .line 49
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    .line 50
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/Formatting;

    .line 51
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/res/Resources;

    .line 52
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 48
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->proxyProvidePwiHomeReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/pwi/PwiHomeReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePwiHomeReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/pwi/PwiHomeReducer;
    .locals 0

    .line 70
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/PwiModule;->providePwiHomeReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)Lcom/ibotta/android/pwi/PwiHomeReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 69
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/pwi/PwiHomeReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/pwi/PwiHomeReducer;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->formattingProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->iblvReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/pwi/PwiHomeReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/PwiModule_ProvidePwiHomeReducerFactory;->get()Lcom/ibotta/android/pwi/PwiHomeReducer;

    move-result-object v0

    return-object v0
.end method

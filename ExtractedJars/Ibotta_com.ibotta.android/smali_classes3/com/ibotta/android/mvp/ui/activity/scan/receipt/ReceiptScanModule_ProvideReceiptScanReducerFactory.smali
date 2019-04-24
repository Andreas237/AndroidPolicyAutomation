.class public final Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;
.super Ljava/lang/Object;
.source "ReceiptScanModule_ProvideReceiptScanReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field

.field private final titleBarReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
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
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/title/TitleBarReducer;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;->proxyProvideReceiptScanReducer(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideReceiptScanReducer(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;
    .locals 0

    .line 46
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule;->provideReceiptScanReducer(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 45
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/ReceiptScanModule_ProvideReceiptScanReducerFactory;->get()Lcom/ibotta/android/redeem/scan/ReceiptScanReducer;

    move-result-object v0

    return-object v0
.end method

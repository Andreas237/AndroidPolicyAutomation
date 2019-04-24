.class public final Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;
.super Ljava/lang/Object;
.source "UtilModule_ProvideReceiptProcessingMathFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;",
        ">;"
    }
.end annotation


# instance fields
.field private final bitmapUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
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
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;->bitmapUtilProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;)",
            "Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;)",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;"
        }
    .end annotation

    .line 24
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/BitmapUtil;

    invoke-static {p0}, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;->proxyProvideReceiptProcessingMath(Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideReceiptProcessingMath(Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;
    .locals 1

    .line 34
    invoke-static {p0}, Lcom/ibotta/android/util/di/UtilModule;->provideReceiptProcessingMath(Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 33
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;->bitmapUtilProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/util/di/UtilModule_ProvideReceiptProcessingMathFactory;->get()Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    move-result-object v0

    return-object v0
.end method

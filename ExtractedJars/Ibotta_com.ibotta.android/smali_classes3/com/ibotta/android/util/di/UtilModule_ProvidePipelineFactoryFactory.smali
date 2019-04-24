.class public final Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;
.super Ljava/lang/Object;
.source "UtilModule_ProvidePipelineFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/util/pipeline/PipelineFactory;",
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

.field private final fileIOProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/FileIO;",
            ">;"
        }
    .end annotation
.end field

.field private final receiptProcessingMathProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/FileIO;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->receiptProcessingMathProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->fileIOProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p3, p0, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->bitmapUtilProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/FileIO;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;)",
            "Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/pipeline/PipelineFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/FileIO;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/BitmapUtil;",
            ">;)",
            "Lcom/ibotta/android/util/pipeline/PipelineFactory;"
        }
    .end annotation

    .line 38
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/FileIO;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/util/BitmapUtil;

    .line 37
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->proxyProvidePipelineFactory(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/FileIO;Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/PipelineFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePipelineFactory(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/FileIO;Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/PipelineFactory;
    .locals 0

    .line 52
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/util/di/UtilModule;->providePipelineFactory(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/FileIO;Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/PipelineFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 51
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/pipeline/PipelineFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/util/pipeline/PipelineFactory;
    .locals 3

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->receiptProcessingMathProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->fileIOProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->bitmapUtilProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/util/pipeline/PipelineFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/util/di/UtilModule_ProvidePipelineFactoryFactory;->get()Lcom/ibotta/android/util/pipeline/PipelineFactory;

    move-result-object v0

    return-object v0
.end method

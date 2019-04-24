.class public abstract Lcom/ibotta/android/util/di/UtilModule;
.super Ljava/lang/Object;
.source "UtilModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# static fields
.field private static final RECEIPT_FORMAT:Landroid/graphics/Bitmap$CompressFormat;

.field private static final RECEIPT_QUALITY:I = 0x1e

.field private static final RECEIPT_TARGET_MIN_WIDTH:I = 0x578


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    sput-object v0, Lcom/ibotta/android/util/di/UtilModule;->RECEIPT_FORMAT:Landroid/graphics/Bitmap$CompressFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideBitmapUtil()Lcom/ibotta/android/util/BitmapUtil;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 28
    new-instance v0, Lcom/ibotta/android/util/BitmapUtil;

    invoke-direct {v0}, Lcom/ibotta/android/util/BitmapUtil;-><init>()V

    return-object v0
.end method

.method public static provideFileIO()Lcom/ibotta/android/util/FileIO;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/util/FileIO;

    invoke-direct {v0}, Lcom/ibotta/android/util/FileIO;-><init>()V

    return-object v0
.end method

.method public static providePipelineFactory(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/FileIO;Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/PipelineFactory;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 41
    new-instance v7, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;

    sget-object v5, Lcom/ibotta/android/util/di/UtilModule;->RECEIPT_FORMAT:Landroid/graphics/Bitmap$CompressFormat;

    const/high16 v4, 0x44af0000    # 1400.0f

    const/16 v6, 0x1e

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/util/pipeline/PipelineFactoryImpl;-><init>(Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;Lcom/ibotta/android/util/FileIO;Lcom/ibotta/android/util/BitmapUtil;FLandroid/graphics/Bitmap$CompressFormat;I)V

    return-object v7
.end method

.method public static provideReceiptProcessingMath(Lcom/ibotta/android/util/BitmapUtil;)Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v1

    invoke-direct {v0, p0, v1, v2}, Lcom/ibotta/android/util/pipeline/receipt/ReceiptProcessingMath;-><init>(Lcom/ibotta/android/util/BitmapUtil;J)V

    return-object v0
.end method

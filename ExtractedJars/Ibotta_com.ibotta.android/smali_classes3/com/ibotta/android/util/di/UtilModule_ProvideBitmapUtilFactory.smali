.class public final Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;
.super Ljava/lang/Object;
.source "UtilModule_ProvideBitmapUtilFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/util/BitmapUtil;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;

    invoke-direct {v0}, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;->INSTANCE:Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;
    .locals 1

    .line 22
    sget-object v0, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;->INSTANCE:Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/util/BitmapUtil;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;->proxyProvideBitmapUtil()Lcom/ibotta/android/util/BitmapUtil;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideBitmapUtil()Lcom/ibotta/android/util/BitmapUtil;
    .locals 2

    .line 27
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule;->provideBitmapUtil()Lcom/ibotta/android/util/BitmapUtil;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 26
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/BitmapUtil;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/util/BitmapUtil;
    .locals 1

    .line 14
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;->provideInstance()Lcom/ibotta/android/util/BitmapUtil;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/util/di/UtilModule_ProvideBitmapUtilFactory;->get()Lcom/ibotta/android/util/BitmapUtil;

    move-result-object v0

    return-object v0
.end method

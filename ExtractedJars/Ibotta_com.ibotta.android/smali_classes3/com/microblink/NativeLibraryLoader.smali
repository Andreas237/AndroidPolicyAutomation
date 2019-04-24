.class public final Lcom/microblink/NativeLibraryLoader;
.super Ljava/lang/Object;


# static fields
.field private static final NATIVE_LIBRARIES:[Ljava/lang/String;

.field private static final NATIVE_LIBRARY_NAME:Ljava/lang/String; = "BlinkReceipt"

.field private static final TAG:Ljava/lang/String; = "NativeLibraryLoader"

.field private static nativeLibraryLoadError:Ljava/lang/Error;

.field private static nativeLibraryLoaded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "BlinkReceipt"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/microblink/NativeLibraryLoader;->NATIVE_LIBRARIES:[Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoaded:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoadError:Ljava/lang/Error;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ensureNativeLibraryLoaded()V
    .locals 2

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoadError()Ljava/lang/Error;

    move-result-object v0

    if-eqz v0, :cond_0

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Native library is not loaded"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method public static isNativeLibraryLoaded()Z
    .locals 1

    sget-boolean v0, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoaded:Z

    return v0
.end method

.method public static loadNativeLibrary()Z
    .locals 8

    sget-boolean v0, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoaded:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->isProcessorCompatible()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/microblink/NativeLibraryLoader;->NATIVE_LIBRARIES:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v2, :cond_0

    aget-object v5, v1, v3

    const-string v6, "NativeLibraryLoader"

    const-string v7, "Loading lib{}.so"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v5, v4, v0

    invoke-static {v6, v7, v4}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sput-boolean v4, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoaded:Z

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/UnsatisfiedLinkError;

    const-string v2, "Incompatible CPU!"

    invoke-direct {v1, v2}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    sput-boolean v0, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoaded:Z

    const-string v2, "NativeLibraryLoader"

    const-string v3, "error loading native library"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sput-object v1, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoadError:Ljava/lang/Error;

    :cond_2
    :goto_1
    sget-boolean v0, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoaded:Z

    return v0
.end method

.method public static nativeLibraryLoadError()Ljava/lang/Error;
    .locals 1

    sget-object v0, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoadError:Ljava/lang/Error;

    return-object v0
.end method

.class public final Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;
.super Ljava/lang/Object;
.source "UtilModule_ProvideFileIOFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/util/FileIO;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;

    invoke-direct {v0}, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;->INSTANCE:Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;
    .locals 1

    .line 22
    sget-object v0, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;->INSTANCE:Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/util/FileIO;
    .locals 1

    .line 18
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;->proxyProvideFileIO()Lcom/ibotta/android/util/FileIO;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideFileIO()Lcom/ibotta/android/util/FileIO;
    .locals 2

    .line 27
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule;->provideFileIO()Lcom/ibotta/android/util/FileIO;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 26
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/FileIO;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/util/FileIO;
    .locals 1

    .line 14
    invoke-static {}, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;->provideInstance()Lcom/ibotta/android/util/FileIO;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/util/di/UtilModule_ProvideFileIOFactory;->get()Lcom/ibotta/android/util/FileIO;

    move-result-object v0

    return-object v0
.end method

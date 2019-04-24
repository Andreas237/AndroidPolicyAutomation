.class public Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;
.super Ljava/lang/Object;
.source "WindfallReceiptSdkImpl.java"

# interfaces
.implements Lcom/ibotta/android/windfall/WindfallReceiptSdk;
.implements Lcom/microblink/InitializeCallback;


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private initialized:Z

.field private final windfallKeyString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/profile/BuildProfile;Ljava/lang/String;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->initialized:Z

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->appContext:Landroid/content/Context;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 23
    iput-object p3, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->windfallKeyString:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public initialize()V
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugReceiptCapture()Z

    move-result v0

    invoke-static {v0}, Lcom/microblink/ReceiptSdk;->debug(Z)V

    const/4 v0, 0x1

    .line 29
    invoke-static {v0}, Lcom/microblink/ReceiptSdk;->onDeviceOcr(Z)V

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->appContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->windfallKeyString:Ljava/lang/String;

    invoke-static {v0, v1, p0}, Lcom/microblink/ReceiptSdk;->sdkInitialize(Landroid/content/Context;Ljava/lang/String;Lcom/microblink/InitializeCallback;)V

    return-void
.end method

.method public isInitialized()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->initialized:Z

    return v0
.end method

.method public onException(Lcom/microblink/ReceiptSdkException;)V
    .locals 2
    .param p1    # Lcom/microblink/ReceiptSdkException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Failed to initialize Windfall."

    const/4 v1, 0x0

    .line 46
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onInitialized()V
    .locals 2

    const-string v0, "Windfall SDK initialized."

    const/4 v1, 0x0

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/ibotta/android/windfall/WindfallReceiptSdkImpl;->initialized:Z

    return-void
.end method

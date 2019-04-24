.class Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$com_ibotta_android_di_MainComponent_getResources;
.super Ljava/lang/Object;
.source "DaggerReceiptScanComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getResources"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Landroid/content/res/Resources;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 308
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 309
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$com_ibotta_android_di_MainComponent_getResources;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Landroid/content/res/Resources;
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$com_ibotta_android_di_MainComponent_getResources;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 315
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 314
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 304
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/receipt/DaggerReceiptScanComponent$com_ibotta_android_di_MainComponent_getResources;->get()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

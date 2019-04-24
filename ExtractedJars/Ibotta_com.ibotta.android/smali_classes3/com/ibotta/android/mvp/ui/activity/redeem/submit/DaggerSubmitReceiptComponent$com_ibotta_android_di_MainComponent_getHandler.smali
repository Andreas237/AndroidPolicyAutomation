.class Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;
.super Ljava/lang/Object;
.source "DaggerSubmitReceiptComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Landroid/os/Handler;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 361
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Landroid/os/Handler;
    .locals 2

    .line 366
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 367
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 366
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 357
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$com_ibotta_android_di_MainComponent_getHandler;->get()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

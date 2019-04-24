.class Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$com_ibotta_android_di_MainComponent_getUserState;
.super Ljava/lang/Object;
.source "DaggerReceiptViewerComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getUserState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/state/user/UserState;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 240
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$com_ibotta_android_di_MainComponent_getUserState;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/user/UserState;
    .locals 2

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$com_ibotta_android_di_MainComponent_getUserState;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 246
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getUserState()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 245
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 235
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$com_ibotta_android_di_MainComponent_getUserState;->get()Lcom/ibotta/android/state/user/UserState;

    move-result-object v0

    return-object v0
.end method

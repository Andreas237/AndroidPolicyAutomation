.class Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;
.super Ljava/lang/Object;
.source "DaggerModuleComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getRetailerHorizListReducer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 318
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 319
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/horiz/RetailerHorizListReducer;
    .locals 2

    .line 324
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 325
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getRetailerHorizListReducer()Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 324
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 314
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/module/DaggerModuleComponent$com_ibotta_android_di_MainComponent_getRetailerHorizListReducer;->get()Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-result-object v0

    return-object v0
.end method

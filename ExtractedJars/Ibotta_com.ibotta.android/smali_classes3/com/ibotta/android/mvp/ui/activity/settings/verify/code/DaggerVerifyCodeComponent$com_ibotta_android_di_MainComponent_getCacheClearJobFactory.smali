.class Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;
.super Ljava/lang/Object;
.source "DaggerVerifyCodeComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getCacheClearJobFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 310
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
    .locals 2

    .line 315
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 316
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getCacheClearJobFactory()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 315
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 305
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/DaggerVerifyCodeComponent$com_ibotta_android_di_MainComponent_getCacheClearJobFactory;->get()Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object v0

    return-object v0
.end method

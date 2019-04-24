.class public final Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerVerifyDeviceComponent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private verifyDeviceModule:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$1;)V
    .locals 0

    .line 199
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;
    .locals 0

    .line 199
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->verifyDeviceModule:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;)Lcom/ibotta/android/di/MainComponent;
    .locals 0

    .line 199
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceComponent;
    .locals 3

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->verifyDeviceModule:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    if-eqz v0, :cond_1

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    if-eqz v0, :cond_0

    .line 214
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$1;)V

    return-object v0

    .line 212
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/di/MainComponent;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    .line 209
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;
    .locals 0

    .line 223
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/di/MainComponent;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method

.method public verifyDeviceModule(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;)Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;
    .locals 0

    .line 218
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/DaggerVerifyDeviceComponent$Builder;->verifyDeviceModule:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceModule;

    return-object p0
.end method

.class Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;
.super Ljava/lang/Object;
.source "DaggerMCommEscortComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getHardware"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/hardware/Hardware;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 433
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 434
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/hardware/Hardware;
    .locals 2

    .line 439
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 440
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 439
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/hardware/Hardware;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 429
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/DaggerMCommEscortComponent$com_ibotta_android_di_MainComponent_getHardware;->get()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    return-object v0
.end method

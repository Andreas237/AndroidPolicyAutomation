.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;
.super Ljava/lang/Object;
.source "DaggerPwiHomeComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getPwiVariant"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 359
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/variant/pwi/PwiVariant;
    .locals 2

    .line 364
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 365
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getPwiVariant()Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 364
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 354
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$com_ibotta_android_di_MainComponent_getPwiVariant;->get()Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-result-object v0

    return-object v0
.end method

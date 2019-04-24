.class Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$com_ibotta_android_di_MainComponent_getEmailState;
.super Ljava/lang/Object;
.source "DaggerForgotPasswordComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getEmailState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/state/app/email/EmailState;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 248
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$com_ibotta_android_di_MainComponent_getEmailState;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/email/EmailState;
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$com_ibotta_android_di_MainComponent_getEmailState;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 254
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getEmailState()Lcom/ibotta/android/state/app/email/EmailState;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 253
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/email/EmailState;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 243
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/password/DaggerForgotPasswordComponent$com_ibotta_android_di_MainComponent_getEmailState;->get()Lcom/ibotta/android/state/app/email/EmailState;

    move-result-object v0

    return-object v0
.end method

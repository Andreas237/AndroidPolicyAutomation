.class public final Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;
.super Ljava/lang/Object;
.source "ButtonSdkWelcomeBackUI_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;",
        ">;"
    }
.end annotation


# instance fields
.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;",
            ">;"
        }
    .end annotation

    .line 21
    new-instance v0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectTracker(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;->trackerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/Tracker;

    invoke-static {p1, v0}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;->injectTracker(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;Lcom/ibotta/android/tracking/Tracker;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI_MembersInjector;->injectMembers(Lcom/ibotta/android/buttonsdk/ButtonSdkWelcomeBackUI;)V

    return-void
.end method

.class public final Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;
.super Ljava/lang/Object;
.source "WelcomeBackSuccessView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;",
        ">;"
    }
.end annotation


# instance fields
.field private final imageCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;"
        }
    .end annotation
.end field

.field private final storageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->storageProvider:Ljavax/inject/Provider;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static injectStorage(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;->storage:Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->storageProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->injectStorage(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;Lcom/ibotta/android/buttonsdk/ButtonSdkStorage;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackSuccessView;)V

    return-void
.end method

.class public final Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;
.super Ljava/lang/Object;
.source "FriendColumnView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;",
        ">;"
    }
.end annotation


# instance fields
.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final imageCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
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
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;",
            ">;"
        }
    .end annotation

    .line 26
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectFormatting(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->formattingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/Formatting;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->injectFormatting(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;Lcom/ibotta/android/util/Formatting;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/friend/FriendColumnView;)V

    return-void
.end method

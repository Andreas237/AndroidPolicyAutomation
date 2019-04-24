.class public final Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;
.super Ljava/lang/Object;
.source "JoustCellEngagementView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/images/ImageCache;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;",
            ">;"
        }
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectImageCache(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;->imageCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/images/ImageCache;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;->injectImageCache(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;Lcom/ibotta/android/images/ImageCache;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;)V

    return-void
.end method

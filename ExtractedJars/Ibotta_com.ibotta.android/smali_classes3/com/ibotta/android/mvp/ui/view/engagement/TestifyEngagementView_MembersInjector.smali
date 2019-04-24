.class public final Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView_MembersInjector;
.super Ljava/lang/Object;
.source "TestifyEngagementView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;",
        ">;"
    }
.end annotation


# instance fields
.field private final pixelTrackingManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
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
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;",
            ">;"
        }
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView_MembersInjector;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 29
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 28
    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView_MembersInjector;->injectPixelTrackingManager(Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V

    return-void
.end method

.class public final Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;
.super Ljava/lang/Object;
.source "FindRebatesListView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;",
        ">;"
    }
.end annotation


# instance fields
.field private final eventContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingQueueProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
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
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->eventContextProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/EventContextProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingQueue;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;",
            ">;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;Lcom/ibotta/android/tracking/EventContextProvider;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    return-void
.end method

.method public static injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->eventContextProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->injectEventContextProvider(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;Lcom/ibotta/android/tracking/EventContextProvider;)V

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->trackingQueueProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->injectTrackingQueue(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;)V

    return-void
.end method

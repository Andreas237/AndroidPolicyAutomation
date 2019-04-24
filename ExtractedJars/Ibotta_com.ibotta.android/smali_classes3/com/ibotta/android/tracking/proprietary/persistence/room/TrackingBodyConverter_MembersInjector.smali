.class public final Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;
.super Ljava/lang/Object;
.source "TrackingBodyConverter_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;",
        ">;"
    }
.end annotation


# instance fields
.field private final ibottaJsonProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/json/IbottaJson;",
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
            "Lcom/ibotta/android/json/IbottaJson;",
            ">;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;->ibottaJsonProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/json/IbottaJson;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;",
            ">;"
        }
    .end annotation

    .line 18
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectIbottaJson(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;Lcom/ibotta/android/json/IbottaJson;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;->ibottaJsonProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/json/IbottaJson;

    invoke-static {p1, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;->injectIbottaJson(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;Lcom/ibotta/android/json/IbottaJson;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;->injectMembers(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;)V

    return-void
.end method

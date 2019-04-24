.class public final Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;
.super Ljava/lang/Object;
.source "SpotlightLocateStoreView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiWorkSubmitterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
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
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;",
            ">;"
        }
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectApiWorkSubmitter(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;->injectApiWorkSubmitter(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView_MembersInjector;->injectMembers(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)V

    return-void
.end method

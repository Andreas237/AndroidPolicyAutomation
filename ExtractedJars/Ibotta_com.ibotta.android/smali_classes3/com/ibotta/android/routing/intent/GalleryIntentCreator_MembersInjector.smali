.class public final Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;
.super Ljava/lang/Object;
.source "GalleryIntentCreator_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/routing/intent/GalleryIntentCreator;",
        ">;"
    }
.end annotation


# instance fields
.field private final pwiRetailersHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
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
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;->pwiRetailersHolderProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/routing/intent/GalleryIntentCreator;",
            ">;"
        }
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectPwiRetailersHolder(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;->pwiRetailersHolderProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    invoke-static {p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;->injectPwiRetailersHolder(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator_MembersInjector;->injectMembers(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;)V

    return-void
.end method

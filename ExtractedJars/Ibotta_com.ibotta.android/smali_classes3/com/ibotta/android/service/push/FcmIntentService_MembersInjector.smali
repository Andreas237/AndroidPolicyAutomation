.class public final Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;
.super Ljava/lang/Object;
.source "FcmIntentService_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/service/push/FcmIntentService;",
        ">;"
    }
.end annotation


# instance fields
.field private final pushMessagingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/push/PushMessaging;",
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
            "Lcom/ibotta/android/service/push/PushMessaging;",
            ">;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;->pushMessagingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/push/PushMessaging;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/service/push/FcmIntentService;",
            ">;"
        }
    .end annotation

    .line 20
    new-instance v0, Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectPushMessaging(Lcom/ibotta/android/service/push/FcmIntentService;Lcom/ibotta/android/service/push/PushMessaging;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/service/push/FcmIntentService;->pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/service/push/FcmIntentService;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;->pushMessagingProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/service/push/PushMessaging;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;->injectPushMessaging(Lcom/ibotta/android/service/push/FcmIntentService;Lcom/ibotta/android/service/push/PushMessaging;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 7
    check-cast p1, Lcom/ibotta/android/service/push/FcmIntentService;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/push/FcmIntentService_MembersInjector;->injectMembers(Lcom/ibotta/android/service/push/FcmIntentService;)V

    return-void
.end method

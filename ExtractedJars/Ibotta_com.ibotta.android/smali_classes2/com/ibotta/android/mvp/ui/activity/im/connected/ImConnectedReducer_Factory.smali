.class public final Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;
.super Ljava/lang/Object;
.source "ImConnectedReducer_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newImConnectedReducer(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;
    .locals 1

    .line 33
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;"
        }
    .end annotation

    .line 25
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;-><init>(Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer_Factory;->get()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    move-result-object v0

    return-object v0
.end method

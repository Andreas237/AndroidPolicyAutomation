.class public final Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;
.super Ljava/lang/Object;
.source "ImUiUtilImpl_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;",
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

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;->contextProvider:Ljavax/inject/Provider;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newImUiUtilImpl(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;
    .locals 1

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;

    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/AppHelper;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl_Factory;->get()Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;
.super Ljava/lang/Object;
.source "ImTermsReducer_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;",
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

.field private final imUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;->imUtilProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newImTermsReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;
    .locals 1

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;

    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;->imUtilProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer_Factory;->get()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;

    move-result-object v0

    return-object v0
.end method

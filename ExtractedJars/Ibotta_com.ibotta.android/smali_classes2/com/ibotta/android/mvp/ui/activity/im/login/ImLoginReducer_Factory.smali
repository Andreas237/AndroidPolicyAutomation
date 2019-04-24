.class public final Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;
.super Ljava/lang/Object;
.source "ImLoginReducer_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final imLoginValidationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->imLoginValidationProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->imUtilProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->appConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;"
        }
    .end annotation

    .line 57
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newImLoginReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;
    .locals 1

    .line 66
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

    .line 46
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    .line 47
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;

    .line 48
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 49
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;
    .locals 4

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->imLoginValidationProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->imUtilProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->appConfigProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer_Factory;->get()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

    move-result-object v0

    return-object v0
.end method

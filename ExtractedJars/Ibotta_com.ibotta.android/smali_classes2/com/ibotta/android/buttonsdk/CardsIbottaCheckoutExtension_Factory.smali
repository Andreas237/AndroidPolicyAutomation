.class public final Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;
.super Ljava/lang/Object;
.source "CardsIbottaCheckoutExtension_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;",
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

.field private final cardDelayMillisecondsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final checkoutExtensionViewModelProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;",
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

.field private final handlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->contextProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->checkoutExtensionViewModelProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->cardDelayMillisecondsProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->handlerProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;"
        }
    .end annotation

    .line 70
    new-instance v6, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static newCardsIbottaCheckoutExtension(Landroid/content/Context;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;ILandroid/os/Handler;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;
    .locals 7

    .line 84
    new-instance v6, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;-><init>(Landroid/content/Context;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;ILandroid/os/Handler;Lcom/ibotta/android/util/AppHelper;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/os/Handler;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;"
        }
    .end annotation

    .line 56
    new-instance v6, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;

    .line 57
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    .line 58
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;

    .line 59
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 60
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Landroid/os/Handler;

    .line 61
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/util/AppHelper;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;-><init>(Landroid/content/Context;Lcom/ibotta/android/buttonsdk/card/CheckoutExtensionViewModel;ILandroid/os/Handler;Lcom/ibotta/android/util/AppHelper;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;
    .locals 5

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->checkoutExtensionViewModelProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->cardDelayMillisecondsProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->handlerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension_Factory;->get()Lcom/ibotta/android/buttonsdk/CardsIbottaCheckoutExtension;

    move-result-object v0

    return-object v0
.end method

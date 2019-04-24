.class public final Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;
.super Ljava/lang/Object;
.source "GalleryHeaderReducer_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;",
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

.field private final imUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final loyaltyLinkVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->appConfigProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->imUtilProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->pwiVariantProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->loyaltyLinkVariantProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;"
        }
    .end annotation

    .line 70
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static newGalleryHeaderReducer(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;
    .locals 7

    .line 84
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/pwi/PwiVariant;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;"
        }
    .end annotation

    .line 56
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    .line 57
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/util/AppHelper;

    .line 58
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 59
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 60
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 61
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;
    .locals 5

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->imUtilProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->pwiVariantProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->loyaltyLinkVariantProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer_Factory;->get()Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    move-result-object v0

    return-object v0
.end method

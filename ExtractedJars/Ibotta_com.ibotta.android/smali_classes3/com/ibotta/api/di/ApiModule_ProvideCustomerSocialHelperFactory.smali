.class public final Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;
.super Ljava/lang/Object;
.source "ApiModule_ProvideCustomerSocialHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/api/helper/social/CustomerSocialHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;

    invoke-direct {v0}, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;-><init>()V

    sput-object v0, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;->INSTANCE:Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/api/helper/social/CustomerSocialHelper;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;->proxyProvideCustomerSocialHelper()Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideCustomerSocialHelper()Lcom/ibotta/api/helper/social/CustomerSocialHelper;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/api/di/ApiModule;->provideCustomerSocialHelper()Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/social/CustomerSocialHelper;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;->provideInstance()Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/api/di/ApiModule_ProvideCustomerSocialHelperFactory;->get()Lcom/ibotta/api/helper/social/CustomerSocialHelper;

    move-result-object v0

    return-object v0
.end method

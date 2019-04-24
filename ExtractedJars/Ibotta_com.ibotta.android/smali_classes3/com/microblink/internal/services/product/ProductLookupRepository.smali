.class public final Lcom/microblink/internal/services/product/ProductLookupRepository;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ProductLookupRepository"


# instance fields
.field private final applicationContext:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final service:Lcom/microblink/internal/services/product/ProductService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/microblink/internal/services/product/ProductService;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/services/product/ProductService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/microblink/internal/services/product/ProductLookupRepository;->applicationContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/microblink/internal/services/product/ProductLookupRepository;->service:Lcom/microblink/internal/services/product/ProductService;

    return-void
.end method

.method private isKeyValid(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {}, Lcom/microblink/internal/Utility;->productIntelToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/microblink/internal/AESCrypt;->decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/internal/intelligence/ProductIntelRepository;

    iget-object v2, p0, Lcom/microblink/internal/services/product/ProductLookupRepository;->applicationContext:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/microblink/internal/intelligence/ProductIntelRepository;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/microblink/internal/intelligence/ProductIntelRepository;->parse(Ljava/lang/String;)Lcom/microblink/internal/intelligence/ProductIntelKey;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/services/product/ProductLookupRepository;->applicationContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/microblink/internal/Utility;->productIntelIsValid(Landroid/content/Context;Lcom/microblink/internal/intelligence/ProductIntelKey;)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v0, "ProductLookupRepository"

    invoke-virtual {p1}, Ljava/security/GeneralSecurityException;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return v1
.end method


# virtual methods
.method public final enqueue(Ljava/util/List;ILcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;I",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/product/ProductLookupResponse;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/product/ProductLookupRepository;->service:Lcom/microblink/internal/services/product/ProductService;

    new-instance v1, Lcom/microblink/internal/services/product/ProductLookupRepository$1;

    invoke-direct {v1, p0, p3}, Lcom/microblink/internal/services/product/ProductLookupRepository$1;-><init>(Lcom/microblink/internal/services/product/ProductLookupRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p2, p1, v1}, Lcom/microblink/internal/services/product/ProductService;->enqueue(ILjava/util/List;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final enqueue(Ljava/util/List;ILcom/microblink/internal/ProductIntelligenceMapper;Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/internal/ProductIntelligenceMapper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;I",
            "Lcom/microblink/internal/ProductIntelligenceMapper;",
            "Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p5}, Lcom/microblink/internal/services/product/ProductLookupRepository;->isKeyValid(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_0

    iget-object p5, p0, Lcom/microblink/internal/services/product/ProductLookupRepository;->service:Lcom/microblink/internal/services/product/ProductService;

    new-instance v0, Lcom/microblink/internal/services/product/ProductLookupRepository$2;

    invoke-direct {v0, p0, p4, p1, p3}, Lcom/microblink/internal/services/product/ProductLookupRepository$2;-><init>(Lcom/microblink/internal/services/product/ProductLookupRepository;Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;Ljava/util/List;Lcom/microblink/internal/ProductIntelligenceMapper;)V

    invoke-interface {p5, p2, p1, v0}, Lcom/microblink/internal/services/product/ProductService;->enqueue(ILjava/util/List;Lcom/microblink/OnCompleteListener;)V

    return-void

    :cond_0
    const/4 p2, 0x0

    invoke-interface {p4, p1, p2}, Lcom/microblink/internal/services/product/ProductLookupRepository$Listener;->onComplete(Ljava/util/List;Ljava/util/List;)V

    const-string p1, "ProductLookupRepository"

    const-string p2, "Product intelligence enqueue failed due to invalid key"

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final execute(Ljava/util/List;ILcom/microblink/internal/ProductIntelligenceMapper;Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/internal/ProductIntelligenceMapper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;I",
            "Lcom/microblink/internal/ProductIntelligenceMapper;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/microblink/internal/ProductSummary;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p4}, Lcom/microblink/internal/services/product/ProductLookupRepository;->isKeyValid(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    iget-object p4, p0, Lcom/microblink/internal/services/product/ProductLookupRepository;->service:Lcom/microblink/internal/services/product/ProductService;

    invoke-interface {p4, p2, p1}, Lcom/microblink/internal/services/product/ProductService;->execute(ILjava/util/List;)Lcom/microblink/internal/services/product/ProductLookupResponse;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/microblink/internal/ProductIntelligenceMapper;->products(Lcom/microblink/internal/services/product/ProductLookupResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.class Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;
.super Ljava/lang/Object;
.source "APIManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/api/APIManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "APIEndpointsMapKey"
.end annotation


# instance fields
.field private final domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

.field private final endpoint:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/fetchers/api/APIManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    .line 104
    invoke-static {p3}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 105
    iput-object p2, p0, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    .line 106
    iput-object p3, p0, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->endpoint:Ljava/lang/String;

    return-void

    .line 104
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "endpoint can not be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "domainId can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lcom/shopkick/fetchers/api/APIManager$1;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 117
    :cond_0
    instance-of v1, p1, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;

    if-nez v1, :cond_1

    return v0

    .line 119
    :cond_1
    check-cast p1, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;

    iget-object v1, p1, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v2, p0, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    if-ne v1, v2, :cond_2

    iget-object p1, p1, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->endpoint:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->endpoint:Ljava/lang/String;

    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/RequestDomainId;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/fetchers/api/APIManager$APIEndpointsMapKey;->endpoint:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

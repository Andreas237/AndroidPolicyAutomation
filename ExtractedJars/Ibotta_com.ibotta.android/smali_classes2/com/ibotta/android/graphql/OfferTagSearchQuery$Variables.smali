.class public final Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "OfferTagSearchQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/OfferTagSearchQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final includeAvailableRetailers:Z

.field private final name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private final products:Z

.field private final transient valueMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;ZZ)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 148
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 146
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->valueMap:Ljava/util/Map;

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->name:Ljava/lang/String;

    .line 150
    iput-boolean p2, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->products:Z

    .line 151
    iput-boolean p3, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->includeAvailableRetailers:Z

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "name"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    iget-object p1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "products"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    iget-object p1, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)Ljava/lang/String;
    .locals 0

    .line 139
    iget-object p0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)Z
    .locals 0

    .line 139
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->products:Z

    return p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)Z
    .locals 0

    .line 139
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->includeAvailableRetailers:Z

    return p0
.end method


# virtual methods
.method public includeAvailableRetailers()Z
    .locals 1

    .line 166
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->includeAvailableRetailers:Z

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 176
    new-instance v0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;)V

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->name:Ljava/lang/String;

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 162
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->products:Z

    return v0
.end method

.method public valueMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/graphql/OfferTagSearchQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

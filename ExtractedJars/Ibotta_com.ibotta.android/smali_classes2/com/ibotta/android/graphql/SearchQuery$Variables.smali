.class public final Lcom/ibotta/android/graphql/SearchQuery$Variables;
.super Lcom/apollographql/apollo/api/Operation$Variables;
.source "SearchQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/SearchQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Variables"
.end annotation


# instance fields
.field private final contentTypes:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final correctSpelling:Z

.field private final fetchRelatedOffers:Z

.field private final includeAvailableRetailers:Z

.field private final products:Z

.field private final relatedLimit:J

.field private final retailerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final searchLimit:J

.field private final term:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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
.method constructor <init>(Lcom/apollographql/apollo/api/Input;ZJJLcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;ZJJ",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;ZZZ)V"
        }
    .end annotation

    .line 259
    invoke-direct {p0}, Lcom/apollographql/apollo/api/Operation$Variables;-><init>()V

    .line 255
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    .line 260
    iput-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->term:Lcom/apollographql/apollo/api/Input;

    .line 261
    iput-boolean p2, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->correctSpelling:Z

    .line 262
    iput-wide p3, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->searchLimit:J

    .line 263
    iput-wide p5, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->relatedLimit:J

    .line 264
    iput-object p7, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 265
    iput-object p8, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->contentTypes:Lcom/apollographql/apollo/api/Input;

    .line 266
    iput-boolean p9, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->products:Z

    .line 267
    iput-boolean p10, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->fetchRelatedOffers:Z

    .line 268
    iput-boolean p11, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->includeAvailableRetailers:Z

    .line 269
    iget-boolean v0, p1, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v1, "term"

    iget-object p1, p1, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string v0, "correctSpelling"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "searchLimit"

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "relatedLimit"

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    iget-boolean p1, p7, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_1

    .line 276
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "retailerId"

    iget-object p3, p7, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    :cond_1
    iget-boolean p1, p8, Lcom/apollographql/apollo/api/Input;->defined:Z

    if-eqz p1, :cond_2

    .line 279
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "contentTypes"

    iget-object p3, p8, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "products"

    invoke-static {p9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "fetchRelatedOffers"

    invoke-static {p10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    iget-object p1, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    const-string p2, "includeAvailableRetailers"

    invoke-static {p11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 236
    iget-object p0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->term:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z
    .locals 0

    .line 236
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->correctSpelling:Z

    return p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/SearchQuery$Variables;)J
    .locals 2

    .line 236
    iget-wide v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->searchLimit:J

    return-wide v0
.end method

.method static synthetic access$300(Lcom/ibotta/android/graphql/SearchQuery$Variables;)J
    .locals 2

    .line 236
    iget-wide v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->relatedLimit:J

    return-wide v0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 236
    iget-object p0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 236
    iget-object p0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->contentTypes:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$600(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z
    .locals 0

    .line 236
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->products:Z

    return p0
.end method

.method static synthetic access$700(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z
    .locals 0

    .line 236
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->fetchRelatedOffers:Z

    return p0
.end method

.method static synthetic access$800(Lcom/ibotta/android/graphql/SearchQuery$Variables;)Z
    .locals 0

    .line 236
    iget-boolean p0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->includeAvailableRetailers:Z

    return p0
.end method


# virtual methods
.method public contentTypes()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 307
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->contentTypes:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public correctSpelling()Z
    .locals 1

    .line 291
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->correctSpelling:Z

    return v0
.end method

.method public fetchRelatedOffers()Z
    .locals 1

    .line 315
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->fetchRelatedOffers:Z

    return v0
.end method

.method public includeAvailableRetailers()Z
    .locals 1

    .line 319
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->includeAvailableRetailers:Z

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 329
    new-instance v0, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/SearchQuery$Variables$1;-><init>(Lcom/ibotta/android/graphql/SearchQuery$Variables;)V

    return-object v0
.end method

.method public products()Z
    .locals 1

    .line 311
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->products:Z

    return v0
.end method

.method public relatedLimit()J
    .locals 2

    .line 299
    iget-wide v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->relatedLimit:J

    return-wide v0
.end method

.method public retailerId()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 303
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object v0
.end method

.method public searchLimit()J
    .locals 2

    .line 295
    iget-wide v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->searchLimit:J

    return-wide v0
.end method

.method public term()Lcom/apollographql/apollo/api/Input;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->term:Lcom/apollographql/apollo/api/Input;

    return-object v0
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

    .line 324
    iget-object v0, p0, Lcom/ibotta/android/graphql/SearchQuery$Variables;->valueMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

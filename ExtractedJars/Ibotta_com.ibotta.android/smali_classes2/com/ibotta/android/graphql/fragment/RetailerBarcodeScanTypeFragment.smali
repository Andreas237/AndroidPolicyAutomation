.class public Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;
.super Ljava/lang/Object;
.source "RetailerBarcodeScanTypeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment RetailerBarcodeScanTypeFragment on RetailerBarcodeScanType {\n  __typename\n  barcode_sizes\n  scan_type\n}"

.field public static final POSSIBLE_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final __typename:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final barcode_sizes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final scan_type:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    .line 23
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 24
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "barcode_sizes"

    const-string v2, "barcode_sizes"

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "scan_type"

    const-string v2, "scan_type"

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "RetailerBarcodeScanType"

    .line 35
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 51
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->__typename:Ljava/lang/String;

    .line 52
    iput-object p2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    .line 53
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public barcode_sizes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 107
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 108
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    .line 110
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 118
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 123
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    .line 126
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 127
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$hashCodeMemoized:Z

    .line 129
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 75
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;)V

    return-object v0
.end method

.method public scan_type()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerBarcodeScanTypeFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", barcode_sizes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->barcode_sizes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scan_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->scan_type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$toString:Ljava/lang/String;

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

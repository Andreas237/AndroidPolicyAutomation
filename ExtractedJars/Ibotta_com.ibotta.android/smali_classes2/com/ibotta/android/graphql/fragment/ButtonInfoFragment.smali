.class public Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;
.super Ljava/lang/Object;
.source "ButtonInfoFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;,
        Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;,
        Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment ButtonInfoFragment on ButtonInfo {\n  __typename\n  android {\n    __typename\n    ...ButtonMetadataFragment\n  }\n  ios {\n    __typename\n    ...ButtonMetadataFragment\n  }\n}"

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

.field final android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;
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

    const-string v1, "android"

    const-string v2, "android"

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "ios"

    const-string v2, "ios"

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forObject(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "ButtonInfo"

    .line 41
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 57
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->__typename:Ljava/lang/String;

    .line 58
    iput-object p2, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    .line 59
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public android()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 102
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 103
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    .line 105
    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    .line 106
    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;->equals(Ljava/lang/Object;)Z

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

    .line 113
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_2

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 118
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    .line 121
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 122
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$hashCodeMemoized:Z

    .line 124
    :cond_2
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$hashCode:I

    return v0
.end method

.method public ios()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 75
    new-instance v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ButtonInfoFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", android="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ios="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$toString:Ljava/lang/String;

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

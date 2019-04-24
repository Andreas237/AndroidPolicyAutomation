.class public Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;
.super Ljava/lang/Object;
.source "RetailerRedemptionMetaFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment RetailerRedemptionMetaFragment on RetailerRedemptionMeta {\n  __typename\n  additional_redemption_instructions\n  button_departing_user_message\n  button_pending_activity_message\n  button_returning_user_message\n  max_receipt_age_days\n  receipt_name\n}"

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

.field final additional_redemption_instructions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final button_departing_user_message:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final button_pending_activity_message:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final button_returning_user_message:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final max_receipt_age_days:Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final receipt_name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x7

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

    const-string v1, "additional_redemption_instructions"

    const-string v2, "additional_redemption_instructions"

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "button_departing_user_message"

    const-string v2, "button_departing_user_message"

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "button_pending_activity_message"

    const-string v2, "button_pending_activity_message"

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "button_returning_user_message"

    const-string v2, "button_returning_user_message"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "max_receipt_age_days"

    const-string v2, "max_receipt_age_days"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forLong(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "receipt_name"

    const-string v2, "receipt_name"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "RetailerRedemptionMeta"

    .line 43
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
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
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 71
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->__typename:Ljava/lang/String;

    .line 72
    iput-object p2, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

    .line 73
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    .line 74
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    .line 75
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    .line 76
    iput-object p6, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    .line 77
    iput-object p7, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public additional_redemption_instructions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

    return-object v0
.end method

.method public button_departing_user_message()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    return-object v0
.end method

.method public button_pending_activity_message()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    return-object v0
.end method

.method public button_returning_user_message()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 167
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    .line 168
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    .line 169
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

    if-nez v1, :cond_7

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

    .line 170
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    .line 171
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    .line 172
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    .line 173
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    if-nez v1, :cond_7

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    .line 174
    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    if-nez p1, :cond_7

    goto :goto_5

    :cond_6
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    .line 175
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    return v0

    :cond_8
    return v2
.end method

.method public hashCode()I
    .locals 4

    .line 182
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_6

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 187
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

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

    .line 189
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 191
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 193
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 195
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 197
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    xor-int/2addr v0, v3

    .line 198
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 199
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$hashCodeMemoized:Z

    .line 201
    :cond_6
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 127
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;)V

    return-object v0
.end method

.method public max_receipt_age_days()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    return-object v0
.end method

.method public receipt_name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerRedemptionMetaFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", additional_redemption_instructions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", button_departing_user_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", button_pending_activity_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", button_returning_user_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", max_receipt_age_days="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receipt_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$toString:Ljava/lang/String;

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

.class public Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;
.super Ljava/lang/Object;
.source "RetailerBarcodeConfigurationFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/GraphqlFragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type;,
        Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Mapper;
    }
.end annotation


# static fields
.field static final $responseFields:[Lcom/apollographql/apollo/api/ResponseField;

.field public static final FRAGMENT_DEFINITION:Ljava/lang/String; = "fragment RetailerBarcodeConfigurationFragment on RetailerBarcodeConfiguration {\n  __typename\n  id\n  barcode_name\n  capture_message\n  example_image_url\n  help_image_url\n  help_message\n  help_title\n  icon_image_url\n  scan_content_regex\n  scan_types {\n    __typename\n    ...RetailerBarcodeScanTypeFragment\n  }\n}"

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

.field final barcode_name:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final capture_message:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final example_image_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final help_image_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final help_message:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final help_title:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final icon_image_url:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field final scan_content_regex:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final scan_types:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v0, 0xb

    .line 24
    new-array v0, v0, [Lcom/apollographql/apollo/api/ResponseField;

    const-string v1, "__typename"

    const-string v2, "__typename"

    .line 25
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v6, "id"

    const-string v7, "id"

    sget-object v10, Lcom/ibotta/android/graphql/type/CustomType;->ID:Lcom/ibotta/android/graphql/type/CustomType;

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/apollographql/apollo/api/ResponseField;->forCustomType(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLcom/apollographql/apollo/api/ScalarType;Ljava/util/List;)Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "barcode_name"

    const-string v3, "barcode_name"

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const-string v1, "capture_message"

    const-string v3, "capture_message"

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const-string v1, "example_image_url"

    const-string v3, "example_image_url"

    .line 29
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const-string v1, "help_image_url"

    const-string v3, "help_image_url"

    .line 30
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "help_message"

    const-string v3, "help_message"

    .line 31
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const-string v1, "help_title"

    const-string v3, "help_title"

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    const-string v1, "icon_image_url"

    const-string v3, "icon_image_url"

    .line 33
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    const-string v1, "scan_content_regex"

    const-string v3, "scan_content_regex"

    .line 34
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forString(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    const-string v1, "scan_types"

    const-string v3, "scan_types"

    .line 35
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {v1, v3, v5, v2, v4}, Lcom/apollographql/apollo/api/ResponseField;->forList(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/util/List;)Lcom/apollographql/apollo/api/ResponseField;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const-string v0, "RetailerBarcodeConfiguration"

    .line 55
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->POSSIBLE_TYPES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
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
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type;",
            ">;)V"
        }
    .end annotation

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "__typename == null"

    .line 90
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->__typename:Ljava/lang/String;

    const-string p1, "id == null"

    .line 91
    invoke-static {p2, p1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->id:Ljava/lang/String;

    .line 92
    iput-object p3, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    .line 93
    iput-object p4, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    .line 94
    iput-object p5, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    .line 95
    iput-object p6, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    .line 96
    iput-object p7, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    .line 97
    iput-object p8, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    .line 98
    iput-object p9, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    .line 99
    iput-object p10, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    .line 100
    iput-object p11, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public __typename()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->__typename:Ljava/lang/String;

    return-object v0
.end method

.method public barcode_name()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    return-object v0
.end method

.method public capture_message()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 223
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    .line 224
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;

    .line 225
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->__typename:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->id:Ljava/lang/String;

    .line 226
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_0

    :cond_1
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    .line 227
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    .line 228
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    if-nez v1, :cond_3

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_2

    :cond_3
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    .line 229
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_3

    :cond_4
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    .line 230
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    if-nez v1, :cond_5

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_4

    :cond_5
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    .line 231
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_5

    :cond_6
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    .line 232
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_6

    :cond_7
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    .line 233
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_7

    :cond_8
    iget-object v3, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    .line 234
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    if-nez v1, :cond_9

    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    if-nez p1, :cond_a

    goto :goto_8

    :cond_9
    iget-object p1, p1, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    .line 235
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_8

    :cond_a
    const/4 v0, 0x0

    :goto_8
    return v0

    :cond_b
    return v2
.end method

.method public example_image_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 242
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$hashCodeMemoized:Z

    if-nez v0, :cond_9

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 247
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 249
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 251
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 253
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 255
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 257
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 259
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 261
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 263
    iget-object v2, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 265
    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v3

    :goto_8
    xor-int/2addr v0, v3

    .line 266
    iput v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$hashCode:I

    const/4 v0, 0x1

    .line 267
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$hashCodeMemoized:Z

    .line 269
    :cond_9
    iget v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$hashCode:I

    return v0
.end method

.method public help_image_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    return-object v0
.end method

.method public help_message()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    return-object v0
.end method

.method public help_title()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    return-object v0
.end method

.method public icon_image_url()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 175
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;)V

    return-object v0
.end method

.method public scan_content_regex()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    return-object v0
.end method

.method public scan_types()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment$Scan_type;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 201
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RetailerBarcodeConfigurationFragment{__typename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->__typename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", barcode_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->barcode_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", capture_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->capture_message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", example_image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->example_image_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", help_image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_image_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", help_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", help_title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->help_title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", icon_image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->icon_image_url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", scan_content_regex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_content_regex:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", scan_types="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->scan_types:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$toString:Ljava/lang/String;

    .line 215
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeConfigurationFragment;->$toString:Ljava/lang/String;

    return-object v0
.end method

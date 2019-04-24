.class public Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "ButtonInfoMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;",
        "Lcom/ibotta/api/model/retailer/ButtonInfo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;)Lcom/ibotta/api/model/retailer/ButtonInfo;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 25
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/retailer/ButtonInfo;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/ButtonInfo;-><init>()V

    .line 27
    new-instance v1, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    invoke-direct {v1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;-><init>()V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;->fragments()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Fragments;->buttonMetadataFragment()Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;->id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->setId(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->android()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;->fragments()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Fragments;->buttonMetadataFragment()Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;->url()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->setUrl(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/ButtonInfo;->setAndroid(Lcom/ibotta/api/model/retailer/ButtonInfoDetails;)V

    .line 32
    new-instance v1, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    invoke-direct {v1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;-><init>()V

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;->fragments()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Fragments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Fragments;->buttonMetadataFragment()Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;->id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->setId(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;->ios()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios;->fragments()Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Ios$Fragments;->buttonMetadataFragment()Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/ButtonMetadataFragment;->url()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->setUrl(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/ButtonInfo;->setIos(Lcom/ibotta/api/model/retailer/ButtonInfoDetails;)V

    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 14
    check-cast p1, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/ButtonInfoMapper;->map(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;)Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object p1

    return-object p1
.end method

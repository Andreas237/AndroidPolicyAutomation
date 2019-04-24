.class public Lio/branch/indexing/BranchUniversalObject;
.super Ljava/lang/Object;
.source "BranchUniversalObject.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;,
        Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;,
        Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private canonicalIdentifier_:Ljava/lang/String;

.field private canonicalUrl_:Ljava/lang/String;

.field private creationTimeStamp_:J

.field private description_:Ljava/lang/String;

.field private expirationInMilliSec_:J

.field private imageUrl_:Ljava/lang/String;

.field private indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

.field private final keywords_:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private localIndexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

.field private metadata_:Lio/branch/referral/util/ContentMetadata;

.field private title_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 897
    new-instance v0, Lio/branch/indexing/BranchUniversalObject$1;

    invoke-direct {v0}, Lio/branch/indexing/BranchUniversalObject$1;-><init>()V

    sput-object v0, Lio/branch/indexing/BranchUniversalObject;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Lio/branch/referral/util/ContentMetadata;

    invoke-direct {v0}, Lio/branch/referral/util/ContentMetadata;-><init>()V

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    const-string v0, ""

    .line 81
    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    const-string v0, ""

    .line 82
    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    const-string v0, ""

    .line 83
    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    const-string v0, ""

    .line 84
    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    .line 85
    sget-object v0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PUBLIC:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    .line 86
    sget-object v0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PUBLIC:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->localIndexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    const-wide/16 v0, 0x0

    .line 87
    iput-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->creationTimeStamp_:J

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 923
    invoke-direct {p0}, Lio/branch/indexing/BranchUniversalObject;-><init>()V

    .line 924
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->creationTimeStamp_:J

    .line 925
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    .line 926
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    .line 927
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    .line 928
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    .line 929
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    .line 930
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    .line 931
    invoke-static {}, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->values()[Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    .line 933
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 935
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 937
    :cond_0
    const-class v0, Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lio/branch/referral/util/ContentMetadata;

    iput-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    .line 938
    invoke-static {}, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->values()[Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    aget-object p1, v0, p1

    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->localIndexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lio/branch/indexing/BranchUniversalObject$1;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lio/branch/indexing/BranchUniversalObject;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method static synthetic access$100(Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/BranchShortLinkBuilder;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lio/branch/indexing/BranchUniversalObject;->getLinkBuilder(Lio/branch/referral/BranchShortLinkBuilder;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static createInstance(Lorg/json/JSONObject;)Lio/branch/indexing/BranchUniversalObject;
    .locals 5

    const/4 v0, 0x0

    .line 794
    :try_start_0
    new-instance v1, Lio/branch/indexing/BranchUniversalObject;

    invoke-direct {v1}, Lio/branch/indexing/BranchUniversalObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 795
    :try_start_1
    new-instance v2, Lio/branch/referral/BranchUtil$JsonReader;

    invoke-direct {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;-><init>(Lorg/json/JSONObject;)V

    .line 796
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->ContentTitle:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    .line 797
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->CanonicalIdentifier:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    .line 798
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->CanonicalUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    .line 799
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->ContentDesc:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    .line 800
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->ContentImgUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    .line 801
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->ContentExpiryTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, v1, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    .line 803
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->ContentKeyWords:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOut(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    .line 804
    instance-of v3, p0, Lorg/json/JSONArray;

    if-eqz v3, :cond_0

    .line 805
    move-object v0, p0

    check-cast v0, Lorg/json/JSONArray;

    goto :goto_0

    .line 806
    :cond_0
    instance-of v3, p0, Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 807
    new-instance v0, Lorg/json/JSONArray;

    check-cast p0, Ljava/lang/String;

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    const/4 p0, 0x0

    .line 810
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge p0, v3, :cond_2

    .line 811
    iget-object v3, v1, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    .line 814
    :cond_2
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->PublicallyIndexable:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOut(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    .line 815
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 816
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PUBLIC:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    goto :goto_2

    :cond_3
    sget-object p0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PRIVATE:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    :goto_2
    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    goto :goto_4

    .line 817
    :cond_4
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_6

    .line 819
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_5

    sget-object p0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PUBLIC:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    goto :goto_3

    :cond_5
    sget-object p0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PRIVATE:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    :goto_3
    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    .line 821
    :cond_6
    :goto_4
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->LocallyIndexable:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutBoolean(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_7

    sget-object p0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PUBLIC:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    goto :goto_5

    :cond_7
    sget-object p0, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PRIVATE:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    :goto_5
    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->localIndexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    .line 822
    sget-object p0, Lio/branch/referral/Defines$Jsonkey;->CreationTimestamp:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lio/branch/referral/BranchUtil$JsonReader;->readOutLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, v1, Lio/branch/indexing/BranchUniversalObject;->creationTimeStamp_:J

    .line 824
    invoke-static {v2}, Lio/branch/referral/util/ContentMetadata;->createFromJson(Lio/branch/referral/BranchUtil$JsonReader;)Lio/branch/referral/util/ContentMetadata;

    move-result-object p0

    iput-object p0, v1, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    .line 828
    invoke-virtual {v2}, Lio/branch/referral/BranchUtil$JsonReader;->getJsonObject()Lorg/json/JSONObject;

    move-result-object p0

    .line 829
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 830
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 831
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 832
    iget-object v3, v1, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lio/branch/referral/util/ContentMetadata;->addCustomMetadata(Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_0
    move-object v1, v0

    :catch_1
    :cond_8
    return-object v1
.end method

.method private getLinkBuilder(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 692
    new-instance v0, Lio/branch/referral/BranchShortLinkBuilder;

    invoke-direct {v0, p1}, Lio/branch/referral/BranchShortLinkBuilder;-><init>(Landroid/content/Context;)V

    .line 693
    invoke-direct {p0, v0, p2}, Lio/branch/indexing/BranchUniversalObject;->getLinkBuilder(Lio/branch/referral/BranchShortLinkBuilder;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object p1

    return-object p1
.end method

.method private getLinkBuilder(Lio/branch/referral/BranchShortLinkBuilder;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;
    .locals 4
    .param p1    # Lio/branch/referral/BranchShortLinkBuilder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 697
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getTags()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 698
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getTags()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->addTags(Ljava/util/List;)Lio/branch/referral/BranchUrlBuilder;

    .line 700
    :cond_0
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getFeature()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 701
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getFeature()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->setFeature(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    .line 703
    :cond_1
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getAlias()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 704
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getAlias()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->setAlias(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    .line 706
    :cond_2
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getChannel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 707
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getChannel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->setChannel(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    .line 709
    :cond_3
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getStage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 710
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getStage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->setStage(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    .line 712
    :cond_4
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getCampaign()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 713
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getCampaign()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->setCampaign(Ljava/lang/String;)Lio/branch/referral/BranchShortLinkBuilder;

    .line 715
    :cond_5
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getMatchDuration()I

    move-result v0

    if-lez v0, :cond_6

    .line 716
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getMatchDuration()I

    move-result v0

    invoke-virtual {p1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->setDuration(I)Lio/branch/referral/BranchShortLinkBuilder;

    .line 718
    :cond_6
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 719
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ContentTitle:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 721
    :cond_7
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 722
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->CanonicalIdentifier:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 724
    :cond_8
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 725
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->CanonicalUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 727
    :cond_9
    invoke-virtual {p0}, Lio/branch/indexing/BranchUniversalObject;->getKeywordsJsonArray()Lorg/json/JSONArray;

    move-result-object v0

    .line 728
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_a

    .line 729
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentKeyWords:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 731
    :cond_a
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 732
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ContentDesc:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 734
    :cond_b
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 735
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ContentImgUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 737
    :cond_c
    iget-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_d

    .line 738
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ContentExpiryTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 740
    :cond_d
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->PublicallyIndexable:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/branch/indexing/BranchUniversalObject;->isPublicallyIndexable()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    .line 741
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {v0}, Lio/branch/referral/util/ContentMetadata;->convertToJson()Lorg/json/JSONObject;

    move-result-object v0

    .line 743
    :try_start_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 744
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 745
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 746
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 749
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 751
    :cond_e
    invoke-virtual {p2}, Lio/branch/referral/util/LinkProperties;->getControlParams()Ljava/util/HashMap;

    move-result-object p2

    .line 752
    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 753
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lio/branch/referral/BranchShortLinkBuilder;->addParameters(Ljava/lang/String;Ljava/lang/Object;)Lio/branch/referral/BranchUrlBuilder;

    goto :goto_1

    :cond_f
    return-object p1
.end method

.method public static getReferredBranchUniversalObject()Lio/branch/indexing/BranchUniversalObject;
    .locals 4

    .line 767
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 769
    :try_start_0
    invoke-virtual {v0}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 771
    invoke-virtual {v0}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "+clicked_branch_link"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "+clicked_branch_link"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 772
    invoke-virtual {v0}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lio/branch/indexing/BranchUniversalObject;->createInstance(Lorg/json/JSONObject;)Lio/branch/indexing/BranchUniversalObject;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 775
    :cond_0
    invoke-virtual {v0}, Lio/branch/referral/Branch;->getDeeplinkDebugParams()Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lio/branch/referral/Branch;->getDeeplinkDebugParams()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 776
    invoke-virtual {v0}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lio/branch/indexing/BranchUniversalObject;->createInstance(Lorg/json/JSONObject;)Lio/branch/indexing/BranchUniversalObject;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    :catch_0
    :cond_1
    :goto_0
    return-object v1
.end method


# virtual methods
.method public addContentMetadata(Ljava/lang/String;Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 1

    .line 174
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {v0, p1, p2}, Lio/branch/referral/util/ContentMetadata;->addCustomMetadata(Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;

    return-object p0
.end method

.method public addContentMetadata(Ljava/util/HashMap;)Lio/branch/indexing/BranchUniversalObject;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/branch/indexing/BranchUniversalObject;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 161
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 162
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 164
    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lio/branch/referral/util/ContentMetadata;->addCustomMetadata(Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public addKeyWord(Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 1

    .line 248
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addKeyWords(Ljava/util/ArrayList;)Lio/branch/indexing/BranchUniversalObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/branch/indexing/BranchUniversalObject;"
        }
    .end annotation

    .line 235
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public convertToJson()Lorg/json/JSONObject;
    .locals 5

    .line 848
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 851
    :try_start_0
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {v1}, Lio/branch/referral/util/ContentMetadata;->convertToJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 852
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 853
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 854
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 855
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 857
    :cond_0
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 858
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentTitle:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 860
    :cond_1
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 861
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->CanonicalIdentifier:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 863
    :cond_2
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 864
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->CanonicalUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 866
    :cond_3
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_5

    .line 867
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 868
    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 869
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    .line 871
    :cond_4
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->ContentKeyWords:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 873
    :cond_5
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 874
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentDesc:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 876
    :cond_6
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 877
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentImgUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 879
    :cond_7
    iget-wide v1, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_8

    .line 880
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentExpiryTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 882
    :cond_8
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->PublicallyIndexable:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/branch/indexing/BranchUniversalObject;->isPublicallyIndexable()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 883
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->LocallyIndexable:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/branch/indexing/BranchUniversalObject;->isLocallyIndexable()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 884
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->CreationTimestamp:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lio/branch/indexing/BranchUniversalObject;->creationTimeStamp_:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public generateShortUrl(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;Lio/branch/referral/Branch$BranchLinkCreateListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lio/branch/referral/Branch$BranchLinkCreateListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 622
    invoke-direct {p0, p1, p2}, Lio/branch/indexing/BranchUniversalObject;->getLinkBuilder(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lio/branch/referral/BranchShortLinkBuilder;->generateShortUrl(Lio/branch/referral/Branch$BranchLinkCreateListener;)V

    return-void
.end method

.method public generateShortUrl(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;Lio/branch/referral/Branch$BranchLinkCreateListener;Z)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lio/branch/referral/Branch$BranchLinkCreateListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 635
    invoke-direct {p0, p1, p2}, Lio/branch/indexing/BranchUniversalObject;->getLinkBuilder(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object p1

    invoke-virtual {p1, p4}, Lio/branch/referral/BranchShortLinkBuilder;->setDefaultToLongUrl(Z)Lio/branch/referral/BranchUrlBuilder;

    move-result-object p1

    check-cast p1, Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {p1, p3}, Lio/branch/referral/BranchShortLinkBuilder;->generateShortUrl(Lio/branch/referral/Branch$BranchLinkCreateListener;)V

    return-void
.end method

.method public getCanonicalIdentifier()Ljava/lang/String;
    .locals 1

    .line 445
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    return-object v0
.end method

.method public getCanonicalUrl()Ljava/lang/String;
    .locals 1

    .line 456
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public getContentMetadata()Lio/branch/referral/util/ContentMetadata;
    .locals 1

    .line 423
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    return-object v0
.end method

.method public getCurrencyType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 467
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    return-object v0
.end method

.method public getExpirationTime()J
    .locals 2

    .line 434
    iget-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    return-wide v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 478
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public getKeywords()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 543
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getKeywordsJsonArray()Lorg/json/JSONArray;
    .locals 3

    .line 529
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 530
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 531
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getMetadata()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 414
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {v0}, Lio/branch/referral/util/ContentMetadata;->getCustomMetadata()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public getPrice()D
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getShortUrl(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Ljava/lang/String;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 598
    invoke-direct {p0, p1, p2}, Lio/branch/indexing/BranchUniversalObject;->getLinkBuilder(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lio/branch/referral/BranchShortLinkBuilder;->getShortUrl()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getShortUrl(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;Z)Ljava/lang/String;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 611
    invoke-direct {p0, p1, p2}, Lio/branch/indexing/BranchUniversalObject;->getLinkBuilder(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lio/branch/referral/BranchShortLinkBuilder;->setDefaultToLongUrl(Z)Lio/branch/referral/BranchUrlBuilder;

    move-result-object p1

    check-cast p1, Lio/branch/referral/BranchShortLinkBuilder;

    invoke-virtual {p1}, Lio/branch/referral/BranchShortLinkBuilder;->getShortUrl()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 489
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isLocallyIndexable()Z
    .locals 2

    .line 407
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->localIndexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    sget-object v1, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PUBLIC:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPublicallyIndexable()Z
    .locals 2

    .line 396
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    sget-object v1, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->PUBLIC:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public listOnGoogleSearch(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 288
    invoke-static {p1, p0, v0}, Lio/branch/indexing/AppIndexingHelper;->addToAppIndex(Landroid/content/Context;Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/util/LinkProperties;)V

    return-void
.end method

.method public listOnGoogleSearch(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)V
    .locals 0

    .line 300
    invoke-static {p1, p0, p2}, Lio/branch/indexing/AppIndexingHelper;->addToAppIndex(Landroid/content/Context;Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/util/LinkProperties;)V

    return-void
.end method

.method public registerView()V
    .locals 1

    const/4 v0, 0x0

    .line 552
    invoke-virtual {p0, v0}, Lio/branch/indexing/BranchUniversalObject;->registerView(Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;)V

    return-void
.end method

.method public registerView(Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;)V
    .locals 4
    .param p1    # Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 561
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 562
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lio/branch/referral/Branch;->registerView(Lio/branch/indexing/BranchUniversalObject;Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 565
    new-instance v1, Lio/branch/referral/BranchError;

    const-string v2, "Register view error"

    const/16 v3, -0x6d

    invoke-direct {v1, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0, v1}, Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;->onRegisterViewFinished(ZLio/branch/referral/BranchError;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public removeFromLocalIndexing(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 310
    invoke-static {p1, p0, v0}, Lio/branch/indexing/AppIndexingHelper;->removeFromFirebaseLocalIndex(Landroid/content/Context;Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/util/LinkProperties;)V

    return-void
.end method

.method public removeFromLocalIndexing(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)V
    .locals 0

    .line 322
    invoke-static {p1, p0, p2}, Lio/branch/indexing/AppIndexingHelper;->removeFromFirebaseLocalIndex(Landroid/content/Context;Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/util/LinkProperties;)V

    return-void
.end method

.method public setCanonicalIdentifier(Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 100
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    return-object p0
.end method

.method public setCanonicalUrl(Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 113
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    return-object p0
.end method

.method public setContentDescription(Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0

    .line 139
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    return-object p0
.end method

.method public setContentExpiration(Ljava/util/Date;)Lio/branch/indexing/BranchUniversalObject;
    .locals 2

    .line 261
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    return-object p0
.end method

.method public setContentImageUrl(Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 152
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    return-object p0
.end method

.method public setContentIndexingMode(Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0

    .line 206
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    return-object p0
.end method

.method public setContentMetadata(Lio/branch/referral/util/ContentMetadata;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0

    .line 185
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    return-object p0
.end method

.method public setContentType(Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0

    return-object p0
.end method

.method public setLocalIndexMode(Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0

    .line 221
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->localIndexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    return-object p0
.end method

.method public setPrice(DLio/branch/referral/util/CurrencyType;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lio/branch/indexing/BranchUniversalObject;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 126
    iput-object p1, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    return-object p0
.end method

.method public showShareSheet(Landroid/app/Activity;Lio/branch/referral/util/LinkProperties;Lio/branch/referral/util/ShareSheetStyle;Lio/branch/referral/Branch$BranchLinkShareListener;)V
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lio/branch/referral/util/ShareSheetStyle;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lio/branch/referral/Branch$BranchLinkShareListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 642
    invoke-virtual/range {v0 .. v5}, Lio/branch/indexing/BranchUniversalObject;->showShareSheet(Landroid/app/Activity;Lio/branch/referral/util/LinkProperties;Lio/branch/referral/util/ShareSheetStyle;Lio/branch/referral/Branch$BranchLinkShareListener;Lio/branch/referral/Branch$IChannelProperties;)V

    return-void
.end method

.method public showShareSheet(Landroid/app/Activity;Lio/branch/referral/util/LinkProperties;Lio/branch/referral/util/ShareSheetStyle;Lio/branch/referral/Branch$BranchLinkShareListener;Lio/branch/referral/Branch$IChannelProperties;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lio/branch/referral/util/LinkProperties;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lio/branch/referral/util/ShareSheetStyle;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lio/branch/referral/Branch$BranchLinkShareListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 646
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p4, :cond_0

    .line 648
    new-instance p1, Lio/branch/referral/BranchError;

    const-string p2, "Trouble sharing link. "

    const/16 p3, -0x6d

    invoke-direct {p1, p2, p3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    const/4 p2, 0x0

    invoke-interface {p4, p2, p2, p1}, Lio/branch/referral/Branch$BranchLinkShareListener;->onLinkShareResponse(Ljava/lang/String;Ljava/lang/String;Lio/branch/referral/BranchError;)V

    goto/16 :goto_0

    :cond_0
    const-string p1, "BranchSDK"

    const-string p2, "Sharing error. Branch instance is not created yet. Make sure you have initialised Branch."

    .line 650
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 653
    :cond_1
    new-instance v0, Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-direct {p0, p1, p2}, Lio/branch/indexing/BranchUniversalObject;->getLinkBuilder(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lio/branch/referral/Branch$ShareLinkBuilder;-><init>(Landroid/app/Activity;Lio/branch/referral/BranchShortLinkBuilder;)V

    .line 654
    new-instance p1, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;

    invoke-direct {p1, p0, p4, v0, p2}, Lio/branch/indexing/BranchUniversalObject$LinkShareListenerWrapper;-><init>(Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/Branch$BranchLinkShareListener;Lio/branch/referral/Branch$ShareLinkBuilder;Lio/branch/referral/util/LinkProperties;)V

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setCallback(Lio/branch/referral/Branch$BranchLinkShareListener;)Lio/branch/referral/Branch$ShareLinkBuilder;

    move-result-object p1

    .line 655
    invoke-virtual {p1, p5}, Lio/branch/referral/Branch$ShareLinkBuilder;->setChannelProperties(Lio/branch/referral/Branch$IChannelProperties;)Lio/branch/referral/Branch$ShareLinkBuilder;

    move-result-object p1

    .line 656
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getMessageTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/branch/referral/Branch$ShareLinkBuilder;->setSubject(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;

    move-result-object p1

    .line 657
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getMessageBody()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/branch/referral/Branch$ShareLinkBuilder;->setMessage(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 659
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getCopyUrlIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 660
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getCopyUrlIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getCopyURlText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getUrlCopiedMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p1, p2, p4}, Lio/branch/referral/Branch$ShareLinkBuilder;->setCopyUrlStyle(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 662
    :cond_2
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getMoreOptionIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 663
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getMoreOptionIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getMoreOptionText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/branch/referral/Branch$ShareLinkBuilder;->setMoreOptionStyle(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 665
    :cond_3
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getDefaultURL()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 666
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getDefaultURL()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setDefaultURL(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 668
    :cond_4
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getPreferredOptions()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_5

    .line 669
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getPreferredOptions()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->addPreferredSharingOptions(Ljava/util/ArrayList;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 671
    :cond_5
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getStyleResourceID()I

    move-result p1

    if-lez p1, :cond_6

    .line 672
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getStyleResourceID()I

    move-result p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setStyleResourceID(I)V

    .line 674
    :cond_6
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getDividerHeight()I

    move-result p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setDividerHeight(I)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 675
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getIsFullWidthStyle()Z

    move-result p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setAsFullWidthStyle(Z)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 676
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getDialogThemeResourceID()I

    move-result p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setDialogThemeResourceID(I)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 677
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getSharingTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setSharingTitle(Ljava/lang/String;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 678
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getSharingTitleView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setSharingTitle(Landroid/view/View;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 679
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getIconSize()I

    move-result p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->setIconSize(I)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 681
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getIncludedInShareSheet()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getIncludedInShareSheet()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_7

    .line 682
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getIncludedInShareSheet()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->includeInShareSheet(Ljava/util/List;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 684
    :cond_7
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getExcludedFromShareSheet()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getExcludedFromShareSheet()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_8

    .line 685
    invoke-virtual {p3}, Lio/branch/referral/util/ShareSheetStyle;->getExcludedFromShareSheet()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->excludeFromShareSheet(Ljava/util/List;)Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 687
    :cond_8
    invoke-virtual {v0}, Lio/branch/referral/Branch$ShareLinkBuilder;->shareLink()V

    :goto_0
    return-void
.end method

.method public userCompletedAction(Lio/branch/referral/util/BRANCH_STANDARD_EVENT;)V
    .locals 1

    .line 345
    invoke-virtual {p1}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/branch/indexing/BranchUniversalObject;->userCompletedAction(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method public userCompletedAction(Lio/branch/referral/util/BRANCH_STANDARD_EVENT;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/branch/referral/util/BRANCH_STANDARD_EVENT;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 385
    invoke-virtual {p1}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/branch/indexing/BranchUniversalObject;->userCompletedAction(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method public userCompletedAction(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 334
    invoke-virtual {p0, p1, v0}, Lio/branch/indexing/BranchUniversalObject;->userCompletedAction(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method public userCompletedAction(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 358
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 360
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 361
    iget-object v2, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 362
    iget-object v1, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    invoke-virtual {p0}, Lio/branch/indexing/BranchUniversalObject;->convertToJson()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    .line 364
    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 365
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 368
    :cond_0
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 369
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lio/branch/referral/Branch;->userCompletedAction(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 909
    iget-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->creationTimeStamp_:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 910
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalIdentifier_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 911
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->canonicalUrl_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 912
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->title_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 913
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->description_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 914
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->imageUrl_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 915
    iget-wide v0, p0, Lio/branch/indexing/BranchUniversalObject;->expirationInMilliSec_:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 916
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->indexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    invoke-virtual {v0}, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 917
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->keywords_:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 918
    iget-object v0, p0, Lio/branch/indexing/BranchUniversalObject;->metadata_:Lio/branch/referral/util/ContentMetadata;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 919
    iget-object p2, p0, Lio/branch/indexing/BranchUniversalObject;->localIndexMode_:Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;

    invoke-virtual {p2}, Lio/branch/indexing/BranchUniversalObject$CONTENT_INDEX_MODE;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

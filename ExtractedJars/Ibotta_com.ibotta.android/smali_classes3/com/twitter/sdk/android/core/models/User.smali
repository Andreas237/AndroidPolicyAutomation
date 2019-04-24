.class public Lcom/twitter/sdk/android/core/models/User;
.super Ljava/lang/Object;
.source "User.java"

# interfaces
.implements Lcom/twitter/sdk/android/core/models/Identifiable;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x40b7e7b364d35e06L


# instance fields
.field public final contributorsEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "contributors_enabled"
    .end annotation
.end field

.field public final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field public final defaultProfile:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default_profile"
    .end annotation
.end field

.field public final defaultProfileImage:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default_profile_image"
    .end annotation
.end field

.field public final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field public final email:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "email"
    .end annotation
.end field

.field public final entities:Lcom/twitter/sdk/android/core/models/UserEntities;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "entities"
    .end annotation
.end field

.field public final favouritesCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "favourites_count"
    .end annotation
.end field

.field public final followRequestSent:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "follow_request_sent"
    .end annotation
.end field

.field public final followersCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "followers_count"
    .end annotation
.end field

.field public final friendsCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "friends_count"
    .end annotation
.end field

.field public final geoEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "geo_enabled"
    .end annotation
.end field

.field public final id:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field public final idStr:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id_str"
    .end annotation
.end field

.field public final isTranslator:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_translator"
    .end annotation
.end field

.field public final lang:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lang"
    .end annotation
.end field

.field public final listedCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "listed_count"
    .end annotation
.end field

.field public final location:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "location"
    .end annotation
.end field

.field public final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field public final profileBackgroundColor:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_background_color"
    .end annotation
.end field

.field public final profileBackgroundImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_background_image_url"
    .end annotation
.end field

.field public final profileBackgroundImageUrlHttps:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_background_image_url_https"
    .end annotation
.end field

.field public final profileBackgroundTile:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_background_tile"
    .end annotation
.end field

.field public final profileBannerUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_banner_url"
    .end annotation
.end field

.field public final profileImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_image_url"
    .end annotation
.end field

.field public final profileImageUrlHttps:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_image_url_https"
    .end annotation
.end field

.field public final profileLinkColor:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_link_color"
    .end annotation
.end field

.field public final profileSidebarBorderColor:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_sidebar_border_color"
    .end annotation
.end field

.field public final profileSidebarFillColor:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_sidebar_fill_color"
    .end annotation
.end field

.field public final profileTextColor:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_text_color"
    .end annotation
.end field

.field public final profileUseBackgroundImage:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile_use_background_image"
    .end annotation
.end field

.field public final protectedUser:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "protected"
    .end annotation
.end field

.field public final screenName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screen_name"
    .end annotation
.end field

.field public final showAllInlineMedia:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "show_all_inline_media"
    .end annotation
.end field

.field public final status:Lcom/twitter/sdk/android/core/models/Tweet;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "status"
    .end annotation
.end field

.field public final statusesCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "statuses_count"
    .end annotation
.end field

.field public final timeZone:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_zone"
    .end annotation
.end field

.field public final url:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "url"
    .end annotation
.end field

.field public final utcOffset:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "utc_offset"
    .end annotation
.end field

.field public final verified:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "verified"
    .end annotation
.end field

.field public final withheldInCountries:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "withheld_in_countries"
    .end annotation
.end field

.field public final withheldScope:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "withheld_scope"
    .end annotation
.end field


# virtual methods
.method public getId()J
    .locals 2

    .line 377
    iget-wide v0, p0, Lcom/twitter/sdk/android/core/models/User;->id:J

    return-wide v0
.end method

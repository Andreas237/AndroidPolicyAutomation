.class abstract Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo$Builder;
.super Ljava/lang/Object;
.source "PartnerAppInfo.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "Builder"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract appId(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "app_id"
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;
.end method

.method public abstract name(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation
.end method

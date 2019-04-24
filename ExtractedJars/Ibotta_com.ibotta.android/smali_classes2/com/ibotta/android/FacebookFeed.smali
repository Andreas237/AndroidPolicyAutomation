.class public Lcom/ibotta/android/FacebookFeed;
.super Lcom/ibotta/api/model/offer/Reward$SocialContent;
.source "FacebookFeed.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/model/offer/Reward$SocialContent;-><init>()V

    return-void
.end method


# virtual methods
.method public toShareFeedContent()Lcom/facebook/share/internal/ShareFeedContent;
    .locals 2

    .line 8
    new-instance v0, Lcom/facebook/share/internal/ShareFeedContent$Builder;

    invoke-direct {v0}, Lcom/facebook/share/internal/ShareFeedContent$Builder;-><init>()V

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getLink()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getLink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/ShareFeedContent$Builder;->setLink(Ljava/lang/String;)Lcom/facebook/share/internal/ShareFeedContent$Builder;

    move-result-object v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getPicture()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getPicture()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/ShareFeedContent$Builder;->setPicture(Ljava/lang/String;)Lcom/facebook/share/internal/ShareFeedContent$Builder;

    move-result-object v0

    .line 16
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/ShareFeedContent$Builder;->setLinkName(Ljava/lang/String;)Lcom/facebook/share/internal/ShareFeedContent$Builder;

    move-result-object v0

    .line 19
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getCaption()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getCaption()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/ShareFeedContent$Builder;->setLinkCaption(Ljava/lang/String;)Lcom/facebook/share/internal/ShareFeedContent$Builder;

    move-result-object v0

    .line 22
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/android/FacebookFeed;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/ShareFeedContent$Builder;->setLinkDescription(Ljava/lang/String;)Lcom/facebook/share/internal/ShareFeedContent$Builder;

    move-result-object v0

    .line 26
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/share/internal/ShareFeedContent$Builder;->build()Lcom/facebook/share/internal/ShareFeedContent;

    move-result-object v0

    return-object v0
.end method

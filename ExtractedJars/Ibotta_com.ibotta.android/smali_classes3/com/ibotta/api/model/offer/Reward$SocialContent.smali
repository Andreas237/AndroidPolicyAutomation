.class public Lcom/ibotta/api/model/offer/Reward$SocialContent;
.super Ljava/lang/Object;
.source "Reward.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/offer/Reward;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SocialContent"
.end annotation


# instance fields
.field private caption:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private link:Ljava/lang/String;

.field private message:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private picture:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCaption()Ljava/lang/String;
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->caption:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPicture()Ljava/lang/String;
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->picture:Ljava/lang/String;

    return-object v0
.end method

.method public setCaption(Ljava/lang/String;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->caption:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->description:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->link:Ljava/lang/String;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->message:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setPicture(Ljava/lang/String;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Reward$SocialContent;->picture:Ljava/lang/String;

    return-void
.end method

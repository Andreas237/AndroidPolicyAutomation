.class public Lcom/ibotta/api/model/customer/Customer$InviteMessaging;
.super Ljava/lang/Object;
.source "Customer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/Customer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InviteMessaging"
.end annotation


# instance fields
.field private facebook:Ljava/lang/String;

.field private facebookUrl:Ljava/lang/String;

.field private googlePlus:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "g_plus"
    .end annotation
.end field

.field private instructions:Ljava/lang/String;

.field private longMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "long"
    .end annotation
.end field

.field private shortMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "short"
    .end annotation
.end field

.field private subject:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private twitter:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 511
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFacebook()Ljava/lang/String;
    .locals 1

    .line 566
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->facebook:Ljava/lang/String;

    return-object v0
.end method

.method public getFacebookUrl()Ljava/lang/String;
    .locals 1

    .line 574
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->facebookUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getGooglePlus()Ljava/lang/String;
    .locals 1

    .line 590
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->googlePlus:Ljava/lang/String;

    return-object v0
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    .line 550
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->instructions:Ljava/lang/String;

    return-object v0
.end method

.method public getLongMessage()Ljava/lang/String;
    .locals 1

    .line 534
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->longMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getShortMessage()Ljava/lang/String;
    .locals 1

    .line 526
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->shortMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getSubject()Ljava/lang/String;
    .locals 1

    .line 542
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->subject:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 558
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTwitter()Ljava/lang/String;
    .locals 1

    .line 582
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->twitter:Ljava/lang/String;

    return-object v0
.end method

.method public setFacebook(Ljava/lang/String;)V
    .locals 0

    .line 570
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->facebook:Ljava/lang/String;

    return-void
.end method

.method public setFacebookUrl(Ljava/lang/String;)V
    .locals 0

    .line 578
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->facebookUrl:Ljava/lang/String;

    return-void
.end method

.method public setGooglePlus(Ljava/lang/String;)V
    .locals 0

    .line 594
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->googlePlus:Ljava/lang/String;

    return-void
.end method

.method public setInstructions(Ljava/lang/String;)V
    .locals 0

    .line 554
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->instructions:Ljava/lang/String;

    return-void
.end method

.method public setLongMessage(Ljava/lang/String;)V
    .locals 0

    .line 538
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->longMessage:Ljava/lang/String;

    return-void
.end method

.method public setShortMessage(Ljava/lang/String;)V
    .locals 0

    .line 530
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->shortMessage:Ljava/lang/String;

    return-void
.end method

.method public setSubject(Ljava/lang/String;)V
    .locals 0

    .line 546
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->subject:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 562
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->title:Ljava/lang/String;

    return-void
.end method

.method public setTwitter(Ljava/lang/String;)V
    .locals 0

    .line 586
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteMessaging;->twitter:Ljava/lang/String;

    return-void
.end method

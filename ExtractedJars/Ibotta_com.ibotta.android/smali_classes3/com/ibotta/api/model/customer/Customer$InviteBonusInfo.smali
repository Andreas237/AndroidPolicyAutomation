.class public Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;
.super Ljava/lang/Object;
.source "Customer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/Customer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InviteBonusInfo"
.end annotation


# instance fields
.field private amount:F

.field private bonusId:I

.field private count:I

.field private message:Ljava/lang/String;

.field private promptMessage:Ljava/lang/String;

.field private schedules:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "schedule"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/Customer$Schedule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 598
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 604
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->schedules:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 608
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->amount:F

    return v0
.end method

.method public getBonusId()I
    .locals 1

    .line 640
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->bonusId:I

    return v0
.end method

.method public getCount()I
    .locals 1

    .line 616
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->count:I

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 632
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getPromptMessage()Ljava/lang/String;
    .locals 1

    .line 624
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->promptMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getSchedules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/Customer$Schedule;",
            ">;"
        }
    .end annotation

    .line 648
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->schedules:Ljava/util/List;

    return-object v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 612
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->amount:F

    return-void
.end method

.method public setBonusId(I)V
    .locals 0

    .line 644
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->bonusId:I

    return-void
.end method

.method public setCount(I)V
    .locals 0

    .line 620
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->count:I

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 636
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->message:Ljava/lang/String;

    return-void
.end method

.method public setPromptMessage(Ljava/lang/String;)V
    .locals 0

    .line 628
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->promptMessage:Ljava/lang/String;

    return-void
.end method

.method public setSchedules(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/Customer$Schedule;",
            ">;)V"
        }
    .end annotation

    .line 652
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$InviteBonusInfo;->schedules:Ljava/util/List;

    return-void
.end method

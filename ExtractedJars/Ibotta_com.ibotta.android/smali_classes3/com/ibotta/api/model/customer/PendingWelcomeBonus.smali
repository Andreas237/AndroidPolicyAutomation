.class public Lcom/ibotta/api/model/customer/PendingWelcomeBonus;
.super Ljava/lang/Object;
.source "PendingWelcomeBonus.java"


# instance fields
.field private headline:Ljava/lang/String;

.field private id:I

.field private message:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHeadline()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->headline:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->id:I

    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->message:Ljava/lang/String;

    return-object v0
.end method

.method public setHeadline(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->headline:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->id:I

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->message:Ljava/lang/String;

    return-void
.end method

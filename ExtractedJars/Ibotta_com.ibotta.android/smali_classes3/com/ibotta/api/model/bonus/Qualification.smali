.class public Lcom/ibotta/api/model/bonus/Qualification;
.super Ljava/lang/Object;
.source "Qualification.java"

# interfaces
.implements Lcom/ibotta/api/model/QualificationModel;


# instance fields
.field private completed:Z

.field private count:D

.field private iconUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCompleted()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/ibotta/api/model/bonus/Qualification;->completed:Z

    return v0
.end method

.method public getCount()D
    .locals 2

    .line 32
    iget-wide v0, p0, Lcom/ibotta/api/model/bonus/Qualification;->count:D

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Qualification;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Qualification;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getProgressDescription()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/Qualification;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setCompleted(Z)V
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/ibotta/api/model/bonus/Qualification;->completed:Z

    return-void
.end method

.method public setCount(D)V
    .locals 0

    .line 36
    iput-wide p1, p0, Lcom/ibotta/api/model/bonus/Qualification;->count:D

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Qualification;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/Qualification;->name:Ljava/lang/String;

    return-void
.end method

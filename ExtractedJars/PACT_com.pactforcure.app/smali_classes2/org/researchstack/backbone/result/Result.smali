.class public Lorg/researchstack/backbone/result/Result;
.super Ljava/lang/Object;
.source "Result.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private endDate:Ljava/util/Date;

.field private identifier:Ljava/lang/String;

.field private saveable:Z

.field private startDate:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lorg/researchstack/backbone/result/Result;->identifier:Ljava/lang/String;

    .line 47
    return-void
.end method


# virtual methods
.method public getEndDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lorg/researchstack/backbone/result/Result;->endDate:Ljava/util/Date;

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lorg/researchstack/backbone/result/Result;->identifier:Ljava/lang/String;

    return-object v0
.end method

.method public getStartDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lorg/researchstack/backbone/result/Result;->startDate:Ljava/util/Date;

    return-object v0
.end method

.method public setEndDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "endDate"    # Ljava/util/Date;

    .prologue
    .line 104
    iput-object p1, p0, Lorg/researchstack/backbone/result/Result;->endDate:Ljava/util/Date;

    .line 105
    return-void
.end method

.method public setStartDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "startDate"    # Ljava/util/Date;

    .prologue
    .line 84
    iput-object p1, p0, Lorg/researchstack/backbone/result/Result;->startDate:Ljava/util/Date;

    .line 85
    return-void
.end method

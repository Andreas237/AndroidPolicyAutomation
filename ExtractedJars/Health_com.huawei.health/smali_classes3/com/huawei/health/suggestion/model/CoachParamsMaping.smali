.class public Lcom/huawei/health/suggestion/model/CoachParamsMaping;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/model/CoachParamsMaping$Type;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private adjustValue:I

.field private oldValue:I

.field private type:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->type:I

    .line 24
    iput p2, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->oldValue:I

    .line 25
    iput p3, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->adjustValue:I

    .line 26
    return-void
.end method


# virtual methods
.method public getAdjustValue()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->adjustValue:I

    return v0
.end method

.method public getOldValue()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->oldValue:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->type:I

    return v0
.end method

.method public setAdjustValue(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->adjustValue:I

    .line 50
    return-void
.end method

.method public setOldValue(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->oldValue:I

    .line 42
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/health/suggestion/model/CoachParamsMaping;->type:I

    .line 34
    return-void
.end method

.method public uadpDC1()V
    .locals 0

    .line 54
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 58
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 62
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 66
    return-void
.end method

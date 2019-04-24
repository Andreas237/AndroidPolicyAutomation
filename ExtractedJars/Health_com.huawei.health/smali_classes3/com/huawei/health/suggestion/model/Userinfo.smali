.class public Lcom/huawei/health/suggestion/model/Userinfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private age:I

.field private gender:I

.field private heigth:I

.field private weigth:F


# direct methods
.method public constructor <init>(IIIF)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput p1, p0, Lcom/huawei/health/suggestion/model/Userinfo;->age:I

    .line 19
    iput p2, p0, Lcom/huawei/health/suggestion/model/Userinfo;->gender:I

    .line 20
    iput p3, p0, Lcom/huawei/health/suggestion/model/Userinfo;->heigth:I

    .line 21
    iput p4, p0, Lcom/huawei/health/suggestion/model/Userinfo;->weigth:F

    .line 22
    return-void
.end method


# virtual methods
.method public acquireWeight()F
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/health/suggestion/model/Userinfo;->weigth:F

    return v0
.end method

.method public getAge()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/health/suggestion/model/Userinfo;->age:I

    return v0
.end method

.method public getGender()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/health/suggestion/model/Userinfo;->gender:I

    return v0
.end method

.method public getHeigth()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/health/suggestion/model/Userinfo;->heigth:I

    return v0
.end method

.method public setAge(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/huawei/health/suggestion/model/Userinfo;->age:I

    .line 30
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/huawei/health/suggestion/model/Userinfo;->gender:I

    .line 38
    return-void
.end method

.method public setHeigth(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/huawei/health/suggestion/model/Userinfo;->heigth:I

    .line 46
    return-void
.end method

.method public setWeigth(F)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/health/suggestion/model/Userinfo;->weigth:F

    .line 54
    return-void
.end method

.method public uadpDC1()V
    .locals 0

    .line 58
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 62
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 66
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 70
    return-void
.end method

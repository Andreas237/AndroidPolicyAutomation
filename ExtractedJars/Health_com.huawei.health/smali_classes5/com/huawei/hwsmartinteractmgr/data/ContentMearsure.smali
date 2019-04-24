.class public Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field days:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;->days:I

    .line 17
    return-void
.end method


# virtual methods
.method public getDays()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;->days:I

    return v0
.end method

.method public setDays(I)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;->days:I

    .line 25
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentMearsure{days=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;->days:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

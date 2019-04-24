.class public Lcom/huawei/datatype/DataGMTTime;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private time:J

.field private timeZone:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTime()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/huawei/datatype/DataGMTTime;->time:J

    return-wide v0
.end method

.method public getTimeZone()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/datatype/DataGMTTime;->timeZone:I

    return v0
.end method

.method public setTime(J)V
    .locals 0

    .line 34
    iput-wide p1, p0, Lcom/huawei/datatype/DataGMTTime;->time:J

    .line 35
    return-void
.end method

.method public setTimeZone(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/datatype/DataGMTTime;->timeZone:I

    .line 49
    return-void
.end method

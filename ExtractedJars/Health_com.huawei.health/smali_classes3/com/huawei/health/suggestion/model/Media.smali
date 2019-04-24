.class public Lcom/huawei/health/suggestion/model/Media;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/model/Media$FileType;
    }
.end annotation


# instance fields
.field private downloadLength:J

.field private isFinished:Z

.field private length:J

.field private path:Ljava/lang/String;

.field private type:I

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDownloadLength()J
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Media;->downloadLength:J

    return-wide v0
.end method

.method public getLength()J
    .locals 2

    .line 51
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/Media;->length:J

    return-wide v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Media;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/health/suggestion/model/Media;->type:I

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Media;->url:Ljava/lang/String;

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    .line 59
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/Media;->isFinished:Z

    return v0
.end method

.method public setDownloadLength(J)V
    .locals 0

    .line 71
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Media;->downloadLength:J

    .line 72
    return-void
.end method

.method public setFinished(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/Media;->isFinished:Z

    .line 64
    return-void
.end method

.method public setLength(J)V
    .locals 0

    .line 55
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/Media;->length:J

    .line 56
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Media;->path:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/health/suggestion/model/Media;->type:I

    .line 48
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Media;->url:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public uadpDC1()V
    .locals 0

    .line 76
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 80
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 84
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 88
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 92
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 96
    return-void
.end method

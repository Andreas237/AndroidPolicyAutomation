.class public Lcom/tencent/open/weiyun/WeiyunFile;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/tencent/open/weiyun/WeiyunFile;->a:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lcom/tencent/open/weiyun/WeiyunFile;->b:Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lcom/tencent/open/weiyun/WeiyunFile;->c:Ljava/lang/String;

    .line 12
    iput-wide p4, p0, Lcom/tencent/open/weiyun/WeiyunFile;->d:J

    .line 13
    return-void
.end method


# virtual methods
.method public getCreateTime()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/tencent/open/weiyun/WeiyunFile;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getFileId()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/tencent/open/weiyun/WeiyunFile;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/tencent/open/weiyun/WeiyunFile;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getFileSize()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/tencent/open/weiyun/WeiyunFile;->d:J

    return-wide v0
.end method

.method public setCreateTime(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/tencent/open/weiyun/WeiyunFile;->c:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setFileId(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/tencent/open/weiyun/WeiyunFile;->a:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setFileName(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/tencent/open/weiyun/WeiyunFile;->b:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public setFileSize(J)V
    .locals 0

    .line 44
    iput-wide p1, p0, Lcom/tencent/open/weiyun/WeiyunFile;->d:J

    .line 45
    return-void
.end method

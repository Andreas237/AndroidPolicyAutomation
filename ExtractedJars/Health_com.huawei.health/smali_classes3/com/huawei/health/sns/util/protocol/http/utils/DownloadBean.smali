.class public Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private body:Ljava/lang/String;

.field private cookie:Ljava/lang/String;

.field private filePath:Ljava/lang/String;

.field private imageHeight:I

.field private imageWidth:I

.field private parentPath:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->url:Ljava/lang/String;

    .line 59
    return-void
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->body:Ljava/lang/String;

    .line 70
    return-object v0
.end method

.method public getCookie()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->cookie:Ljava/lang/String;

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->filePath:Ljava/lang/String;

    .line 87
    return-object v0
.end method

.method public getImageHeight()I
    .locals 1

    .line 110
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->imageHeight:I

    .line 111
    return v0
.end method

.method public getImageWidth()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->imageWidth:I

    .line 105
    return v0
.end method

.method public getParentPath()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->parentPath:Ljava/lang/String;

    .line 93
    return-object v0
.end method

.method protected getPostfix()Ljava/lang/String;
    .locals 3

    .line 132
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "?version="

    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "2.0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&userid="

    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    .line 132
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 3

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getPostfix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 64
    return-object v2
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->body:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setCookie(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->cookie:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setImageSize(II)V
    .locals 0

    .line 98
    iput p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->imageWidth:I

    .line 99
    iput p2, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->imageHeight:I

    .line 100
    return-void
.end method

.method public setPaths(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->filePath:Ljava/lang/String;

    .line 81
    iput-object p2, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->parentPath:Ljava/lang/String;

    .line 82
    return-void
.end method

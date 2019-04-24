.class public Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;
.super Lcom/huawei/health/sns/logic/chat/media/MtsRequest;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/upload"

.field private static final FILE_KEY:Ljava/lang/String; = "file"

.field private static final UPLOAD_READ_TIMEOUT:I = 0x7530


# instance fields
.field public mcode_:Ljava/lang/String;

.field public signature_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/sns/logic/chat/media/MtsRequest;-><init>()V

    .line 63
    const-string v0, "/upload"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;->method:Ljava/lang/String;

    .line 64
    const-string v0, "file"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;->fileKey:Ljava/lang/String;

    .line 65
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 70
    new-instance v0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    const-string v0, "UploadMediaRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMcode_()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;->mcode_:Ljava/lang/String;

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 85
    const/16 v0, 0x7530

    return v0
.end method

.method public getSignature_()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;->signature_:Ljava/lang/String;

    return-object v0
.end method

.method public setMcode_(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;->mcode_:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setSignature_(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/base/UploadMediaRequest;->signature_:Ljava/lang/String;

    .line 46
    return-void
.end method

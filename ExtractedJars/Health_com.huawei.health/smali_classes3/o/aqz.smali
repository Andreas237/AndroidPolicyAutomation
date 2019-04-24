.class public Lo/aqz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

.field private e:Lo/bqx;


# direct methods
.method public constructor <init>(Lo/bqx;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aqz;->a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    .line 57
    iput-object p1, p0, Lo/aqz;->e:Lo/bqx;

    .line 58
    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0, p1}, Lo/aqz;->e(Lo/bra;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/aqz;->a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    return-object v0
.end method

.method public d(Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lo/aqz;->a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    .line 38
    return-void
.end method

.method public e(Lo/bra;)Ljava/lang/String;
    .locals 7

    .line 73
    iget-object v0, p0, Lo/aqz;->a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    invoke-virtual {v0}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->getFilePath()Ljava/lang/String;

    move-result-object v2

    .line 74
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-static {v3}, Lo/aqr;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v4

    .line 78
    if-nez v4, :cond_0

    .line 80
    const-string v4, "image/jpeg"

    .line 82
    :cond_0
    iget-object v0, p0, Lo/aqz;->a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->setContentType(Ljava/lang/String;)V

    .line 85
    invoke-static {v3}, Lo/aqr;->b(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    .line 86
    iget-object v0, p0, Lo/aqz;->a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    iput-object v5, v0, Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;->signature_:Ljava/lang/String;

    .line 88
    iget-object v0, p0, Lo/aqz;->e:Lo/bqx;

    iget-object v1, p0, Lo/aqz;->a:Lcom/huawei/health/sns/logic/chat/media/UploadMediaRequest;

    invoke-virtual {v0, v1}, Lo/bqx;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)V

    .line 91
    iget-object v0, p0, Lo/aqz;->e:Lo/bqx;

    invoke-virtual {v0}, Lo/bqx;->c()V

    .line 93
    iget-object v0, p0, Lo/aqz;->e:Lo/bqx;

    invoke-virtual {v0}, Lo/bqx;->b()Ljava/lang/String;

    move-result-object v6

    .line 94
    if-nez v6, :cond_1

    .line 96
    const-string v6, ""

    .line 98
    :cond_1
    return-object v6
.end method

.method public e()Lo/bqx;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/aqz;->e:Lo/bqx;

    return-object v0
.end method

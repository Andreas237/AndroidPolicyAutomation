.class Lo/aum$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aum;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

.field private c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field private d:Z


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    iput-object p1, p0, Lo/aum$a;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 199
    iput-boolean p2, p0, Lo/aum$a;->d:Z

    .line 200
    iput-object p3, p0, Lo/aum$a;->a:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    .line 201
    return-void
.end method

.method static synthetic a(Lo/aum$a;)Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;
    .locals 1

    .line 190
    iget-object v0, p0, Lo/aum$a;->a:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    return-object v0
.end method

.method static synthetic b(Lo/aum$a;)Z
    .locals 1

    .line 190
    iget-boolean v0, p0, Lo/aum$a;->d:Z

    return v0
.end method

.method static synthetic e(Lo/aum$a;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 190
    iget-object v0, p0, Lo/aum$a;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 206
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aum$a$1;

    invoke-direct {v1, p0}, Lo/aum$a$1;-><init>(Lo/aum$a;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 228
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 233
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aum$a$4;

    invoke-direct {v1, p0}, Lo/aum$a$4;-><init>(Lo/aum$a;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 243
    return-void
.end method

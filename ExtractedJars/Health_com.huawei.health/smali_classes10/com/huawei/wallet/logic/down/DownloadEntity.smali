.class public Lcom/huawei/wallet/logic/down/DownloadEntity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private g:J

.field private k:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->k:J

    .line 53
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->g:J

    .line 73
    iput-object p1, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->b:Ljava/lang/String;

    .line 74
    iput-object p2, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->e:Ljava/lang/String;

    .line 76
    iput-wide p3, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->k:J

    .line 77
    iput-wide p5, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->g:J

    .line 78
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->d:Ljava/lang/String;

    .line 154
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(J)V
    .locals 0

    .line 143
    iput-wide p1, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->a:J

    .line 144
    return-void
.end method

.method public d()J
    .locals 2

    .line 158
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->k:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    .line 132
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->a:J

    return-wide v0
.end method

.method public i()J
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadEntity;->g:J

    return-wide v0
.end method

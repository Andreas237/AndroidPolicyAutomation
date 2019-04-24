.class Lo/akj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aiq$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akj;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/akj;


# direct methods
.method constructor <init>(Lo/akj;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lo/akj$1;->c:Lo/akj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/air;)V
    .locals 7

    .line 192
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    .line 194
    const/4 v4, 0x0

    .line 195
    instance-of v0, p1, Lo/aiv;

    if-eqz v0, :cond_0

    .line 196
    move-object v4, p1

    check-cast v4, Lo/aiv;

    .line 197
    const-string v0, "ScanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: response "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/aiv;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 199
    :cond_0
    iget-object v0, p0, Lo/akj$1;->c:Lo/akj;

    invoke-static {v0}, Lo/akj;->c(Lo/akj;)Lo/aia;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/aia;->d(Lo/aiv;)Lo/ajd;

    move-result-object v5

    .line 201
    invoke-virtual {v5}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {v5}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 202
    const-string v0, "ScanManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: device has been registered, deviceId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 203
    invoke-virtual {v5}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",Scan device info is"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    .line 202
    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return-void

    .line 207
    :cond_1
    invoke-virtual {v5}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 208
    return-void

    .line 210
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 211
    iget-object v0, p0, Lo/akj$1;->c:Lo/akj;

    invoke-static {v0}, Lo/akj;->a(Lo/akj;)Lo/afj;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/akj$1;->c:Lo/akj;

    invoke-static {v0}, Lo/akj;->a(Lo/akj;)Lo/afj;

    move-result-object v0

    iget-object v0, v0, Lo/afj;->h:Lo/ace;

    invoke-virtual {v5}, Lo/ajd;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 212
    :cond_3
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    :cond_4
    const-string v0, "ScanManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: infos size "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 215
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 216
    iget-object v0, p0, Lo/akj$1;->c:Lo/akj;

    invoke-static {v0}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 217
    iget-object v0, p0, Lo/akj$1;->c:Lo/akj;

    invoke-static {v0}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    invoke-interface {v0, v6}, Lo/ajn;->onDeviceDiscovered(Ljava/util/List;)V

    .line 220
    :cond_5
    goto :goto_0

    .line 221
    :cond_6
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: response is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 223
    :goto_0
    return-void
.end method

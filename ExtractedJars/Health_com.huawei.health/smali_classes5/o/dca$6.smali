.class Lo/dca$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dca;->b(Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;Lo/dcb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;

.field final synthetic e:Lo/dca;


# direct methods
.method constructor <init>(Lo/dca;Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;)V
    .locals 0

    .line 1157
    iput-object p1, p0, Lo/dca$6;->e:Lo/dca;

    iput-object p2, p0, Lo/dca$6;->b:Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1161
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iget-object v1, p0, Lo/dca$6;->b:Lcom/huawei/hwcommonservice/model/CoreSleepRRDataInfo;

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1162
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x40f9000000000000L    # 102400.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v6, v0

    .line 1163
    const/4 v7, 0x0

    :goto_0
    add-int/lit8 v0, v6, -0x1

    if-ge v7, v0, :cond_0

    .line 1164
    iget-object v0, p0, Lo/dca$6;->e:Lo/dca;

    invoke-static {v0}, Lo/dca;->k(Lo/dca;)Lo/dcb;

    move-result-object v0

    const v1, 0x19000

    mul-int/2addr v1, v7

    add-int/lit8 v2, v7, 0x1

    const v3, 0x19000

    mul-int/2addr v2, v3

    invoke-virtual {v5, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v6, v7, v1}, Lo/dcb;->e(IIILjava/lang/String;)V

    .line 1165
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wangtuo sleep maxcount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ";currentIndex:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ";content:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const v2, 0x19000

    mul-int/2addr v2, v7

    add-int/lit8 v3, v7, 0x1

    const v4, 0x19000

    mul-int/2addr v3, v4

    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1163
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1167
    :cond_0
    iget-object v0, p0, Lo/dca$6;->e:Lo/dca;

    invoke-static {v0}, Lo/dca;->k(Lo/dca;)Lo/dcb;

    move-result-object v0

    add-int/lit8 v1, v6, -0x1

    add-int/lit8 v2, v6, -0x1

    const v3, 0x19000

    mul-int/2addr v2, v3

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v3, v6, v1, v2}, Lo/dcb;->e(IIILjava/lang/String;)V

    .line 1168
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wangtuo sleep maxcount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ";currentIndex:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    add-int/lit8 v2, v6, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ";content:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    add-int/lit8 v2, v6, -0x1

    const v3, 0x19000

    mul-int/2addr v2, v3

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1169
    iget-object v0, p0, Lo/dca$6;->e:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->a(Lo/dca;Lo/dcb;)Lo/dcb;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1172
    goto :goto_1

    .line 1170
    :catch_0
    move-exception v5

    .line 1171
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RemoteException  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    :goto_1
    return-void
.end method

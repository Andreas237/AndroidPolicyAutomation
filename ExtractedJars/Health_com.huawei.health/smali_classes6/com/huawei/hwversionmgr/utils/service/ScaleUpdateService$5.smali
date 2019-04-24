.class Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;
.super Lo/dps;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-direct {p0}, Lo/dps;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 236
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mScaleCheckNewVersionHandler HandlerhandleCheckFailed: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 238
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 239
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mScaleCheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->a(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 243
    :cond_0
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mScaleCheckNewVersionHandler handleAutoCheckFailed() reason = \u5176\u4ed6\u539f\u56e0\u5931\u8d25\uff0c\u672a\u6fc0\u6d3b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    :goto_0
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 249
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 250
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 251
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mScaleCheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 253
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 255
    :cond_2
    const/16 v0, 0x31

    invoke-static {v0, p1}, Lo/dpr;->c(II)V

    .line 257
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->stopSelf()V

    .line 258
    return-void
.end method

.method public d(Lo/dow;)V
    .locals 5

    .line 192
    if-eqz p1, :cond_4

    .line 193
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    iget-object v1, p1, Lo/dow;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    iget-object v1, p1, Lo/dow;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    iget-wide v1, p1, Lo/dow;->h:J

    long-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;I)I

    .line 196
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mBandCheckNewVersionHandler handleManualCheckSuccess: mCheckNewVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    iget v1, p1, Lo/dow;->z:I

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;I)I

    .line 198
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    iget-object v1, p1, Lo/dow;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    iget-object v1, p1, Lo/dow;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 202
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->a(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 207
    :cond_0
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 209
    :goto_0
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandCheckNewVersion success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 213
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 216
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->a(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 218
    :cond_2
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpl;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 220
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->h(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->f(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)I

    move-result v3

    const/16 v4, 0x32

    invoke-static {v4, v0, v1, v2, v3}, Lo/dpr;->e(IILjava/lang/String;Ljava/lang/String;I)V

    .line 222
    :cond_3
    const-string v0, "Scale_ScaleUpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mScaleCheckNewVersionHandler handleManualCheckSuccess() NAME="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", DESCRIPTION="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", CREATETIME="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", BYTESIZE="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p1, Lo/dow;->h:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", VERSION_NAME="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", VERSION_CODE="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/dow;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService$5;->b:Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/ScaleUpdateService;)V

    .line 231
    :cond_4
    return-void
.end method

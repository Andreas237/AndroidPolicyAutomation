.class Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;
.super Lo/dps;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;


# direct methods
.method constructor <init>(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-direct {p0}, Lo/dps;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 138
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAw70CheckNewVersionHandler HandlerhandleCheckFailed: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    .line 139
    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 138
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 141
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 142
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAw70CheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 145
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->e(Ljava/lang/Boolean;)V

    .line 146
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->c(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 149
    :cond_0
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAw70CheckNewVersionHandler handleAutoCheckFailed() reason = \u5176\u4ed6\u539f\u56e0\u5931\u8d25\uff0c\u672a\u6fc0\u6d3b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 156
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 157
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAw70CheckNewVersionHandler handleAutoCheckFailed() reason = FAILED_REASON_NOTFOUND"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 160
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 161
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->e(Ljava/lang/Boolean;)V

    .line 163
    :cond_2
    const/16 v0, 0xb

    invoke-static {v0, p1}, Lo/dpr;->c(II)V

    .line 165
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-virtual {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->stopSelf()V

    .line 166
    return-void
.end method

.method public d(Lo/dow;)V
    .locals 5

    .line 170
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAw70CheckNewVersionHandler handleManualCheckSuccess: arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mCheck = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    .line 171
    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 170
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    if-eqz p1, :cond_4

    .line 173
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    iget-object v1, p1, Lo/dow;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    iget-object v1, p1, Lo/dow;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    iget-wide v1, p1, Lo/dow;->h:J

    long-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;I)I

    .line 176
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    iget-object v1, p1, Lo/dow;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAw70CheckNewVersionHandler handleManualCheckSuccess: mCheckNewVersionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    .line 178
    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->e(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mForcedUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 177
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 180
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->b(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 185
    :cond_0
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 187
    :goto_0
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandCheckNewVersion success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->a(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 191
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->b(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->b(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 196
    :cond_2
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v1}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->d(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dpg;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 198
    :goto_1
    iget-wide v0, p1, Lo/dow;->h:J

    long-to-int v0, v0

    iget-object v1, p1, Lo/dow;->l:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    .line 199
    invoke-static {v2}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->c(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v3}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->g(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)I

    move-result v3

    .line 198
    const/16 v4, 0xc

    invoke-static {v4, v0, v1, v2, v3}, Lo/dpr;->e(IILjava/lang/String;Ljava/lang/String;I)V

    .line 201
    :cond_3
    const-string v0, "AW70_Aw70UpdateService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAw70CheckNewVersionHandler handleManualCheckSuccess() NAME="

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

    .line 204
    iget-object v0, p0, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService$5;->d:Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;

    invoke-static {v0}, Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;->i(Lcom/huawei/hwversionmgr/utils/service/Aw70UpdateService;)V

    .line 206
    :cond_4
    return-void
.end method

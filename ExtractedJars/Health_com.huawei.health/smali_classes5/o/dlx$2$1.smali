.class Lo/dlx$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlx$2;->c(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlx$2;


# direct methods
.method constructor <init>(Lo/dlx$2;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lo/dlx$2$1;->a:Lo/dlx$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 199
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodsgDeviceDialog getCommodityInfoFromCloud  err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    if-nez p1, :cond_0

    .line 201
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodsgDeviceDialog getCommodityInfoFromCloud list != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodsgDeviceDialog getCommodityInfoFromCloud objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lo/dlx$2$1;->a:Lo/dlx$2;

    iget-object v0, v0, Lo/dlx$2;->b:Lo/dlx;

    iget-object v0, v0, Lo/dlx;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodsg_suggest_time"

    .line 206
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 204
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 207
    iget-object v0, p0, Lo/dlx$2$1;->a:Lo/dlx$2;

    iget-object v0, v0, Lo/dlx$2;->b:Lo/dlx;

    iget-object v0, v0, Lo/dlx;->b:Landroid/content/Context;

    const-string v1, "health_bloodsg_suggest_times"

    invoke-static {v0, v1}, Lo/dmn;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lo/dlx$2$1;->a:Lo/dlx$2;

    iget-object v0, v0, Lo/dlx$2;->d:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 211
    :cond_0
    iget-object v0, p0, Lo/dlx$2$1;->a:Lo/dlx$2;

    iget-object v0, v0, Lo/dlx$2;->d:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 213
    :goto_0
    return-void
.end method

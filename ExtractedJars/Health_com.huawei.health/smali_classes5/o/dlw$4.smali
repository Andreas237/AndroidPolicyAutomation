.class Lo/dlw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlw;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlw;


# direct methods
.method constructor <init>(Lo/dlw;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lo/dlw$4;->d:Lo/dlw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 331
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo, errorStatus =="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 6

    .line 298
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 299
    const-string v0, "userInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 300
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dmn;->c(Ljava/lang/String;)I

    move-result v5

    .line 301
    const/16 v0, 0x12

    if-lt v5, v0, :cond_0

    const/16 v0, 0x3c

    if-gt v5, v0, :cond_0

    .line 302
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    const-string v1, "W009"

    invoke-static {}, Lo/dlw;->f()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dlw$4$1;

    invoke-direct {v3, p0}, Lo/dlw$4$1;-><init>(Lo/dlw$4;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/brt;->e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    goto :goto_0

    .line 323
    :cond_0
    iget-object v0, p0, Lo/dlw$4;->d:Lo/dlw;

    iget-object v0, v0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2712

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 327
    :cond_1
    :goto_0
    return-void
.end method

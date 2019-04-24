.class Lo/dkw$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkw;->k(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dkw;

.field final synthetic e:[I


# direct methods
.method constructor <init>(Lo/dkw;[I)V
    .locals 0

    .line 1649
    iput-object p1, p0, Lo/dkw$7;->a:Lo/dkw;

    iput-object p2, p0, Lo/dkw$7;->e:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 1652
    iget-object v0, p0, Lo/dkw$7;->a:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 1653
    iget-object v0, p0, Lo/dkw$7;->a:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$7;->e:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lo/dkw$7;->a:Lo/dkw;

    iget-object v3, p0, Lo/dkw$7;->e:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    invoke-static {v2, v3}, Lo/dkw;->c(Lo/dkw;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1654
    return-void
.end method

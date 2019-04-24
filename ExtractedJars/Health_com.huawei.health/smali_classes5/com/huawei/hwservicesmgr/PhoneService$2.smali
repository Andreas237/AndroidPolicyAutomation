.class Lcom/huawei/hwservicesmgr/PhoneService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/PhoneService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwservicesmgr/PhoneService;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$2;->c:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 362
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$2;->c:Lcom/huawei/hwservicesmgr/PhoneService;

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_SYNCHRONIZING_DATA_FLAG"

    const-string v3, "false"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 364
    return-void
.end method

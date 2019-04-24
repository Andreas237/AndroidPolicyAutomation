.class Lo/cnq$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->a(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/clk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:I

.field final synthetic c:Lo/clk;

.field final synthetic d:Lcom/huawei/hihealth/HiDeviceInfo;

.field final synthetic e:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;ILo/clk;)V
    .locals 0

    .line 944
    iput-object p1, p0, Lo/cnq$12;->e:Lo/cnq;

    iput-object p2, p0, Lo/cnq$12;->d:Lcom/huawei/hihealth/HiDeviceInfo;

    iput-object p3, p0, Lo/cnq$12;->a:Ljava/util/List;

    iput p4, p0, Lo/cnq$12;->b:I

    iput-object p5, p0, Lo/cnq$12;->c:Lo/clk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 947
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClient() deviceInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$12;->d:Lcom/huawei/hihealth/HiDeviceInfo;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",supportedList = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$12;->a:Ljava/util/List;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " appId is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/cnq$12;->b:I

    .line 948
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 947
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 949
    iget-object v0, p0, Lo/cnq$12;->e:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$12;->d:Lcom/huawei/hihealth/HiDeviceInfo;

    iget v2, p0, Lo/cnq$12;->b:I

    invoke-virtual {v0, v1, v2}, Lo/crb;->c(Lcom/huawei/hihealth/HiDeviceInfo;I)Lcom/huawei/hihealth/HiHealthClient;

    move-result-object v4

    .line 950
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClient() client = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 951
    iget-object v0, p0, Lo/cnq$12;->c:Lo/clk;

    invoke-static {v0, v4}, Lo/cnn;->b(Lo/clk;Lcom/huawei/hihealth/HiHealthClient;)V

    .line 952
    return-void
.end method

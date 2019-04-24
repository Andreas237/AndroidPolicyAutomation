.class Lo/cnq$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->b(Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;Ljava/util/List;Lo/clk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clk;

.field final synthetic b:Lcom/huawei/hihealth/HiUserInfo;

.field final synthetic c:Lcom/huawei/hihealth/HiDeviceInfo;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:I

.field final synthetic g:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;Ljava/util/List;ILo/clk;)V
    .locals 0

    .line 972
    iput-object p1, p0, Lo/cnq$15;->g:Lo/cnq;

    iput-object p2, p0, Lo/cnq$15;->c:Lcom/huawei/hihealth/HiDeviceInfo;

    iput-object p3, p0, Lo/cnq$15;->b:Lcom/huawei/hihealth/HiUserInfo;

    iput-object p4, p0, Lo/cnq$15;->d:Ljava/util/List;

    iput p5, p0, Lo/cnq$15;->e:I

    iput-object p6, p0, Lo/cnq$15;->a:Lo/clk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 975
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClientWithUserInfo() deviceInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$15;->c:Lcom/huawei/hihealth/HiDeviceInfo;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", userid = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$15;->b:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",supportedList = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$15;->d:Ljava/util/List;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    iget-object v0, p0, Lo/cnq$15;->g:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$15;->c:Lcom/huawei/hihealth/HiDeviceInfo;

    iget-object v2, p0, Lo/cnq$15;->b:Lcom/huawei/hihealth/HiUserInfo;

    iget v3, p0, Lo/cnq$15;->e:I

    .line 978
    invoke-virtual {v0, v1, v2, v3}, Lo/crb;->d(Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;I)Lcom/huawei/hihealth/HiHealthClient;

    move-result-object v4

    .line 979
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClientWithUserInfo() client = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 980
    iget-object v0, p0, Lo/cnq$15;->a:Lo/clk;

    invoke-static {v0, v4}, Lo/cnn;->b(Lo/clk;Lcom/huawei/hihealth/HiHealthClient;)V

    .line 981
    return-void
.end method

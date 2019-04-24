.class Lo/dgx$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgx;->e(Landroid/content/Context;Lcom/huawei/hihealth/data/model/HiStressMetaData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dgx;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lcom/huawei/hihealth/data/model/HiStressMetaData;


# direct methods
.method constructor <init>(Lo/dgx;Lcom/huawei/hihealth/data/model/HiStressMetaData;Landroid/content/Context;)V
    .locals 0

    .line 614
    iput-object p1, p0, Lo/dgx$5;->c:Lo/dgx;

    iput-object p2, p0, Lo/dgx$5;->e:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    iput-object p3, p0, Lo/dgx$5;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 617
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 618
    const-string v0, "custom.pressure_adjust_userinfo"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 619
    iget-object v0, p0, Lo/dgx$5;->e:Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 620
    const-string v0, "PressureMeasureModelInterator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressValues = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 622
    iget-object v0, p0, Lo/dgx$5;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 623
    return-void
.end method

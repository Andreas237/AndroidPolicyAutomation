.class Lo/fhe$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhe;->c(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Lo/fhe;


# direct methods
.method constructor <init>(Lo/fhe;Ljava/lang/String;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/fhe$2;->d:Lo/fhe;

    iput-object p2, p0, Lo/fhe$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 150
    new-instance v2, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 151
    const-string v0, "custom.onboarding_concern_status"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lo/fhe$2;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lo/fhe$2;->d:Lo/fhe;

    invoke-static {v0}, Lo/fhe;->a(Lo/fhe;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v2}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 154
    new-instance v3, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 155
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 156
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 157
    const/16 v0, 0x2712

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 158
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 159
    iget-object v0, p0, Lo/fhe$2;->d:Lo/fhe;

    invoke-static {v0}, Lo/fhe;->a(Lo/fhe;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 160
    return-void
.end method

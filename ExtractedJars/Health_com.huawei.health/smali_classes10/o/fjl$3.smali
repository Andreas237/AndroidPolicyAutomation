.class Lo/fjl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjl;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fjl;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/fjl;Ljava/lang/String;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/fjl$3;->c:Lo/fjl;

    iput-object p2, p0, Lo/fjl$3;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 118
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 119
    const-string v0, "custom.market_comment_time"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lo/fjl$3;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lo/fjl$3;->c:Lo/fjl;

    invoke-static {v0}, Lo/fjl;->b(Lo/fjl;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 122
    new-instance v5, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 123
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 124
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 125
    const/16 v0, 0x2712

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 126
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 127
    iget-object v0, p0, Lo/fjl$3;->c:Lo/fjl;

    invoke-static {v0}, Lo/fjl;->b(Lo/fjl;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 128
    const-string v0, "MarketCommentMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MarketCommentCloud_up_to_cloud time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fjl$3;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void
.end method

.class Lo/clq$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->d(ILcom/huawei/hihealth/HiTimeInterval;Lo/cmc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clq;

.field final synthetic b:I

.field final synthetic d:Lcom/huawei/hihealth/HiTimeInterval;

.field final synthetic e:Lo/cmc;


# direct methods
.method constructor <init>(Lo/clq;ILcom/huawei/hihealth/HiTimeInterval;Lo/cmc;)V
    .locals 0

    .line 966
    iput-object p1, p0, Lo/clq$13;->a:Lo/clq;

    iput p2, p0, Lo/clq$13;->b:I

    iput-object p3, p0, Lo/clq$13;->d:Lcom/huawei/hihealth/HiTimeInterval;

    iput-object p4, p0, Lo/clq$13;->e:Lo/cmc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 969
    iget-object v0, p0, Lo/clq$13;->a:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 971
    :try_start_0
    iget-object v0, p0, Lo/clq$13;->a:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget v1, p0, Lo/clq$13;->b:I

    iget-object v2, p0, Lo/clq$13;->d:Lcom/huawei/hihealth/HiTimeInterval;

    new-instance v3, Lo/clq$13$2;

    invoke-direct {v3, p0}, Lo/clq$13$2;-><init>(Lo/clq$13;)V

    invoke-interface {v0, v1, v2, v3}, Lo/clg;->d(ILcom/huawei/hihealth/HiTimeInterval;Lo/cli;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 982
    goto :goto_0

    .line 978
    :catch_0
    move-exception v4

    .line 979
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDataSourceByType e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 980
    iget-object v0, p0, Lo/clq$13;->e:Lo/cmc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 981
    iget-object v0, p0, Lo/clq$13;->e:Lo/cmc;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmc;->a(Ljava/util/List;)V

    .line 983
    :cond_0
    :goto_0
    return-void
.end method

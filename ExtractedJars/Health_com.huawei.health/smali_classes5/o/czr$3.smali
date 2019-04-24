.class Lo/czr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czr;->e(Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lo/czq;

.field final synthetic e:Ljava/util/Map;

.field final synthetic g:Lo/cyy;

.field final synthetic i:Lo/czr;


# direct methods
.method constructor <init>(Lo/czr;Lo/czq;Ljava/lang/String;Ljava/util/Map;IILo/cyy;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/czr$3;->i:Lo/czr;

    iput-object p2, p0, Lo/czr$3;->d:Lo/czq;

    iput-object p3, p0, Lo/czr$3;->a:Ljava/lang/String;

    iput-object p4, p0, Lo/czr$3;->e:Ljava/util/Map;

    iput p5, p0, Lo/czr$3;->c:I

    iput p6, p0, Lo/czr$3;->b:I

    iput-object p7, p0, Lo/czr$3;->g:Lo/cyy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 95
    :try_start_0
    iget-object v0, p0, Lo/czr$3;->d:Lo/czq;

    iget-object v1, p0, Lo/czr$3;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/czr$3;->e:Ljava/util/Map;

    iget v3, p0, Lo/czr$3;->c:I

    iget v4, p0, Lo/czr$3;->b:I

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/czq;->c(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;

    move-result-object v6

    .line 96
    if-eqz v6, :cond_0

    .line 97
    move-object v7, v6

    .line 98
    const-string v0, "\"devId\":\".*?\""

    const-string v1, "\"devId\";\"***\""

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 99
    const-string v0, "\"psk\":\".*?\""

    const-string v1, "\"psk\";\"***\""

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 100
    const-string v0, "\"verifyCode\":\".*?\""

    const-string v1, "\"verifyCode\";\"***\""

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 101
    const-string v0, "HWDataRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " wifiCall(),text = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_0
    iget-object v0, p0, Lo/czr$3;->g:Lo/cyy;

    invoke-interface {v0, v6}, Lo/cyy;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/up/utils/NSPException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_0

    .line 104
    :catch_0
    move-exception v6

    .line 105
    const-string v0, "HWDataRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NSPException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/up/utils/NSPException;->getCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/up/utils/NSPException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lo/czr$3;->g:Lo/cyy;

    invoke-virtual {v6}, Lcom/huawei/up/utils/NSPException;->getCode()I

    move-result v1

    invoke-interface {v0, v1, v6}, Lo/cyy;->c(ILjava/lang/Exception;)V

    .line 108
    :goto_0
    return-void
.end method

.class final Lo/anz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/anz;->c(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aog;


# direct methods
.method constructor <init>(Lo/aog;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/anz$1;->a:Lo/aog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 69
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_2

    .line 72
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 74
    :try_start_0
    const-class v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    .line 75
    if-eqz v4, :cond_0

    const-string v0, "0"

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getResultCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/anz$1;->a:Lo/aog;

    invoke-interface {v0, v4}, Lo/aog;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lo/anz$1;->a:Lo/aog;

    invoke-interface {v0, p1, p2}, Lo/aog;->d(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :goto_0
    goto :goto_1

    .line 80
    :catch_0
    move-exception v4

    .line 81
    const-string v0, "Group_HWHealthCloudRequest"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    goto :goto_1

    .line 84
    :cond_1
    iget-object v0, p0, Lo/anz$1;->a:Lo/aog;

    invoke-interface {v0, p1, p2}, Lo/aog;->d(ILjava/lang/String;)V

    goto :goto_1

    .line 87
    :cond_2
    iget-object v0, p0, Lo/anz$1;->a:Lo/aog;

    invoke-interface {v0, p1, p2}, Lo/aog;->d(ILjava/lang/String;)V

    .line 89
    :goto_1
    return-void
.end method

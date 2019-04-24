.class Lo/eob$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lo/eaa;

.field final synthetic e:Lo/eob;


# direct methods
.method constructor <init>(Lo/eob;Lo/eaa;I)V
    .locals 0

    .line 715
    iput-object p1, p0, Lo/eob$6;->e:Lo/eob;

    iput-object p2, p0, Lo/eob$6;->c:Lo/eaa;

    iput p3, p0, Lo/eob$6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 718
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 719
    const/4 v4, 0x0

    .line 722
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 725
    goto :goto_0

    .line 723
    :catch_0
    move-exception v5

    .line 724
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassCastException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    :goto_0
    iget-object v0, p0, Lo/eob$6;->e:Lo/eob;

    invoke-static {v0, v4}, Lo/eob;->a(Lo/eob;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 727
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "has message donot makeMessage, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    return-void

    .line 731
    :cond_0
    iget-object v0, p0, Lo/eob$6;->c:Lo/eaa;

    const-string v1, "device"

    const-string v2, "device_ota"

    new-instance v3, Lo/eob$6$3;

    invoke-direct {v3, p0}, Lo/eob$6$3;-><init>(Lo/eob$6;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/eaa;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 780
    :cond_1
    return-void
.end method

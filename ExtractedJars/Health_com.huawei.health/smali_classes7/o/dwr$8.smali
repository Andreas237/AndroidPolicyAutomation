.class Lo/dwr$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->e(Lo/dvu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dwr;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dwr;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1034
    iput-object p1, p0, Lo/dwr$8;->a:Lo/dwr;

    iput p2, p0, Lo/dwr$8;->c:I

    iput p3, p0, Lo/dwr$8;->e:I

    iput-object p4, p0, Lo/dwr$8;->b:Ljava/lang/String;

    iput-object p5, p0, Lo/dwr$8;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 7

    .line 1037
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1038
    return-void

    .line 1040
    :cond_0
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestSportData():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1042
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/List;

    .line 1043
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 1044
    const/4 v6, -0x1

    .line 1045
    iget v0, p0, Lo/dwr$8;->c:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 1046
    const-string v0, "step_sum"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    goto :goto_0

    .line 1048
    :cond_1
    iget v0, p0, Lo/dwr$8;->c:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 1049
    const-string v0, "calories_sum"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 1051
    :cond_2
    :goto_0
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestSportData() dataInfos value:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "medalUnit="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dwr$8;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1052
    iget v0, p0, Lo/dwr$8;->e:I

    if-lt v6, v0, :cond_3

    .line 1053
    iget-object v0, p0, Lo/dwr$8;->a:Lo/dwr;

    iget-object v1, p0, Lo/dwr$8;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/dwr$8;->d:Ljava/lang/String;

    iget v3, p0, Lo/dwr$8;->e:I

    invoke-virtual {v0, v1, v2, v3}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1057
    :cond_3
    goto :goto_1

    .line 1055
    :catch_0
    move-exception v4

    .line 1056
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    const-string v1, "requestSportData data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1058
    :goto_1
    return-void
.end method

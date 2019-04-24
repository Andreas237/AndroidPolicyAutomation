.class Lo/dwr$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->b(JJILo/dvu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lo/dwr;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dwr;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1084
    iput-object p1, p0, Lo/dwr$6;->d:Lo/dwr;

    iput p2, p0, Lo/dwr$6;->e:I

    iput p3, p0, Lo/dwr$6;->c:I

    iput-object p4, p0, Lo/dwr$6;->b:Ljava/lang/String;

    iput-object p5, p0, Lo/dwr$6;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 7

    .line 1087
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1088
    return-void

    .line 1091
    :cond_0
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/List;

    .line 1092
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 1093
    const/4 v6, -0x1

    .line 1094
    iget v0, p0, Lo/dwr$6;->e:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    .line 1095
    const-string v0, "Track_Run_Distance_Sum"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    goto :goto_0

    .line 1096
    :cond_1
    iget v0, p0, Lo/dwr$6;->e:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    .line 1097
    const-string v0, "Track_Ride_Distance_Sum"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    goto :goto_0

    .line 1098
    :cond_2
    iget v0, p0, Lo/dwr$6;->e:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 1099
    const-string v0, "Track_Walk_Distance_Sum"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 1101
    :cond_3
    :goto_0
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestSportData():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1102
    iget v0, p0, Lo/dwr$6;->c:I

    mul-int/lit16 v0, v0, 0x3e8

    if-lt v6, v0, :cond_4

    .line 1103
    iget-object v0, p0, Lo/dwr$6;->d:Lo/dwr;

    iget-object v1, p0, Lo/dwr$6;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/dwr$6;->a:Ljava/lang/String;

    iget v3, p0, Lo/dwr$6;->c:I

    invoke-virtual {v0, v1, v2, v3}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1108
    :cond_4
    goto :goto_1

    .line 1106
    :catch_0
    move-exception v4

    .line 1107
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    const-string v1, "requestSportData data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1109
    :goto_1
    return-void
.end method

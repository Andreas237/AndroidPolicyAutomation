.class Lo/cwf$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwf;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwf;


# direct methods
.method constructor <init>(Lo/cwf;)V
    .locals 0

    .line 1129
    iput-object p1, p0, Lo/cwf$8;->a:Lo/cwf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 1132
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 1133
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1134
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() smartAlarmInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1135
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1137
    :cond_0
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoSendCommend() smartAlarmInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1138
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1139
    new-instance v5, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 1140
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1142
    :cond_1
    iget-object v0, p0, Lo/cwf$8;->a:Lo/cwf;

    iget-object v1, p0, Lo/cwf$8;->a:Lo/cwf;

    iget-object v1, v1, Lo/cwf;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Lo/cwf;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1143
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() setSmartAlarm finish."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1144
    return-void
.end method

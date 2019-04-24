.class Lo/btc$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btc;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/btc;


# direct methods
.method constructor <init>(Lo/btc;Landroid/os/Looper;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/btc$3;->c:Lo/btc;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 100
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 101
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 103
    :sswitch_0
    invoke-static {}, Lo/btc;->b()I

    move-result v0

    iget-object v1, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v1}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 104
    iget-object v0, p0, Lo/btc$3;->c:Lo/btc;

    iget-object v1, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v1}, Lo/btc;->a(Lo/btc;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v2}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Lo/btc;->b()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getDate()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/btc;->a(Lo/btc;Ljava/lang/String;I)Z

    .line 106
    :cond_0
    invoke-static {}, Lo/btc;->c()I

    .line 107
    invoke-static {}, Lo/btc;->b()I

    move-result v0

    iget-object v1, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v1}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 108
    const-string v0, "DayTotalRecordDao"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_SUCCESS index:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/btc;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " time:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v2}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Lo/btc;->b()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getDate()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lo/btc$3;->c:Lo/btc;

    iget-object v1, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v1}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lo/btc;->b()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getTimeStamp()J

    move-result-wide v1

    iget-object v3, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v3}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v3

    invoke-static {}, Lo/btc;->b()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getTotalCalorie()F

    move-result v3

    iget-object v4, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v4}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v4

    invoke-static {}, Lo/btc;->b()I

    move-result v5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getTotalDuration()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/btc;->a(Lo/btc;JFI)V

    goto/16 :goto_1

    .line 111
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lo/btc;->c(I)I

    .line 112
    const-string v0, "DayTotalRecordDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_SUCCESS index = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    goto/16 :goto_1

    .line 116
    :sswitch_1
    invoke-static {}, Lo/btc;->c()I

    .line 117
    invoke-static {}, Lo/btc;->b()I

    move-result v0

    iget-object v1, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v1}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 118
    const-string v0, "DayTotalRecordDao"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_FAIL index:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/btc;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " time:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v2}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Lo/btc;->b()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getDate()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lo/btc$3;->c:Lo/btc;

    iget-object v1, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v1}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lo/btc;->b()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getTimeStamp()J

    move-result-wide v1

    iget-object v3, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v3}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v3

    invoke-static {}, Lo/btc;->b()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getTotalCalorie()F

    move-result v3

    iget-object v4, p0, Lo/btc$3;->c:Lo/btc;

    invoke-static {v4}, Lo/btc;->b(Lo/btc;)Ljava/util/List;

    move-result-object v4

    invoke-static {}, Lo/btc;->b()I

    move-result v5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/DayTotalRecord;->getTotalDuration()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/btc;->a(Lo/btc;JFI)V

    goto :goto_1

    .line 121
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lo/btc;->c(I)I

    .line 122
    const-string v0, "DayTotalRecordDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_FAIL index = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    goto :goto_1

    .line 126
    :goto_0
    const-string v0, "DayTotalRecordDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage default!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.class public Lo/fbr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbr$e;
    }
.end annotation


# instance fields
.field private c:J

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;
    .locals 4

    .line 29
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 30
    iget-wide v0, p0, Lo/fbr;->d:J

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 31
    iget-wide v0, p0, Lo/fbr;->c:J

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 33
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 36
    const-string v0, "_DETAIL"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    const/4 v3, 0x0

    goto/16 :goto_2

    .line 39
    :cond_0
    sget-object v0, Lo/fbr$e;->e:Lo/fbr$e;

    if-ne p1, v0, :cond_1

    .line 40
    const/4 v3, 0x0

    goto/16 :goto_2

    .line 41
    :cond_1
    sget-object v0, Lo/fbr$e;->d:Lo/fbr$e;

    if-ne p1, v0, :cond_2

    .line 42
    const/4 v3, 0x3

    goto/16 :goto_2

    .line 43
    :cond_2
    sget-object v0, Lo/fbr$e;->c:Lo/fbr$e;

    if-ne p1, v0, :cond_3

    .line 44
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "userViewSelf not support when building HiAggregateOption:week"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_3
    sget-object v0, Lo/fbr$e;->b:Lo/fbr$e;

    if-ne p1, v0, :cond_8

    .line 47
    const-string v0, "HR_NORMAL_MAX"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "HR_WARNING_MAX"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 48
    :cond_4
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    goto :goto_0

    .line 49
    :cond_5
    const-string v0, "HR_NORMAL_MIN"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "HR_WARNING_MIN"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 50
    :cond_6
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 53
    :cond_7
    :goto_0
    const/4 v3, 0x5

    goto :goto_2

    .line 54
    :cond_8
    sget-object v0, Lo/fbr$e;->a:Lo/fbr$e;

    if-ne p1, v0, :cond_d

    .line 56
    const-string v0, "HR_NORMAL_MAX"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "HR_WARNING_MAX"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 57
    :cond_9
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    goto :goto_1

    .line 58
    :cond_a
    const-string v0, "HR_NORMAL_MIN"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "HR_WARNING_MIN"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 59
    :cond_b
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 62
    :cond_c
    :goto_1
    const/4 v3, 0x6

    goto :goto_2

    .line 63
    :cond_d
    sget-object v0, Lo/fbr$e;->i:Lo/fbr$e;

    if-ne p1, v0, :cond_e

    .line 64
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "userViewSelf not support when building HiAggregateOption:ALL"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_e
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "userViewSelf not support when building HiAggregateOption"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :goto_2
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 70
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p3, v0, v1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 72
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 73
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 75
    return-object v2
.end method

.method public e(JJ)Lo/fbr;
    .locals 0

    .line 22
    iput-wide p1, p0, Lo/fbr;->d:J

    .line 23
    iput-wide p3, p0, Lo/fbr;->c:J

    .line 24
    return-object p0
.end method

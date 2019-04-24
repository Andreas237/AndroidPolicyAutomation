.class Lo/dlr$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    iput p1, p0, Lo/dlr$a;->b:I

    .line 231
    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 234
    move-object v4, p1

    check-cast v4, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 235
    move-object v5, p2

    check-cast v5, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 236
    iget v0, p0, Lo/dlr$a;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 238
    :pswitch_0
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 239
    const/4 v0, 0x1

    return v0

    .line 241
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 244
    :pswitch_1
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getPriority()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getPriority()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    .line 246
    :pswitch_2
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    .line 248
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

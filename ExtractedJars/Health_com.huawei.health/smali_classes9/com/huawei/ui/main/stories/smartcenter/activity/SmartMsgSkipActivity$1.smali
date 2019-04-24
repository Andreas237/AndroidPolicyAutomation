.class Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(IILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity$1;->e:Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 213
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 214
    move-object v4, p2

    check-cast v4, Lo/dgu$e;

    .line 215
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, v4, Lo/dgu$e;->d:Ljava/lang/String;

    iget-object v2, v4, Lo/dgu$e;->c:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v1, v2}, Lo/cbl;->d(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 216
    goto :goto_0

    .line 217
    :cond_0
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND Not return valid data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    :goto_0
    return-void
.end method

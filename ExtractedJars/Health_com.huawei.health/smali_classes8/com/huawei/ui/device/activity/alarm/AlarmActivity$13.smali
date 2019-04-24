.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 298
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 300
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v1

    invoke-virtual {v1, p2}, Lo/enz;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;

    .line 302
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "eventAlarmList ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 306
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/datatype/EventAlarmInfo;

    .line 308
    invoke-virtual {v9}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_prompt:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmName(Ljava/lang/String;)V

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    new-instance v10, Lo/eoo;

    invoke-direct {v10}, Lo/eoo;-><init>()V

    .line 313
    move-object v0, v10

    move-object v1, v10

    move-object v2, v9

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enx;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v4}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v5}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v5

    move v6, v8

    invoke-virtual/range {v0 .. v6}, Lo/eoo;->e(Lo/eoo;Lcom/huawei/datatype/EventAlarmInfo;Lo/enx;Landroid/content/Context;Ljava/util/List;I)Lo/eoo;

    move-result-object v10

    .line 314
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 306
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 316
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enz;->d(Ljava/util/List;)V

    .line 319
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mListItem ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mListItem ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   mListItem=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lo/eol;)Lo/eol;

    .line 323
    const/16 v0, 0x66

    iput v0, v8, Landroid/os/Message;->what:I

    .line 324
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 325
    const/4 v0, 0x0

    iput v0, v8, Landroid/os/Message;->arg1:I

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 327
    return-void
.end method

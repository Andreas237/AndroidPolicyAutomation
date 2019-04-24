.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/alarm/AlarmActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 1

    .line 138
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 139
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->e:Ljava/lang/ref/WeakReference;

    .line 140
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 143
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    .line 145
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 146
    return-void

    .line 148
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 150
    :pswitch_0
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_UPDATE_SMART_ALARM_UI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 152
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "alarm---------------msg.arg1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d$1;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;)V

    invoke-virtual {v0, v5, v1}, Lo/dqi;->a(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 162
    goto/16 :goto_4

    .line 164
    :pswitch_1
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESSAGE_UPDATE_EVENT_ALARM_UI mAlarmListAdapter = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mEventAlarmItemList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 171
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 174
    :goto_0
    const/4 v7, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-lt v1, v0, :cond_3

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 179
    :cond_4
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mAlarmListAdapter = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mEventAlarmItemList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

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

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eol;->b(Ljava/util/List;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v0

    invoke-virtual {v0}, Lo/eol;->notifyDataSetChanged()V

    goto :goto_2

    .line 185
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    new-instance v1, Lo/eol;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lo/eol;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lo/eol;)Lo/eol;

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 189
    :goto_2
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mEventAlarmItemList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

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

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-gt v1, v0, :cond_6

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_add_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 195
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_addition_create_group:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 198
    :goto_3
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "alarm---------------msg.arg1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "alarm-------isBackground= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 203
    :cond_7
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_a

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/dqi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d$3;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->e(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_4

    .line 219
    :pswitch_2
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESSAGE_UPDATE_EVENT_UI_COMMAND  mEventAlarmDBList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

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

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_8

    .line 223
    goto/16 :goto_4

    .line 225
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eol;->b(Ljava/util/List;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;

    move-result-object v0

    invoke-virtual {v0}, Lo/eol;->notifyDataSetChanged()V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-gt v1, v0, :cond_9

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_add_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    .line 232
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_addition_create_group:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 235
    goto :goto_4

    .line 237
    :pswitch_3
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_UPDATE_EVENT_DATA  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enz;->d(Ljava/util/List;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hwh_show_save_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 240
    .line 244
    :cond_a
    :goto_4
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

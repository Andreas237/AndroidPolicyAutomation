.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 1

    .line 983
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 980
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->c:Ljava/lang/ref/WeakReference;

    .line 984
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->c:Ljava/lang/ref/WeakReference;

    .line 985
    return-void
.end method

.method private a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V
    .locals 2

    .line 989
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 993
    :sswitch_0
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;Z)V

    .line 994
    goto :goto_0

    .line 998
    :sswitch_1
    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V

    .line 999
    goto :goto_0

    .line 1003
    :sswitch_2
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Ljava/lang/Object;)V

    .line 1004
    goto :goto_0

    .line 1008
    :sswitch_3
    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V

    .line 1009
    goto :goto_0

    .line 1013
    :sswitch_4
    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V

    .line 1014
    goto :goto_0

    .line 1018
    :sswitch_5
    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V

    .line 1019
    goto :goto_0

    .line 1023
    :sswitch_6
    invoke-static {p1, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V

    .line 1024
    goto :goto_0

    .line 1028
    :sswitch_7
    iget v0, p2, Landroid/os/Message;->arg1:I

    invoke-static {p1, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;I)V

    .line 1029
    goto :goto_0

    .line 1035
    :sswitch_8
    iget v0, p2, Landroid/os/Message;->arg1:I

    iget v1, p2, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p1, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1036
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V

    .line 1037
    goto :goto_0

    .line 1041
    :sswitch_9
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V

    .line 1042
    .line 1047
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_7
        0x69 -> :sswitch_9
        0x6b -> :sswitch_8
        0x6c -> :sswitch_8
        0x100 -> :sswitch_6
        0x120 -> :sswitch_2
        0x200 -> :sswitch_1
        0x201 -> :sswitch_3
        0x202 -> :sswitch_4
        0x203 -> :sswitch_5
        0xaca00 -> :sswitch_0
    .end sparse-switch
.end method

.method private c(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Z
    .locals 3

    .line 1143
    const/4 v1, 0x0

    .line 1144
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1148
    :sswitch_0
    invoke-static {p2, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V

    .line 1149
    const/4 v1, 0x1

    .line 1150
    goto :goto_0

    .line 1154
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/health/sns/model/chat/Assistant;

    if-eqz v0, :cond_0

    .line 1156
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/Assistant;

    .line 1157
    const/4 v0, 0x1

    invoke-static {p2, v2, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Lcom/huawei/health/sns/model/chat/Assistant;Z)V

    .line 1159
    :cond_0
    const/4 v1, 0x1

    .line 1160
    .line 1166
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x205 -> :sswitch_0
        0xaca03 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(ILcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Z
    .locals 2

    .line 1178
    const/4 v1, 0x0

    .line 1179
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1183
    :pswitch_0
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->i(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1184
    const/4 v1, 0x1

    .line 1185
    goto :goto_0

    .line 1189
    :pswitch_1
    const/16 v0, 0x116

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->removeMessages(I)V

    .line 1190
    const/16 v0, 0x117

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->removeMessages(I)V

    .line 1191
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1192
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->p(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1193
    const/4 v1, 0x1

    .line 1194
    goto :goto_0

    .line 1198
    :pswitch_2
    const/16 v0, 0x116

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->removeMessages(I)V

    .line 1199
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1200
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->m(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1201
    const/4 v1, 0x1

    .line 1202
    goto :goto_0

    .line 1206
    :pswitch_3
    const/16 v0, 0x117

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->removeMessages(I)V

    .line 1207
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1208
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->n(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1209
    const/4 v1, 0x1

    .line 1210
    .line 1215
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x114
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private d(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Z
    .locals 3

    .line 1076
    const/4 v1, 0x0

    .line 1077
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1082
    :sswitch_0
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->h(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1083
    const/4 v1, 0x1

    .line 1084
    goto :goto_0

    .line 1088
    :sswitch_1
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V

    .line 1089
    const/4 v1, 0x1

    .line 1090
    goto :goto_0

    .line 1094
    :sswitch_2
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->k(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1095
    const/4 v1, 0x1

    .line 1096
    goto :goto_0

    .line 1100
    :sswitch_3
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1101
    const/4 v1, 0x1

    .line 1102
    goto :goto_0

    .line 1107
    :sswitch_4
    const/4 v1, 0x1

    .line 1108
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p2, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Ljava/lang/Object;)V

    .line 1109
    goto :goto_0

    .line 1114
    :sswitch_5
    const/4 v1, 0x1

    .line 1115
    invoke-static {p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->g(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 1116
    goto :goto_0

    .line 1120
    :sswitch_6
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {p2, v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;I)V

    .line 1121
    const/4 v1, 0x1

    .line 1122
    goto :goto_0

    .line 1126
    :sswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 1128
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 1129
    invoke-static {p2, v2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Z)V

    .line 1131
    :cond_0
    const/4 v1, 0x1

    .line 1132
    .line 1138
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_1
        0x12 -> :sswitch_2
        0x15 -> :sswitch_3
        0x103 -> :sswitch_0
        0x118 -> :sswitch_6
        0x119 -> :sswitch_7
        0x204 -> :sswitch_0
        0xaca01 -> :sswitch_4
        0xaca02 -> :sswitch_5
    .end sparse-switch
.end method

.method private d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)Z
    .locals 1

    .line 1071
    invoke-direct {p0, p2, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->d(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p2, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->c(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p2, Landroid/os/Message;->what:I

    invoke-direct {p0, v0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->d(ILcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1052
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1053
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    .line 1054
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1056
    :cond_0
    return-void

    .line 1059
    :cond_1
    invoke-virtual {v1, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Landroid/os/Message;)V

    .line 1061
    invoke-direct {p0, v1, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1063
    return-void

    .line 1066
    :cond_2
    invoke-direct {p0, v1, p1}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$d;->a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;Landroid/os/Message;)V

    .line 1067
    return-void
.end method

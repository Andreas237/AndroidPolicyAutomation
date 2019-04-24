.class public Lo/arm;
.super Lo/awy;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Lo/arm;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/arm;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/awy;-><init>(Landroid/os/Handler;)V

    .line 51
    return-void
.end method

.method static synthetic a(Lo/arm;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/arm;->e(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/arm;Ljava/util/ArrayList;ILjava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/arm;->e(Ljava/util/ArrayList;ILjava/lang/String;)V

    return-void
.end method

.method private static d(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;>;"
        }
    .end annotation

    .line 183
    new-instance v0, Lo/arm$4;

    invoke-direct {v0, p0, p1}, Lo/arm$4;-><init>(J)V

    return-object v0
.end method

.method private e(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 104
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 106
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    :goto_0
    if-ltz v4, :cond_4

    .line 108
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    .line 109
    new-instance v6, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v6}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 110
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getNote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 113
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSendTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 114
    invoke-virtual {v6, v7, v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    goto :goto_1

    .line 116
    :catch_0
    move-exception v7

    .line 118
    sget-object v0, Lo/arm;->a:Ljava/lang/String;

    const-string v1, "caseNotify2Message NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :goto_1
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 121
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 122
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 123
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 125
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v0

    if-nez v0, :cond_1

    .line 128
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 129
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 130
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 131
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 132
    iget-object v0, p0, Lo/arm;->e:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 135
    if-eqz v7, :cond_0

    .line 137
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/arm;->e:Ljava/lang/String;

    .line 140
    :cond_0
    iget-object v0, p0, Lo/arm;->e:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderName(Ljava/lang/String;)V

    goto :goto_2

    .line 143
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 145
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 146
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 147
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 148
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 149
    iget-object v0, p0, Lo/arm;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 152
    if-eqz v7, :cond_2

    .line 154
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/arm;->b:Ljava/lang/String;

    .line 157
    :cond_2
    iget-object v0, p0, Lo/arm;->b:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderName(Ljava/lang/String;)V

    .line 160
    :cond_3
    :goto_2
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_0

    .line 162
    :cond_4
    return-object v3
.end method

.method private e(Ljava/util/ArrayList;ILjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;ILjava/lang/String;)V"
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lo/arm;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 171
    iput p2, v1, Landroid/os/Message;->what:I

    .line 172
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 173
    invoke-virtual {v2, p3, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 174
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 175
    iget-object v0, p0, Lo/arm;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 176
    return-void
.end method


# virtual methods
.method public c(IJ)V
    .locals 3

    .line 84
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p2, p3}, Lo/arm;->d(J)Lo/brd;

    move-result-object v1

    new-instance v2, Lo/arm$5;

    invoke-direct {v2, p0, p1}, Lo/arm$5;-><init>(Lo/arm;I)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 97
    return-void
.end method

.method public d(IJ)V
    .locals 2

    .line 58
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    .line 60
    return-void

    .line 63
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/arm$3;

    invoke-direct {v1, p0, p2, p3, p1}, Lo/arm$3;-><init>(Lo/arm;JI)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 77
    return-void
.end method

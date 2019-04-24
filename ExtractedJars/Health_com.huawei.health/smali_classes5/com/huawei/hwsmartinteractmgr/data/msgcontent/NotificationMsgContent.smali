.class public Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MSG_TYPE_HISTORY_BEST_MSG:Ljava/lang/String; = "historyBestMessage"

.field public static final MSG_TYPE_KAKA:Ljava/lang/String; = "kakaMessage"

.field public static final MSG_TYPE_SPORT_REPORT:Ljava/lang/String; = "sportReport"


# instance fields
.field private content:Ljava/lang/String;

.field private notificationId:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationId()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->notificationId:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->content:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setNotificationId(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->notificationId:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->type:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->url:Ljava/lang/String;

    .line 49
    return-void
.end method

.class public Lcom/huawei/health/sns/model/chat/MessageItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CONTENT_TYPE_ASSIST_HEADLINE:I = 0x6

.field public static final CONTENT_TYPE_ASSIST_HTML_TEXT:I = 0x7

.field public static final CONTENT_TYPE_CARD:I = 0x3

.field public static final CONTENT_TYPE_GRP_INVITE:I = 0xe

.field public static final CONTENT_TYPE_LINK:I = 0x8

.field public static final CONTENT_TYPE_NOTIFICATION:I = 0x4

.field public static final CONTENT_TYPE_NOTIFY_MSG:I = 0xc

.field public static final CONTENT_TYPE_OFFLINE_MSG:I = 0xa

.field public static final CONTENT_TYPE_PIC:I = 0x2

.field public static final CONTENT_TYPE_SENSITIVE_TIP:I = 0x9

.field public static final CONTENT_TYPE_SYSTEM_SHARE_IMAGE:I = 0x3e7

.field public static final CONTENT_TYPE_TEXT:I = 0x1

.field public static final CONTENT_TYPE_TEXT_NOTIFICATION:I = 0xd

.field public static final CONTENT_TYPE_UNKNOW:I = 0x5

.field public static final CONTENT_TYPE_UPDATE_MSG:I = 0xb

.field public static final CONTENT_TYPE_VOICE:I = 0xf

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field

.field public static final GROUP_CHAT:I = 0x2

.field public static final LOAD_COMPLETE:I = 0x1

.field public static final LOAD_EXCEPTION:I = 0x3

.field public static final LOAD_EXPIRE:I = 0x6

.field public static final LOAD_FAILED:I = 0x2

.field public static final LOAD_PROGRESS_CHANGED:I = 0x5

.field public static final LOAD_START:I = 0x4

.field public static final LOAD_UNKOWN:I = 0x0

.field public static final MEDIA_PLAYED:I = 0x1

.field public static final MEDIA_UNPLAYED:I = 0x0

.field public static final MESSAGE_DRAFT:I = 0x3

.field public static final MESSAGE_ITEM_UPDATE:I = 0x2710

.field public static final MESSAGE_TIP:I = 0xa

.field public static final NOT_REFFERED_SELF:I = 0x0

.field public static final RECEIVED_MSG:I = 0x2

.field public static final RECEIVE_STATUS_READED:I = 0x1

.field public static final RECEIVE_STATUS_UNREAD:I = 0x0

.field public static final REFFERED_SELF:I = 0x1

.field public static final SEND_MSG:I = 0x1

.field public static final SEND_STATUS_FAILED:I = 0x3

.field public static final SEND_STATUS_SENDED:I = 0x2

.field public static final SEND_STATUS_SENDING:I = 0x1

.field public static final SINGLE_CHAT:I = 0x1


# instance fields
.field private canSend:Z

.field private chatType:I

.field private downloadStatus:I

.field private forwardUrl:Ljava/lang/String;

.field private fromUID:J

.field private id:I

.field private isAssistMarketingMsg:Z

.field private isFromGroup:Z

.field private isRefferedSelf:I

.field private isSysChat:Z

.field private lastMsgType:I

.field private mediaId:Ljava/lang/String;

.field private mediaMtsUrl:Ljava/lang/String;

.field private mediaRemark:Ljava/lang/String;

.field private mediaSize:J

.field private mediaThumbFlag:Ljava/lang/String;

.field private mediaThumbnail:Ljava/lang/String;

.field private mediaTime:Ljava/lang/String;

.field private mediaUrl:Ljava/lang/String;

.field private msgAssistJson:Ljava/lang/String;

.field private msgContent:Ljava/lang/String;

.field private msgContentSpannableString:Ljava/lang/CharSequence;

.field private msgContentType:I

.field private msgDate:J

.field private msgId:Ljava/lang/String;

.field private msgStatus:I

.field private msgTypeData:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

.field private originalDownStatus:I

.field private previousSeq:J

.field private progress:I

.field private receiverId:J

.field private sendMsgStatus:I

.field private senderId:J

.field private senderName:Ljava/lang/String;

.field private senderSiteId:I

.field private seq:J

.field private specFlag:Z

.field private userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 832
    new-instance v0, Lcom/huawei/health/sns/model/chat/MessageItem$2;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/chat/MessageItem$2;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/chat/MessageItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 780
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 341
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->specFlag:Z

    .line 371
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    .line 376
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    .line 381
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    .line 386
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->canSend:Z

    .line 391
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isRefferedSelf:I

    .line 396
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderName:Ljava/lang/String;

    .line 401
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->lastMsgType:I

    .line 411
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    .line 416
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isAssistMarketingMsg:Z

    .line 781
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    .line 784
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 341
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->specFlag:Z

    .line 371
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    .line 376
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    .line 381
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    .line 386
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->canSend:Z

    .line 391
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isRefferedSelf:I

    .line 396
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderName:Ljava/lang/String;

    .line 401
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->lastMsgType:I

    .line 411
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    .line 416
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isAssistMarketingMsg:Z

    .line 785
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->id:I

    .line 786
    iput p2, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    .line 787
    iput-object p3, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    .line 788
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 849
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 341
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->specFlag:Z

    .line 371
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    .line 376
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    .line 381
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    .line 386
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->canSend:Z

    .line 391
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isRefferedSelf:I

    .line 396
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderName:Ljava/lang/String;

    .line 401
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->lastMsgType:I

    .line 411
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    .line 416
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isAssistMarketingMsg:Z

    .line 850
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->id:I

    .line 851
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->userId:J

    .line 852
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->chatType:I

    .line 853
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgStatus:I

    .line 854
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->sendMsgStatus:I

    .line 855
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    .line 856
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    .line 857
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgDate:J

    .line 858
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbnail:Ljava/lang/String;

    .line 859
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    .line 860
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaId:Ljava/lang/String;

    .line 861
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaUrl:Ljava/lang/String;

    .line 862
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaSize:J

    .line 863
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaTime:Ljava/lang/String;

    .line 864
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaRemark:Ljava/lang/String;

    .line 865
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderId:J

    .line 866
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->receiverId:J

    .line 867
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->seq:J

    .line 868
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    .line 869
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderSiteId:I

    .line 870
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    .line 871
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaMtsUrl:Ljava/lang/String;

    .line 872
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->forwardUrl:Ljava/lang/String;

    .line 873
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbFlag:Ljava/lang/String;

    .line 874
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->fromUID:J

    .line 875
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isFromGroup:Z

    .line 876
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    .line 877
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    .line 878
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    .line 879
    const-class v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgTypeData:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    .line 880
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    .line 881
    return-void
.end method

.method public static isTipMessage(I)Z
    .locals 1

    .line 1049
    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    const/16 v0, 0xb

    if-eq p0, v0, :cond_0

    const/16 v0, 0xc

    if-eq p0, v0, :cond_0

    const/16 v0, 0xd

    if-ne p0, v0, :cond_1

    .line 1057
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1059
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static final newComparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Comparator<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 967
    new-instance v0, Lcom/huawei/health/sns/model/chat/MessageItem$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/chat/MessageItem$3;-><init>()V

    return-object v0
.end method


# virtual methods
.method public buildFromCursor(Landroid/database/Cursor;)V
    .locals 2

    .line 990
    const-string v0, "_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->id:I

    .line 991
    const-string v0, "user_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->userId:J

    .line 992
    const-string v0, "msg_status"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgStatus:I

    .line 993
    const-string v0, "chat_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->chatType:I

    .line 994
    const-string v0, "send_msg_status"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->sendMsgStatus:I

    .line 995
    const-string v0, "msg_content"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    .line 996
    const-string v0, "assist_json"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgAssistJson:Ljava/lang/String;

    .line 997
    const-string v0, "msg_content_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    .line 998
    const-string v0, "msg_date"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgDate:J

    .line 999
    const-string v0, "media_thumbnail"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbnail:Ljava/lang/String;

    .line 1000
    const-string v0, "msg_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    .line 1001
    const-string v0, "media_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaId:Ljava/lang/String;

    .line 1002
    const-string v0, "media_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaUrl:Ljava/lang/String;

    .line 1003
    const-string v0, "media_size"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaSize:J

    .line 1004
    const-string v0, "media_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaTime:Ljava/lang/String;

    .line 1005
    const-string v0, "media_remark"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaRemark:Ljava/lang/String;

    .line 1006
    const-string v0, "sender_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderId:J

    .line 1007
    const-string v0, "receicer_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->receiverId:J

    .line 1008
    const-string v0, "seq"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->seq:J

    .line 1009
    const-string v0, "previous_seq"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    .line 1010
    const-string v0, "pic_mts_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaMtsUrl:Ljava/lang/String;

    .line 1011
    const-string v0, "pic_forward_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->forwardUrl:Ljava/lang/String;

    .line 1012
    const-string v0, "mts_download_status"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    .line 1013
    const-string v0, "mts_ori_download_status"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    .line 1014
    const-string v0, "mts_thumb_flag"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbFlag:Ljava/lang/String;

    .line 1015
    const-string v0, "is_reffered_self"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isRefferedSelf:I

    .line 1016
    const-string v0, "sender_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderName:Ljava/lang/String;

    .line 1017
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 793
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 886
    if-nez p1, :cond_0

    .line 888
    const/4 v0, 0x0

    return v0

    .line 891
    :cond_0
    if-ne p0, p1, :cond_1

    .line 893
    const/4 v0, 0x1

    return v0

    .line 896
    :cond_1
    instance-of v0, p1, Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v0, :cond_2

    .line 898
    const/4 v0, 0x0

    return v0

    .line 901
    :cond_2
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 903
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 905
    const/4 v0, 0x0

    return v0

    .line 908
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getCanSend()Z
    .locals 1

    .line 775
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->canSend:Z

    .line 776
    return v0
.end method

.method public getChatType()I
    .locals 1

    .line 497
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->chatType:I

    .line 498
    return v0
.end method

.method public getDownloadStatus()I
    .locals 1

    .line 430
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    .line 431
    return v0
.end method

.method public getForwardUrl()Ljava/lang/String;
    .locals 1

    .line 731
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->forwardUrl:Ljava/lang/String;

    .line 732
    return-object v0
.end method

.method public getFromUID()J
    .locals 2

    .line 742
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->fromUID:J

    .line 743
    return-wide v0
.end method

.method public getId()I
    .locals 1

    .line 462
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->id:I

    .line 463
    return v0
.end method

.method public getIsRefferedSelf()I
    .locals 1

    .line 945
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isRefferedSelf:I

    .line 946
    return v0
.end method

.method public getLastMsgType()I
    .locals 1

    .line 1021
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->lastMsgType:I

    .line 1022
    return v0
.end method

.method public getMediaId()Ljava/lang/String;
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaId:Ljava/lang/String;

    .line 600
    return-object v0
.end method

.method public getMediaMtsUrl()Ljava/lang/String;
    .locals 1

    .line 720
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaMtsUrl:Ljava/lang/String;

    .line 721
    return-object v0
.end method

.method public getMediaRemark()Ljava/lang/String;
    .locals 1

    .line 638
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaRemark:Ljava/lang/String;

    .line 639
    return-object v0
.end method

.method public getMediaSize()J
    .locals 2

    .line 616
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaSize:J

    .line 617
    return-wide v0
.end method

.method public getMediaThumbFlag()Ljava/lang/String;
    .locals 1

    .line 709
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbFlag:Ljava/lang/String;

    .line 710
    return-object v0
.end method

.method public getMediaThumbnail()Ljava/lang/String;
    .locals 1

    .line 577
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbnail:Ljava/lang/String;

    .line 578
    return-object v0
.end method

.method public getMediaTime()Ljava/lang/String;
    .locals 1

    .line 632
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaTime:Ljava/lang/String;

    .line 633
    return-object v0
.end method

.method public getMediaUrl()Ljava/lang/String;
    .locals 1

    .line 605
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaUrl:Ljava/lang/String;

    .line 606
    return-object v0
.end method

.method public getMsgAssistJson()Ljava/lang/String;
    .locals 1

    .line 934
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgAssistJson:Ljava/lang/String;

    .line 935
    return-object v0
.end method

.method public getMsgContent()Ljava/lang/String;
    .locals 1

    .line 555
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    .line 556
    return-object v0
.end method

.method public getMsgContentSpannableString()Ljava/lang/CharSequence;
    .locals 1

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentSpannableString:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getMsgContentType()I
    .locals 1

    .line 544
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    .line 545
    return v0
.end method

.method public getMsgDate()J
    .locals 2

    .line 566
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgDate:J

    .line 567
    return-wide v0
.end method

.method public getMsgId()Ljava/lang/String;
    .locals 1

    .line 588
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    .line 589
    return-object v0
.end method

.method public getMsgStatus()I
    .locals 1

    .line 508
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgStatus:I

    .line 509
    return v0
.end method

.method public getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 1

    .line 420
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgTypeData:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    return-object v0
.end method

.method public getOriginalDownStatus()I
    .locals 1

    .line 452
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    return v0
.end method

.method public getPreviousSeq()J
    .locals 2

    .line 682
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    .line 683
    return-wide v0
.end method

.method public getProgress()I
    .locals 1

    .line 441
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    .line 442
    return v0
.end method

.method public getReceiverId()J
    .locals 2

    .line 660
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->receiverId:J

    .line 661
    return-wide v0
.end method

.method public getSendMsgStatus()I
    .locals 1

    .line 533
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->sendMsgStatus:I

    .line 534
    return v0
.end method

.method public getSenderId()J
    .locals 2

    .line 649
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderId:J

    .line 650
    return-wide v0
.end method

.method public getSenderName()Ljava/lang/String;
    .locals 1

    .line 956
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderName:Ljava/lang/String;

    .line 957
    return-object v0
.end method

.method public getSenderSiteId()I
    .locals 3

    .line 474
    const/4 v1, 0x1

    .line 475
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v2

    .line 476
    if-eqz v2, :cond_0

    .line 478
    invoke-virtual {v2}, Lo/axr;->c()I

    move-result v1

    .line 480
    :cond_0
    iput v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderSiteId:I

    .line 481
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderSiteId:I

    return v0
.end method

.method public getSeq()J
    .locals 2

    .line 671
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->seq:J

    .line 672
    return-wide v0
.end method

.method public getUserId()J
    .locals 2

    .line 486
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->userId:J

    .line 487
    return-wide v0
.end method

.method public hashCode()I
    .locals 1

    .line 914
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 916
    const/4 v0, 0x0

    return v0

    .line 919
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isAssistMarketingMsg()Z
    .locals 1

    .line 1089
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isAssistMarketingMsg:Z

    .line 1090
    return v0
.end method

.method public isFromGroup()Z
    .locals 1

    .line 753
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isFromGroup:Z

    .line 754
    return v0
.end method

.method public isSpecFlag()Z
    .locals 1

    .line 693
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->specFlag:Z

    .line 694
    return v0
.end method

.method public isSysChat()Z
    .locals 1

    .line 1069
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    .line 1070
    return v0
.end method

.method public isTipMessage()Z
    .locals 1

    .line 1037
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->isTipMessage(I)Z

    move-result v0

    return v0
.end method

.method public setAssistMarketingMsg(Z)V
    .locals 0

    .line 1099
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isAssistMarketingMsg:Z

    .line 1100
    return-void
.end method

.method public setCanSend(Z)V
    .locals 0

    .line 767
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->canSend:Z

    .line 768
    return-void
.end method

.method public setChatType(I)V
    .locals 0

    .line 503
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->chatType:I

    .line 504
    return-void
.end method

.method public setDownloadStatus(I)V
    .locals 0

    .line 436
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    .line 437
    return-void
.end method

.method public setForwardUrl(Ljava/lang/String;)V
    .locals 0

    .line 737
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->forwardUrl:Ljava/lang/String;

    .line 738
    return-void
.end method

.method public setFromGroup(Z)V
    .locals 0

    .line 759
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isFromGroup:Z

    .line 760
    return-void
.end method

.method public setFromUID(J)V
    .locals 0

    .line 748
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->fromUID:J

    .line 749
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 468
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->id:I

    .line 469
    return-void
.end method

.method public setIsRefferedSelf(I)V
    .locals 0

    .line 951
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isRefferedSelf:I

    .line 952
    return-void
.end method

.method public setLastMsgType(I)V
    .locals 0

    .line 1027
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->lastMsgType:I

    .line 1028
    return-void
.end method

.method public setMediaMtsUrl(Ljava/lang/String;)V
    .locals 0

    .line 726
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaMtsUrl:Ljava/lang/String;

    .line 727
    return-void
.end method

.method public setMediaRemark(Ljava/lang/String;)V
    .locals 0

    .line 644
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaRemark:Ljava/lang/String;

    .line 645
    return-void
.end method

.method public setMediaSize(J)V
    .locals 0

    .line 627
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaSize:J

    .line 628
    return-void
.end method

.method public setMediaThumbFlag(Ljava/lang/String;)V
    .locals 0

    .line 715
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbFlag:Ljava/lang/String;

    .line 716
    return-void
.end method

.method public setMediaThumbnail(Ljava/lang/String;)V
    .locals 0

    .line 583
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbnail:Ljava/lang/String;

    .line 584
    return-void
.end method

.method public setMediaTime(Ljava/lang/String;)V
    .locals 0

    .line 622
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaTime:Ljava/lang/String;

    .line 623
    return-void
.end method

.method public setMediaUrl(Ljava/lang/String;)V
    .locals 0

    .line 611
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaUrl:Ljava/lang/String;

    .line 612
    return-void
.end method

.method public setMsgAssistJson(Ljava/lang/String;)V
    .locals 0

    .line 940
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgAssistJson:Ljava/lang/String;

    .line 941
    return-void
.end method

.method public setMsgContent(Ljava/lang/String;)V
    .locals 0

    .line 561
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    .line 562
    return-void
.end method

.method public setMsgContentSpannableString(Ljava/lang/CharSequence;)V
    .locals 0

    .line 929
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentSpannableString:Ljava/lang/CharSequence;

    .line 930
    return-void
.end method

.method public setMsgContentType(I)V
    .locals 0

    .line 550
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    .line 551
    return-void
.end method

.method public setMsgDate(J)V
    .locals 0

    .line 572
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgDate:J

    .line 573
    return-void
.end method

.method public setMsgId(Ljava/lang/String;)V
    .locals 0

    .line 594
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    .line 595
    return-void
.end method

.method public setMsgStatus(I)V
    .locals 0

    .line 528
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgStatus:I

    .line 529
    return-void
.end method

.method public setMsgStatusContent(IILjava/lang/String;)V
    .locals 0

    .line 521
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgStatus:I

    .line 522
    iput p2, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    .line 523
    iput-object p3, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    .line 524
    return-void
.end method

.method public setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 0

    .line 425
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgTypeData:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    .line 426
    return-void
.end method

.method public setOriginalDownStatus(I)V
    .locals 0

    .line 457
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    .line 458
    return-void
.end method

.method public setPreviousSeq(J)V
    .locals 0

    .line 688
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    .line 689
    return-void
.end method

.method public setProgress(I)V
    .locals 0

    .line 447
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    .line 448
    return-void
.end method

.method public setReceiverId(J)V
    .locals 0

    .line 666
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->receiverId:J

    .line 667
    return-void
.end method

.method public setSendMsgStatus(I)V
    .locals 0

    .line 539
    iput p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->sendMsgStatus:I

    .line 540
    return-void
.end method

.method public setSenderId(J)V
    .locals 0

    .line 655
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderId:J

    .line 656
    return-void
.end method

.method public setSenderName(Ljava/lang/String;)V
    .locals 0

    .line 962
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderName:Ljava/lang/String;

    .line 963
    return-void
.end method

.method public setSeq(J)V
    .locals 0

    .line 677
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->seq:J

    .line 678
    return-void
.end method

.method public setSpecFlag(Z)V
    .locals 0

    .line 704
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->specFlag:Z

    .line 705
    return-void
.end method

.method public setSysChat(Z)V
    .locals 0

    .line 1080
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    .line 1081
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 492
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->userId:J

    .line 493
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MessageItem{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->userId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chatType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->chatType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sendMsgStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->sendMsgStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgAssistJson=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgAssistJson:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContentSpannableString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentSpannableString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgDate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaThumbnail=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbnail:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaRemark=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaRemark:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", senderId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", senderSiteId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderSiteId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", receiverId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->receiverId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", seq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->seq:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", previousSeq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", specFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->specFlag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaMtsUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaMtsUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", forwardUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->forwardUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mediaThumbFlag=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbFlag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fromUID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->fromUID:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isFromGroup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isFromGroup:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", downloadStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", originalDownStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canSend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->canSend:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isRefferedSelf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isRefferedSelf:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", senderName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastMsgType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->lastMsgType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgTypeData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgTypeData:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSysChat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isAssistMarketingMsg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isAssistMarketingMsg:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 799
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 800
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 801
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->chatType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 802
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgStatus:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 803
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->sendMsgStatus:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 804
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContentType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 805
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgContent:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 806
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgDate:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 807
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbnail:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 808
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 809
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 810
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 811
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaSize:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 812
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 813
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaRemark:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 814
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 815
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->receiverId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 816
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->seq:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 817
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 818
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->senderSiteId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 819
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->previousSeq:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 820
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaMtsUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 821
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->forwardUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 822
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->mediaThumbFlag:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 823
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->fromUID:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 824
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isFromGroup:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 825
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->downloadStatus:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 826
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->originalDownStatus:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 827
    iget v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->progress:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 828
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->msgTypeData:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 829
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 830
    return-void
.end method

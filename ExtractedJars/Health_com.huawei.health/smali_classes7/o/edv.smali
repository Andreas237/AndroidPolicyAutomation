.class public abstract Lo/edv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TYPE_COMMON:I = 0x0

.field public static final TYPE_CONTACT_SELECT:I = 0x4

.field public static final TYPE_DOWNLOAD_IMAGE:I = 0x9

.field public static final TYPE_FRIEND_LIST:I = 0x5

.field public static final TYPE_FRIEND_SELECT:I = 0x3

.field public static final TYPE_GROUPMEM_LIST:I = 0x8

.field public static final TYPE_GROUP_LIST:I = 0x6

.field public static final TYPE_GROUP_SELECT:I = 0x7

.field public static final TYPE_MSG_COUNT:I = 0xa

.field public static final TYPE_UNREAD_MSG:I = 0x2

.field public static final TYPE_USER_DETAIL:I = 0x1


# instance fields
.field public errorCode:I

.field public errorReason:Ljava/lang/String;

.field public transaction:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getType()I
.end method

.class public final enum Lcom/huawei/openalliance/ad/constant/EventType;
.super Ljava/lang/Enum;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/constant/EventType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum ADPRECHECK:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPDOWNLOAD:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPDOWNLOADCANCEL:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPDOWNLOADPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPDOWNLOADRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPDOWNLOADSTART:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPINSTALL:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPINSTALLFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum APPOPEN:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum CLICK:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum CLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum EXCEPTION:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum FAVORITE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum INTENTFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum PHYIMP:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum REMOVE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum RESPONSE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum SHARE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum SHOW:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum SWIPEUP:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum VIDEOPLAYEND:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum VIDEOPLAYPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum VIDEOPLAYRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum VIDEOPLAYSTART:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum WEBCLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum WEBLOADFINISH:Lcom/huawei/openalliance/ad/constant/EventType;

.field public static final enum WEBOPEN:Lcom/huawei/openalliance/ad/constant/EventType;


# instance fields
.field private final event:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "RESPONSE"

    const-string v2, "response"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->RESPONSE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "SHOW"

    const-string v2, "imp"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->SHOW:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "PHYIMP"

    const-string v2, "phyImp"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->PHYIMP:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "CLICK"

    const-string v2, "click"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLICK:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "CLOSE"

    const-string v2, "userclose"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "WEBOPEN"

    const-string v2, "webopen"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->WEBOPEN:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "WEBCLOSE"

    const-string v2, "webclose"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->WEBCLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "WEBLOADFINISH"

    const-string v2, "webloadfinish"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->WEBLOADFINISH:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "SWIPEUP"

    const-string v2, "swipeup"

    const/16 v3, 0x8

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->SWIPEUP:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "REMOVE"

    const-string v2, "remove"

    const/16 v3, 0x9

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->REMOVE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "SHARE"

    const-string v2, "share"

    const/16 v3, 0xa

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->SHARE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "FAVORITE"

    const-string v2, "favorite"

    const/16 v3, 0xb

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->FAVORITE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "VIDEOPLAYEND"

    const-string v2, "playEnd"

    const/16 v3, 0xc

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYEND:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "VIDEOPLAYSTART"

    const-string v2, "playStart"

    const/16 v3, 0xd

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "VIDEOPLAYPAUSE"

    const-string v2, "playPause"

    const/16 v3, 0xe

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "VIDEOPLAYRESUME"

    const-string v2, "playResume"

    const/16 v3, 0xf

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPOPEN"

    const-string v2, "appOpen"

    const/16 v3, 0x10

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPOPEN:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPDOWNLOAD"

    const-string v2, "download"

    const/16 v3, 0x11

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOAD:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPINSTALL"

    const-string v2, "install"

    const/16 v3, 0x12

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALL:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPINSTALLSTART"

    const-string v2, "installStart"

    const/16 v3, 0x13

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPINSTALLFAIL"

    const-string v2, "installFail"

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPDOWNLOADSTART"

    const-string v2, "downloadstart"

    const/16 v3, 0x15

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPDOWNLOADCANCEL"

    const-string v2, "downloadCancel"

    const/16 v3, 0x16

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADCANCEL:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPDOWNLOADPAUSE"

    const-string v2, "downloadPause"

    const/16 v3, 0x17

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "APPDOWNLOADRESUME"

    const-string v2, "downloadResume"

    const/16 v3, 0x18

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "EXCEPTION"

    const-string v2, "exception"

    const/16 v3, 0x19

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->EXCEPTION:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "INTENTSUCCESS"

    const-string v2, "intentSuccess"

    const/16 v3, 0x1a

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "INTENTFAIL"

    const-string v2, "intentFail"

    const/16 v3, 0x1b

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    new-instance v0, Lcom/huawei/openalliance/ad/constant/EventType;

    const-string v1, "ADPRECHECK"

    const-string v2, "adPreCheck"

    const/16 v3, 0x1c

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/constant/EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->ADPRECHECK:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v0, 0x1d

    new-array v0, v0, [Lcom/huawei/openalliance/ad/constant/EventType;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->RESPONSE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->SHOW:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->PHYIMP:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->CLICK:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->CLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->WEBOPEN:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->WEBCLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->WEBLOADFINISH:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->SWIPEUP:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->REMOVE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->SHARE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->FAVORITE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYEND:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPOPEN:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOAD:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADCANCEL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->EXCEPTION:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->ADPRECHECK:Lcom/huawei/openalliance/ad/constant/EventType;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->$VALUES:[Lcom/huawei/openalliance/ad/constant/EventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/huawei/openalliance/ad/constant/EventType;->event:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/constant/EventType;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/constant/EventType;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/constant/EventType;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->$VALUES:[Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/constant/EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/constant/EventType;

    return-object v0
.end method


# virtual methods
.method public value()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/constant/EventType;->event:Ljava/lang/String;

    return-object v0
.end method

.class public final enum Lcom/yandex/metrica/impl/q$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UseSparseArrays"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/q$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum A:Lcom/yandex/metrica/impl/q$a;

.field public static final enum B:Lcom/yandex/metrica/impl/q$a;

.field public static final enum C:Lcom/yandex/metrica/impl/q$a;

.field public static final enum D:Lcom/yandex/metrica/impl/q$a;

.field public static final enum E:Lcom/yandex/metrica/impl/q$a;

.field static final F:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/yandex/metrica/impl/q$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic I:[Lcom/yandex/metrica/impl/q$a;

.field public static final enum a:Lcom/yandex/metrica/impl/q$a;

.field public static final enum b:Lcom/yandex/metrica/impl/q$a;

.field public static final enum c:Lcom/yandex/metrica/impl/q$a;

.field public static final enum d:Lcom/yandex/metrica/impl/q$a;

.field public static final enum e:Lcom/yandex/metrica/impl/q$a;

.field public static final enum f:Lcom/yandex/metrica/impl/q$a;

.field public static final enum g:Lcom/yandex/metrica/impl/q$a;

.field public static final enum h:Lcom/yandex/metrica/impl/q$a;

.field public static final enum i:Lcom/yandex/metrica/impl/q$a;

.field public static final enum j:Lcom/yandex/metrica/impl/q$a;

.field public static final enum k:Lcom/yandex/metrica/impl/q$a;

.field public static final enum l:Lcom/yandex/metrica/impl/q$a;

.field public static final enum m:Lcom/yandex/metrica/impl/q$a;

.field public static final enum n:Lcom/yandex/metrica/impl/q$a;

.field public static final enum o:Lcom/yandex/metrica/impl/q$a;

.field public static final enum p:Lcom/yandex/metrica/impl/q$a;

.field public static final enum q:Lcom/yandex/metrica/impl/q$a;

.field public static final enum r:Lcom/yandex/metrica/impl/q$a;

.field public static final enum s:Lcom/yandex/metrica/impl/q$a;

.field public static final enum t:Lcom/yandex/metrica/impl/q$a;

.field public static final enum u:Lcom/yandex/metrica/impl/q$a;

.field public static final enum v:Lcom/yandex/metrica/impl/q$a;

.field public static final enum w:Lcom/yandex/metrica/impl/q$a;

.field public static final enum x:Lcom/yandex/metrica/impl/q$a;

.field public static final enum y:Lcom/yandex/metrica/impl/q$a;

.field public static final enum z:Lcom/yandex/metrica/impl/q$a;


# instance fields
.field private final G:I

.field private final H:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_UNDEFINED"

    const-string v2, "Unrecognized action"

    const/4 v3, 0x0

    const/4 v4, -0x1

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->a:Lcom/yandex/metrica/impl/q$a;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_INIT"

    const-string v2, "First initialization event"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v3, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->b:Lcom/yandex/metrica/impl/q$a;

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_REGULAR"

    const-string v2, "Regular event"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v4, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_UPDATE_FOREGROUND_TIME"

    const-string v2, "Update foreground time"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v6, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->d:Lcom/yandex/metrica/impl/q$a;

    .line 34
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_EXCEPTION_USER"

    const-string v2, "Error from developer"

    const/4 v7, 0x4

    const/4 v8, 0x5

    invoke-direct {v0, v1, v7, v8, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_ALIVE"

    const-string v2, "App is still alive"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v8, v9, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->f:Lcom/yandex/metrica/impl/q$a;

    .line 36
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_UPDATE_COLLECT_INSTALLED_APPS"

    const-string v2, "Update collect apps"

    const/4 v10, 0x6

    const/16 v11, 0x8

    invoke-direct {v0, v1, v10, v11, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->g:Lcom/yandex/metrica/impl/q$a;

    .line 38
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_SET_USER_INFO"

    const-string v2, "User info"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v9, v12, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->h:Lcom/yandex/metrica/impl/q$a;

    .line 39
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_REPORT_USER_INFO"

    const-string v2, "Report user info"

    const/16 v13, 0xa

    invoke-direct {v0, v1, v11, v13, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->i:Lcom/yandex/metrica/impl/q$a;

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_SEND_USER_PROFILE"

    const-string v2, "Send user profile"

    const v14, 0xa001

    invoke-direct {v0, v1, v12, v14, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->j:Lcom/yandex/metrica/impl/q$a;

    .line 41
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_SET_USER_PROFILE_ID"

    const-string v2, "Set user profile ID"

    const v14, 0xa002

    invoke-direct {v0, v1, v13, v14, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->k:Lcom/yandex/metrica/impl/q$a;

    .line 42
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_SEND_REVENUE_EVENT"

    const-string v2, "Send revenue event"

    const/16 v14, 0xb

    const v15, 0xa010

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->l:Lcom/yandex/metrica/impl/q$a;

    .line 44
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_PURGE_BUFFER"

    const-string v2, "Forcible buffer clearing"

    const/16 v15, 0xc

    const/16 v14, 0x100

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->m:Lcom/yandex/metrica/impl/q$a;

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_NATIVE_CRASH"

    const-string v2, "Native crash of App"

    const/16 v14, 0xd

    const/16 v15, 0x300

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    .line 46
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_STARTUP"

    const-string v2, "Sending the startup due to lack of data"

    const/16 v15, 0xe

    const/16 v14, 0x600

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->o:Lcom/yandex/metrica/impl/q$a;

    .line 47
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_IDENTITY"

    const-string v2, "System identification"

    const/16 v14, 0xf

    const/16 v15, 0x700

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    .line 48
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_STATBOX"

    const-string v2, "Event with statistical data"

    const/16 v14, 0x10

    const/16 v15, 0x900

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->q:Lcom/yandex/metrica/impl/q$a;

    .line 49
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_REFERRER_RECEIVED_FROM_BROADCAST"

    const-string v2, "Referrer received"

    const/16 v14, 0x11

    const/16 v15, 0x1000

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->r:Lcom/yandex/metrica/impl/q$a;

    .line 50
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_SEND_REFERRER"

    const-string v2, "Send referrer"

    const/16 v14, 0x12

    const/16 v15, 0x1001

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    .line 51
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_REFERRER_OBTAINED_FROM_SERVICES"

    const-string v2, "Referrer obtained"

    const/16 v14, 0x13

    const/16 v15, 0x1002

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->t:Lcom/yandex/metrica/impl/q$a;

    .line 52
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_APP_ENVIRONMENT_UPDATED"

    const-string v2, "App Environment Updated"

    const/16 v14, 0x14

    const/16 v15, 0x1500

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->u:Lcom/yandex/metrica/impl/q$a;

    .line 53
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_APP_ENVIRONMENT_CLEARED"

    const-string v2, "App Environment Cleared"

    const/16 v14, 0x15

    const/16 v15, 0x1600

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->v:Lcom/yandex/metrica/impl/q$a;

    .line 54
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_EXCEPTION_UNHANDLED"

    const-string v2, "Crash of App"

    const/16 v14, 0x16

    const/16 v15, 0x1700

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->w:Lcom/yandex/metrica/impl/q$a;

    .line 55
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_ACTIVATION"

    const-string v2, "Activation of metrica"

    const/16 v14, 0x17

    const/16 v15, 0x1800

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->x:Lcom/yandex/metrica/impl/q$a;

    .line 56
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_FIRST_ACTIVATION"

    const-string v2, "First activation of metrica"

    const/16 v14, 0x18

    const/16 v15, 0x1801

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->y:Lcom/yandex/metrica/impl/q$a;

    .line 57
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_START"

    const-string v2, "Start of new session"

    const/16 v14, 0x19

    const/16 v15, 0x1900

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    .line 58
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_CUSTOM_EVENT"

    const-string v2, "Custom event"

    const/16 v14, 0x1a

    const/16 v15, 0x2000

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->A:Lcom/yandex/metrica/impl/q$a;

    .line 59
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_APP_OPEN"

    const-string v2, "App open event"

    const/16 v14, 0x1b

    const/16 v15, 0x2010

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->B:Lcom/yandex/metrica/impl/q$a;

    .line 60
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_APP_UPDATE"

    const-string v2, "App update event"

    const/16 v14, 0x1c

    const/16 v15, 0x2020

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->C:Lcom/yandex/metrica/impl/q$a;

    .line 61
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_PERMISSIONS"

    const-string v2, "Permissions changed event"

    const/16 v14, 0x1d

    const/16 v15, 0x3000

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->D:Lcom/yandex/metrica/impl/q$a;

    .line 62
    new-instance v0, Lcom/yandex/metrica/impl/q$a;

    const-string v1, "EVENT_TYPE_APP_FEATURES"

    const-string v2, "Features, required by application"

    const/16 v14, 0x1e

    const/16 v15, 0x3001

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/yandex/metrica/impl/q$a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->E:Lcom/yandex/metrica/impl/q$a;

    const/16 v0, 0x1f

    .line 26
    new-array v0, v0, [Lcom/yandex/metrica/impl/q$a;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->a:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->b:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->d:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v6

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v7

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->f:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v8

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->g:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v10

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->h:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v9

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->i:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v11

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->j:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v12

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->k:Lcom/yandex/metrica/impl/q$a;

    aput-object v1, v0, v13

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->l:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->m:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->o:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->q:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->r:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->t:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->u:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->v:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->w:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->x:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->y:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->A:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->B:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->C:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->D:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->E:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->I:[Lcom/yandex/metrica/impl/q$a;

    .line 68
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/q$a;->F:Ljava/util/HashMap;

    .line 70
    invoke-static {}, Lcom/yandex/metrica/impl/q$a;->values()[Lcom/yandex/metrica/impl/q$a;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    .line 71
    sget-object v4, Lcom/yandex/metrica/impl/q$a;->F:Ljava/util/HashMap;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 79
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 80
    iput p3, p0, Lcom/yandex/metrica/impl/q$a;->G:I

    .line 81
    iput-object p4, p0, Lcom/yandex/metrica/impl/q$a;->H:Ljava/lang/String;

    return-void
.end method

.method public static a(I)Lcom/yandex/metrica/impl/q$a;
    .locals 1

    .line 97
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->F:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/q$a;

    if-nez p0, :cond_0

    .line 98
    sget-object p0, Lcom/yandex/metrica/impl/q$a;->a:Lcom/yandex/metrica/impl/q$a;

    :cond_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/q$a;
    .locals 1

    .line 26
    const-class v0, Lcom/yandex/metrica/impl/q$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/q$a;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/q$a;
    .locals 1

    .line 26
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->I:[Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/q$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/q$a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/yandex/metrica/impl/q$a;->G:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/yandex/metrica/impl/q$a;->H:Ljava/lang/String;

    return-object v0
.end method

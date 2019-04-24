.class public final enum Lcom/huawei/openalliance/ad/e/g;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/openalliance/ad/e/g;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum b:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum c:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum d:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum e:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum f:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum g:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum h:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum i:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum j:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum k:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum l:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum m:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum n:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum o:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum p:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum q:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum r:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum s:Lcom/huawei/openalliance/ad/e/g;

.field public static final enum t:Lcom/huawei/openalliance/ad/e/g;

.field private static final synthetic v:[Lcom/huawei/openalliance/ad/e/g;


# instance fields
.field private final u:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_BY_ID_WHERE"

    const-string v2, "contentId = ?"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_BY_TASKID_WHERE"

    const-string v2, "taskId = ?"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->b:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_BY_DATE_NOT_EQUAL_WHERE"

    const-string v2, "displayDate <> ?"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->c:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_PORTRAIT_CACHE_SHOW_WHERE"

    const-string v2, "width <= height and startTime <= ? and endTime >= ? and slotId = ? and lastShowTime < ? and fcCtrlDate <> ? and splashPreContentFlag <> 0"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->d:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_LANDSCAPE_CACHE_SHOW_WHERE"

    const-string v2, "width > height and startTime <= ? and endTime >= ? and slotId = ? and lastShowTime < ? and fcCtrlDate <> ? and splashPreContentFlag <> 0"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->e:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_PORTRAIT_REAL_SHOW_WHERE"

    const-string v2, "width <= height and contentId = ? and startTime <= ? and endTime >= ? and splashPreContentFlag <> 0"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->f:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_LANDSCAPE_REAL_SHOW_WHERE"

    const-string v2, "width > height and contentId = ? and startTime <= ? and endTime >= ? and splashPreContentFlag <> 0"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->g:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_EXPIRE_WHERE"

    const-string v2, "endTime < ? and splashPreContentFlag <> ?"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->h:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "CONTENT_BY_ADTYPE_WHERE"

    const-string v2, "adType = ?"

    const/16 v3, 0x8

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->i:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "THIER_PARTY_EVENT_UPLOAD_ITEMS_WHERE"

    const-string v2, "lockTime < ?"

    const/16 v3, 0x9

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->j:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "EVENT_REPORT_FAILED_UPDATE_BY_ID_WHERE"

    const-string v2, "_id = ?"

    const/16 v3, 0xa

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->k:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "THIRD_PARTY_EVENT_UPDATE_BY_ID_WHERE"

    const-string v2, "_id = ?"

    const/16 v3, 0xb

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->l:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "EVENT_DELETE_BY_ID_WHERE"

    const-string v2, "_id = ?"

    const/16 v3, 0xc

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->m:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "THIRD_PARTY_EVENT_DELETE_BY_ID_WHERE"

    const-string v2, "_id = ?"

    const/16 v3, 0xd

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->n:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "USER_CLOSE_DELETE_EXPIRE_WHERE"

    const-string v2, "timeStamp < ?"

    const/16 v3, 0xe

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->o:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "EVENT_DELETE_EXPIRE_WHERE"

    const-string v2, "time < ? and adType = ?"

    const/16 v3, 0xf

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->p:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "THIRD_PARTY_EVENT_DELETE_EXPIRE_WHERE"

    const-string v2, "time < ? and adType = ?"

    const/16 v3, 0x10

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->q:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "USER_CLOSE_QUERY_BY_TIME_WHERE"

    const-string v2, "timeStamp >= ? and timeStamp < ?"

    const/16 v3, 0x11

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->r:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "SLOGAN_PORTRAIT_WHERE"

    const-string v2, "width <= height and startTime <= ? and endTime >= ?"

    const/16 v3, 0x12

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->s:Lcom/huawei/openalliance/ad/e/g;

    new-instance v0, Lcom/huawei/openalliance/ad/e/g;

    const-string v1, "SLOGAN_LANDSCAPE_WHERE"

    const-string v2, "width > height and startTime <= ? and endTime >= ?"

    const/16 v3, 0x13

    invoke-direct {v0, v1, v3, v2}, Lcom/huawei/openalliance/ad/e/g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->t:Lcom/huawei/openalliance/ad/e/g;

    const/16 v0, 0x14

    new-array v0, v0, [Lcom/huawei/openalliance/ad/e/g;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->b:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->c:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->d:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->e:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->f:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->g:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->h:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->i:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->j:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->k:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->l:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->m:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->n:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->o:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->p:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->q:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->r:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->s:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->t:Lcom/huawei/openalliance/ad/e/g;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/e/g;->v:[Lcom/huawei/openalliance/ad/e/g;

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

    iput-object p3, p0, Lcom/huawei/openalliance/ad/e/g;->u:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/openalliance/ad/e/g;
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/e/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/e/g;

    return-object v0
.end method

.method public static values()[Lcom/huawei/openalliance/ad/e/g;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/e/g;->v:[Lcom/huawei/openalliance/ad/e/g;

    invoke-virtual {v0}, [Lcom/huawei/openalliance/ad/e/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/openalliance/ad/e/g;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/g;->u:Ljava/lang/String;

    return-object v0
.end method

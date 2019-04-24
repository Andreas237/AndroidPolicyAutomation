.class public final enum Lo/edx$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/edx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/edx$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/edx$b;

.field public static final enum b:Lo/edx$b;

.field public static final enum c:Lo/edx$b;

.field public static final enum d:Lo/edx$b;

.field public static final enum e:Lo/edx$b;

.field public static final enum f:Lo/edx$b;

.field public static final enum g:Lo/edx$b;

.field public static final enum h:Lo/edx$b;

.field public static final enum i:Lo/edx$b;

.field public static final enum k:Lo/edx$b;

.field public static final enum l:Lo/edx$b;

.field public static final enum m:Lo/edx$b;

.field public static final enum n:Lo/edx$b;

.field public static final enum o:Lo/edx$b;

.field public static final enum p:Lo/edx$b;

.field public static final enum r:Lo/edx$b;

.field private static s:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lo/edx$b;>;"
        }
    .end annotation
.end field

.field private static final synthetic t:[Lo/edx$b;


# instance fields
.field private final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 29
    new-instance v0, Lo/edx$b;

    const-string v1, "SHOW_FRIEND_SELECTOR"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->d:Lo/edx$b;

    .line 31
    new-instance v0, Lo/edx$b;

    const-string v1, "SHOW_CONTACT_SELECTOR"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->a:Lo/edx$b;

    .line 33
    new-instance v0, Lo/edx$b;

    const-string v1, "CREATE_GROUP"

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->c:Lo/edx$b;

    .line 35
    new-instance v0, Lo/edx$b;

    const-string v1, "SEND_MSG"

    const/4 v2, 0x3

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->e:Lo/edx$b;

    .line 37
    new-instance v0, Lo/edx$b;

    const-string v1, "SHOW_UI"

    const/4 v2, 0x4

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->b:Lo/edx$b;

    .line 39
    new-instance v0, Lo/edx$b;

    const-string v1, "QUERY_USER_DATA"

    const/4 v2, 0x5

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->f:Lo/edx$b;

    .line 41
    new-instance v0, Lo/edx$b;

    const-string v1, "QUERY_UNREAD_MSG_COUNT"

    const/4 v2, 0x6

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->i:Lo/edx$b;

    .line 43
    new-instance v0, Lo/edx$b;

    const-string v1, "QUERY_FRIEND_LSIT"

    const/4 v2, 0x7

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->h:Lo/edx$b;

    .line 45
    new-instance v0, Lo/edx$b;

    const-string v1, "ADD_FRIEND"

    const/16 v2, 0x8

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->g:Lo/edx$b;

    .line 47
    new-instance v0, Lo/edx$b;

    const-string v1, "ACCEPT_INVITATION"

    const/16 v2, 0x9

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->k:Lo/edx$b;

    .line 49
    new-instance v0, Lo/edx$b;

    const-string v1, "DELETE_FRIEND"

    const/16 v2, 0xa

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->m:Lo/edx$b;

    .line 51
    new-instance v0, Lo/edx$b;

    const-string v1, "SHOW_GROUP_SELECTOR"

    const/16 v2, 0xb

    const/16 v3, 0xc

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->o:Lo/edx$b;

    .line 53
    new-instance v0, Lo/edx$b;

    const-string v1, "QUERY_GROUP_LIST"

    const/16 v2, 0xc

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->l:Lo/edx$b;

    .line 55
    new-instance v0, Lo/edx$b;

    const-string v1, "QUERY_GROUP_MEM_LIST"

    const/16 v2, 0xd

    const/16 v3, 0xe

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->p:Lo/edx$b;

    .line 57
    new-instance v0, Lo/edx$b;

    const-string v1, "DOWNLOAD_IMAGE"

    const/16 v2, 0xe

    const/16 v3, 0xf

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->n:Lo/edx$b;

    .line 59
    new-instance v0, Lo/edx$b;

    const-string v1, "GET_MSG_COUNT"

    const/16 v2, 0xf

    const/16 v3, 0x10

    invoke-direct {v0, v1, v2, v3}, Lo/edx$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/edx$b;->r:Lo/edx$b;

    .line 26
    const/16 v0, 0x10

    new-array v0, v0, [Lo/edx$b;

    sget-object v1, Lo/edx$b;->d:Lo/edx$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->a:Lo/edx$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->c:Lo/edx$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->e:Lo/edx$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->b:Lo/edx$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->f:Lo/edx$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->i:Lo/edx$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->h:Lo/edx$b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->g:Lo/edx$b;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->k:Lo/edx$b;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->m:Lo/edx$b;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->o:Lo/edx$b;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->l:Lo/edx$b;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->p:Lo/edx$b;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->n:Lo/edx$b;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lo/edx$b;->r:Lo/edx$b;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lo/edx$b;->t:[Lo/edx$b;

    .line 63
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lo/edx$b;->s:Landroid/util/SparseArray;

    .line 67
    invoke-static {}, Lo/edx$b;->values()[Lo/edx$b;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 69
    sget-object v0, Lo/edx$b;->s:Landroid/util/SparseArray;

    invoke-virtual {v7}, Lo/edx$b;->b()I

    move-result v1

    invoke-virtual {v0, v1, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 71
    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 79
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 80
    iput p3, p0, Lo/edx$b;->q:I

    .line 81
    return-void
.end method

.method public static final d(I)Lo/edx$b;
    .locals 1

    .line 85
    sget-object v0, Lo/edx$b;->s:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/edx$b;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/edx$b;
    .locals 1

    .line 26
    const-class v0, Lo/edx$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/edx$b;

    return-object v0
.end method

.method public static values()[Lo/edx$b;
    .locals 1

    .line 26
    sget-object v0, Lo/edx$b;->t:[Lo/edx$b;

    invoke-virtual {v0}, [Lo/edx$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/edx$b;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 75
    iget v0, p0, Lo/edx$b;->q:I

    return v0
.end method

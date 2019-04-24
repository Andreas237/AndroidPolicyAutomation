.class public final enum Lcom/huawei/health/sns/model/user/UserNotify$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/user/UserNotify;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/model/user/UserNotify$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field public static final enum b:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field public static final enum c:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field public static final enum d:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field public static final enum e:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field private static final synthetic f:[Lcom/huawei/health/sns/model/user/UserNotify$b;

.field public static final enum g:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field public static final enum i:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field private static k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lcom/huawei/health/sns/model/user/UserNotify$b;>;"
        }
    .end annotation
.end field


# instance fields
.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 53
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    const-string v1, "NEED_VERIFY"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/model/user/UserNotify$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->c:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 54
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    const-string v1, "NOT_NEED_VERIFY"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/model/user/UserNotify$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 55
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    const-string v1, "NEED_REVERIFY"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/model/user/UserNotify$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 56
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    const-string v1, "AGREE"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/model/user/UserNotify$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 57
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    const-string v1, "SYSTEM_RECOMMEND"

    const/4 v2, 0x4

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/model/user/UserNotify$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->e:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 58
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    const-string v1, "APP_KEEP_WAIT_VERIFY"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/model/user/UserNotify$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 59
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    const-string v1, "APP_RECOMMEND"

    const/4 v2, 0x6

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/sns/model/user/UserNotify$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 51
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/huawei/health/sns/model/user/UserNotify$b;

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->c:Lcom/huawei/health/sns/model/user/UserNotify$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->e:Lcom/huawei/health/sns/model/user/UserNotify$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->f:[Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 63
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->k:Landroid/util/SparseArray;

    .line 67
    invoke-static {}, Lcom/huawei/health/sns/model/user/UserNotify$b;->values()[Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 69
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->k:Landroid/util/SparseArray;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

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

    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 75
    iput p3, p0, Lcom/huawei/health/sns/model/user/UserNotify$b;->h:I

    .line 76
    return-void
.end method

.method public static final e(I)Lcom/huawei/health/sns/model/user/UserNotify$b;
    .locals 1

    .line 91
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/model/user/UserNotify$b;
    .locals 1

    .line 51
    const-class v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/UserNotify$b;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/model/user/UserNotify$b;
    .locals 1

    .line 51
    sget-object v0, Lcom/huawei/health/sns/model/user/UserNotify$b;->f:[Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/model/user/UserNotify$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/model/user/UserNotify$b;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify$b;->h:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify$b;->h:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

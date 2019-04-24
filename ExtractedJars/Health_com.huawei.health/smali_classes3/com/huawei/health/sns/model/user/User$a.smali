.class public final enum Lcom/huawei/health/sns/model/user/User$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/user/User;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/model/user/User$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/health/sns/model/user/User$a;

.field public static final enum b:Lcom/huawei/health/sns/model/user/User$a;

.field public static final enum c:Lcom/huawei/health/sns/model/user/User$a;

.field public static final enum d:Lcom/huawei/health/sns/model/user/User$a;

.field public static final enum e:Lcom/huawei/health/sns/model/user/User$a;

.field public static final enum f:Lcom/huawei/health/sns/model/user/User$a;

.field private static final synthetic k:[Lcom/huawei/health/sns/model/user/User$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 158
    new-instance v0, Lcom/huawei/health/sns/model/user/User$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/user/User$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    .line 162
    new-instance v0, Lcom/huawei/health/sns/model/user/User$a;

    const-string v1, "PHONE_BOOK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/user/User$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/user/User$a;->e:Lcom/huawei/health/sns/model/user/User$a;

    .line 166
    new-instance v0, Lcom/huawei/health/sns/model/user/User$a;

    const-string v1, "ACCOUNT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/user/User$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/user/User$a;->b:Lcom/huawei/health/sns/model/user/User$a;

    .line 170
    new-instance v0, Lcom/huawei/health/sns/model/user/User$a;

    const-string v1, "NICK_NAME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/user/User$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/user/User$a;->c:Lcom/huawei/health/sns/model/user/User$a;

    .line 174
    new-instance v0, Lcom/huawei/health/sns/model/user/User$a;

    const-string v1, "TWO_DIM_CODE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/user/User$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/user/User$a;->a:Lcom/huawei/health/sns/model/user/User$a;

    .line 178
    new-instance v0, Lcom/huawei/health/sns/model/user/User$a;

    const-string v1, "SUGGEST"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/user/User$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    .line 153
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/huawei/health/sns/model/user/User$a;

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->e:Lcom/huawei/health/sns/model/user/User$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->b:Lcom/huawei/health/sns/model/user/User$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->c:Lcom/huawei/health/sns/model/user/User$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->a:Lcom/huawei/health/sns/model/user/User$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/model/user/User$a;->k:[Lcom/huawei/health/sns/model/user/User$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 153
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/model/user/User$a;
    .locals 1

    .line 153
    const-class v0, Lcom/huawei/health/sns/model/user/User$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/User$a;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/model/user/User$a;
    .locals 1

    .line 153
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->k:[Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/model/user/User$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/model/user/User$a;

    return-object v0
.end method

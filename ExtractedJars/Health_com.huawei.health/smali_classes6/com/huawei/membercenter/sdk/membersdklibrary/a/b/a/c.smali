.class public final enum Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

.field public static final enum b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

.field private static final synthetic c:[Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    const-string v1, "MutiCardHw"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    const-string v1, "MutiCardMTK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    .line 3
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    sget-object v1, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->b:Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->c:[Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;
    .locals 1

    .line 3
    const-class v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    return-object v0
.end method

.method public static values()[Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;
    .locals 1

    .line 3
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->c:[Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    invoke-virtual {v0}, [Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    return-object v0
.end method

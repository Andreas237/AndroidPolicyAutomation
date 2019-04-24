.class public final enum Lcom/huawei/phoneserviceuni/common/a/a/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/phoneserviceuni/common/a/a/c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/phoneserviceuni/common/a/a/c;

.field public static final enum b:Lcom/huawei/phoneserviceuni/common/a/a/c;

.field private static final synthetic c:[Lcom/huawei/phoneserviceuni/common/a/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/huawei/phoneserviceuni/common/a/a/c;

    const-string v1, "MutiCardHw"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/phoneserviceuni/common/a/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a/c;->a:Lcom/huawei/phoneserviceuni/common/a/a/c;

    new-instance v0, Lcom/huawei/phoneserviceuni/common/a/a/c;

    const-string v1, "MutiCardMTK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/phoneserviceuni/common/a/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a/c;->b:Lcom/huawei/phoneserviceuni/common/a/a/c;

    .line 3
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/phoneserviceuni/common/a/a/c;

    sget-object v1, Lcom/huawei/phoneserviceuni/common/a/a/c;->a:Lcom/huawei/phoneserviceuni/common/a/a/c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/phoneserviceuni/common/a/a/c;->b:Lcom/huawei/phoneserviceuni/common/a/a/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a/c;->c:[Lcom/huawei/phoneserviceuni/common/a/a/c;

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

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/phoneserviceuni/common/a/a/c;
    .locals 1

    .line 3
    const-class v0, Lcom/huawei/phoneserviceuni/common/a/a/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/phoneserviceuni/common/a/a/c;

    return-object v0
.end method

.method public static values()[Lcom/huawei/phoneserviceuni/common/a/a/c;
    .locals 1

    .line 3
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a/c;->c:[Lcom/huawei/phoneserviceuni/common/a/a/c;

    invoke-virtual {v0}, [Lcom/huawei/phoneserviceuni/common/a/a/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/phoneserviceuni/common/a/a/c;

    return-object v0
.end method

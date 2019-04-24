.class public final enum Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/model/chat/ShareMessageParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;>;"
    }
.end annotation


# static fields
.field private static final synthetic b:[Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

.field public static final enum c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

.field public static final enum e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 40
    new-instance v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    const-string v1, "SystemShareText"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    new-instance v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    const-string v1, "SystemShareImage"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    .line 38
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    sget-object v1, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->b:[Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;
    .locals 1

    .line 38
    const-class v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;
    .locals 1

    .line 38
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->b:[Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    return-object v0
.end method

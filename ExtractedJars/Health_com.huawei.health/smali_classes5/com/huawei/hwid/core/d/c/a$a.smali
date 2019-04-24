.class public final enum Lcom/huawei/hwid/core/d/c/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/d/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hwid/core/d/c/a$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/hwid/core/d/c/a$a;

.field public static final enum b:Lcom/huawei/hwid/core/d/c/a$a;

.field public static final enum c:Lcom/huawei/hwid/core/d/c/a$a;

.field public static final enum d:Lcom/huawei/hwid/core/d/c/a$a;

.field private static final synthetic e:[Lcom/huawei/hwid/core/d/c/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 15
    new-instance v0, Lcom/huawei/hwid/core/d/c/a$a;

    const-string v1, "MODE_SUPPORT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/d/c/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/core/d/c/a$a;->a:Lcom/huawei/hwid/core/d/c/a$a;

    .line 20
    new-instance v0, Lcom/huawei/hwid/core/d/c/a$a;

    const-string v1, "MODE_NOT_SUPPORT_GEMINI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/d/c/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/core/d/c/a$a;->b:Lcom/huawei/hwid/core/d/c/a$a;

    .line 25
    new-instance v0, Lcom/huawei/hwid/core/d/c/a$a;

    const-string v1, "MODE_SUPPORT_HW_GEMINI"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/d/c/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/core/d/c/a$a;->c:Lcom/huawei/hwid/core/d/c/a$a;

    .line 30
    new-instance v0, Lcom/huawei/hwid/core/d/c/a$a;

    const-string v1, "MODE_SUPPORT_MTK_GEMINI"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/d/c/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/core/d/c/a$a;->d:Lcom/huawei/hwid/core/d/c/a$a;

    .line 11
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/hwid/core/d/c/a$a;

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->a:Lcom/huawei/hwid/core/d/c/a$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->b:Lcom/huawei/hwid/core/d/c/a$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->c:Lcom/huawei/hwid/core/d/c/a$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->d:Lcom/huawei/hwid/core/d/c/a$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hwid/core/d/c/a$a;->e:[Lcom/huawei/hwid/core/d/c/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hwid/core/d/c/a$a;
    .locals 1

    .line 11
    const-class v0, Lcom/huawei/hwid/core/d/c/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/core/d/c/a$a;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hwid/core/d/c/a$a;
    .locals 1

    .line 11
    sget-object v0, Lcom/huawei/hwid/core/d/c/a$a;->e:[Lcom/huawei/hwid/core/d/c/a$a;

    invoke-virtual {v0}, [Lcom/huawei/hwid/core/d/c/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hwid/core/d/c/a$a;

    return-object v0
.end method

.class public final enum Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/multicard/MultiCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SupportMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

.field public static final enum b:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

.field public static final enum c:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

.field public static final enum d:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

.field public static final enum e:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const-string v1, "MODE_SUPPORT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->b:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    .line 15
    new-instance v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const-string v1, "MODE_NOT_SUPPORT_GEMINI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->d:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    .line 20
    new-instance v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const-string v1, "MODE_SUPPORT_HW_GEMINI"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->e:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    .line 25
    new-instance v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const-string v1, "MODE_SUPPORT_MTK_GEMINI"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->c:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    .line 5
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    sget-object v1, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->b:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->d:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->e:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->c:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->a:[Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;
    .locals 1

    .line 5
    const-class v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    return-object v0
.end method

.method public static values()[Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;
    .locals 1

    .line 5
    sget-object v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->a:[Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    invoke-virtual {v0}, [Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    return-object v0
.end method

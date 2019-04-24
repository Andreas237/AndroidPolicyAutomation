.class public final enum Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/carddisplay/CardLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MoveDirection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

.field public static final enum b:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

.field public static final enum c:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

.field public static final enum d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

.field private static final synthetic e:[Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 269
    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const-string v1, "RIGHT_DIRECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const-string v1, "LEFT_DIRECTION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const-string v1, "UP_DIRECTION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->a:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    new-instance v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const-string v1, "DOWM_DIRECTION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    .line 267
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->c:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->b:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->a:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->d:Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->e:[Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 267
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;
    .locals 1

    .line 267
    const-class v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    return-object v0
.end method

.method public static values()[Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;
    .locals 1

    .line 267
    sget-object v0, Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->e:[Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    invoke-virtual {v0}, [Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/wallet/ui/carddisplay/CardLayout$MoveDirection;

    return-object v0
.end method

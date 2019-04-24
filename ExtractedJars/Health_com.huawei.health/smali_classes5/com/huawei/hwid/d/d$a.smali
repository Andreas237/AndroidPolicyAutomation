.class public final enum Lcom/huawei/hwid/d/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/d/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hwid/d/d$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/hwid/d/d$a;

.field public static final enum b:Lcom/huawei/hwid/d/d$a;

.field public static final enum c:Lcom/huawei/hwid/d/d$a;

.field private static final synthetic d:[Lcom/huawei/hwid/d/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 49
    new-instance v0, Lcom/huawei/hwid/d/d$a;

    const-string v1, "ENABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/d/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/d/d$a;->a:Lcom/huawei/hwid/d/d$a;

    .line 51
    new-instance v0, Lcom/huawei/hwid/d/d$a;

    const-string v1, "DISABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/d/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/d/d$a;->b:Lcom/huawei/hwid/d/d$a;

    .line 53
    new-instance v0, Lcom/huawei/hwid/d/d$a;

    const-string v1, "NOT_INSTALLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/d/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/d/d$a;->c:Lcom/huawei/hwid/d/d$a;

    .line 47
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/hwid/d/d$a;

    sget-object v1, Lcom/huawei/hwid/d/d$a;->a:Lcom/huawei/hwid/d/d$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwid/d/d$a;->b:Lcom/huawei/hwid/d/d$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwid/d/d$a;->c:Lcom/huawei/hwid/d/d$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hwid/d/d$a;->d:[Lcom/huawei/hwid/d/d$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hwid/d/d$a;
    .locals 1

    .line 47
    const-class v0, Lcom/huawei/hwid/d/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/d/d$a;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hwid/d/d$a;
    .locals 1

    .line 47
    sget-object v0, Lcom/huawei/hwid/d/d$a;->d:[Lcom/huawei/hwid/d/d$a;

    invoke-virtual {v0}, [Lcom/huawei/hwid/d/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hwid/d/d$a;

    return-object v0
.end method

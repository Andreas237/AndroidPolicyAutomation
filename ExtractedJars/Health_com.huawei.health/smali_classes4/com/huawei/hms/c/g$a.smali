.class public final enum Lcom/huawei/hms/c/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/c/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hms/c/g$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/hms/c/g$a;

.field public static final enum b:Lcom/huawei/hms/c/g$a;

.field public static final enum c:Lcom/huawei/hms/c/g$a;

.field private static final synthetic d:[Lcom/huawei/hms/c/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 51
    new-instance v0, Lcom/huawei/hms/c/g$a;

    const-string v1, "ENABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/c/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/c/g$a;->a:Lcom/huawei/hms/c/g$a;

    .line 53
    new-instance v0, Lcom/huawei/hms/c/g$a;

    const-string v1, "DISABLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/c/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/c/g$a;->b:Lcom/huawei/hms/c/g$a;

    .line 55
    new-instance v0, Lcom/huawei/hms/c/g$a;

    const-string v1, "NOT_INSTALLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/c/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/c/g$a;->c:Lcom/huawei/hms/c/g$a;

    .line 49
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/hms/c/g$a;

    sget-object v1, Lcom/huawei/hms/c/g$a;->a:Lcom/huawei/hms/c/g$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hms/c/g$a;->b:Lcom/huawei/hms/c/g$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hms/c/g$a;->c:Lcom/huawei/hms/c/g$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hms/c/g$a;->d:[Lcom/huawei/hms/c/g$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hms/c/g$a;
    .locals 1

    .line 49
    const-class v0, Lcom/huawei/hms/c/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/c/g$a;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hms/c/g$a;
    .locals 1

    .line 49
    sget-object v0, Lcom/huawei/hms/c/g$a;->d:[Lcom/huawei/hms/c/g$a;

    invoke-virtual {v0}, [Lcom/huawei/hms/c/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hms/c/g$a;

    return-object v0
.end method

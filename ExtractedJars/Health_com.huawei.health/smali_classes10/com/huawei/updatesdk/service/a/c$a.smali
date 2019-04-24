.class public final enum Lcom/huawei/updatesdk/service/a/c$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/service/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/updatesdk/service/a/c$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/updatesdk/service/a/c$a;

.field public static final enum b:Lcom/huawei/updatesdk/service/a/c$a;

.field public static final enum c:Lcom/huawei/updatesdk/service/a/c$a;

.field public static final enum d:Lcom/huawei/updatesdk/service/a/c$a;

.field private static final synthetic e:[Lcom/huawei/updatesdk/service/a/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/updatesdk/service/a/c$a;

    const-string v1, "ONLINE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/service/a/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/service/a/c$a;->a:Lcom/huawei/updatesdk/service/a/c$a;

    new-instance v0, Lcom/huawei/updatesdk/service/a/c$a;

    const-string v1, "MIRROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/service/a/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/service/a/c$a;->b:Lcom/huawei/updatesdk/service/a/c$a;

    new-instance v0, Lcom/huawei/updatesdk/service/a/c$a;

    const-string v1, "DEVELOPER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/service/a/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/service/a/c$a;->c:Lcom/huawei/updatesdk/service/a/c$a;

    new-instance v0, Lcom/huawei/updatesdk/service/a/c$a;

    const-string v1, "TEST"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/service/a/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/service/a/c$a;->d:Lcom/huawei/updatesdk/service/a/c$a;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/huawei/updatesdk/service/a/c$a;

    sget-object v1, Lcom/huawei/updatesdk/service/a/c$a;->a:Lcom/huawei/updatesdk/service/a/c$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/service/a/c$a;->b:Lcom/huawei/updatesdk/service/a/c$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/service/a/c$a;->c:Lcom/huawei/updatesdk/service/a/c$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/service/a/c$a;->d:Lcom/huawei/updatesdk/service/a/c$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/updatesdk/service/a/c$a;->e:[Lcom/huawei/updatesdk/service/a/c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/updatesdk/service/a/c$a;
    .locals 1

    const-class v0, Lcom/huawei/updatesdk/service/a/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/updatesdk/service/a/c$a;

    return-object v0
.end method

.method public static values()[Lcom/huawei/updatesdk/service/a/c$a;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/service/a/c$a;->e:[Lcom/huawei/updatesdk/service/a/c$a;

    invoke-virtual {v0}, [Lcom/huawei/updatesdk/service/a/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/updatesdk/service/a/c$a;

    return-object v0
.end method

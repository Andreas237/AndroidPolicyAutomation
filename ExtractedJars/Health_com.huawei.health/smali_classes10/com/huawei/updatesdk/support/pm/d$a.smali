.class public final enum Lcom/huawei/updatesdk/support/pm/d$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/support/pm/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/updatesdk/support/pm/d$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/updatesdk/support/pm/d$a;

.field private static final synthetic b:[Lcom/huawei/updatesdk/support/pm/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/updatesdk/support/pm/d$a;

    const-string v1, "INSTALL_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/support/pm/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/support/pm/d$a;->a:Lcom/huawei/updatesdk/support/pm/d$a;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/huawei/updatesdk/support/pm/d$a;

    sget-object v1, Lcom/huawei/updatesdk/support/pm/d$a;->a:Lcom/huawei/updatesdk/support/pm/d$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/updatesdk/support/pm/d$a;->b:[Lcom/huawei/updatesdk/support/pm/d$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/updatesdk/support/pm/d$a;
    .locals 1

    const-class v0, Lcom/huawei/updatesdk/support/pm/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/updatesdk/support/pm/d$a;

    return-object v0
.end method

.method public static values()[Lcom/huawei/updatesdk/support/pm/d$a;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/support/pm/d$a;->b:[Lcom/huawei/updatesdk/support/pm/d$a;

    invoke-virtual {v0}, [Lcom/huawei/updatesdk/support/pm/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/updatesdk/support/pm/d$a;

    return-object v0
.end method

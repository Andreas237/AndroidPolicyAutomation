.class public final enum Lcom/huawei/hwid/core/b/a/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hwid/core/b/a/a$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/hwid/core/b/a/a$c;

.field public static final enum b:Lcom/huawei/hwid/core/b/a/a$c;

.field public static final enum c:Lcom/huawei/hwid/core/b/a/a$c;

.field private static final synthetic d:[Lcom/huawei/hwid/core/b/a/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 211
    new-instance v0, Lcom/huawei/hwid/core/b/a/a$c;

    const-string v1, "XMLType"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/b/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/core/b/a/a$c;->a:Lcom/huawei/hwid/core/b/a/a$c;

    new-instance v0, Lcom/huawei/hwid/core/b/a/a$c;

    const-string v1, "URLType"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/b/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    new-instance v0, Lcom/huawei/hwid/core/b/a/a$c;

    const-string v1, "JSONType"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwid/core/b/a/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwid/core/b/a/a$c;->c:Lcom/huawei/hwid/core/b/a/a$c;

    .line 210
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/hwid/core/b/a/a$c;

    sget-object v1, Lcom/huawei/hwid/core/b/a/a$c;->a:Lcom/huawei/hwid/core/b/a/a$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwid/core/b/a/a$c;->c:Lcom/huawei/hwid/core/b/a/a$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hwid/core/b/a/a$c;->d:[Lcom/huawei/hwid/core/b/a/a$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 210
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hwid/core/b/a/a$c;
    .locals 1

    .line 210
    const-class v0, Lcom/huawei/hwid/core/b/a/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/core/b/a/a$c;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hwid/core/b/a/a$c;
    .locals 1

    .line 210
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->d:[Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {v0}, [Lcom/huawei/hwid/core/b/a/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hwid/core/b/a/a$c;

    return-object v0
.end method

.class public final enum Lcom/yandex/metrica/impl/ob/jk$a$b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jk$a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/jk$a$b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

.field public static final enum c:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

.field public static final enum d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

.field private static final synthetic e:[Lcom/yandex/metrica/impl/ob/jk$a$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 99
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "OFFLINE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/jk$a$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->a:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    .line 100
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "INCOMPATIBLE_NETWORK_TYPE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/yandex/metrica/impl/ob/jk$a$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->b:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    .line 101
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "COMPLETE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/yandex/metrica/impl/ob/jk$a$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->c:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    .line 102
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/yandex/metrica/impl/ob/jk$a$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const/4 v0, 0x4

    .line 98
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    sget-object v1, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->a:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->b:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->c:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    aput-object v1, v0, v5

    sput-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->e:[Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 98
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/jk$a$b$a;
    .locals 1

    .line 98
    const-class v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/jk$a$b$a;
    .locals 1

    .line 98
    sget-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->e:[Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/jk$a$b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    return-object v0
.end method

.class final enum Lcom/yandex/metrica/impl/ob/jm$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/jm$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/jm$b;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/jm$b;

.field public static final enum c:Lcom/yandex/metrica/impl/ob/jm$b;

.field public static final enum d:Lcom/yandex/metrica/impl/ob/jm$b;

.field public static final enum e:Lcom/yandex/metrica/impl/ob/jm$b;

.field private static final synthetic f:[Lcom/yandex/metrica/impl/ob/jm$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/jm$b;

    const-string v1, "EMPTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/jm$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->a:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 38
    new-instance v0, Lcom/yandex/metrica/impl/ob/jm$b;

    const-string v1, "RECEIVER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/yandex/metrica/impl/ob/jm$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->b:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 39
    new-instance v0, Lcom/yandex/metrica/impl/ob/jm$b;

    const-string v1, "WAIT_FOR_RECEIVER_ONLY"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/yandex/metrica/impl/ob/jm$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->c:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/jm$b;

    const-string v1, "HAS_FROM_PLAY_SERVICES"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/yandex/metrica/impl/ob/jm$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->d:Lcom/yandex/metrica/impl/ob/jm$b;

    .line 41
    new-instance v0, Lcom/yandex/metrica/impl/ob/jm$b;

    const-string v1, "HAS_FROM_RECEIVER_ONLY"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/yandex/metrica/impl/ob/jm$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->e:Lcom/yandex/metrica/impl/ob/jm$b;

    const/4 v0, 0x5

    .line 35
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jm$b;

    sget-object v1, Lcom/yandex/metrica/impl/ob/jm$b;->a:Lcom/yandex/metrica/impl/ob/jm$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/jm$b;->b:Lcom/yandex/metrica/impl/ob/jm$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/jm$b;->c:Lcom/yandex/metrica/impl/ob/jm$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/yandex/metrica/impl/ob/jm$b;->d:Lcom/yandex/metrica/impl/ob/jm$b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/yandex/metrica/impl/ob/jm$b;->e:Lcom/yandex/metrica/impl/ob/jm$b;

    aput-object v1, v0, v6

    sput-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->f:[Lcom/yandex/metrica/impl/ob/jm$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/jm$b;
    .locals 1

    .line 35
    const-class v0, Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/jm$b;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/jm$b;
    .locals 1

    .line 35
    sget-object v0, Lcom/yandex/metrica/impl/ob/jm$b;->f:[Lcom/yandex/metrica/impl/ob/jm$b;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/jm$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/jm$b;

    return-object v0
.end method

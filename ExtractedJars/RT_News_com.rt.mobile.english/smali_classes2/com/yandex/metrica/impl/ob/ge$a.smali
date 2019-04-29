.class final enum Lcom/yandex/metrica/impl/ob/ge$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/ge$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/ge$a;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/ge$a;

.field public static final enum c:Lcom/yandex/metrica/impl/ob/ge$a;

.field private static final synthetic d:[Lcom/yandex/metrica/impl/ob/ge$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 16
    new-instance v0, Lcom/yandex/metrica/impl/ob/ge$a;

    const-string v1, "THIS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ge$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ge$a;->a:Lcom/yandex/metrica/impl/ob/ge$a;

    new-instance v0, Lcom/yandex/metrica/impl/ob/ge$a;

    const-string v1, "OTHER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/yandex/metrica/impl/ob/ge$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ge$a;->b:Lcom/yandex/metrica/impl/ob/ge$a;

    new-instance v0, Lcom/yandex/metrica/impl/ob/ge$a;

    const-string v1, "UNKNOWN"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/yandex/metrica/impl/ob/ge$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/ge$a;->c:Lcom/yandex/metrica/impl/ob/ge$a;

    const/4 v0, 0x3

    .line 15
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/ge$a;

    sget-object v1, Lcom/yandex/metrica/impl/ob/ge$a;->a:Lcom/yandex/metrica/impl/ob/ge$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/ge$a;->b:Lcom/yandex/metrica/impl/ob/ge$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/ge$a;->c:Lcom/yandex/metrica/impl/ob/ge$a;

    aput-object v1, v0, v4

    sput-object v0, Lcom/yandex/metrica/impl/ob/ge$a;->d:[Lcom/yandex/metrica/impl/ob/ge$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ge$a;
    .locals 1

    .line 15
    const-class v0, Lcom/yandex/metrica/impl/ob/ge$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/ge$a;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/ge$a;
    .locals 1

    .line 15
    sget-object v0, Lcom/yandex/metrica/impl/ob/ge$a;->d:[Lcom/yandex/metrica/impl/ob/ge$a;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/ge$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/ge$a;

    return-object v0
.end method

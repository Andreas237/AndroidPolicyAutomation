.class public final enum Lcom/yandex/metrica/impl/ob/mr;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/mr;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/mr;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/mr;

.field private static final synthetic c:[Lcom/yandex/metrica/impl/ob/mr;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 12
    new-instance v0, Lcom/yandex/metrica/impl/ob/mr;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/mr;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mr;->a:Lcom/yandex/metrica/impl/ob/mr;

    new-instance v0, Lcom/yandex/metrica/impl/ob/mr;

    const-string v1, "AES_RSA"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/yandex/metrica/impl/ob/mr;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mr;->b:Lcom/yandex/metrica/impl/ob/mr;

    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/mr;

    sget-object v1, Lcom/yandex/metrica/impl/ob/mr;->a:Lcom/yandex/metrica/impl/ob/mr;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/mr;->b:Lcom/yandex/metrica/impl/ob/mr;

    aput-object v1, v0, v3

    sput-object v0, Lcom/yandex/metrica/impl/ob/mr;->c:[Lcom/yandex/metrica/impl/ob/mr;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/mr;
    .locals 1

    .line 11
    const-class v0, Lcom/yandex/metrica/impl/ob/mr;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/mr;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/mr;
    .locals 1

    .line 11
    sget-object v0, Lcom/yandex/metrica/impl/ob/mr;->c:[Lcom/yandex/metrica/impl/ob/mr;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/mr;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/mr;

    return-object v0
.end method

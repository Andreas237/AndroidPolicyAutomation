.class public final enum Lcom/yandex/metrica/impl/ob/mo;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/mo;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/mo;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/mo;

.field public static final enum c:Lcom/yandex/metrica/impl/ob/mo;

.field private static final synthetic e:[Lcom/yandex/metrica/impl/ob/mo;


# instance fields
.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 12
    new-instance v0, Lcom/yandex/metrica/impl/ob/mo;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/yandex/metrica/impl/ob/mo;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mo;->a:Lcom/yandex/metrica/impl/ob/mo;

    .line 13
    new-instance v0, Lcom/yandex/metrica/impl/ob/mo;

    const-string v1, "EXTERNALLY_ENCRYPTED_EVENT_CRYPTER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/yandex/metrica/impl/ob/mo;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mo;->b:Lcom/yandex/metrica/impl/ob/mo;

    .line 14
    new-instance v0, Lcom/yandex/metrica/impl/ob/mo;

    const-string v1, "AES_VALUE_ENCRYPTION"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lcom/yandex/metrica/impl/ob/mo;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mo;->c:Lcom/yandex/metrica/impl/ob/mo;

    const/4 v0, 0x3

    .line 11
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/mo;

    sget-object v1, Lcom/yandex/metrica/impl/ob/mo;->a:Lcom/yandex/metrica/impl/ob/mo;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/mo;->b:Lcom/yandex/metrica/impl/ob/mo;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/mo;->c:Lcom/yandex/metrica/impl/ob/mo;

    aput-object v1, v0, v4

    sput-object v0, Lcom/yandex/metrica/impl/ob/mo;->e:[Lcom/yandex/metrica/impl/ob/mo;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 19
    iput p3, p0, Lcom/yandex/metrica/impl/ob/mo;->d:I

    return-void
.end method

.method public static a(I)Lcom/yandex/metrica/impl/ob/mo;
    .locals 5

    .line 27
    invoke-static {}, Lcom/yandex/metrica/impl/ob/mo;->values()[Lcom/yandex/metrica/impl/ob/mo;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 28
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/mo;->a()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/mo;
    .locals 1

    .line 11
    const-class v0, Lcom/yandex/metrica/impl/ob/mo;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/mo;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/mo;
    .locals 1

    .line 11
    sget-object v0, Lcom/yandex/metrica/impl/ob/mo;->e:[Lcom/yandex/metrica/impl/ob/mo;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/mo;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/mo;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/yandex/metrica/impl/ob/mo;->d:I

    return v0
.end method

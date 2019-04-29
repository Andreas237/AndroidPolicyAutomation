.class public final enum Lcom/yandex/metrica/impl/ob/km;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/km;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/km;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/km;

.field public static final enum c:Lcom/yandex/metrica/impl/ob/km;

.field private static final synthetic e:[Lcom/yandex/metrica/impl/ob/km;


# instance fields
.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 15
    new-instance v0, Lcom/yandex/metrica/impl/ob/km;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/yandex/metrica/impl/ob/km;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/km;->a:Lcom/yandex/metrica/impl/ob/km;

    new-instance v0, Lcom/yandex/metrica/impl/ob/km;

    const-string v1, "NETWORK"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/yandex/metrica/impl/ob/km;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/km;->b:Lcom/yandex/metrica/impl/ob/km;

    new-instance v0, Lcom/yandex/metrica/impl/ob/km;

    const-string v1, "PARSE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lcom/yandex/metrica/impl/ob/km;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/km;->c:Lcom/yandex/metrica/impl/ob/km;

    const/4 v0, 0x3

    .line 13
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/km;

    sget-object v1, Lcom/yandex/metrica/impl/ob/km;->a:Lcom/yandex/metrica/impl/ob/km;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/km;->b:Lcom/yandex/metrica/impl/ob/km;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/km;->c:Lcom/yandex/metrica/impl/ob/km;

    aput-object v1, v0, v4

    sput-object v0, Lcom/yandex/metrica/impl/ob/km;->e:[Lcom/yandex/metrica/impl/ob/km;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 22
    iput p3, p0, Lcom/yandex/metrica/impl/ob/km;->d:I

    return-void
.end method

.method public static b(Landroid/os/Bundle;)Lcom/yandex/metrica/impl/ob/km;
    .locals 1

    const-string v0, "startup_error_key_code"

    .line 35
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0

    .line 1040
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->a:Lcom/yandex/metrica/impl/ob/km;

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 1046
    :pswitch_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->c:Lcom/yandex/metrica/impl/ob/km;

    goto :goto_0

    .line 1043
    :pswitch_1
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->b:Lcom/yandex/metrica/impl/ob/km;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/km;
    .locals 1

    .line 13
    const-class v0, Lcom/yandex/metrica/impl/ob/km;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/km;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/km;
    .locals 1

    .line 13
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->e:[Lcom/yandex/metrica/impl/ob/km;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/km;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/km;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/yandex/metrica/impl/ob/km;->d:I

    return v0
.end method

.method public a(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    const-string v0, "startup_error_key_code"

    .line 30
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/km;->a()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p1
.end method

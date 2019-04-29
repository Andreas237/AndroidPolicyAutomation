.class public final enum Lcom/yandex/metrica/impl/ob/dr;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/dr;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/dr;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/dr;

.field private static final synthetic d:[Lcom/yandex/metrica/impl/ob/dr;


# instance fields
.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 13
    new-instance v0, Lcom/yandex/metrica/impl/ob/dr;

    const-string v1, "FOREGROUND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/yandex/metrica/impl/ob/dr;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/dr;->a:Lcom/yandex/metrica/impl/ob/dr;

    new-instance v0, Lcom/yandex/metrica/impl/ob/dr;

    const-string v1, "BACKGROUND"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/yandex/metrica/impl/ob/dr;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/dr;

    sget-object v1, Lcom/yandex/metrica/impl/ob/dr;->a:Lcom/yandex/metrica/impl/ob/dr;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    aput-object v1, v0, v3

    sput-object v0, Lcom/yandex/metrica/impl/ob/dr;->d:[Lcom/yandex/metrica/impl/ob/dr;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/yandex/metrica/impl/ob/dr;->c:I

    return-void
.end method

.method public static a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/ob/dr;
    .locals 1

    .line 26
    sget-object v0, Lcom/yandex/metrica/impl/ob/dr;->a:Lcom/yandex/metrica/impl/ob/dr;

    if-eqz p0, :cond_0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 33
    :pswitch_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/dr;->b:Lcom/yandex/metrica/impl/ob/dr;

    goto :goto_0

    .line 30
    :pswitch_1
    sget-object v0, Lcom/yandex/metrica/impl/ob/dr;->a:Lcom/yandex/metrica/impl/ob/dr;

    :cond_0
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/dr;
    .locals 1

    .line 11
    const-class v0, Lcom/yandex/metrica/impl/ob/dr;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/dr;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/dr;
    .locals 1

    .line 11
    sget-object v0, Lcom/yandex/metrica/impl/ob/dr;->d:[Lcom/yandex/metrica/impl/ob/dr;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/dr;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/dr;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/yandex/metrica/impl/ob/dr;->c:I

    return v0
.end method

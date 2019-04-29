.class public final enum Lcom/yandex/metrica/impl/ob/mc$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/mc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/mc$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/mc$a;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/mc$a;

.field public static final enum c:Lcom/yandex/metrica/impl/ob/mc$a;

.field public static final enum d:Lcom/yandex/metrica/impl/ob/mc$a;

.field private static final synthetic f:[Lcom/yandex/metrica/impl/ob/mc$a;


# instance fields
.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/mc$a;

    const-string v1, "LOGIN"

    const-string v2, "login"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/yandex/metrica/impl/ob/mc$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mc$a;->a:Lcom/yandex/metrica/impl/ob/mc$a;

    new-instance v0, Lcom/yandex/metrica/impl/ob/mc$a;

    const-string v1, "LOGOUT"

    const-string v2, "logout"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/yandex/metrica/impl/ob/mc$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mc$a;->b:Lcom/yandex/metrica/impl/ob/mc$a;

    new-instance v0, Lcom/yandex/metrica/impl/ob/mc$a;

    const-string v1, "SWITCH"

    const-string v2, "switch"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/yandex/metrica/impl/ob/mc$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mc$a;->c:Lcom/yandex/metrica/impl/ob/mc$a;

    new-instance v0, Lcom/yandex/metrica/impl/ob/mc$a;

    const-string v1, "UPDATE"

    const-string v2, "update"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/yandex/metrica/impl/ob/mc$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/mc$a;->d:Lcom/yandex/metrica/impl/ob/mc$a;

    const/4 v0, 0x4

    .line 23
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/mc$a;

    sget-object v1, Lcom/yandex/metrica/impl/ob/mc$a;->a:Lcom/yandex/metrica/impl/ob/mc$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/mc$a;->b:Lcom/yandex/metrica/impl/ob/mc$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/yandex/metrica/impl/ob/mc$a;->c:Lcom/yandex/metrica/impl/ob/mc$a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/yandex/metrica/impl/ob/mc$a;->d:Lcom/yandex/metrica/impl/ob/mc$a;

    aput-object v1, v0, v6

    sput-object v0, Lcom/yandex/metrica/impl/ob/mc$a;->f:[Lcom/yandex/metrica/impl/ob/mc$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 29
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/mc$a;->e:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/mc$a;
    .locals 1

    .line 23
    const-class v0, Lcom/yandex/metrica/impl/ob/mc$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/mc$a;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/mc$a;
    .locals 1

    .line 23
    sget-object v0, Lcom/yandex/metrica/impl/ob/mc$a;->f:[Lcom/yandex/metrica/impl/ob/mc$a;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/mc$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/mc$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mc$a;->e:Ljava/lang/String;

    return-object v0
.end method

.class public final enum Lcom/yandex/metrica/impl/bn$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bn$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/bn$a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/bn$a$a;

.field public static final enum b:Lcom/yandex/metrica/impl/bn$a$a;

.field private static final synthetic c:[Lcom/yandex/metrica/impl/bn$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 700
    new-instance v0, Lcom/yandex/metrica/impl/bn$a$a;

    const-string v1, "WIFI"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/bn$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/bn$a$a;->a:Lcom/yandex/metrica/impl/bn$a$a;

    .line 701
    new-instance v0, Lcom/yandex/metrica/impl/bn$a$a;

    const-string v1, "CELL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/yandex/metrica/impl/bn$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/bn$a$a;->b:Lcom/yandex/metrica/impl/bn$a$a;

    const/4 v0, 0x2

    .line 699
    new-array v0, v0, [Lcom/yandex/metrica/impl/bn$a$a;

    sget-object v1, Lcom/yandex/metrica/impl/bn$a$a;->a:Lcom/yandex/metrica/impl/bn$a$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/bn$a$a;->b:Lcom/yandex/metrica/impl/bn$a$a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/yandex/metrica/impl/bn$a$a;->c:[Lcom/yandex/metrica/impl/bn$a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 699
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/bn$a$a;
    .locals 1

    .line 699
    const-class v0, Lcom/yandex/metrica/impl/bn$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/bn$a$a;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/bn$a$a;
    .locals 1

    .line 699
    sget-object v0, Lcom/yandex/metrica/impl/bn$a$a;->c:[Lcom/yandex/metrica/impl/bn$a$a;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/bn$a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/bn$a$a;

    return-object v0
.end method

.class public final enum Lcom/yandex/metrica/impl/ob/dn$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/dn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/dn$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/dn$b;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/dn$b;

.field public static final enum c:Lcom/yandex/metrica/impl/ob/dn$b;

.field private static final synthetic d:[Lcom/yandex/metrica/impl/ob/dn$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 32
    new-instance v0, Lcom/yandex/metrica/impl/ob/dn$b;

    const-string v1, "EMPTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/dn$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/dn$b;->a:Lcom/yandex/metrica/impl/ob/dn$b;

    new-instance v0, Lcom/yandex/metrica/impl/ob/dn$b;

    const-string v1, "BACKGROUND"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/yandex/metrica/impl/ob/dn$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/dn$b;->b:Lcom/yandex/metrica/impl/ob/dn$b;

    new-instance v0, Lcom/yandex/metrica/impl/ob/dn$b;

    const-string v1, "FOREGROUND"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/yandex/metrica/impl/ob/dn$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/dn$b;->c:Lcom/yandex/metrica/impl/ob/dn$b;

    const/4 v0, 0x3

    .line 31
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/dn$b;

    sget-object v1, Lcom/yandex/metrica/impl/ob/dn$b;->a:Lcom/yandex/metrica/impl/ob/dn$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/yandex/metrica/impl/ob/dn$b;->b:Lcom/yandex/metrica/impl/ob/dn$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/dn$b;->c:Lcom/yandex/metrica/impl/ob/dn$b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/yandex/metrica/impl/ob/dn$b;->d:[Lcom/yandex/metrica/impl/ob/dn$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/dn$b;
    .locals 1

    .line 31
    const-class v0, Lcom/yandex/metrica/impl/ob/dn$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/dn$b;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/dn$b;
    .locals 1

    .line 31
    sget-object v0, Lcom/yandex/metrica/impl/ob/dn$b;->d:[Lcom/yandex/metrica/impl/ob/dn$b;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/dn$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/dn$b;

    return-object v0
.end method

.class abstract enum Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;
.super Ljava/lang/Enum;
.source "CollectionOperationTypeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/gsonfire/gson/CollectionOperationTypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "Operator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

.field public static final enum $add:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

.field public static final enum $clear:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

.field public static final enum $remove:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 54
    new-instance v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator$1;

    const-string v1, "$add"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$add:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    .line 59
    new-instance v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator$2;

    const-string v1, "$remove"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$remove:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    .line 64
    new-instance v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator$3;

    const-string v1, "$clear"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$clear:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    const/4 v0, 0x3

    .line 53
    new-array v0, v0, [Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    sget-object v1, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$add:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    aput-object v1, v0, v2

    sget-object v1, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$remove:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    aput-object v1, v0, v3

    sget-object v1, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$clear:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    aput-object v1, v0, v4

    sput-object v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$VALUES:[Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 53
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILio/gsonfire/gson/CollectionOperationTypeAdapter$1;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;
    .locals 1

    .line 53
    const-class v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    return-object p0
.end method

.method public static values()[Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;
    .locals 1

    .line 53
    sget-object v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$VALUES:[Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    invoke-virtual {v0}, [Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    return-object v0
.end method


# virtual methods
.method public abstract apply(Ljava/util/Collection;Ljava/util/Collection;)V
.end method

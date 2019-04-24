.class public final enum Lorg/c/c/f;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/c/c/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/c/c/f;

.field public static final enum DELETE:Lorg/c/c/f;

.field public static final enum GET:Lorg/c/c/f;

.field public static final enum HEAD:Lorg/c/c/f;

.field public static final enum OPTIONS:Lorg/c/c/f;

.field public static final enum POST:Lorg/c/c/f;

.field public static final enum PUT:Lorg/c/c/f;

.field public static final enum TRACE:Lorg/c/c/f;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lorg/c/c/f;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/c/c/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/c/f;->GET:Lorg/c/c/f;

    new-instance v0, Lorg/c/c/f;

    const-string v1, "POST"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/c/c/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/c/f;->POST:Lorg/c/c/f;

    new-instance v0, Lorg/c/c/f;

    const-string v1, "HEAD"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/c/c/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/c/f;->HEAD:Lorg/c/c/f;

    new-instance v0, Lorg/c/c/f;

    const-string v1, "OPTIONS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/c/c/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/c/f;->OPTIONS:Lorg/c/c/f;

    new-instance v0, Lorg/c/c/f;

    const-string v1, "PUT"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lorg/c/c/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/c/f;->PUT:Lorg/c/c/f;

    new-instance v0, Lorg/c/c/f;

    const-string v1, "DELETE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lorg/c/c/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/c/f;->DELETE:Lorg/c/c/f;

    new-instance v0, Lorg/c/c/f;

    const-string v1, "TRACE"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lorg/c/c/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/c/f;->TRACE:Lorg/c/c/f;

    const/4 v0, 0x7

    new-array v0, v0, [Lorg/c/c/f;

    sget-object v1, Lorg/c/c/f;->GET:Lorg/c/c/f;

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/f;->POST:Lorg/c/c/f;

    aput-object v1, v0, v3

    sget-object v1, Lorg/c/c/f;->HEAD:Lorg/c/c/f;

    aput-object v1, v0, v4

    sget-object v1, Lorg/c/c/f;->OPTIONS:Lorg/c/c/f;

    aput-object v1, v0, v5

    sget-object v1, Lorg/c/c/f;->PUT:Lorg/c/c/f;

    aput-object v1, v0, v6

    sget-object v1, Lorg/c/c/f;->DELETE:Lorg/c/c/f;

    aput-object v1, v0, v7

    sget-object v1, Lorg/c/c/f;->TRACE:Lorg/c/c/f;

    aput-object v1, v0, v8

    sput-object v0, Lorg/c/c/f;->$VALUES:[Lorg/c/c/f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/c/c/f;
    .locals 1

    const-class v0, Lorg/c/c/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/c/c/f;

    return-object p0
.end method

.method public static values()[Lorg/c/c/f;
    .locals 1

    sget-object v0, Lorg/c/c/f;->$VALUES:[Lorg/c/c/f;

    invoke-virtual {v0}, [Lorg/c/c/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/c/c/f;

    return-object v0
.end method

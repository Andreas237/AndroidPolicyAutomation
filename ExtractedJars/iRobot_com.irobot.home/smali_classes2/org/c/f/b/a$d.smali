.class abstract enum Lorg/c/f/b/a$d;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4408
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/c/f/b/a$d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/c/f/b/a$d;

.field public static final enum AUTHORITY:Lorg/c/f/b/a$d;

.field public static final enum FRAGMENT:Lorg/c/f/b/a$d;

.field public static final enum HOST:Lorg/c/f/b/a$d;

.field public static final enum PATH:Lorg/c/f/b/a$d;

.field public static final enum PATH_SEGMENT:Lorg/c/f/b/a$d;

.field public static final enum PORT:Lorg/c/f/b/a$d;

.field public static final enum QUERY:Lorg/c/f/b/a$d;

.field public static final enum QUERY_PARAM:Lorg/c/f/b/a$d;

.field public static final enum SCHEME:Lorg/c/f/b/a$d;

.field public static final enum USER_INFO:Lorg/c/f/b/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lorg/c/f/b/a$d$1;

    const-string v1, "SCHEME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/c/f/b/a$d$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->SCHEME:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$3;

    const-string v1, "AUTHORITY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/c/f/b/a$d$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->AUTHORITY:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$4;

    const-string v1, "USER_INFO"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/c/f/b/a$d$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->USER_INFO:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$5;

    const-string v1, "HOST"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/c/f/b/a$d$5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->HOST:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$6;

    const-string v1, "PORT"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lorg/c/f/b/a$d$6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->PORT:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$7;

    const-string v1, "PATH"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lorg/c/f/b/a$d$7;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->PATH:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$8;

    const-string v1, "PATH_SEGMENT"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lorg/c/f/b/a$d$8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->PATH_SEGMENT:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$9;

    const-string v1, "QUERY"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lorg/c/f/b/a$d$9;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->QUERY:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$10;

    const-string v1, "QUERY_PARAM"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lorg/c/f/b/a$d$10;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->QUERY_PARAM:Lorg/c/f/b/a$d;

    new-instance v0, Lorg/c/f/b/a$d$2;

    const-string v1, "FRAGMENT"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lorg/c/f/b/a$d$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/c/f/b/a$d;->FRAGMENT:Lorg/c/f/b/a$d;

    const/16 v0, 0xa

    new-array v0, v0, [Lorg/c/f/b/a$d;

    sget-object v1, Lorg/c/f/b/a$d;->SCHEME:Lorg/c/f/b/a$d;

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/f/b/a$d;->AUTHORITY:Lorg/c/f/b/a$d;

    aput-object v1, v0, v3

    sget-object v1, Lorg/c/f/b/a$d;->USER_INFO:Lorg/c/f/b/a$d;

    aput-object v1, v0, v4

    sget-object v1, Lorg/c/f/b/a$d;->HOST:Lorg/c/f/b/a$d;

    aput-object v1, v0, v5

    sget-object v1, Lorg/c/f/b/a$d;->PORT:Lorg/c/f/b/a$d;

    aput-object v1, v0, v6

    sget-object v1, Lorg/c/f/b/a$d;->PATH:Lorg/c/f/b/a$d;

    aput-object v1, v0, v7

    sget-object v1, Lorg/c/f/b/a$d;->PATH_SEGMENT:Lorg/c/f/b/a$d;

    aput-object v1, v0, v8

    sget-object v1, Lorg/c/f/b/a$d;->QUERY:Lorg/c/f/b/a$d;

    aput-object v1, v0, v9

    sget-object v1, Lorg/c/f/b/a$d;->QUERY_PARAM:Lorg/c/f/b/a$d;

    aput-object v1, v0, v10

    sget-object v1, Lorg/c/f/b/a$d;->FRAGMENT:Lorg/c/f/b/a$d;

    aput-object v1, v0, v11

    sput-object v0, Lorg/c/f/b/a$d;->$VALUES:[Lorg/c/f/b/a$d;

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

.method synthetic constructor <init>(Ljava/lang/String;ILorg/c/f/b/a$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/c/f/b/a$d;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/c/f/b/a$d;
    .locals 1

    const-class v0, Lorg/c/f/b/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/c/f/b/a$d;

    return-object p0
.end method

.method public static values()[Lorg/c/f/b/a$d;
    .locals 1

    sget-object v0, Lorg/c/f/b/a$d;->$VALUES:[Lorg/c/f/b/a$d;

    invoke-virtual {v0}, [Lorg/c/f/b/a$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/c/f/b/a$d;

    return-object v0
.end method


# virtual methods
.method public abstract isAllowed(I)Z
.end method

.method protected isAlpha(I)Z
    .locals 1

    const/16 v0, 0x61

    if-lt p1, v0, :cond_0

    const/16 v0, 0x7a

    if-le p1, v0, :cond_1

    :cond_0
    const/16 v0, 0x41

    if-lt p1, v0, :cond_2

    const/16 v0, 0x5a

    if-gt p1, v0, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method protected isDigit(I)Z
    .locals 1

    const/16 v0, 0x30

    if-lt p1, v0, :cond_0

    const/16 v0, 0x39

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected isGenericDelimiter(I)Z
    .locals 1

    const/16 v0, 0x3a

    if-eq v0, p1, :cond_1

    const/16 v0, 0x2f

    if-eq v0, p1, :cond_1

    const/16 v0, 0x3f

    if-eq v0, p1, :cond_1

    const/16 v0, 0x23

    if-eq v0, p1, :cond_1

    const/16 v0, 0x5b

    if-eq v0, p1, :cond_1

    const/16 v0, 0x5d

    if-eq v0, p1, :cond_1

    const/16 v0, 0x40

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected isPchar(I)Z
    .locals 1

    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d;->isUnreserved(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d;->isSubDelimiter(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x3a

    if-eq v0, p1, :cond_1

    const/16 v0, 0x40

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected isReserved(C)Z
    .locals 1

    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d;->isGenericDelimiter(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d;->isReserved(C)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected isSubDelimiter(I)Z
    .locals 1

    const/16 v0, 0x21

    if-eq v0, p1, :cond_1

    const/16 v0, 0x24

    if-eq v0, p1, :cond_1

    const/16 v0, 0x26

    if-eq v0, p1, :cond_1

    const/16 v0, 0x27

    if-eq v0, p1, :cond_1

    const/16 v0, 0x28

    if-eq v0, p1, :cond_1

    const/16 v0, 0x29

    if-eq v0, p1, :cond_1

    const/16 v0, 0x2a

    if-eq v0, p1, :cond_1

    const/16 v0, 0x2b

    if-eq v0, p1, :cond_1

    const/16 v0, 0x2c

    if-eq v0, p1, :cond_1

    const/16 v0, 0x3b

    if-eq v0, p1, :cond_1

    const/16 v0, 0x3d

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected isUnreserved(I)Z
    .locals 1

    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d;->isAlpha(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lorg/c/f/b/a$d;->isDigit(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x2d

    if-eq v0, p1, :cond_1

    const/16 v0, 0x2e

    if-eq v0, p1, :cond_1

    const/16 v0, 0x5f

    if-eq v0, p1, :cond_1

    const/16 v0, 0x7e

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

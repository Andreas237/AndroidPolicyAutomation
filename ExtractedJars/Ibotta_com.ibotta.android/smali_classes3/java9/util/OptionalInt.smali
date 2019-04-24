.class public final Ljava9/util/OptionalInt;
.super Ljava/lang/Object;
.source "OptionalInt.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/OptionalInt$OICache;
    }
.end annotation


# static fields
.field private static final EMPTY:Ljava9/util/OptionalInt;


# instance fields
.field private final isPresent:Z

.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    new-instance v0, Ljava9/util/OptionalInt;

    invoke-direct {v0}, Ljava9/util/OptionalInt;-><init>()V

    sput-object v0, Ljava9/util/OptionalInt;->EMPTY:Ljava9/util/OptionalInt;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 90
    iput-boolean v0, p0, Ljava9/util/OptionalInt;->isPresent:Z

    .line 91
    iput v0, p0, Ljava9/util/OptionalInt;->value:I

    return-void
.end method

.method constructor <init>(I)V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 116
    iput-boolean v0, p0, Ljava9/util/OptionalInt;->isPresent:Z

    .line 117
    iput p1, p0, Ljava9/util/OptionalInt;->value:I

    return-void
.end method

.method public static empty()Ljava9/util/OptionalInt;
    .locals 1

    .line 107
    sget-object v0, Ljava9/util/OptionalInt;->EMPTY:Ljava9/util/OptionalInt;

    return-object v0
.end method

.method public static of(I)Ljava9/util/OptionalInt;
    .locals 1

    const/16 v0, -0x80

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7f

    if-gt p0, v0, :cond_0

    .line 129
    sget-object v0, Ljava9/util/OptionalInt$OICache;->cache:[Ljava9/util/OptionalInt;

    add-int/lit16 p0, p0, 0x80

    aget-object p0, v0, p0

    return-object p0

    .line 131
    :cond_0
    new-instance v0, Ljava9/util/OptionalInt;

    invoke-direct {v0, p0}, Ljava9/util/OptionalInt;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 299
    :cond_0
    instance-of v1, p1, Ljava9/util/OptionalInt;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 303
    :cond_1
    check-cast p1, Ljava9/util/OptionalInt;

    .line 304
    iget-boolean v1, p0, Ljava9/util/OptionalInt;->isPresent:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p1, Ljava9/util/OptionalInt;->isPresent:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ljava9/util/OptionalInt;->value:I

    iget p1, p1, Ljava9/util/OptionalInt;->value:I

    if-ne v1, p1, :cond_3

    goto :goto_0

    :cond_2
    iget-boolean v1, p0, Ljava9/util/OptionalInt;->isPresent:Z

    iget-boolean p1, p1, Ljava9/util/OptionalInt;->isPresent:Z

    if-ne v1, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 318
    iget-boolean v0, p0, Ljava9/util/OptionalInt;->isPresent:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ljava9/util/OptionalInt;->value:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPresent()Z
    .locals 1

    .line 154
    iget-boolean v0, p0, Ljava9/util/OptionalInt;->isPresent:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 335
    iget-boolean v0, p0, Ljava9/util/OptionalInt;->isPresent:Z

    if-eqz v0, :cond_0

    const-string v0, "OptionalInt[%s]"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Ljava9/util/OptionalInt;->value:I

    .line 336
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "OptionalInt.empty"

    :goto_0
    return-object v0
.end method

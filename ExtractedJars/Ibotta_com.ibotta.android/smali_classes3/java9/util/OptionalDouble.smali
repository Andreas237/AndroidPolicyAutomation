.class public final Ljava9/util/OptionalDouble;
.super Ljava/lang/Object;
.source "OptionalDouble.java"


# static fields
.field private static final EMPTY:Ljava9/util/OptionalDouble;


# instance fields
.field private final isPresent:Z

.field private final value:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 64
    new-instance v0, Ljava9/util/OptionalDouble;

    invoke-direct {v0}, Ljava9/util/OptionalDouble;-><init>()V

    sput-object v0, Ljava9/util/OptionalDouble;->EMPTY:Ljava9/util/OptionalDouble;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Ljava9/util/OptionalDouble;->isPresent:Z

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 80
    iput-wide v0, p0, Ljava9/util/OptionalDouble;->value:D

    return-void
.end method

.method private constructor <init>(D)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 105
    iput-boolean v0, p0, Ljava9/util/OptionalDouble;->isPresent:Z

    .line 106
    iput-wide p1, p0, Ljava9/util/OptionalDouble;->value:D

    return-void
.end method

.method public static empty()Ljava9/util/OptionalDouble;
    .locals 1

    .line 96
    sget-object v0, Ljava9/util/OptionalDouble;->EMPTY:Ljava9/util/OptionalDouble;

    return-object v0
.end method

.method public static of(D)Ljava9/util/OptionalDouble;
    .locals 1

    .line 116
    new-instance v0, Ljava9/util/OptionalDouble;

    invoke-direct {v0, p0, p1}, Ljava9/util/OptionalDouble;-><init>(D)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 286
    :cond_0
    instance-of v1, p1, Ljava9/util/OptionalDouble;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 290
    :cond_1
    check-cast p1, Ljava9/util/OptionalDouble;

    .line 291
    iget-boolean v1, p0, Ljava9/util/OptionalDouble;->isPresent:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p1, Ljava9/util/OptionalDouble;->isPresent:Z

    if-eqz v1, :cond_2

    iget-wide v3, p0, Ljava9/util/OptionalDouble;->value:D

    iget-wide v5, p1, Ljava9/util/OptionalDouble;->value:D

    .line 292
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_2
    iget-boolean v1, p0, Ljava9/util/OptionalDouble;->isPresent:Z

    iget-boolean p1, p1, Ljava9/util/OptionalDouble;->isPresent:Z

    if-ne v1, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 305
    iget-boolean v0, p0, Ljava9/util/OptionalDouble;->isPresent:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ljava9/util/OptionalDouble;->value:D

    invoke-static {v0, v1}, Ljava9/lang/Doubles;->hashCode(D)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPresent()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Ljava9/util/OptionalDouble;->isPresent:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 322
    iget-boolean v0, p0, Ljava9/util/OptionalDouble;->isPresent:Z

    if-eqz v0, :cond_0

    const-string v0, "OptionalDouble[%s]"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-wide v3, p0, Ljava9/util/OptionalDouble;->value:D

    .line 323
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "OptionalDouble.empty"

    :goto_0
    return-object v0
.end method
